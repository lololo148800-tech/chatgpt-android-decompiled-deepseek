package android.gov.nist.javax.sip.header;

import android.gov.nist.core.PackageNames;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.ims.PAccessNetworkInfo;
import android.gov.nist.javax.sip.header.ims.PAssertedIdentity;
import android.gov.nist.javax.sip.header.ims.PAssociatedURI;
import android.gov.nist.javax.sip.header.ims.PCalledPartyID;
import android.gov.nist.javax.sip.header.ims.PChargingFunctionAddresses;
import android.gov.nist.javax.sip.header.ims.PChargingVector;
import android.gov.nist.javax.sip.header.ims.PMediaAuthorization;
import android.gov.nist.javax.sip.header.ims.PPreferredIdentity;
import android.gov.nist.javax.sip.header.ims.PVisitedNetworkID;
import android.gov.nist.javax.sip.header.ims.Path;
import android.gov.nist.javax.sip.header.ims.Privacy;
import android.gov.nist.javax.sip.header.ims.ServiceRoute;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class NameMap implements SIPHeaderNames, PackageNames {
    static Map<String, String> nameMap;

    static {
        initializeNameMap();
    }

    public static void addExtensionHeader(String str, String str2) {
        nameMap.put(str.toLowerCase(), str2);
    }

    public static Class getClassFromName(String str) {
        String str2 = nameMap.get(str.toLowerCase());
        if (str2 == null) {
            return null;
        }
        try {
            return Class.forName(str2);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static void initializeNameMap() {
        nameMap = new HashMap(63);
        putNameMap(SIPHeaderNames.MIN_EXPIRES, MinExpires.class.getName());
        putNameMap(SIPHeaderNames.ERROR_INFO, ErrorInfo.class.getName());
        putNameMap(SIPHeaderNames.EVENT, AbstractC10763a.m11053k(SIPHeaderNames.REPLY_TO, AbstractC10763a.m11053k(SIPHeaderNames.EXPIRES, AbstractC10763a.m11053k(SIPHeaderNames.PRIORITY, AbstractC10763a.m11053k(SIPHeaderNames.USER_AGENT, AbstractC10763a.m11053k(SIPHeaderNames.CONTENT_DISPOSITION, AbstractC10763a.m11053k(SIPHeaderNames.PROXY_REQUIRE, AbstractC10763a.m11053k(SIPHeaderNames.ORGANIZATION, AbstractC10763a.m11053k(SIPHeaderNames.WWW_AUTHENTICATE, AbstractC10763a.m11053k(SIPHeaderNames.ROUTE, AbstractC10763a.m11053k(SIPHeaderNames.CONTENT_ENCODING, AbstractC10763a.m11053k(SIPHeaderNames.RETRY_AFTER, AbstractC10763a.m11053k(SIPHeaderNames.SERVER, AbstractC10763a.m11053k(SIPHeaderNames.AUTHORIZATION, AbstractC10763a.m11053k(SIPHeaderNames.FROM, AbstractC10763a.m11053k(SIPHeaderNames.f32002TO, AbstractC10763a.m11053k(SIPHeaderNames.RECORD_ROUTE, AbstractC10763a.m11053k(SIPHeaderNames.ACCEPT, AbstractC10763a.m11053k(SIPHeaderNames.ALERT_INFO, AbstractC10763a.m11053k(SIPHeaderNames.CALL_INFO, AbstractC10763a.m11053k(SIPHeaderNames.ALLOW, AbstractC10763a.m11053k(SIPHeaderNames.MIME_VERSION, MimeVersion.class.getName(), InReplyTo.class, SIPHeaderNames.IN_REPLY_TO, Allow.class), ContentLanguage.class, SIPHeaderNames.CONTENT_LANGUAGE, CallInfo.class), CSeq.class, SIPHeaderNames.CSEQ, AlertInfo.class), AcceptEncoding.class, SIPHeaderNames.ACCEPT_ENCODING, Accept.class), AcceptLanguage.class, SIPHeaderNames.ACCEPT_LANGUAGE, RecordRoute.class), TimeStamp.class, SIPHeaderNames.TIMESTAMP, C10766To.class), Via.class, SIPHeaderNames.VIA, From.class), CallID.class, SIPHeaderNames.CALL_ID, Authorization.class), ProxyAuthenticate.class, SIPHeaderNames.PROXY_AUTHENTICATE, Server.class), Unsupported.class, SIPHeaderNames.UNSUPPORTED, RetryAfter.class), ContentType.class, SIPHeaderNames.CONTENT_TYPE, ContentEncoding.class), ContentLength.class, SIPHeaderNames.CONTENT_LENGTH, Route.class), Contact.class, SIPHeaderNames.CONTACT, WWWAuthenticate.class), MaxForwards.class, SIPHeaderNames.MAX_FORWARDS, Organization.class), ProxyAuthorization.class, SIPHeaderNames.PROXY_AUTHORIZATION, ProxyRequire.class), Require.class, SIPHeaderNames.REQUIRE, ContentDisposition.class), Subject.class, SIPHeaderNames.SUBJECT, UserAgent.class), Warning.class, SIPHeaderNames.WARNING, Priority.class), SIPDateHeader.class, SIPHeaderNames.DATE, Expires.class), Supported.class, SIPHeaderNames.SUPPORTED, ReplyTo.class), SubscriptionState.class, SIPHeaderNames.SUBSCRIPTION_STATE, Event.class));
        putNameMap(SIPHeaderNames.ALLOW_EVENTS, AllowEvents.class.getName());
        putNameMap("Referred-By", "ReferredBy");
        putNameMap("Session-Expires", "SessionExpires");
        putNameMap("Min-SE", "MinSE");
        putNameMap("Replaces", "Replaces");
        putNameMap("Join", "Join");
        putNameMap("Service-Route", AbstractC10763a.m11053k("P-Preferred-Identity", AbstractC10763a.m11053k("P-Media-Authorization", AbstractC10763a.m11053k("P-Charging-Function-Addresses", AbstractC10763a.m11053k("P-Associated-URI", AbstractC10763a.m11053k("P-Access-Network-Info", PAccessNetworkInfo.class.getName(), PAssertedIdentity.class, "P-Asserted-Identity", PAssociatedURI.class), PCalledPartyID.class, "P-Called-Party-ID", PChargingFunctionAddresses.class), PChargingVector.class, "P-Charging-Vector", PMediaAuthorization.class), Path.class, "Path", PPreferredIdentity.class), Privacy.class, "Privacy", ServiceRoute.class));
        putNameMap("P-Visited-Network-ID", PVisitedNetworkID.class.getName());
    }

    public static void putNameMap(String str, String str2) {
        nameMap.put(str.toLowerCase(), str2);
    }
}
