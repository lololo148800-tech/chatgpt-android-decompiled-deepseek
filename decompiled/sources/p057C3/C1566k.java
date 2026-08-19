package p057C3;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0042V0;
import p013Ab.C0420b;
import p1016t3.C19757G;
import p1031u3.InterfaceC20101d;
import p1031u3.InterfaceC20102e;
import p109E3.C2271L;
import p109E3.C2274O;
import p115E9.C2360b;
import p158G3.C2989h;
import p158G3.InterfaceC2984c;
import p206I3.C3613b;
import p257K3.C4537e;
import p329N3.C5622l;
import p352O3.C6113a;

/* JADX INFO: renamed from: C3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1566k implements InterfaceC20102e {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4380Y = 0;

    /* JADX INFO: renamed from: Z */
    public final Context f4381Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f4382o0;

    public C1566k(Context context, C0420b c0420b) {
        AbstractC16544l.m18094g(context, "context");
        this.f4381Z = context;
        this.f4382o0 = new C2274O(c0420b);
    }

    @Override // p1031u3.InterfaceC20102e
    /* JADX INFO: renamed from: a */
    public C19757G mo2433a(C19757G parameters) {
        AbstractC16544l.m18094g(parameters, "parameters");
        return parameters;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1554d[] m2434b(Handler handler, SurfaceHolderCallbackC1523A surfaceHolderCallbackC1523A, SurfaceHolderCallbackC1523A surfaceHolderCallbackC1523A2, SurfaceHolderCallbackC1523A surfaceHolderCallbackC1523A3, SurfaceHolderCallbackC1523A surfaceHolderCallbackC1523A4) {
        switch (this.f4380Y) {
            case 0:
                ArrayList arrayList = new ArrayList();
                C2360b c2360b = (C2360b) this.f4382o0;
                Application application = (Application) this.f4381Z;
                arrayList.add(new C5622l(application, c2360b, handler, surfaceHolderCallbackC1523A));
                arrayList.add(new C2271L(application, c2360b, handler, surfaceHolderCallbackC1523A2, new C0042V0(application).m212e()));
                arrayList.add(new C4537e(surfaceHolderCallbackC1523A3, handler.getLooper()));
                arrayList.add(new C3613b(surfaceHolderCallbackC1523A4, handler.getLooper()));
                arrayList.add(new C6113a());
                arrayList.add(new C2989h(InterfaceC2984c.f8965c));
                return (AbstractC1554d[]) arrayList.toArray(new AbstractC1554d[0]);
            default:
                Context context = this.f4381Z;
                C0042V0 c0042v0 = new C0042V0(context);
                c0042v0.f207p0 = this;
                return new C2271L[]{new C2271L(context, new C2360b(context), handler, surfaceHolderCallbackC1523A2, c0042v0.m212e())};
        }
    }

    @Override // p1031u3.InterfaceC20102e
    /* JADX INFO: renamed from: n */
    public long mo2436n() {
        return 0L;
    }

    @Override // p1031u3.InterfaceC20102e
    /* JADX INFO: renamed from: q */
    public InterfaceC20101d[] mo2438q() {
        return new C2274O[]{(C2274O) this.f4382o0};
    }

    public C1566k(Application application) {
        this.f4381Z = application;
        this.f4382o0 = new C2360b(application);
    }

    @Override // p1031u3.InterfaceC20102e
    /* JADX INFO: renamed from: g */
    public long mo2435g(long j10) {
        return j10;
    }

    @Override // p1031u3.InterfaceC20102e
    /* JADX INFO: renamed from: o */
    public boolean mo2437o(boolean z6) {
        return z6;
    }
}
