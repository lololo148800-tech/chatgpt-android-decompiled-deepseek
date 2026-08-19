package android.gov.nist.javax.sip.message;

import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.address.GenericURI;
import android.gov.nist.javax.sip.address.SipUri;
import android.gov.nist.javax.sip.header.C10766To;
import android.gov.nist.javax.sip.header.CSeq;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.RecordRouteList;
import android.gov.nist.javax.sip.header.RequestLine;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.SIPHeaderList;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.header.ViaList;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.gov.nist.javax.sip.stack.SIPTransactionStack;
import android.javax.sip.C10807n;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import p1053v3.p1054lN.IGDwkYw;
import p571X9.AbstractC9306j0;
import p691d.InterfaceC12947f;
import p713e.InterfaceC13216Y;
import p713e.InterfaceC13250x;
import p735f.InterfaceC13461b;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SIPRequest extends SIPMessage implements InterfaceC13461b, RequestExt {
    private static final String DEFAULT_TRANSPORT = "udp";
    private static final String DEFAULT_USER = "ip";
    protected static final Set<String> headersToIncludeInResponse;
    private static final Map<String, String> nameTable;
    private static final long serialVersionUID = 3360720013577322927L;
    private static final Set<String> targetRefreshMethods;
    private transient Object inviteTransaction;
    private transient Object messageChannel;
    protected RequestLine requestLine;
    private transient Object transactionPointer;

    static {
        HashSet hashSet = new HashSet();
        targetRefreshMethods = hashSet;
        nameTable = new ConcurrentHashMap(15);
        HashSet hashSet2 = new HashSet(0);
        headersToIncludeInResponse = hashSet2;
        hashSet.add(TokenNames.INVITE);
        hashSet.add("UPDATE");
        hashSet.add(TokenNames.SUBSCRIBE);
        hashSet.add(TokenNames.NOTIFY);
        hashSet.add("REFER");
        putName(TokenNames.INVITE);
        putName(TokenNames.BYE);
        putName("CANCEL");
        putName(TokenNames.ACK);
        putName("PRACK");
        putName("INFO");
        putName(TokenNames.MESSAGE);
        putName(TokenNames.NOTIFY);
        putName(TokenNames.OPTIONS);
        putName("PRACK");
        putName(TokenNames.PUBLISH);
        putName("REFER");
        putName(TokenNames.REGISTER);
        putName(TokenNames.SUBSCRIBE);
        putName("UPDATE");
        hashSet2.add(SIPHeaderNames.FROM.toLowerCase());
        hashSet2.add(SIPHeaderNames.f32002TO.toLowerCase());
        hashSet2.add(SIPHeaderNames.VIA.toLowerCase());
        hashSet2.add(SIPHeaderNames.RECORD_ROUTE.toLowerCase());
        hashSet2.add(SIPHeaderNames.CALL_ID.toLowerCase());
        hashSet2.add(SIPHeaderNames.CSEQ.toLowerCase());
        hashSet2.add(SIPHeaderNames.TIMESTAMP.toLowerCase());
    }

    public static String getCannonicalName(String str) {
        Map<String, String> map = nameTable;
        return map.containsKey(str) ? map.get(str) : str;
    }

    public static boolean isDialogCreating(String str) {
        return SIPTransactionStack.isDialogCreated(str);
    }

    public static boolean isTargetRefresh(String str) {
        return targetRefreshMethods.contains(str);
    }

    private static void putName(String str) {
        nameTable.put(str, str);
    }

    public void checkHeaders() {
        if (getCSeq() == null) {
            throw new ParseException("Missing a required header : CSeq", 0);
        }
        if (getTo() == null) {
            throw new ParseException("Missing a required header : To", 0);
        }
        CallID callID = this.callIdHeader;
        if (callID == null || callID.getCallId() == null || this.callIdHeader.getCallId().equals("")) {
            throw new ParseException("Missing a required header : Call-ID", 0);
        }
        if (getFrom() == null) {
            throw new ParseException("Missing a required header : From", 0);
        }
        if (getViaHeaders() == null) {
            throw new ParseException("Missing a required header : Via", 0);
        }
        if (getMaxForwards() == null) {
            throw new ParseException("Missing a required header : Max-Forwards", 0);
        }
        if (getTopmostVia() == null) {
            throw new ParseException("No via header in request! ", 0);
        }
        if (getMethod().equals(TokenNames.NOTIFY)) {
            if (getHeader(SIPHeaderNames.SUBSCRIPTION_STATE) == null) {
                throw new ParseException("Missing a required header : Subscription-State", 0);
            }
            if (getFromHeader().getTag() != null && getToHeader().getTag() != null && getHeader(SIPHeaderNames.EVENT) == null) {
                throw new ParseException("Missing a required header : Event", 0);
            }
        } else if (getMethod().equals(TokenNames.PUBLISH) && getHeader(SIPHeaderNames.EVENT) == null) {
            throw new ParseException("Missing a required header : Event", 0);
        }
        String method = this.requestLine.getMethod();
        if (SIPTransactionStack.isDialogCreated(method) && getContactHeader() == null && getToTag() == null) {
            throw new ParseException("Missing a required header : Contact", 0);
        }
        if (this.requestLine != null && method != null && getCSeq().getMethod() != null && method.compareTo(getCSeq().getMethod()) != 0) {
            throw new ParseException("CSEQ method mismatch with  Request-Line ", 0);
        }
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage
    public void cleanUp() {
        super.cleanUp();
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.core.GenericObject
    public Object clone() {
        SIPRequest sIPRequest = (SIPRequest) super.clone();
        sIPRequest.transactionPointer = null;
        RequestLine requestLine = this.requestLine;
        if (requestLine != null) {
            sIPRequest.requestLine = (RequestLine) requestLine.clone();
        }
        return sIPRequest;
    }

    public SIPRequest createAckRequest(C10766To c10766To) {
        SIPRequest sIPRequest = (SIPRequest) clone();
        sIPRequest.setMethod(TokenNames.ACK);
        sIPRequest.removeHeader(SIPHeaderNames.ROUTE);
        sIPRequest.removeHeader(SIPHeaderNames.PROXY_AUTHORIZATION);
        sIPRequest.removeContent();
        sIPRequest.removeHeader(SIPHeaderNames.CONTENT_TYPE);
        try {
            sIPRequest.getCSeq().setMethod(TokenNames.ACK);
        } catch (ParseException unused) {
        }
        if (c10766To != null) {
            sIPRequest.setTo(c10766To);
        }
        sIPRequest.removeHeader(SIPHeaderNames.CONTACT);
        sIPRequest.removeHeader(SIPHeaderNames.EXPIRES);
        ViaList viaHeaders = sIPRequest.getViaHeaders();
        if (viaHeaders != null && viaHeaders.size() > 1) {
            for (int i10 = 2; i10 < viaHeaders.size(); i10++) {
                viaHeaders.remove(i10);
            }
        }
        if (MessageFactoryImpl.getDefaultUserAgentHeader() != null) {
            sIPRequest.setHeader(MessageFactoryImpl.getDefaultUserAgentHeader());
        }
        return sIPRequest;
    }

    public SIPRequest createCancelRequest() throws C10807n {
        if (!getMethod().equals(TokenNames.INVITE)) {
            throw new C10807n("Attempt to create CANCEL for " + getMethod());
        }
        SIPRequest sIPRequest = new SIPRequest();
        sIPRequest.setRequestLine((RequestLine) this.requestLine.clone());
        sIPRequest.setMethod("CANCEL");
        sIPRequest.setHeader((InterfaceC13250x) this.callIdHeader.clone());
        sIPRequest.setHeader((InterfaceC13250x) this.toHeader.clone());
        sIPRequest.setHeader((InterfaceC13250x) this.cSeqHeader.clone());
        try {
            sIPRequest.getCSeq().setMethod("CANCEL");
        } catch (ParseException e10) {
            e10.printStackTrace();
        }
        sIPRequest.setHeader((InterfaceC13250x) this.fromHeader.clone());
        sIPRequest.addFirst((InterfaceC13250x) getTopmostVia().clone());
        sIPRequest.setHeader((InterfaceC13250x) this.maxForwardsHeader.clone());
        if (getRouteHeaders() != null) {
            sIPRequest.setHeader((InterfaceC13250x) getRouteHeaders().clone());
        }
        if (MessageFactoryImpl.getDefaultUserAgentHeader() != null) {
            sIPRequest.setHeader(MessageFactoryImpl.getDefaultUserAgentHeader());
        }
        return sIPRequest;
    }

    public final SIPRequest createErrorAck(C10766To c10766To) throws C10807n {
        SIPRequest sIPRequest = new SIPRequest();
        sIPRequest.setRequestLine((RequestLine) this.requestLine.clone());
        sIPRequest.setMethod(TokenNames.ACK);
        sIPRequest.setHeader((InterfaceC13250x) this.callIdHeader.clone());
        sIPRequest.setHeader((InterfaceC13250x) this.maxForwardsHeader.clone());
        sIPRequest.setHeader((InterfaceC13250x) this.fromHeader.clone());
        sIPRequest.setHeader((InterfaceC13250x) c10766To.clone());
        sIPRequest.addFirst((InterfaceC13250x) getTopmostVia().clone());
        sIPRequest.setHeader((InterfaceC13250x) this.cSeqHeader.clone());
        sIPRequest.getCSeq().setMethod(TokenNames.ACK);
        if (getRouteHeaders() != null) {
            sIPRequest.setHeader((SIPHeaderList<Via>) getRouteHeaders().clone());
        }
        if (MessageFactoryImpl.getDefaultUserAgentHeader() != null) {
            sIPRequest.setHeader(MessageFactoryImpl.getDefaultUserAgentHeader());
        }
        return sIPRequest;
    }

    public SIPResponse createResponse(int i10) {
        return createResponse(i10, SIPResponse.getReasonPhrase(i10));
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.javax.sip.message.MessageObject, android.gov.nist.core.GenericObject
    public String debugDump() {
        String strDebugDump = super.debugDump();
        this.stringRepresentation = "";
        sprint(SIPRequest.class.getName());
        sprint("{");
        RequestLine requestLine = this.requestLine;
        if (requestLine != null) {
            sprint(requestLine.debugDump());
        }
        sprint(strDebugDump);
        sprint("}");
        return this.stringRepresentation;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.javax.sip.message.MessageObject, android.gov.nist.core.GenericObject
    public String encode() {
        if (this.requestLine == null) {
            return isNullRequest() ? "\r\n\r\n" : super.encode();
        }
        setRequestLineDefaults();
        return this.requestLine.encode() + super.encode();
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage
    public byte[] encodeAsBytes(String str) {
        byte[] bytes;
        if (isNullRequest()) {
            return "\r\n\r\n".getBytes();
        }
        RequestLine requestLine = this.requestLine;
        if (requestLine == null) {
            return new byte[0];
        }
        if (requestLine != null) {
            try {
                bytes = requestLine.encode().getBytes("UTF-8");
            } catch (UnsupportedEncodingException e10) {
                InternalErrorHandler.handleException(e10);
                bytes = null;
            }
        } else {
            bytes = null;
        }
        byte[] bArrEncodeAsBytes = super.encodeAsBytes(str);
        byte[] bArr = new byte[bytes.length + bArrEncodeAsBytes.length];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        System.arraycopy(bArrEncodeAsBytes, 0, bArr, bytes.length, bArrEncodeAsBytes.length);
        return bArr;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage
    public StringBuilder encodeMessage(StringBuilder sb2) {
        if (this.requestLine != null) {
            setRequestLineDefaults();
            this.requestLine.encode(sb2);
            encodeSIPHeaders(sb2);
            return sb2;
        }
        if (!isNullRequest()) {
            return encodeSIPHeaders(sb2);
        }
        sb2.append("\r\n\r\n");
        return sb2;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        return getClass().equals(obj.getClass()) && this.requestLine.equals(((SIPRequest) obj).requestLine) && super.equals(obj);
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.javax.sip.message.MessageExt
    public String getFirstLine() {
        RequestLine requestLine = this.requestLine;
        if (requestLine == null) {
            return null;
        }
        return requestLine.encode();
    }

    public Object getInviteTransaction() {
        return this.inviteTransaction;
    }

    public String getMergeId() {
        String fromTag = getFromTag();
        String string = this.cSeqHeader.toString();
        String callId = this.callIdHeader.getCallId();
        String string2 = getRequestURI().toString();
        if (fromTag == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string2);
        sb2.append(":");
        sb2.append(fromTag);
        sb2.append(":");
        sb2.append(string);
        return AbstractC9306j0.m9891j(":", callId, sb2);
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage
    public LinkedList getMessageAsEncodedStrings() {
        LinkedList<String> messageAsEncodedStrings = super.getMessageAsEncodedStrings();
        if (this.requestLine != null) {
            setRequestLineDefaults();
            messageAsEncodedStrings.addFirst(this.requestLine.encode());
        }
        return messageAsEncodedStrings;
    }

    public Object getMessageChannel() {
        return this.messageChannel;
    }

    @Override // p735f.InterfaceC13461b
    public String getMethod() {
        RequestLine requestLine = this.requestLine;
        if (requestLine == null) {
            return null;
        }
        return requestLine.getMethod();
    }

    public RequestLine getRequestLine() {
        return this.requestLine;
    }

    @Override // p735f.InterfaceC13461b
    public InterfaceC12947f getRequestURI() {
        RequestLine requestLine = this.requestLine;
        if (requestLine == null) {
            return null;
        }
        return requestLine.getUri();
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.javax.sip.message.MessageExt
    public String getSIPVersion() {
        return this.requestLine.getSipVersion();
    }

    public Object getTransaction() {
        return this.transactionPointer;
    }

    public String getViaHost() {
        return ((Via) getViaHeaders().getFirst()).getHost();
    }

    public int getViaPort() {
        Via via = (Via) getViaHeaders().getFirst();
        return via.hasPort() ? via.getPort() : SIPConstants.DEFAULT_PORT;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.core.GenericObject
    public boolean match(Object obj) {
        if (obj == null) {
            return true;
        }
        if (!obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Object obj2 = ((SIPRequest) obj).requestLine;
        RequestLine requestLine = this.requestLine;
        if (requestLine == null && obj2 != null) {
            return false;
        }
        if (requestLine == obj2) {
            return super.match(obj);
        }
        return requestLine.match(obj2) && super.match(obj);
    }

    public final boolean mustCopyRR(int i10) {
        return i10 > 100 && i10 < 300 && isDialogCreating(getMethod()) && getToTag() == null;
    }

    public void setDefaults() {
        String method;
        GenericURI uri;
        RequestLine requestLine = this.requestLine;
        if (requestLine == null || (method = requestLine.getMethod()) == null || (uri = this.requestLine.getUri()) == null) {
            return;
        }
        if ((method.compareTo(TokenNames.REGISTER) == 0 || method.compareTo(TokenNames.INVITE) == 0) && (uri instanceof SipUri)) {
            SipUri sipUri = (SipUri) uri;
            sipUri.setUserParam(DEFAULT_USER);
            try {
                sipUri.setTransportParam("udp");
            } catch (ParseException unused) {
            }
        }
    }

    public void setInviteTransaction(Object obj) {
        this.inviteTransaction = obj;
    }

    public void setMessageChannel(Object obj) {
        this.messageChannel = obj;
    }

    @Override // android.gov.nist.javax.sip.message.RequestExt
    public void setMethod(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null method");
        }
        if (this.requestLine == null) {
            this.requestLine = new RequestLine();
        }
        String cannonicalName = getCannonicalName(str);
        this.requestLine.setMethod(cannonicalName);
        CSeq cSeq = this.cSeqHeader;
        if (cSeq != null) {
            try {
                cSeq.setMethod(cannonicalName);
            } catch (ParseException unused) {
            }
        }
    }

    public void setRequestLine(RequestLine requestLine) {
        this.requestLine = requestLine;
    }

    public void setRequestLineDefaults() {
        CSeq cSeq;
        if (this.requestLine.getMethod() != null || (cSeq = (CSeq) getCSeq()) == null) {
            return;
        }
        this.requestLine.setMethod(getCannonicalName(cSeq.getMethod()));
    }

    @Override // android.gov.nist.javax.sip.message.RequestExt
    public void setRequestURI(InterfaceC12947f interfaceC12947f) {
        if (interfaceC12947f == null) {
            throw new NullPointerException("Null request URI");
        }
        if (this.requestLine == null) {
            this.requestLine = new RequestLine();
        }
        this.requestLine.setUri((GenericURI) interfaceC12947f);
        this.nullRequest = false;
    }

    public void setTransaction(Object obj) {
        this.transactionPointer = obj;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage
    public String toString() {
        return encode();
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.javax.sip.message.MessageExt
    public void setSIPVersion(String str) throws ParseException {
        if (str == null || !str.equalsIgnoreCase(IGDwkYw.PaWJwDGH)) {
            throw new ParseException("sipVersion", 0);
        }
        this.requestLine.setSipVersion(str);
    }

    public SIPResponse createResponse(int i10, String str) {
        boolean z6;
        SIPResponse sIPResponse = new SIPResponse();
        try {
            sIPResponse.setStatusCode(i10);
            if (str != null) {
                sIPResponse.setReasonPhrase(str);
            } else {
                sIPResponse.setReasonPhrase(SIPResponse.getReasonPhrase(i10));
            }
            Iterator<String> it = headersToIncludeInResponse.iterator();
            while (it.hasNext()) {
                SIPHeader sIPHeader = this.headerTable.get(it.next());
                if (sIPHeader != null && (!((z6 = sIPHeader instanceof RecordRouteList)) || (z6 && mustCopyRR(i10)))) {
                    try {
                        sIPResponse.attachHeader((SIPHeader) sIPHeader.clone(), false);
                    } catch (SIPDuplicateHeaderException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            if (MessageFactoryImpl.getDefaultServerHeader() != null) {
                sIPResponse.setHeader(MessageFactoryImpl.getDefaultServerHeader());
            }
            InterfaceC13216Y defaultServerHeader = MessageFactoryImpl.getDefaultServerHeader();
            if (defaultServerHeader != null) {
                sIPResponse.setHeader(defaultServerHeader);
            }
            return sIPResponse;
        } catch (ParseException unused) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Bad code "));
        }
    }
}
