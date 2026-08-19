package android.gov.nist.javax.sip.message;

import android.gov.nist.javax.sip.header.C10766To;
import android.gov.nist.javax.sip.header.CSeq;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.ContentType;
import android.gov.nist.javax.sip.header.From;
import android.gov.nist.javax.sip.header.MaxForwards;
import android.gov.nist.javax.sip.header.RequestLine;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.header.StatusLine;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.parser.ParseExceptionListener;
import android.gov.nist.javax.sip.parser.StringMsgParser;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import java.text.ParseException;
import java.util.List;
import p691d.InterfaceC12947f;
import p713e.InterfaceC13194B;
import p713e.InterfaceC13216Y;
import p713e.InterfaceC13225d0;
import p713e.InterfaceC13229f0;
import p713e.InterfaceC13234i;
import p713e.InterfaceC13236j;
import p713e.InterfaceC13243q;
import p713e.InterfaceC13249w;
import p735f.InterfaceC13461b;
import p735f.InterfaceC13462c;

/* JADX INFO: loaded from: classes.dex */
public class MessageFactoryImpl implements MessageFactoryExt {
    private static String defaultContentEncodingCharset = "UTF-8";
    private static InterfaceC13216Y server;
    private static InterfaceC13229f0 userAgent;
    private boolean testing = false;
    private boolean strict = true;

    public static String getDefaultContentEncodingCharset() {
        return defaultContentEncodingCharset;
    }

    public static InterfaceC13216Y getDefaultServerHeader() {
        return server;
    }

    public static InterfaceC13229f0 getDefaultUserAgentHeader() {
        return userAgent;
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public MultipartMimeContent createMultipartMimeContent(InterfaceC13243q interfaceC13243q, String[] strArr, String[] strArr2, String[] strArr3) {
        interfaceC13243q.getParameter(MultipartMimeContentImpl.BOUNDARY);
        MultipartMimeContentImpl multipartMimeContentImpl = new MultipartMimeContentImpl(interfaceC13243q);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            ContentType contentType = new ContentType(strArr[i10], strArr2[i10]);
            ContentImpl contentImpl = new ContentImpl(strArr3[i10]);
            contentImpl.setContentTypeHeader(contentType);
            multipartMimeContentImpl.add(contentImpl);
        }
        return multipartMimeContentImpl;
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public InterfaceC13461b createRequest(InterfaceC12947f interfaceC12947f, String str, InterfaceC13236j interfaceC13236j, InterfaceC13234i interfaceC13234i, InterfaceC13249w interfaceC13249w, InterfaceC13225d0 interfaceC13225d0, List list, InterfaceC13194B interfaceC13194B, InterfaceC13243q interfaceC13243q, Object obj) {
        if (interfaceC12947f == null || str == null || interfaceC13236j == null || interfaceC13234i == null || interfaceC13249w == null || interfaceC13225d0 == null || list == null || interfaceC13194B == null || obj == null || interfaceC13243q == null) {
            throw new NullPointerException("Null parameters");
        }
        SIPRequest sIPRequest = new SIPRequest();
        sIPRequest.setRequestURI(interfaceC12947f);
        sIPRequest.setMethod(str);
        sIPRequest.setCallId(interfaceC13236j);
        sIPRequest.setCSeq(interfaceC13234i);
        sIPRequest.setFrom(interfaceC13249w);
        sIPRequest.setTo(interfaceC13225d0);
        sIPRequest.setVia(list);
        sIPRequest.setMaxForwards(interfaceC13194B);
        sIPRequest.setContent(obj, interfaceC13243q);
        InterfaceC13229f0 interfaceC13229f0 = userAgent;
        if (interfaceC13229f0 != null) {
            sIPRequest.setHeader(interfaceC13229f0);
        }
        return sIPRequest;
    }

    public InterfaceC13462c createResponse(int i10, InterfaceC13236j interfaceC13236j, InterfaceC13234i interfaceC13234i, InterfaceC13249w interfaceC13249w, InterfaceC13225d0 interfaceC13225d0, List list, InterfaceC13194B interfaceC13194B, Object obj, InterfaceC13243q interfaceC13243q) {
        if (interfaceC13236j == null || interfaceC13234i == null || interfaceC13249w == null || interfaceC13225d0 == null || list == null || interfaceC13194B == null || obj == null || interfaceC13243q == null) {
            throw new NullPointerException(" unable to create the response");
        }
        SIPResponse sIPResponse = new SIPResponse();
        StatusLine statusLine = new StatusLine();
        statusLine.setStatusCode(i10);
        statusLine.setReasonPhrase(SIPResponse.getReasonPhrase(i10));
        sIPResponse.setStatusLine(statusLine);
        sIPResponse.setCallId(interfaceC13236j);
        sIPResponse.setCSeq(interfaceC13234i);
        sIPResponse.setFrom(interfaceC13249w);
        sIPResponse.setTo(interfaceC13225d0);
        sIPResponse.setVia(list);
        sIPResponse.setMaxForwards(interfaceC13194B);
        sIPResponse.setContent(obj, interfaceC13243q);
        InterfaceC13229f0 interfaceC13229f0 = userAgent;
        if (interfaceC13229f0 != null) {
            sIPResponse.setHeader(interfaceC13229f0);
        }
        return sIPResponse;
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public void setDefaultContentEncodingCharset(String str) {
        if (str == null) {
            throw new NullPointerException("Null argument!");
        }
        defaultContentEncodingCharset = str;
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public void setDefaultServerHeader(InterfaceC13216Y interfaceC13216Y) {
        server = interfaceC13216Y;
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public void setDefaultUserAgentHeader(InterfaceC13229f0 interfaceC13229f0) {
        userAgent = interfaceC13229f0;
    }

    public void setStrict(boolean z6) {
        this.strict = z6;
    }

    public void setTest(boolean z6) {
        this.testing = z6;
    }

    public InterfaceC13461b createRequest(InterfaceC12947f interfaceC12947f, String str, InterfaceC13236j interfaceC13236j, InterfaceC13234i interfaceC13234i, InterfaceC13249w interfaceC13249w, InterfaceC13225d0 interfaceC13225d0, List list, InterfaceC13194B interfaceC13194B, byte[] bArr, InterfaceC13243q interfaceC13243q) throws ParseException {
        if (interfaceC12947f != null && str != null && interfaceC13236j != null && interfaceC13234i != null && interfaceC13249w != null && interfaceC13225d0 != null && list != null && interfaceC13194B != null && bArr != null && interfaceC13243q != null) {
            SIPRequest sIPRequest = new SIPRequest();
            sIPRequest.setRequestURI(interfaceC12947f);
            sIPRequest.setMethod(str);
            sIPRequest.setCallId(interfaceC13236j);
            sIPRequest.setCSeq(interfaceC13234i);
            sIPRequest.setFrom(interfaceC13249w);
            sIPRequest.setTo(interfaceC13225d0);
            sIPRequest.setVia(list);
            sIPRequest.setMaxForwards(interfaceC13194B);
            sIPRequest.setHeader((ContentType) interfaceC13243q);
            sIPRequest.setMessageContent(bArr);
            InterfaceC13229f0 interfaceC13229f0 = userAgent;
            if (interfaceC13229f0 != null) {
                sIPRequest.setHeader(interfaceC13229f0);
            }
            return sIPRequest;
        }
        throw new ParseException("JAIN-SIP Exception, some parameters are missing, unable to create the request", 0);
    }

    public InterfaceC13462c createResponse(int i10, InterfaceC13236j interfaceC13236j, InterfaceC13234i interfaceC13234i, InterfaceC13249w interfaceC13249w, InterfaceC13225d0 interfaceC13225d0, List list, InterfaceC13194B interfaceC13194B, byte[] bArr, InterfaceC13243q interfaceC13243q) throws ParseException {
        if (interfaceC13236j != null && interfaceC13234i != null && interfaceC13249w != null && interfaceC13225d0 != null && list != null && interfaceC13194B != null && bArr != null && interfaceC13243q != null) {
            SIPResponse sIPResponse = new SIPResponse();
            sIPResponse.setStatusCode(i10);
            sIPResponse.setCallId(interfaceC13236j);
            sIPResponse.setCSeq(interfaceC13234i);
            sIPResponse.setFrom(interfaceC13249w);
            sIPResponse.setTo(interfaceC13225d0);
            sIPResponse.setVia(list);
            sIPResponse.setMaxForwards(interfaceC13194B);
            sIPResponse.setHeader((ContentType) interfaceC13243q);
            sIPResponse.setMessageContent(bArr);
            InterfaceC13229f0 interfaceC13229f0 = userAgent;
            if (interfaceC13229f0 != null) {
                sIPResponse.setHeader(interfaceC13229f0);
            }
            return sIPResponse;
        }
        throw new NullPointerException(YladLSetV.XnqCIovnZQwDQ);
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public InterfaceC13461b createRequest(InterfaceC12947f interfaceC12947f, String str, InterfaceC13236j interfaceC13236j, InterfaceC13234i interfaceC13234i, InterfaceC13249w interfaceC13249w, InterfaceC13225d0 interfaceC13225d0, List list, InterfaceC13194B interfaceC13194B) throws ParseException {
        if (interfaceC12947f != null && str != null && interfaceC13236j != null && interfaceC13234i != null && interfaceC13249w != null && interfaceC13225d0 != null && list != null && interfaceC13194B != null) {
            SIPRequest sIPRequest = new SIPRequest();
            sIPRequest.setRequestURI(interfaceC12947f);
            sIPRequest.setMethod(str);
            sIPRequest.setCallId(interfaceC13236j);
            sIPRequest.setCSeq(interfaceC13234i);
            sIPRequest.setFrom(interfaceC13249w);
            sIPRequest.setTo(interfaceC13225d0);
            sIPRequest.setVia(list);
            sIPRequest.setMaxForwards(interfaceC13194B);
            InterfaceC13229f0 interfaceC13229f0 = userAgent;
            if (interfaceC13229f0 != null) {
                sIPRequest.setHeader(interfaceC13229f0);
            }
            return sIPRequest;
        }
        throw new ParseException("JAIN-SIP Exception, some parameters are missing, unable to create the request", 0);
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public InterfaceC13462c createResponse(int i10, InterfaceC13236j interfaceC13236j, InterfaceC13234i interfaceC13234i, InterfaceC13249w interfaceC13249w, InterfaceC13225d0 interfaceC13225d0, List list, InterfaceC13194B interfaceC13194B) throws ParseException {
        if (interfaceC13236j != null && interfaceC13234i != null && interfaceC13249w != null && interfaceC13225d0 != null && list != null && interfaceC13194B != null) {
            SIPResponse sIPResponse = new SIPResponse();
            sIPResponse.setStatusCode(i10);
            sIPResponse.setCallId(interfaceC13236j);
            sIPResponse.setCSeq(interfaceC13234i);
            sIPResponse.setFrom(interfaceC13249w);
            sIPResponse.setTo(interfaceC13225d0);
            sIPResponse.setVia(list);
            sIPResponse.setMaxForwards(interfaceC13194B);
            InterfaceC13229f0 interfaceC13229f0 = userAgent;
            if (interfaceC13229f0 != null) {
                sIPResponse.setHeader(interfaceC13229f0);
            }
            return sIPResponse;
        }
        throw new ParseException("JAIN-SIP Exception, some parameters are missing, unable to create the response", 0);
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public InterfaceC13461b createRequest(InterfaceC12947f interfaceC12947f, String str, InterfaceC13236j interfaceC13236j, InterfaceC13234i interfaceC13234i, InterfaceC13249w interfaceC13249w, InterfaceC13225d0 interfaceC13225d0, List list, InterfaceC13194B interfaceC13194B, InterfaceC13243q interfaceC13243q, byte[] bArr) {
        if (interfaceC12947f != null && str != null && interfaceC13236j != null && interfaceC13234i != null && interfaceC13249w != null && interfaceC13225d0 != null && list != null && interfaceC13194B != null && bArr != null && interfaceC13243q != null) {
            SIPRequest sIPRequest = new SIPRequest();
            sIPRequest.setRequestURI(interfaceC12947f);
            sIPRequest.setMethod(str);
            sIPRequest.setCallId(interfaceC13236j);
            sIPRequest.setCSeq(interfaceC13234i);
            sIPRequest.setFrom(interfaceC13249w);
            sIPRequest.setTo(interfaceC13225d0);
            sIPRequest.setVia(list);
            sIPRequest.setMaxForwards(interfaceC13194B);
            sIPRequest.setContent(bArr, interfaceC13243q);
            InterfaceC13229f0 interfaceC13229f0 = userAgent;
            if (interfaceC13229f0 != null) {
                sIPRequest.setHeader(interfaceC13229f0);
            }
            return sIPRequest;
        }
        throw new NullPointerException("missing parameters");
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public InterfaceC13462c createResponse(int i10, InterfaceC13461b interfaceC13461b, InterfaceC13243q interfaceC13243q, Object obj) {
        if (interfaceC13461b != null && obj != null && interfaceC13243q != null) {
            SIPResponse sIPResponseCreateResponse = ((SIPRequest) interfaceC13461b).createResponse(i10);
            sIPResponseCreateResponse.setContent(obj, interfaceC13243q);
            InterfaceC13216Y interfaceC13216Y = server;
            if (interfaceC13216Y != null) {
                sIPResponseCreateResponse.setHeader(interfaceC13216Y);
            }
            return sIPResponseCreateResponse;
        }
        throw new NullPointerException("null parameters");
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public InterfaceC13462c createResponse(int i10, InterfaceC13461b interfaceC13461b, InterfaceC13243q interfaceC13243q, byte[] bArr) {
        if (interfaceC13461b != null && bArr != null && interfaceC13243q != null) {
            SIPResponse sIPResponseCreateResponse = ((SIPRequest) interfaceC13461b).createResponse(i10);
            sIPResponseCreateResponse.setHeader((ContentType) interfaceC13243q);
            sIPResponseCreateResponse.setMessageContent(bArr);
            InterfaceC13216Y interfaceC13216Y = server;
            if (interfaceC13216Y != null) {
                sIPResponseCreateResponse.setHeader(interfaceC13216Y);
            }
            return sIPResponseCreateResponse;
        }
        throw new NullPointerException("null Parameters");
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public InterfaceC13461b createRequest(String str) throws ParseException {
        if (str != null && !str.equals("")) {
            StringMsgParser stringMsgParser = new StringMsgParser();
            ParseExceptionListener parseExceptionListener = new ParseExceptionListener() { // from class: android.gov.nist.javax.sip.message.MessageFactoryImpl.1
                @Override // android.gov.nist.javax.sip.parser.ParseExceptionListener
                public void handleException(ParseException parseException, SIPMessage sIPMessage, Class cls, String str2, String str3) throws ParseException {
                    if (MessageFactoryImpl.this.testing) {
                        if (cls == From.class || cls == C10766To.class || cls == CallID.class || cls == MaxForwards.class || cls == Via.class || cls == RequestLine.class || cls == StatusLine.class || cls == CSeq.class) {
                            throw parseException;
                        }
                        sIPMessage.addUnparsed(str2);
                    }
                }
            };
            if (!this.testing) {
                parseExceptionListener = null;
            }
            SIPMessage sIPMessage = stringMsgParser.parseSIPMessage(str.getBytes(), true, this.strict, parseExceptionListener);
            if (sIPMessage instanceof SIPRequest) {
                return (SIPRequest) sIPMessage;
            }
            throw new ParseException(str, 0);
        }
        SIPRequest sIPRequest = new SIPRequest();
        sIPRequest.setNullRequest();
        return sIPRequest;
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public InterfaceC13462c createResponse(int i10, InterfaceC13461b interfaceC13461b) {
        if (interfaceC13461b != null) {
            SIPResponse sIPResponseCreateResponse = ((SIPRequest) interfaceC13461b).createResponse(i10);
            sIPResponseCreateResponse.removeContent();
            sIPResponseCreateResponse.removeHeader(SIPHeaderNames.CONTENT_TYPE);
            InterfaceC13216Y interfaceC13216Y = server;
            if (interfaceC13216Y != null) {
                sIPResponseCreateResponse.setHeader(interfaceC13216Y);
            }
            return sIPResponseCreateResponse;
        }
        throw new NullPointerException("null parameters");
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public InterfaceC13462c createResponse(int i10, InterfaceC13236j interfaceC13236j, InterfaceC13234i interfaceC13234i, InterfaceC13249w interfaceC13249w, InterfaceC13225d0 interfaceC13225d0, List list, InterfaceC13194B interfaceC13194B, InterfaceC13243q interfaceC13243q, Object obj) throws ParseException {
        if (interfaceC13236j != null && interfaceC13234i != null && interfaceC13249w != null && interfaceC13225d0 != null && list != null && interfaceC13194B != null && obj != null && interfaceC13243q != null) {
            SIPResponse sIPResponse = new SIPResponse();
            StatusLine statusLine = new StatusLine();
            statusLine.setStatusCode(i10);
            String reasonPhrase = SIPResponse.getReasonPhrase(i10);
            if (reasonPhrase != null) {
                statusLine.setReasonPhrase(reasonPhrase);
                sIPResponse.setStatusLine(statusLine);
                sIPResponse.setCallId(interfaceC13236j);
                sIPResponse.setCSeq(interfaceC13234i);
                sIPResponse.setFrom(interfaceC13249w);
                sIPResponse.setTo(interfaceC13225d0);
                sIPResponse.setVia(list);
                sIPResponse.setContent(obj, interfaceC13243q);
                InterfaceC13229f0 interfaceC13229f0 = userAgent;
                if (interfaceC13229f0 != null) {
                    sIPResponse.setHeader(interfaceC13229f0);
                }
                return sIPResponse;
            }
            throw new ParseException(i10 + " Unknown", 0);
        }
        throw new NullPointerException("missing parameters");
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public InterfaceC13462c createResponse(int i10, InterfaceC13236j interfaceC13236j, InterfaceC13234i interfaceC13234i, InterfaceC13249w interfaceC13249w, InterfaceC13225d0 interfaceC13225d0, List list, InterfaceC13194B interfaceC13194B, InterfaceC13243q interfaceC13243q, byte[] bArr) throws ParseException {
        if (interfaceC13236j != null && interfaceC13234i != null && interfaceC13249w != null && interfaceC13225d0 != null && list != null && interfaceC13194B != null && bArr != null && interfaceC13243q != null) {
            SIPResponse sIPResponse = new SIPResponse();
            StatusLine statusLine = new StatusLine();
            statusLine.setStatusCode(i10);
            String reasonPhrase = SIPResponse.getReasonPhrase(i10);
            if (reasonPhrase != null) {
                statusLine.setReasonPhrase(reasonPhrase);
                sIPResponse.setStatusLine(statusLine);
                sIPResponse.setCallId(interfaceC13236j);
                sIPResponse.setCSeq(interfaceC13234i);
                sIPResponse.setFrom(interfaceC13249w);
                sIPResponse.setTo(interfaceC13225d0);
                sIPResponse.setVia(list);
                sIPResponse.setContent(bArr, interfaceC13243q);
                InterfaceC13229f0 interfaceC13229f0 = userAgent;
                if (interfaceC13229f0 != null) {
                    sIPResponse.setHeader(interfaceC13229f0);
                }
                return sIPResponse;
            }
            throw new ParseException(i10 + " : Unknown", 0);
        }
        throw new NullPointerException("missing parameters");
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public InterfaceC13462c createResponse(String str) throws ParseException {
        if (str == null) {
            return new SIPResponse();
        }
        SIPMessage sIPMessage = new StringMsgParser().parseSIPMessage(str.getBytes(), true, false, null);
        if (sIPMessage instanceof SIPResponse) {
            return (SIPResponse) sIPMessage;
        }
        throw new ParseException(str, 0);
    }
}
