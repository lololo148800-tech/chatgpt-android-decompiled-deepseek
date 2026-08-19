package p521V6;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.auth0.android.provider.AuthenticationActivity;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.C0624m;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p117Eb.C2392v;
import p446S6.C7022a;
import p446S6.C7023b;
import p523V9.AbstractC7861C4;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9903i0;
import p594Y9.AbstractC9909j0;
import p905nd.C17591s;
import p909nm.AbstractC17659D;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: V6.G */
/* JADX INFO: loaded from: classes.dex */
public final class C7804G extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f24686Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7805H f24687Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Context f24688o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7804G(C7805H c7805h, Context context, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f24687Z = c7805h;
        this.f24688o0 = context;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C7804G(this.f24687Z, this.f24688o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7804G) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f24686Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C7805H c7805h = this.f24687Z;
            Context context = this.f24688o0;
            this.f24686Y = 1;
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(this));
            c0624m.m1262r();
            C7803F c7803f = new C7803F(c0624m);
            c7805h.getClass();
            AbstractC16544l.m18094g(context, "context");
            AbstractC7807J.f24700b = null;
            if (((C7817j) c7805h.f24695s0).m8083a(context.getPackageManager()) != null) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) c7805h.f24691o0;
                C7817j c7817j = (C7817j) c7805h.f24695s0;
                boolean z6 = c7805h.f24689Y;
                C17591s c17591s = (C17591s) c7805h.f24690Z;
                C7829v c7829v = new C7829v(c17591s, c7803f, linkedHashMap, c7817j, z6);
                LinkedHashMap headers = (LinkedHashMap) c7805h.f24692p0;
                AbstractC16544l.m18094g(headers, "headers");
                HashMap map = c7829v.f24721d;
                map.putAll(headers);
                c7829v.f24724g = null;
                boolean zIsEmpty = TextUtils.isEmpty(null);
                C7022a c7022a = c7829v.f24723f;
                c7829v.f24725h = zIsEmpty ? String.valueOf(c7022a.f22451a.f56322a) : null;
                AbstractC7807J.f24700b = c7829v;
                if (((String) c7805h.f24694r0) == null) {
                    c7805h.f24694r0 = AbstractC9909j0.m10569b((String) c7805h.f24693q0, context.getApplicationContext().getPackageName(), String.valueOf(((C17591s) c7805h.f24690Z).f56322a));
                }
                String str = (String) c7805h.f24694r0;
                AbstractC16544l.m18091d(str);
                LinkedHashMap parameters = c7829v.f24720c;
                AbstractC16544l.m18094g(parameters, "parameters");
                parameters.put("scope", parameters.containsKey("scope") ? AbstractC7861C4.m8135c((String) AbstractC17659D.m19243e(parameters, "scope")) : "openid profile email");
                if (c7829v.f24724g == null) {
                    c7829v.f24724g = new C2392v(c7022a, str, map);
                }
                C2392v c2392v = c7829v.f24724g;
                AbstractC16544l.m18091d(c2392v);
                String codeChallenge = (String) c2392v.f7439q0;
                AbstractC16544l.m18093f(codeChallenge, "codeChallenge");
                parameters.put("code_challenge", codeChallenge);
                parameters.put("code_challenge_method", "S256");
                Log.v("v", "Using PKCE authentication flow");
                parameters.put("auth0Client", (String) c17591s.f56323b.f46725Z);
                parameters.put("client_id", "dBPYPHX8xGTuepNhXZJCycwsystDsw7Y");
                parameters.put("redirect_uri", str);
                String strEncodeToString = (String) parameters.get("state");
                if (strEncodeToString == null) {
                    byte[] bArr = new byte[32];
                    new SecureRandom().nextBytes(bArr);
                    strEncodeToString = Base64.encodeToString(bArr, 11);
                    AbstractC16544l.m18093f(strEncodeToString, "encodeToString(\n        ….NO_PADDING\n            )");
                }
                String strEncodeToString2 = (String) parameters.get("nonce");
                if (strEncodeToString2 == null) {
                    byte[] bArr2 = new byte[32];
                    new SecureRandom().nextBytes(bArr2);
                    strEncodeToString2 = Base64.encodeToString(bArr2, 11);
                    AbstractC16544l.m18093f(strEncodeToString2, "encodeToString(\n        ….NO_PADDING\n            )");
                }
                parameters.put("state", strEncodeToString);
                parameters.put("nonce", strEncodeToString2);
                Uri.Builder builderBuildUpon = Uri.parse("https://auth.openai.com/authorize").buildUpon();
                for (Map.Entry entry : parameters.entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri uri = builderBuildUpon.build();
                Log.d("v", "Using the following Authorize URI: " + uri);
                AbstractC16544l.m18093f(uri, "uri");
                int i11 = AuthenticationActivity.f35963o0;
                AbstractC9903i0.m10566a(context, uri, c7829v.f24719b, c7829v.f24722e);
            } else {
                c7803f.mo7759f(new C7023b("a0.browser_not_available", "No compatible Browser application is installed."));
            }
            obj = c0624m.m1261q();
            EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
