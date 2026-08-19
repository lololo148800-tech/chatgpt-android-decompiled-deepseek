package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.ims.ParameterNamesIms;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.fido.common.Transport;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import mm.InterfaceC17300c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p037B9.MeDP.MpoABj;
import p063C9.AbstractC1616b;
import p1009s9.C19502e;
import p1009s9.C19503f;
import p1060v9.AbstractC20502t;
import p1078w9.InterfaceC20852b;
import p1113xn.AbstractC21322p;
import p132F2.AbstractC2642f;
import p132F2.AbstractC2652p;
import p157G2.AbstractC2976b;
import p157G2.AbstractC2979e;
import p157G2.C2975a;
import p157G2.C2977c;
import p157G2.C2978d;
import p157G2.C2980f;
import p181H2.C3198a;
import p205I2.C3611a;
import p212I9.C3653a;
import p263K9.C4556C;
import p263K9.C4563J;
import p263K9.C4586f;
import p263K9.C4587g;
import p263K9.C4589i;
import p263K9.C4590j;
import p263K9.C4591k;
import p263K9.C4593m;
import p263K9.C4595o;
import p263K9.C4599s;
import p263K9.C4600t;
import p263K9.C4601u;
import p263K9.C4602v;
import p263K9.C4603w;
import p263K9.C4604x;
import p263K9.C4605y;
import p263K9.C4606z;
import p263K9.EnumC4559F;
import p263K9.EnumC4583c;
import p263K9.EnumC4585e;
import p263K9.EnumC4598r;
import p449S9.C7054X;
import p571X9.AbstractC9306j0;
import p903n9.C17528b;
import p903n9.C17529c;
import p903n9.C17536j;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import sj.hJY.CsqksqyPE;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, m18067d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;", "", "()V", "Companion", "GetGMSVersion", "credentials-play-services-auth_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PublicKeyCredentialControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_CREATE = 241217000;
    private static final int FLAGS = 11;
    private static final String TAG = "PublicKeyUtility";
    private static final LinkedHashMap<EnumC4598r, C3198a> orderedErrorCodeToExceptions;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String JSON_KEY_CLIENT_DATA = "clientDataJSON";
    private static final String JSON_KEY_ATTESTATION_OBJ = "attestationObject";
    private static final String JSON_KEY_AUTH_DATA = "authenticatorData";
    private static final String JSON_KEY_SIGNATURE = "signature";
    private static final String JSON_KEY_USER_HANDLE = "userHandle";
    private static final String JSON_KEY_RESPONSE = "response";
    private static final String JSON_KEY_ID = ParameterNames.f31999ID;
    private static final String JSON_KEY_RAW_ID = "rawId";
    private static final String JSON_KEY_TYPE = "type";
    private static final String JSON_KEY_RPID = "rpId";
    private static final String JSON_KEY_CHALLENGE = "challenge";
    private static final String JSON_KEY_APPID = "appid";
    private static final String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";
    private static final String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";
    private static final String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";
    private static final String JSON_KEY_RES_KEY = "residentKey";
    private static final String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";
    private static final String JSON_KEY_TIMEOUT = "timeout";
    private static final String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";
    private static final String JSON_KEY_TRANSPORTS = "transports";
    private static final String JSON_KEY_RP = "rp";
    private static final String JSON_KEY_NAME = DiagnosticsEntry.NAME_KEY;
    private static final String JSON_KEY_ICON = ParameterNames.ICON;
    private static final String JSON_KEY_ALG = ParameterNamesIms.ALG;
    private static final String JSON_KEY_USER = "user";
    private static final String JSON_KEY_DISPLAY_NAME = "displayName";
    private static final String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";
    private static final String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";
    private static final String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";
    private static final String JSON_KEY_EXTENSTIONS = "extensions";
    private static final String JSON_KEY_ATTESTATION = "attestation";
    private static final String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";
    private static final String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";
    private static final String JSON_KEY_RK = "rk";
    private static final String JSON_KEY_CRED_PROPS = "credProps";

    @Metadata(m18066d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\bM\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00132\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u001b\u001a\u00020&¢\u0006\u0004\b(\u0010)J!\u00100\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b.\u0010/J\u001f\u00105\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b6\u00104J\u001f\u00109\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b8\u00104J\u001f\u0010;\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b:\u00104J\u001f\u0010=\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b<\u00104J\u001f\u0010?\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b>\u00104J\u0015\u0010A\u001a\u00020\u00102\u0006\u0010@\u001a\u00020\u0014¢\u0006\u0004\bA\u0010BJ\u0015\u0010D\u001a\u00020\u00142\u0006\u0010C\u001a\u00020\u0010¢\u0006\u0004\bD\u0010EJ\u0015\u0010I\u001a\u00020H2\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bI\u0010JJ\u001f\u0010M\u001a\u00020H2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bO\u0010PR\u001a\u0010Q\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001a\u0010U\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bU\u0010R\u001a\u0004\bV\u0010TR\u001a\u0010W\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bW\u0010R\u001a\u0004\bX\u0010TR\u001a\u0010Y\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bY\u0010R\u001a\u0004\bZ\u0010TR\u001a\u0010[\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\b[\u0010R\u001a\u0004\b\\\u0010TR\u001a\u0010]\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\b]\u0010R\u001a\u0004\b^\u0010TR\u001a\u0010_\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\b_\u0010R\u001a\u0004\b`\u0010TR\u001a\u0010a\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\ba\u0010R\u001a\u0004\bb\u0010TR\u001a\u0010c\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bc\u0010R\u001a\u0004\bd\u0010TR\u001a\u0010e\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\be\u0010R\u001a\u0004\bf\u0010TR\u001a\u0010g\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bg\u0010R\u001a\u0004\bh\u0010TR\u001a\u0010i\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bi\u0010R\u001a\u0004\bj\u0010TR\u001a\u0010k\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bk\u0010R\u001a\u0004\bl\u0010TR\u001a\u0010m\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bm\u0010R\u001a\u0004\bn\u0010TR\u001a\u0010o\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bo\u0010R\u001a\u0004\bp\u0010TR\u001a\u0010q\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bq\u0010R\u001a\u0004\br\u0010TR\u001a\u0010s\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bs\u0010R\u001a\u0004\bt\u0010TR\u001a\u0010u\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bu\u0010R\u001a\u0004\bv\u0010TR\u001a\u0010w\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bw\u0010R\u001a\u0004\bx\u0010TR\u001a\u0010y\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\by\u0010R\u001a\u0004\bz\u0010TR\u001a\u0010{\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\b{\u0010R\u001a\u0004\b|\u0010TR\u001a\u0010}\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\b}\u0010R\u001a\u0004\b~\u0010TR\u001b\u0010\u007f\u001a\u00020\u00148\u0000X\u0080D¢\u0006\r\n\u0004\b\u007f\u0010R\u001a\u0005\b\u0080\u0001\u0010TR\u001d\u0010\u0081\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010R\u001a\u0005\b\u0082\u0001\u0010TR\u001d\u0010\u0083\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010R\u001a\u0005\b\u0084\u0001\u0010TR\u001d\u0010\u0085\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010R\u001a\u0005\b\u0086\u0001\u0010TR\u001d\u0010\u0087\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010R\u001a\u0005\b\u0088\u0001\u0010TR\u001d\u0010\u0089\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010R\u001a\u0005\b\u008a\u0001\u0010TR\u001d\u0010\u008b\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010R\u001a\u0005\b\u008c\u0001\u0010TR\u001d\u0010\u008d\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010R\u001a\u0005\b\u008e\u0001\u0010TR\u001d\u0010\u008f\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010R\u001a\u0005\b\u0090\u0001\u0010TR\u001d\u0010\u0091\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010R\u001a\u0005\b\u0092\u0001\u0010TR\u001d\u0010\u0093\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010R\u001a\u0005\b\u0094\u0001\u0010TR\u001d\u0010\u0095\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010R\u001a\u0005\b\u0096\u0001\u0010TR\u001d\u0010\u0097\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010R\u001a\u0005\b\u0098\u0001\u0010TR?\u0010\u009c\u0001\u001a\"\u0012\u0004\u0012\u00020*\u0012\u0005\u0012\u00030\u009a\u00010\u0099\u0001j\u0010\u0012\u0004\u0012\u00020*\u0012\u0005\u0012\u00030\u009a\u0001`\u009b\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0017\u0010 \u0001\u001a\u00020K8\u0002X\u0082T¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0017\u0010¢\u0001\u001a\u00020F8\u0002X\u0082T¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0016\u0010¤\u0001\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0007\n\u0005\b¤\u0001\u0010R¨\u0006¥\u0001"}, m18067d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;", "", "<init>", "()V", "LF2/f;", "request", "Landroid/content/Context;", "context", "LK9/w;", "convert", "(LF2/f;Landroid/content/Context;)LK9/w;", "Lorg/json/JSONObject;", "json", "convertJSON$credentials_play_services_auth_release", "(Lorg/json/JSONObject;)LK9/w;", "convertJSON", "", "clientDataJSON", "attestationObject", "", "", "transportArray", "Lmm/C;", "addAuthenticatorAttestationResponse$credentials_play_services_auth_release", "([B[B[Ljava/lang/String;Lorg/json/JSONObject;)V", "addAuthenticatorAttestationResponse", "Ln9/j;", "cred", "toAssertPasskeyResponse", "(Ln9/j;)Ljava/lang/String;", "LF2/p;", "option", "Ln9/b;", "convertToPlayAuthPasskeyJsonRequest", "(LF2/p;)Ln9/b;", "Ln9/c;", "convertToPlayAuthPasskeyRequest", "(LF2/p;)Ln9/c;", "LK9/u;", "LG2/b;", "publicKeyCredentialResponseContainsError", "(LK9/u;)LG2/b;", "LK9/r;", "code", "msg", "LG2/e;", "beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release", "(LK9/r;Ljava/lang/String;)LG2/e;", "beginSignInPublicKeyCredentialResponseContainsError", "LK9/v;", "builder", "parseOptionalExtensions$credentials_play_services_auth_release", "(Lorg/json/JSONObject;LK9/v;)V", "parseOptionalExtensions", "parseOptionalAuthenticatorSelection$credentials_play_services_auth_release", "parseOptionalAuthenticatorSelection", "parseOptionalTimeout$credentials_play_services_auth_release", "parseOptionalTimeout", "parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release", "parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials", "parseRequiredRpAndParams$credentials_play_services_auth_release", "parseRequiredRpAndParams", "parseRequiredChallengeAndUser$credentials_play_services_auth_release", "parseRequiredChallengeAndUser", "str", "b64Decode", "(Ljava/lang/String;)[B", "data", "b64Encode", "([B)Ljava/lang/String;", "", ParameterNamesIms.ALG, "", "checkAlgSupported", "(I)Z", "", "version", "isDeviceGMSVersionOlderThan", "(Landroid/content/Context;J)Z", "getChallenge", "(Lorg/json/JSONObject;)[B", "JSON_KEY_CLIENT_DATA", "Ljava/lang/String;", "getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release", "()Ljava/lang/String;", "JSON_KEY_ATTESTATION_OBJ", "getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release", "JSON_KEY_AUTH_DATA", "getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release", "JSON_KEY_SIGNATURE", "getJSON_KEY_SIGNATURE$credentials_play_services_auth_release", "JSON_KEY_USER_HANDLE", "getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release", "JSON_KEY_RESPONSE", "getJSON_KEY_RESPONSE$credentials_play_services_auth_release", "JSON_KEY_ID", "getJSON_KEY_ID$credentials_play_services_auth_release", "JSON_KEY_RAW_ID", "getJSON_KEY_RAW_ID$credentials_play_services_auth_release", "JSON_KEY_TYPE", "getJSON_KEY_TYPE$credentials_play_services_auth_release", "JSON_KEY_RPID", "getJSON_KEY_RPID$credentials_play_services_auth_release", "JSON_KEY_CHALLENGE", "getJSON_KEY_CHALLENGE$credentials_play_services_auth_release", "JSON_KEY_APPID", "getJSON_KEY_APPID$credentials_play_services_auth_release", "JSON_KEY_THIRD_PARTY_PAYMENT", "getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release", "JSON_KEY_AUTH_SELECTION", "getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release", "JSON_KEY_REQUIRE_RES_KEY", "getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release", "JSON_KEY_RES_KEY", "getJSON_KEY_RES_KEY$credentials_play_services_auth_release", "JSON_KEY_AUTH_ATTACHMENT", "getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release", "JSON_KEY_TIMEOUT", "getJSON_KEY_TIMEOUT$credentials_play_services_auth_release", "JSON_KEY_EXCLUDE_CREDENTIALS", "getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release", "JSON_KEY_TRANSPORTS", "getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release", "JSON_KEY_RP", "getJSON_KEY_RP$credentials_play_services_auth_release", "JSON_KEY_NAME", "getJSON_KEY_NAME$credentials_play_services_auth_release", "JSON_KEY_ICON", "getJSON_KEY_ICON$credentials_play_services_auth_release", "JSON_KEY_ALG", "getJSON_KEY_ALG$credentials_play_services_auth_release", "JSON_KEY_USER", "getJSON_KEY_USER$credentials_play_services_auth_release", "JSON_KEY_DISPLAY_NAME", "getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release", "JSON_KEY_USER_VERIFICATION_METHOD", "getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release", "JSON_KEY_KEY_PROTECTION_TYPE", "getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release", "JSON_KEY_MATCHER_PROTECTION_TYPE", "getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release", "JSON_KEY_EXTENSTIONS", "getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release", "JSON_KEY_ATTESTATION", "getJSON_KEY_ATTESTATION$credentials_play_services_auth_release", "JSON_KEY_PUB_KEY_CRED_PARAMS", "getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release", "JSON_KEY_CLIENT_EXTENSION_RESULTS", "getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release", "JSON_KEY_RK", "getJSON_KEY_RK$credentials_play_services_auth_release", "JSON_KEY_CRED_PROPS", "getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release", "Ljava/util/LinkedHashMap;", "LH2/a;", "Lkotlin/collections/LinkedHashMap;", "orderedErrorCodeToExceptions", "Ljava/util/LinkedHashMap;", "getOrderedErrorCodeToExceptions$credentials_play_services_auth_release", "()Ljava/util/LinkedHashMap;", "AUTH_MIN_VERSION_JSON_CREATE", "J", "FLAGS", TokenNames.f32012I, "TAG", "credentials-play-services-auth_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final byte[] getChallenge(JSONObject json) throws JSONException {
            String challengeB64 = json.optString(getJSON_KEY_CHALLENGE$credentials_play_services_auth_release(), "");
            AbstractC16544l.m18093f(challengeB64, "challengeB64");
            if (challengeB64.length() != 0) {
                return b64Decode(challengeB64);
            }
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }

        private final boolean isDeviceGMSVersionOlderThan(Context context, long version) throws PackageManager.NameNotFoundException {
            long versionLong;
            if (C19502e.f61950d.m20602c(context, C19503f.f61951a) != 0) {
                return false;
            }
            PackageManager packageManager = context.getPackageManager();
            AbstractC16544l.m18093f(packageManager, "context.packageManager");
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
                AbstractC16544l.m18093f(packageInfo, "packageManager.getPackageInfo(packageName, 0)");
                versionLong = GetGMSVersion.getVersionLong(packageInfo);
            } else {
                versionLong = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            }
            return versionLong > version;
        }

        /* JADX INFO: renamed from: addAuthenticatorAttestationResponse$credentials_play_services_auth_release */
        public final void m11409x55ac6fce(byte[] clientDataJSON, byte[] attestationObject, String[] transportArray, JSONObject json) throws JSONException {
            AbstractC16544l.m18094g(clientDataJSON, "clientDataJSON");
            AbstractC16544l.m18094g(attestationObject, "attestationObject");
            AbstractC16544l.m18094g(transportArray, "transportArray");
            AbstractC16544l.m18094g(json, "json");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release(), b64Encode(clientDataJSON));
            jSONObject.put(m11411x54c9ae06(), b64Encode(attestationObject));
            jSONObject.put(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release(), new JSONArray(transportArray));
            json.put(getJSON_KEY_RESPONSE$credentials_play_services_auth_release(), jSONObject);
        }

        public final byte[] b64Decode(String str) {
            AbstractC16544l.m18094g(str, "str");
            byte[] bArrDecode = Base64.decode(str, 11);
            AbstractC16544l.m18093f(bArrDecode, "decode(str, FLAGS)");
            return bArrDecode;
        }

        public final String b64Encode(byte[] data) {
            AbstractC16544l.m18094g(data, "data");
            String strEncodeToString = Base64.encodeToString(data, 11);
            AbstractC16544l.m18093f(strEncodeToString, "encodeToString(data, FLAGS)");
            return strEncodeToString;
        }

        /* JADX INFO: renamed from: beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release */
        public final AbstractC2979e m11410x9b91fc47(EnumC4598r code, String msg) {
            AbstractC16544l.m18094g(code, "code");
            C3198a c3198a = m11422x717581f0().get(code);
            if (c3198a == null) {
                return new C2978d(new C3198a(26), AbstractC9306j0.m9889h("unknown fido gms exception - ", msg));
            }
            return (code == EnumC4598r.NOT_ALLOWED_ERR && msg != null && AbstractC21322p.m21667A(msg, "Unable to get sync account", false)) ? new C2977c("Passkey retrieval was cancelled by the user.") : new C2978d(c3198a, msg);
        }

        public final boolean checkAlgSupported(int alg) {
            try {
                C4595o.m5339a(alg);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public final C4603w convert(AbstractC2642f request, Context context) {
            AbstractC16544l.m18094g(request, "request");
            throw null;
        }

        public final C4603w convertJSON$credentials_play_services_auth_release(JSONObject json) throws JSONException, C3611a {
            AbstractC16544l.m18094g(json, "json");
            C4602v c4602v = new C4602v();
            m11425x2d055f1c(json, c4602v);
            parseRequiredRpAndParams$credentials_play_services_auth_release(json, c4602v);
            m11424x81bb96da(json, c4602v);
            parseOptionalTimeout$credentials_play_services_auth_release(json, c4602v);
            m11423x4e596641(json, c4602v);
            parseOptionalExtensions$credentials_play_services_auth_release(json, c4602v);
            C4606z c4606z = c4602v.f14996a;
            C4556C c4556c = c4602v.f14997b;
            byte[] bArr = c4602v.f14998c;
            ArrayList arrayList = c4602v.f14999d;
            Double d10 = c4602v.f15000e;
            ArrayList arrayList2 = c4602v.f15001f;
            C4593m c4593m = c4602v.f15002g;
            EnumC4585e enumC4585e = c4602v.f15003h;
            return new C4603w(c4606z, c4556c, bArr, arrayList, d10, arrayList2, c4593m, null, null, enumC4585e == null ? null : enumC4585e.f14934Y, c4602v.f15004i, null, null);
        }

        public final C17528b convertToPlayAuthPasskeyJsonRequest(AbstractC2652p option) {
            AbstractC16544l.m18094g(option, "option");
            throw null;
        }

        @InterfaceC17300c
        public final C17529c convertToPlayAuthPasskeyRequest(AbstractC2652p option) {
            AbstractC16544l.m18094g(option, "option");
            throw null;
        }

        public final String getJSON_KEY_ALG$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        public final String getJSON_KEY_APPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        public final String getJSON_KEY_ATTESTATION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        /* JADX INFO: renamed from: getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release */
        public final String m11411x54c9ae06() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
        }

        /* JADX INFO: renamed from: getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release */
        public final String m11412x4cbca474() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        public final String getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA;
        }

        /* JADX INFO: renamed from: getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release */
        public final String m11413xf055c137() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        public final String getJSON_KEY_CHALLENGE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        public final String getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
        }

        /* JADX INFO: renamed from: getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release */
        public final String m11414xa1a1c52a() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS;
        }

        public final String getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS;
        }

        public final String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        /* JADX INFO: renamed from: getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release */
        public final String m11415x174cd597() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        public final String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        public final String getJSON_KEY_ICON$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        public final String getJSON_KEY_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        /* JADX INFO: renamed from: getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release */
        public final String m11416x1277f26e() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_KEY_PROTECTION_TYPE;
        }

        /* JADX INFO: renamed from: getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release */
        public final String m11417x42bd95bb() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_MATCHER_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        /* JADX INFO: renamed from: getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release */
        public final String m11418x11a7ad79() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        public final String getJSON_KEY_RAW_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
        }

        /* JADX INFO: renamed from: getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release */
        public final String m11419xe9a27208() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        public final String getJSON_KEY_RESPONSE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }

        public final String getJSON_KEY_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        public final String getJSON_KEY_RK$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RK;
        }

        public final String getJSON_KEY_RP$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        public final String getJSON_KEY_RPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        public final String getJSON_KEY_SIGNATURE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
        }

        /* JADX INFO: renamed from: getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release */
        public final String m11420x55d9bf39() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        public final String getJSON_KEY_TIMEOUT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        public final String getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        public final String getJSON_KEY_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        public final String getJSON_KEY_USER$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        public final String getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }

        /* JADX INFO: renamed from: getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release */
        public final String m11421xd8020d7b() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_VERIFICATION_METHOD;
        }

        /* JADX INFO: renamed from: getOrderedErrorCodeToExceptions$credentials_play_services_auth_release */
        public final LinkedHashMap<EnumC4598r, C3198a> m11422x717581f0() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }

        /* JADX INFO: renamed from: parseOptionalAuthenticatorSelection$credentials_play_services_auth_release */
        public final void m11423x4e596641(JSONObject json, C4602v builder) throws JSONException {
            AbstractC16544l.m18094g(json, "json");
            AbstractC16544l.m18094g(builder, "builder");
            if (json.has(m11413xf055c137())) {
                JSONObject jSONObject = json.getJSONObject(m11413xf055c137());
                boolean zOptBoolean = jSONObject.optBoolean(m11419xe9a27208(), false);
                String residentKey = jSONObject.optString(getJSON_KEY_RES_KEY$credentials_play_services_auth_release(), "");
                AbstractC16544l.m18093f(residentKey, "residentKey");
                EnumC4559F enumC4559FM5323a = residentKey.length() > 0 ? EnumC4559F.m5323a(residentKey) : null;
                Boolean boolValueOf = Boolean.valueOf(zOptBoolean);
                String authenticatorAttachmentString = jSONObject.optString(m11412x4cbca474(), "");
                AbstractC16544l.m18093f(authenticatorAttachmentString, "authenticatorAttachmentString");
                EnumC4583c enumC4583cM5333a = authenticatorAttachmentString.length() > 0 ? EnumC4583c.m5333a(authenticatorAttachmentString) : null;
                builder.f15002g = new C4593m(enumC4583cM5333a == null ? null : enumC4583cM5333a.f14931Y, boolValueOf, null, enumC4559FM5323a == null ? null : enumC4559FM5323a.f14897Y);
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth_release(JSONObject json, C4602v builder) {
            AbstractC16544l.m18094g(json, "json");
            AbstractC16544l.m18094g(builder, "builder");
            if (json.has(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release())) {
                builder.f15000e = Double.valueOf(json.getLong(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release()) / ((double) 1000));
            }
        }

        /* JADX INFO: renamed from: parseRequiredChallengeAndUser$credentials_play_services_auth_release */
        public final void m11425x2d055f1c(JSONObject json, C4602v builder) throws JSONException {
            AbstractC16544l.m18094g(json, "json");
            AbstractC16544l.m18094g(builder, "builder");
            byte[] challenge = getChallenge(json);
            AbstractC20502t.m21157h(challenge);
            builder.f14998c = challenge;
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_USER$credentials_play_services_auth_release());
            String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
            AbstractC16544l.m18093f(string, "user.getString(JSON_KEY_ID)");
            byte[] bArrB64Decode = b64Decode(string);
            String userName = jSONObject.getString(getJSON_KEY_NAME$credentials_play_services_auth_release());
            String displayName = jSONObject.getString(getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release());
            String strOptString = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), "");
            AbstractC16544l.m18093f(displayName, "displayName");
            if (displayName.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            }
            if (bArrB64Decode.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            AbstractC16544l.m18093f(userName, "userName");
            if (userName.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            builder.f14997b = new C4556C(userName, strOptString, displayName, bArrB64Decode);
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth_release(JSONObject json, C4602v builder) throws JSONException {
            AbstractC16544l.m18094g(json, "json");
            AbstractC16544l.m18094g(builder, "builder");
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_RP$credentials_play_services_auth_release());
            String rpId = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
            String rpName = jSONObject.optString(getJSON_KEY_NAME$credentials_play_services_auth_release(), "");
            String strOptString = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), "");
            AbstractC16544l.m18091d(strOptString);
            if (strOptString.length() == 0) {
                strOptString = null;
            }
            AbstractC16544l.m18093f(rpName, "rpName");
            if (rpName.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            AbstractC16544l.m18093f(rpId, "rpId");
            if (rpId.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            builder.f14996a = new C4606z(rpId, rpName, strOptString);
            JSONArray jSONArray = json.getJSONArray(m11418x11a7ad79());
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                int i11 = (int) jSONObject2.getLong(getJSON_KEY_ALG$credentials_play_services_auth_release());
                String typeParam = jSONObject2.optString(getJSON_KEY_TYPE$credentials_play_services_auth_release(), "");
                AbstractC16544l.m18093f(typeParam, "typeParam");
                if (typeParam.length() == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                if (checkAlgSupported(i11)) {
                    arrayList.add(new C4605y(typeParam, i11));
                }
            }
            builder.f14999d = arrayList;
        }

        public final AbstractC2976b publicKeyCredentialResponseContainsError(C4601u cred) {
            AbstractC16544l.m18094g(cred, "cred");
            InterfaceC20852b interfaceC20852b = cred.f14991p0;
            if (interfaceC20852b == null && (interfaceC20852b = cred.f14992q0) == null && (interfaceC20852b = cred.f14993r0) == null) {
                throw new IllegalStateException("No response set.");
            }
            if (!(interfaceC20852b instanceof C4591k)) {
                return null;
            }
            C4591k c4591k = (C4591k) interfaceC20852b;
            EnumC4598r enumC4598r = c4591k.f14962Y;
            AbstractC16544l.m18093f(enumC4598r, "authenticatorResponse.errorCode");
            C3198a c3198a = m11422x717581f0().get(enumC4598r);
            String str = c4591k.f14963Z;
            if (c3198a == null) {
                return new C3611a(new C3198a(26), AbstractC9306j0.m9889h("unknown fido gms exception - ", str));
            }
            return (enumC4598r == EnumC4598r.NOT_ALLOWED_ERR && str != null && AbstractC21322p.m21667A(str, "Unable to get sync account", false)) ? new C2975a("Passkey registration was cancelled by the user.", 0) : new C3611a(c3198a, str);
        }

        public final String toAssertPasskeyResponse(C17536j cred) throws AbstractC2979e {
            Object obj;
            AbstractC16544l.m18094g(cred, "cred");
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            C4601u c4601u = cred.f56097u0;
            if (c4601u != null) {
                obj = c4601u.f14991p0;
                if (obj == null && (obj = c4601u.f14992q0) == null && (obj = c4601u.f14993r0) == null) {
                    throw new IllegalStateException("No response set.");
                }
            } else {
                obj = null;
            }
            AbstractC16544l.m18091d(obj);
            if (obj instanceof C4591k) {
                C4591k c4591k = (C4591k) obj;
                EnumC4598r enumC4598r = c4591k.f14962Y;
                AbstractC16544l.m18093f(enumC4598r, "authenticatorResponse.errorCode");
                throw m11410x9b91fc47(enumC4598r, c4591k.f14963Z);
            }
            if (!(obj instanceof C4589i)) {
                AbstractC15256t.m16465c(PublicKeyCredentialControllerUtility.TAG, "AuthenticatorResponse expected assertion response but got: ".concat(obj.getClass().getName()));
                String string = jSONObject.toString();
                AbstractC16544l.m18093f(string, "json.toString()");
                return string;
            }
            try {
                c4601u.getClass();
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    C7054X c7054x = c4601u.f14990o0;
                    if (c7054x != null && c7054x.m7453t().length > 0) {
                        jSONObject3.put("rawId", AbstractC1616b.m2470b(c7054x.m7453t()));
                    }
                    String str = c4601u.f14995t0;
                    if (str != null) {
                        jSONObject3.put("authenticatorAttachment", str);
                    }
                    String str2 = c4601u.f14989Z;
                    C4591k c4591k2 = c4601u.f14993r0;
                    if (str2 != null && c4591k2 == null) {
                        jSONObject3.put("type", str2);
                    }
                    String str3 = c4601u.f14988Y;
                    if (str3 != null) {
                        jSONObject3.put(ParameterNames.f31999ID, str3);
                    }
                    String str4 = "response";
                    C4589i c4589i = c4601u.f14992q0;
                    boolean z6 = true;
                    if (c4589i != null) {
                        jSONObject2 = c4589i.m5336b();
                    } else {
                        C4590j c4590j = c4601u.f14991p0;
                        if (c4590j != null) {
                            jSONObject2 = c4590j.m5337b();
                        } else {
                            z6 = false;
                            if (c4591k2 != null) {
                                try {
                                    jSONObject2 = new JSONObject();
                                    jSONObject2.put("code", c4591k2.f14962Y.f14985Y);
                                    String str5 = c4591k2.f14963Z;
                                    if (str5 != null) {
                                        jSONObject2.put("message", str5);
                                    }
                                    str4 = "error";
                                } catch (JSONException e10) {
                                    throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e10);
                                }
                            }
                        }
                    }
                    if (jSONObject2 != null) {
                        jSONObject3.put(str4, jSONObject2);
                    }
                    C4587g c4587g = c4601u.f14994s0;
                    if (c4587g != null) {
                        jSONObject3.put("clientExtensionResults", c4587g.m5335b());
                    } else if (z6) {
                        jSONObject3.put("clientExtensionResults", new JSONObject());
                    }
                    String string2 = jSONObject3.toString();
                    AbstractC16544l.m18093f(string2, "publicKeyCred.toJson()");
                    return string2;
                } catch (JSONException e11) {
                    throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e11);
                }
            } catch (Throwable th2) {
                throw new C2980f("The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage());
            }
        }

        private Companion() {
        }

        public final void parseOptionalExtensions$credentials_play_services_auth_release(JSONObject json, C4602v builder) throws JSONException {
            AbstractC16544l.m18094g(json, "json");
            AbstractC16544l.m18094g(builder, MpoABj.scrDNPaYDOmXCtV);
            if (json.has(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release())) {
                JSONObject jSONObject = json.getJSONObject(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release());
                String appIdExtension = jSONObject.optString(getJSON_KEY_APPID$credentials_play_services_auth_release(), "");
                AbstractC16544l.m18093f(appIdExtension, "appIdExtension");
                builder.f15004i = new C4586f(appIdExtension.length() > 0 ? new C4599s(appIdExtension) : null, null, jSONObject.optBoolean("uvm", false) ? new C4563J(true) : null, null, null, null, null, null, jSONObject.optBoolean(m11420x55d9bf39(), false) ? new C4600t(true) : null, null, null, null);
            }
        }

        /* JADX INFO: renamed from: parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release */
        public final void m11424x81bb96da(JSONObject json, C4602v builder) throws JSONException, C3611a {
            ArrayList arrayList;
            AbstractC16544l.m18094g(json, "json");
            AbstractC16544l.m18094g(builder, "builder");
            ArrayList arrayList2 = new ArrayList();
            if (json.has(m11415x174cd597())) {
                JSONArray jSONArray = json.getJSONArray(m11415x174cd597());
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
                    AbstractC16544l.m18093f(string, "descriptorJSON.getString(JSON_KEY_ID)");
                    byte[] bArrB64Decode = b64Decode(string);
                    String descriptorType = jSONObject.getString(getJSON_KEY_TYPE$credentials_play_services_auth_release());
                    AbstractC16544l.m18093f(descriptorType, "descriptorType");
                    if (descriptorType.length() == 0) {
                        throw new JSONException(CsqksqyPE.FwUNVgMOFC);
                    }
                    if (bArrB64Decode.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                    if (jSONObject.has(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release())) {
                        arrayList = new ArrayList();
                        JSONArray jSONArray2 = jSONObject.getJSONArray(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release());
                        int length2 = jSONArray2.length();
                        for (int i11 = 0; i11 < length2; i11++) {
                            try {
                                arrayList.add(Transport.m13211a(jSONArray2.getString(i11)));
                            } catch (C3653a e10) {
                                throw new C3611a(new C3198a(4), e10.getMessage());
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    arrayList2.add(new C4604x(descriptorType, bArrB64Decode, arrayList));
                }
            }
            builder.f15001f = arrayList2;
            String attestationString = json.optString(getJSON_KEY_ATTESTATION$credentials_play_services_auth_release(), "none");
            AbstractC16544l.m18093f(attestationString, "attestationString");
            builder.f15003h = EnumC4585e.m5334a(attestationString.length() != 0 ? attestationString : "none");
        }
    }

    @Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m18067d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$GetGMSVersion;", "", "()V", "getVersionLong", "", ParameterNames.INFO, "Landroid/content/pm/PackageInfo;", "credentials-play-services-auth_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class GetGMSVersion {
        public static final GetGMSVersion INSTANCE = new GetGMSVersion();

        private GetGMSVersion() {
        }

        public static final long getVersionLong(PackageInfo info) {
            AbstractC16544l.m18094g(info, "info");
            return info.getLongVersionCode();
        }
    }

    static {
        C17309l[] c17309lArr = {new C17309l(EnumC4598r.UNKNOWN_ERR, new C3198a(26)), new C17309l(EnumC4598r.ABORT_ERR, new C3198a(0)), new C17309l(EnumC4598r.ATTESTATION_NOT_PRIVATE_ERR, new C3198a(16)), new C17309l(EnumC4598r.CONSTRAINT_ERR, new C3198a(1)), new C17309l(EnumC4598r.DATA_ERR, new C3198a(3)), new C17309l(EnumC4598r.INVALID_STATE_ERR, new C3198a(10)), new C17309l(EnumC4598r.ENCODING_ERR, new C3198a(4)), new C17309l(EnumC4598r.NETWORK_ERR, new C3198a(12)), new C17309l(EnumC4598r.NOT_ALLOWED_ERR, new C3198a(14)), new C17309l(EnumC4598r.NOT_SUPPORTED_ERR, new C3198a(17)), new C17309l(EnumC4598r.SECURITY_ERR, new C3198a(22)), new C17309l(EnumC4598r.TIMEOUT_ERR, new C3198a(24))};
        LinkedHashMap<EnumC4598r, C3198a> linkedHashMap = new LinkedHashMap<>(AbstractC17660E.m19257b(12));
        AbstractC17659D.m19250l(linkedHashMap, c17309lArr);
        orderedErrorCodeToExceptions = linkedHashMap;
    }

    public static final C4603w convert(AbstractC2642f abstractC2642f, Context context) {
        return INSTANCE.convert(abstractC2642f, context);
    }
}
