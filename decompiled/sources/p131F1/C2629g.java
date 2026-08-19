package p131F1;

import android.os.CancellationSignal;
import p025An.C0564B0;
import p080D0.C1837w0;
import p1071w0.C20750g0;
import p1116y0.C21358g;
import p1139z0.C21582E0;
import p204I1.C3581L;

/* JADX INFO: renamed from: F1.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2629g implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8140a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8141b;

    public /* synthetic */ C2629g(Object obj, int i10) {
        this.f8140a = i10;
        this.f8141b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f8140a) {
            case 0:
                ((C0564B0) this.f8141b).mo1275e(null);
                break;
            case 1:
                C1837w0 c1837w0 = (C1837w0) this.f8141b;
                if (c1837w0 != null) {
                    C20750g0 c20750g0 = c1837w0.f5308d;
                    if (c20750g0 != null) {
                        c20750g0.m21295e(C3581L.f10906b);
                    }
                    C20750g0 c20750g1 = c1837w0.f5308d;
                    if (c20750g1 != null) {
                        c20750g1.m21296f(C3581L.f10906b);
                        break;
                    }
                }
                break;
            default:
                C21358g c21358g = ((C21582E0) this.f8141b).f68337a;
                c21358g.f67827b.f68325b.m20988c();
                c21358g.f67827b.f68328e = null;
                C21358g.m21749a(c21358g, true, 1);
                break;
        }
    }
}
