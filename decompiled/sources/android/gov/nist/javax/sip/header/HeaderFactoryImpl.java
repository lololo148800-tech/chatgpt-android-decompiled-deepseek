package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.address.GenericURI;
import android.gov.nist.javax.sip.header.extensions.Join;
import android.gov.nist.javax.sip.header.extensions.JoinHeader;
import android.gov.nist.javax.sip.header.extensions.MinSE;
import android.gov.nist.javax.sip.header.extensions.References;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.header.extensions.ReferredBy;
import android.gov.nist.javax.sip.header.extensions.ReferredByHeader;
import android.gov.nist.javax.sip.header.extensions.Replaces;
import android.gov.nist.javax.sip.header.extensions.ReplacesHeader;
import android.gov.nist.javax.sip.header.extensions.SessionExpires;
import android.gov.nist.javax.sip.header.extensions.SessionExpiresHeader;
import android.gov.nist.javax.sip.header.ims.PAccessNetworkInfo;
import android.gov.nist.javax.sip.header.ims.PAccessNetworkInfoHeader;
import android.gov.nist.javax.sip.header.ims.PAssertedIdentity;
import android.gov.nist.javax.sip.header.ims.PAssertedIdentityHeader;
import android.gov.nist.javax.sip.header.ims.PAssertedService;
import android.gov.nist.javax.sip.header.ims.PAssertedServiceHeader;
import android.gov.nist.javax.sip.header.ims.PAssociatedURI;
import android.gov.nist.javax.sip.header.ims.PAssociatedURIHeader;
import android.gov.nist.javax.sip.header.ims.PCalledPartyID;
import android.gov.nist.javax.sip.header.ims.PCalledPartyIDHeader;
import android.gov.nist.javax.sip.header.ims.PChargingFunctionAddresses;
import android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader;
import android.gov.nist.javax.sip.header.ims.PChargingVector;
import android.gov.nist.javax.sip.header.ims.PChargingVectorHeader;
import android.gov.nist.javax.sip.header.ims.PMediaAuthorization;
import android.gov.nist.javax.sip.header.ims.PMediaAuthorizationHeader;
import android.gov.nist.javax.sip.header.ims.PPreferredIdentity;
import android.gov.nist.javax.sip.header.ims.PPreferredIdentityHeader;
import android.gov.nist.javax.sip.header.ims.PPreferredService;
import android.gov.nist.javax.sip.header.ims.PPreferredServiceHeader;
import android.gov.nist.javax.sip.header.ims.PProfileKey;
import android.gov.nist.javax.sip.header.ims.PProfileKeyHeader;
import android.gov.nist.javax.sip.header.ims.PServedUser;
import android.gov.nist.javax.sip.header.ims.PServedUserHeader;
import android.gov.nist.javax.sip.header.ims.PUserDatabase;
import android.gov.nist.javax.sip.header.ims.PUserDatabaseHeader;
import android.gov.nist.javax.sip.header.ims.PVisitedNetworkID;
import android.gov.nist.javax.sip.header.ims.PVisitedNetworkIDHeader;
import android.gov.nist.javax.sip.header.ims.Path;
import android.gov.nist.javax.sip.header.ims.PathHeader;
import android.gov.nist.javax.sip.header.ims.Privacy;
import android.gov.nist.javax.sip.header.ims.PrivacyHeader;
import android.gov.nist.javax.sip.header.ims.SecurityClient;
import android.gov.nist.javax.sip.header.ims.SecurityClientHeader;
import android.gov.nist.javax.sip.header.ims.SecurityServer;
import android.gov.nist.javax.sip.header.ims.SecurityServerHeader;
import android.gov.nist.javax.sip.header.ims.SecurityVerify;
import android.gov.nist.javax.sip.header.ims.SecurityVerifyHeader;
import android.gov.nist.javax.sip.header.ims.ServiceRoute;
import android.gov.nist.javax.sip.header.ims.ServiceRouteHeader;
import android.gov.nist.javax.sip.parser.RequestLineParser;
import android.gov.nist.javax.sip.parser.StatusLineParser;
import android.gov.nist.javax.sip.parser.StringMsgParser;
import android.javax.sip.C10800g;
import java.text.ParseException;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import p548Wd.p549VF.zakks;
import p691d.InterfaceC12942a;
import p691d.InterfaceC12947f;
import p713e.InterfaceC13193A;
import p713e.InterfaceC13194B;
import p713e.InterfaceC13196D;
import p713e.InterfaceC13197E;
import p713e.InterfaceC13199G;
import p713e.InterfaceC13201I;
import p713e.InterfaceC13202J;
import p713e.InterfaceC13203K;
import p713e.InterfaceC13204L;
import p713e.InterfaceC13205M;
import p713e.InterfaceC13206N;
import p713e.InterfaceC13207O;
import p713e.InterfaceC13208P;
import p713e.InterfaceC13209Q;
import p713e.InterfaceC13210S;
import p713e.InterfaceC13211T;
import p713e.InterfaceC13212U;
import p713e.InterfaceC13213V;
import p713e.InterfaceC13214W;
import p713e.InterfaceC13215X;
import p713e.InterfaceC13216Y;
import p713e.InterfaceC13217Z;
import p713e.InterfaceC13218a;
import p713e.InterfaceC13219a0;
import p713e.InterfaceC13220b;
import p713e.InterfaceC13221b0;
import p713e.InterfaceC13222c;
import p713e.InterfaceC13223c0;
import p713e.InterfaceC13224d;
import p713e.InterfaceC13225d0;
import p713e.InterfaceC13226e;
import p713e.InterfaceC13227e0;
import p713e.InterfaceC13228f;
import p713e.InterfaceC13229f0;
import p713e.InterfaceC13230g;
import p713e.InterfaceC13231g0;
import p713e.InterfaceC13232h;
import p713e.InterfaceC13233h0;
import p713e.InterfaceC13234i;
import p713e.InterfaceC13235i0;
import p713e.InterfaceC13236j;
import p713e.InterfaceC13237k;
import p713e.InterfaceC13238l;
import p713e.InterfaceC13239m;
import p713e.InterfaceC13240n;
import p713e.InterfaceC13241o;
import p713e.InterfaceC13242p;
import p713e.InterfaceC13243q;
import p713e.InterfaceC13244r;
import p713e.InterfaceC13245s;
import p713e.InterfaceC13246t;
import p713e.InterfaceC13247u;
import p713e.InterfaceC13248v;
import p713e.InterfaceC13249w;
import p713e.InterfaceC13250x;
import p713e.InterfaceC13252z;

/* JADX INFO: loaded from: classes.dex */
public class HeaderFactoryImpl implements InterfaceC13252z, HeaderFactoryExt {
    private boolean stripAddressScopeZones;

    public HeaderFactoryImpl() {
        this.stripAddressScopeZones = false;
        this.stripAddressScopeZones = Boolean.getBoolean("android.gov.nist.core.STRIP_ADDR_SCOPES");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13218a createAcceptEncodingHeader(String str) {
        if (str == null) {
            throw new NullPointerException("the encoding parameter is null");
        }
        AcceptEncoding acceptEncoding = new AcceptEncoding();
        acceptEncoding.setEncoding(str);
        return acceptEncoding;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13220b createAcceptHeader(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("contentType or subtype is null ");
        }
        Accept accept = new Accept();
        accept.setContentType(str);
        accept.setContentSubType(str2);
        return accept;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13222c createAcceptLanguageHeader(Locale locale) {
        if (locale == null) {
            throw new NullPointerException("null arg");
        }
        AcceptLanguage acceptLanguage = new AcceptLanguage();
        acceptLanguage.setAcceptLanguage(locale);
        return acceptLanguage;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13224d createAlertInfoHeader(InterfaceC12947f interfaceC12947f) {
        if (interfaceC12947f == null) {
            throw new NullPointerException("null arg alertInfo");
        }
        AlertInfo alertInfo = new AlertInfo();
        alertInfo.setAlertInfo(interfaceC12947f);
        return alertInfo;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13226e createAllowEventsHeader(String str) {
        if (str == null) {
            throw new NullPointerException("null arg eventType");
        }
        AllowEvents allowEvents = new AllowEvents();
        allowEvents.setEventType(str);
        return allowEvents;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13228f createAllowHeader(String str) {
        if (str == null) {
            throw new NullPointerException("null arg method");
        }
        Allow allow = new Allow();
        allow.setMethod(str);
        return allow;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13230g createAuthenticationInfoHeader(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("null arg response");
        }
        AuthenticationInfo authenticationInfo = new AuthenticationInfo();
        authenticationInfo.setResponse(str);
        return authenticationInfo;
    }

    @Override // p713e.InterfaceC13252z
    public InterfaceC13232h createAuthorizationHeader(String str) {
        if (str == null) {
            throw new NullPointerException("null arg scheme ");
        }
        Authorization authorization = new Authorization();
        authorization.setScheme(str);
        return authorization;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13234i createCSeqHeader(long j10, String str) throws C10800g {
        if (j10 < 0) {
            throw new C10800g(AbstractC10763a.m11049g(j10, "bad arg "));
        }
        if (str == null) {
            throw new NullPointerException("null arg method");
        }
        CSeq cSeq = new CSeq();
        cSeq.setMethod(str);
        cSeq.setSeqNumber(j10);
        return cSeq;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13236j createCallIdHeader(String str) {
        if (str == null) {
            throw new NullPointerException("null arg callId");
        }
        CallID callID = new CallID();
        callID.setCallId(str);
        return callID;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13237k createCallInfoHeader(InterfaceC12947f interfaceC12947f) {
        if (interfaceC12947f == null) {
            throw new NullPointerException("null arg callInfo");
        }
        CallInfo callInfo = new CallInfo();
        callInfo.setInfo(interfaceC12947f);
        return callInfo;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PChargingVectorHeader createChargingVectorHeader(String str) {
        if (str == null) {
            throw new NullPointerException("null icid arg!");
        }
        PChargingVector pChargingVector = new PChargingVector();
        pChargingVector.setICID(str);
        return pChargingVector;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13238l createContactHeader(InterfaceC12942a interfaceC12942a) {
        if (interfaceC12942a == null) {
            throw new NullPointerException("null arg address");
        }
        Contact contact = new Contact();
        contact.setAddress(interfaceC12942a);
        return contact;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13239m createContentDispositionHeader(String str) {
        if (str == null) {
            throw new NullPointerException("null arg contentDisposition");
        }
        ContentDisposition contentDisposition = new ContentDisposition();
        contentDisposition.setDispositionType(str);
        return contentDisposition;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13240n createContentEncodingHeader(String str) {
        if (str == null) {
            throw new NullPointerException("null encoding");
        }
        ContentEncoding contentEncoding = new ContentEncoding();
        contentEncoding.setEncoding(str);
        return contentEncoding;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13241o createContentLanguageHeader(Locale locale) {
        if (locale == null) {
            throw new NullPointerException("null arg contentLanguage");
        }
        ContentLanguage contentLanguage = new ContentLanguage();
        contentLanguage.setContentLanguage(locale);
        return contentLanguage;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13242p createContentLengthHeader(int i10) throws C10800g {
        if (i10 < 0) {
            throw new C10800g("bad contentLength");
        }
        ContentLength contentLength = new ContentLength();
        contentLength.setContentLength(i10);
        return contentLength;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13243q createContentTypeHeader(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("null contentType or subType");
        }
        ContentType contentType = new ContentType();
        contentType.setContentType(str);
        contentType.setContentSubType(str2);
        return contentType;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13244r createDateHeader(Calendar calendar) {
        SIPDateHeader sIPDateHeader = new SIPDateHeader();
        if (calendar == null) {
            throw new NullPointerException("null date");
        }
        sIPDateHeader.setDate(calendar);
        return sIPDateHeader;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13245s createErrorInfoHeader(InterfaceC12947f interfaceC12947f) {
        if (interfaceC12947f != null) {
            return new ErrorInfo((GenericURI) interfaceC12947f);
        }
        throw new NullPointerException("null arg");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13246t createEventHeader(String str) {
        if (str == null) {
            throw new NullPointerException("null eventType");
        }
        Event event = new Event();
        event.setEventType(str);
        return event;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13247u createExpiresHeader(int i10) throws C10800g {
        if (i10 < 0) {
            throw new C10800g(AbstractC10763a.m11048f(i10, "bad value "));
        }
        Expires expires = new Expires();
        expires.setExpires(i10);
        return expires;
    }

    public InterfaceC13248v createExtensionHeader(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("bad name");
        }
        ExtensionHeaderImpl extensionHeaderImpl = new ExtensionHeaderImpl();
        extensionHeaderImpl.setName(str);
        extensionHeaderImpl.setValue(str2);
        return extensionHeaderImpl;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13249w createFromHeader(InterfaceC12942a interfaceC12942a, String str) {
        if (interfaceC12942a == null) {
            throw new NullPointerException("null address arg");
        }
        From from = new From();
        from.setAddress(interfaceC12942a);
        if (str != null) {
            from.setTag(str);
        }
        return from;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13250x createHeader(String str) throws ParseException {
        new StringMsgParser();
        SIPHeader sIPHeader = StringMsgParser.parseSIPHeader(str.trim());
        if (!(sIPHeader instanceof SIPHeaderList)) {
            return sIPHeader;
        }
        SIPHeaderList sIPHeaderList = (SIPHeaderList) sIPHeader;
        if (sIPHeaderList.size() > 1) {
            throw new ParseException("Only singleton allowed ".concat(str), 0);
        }
        if (sIPHeaderList.size() != 0) {
            return sIPHeaderList.getFirst();
        }
        try {
            return (InterfaceC13250x) ((SIPHeaderList) sIPHeader).getMyClass().newInstance();
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
            return null;
        } catch (InstantiationException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public List createHeaders(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("null arg!");
        }
        new StringMsgParser();
        SIPHeader sIPHeader = StringMsgParser.parseSIPHeader(str);
        if (sIPHeader instanceof SIPHeaderList) {
            return (SIPHeaderList) sIPHeader;
        }
        throw new ParseException("List of headers of this type is not allowed in a message", 0);
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13193A createInReplyToHeader(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("null callId arg");
        }
        InReplyTo inReplyTo = new InReplyTo();
        inReplyTo.setCallId(str);
        return inReplyTo;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public JoinHeader createJoinHeader(String str, String str2, String str3) throws ParseException {
        Join join = new Join();
        join.setCallId(str);
        join.setFromTag(str3);
        join.setToTag(str2);
        return join;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13194B createMaxForwardsHeader(int i10) throws C10800g {
        if (i10 < 0 || i10 > 255) {
            throw new C10800g(AbstractC10763a.m11048f(i10, "bad maxForwards arg "));
        }
        MaxForwards maxForwards = new MaxForwards();
        maxForwards.setMaxForwards(i10);
        return maxForwards;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13196D createMimeVersionHeader(int i10, int i11) throws C10800g {
        if (i10 < 0 || i11 < 0) {
            throw new C10800g("bad major/minor version");
        }
        MimeVersion mimeVersion = new MimeVersion();
        mimeVersion.setMajorVersion(i10);
        mimeVersion.setMinorVersion(i11);
        return mimeVersion;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13197E createMinExpiresHeader(int i10) throws C10800g {
        if (i10 < 0) {
            throw new C10800g(AbstractC10763a.m11048f(i10, "bad minExpires "));
        }
        MinExpires minExpires = new MinExpires();
        minExpires.setExpires(i10);
        return minExpires;
    }

    public InterfaceC13248v createMinSEHeader(int i10) throws C10800g {
        if (i10 < 0) {
            throw new C10800g(AbstractC10763a.m11048f(i10, "bad value "));
        }
        MinSE minSE = new MinSE();
        minSE.setExpires(i10);
        return minSE;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13199G createOrganizationHeader(String str) {
        if (str == null) {
            throw new NullPointerException("bad organization arg");
        }
        Organization organization = new Organization();
        organization.setOrganization(str);
        return organization;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PAccessNetworkInfoHeader createPAccessNetworkInfoHeader() {
        return new PAccessNetworkInfo();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PAssertedIdentityHeader createPAssertedIdentityHeader(InterfaceC12942a interfaceC12942a) {
        if (interfaceC12942a == null) {
            throw new NullPointerException("null address!");
        }
        PAssertedIdentity pAssertedIdentity = new PAssertedIdentity();
        pAssertedIdentity.setAddress(interfaceC12942a);
        return pAssertedIdentity;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PAssertedServiceHeader createPAssertedServiceHeader() {
        return new PAssertedService();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PAssociatedURIHeader createPAssociatedURIHeader(InterfaceC12942a interfaceC12942a) {
        if (interfaceC12942a == null) {
            throw new NullPointerException("null associatedURI!");
        }
        PAssociatedURI pAssociatedURI = new PAssociatedURI();
        pAssociatedURI.setAddress(interfaceC12942a);
        return pAssociatedURI;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PCalledPartyIDHeader createPCalledPartyIDHeader(InterfaceC12942a interfaceC12942a) {
        if (interfaceC12942a == null) {
            throw new NullPointerException("null address!");
        }
        PCalledPartyID pCalledPartyID = new PCalledPartyID();
        pCalledPartyID.setAddress(interfaceC12942a);
        return pCalledPartyID;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PChargingFunctionAddressesHeader createPChargingFunctionAddressesHeader() {
        return new PChargingFunctionAddresses();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PMediaAuthorizationHeader createPMediaAuthorizationHeader(String str) throws C10800g {
        if (str == null || str == "") {
            throw new C10800g("The Media-Authorization-Token parameter is null or empty");
        }
        PMediaAuthorization pMediaAuthorization = new PMediaAuthorization();
        pMediaAuthorization.setMediaAuthorizationToken(str);
        return pMediaAuthorization;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PPreferredIdentityHeader createPPreferredIdentityHeader(InterfaceC12942a interfaceC12942a) {
        if (interfaceC12942a == null) {
            throw new NullPointerException("null address!");
        }
        PPreferredIdentity pPreferredIdentity = new PPreferredIdentity();
        pPreferredIdentity.setAddress(interfaceC12942a);
        return pPreferredIdentity;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PPreferredServiceHeader createPPreferredServiceHeader() {
        return new PPreferredService();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PProfileKeyHeader createPProfileKeyHeader(InterfaceC12942a interfaceC12942a) {
        if (interfaceC12942a == null) {
            throw new NullPointerException("Address is null");
        }
        PProfileKey pProfileKey = new PProfileKey();
        pProfileKey.setAddress(interfaceC12942a);
        return pProfileKey;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PServedUserHeader createPServedUserHeader(InterfaceC12942a interfaceC12942a) {
        if (interfaceC12942a == null) {
            throw new NullPointerException("Address is null");
        }
        PServedUser pServedUser = new PServedUser();
        pServedUser.setAddress(interfaceC12942a);
        return pServedUser;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PUserDatabaseHeader createPUserDatabaseHeader(String str) {
        if (str == null || str.equals(Separators.f31991SP)) {
            throw new NullPointerException("Database name is null");
        }
        PUserDatabase pUserDatabase = new PUserDatabase();
        pUserDatabase.setDatabaseName(str);
        return pUserDatabase;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PVisitedNetworkIDHeader createPVisitedNetworkIDHeader() {
        return new PVisitedNetworkID();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PathHeader createPathHeader(InterfaceC12942a interfaceC12942a) {
        if (interfaceC12942a == null) {
            throw new NullPointerException("null address!");
        }
        Path path = new Path();
        path.setAddress(interfaceC12942a);
        return path;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13201I createPriorityHeader(String str) {
        if (str == null) {
            throw new NullPointerException("bad priority arg");
        }
        Priority priority = new Priority();
        priority.setPriority(str);
        return priority;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PrivacyHeader createPrivacyHeader(String str) {
        if (str != null) {
            return new Privacy(str);
        }
        throw new NullPointerException("null privacyType arg");
    }

    @Override // p713e.InterfaceC13252z
    public InterfaceC13202J createProxyAuthenticateHeader(String str) {
        if (str == null) {
            throw new NullPointerException("bad scheme arg");
        }
        ProxyAuthenticate proxyAuthenticate = new ProxyAuthenticate();
        proxyAuthenticate.setScheme(str);
        return proxyAuthenticate;
    }

    @Override // p713e.InterfaceC13252z
    public InterfaceC13203K createProxyAuthorizationHeader(String str) {
        if (str == null) {
            throw new NullPointerException("bad scheme arg");
        }
        ProxyAuthorization proxyAuthorization = new ProxyAuthorization();
        proxyAuthorization.setScheme(str);
        return proxyAuthorization;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13204L createProxyRequireHeader(String str) {
        if (str == null) {
            throw new NullPointerException("bad optionTag arg");
        }
        ProxyRequire proxyRequire = new ProxyRequire();
        proxyRequire.setOptionTag(str);
        return proxyRequire;
    }

    public InterfaceC13205M createRAckHeader(long j10, long j11, String str) throws C10800g {
        if (str == null) {
            throw new NullPointerException("Bad method");
        }
        if (j11 < 0 || j10 < 0) {
            throw new C10800g("bad cseq/rseq arg");
        }
        RAck rAck = new RAck();
        rAck.setMethod(str);
        rAck.setCSequenceNumber(j11);
        rAck.setRSequenceNumber(j10);
        return rAck;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13206N createRSeqHeader(int i10) {
        return createRSeqHeader(i10);
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13207O createReasonHeader(String str, int i10, String str2) throws C10800g {
        if (str == null) {
            throw new NullPointerException("bad protocol arg");
        }
        if (i10 < 0) {
            throw new C10800g("bad cause");
        }
        Reason reason = new Reason();
        reason.setProtocol(str);
        reason.setCause(i10);
        reason.setText(str2);
        return reason;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13208P createRecordRouteHeader(InterfaceC12942a interfaceC12942a) {
        if (interfaceC12942a == null) {
            throw new NullPointerException("Null argument!");
        }
        RecordRoute recordRoute = new RecordRoute();
        recordRoute.setAddress(interfaceC12942a);
        return recordRoute;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13209Q createReferToHeader(InterfaceC12942a interfaceC12942a) {
        if (interfaceC12942a == null) {
            throw new NullPointerException("null address!");
        }
        ReferTo referTo = new ReferTo();
        referTo.setAddress(interfaceC12942a);
        return referTo;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public ReferencesHeader createReferencesHeader(String str, String str2) {
        References references = new References();
        references.setCallId(str);
        references.setRel(str2);
        return references;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public ReferredByHeader createReferredByHeader(InterfaceC12942a interfaceC12942a) {
        if (interfaceC12942a == null) {
            throw new NullPointerException("null address!");
        }
        ReferredBy referredBy = new ReferredBy();
        referredBy.setAddress(interfaceC12942a);
        return referredBy;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public ReplacesHeader createReplacesHeader(String str, String str2, String str3) throws ParseException {
        Replaces replaces = new Replaces();
        replaces.setCallId(str);
        replaces.setFromTag(str3);
        replaces.setToTag(str2);
        return replaces;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public SipRequestLine createRequestLine(String str) {
        return new RequestLineParser(str).parse();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13211T createRequireHeader(String str) {
        if (str == null) {
            throw new NullPointerException("null optionTag");
        }
        Require require = new Require();
        require.setOptionTag(str);
        return require;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13212U createRetryAfterHeader(int i10) throws C10800g {
        if (i10 < 0) {
            throw new C10800g("bad retryAfter arg");
        }
        RetryAfter retryAfter = new RetryAfter();
        retryAfter.setRetryAfter(i10);
        return retryAfter;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13213V createRouteHeader(InterfaceC12942a interfaceC12942a) {
        if (interfaceC12942a == null) {
            throw new NullPointerException("null address arg");
        }
        Route route = new Route();
        route.setAddress(interfaceC12942a);
        return route;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13214W createSIPETagHeader(String str) {
        return new SIPETag(str);
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13215X createSIPIfMatchHeader(String str) {
        return new SIPIfMatch(str);
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public SecurityClientHeader createSecurityClientHeader() {
        return new SecurityClient();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public SecurityServerHeader createSecurityServerHeader() {
        return new SecurityServer();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public SecurityVerifyHeader createSecurityVerifyHeader() {
        return new SecurityVerify();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13216Y createServerHeader(List list) {
        if (list == null) {
            throw new NullPointerException("null productList arg");
        }
        Server server = new Server();
        server.setProduct(list);
        return server;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public ServiceRouteHeader createServiceRouteHeader(InterfaceC12942a interfaceC12942a) {
        if (interfaceC12942a == null) {
            throw new NullPointerException("null address!");
        }
        ServiceRoute serviceRoute = new ServiceRoute();
        serviceRoute.setAddress(interfaceC12942a);
        return serviceRoute;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public SessionExpiresHeader createSessionExpiresHeader(int i10) throws C10800g {
        if (i10 < 0) {
            throw new C10800g(AbstractC10763a.m11048f(i10, "bad value "));
        }
        SessionExpires sessionExpires = new SessionExpires();
        sessionExpires.setExpires(i10);
        return sessionExpires;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public SipStatusLine createStatusLine(String str) {
        return new StatusLineParser(str).parse();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13217Z createSubjectHeader(String str) {
        if (str == null) {
            throw new NullPointerException("null subject arg");
        }
        Subject subject = new Subject();
        subject.setSubject(str);
        return subject;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13219a0 createSubscriptionStateHeader(String str) {
        if (str == null) {
            throw new NullPointerException("null subscriptionState arg");
        }
        SubscriptionState subscriptionState = new SubscriptionState();
        subscriptionState.setState(str);
        return subscriptionState;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13221b0 createSupportedHeader(String str) {
        if (str == null) {
            throw new NullPointerException("null optionTag arg");
        }
        Supported supported = new Supported();
        supported.setOptionTag(str);
        return supported;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13223c0 createTimeStampHeader(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("illegal timeStamp");
        }
        TimeStamp timeStamp = new TimeStamp();
        timeStamp.setTimeStamp(f10);
        return timeStamp;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13225d0 createToHeader(InterfaceC12942a interfaceC12942a, String str) {
        if (interfaceC12942a == null) {
            throw new NullPointerException("null address");
        }
        C10766To c10766To = new C10766To();
        c10766To.setAddress(interfaceC12942a);
        if (str != null) {
            c10766To.setTag(str);
        }
        return c10766To;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13227e0 createUnsupportedHeader(String str) {
        if (str == null) {
            throw new NullPointerException(str);
        }
        Unsupported unsupported = new Unsupported();
        unsupported.setOptionTag(str);
        return unsupported;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13229f0 createUserAgentHeader(List list) {
        if (list == null) {
            throw new NullPointerException("null user agent");
        }
        UserAgent userAgent = new UserAgent();
        userAgent.setProduct(list);
        return userAgent;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13231g0 createViaHeader(String str, int i10, String str2, String str3) throws C10800g {
        int iIndexOf;
        if (str == null || str2 == null) {
            throw new NullPointerException("null arg");
        }
        Via via = new Via();
        if (str3 != null) {
            via.setBranch(str3);
        }
        if (str.indexOf(58) >= 0 && str.indexOf(91) < 0) {
            if (this.stripAddressScopeZones && (iIndexOf = str.indexOf(37)) != -1) {
                str = str.substring(0, iIndexOf);
            }
            str = AbstractC10763a.m11047e(']', "[", str);
        }
        via.setHost(str);
        via.setPort(i10);
        via.setTransport(str2);
        return via;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13233h0 createWWWAuthenticateHeader(String str) {
        if (str == null) {
            throw new NullPointerException("null scheme");
        }
        WWWAuthenticate wWWAuthenticate = new WWWAuthenticate();
        wWWAuthenticate.setScheme(str);
        return wWWAuthenticate;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13235i0 createWarningHeader(String str, int i10, String str2) throws C10800g, ParseException {
        if (str == null) {
            throw new NullPointerException("null arg");
        }
        Warning warning = new Warning();
        warning.setAgent(str);
        warning.setCode(i10);
        warning.setText(str2);
        return warning;
    }

    public void setPrettyEncoding(boolean z6) {
        SIPHeaderList.setPrettyEncode(z6);
    }

    public InterfaceC13206N createRSeqHeader(long j10) throws C10800g {
        if (j10 < 0) {
            throw new C10800g(AbstractC10763a.m11049g(j10, "invalid sequenceNumber arg "));
        }
        RSeq rSeq = new RSeq();
        rSeq.setSeqNumber(j10);
        return rSeq;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13210S createReplyToHeader(InterfaceC12942a interfaceC12942a) {
        if (interfaceC12942a == null) {
            throw new NullPointerException(zakks.VQeeFCzMajZ);
        }
        ReplyTo replyTo = new ReplyTo();
        replyTo.setAddress(interfaceC12942a);
        return replyTo;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13238l createContactHeader() {
        Contact contact = new Contact();
        contact.setWildCardFlag(true);
        contact.setExpires(0);
        return contact;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13205M createRAckHeader(int i10, int i11, String str) {
        return createRAckHeader(i10, i11, str);
    }

    @Override // p713e.InterfaceC13252z
    public InterfaceC13250x createHeader(String str, String str2) {
        if (str != null) {
            return createHeader(str + ":" + str2);
        }
        throw new NullPointerException("header name is null");
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public InterfaceC13234i createCSeqHeader(int i10, String str) {
        return createCSeqHeader(i10, str);
    }
}
