package android.gov.nist.javax.sip.message;

import android.gov.nist.core.GenericObject;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.Utils;
import android.gov.nist.javax.sip.header.AlertInfo;
import android.gov.nist.javax.sip.header.Authorization;
import android.gov.nist.javax.sip.header.C10766To;
import android.gov.nist.javax.sip.header.CSeq;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.Contact;
import android.gov.nist.javax.sip.header.ContactList;
import android.gov.nist.javax.sip.header.ContentLength;
import android.gov.nist.javax.sip.header.ContentType;
import android.gov.nist.javax.sip.header.ErrorInfo;
import android.gov.nist.javax.sip.header.ErrorInfoList;
import android.gov.nist.javax.sip.header.From;
import android.gov.nist.javax.sip.header.InReplyTo;
import android.gov.nist.javax.sip.header.MaxForwards;
import android.gov.nist.javax.sip.header.Priority;
import android.gov.nist.javax.sip.header.ProxyAuthenticate;
import android.gov.nist.javax.sip.header.ProxyAuthorization;
import android.gov.nist.javax.sip.header.ProxyRequire;
import android.gov.nist.javax.sip.header.ProxyRequireList;
import android.gov.nist.javax.sip.header.RSeq;
import android.gov.nist.javax.sip.header.RecordRouteList;
import android.gov.nist.javax.sip.header.RetryAfter;
import android.gov.nist.javax.sip.header.Route;
import android.gov.nist.javax.sip.header.RouteList;
import android.gov.nist.javax.sip.header.SIPETag;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.SIPHeaderList;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.header.SIPHeaderNamesCache;
import android.gov.nist.javax.sip.header.SIPIfMatch;
import android.gov.nist.javax.sip.header.Server;
import android.gov.nist.javax.sip.header.Subject;
import android.gov.nist.javax.sip.header.Unsupported;
import android.gov.nist.javax.sip.header.UserAgent;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.header.ViaList;
import android.gov.nist.javax.sip.header.WWWAuthenticate;
import android.gov.nist.javax.sip.header.Warning;
import android.gov.nist.javax.sip.parser.ParserFactory;
import android.javax.sip.C10800g;
import android.javax.sip.C10807n;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.text.ParseException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import p009A7.FlM.nkFZpTrMPpn;
import p713e.InterfaceC13194B;
import p713e.InterfaceC13208P;
import p713e.InterfaceC13225d0;
import p713e.InterfaceC13231g0;
import p713e.InterfaceC13234i;
import p713e.InterfaceC13236j;
import p713e.InterfaceC13239m;
import p713e.InterfaceC13240n;
import p713e.InterfaceC13241o;
import p713e.InterfaceC13242p;
import p713e.InterfaceC13243q;
import p713e.InterfaceC13247u;
import p713e.InterfaceC13249w;
import p713e.InterfaceC13250x;
import p735f.InterfaceC13460a;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class SIPMessage extends MessageObject implements InterfaceC13460a, MessageExt {
    protected Object applicationData;
    protected CSeq cSeqHeader;
    protected CallID callIdHeader;
    protected ContentLength contentLengthHeader;
    protected String forkId;
    protected From fromHeader;
    private InetAddress localAddress;
    private int localPort;
    protected MaxForwards maxForwardsHeader;
    protected String messageContent;
    protected byte[] messageContentBytes;
    protected Object messageContentObject;
    protected boolean nullRequest;
    private InetAddress peerPacketSourceAddress;
    private int peerPacketSourcePort;
    private InetAddress remoteAddress;
    private int remotePort;
    protected int size;
    protected C10766To toHeader;
    private static final String CONTENT_TYPE_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.CONTENT_TYPE);
    private static final String ERROR_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.ERROR_INFO);
    private static final String CONTACT_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.CONTACT);
    private static final String VIA_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.VIA);
    private static final String AUTHORIZATION_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.AUTHORIZATION);
    private static final String ROUTE_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.ROUTE);
    private static final String RECORDROUTE_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.RECORD_ROUTE);
    private static final String CONTENT_DISPOSITION_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.CONTENT_DISPOSITION);
    private static final String CONTENT_ENCODING_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.CONTENT_ENCODING);
    private static final String CONTENT_LANGUAGE_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.CONTENT_LANGUAGE);
    private static final String EXPIRES_LOWERCASE = SIPHeaderNamesCache.toLowerCase(SIPHeaderNames.EXPIRES);
    private String contentEncodingCharset = MessageFactoryImpl.getDefaultContentEncodingCharset();
    protected LinkedList<String> unrecognizedHeaders = new LinkedList<>();
    protected ConcurrentLinkedQueue<SIPHeader> headers = new ConcurrentLinkedQueue<>();
    protected Map<String, SIPHeader> headerTable = new ConcurrentHashMap();

    public SIPMessage() {
        try {
            attachHeader(new ContentLength(0), false);
        } catch (Exception unused) {
        }
    }

    private void attachHeader(SIPHeader sIPHeader) {
        if (sIPHeader == null) {
            throw new IllegalArgumentException("null header!");
        }
        try {
            if ((sIPHeader instanceof SIPHeaderList) && ((SIPHeaderList) sIPHeader).isEmpty()) {
                return;
            }
            attachHeader(sIPHeader, false, false);
        } catch (SIPDuplicateHeaderException unused) {
        }
    }

    private void computeContentLength(Object obj) {
        int length;
        if (obj == null) {
            length = 0;
        } else if (obj instanceof String) {
            try {
                length = ((String) obj).getBytes(getCharset()).length;
            } catch (UnsupportedEncodingException e10) {
                InternalErrorHandler.handleException(e10);
                length = 0;
            }
        } else {
            length = obj instanceof byte[] ? ((byte[]) obj).length : obj.toString().length();
        }
        try {
            this.contentLengthHeader.setContentLength(length);
        } catch (C10800g unused) {
        }
    }

    private List<SIPHeader> getHeaderList(String str) {
        SIPHeader sIPHeader = this.headerTable.get(SIPHeaderNamesCache.toLowerCase(str));
        if (sIPHeader == null) {
            return null;
        }
        if (sIPHeader instanceof SIPHeaderList) {
            return ((SIPHeaderList) sIPHeader).getHeaderList();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(sIPHeader);
        return linkedList;
    }

    public static boolean isRequestHeader(SIPHeader sIPHeader) {
        return (sIPHeader instanceof AlertInfo) || (sIPHeader instanceof InReplyTo) || (sIPHeader instanceof Authorization) || (sIPHeader instanceof MaxForwards) || (sIPHeader instanceof UserAgent) || (sIPHeader instanceof Priority) || (sIPHeader instanceof ProxyAuthorization) || (sIPHeader instanceof ProxyRequire) || (sIPHeader instanceof ProxyRequireList) || (sIPHeader instanceof Route) || (sIPHeader instanceof RouteList) || (sIPHeader instanceof Subject) || (sIPHeader instanceof SIPIfMatch);
    }

    public static boolean isResponseHeader(SIPHeader sIPHeader) {
        return (sIPHeader instanceof ErrorInfo) || (sIPHeader instanceof ProxyAuthenticate) || (sIPHeader instanceof Server) || (sIPHeader instanceof Unsupported) || (sIPHeader instanceof RetryAfter) || (sIPHeader instanceof Warning) || (sIPHeader instanceof WWWAuthenticate) || (sIPHeader instanceof SIPETag) || (sIPHeader instanceof RSeq);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void addFirst(InterfaceC13250x interfaceC13250x) throws C10807n {
        if (interfaceC13250x == null) {
            throw new NullPointerException("null arg!");
        }
        try {
            attachHeader((SIPHeader) interfaceC13250x, false, true);
        } catch (SIPDuplicateHeaderException unused) {
            throw new C10807n("Cannot add header - header already exists");
        }
    }

    @Override // p735f.InterfaceC13460a
    public void addHeader(InterfaceC13250x interfaceC13250x) {
        SIPHeader sIPHeader = (SIPHeader) interfaceC13250x;
        try {
            try {
                if ((interfaceC13250x instanceof InterfaceC13231g0) || (interfaceC13250x instanceof InterfaceC13208P)) {
                    attachHeader(sIPHeader, false, true);
                } else {
                    attachHeader(sIPHeader, false, false);
                }
            } catch (SIPDuplicateHeaderException unused) {
                if (interfaceC13250x instanceof ContentLength) {
                    this.contentLengthHeader.setContentLength(((ContentLength) interfaceC13250x).getContentLength());
                }
            }
        } catch (C10800g unused2) {
        }
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void addLast(InterfaceC13250x interfaceC13250x) throws C10807n {
        if (interfaceC13250x == null) {
            throw new NullPointerException("null arg!");
        }
        try {
            attachHeader((SIPHeader) interfaceC13250x, false, false);
        } catch (SIPDuplicateHeaderException unused) {
            throw new C10807n("Cannot add header - header already exists");
        }
    }

    public void addUnparsed(String str) {
        getUnrecognizedHeadersList().add(str);
    }

    public void cleanUp() {
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        SIPMessage sIPMessage = (SIPMessage) super.clone();
        sIPMessage.headerTable = new ConcurrentHashMap();
        sIPMessage.fromHeader = null;
        sIPMessage.toHeader = null;
        sIPMessage.cSeqHeader = null;
        sIPMessage.callIdHeader = null;
        sIPMessage.contentLengthHeader = null;
        sIPMessage.maxForwardsHeader = null;
        sIPMessage.forkId = null;
        if (this.headers != null) {
            sIPMessage.headers = new ConcurrentLinkedQueue<>();
            Iterator<SIPHeader> it = this.headers.iterator();
            while (it.hasNext()) {
                sIPMessage.attachHeader((SIPHeader) it.next().clone());
            }
        }
        byte[] bArr = this.messageContentBytes;
        if (bArr != null) {
            sIPMessage.messageContentBytes = (byte[]) bArr.clone();
        }
        Object obj = this.messageContentObject;
        if (obj != null) {
            sIPMessage.messageContentObject = GenericObject.makeClone(obj);
        }
        sIPMessage.unrecognizedHeaders = this.unrecognizedHeaders;
        sIPMessage.remoteAddress = this.remoteAddress;
        sIPMessage.remotePort = this.remotePort;
        return sIPMessage;
    }

    @Override // android.gov.nist.javax.sip.message.MessageObject, android.gov.nist.core.GenericObject
    public String debugDump() {
        this.stringRepresentation = "";
        sprint("SIPMessage:");
        sprint("{");
        try {
            for (Field field : getClass().getDeclaredFields()) {
                Class<?> type = field.getType();
                String name = field.getName();
                if (field.get(this) != null && SIPHeader.class.isAssignableFrom(type) && name.compareTo("headers") != 0) {
                    sprint(name + Separators.EQUALS);
                    sprint(((SIPHeader) field.get(this)).debugDump());
                }
            }
        } catch (Exception e10) {
            InternalErrorHandler.handleException(e10);
        }
        sprint("List of headers : ");
        sprint(this.headers.toString());
        sprint("messageContent = ");
        sprint("{");
        sprint(this.messageContent);
        sprint("}");
        if (getContent() != null) {
            sprint(getContent().toString());
        }
        sprint("}");
        return this.stringRepresentation;
    }

    @Override // android.gov.nist.javax.sip.message.MessageObject, android.gov.nist.core.GenericObject
    public String encode() {
        StringBuilder sb2 = new StringBuilder();
        for (SIPHeader sIPHeader : this.headers) {
            if (!(sIPHeader instanceof ContentLength)) {
                sIPHeader.encode(sb2);
            }
        }
        LinkedList<String> linkedList = this.unrecognizedHeaders;
        if (linkedList != null) {
            Iterator<String> it = linkedList.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(Separators.NEWLINE);
            }
        }
        this.contentLengthHeader.encode(sb2).append(Separators.NEWLINE);
        if (this.messageContentObject != null) {
            sb2.append(getContent().toString());
        } else {
            String str = this.messageContent;
            if (str != null || this.messageContentBytes != null) {
                if (str == null) {
                    try {
                        str = new String(this.messageContentBytes, getCharset());
                    } catch (UnsupportedEncodingException e10) {
                        InternalErrorHandler.handleException(e10);
                        str = null;
                    }
                }
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public byte[] encodeAsBytes(String str) {
        if ((this instanceof SIPRequest) && ((SIPRequest) this).isNullRequest()) {
            return "\r\n\r\n".getBytes();
        }
        try {
            ((InterfaceC13231g0) getHeader(SIPHeaderNames.VIA)).setTransport(str);
        } catch (ParseException e10) {
            InternalErrorHandler.handleException(e10);
        }
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.headers) {
            try {
                for (SIPHeader sIPHeader : this.headers) {
                    if (!(sIPHeader instanceof ContentLength)) {
                        sIPHeader.encode(sb2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.contentLengthHeader.encode(sb2);
        sb2.append(Separators.NEWLINE);
        byte[] rawContent = getRawContent();
        byte[] bytes = null;
        if (rawContent == null) {
            try {
                return sb2.toString().getBytes(getCharset());
            } catch (UnsupportedEncodingException e11) {
                InternalErrorHandler.handleException(e11);
                return null;
            }
        }
        try {
            bytes = sb2.toString().getBytes(getCharset());
        } catch (UnsupportedEncodingException e12) {
            InternalErrorHandler.handleException(e12);
        }
        byte[] bArr = new byte[bytes.length + rawContent.length];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        System.arraycopy(rawContent, 0, bArr, bytes.length, rawContent.length);
        return bArr;
    }

    public abstract StringBuilder encodeMessage(StringBuilder sb2);

    public StringBuilder encodeSIPHeaders(StringBuilder sb2) {
        for (SIPHeader sIPHeader : this.headers) {
            if (!(sIPHeader instanceof ContentLength)) {
                sIPHeader.encode(sb2);
            }
        }
        StringBuilder sbEncode = this.contentLengthHeader.encode(sb2);
        sbEncode.append(Separators.NEWLINE);
        return sbEncode;
    }

    @Override // android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (!obj.getClass().equals(getClass())) {
            return false;
        }
        SIPMessage sIPMessage = (SIPMessage) obj;
        if (this.headerTable.size() != sIPMessage.headerTable.size()) {
            return false;
        }
        for (SIPHeader sIPHeader : this.headerTable.values()) {
            SIPHeader sIPHeader2 = sIPMessage.headerTable.get(SIPHeaderNamesCache.toLowerCase(sIPHeader.getName()));
            if (sIPHeader2 == null || !sIPHeader2.equals(sIPHeader)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public Object getApplicationData() {
        return this.applicationData;
    }

    public Authorization getAuthorization() {
        return (Authorization) getHeaderLowerCase(AUTHORIZATION_LOWERCASE);
    }

    public InterfaceC13234i getCSeq() {
        return this.cSeqHeader;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public InterfaceC13234i getCSeqHeader() {
        return this.cSeqHeader;
    }

    public InterfaceC13236j getCallId() {
        return this.callIdHeader;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public InterfaceC13236j getCallIdHeader() {
        return this.callIdHeader;
    }

    public final String getCharset() {
        ContentType contentTypeHeader = getContentTypeHeader();
        if (contentTypeHeader == null) {
            return this.contentEncodingCharset;
        }
        String charset = contentTypeHeader.getCharset();
        return charset != null ? charset : this.contentEncodingCharset;
    }

    public Contact getContactHeader() {
        ContactList contactHeaders = getContactHeaders();
        if (contactHeaders != null) {
            return (Contact) contactHeaders.getFirst();
        }
        return null;
    }

    public ContactList getContactHeaders() {
        return (ContactList) getSIPHeaderListLowerCase(CONTACT_LOWERCASE);
    }

    @Override // p735f.InterfaceC13460a
    public Object getContent() {
        Object obj = this.messageContentObject;
        if (obj != null) {
            return obj;
        }
        String str = this.messageContent;
        if (str != null) {
            return str;
        }
        byte[] bArr = this.messageContentBytes;
        if (bArr != null) {
            return bArr;
        }
        return null;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public InterfaceC13239m getContentDisposition() {
        return (InterfaceC13239m) getHeaderLowerCase(CONTENT_DISPOSITION_LOWERCASE);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public InterfaceC13240n getContentEncoding() {
        return (InterfaceC13240n) getHeaderLowerCase(CONTENT_ENCODING_LOWERCASE);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public InterfaceC13241o getContentLanguage() {
        return (InterfaceC13241o) getHeaderLowerCase(CONTENT_LANGUAGE_LOWERCASE);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public InterfaceC13242p getContentLength() {
        return this.contentLengthHeader;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public InterfaceC13242p getContentLengthHeader() {
        return getContentLength();
    }

    public final String getDialogId(boolean z6) {
        return getDialogId(z6, ((C10766To) getTo()).getTag());
    }

    public ErrorInfoList getErrorInfoHeaders() {
        return (ErrorInfoList) getSIPHeaderListLowerCase(ERROR_LOWERCASE);
    }

    @Override // p735f.InterfaceC13460a
    public InterfaceC13247u getExpires() {
        return (InterfaceC13247u) getHeaderLowerCase(EXPIRES_LOWERCASE);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public abstract String getFirstLine();

    public String getForkId() {
        String str = this.forkId;
        if (str != null) {
            return str;
        }
        String callId = getCallId().getCallId();
        String fromTag = getFromTag();
        if (fromTag == null) {
            throw new IllegalStateException("From tag is not yet set. Cannot compute forkId");
        }
        String lowerCase = (callId + ":" + fromTag).toLowerCase();
        this.forkId = lowerCase;
        return lowerCase;
    }

    public InterfaceC13249w getFrom() {
        return this.fromHeader;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public InterfaceC13249w getFromHeader() {
        return this.fromHeader;
    }

    public String getFromTag() {
        From from = this.fromHeader;
        if (from == null) {
            return null;
        }
        return from.getTag();
    }

    @Override // p735f.InterfaceC13460a
    public InterfaceC13250x getHeader(String str) {
        return getHeaderLowerCase(SIPHeaderNamesCache.toLowerCase(str));
    }

    public String getHeaderAsFormattedString(String str) {
        String lowerCase = SIPHeaderNamesCache.toLowerCase(str);
        return this.headerTable.containsKey(lowerCase) ? this.headerTable.get(lowerCase).toString() : getHeader(str).toString();
    }

    public InterfaceC13250x getHeaderLowerCase(String str) {
        if (str == null) {
            throw new NullPointerException("bad name");
        }
        SIPHeader sIPHeader = this.headerTable.get(str);
        return sIPHeader instanceof SIPHeaderList ? ((SIPHeaderList) sIPHeader).getFirst() : sIPHeader;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public ListIterator<String> getHeaderNames() {
        Iterator<SIPHeader> it = this.headers.iterator();
        LinkedList linkedList = new LinkedList();
        while (it.hasNext()) {
            linkedList.add(it.next().getName());
        }
        return linkedList.listIterator();
    }

    public Iterator<SIPHeader> getHeaders() {
        return this.headers.iterator();
    }

    public InetAddress getLocalAddress() {
        return this.localAddress;
    }

    public int getLocalPort() {
        return this.localPort;
    }

    public InterfaceC13194B getMaxForwards() {
        return this.maxForwardsHeader;
    }

    public LinkedList<String> getMessageAsEncodedStrings() {
        LinkedList<String> linkedList = new LinkedList<>();
        for (SIPHeader sIPHeader : this.headers) {
            if (sIPHeader instanceof SIPHeaderList) {
                linkedList.addAll(((SIPHeaderList) sIPHeader).getHeadersAsEncodedStrings());
            } else {
                linkedList.add(sIPHeader.encode());
            }
        }
        return linkedList;
    }

    public String getMessageContent() {
        String str = this.messageContent;
        if (str == null && this.messageContentBytes == null) {
            return null;
        }
        if (str == null) {
            this.messageContent = new String(this.messageContentBytes, getCharset());
        }
        return this.messageContent;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public MultipartMimeContent getMultipartMimeContent() {
        if (this.contentLengthHeader.getContentLength() == 0) {
            return null;
        }
        MultipartMimeContentImpl multipartMimeContentImpl = new MultipartMimeContentImpl(getContentTypeHeader());
        try {
            multipartMimeContentImpl.createContentList(new String(getRawContent(), getCharset()));
            return multipartMimeContentImpl;
        } catch (UnsupportedEncodingException e10) {
            InternalErrorHandler.handleException(e10);
            return null;
        }
    }

    public InetAddress getPeerPacketSourceAddress() {
        return this.peerPacketSourceAddress;
    }

    public int getPeerPacketSourcePort() {
        return this.peerPacketSourcePort;
    }

    @Override // p735f.InterfaceC13460a
    public byte[] getRawContent() {
        try {
            if (this.messageContentBytes == null) {
                Object obj = this.messageContentObject;
                if (obj != null) {
                    this.messageContentBytes = obj.toString().getBytes(getCharset());
                } else {
                    String str = this.messageContent;
                    if (str != null) {
                        this.messageContentBytes = str.getBytes(getCharset());
                    }
                }
            }
            return this.messageContentBytes;
        } catch (UnsupportedEncodingException e10) {
            InternalErrorHandler.handleException(e10);
            return null;
        }
    }

    public RecordRouteList getRecordRouteHeaders() {
        return (RecordRouteList) getSIPHeaderListLowerCase(RECORDROUTE_LOWERCASE);
    }

    public InetAddress getRemoteAddress() {
        return this.remoteAddress;
    }

    public int getRemotePort() {
        return this.remotePort;
    }

    public RouteList getRouteHeaders() {
        return (RouteList) getSIPHeaderListLowerCase(ROUTE_LOWERCASE);
    }

    public SIPHeader getSIPHeaderListLowerCase(String str) {
        return this.headerTable.get(str);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public abstract String getSIPVersion();

    public int getSize() {
        return this.size;
    }

    public InterfaceC13225d0 getTo() {
        return this.toHeader;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public InterfaceC13225d0 getToHeader() {
        return this.toHeader;
    }

    public String getToTag() {
        C10766To c10766To = this.toHeader;
        if (c10766To == null) {
            return null;
        }
        return c10766To.getTag();
    }

    public Via getTopmostVia() {
        if (getViaHeaders() == null) {
            return null;
        }
        return (Via) getViaHeaders().getFirst();
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public InterfaceC13231g0 getTopmostViaHeader() {
        return getTopmostVia();
    }

    public String getTransactionId() {
        Via topmostVia = getTopmostVia();
        if (topmostVia != null && topmostVia.getBranch() != null && topmostVia.getBranch().toUpperCase().startsWith(SIPConstants.BRANCH_MAGIC_COOKIE_UPPER_CASE)) {
            if (!getCSeq().getMethod().equals("CANCEL")) {
                return topmostVia.getBranch().toLowerCase();
            }
            return (topmostVia.getBranch() + ":" + getCSeq().getMethod()).toLowerCase();
        }
        StringBuilder sb2 = new StringBuilder();
        From from = (From) getFrom();
        if (from.hasTag()) {
            sb2.append(from.getTag());
            sb2.append("-");
        }
        sb2.append(this.callIdHeader.getCallId());
        sb2.append("-");
        sb2.append(this.cSeqHeader.getSequenceNumber());
        sb2.append("-");
        sb2.append(this.cSeqHeader.getMethod());
        if (topmostVia != null) {
            sb2.append("-");
            sb2.append(topmostVia.getSentBy().encode());
            if (!topmostVia.getSentBy().hasPort()) {
                sb2.append("-5060");
            }
        }
        if (getCSeq().getMethod().equals("CANCEL")) {
            sb2.append("CANCEL");
        }
        return sb2.toString().toLowerCase().replace(":", "-").replace(Separators.f31989AT, "-") + Utils.getSignature();
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public ListIterator<String> getUnrecognizedHeaders() {
        return getUnrecognizedHeadersList().listIterator();
    }

    public LinkedList<String> getUnrecognizedHeadersList() {
        if (this.unrecognizedHeaders == null) {
            this.unrecognizedHeaders = new LinkedList<>();
        }
        return this.unrecognizedHeaders;
    }

    public ViaList getViaHeaders() {
        return (ViaList) getSIPHeaderListLowerCase(VIA_LOWERCASE);
    }

    public boolean hasContent() {
        return (this.messageContent == null && this.messageContentBytes == null) ? false : true;
    }

    public boolean hasFromTag() {
        From from = this.fromHeader;
        return (from == null || from.getTag() == null) ? false : true;
    }

    public boolean hasHeader(String str) {
        return this.headerTable.containsKey(SIPHeaderNamesCache.toLowerCase(str));
    }

    public boolean hasToTag() {
        C10766To c10766To = this.toHeader;
        return (c10766To == null || c10766To.getTag() == null) ? false : true;
    }

    public int hashCode() {
        CallID callID = this.callIdHeader;
        if (callID != null) {
            return callID.getCallId().hashCode();
        }
        throw new RuntimeException("Invalid message! Cannot compute hashcode! call-id header is missing !");
    }

    public boolean isNullRequest() {
        return this.nullRequest;
    }

    @Override // android.gov.nist.core.GenericObject
    public boolean match(Object obj) {
        if (obj == null) {
            return true;
        }
        if (!obj.getClass().equals(getClass())) {
            return false;
        }
        Iterator<SIPHeader> headers = ((SIPMessage) obj).getHeaders();
        while (headers.hasNext()) {
            SIPHeader next = headers.next();
            List<SIPHeader> headerList = getHeaderList(next.getHeaderName());
            if (headerList != null && headerList.size() != 0) {
                if (next instanceof SIPHeaderList) {
                    ListIterator listIterator = ((SIPHeaderList) next).listIterator();
                    while (listIterator.hasNext()) {
                        SIPHeader sIPHeader = (SIPHeader) listIterator.next();
                        if (!(sIPHeader instanceof ContentLength)) {
                            ListIterator<SIPHeader> listIterator2 = headerList.listIterator();
                            while (listIterator2.hasNext()) {
                                if (listIterator2.next().match(sIPHeader)) {
                                }
                            }
                            return false;
                        }
                    }
                } else {
                    ListIterator<SIPHeader> listIterator3 = headerList.listIterator();
                    while (listIterator3.hasNext()) {
                        if (listIterator3.next().match(next)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.gov.nist.core.GenericObject
    public void merge(Object obj) {
        if (!obj.getClass().equals(getClass())) {
            throw new IllegalArgumentException("Bad class " + obj.getClass());
        }
        for (Object obj2 : ((SIPMessage) obj).headers.toArray()) {
            SIPHeader sIPHeader = (SIPHeader) obj2;
            List<SIPHeader> headerList = getHeaderList(sIPHeader.getHeaderName());
            if (headerList == null) {
                attachHeader(sIPHeader);
            } else {
                ListIterator<SIPHeader> listIterator = headerList.listIterator();
                while (listIterator.hasNext()) {
                    listIterator.next().merge(sIPHeader);
                }
            }
        }
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void removeContent() {
        this.messageContent = null;
        this.messageContentBytes = null;
        this.messageContentObject = null;
        try {
            this.contentLengthHeader.setContentLength(0);
        } catch (C10800g unused) {
        }
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void removeFirst(String str) {
        if (str == null) {
            throw new NullPointerException("Null argument Provided!");
        }
        removeHeader(str, true);
    }

    public void removeHeader(String str, boolean z6) {
        String lowerCase = SIPHeaderNamesCache.toLowerCase(str);
        SIPHeader sIPHeader = this.headerTable.get(lowerCase);
        if (sIPHeader == null) {
            return;
        }
        if (sIPHeader instanceof SIPHeaderList) {
            SIPHeaderList sIPHeaderList = (SIPHeaderList) sIPHeader;
            if (z6) {
                sIPHeaderList.removeFirst();
            } else {
                sIPHeaderList.removeLast();
            }
            if (sIPHeaderList.isEmpty()) {
                Iterator<SIPHeader> it = this.headers.iterator();
                while (it.hasNext()) {
                    if (it.next().getName().equalsIgnoreCase(lowerCase)) {
                        it.remove();
                    }
                }
                this.headerTable.remove(lowerCase);
                return;
            }
            return;
        }
        this.headerTable.remove(lowerCase);
        if (sIPHeader instanceof From) {
            this.fromHeader = null;
        } else if (sIPHeader instanceof C10766To) {
            this.toHeader = null;
        } else if (sIPHeader instanceof CSeq) {
            this.cSeqHeader = null;
        } else if (sIPHeader instanceof CallID) {
            this.callIdHeader = null;
        } else if (sIPHeader instanceof MaxForwards) {
            this.maxForwardsHeader = null;
        } else if (sIPHeader instanceof ContentLength) {
            this.contentLengthHeader = null;
        }
        Iterator<SIPHeader> it2 = this.headers.iterator();
        while (it2.hasNext()) {
            if (it2.next().getName().equalsIgnoreCase(str)) {
                it2.remove();
            }
        }
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void removeLast(String str) {
        if (str == null) {
            throw new NullPointerException("Null argument Provided!");
        }
        removeHeader(str, false);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void setApplicationData(Object obj) {
        this.applicationData = obj;
    }

    public void setCSeq(InterfaceC13234i interfaceC13234i) {
        setHeader(interfaceC13234i);
    }

    public void setCallId(InterfaceC13236j interfaceC13236j) {
        setHeader(interfaceC13236j);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void setContent(Object obj, InterfaceC13243q interfaceC13243q) {
        if (obj == null) {
            throw new NullPointerException("null content");
        }
        setHeader(interfaceC13243q);
        this.messageContent = null;
        this.messageContentBytes = null;
        this.messageContentObject = null;
        if (obj instanceof String) {
            this.messageContent = (String) obj;
        } else if (obj instanceof byte[]) {
            this.messageContentBytes = (byte[]) obj;
        } else {
            this.messageContentObject = obj;
        }
        computeContentLength(obj);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void setContentDisposition(InterfaceC13239m interfaceC13239m) {
        setHeader(interfaceC13239m);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void setContentEncoding(InterfaceC13240n interfaceC13240n) {
        setHeader(interfaceC13240n);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void setContentLanguage(InterfaceC13241o interfaceC13241o) {
        setHeader(interfaceC13241o);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void setContentLength(InterfaceC13242p interfaceC13242p) {
        try {
            this.contentLengthHeader.setContentLength(interfaceC13242p.getContentLength());
        } catch (C10800g unused) {
        }
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void setExpires(InterfaceC13247u interfaceC13247u) {
        setHeader(interfaceC13247u);
    }

    public void setFrom(InterfaceC13249w interfaceC13249w) {
        setHeader(interfaceC13249w);
    }

    public void setFromTag(String str) {
        try {
            this.fromHeader.setTag(str);
        } catch (ParseException unused) {
        }
    }

    @Override // p735f.InterfaceC13460a
    public void setHeader(InterfaceC13250x interfaceC13250x) {
        SIPHeader sIPHeader = (SIPHeader) interfaceC13250x;
        if (sIPHeader == null) {
            throw new IllegalArgumentException("null header!");
        }
        try {
            if ((sIPHeader instanceof SIPHeaderList) && ((SIPHeaderList) sIPHeader).isEmpty()) {
                return;
            }
            removeHeader(sIPHeader.getHeaderName());
            attachHeader(sIPHeader, true, false);
        } catch (SIPDuplicateHeaderException e10) {
            InternalErrorHandler.handleException(e10);
        }
    }

    public void setHeaders(List<SIPHeader> list) {
        ListIterator<SIPHeader> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            try {
                attachHeader(listIterator.next(), false);
            } catch (SIPDuplicateHeaderException unused) {
            }
        }
    }

    public void setLocalAddress(InetAddress inetAddress) {
        this.localAddress = inetAddress;
    }

    public void setLocalPort(int i10) {
        this.localPort = i10;
    }

    public void setMaxForwards(InterfaceC13194B interfaceC13194B) {
        setHeader(interfaceC13194B);
    }

    public void setMessageContent(String str, String str2, String str3) {
        if (str3 == null) {
            throw new IllegalArgumentException("messgeContent is null");
        }
        setHeader(new ContentType(str, str2));
        this.messageContent = str3;
        this.messageContentBytes = null;
        this.messageContentObject = null;
        computeContentLength(str3);
    }

    public void setNullRequest() {
        this.nullRequest = true;
    }

    public void setPeerPacketSourceAddress(InetAddress inetAddress) {
        this.peerPacketSourceAddress = inetAddress;
    }

    public void setPeerPacketSourcePort(int i10) {
        this.peerPacketSourcePort = i10;
    }

    public void setRemoteAddress(InetAddress inetAddress) {
        this.remoteAddress = inetAddress;
    }

    public void setRemotePort(int i10) {
        this.remotePort = i10;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public abstract void setSIPVersion(String str);

    public void setSize(int i10) {
        this.size = i10;
    }

    public void setTo(InterfaceC13225d0 interfaceC13225d0) {
        setHeader(interfaceC13225d0);
    }

    public void setToTag(String str) {
        try {
            this.toHeader.setTag(str);
        } catch (ParseException unused) {
        }
    }

    public void setUnrecognizedHeadersList(LinkedList<String> linkedList) {
        this.unrecognizedHeaders = linkedList;
    }

    public void setVia(List list) {
        ViaList viaList = new ViaList();
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            viaList.add((Via) listIterator.next());
        }
        setHeader((SIPHeaderList<Via>) viaList);
    }

    public abstract String toString();

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public ContentType getContentTypeHeader() {
        return (ContentType) getHeaderLowerCase(CONTENT_TYPE_LOWERCASE);
    }

    @Override // p735f.InterfaceC13460a
    public ListIterator<SIPHeader> getHeaders(String str) {
        if (str == null) {
            throw new NullPointerException("null headerName");
        }
        SIPHeader sIPHeader = this.headerTable.get(SIPHeaderNamesCache.toLowerCase(str));
        if (sIPHeader == null) {
            return new LinkedList().listIterator();
        }
        return sIPHeader instanceof SIPHeaderList ? ((SIPHeaderList) sIPHeader).listIterator() : new HeaderIterator(this, sIPHeader);
    }

    public void setCallId(String str) {
        if (this.callIdHeader == null) {
            setHeader(new CallID());
        }
        this.callIdHeader.setCallId(str);
    }

    public final String getDialogId(boolean z6, String str) {
        From from = (From) getFrom();
        StringBuffer stringBuffer = new StringBuffer(((CallID) getCallId()).getCallId());
        String str2 = nkFZpTrMPpn.yanHHLLPDbxwsd;
        if (!z6) {
            if (from.getTag() != null) {
                stringBuffer.append(str2);
                stringBuffer.append(from.getTag());
            }
            if (str != null) {
                stringBuffer.append(str2);
                stringBuffer.append(str);
            }
        } else {
            if (str != null) {
                stringBuffer.append(str2);
                stringBuffer.append(str);
            }
            if (from.getTag() != null) {
                stringBuffer.append(str2);
                stringBuffer.append(from.getTag());
            }
        }
        return stringBuffer.toString().toLowerCase();
    }

    public void attachHeader(SIPHeader sIPHeader, boolean z6) {
        attachHeader(sIPHeader, z6, false);
    }

    public void attachHeader(SIPHeader sIPHeader, boolean z6, boolean z10) {
        SIPHeader sIPHeader2;
        SIPHeaderList sIPHeaderList;
        if (sIPHeader != null) {
            if (!ListMap.hasList(sIPHeader) || SIPHeaderList.class.isAssignableFrom(sIPHeader.getClass())) {
                sIPHeader2 = sIPHeader;
            } else {
                SIPHeaderList<SIPHeader> list = ListMap.getList(sIPHeader);
                list.add(sIPHeader);
                sIPHeader2 = list;
            }
            String lowerCase = SIPHeaderNamesCache.toLowerCase(sIPHeader2.getName());
            if (z6) {
                this.headerTable.remove(lowerCase);
            } else if (this.headerTable.containsKey(lowerCase) && !(sIPHeader2 instanceof SIPHeaderList)) {
                if (sIPHeader2 instanceof ContentLength) {
                    try {
                        this.contentLengthHeader.setContentLength(((ContentLength) sIPHeader2).getContentLength());
                        return;
                    } catch (C10800g unused) {
                        return;
                    }
                }
                return;
            }
            SIPHeader sIPHeader3 = (SIPHeader) getHeader(sIPHeader.getName());
            if (sIPHeader3 != null) {
                Iterator<SIPHeader> it = this.headers.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(sIPHeader3)) {
                        it.remove();
                    }
                }
            }
            if (!this.headerTable.containsKey(lowerCase)) {
                this.headerTable.put(lowerCase, sIPHeader2);
                this.headers.add(sIPHeader2);
            } else if ((sIPHeader2 instanceof SIPHeaderList) && (sIPHeaderList = (SIPHeaderList) this.headerTable.get(lowerCase)) != null) {
                sIPHeaderList.concatenate((SIPHeaderList) sIPHeader2, z10);
            } else {
                this.headerTable.put(lowerCase, sIPHeader2);
            }
            if (sIPHeader2 instanceof From) {
                this.fromHeader = (From) sIPHeader2;
                return;
            }
            if (sIPHeader2 instanceof ContentLength) {
                this.contentLengthHeader = (ContentLength) sIPHeader2;
                return;
            }
            if (sIPHeader2 instanceof C10766To) {
                this.toHeader = (C10766To) sIPHeader2;
                return;
            }
            if (sIPHeader2 instanceof CSeq) {
                this.cSeqHeader = (CSeq) sIPHeader2;
                return;
            } else if (sIPHeader2 instanceof CallID) {
                this.callIdHeader = (CallID) sIPHeader2;
                return;
            } else {
                if (sIPHeader2 instanceof MaxForwards) {
                    this.maxForwardsHeader = (MaxForwards) sIPHeader2;
                    return;
                }
                return;
            }
        }
        throw new NullPointerException("null header");
    }

    public void addHeader(String str) {
        try {
            attachHeader(ParserFactory.createParser(str + Separators.RETURN).parse(), false);
        } catch (ParseException unused) {
            getUnrecognizedHeadersList().add(str);
        }
    }

    public void setMessageContent(String str, String str2, byte[] bArr) {
        setHeader(new ContentType(str, str2));
        setMessageContent(bArr);
        computeContentLength(bArr);
    }

    public void setHeader(SIPHeaderList<Via> sIPHeaderList) {
        setHeader((InterfaceC13250x) sIPHeaderList);
    }

    public void setMessageContent(byte[] bArr, boolean z6, boolean z10, int i10) throws ParseException {
        computeContentLength(bArr);
        if (!z10 && ((!z6 && this.contentLengthHeader.getContentLength() != i10) || this.contentLengthHeader.getContentLength() < i10)) {
            throw new ParseException("Invalid content length " + this.contentLengthHeader.getContentLength() + " / " + i10, 0);
        }
        this.messageContent = null;
        this.messageContentBytes = bArr;
        this.messageContentObject = null;
    }

    public void setMessageContent(byte[] bArr) {
        computeContentLength(bArr);
        this.messageContentBytes = bArr;
        this.messageContent = null;
        this.messageContentObject = null;
    }

    public void setMessageContent(byte[] bArr, boolean z6, int i10) throws ParseException {
        computeContentLength(bArr);
        if (!z6 && this.contentLengthHeader.getContentLength() < i10) {
            throw new ParseException("Invalid content length " + this.contentLengthHeader.getContentLength() + " / " + i10, 0);
        }
        this.messageContentBytes = bArr;
        this.messageContent = null;
        this.messageContentObject = null;
    }

    @Override // p735f.InterfaceC13460a
    public void removeHeader(String str) {
        if (str != null) {
            String lowerCase = SIPHeaderNamesCache.toLowerCase(str);
            SIPHeader sIPHeaderRemove = this.headerTable.remove(lowerCase);
            if (sIPHeaderRemove == null) {
                return;
            }
            if (sIPHeaderRemove instanceof From) {
                this.fromHeader = null;
            } else if (sIPHeaderRemove instanceof C10766To) {
                this.toHeader = null;
            } else if (sIPHeaderRemove instanceof CSeq) {
                this.cSeqHeader = null;
            } else if (sIPHeaderRemove instanceof CallID) {
                this.callIdHeader = null;
            } else if (sIPHeaderRemove instanceof MaxForwards) {
                this.maxForwardsHeader = null;
            } else if (sIPHeaderRemove instanceof ContentLength) {
                this.contentLengthHeader = null;
            }
            Iterator<SIPHeader> it = this.headers.iterator();
            while (it.hasNext()) {
                if (it.next().getName().equalsIgnoreCase(lowerCase)) {
                    it.remove();
                }
            }
            return;
        }
        throw new NullPointerException("null arg");
    }
}
