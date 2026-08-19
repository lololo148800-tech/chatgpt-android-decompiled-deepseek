package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Separators;
import android.gov.nist.core.ServerLogger;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.LogRecord;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.javax.sip.InterfaceC10811r;
import io.sentry.instrumentation.file.C15379d;
import io.sentry.instrumentation.file.C15381f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Properties;
import p713e.InterfaceC13223c0;

/* JADX INFO: loaded from: classes.dex */
public class ServerLog implements ServerLogger {
    private String auxInfo;
    private Properties configurationProperties;
    private String description;
    private boolean logContent;
    private String logFileName;
    private PrintWriter printWriter;
    private SIPTransactionStack sipStack;
    private String stackIpAddress;
    protected StackLogger stackLogger;
    protected int traceLevel = 16;

    private void logMessage(String str) {
        checkLogFile();
        PrintWriter printWriter = this.printWriter;
        if (printWriter != null) {
            printWriter.println(str);
        }
        if (this.sipStack.isLoggingEnabled()) {
            this.stackLogger.logInfo(str);
        }
    }

    private void setProperties(Properties properties) {
        int i10;
        this.configurationProperties = properties;
        this.description = properties.getProperty("android.javax.sip.STACK_NAME");
        this.stackIpAddress = properties.getProperty("android.javax.sip.IP_ADDRESS");
        this.logFileName = properties.getProperty("android.gov.nist.javax.sip.SERVER_LOG");
        String property = properties.getProperty("android.gov.nist.javax.sip.TRACE_LEVEL");
        String property2 = properties.getProperty("android.gov.nist.javax.sip.LOG_MESSAGE_CONTENT");
        this.logContent = property2 != null && property2.equals("true");
        if (property != null) {
            if (property.equals("LOG4J")) {
                CommonLogger.useLegacyLogger = false;
            } else {
                try {
                    if (property.equals("DEBUG")) {
                        i10 = 32;
                    } else if (property.equals("INFO")) {
                        i10 = 16;
                    } else if (property.equals("ERROR")) {
                        i10 = 4;
                    } else {
                        i10 = (property.equals("NONE") || property.equals("OFF")) ? 0 : Integer.parseInt(property);
                    }
                    setTraceLevel(i10);
                } catch (NumberFormatException unused) {
                    PrintStream printStream = System.out;
                    printStream.println("ServerLog: WARNING Bad integer ".concat(property));
                    printStream.println("logging dislabled ");
                    setTraceLevel(0);
                }
            }
        }
        checkLogFile();
    }

    public void checkLogFile() {
        FileOutputStream fileOutputStream;
        File file;
        if (this.logFileName == null || this.traceLevel < 16) {
            return;
        }
        try {
            File file2 = new File(this.logFileName);
            if (!file2.exists()) {
                file2.createNewFile();
                this.printWriter = null;
            }
            if (this.printWriter == null) {
                boolean zBooleanValue = Boolean.valueOf(this.configurationProperties.getProperty("android.gov.nist.javax.sip.SERVER_LOG_OVERWRITE")).booleanValue();
                String str = this.logFileName;
                boolean z6 = !zBooleanValue;
                if (str != null) {
                    file = new File(str);
                    fileOutputStream = null;
                } else {
                    fileOutputStream = null;
                    file = null;
                }
                PrintWriter printWriter = new PrintWriter((Writer) new C15381f(new C15379d(C15379d.m16632a(file, fileOutputStream, z6))), true);
                this.printWriter = printWriter;
                printWriter.println("<!-- Use the  Trace Viewer in src/tools/tracesviewer to view this  trace  \nHere are the stack configuration properties \nandroid.javax.sip.IP_ADDRESS= " + this.configurationProperties.getProperty("android.javax.sip.IP_ADDRESS") + "\nandroid.javax.sip.STACK_NAME= " + this.configurationProperties.getProperty("android.javax.sip.STACK_NAME") + "\nandroid.javax.sip.ROUTER_PATH= " + this.configurationProperties.getProperty("android.javax.sip.ROUTER_PATH") + "\nandroid.javax.sip.OUTBOUND_PROXY= " + this.configurationProperties.getProperty("android.javax.sip.OUTBOUND_PROXY") + "\n-->");
                PrintWriter printWriter2 = this.printWriter;
                StringBuilder sb2 = new StringBuilder("<description\n logDescription=\"");
                sb2.append(this.description);
                sb2.append("\"\n name=\"");
                sb2.append(this.configurationProperties.getProperty("android.javax.sip.STACK_NAME"));
                sb2.append("\"\n auxInfo=\"");
                sb2.append(this.auxInfo);
                sb2.append("\"/>\n ");
                printWriter2.println(sb2.toString());
                if (this.auxInfo == null) {
                    if (this.sipStack.isLoggingEnabled(32)) {
                        this.stackLogger.logDebug("Here are the stack configuration properties \n" + this.configurationProperties + Separators.RETURN);
                        this.stackLogger.logDebug(" ]]>");
                        this.stackLogger.logDebug("</debug>");
                        this.stackLogger.logDebug("<description\n logDescription=\"" + this.description + "\"\n name=\"" + this.stackIpAddress + "\" />\n");
                        this.stackLogger.logDebug("<debug>");
                        this.stackLogger.logDebug("<![CDATA[ ");
                        return;
                    }
                    return;
                }
                if (this.sipStack.isLoggingEnabled(32)) {
                    this.stackLogger.logDebug("Here are the stack configuration properties \nandroid.javax.sip.IP_ADDRESS= " + this.configurationProperties.getProperty("android.javax.sip.IP_ADDRESS") + "\nandroid.javax.sip.ROUTER_PATH= " + this.configurationProperties.getProperty("android.javax.sip.ROUTER_PATH") + "\nandroid.javax.sip.OUTBOUND_PROXY= " + this.configurationProperties.getProperty("android.javax.sip.OUTBOUND_PROXY") + "\nandroid.gov.nist.javax.sip.CACHE_CLIENT_CONNECTIONS= " + this.configurationProperties.getProperty("android.gov.nist.javax.sip.CACHE_CLIENT_CONNECTIONS") + "\nandroid.gov.nist.javax.sip.CACHE_SERVER_CONNECTIONS= " + this.configurationProperties.getProperty("android.gov.nist.javax.sip.CACHE_SERVER_CONNECTIONS") + "\nandroid.gov.nist.javax.sip.REENTRANT_LISTENER= " + this.configurationProperties.getProperty("android.gov.nist.javax.sip.REENTRANT_LISTENER") + "android.gov.nist.javax.sip.THREAD_POOL_SIZE= " + this.configurationProperties.getProperty("android.gov.nist.javax.sip.THREAD_POOL_SIZE") + Separators.RETURN);
                    this.stackLogger.logDebug(" ]]> ");
                    this.stackLogger.logDebug("</debug>");
                    StackLogger stackLogger = this.stackLogger;
                    StringBuilder sb3 = new StringBuilder("<description\n logDescription=\"");
                    sb3.append(this.description);
                    sb3.append("\"\n name=\"");
                    sb3.append(this.stackIpAddress);
                    sb3.append("\"\n auxInfo=\"");
                    sb3.append(this.auxInfo);
                    sb3.append("\"/>\n ");
                    stackLogger.logDebug(sb3.toString());
                    this.stackLogger.logDebug("<debug>");
                    this.stackLogger.logDebug("<![CDATA[ ");
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // android.gov.nist.core.ServerLogger
    public synchronized void closeLogFile() {
        PrintWriter printWriter = this.printWriter;
        if (printWriter != null) {
            printWriter.close();
            this.printWriter = null;
        }
    }

    public String getLogFileName() {
        return this.logFileName;
    }

    public int getTraceLevel() {
        return this.traceLevel;
    }

    @Override // android.gov.nist.core.ServerLogger
    public void logException(Exception exc) {
        if (this.traceLevel >= 4) {
            checkLogFile();
            exc.printStackTrace();
            PrintWriter printWriter = this.printWriter;
            if (printWriter != null) {
                exc.printStackTrace(printWriter);
            }
        }
    }

    public boolean needsLogging() {
        return this.logFileName != null;
    }

    public void setAuxInfo(String str) {
        this.auxInfo = str;
    }

    public void setLevel(int i10) {
    }

    public void setLogFileName(String str) {
        this.logFileName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.gov.nist.core.ServerLogger
    public void setSipStack(InterfaceC10811r interfaceC10811r) {
        if (!(interfaceC10811r instanceof SIPTransactionStack)) {
            throw new IllegalArgumentException("sipStack must be a SIPTransactionStack");
        }
        SIPTransactionStack sIPTransactionStack = (SIPTransactionStack) interfaceC10811r;
        this.sipStack = sIPTransactionStack;
        this.stackLogger = sIPTransactionStack.getStackLogger();
    }

    public void setStackIpAddress(String str) {
        this.stackIpAddress = str;
    }

    @Override // android.gov.nist.core.ServerLogger
    public void setStackProperties(Properties properties) {
        setProperties(properties);
    }

    public void setTraceLevel(int i10) {
        this.traceLevel = i10;
    }

    private void logMessage(String str, String str2, String str3, boolean z6, String str4, String str5, String str6, String str7, long j10, long j11) {
        LogRecord logRecordCreateLogRecord = this.sipStack.logRecordFactory.createLogRecord(str, str2, str3, j10, z6, str5, str7, str4, j11);
        if (logRecordCreateLogRecord != null) {
            logMessage(logRecordCreateLogRecord.toString());
        }
    }

    @Override // android.gov.nist.core.ServerLogger
    public void logMessage(SIPMessage sIPMessage, String str, String str2, boolean z6, long j10) {
        checkLogFile();
        if (sIPMessage.getFirstLine() == null) {
            return;
        }
        CallID callID = (CallID) sIPMessage.getCallId();
        String callId = callID != null ? callID.getCallId() : null;
        String strTrim = sIPMessage.getFirstLine().trim();
        String strEncode = this.logContent ? sIPMessage.encode() : sIPMessage.encodeMessage(new StringBuilder()).toString();
        String transactionId = sIPMessage.getTransactionId();
        InterfaceC13223c0 interfaceC13223c0 = (InterfaceC13223c0) sIPMessage.getHeader(SIPHeaderNames.TIMESTAMP);
        logMessage(strEncode, str, str2, z6, callId, strTrim, null, transactionId, j10, interfaceC13223c0 == null ? 0L : interfaceC13223c0.getTime());
    }

    @Override // android.gov.nist.core.ServerLogger
    public void logMessage(SIPMessage sIPMessage, String str, String str2, String str3, boolean z6, long j10) {
        checkLogFile();
        CallID callID = (CallID) sIPMessage.getCallId();
        String callId = callID != null ? callID.getCallId() : null;
        String strTrim = sIPMessage.getFirstLine().trim();
        String strEncode = this.logContent ? sIPMessage.encode() : sIPMessage.encodeMessage(new StringBuilder()).toString();
        String transactionId = sIPMessage.getTransactionId();
        InterfaceC13223c0 interfaceC13223c0 = (InterfaceC13223c0) sIPMessage.getHeader(SIPHeaderNames.TIMESTAMP);
        logMessage(strEncode, str, str2, z6, callId, strTrim, str3, transactionId, j10, interfaceC13223c0 == null ? 0L : interfaceC13223c0.getTime());
    }

    @Override // android.gov.nist.core.ServerLogger
    public void logMessage(SIPMessage sIPMessage, String str, String str2, String str3, boolean z6) {
        logMessage(sIPMessage, str, str2, str3, z6, System.currentTimeMillis());
    }
}
