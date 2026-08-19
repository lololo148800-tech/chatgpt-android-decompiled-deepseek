package android.gov.nist.javax.sip.header;

import android.gov.nist.javax.sip.header.extensions.JoinHeader;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.header.extensions.ReferredByHeader;
import android.gov.nist.javax.sip.header.extensions.ReplacesHeader;
import android.gov.nist.javax.sip.header.extensions.SessionExpiresHeader;
import android.gov.nist.javax.sip.header.ims.PAccessNetworkInfoHeader;
import android.gov.nist.javax.sip.header.ims.PAssertedIdentityHeader;
import android.gov.nist.javax.sip.header.ims.PAssertedServiceHeader;
import android.gov.nist.javax.sip.header.ims.PAssociatedURIHeader;
import android.gov.nist.javax.sip.header.ims.PCalledPartyIDHeader;
import android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader;
import android.gov.nist.javax.sip.header.ims.PChargingVectorHeader;
import android.gov.nist.javax.sip.header.ims.PMediaAuthorizationHeader;
import android.gov.nist.javax.sip.header.ims.PPreferredIdentityHeader;
import android.gov.nist.javax.sip.header.ims.PPreferredServiceHeader;
import android.gov.nist.javax.sip.header.ims.PProfileKeyHeader;
import android.gov.nist.javax.sip.header.ims.PServedUserHeader;
import android.gov.nist.javax.sip.header.ims.PUserDatabaseHeader;
import android.gov.nist.javax.sip.header.ims.PVisitedNetworkIDHeader;
import android.gov.nist.javax.sip.header.ims.PathHeader;
import android.gov.nist.javax.sip.header.ims.PrivacyHeader;
import android.gov.nist.javax.sip.header.ims.SecurityClientHeader;
import android.gov.nist.javax.sip.header.ims.SecurityServerHeader;
import android.gov.nist.javax.sip.header.ims.SecurityVerifyHeader;
import android.gov.nist.javax.sip.header.ims.ServiceRouteHeader;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
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
import p713e.InterfaceC13249w;
import p713e.InterfaceC13250x;
import p713e.InterfaceC13252z;

/* JADX INFO: loaded from: classes.dex */
public interface HeaderFactoryExt extends InterfaceC13252z {
    /* synthetic */ InterfaceC13218a createAcceptEncodingHeader(String str);

    /* synthetic */ InterfaceC13220b createAcceptHeader(String str, String str2);

    /* synthetic */ InterfaceC13222c createAcceptLanguageHeader(Locale locale);

    /* synthetic */ InterfaceC13224d createAlertInfoHeader(InterfaceC12947f interfaceC12947f);

    /* synthetic */ InterfaceC13226e createAllowEventsHeader(String str);

    /* synthetic */ InterfaceC13228f createAllowHeader(String str);

    /* synthetic */ InterfaceC13230g createAuthenticationInfoHeader(String str);

    @Override // p713e.InterfaceC13252z
    /* synthetic */ InterfaceC13232h createAuthorizationHeader(String str);

    /* synthetic */ InterfaceC13234i createCSeqHeader(int i10, String str);

    /* synthetic */ InterfaceC13234i createCSeqHeader(long j10, String str);

    /* synthetic */ InterfaceC13236j createCallIdHeader(String str);

    /* synthetic */ InterfaceC13237k createCallInfoHeader(InterfaceC12947f interfaceC12947f);

    PChargingVectorHeader createChargingVectorHeader(String str);

    /* synthetic */ InterfaceC13238l createContactHeader();

    /* synthetic */ InterfaceC13238l createContactHeader(InterfaceC12942a interfaceC12942a);

    /* synthetic */ InterfaceC13239m createContentDispositionHeader(String str);

    /* synthetic */ InterfaceC13240n createContentEncodingHeader(String str);

    /* synthetic */ InterfaceC13241o createContentLanguageHeader(Locale locale);

    /* synthetic */ InterfaceC13242p createContentLengthHeader(int i10);

    /* synthetic */ InterfaceC13243q createContentTypeHeader(String str, String str2);

    /* synthetic */ InterfaceC13244r createDateHeader(Calendar calendar);

    /* synthetic */ InterfaceC13245s createErrorInfoHeader(InterfaceC12947f interfaceC12947f);

    /* synthetic */ InterfaceC13246t createEventHeader(String str);

    /* synthetic */ InterfaceC13247u createExpiresHeader(int i10);

    /* synthetic */ InterfaceC13249w createFromHeader(InterfaceC12942a interfaceC12942a, String str);

    InterfaceC13250x createHeader(String str);

    @Override // p713e.InterfaceC13252z
    /* synthetic */ InterfaceC13250x createHeader(String str, String str2);

    /* synthetic */ List createHeaders(String str);

    /* synthetic */ InterfaceC13193A createInReplyToHeader(String str);

    JoinHeader createJoinHeader(String str, String str2, String str3);

    /* synthetic */ InterfaceC13194B createMaxForwardsHeader(int i10);

    /* synthetic */ InterfaceC13196D createMimeVersionHeader(int i10, int i11);

    /* synthetic */ InterfaceC13197E createMinExpiresHeader(int i10);

    /* synthetic */ InterfaceC13199G createOrganizationHeader(String str);

    PAccessNetworkInfoHeader createPAccessNetworkInfoHeader();

    PAssertedIdentityHeader createPAssertedIdentityHeader(InterfaceC12942a interfaceC12942a);

    PAssertedServiceHeader createPAssertedServiceHeader();

    PAssociatedURIHeader createPAssociatedURIHeader(InterfaceC12942a interfaceC12942a);

    PCalledPartyIDHeader createPCalledPartyIDHeader(InterfaceC12942a interfaceC12942a);

    PChargingFunctionAddressesHeader createPChargingFunctionAddressesHeader();

    PMediaAuthorizationHeader createPMediaAuthorizationHeader(String str);

    PPreferredIdentityHeader createPPreferredIdentityHeader(InterfaceC12942a interfaceC12942a);

    PPreferredServiceHeader createPPreferredServiceHeader();

    PProfileKeyHeader createPProfileKeyHeader(InterfaceC12942a interfaceC12942a);

    PServedUserHeader createPServedUserHeader(InterfaceC12942a interfaceC12942a);

    PUserDatabaseHeader createPUserDatabaseHeader(String str);

    PVisitedNetworkIDHeader createPVisitedNetworkIDHeader();

    PathHeader createPathHeader(InterfaceC12942a interfaceC12942a);

    /* synthetic */ InterfaceC13201I createPriorityHeader(String str);

    PrivacyHeader createPrivacyHeader(String str);

    @Override // p713e.InterfaceC13252z
    /* synthetic */ InterfaceC13202J createProxyAuthenticateHeader(String str);

    @Override // p713e.InterfaceC13252z
    /* synthetic */ InterfaceC13203K createProxyAuthorizationHeader(String str);

    /* synthetic */ InterfaceC13204L createProxyRequireHeader(String str);

    /* synthetic */ InterfaceC13205M createRAckHeader(int i10, int i11, String str);

    /* synthetic */ InterfaceC13206N createRSeqHeader(int i10);

    /* synthetic */ InterfaceC13207O createReasonHeader(String str, int i10, String str2);

    /* synthetic */ InterfaceC13208P createRecordRouteHeader(InterfaceC12942a interfaceC12942a);

    /* synthetic */ InterfaceC13209Q createReferToHeader(InterfaceC12942a interfaceC12942a);

    ReferencesHeader createReferencesHeader(String str, String str2);

    ReferredByHeader createReferredByHeader(InterfaceC12942a interfaceC12942a);

    ReplacesHeader createReplacesHeader(String str, String str2, String str3);

    /* synthetic */ InterfaceC13210S createReplyToHeader(InterfaceC12942a interfaceC12942a);

    SipRequestLine createRequestLine(String str);

    /* synthetic */ InterfaceC13211T createRequireHeader(String str);

    /* synthetic */ InterfaceC13212U createRetryAfterHeader(int i10);

    /* synthetic */ InterfaceC13213V createRouteHeader(InterfaceC12942a interfaceC12942a);

    /* synthetic */ InterfaceC13214W createSIPETagHeader(String str);

    /* synthetic */ InterfaceC13215X createSIPIfMatchHeader(String str);

    SecurityClientHeader createSecurityClientHeader();

    SecurityServerHeader createSecurityServerHeader();

    SecurityVerifyHeader createSecurityVerifyHeader();

    /* synthetic */ InterfaceC13216Y createServerHeader(List list);

    ServiceRouteHeader createServiceRouteHeader(InterfaceC12942a interfaceC12942a);

    SessionExpiresHeader createSessionExpiresHeader(int i10);

    SipStatusLine createStatusLine(String str);

    /* synthetic */ InterfaceC13217Z createSubjectHeader(String str);

    /* synthetic */ InterfaceC13219a0 createSubscriptionStateHeader(String str);

    /* synthetic */ InterfaceC13221b0 createSupportedHeader(String str);

    /* synthetic */ InterfaceC13223c0 createTimeStampHeader(float f10);

    /* synthetic */ InterfaceC13225d0 createToHeader(InterfaceC12942a interfaceC12942a, String str);

    /* synthetic */ InterfaceC13227e0 createUnsupportedHeader(String str);

    /* synthetic */ InterfaceC13229f0 createUserAgentHeader(List list);

    /* synthetic */ InterfaceC13231g0 createViaHeader(String str, int i10, String str2, String str3);

    /* synthetic */ InterfaceC13233h0 createWWWAuthenticateHeader(String str);

    /* synthetic */ InterfaceC13235i0 createWarningHeader(String str, int i10, String str2);
}
