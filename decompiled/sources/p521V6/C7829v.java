package p521V6;

import android.content.Intent;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.net.Uri;
import android.util.Log;
import com.auth0.android.request.internal.C11845d;
import fo.C13711h;
import io.sentry.android.core.AbstractC15256t;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17349p;
import p001A.C0017I0;
import p117Eb.C2392v;
import p140Fa.C2685e;
import p174Gk.uSfJ.HpucjswO;
import p446S6.C7022a;
import p446S6.C7023b;
import p446S6.C7024c;
import p477Tb.C7296c;
import p541W6.C8432b;
import p594Y9.AbstractC9750J2;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p712dp.C13187c;
import p826j6.C16137F;
import p905nd.C17591s;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: V6.v */
/* JADX INFO: loaded from: classes.dex */
public final class C7829v extends AbstractC9750J2 {

    /* JADX INFO: renamed from: a */
    public final C7803F f24718a;

    /* JADX INFO: renamed from: b */
    public final boolean f24719b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f24720c;

    /* JADX INFO: renamed from: d */
    public final HashMap f24721d;

    /* JADX INFO: renamed from: e */
    public final C7817j f24722e;

    /* JADX INFO: renamed from: f */
    public final C7022a f24723f;

    /* JADX INFO: renamed from: g */
    public C2392v f24724g;

    /* JADX INFO: renamed from: h */
    public String f24725h;

    public C7829v(C17591s account, C7803F c7803f, LinkedHashMap parameters, C7817j ctOptions, boolean z6) {
        AbstractC16544l.m18094g(account, "account");
        AbstractC16544l.m18094g(parameters, "parameters");
        AbstractC16544l.m18094g(ctOptions, "ctOptions");
        this.f24718a = c7803f;
        this.f24719b = z6;
        this.f24721d = new HashMap();
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(parameters);
        this.f24720c = linkedHashMapM19256r;
        linkedHashMapM19256r.put("response_type", "code");
        this.f24723f = new C7022a(account);
        this.f24722e = ctOptions;
    }

    @Override // p594Y9.AbstractC9750J2
    /* JADX INFO: renamed from: a */
    public final void mo8085a(C7023b c7023b) {
        this.f24718a.mo7759f(c7023b);
    }

    @Override // p594Y9.AbstractC9750J2
    /* JADX INFO: renamed from: c */
    public final boolean mo8086c(C16137F c16137f) {
        Map map;
        int i10;
        if (!c16137f.m17691f() && c16137f.f50063Z != -1) {
            Log.d(TokenNames.f32011F, "Result is invalid: Either the received Intent is null or the Request Code doesn't match the expected one.");
            AbstractC15256t.m16482t("v", "The Authorize Result is invalid.");
            return false;
        }
        boolean zM17691f = c16137f.m17691f();
        C7803F c7803f = this.f24718a;
        if (zM17691f) {
            c7803f.mo7759f(new C7023b("a0.authentication_canceled", "The user closed the browser app and the authentication was canceled."));
            return true;
        }
        Intent intent = (Intent) c16137f.f50064o0;
        Uri data = intent == null ? null : intent.getData();
        if (data == null) {
            map = Collections.emptyMap();
        } else {
            String query = data.getQuery() != null ? data.getQuery() : data.getFragment();
            if (query == null) {
                map = new HashMap();
            } else {
                String[] strArrSplit = query.length() > 0 ? query.split(Separators.AND) : new String[0];
                HashMap map2 = new HashMap(strArrSplit.length);
                for (String str : strArrSplit) {
                    int iIndexOf = str.indexOf(Separators.EQUALS);
                    String strSubstring = iIndexOf > 0 ? str.substring(0, iIndexOf) : str;
                    String strSubstring2 = (iIndexOf <= 0 || str.length() <= (i10 = iIndexOf + 1)) ? null : str.substring(i10);
                    if (strSubstring2 != null) {
                        map2.put(strSubstring, strSubstring2);
                    }
                }
                map = map2;
            }
        }
        AbstractC16544l.m18093f(map, "getValuesFromUri(result.intentData)");
        if (map.isEmpty()) {
            AbstractC15256t.m16482t("v", "The response didn't contain any of these values: code, state");
            return false;
        }
        Log.d("v", "The parsed CallbackURI contains the following parameters: " + map.keySet());
        try {
            m8087d((String) map.get("error"), (String) map.get("error_description"));
            Object obj = this.f24720c.get("state");
            AbstractC16544l.m18091d(obj);
            String str2 = (String) obj;
            String str3 = (String) map.get("state");
            if (!str2.equals(str3)) {
                AbstractC15256t.m16465c("v", String.format("Received state doesn't match. Received %s but expected %s", Arrays.copyOf(new Object[]{str3, str2}, 2)));
                throw new C7023b("access_denied", "The received state is invalid. Try again.");
            }
            C2392v c2392v = this.f24724g;
            AbstractC16544l.m18091d(c2392v);
            String authorizationCode = (String) map.get("code");
            C7296c c7296c = new C7296c(this, 27);
            C7022a c7022a = (C7022a) c2392v.f7436Z;
            c7022a.getClass();
            AbstractC16544l.m18094g(authorizationCode, "authorizationCode");
            String codeVerifier = (String) c2392v.f7437o0;
            AbstractC16544l.m18094g(codeVerifier, "codeVerifier");
            String str4 = HpucjswO.QoVozeeHHENpTsh;
            String str5 = (String) c2392v.f7438p0;
            AbstractC16544l.m18094g(str5, str4);
            C7024c c7024cM3661k = C2685e.m3661k();
            C17591s c17591s = c7022a.f22451a;
            c17591s.getClass();
            c7024cM3661k.m7422c("client_id", "dBPYPHX8xGTuepNhXZJCycwsystDsw7Y");
            c7024cM3661k.m7422c("grant_type", "authorization_code");
            c7024cM3661k.m7422c("code", authorizationCode);
            c7024cM3661k.m7422c("redirect_uri", str5);
            c7024cM3661k.m7422c("code_verifier", codeVerifier);
            Map mapM19254p = AbstractC17659D.m19254p((LinkedHashMap) c7024cM3661k.f22458a);
            String strValueOf = String.valueOf(c17591s.f56322a);
            C13187c c13187c = new C13187c(1);
            c13187c.m14844f(null, strValueOf);
            C13187c c13187cM19025f = c13187c.m14841c().m19025f();
            c13187cM19025f.m14839a("oauth");
            c13187cM19025f.m14839a("token");
            C17349p c17349pM14841c = c13187cM19025f.m14841c();
            C11845d c11845d = new C11845d(c7022a.f22453c);
            String str6 = c17349pM14841c.f55294i;
            C8432b c8432b = C8432b.f26256d;
            C13711h c13711h = c7022a.f22452b;
            C0017I0 c0017i0M15190M = c13711h.m15190M(c8432b, str6, c11845d, (C7024c) c13711h.f43261p0);
            c0017i0M15190M.m71e(mapM19254p);
            for (Map.Entry entry : ((HashMap) c2392v.f7440r0).entrySet()) {
                c0017i0M15190M.m69c((String) entry.getKey(), (String) entry.getValue());
            }
            c0017i0M15190M.m65D(c7296c);
            return true;
        } catch (C7023b e10) {
            c7803f.mo7759f(e10);
            return true;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m8087d(String str, String str2) {
        if (str == null) {
            return;
        }
        AbstractC15256t.m16465c("v", "Error, access denied. Check that the required Permissions are granted and that the Application has this Connection configured in Auth0 Dashboard.");
        if ("access_denied".equalsIgnoreCase(str)) {
            if (str2 == null) {
                str2 = MMVKXkcLpuHFDi.KCrzFLYbE;
            }
            throw new C7023b("access_denied", str2);
        }
        if ("unauthorized".equalsIgnoreCase(str)) {
            if (str2 == null) {
                str2 = "An unexpected error occurred.";
            }
            throw new C7023b("unauthorized", str2);
        }
        if ("login_required".equals(str)) {
            if (str2 == null) {
                str2 = "An unexpected error occurred.";
            }
            throw new C7023b(str, str2);
        }
        if (str2 == null) {
            str2 = "An unexpected error occurred.";
        }
        throw new C7023b(str, str2);
    }
}
