package androidx.recyclerview.widget;

import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import p001A.AbstractC0010F;
import p030B2.AbstractC0738T;
import p056C2.C1512f;
import p057C3.C1529G;
import p084D4.AbstractC1900Y;
import p084D4.C1878B;
import p084D4.C1881E;
import p084D4.C1883G;
import p084D4.C1884H;
import p084D4.C1901Z;
import p084D4.C1911e0;
import p084D4.C1925l0;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: E */
    public boolean f33557E;

    /* JADX INFO: renamed from: F */
    public int f33558F;

    /* JADX INFO: renamed from: G */
    public int[] f33559G;

    /* JADX INFO: renamed from: H */
    public View[] f33560H;

    /* JADX INFO: renamed from: I */
    public final SparseIntArray f33561I;

    /* JADX INFO: renamed from: J */
    public final SparseIntArray f33562J;

    /* JADX INFO: renamed from: K */
    public final C15384c f33563K;

    /* JADX INFO: renamed from: L */
    public final Rect f33564L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f33557E = false;
        this.f33558F = -1;
        this.f33561I = new SparseIntArray();
        this.f33562J = new SparseIntArray();
        this.f33563K = new C15384c(4);
        this.f33564L = new Rect();
        m12216k1(AbstractC1900Y.m2918G(context, attributeSet, i10, i11).f5539b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: A0 */
    public final void mo12204A0(C1925l0 c1925l0, C1884H c1884h, C1878B c1878b) {
        int i10;
        int i11 = this.f33558F;
        for (int i12 = 0; i12 < this.f33558F && (i10 = c1884h.f5488d) >= 0 && i10 < c1925l0.m3082b() && i11 > 0; i12++) {
            c1878b.m2861b(c1884h.f5488d, Math.max(0, c1884h.f5491g));
            this.f33563K.getClass();
            i11--;
            c1884h.f5488d += c1884h.f5489e;
        }
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: H */
    public final int mo2928H(C1911e0 c1911e0, C1925l0 c1925l0) {
        if (this.f33569p == 0) {
            return this.f33558F;
        }
        if (c1925l0.m3082b() < 1) {
            return 0;
        }
        return m12212g1(c1925l0.m3082b() - 1, c1911e0, c1925l0) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: M0 */
    public final View mo12205M0(C1911e0 c1911e0, C1925l0 c1925l0, boolean z6, boolean z10) {
        int i10;
        int iM2985v;
        int iM2985v2 = m2985v();
        int i11 = 1;
        if (z10) {
            iM2985v = m2985v() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iM2985v2;
            iM2985v = 0;
        }
        int iM3082b = c1925l0.m3082b();
        m12222F0();
        int iMo2885k = this.f33571r.mo2885k();
        int iMo2881g = this.f33571r.mo2881g();
        View view = null;
        View view2 = null;
        while (iM2985v != i10) {
            View viewM2983u = m2983u(iM2985v);
            int iM2917F = AbstractC1900Y.m2917F(viewM2983u);
            if (iM2917F >= 0 && iM2917F < iM3082b && m12213h1(iM2917F, c1911e0, c1925l0) == 0) {
                if (((C1901Z) viewM2983u.getLayoutParams()).f5557a.m3095j()) {
                    if (view2 == null) {
                        view2 = viewM2983u;
                    }
                } else {
                    if (this.f33571r.mo2879e(viewM2983u) < iMo2881g && this.f33571r.mo2876b(viewM2983u) >= iMo2885k) {
                        return viewM2983u;
                    }
                    if (view == null) {
                        view = viewM2983u;
                    }
                }
            }
            iM2985v += i11;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x011c  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e1, code lost:
    
        if (r13 == (r2 > r15)) goto L55;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo2935Q(View view, int i10, C1911e0 c1911e0, C1925l0 c1925l0) {
        View viewM12257D;
        int iM2985v;
        int i11;
        int iM2985v2;
        View view2;
        View view3;
        int i12;
        C1911e0 c1911e1 = c1911e0;
        C1925l0 c1925l1 = c1925l0;
        RecyclerView recyclerView = this.f5543b;
        View view4 = null;
        if (recyclerView == null || (viewM12257D = recyclerView.m12257D(view)) == null || ((ArrayList) this.f5542a.f5616Z).contains(viewM12257D)) {
            viewM12257D = null;
        }
        if (viewM12257D == null) {
            return null;
        }
        C1881E c1881e = (C1881E) viewM12257D.getLayoutParams();
        int i13 = c1881e.f5470e;
        int i14 = c1881e.f5471f + i13;
        if (super.mo2935Q(view, i10, c1911e0, c1925l0) == null) {
            return null;
        }
        if ((m12221E0(i10) == 1) != this.f33574u) {
            iM2985v2 = m2985v() - 1;
            iM2985v = -1;
            i11 = -1;
        } else {
            iM2985v = m2985v();
            i11 = 1;
            iM2985v2 = 0;
        }
        boolean z6 = this.f33569p == 1 && m12233R0();
        int iM12212g1 = m12212g1(iM2985v2, c1911e1, c1925l1);
        int i15 = -1;
        int i16 = -1;
        int i17 = i11;
        int iMin = 0;
        int iMin2 = 0;
        int i18 = iM2985v2;
        View view5 = null;
        while (i18 != iM2985v) {
            int i19 = iM2985v;
            int iM12212g2 = m12212g1(i18, c1911e1, c1925l1);
            View viewM2983u = m2983u(i18);
            if (viewM2983u == viewM12257D) {
                break;
            }
            if (!viewM2983u.hasFocusable() || iM12212g2 == iM12212g1) {
                C1881E c1881e2 = (C1881E) viewM2983u.getLayoutParams();
                int i20 = c1881e2.f5470e;
                view2 = viewM12257D;
                int i21 = c1881e2.f5471f + i20;
                if (viewM2983u.hasFocusable() && i20 == i13 && i21 == i14) {
                    return viewM2983u;
                }
                if (!(viewM2983u.hasFocusable() && view4 == null) && (viewM2983u.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int iMin3 = Math.min(i21, i14) - Math.max(i20, i13);
                    if (!viewM2983u.hasFocusable()) {
                        if (view4 == null) {
                            i12 = iMin;
                            if (!this.f5544c.m12500D(viewM2983u) || !this.f5545d.m12500D(viewM2983u)) {
                                if (iMin3 <= iMin2) {
                                    if (iMin3 == iMin2) {
                                        if (z6 == (i20 > i15)) {
                                        }
                                        i18 += i17;
                                        c1911e1 = c1911e0;
                                        c1925l1 = c1925l0;
                                        iM2985v = i19;
                                        viewM12257D = view2;
                                    }
                                }
                                if (viewM2983u.hasFocusable()) {
                                    int i22 = c1881e2.f5470e;
                                    iMin = Math.min(i21, i14) - Math.max(i20, i13);
                                    i16 = i22;
                                    view5 = view3;
                                    view4 = viewM2983u;
                                } else {
                                    int i23 = c1881e2.f5470e;
                                    iMin2 = Math.min(i21, i14) - Math.max(i20, i13);
                                    i15 = i23;
                                    iMin = i12;
                                    view5 = viewM2983u;
                                }
                                i18 += i17;
                                c1911e1 = c1911e0;
                                c1925l1 = c1925l0;
                                iM2985v = i19;
                                viewM12257D = view2;
                            }
                        }
                        iMin = i12;
                        view5 = view3;
                        i18 += i17;
                        c1911e1 = c1911e0;
                        c1925l1 = c1925l0;
                        iM2985v = i19;
                        viewM12257D = view2;
                    } else if (iMin3 <= iMin) {
                        if (iMin3 == iMin) {
                        }
                    }
                } else {
                    view3 = view5;
                }
                i12 = iMin;
                if (viewM2983u.hasFocusable()) {
                    int i24 = c1881e2.f5470e;
                    iMin = Math.min(i21, i14) - Math.max(i20, i13);
                    i16 = i24;
                    view5 = view3;
                    view4 = viewM2983u;
                } else {
                    int i25 = c1881e2.f5470e;
                    iMin2 = Math.min(i21, i14) - Math.max(i20, i13);
                    i15 = i25;
                    iMin = i12;
                    view5 = viewM2983u;
                }
                i18 += i17;
                c1911e1 = c1911e0;
                c1925l1 = c1925l0;
                iM2985v = i19;
                viewM12257D = view2;
            } else {
                if (view4 != null) {
                    break;
                }
                view2 = viewM12257D;
                view3 = view5;
            }
            i12 = iMin;
            iMin = i12;
            view5 = view3;
            i18 += i17;
            c1911e1 = c1911e0;
            c1925l1 = c1925l0;
            iM2985v = i19;
            viewM12257D = view2;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: S */
    public final void mo2937S(C1911e0 c1911e0, C1925l0 c1925l0, C1512f c1512f) {
        super.mo2937S(c1911e0, c1925l0, c1512f);
        c1512f.m2219i(GridView.class.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v37 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: S0 */
    public final void mo12206S0(C1911e0 c1911e0, C1925l0 c1925l0, C1884H c1884h, C1883G c1883g) {
        int i10;
        int i11;
        int i12;
        int iMo2878d;
        int iM2925C;
        int iM2927E;
        int iMo2878d2;
        int iM2922w;
        int iM2922w2;
        ?? r10;
        int i13;
        View viewM2867b;
        int iMo2884j = this.f33571r.mo2884j();
        boolean z6 = iMo2884j != 1073741824;
        int i14 = m2985v() > 0 ? this.f33559G[this.f33558F] : 0;
        if (z6) {
            m12217l1();
        }
        boolean z10 = c1884h.f5489e == 1;
        int iM12213h1 = this.f33558F;
        if (!z10) {
            iM12213h1 = m12213h1(c1884h.f5488d, c1911e0, c1925l0) + m12214i1(c1884h.f5488d, c1911e0, c1925l0);
        }
        int i15 = 0;
        while (i15 < this.f33558F && (i13 = c1884h.f5488d) >= 0 && i13 < c1925l0.m3082b() && iM12213h1 > 0) {
            int i16 = c1884h.f5488d;
            int iM12214i1 = m12214i1(i16, c1911e0, c1925l0);
            if (iM12214i1 > this.f33558F) {
                throw new IllegalArgumentException(AbstractC10763a.m11056n(AbstractC0010F.m21e("Item at position ", i16, " requires ", iM12214i1, " spans but GridLayoutManager has only "), this.f33558F, " spans."));
            }
            iM12213h1 -= iM12214i1;
            if (iM12213h1 < 0 || (viewM2867b = c1884h.m2867b(c1911e0)) == null) {
                break;
            }
            this.f33560H[i15] = viewM2867b;
            i15++;
        }
        if (i15 == 0) {
            c1883g.f5482b = true;
            return;
        }
        if (z10) {
            i12 = 1;
            i11 = i15;
            i10 = 0;
        } else {
            i10 = i15 - 1;
            i11 = -1;
            i12 = -1;
        }
        int i17 = 0;
        while (i10 != i11) {
            View view = this.f33560H[i10];
            C1881E c1881e = (C1881E) view.getLayoutParams();
            int iM12214i2 = m12214i1(AbstractC1900Y.m2917F(view), c1911e0, c1925l0);
            c1881e.f5471f = iM12214i2;
            c1881e.f5470e = i17;
            i17 += iM12214i2;
            i10 += i12;
        }
        float f10 = 0.0f;
        int i18 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            View view2 = this.f33560H[i19];
            if (c1884h.f5495k != null) {
                r10 = 0;
                r10 = 0;
                if (z10) {
                    m2946b(view2, -1, true);
                } else {
                    m2946b(view2, 0, true);
                }
            } else if (z10) {
                r10 = 0;
                m2946b(view2, -1, false);
            } else {
                r10 = 0;
                m2946b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f5543b;
            Rect rect = this.f33564L;
            if (recyclerView == null) {
                rect.set(r10, r10, r10, r10);
            } else {
                rect.set(recyclerView.m12264N(view2));
            }
            m12215j1(view2, iMo2884j, r10);
            int iMo2877c = this.f33571r.mo2877c(view2);
            if (iMo2877c > i18) {
                i18 = iMo2877c;
            }
            float fMo2878d = (this.f33571r.mo2878d(view2) * 1.0f) / ((C1881E) view2.getLayoutParams()).f5471f;
            if (fMo2878d > f10) {
                f10 = fMo2878d;
            }
        }
        if (z6) {
            m12209d1(Math.max(Math.round(f10 * this.f33558F), i14));
            i18 = 0;
            for (int i20 = 0; i20 < i15; i20++) {
                View view3 = this.f33560H[i20];
                m12215j1(view3, 1073741824, true);
                int iMo2877c2 = this.f33571r.mo2877c(view3);
                if (iMo2877c2 > i18) {
                    i18 = iMo2877c2;
                }
            }
        }
        for (int i21 = 0; i21 < i15; i21++) {
            View view4 = this.f33560H[i21];
            if (this.f33571r.mo2877c(view4) != i18) {
                C1881E c1881e2 = (C1881E) view4.getLayoutParams();
                Rect rect2 = c1881e2.f5558b;
                int i22 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1881e2).topMargin + ((ViewGroup.MarginLayoutParams) c1881e2).bottomMargin;
                int i23 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c1881e2).leftMargin + ((ViewGroup.MarginLayoutParams) c1881e2).rightMargin;
                int iM12211f1 = m12211f1(c1881e2.f5470e, c1881e2.f5471f);
                if (this.f33569p == 1) {
                    iM2922w2 = AbstractC1900Y.m2922w(false, iM12211f1, 1073741824, i23, ((ViewGroup.MarginLayoutParams) c1881e2).width);
                    iM2922w = View.MeasureSpec.makeMeasureSpec(i18 - i22, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - i23, 1073741824);
                    iM2922w = AbstractC1900Y.m2922w(false, iM12211f1, 1073741824, i22, ((ViewGroup.MarginLayoutParams) c1881e2).height);
                    iM2922w2 = iMakeMeasureSpec;
                }
                if (m2986v0(view4, iM2922w2, iM2922w, (C1901Z) view4.getLayoutParams())) {
                    view4.measure(iM2922w2, iM2922w);
                }
            }
        }
        c1883g.f5481a = i18;
        if (this.f33569p != 1) {
            if (c1884h.f5490f == -1) {
                int i24 = c1884h.f5486b;
                iM2925C = i24 - i18;
                iMo2878d = i24;
            } else {
                int i25 = c1884h.f5486b;
                iMo2878d = i25 + i18;
                iM2925C = i25;
            }
            iM2927E = 0;
            iMo2878d2 = 0;
        } else if (c1884h.f5490f == -1) {
            iMo2878d2 = c1884h.f5486b;
            iM2927E = iMo2878d2 - i18;
            iM2925C = 0;
            iMo2878d = 0;
        } else {
            int i26 = c1884h.f5486b;
            iM2927E = i26;
            iMo2878d = 0;
            iMo2878d2 = i26 + i18;
            iM2925C = 0;
        }
        for (int i27 = 0; i27 < i15; i27++) {
            View view5 = this.f33560H[i27];
            C1881E c1881e3 = (C1881E) view5.getLayoutParams();
            if (this.f33569p != 1) {
                iM2927E = m2927E() + this.f33559G[c1881e3.f5470e];
                iMo2878d2 = this.f33571r.mo2878d(view5) + iM2927E;
            } else if (m12233R0()) {
                int iM2925C2 = m2925C() + this.f33559G[this.f33558F - c1881e3.f5470e];
                iMo2878d = iM2925C2;
                iM2925C = iM2925C2 - this.f33571r.mo2878d(view5);
            } else {
                iM2925C = m2925C() + this.f33559G[c1881e3.f5470e];
                iMo2878d = this.f33571r.mo2878d(view5) + iM2925C;
            }
            AbstractC1900Y.m2920L(view5, iM2925C, iM2927E, iMo2878d, iMo2878d2);
            if (c1881e3.f5557a.m3095j() || c1881e3.f5557a.m3098m()) {
                c1883g.f5483c = true;
            }
            c1883g.f5484d = view5.hasFocusable() | c1883g.f5484d;
        }
        Arrays.fill(this.f33560H, (Object) null);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: T */
    public final void mo2938T(C1911e0 c1911e0, C1925l0 c1925l0, View view, C1512f c1512f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1881E)) {
            m2939U(view, c1512f);
            return;
        }
        C1881E c1881e = (C1881E) layoutParams;
        int iM12212g1 = m12212g1(c1881e.f5557a.m3088c(), c1911e0, c1925l0);
        int i10 = this.f33569p;
        AccessibilityNodeInfo accessibilityNodeInfo = c1512f.f4042a;
        if (i10 == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(c1881e.f5470e, c1881e.f5471f, iM12212g1, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iM12212g1, 1, c1881e.f5470e, c1881e.f5471f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: T0 */
    public final void mo12207T0(C1911e0 c1911e0, C1925l0 c1925l0, C1529G c1529g, int i10) {
        m12217l1();
        if (c1925l0.m3082b() > 0 && !c1925l0.f5642g) {
            boolean z6 = i10 == 1;
            int iM12213h1 = m12213h1(c1529g.f4108b, c1911e0, c1925l0);
            if (z6) {
                while (iM12213h1 > 0) {
                    int i11 = c1529g.f4108b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    c1529g.f4108b = i12;
                    iM12213h1 = m12213h1(i12, c1911e0, c1925l0);
                }
            } else {
                int iM3082b = c1925l0.m3082b() - 1;
                int i13 = c1529g.f4108b;
                while (i13 < iM3082b) {
                    int i14 = i13 + 1;
                    int iM12213h2 = m12213h1(i14, c1911e0, c1925l0);
                    if (iM12213h2 <= iM12213h1) {
                        break;
                    }
                    i13 = i14;
                    iM12213h1 = iM12213h2;
                }
                c1529g.f4108b = i13;
            }
        }
        m12210e1();
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: V */
    public final void mo2940V(int i10, int i11) {
        C15384c c15384c = this.f33563K;
        c15384c.m16642s();
        ((SparseIntArray) c15384c.f47968o0).clear();
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: W */
    public final void mo2941W() {
        C15384c c15384c = this.f33563K;
        c15384c.m16642s();
        ((SparseIntArray) c15384c.f47968o0).clear();
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: X */
    public final void mo2942X(int i10, int i11) {
        C15384c c15384c = this.f33563K;
        c15384c.m16642s();
        ((SparseIntArray) c15384c.f47968o0).clear();
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: Y */
    public final void mo2943Y(int i10, int i11) {
        C15384c c15384c = this.f33563K;
        c15384c.m16642s();
        ((SparseIntArray) c15384c.f47968o0).clear();
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: Z */
    public final void mo2944Z(int i10, int i11) {
        C15384c c15384c = this.f33563K;
        c15384c.m16642s();
        ((SparseIntArray) c15384c.f47968o0).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: Z0 */
    public final void mo12208Z0(boolean z6) {
        if (z6) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo12208Z0(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: a0 */
    public final void mo2945a0(C1911e0 c1911e0, C1925l0 c1925l0) {
        boolean z6 = c1925l0.f5642g;
        SparseIntArray sparseIntArray = this.f33562J;
        SparseIntArray sparseIntArray2 = this.f33561I;
        if (z6) {
            int iM2985v = m2985v();
            for (int i10 = 0; i10 < iM2985v; i10++) {
                C1881E c1881e = (C1881E) m2983u(i10).getLayoutParams();
                int iM3088c = c1881e.f5557a.m3088c();
                sparseIntArray2.put(iM3088c, c1881e.f5471f);
                sparseIntArray.put(iM3088c, c1881e.f5470e);
            }
        }
        super.mo2945a0(c1911e0, c1925l0);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: b0 */
    public final void mo2947b0(C1925l0 c1925l0) {
        super.mo2947b0(c1925l0);
        this.f33557E = false;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m12209d1(int i10) {
        int i11;
        int[] iArr = this.f33559G;
        int i12 = this.f33558F;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 <= 0 || i12 - i13 >= i15) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                i13 -= i12;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.f33559G = iArr;
    }

    /* JADX INFO: renamed from: e1 */
    public final void m12210e1() {
        View[] viewArr = this.f33560H;
        if (viewArr == null || viewArr.length != this.f33558F) {
            this.f33560H = new View[this.f33558F];
        }
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: f */
    public final boolean mo2954f(C1901Z c1901z) {
        return c1901z instanceof C1881E;
    }

    /* JADX INFO: renamed from: f1 */
    public final int m12211f1(int i10, int i11) {
        if (this.f33569p != 1 || !m12233R0()) {
            int[] iArr = this.f33559G;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.f33559G;
        int i12 = this.f33558F;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    /* JADX INFO: renamed from: g1 */
    public final int m12212g1(int i10, C1911e0 c1911e0, C1925l0 c1925l0) {
        boolean z6 = c1925l0.f5642g;
        C15384c c15384c = this.f33563K;
        if (!z6) {
            int i11 = this.f33558F;
            c15384c.getClass();
            return C15384c.m16634p(i10, i11);
        }
        int iM3027b = c1911e0.m3027b(i10);
        if (iM3027b != -1) {
            int i12 = this.f33558F;
            c15384c.getClass();
            return C15384c.m16634p(iM3027b, i12);
        }
        AbstractC15256t.m16482t("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    /* JADX INFO: renamed from: h1 */
    public final int m12213h1(int i10, C1911e0 c1911e0, C1925l0 c1925l0) {
        boolean z6 = c1925l0.f5642g;
        C15384c c15384c = this.f33563K;
        if (!z6) {
            int i11 = this.f33558F;
            c15384c.getClass();
            return i10 % i11;
        }
        int i12 = this.f33562J.get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int iM3027b = c1911e0.m3027b(i10);
        if (iM3027b != -1) {
            int i13 = this.f33558F;
            c15384c.getClass();
            return iM3027b % i13;
        }
        AbstractC15256t.m16482t("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    /* JADX INFO: renamed from: i1 */
    public final int m12214i1(int i10, C1911e0 c1911e0, C1925l0 c1925l0) {
        boolean z6 = c1925l0.f5642g;
        C15384c c15384c = this.f33563K;
        if (!z6) {
            c15384c.getClass();
            return 1;
        }
        int i11 = this.f33561I.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        if (c1911e0.m3027b(i10) != -1) {
            c15384c.getClass();
            return 1;
        }
        AbstractC15256t.m16482t("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m12215j1(View view, int i10, boolean z6) {
        int iM2922w;
        int iM2922w2;
        C1881E c1881e = (C1881E) view.getLayoutParams();
        Rect rect = c1881e.f5558b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1881e).topMargin + ((ViewGroup.MarginLayoutParams) c1881e).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1881e).leftMargin + ((ViewGroup.MarginLayoutParams) c1881e).rightMargin;
        int iM12211f1 = m12211f1(c1881e.f5470e, c1881e.f5471f);
        if (this.f33569p == 1) {
            iM2922w2 = AbstractC1900Y.m2922w(false, iM12211f1, i10, i12, ((ViewGroup.MarginLayoutParams) c1881e).width);
            iM2922w = AbstractC1900Y.m2922w(true, this.f33571r.mo2886l(), this.f5554m, i11, ((ViewGroup.MarginLayoutParams) c1881e).height);
        } else {
            int iM2922w3 = AbstractC1900Y.m2922w(false, iM12211f1, i10, i11, ((ViewGroup.MarginLayoutParams) c1881e).height);
            int iM2922w4 = AbstractC1900Y.m2922w(true, this.f33571r.mo2886l(), this.f5553l, i12, ((ViewGroup.MarginLayoutParams) c1881e).width);
            iM2922w = iM2922w3;
            iM2922w2 = iM2922w4;
        }
        C1901Z c1901z = (C1901Z) view.getLayoutParams();
        if (z6 ? m2986v0(view, iM2922w2, iM2922w, c1901z) : m2982t0(view, iM2922w2, iM2922w, c1901z)) {
            view.measure(iM2922w2, iM2922w);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: k */
    public final int mo2963k(C1925l0 c1925l0) {
        return m12219C0(c1925l0);
    }

    /* JADX INFO: renamed from: k1 */
    public final void m12216k1(int i10) {
        if (i10 == this.f33558F) {
            return;
        }
        this.f33557E = true;
        if (i10 < 1) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Span count should be at least 1. Provided "));
        }
        this.f33558F = i10;
        this.f33563K.m16642s();
        m2964k0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: l */
    public final int mo2965l(C1925l0 c1925l0) {
        return m12220D0(c1925l0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: l0 */
    public final int mo2966l0(int i10, C1911e0 c1911e0, C1925l0 c1925l0) {
        m12217l1();
        m12210e1();
        return super.mo2966l0(i10, c1911e0, c1925l0);
    }

    /* JADX INFO: renamed from: l1 */
    public final void m12217l1() {
        int iM2924B;
        int iM2927E;
        if (this.f33569p == 1) {
            iM2924B = this.f5555n - m2926D();
            iM2927E = m2925C();
        } else {
            iM2924B = this.f5556o - m2924B();
            iM2927E = m2927E();
        }
        m12209d1(iM2924B - iM2927E);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: n */
    public final int mo2969n(C1925l0 c1925l0) {
        return m12219C0(c1925l0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: n0 */
    public final int mo2970n0(int i10, C1911e0 c1911e0, C1925l0 c1925l0) {
        m12217l1();
        m12210e1();
        return super.mo2970n0(i10, c1911e0, c1925l0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: o */
    public final int mo2971o(C1925l0 c1925l0) {
        return m12220D0(c1925l0);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: q0 */
    public final void mo2976q0(Rect rect, int i10, int i11) {
        int iM2921g;
        int iM2921g2;
        if (this.f33559G == null) {
            super.mo2976q0(rect, i10, i11);
        }
        int iM2926D = m2926D() + m2925C();
        int iM2924B = m2924B() + m2927E();
        if (this.f33569p == 1) {
            int iHeight = rect.height() + iM2924B;
            RecyclerView recyclerView = this.f5543b;
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            iM2921g2 = AbstractC1900Y.m2921g(i11, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f33559G;
            iM2921g = AbstractC1900Y.m2921g(i10, iArr[iArr.length - 1] + iM2926D, this.f5543b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM2926D;
            RecyclerView recyclerView2 = this.f5543b;
            WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
            iM2921g = AbstractC1900Y.m2921g(i10, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f33559G;
            iM2921g2 = AbstractC1900Y.m2921g(i11, iArr2[iArr2.length - 1] + iM2924B, this.f5543b.getMinimumHeight());
        }
        this.f5543b.setMeasuredDimension(iM2921g, iM2921g2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: r */
    public final C1901Z mo2977r() {
        return this.f33569p == 0 ? new C1881E(-2, -1) : new C1881E(-1, -2);
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: s */
    public final C1901Z mo2979s(Context context, AttributeSet attributeSet) {
        C1881E c1881e = new C1881E(context, attributeSet);
        c1881e.f5470e = -1;
        c1881e.f5471f = 0;
        return c1881e;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: t */
    public final C1901Z mo2981t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C1881E c1881e = new C1881E((ViewGroup.MarginLayoutParams) layoutParams);
            c1881e.f5470e = -1;
            c1881e.f5471f = 0;
            return c1881e;
        }
        C1881E c1881e2 = new C1881E(layoutParams);
        c1881e2.f5470e = -1;
        c1881e2.f5471f = 0;
        return c1881e2;
    }

    @Override // p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: x */
    public final int mo2988x(C1911e0 c1911e0, C1925l0 c1925l0) {
        if (this.f33569p == 1) {
            return this.f33558F;
        }
        if (c1925l0.m3082b() < 1) {
            return 0;
        }
        return m12212g1(c1925l0.m3082b() - 1, c1911e0, c1925l0) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p084D4.AbstractC1900Y
    /* JADX INFO: renamed from: y0 */
    public final boolean mo2991y0() {
        return this.f33579z == null && !this.f33557E;
    }

    public GridLayoutManager(int i10) {
        super(1);
        this.f33557E = false;
        this.f33558F = -1;
        this.f33561I = new SparseIntArray();
        this.f33562J = new SparseIntArray();
        this.f33563K = new C15384c(4);
        this.f33564L = new Rect();
        m12216k1(i10);
    }
}
