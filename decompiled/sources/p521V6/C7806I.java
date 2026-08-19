package p521V6;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.auth0.android.provider.AuthenticationActivity;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mo.C17349p;
import p025An.C0624m;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p117Eb.C2391u;
import p446S6.C7023b;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9903i0;
import p594Y9.AbstractC9909j0;
import p712dp.C13187c;
import p720e6.C13287b;
import p905nd.C17591s;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: V6.I */
/* JADX INFO: loaded from: classes.dex */
public final class C7806I extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f24696Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2391u f24697Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Context f24698o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7806I(C2391u c2391u, Context context, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f24697Z = c2391u;
        this.f24698o0 = context;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C7806I(this.f24697Z, this.f24698o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7806I) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f24696Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2391u c2391u = this.f24697Z;
            Context context = this.f24698o0;
            this.f24696Y = 1;
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(this));
            c0624m.m1262r();
            C13287b c13287b = new C13287b(c0624m, 27);
            c2391u.getClass();
            AbstractC16544l.m18094g(context, "context");
            AbstractC7807J.f24700b = null;
            if (((C7817j) c2391u.f7432q0).m8083a(context.getPackageManager()) != null) {
                String str = (String) c2391u.f7431p0;
                C17591s c17591s = (C17591s) c2391u.f7430o0;
                if (str == null) {
                    c2391u.f7431p0 = AbstractC9909j0.m10569b((String) c2391u.f7429Z, context.getApplicationContext().getPackageName(), String.valueOf(c17591s.f56322a));
                }
                String str2 = (String) c2391u.f7431p0;
                AbstractC16544l.m18091d(str2);
                C7826s c7826s = new C7826s(c17591s, c13287b, str2, (C7817j) c2391u.f7432q0);
                AbstractC7807J.f24700b = c7826s;
                HashMap map = c7826s.f24716b;
                map.put("auth0Client", (String) c17591s.f56323b.f46725Z);
                map.put("client_id", "dBPYPHX8xGTuepNhXZJCycwsystDsw7Y");
                C17349p c17349p = c17591s.f56322a;
                AbstractC16544l.m18091d(c17349p);
                C13187c c13187cM19025f = c17349p.m19025f();
                c13187cM19025f.m14845g(0, 2, "v2", false, true);
                c13187cM19025f.m14845g(0, 6, "logout", false, true);
                Uri.Builder builderBuildUpon = Uri.parse(c13187cM19025f.m14841c().f55294i).buildUpon();
                for (Map.Entry entry : map.entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri uri = builderBuildUpon.build();
                Log.d("s", "Using the following Logout URI: " + uri);
                AbstractC16544l.m18093f(uri, "uri");
                int i11 = AuthenticationActivity.f35963o0;
                AbstractC9903i0.m10566a(context, uri, false, c7826s.f24717c);
            } else {
                c13287b.mo7759f(new C7023b("a0.browser_not_available", "No compatible Browser application is installed."));
            }
            Object objM1261q = c0624m.m1261q();
            EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
            if (objM1261q == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
