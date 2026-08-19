package p919o8;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import livekit.org.webrtc.MediaStreamTrack;
import p138F8.vJO.vRJidSveZHcTw;
import p509Uk.lpqL.SfpOlmlMATQ;
import p926of.yRae.sVDIzpC;

/* JADX INFO: renamed from: o8.d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC17962d {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ String m19610A(int i10) {
        switch (i10) {
            case 1:
                return "user_app_launch";
            case 2:
                return "inactivity_timeout";
            case 3:
                return "max_duration";
            case 4:
                return "background_launch";
            case 5:
                return "prewarm";
            case 6:
                return "from_non_interactive_session";
            case 7:
                return "explicit_stop";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ String m19611B(int i10) {
        if (i10 == 1) {
            return "connected";
        }
        if (i10 == 2) {
            return "not_connected";
        }
        if (i10 == 3) {
            return "maybe";
        }
        throw null;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ String m19612C(int i10) {
        if (i10 == 1) {
            return "ANR";
        }
        if (i10 == 2) {
            return "App Hang";
        }
        if (i10 == 3) {
            return "Exception";
        }
        if (i10 == 4) {
            return "Watchdog Termination";
        }
        if (i10 == 5) {
            return "Memory Warning";
        }
        throw null;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ String m19613D(int i10) {
        switch (i10) {
            case 1:
                return "mobile";
            case 2:
                return "desktop";
            case 3:
                return "tablet";
            case 4:
                return "tv";
            case 5:
                return "gaming_console";
            case 6:
                return "bot";
            case 7:
                return "other";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ String m19614E(int i10) {
        switch (i10) {
            case 1:
                return "ANDROID";
            case 2:
                return "IOS";
            case 3:
                return "BROWSER";
            case 4:
                return YladLSetV.aGyZA;
            case 5:
                return "REACT_NATIVE";
            case 6:
                return "ROKU";
            case 7:
                return "UNITY";
            case 8:
                return "KOTLIN_MULTIPLATFORM";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ String m19615F(int i10) {
        switch (i10) {
            case 1:
                return "ANDROID";
            case 2:
                return "IOS";
            case 3:
                return "BROWSER";
            case 4:
                return "FLUTTER";
            case 5:
                return "REACT_NATIVE";
            case 6:
                return "ROKU";
            case 7:
                return "UNITY";
            case 8:
                return "KOTLIN_MULTIPLATFORM";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ String m19616G(int i10) {
        if (i10 == 1) {
            return "USER";
        }
        if (i10 != 2) {
            return i10 != 3 ? "null" : "CI_TEST";
        }
        return "SYNTHETICS";
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ String m19617H(int i10) {
        switch (i10) {
            case 1:
                return "NETWORK";
            case 2:
                return "SOURCE";
            case 3:
                return "CONSOLE";
            case 4:
                return "LOGGER";
            case 5:
                return "AGENT";
            case 6:
                return "WEBVIEW";
            case 7:
                return "CUSTOM";
            case 8:
                return "REPORT";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ String m19618I(int i10) {
        switch (i10) {
            case 1:
                return "POST";
            case 2:
                return "GET";
            case 3:
                return "HEAD";
            case 4:
                return "PUT";
            case 5:
                return "DELETE";
            case 6:
                return "PATCH";
            case 7:
                return "TRACE";
            case 8:
                return TokenNames.OPTIONS;
            case 9:
                return "CONNECT";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ String m19619J(int i10) {
        switch (i10) {
            case 1:
                return "AD";
            case 2:
                return "ADVERTISING";
            case 3:
                return "ANALYTICS";
            case 4:
                return "CDN";
            case 5:
                return "CONTENT";
            case 6:
                return "CUSTOMER_SUCCESS";
            case 7:
                return "FIRST_PARTY";
            case 8:
                return "HOSTING";
            case 9:
                return "MARKETING";
            case 10:
                return "OTHER";
            case 11:
                return "SOCIAL";
            case 12:
                return "TAG_MANAGER";
            case 13:
                return "UTILITY";
            case 14:
                return "VIDEO";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ String m19620K(int i10) {
        switch (i10) {
            case 1:
                return "USER_APP_LAUNCH";
            case 2:
                return "INACTIVITY_TIMEOUT";
            case 3:
                return "MAX_DURATION";
            case 4:
                return "BACKGROUND_LAUNCH";
            case 5:
                return "PREWARM";
            case 6:
                return "FROM_NON_INTERACTIVE_SESSION";
            case 7:
                return "EXPLICIT_STOP";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ String m19621L(int i10) {
        if (i10 == 1) {
            return "CONNECTED";
        }
        if (i10 != 2) {
            return i10 != 3 ? "null" : "MAYBE";
        }
        return "NOT_CONNECTED";
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ String m19622M(int i10) {
        switch (i10) {
            case 1:
                return "MOBILE";
            case 2:
                return "DESKTOP";
            case 3:
                return "TABLET";
            case 4:
                return "TV";
            case 5:
                return "GAMING_CONSOLE";
            case 6:
                return "BOT";
            case 7:
                return "OTHER";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ String m19623N(int i10) {
        switch (i10) {
            case 1:
                return "CUSTOM";
            case 2:
                return "CLICK";
            case 3:
                return "TAP";
            case 4:
                return "SCROLL";
            case 5:
                return "SWIPE";
            case 6:
                return "APPLICATION_START";
            case 7:
                return "BACK";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ String m19624O(int i10) {
        if (i10 == 1) {
            return "USER";
        }
        if (i10 != 2) {
            return i10 != 3 ? "null" : "CI_TEST";
        }
        return "SYNTHETICS";
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ String m19625P(int i10) {
        switch (i10) {
            case 1:
                return "ANDROID";
            case 2:
                return "IOS";
            case 3:
                return "BROWSER";
            case 4:
                return "FLUTTER";
            case 5:
                return "REACT_NATIVE";
            case 6:
                return "ROKU";
            case 7:
                return "UNITY";
            case 8:
                return "KOTLIN_MULTIPLATFORM";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ String m19626Q(int i10) {
        switch (i10) {
            case 1:
                return "USER_APP_LAUNCH";
            case 2:
                return "INACTIVITY_TIMEOUT";
            case 3:
                return "MAX_DURATION";
            case 4:
                return "BACKGROUND_LAUNCH";
            case 5:
                return "PREWARM";
            case 6:
                return "FROM_NON_INTERACTIVE_SESSION";
            case 7:
                return "EXPLICIT_STOP";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ String m19627R(int i10) {
        if (i10 == 1) {
            return "CONNECTED";
        }
        if (i10 != 2) {
            return i10 != 3 ? "null" : "MAYBE";
        }
        return "NOT_CONNECTED";
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ String m19628S(int i10) {
        switch (i10) {
            case 1:
                return "MOBILE";
            case 2:
                return "DESKTOP";
            case 3:
                return "TABLET";
            case 4:
                return "TV";
            case 5:
                return "GAMING_CONSOLE";
            case 6:
                return "BOT";
            case 7:
                return "OTHER";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ String m19629T(int i10) {
        if (i10 == 1) {
            return "SLOW_2G";
        }
        if (i10 == 2) {
            return "2G";
        }
        if (i10 != 3) {
            return i10 != 4 ? "null" : "4G";
        }
        return "3G";
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ String m19630U(int i10) {
        switch (i10) {
            case 1:
                return "POST";
            case 2:
                return "GET";
            case 3:
                return "HEAD";
            case 4:
                return "PUT";
            case 5:
                return "DELETE";
            case 6:
                return "PATCH";
            case 7:
                return "TRACE";
            case 8:
                return TokenNames.OPTIONS;
            case 9:
                return "CONNECT";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ String m19631V(int i10) {
        if (i10 == 1) {
            return "QUERY";
        }
        if (i10 != 2) {
            return i10 != 3 ? "null" : "SUBSCRIPTION";
        }
        return "MUTATION";
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ String m19632W(int i10) {
        switch (i10) {
            case 1:
                return "AD";
            case 2:
                return "ADVERTISING";
            case 3:
                return "ANALYTICS";
            case 4:
                return "CDN";
            case 5:
                return "CONTENT";
            case 6:
                return "CUSTOMER_SUCCESS";
            case 7:
                return "FIRST_PARTY";
            case 8:
                return "HOSTING";
            case 9:
                return "MARKETING";
            case 10:
                return "OTHER";
            case 11:
                return "SOCIAL";
            case 12:
                return sVDIzpC.QElGqIUCWlzhJ;
            case 13:
                return "UTILITY";
            case 14:
                return "VIDEO";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ String m19633X(int i10) {
        if (i10 == 1) {
            return "USER";
        }
        if (i10 != 2) {
            return i10 != 3 ? "null" : "CI_TEST";
        }
        return "SYNTHETICS";
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ String m19634Y(int i10) {
        switch (i10) {
            case 1:
                return "MOBILE";
            case 2:
                return "DESKTOP";
            case 3:
                return "TABLET";
            case 4:
                return "TV";
            case 5:
                return "GAMING_CONSOLE";
            case 6:
                return "BOT";
            case 7:
                return "OTHER";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ String m19635Z(int i10) {
        switch (i10) {
            case 1:
                return "USER_APP_LAUNCH";
            case 2:
                return "INACTIVITY_TIMEOUT";
            case 3:
                return "MAX_DURATION";
            case 4:
                return "BACKGROUND_LAUNCH";
            case 5:
                return "PREWARM";
            case 6:
                return "FROM_NON_INTERACTIVE_SESSION";
            case 7:
                return "EXPLICIT_STOP";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m19636a(int i10) {
        switch (i10) {
            case 1:
                return "android";
            case 2:
                return "ios";
            case 3:
                return "browser";
            case 4:
                return "flutter";
            case 5:
                return "react-native";
            case 6:
                return "roku";
            case 7:
                return "unity";
            case 8:
                return "kotlin-multiplatform";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ String m19637a0(int i10) {
        if (i10 == 1) {
            return "CONNECTED";
        }
        if (i10 != 2) {
            return i10 != 3 ? "null" : vRJidSveZHcTw.MveZIPRSNsZUbbU;
        }
        return "NOT_CONNECTED";
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m19638b(int i10) {
        switch (i10) {
            case 1:
                return "android";
            case 2:
                return "ios";
            case 3:
                return "browser";
            case 4:
                return "flutter";
            case 5:
                return "react-native";
            case 6:
                return "roku";
            case 7:
                return "unity";
            case 8:
                return "kotlin-multiplatform";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ String m19639b0(int i10) {
        switch (i10) {
            case 1:
                return "MOBILE";
            case 2:
                return "DESKTOP";
            case 3:
                return "TABLET";
            case 4:
                return "TV";
            case 5:
                return "GAMING_CONSOLE";
            case 6:
                return "BOT";
            case 7:
                return "OTHER";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m19640c(int i10) {
        if (i10 == 1) {
            return "slow_2g";
        }
        if (i10 == 2) {
            return "2g";
        }
        if (i10 == 3) {
            return "3g";
        }
        if (i10 == 4) {
            return "4g";
        }
        throw null;
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ int m19641c0(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("CONNECTED")) {
            return 1;
        }
        if (str.equals("NOT_CONNECTED")) {
            return 2;
        }
        if (str.equals("MAYBE")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.datadog.android.rum.model.ErrorEvent.Status.".concat(str));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m19642d(int i10) {
        if (i10 == 1) {
            return "user";
        }
        if (i10 == 2) {
            return "synthetics";
        }
        if (i10 == 3) {
            return "ci_test";
        }
        throw null;
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ int m19643d0(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("QUERY")) {
            return 1;
        }
        if (str.equals("MUTATION")) {
            return 2;
        }
        if (str.equals("SUBSCRIPTION")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.datadog.android.rum.model.ResourceEvent.OperationType.".concat(str));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m19644e(int i10) {
        switch (i10) {
            case 1:
                return "network";
            case 2:
                return "source";
            case 3:
                return "console";
            case 4:
                return "logger";
            case 5:
                return "agent";
            case 6:
                return "webview";
            case 7:
                return "custom";
            case 8:
                return "report";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m19645f(int i10) {
        if (i10 == 1) {
            return "handled";
        }
        if (i10 == 2) {
            return "unhandled";
        }
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m19646g(int i10) {
        switch (i10) {
            case 1:
                return "POST";
            case 2:
                return "GET";
            case 3:
                return "HEAD";
            case 4:
                return "PUT";
            case 5:
                return "DELETE";
            case 6:
                return "PATCH";
            case 7:
                return "TRACE";
            case 8:
                return TokenNames.OPTIONS;
            case 9:
                return "CONNECT";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String m19647h(int i10) {
        switch (i10) {
            case 1:
                return "ad";
            case 2:
                return "advertising";
            case 3:
                return "analytics";
            case 4:
                return "cdn";
            case 5:
                return "content";
            case 6:
                return "customer-success";
            case 7:
                return "first party";
            case 8:
                return "hosting";
            case 9:
                return "marketing";
            case 10:
                return "other";
            case 11:
                return "social";
            case 12:
                return "tag-manager";
            case 13:
                return "utility";
            case 14:
                return MediaStreamTrack.VIDEO_TRACK_KIND;
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m19648i(int i10) {
        switch (i10) {
            case 1:
                return "user_app_launch";
            case 2:
                return "inactivity_timeout";
            case 3:
                return "max_duration";
            case 4:
                return "background_launch";
            case 5:
                return "prewarm";
            case 6:
                return "from_non_interactive_session";
            case 7:
                return "explicit_stop";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m19649j(int i10) {
        switch (i10) {
            case 1:
                return "android";
            case 2:
                return "browser";
            case 3:
                return "ios";
            case 4:
                return "react-native";
            case 5:
                return "flutter";
            case 6:
                return "roku";
            case 7:
                return "ndk";
            case 8:
                return "ios+il2cpp";
            case 9:
                return "ndk+il2cpp";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m19650k(int i10) {
        if (i10 == 1) {
            return "connected";
        }
        if (i10 == 2) {
            return "not_connected";
        }
        if (i10 == 3) {
            return "maybe";
        }
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ String m19651l(int i10) {
        switch (i10) {
            case 1:
                return "mobile";
            case 2:
                return "desktop";
            case 3:
                return "tablet";
            case 4:
                return "tv";
            case 5:
                return "gaming_console";
            case 6:
                return "bot";
            case 7:
                return "other";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ String m19652m(int i10) {
        switch (i10) {
            case 1:
                return "custom";
            case 2:
                return "click";
            case 3:
                return "tap";
            case 4:
                return "scroll";
            case 5:
                return "swipe";
            case 6:
                return "application_start";
            case 7:
                return "back";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ String m19653n(int i10) {
        if (i10 == 1) {
            return "slow_2g";
        }
        if (i10 == 2) {
            return "2g";
        }
        if (i10 == 3) {
            return "3g";
        }
        if (i10 == 4) {
            return "4g";
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ String m19654o(int i10) {
        if (i10 == 1) {
            return "user";
        }
        if (i10 == 2) {
            return "synthetics";
        }
        if (i10 == 3) {
            return "ci_test";
        }
        throw null;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m19655p(int i10) {
        switch (i10) {
            case 1:
                return "android";
            case 2:
                return "ios";
            case 3:
                return "browser";
            case 4:
                return "flutter";
            case 5:
                return "react-native";
            case 6:
                return "roku";
            case 7:
                return "unity";
            case 8:
                return "kotlin-multiplatform";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m19656q(int i10) {
        switch (i10) {
            case 1:
                return "user_app_launch";
            case 2:
                return "inactivity_timeout";
            case 3:
                return "max_duration";
            case 4:
                return "background_launch";
            case 5:
                return "prewarm";
            case 6:
                return "from_non_interactive_session";
            case 7:
                return "explicit_stop";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ String m19657r(int i10) {
        if (i10 == 1) {
            return "connected";
        }
        if (i10 == 2) {
            return "not_connected";
        }
        if (i10 == 3) {
            return "maybe";
        }
        throw null;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m19658s(int i10) {
        switch (i10) {
            case 1:
                return "mobile";
            case 2:
                return "desktop";
            case 3:
                return "tablet";
            case 4:
                return "tv";
            case 5:
                return "gaming_console";
            case 6:
                return "bot";
            case 7:
                return "other";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ String m19659t(int i10) {
        if (i10 == 1) {
            return "slow_2g";
        }
        if (i10 == 2) {
            return "2g";
        }
        if (i10 == 3) {
            return "3g";
        }
        if (i10 == 4) {
            return "4g";
        }
        throw null;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ String m19660u(int i10) {
        switch (i10) {
            case 1:
                return "POST";
            case 2:
                return "GET";
            case 3:
                return "HEAD";
            case 4:
                return "PUT";
            case 5:
                return "DELETE";
            case 6:
                return "PATCH";
            case 7:
                return "TRACE";
            case 8:
                return TokenNames.OPTIONS;
            case 9:
                return "CONNECT";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ String m19661v(int i10) {
        if (i10 == 1) {
            return "query";
        }
        if (i10 == 2) {
            return "mutation";
        }
        if (i10 == 3) {
            return "subscription";
        }
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ String m19662w(int i10) {
        switch (i10) {
            case 1:
                return "ad";
            case 2:
                return "advertising";
            case 3:
                return "analytics";
            case 4:
                return "cdn";
            case 5:
                return "content";
            case 6:
                return "customer-success";
            case 7:
                return "first party";
            case 8:
                return "hosting";
            case 9:
                return "marketing";
            case 10:
                return "other";
            case 11:
                return "social";
            case 12:
                return "tag-manager";
            case 13:
                return "utility";
            case 14:
                return MediaStreamTrack.VIDEO_TRACK_KIND;
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ String m19663x(int i10) {
        if (i10 == 1) {
            return "user";
        }
        if (i10 == 2) {
            return "synthetics";
        }
        if (i10 == 3) {
            return "ci_test";
        }
        throw null;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ String m19664y(int i10) {
        switch (i10) {
            case 1:
                return "mobile";
            case 2:
                return "desktop";
            case 3:
                return "tablet";
            case 4:
                return "tv";
            case 5:
                return "gaming_console";
            case 6:
                return "bot";
            case 7:
                return "other";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ String m19665z(int i10) {
        if (i10 == 1) {
            return SfpOlmlMATQ.jCtsoSmmexQ;
        }
        if (i10 == 2) {
            return "2g";
        }
        if (i10 == 3) {
            return "3g";
        }
        if (i10 == 4) {
            return "4g";
        }
        throw null;
    }
}
