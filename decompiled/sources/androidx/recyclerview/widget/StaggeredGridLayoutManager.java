package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import p003A1.RunnableC0153B;
import p030B2.AbstractC0738T;
import p084D4.AbstractC1888L;
import p084D4.AbstractC1900Y;
import p084D4.AbstractC1906c;
import p084D4.C1878B;
import p084D4.C1882F;
import p084D4.C1886J;
import p084D4.C1899X;
import p084D4.C1901Z;
import p084D4.C1911e0;
import p084D4.C1925l0;
import p084D4.C1941t0;
import p084D4.C1943u0;
import p084D4.C1945v0;
import p084D4.C1947w0;
import p084D4.C1949x0;
import p084D4.InterfaceC1923k0;
import p813ij.C15026j;
import p911o0.AbstractC17792x;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC1900Y implements InterfaceC1923k0 {

    /* JADX INFO: renamed from: B */
    public final C15026j f33665B;

    /* JADX INFO: renamed from: C */
    public final int f33666C;

    /* JADX INFO: renamed from: D */
    public boolean f33667D;

    /* JADX INFO: renamed from: E */
    public boolean f33668E;

    /* JADX INFO: renamed from: F */
    public C1947w0 f33669F;

    /* JADX INFO: renamed from: G */
    public final Rect f33670G;

    /* JADX INFO: renamed from: H */
    public final C1941t0 f33671H;

    /* JADX INFO: renamed from: I */
    public final boolean f33672I;

    /* JADX INFO: renamed from: J */
    public int[] f33673J;

    /* JADX INFO: renamed from: K */
    public final RunnableC0153B f33674K;

    /* JADX INFO: renamed from: p */
    public final int f33675p;

    /* JADX INFO: renamed from: q */
    public final C1949x0[] f33676q;

    /* JADX INFO: renamed from: r */
    public final AbstractC1888L f33677r;

    /* JADX INFO: renamed from: s */
    public final AbstractC1888L f33678s;

    /* JADX INFO: renamed from: t */
    public final int f33679t;

    /* JADX INFO: renamed from: u */
    public int f33680u;

    /* JADX INFO: renamed from: v */
    public final C1882F f33681v;

    /* JADX INFO: renamed from: w */
    public boolean f33682w;

    /* JADX INFO: renamed from: y */
    public final BitSet f33684y;

    /* JADX INFO: renamed from: x */
    public boolean f33683x = false;

    /* JADX INFO: renamed from: z */
    public int f33685z = -1;

    /* JADX INFO: renamed from: A */
    public int f33664A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f33675p = -1;
        this.f33682w = false;
        C15026j c15026j = new C15026j();
        this.f33665B = c15026j;
        this.f33666C = 2;
        this.f33670G = new Rect();
        this.f33671H = new C1941t0(this);
        this.f33672I = true;
        this.f33674K = new RunnableC0153B(this, 2);
        C1899X c1899xM2918G = AbstractC1900Y.m2918G(context, attributeSet, i10, i11);
        int i12 = c1899xM2918G.f5538a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo2948c(null);
        if (i12 != this.f33679t) {
            this.f33679t = i12;
            AbstractC1888L abstractC1888L = this.f33677r;
            this.f33677r = this.f33678s;
            this.f33678s = abstractC1888L;
            m2964k0();
        }
        int i13 = c1899xM2918G.f5539b;
        mo2948c(null);
        if (i13 != this.f33675p) {
            c15026j.m16145e();
            m2964k0();
            this.f33675p = i13;
            this.f33684y = new BitSet(this.f33675p);
            this.f33676q = new C1949x0[this.f33675p];
            for (int i14 = 0; i14 < this.f33675p; i14++) {
                this.f33676q[i14] = new C1949x0(this, i14);
            }
            m2964k0();
        }
        boolean z6 = c1899xM2918G.f5540c;
        mo2948c(null);
        C1947w0 c1947w0 = this.f33669F;
        if (c1947w0 != null && c1947w0.f5763t0 != z6) {
            c1947w0.f5763t0 = z6;
        }
        this.f33682w = z6;
        m2964k0();
        C1882F c1882f = new C1882F();
        c1882f.f5472a = true;
        c1882f.f5477f = 0;
        c1882f.f5478g = 0;
        this.f33681v = c1882f;
        this.f33677r = AbstractC1888L.m2890a(this, this.f33679t);
        this.f33678s = AbstractC1888L.m2890a(this, 1 - this.f33679t);
    }

    /* JADX INFO: renamed from: c1 */
    public static int m12306c1(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    /* JADX INFO: renamed from: A0 */
    public final boolean m12307A0() {
        int iM12316J0;
        if (m2985v() != 0 && this.f33666C != 0 && this.f5548g) {
            if (this.f33683x) {
                iM12316J0 = m12317K0();
                m12316J0();
            } else {
                iM12316J0 = m12316J0();
                m12317K0();
            }
            C15026j c15026j = this.f33665B;
            if (iM12316J0 == 0 && m12321O0() != null) {
                c15026j.m16145e();
                this.f5547f = true;
                m2964k0();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B0 */
    public final int m12308B0(C1925l0 c1925l0) {
        if (m2985v() == 0) {
            return 0;
        }
        AbstractC1888L abstractC1888L = this.f33677r;
        boolean z6 = !this.f33672I;
        return AbstractC1906c.m3017d(c1925l0, abstractC1888L, m12313G0(z6), m12312F0(z6), this, this.f33672I);
    }

    /* JADX INFO: renamed from: C0 */
    public final int m12309C0(C1925l0 c1925l0) {
        if (m2985v() == 0) {
            return 0;
        }
        AbstractC1888L abstractC1888L = this.f33677r;
        boolean z6 = !this.f33672I;
        return AbstractC1906c.m3018e(c1925l0, abstractC1888L, m12313G0(z6), m12312F0(z6), this, this.f33672I, this.f33683x);
    }

    /* JADX INFO: renamed from: D0 */
    public final int m12310D0(C1925l0 c1925l0) {
        if (m2985v() == 0) {
            return 0;
        }
        AbstractC1888L abstractC1888L = this.f33677r;
        boolean z6 = !this.f33672I;
        return AbstractC1906c.m3019f(c1925l0, abstractC1888L, m12313G0(z6), m12312F0(z6), this, this.f33672I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* JADX INFO: renamed from: E0 */
    public final int m12311E0(C1911e0 c1911e0, C1882F c1882f, C1925l0 c1925l0) {
        C1949x0 c1949x0;
        ?? r6;
        int i10;
        int iM3125j;
        int iMo2877c;
        int iMo2885k;
        int iMo2877c2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        int i16 = 1;
        this.f33684y.set(0, this.f33675p, true);
        C1882F c1882f2 = this.f33681v;
        int i17 = c1882f2.f5480i ? c1882f.f5476e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c1882f.f5476e == 1 ? c1882f.f5478g + c1882f.f5473b : c1882f.f5477f - c1882f.f5473b;
        int i18 = c1882f.f5476e;
        for (int i19 = 0; i19 < this.f33675p; i19++) {
            if (!((ArrayList) this.f33676q[i19].f5772f).isEmpty()) {
                m12334b1(this.f33676q[i19], i18, i17);
            }
        }
        int iMo2881g = this.f33683x ? this.f33677r.mo2881g() : this.f33677r.mo2885k();
        boolean z6 = false;
        while (true) {
            int i20 = c1882f.f5474c;
            if (((i20 < 0 || i20 >= c1925l0.m3082b()) ? i15 : i16) == 0 || (!c1882f2.f5480i && this.f33684y.isEmpty())) {
                break;
            }
            View view = c1911e0.m3036k(c1882f.f5474c, Long.MAX_VALUE).f5680a;
            c1882f.f5474c += c1882f.f5475d;
            C1943u0 c1943u0 = (C1943u0) view.getLayoutParams();
            int iM3088c = c1943u0.f5557a.m3088c();
            C15026j c15026j = this.f33665B;
            int[] iArr = (int[]) c15026j.f46724Y;
            int i21 = (iArr == null || iM3088c >= iArr.length) ? -1 : iArr[iM3088c];
            if (i21 == -1) {
                if (m12325S0(c1882f.f5476e)) {
                    i14 = this.f33675p - i16;
                    i13 = -1;
                    i12 = -1;
                } else {
                    i12 = i16;
                    i13 = this.f33675p;
                    i14 = i15;
                }
                C1949x0 c1949x1 = null;
                if (c1882f.f5476e == i16) {
                    int iMo2885k2 = this.f33677r.mo2885k();
                    int i22 = Integer.MAX_VALUE;
                    while (i14 != i13) {
                        C1949x0 c1949x2 = this.f33676q[i14];
                        int iM3123h = c1949x2.m3123h(iMo2885k2);
                        if (iM3123h < i22) {
                            i22 = iM3123h;
                            c1949x1 = c1949x2;
                        }
                        i14 += i12;
                    }
                } else {
                    int iMo2881g2 = this.f33677r.mo2881g();
                    int i23 = Integer.MIN_VALUE;
                    while (i14 != i13) {
                        C1949x0 c1949x3 = this.f33676q[i14];
                        int iM3125j2 = c1949x3.m3125j(iMo2881g2);
                        if (iM3125j2 > i23) {
                            c1949x1 = c1949x3;
                            i23 = iM3125j2;
                        }
                        i14 += i12;
                    }
                }
                c1949x0 = c1949x1;
                c15026j.m16146f(iM3088c);
                ((int[]) c15026j.f46724Y)[iM3088c] = c1949x0.f5771e;
            } else {
                c1949x0 = this.f33676q[i21];
            }
            c1943u0.f5742e = c1949x0;
            if (c1882f.f5476e == 1) {
                r6 = 0;
                m2946b(view, -1, false);
            } else {
                r6 = 0;
                m2946b(view, 0, false);
            }
            if (this.f33679t == 1) {
                i10 = 1;
                m12323Q0(view, AbstractC1900Y.m2922w(r6, this.f33680u, this.f5553l, r6, ((ViewGroup.MarginLayoutParams) c1943u0).width), AbstractC1900Y.m2922w(true, this.f5556o, this.f5554m, m2924B() + m2927E(), ((ViewGroup.MarginLayoutParams) c1943u0).height));
            } else {
                i10 = 1;
                m12323Q0(view, AbstractC1900Y.m2922w(true, this.f5555n, this.f5553l, m2926D() + m2925C(), ((ViewGroup.MarginLayoutParams) c1943u0).width), AbstractC1900Y.m2922w(false, this.f33680u, this.f5554m, 0, ((ViewGroup.MarginLayoutParams) c1943u0).height));
            }
            if (c1882f.f5476e == i10) {
                iMo2877c = c1949x0.m3123h(iMo2881g);
                iM3125j = this.f33677r.mo2877c(view) + iMo2877c;
            } else {
                iM3125j = c1949x0.m3125j(iMo2881g);
                iMo2877c = iM3125j - this.f33677r.mo2877c(view);
            }
            if (c1882f.f5476e == 1) {
                C1949x0 c1949x4 = c1943u0.f5742e;
                c1949x4.getClass();
                C1943u0 c1943u1 = (C1943u0) view.getLayoutParams();
                c1943u1.f5742e = c1949x4;
                ArrayList arrayList = (ArrayList) c1949x4.f5772f;
                arrayList.add(view);
                c1949x4.f5769c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c1949x4.f5768b = Integer.MIN_VALUE;
                }
                if (c1943u1.f5557a.m3095j() || c1943u1.f5557a.m3098m()) {
                    c1949x4.f5770d = ((StaggeredGridLayoutManager) c1949x4.f5773g).f33677r.mo2877c(view) + c1949x4.f5770d;
                }
            } else {
                C1949x0 c1949x5 = c1943u0.f5742e;
                c1949x5.getClass();
                C1943u0 c1943u2 = (C1943u0) view.getLayoutParams();
                c1943u2.f5742e = c1949x5;
                ArrayList arrayList2 = (ArrayList) c1949x5.f5772f;
                arrayList2.add(0, view);
                c1949x5.f5768b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c1949x5.f5769c = Integer.MIN_VALUE;
                }
                if (c1943u2.f5557a.m3095j() || c1943u2.f5557a.m3098m()) {
                    c1949x5.f5770d = ((StaggeredGridLayoutManager) c1949x5.f5773g).f33677r.mo2877c(view) + c1949x5.f5770d;
                }
            }
            if (m12322P0() && this.f33679t == 1) {
                iMo2877c2 = this.f33678s.mo2881g() - (((this.f33675p - 1) - c1949x0.f5771e) * this.f33680u);
                iMo2885k = iMo2877c2 - this.f33678s.mo2877c(view);
            } else {
                iMo2885k = this.f33678s.mo2885k() + (c1949x0.f5771e * this.f33680u);
                iMo2877c2 = this.f33678s.mo2877c(view) + iMo2885k;
            }
            if (this.f33679t == 1) {
                AbstractC1900Y.m2920L(view, iMo2885k, iMo2877c, iMo2877c2, iM3125j);
            } else {
                AbstractC1900Y.m2920L(view, iMo2877c, iMo2885k, iM3125j, iMo2877c2);
            }
            m12334b1(c1949x0, c1882f2.f5476e, i17);
            m12327U0(c1911e0, c1882f2);
            if (c1882f2.f5479h && view.hasFocusable()) {
                i11 = 0;
                this.f33684y.set(c1949x0.f5771e, false);
            } else {
                i11 = 0;
            }
            i15 = i11;
            i16 = 1;
            z6 = true;
        }
        int i24 = i15;
        if (!z6) {
            m12327U0(c1911e0, c1882f2);
        }
        int iMo2885k3 = c1882f2.f5476e == -1 ? this.f33677r.mo2885k() - m12319M0(this.f33677r.mo2885k()) : m12318L0(this.f33677r.mo2881g()) - this.f33677r.mo2881g();
        return iMo2885k3 > 0 ? Math.min(c1882f.f5473b, iMo2885k3) : i24;
    }

    /* JADX INFO: renamed from: F0 */
    public final View m12312F0(boolean z6) {
        int iMo2885k = this.f33677r.mo2885k();
        int iMo2881g = this.f33677r.mo2881g();
        View view = null;
        for (int iM2985v = m2985v() - 1; iM2985v >= 0; iM2985v--) {
            View viewM2983u = m2983u(iM2985v);
            int iMo2879e = this.f33677r.mo2879e(viewM2983u);
            int iMo2876b = this.f33677r.mo2876b(viewM2983u);
            if (iMo2876b > iMo2885k && iMo2879e < iMo2881g) {
                if (iMo2876b <= iMo2881g || !z6) {
                    return viewM2983u;
                }
                if (view == null) {
                    view = viewM2983u;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: G0 */
    public final View m12313G0(boolean z6) {
        int iMo2885k = this.f33677r.mo2885k();
        int iMo2881g = this.f33677r.mo2881g();
        int iM2985v = m2985v();
        View view = null;
        for (int i10 = 0; i10 < iM2985v; i10++) {
            View viewM2983u = m2983u(i10);
            int iMo2879e = this.f33677r.mo2879e(viewM2983u);
            if (this.f33677r.mo2876b(viewM2983u) > iMo2885k && iMo2879e < iMo2881g) {
                if (iMo2879e >= iMo2885k || !z6) {
                    return viewM2983u;
                }
                if (view == null) {
                    view = viewM2983u;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m12314H0(C1911e0 c1911e0, C1925l0 c1925l0, boolean z6) {
        int iMo2881g;
        int iM12318L0 = m12318L0(Integer.MIN_VALUE);
        if (iM12318L0 != Integer.MIN_VALUE && (iMo2881g = this.f33677r.mo2881g() - iM12318L0) > 0) {
            int i10 = iMo2881g - (-m12331Y0(-iMo2881g, c1911e0, c1925l0));
            if (!z6 || i10 <= 0) {
                return;
            }
            this.f33677r.mo2889p(i10);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m12315I0(C1911e0 c1911e0, C1925l0 c1925l0, boolean z6) {
        int iMo2885k;
        int iM12319M0 = m12319M0(Integer.MAX_VALUE);
        if (iM12319M0 != Integer.MAX_VALUE && (iMo2885k = iM12319M0 - this.f33677r.mo2885k()) > 0) {
            int iM12331Y0 = iMo2885k - m12331Y0(iMo2885k, c1911e0, c1925l0);
            if (!z6 || iM12331Y0 <= 0) {
                return;
            }
            this.f33677r.mo2889p(-iM12331Y0);
        }
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: J */
    public final boolean mo2930J() {
        return this.f33666C != 0;
    }

    /* JADX INFO: renamed from: J0 */
    public final int m12316J0() {
        if (m2985v() == 0) {
            return 0;
        }
        return AbstractC1900Y.m2917F(m2983u(0));
    }

    /* JADX INFO: renamed from: K0 */
    public final int m12317K0() {
        int iM2985v = m2985v();
        if (iM2985v == 0) {
            return 0;
        }
        return AbstractC1900Y.m2917F(m2983u(iM2985v - 1));
    }

    /* JADX INFO: renamed from: L0 */
    public final int m12318L0(int i10) {
        int iM3123h = this.f33676q[0].m3123h(i10);
        for (int i11 = 1; i11 < this.f33675p; i11++) {
            int iM3123h2 = this.f33676q[i11].m3123h(i10);
            if (iM3123h2 > iM3123h) {
                iM3123h = iM3123h2;
            }
        }
        return iM3123h;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: M */
    public final void mo2931M(int i10) {
        super.mo2931M(i10);
        for (int i11 = 0; i11 < this.f33675p; i11++) {
            C1949x0 c1949x0 = this.f33676q[i11];
            int i12 = c1949x0.f5768b;
            if (i12 != Integer.MIN_VALUE) {
                c1949x0.f5768b = i12 + i10;
            }
            int i13 = c1949x0.f5769c;
            if (i13 != Integer.MIN_VALUE) {
                c1949x0.f5769c = i13 + i10;
            }
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final int m12319M0(int i10) {
        int iM3125j = this.f33676q[0].m3125j(i10);
        for (int i11 = 1; i11 < this.f33675p; i11++) {
            int iM3125j2 = this.f33676q[i11].m3125j(i10);
            if (iM3125j2 < iM3125j) {
                iM3125j = iM3125j2;
            }
        }
        return iM3125j;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: N */
    public final void mo2932N(int i10) {
        super.mo2932N(i10);
        for (int i11 = 0; i11 < this.f33675p; i11++) {
            C1949x0 c1949x0 = this.f33676q[i11];
            int i12 = c1949x0.f5768b;
            if (i12 != Integer.MIN_VALUE) {
                c1949x0.f5768b = i12 + i10;
            }
            int i13 = c1949x0.f5769c;
            if (i13 != Integer.MIN_VALUE) {
                c1949x0.f5769c = i13 + i10;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    /* JADX WARN: Code duplicated, block: B:25:0x003a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0042  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052 A[LOOP:0: B:26:0x0040->B:30:0x0052, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078 A[LOOP:1: B:34:0x0067->B:38:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x007c A[EDGE_INSN: B:66:0x007c->B:40:0x007c BREAK  A[LOOP:1: B:34:0x0067->B:38:0x0078], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: N0 */
    public final void m12320N0(int i10, int i11, int i12) {
        int i13;
        int i14;
        C15026j c15026j;
        int[] iArr;
        int iM12317K0;
        ArrayList arrayList;
        C1945v0 c1945v0;
        int size;
        int i15;
        int i16;
        int size2;
        C1945v0 c1945v1;
        int iM12317K1 = this.f33683x ? m12317K0() : m12316J0();
        if (i12 == 8) {
            if (i10 < i11) {
                i13 = i11 + 1;
            } else {
                i13 = i10 + 1;
                i14 = i11;
            }
            c15026j = this.f33665B;
            iArr = (int[]) c15026j.f46724Y;
            if (iArr != null && i14 < iArr.length) {
                arrayList = (ArrayList) c15026j.f46725Z;
                if (arrayList == null) {
                    i16 = -1;
                } else {
                    c1945v0 = null;
                    if (arrayList != null) {
                        for (size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            c1945v1 = (C1945v0) ((ArrayList) c15026j.f46725Z).get(size2);
                            if (c1945v1.f5748Y == i14) {
                                c1945v0 = c1945v1;
                                break;
                            }
                        }
                    }
                    if (c1945v0 != null) {
                        ((ArrayList) c15026j.f46725Z).remove(c1945v0);
                    }
                    size = ((ArrayList) c15026j.f46725Z).size();
                    i15 = 0;
                    while (true) {
                        if (i15 < size) {
                            i15 = -1;
                            break;
                        } else if (((C1945v0) ((ArrayList) c15026j.f46725Z).get(i15)).f5748Y >= i14) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (i15 != -1) {
                        C1945v0 c1945v2 = (C1945v0) ((ArrayList) c15026j.f46725Z).get(i15);
                        ((ArrayList) c15026j.f46725Z).remove(i15);
                        i16 = c1945v2.f5748Y;
                    } else {
                        i16 = -1;
                    }
                }
                if (i16 == -1) {
                    int[] iArr2 = (int[]) c15026j.f46724Y;
                    Arrays.fill(iArr2, i14, iArr2.length, -1);
                    int length = ((int[]) c15026j.f46724Y).length;
                } else {
                    Arrays.fill((int[]) c15026j.f46724Y, i14, Math.min(i16 + 1, ((int[]) c15026j.f46724Y).length), -1);
                }
            }
            if (i12 != 1) {
                c15026j.m16147j(i10, i11);
            } else if (i12 != 2) {
                c15026j.m16148k(i10, i11);
            } else if (i12 == 8) {
                c15026j.m16148k(i10, 1);
                c15026j.m16147j(i11, 1);
            }
            if (i13 <= iM12317K1) {
                return;
            }
            if (this.f33683x) {
                iM12317K0 = m12316J0();
            } else {
                iM12317K0 = m12317K0();
            }
            if (i14 <= iM12317K0) {
                m2964k0();
            }
        }
        i13 = i10 + i11;
        i14 = i10;
        c15026j = this.f33665B;
        iArr = (int[]) c15026j.f46724Y;
        if (iArr != null) {
            arrayList = (ArrayList) c15026j.f46725Z;
            if (arrayList == null) {
                i16 = -1;
            } else {
                c1945v0 = null;
                if (arrayList != null) {
                    while (size2 >= 0) {
                        c1945v1 = (C1945v0) ((ArrayList) c15026j.f46725Z).get(size2);
                        if (c1945v1.f5748Y == i14) {
                            c1945v0 = c1945v1;
                            break;
                        }
                    }
                }
                if (c1945v0 != null) {
                    ((ArrayList) c15026j.f46725Z).remove(c1945v0);
                }
                size = ((ArrayList) c15026j.f46725Z).size();
                i15 = 0;
                while (true) {
                    if (i15 < size) {
                        i15 = -1;
                        break;
                    } else {
                        if (((C1945v0) ((ArrayList) c15026j.f46725Z).get(i15)).f5748Y >= i14) {
                            break;
                            break;
                        }
                        i15++;
                    }
                }
                if (i15 != -1) {
                    C1945v0 c1945v3 = (C1945v0) ((ArrayList) c15026j.f46725Z).get(i15);
                    ((ArrayList) c15026j.f46725Z).remove(i15);
                    i16 = c1945v3.f5748Y;
                } else {
                    i16 = -1;
                }
            }
            if (i16 == -1) {
                int[] iArr3 = (int[]) c15026j.f46724Y;
                Arrays.fill(iArr3, i14, iArr3.length, -1);
                int length2 = ((int[]) c15026j.f46724Y).length;
            } else {
                Arrays.fill((int[]) c15026j.f46724Y, i14, Math.min(i16 + 1, ((int[]) c15026j.f46724Y).length), -1);
            }
        }
        if (i12 != 1) {
            c15026j.m16147j(i10, i11);
        } else if (i12 != 2) {
            c15026j.m16148k(i10, i11);
        } else if (i12 == 8) {
            c15026j.m16148k(i10, 1);
            c15026j.m16147j(i11, 1);
        }
        if (i13 <= iM12317K1) {
            return;
        }
        if (this.f33683x) {
            iM12317K0 = m12316J0();
        } else {
            iM12317K0 = m12317K0();
        }
        if (i14 <= iM12317K0) {
            m2964k0();
        }
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: O */
    public final void mo2933O() {
        this.f33665B.m16145e();
        for (int i10 = 0; i10 < this.f33675p; i10++) {
            this.f33676q[i10].m3117b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:67:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x002c A[SYNTHETIC] */
    /* JADX INFO: renamed from: O0 */
    public final View m12321O0() {
        boolean z6;
        boolean z10;
        int iM2985v = m2985v();
        int i10 = iM2985v - 1;
        BitSet bitSet = new BitSet(this.f33675p);
        bitSet.set(0, this.f33675p, true);
        byte b = (this.f33679t == 1 && m12322P0()) ? (byte) 1 : (byte) -1;
        if (this.f33683x) {
            iM2985v = -1;
        } else {
            i10 = 0;
        }
        int i11 = i10 < iM2985v ? 1 : -1;
        while (i10 != iM2985v) {
            View viewM2983u = m2983u(i10);
            C1943u0 c1943u0 = (C1943u0) viewM2983u.getLayoutParams();
            if (bitSet.get(c1943u0.f5742e.f5771e)) {
                C1949x0 c1949x0 = c1943u0.f5742e;
                if (this.f33683x) {
                    int i12 = c1949x0.f5769c;
                    if (i12 == Integer.MIN_VALUE) {
                        c1949x0.m3116a();
                        i12 = c1949x0.f5769c;
                    }
                    if (i12 < this.f33677r.mo2881g()) {
                        ((C1943u0) ((View) AbstractC17792x.m19532o(1, (ArrayList) c1949x0.f5772f)).getLayoutParams()).getClass();
                        return viewM2983u;
                    }
                    bitSet.clear(c1943u0.f5742e.f5771e);
                } else {
                    int i13 = c1949x0.f5768b;
                    if (i13 == Integer.MIN_VALUE) {
                        View view = (View) ((ArrayList) c1949x0.f5772f).get(0);
                        C1943u0 c1943u1 = (C1943u0) view.getLayoutParams();
                        c1949x0.f5768b = ((StaggeredGridLayoutManager) c1949x0.f5773g).f33677r.mo2879e(view);
                        c1943u1.getClass();
                        i13 = c1949x0.f5768b;
                    }
                    if (i13 > this.f33677r.mo2885k()) {
                        ((C1943u0) ((View) ((ArrayList) c1949x0.f5772f).get(0)).getLayoutParams()).getClass();
                        return viewM2983u;
                    }
                    bitSet.clear(c1943u0.f5742e.f5771e);
                }
            }
            i10 += i11;
            if (i10 != iM2985v) {
                View viewM2983u2 = m2983u(i10);
                if (this.f33683x) {
                    int iMo2876b = this.f33677r.mo2876b(viewM2983u);
                    int iMo2876b2 = this.f33677r.mo2876b(viewM2983u2);
                    if (iMo2876b < iMo2876b2) {
                        return viewM2983u;
                    }
                    if (iMo2876b == iMo2876b2) {
                        if (c1943u0.f5742e.f5771e - ((C1943u0) viewM2983u2.getLayoutParams()).f5742e.f5771e < 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (b < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z6 != z10) {
                            return viewM2983u;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iMo2879e = this.f33677r.mo2879e(viewM2983u);
                    int iMo2879e2 = this.f33677r.mo2879e(viewM2983u2);
                    if (iMo2879e > iMo2879e2) {
                        return viewM2983u;
                    }
                    if (iMo2879e == iMo2879e2) {
                        if (c1943u0.f5742e.f5771e - ((C1943u0) viewM2983u2.getLayoutParams()).f5742e.f5771e < 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (b < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z6 != z10) {
                            return viewM2983u;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: P */
    public final void mo2934P(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5543b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f33674K);
        }
        for (int i10 = 0; i10 < this.f33675p; i10++) {
            this.f33676q[i10].m3117b();
        }
        recyclerView.requestLayout();
    }

    /* JADX INFO: renamed from: P0 */
    public final boolean m12322P0() {
        return m2923A() == 1;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x005b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0063  */
    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: Q */
    public final View mo2935Q(View view, int i10, C1911e0 c1911e0, C1925l0 c1925l0) {
        View viewM12257D;
        int i11;
        if (m2985v() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.f5543b;
        if (recyclerView == null || (viewM12257D = recyclerView.m12257D(view)) == null || ((ArrayList) this.f5542a.f5616Z).contains(viewM12257D)) {
            viewM12257D = null;
        }
        if (viewM12257D == null) {
            return null;
        }
        m12330X0();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 == 66 ? this.f33679t == 0 : !(i10 != 130 || this.f33679t != 1)) {
                            i11 = 1;
                        }
                    } else if (this.f33679t == 1) {
                        i11 = -1;
                    }
                    i11 = Integer.MIN_VALUE;
                } else if (this.f33679t == 0) {
                    i11 = -1;
                } else {
                    i11 = Integer.MIN_VALUE;
                }
            } else if (this.f33679t != 1 && m12322P0()) {
                i11 = -1;
            } else {
                i11 = 1;
            }
        } else if (this.f33679t != 1 && m12322P0()) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        C1943u0 c1943u0 = (C1943u0) viewM12257D.getLayoutParams();
        c1943u0.getClass();
        C1949x0 c1949x0 = c1943u0.f5742e;
        int iM12317K0 = i11 == 1 ? m12317K0() : m12316J0();
        m12333a1(iM12317K0, c1925l0);
        m12332Z0(i11);
        C1882F c1882f = this.f33681v;
        c1882f.f5474c = c1882f.f5475d + iM12317K0;
        c1882f.f5473b = (int) (this.f33677r.mo2886l() * 0.33333334f);
        c1882f.f5479h = true;
        c1882f.f5472a = false;
        m12311E0(c1911e0, c1882f, c1925l0);
        this.f33667D = this.f33683x;
        View viewM3124i = c1949x0.m3124i(iM12317K0, i11);
        if (viewM3124i != null && viewM3124i != viewM12257D) {
            return viewM3124i;
        }
        if (m12325S0(i11)) {
            for (int i12 = this.f33675p - 1; i12 >= 0; i12--) {
                View viewM3124i2 = this.f33676q[i12].m3124i(iM12317K0, i11);
                if (viewM3124i2 != null && viewM3124i2 != viewM12257D) {
                    return viewM3124i2;
                }
            }
        } else {
            for (int i13 = 0; i13 < this.f33675p; i13++) {
                View viewM3124i3 = this.f33676q[i13].m3124i(iM12317K0, i11);
                if (viewM3124i3 != null && viewM3124i3 != viewM12257D) {
                    return viewM3124i3;
                }
            }
        }
        boolean z6 = (this.f33682w ^ true) == (i11 == -1);
        View viewMo2975q = mo2975q(z6 ? c1949x0.m3119d() : c1949x0.m3120e());
        if (viewMo2975q != null && viewMo2975q != viewM12257D) {
            return viewMo2975q;
        }
        if (m12325S0(i11)) {
            for (int i14 = this.f33675p - 1; i14 >= 0; i14--) {
                if (i14 != c1949x0.f5771e) {
                    View viewMo2975q2 = mo2975q(z6 ? this.f33676q[i14].m3119d() : this.f33676q[i14].m3120e());
                    if (viewMo2975q2 != null && viewMo2975q2 != viewM12257D) {
                        return viewMo2975q2;
                    }
                }
            }
        } else {
            for (int i15 = 0; i15 < this.f33675p; i15++) {
                View viewMo2975q3 = mo2975q(z6 ? this.f33676q[i15].m3119d() : this.f33676q[i15].m3120e());
                if (viewMo2975q3 != null && viewMo2975q3 != viewM12257D) {
                    return viewMo2975q3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m12323Q0(View view, int i10, int i11) {
        RecyclerView recyclerView = this.f5543b;
        Rect rect = this.f33670G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m12264N(view));
        }
        C1943u0 c1943u0 = (C1943u0) view.getLayoutParams();
        int iM12306c1 = m12306c1(i10, ((ViewGroup.MarginLayoutParams) c1943u0).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c1943u0).rightMargin + rect.right);
        int iM12306c2 = m12306c1(i11, ((ViewGroup.MarginLayoutParams) c1943u0).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c1943u0).bottomMargin + rect.bottom);
        if (m2982t0(view, iM12306c1, iM12306c2, c1943u0)) {
            view.measure(iM12306c1, iM12306c2);
        }
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: R */
    public final void mo2936R(AccessibilityEvent accessibilityEvent) {
        super.mo2936R(accessibilityEvent);
        if (m2985v() > 0) {
            View viewM12313G0 = m12313G0(false);
            View viewM12312F0 = m12312F0(false);
            if (viewM12313G0 == null || viewM12312F0 == null) {
                return;
            }
            int iM2917F = AbstractC1900Y.m2917F(viewM12313G0);
            int iM2917F2 = AbstractC1900Y.m2917F(viewM12312F0);
            if (iM2917F < iM2917F2) {
                accessibilityEvent.setFromIndex(iM2917F);
                accessibilityEvent.setToIndex(iM2917F2);
            } else {
                accessibilityEvent.setFromIndex(iM2917F2);
                accessibilityEvent.setToIndex(iM2917F);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:116:0x01da  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:246:0x0407  */
    /* JADX WARN: Code duplicated, block: B:257:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x01ea A[SYNTHETIC] */
    /* JADX INFO: renamed from: R0 */
    public final void m12324R0(C1911e0 c1911e0, C1925l0 c1925l0, boolean z6) {
        boolean z10;
        C1947w0 c1947w0;
        int iM2985v;
        int i10;
        int iM2917F;
        int iM2917F2;
        int iM2985v2;
        int i11;
        C1947w0 c1947w1 = this.f33669F;
        C1941t0 c1941t0 = this.f33671H;
        if (!(c1947w1 == null && this.f33685z == -1) && c1925l0.m3082b() == 0) {
            m2955f0(c1911e0);
            c1941t0.m3112a();
            return;
        }
        boolean z11 = (c1941t0.f5735e && this.f33685z == -1 && this.f33669F == null) ? false : true;
        C15026j c15026j = this.f33665B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c1941t0.f5737g;
        if (z11) {
            c1941t0.m3112a();
            C1947w0 c1947w2 = this.f33669F;
            if (c1947w2 != null) {
                int i12 = c1947w2.f5758o0;
                if (i12 > 0) {
                    if (i12 == this.f33675p) {
                        for (int i13 = 0; i13 < this.f33675p; i13++) {
                            this.f33676q[i13].m3117b();
                            C1947w0 c1947w3 = this.f33669F;
                            int iMo2881g = c1947w3.f5759p0[i13];
                            if (iMo2881g != Integer.MIN_VALUE) {
                                iMo2881g += c1947w3.f5764u0 ? this.f33677r.mo2881g() : this.f33677r.mo2885k();
                            }
                            C1949x0 c1949x0 = this.f33676q[i13];
                            c1949x0.f5768b = iMo2881g;
                            c1949x0.f5769c = iMo2881g;
                        }
                    } else {
                        c1947w2.f5759p0 = null;
                        c1947w2.f5758o0 = 0;
                        c1947w2.f5760q0 = 0;
                        c1947w2.f5761r0 = null;
                        c1947w2.f5762s0 = null;
                        c1947w2.f5756Y = c1947w2.f5757Z;
                    }
                }
                C1947w0 c1947w4 = this.f33669F;
                this.f33668E = c1947w4.f5765v0;
                boolean z12 = c1947w4.f5763t0;
                mo2948c(null);
                C1947w0 c1947w5 = this.f33669F;
                if (c1947w5 != null && c1947w5.f5763t0 != z12) {
                    c1947w5.f5763t0 = z12;
                }
                this.f33682w = z12;
                m2964k0();
                m12330X0();
                C1947w0 c1947w6 = this.f33669F;
                int i14 = c1947w6.f5756Y;
                if (i14 != -1) {
                    this.f33685z = i14;
                    c1941t0.f5733c = c1947w6.f5764u0;
                } else {
                    c1941t0.f5733c = this.f33683x;
                }
                if (c1947w6.f5760q0 > 1) {
                    c15026j.f46724Y = c1947w6.f5761r0;
                    c15026j.f46725Z = c1947w6.f5762s0;
                }
            } else {
                m12330X0();
                c1941t0.f5733c = this.f33683x;
            }
            if (c1925l0.f5642g || (i11 = this.f33685z) == -1) {
                if (this.f33667D) {
                    int iM3082b = c1925l0.m3082b();
                    iM2985v2 = m2985v() - 1;
                    while (true) {
                        if (iM2985v2 < 0) {
                            iM2917F2 = 0;
                            break;
                        }
                        iM2917F2 = AbstractC1900Y.m2917F(m2983u(iM2985v2));
                        if (iM2917F2 < 0 && iM2917F2 < iM3082b) {
                            break;
                        } else {
                            iM2985v2--;
                        }
                    }
                } else {
                    int iM3082b2 = c1925l0.m3082b();
                    iM2985v = m2985v();
                    i10 = 0;
                    while (true) {
                        if (i10 >= iM2985v) {
                            iM2917F2 = 0;
                            break;
                        }
                        iM2917F = AbstractC1900Y.m2917F(m2983u(i10));
                        if (iM2917F < 0 && iM2917F < iM3082b2) {
                            iM2917F2 = iM2917F;
                            break;
                        }
                        i10++;
                    }
                }
                c1941t0.f5731a = iM2917F2;
                c1941t0.f5732b = Integer.MIN_VALUE;
            } else if (i11 < 0 || i11 >= c1925l0.m3082b()) {
                this.f33685z = -1;
                this.f33664A = Integer.MIN_VALUE;
                if (this.f33667D) {
                    int iM3082b3 = c1925l0.m3082b();
                    iM2985v2 = m2985v() - 1;
                    while (true) {
                        if (iM2985v2 < 0) {
                            iM2917F2 = 0;
                            break;
                        } else {
                            iM2917F2 = AbstractC1900Y.m2917F(m2983u(iM2985v2));
                            if (iM2917F2 < 0) {
                            }
                            iM2985v2--;
                        }
                    }
                } else {
                    int iM3082b4 = c1925l0.m3082b();
                    iM2985v = m2985v();
                    i10 = 0;
                    while (true) {
                        if (i10 >= iM2985v) {
                            iM2917F2 = 0;
                            break;
                        } else {
                            iM2917F = AbstractC1900Y.m2917F(m2983u(i10));
                            if (iM2917F < 0) {
                            }
                            i10++;
                        }
                    }
                }
                c1941t0.f5731a = iM2917F2;
                c1941t0.f5732b = Integer.MIN_VALUE;
            } else {
                C1947w0 c1947w7 = this.f33669F;
                if (c1947w7 == null || c1947w7.f5756Y == -1 || c1947w7.f5758o0 < 1) {
                    View viewMo2975q = mo2975q(this.f33685z);
                    if (viewMo2975q != null) {
                        c1941t0.f5731a = this.f33683x ? m12317K0() : m12316J0();
                        if (this.f33664A != Integer.MIN_VALUE) {
                            if (c1941t0.f5733c) {
                                c1941t0.f5732b = (this.f33677r.mo2881g() - this.f33664A) - this.f33677r.mo2876b(viewMo2975q);
                            } else {
                                c1941t0.f5732b = (this.f33677r.mo2885k() + this.f33664A) - this.f33677r.mo2879e(viewMo2975q);
                            }
                        } else if (this.f33677r.mo2877c(viewMo2975q) > this.f33677r.mo2886l()) {
                            c1941t0.f5732b = c1941t0.f5733c ? this.f33677r.mo2881g() : this.f33677r.mo2885k();
                        } else {
                            int iMo2879e = this.f33677r.mo2879e(viewMo2975q) - this.f33677r.mo2885k();
                            if (iMo2879e < 0) {
                                c1941t0.f5732b = -iMo2879e;
                            } else {
                                int iMo2881g2 = this.f33677r.mo2881g() - this.f33677r.mo2876b(viewMo2975q);
                                if (iMo2881g2 < 0) {
                                    c1941t0.f5732b = iMo2881g2;
                                } else {
                                    c1941t0.f5732b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i15 = this.f33685z;
                        c1941t0.f5731a = i15;
                        int i16 = this.f33664A;
                        if (i16 == Integer.MIN_VALUE) {
                            boolean z13 = m12335z0(i15) == 1;
                            c1941t0.f5733c = z13;
                            c1941t0.f5732b = z13 ? staggeredGridLayoutManager.f33677r.mo2881g() : staggeredGridLayoutManager.f33677r.mo2885k();
                        } else if (c1941t0.f5733c) {
                            c1941t0.f5732b = staggeredGridLayoutManager.f33677r.mo2881g() - i16;
                        } else {
                            c1941t0.f5732b = staggeredGridLayoutManager.f33677r.mo2885k() + i16;
                        }
                        c1941t0.f5734d = true;
                    }
                } else {
                    c1941t0.f5732b = Integer.MIN_VALUE;
                    c1941t0.f5731a = this.f33685z;
                }
            }
            c1941t0.f5735e = true;
        }
        if (this.f33669F == null && this.f33685z == -1 && (c1941t0.f5733c != this.f33667D || m12322P0() != this.f33668E)) {
            c15026j.m16145e();
            c1941t0.f5734d = true;
        }
        if (m2985v() > 0 && ((c1947w0 = this.f33669F) == null || c1947w0.f5758o0 < 1)) {
            if (c1941t0.f5734d) {
                for (int i17 = 0; i17 < this.f33675p; i17++) {
                    this.f33676q[i17].m3117b();
                    int i18 = c1941t0.f5732b;
                    if (i18 != Integer.MIN_VALUE) {
                        C1949x0 c1949x1 = this.f33676q[i17];
                        c1949x1.f5768b = i18;
                        c1949x1.f5769c = i18;
                    }
                }
            } else if (z11 || c1941t0.f5736f == null) {
                for (int i19 = 0; i19 < this.f33675p; i19++) {
                    C1949x0 c1949x2 = this.f33676q[i19];
                    boolean z14 = this.f33683x;
                    int i20 = c1941t0.f5732b;
                    int iM3123h = z14 ? c1949x2.m3123h(Integer.MIN_VALUE) : c1949x2.m3125j(Integer.MIN_VALUE);
                    c1949x2.m3117b();
                    if (iM3123h != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) c1949x2.f5773g;
                        if ((!z14 || iM3123h >= staggeredGridLayoutManager2.f33677r.mo2881g()) && (z14 || iM3123h <= staggeredGridLayoutManager2.f33677r.mo2885k())) {
                            if (i20 != Integer.MIN_VALUE) {
                                iM3123h += i20;
                            }
                            c1949x2.f5769c = iM3123h;
                            c1949x2.f5768b = iM3123h;
                        }
                    }
                }
                C1949x0[] c1949x0Arr = this.f33676q;
                int length = c1949x0Arr.length;
                int[] iArr = c1941t0.f5736f;
                if (iArr == null || iArr.length < length) {
                    c1941t0.f5736f = new int[staggeredGridLayoutManager.f33676q.length];
                }
                for (int i21 = 0; i21 < length; i21++) {
                    c1941t0.f5736f[i21] = c1949x0Arr[i21].m3125j(Integer.MIN_VALUE);
                }
            } else {
                for (int i22 = 0; i22 < this.f33675p; i22++) {
                    C1949x0 c1949x3 = this.f33676q[i22];
                    c1949x3.m3117b();
                    int i23 = c1941t0.f5736f[i22];
                    c1949x3.f5768b = i23;
                    c1949x3.f5769c = i23;
                }
            }
        }
        m2973p(c1911e0);
        C1882F c1882f = this.f33681v;
        c1882f.f5472a = false;
        int iMo2886l = this.f33678s.mo2886l();
        this.f33680u = iMo2886l / this.f33675p;
        View.MeasureSpec.makeMeasureSpec(iMo2886l, this.f33678s.mo2883i());
        m12333a1(c1941t0.f5731a, c1925l0);
        if (c1941t0.f5733c) {
            m12332Z0(-1);
            m12311E0(c1911e0, c1882f, c1925l0);
            m12332Z0(1);
            c1882f.f5474c = c1941t0.f5731a + c1882f.f5475d;
            m12311E0(c1911e0, c1882f, c1925l0);
        } else {
            m12332Z0(1);
            m12311E0(c1911e0, c1882f, c1925l0);
            m12332Z0(-1);
            c1882f.f5474c = c1941t0.f5731a + c1882f.f5475d;
            m12311E0(c1911e0, c1882f, c1925l0);
        }
        if (this.f33678s.mo2883i() != 1073741824) {
            int iM2985v3 = m2985v();
            float fMax = 0.0f;
            for (int i24 = 0; i24 < iM2985v3; i24++) {
                View viewM2983u = m2983u(i24);
                float fMo2877c = this.f33678s.mo2877c(viewM2983u);
                if (fMo2877c >= fMax) {
                    ((C1943u0) viewM2983u.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fMo2877c);
                }
            }
            int i25 = this.f33680u;
            int iRound = Math.round(fMax * this.f33675p);
            if (this.f33678s.mo2883i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f33678s.mo2886l());
            }
            this.f33680u = iRound / this.f33675p;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f33678s.mo2883i());
            if (this.f33680u != i25) {
                for (int i26 = 0; i26 < iM2985v3; i26++) {
                    View viewM2983u2 = m2983u(i26);
                    C1943u0 c1943u0 = (C1943u0) viewM2983u2.getLayoutParams();
                    c1943u0.getClass();
                    if (m12322P0() && this.f33679t == 1) {
                        int i27 = -((this.f33675p - 1) - c1943u0.f5742e.f5771e);
                        viewM2983u2.offsetLeftAndRight((this.f33680u * i27) - (i27 * i25));
                    } else {
                        int i28 = c1943u0.f5742e.f5771e;
                        int i29 = this.f33680u * i28;
                        int i30 = i28 * i25;
                        if (this.f33679t == 1) {
                            viewM2983u2.offsetLeftAndRight(i29 - i30);
                        } else {
                            viewM2983u2.offsetTopAndBottom(i29 - i30);
                        }
                    }
                }
            }
        }
        if (m2985v() > 0) {
            if (this.f33683x) {
                m12314H0(c1911e0, c1925l0, true);
                m12315I0(c1911e0, c1925l0, false);
            } else {
                m12315I0(c1911e0, c1925l0, true);
                m12314H0(c1911e0, c1925l0, false);
            }
        }
        if (z6 && !c1925l0.f5642g && this.f33666C != 0 && m2985v() > 0 && m12321O0() != null) {
            RecyclerView recyclerView = this.f5543b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f33674K);
            }
            z10 = m12307A0();
        }
        if (c1925l0.f5642g) {
            c1941t0.m3112a();
        }
        this.f33667D = c1941t0.f5733c;
        this.f33668E = m12322P0();
        if (z10) {
            c1941t0.m3112a();
            m12324R0(c1911e0, c1925l0, false);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final boolean m12325S0(int i10) {
        if (this.f33679t == 0) {
            return (i10 == -1) != this.f33683x;
        }
        return ((i10 == -1) == this.f33683x) == m12322P0();
    }

    /* JADX INFO: renamed from: T0 */
    public final void m12326T0(int i10, C1925l0 c1925l0) {
        int iM12316J0;
        int i11;
        if (i10 > 0) {
            iM12316J0 = m12317K0();
            i11 = 1;
        } else {
            iM12316J0 = m12316J0();
            i11 = -1;
        }
        C1882F c1882f = this.f33681v;
        c1882f.f5472a = true;
        m12333a1(iM12316J0, c1925l0);
        m12332Z0(i11);
        c1882f.f5474c = iM12316J0 + c1882f.f5475d;
        c1882f.f5473b = Math.abs(i10);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m12327U0(C1911e0 c1911e0, C1882F c1882f) {
        int iMin;
        if (!c1882f.f5472a || c1882f.f5480i) {
            return;
        }
        if (c1882f.f5473b == 0) {
            if (c1882f.f5476e == -1) {
                m12328V0(c1911e0, c1882f.f5478g);
                return;
            } else {
                m12329W0(c1911e0, c1882f.f5477f);
                return;
            }
        }
        int i10 = 1;
        if (c1882f.f5476e == -1) {
            int i11 = c1882f.f5477f;
            int iM3125j = this.f33676q[0].m3125j(i11);
            while (i10 < this.f33675p) {
                int iM3125j2 = this.f33676q[i10].m3125j(i11);
                if (iM3125j2 > iM3125j) {
                    iM3125j = iM3125j2;
                }
                i10++;
            }
            int i12 = i11 - iM3125j;
            m12328V0(c1911e0, i12 < 0 ? c1882f.f5478g : c1882f.f5478g - Math.min(i12, c1882f.f5473b));
            return;
        }
        int i13 = c1882f.f5478g;
        int iM3123h = this.f33676q[0].m3123h(i13);
        while (i10 < this.f33675p) {
            int iM3123h2 = this.f33676q[i10].m3123h(i13);
            if (iM3123h2 < iM3123h) {
                iM3123h = iM3123h2;
            }
            i10++;
        }
        int i14 = iM3123h - c1882f.f5478g;
        if (i14 < 0) {
            iMin = c1882f.f5477f;
        } else {
            iMin = Math.min(i14, c1882f.f5473b) + c1882f.f5477f;
        }
        m12329W0(c1911e0, iMin);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: V */
    public final void mo2940V(int i10, int i11) {
        m12320N0(i10, i11, 1);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m12328V0(C1911e0 c1911e0, int i10) {
        for (int iM2985v = m2985v() - 1; iM2985v >= 0; iM2985v--) {
            View viewM2983u = m2983u(iM2985v);
            if (this.f33677r.mo2879e(viewM2983u) < i10 || this.f33677r.mo2888o(viewM2983u) < i10) {
                return;
            }
            C1943u0 c1943u0 = (C1943u0) viewM2983u.getLayoutParams();
            c1943u0.getClass();
            if (((ArrayList) c1943u0.f5742e.f5772f).size() == 1) {
                return;
            }
            C1949x0 c1949x0 = c1943u0.f5742e;
            ArrayList arrayList = (ArrayList) c1949x0.f5772f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C1943u0 c1943u1 = (C1943u0) view.getLayoutParams();
            c1943u1.f5742e = null;
            if (c1943u1.f5557a.m3095j() || c1943u1.f5557a.m3098m()) {
                c1949x0.f5770d -= ((StaggeredGridLayoutManager) c1949x0.f5773g).f33677r.mo2877c(view);
            }
            if (size == 1) {
                c1949x0.f5768b = Integer.MIN_VALUE;
            }
            c1949x0.f5769c = Integer.MIN_VALUE;
            m2958h0(viewM2983u, c1911e0);
        }
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: W */
    public final void mo2941W() {
        this.f33665B.m16145e();
        m2964k0();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m12329W0(C1911e0 c1911e0, int i10) {
        while (m2985v() > 0) {
            View viewM2983u = m2983u(0);
            if (this.f33677r.mo2876b(viewM2983u) > i10 || this.f33677r.mo2887n(viewM2983u) > i10) {
                return;
            }
            C1943u0 c1943u0 = (C1943u0) viewM2983u.getLayoutParams();
            c1943u0.getClass();
            if (((ArrayList) c1943u0.f5742e.f5772f).size() == 1) {
                return;
            }
            C1949x0 c1949x0 = c1943u0.f5742e;
            ArrayList arrayList = (ArrayList) c1949x0.f5772f;
            View view = (View) arrayList.remove(0);
            C1943u0 c1943u1 = (C1943u0) view.getLayoutParams();
            c1943u1.f5742e = null;
            if (arrayList.size() == 0) {
                c1949x0.f5769c = Integer.MIN_VALUE;
            }
            if (c1943u1.f5557a.m3095j() || c1943u1.f5557a.m3098m()) {
                c1949x0.f5770d -= ((StaggeredGridLayoutManager) c1949x0.f5773g).f33677r.mo2877c(view);
            }
            c1949x0.f5768b = Integer.MIN_VALUE;
            m2958h0(viewM2983u, c1911e0);
        }
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: X */
    public final void mo2942X(int i10, int i11) {
        m12320N0(i10, i11, 8);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m12330X0() {
        if (this.f33679t == 1 || !m12322P0()) {
            this.f33683x = this.f33682w;
        } else {
            this.f33683x = !this.f33682w;
        }
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: Y */
    public final void mo2943Y(int i10, int i11) {
        m12320N0(i10, i11, 2);
    }

    /* JADX INFO: renamed from: Y0 */
    public final int m12331Y0(int i10, C1911e0 c1911e0, C1925l0 c1925l0) {
        if (m2985v() == 0 || i10 == 0) {
            return 0;
        }
        m12326T0(i10, c1925l0);
        C1882F c1882f = this.f33681v;
        int iM12311E0 = m12311E0(c1911e0, c1882f, c1925l0);
        if (c1882f.f5473b >= iM12311E0) {
            i10 = i10 < 0 ? -iM12311E0 : iM12311E0;
        }
        this.f33677r.mo2889p(-i10);
        this.f33667D = this.f33683x;
        c1882f.f5473b = 0;
        m12327U0(c1911e0, c1882f);
        return i10;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: Z */
    public final void mo2944Z(int i10, int i11) {
        m12320N0(i10, i11, 4);
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m12332Z0(int i10) {
        C1882F c1882f = this.f33681v;
        c1882f.f5476e = i10;
        c1882f.f5475d = this.f33683x != (i10 == -1) ? -1 : 1;
    }

    @Override // p084D4.InterfaceC1923k0
    /* JADX INFO: renamed from: a */
    public final PointF mo3080a(int i10) {
        int iM12335z0 = m12335z0(i10);
        PointF pointF = new PointF();
        if (iM12335z0 == 0) {
            return null;
        }
        if (this.f33679t == 0) {
            pointF.x = iM12335z0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iM12335z0;
        }
        return pointF;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: a0 */
    public final void mo2945a0(C1911e0 c1911e0, C1925l0 c1925l0) {
        m12324R0(c1911e0, c1925l0, true);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m12333a1(int i10, C1925l0 c1925l0) {
        int iMo2886l;
        int iMo2886l2;
        int i11;
        C1882F c1882f = this.f33681v;
        boolean z6 = false;
        c1882f.f5473b = 0;
        c1882f.f5474c = i10;
        C1886J c1886j = this.f5546e;
        if (!(c1886j != null && c1886j.f5504e) || (i11 = c1925l0.f5636a) == -1) {
            iMo2886l = 0;
            iMo2886l2 = 0;
        } else {
            if (this.f33683x == (i11 < i10)) {
                iMo2886l = this.f33677r.mo2886l();
                iMo2886l2 = 0;
            } else {
                iMo2886l2 = this.f33677r.mo2886l();
                iMo2886l = 0;
            }
        }
        RecyclerView recyclerView = this.f5543b;
        if (recyclerView == null || !recyclerView.f33654v0) {
            c1882f.f5478g = this.f33677r.mo2880f() + iMo2886l;
            c1882f.f5477f = -iMo2886l2;
        } else {
            c1882f.f5477f = this.f33677r.mo2885k() - iMo2886l2;
            c1882f.f5478g = this.f33677r.mo2881g() + iMo2886l;
        }
        c1882f.f5479h = false;
        c1882f.f5472a = true;
        if (this.f33677r.mo2883i() == 0 && this.f33677r.mo2880f() == 0) {
            z6 = true;
        }
        c1882f.f5480i = z6;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: b0 */
    public final void mo2947b0(C1925l0 c1925l0) {
        this.f33685z = -1;
        this.f33664A = Integer.MIN_VALUE;
        this.f33669F = null;
        this.f33671H.m3112a();
    }

    /* JADX INFO: renamed from: b1 */
    public final void m12334b1(C1949x0 c1949x0, int i10, int i11) {
        int i12 = c1949x0.f5770d;
        int i13 = c1949x0.f5771e;
        if (i10 != -1) {
            int i14 = c1949x0.f5769c;
            if (i14 == Integer.MIN_VALUE) {
                c1949x0.m3116a();
                i14 = c1949x0.f5769c;
            }
            if (i14 - i12 >= i11) {
                this.f33684y.set(i13, false);
                return;
            }
            return;
        }
        int i15 = c1949x0.f5768b;
        if (i15 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) c1949x0.f5772f).get(0);
            C1943u0 c1943u0 = (C1943u0) view.getLayoutParams();
            c1949x0.f5768b = ((StaggeredGridLayoutManager) c1949x0.f5773g).f33677r.mo2879e(view);
            c1943u0.getClass();
            i15 = c1949x0.f5768b;
        }
        if (i15 + i12 <= i11) {
            this.f33684y.set(i13, false);
        }
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: c */
    public final void mo2948c(String str) {
        if (this.f33669F == null) {
            super.mo2948c(str);
        }
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: c0 */
    public final void mo2949c0(Parcelable parcelable) {
        if (parcelable instanceof C1947w0) {
            C1947w0 c1947w0 = (C1947w0) parcelable;
            this.f33669F = c1947w0;
            if (this.f33685z != -1) {
                c1947w0.f5759p0 = null;
                c1947w0.f5758o0 = 0;
                c1947w0.f5756Y = -1;
                c1947w0.f5757Z = -1;
                c1947w0.f5759p0 = null;
                c1947w0.f5758o0 = 0;
                c1947w0.f5760q0 = 0;
                c1947w0.f5761r0 = null;
                c1947w0.f5762s0 = null;
            }
            m2964k0();
        }
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: d */
    public final boolean mo2950d() {
        return this.f33679t == 0;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: d0 */
    public final Parcelable mo2951d0() {
        int iM3125j;
        int iMo2885k;
        int[] iArr;
        C1947w0 c1947w0 = this.f33669F;
        if (c1947w0 != null) {
            C1947w0 c1947w1 = new C1947w0();
            c1947w1.f5758o0 = c1947w0.f5758o0;
            c1947w1.f5756Y = c1947w0.f5756Y;
            c1947w1.f5757Z = c1947w0.f5757Z;
            c1947w1.f5759p0 = c1947w0.f5759p0;
            c1947w1.f5760q0 = c1947w0.f5760q0;
            c1947w1.f5761r0 = c1947w0.f5761r0;
            c1947w1.f5763t0 = c1947w0.f5763t0;
            c1947w1.f5764u0 = c1947w0.f5764u0;
            c1947w1.f5765v0 = c1947w0.f5765v0;
            c1947w1.f5762s0 = c1947w0.f5762s0;
            return c1947w1;
        }
        C1947w0 c1947w2 = new C1947w0();
        c1947w2.f5763t0 = this.f33682w;
        c1947w2.f5764u0 = this.f33667D;
        c1947w2.f5765v0 = this.f33668E;
        C15026j c15026j = this.f33665B;
        if (c15026j == null || (iArr = (int[]) c15026j.f46724Y) == null) {
            c1947w2.f5760q0 = 0;
        } else {
            c1947w2.f5761r0 = iArr;
            c1947w2.f5760q0 = iArr.length;
            c1947w2.f5762s0 = (ArrayList) c15026j.f46725Z;
        }
        if (m2985v() > 0) {
            c1947w2.f5756Y = this.f33667D ? m12317K0() : m12316J0();
            View viewM12312F0 = this.f33683x ? m12312F0(true) : m12313G0(true);
            c1947w2.f5757Z = viewM12312F0 != null ? AbstractC1900Y.m2917F(viewM12312F0) : -1;
            int i10 = this.f33675p;
            c1947w2.f5758o0 = i10;
            c1947w2.f5759p0 = new int[i10];
            for (int i11 = 0; i11 < this.f33675p; i11++) {
                if (this.f33667D) {
                    iM3125j = this.f33676q[i11].m3123h(Integer.MIN_VALUE);
                    if (iM3125j != Integer.MIN_VALUE) {
                        iMo2885k = this.f33677r.mo2881g();
                        iM3125j -= iMo2885k;
                    }
                } else {
                    iM3125j = this.f33676q[i11].m3125j(Integer.MIN_VALUE);
                    if (iM3125j != Integer.MIN_VALUE) {
                        iMo2885k = this.f33677r.mo2885k();
                        iM3125j -= iMo2885k;
                    }
                }
                c1947w2.f5759p0[i11] = iM3125j;
            }
        } else {
            c1947w2.f5756Y = -1;
            c1947w2.f5757Z = -1;
            c1947w2.f5758o0 = 0;
        }
        return c1947w2;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: e */
    public final boolean mo2952e() {
        return this.f33679t == 1;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: e0 */
    public final void mo2953e0(int i10) {
        if (i10 == 0) {
            m12307A0();
        }
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: f */
    public final boolean mo2954f(C1901Z c1901z) {
        return c1901z instanceof C1943u0;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: h */
    public final void mo2957h(int i10, int i11, C1925l0 c1925l0, C1878B c1878b) {
        C1882F c1882f;
        int iM3123h;
        int iM3125j;
        if (this.f33679t != 0) {
            i10 = i11;
        }
        if (m2985v() == 0 || i10 == 0) {
            return;
        }
        m12326T0(i10, c1925l0);
        int[] iArr = this.f33673J;
        if (iArr == null || iArr.length < this.f33675p) {
            this.f33673J = new int[this.f33675p];
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f33675p;
            c1882f = this.f33681v;
            if (i12 >= i14) {
                break;
            }
            if (c1882f.f5475d == -1) {
                iM3123h = c1882f.f5477f;
                iM3125j = this.f33676q[i12].m3125j(iM3123h);
            } else {
                iM3123h = this.f33676q[i12].m3123h(c1882f.f5478g);
                iM3125j = c1882f.f5478g;
            }
            int i15 = iM3123h - iM3125j;
            if (i15 >= 0) {
                this.f33673J[i13] = i15;
                i13++;
            }
            i12++;
        }
        Arrays.sort(this.f33673J, 0, i13);
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = c1882f.f5474c;
            if (i17 < 0 || i17 >= c1925l0.m3082b()) {
                return;
            }
            c1878b.m2861b(c1882f.f5474c, this.f33673J[i16]);
            c1882f.f5474c += c1882f.f5475d;
        }
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: j */
    public final int mo2961j(C1925l0 c1925l0) {
        return m12308B0(c1925l0);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: k */
    public final int mo2963k(C1925l0 c1925l0) {
        return m12309C0(c1925l0);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: l */
    public final int mo2965l(C1925l0 c1925l0) {
        return m12310D0(c1925l0);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: l0 */
    public final int mo2966l0(int i10, C1911e0 c1911e0, C1925l0 c1925l0) {
        return m12331Y0(i10, c1911e0, c1925l0);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: m */
    public final int mo2967m(C1925l0 c1925l0) {
        return m12308B0(c1925l0);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: m0 */
    public final void mo2968m0(int i10) {
        C1947w0 c1947w0 = this.f33669F;
        if (c1947w0 != null && c1947w0.f5756Y != i10) {
            c1947w0.f5759p0 = null;
            c1947w0.f5758o0 = 0;
            c1947w0.f5756Y = -1;
            c1947w0.f5757Z = -1;
        }
        this.f33685z = i10;
        this.f33664A = Integer.MIN_VALUE;
        m2964k0();
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: n */
    public final int mo2969n(C1925l0 c1925l0) {
        return m12309C0(c1925l0);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: n0 */
    public final int mo2970n0(int i10, C1911e0 c1911e0, C1925l0 c1925l0) {
        return m12331Y0(i10, c1911e0, c1925l0);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: o */
    public final int mo2971o(C1925l0 c1925l0) {
        return m12310D0(c1925l0);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: q0 */
    public final void mo2976q0(Rect rect, int i10, int i11) {
        int iM2921g;
        int iM2921g2;
        int i12 = this.f33675p;
        int iM2926D = m2926D() + m2925C();
        int iM2924B = m2924B() + m2927E();
        if (this.f33679t == 1) {
            int iHeight = rect.height() + iM2924B;
            RecyclerView recyclerView = this.f5543b;
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            iM2921g2 = AbstractC1900Y.m2921g(i11, iHeight, recyclerView.getMinimumHeight());
            iM2921g = AbstractC1900Y.m2921g(i10, (this.f33680u * i12) + iM2926D, this.f5543b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM2926D;
            RecyclerView recyclerView2 = this.f5543b;
            WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
            iM2921g = AbstractC1900Y.m2921g(i10, iWidth, recyclerView2.getMinimumWidth());
            iM2921g2 = AbstractC1900Y.m2921g(i11, (this.f33680u * i12) + iM2924B, this.f5543b.getMinimumHeight());
        }
        this.f5543b.setMeasuredDimension(iM2921g, iM2921g2);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: r */
    public final C1901Z mo2977r() {
        return this.f33679t == 0 ? new C1943u0(-2, -1) : new C1943u0(-1, -2);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: s */
    public final C1901Z mo2979s(Context context, AttributeSet attributeSet) {
        return new C1943u0(context, attributeSet);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: t */
    public final C1901Z mo2981t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1943u0((ViewGroup.MarginLayoutParams) layoutParams) : new C1943u0(layoutParams);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: w0 */
    public final void mo2987w0(RecyclerView recyclerView, int i10) {
        C1886J c1886j = new C1886J(recyclerView.getContext());
        c1886j.f5500a = i10;
        m2989x0(c1886j);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: y0 */
    public final boolean mo2991y0() {
        return this.f33669F == null;
    }

    /* JADX INFO: renamed from: z0 */
    public final int m12335z0(int i10) {
        if (m2985v() == 0) {
            return this.f33683x ? 1 : -1;
        }
        return (i10 < m12316J0()) != this.f33683x ? -1 : 1;
    }
}
