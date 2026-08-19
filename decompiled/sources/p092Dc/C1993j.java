package p092Dc;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import be.C11345b;
import kotlin.jvm.internal.AbstractC16544l;
import p101Dl.C2109j;
import p1043ui.C20291a;
import p151Fl.AbstractC2911q;
import p151Fl.C2899e;
import p151Fl.C2908n;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p268Kf.C4668w;
import p336Nc.AbstractC5705a;
import p337Nd.C5710c;
import p364Oh.C6226E;
import p452Sc.C7103a;
import p454Se.C7115i;
import p510Ul.C7720a;
import p523V9.AbstractC8012V5;
import p580Xi.C9517c;
import p582Xk.HXHG.TfazcFv;
import p583Xl.AbstractC9537d;
import p788hf.C14501d;
import p948pi.C18418a;

/* JADX INFO: renamed from: Dc.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C1993j implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5892a;

    /* JADX INFO: renamed from: b */
    public final C4474e f5893b;

    public /* synthetic */ C1993j(C4474e c4474e, int i10, boolean z6) {
        this.f5892a = i10;
        this.f5893b = c4474e;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f5892a) {
            case 0:
                Application context = (Application) this.f5893b.f14617a;
                AbstractC16544l.m18094g(context, "context");
                return AbstractC8012V5.m8334g(context);
            case 1:
                Application context2 = (Application) this.f5893b.f14617a;
                AbstractC16544l.m18094g(context2, "context");
                return new C1991h(context2, 0);
            case 2:
                Application context3 = (Application) this.f5893b.f14617a;
                AbstractC16544l.m18094g(context3, "context");
                String str = AbstractC5705a.f18490a;
                String str2 = Build.DEVICE;
                int i10 = Build.VERSION.SDK_INT;
                String str3 = context3.getPackageName() + "://auth0.openai.com/android/" + context3.getPackageName() + "/callback";
                AbstractC16544l.m18091d(str2);
                return new C6226E(i10, str, str2, str3);
            case 3:
                return new C2109j((Context) this.f5893b.f14617a);
            case 4:
                Context appContext = (Context) this.f5893b.f14617a;
                AbstractC16544l.m18094g(appContext, "appContext");
                if (!AbstractC2911q.f8730a) {
                    AbstractC9537d.m10030a(new C2908n(appContext));
                }
                return C2899e.f8715a;
            case 5:
                Context context4 = (Context) this.f5893b.f14617a;
                AbstractC16544l.m18094g(context4, "context");
                Object systemService = context4.getSystemService("connectivity");
                AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                return (ConnectivityManager) systemService;
            case 6:
                Context context5 = (Context) this.f5893b.f14617a;
                AbstractC16544l.m18094g(context5, "context");
                return new C7720a(context5);
            case 7:
                Object obj = this.f5893b.f14617a;
                AbstractC16544l.m18093f(obj, "get(...)");
                return new C4668w((Application) obj);
            case 8:
                return new C7103a((Application) this.f5893b.f14617a);
            case 9:
                Object obj2 = this.f5893b.f14617a;
                AbstractC16544l.m18093f(obj2, "get(...)");
                return new C7115i((Application) obj2);
            case 10:
                Object obj3 = this.f5893b.f14617a;
                AbstractC16544l.m18093f(obj3, "get(...)");
                return new C11345b((C5710c) obj3);
            case 11:
                Object obj4 = this.f5893b.f14617a;
                AbstractC16544l.m18093f(obj4, "get(...)");
                return new C14501d((Application) obj4);
            case 12:
                Object obj5 = this.f5893b.f14617a;
                AbstractC16544l.m18093f(obj5, "get(...)");
                return new C20291a((Application) obj5);
            default:
                Object obj6 = this.f5893b.f14617a;
                AbstractC16544l.m18093f(obj6, "get(...)");
                return new C9517c((C18418a) obj6, 2);
        }
    }

    public /* synthetic */ C1993j(Object obj, C4474e c4474e, int i10) {
        this.f5892a = i10;
        this.f5893b = c4474e;
    }

    public C1993j(C4474e context, int i10) {
        this.f5892a = i10;
        switch (i10) {
            case 9:
                AbstractC16544l.m18094g(context, "context");
                this.f5893b = context;
                break;
            case 10:
            case 12:
            default:
                AbstractC16544l.m18094g(context, TfazcFv.wpVRLCLAP);
                this.f5893b = context;
                break;
            case 11:
                AbstractC16544l.m18094g(context, "context");
                this.f5893b = context;
                break;
            case 13:
                AbstractC16544l.m18094g(context, "accountSession");
                this.f5893b = context;
                break;
        }
    }
}
