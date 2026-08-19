package p1075w5;

import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.InterfaceC11111t;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0564B0;
import p025An.C0613g0;
import p1121y5.C21388a;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;

/* JADX INFO: renamed from: w5.t */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC20842t implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: Y */
    public final ImageView f66270Y;

    /* JADX INFO: renamed from: Z */
    public C20833k f66271Z;

    /* JADX INFO: renamed from: o0 */
    public C0564B0 f66272o0;

    /* JADX INFO: renamed from: p0 */
    public C20840r f66273p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f66274q0;

    public ViewOnAttachStateChangeListenerC20842t(ImageView imageView) {
        this.f66270Y = imageView;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m21440a() {
        C0564B0 c0564b0 = this.f66272o0;
        if (c0564b0 != null) {
            c0564b0.mo1275e(null);
        }
        C0613g0 c0613g0 = C0613g0.f1858Y;
        C3516e c3516e = AbstractC0593T.f1824a;
        this.f66272o0 = AbstractC0575H.m1156D(c0613g0, AbstractC2935m.f8797a.f3819q0, null, new C20841s(this, null), 2);
        this.f66271Z = null;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized C20833k m21441b() {
        C20833k c20833k = this.f66271Z;
        if (c20833k != null && AbstractC16544l.m18089b(Looper.myLooper(), Looper.getMainLooper()) && this.f66274q0) {
            this.f66274q0 = false;
            return c20833k;
        }
        C0564B0 c0564b0 = this.f66272o0;
        if (c0564b0 != null) {
            c0564b0.mo1275e(null);
        }
        this.f66272o0 = null;
        C20833k c20833k2 = new C20833k(this.f66270Y);
        this.f66271Z = c20833k2;
        return c20833k2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C20840r c20840r = this.f66273p0;
        if (c20840r == null) {
            return;
        }
        this.f66274q0 = true;
        c20840r.f66264Y.m18564b(c20840r.f66265Z);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C20840r c20840r = this.f66273p0;
        if (c20840r != null) {
            c20840r.f66268q0.mo1275e(null);
            C21388a c21388a = c20840r.f66266o0;
            boolean z6 = c21388a instanceof InterfaceC11111t;
            AbstractC11105n abstractC11105n = c20840r.f66267p0;
            if (z6) {
                abstractC11105n.mo7808c(c21388a);
            }
            abstractC11105n.mo7808c(c20840r);
        }
    }
}
