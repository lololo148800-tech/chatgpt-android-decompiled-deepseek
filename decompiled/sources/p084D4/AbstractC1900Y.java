package p084D4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p003A1.AbstractC0168G;
import p030B2.AbstractC0738T;
import p056C2.C1512f;
import p058C4.AbstractC1582a;
import p167Gb.C3032c;
import p658b5.C11234e;
import p692d0.C12959L;
import p720e6.C13287b;
import p720e6.C13288c;

/* JADX INFO: renamed from: D4.Y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1900Y {

    /* JADX INFO: renamed from: a */
    public C1920j f5542a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f5543b;

    /* JADX INFO: renamed from: c */
    public final C11234e f5544c;

    /* JADX INFO: renamed from: d */
    public final C11234e f5545d;

    /* JADX INFO: renamed from: e */
    public C1886J f5546e;

    /* JADX INFO: renamed from: f */
    public boolean f5547f;

    /* JADX INFO: renamed from: g */
    public boolean f5548g;

    /* JADX INFO: renamed from: h */
    public final boolean f5549h;

    /* JADX INFO: renamed from: i */
    public final boolean f5550i;

    /* JADX INFO: renamed from: j */
    public int f5551j;

    /* JADX INFO: renamed from: k */
    public boolean f5552k;

    /* JADX INFO: renamed from: l */
    public int f5553l;

    /* JADX INFO: renamed from: m */
    public int f5554m;

    /* JADX INFO: renamed from: n */
    public int f5555n;

    /* JADX INFO: renamed from: o */
    public int f5556o;

    public AbstractC1900Y() {
        C13287b c13287b = new C13287b(this, 6);
        C13288c c13288c = new C13288c(this);
        this.f5544c = new C11234e(c13287b);
        this.f5545d = new C11234e(c13288c);
        this.f5547f = false;
        this.f5548g = false;
        this.f5549h = true;
        this.f5550i = true;
    }

    /* JADX INFO: renamed from: F */
    public static int m2917F(View view) {
        return ((C1901Z) view.getLayoutParams()).f5557a.m3088c();
    }

    /* JADX INFO: renamed from: G */
    public static C1899X m2918G(Context context, AttributeSet attributeSet, int i10, int i11) {
        C1899X c1899x = new C1899X();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1582a.f4429a, i10, i11);
        c1899x.f5538a = typedArrayObtainStyledAttributes.getInt(0, 1);
        c1899x.f5539b = typedArrayObtainStyledAttributes.getInt(10, 1);
        c1899x.f5540c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c1899x.f5541d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c1899x;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m2919K(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i10;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i10;
        }
        return true;
    }

    /* JADX INFO: renamed from: L */
    public static void m2920L(View view, int i10, int i11, int i12, int i13) {
        C1901Z c1901z = (C1901Z) view.getLayoutParams();
        Rect rect = c1901z.f5558b;
        view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) c1901z).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) c1901z).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) c1901z).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c1901z).bottomMargin);
    }

    /* JADX INFO: renamed from: g */
    public static int m2921g(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i11, i12) : size;
        }
        return Math.min(size, Math.max(i11, i12));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    /* JADX INFO: renamed from: w */
    public static int m2922w(boolean z6, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, i10 - i12);
        if (z6) {
            if (i13 >= 0) {
                i11 = 1073741824;
            } else if (i13 != -1 || (i11 != Integer.MIN_VALUE && (i11 == 0 || i11 != 1073741824))) {
                i11 = 0;
                i13 = 0;
            } else {
                i13 = iMax;
            }
        } else if (i13 >= 0) {
            i11 = 1073741824;
        } else if (i13 == -1) {
            i13 = iMax;
        } else if (i13 != -2) {
            i11 = 0;
            i13 = 0;
        } else if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
            i13 = iMax;
            i11 = Integer.MIN_VALUE;
        } else {
            i13 = iMax;
            i11 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i13, i11);
    }

    /* JADX INFO: renamed from: A */
    public final int m2923A() {
        RecyclerView recyclerView = this.f5543b;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        return recyclerView.getLayoutDirection();
    }

    /* JADX INFO: renamed from: B */
    public final int m2924B() {
        RecyclerView recyclerView = this.f5543b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: C */
    public final int m2925C() {
        RecyclerView recyclerView = this.f5543b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: D */
    public final int m2926D() {
        RecyclerView recyclerView = this.f5543b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: E */
    public final int m2927E() {
        RecyclerView recyclerView = this.f5543b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: H */
    public int mo2928H(C1911e0 c1911e0, C1925l0 c1925l0) {
        return -1;
    }

    /* JADX INFO: renamed from: I */
    public final void m2929I(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((C1901Z) view.getLayoutParams()).f5558b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f5543b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f5543b.f33662z0;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* JADX INFO: renamed from: J */
    public boolean mo2930J() {
        return false;
    }

    /* JADX INFO: renamed from: M */
    public void mo2931M(int i10) {
        RecyclerView recyclerView = this.f5543b;
        if (recyclerView != null) {
            int iM3072g = recyclerView.f33650t0.m3072g();
            for (int i11 = 0; i11 < iM3072g; i11++) {
                recyclerView.f33650t0.m3071f(i11).offsetLeftAndRight(i10);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public void mo2932N(int i10) {
        RecyclerView recyclerView = this.f5543b;
        if (recyclerView != null) {
            int iM3072g = recyclerView.f33650t0.m3072g();
            for (int i11 = 0; i11 < iM3072g; i11++) {
                recyclerView.f33650t0.m3071f(i11).offsetTopAndBottom(i10);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public View mo2935Q(View view, int i10, C1911e0 c1911e0, C1925l0 c1925l0) {
        return null;
    }

    /* JADX INFO: renamed from: R */
    public void mo2936R(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f5543b;
        C1911e0 c1911e0 = recyclerView.f33644q0;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z6 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f5543b.canScrollVertically(-1) && !this.f5543b.canScrollHorizontally(-1) && !this.f5543b.canScrollHorizontally(1)) {
            z6 = false;
        }
        accessibilityEvent.setScrollable(z6);
        AbstractC1893Q abstractC1893Q = this.f5543b.f33590A0;
        if (abstractC1893Q != null) {
            accessibilityEvent.setItemCount(abstractC1893Q.mo2898a());
        }
    }

    /* JADX INFO: renamed from: S */
    public void mo2937S(C1911e0 c1911e0, C1925l0 c1925l0, C1512f c1512f) {
        if (this.f5543b.canScrollVertically(-1) || this.f5543b.canScrollHorizontally(-1)) {
            c1512f.m2212a(8192);
            c1512f.m2222l(true);
        }
        if (this.f5543b.canScrollVertically(1) || this.f5543b.canScrollHorizontally(1)) {
            c1512f.m2212a(4096);
            c1512f.m2222l(true);
        }
        c1512f.f4042a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(mo2928H(c1911e0, c1925l0), mo2988x(c1911e0, c1925l0), false, 0));
    }

    /* JADX INFO: renamed from: U */
    public final void m2939U(View view, C1512f c1512f) {
        AbstractC1933p0 abstractC1933p0M12244L = RecyclerView.m12244L(view);
        if (abstractC1933p0M12244L == null || abstractC1933p0M12244L.m3095j() || ((ArrayList) this.f5542a.f5616Z).contains(abstractC1933p0M12244L.f5680a)) {
            return;
        }
        RecyclerView recyclerView = this.f5543b;
        mo2938T(recyclerView.f33644q0, recyclerView.f33647r1, view, c1512f);
    }

    /* JADX INFO: renamed from: a0 */
    public abstract void mo2945a0(C1911e0 c1911e0, C1925l0 c1925l0);

    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX INFO: renamed from: b */
    public final void m2946b(View view, int i10, boolean z6) {
        int iM3056n;
        AbstractC1933p0 abstractC1933p0M12244L = RecyclerView.m12244L(view);
        if (z6 || abstractC1933p0M12244L.m3095j()) {
            C12959L c12959l = (C12959L) this.f5543b.f33652u0.f47945Y;
            C1877A0 c1877a0M2859a = (C1877A0) c12959l.get(abstractC1933p0M12244L);
            if (c1877a0M2859a == null) {
                c1877a0M2859a = C1877A0.m2859a();
                c12959l.put(abstractC1933p0M12244L, c1877a0M2859a);
            }
            c1877a0M2859a.f5452a |= 1;
        } else {
            this.f5543b.f33652u0.m16590t(abstractC1933p0M12244L);
        }
        C1901Z c1901z = (C1901Z) view.getLayoutParams();
        if (abstractC1933p0M12244L.m3103r() || abstractC1933p0M12244L.m3096k()) {
            if (abstractC1933p0M12244L.m3096k()) {
                abstractC1933p0M12244L.f5693n.m3037l(abstractC1933p0M12244L);
            } else {
                abstractC1933p0M12244L.f5689j &= -33;
            }
            this.f5542a.m3068c(view, i10, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f5543b) {
                C1920j c1920j = this.f5542a;
                int iIndexOfChild = ((RecyclerView) ((C3032c) c1920j.f5618p0).f9127Z).indexOfChild(view);
                if (iIndexOfChild == -1) {
                    iM3056n = -1;
                } else {
                    C1918i c1918i = (C1918i) c1920j.f5619q0;
                    if (c1918i.m3058p(iIndexOfChild)) {
                        iM3056n = -1;
                    } else {
                        iM3056n = iIndexOfChild - c1918i.m3056n(iIndexOfChild);
                    }
                }
                if (i10 == -1) {
                    i10 = this.f5542a.m3072g();
                }
                if (iM3056n == -1) {
                    StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb2.append(this.f5543b.indexOfChild(view));
                    throw new IllegalStateException(AbstractC0168G.m531t(this.f5543b, sb2));
                }
                if (iM3056n != i10) {
                    AbstractC1900Y abstractC1900Y = this.f5543b.f33592B0;
                    View viewM2983u = abstractC1900Y.m2983u(iM3056n);
                    if (viewM2983u == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM3056n + abstractC1900Y.f5543b.toString());
                    }
                    abstractC1900Y.m2983u(iM3056n);
                    abstractC1900Y.f5542a.m3070e(iM3056n);
                    C1901Z c1901z2 = (C1901Z) viewM2983u.getLayoutParams();
                    AbstractC1933p0 abstractC1933p0M12244L2 = RecyclerView.m12244L(viewM2983u);
                    if (abstractC1933p0M12244L2.m3095j()) {
                        C12959L c12959l2 = (C12959L) abstractC1900Y.f5543b.f33652u0.f47945Y;
                        C1877A0 c1877a0M2859a2 = (C1877A0) c12959l2.get(abstractC1933p0M12244L2);
                        if (c1877a0M2859a2 == null) {
                            c1877a0M2859a2 = C1877A0.m2859a();
                            c12959l2.put(abstractC1933p0M12244L2, c1877a0M2859a2);
                        }
                        c1877a0M2859a2.f5452a = 1 | c1877a0M2859a2.f5452a;
                    } else {
                        abstractC1900Y.f5543b.f33652u0.m16590t(abstractC1933p0M12244L2);
                    }
                    abstractC1900Y.f5542a.m3068c(viewM2983u, i10, c1901z2, abstractC1933p0M12244L2.m3095j());
                }
            } else {
                this.f5542a.m3066a(view, i10, false);
                c1901z.f5559c = true;
                C1886J c1886j = this.f5546e;
                if (c1886j != null && c1886j.f5504e) {
                    c1886j.f5501b.getClass();
                    AbstractC1933p0 abstractC1933p0M12244L3 = RecyclerView.m12244L(view);
                    if ((abstractC1933p0M12244L3 != null ? abstractC1933p0M12244L3.m3088c() : -1) == c1886j.f5500a) {
                        c1886j.f5505f = view;
                        if (RecyclerView.f33581L1) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (c1901z.f5560d) {
            if (RecyclerView.f33581L1) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + c1901z.f5557a);
            }
            abstractC1933p0M12244L.f5680a.invalidate();
            c1901z.f5560d = false;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public abstract void mo2947b0(C1925l0 c1925l0);

    /* JADX INFO: renamed from: c */
    public void mo2948c(String str) {
        RecyclerView recyclerView = this.f5543b;
        if (recyclerView != null) {
            recyclerView.m12290k(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo2950d();

    /* JADX INFO: renamed from: d0 */
    public Parcelable mo2951d0() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo2952e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo2954f(C1901Z c1901z) {
        return c1901z != null;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m2955f0(C1911e0 c1911e0) {
        for (int iM2985v = m2985v() - 1; iM2985v >= 0; iM2985v--) {
            if (!RecyclerView.m12244L(m2983u(iM2985v)).m3102q()) {
                View viewM2983u = m2983u(iM2985v);
                m2960i0(iM2985v);
                c1911e0.m3033h(viewM2983u);
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m2956g0(C1911e0 c1911e0) {
        ArrayList arrayList;
        int size = c1911e0.f5586a.size();
        int i10 = size - 1;
        while (true) {
            arrayList = c1911e0.f5586a;
            if (i10 < 0) {
                break;
            }
            View view = ((AbstractC1933p0) arrayList.get(i10)).f5680a;
            AbstractC1933p0 abstractC1933p0M12244L = RecyclerView.m12244L(view);
            if (!abstractC1933p0M12244L.m3102q()) {
                abstractC1933p0M12244L.m3101p(false);
                if (abstractC1933p0M12244L.m3097l()) {
                    this.f5543b.removeDetachedView(view, false);
                }
                AbstractC1897V abstractC1897V = this.f5543b.f33625Z0;
                if (abstractC1897V != null) {
                    abstractC1897V.mo2912d(abstractC1933p0M12244L);
                }
                abstractC1933p0M12244L.m3101p(true);
                AbstractC1933p0 abstractC1933p0M12244L2 = RecyclerView.m12244L(view);
                abstractC1933p0M12244L2.f5693n = null;
                abstractC1933p0M12244L2.f5694o = false;
                abstractC1933p0M12244L2.f5689j &= -33;
                c1911e0.m3034i(abstractC1933p0M12244L2);
            }
            i10--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c1911e0.f5587b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f5543b.invalidate();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m2958h0(View view, C1911e0 c1911e0) {
        C1920j c1920j = this.f5542a;
        C3032c c3032c = (C3032c) c1920j.f5618p0;
        int i10 = c1920j.f5617o0;
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            c1920j.f5617o0 = 1;
            c1920j.f5620r0 = view;
            int iIndexOfChild = ((RecyclerView) c3032c.f9127Z).indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (((C1918i) c1920j.f5619q0).m3062t(iIndexOfChild)) {
                    c1920j.m3078m(view);
                }
                c3032c.m3921m(iIndexOfChild);
            }
            c1920j.f5617o0 = 0;
            c1920j.f5620r0 = null;
            c1911e0.m3033h(view);
        } catch (Throwable th2) {
            c1920j.f5617o0 = 0;
            c1920j.f5620r0 = null;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m2960i0(int i10) {
        if (m2983u(i10) != null) {
            C1920j c1920j = this.f5542a;
            C3032c c3032c = (C3032c) c1920j.f5618p0;
            int i11 = c1920j.f5617o0;
            if (i11 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i11 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int iM3073h = c1920j.m3073h(i10);
                View childAt = ((RecyclerView) c3032c.f9127Z).getChildAt(iM3073h);
                if (childAt != null) {
                    c1920j.f5617o0 = 1;
                    c1920j.f5620r0 = childAt;
                    if (((C1918i) c1920j.f5619q0).m3062t(iM3073h)) {
                        c1920j.m3078m(childAt);
                    }
                    c3032c.m3921m(iM3073h);
                }
            } finally {
                c1920j.f5617o0 = 0;
                c1920j.f5620r0 = null;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract int mo2961j(C1925l0 c1925l0);

    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX INFO: renamed from: j0 */
    public boolean mo2962j0(RecyclerView recyclerView, View view, Rect rect, boolean z6, boolean z10) {
        int iM2925C = m2925C();
        int iM2927E = m2927E();
        int iM2926D = this.f5555n - m2926D();
        int iM2924B = this.f5556o - m2924B();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i10 = left - iM2925C;
        int iMin = Math.min(0, i10);
        int i11 = top - iM2927E;
        int iMin2 = Math.min(0, i11);
        int i12 = iWidth - iM2926D;
        int iMax = Math.max(0, i12);
        int iMax2 = Math.max(0, iHeight - iM2924B);
        if (m2923A() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i10, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i12);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i11, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i13 = iArr[0];
        int i14 = iArr[1];
        if (z10) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iM2925C2 = m2925C();
                int iM2927E2 = m2927E();
                int iM2926D2 = this.f5555n - m2926D();
                int iM2924B2 = this.f5556o - m2924B();
                Rect rect2 = this.f5543b.f33658x0;
                mo2990y(rect2, focusedChild);
                if (rect2.left - i13 < iM2926D2 && rect2.right - i13 > iM2925C2 && rect2.top - i14 < iM2924B2 && rect2.bottom - i14 > iM2927E2) {
                    if (i13 == 0) {
                    }
                    if (z6) {
                        recyclerView.scrollBy(i13, i14);
                    } else {
                        recyclerView.m12287i0(i13, i14, false);
                    }
                    return true;
                }
            }
        } else if (i13 == 0 || i14 != 0) {
            if (z6) {
                recyclerView.scrollBy(i13, i14);
            } else {
                recyclerView.m12287i0(i13, i14, false);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public abstract int mo2963k(C1925l0 c1925l0);

    /* JADX INFO: renamed from: k0 */
    public final void m2964k0() {
        RecyclerView recyclerView = this.f5543b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract int mo2965l(C1925l0 c1925l0);

    /* JADX INFO: renamed from: l0 */
    public abstract int mo2966l0(int i10, C1911e0 c1911e0, C1925l0 c1925l0);

    /* JADX INFO: renamed from: m */
    public int mo2967m(C1925l0 c1925l0) {
        return 0;
    }

    /* JADX INFO: renamed from: m0 */
    public abstract void mo2968m0(int i10);

    /* JADX INFO: renamed from: n */
    public int mo2969n(C1925l0 c1925l0) {
        return 0;
    }

    /* JADX INFO: renamed from: n0 */
    public int mo2970n0(int i10, C1911e0 c1911e0, C1925l0 c1925l0) {
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public int mo2971o(C1925l0 c1925l0) {
        return 0;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m2972o0(RecyclerView recyclerView) {
        m2974p0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* JADX INFO: renamed from: p */
    public final void m2973p(C1911e0 c1911e0) {
        for (int iM2985v = m2985v() - 1; iM2985v >= 0; iM2985v--) {
            View viewM2983u = m2983u(iM2985v);
            AbstractC1933p0 abstractC1933p0M12244L = RecyclerView.m12244L(viewM2983u);
            if (abstractC1933p0M12244L.m3102q()) {
                if (RecyclerView.f33581L1) {
                    Log.d("RecyclerView", "ignoring view " + abstractC1933p0M12244L);
                }
            } else if (!abstractC1933p0M12244L.m3093h() || abstractC1933p0M12244L.m3095j() || this.f5543b.f33590A0.f5530b) {
                m2983u(iM2985v);
                this.f5542a.m3070e(iM2985v);
                c1911e0.m3035j(viewM2983u);
                this.f5543b.f33652u0.m16590t(abstractC1933p0M12244L);
            } else {
                m2960i0(iM2985v);
                c1911e0.m3034i(abstractC1933p0M12244L);
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m2974p0(int i10, int i11) {
        this.f5555n = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.f5553l = mode;
        if (mode == 0 && !RecyclerView.f33584O1) {
            this.f5555n = 0;
        }
        this.f5556o = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f5554m = mode2;
        if (mode2 != 0 || RecyclerView.f33584O1) {
            return;
        }
        this.f5556o = 0;
    }

    /* JADX INFO: renamed from: q */
    public View mo2975q(int i10) {
        int iM2985v = m2985v();
        for (int i11 = 0; i11 < iM2985v; i11++) {
            View viewM2983u = m2983u(i11);
            AbstractC1933p0 abstractC1933p0M12244L = RecyclerView.m12244L(viewM2983u);
            if (abstractC1933p0M12244L != null && abstractC1933p0M12244L.m3088c() == i10 && !abstractC1933p0M12244L.m3102q() && (this.f5543b.f33647r1.f5642g || !abstractC1933p0M12244L.m3095j())) {
                return viewM2983u;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    public void mo2976q0(Rect rect, int i10, int i11) {
        int iM2926D = m2926D() + m2925C() + rect.width();
        int iM2924B = m2924B() + m2927E() + rect.height();
        RecyclerView recyclerView = this.f5543b;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        this.f5543b.setMeasuredDimension(m2921g(i10, iM2926D, recyclerView.getMinimumWidth()), m2921g(i11, iM2924B, this.f5543b.getMinimumHeight()));
    }

    /* JADX INFO: renamed from: r */
    public abstract C1901Z mo2977r();

    /* JADX INFO: renamed from: r0 */
    public final void m2978r0(int i10, int i11) {
        int iM2985v = m2985v();
        if (iM2985v == 0) {
            this.f5543b.m12296q(i10, i11);
            return;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < iM2985v; i16++) {
            View viewM2983u = m2983u(i16);
            Rect rect = this.f5543b.f33658x0;
            mo2990y(rect, viewM2983u);
            int i17 = rect.left;
            if (i17 < i15) {
                i15 = i17;
            }
            int i18 = rect.right;
            if (i18 > i12) {
                i12 = i18;
            }
            int i19 = rect.top;
            if (i19 < i13) {
                i13 = i19;
            }
            int i20 = rect.bottom;
            if (i20 > i14) {
                i14 = i20;
            }
        }
        this.f5543b.f33658x0.set(i15, i13, i12, i14);
        mo2976q0(this.f5543b.f33658x0, i10, i11);
    }

    /* JADX INFO: renamed from: s */
    public C1901Z mo2979s(Context context, AttributeSet attributeSet) {
        return new C1901Z(context, attributeSet);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m2980s0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f5543b = null;
            this.f5542a = null;
            this.f5555n = 0;
            this.f5556o = 0;
        } else {
            this.f5543b = recyclerView;
            this.f5542a = recyclerView.f33650t0;
            this.f5555n = recyclerView.getWidth();
            this.f5556o = recyclerView.getHeight();
        }
        this.f5553l = 1073741824;
        this.f5554m = 1073741824;
    }

    /* JADX INFO: renamed from: t */
    public C1901Z mo2981t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1901Z) {
            return new C1901Z((C1901Z) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1901Z((ViewGroup.MarginLayoutParams) layoutParams) : new C1901Z(layoutParams);
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m2982t0(View view, int i10, int i11, C1901Z c1901z) {
        return (!view.isLayoutRequested() && this.f5549h && m2919K(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) c1901z).width) && m2919K(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) c1901z).height)) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public final View m2983u(int i10) {
        C1920j c1920j = this.f5542a;
        if (c1920j != null) {
            return c1920j.m3071f(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: u0 */
    public boolean mo2984u0() {
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final int m2985v() {
        C1920j c1920j = this.f5542a;
        if (c1920j != null) {
            return c1920j.m3072g();
        }
        return 0;
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m2986v0(View view, int i10, int i11, C1901Z c1901z) {
        return (this.f5549h && m2919K(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) c1901z).width) && m2919K(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) c1901z).height)) ? false : true;
    }

    /* JADX INFO: renamed from: w0 */
    public abstract void mo2987w0(RecyclerView recyclerView, int i10);

    /* JADX INFO: renamed from: x */
    public int mo2988x(C1911e0 c1911e0, C1925l0 c1925l0) {
        return -1;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m2989x0(C1886J c1886j) {
        C1886J c1886j2 = this.f5546e;
        if (c1886j2 != null && c1886j != c1886j2 && c1886j2.f5504e) {
            c1886j2.m2875h();
        }
        this.f5546e = c1886j;
        RecyclerView recyclerView = this.f5543b;
        RunnableC1931o0 runnableC1931o0 = recyclerView.f33641o1;
        runnableC1931o0.f5673s0.removeCallbacks(runnableC1931o0);
        runnableC1931o0.f5669o0.abortAnimation();
        if (c1886j.f5507h) {
            AbstractC15256t.m16482t("RecyclerView", "An instance of " + c1886j.getClass().getSimpleName() + " was started more than once. Each instance of" + c1886j.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c1886j.f5501b = recyclerView;
        c1886j.f5502c = this;
        int i10 = c1886j.f5500a;
        if (i10 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f33647r1.f5636a = i10;
        c1886j.f5504e = true;
        c1886j.f5503d = true;
        c1886j.f5505f = recyclerView.f33592B0.mo2975q(i10);
        c1886j.f5501b.f33641o1.m3084b();
        c1886j.f5507h = true;
    }

    /* JADX INFO: renamed from: y */
    public void mo2990y(Rect rect, View view) {
        RecyclerView.m12245M(rect, view);
    }

    /* JADX INFO: renamed from: y0 */
    public boolean mo2991y0() {
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final int m2992z() {
        RecyclerView recyclerView = this.f5543b;
        AbstractC1893Q adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo2898a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: O */
    public void mo2933O() {
    }

    /* JADX INFO: renamed from: W */
    public void mo2941W() {
    }

    /* JADX INFO: renamed from: P */
    public void mo2934P(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: c0 */
    public void mo2949c0(Parcelable parcelable) {
    }

    /* JADX INFO: renamed from: e0 */
    public void mo2953e0(int i10) {
    }

    /* JADX INFO: renamed from: V */
    public void mo2940V(int i10, int i11) {
    }

    /* JADX INFO: renamed from: X */
    public void mo2942X(int i10, int i11) {
    }

    /* JADX INFO: renamed from: Y */
    public void mo2943Y(int i10, int i11) {
    }

    /* JADX INFO: renamed from: Z */
    public void mo2944Z(int i10, int i11) {
    }

    /* JADX INFO: renamed from: i */
    public void mo2959i(int i10, C1878B c1878b) {
    }

    /* JADX INFO: renamed from: T */
    public void mo2938T(C1911e0 c1911e0, C1925l0 c1925l0, View view, C1512f c1512f) {
    }

    /* JADX INFO: renamed from: h */
    public void mo2957h(int i10, int i11, C1925l0 c1925l0, C1878B c1878b) {
    }
}
