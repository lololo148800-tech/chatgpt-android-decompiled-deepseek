package androidx.recyclerview.widget;

import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import p057C3.C1529G;
import p084D4.AbstractC1888L;
import p084D4.AbstractC1900Y;
import p084D4.AbstractC1906c;
import p084D4.AbstractC1933p0;
import p084D4.C1878B;
import p084D4.C1883G;
import p084D4.C1884H;
import p084D4.C1885I;
import p084D4.C1886J;
import p084D4.C1899X;
import p084D4.C1901Z;
import p084D4.C1911e0;
import p084D4.C1925l0;
import p084D4.InterfaceC1923k0;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC1900Y implements InterfaceC1923k0 {

    /* JADX INFO: renamed from: A */
    public final C1529G f33565A;

    /* JADX INFO: renamed from: B */
    public final C1883G f33566B;

    /* JADX INFO: renamed from: C */
    public final int f33567C;

    /* JADX INFO: renamed from: D */
    public final int[] f33568D;

    /* JADX INFO: renamed from: p */
    public int f33569p;

    /* JADX INFO: renamed from: q */
    public C1884H f33570q;

    /* JADX INFO: renamed from: r */
    public AbstractC1888L f33571r;

    /* JADX INFO: renamed from: s */
    public boolean f33572s;

    /* JADX INFO: renamed from: t */
    public final boolean f33573t;

    /* JADX INFO: renamed from: u */
    public boolean f33574u;

    /* JADX INFO: renamed from: v */
    public boolean f33575v;

    /* JADX INFO: renamed from: w */
    public final boolean f33576w;

    /* JADX INFO: renamed from: x */
    public int f33577x;

    /* JADX INFO: renamed from: y */
    public int f33578y;

    /* JADX INFO: renamed from: z */
    public C1885I f33579z;

    public LinearLayoutManager(int i10) {
        this.f33569p = 1;
        this.f33573t = false;
        this.f33574u = false;
        this.f33575v = false;
        this.f33576w = true;
        this.f33577x = -1;
        this.f33578y = Integer.MIN_VALUE;
        this.f33579z = null;
        this.f33565A = new C1529G();
        this.f33566B = new C1883G();
        this.f33567C = 2;
        this.f33568D = new int[2];
        m12238Y0(i10);
        mo2948c(null);
        if (this.f33573t) {
            this.f33573t = false;
            m2964k0();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void mo12204A0(C1925l0 c1925l0, C1884H c1884h, C1878B c1878b) {
        int i10 = c1884h.f5488d;
        if (i10 < 0 || i10 >= c1925l0.m3082b()) {
            return;
        }
        c1878b.m2861b(i10, Math.max(0, c1884h.f5491g));
    }

    /* JADX INFO: renamed from: B0 */
    public final int m12218B0(C1925l0 c1925l0) {
        if (m2985v() == 0) {
            return 0;
        }
        m12222F0();
        AbstractC1888L abstractC1888L = this.f33571r;
        boolean z6 = !this.f33576w;
        return AbstractC1906c.m3017d(c1925l0, abstractC1888L, m12225I0(z6), m12224H0(z6), this, this.f33576w);
    }

    /* JADX INFO: renamed from: C0 */
    public final int m12219C0(C1925l0 c1925l0) {
        if (m2985v() == 0) {
            return 0;
        }
        m12222F0();
        AbstractC1888L abstractC1888L = this.f33571r;
        boolean z6 = !this.f33576w;
        return AbstractC1906c.m3018e(c1925l0, abstractC1888L, m12225I0(z6), m12224H0(z6), this, this.f33576w, this.f33574u);
    }

    /* JADX INFO: renamed from: D0 */
    public final int m12220D0(C1925l0 c1925l0) {
        if (m2985v() == 0) {
            return 0;
        }
        m12222F0();
        AbstractC1888L abstractC1888L = this.f33571r;
        boolean z6 = !this.f33576w;
        return AbstractC1906c.m3019f(c1925l0, abstractC1888L, m12225I0(z6), m12224H0(z6), this, this.f33576w);
    }

    /* JADX INFO: renamed from: E0 */
    public final int m12221E0(int i10) {
        if (i10 == 1) {
            return (this.f33569p != 1 && m12233R0()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f33569p != 1 && m12233R0()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f33569p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f33569p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 != 66) {
            return (i10 == 130 && this.f33569p == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f33569p == 0 ? 1 : Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m12222F0() {
        if (this.f33570q == null) {
            C1884H c1884h = new C1884H();
            c1884h.f5485a = true;
            c1884h.f5492h = 0;
            c1884h.f5493i = 0;
            c1884h.f5495k = null;
            this.f33570q = c1884h;
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final int m12223G0(C1911e0 c1911e0, C1884H c1884h, C1925l0 c1925l0, boolean z6) {
        int i10;
        int i11 = c1884h.f5487c;
        int i12 = c1884h.f5491g;
        if (i12 != Integer.MIN_VALUE) {
            if (i11 < 0) {
                c1884h.f5491g = i12 + i11;
            }
            m12234U0(c1911e0, c1884h);
        }
        int i13 = c1884h.f5487c + c1884h.f5492h;
        while (true) {
            if ((!c1884h.f5496l && i13 <= 0) || (i10 = c1884h.f5488d) < 0 || i10 >= c1925l0.m3082b()) {
                break;
            }
            C1883G c1883g = this.f33566B;
            c1883g.f5481a = 0;
            c1883g.f5482b = false;
            c1883g.f5483c = false;
            c1883g.f5484d = false;
            mo12206S0(c1911e0, c1925l0, c1884h, c1883g);
            if (!c1883g.f5482b) {
                int i14 = c1884h.f5486b;
                int i15 = c1883g.f5481a;
                c1884h.f5486b = (c1884h.f5490f * i15) + i14;
                if (!c1883g.f5483c || c1884h.f5495k != null || !c1925l0.f5642g) {
                    c1884h.f5487c -= i15;
                    i13 -= i15;
                }
                int i16 = c1884h.f5491g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    c1884h.f5491g = i17;
                    int i18 = c1884h.f5487c;
                    if (i18 < 0) {
                        c1884h.f5491g = i17 + i18;
                    }
                    m12234U0(c1911e0, c1884h);
                }
                if (z6 && c1883g.f5484d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11 - c1884h.f5487c;
    }

    /* JADX INFO: renamed from: H0 */
    public final View m12224H0(boolean z6) {
        return this.f33574u ? m12228L0(0, m2985v(), z6) : m12228L0(m2985v() - 1, -1, z6);
    }

    /* JADX INFO: renamed from: I0 */
    public final View m12225I0(boolean z6) {
        return this.f33574u ? m12228L0(m2985v() - 1, -1, z6) : m12228L0(0, m2985v(), z6);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: J */
    public final boolean mo2930J() {
        return true;
    }

    /* JADX INFO: renamed from: J0 */
    public final int m12226J0() {
        View viewM12228L0 = m12228L0(m2985v() - 1, -1, false);
        if (viewM12228L0 == null) {
            return -1;
        }
        return AbstractC1900Y.m2917F(viewM12228L0);
    }

    /* JADX INFO: renamed from: K0 */
    public final View m12227K0(int i10, int i11) {
        int i12;
        int i13;
        m12222F0();
        if (i11 <= i10 && i11 >= i10) {
            return m2983u(i10);
        }
        if (this.f33571r.mo2879e(m2983u(i10)) < this.f33571r.mo2885k()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f33569p == 0 ? this.f5544c.m12520u(i10, i11, i12, i13) : this.f5545d.m12520u(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: L0 */
    public final View m12228L0(int i10, int i11, boolean z6) {
        m12222F0();
        int i12 = z6 ? 24579 : 320;
        return this.f33569p == 0 ? this.f5544c.m12520u(i10, i11, i12, 320) : this.f5545d.m12520u(i10, i11, i12, 320);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX INFO: renamed from: M0 */
    public View mo12205M0(C1911e0 c1911e0, C1925l0 c1925l0, boolean z6, boolean z10) {
        int i10;
        int iM2985v;
        int i11;
        m12222F0();
        int iM2985v2 = m2985v();
        if (z10) {
            iM2985v = m2985v() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iM2985v2;
            iM2985v = 0;
            i11 = 1;
        }
        int iM3082b = c1925l0.m3082b();
        int iMo2885k = this.f33571r.mo2885k();
        int iMo2881g = this.f33571r.mo2881g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iM2985v != i10) {
            View viewM2983u = m2983u(iM2985v);
            int iM2917F = AbstractC1900Y.m2917F(viewM2983u);
            int iMo2879e = this.f33571r.mo2879e(viewM2983u);
            int iMo2876b = this.f33571r.mo2876b(viewM2983u);
            if (iM2917F >= 0 && iM2917F < iM3082b) {
                if (!((C1901Z) viewM2983u.getLayoutParams()).f5557a.m3095j()) {
                    boolean z11 = iMo2876b <= iMo2885k && iMo2879e < iMo2885k;
                    boolean z12 = iMo2879e >= iMo2881g && iMo2876b > iMo2881g;
                    if (!z11 && !z12) {
                        return viewM2983u;
                    }
                    if (z6) {
                        if (z12) {
                            view2 = viewM2983u;
                        } else if (view == null) {
                            view = viewM2983u;
                        }
                    } else if (z11) {
                        view2 = viewM2983u;
                    } else if (view == null) {
                        view = viewM2983u;
                    }
                } else if (view3 == null) {
                    view3 = viewM2983u;
                }
            }
            iM2985v += i11;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    /* JADX INFO: renamed from: N0 */
    public final int m12229N0(int i10, C1911e0 c1911e0, C1925l0 c1925l0, boolean z6) {
        int iMo2881g;
        int iMo2881g2 = this.f33571r.mo2881g() - i10;
        if (iMo2881g2 <= 0) {
            return 0;
        }
        int i11 = -m12237X0(-iMo2881g2, c1911e0, c1925l0);
        int i12 = i10 + i11;
        if (!z6 || (iMo2881g = this.f33571r.mo2881g() - i12) <= 0) {
            return i11;
        }
        this.f33571r.mo2889p(iMo2881g);
        return iMo2881g + i11;
    }

    /* JADX INFO: renamed from: O0 */
    public final int m12230O0(int i10, C1911e0 c1911e0, C1925l0 c1925l0, boolean z6) {
        int iMo2885k;
        int iMo2885k2 = i10 - this.f33571r.mo2885k();
        if (iMo2885k2 <= 0) {
            return 0;
        }
        int i11 = -m12237X0(iMo2885k2, c1911e0, c1925l0);
        int i12 = i10 + i11;
        if (!z6 || (iMo2885k = i12 - this.f33571r.mo2885k()) <= 0) {
            return i11;
        }
        this.f33571r.mo2889p(-iMo2885k);
        return i11 - iMo2885k;
    }

    /* JADX INFO: renamed from: P0 */
    public final View m12231P0() {
        return m2983u(this.f33574u ? 0 : m2985v() - 1);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: Q */
    public View mo2935Q(View view, int i10, C1911e0 c1911e0, C1925l0 c1925l0) {
        int iM12221E0;
        View viewM12227K0;
        m12236W0();
        if (m2985v() == 0 || (iM12221E0 = m12221E0(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        m12222F0();
        m12239a1(iM12221E0, (int) (this.f33571r.mo2886l() * 0.33333334f), false, c1925l0);
        C1884H c1884h = this.f33570q;
        c1884h.f5491g = Integer.MIN_VALUE;
        c1884h.f5485a = false;
        m12223G0(c1911e0, c1884h, c1925l0, true);
        if (iM12221E0 == -1) {
            viewM12227K0 = this.f33574u ? m12227K0(m2985v() - 1, -1) : m12227K0(0, m2985v());
        } else {
            viewM12227K0 = this.f33574u ? m12227K0(0, m2985v()) : m12227K0(m2985v() - 1, -1);
        }
        View viewM12232Q0 = iM12221E0 == -1 ? m12232Q0() : m12231P0();
        if (!viewM12232Q0.hasFocusable()) {
            return viewM12227K0;
        }
        if (viewM12227K0 == null) {
            return null;
        }
        return viewM12232Q0;
    }

    /* JADX INFO: renamed from: Q0 */
    public final View m12232Q0() {
        return m2983u(this.f33574u ? m2985v() - 1 : 0);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: R */
    public final void mo2936R(AccessibilityEvent accessibilityEvent) {
        super.mo2936R(accessibilityEvent);
        if (m2985v() > 0) {
            View viewM12228L0 = m12228L0(0, m2985v(), false);
            accessibilityEvent.setFromIndex(viewM12228L0 == null ? -1 : AbstractC1900Y.m2917F(viewM12228L0));
            accessibilityEvent.setToIndex(m12226J0());
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final boolean m12233R0() {
        return m2923A() == 1;
    }

    /* JADX INFO: renamed from: S0 */
    public void mo12206S0(C1911e0 c1911e0, C1925l0 c1925l0, C1884H c1884h, C1883G c1883g) {
        int iM2925C;
        int i10;
        int i11;
        int iMo2878d;
        View viewM2867b = c1884h.m2867b(c1911e0);
        if (viewM2867b == null) {
            c1883g.f5482b = true;
            return;
        }
        C1901Z c1901z = (C1901Z) viewM2867b.getLayoutParams();
        if (c1884h.f5495k == null) {
            if (this.f33574u == (c1884h.f5490f == -1)) {
                m2946b(viewM2867b, -1, false);
            } else {
                m2946b(viewM2867b, 0, false);
            }
        } else {
            if (this.f33574u == (c1884h.f5490f == -1)) {
                m2946b(viewM2867b, -1, true);
            } else {
                m2946b(viewM2867b, 0, true);
            }
        }
        C1901Z c1901z2 = (C1901Z) viewM2867b.getLayoutParams();
        Rect rectM12264N = this.f5543b.m12264N(viewM2867b);
        int i12 = rectM12264N.left + rectM12264N.right;
        int i13 = rectM12264N.top + rectM12264N.bottom;
        int iM2922w = AbstractC1900Y.m2922w(mo2950d(), this.f5555n, this.f5553l, m2926D() + m2925C() + ((ViewGroup.MarginLayoutParams) c1901z2).leftMargin + ((ViewGroup.MarginLayoutParams) c1901z2).rightMargin + i12, ((ViewGroup.MarginLayoutParams) c1901z2).width);
        int iM2922w2 = AbstractC1900Y.m2922w(mo2952e(), this.f5556o, this.f5554m, m2924B() + m2927E() + ((ViewGroup.MarginLayoutParams) c1901z2).topMargin + ((ViewGroup.MarginLayoutParams) c1901z2).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) c1901z2).height);
        if (m2982t0(viewM2867b, iM2922w, iM2922w2, c1901z2)) {
            viewM2867b.measure(iM2922w, iM2922w2);
        }
        c1883g.f5481a = this.f33571r.mo2877c(viewM2867b);
        if (this.f33569p == 1) {
            if (m12233R0()) {
                iMo2878d = this.f5555n - m2926D();
                iM2925C = iMo2878d - this.f33571r.mo2878d(viewM2867b);
            } else {
                iM2925C = m2925C();
                iMo2878d = this.f33571r.mo2878d(viewM2867b) + iM2925C;
            }
            if (c1884h.f5490f == -1) {
                i10 = c1884h.f5486b;
                i11 = i10 - c1883g.f5481a;
            } else {
                i11 = c1884h.f5486b;
                i10 = c1883g.f5481a + i11;
            }
        } else {
            int iM2927E = m2927E();
            int iMo2878d2 = this.f33571r.mo2878d(viewM2867b) + iM2927E;
            if (c1884h.f5490f == -1) {
                int i14 = c1884h.f5486b;
                int i15 = i14 - c1883g.f5481a;
                iMo2878d = i14;
                i10 = iMo2878d2;
                iM2925C = i15;
                i11 = iM2927E;
            } else {
                int i16 = c1884h.f5486b;
                int i17 = c1883g.f5481a + i16;
                iM2925C = i16;
                i10 = iMo2878d2;
                i11 = iM2927E;
                iMo2878d = i17;
            }
        }
        AbstractC1900Y.m2920L(viewM2867b, iM2925C, i11, iMo2878d, i10);
        if (c1901z.f5557a.m3095j() || c1901z.f5557a.m3098m()) {
            c1883g.f5483c = true;
        }
        c1883g.f5484d = viewM2867b.hasFocusable();
    }

    /* JADX INFO: renamed from: U0 */
    public final void m12234U0(C1911e0 c1911e0, C1884H c1884h) {
        if (!c1884h.f5485a || c1884h.f5496l) {
            return;
        }
        int i10 = c1884h.f5491g;
        int i11 = c1884h.f5493i;
        if (c1884h.f5490f == -1) {
            int iM2985v = m2985v();
            if (i10 < 0) {
                return;
            }
            int iMo2880f = (this.f33571r.mo2880f() - i10) + i11;
            if (this.f33574u) {
                for (int i12 = 0; i12 < iM2985v; i12++) {
                    View viewM2983u = m2983u(i12);
                    if (this.f33571r.mo2879e(viewM2983u) < iMo2880f || this.f33571r.mo2888o(viewM2983u) < iMo2880f) {
                        m12235V0(c1911e0, 0, i12);
                        return;
                    }
                }
                return;
            }
            int i13 = iM2985v - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View viewM2983u2 = m2983u(i14);
                if (this.f33571r.mo2879e(viewM2983u2) < iMo2880f || this.f33571r.mo2888o(viewM2983u2) < iMo2880f) {
                    m12235V0(c1911e0, i13, i14);
                    return;
                }
            }
            return;
        }
        if (i10 < 0) {
            return;
        }
        int i15 = i10 - i11;
        int iM2985v2 = m2985v();
        if (!this.f33574u) {
            for (int i16 = 0; i16 < iM2985v2; i16++) {
                View viewM2983u3 = m2983u(i16);
                if (this.f33571r.mo2876b(viewM2983u3) > i15 || this.f33571r.mo2887n(viewM2983u3) > i15) {
                    m12235V0(c1911e0, 0, i16);
                    return;
                }
            }
            return;
        }
        int i17 = iM2985v2 - 1;
        for (int i18 = i17; i18 >= 0; i18--) {
            View viewM2983u4 = m2983u(i18);
            if (this.f33571r.mo2876b(viewM2983u4) > i15 || this.f33571r.mo2887n(viewM2983u4) > i15) {
                m12235V0(c1911e0, i17, i18);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final void m12235V0(C1911e0 c1911e0, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                View viewM2983u = m2983u(i10);
                m2960i0(i10);
                c1911e0.m3033h(viewM2983u);
                i10--;
            }
            return;
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            View viewM2983u2 = m2983u(i12);
            m2960i0(i12);
            c1911e0.m3033h(viewM2983u2);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m12236W0() {
        if (this.f33569p == 1 || !m12233R0()) {
            this.f33574u = this.f33573t;
        } else {
            this.f33574u = !this.f33573t;
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final int m12237X0(int i10, C1911e0 c1911e0, C1925l0 c1925l0) {
        if (m2985v() == 0 || i10 == 0) {
            return 0;
        }
        m12222F0();
        this.f33570q.f5485a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        m12239a1(i11, iAbs, true, c1925l0);
        C1884H c1884h = this.f33570q;
        int iM12223G0 = m12223G0(c1911e0, c1884h, c1925l0, false) + c1884h.f5491g;
        if (iM12223G0 < 0) {
            return 0;
        }
        if (iAbs > iM12223G0) {
            i10 = i11 * iM12223G0;
        }
        this.f33571r.mo2889p(-i10);
        this.f33570q.f5494j = i10;
        return i10;
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m12238Y0(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "invalid orientation:"));
        }
        mo2948c(null);
        if (i10 != this.f33569p || this.f33571r == null) {
            AbstractC1888L abstractC1888LM2890a = AbstractC1888L.m2890a(this, i10);
            this.f33571r = abstractC1888LM2890a;
            this.f33565A.f4112f = abstractC1888LM2890a;
            this.f33569p = i10;
            m2964k0();
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void mo12208Z0(boolean z6) {
        mo2948c(null);
        if (this.f33575v == z6) {
            return;
        }
        this.f33575v = z6;
        m2964k0();
    }

    @Override // p084D4.InterfaceC1923k0
    /* JADX INFO: renamed from: a */
    public final PointF mo3080a(int i10) {
        if (m2985v() == 0) {
            return null;
        }
        int i11 = (i10 < AbstractC1900Y.m2917F(m2983u(0))) != this.f33574u ? -1 : 1;
        return this.f33569p == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:118:0x020c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x0210  */
    /* JADX WARN: Code duplicated, block: B:122:0x0213 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x0217  */
    /* JADX WARN: Code duplicated, block: B:126:0x021a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x021c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0220  */
    /* JADX WARN: Code duplicated, block: B:131:0x0224  */
    /* JADX WARN: Code duplicated, block: B:133:0x022b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0231  */
    /* JADX WARN: Code duplicated, block: B:91:0x018c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0190  */
    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: a0 */
    public void mo2945a0(C1911e0 c1911e0, C1925l0 c1925l0) {
        View focusedChild;
        int iM3082b;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z6;
        boolean z10;
        View viewMo12205M0;
        int iMo2879e;
        int iMo2876b;
        int iMo2885k;
        int iMo2881g;
        boolean z11;
        boolean z12;
        C1901Z c1901z;
        int i10;
        int i11;
        int i12;
        List list;
        int i13;
        int i14;
        int iM12229N0;
        int i15;
        View viewMo2975q;
        int iMo2879e2;
        int iMo2881g2;
        int i16;
        int i17 = -1;
        if (!(this.f33579z == null && this.f33577x == -1) && c1925l0.m3082b() == 0) {
            m2955f0(c1911e0);
            return;
        }
        C1885I c1885i = this.f33579z;
        if (c1885i != null && (i16 = c1885i.f5497Y) >= 0) {
            this.f33577x = i16;
        }
        m12222F0();
        this.f33570q.f5485a = false;
        m12236W0();
        RecyclerView recyclerView2 = this.f5543b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f5542a.f5616Z).contains(focusedChild)) {
            focusedChild = null;
        }
        C1529G c1529g = this.f33565A;
        if (!c1529g.f4111e || this.f33577x != -1 || this.f33579z != null) {
            c1529g.m2264g();
            c1529g.f4110d = this.f33574u ^ this.f33575v;
            if (c1925l0.f5642g || (i10 = this.f33577x) == -1) {
                if (m2985v() != 0) {
                    recyclerView = this.f5543b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f5542a.f5616Z).contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        c1901z = (C1901Z) focusedChild2.getLayoutParams();
                        if (!c1901z.f5557a.m3095j() || c1901z.f5557a.m3088c() < 0 || c1901z.f5557a.m3088c() >= c1925l0.m3082b()) {
                            z6 = this.f33572s;
                            z10 = this.f33575v;
                            if (z6 == z10 || (viewMo12205M0 = mo12205M0(c1911e0, c1925l0, c1529g.f4110d, z10)) == null) {
                                c1529g.m2259b();
                                if (this.f33575v) {
                                    iM3082b = c1925l0.m3082b() - 1;
                                } else {
                                    iM3082b = 0;
                                }
                                c1529g.f4108b = iM3082b;
                            } else {
                                c1529g.m2260c(viewMo12205M0, AbstractC1900Y.m2917F(viewMo12205M0));
                                if (!c1925l0.f5642g && mo2991y0()) {
                                    iMo2879e = this.f33571r.mo2879e(viewMo12205M0);
                                    iMo2876b = this.f33571r.mo2876b(viewMo12205M0);
                                    iMo2885k = this.f33571r.mo2885k();
                                    iMo2881g = this.f33571r.mo2881g();
                                    if (iMo2876b <= iMo2885k || iMo2879e >= iMo2885k) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    if (iMo2879e >= iMo2881g || iMo2876b <= iMo2881g) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    if (z11 || z12) {
                                        if (c1529g.f4110d) {
                                            iMo2885k = iMo2881g;
                                        }
                                        c1529g.f4109c = iMo2885k;
                                    }
                                }
                            }
                        } else {
                            c1529g.m2261d(focusedChild2, AbstractC1900Y.m2917F(focusedChild2));
                        }
                    } else {
                        z6 = this.f33572s;
                        z10 = this.f33575v;
                        if (z6 == z10) {
                            c1529g.m2259b();
                            if (this.f33575v) {
                                iM3082b = c1925l0.m3082b() - 1;
                            } else {
                                iM3082b = 0;
                            }
                            c1529g.f4108b = iM3082b;
                        } else {
                            c1529g.m2260c(viewMo12205M0, AbstractC1900Y.m2917F(viewMo12205M0));
                            if (!c1925l0.f5642g) {
                                iMo2879e = this.f33571r.mo2879e(viewMo12205M0);
                                iMo2876b = this.f33571r.mo2876b(viewMo12205M0);
                                iMo2885k = this.f33571r.mo2885k();
                                iMo2881g = this.f33571r.mo2881g();
                                if (iMo2876b <= iMo2885k) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                if (iMo2879e >= iMo2881g) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (z11) {
                                    if (c1529g.f4110d) {
                                        iMo2885k = iMo2881g;
                                    }
                                    c1529g.f4109c = iMo2885k;
                                } else {
                                    if (c1529g.f4110d) {
                                        iMo2885k = iMo2881g;
                                    }
                                    c1529g.f4109c = iMo2885k;
                                }
                            }
                        }
                    }
                } else {
                    c1529g.m2259b();
                    if (this.f33575v) {
                        iM3082b = c1925l0.m3082b() - 1;
                    } else {
                        iM3082b = 0;
                    }
                    c1529g.f4108b = iM3082b;
                }
            } else if (i10 < 0 || i10 >= c1925l0.m3082b()) {
                this.f33577x = -1;
                this.f33578y = Integer.MIN_VALUE;
                if (m2985v() != 0) {
                    recyclerView = this.f5543b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        c1901z = (C1901Z) focusedChild2.getLayoutParams();
                        if (c1901z.f5557a.m3095j()) {
                            z6 = this.f33572s;
                            z10 = this.f33575v;
                            if (z6 == z10) {
                                c1529g.m2259b();
                                if (this.f33575v) {
                                    iM3082b = c1925l0.m3082b() - 1;
                                } else {
                                    iM3082b = 0;
                                }
                                c1529g.f4108b = iM3082b;
                            } else {
                                c1529g.m2260c(viewMo12205M0, AbstractC1900Y.m2917F(viewMo12205M0));
                                if (!c1925l0.f5642g) {
                                    iMo2879e = this.f33571r.mo2879e(viewMo12205M0);
                                    iMo2876b = this.f33571r.mo2876b(viewMo12205M0);
                                    iMo2885k = this.f33571r.mo2885k();
                                    iMo2881g = this.f33571r.mo2881g();
                                    if (iMo2876b <= iMo2885k) {
                                        z11 = false;
                                    } else {
                                        z11 = false;
                                    }
                                    if (iMo2879e >= iMo2881g) {
                                        z12 = false;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z11) {
                                        if (c1529g.f4110d) {
                                            iMo2885k = iMo2881g;
                                        }
                                        c1529g.f4109c = iMo2885k;
                                    } else {
                                        if (c1529g.f4110d) {
                                            iMo2885k = iMo2881g;
                                        }
                                        c1529g.f4109c = iMo2885k;
                                    }
                                }
                            }
                        } else {
                            z6 = this.f33572s;
                            z10 = this.f33575v;
                            if (z6 == z10) {
                                c1529g.m2259b();
                                if (this.f33575v) {
                                    iM3082b = c1925l0.m3082b() - 1;
                                } else {
                                    iM3082b = 0;
                                }
                                c1529g.f4108b = iM3082b;
                            } else {
                                c1529g.m2260c(viewMo12205M0, AbstractC1900Y.m2917F(viewMo12205M0));
                                if (!c1925l0.f5642g) {
                                    iMo2879e = this.f33571r.mo2879e(viewMo12205M0);
                                    iMo2876b = this.f33571r.mo2876b(viewMo12205M0);
                                    iMo2885k = this.f33571r.mo2885k();
                                    iMo2881g = this.f33571r.mo2881g();
                                    if (iMo2876b <= iMo2885k) {
                                        z11 = false;
                                    } else {
                                        z11 = false;
                                    }
                                    if (iMo2879e >= iMo2881g) {
                                        z12 = false;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z11) {
                                        if (c1529g.f4110d) {
                                            iMo2885k = iMo2881g;
                                        }
                                        c1529g.f4109c = iMo2885k;
                                    } else {
                                        if (c1529g.f4110d) {
                                            iMo2885k = iMo2881g;
                                        }
                                        c1529g.f4109c = iMo2885k;
                                    }
                                }
                            }
                        }
                    } else {
                        z6 = this.f33572s;
                        z10 = this.f33575v;
                        if (z6 == z10) {
                            c1529g.m2259b();
                            if (this.f33575v) {
                                iM3082b = c1925l0.m3082b() - 1;
                            } else {
                                iM3082b = 0;
                            }
                            c1529g.f4108b = iM3082b;
                        } else {
                            c1529g.m2260c(viewMo12205M0, AbstractC1900Y.m2917F(viewMo12205M0));
                            if (!c1925l0.f5642g) {
                                iMo2879e = this.f33571r.mo2879e(viewMo12205M0);
                                iMo2876b = this.f33571r.mo2876b(viewMo12205M0);
                                iMo2885k = this.f33571r.mo2885k();
                                iMo2881g = this.f33571r.mo2881g();
                                if (iMo2876b <= iMo2885k) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                if (iMo2879e >= iMo2881g) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (z11) {
                                    if (c1529g.f4110d) {
                                        iMo2885k = iMo2881g;
                                    }
                                    c1529g.f4109c = iMo2885k;
                                } else {
                                    if (c1529g.f4110d) {
                                        iMo2885k = iMo2881g;
                                    }
                                    c1529g.f4109c = iMo2885k;
                                }
                            }
                        }
                    }
                } else {
                    c1529g.m2259b();
                    if (this.f33575v) {
                        iM3082b = c1925l0.m3082b() - 1;
                    } else {
                        iM3082b = 0;
                    }
                    c1529g.f4108b = iM3082b;
                }
            } else {
                int i18 = this.f33577x;
                c1529g.f4108b = i18;
                C1885I c1885i2 = this.f33579z;
                if (c1885i2 != null && c1885i2.f5497Y >= 0) {
                    boolean z13 = c1885i2.f5499o0;
                    c1529g.f4110d = z13;
                    if (z13) {
                        c1529g.f4109c = this.f33571r.mo2881g() - this.f33579z.f5498Z;
                    } else {
                        c1529g.f4109c = this.f33571r.mo2885k() + this.f33579z.f5498Z;
                    }
                } else if (this.f33578y == Integer.MIN_VALUE) {
                    View viewMo2975q2 = mo2975q(i18);
                    if (viewMo2975q2 == null) {
                        if (m2985v() > 0) {
                            c1529g.f4110d = (this.f33577x < AbstractC1900Y.m2917F(m2983u(0))) == this.f33574u;
                        }
                        c1529g.m2259b();
                    } else if (this.f33571r.mo2877c(viewMo2975q2) > this.f33571r.mo2886l()) {
                        c1529g.m2259b();
                    } else if (this.f33571r.mo2879e(viewMo2975q2) - this.f33571r.mo2885k() < 0) {
                        c1529g.f4109c = this.f33571r.mo2885k();
                        c1529g.f4110d = false;
                    } else if (this.f33571r.mo2881g() - this.f33571r.mo2876b(viewMo2975q2) < 0) {
                        c1529g.f4109c = this.f33571r.mo2881g();
                        c1529g.f4110d = true;
                    } else {
                        c1529g.f4109c = c1529g.f4110d ? this.f33571r.m2891m() + this.f33571r.mo2876b(viewMo2975q2) : this.f33571r.mo2879e(viewMo2975q2);
                    }
                } else {
                    boolean z14 = this.f33574u;
                    c1529g.f4110d = z14;
                    if (z14) {
                        c1529g.f4109c = this.f33571r.mo2881g() - this.f33578y;
                    } else {
                        c1529g.f4109c = this.f33571r.mo2885k() + this.f33578y;
                    }
                }
            }
            c1529g.f4111e = true;
        } else if (focusedChild != null && (this.f33571r.mo2879e(focusedChild) >= this.f33571r.mo2881g() || this.f33571r.mo2876b(focusedChild) <= this.f33571r.mo2885k())) {
            c1529g.m2261d(focusedChild, AbstractC1900Y.m2917F(focusedChild));
        }
        C1884H c1884h = this.f33570q;
        c1884h.f5490f = c1884h.f5494j >= 0 ? 1 : -1;
        int[] iArr = this.f33568D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo12242z0(c1925l0, iArr);
        int iMo2885k2 = this.f33571r.mo2885k() + Math.max(0, iArr[0]);
        int iMo2882h = this.f33571r.mo2882h() + Math.max(0, iArr[1]);
        if (c1925l0.f5642g && (i15 = this.f33577x) != -1 && this.f33578y != Integer.MIN_VALUE && (viewMo2975q = mo2975q(i15)) != null) {
            if (this.f33574u) {
                iMo2881g2 = this.f33571r.mo2881g() - this.f33571r.mo2876b(viewMo2975q);
                iMo2879e2 = this.f33578y;
            } else {
                iMo2879e2 = this.f33571r.mo2879e(viewMo2975q) - this.f33571r.mo2885k();
                iMo2881g2 = this.f33578y;
            }
            int i19 = iMo2881g2 - iMo2879e2;
            if (i19 > 0) {
                iMo2885k2 += i19;
            } else {
                iMo2882h -= i19;
            }
        }
        if (!c1529g.f4110d ? !this.f33574u : this.f33574u) {
            i17 = 1;
        }
        mo12207T0(c1911e0, c1925l0, c1529g, i17);
        m2973p(c1911e0);
        this.f33570q.f5496l = this.f33571r.mo2883i() == 0 && this.f33571r.mo2880f() == 0;
        this.f33570q.getClass();
        this.f33570q.f5493i = 0;
        if (c1529g.f4110d) {
            m12241c1(c1529g.f4108b, c1529g.f4109c);
            C1884H c1884h2 = this.f33570q;
            c1884h2.f5492h = iMo2885k2;
            m12223G0(c1911e0, c1884h2, c1925l0, false);
            C1884H c1884h3 = this.f33570q;
            i12 = c1884h3.f5486b;
            int i20 = c1884h3.f5488d;
            int i21 = c1884h3.f5487c;
            if (i21 > 0) {
                iMo2882h += i21;
            }
            m12240b1(c1529g.f4108b, c1529g.f4109c);
            C1884H c1884h4 = this.f33570q;
            c1884h4.f5492h = iMo2882h;
            c1884h4.f5488d += c1884h4.f5489e;
            m12223G0(c1911e0, c1884h4, c1925l0, false);
            C1884H c1884h5 = this.f33570q;
            i11 = c1884h5.f5486b;
            int i22 = c1884h5.f5487c;
            if (i22 > 0) {
                m12241c1(i20, i12);
                C1884H c1884h6 = this.f33570q;
                c1884h6.f5492h = i22;
                m12223G0(c1911e0, c1884h6, c1925l0, false);
                i12 = this.f33570q.f5486b;
            }
        } else {
            m12240b1(c1529g.f4108b, c1529g.f4109c);
            C1884H c1884h7 = this.f33570q;
            c1884h7.f5492h = iMo2882h;
            m12223G0(c1911e0, c1884h7, c1925l0, false);
            C1884H c1884h8 = this.f33570q;
            i11 = c1884h8.f5486b;
            int i23 = c1884h8.f5488d;
            int i24 = c1884h8.f5487c;
            if (i24 > 0) {
                iMo2885k2 += i24;
            }
            m12241c1(c1529g.f4108b, c1529g.f4109c);
            C1884H c1884h9 = this.f33570q;
            c1884h9.f5492h = iMo2885k2;
            c1884h9.f5488d += c1884h9.f5489e;
            m12223G0(c1911e0, c1884h9, c1925l0, false);
            C1884H c1884h10 = this.f33570q;
            int i25 = c1884h10.f5486b;
            int i26 = c1884h10.f5487c;
            if (i26 > 0) {
                m12240b1(i23, i11);
                C1884H c1884h11 = this.f33570q;
                c1884h11.f5492h = i26;
                m12223G0(c1911e0, c1884h11, c1925l0, false);
                i11 = this.f33570q.f5486b;
            }
            i12 = i25;
        }
        if (m2985v() > 0) {
            if (this.f33574u ^ this.f33575v) {
                int iM12229N1 = m12229N0(i11, c1911e0, c1925l0, true);
                i13 = i12 + iM12229N1;
                i14 = i11 + iM12229N1;
                iM12229N0 = m12230O0(i13, c1911e0, c1925l0, false);
            } else {
                int iM12230O0 = m12230O0(i12, c1911e0, c1925l0, true);
                i13 = i12 + iM12230O0;
                i14 = i11 + iM12230O0;
                iM12229N0 = m12229N0(i14, c1911e0, c1925l0, false);
            }
            i12 = i13 + iM12229N0;
            i11 = i14 + iM12229N0;
        }
        if (c1925l0.f5646k && m2985v() != 0 && !c1925l0.f5642g && mo2991y0()) {
            List list2 = c1911e0.f5589d;
            int size = list2.size();
            int iM2917F = AbstractC1900Y.m2917F(m2983u(0));
            int iMo2877c = 0;
            int iMo2877c2 = 0;
            for (int i27 = 0; i27 < size; i27++) {
                AbstractC1933p0 abstractC1933p0 = (AbstractC1933p0) list2.get(i27);
                if (!abstractC1933p0.m3095j()) {
                    boolean z15 = abstractC1933p0.m3088c() < iM2917F;
                    boolean z16 = this.f33574u;
                    View view = abstractC1933p0.f5680a;
                    if (z15 != z16) {
                        iMo2877c += this.f33571r.mo2877c(view);
                    } else {
                        iMo2877c2 += this.f33571r.mo2877c(view);
                    }
                }
            }
            this.f33570q.f5495k = list2;
            if (iMo2877c > 0) {
                m12241c1(AbstractC1900Y.m2917F(m12232Q0()), i12);
                C1884H c1884h12 = this.f33570q;
                c1884h12.f5492h = iMo2877c;
                c1884h12.f5487c = 0;
                c1884h12.m2866a(null);
                m12223G0(c1911e0, this.f33570q, c1925l0, false);
            }
            if (iMo2877c2 > 0) {
                m12240b1(AbstractC1900Y.m2917F(m12231P0()), i11);
                C1884H c1884h13 = this.f33570q;
                c1884h13.f5492h = iMo2877c2;
                c1884h13.f5487c = 0;
                list = null;
                c1884h13.m2866a(null);
                m12223G0(c1911e0, this.f33570q, c1925l0, false);
            } else {
                list = null;
            }
            this.f33570q.f5495k = list;
        }
        if (c1925l0.f5642g) {
            c1529g.m2264g();
        } else {
            AbstractC1888L abstractC1888L = this.f33571r;
            abstractC1888L.f5517a = abstractC1888L.mo2886l();
        }
        this.f33572s = this.f33575v;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m12239a1(int i10, int i11, boolean z6, C1925l0 c1925l0) {
        int iMo2885k;
        this.f33570q.f5496l = this.f33571r.mo2883i() == 0 && this.f33571r.mo2880f() == 0;
        this.f33570q.f5490f = i10;
        int[] iArr = this.f33568D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo12242z0(c1925l0, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z10 = i10 == 1;
        C1884H c1884h = this.f33570q;
        int i12 = z10 ? iMax2 : iMax;
        c1884h.f5492h = i12;
        if (!z10) {
            iMax = iMax2;
        }
        c1884h.f5493i = iMax;
        if (z10) {
            c1884h.f5492h = this.f33571r.mo2882h() + i12;
            View viewM12231P0 = m12231P0();
            C1884H c1884h2 = this.f33570q;
            c1884h2.f5489e = this.f33574u ? -1 : 1;
            int iM2917F = AbstractC1900Y.m2917F(viewM12231P0);
            C1884H c1884h3 = this.f33570q;
            c1884h2.f5488d = iM2917F + c1884h3.f5489e;
            c1884h3.f5486b = this.f33571r.mo2876b(viewM12231P0);
            iMo2885k = this.f33571r.mo2876b(viewM12231P0) - this.f33571r.mo2881g();
        } else {
            View viewM12232Q0 = m12232Q0();
            C1884H c1884h4 = this.f33570q;
            c1884h4.f5492h = this.f33571r.mo2885k() + c1884h4.f5492h;
            C1884H c1884h5 = this.f33570q;
            c1884h5.f5489e = this.f33574u ? 1 : -1;
            int iM2917F2 = AbstractC1900Y.m2917F(viewM12232Q0);
            C1884H c1884h6 = this.f33570q;
            c1884h5.f5488d = iM2917F2 + c1884h6.f5489e;
            c1884h6.f5486b = this.f33571r.mo2879e(viewM12232Q0);
            iMo2885k = (-this.f33571r.mo2879e(viewM12232Q0)) + this.f33571r.mo2885k();
        }
        C1884H c1884h7 = this.f33570q;
        c1884h7.f5487c = i11;
        if (z6) {
            c1884h7.f5487c = i11 - iMo2885k;
        }
        c1884h7.f5491g = iMo2885k;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: b0 */
    public void mo2947b0(C1925l0 c1925l0) {
        this.f33579z = null;
        this.f33577x = -1;
        this.f33578y = Integer.MIN_VALUE;
        this.f33565A.m2264g();
    }

    /* JADX INFO: renamed from: b1 */
    public final void m12240b1(int i10, int i11) {
        this.f33570q.f5487c = this.f33571r.mo2881g() - i11;
        C1884H c1884h = this.f33570q;
        c1884h.f5489e = this.f33574u ? -1 : 1;
        c1884h.f5488d = i10;
        c1884h.f5490f = 1;
        c1884h.f5486b = i11;
        c1884h.f5491g = Integer.MIN_VALUE;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: c */
    public final void mo2948c(String str) {
        if (this.f33579z == null) {
            super.mo2948c(str);
        }
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: c0 */
    public final void mo2949c0(Parcelable parcelable) {
        if (parcelable instanceof C1885I) {
            C1885I c1885i = (C1885I) parcelable;
            this.f33579z = c1885i;
            if (this.f33577x != -1) {
                c1885i.f5497Y = -1;
            }
            m2964k0();
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m12241c1(int i10, int i11) {
        this.f33570q.f5487c = i11 - this.f33571r.mo2885k();
        C1884H c1884h = this.f33570q;
        c1884h.f5488d = i10;
        c1884h.f5489e = this.f33574u ? 1 : -1;
        c1884h.f5490f = -1;
        c1884h.f5486b = i11;
        c1884h.f5491g = Integer.MIN_VALUE;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: d */
    public final boolean mo2950d() {
        return this.f33569p == 0;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: d0 */
    public final Parcelable mo2951d0() {
        C1885I c1885i = this.f33579z;
        if (c1885i != null) {
            C1885I c1885i2 = new C1885I();
            c1885i2.f5497Y = c1885i.f5497Y;
            c1885i2.f5498Z = c1885i.f5498Z;
            c1885i2.f5499o0 = c1885i.f5499o0;
            return c1885i2;
        }
        C1885I c1885i3 = new C1885I();
        if (m2985v() > 0) {
            m12222F0();
            boolean z6 = this.f33572s ^ this.f33574u;
            c1885i3.f5499o0 = z6;
            if (z6) {
                View viewM12231P0 = m12231P0();
                c1885i3.f5498Z = this.f33571r.mo2881g() - this.f33571r.mo2876b(viewM12231P0);
                c1885i3.f5497Y = AbstractC1900Y.m2917F(viewM12231P0);
            } else {
                View viewM12232Q0 = m12232Q0();
                c1885i3.f5497Y = AbstractC1900Y.m2917F(viewM12232Q0);
                c1885i3.f5498Z = this.f33571r.mo2879e(viewM12232Q0) - this.f33571r.mo2885k();
            }
        } else {
            c1885i3.f5497Y = -1;
        }
        return c1885i3;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: e */
    public final boolean mo2952e() {
        return this.f33569p == 1;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: h */
    public final void mo2957h(int i10, int i11, C1925l0 c1925l0, C1878B c1878b) {
        if (this.f33569p != 0) {
            i10 = i11;
        }
        if (m2985v() == 0 || i10 == 0) {
            return;
        }
        m12222F0();
        m12239a1(i10 > 0 ? 1 : -1, Math.abs(i10), true, c1925l0);
        mo12204A0(c1925l0, this.f33570q, c1878b);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: i */
    public final void mo2959i(int i10, C1878B c1878b) {
        boolean z6;
        int i11;
        C1885I c1885i = this.f33579z;
        if (c1885i == null || (i11 = c1885i.f5497Y) < 0) {
            m12236W0();
            z6 = this.f33574u;
            i11 = this.f33577x;
            if (i11 == -1) {
                i11 = z6 ? i10 - 1 : 0;
            }
        } else {
            z6 = c1885i.f5499o0;
        }
        int i12 = z6 ? -1 : 1;
        for (int i13 = 0; i13 < this.f33567C && i11 >= 0 && i11 < i10; i13++) {
            c1878b.m2861b(i11, 0);
            i11 += i12;
        }
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: j */
    public final int mo2961j(C1925l0 c1925l0) {
        return m12218B0(c1925l0);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: k */
    public int mo2963k(C1925l0 c1925l0) {
        return m12219C0(c1925l0);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: l */
    public int mo2965l(C1925l0 c1925l0) {
        return m12220D0(c1925l0);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: l0 */
    public int mo2966l0(int i10, C1911e0 c1911e0, C1925l0 c1925l0) {
        if (this.f33569p == 1) {
            return 0;
        }
        return m12237X0(i10, c1911e0, c1925l0);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: m */
    public final int mo2967m(C1925l0 c1925l0) {
        return m12218B0(c1925l0);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: m0 */
    public final void mo2968m0(int i10) {
        this.f33577x = i10;
        this.f33578y = Integer.MIN_VALUE;
        C1885I c1885i = this.f33579z;
        if (c1885i != null) {
            c1885i.f5497Y = -1;
        }
        m2964k0();
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: n */
    public int mo2969n(C1925l0 c1925l0) {
        return m12219C0(c1925l0);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: n0 */
    public int mo2970n0(int i10, C1911e0 c1911e0, C1925l0 c1925l0) {
        if (this.f33569p == 0) {
            return 0;
        }
        return m12237X0(i10, c1911e0, c1925l0);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: o */
    public int mo2971o(C1925l0 c1925l0) {
        return m12220D0(c1925l0);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: q */
    public final View mo2975q(int i10) {
        int iM2985v = m2985v();
        if (iM2985v == 0) {
            return null;
        }
        int iM2917F = i10 - AbstractC1900Y.m2917F(m2983u(0));
        if (iM2917F >= 0 && iM2917F < iM2985v) {
            View viewM2983u = m2983u(iM2917F);
            if (AbstractC1900Y.m2917F(viewM2983u) == i10) {
                return viewM2983u;
            }
        }
        return super.mo2975q(i10);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: r */
    public C1901Z mo2977r() {
        return new C1901Z(-2, -2);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: u0 */
    public final boolean mo2984u0() {
        if (this.f5554m == 1073741824 || this.f5553l == 1073741824) {
            return false;
        }
        int iM2985v = m2985v();
        for (int i10 = 0; i10 < iM2985v; i10++) {
            ViewGroup.LayoutParams layoutParams = m2983u(i10).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: w0 */
    public void mo2987w0(RecyclerView recyclerView, int i10) {
        C1886J c1886j = new C1886J(recyclerView.getContext());
        c1886j.f5500a = i10;
        m2989x0(c1886j);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: y0 */
    public boolean mo2991y0() {
        return this.f33579z == null && this.f33572s == this.f33575v;
    }

    /* JADX INFO: renamed from: z0 */
    public void mo12242z0(C1925l0 c1925l0, int[] iArr) {
        int i10;
        int iMo2886l = c1925l0.f5636a != -1 ? this.f33571r.mo2886l() : 0;
        if (this.f33570q.f5490f == -1) {
            i10 = 0;
        } else {
            i10 = iMo2886l;
            iMo2886l = 0;
        }
        iArr[0] = iMo2886l;
        iArr[1] = i10;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f33569p = 1;
        this.f33573t = false;
        this.f33574u = false;
        this.f33575v = false;
        this.f33576w = true;
        this.f33577x = -1;
        this.f33578y = Integer.MIN_VALUE;
        this.f33579z = null;
        this.f33565A = new C1529G();
        this.f33566B = new C1883G();
        this.f33567C = 2;
        this.f33568D = new int[2];
        C1899X c1899xM2918G = AbstractC1900Y.m2918G(context, attributeSet, i10, i11);
        m12238Y0(c1899xM2918G.f5538a);
        boolean z6 = c1899xM2918G.f5540c;
        mo2948c(null);
        if (z6 != this.f33573t) {
            this.f33573t = z6;
            m2964k0();
        }
        mo12208Z0(c1899xM2918G.f5541d);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: P */
    public final void mo2934P(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: T0 */
    public void mo12207T0(C1911e0 c1911e0, C1925l0 c1925l0, C1529G c1529g, int i10) {
    }
}
