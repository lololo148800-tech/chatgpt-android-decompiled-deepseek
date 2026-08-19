package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.header.ContentLength;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel;
import android.gov.nist.javax.sip.stack.QueuedMessageDispatchBase;
import android.gov.nist.javax.sip.stack.SIPEventInterceptor;
import android.gov.nist.javax.sip.stack.SIPTransactionStack;
import cn.UfGr.EhBykzn;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class PipelinedMsgParser implements Runnable {
    private static final String CRLF = "\r\n";
    private static StackLogger logger = CommonLogger.getLogger(PipelinedMsgParser.class);
    private static int uid = 0;
    boolean isRunning;
    private int maxMessageSize;
    private ConcurrentHashMap<String, CallIDOrderingStructure> messagesOrderingMap;
    private Thread mythread;
    private Pipeline rawInputStream;
    protected SIPMessageListener sipMessageListener;
    private SIPTransactionStack sipStack;
    private int sizeCounter;
    private MessageParser smp;

    public class CallIDOrderingStructure {
        private Semaphore semaphore = new Semaphore(1, true);
        private Queue<SIPMessage> messagesForCallID = new ConcurrentLinkedQueue();

        public CallIDOrderingStructure() {
        }

        public Queue<SIPMessage> getMessagesForCallID() {
            return this.messagesForCallID;
        }

        public Semaphore getSemaphore() {
            return this.semaphore;
        }
    }

    public class Dispatch implements Runnable, QueuedMessageDispatchBase {
        CallIDOrderingStructure callIDOrderingStructure;
        String callId;
        long time = System.currentTimeMillis();

        public Dispatch(CallIDOrderingStructure callIDOrderingStructure, String str) {
            this.callIDOrderingStructure = callIDOrderingStructure;
            this.callId = str;
        }

        @Override // android.gov.nist.javax.sip.stack.QueuedMessageDispatchBase
        public long getReceptionTime() {
            return this.time;
        }

        @Override // java.lang.Runnable
        public void run() {
            Semaphore semaphore = this.callIDOrderingStructure.getSemaphore();
            Queue<SIPMessage> messagesForCallID = this.callIDOrderingStructure.getMessagesForCallID();
            if (PipelinedMsgParser.this.sipStack.sipEventInterceptor != null) {
                PipelinedMsgParser.this.sipStack.sipEventInterceptor.beforeMessage(messagesForCallID.peek());
            }
            try {
                semaphore.acquire();
            } catch (InterruptedException e10) {
                PipelinedMsgParser.logger.logError("Semaphore acquisition for callId " + this.callId + " interrupted", e10);
            }
            SIPMessage sIPMessagePoll = messagesForCallID.poll();
            if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                PipelinedMsgParser.logger.logDebug("semaphore acquired for message " + sIPMessagePoll);
            }
            try {
                try {
                    PipelinedMsgParser.this.sipMessageListener.processMessage(sIPMessagePoll);
                    if (messagesForCallID.size() <= 0) {
                        PipelinedMsgParser.this.messagesOrderingMap.remove(this.callId);
                        if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                            PipelinedMsgParser.logger.logDebug("CallIDOrderingStructure removed for message " + this.callId);
                        }
                    }
                    if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                        PipelinedMsgParser.logger.logDebug("releasing semaphore for message " + sIPMessagePoll);
                    }
                    semaphore.release();
                    if (PipelinedMsgParser.this.messagesOrderingMap.isEmpty()) {
                        synchronized (PipelinedMsgParser.this.messagesOrderingMap) {
                            PipelinedMsgParser.this.messagesOrderingMap.notify();
                        }
                    }
                    if (PipelinedMsgParser.this.sipStack.sipEventInterceptor != null) {
                        PipelinedMsgParser.this.sipStack.sipEventInterceptor.afterMessage(sIPMessagePoll);
                    }
                } catch (Exception e11) {
                    PipelinedMsgParser.logger.logError("Error occured processing message", e11);
                    if (messagesForCallID.size() <= 0) {
                        PipelinedMsgParser.this.messagesOrderingMap.remove(this.callId);
                        if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                            PipelinedMsgParser.logger.logDebug("CallIDOrderingStructure removed for message " + this.callId);
                        }
                    }
                    if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                        PipelinedMsgParser.logger.logDebug("releasing semaphore for message " + sIPMessagePoll);
                    }
                    semaphore.release();
                    if (PipelinedMsgParser.this.messagesOrderingMap.isEmpty()) {
                        synchronized (PipelinedMsgParser.this.messagesOrderingMap) {
                            PipelinedMsgParser.this.messagesOrderingMap.notify();
                        }
                    }
                    if (PipelinedMsgParser.this.sipStack.sipEventInterceptor != null) {
                    }
                }
                if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                    PipelinedMsgParser.logger.logDebug("dispatch task done on " + sIPMessagePoll + " threadname " + PipelinedMsgParser.this.mythread.getName());
                }
            } catch (Throwable th2) {
                if (messagesForCallID.size() <= 0) {
                    PipelinedMsgParser.this.messagesOrderingMap.remove(this.callId);
                    if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                        PipelinedMsgParser.logger.logDebug("CallIDOrderingStructure removed for message " + this.callId);
                    }
                }
                if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                    PipelinedMsgParser.logger.logDebug("releasing semaphore for message " + sIPMessagePoll);
                }
                semaphore.release();
                if (PipelinedMsgParser.this.messagesOrderingMap.isEmpty()) {
                    synchronized (PipelinedMsgParser.this.messagesOrderingMap) {
                        PipelinedMsgParser.this.messagesOrderingMap.notify();
                    }
                }
                if (PipelinedMsgParser.this.sipStack.sipEventInterceptor != null) {
                    PipelinedMsgParser.this.sipStack.sipEventInterceptor.afterMessage(sIPMessagePoll);
                }
                throw th2;
            }
        }
    }

    public PipelinedMsgParser() {
        this.smp = null;
        this.messagesOrderingMap = new ConcurrentHashMap<>();
        this.isRunning = false;
    }

    private void cleanMessageOrderingMap() {
        this.messagesOrderingMap.clear();
        synchronized (this.messagesOrderingMap) {
            this.messagesOrderingMap.notifyAll();
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("cleaned the messagesOrderingMap " + this + " threadname " + this.mythread.getName());
        }
    }

    private static synchronized int getNewUid() {
        int i10;
        i10 = uid;
        uid = i10 + 1;
        return i10;
    }

    public Object clone() {
        PipelinedMsgParser pipelinedMsgParser = new PipelinedMsgParser();
        pipelinedMsgParser.rawInputStream = this.rawInputStream;
        pipelinedMsgParser.sipMessageListener = this.sipMessageListener;
        new Thread(pipelinedMsgParser).setName("PipelineThread");
        return pipelinedMsgParser;
    }

    public void close() {
        this.isRunning = false;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Closing pipelinedmsgparser " + this + " threadname " + this.mythread.getName());
        }
        try {
            this.rawInputStream.close();
        } catch (IOException unused) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Couldn't close the rawInputStream " + this + " threadname " + this.mythread.getName() + " already closed ? " + this.rawInputStream.isClosed());
            }
        }
        if (PostParseExecutorServices.getPostParseExecutor() != null) {
            cleanMessageOrderingMap();
            synchronized (this.mythread) {
                this.mythread.notifyAll();
                this.mythread.interrupt();
            }
        }
    }

    public void processInput() {
        this.mythread.start();
    }

    /* JADX WARN: Code duplicated, block: B:208:0x0431 A[Catch: IOException -> 0x0435, TRY_LEAVE, TryCatch #4 {IOException -> 0x0435, blocks: (B:206:0x0428, B:208:0x0431), top: B:223:0x0428 }] */
    @Override // java.lang.Runnable
    public void run() {
        String line;
        String line2;
        byte[] bytes;
        Pipeline pipeline;
        Pipeline pipeline2 = this.rawInputStream;
        StackLogger stackLogger = logger;
        try {
            this.isRunning = true;
            while (this.isRunning) {
                this.sizeCounter = this.maxMessageSize;
                StringBuilder sb2 = new StringBuilder();
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Starting to parse.");
                }
                int i10 = 0;
                while (true) {
                    boolean z6 = false;
                    while (true) {
                        try {
                            line = readLine(pipeline2);
                            if (!line.equals(Separators.RETURN)) {
                                if (!"\r\n".equals(line)) {
                                    break;
                                }
                                if (z6) {
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("KeepAlive Double CRLF received, sending single CRLF as defined per RFC 5626 Section 4.4.1");
                                        logger.logDebug("~~~ setting isPreviousLineCRLF=false");
                                    }
                                    try {
                                        this.sipMessageListener.sendSingleCLRF();
                                    } catch (Exception e10) {
                                        logger.logError("A problem occured while trying to send a single CLRF in response to a double CLRF", e10);
                                    }
                                } else {
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("Received CRLF");
                                    }
                                    SIPMessageListener sIPMessageListener = this.sipMessageListener;
                                    if (sIPMessageListener != null && (sIPMessageListener instanceof ConnectionOrientedMessageChannel)) {
                                        ((ConnectionOrientedMessageChannel) sIPMessageListener).cancelPingKeepAliveTimeoutTaskIfStarted();
                                    }
                                    z6 = true;
                                }
                            } else if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("Discarding blank line");
                            }
                        } catch (IOException unused) {
                            if (PostParseExecutorServices.getPostParseExecutor() != null && this.isRunning) {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("waiting for messagesOrderingMap " + this + " threadname " + this.mythread.getName());
                                }
                                synchronized (this.messagesOrderingMap) {
                                    try {
                                        this.messagesOrderingMap.wait(64000L);
                                    } catch (InterruptedException unused2) {
                                    }
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("got notified for messagesOrderingMap " + this + " threadname " + this.mythread.getName());
                                    }
                                }
                            }
                            this.rawInputStream.stopTimer();
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("thread ending for threadname " + this.mythread.getName());
                            }
                            if (logger.isLoggingEnabled(32)) {
                                logger.logStackTrace(32);
                            }
                            try {
                                cleanMessageOrderingMap();
                                if (pipeline2.isClosed()) {
                                    return;
                                }
                                pipeline2.close();
                                return;
                            } catch (IOException e11) {
                                InternalErrorHandler.handleException(e11);
                                return;
                            }
                        }
                    }
                }
                sb2.append(line);
                this.rawInputStream.startTimer();
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Reading Input stream.");
                }
                int length = 0;
                do {
                    try {
                        line2 = readLine(pipeline2);
                        length += line2.length();
                        int i11 = this.maxMessageSize;
                        if (i11 > 0 && length > i11 / 2) {
                            throw new IOException("Pre-content-length headers size exceeded. The size of the message of the headers prior to Content-Length is too large. This must be an invalid message. Limit is MAX_MESSAGE_SIZE/2=" + (this.maxMessageSize / 2));
                        }
                        sb2.append(line2);
                    } catch (IOException unused3) {
                        if (PostParseExecutorServices.getPostParseExecutor() != null && this.isRunning) {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("waiting for messagesOrderingMap " + this + " threadname " + this.mythread.getName());
                            }
                            synchronized (this.messagesOrderingMap) {
                                try {
                                    this.messagesOrderingMap.wait(64000L);
                                } catch (InterruptedException unused4) {
                                }
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("got notified for messagesOrderingMap " + this + " threadname " + this.mythread.getName());
                                }
                            }
                        }
                        this.rawInputStream.stopTimer();
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("thread ending for threadname " + this.mythread.getName());
                        }
                        if (logger.isLoggingEnabled(32)) {
                            logger.logStackTrace(32);
                        }
                        try {
                            cleanMessageOrderingMap();
                            if (pipeline2.isClosed()) {
                                return;
                            }
                            pipeline2.close();
                            return;
                        } catch (IOException e12) {
                            InternalErrorHandler.handleException(e12);
                            return;
                        }
                    }
                    try {
                        cleanMessageOrderingMap();
                        if (!pipeline2.isClosed()) {
                            pipeline2.close();
                        }
                    } catch (IOException e13) {
                        InternalErrorHandler.handleException(e13);
                    }
                    throw th;
                } while (!line2.trim().equals(""));
                this.rawInputStream.stopTimer();
                sb2.append(line2);
                try {
                    if (stackLogger.isLoggingEnabled(32)) {
                        stackLogger.logDebug("About to parse : " + sb2.toString());
                    }
                    try {
                        bytes = sb2.toString().getBytes("UTF-8");
                    } catch (UnsupportedEncodingException unused5) {
                        bytes = sb2.toString().getBytes();
                    }
                    SIPMessage sIPMessage = this.smp.parseSIPMessage(bytes, false, false, this.sipMessageListener);
                    if (sIPMessage == null) {
                        this.rawInputStream.stopTimer();
                    } else {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Completed parsing message");
                        }
                        String headerAsFormattedString = sIPMessage.getHeaderAsFormattedString(SIPHeaderNames.CONTENT_LENGTH);
                        if (headerAsFormattedString.length() > 30) {
                            throw new RuntimeException("Bad content lenght header " + headerAsFormattedString);
                        }
                        ContentLength contentLength = (ContentLength) sIPMessage.getContentLength();
                        int contentLength2 = contentLength != null ? contentLength.getContentLength() : 0;
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Content length = " + contentLength2);
                        }
                        int i12 = this.maxMessageSize;
                        if (i12 > 0 && contentLength2 > i12) {
                            throw new RuntimeException("Max content size Exceeded! :" + contentLength2 + " allowed max size is " + this.maxMessageSize);
                        }
                        if (contentLength2 == 0) {
                            sIPMessage.removeContent();
                        } else if (i12 == 0 || contentLength2 < this.sizeCounter) {
                            byte[] bArr = new byte[contentLength2];
                            while (i10 < contentLength2) {
                                this.rawInputStream.startTimer();
                                try {
                                    try {
                                        int i13 = pipeline2.read(bArr, i10, contentLength2 - i10);
                                        if (i13 <= 0) {
                                            pipeline = this.rawInputStream;
                                            pipeline.stopTimer();
                                            break;
                                        } else {
                                            i10 += i13;
                                            this.rawInputStream.stopTimer();
                                        }
                                    } catch (IOException e14) {
                                        stackLogger.logError("Exception Reading Content", e14);
                                        pipeline = this.rawInputStream;
                                    }
                                } catch (Throwable th2) {
                                    this.rawInputStream.stopTimer();
                                    throw th2;
                                }
                            }
                            sIPMessage.setMessageContent(bArr);
                        }
                        if (this.sipMessageListener != null) {
                            try {
                                if (PostParseExecutorServices.getPostParseExecutor() == null) {
                                    SIPEventInterceptor sIPEventInterceptor = this.sipStack.sipEventInterceptor;
                                    if (sIPEventInterceptor != null) {
                                        sIPEventInterceptor.beforeMessage(sIPMessage);
                                    }
                                    this.sipMessageListener.processMessage(sIPMessage);
                                    SIPEventInterceptor sIPEventInterceptor2 = this.sipStack.sipEventInterceptor;
                                    if (sIPEventInterceptor2 != null) {
                                        sIPEventInterceptor2.afterMessage(sIPMessage);
                                    }
                                } else {
                                    String callId = sIPMessage.getCallId().getCallId();
                                    CallIDOrderingStructure callIDOrderingStructure = this.messagesOrderingMap.get(callId);
                                    if (callIDOrderingStructure == null) {
                                        callIDOrderingStructure = new CallIDOrderingStructure();
                                        CallIDOrderingStructure callIDOrderingStructurePutIfAbsent = this.messagesOrderingMap.putIfAbsent(callId, callIDOrderingStructure);
                                        if (callIDOrderingStructurePutIfAbsent != null) {
                                            callIDOrderingStructure = callIDOrderingStructurePutIfAbsent;
                                        } else if (stackLogger.isLoggingEnabled(32)) {
                                            stackLogger.logDebug("new CallIDOrderingStructure added for message " + sIPMessage);
                                        }
                                    }
                                    callIDOrderingStructure.getMessagesForCallID().offer(sIPMessage);
                                    PostParseExecutorServices.getPostParseExecutor().execute(new Dispatch(callIDOrderingStructure, callId));
                                }
                            } catch (Exception unused6) {
                            }
                        } else {
                            continue;
                        }
                    }
                } catch (ParseException e15) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Detected a parsing issue " + sb2.toString() + Separators.f31991SP + e15.getMessage());
                    }
                }
            }
            try {
                cleanMessageOrderingMap();
                if (pipeline2.isClosed()) {
                    return;
                }
                pipeline2.close();
            } catch (IOException e16) {
                InternalErrorHandler.handleException(e16);
            }
        } catch (Throwable th3) {
            cleanMessageOrderingMap();
            if (!pipeline2.isClosed()) {
                pipeline2.close();
            }
            throw th3;
        }
    }

    public void setMessageListener(SIPMessageListener sIPMessageListener) {
        this.sipMessageListener = sIPMessageListener;
    }

    private String readLine(InputStream inputStream) throws IOException {
        int i10 = 1024;
        byte[] bArr = new byte[1024];
        byte[] bArr2 = new byte[2];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw new IOException("End of stream");
            }
            int i14 = i13 & 255;
            char c9 = (char) i14;
            if (this.maxMessageSize > 0) {
                int i15 = this.sizeCounter - 1;
                this.sizeCounter = i15;
                if (i15 <= 0) {
                    throw new IOException("Max size exceeded!");
                }
            }
            if (c9 != '\r') {
                bArr[i11] = (byte) i14;
                i11++;
            } else if (i11 == 0) {
                bArr2[i12] = 13;
                i12++;
            }
            if (c9 == '\n') {
                if (i11 == 1 && i12 > 0) {
                    bArr2[i12] = 10;
                    i12++;
                }
                String str = EhBykzn.YtrUHCLKlAaHu;
                return (i11 != 1 || i12 <= 0) ? new String(bArr, 0, i11, str) : new String(bArr2, 0, i12, str);
            }
            if (i11 == i10) {
                int i16 = i10 + 1024;
                byte[] bArr3 = new byte[i16];
                System.arraycopy(bArr, 0, bArr3, 0, i10);
                i10 = i16;
                bArr = bArr3;
            }
        }
    }

    public PipelinedMsgParser(SIPTransactionStack sIPTransactionStack, SIPMessageListener sIPMessageListener, Pipeline pipeline, boolean z6, int i10) {
        this();
        this.sipStack = sIPTransactionStack;
        this.smp = sIPTransactionStack.getMessageParserFactory().createMessageParser(sIPTransactionStack);
        this.sipMessageListener = sIPMessageListener;
        this.rawInputStream = pipeline;
        this.maxMessageSize = i10;
        Thread thread = new Thread(this);
        this.mythread = thread;
        thread.setName("PipelineThread-" + getNewUid());
    }

    public PipelinedMsgParser(SIPTransactionStack sIPTransactionStack, SIPMessageListener sIPMessageListener, Pipeline pipeline, int i10) {
        this(sIPTransactionStack, sIPMessageListener, pipeline, false, i10);
    }

    public PipelinedMsgParser(SIPTransactionStack sIPTransactionStack, Pipeline pipeline) {
        this(sIPTransactionStack, null, pipeline, false, 0);
    }
}
