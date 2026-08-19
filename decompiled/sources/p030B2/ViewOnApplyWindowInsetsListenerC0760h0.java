package p030B2;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;
import p658b5.C11248s;
import p817j$.util.Objects;
import p979r2.C18862c;

/* JADX INFO: renamed from: B2.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0760h0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public final AbstractC0754e0 f2151a;

    /* JADX INFO: renamed from: b */
    public C0794y0 f2152b;

    public ViewOnApplyWindowInsetsListenerC0760h0(View view, AbstractC0754e0 abstractC0754e0) {
        C0794y0 c0794y0Mo1714b;
        this.f2151a = abstractC0754e0;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        C0794y0 c0794y0M1557a = AbstractC0731L.m1557a(view);
        if (c0794y0M1557a != null) {
            int i10 = Build.VERSION.SDK_INT;
            c0794y0Mo1714b = (i10 >= 30 ? new C0776p0(c0794y0M1557a) : i10 >= 29 ? new C0774o0(c0794y0M1557a) : new C0772n0(c0794y0M1557a)).mo1714b();
        } else {
            c0794y0Mo1714b = null;
        }
        this.f2152b = c0794y0Mo1714b;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0790w0 c0790w0;
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f2152b = C0794y0.m1812g(view, windowInsets);
            return C0762i0.m1690i(view, windowInsets);
        }
        C0794y0 c0794y0M1812g = C0794y0.m1812g(view, windowInsets);
        if (this.f2152b == null) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            this.f2152b = AbstractC0731L.m1557a(view);
        }
        if (this.f2152b == null) {
            this.f2152b = c0794y0M1812g;
            return C0762i0.m1690i(view, windowInsets);
        }
        AbstractC0754e0 abstractC0754e0M1691j = C0762i0.m1691j(view);
        if (abstractC0754e0M1691j != null && Objects.equals((WindowInsets) abstractC0754e0M1691j.f2131Z, windowInsets)) {
            return C0762i0.m1690i(view, windowInsets);
        }
        C0794y0 c0794y0 = this.f2152b;
        int i10 = 1;
        int i11 = 0;
        while (true) {
            c0790w0 = c0794y0M1812g.f2209a;
            if (i10 > 256) {
                break;
            }
            if (!c0790w0.mo1754f(i10).equals(c0794y0.f2209a.mo1754f(i10))) {
                i11 |= i10;
            }
            i10 <<= 1;
        }
        if (i11 == 0) {
            return C0762i0.m1690i(view, windowInsets);
        }
        C0794y0 c0794y1 = this.f2152b;
        if ((i11 & 8) != 0) {
            interpolator = c0790w0.mo1754f(8).f60089d > c0794y1.f2209a.mo1754f(8).f60089d ? C0762i0.f2153e : C0762i0.f2154f;
        } else {
            interpolator = C0762i0.f2155g;
        }
        C0770m0 c0770m0 = new C0770m0(i11, interpolator, 160L);
        c0770m0.f2166a.mo1705d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c0770m0.f2166a.mo1702a());
        C18862c c18862cMo1754f = c0790w0.mo1754f(i11);
        C18862c c18862cMo1754f2 = c0794y1.f2209a.mo1754f(i11);
        int iMin = Math.min(c18862cMo1754f.f60086a, c18862cMo1754f2.f60086a);
        int i12 = c18862cMo1754f.f60087b;
        int i13 = c18862cMo1754f2.f60087b;
        int iMin2 = Math.min(i12, i13);
        int i14 = c18862cMo1754f.f60088c;
        int i15 = c18862cMo1754f2.f60088c;
        int iMin3 = Math.min(i14, i15);
        int i16 = c18862cMo1754f.f60089d;
        int i17 = i11;
        int i18 = c18862cMo1754f2.f60089d;
        C11248s c11248s = new C11248s(C18862c.m20171b(iMin, iMin2, iMin3, Math.min(i16, i18)), C18862c.m20171b(Math.max(c18862cMo1754f.f60086a, c18862cMo1754f2.f60086a), Math.max(i12, i13), Math.max(i14, i15), Math.max(i16, i18)), false, 2);
        C0762i0.m1687f(view, c0770m0, windowInsets, false);
        duration.addUpdateListener(new C0756f0(c0770m0, c0794y0M1812g, c0794y1, i17, view));
        duration.addListener(new C0748b0(c0770m0, view, 1));
        ViewTreeObserverOnPreDrawListenerC0787v.m1779a(view, new RunnableC0758g0(view, c0770m0, c11248s, duration, 0));
        this.f2152b = c0794y0M1812g;
        return C0762i0.m1690i(view, windowInsets);
    }
}
