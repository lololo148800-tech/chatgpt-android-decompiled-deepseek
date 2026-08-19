package p001A;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p057C3.C1526D;
import p057C3.C1550b;
import p057C3.C1552c;
import p057C3.SurfaceHolderCallbackC1523A;
import p1016t3.C19778e;
import p1071w0.AbstractC20734X;
import p228J.AbstractC3810L;
import p228J.AbstractC3842j;
import p955q2.AbstractC18610b;

/* JADX INFO: renamed from: A.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0080p implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f323Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f324Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f325o0;

    public /* synthetic */ RunnableC0080p(Object obj, int i10, int i11) {
        this.f323Y = i11;
        this.f325o0 = obj;
        this.f324Z = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f323Y) {
            case 0:
                ((AbstractC3842j) this.f325o0).mo7a(this.f324Z);
                return;
            case 1:
                LinkedHashSet<C0033Q0> linkedHashSet = (LinkedHashSet) this.f325o0;
                int i10 = this.f324Z;
                for (C0033Q0 c0033q0 : linkedHashSet) {
                    if (i10 == 5) {
                        synchronized (c0033q0.f176p) {
                            try {
                                if (c0033q0.m178n() && c0033q0.f177q != null) {
                                    c0033q0.m176l("Close DeferrableSurfaces for CameraDevice error.");
                                    Iterator it = c0033q0.f177q.iterator();
                                    while (it.hasNext()) {
                                        ((AbstractC3810L) it.next()).mo4507a();
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        c0033q0.getClass();
                    }
                }
                return;
            case 2:
                C1552c c1552c = ((C1550b) this.f325o0).f4274b;
                c1552c.getClass();
                int i11 = this.f324Z;
                if (i11 == -3 || i11 == -2) {
                    if (i11 != -2) {
                        C19778e c19778e = c1552c.f4278d;
                        if (!(c19778e != null && c19778e.f62666a == 1)) {
                            c1552c.m2383b(4);
                            return;
                        }
                    }
                    SurfaceHolderCallbackC1523A surfaceHolderCallbackC1523A = c1552c.f4277c;
                    if (surfaceHolderCallbackC1523A != null) {
                        C1526D c1526d = surfaceHolderCallbackC1523A.f4046Y;
                        c1526d.m2253n0(0, 1, c1526d.m2241a0());
                    }
                    c1552c.m2383b(3);
                    return;
                }
                if (i11 == -1) {
                    SurfaceHolderCallbackC1523A surfaceHolderCallbackC1523A2 = c1552c.f4277c;
                    if (surfaceHolderCallbackC1523A2 != null) {
                        C1526D c1526d2 = surfaceHolderCallbackC1523A2.f4046Y;
                        c1526d2.m2253n0(-1, 2, c1526d2.m2241a0());
                    }
                    c1552c.m2382a();
                    c1552c.m2383b(1);
                    return;
                }
                if (i11 != 1) {
                    AbstractC20734X.m21224A(i11, "Unknown focus change type: ", "AudioFocusManager");
                    return;
                }
                c1552c.m2383b(2);
                SurfaceHolderCallbackC1523A surfaceHolderCallbackC1523A3 = c1552c.f4277c;
                if (surfaceHolderCallbackC1523A3 != null) {
                    C1526D c1526d3 = surfaceHolderCallbackC1523A3.f4046Y;
                    c1526d3.m2253n0(1, 1, c1526d3.m2241a0());
                    return;
                }
                return;
            case 3:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f325o0;
                View view = (View) sideSheetBehavior.f36691o.get();
                if (view != null) {
                    sideSheetBehavior.m13650t(view, this.f324Z, false);
                    return;
                }
                return;
            default:
                ((AbstractC18610b) this.f325o0).mo2477i(this.f324Z);
                return;
        }
    }
}
