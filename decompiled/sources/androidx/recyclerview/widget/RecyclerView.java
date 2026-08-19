package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.javax.sip.C10808o;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import io.sentry.C15358g1;
import io.sentry.android.core.AbstractC15256t;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p003A1.C0152A1;
import p030B2.AbstractC0730K;
import p030B2.AbstractC0732M;
import p030B2.AbstractC0738T;
import p030B2.AbstractC0739U;
import p030B2.AbstractC0773o;
import p030B2.C0775p;
import p030B2.C0781s;
import p058C4.AbstractC1582a;
import p084D4.AbstractC1888L;
import p084D4.AbstractC1893Q;
import p084D4.AbstractC1896U;
import p084D4.AbstractC1897V;
import p084D4.AbstractC1898W;
import p084D4.AbstractC1900Y;
import p084D4.AbstractC1903a0;
import p084D4.AbstractC1905b0;
import p084D4.AbstractC1929n0;
import p084D4.AbstractC1933p0;
import p084D4.C1876A;
import p084D4.C1877A0;
import p084D4.C1878B;
import p084D4.C1886J;
import p084D4.C1889M;
import p084D4.C1890N;
import p084D4.C1901Z;
import p084D4.C1902a;
import p084D4.C1904b;
import p084D4.C1907c0;
import p084D4.C1909d0;
import p084D4.C1911e0;
import p084D4.C1915g0;
import p084D4.C1918i;
import p084D4.C1919i0;
import p084D4.C1920j;
import p084D4.C1925l0;
import p084D4.C1927m0;
import p084D4.C1934q;
import p084D4.C1937r0;
import p084D4.InterfaceC1895T;
import p084D4.InterfaceC1913f0;
import p084D4.InterfaceC1923k0;
import p084D4.InterpolatorC1892P;
import p084D4.RunnableC1880D;
import p084D4.RunnableC1891O;
import p084D4.RunnableC1931o0;
import p1009s9.C19506i;
import p1072w2.AbstractC20798j;
import p167Gb.C3032c;
import p477Tb.C7296c;
import p523V9.AbstractC8150n4;
import p544W9.AbstractC8536P2;
import p692d0.C12959L;
import p692d0.C12977p;
import p909nm.AbstractC17681o;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView {

    /* JADX INFO: renamed from: K1 */
    public static boolean f33580K1 = false;

    /* JADX INFO: renamed from: L1 */
    public static boolean f33581L1 = false;

    /* JADX INFO: renamed from: M1 */
    public static final int[] f33582M1 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: N1 */
    public static final float f33583N1 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: O1 */
    public static final boolean f33584O1 = true;

    /* JADX INFO: renamed from: P1 */
    public static final boolean f33585P1 = true;

    /* JADX INFO: renamed from: Q1 */
    public static final boolean f33586Q1 = true;

    /* JADX INFO: renamed from: R1 */
    public static final Class[] f33587R1;

    /* JADX INFO: renamed from: S1 */
    public static final InterpolatorC1892P f33588S1;

    /* JADX INFO: renamed from: U1 */
    public static final C1927m0 f33589U1;

    /* JADX INFO: renamed from: A0 */
    public AbstractC1893Q f33590A0;

    /* JADX INFO: renamed from: A1 */
    public C0775p f33591A1;

    /* JADX INFO: renamed from: B0 */
    public AbstractC1900Y f33592B0;

    /* JADX INFO: renamed from: B1 */
    public final int[] f33593B1;

    /* JADX INFO: renamed from: C0 */
    public final ArrayList f33594C0;

    /* JADX INFO: renamed from: C1 */
    public final int[] f33595C1;

    /* JADX INFO: renamed from: D0 */
    public final ArrayList f33596D0;

    /* JADX INFO: renamed from: D1 */
    public final int[] f33597D1;

    /* JADX INFO: renamed from: E0 */
    public final ArrayList f33598E0;

    /* JADX INFO: renamed from: E1 */
    public final ArrayList f33599E1;

    /* JADX INFO: renamed from: F0 */
    public C1876A f33600F0;

    /* JADX INFO: renamed from: F1 */
    public final RunnableC1891O f33601F1;

    /* JADX INFO: renamed from: G0 */
    public boolean f33602G0;

    /* JADX INFO: renamed from: G1 */
    public boolean f33603G1;

    /* JADX INFO: renamed from: H0 */
    public boolean f33604H0;

    /* JADX INFO: renamed from: H1 */
    public int f33605H1;

    /* JADX INFO: renamed from: I0 */
    public boolean f33606I0;

    /* JADX INFO: renamed from: I1 */
    public int f33607I1;

    /* JADX INFO: renamed from: J0 */
    public int f33608J0;

    /* JADX INFO: renamed from: J1 */
    public final C19506i f33609J1;

    /* JADX INFO: renamed from: K0 */
    public boolean f33610K0;

    /* JADX INFO: renamed from: L0 */
    public boolean f33611L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f33612M0;

    /* JADX INFO: renamed from: N0 */
    public int f33613N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f33614O0;

    /* JADX INFO: renamed from: P0 */
    public final AccessibilityManager f33615P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f33616Q0;

    /* JADX INFO: renamed from: R0 */
    public boolean f33617R0;

    /* JADX INFO: renamed from: S0 */
    public int f33618S0;

    /* JADX INFO: renamed from: T0 */
    public int f33619T0;

    /* JADX INFO: renamed from: U0 */
    public AbstractC1896U f33620U0;

    /* JADX INFO: renamed from: V0 */
    public EdgeEffect f33621V0;

    /* JADX INFO: renamed from: W0 */
    public EdgeEffect f33622W0;

    /* JADX INFO: renamed from: X0 */
    public EdgeEffect f33623X0;

    /* JADX INFO: renamed from: Y0 */
    public EdgeEffect f33624Y0;

    /* JADX INFO: renamed from: Z0 */
    public AbstractC1897V f33625Z0;

    /* JADX INFO: renamed from: a1 */
    public int f33626a1;

    /* JADX INFO: renamed from: b1 */
    public int f33627b1;

    /* JADX INFO: renamed from: c1 */
    public VelocityTracker f33628c1;

    /* JADX INFO: renamed from: d1 */
    public int f33629d1;

    /* JADX INFO: renamed from: e1 */
    public int f33630e1;

    /* JADX INFO: renamed from: f1 */
    public int f33631f1;

    /* JADX INFO: renamed from: g1 */
    public int f33632g1;

    /* JADX INFO: renamed from: h1 */
    public int f33633h1;

    /* JADX INFO: renamed from: i1 */
    public AbstractC1903a0 f33634i1;

    /* JADX INFO: renamed from: j1 */
    public final int f33635j1;

    /* JADX INFO: renamed from: k1 */
    public final int f33636k1;

    /* JADX INFO: renamed from: l1 */
    public final float f33637l1;

    /* JADX INFO: renamed from: m1 */
    public final float f33638m1;

    /* JADX INFO: renamed from: n1 */
    public boolean f33639n1;

    /* JADX INFO: renamed from: o0 */
    public final float f33640o0;

    /* JADX INFO: renamed from: o1 */
    public final RunnableC1931o0 f33641o1;

    /* JADX INFO: renamed from: p0 */
    public final C1915g0 f33642p0;

    /* JADX INFO: renamed from: p1 */
    public RunnableC1880D f33643p1;

    /* JADX INFO: renamed from: q0 */
    public final C1911e0 f33644q0;

    /* JADX INFO: renamed from: q1 */
    public final C1878B f33645q1;

    /* JADX INFO: renamed from: r0 */
    public C1919i0 f33646r0;

    /* JADX INFO: renamed from: r1 */
    public final C1925l0 f33647r1;

    /* JADX INFO: renamed from: s0 */
    public final C1904b f33648s0;

    /* JADX INFO: renamed from: s1 */
    public AbstractC1905b0 f33649s1;

    /* JADX INFO: renamed from: t0 */
    public final C1920j f33650t0;

    /* JADX INFO: renamed from: t1 */
    public ArrayList f33651t1;

    /* JADX INFO: renamed from: u0 */
    public final C15358g1 f33652u0;

    /* JADX INFO: renamed from: u1 */
    public boolean f33653u1;

    /* JADX INFO: renamed from: v0 */
    public boolean f33654v0;

    /* JADX INFO: renamed from: v1 */
    public boolean f33655v1;

    /* JADX INFO: renamed from: w0 */
    public final RunnableC1891O f33656w0;

    /* JADX INFO: renamed from: w1 */
    public final C10808o f33657w1;

    /* JADX INFO: renamed from: x0 */
    public final Rect f33658x0;

    /* JADX INFO: renamed from: x1 */
    public boolean f33659x1;

    /* JADX INFO: renamed from: y0 */
    public final Rect f33660y0;

    /* JADX INFO: renamed from: y1 */
    public C1937r0 f33661y1;

    /* JADX INFO: renamed from: z0 */
    public final RectF f33662z0;

    /* JADX INFO: renamed from: z1 */
    public final int[] f33663z1;

    static {
        Class cls = Integer.TYPE;
        f33587R1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f33588S1 = new InterpolatorC1892P(0);
        f33589U1 = new C1927m0();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.openai.chatgpt.R.attr.recyclerViewStyle);
    }

    /* JADX INFO: renamed from: G */
    public static RecyclerView m12243G(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewM12243G = m12243G(viewGroup.getChildAt(i10));
            if (recyclerViewM12243G != null) {
                return recyclerViewM12243G;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public static AbstractC1933p0 m12244L(View view) {
        if (view == null) {
            return null;
        }
        return ((C1901Z) view.getLayoutParams()).f5557a;
    }

    /* JADX INFO: renamed from: M */
    public static void m12245M(Rect rect, View view) {
        C1901Z c1901z = (C1901Z) view.getLayoutParams();
        Rect rect2 = c1901z.f5558b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c1901z).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c1901z).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c1901z).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1901z).bottomMargin);
    }

    private C0775p getScrollingChildHelper() {
        if (this.f33591A1 == null) {
            this.f33591A1 = new C0775p(this);
        }
        return this.f33591A1;
    }

    /* JADX INFO: renamed from: l */
    public static void m12252l(AbstractC1933p0 abstractC1933p0) {
        WeakReference weakReference = abstractC1933p0.f5681b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC1933p0.f5680a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC1933p0.f5681b = null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static int m12253o(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && AbstractC8150n4.m8690c(edgeEffect) != 0.0f) {
            int iRound = Math.round(AbstractC8150n4.m8691d(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f) * ((-i11) / 4.0f));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || AbstractC8150n4.m8690c(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f10 = i11;
        int iRound2 = Math.round(AbstractC8150n4.m8691d(edgeEffect2, (i10 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z6) {
        f33580K1 = z6;
    }

    public static void setVerboseLoggingEnabled(boolean z6) {
        f33581L1 = z6;
    }

    /* JADX INFO: renamed from: A */
    public final void m12254A() {
        if (this.f33622W0 != null) {
            return;
        }
        ((C1927m0) this.f33620U0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f33622W0 = edgeEffect;
        if (this.f33654v0) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: B */
    public final String m12255B() {
        return Separators.f31991SP + super.toString() + ", adapter:" + this.f33590A0 + ", layout:" + this.f33592B0 + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: C */
    public final void m12256C(C1925l0 c1925l0) {
        if (getScrollState() != 2) {
            c1925l0.getClass();
            return;
        }
        OverScroller overScroller = this.f33641o1.f5669o0;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c1925l0.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX INFO: renamed from: D */
    public final View m12257D(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[SYNTHETIC] */
    /* JADX INFO: renamed from: E */
    public final boolean m12258E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f33598E0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1876A c1876a = (C1876A) arrayList.get(i10);
            int i11 = c1876a.f5446v;
            if (i11 == 1) {
                boolean zM2856e = c1876a.m2856e(motionEvent.getX(), motionEvent.getY());
                boolean zM2855d = c1876a.m2855d(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (zM2856e || zM2855d)) {
                    if (zM2855d) {
                        c1876a.f5447w = 1;
                        c1876a.f5440p = (int) motionEvent.getX();
                    } else if (zM2856e) {
                        c1876a.f5447w = 2;
                        c1876a.f5437m = (int) motionEvent.getY();
                    }
                    c1876a.m2857g(2);
                    if (action != 3) {
                        this.f33600F0 = c1876a;
                        return true;
                    }
                }
            } else if (i11 != 2) {
                continue;
            } else if (action != 3) {
                this.f33600F0 = c1876a;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final void m12259F(int[] iArr) {
        int iM3072g = this.f33650t0.m3072g();
        if (iM3072g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iM3072g; i12++) {
            AbstractC1933p0 abstractC1933p0M12244L = m12244L(this.f33650t0.m3071f(i12));
            if (!abstractC1933p0M12244L.m3102q()) {
                int iM3088c = abstractC1933p0M12244L.m3088c();
                if (iM3088c < i10) {
                    i10 = iM3088c;
                }
                if (iM3088c > i11) {
                    i11 = iM3088c;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    /* JADX INFO: renamed from: H */
    public final AbstractC1933p0 m12260H(int i10) {
        AbstractC1933p0 abstractC1933p0 = null;
        if (this.f33616Q0) {
            return null;
        }
        int iM3076k = this.f33650t0.m3076k();
        for (int i11 = 0; i11 < iM3076k; i11++) {
            AbstractC1933p0 abstractC1933p0M12244L = m12244L(this.f33650t0.m3075j(i11));
            if (abstractC1933p0M12244L != null && !abstractC1933p0M12244L.m3095j() && m12261I(abstractC1933p0M12244L) == i10) {
                if (!((ArrayList) this.f33650t0.f5616Z).contains(abstractC1933p0M12244L.f5680a)) {
                    return abstractC1933p0M12244L;
                }
                abstractC1933p0 = abstractC1933p0M12244L;
            }
        }
        return abstractC1933p0;
    }

    /* JADX INFO: renamed from: I */
    public final int m12261I(AbstractC1933p0 abstractC1933p0) {
        if (abstractC1933p0.m3090e(524) || !abstractC1933p0.m3092g()) {
            return -1;
        }
        C1904b c1904b = this.f33648s0;
        int i10 = abstractC1933p0.f5682c;
        ArrayList arrayList = (ArrayList) c1904b.f5567c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C1902a c1902a = (C1902a) arrayList.get(i11);
            int i12 = c1902a.f5561a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = c1902a.f5562b;
                    if (i13 <= i10) {
                        int i14 = c1902a.f5564d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = c1902a.f5562b;
                    if (i15 == i10) {
                        i10 = c1902a.f5564d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (c1902a.f5564d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (c1902a.f5562b <= i10) {
                i10 += c1902a.f5564d;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: J */
    public final long m12262J(AbstractC1933p0 abstractC1933p0) {
        return this.f33590A0.f5530b ? abstractC1933p0.f5684e : abstractC1933p0.f5682c;
    }

    /* JADX INFO: renamed from: K */
    public final AbstractC1933p0 m12263K(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m12244L(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* JADX INFO: renamed from: N */
    public final Rect m12264N(View view) {
        C1901Z c1901z = (C1901Z) view.getLayoutParams();
        boolean z6 = c1901z.f5559c;
        Rect rect = c1901z.f5558b;
        if (!z6) {
            return rect;
        }
        if (this.f33647r1.f5642g && (c1901z.f5557a.m3098m() || c1901z.f5557a.m3093h())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f33596D0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Rect rect2 = this.f33658x0;
            rect2.set(0, 0, 0, 0);
            ((AbstractC1898W) arrayList.get(i10)).mo2915a(rect2, view);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c1901z.f5559c = false;
        return rect;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m12265O() {
        return !this.f33606I0 || this.f33616Q0 || this.f33648s0.m3002j();
    }

    /* JADX INFO: renamed from: P */
    public final boolean m12266P() {
        return this.f33618S0 > 0;
    }

    /* JADX INFO: renamed from: Q */
    public final void m12267Q(int i10) {
        if (this.f33592B0 == null) {
            return;
        }
        setScrollState(2);
        this.f33592B0.mo2968m0(i10);
        awakenScrollBars();
    }

    /* JADX INFO: renamed from: R */
    public final void m12268R() {
        int iM3076k = this.f33650t0.m3076k();
        for (int i10 = 0; i10 < iM3076k; i10++) {
            ((C1901Z) this.f33650t0.m3075j(i10).getLayoutParams()).f5559c = true;
        }
        ArrayList arrayList = this.f33644q0.f5588c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C1901Z c1901z = (C1901Z) ((AbstractC1933p0) arrayList.get(i11)).f5680a.getLayoutParams();
            if (c1901z != null) {
                c1901z.f5559c = true;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m12269S(int i10, int i11, boolean z6) {
        int i12 = i10 + i11;
        int iM3076k = this.f33650t0.m3076k();
        for (int i13 = 0; i13 < iM3076k; i13++) {
            AbstractC1933p0 abstractC1933p0M12244L = m12244L(this.f33650t0.m3075j(i13));
            if (abstractC1933p0M12244L != null && !abstractC1933p0M12244L.m3102q()) {
                int i14 = abstractC1933p0M12244L.f5682c;
                C1925l0 c1925l0 = this.f33647r1;
                if (i14 >= i12) {
                    if (f33581L1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + abstractC1933p0M12244L + " now at position " + (abstractC1933p0M12244L.f5682c - i11));
                    }
                    abstractC1933p0M12244L.m3099n(-i11, z6);
                    c1925l0.f5641f = true;
                } else if (i14 >= i10) {
                    if (f33581L1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + abstractC1933p0M12244L + " now REMOVED");
                    }
                    abstractC1933p0M12244L.m3086a(8);
                    abstractC1933p0M12244L.m3099n(-i11, z6);
                    abstractC1933p0M12244L.f5682c = i10 - 1;
                    c1925l0.f5641f = true;
                }
            }
        }
        C1911e0 c1911e0 = this.f33644q0;
        ArrayList arrayList = c1911e0.f5588c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC1933p0 abstractC1933p0 = (AbstractC1933p0) arrayList.get(size);
            if (abstractC1933p0 != null) {
                int i15 = abstractC1933p0.f5682c;
                if (i15 >= i12) {
                    if (f33581L1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + abstractC1933p0 + " now at position " + (abstractC1933p0.f5682c - i11));
                    }
                    abstractC1933p0.m3099n(-i11, z6);
                } else if (i15 >= i10) {
                    abstractC1933p0.m3086a(8);
                    c1911e0.m3032g(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: T */
    public final void m12270T() {
        this.f33618S0++;
    }

    /* JADX INFO: renamed from: U */
    public final void m12271U(boolean z6) {
        int i10;
        AccessibilityManager accessibilityManager;
        int i11 = this.f33618S0 - 1;
        this.f33618S0 = i11;
        if (i11 < 1) {
            if (f33580K1 && i11 < 0) {
                throw new IllegalStateException(AbstractC0168G.m531t(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f33618S0 = 0;
            if (z6) {
                int i12 = this.f33613N0;
                this.f33613N0 = 0;
                if (i12 != 0 && (accessibilityManager = this.f33615P0) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i12);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f33599E1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC1933p0 abstractC1933p0 = (AbstractC1933p0) arrayList.get(size);
                    if (abstractC1933p0.f5680a.getParent() == this && !abstractC1933p0.m3102q() && (i10 = abstractC1933p0.f5696q) != -1) {
                        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                        abstractC1933p0.f5680a.setImportantForAccessibility(i10);
                        abstractC1933p0.f5696q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m12272V(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f33627b1) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f33627b1 = motionEvent.getPointerId(i10);
            int x4 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f33631f1 = x4;
            this.f33629d1 = x4;
            int y8 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f33632g1 = y8;
            this.f33630e1 = y8;
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m12273W() {
        if (this.f33659x1 || !this.f33602G0) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        postOnAnimation(this.f33601F1);
        this.f33659x1 = true;
    }

    /* JADX INFO: renamed from: X */
    public final void m12274X() {
        boolean z6;
        boolean z10 = false;
        if (this.f33616Q0) {
            C1904b c1904b = this.f33648s0;
            c1904b.m3009q((ArrayList) c1904b.f5567c);
            c1904b.m3009q((ArrayList) c1904b.f5568d);
            c1904b.f5565a = 0;
            if (this.f33617R0) {
                this.f33592B0.mo2941W();
            }
        }
        if (this.f33625Z0 == null || !this.f33592B0.mo2991y0()) {
            this.f33648s0.m2996d();
        } else {
            this.f33648s0.m3008p();
        }
        boolean z11 = this.f33653u1 || this.f33655v1;
        boolean z12 = this.f33606I0 && this.f33625Z0 != null && ((z6 = this.f33616Q0) || z11 || this.f33592B0.f5547f) && (!z6 || this.f33590A0.f5530b);
        C1925l0 c1925l0 = this.f33647r1;
        c1925l0.f5645j = z12;
        if (z12 && z11 && !this.f33616Q0 && this.f33625Z0 != null && this.f33592B0.mo2991y0()) {
            z10 = true;
        }
        c1925l0.f5646k = z10;
    }

    /* JADX INFO: renamed from: Y */
    public final void m12275Y(boolean z6) {
        this.f33617R0 = z6 | this.f33617R0;
        this.f33616Q0 = true;
        int iM3076k = this.f33650t0.m3076k();
        for (int i10 = 0; i10 < iM3076k; i10++) {
            AbstractC1933p0 abstractC1933p0M12244L = m12244L(this.f33650t0.m3075j(i10));
            if (abstractC1933p0M12244L != null && !abstractC1933p0M12244L.m3102q()) {
                abstractC1933p0M12244L.m3086a(6);
            }
        }
        m12268R();
        C1911e0 c1911e0 = this.f33644q0;
        ArrayList arrayList = c1911e0.f5588c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC1933p0 abstractC1933p0 = (AbstractC1933p0) arrayList.get(i11);
            if (abstractC1933p0 != null) {
                abstractC1933p0.m3086a(6);
                abstractC1933p0.m3086a(1024);
            }
        }
        AbstractC1893Q abstractC1893Q = c1911e0.f5593h.f33590A0;
        if (abstractC1893Q == null || !abstractC1893Q.f5530b) {
            c1911e0.m3031f();
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m12276Z(AbstractC1933p0 abstractC1933p0, C0781s c0781s) {
        abstractC1933p0.f5689j &= -8193;
        boolean z6 = this.f33647r1.f5643h;
        C15358g1 c15358g1 = this.f33652u0;
        if (z6 && abstractC1933p0.m3098m() && !abstractC1933p0.m3095j() && !abstractC1933p0.m3102q()) {
            ((C12977p) c15358g1.f47946Z).m14668h(m12262J(abstractC1933p0), abstractC1933p0);
        }
        C12959L c12959l = (C12959L) c15358g1.f47945Y;
        C1877A0 c1877a0M2859a = (C1877A0) c12959l.get(abstractC1933p0);
        if (c1877a0M2859a == null) {
            c1877a0M2859a = C1877A0.m2859a();
            c12959l.put(abstractC1933p0, c1877a0M2859a);
        }
        c1877a0M2859a.f5453b = c0781s;
        c1877a0M2859a.f5452a |= 4;
    }

    /* JADX INFO: renamed from: a0 */
    public final int m12277a0(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.f33621V0;
        float f11 = 0.0f;
        if (edgeEffect == null || AbstractC8150n4.m8690c(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f33623X0;
            if (edgeEffect2 != null && AbstractC8150n4.m8690c(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f33623X0.onRelease();
                } else {
                    float fM8691d = AbstractC8150n4.m8691d(this.f33623X0, width, height);
                    if (AbstractC8150n4.m8690c(this.f33623X0) == 0.0f) {
                        this.f33623X0.onRelease();
                    }
                    f11 = fM8691d;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f33621V0.onRelease();
            } else {
                float f12 = -AbstractC8150n4.m8691d(this.f33621V0, -width, 1.0f - height);
                if (AbstractC8150n4.m8690c(this.f33621V0) == 0.0f) {
                    this.f33621V0.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        if (abstractC1900Y != null) {
            abstractC1900Y.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    /* JADX INFO: renamed from: b0 */
    public final int m12278b0(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.f33622W0;
        float f11 = 0.0f;
        if (edgeEffect == null || AbstractC8150n4.m8690c(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f33624Y0;
            if (edgeEffect2 != null && AbstractC8150n4.m8690c(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f33624Y0.onRelease();
                } else {
                    float fM8691d = AbstractC8150n4.m8691d(this.f33624Y0, height, 1.0f - width);
                    if (AbstractC8150n4.m8690c(this.f33624Y0) == 0.0f) {
                        this.f33624Y0.onRelease();
                    }
                    f11 = fM8691d;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f33622W0.onRelease();
            } else {
                float f12 = -AbstractC8150n4.m8691d(this.f33622W0, -height, width);
                if (AbstractC8150n4.m8690c(this.f33622W0) == 0.0f) {
                    this.f33622W0.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    /* JADX INFO: renamed from: c0 */
    public final void m12279c0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f33658x0;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C1901Z) {
            C1901Z c1901z = (C1901Z) layoutParams;
            if (!c1901z.f5559c) {
                int i10 = rect.left;
                Rect rect2 = c1901z.f5558b;
                rect.left = i10 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f33592B0.mo2962j0(this, view, this.f33658x0, !this.f33606I0, view2 == null);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1901Z) && this.f33592B0.mo2954f((C1901Z) layoutParams);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        if (abstractC1900Y != null && abstractC1900Y.mo2950d()) {
            return this.f33592B0.mo2961j(this.f33647r1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        if (abstractC1900Y != null && abstractC1900Y.mo2950d()) {
            return this.f33592B0.mo2963k(this.f33647r1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        if (abstractC1900Y != null && abstractC1900Y.mo2950d()) {
            return this.f33592B0.mo2965l(this.f33647r1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        if (abstractC1900Y != null && abstractC1900Y.mo2952e()) {
            return this.f33592B0.mo2967m(this.f33647r1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        if (abstractC1900Y != null && abstractC1900Y.mo2952e()) {
            return this.f33592B0.mo2969n(this.f33647r1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        if (abstractC1900Y != null && abstractC1900Y.mo2952e()) {
            return this.f33592B0.mo2971o(this.f33647r1);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m12280d0() {
        VelocityTracker velocityTracker = this.f33628c1;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        m12292l0(0);
        EdgeEffect edgeEffect = this.f33621V0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f33621V0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f33622W0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f33622W0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f33623X0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f33623X0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f33624Y0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f33624Y0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z6) {
        return getScrollingChildHelper().m1733a(f10, f11, z6);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().m1734b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m1735c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().m1736d(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z6;
        super.draw(canvas);
        ArrayList arrayList = this.f33596D0;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC1898W) arrayList.get(i10)).mo2854c(canvas, this);
        }
        EdgeEffect edgeEffect = this.f33621V0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z6 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f33654v0 ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f33621V0;
            z6 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f33622W0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f33654v0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f33622W0;
            z6 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f33623X0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f33654v0 ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f33623X0;
            z6 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f33624Y0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f33654v0) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f33624Y0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z10 = true;
            }
            z6 |= z10;
            canvas.restoreToCount(iSave4);
        }
        if ((z6 || this.f33625Z0 == null || arrayList.size() <= 0 || !this.f33625Z0.mo2914f()) ? z6 : true) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:36:0x0107 A[DONT_INVERT, PHI: r4
      0x0107: PHI (r4v10 boolean) = (r4v8 boolean), (r4v11 boolean) binds: [B:34:0x00ee, B:32:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0109  */
    /* JADX WARN: Code duplicated, block: B:41:0x0111  */
    /* JADX INFO: renamed from: e0 */
    public final boolean m12281e0(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z6;
        m12295p();
        AbstractC1893Q abstractC1893Q = this.f33590A0;
        int[] iArr = this.f33597D1;
        if (abstractC1893Q != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            m12282f0(i10, i11, iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            i13 = i17;
            i14 = i18;
            i15 = i10 - i17;
            i16 = i11 - i18;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f33596D0.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        m12301v(i13, i14, i15, i16, this.f33593B1, i12, iArr);
        int i19 = iArr[0];
        int i20 = i15 - i19;
        int i21 = iArr[1];
        int i22 = i16 - i21;
        boolean z10 = (i19 == 0 && i21 == 0) ? false : true;
        int i23 = this.f33631f1;
        int[] iArr2 = this.f33593B1;
        int i24 = iArr2[0];
        this.f33631f1 = i23 - i24;
        int i25 = this.f33632g1;
        int i26 = iArr2[1];
        this.f33632g1 = i25 - i26;
        int[] iArr3 = this.f33595C1;
        iArr3[0] = iArr3[0] + i24;
        iArr3[1] = iArr3[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x4 = motionEvent.getX();
                float f10 = i20;
                float y8 = motionEvent.getY();
                float f11 = i22;
                if (f10 < 0.0f) {
                    m12304y();
                    AbstractC8150n4.m8691d(this.f33621V0, (-f10) / getWidth(), 1.0f - (y8 / getHeight()));
                } else {
                    if (f10 > 0.0f) {
                        m12305z();
                        AbstractC8150n4.m8691d(this.f33623X0, f10 / getWidth(), y8 / getHeight());
                    } else {
                        z6 = false;
                    }
                    if (f11 < 0.0f) {
                        m12254A();
                        AbstractC8150n4.m8691d(this.f33622W0, (-f11) / getHeight(), x4 / getWidth());
                    } else if (f11 > 0.0f) {
                        m12303x();
                        AbstractC8150n4.m8691d(this.f33624Y0, f11 / getHeight(), 1.0f - (x4 / getWidth()));
                    } else if (z6 || f10 != 0.0f || f11 != 0.0f) {
                        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                        postInvalidateOnAnimation();
                    }
                    z6 = true;
                    if (z6) {
                        WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
                        postInvalidateOnAnimation();
                    } else {
                        WeakHashMap weakHashMap3 = AbstractC0738T.f2096a;
                        postInvalidateOnAnimation();
                    }
                }
                z6 = true;
                if (f11 < 0.0f) {
                    m12254A();
                    AbstractC8150n4.m8691d(this.f33622W0, (-f11) / getHeight(), x4 / getWidth());
                } else if (f11 > 0.0f) {
                    m12303x();
                    AbstractC8150n4.m8691d(this.f33624Y0, f11 / getHeight(), 1.0f - (x4 / getWidth()));
                } else if (z6) {
                    WeakHashMap weakHashMap4 = AbstractC0738T.f2096a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap5 = AbstractC0738T.f2096a;
                    postInvalidateOnAnimation();
                }
                z6 = true;
                if (z6) {
                    WeakHashMap weakHashMap6 = AbstractC0738T.f2096a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap7 = AbstractC0738T.f2096a;
                    postInvalidateOnAnimation();
                }
            }
            m12294n(i10, i11);
        }
        if (i13 != 0 || i14 != 0) {
            m12302w(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i13 == 0 && i14 == 0) ? false : true;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m12282f0(int i10, int i11, int[] iArr) {
        AbstractC1933p0 abstractC1933p0;
        C1920j c1920j = this.f33650t0;
        m12289j0();
        m12270T();
        int i12 = AbstractC20798j.f66061a;
        Trace.beginSection("RV Scroll");
        C1925l0 c1925l0 = this.f33647r1;
        m12256C(c1925l0);
        C1911e0 c1911e0 = this.f33644q0;
        int iMo2966l0 = i10 != 0 ? this.f33592B0.mo2966l0(i10, c1911e0, c1925l0) : 0;
        int iMo2970n0 = i11 != 0 ? this.f33592B0.mo2970n0(i11, c1911e0, c1925l0) : 0;
        Trace.endSection();
        int iM3072g = c1920j.m3072g();
        for (int i13 = 0; i13 < iM3072g; i13++) {
            View viewM3071f = c1920j.m3071f(i13);
            AbstractC1933p0 abstractC1933p0M12263K = m12263K(viewM3071f);
            if (abstractC1933p0M12263K != null && (abstractC1933p0 = abstractC1933p0M12263K.f5688i) != null) {
                int left = viewM3071f.getLeft();
                int top = viewM3071f.getTop();
                View view = abstractC1933p0.f5680a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m12271U(true);
        m12291k0(false);
        if (iArr != null) {
            iArr[0] = iMo2966l0;
            iArr[1] = iMo2970n0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0190  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i10) {
        View viewMo2935Q;
        int i11;
        byte b;
        boolean z6;
        this.f33592B0.getClass();
        boolean z10 = true;
        boolean z11 = (this.f33590A0 == null || this.f33592B0 == null || m12266P() || this.f33611L0) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        C1925l0 c1925l0 = this.f33647r1;
        C1911e0 c1911e0 = this.f33644q0;
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.f33592B0.mo2952e()) {
                if (focusFinder.findNextFocus(this, view, i10 == 2 ? 130 : 33) == null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            if (!z6 && this.f33592B0.mo2950d()) {
                z6 = focusFinder.findNextFocus(this, view, (this.f33592B0.m2923A() == 1) ^ (i10 == 2) ? 66 : 17) == null;
            }
            if (z6) {
                m12295p();
                if (m12257D(view) == null) {
                    return null;
                }
                m12289j0();
                this.f33592B0.mo2935Q(view, i10, c1911e0, c1925l0);
                m12291k0(false);
            }
            viewMo2935Q = focusFinder.findNextFocus(this, view, i10);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (viewFindNextFocus == null && z11) {
                m12295p();
                if (m12257D(view) == null) {
                    return null;
                }
                m12289j0();
                viewMo2935Q = this.f33592B0.mo2935Q(view, i10, c1911e0, c1925l0);
                m12291k0(false);
            } else {
                viewMo2935Q = viewFindNextFocus;
            }
        }
        if (viewMo2935Q != null && !viewMo2935Q.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i10);
            }
            m12279c0(viewMo2935Q, null);
            return view;
        }
        if (viewMo2935Q == null || viewMo2935Q == this || viewMo2935Q == view) {
            z10 = false;
        } else if (m12257D(viewMo2935Q) == null) {
            z10 = false;
        } else if (view != null && m12257D(view) != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f33658x0;
            rect.set(0, 0, width, height);
            int width2 = viewMo2935Q.getWidth();
            int height2 = viewMo2935Q.getHeight();
            Rect rect2 = this.f33660y0;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewMo2935Q, rect2);
            int i12 = this.f33592B0.m2923A() == 1 ? -1 : 1;
            int i13 = rect.left;
            int i14 = rect2.left;
            if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
                i11 = 1;
            } else {
                int i15 = rect.right;
                int i16 = rect2.right;
                i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
            }
            int i17 = rect.top;
            int i18 = rect2.top;
            if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
                b = 1;
            } else {
                int i19 = rect.bottom;
                int i20 = rect2.bottom;
                b = ((i19 > i20 || i17 >= i20) && i17 > i18) ? (byte) -1 : (byte) 0;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 17) {
                        if (i10 != 33) {
                            if (i10 != 66) {
                                if (i10 != 130) {
                                    StringBuilder sb2 = new StringBuilder("Invalid direction: ");
                                    sb2.append(i10);
                                    throw new IllegalArgumentException(AbstractC0168G.m531t(this, sb2));
                                }
                                if (b <= 0) {
                                    z10 = false;
                                }
                            } else if (i11 <= 0) {
                                z10 = false;
                            }
                        } else if (b >= 0) {
                            z10 = false;
                        }
                    } else if (i11 >= 0) {
                        z10 = false;
                    }
                } else if (b <= 0 && (b != 0 || i11 * i12 <= 0)) {
                    z10 = false;
                }
            } else if (b >= 0 && (b != 0 || i11 * i12 >= 0)) {
                z10 = false;
            }
        }
        return z10 ? viewMo2935Q : super.focusSearch(view, i10);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m12283g0(int i10) {
        C1886J c1886j;
        if (this.f33611L0) {
            return;
        }
        setScrollState(0);
        RunnableC1931o0 runnableC1931o0 = this.f33641o1;
        runnableC1931o0.f5673s0.removeCallbacks(runnableC1931o0);
        runnableC1931o0.f5669o0.abortAnimation();
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        if (abstractC1900Y != null && (c1886j = abstractC1900Y.f5546e) != null) {
            c1886j.m2875h();
        }
        AbstractC1900Y abstractC1900Y2 = this.f33592B0;
        if (abstractC1900Y2 == null) {
            AbstractC15256t.m16465c("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC1900Y2.mo2968m0(i10);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        if (abstractC1900Y != null) {
            return abstractC1900Y.mo2977r();
        }
        throw new IllegalStateException(AbstractC0168G.m531t(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        if (abstractC1900Y != null) {
            return abstractC1900Y.mo2979s(getContext(), attributeSet);
        }
        throw new IllegalStateException(AbstractC0168G.m531t(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC1893Q getAdapter() {
        return this.f33590A0;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        if (abstractC1900Y == null) {
            return super.getBaseline();
        }
        abstractC1900Y.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f33654v0;
    }

    public C1937r0 getCompatAccessibilityDelegate() {
        return this.f33661y1;
    }

    public AbstractC1896U getEdgeEffectFactory() {
        return this.f33620U0;
    }

    public AbstractC1897V getItemAnimator() {
        return this.f33625Z0;
    }

    public int getItemDecorationCount() {
        return this.f33596D0.size();
    }

    public AbstractC1900Y getLayoutManager() {
        return this.f33592B0;
    }

    public int getMaxFlingVelocity() {
        return this.f33636k1;
    }

    public int getMinFlingVelocity() {
        return this.f33635j1;
    }

    public long getNanoTime() {
        if (f33586Q1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC1903a0 getOnFlingListener() {
        return this.f33634i1;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f33639n1;
    }

    public C1909d0 getRecycledViewPool() {
        return this.f33644q0.m3028c();
    }

    public int getScrollState() {
        return this.f33626a1;
    }

    /* JADX INFO: renamed from: h */
    public final void m12284h(AbstractC1933p0 abstractC1933p0) {
        View view = abstractC1933p0.f5680a;
        boolean z6 = view.getParent() == this;
        this.f33644q0.m3037l(m12263K(view));
        if (abstractC1933p0.m3097l()) {
            this.f33650t0.m3068c(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z6) {
            this.f33650t0.m3066a(view, -1, true);
            return;
        }
        C1920j c1920j = this.f33650t0;
        int iIndexOfChild = ((RecyclerView) ((C3032c) c1920j.f5618p0).f9127Z).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((C1918i) c1920j.f5619q0).m3064v(iIndexOfChild);
            c1920j.m3077l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m12285h0(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        float fM8690c = AbstractC8150n4.m8690c(edgeEffect) * i11;
        float fAbs = Math.abs(-i10) * 0.35f;
        float f10 = this.f33640o0 * 0.015f;
        double dLog = Math.log(fAbs / f10);
        double d10 = f33583N1;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * dLog) * ((double) f10))) < fM8690c;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m1738f(0);
    }

    /* JADX INFO: renamed from: i */
    public final void m12286i(AbstractC1898W abstractC1898W) {
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        if (abstractC1900Y != null) {
            abstractC1900Y.mo2948c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f33596D0;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC1898W);
        m12268R();
        requestLayout();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m12287i0(int i10, int i11, boolean z6) {
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        if (abstractC1900Y == null) {
            AbstractC15256t.m16465c("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f33611L0) {
            return;
        }
        if (!abstractC1900Y.mo2950d()) {
            i10 = 0;
        }
        if (!this.f33592B0.mo2952e()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (z6) {
            int i12 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i12 |= 2;
            }
            getScrollingChildHelper().m1739g(i12, 1);
        }
        this.f33641o1.m3085c(i10, i11, Integer.MIN_VALUE, null);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f33602G0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f33611L0;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f2177d;
    }

    /* JADX INFO: renamed from: j */
    public final void m12288j(AbstractC1905b0 abstractC1905b0) {
        if (this.f33651t1 == null) {
            this.f33651t1 = new ArrayList();
        }
        this.f33651t1.add(abstractC1905b0);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m12289j0() {
        int i10 = this.f33608J0 + 1;
        this.f33608J0 = i10;
        if (i10 != 1 || this.f33611L0) {
            return;
        }
        this.f33610K0 = false;
    }

    /* JADX INFO: renamed from: k */
    public final void m12290k(String str) {
        if (m12266P()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(AbstractC0168G.m531t(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f33619T0 > 0) {
            AbstractC15256t.m16483u("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(AbstractC0168G.m531t(this, new StringBuilder(""))));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m12291k0(boolean z6) {
        if (this.f33608J0 < 1) {
            if (f33580K1) {
                throw new IllegalStateException(AbstractC0168G.m531t(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f33608J0 = 1;
        }
        if (!z6 && !this.f33611L0) {
            this.f33610K0 = false;
        }
        if (this.f33608J0 == 1) {
            if (z6 && this.f33610K0 && !this.f33611L0 && this.f33592B0 != null && this.f33590A0 != null) {
                m12297r();
            }
            if (!this.f33611L0) {
                this.f33610K0 = false;
            }
        }
        this.f33608J0--;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m12292l0(int i10) {
        getScrollingChildHelper().m1740h(i10);
    }

    /* JADX INFO: renamed from: m */
    public final void m12293m() {
        int iM3076k = this.f33650t0.m3076k();
        for (int i10 = 0; i10 < iM3076k; i10++) {
            AbstractC1933p0 abstractC1933p0M12244L = m12244L(this.f33650t0.m3075j(i10));
            if (!abstractC1933p0M12244L.m3102q()) {
                abstractC1933p0M12244L.f5683d = -1;
                abstractC1933p0M12244L.f5686g = -1;
            }
        }
        C1911e0 c1911e0 = this.f33644q0;
        ArrayList arrayList = c1911e0.f5588c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC1933p0 abstractC1933p0 = (AbstractC1933p0) arrayList.get(i11);
            abstractC1933p0.f5683d = -1;
            abstractC1933p0.f5686g = -1;
        }
        ArrayList arrayList2 = c1911e0.f5586a;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            AbstractC1933p0 abstractC1933p1 = (AbstractC1933p0) arrayList2.get(i12);
            abstractC1933p1.f5683d = -1;
            abstractC1933p1.f5686g = -1;
        }
        ArrayList arrayList3 = c1911e0.f5587b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                AbstractC1933p0 abstractC1933p2 = (AbstractC1933p0) c1911e0.f5587b.get(i13);
                abstractC1933p2.f5683d = -1;
                abstractC1933p2.f5686g = -1;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m12294n(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f33621V0;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.f33621V0.onRelease();
            zIsFinished = this.f33621V0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f33623X0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f33623X0.onRelease();
            zIsFinished |= this.f33623X0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f33622W0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f33622W0.onRelease();
            zIsFinished |= this.f33622W0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f33624Y0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f33624Y0.onRelease();
            zIsFinished |= this.f33624Y0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f33618S0 = 0;
        this.f33602G0 = true;
        this.f33606I0 = this.f33606I0 && !isLayoutRequested();
        this.f33644q0.m3029d();
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        if (abstractC1900Y != null) {
            abstractC1900Y.f5548g = true;
        }
        this.f33659x1 = false;
        if (f33586Q1) {
            ThreadLocal threadLocal = RunnableC1880D.f5464q0;
            RunnableC1880D runnableC1880D = (RunnableC1880D) threadLocal.get();
            this.f33643p1 = runnableC1880D;
            if (runnableC1880D == null) {
                RunnableC1880D runnableC1880D2 = new RunnableC1880D();
                runnableC1880D2.f5466Y = new ArrayList();
                runnableC1880D2.f5469p0 = new ArrayList();
                this.f33643p1 = runnableC1880D2;
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                RunnableC1880D runnableC1880D3 = this.f33643p1;
                runnableC1880D3.f5468o0 = (long) (1.0E9f / refreshRate);
                threadLocal.set(runnableC1880D3);
            }
            RunnableC1880D runnableC1880D4 = this.f33643p1;
            runnableC1880D4.getClass();
            boolean z6 = f33580K1;
            ArrayList arrayList = runnableC1880D4.f5466Y;
            if (z6 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1911e0 c1911e0;
        RunnableC1880D runnableC1880D;
        C1886J c1886j;
        super.onDetachedFromWindow();
        AbstractC1897V abstractC1897V = this.f33625Z0;
        if (abstractC1897V != null) {
            abstractC1897V.mo2913e();
        }
        int i10 = 0;
        setScrollState(0);
        RunnableC1931o0 runnableC1931o0 = this.f33641o1;
        runnableC1931o0.f5673s0.removeCallbacks(runnableC1931o0);
        runnableC1931o0.f5669o0.abortAnimation();
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        if (abstractC1900Y != null && (c1886j = abstractC1900Y.f5546e) != null) {
            c1886j.m2875h();
        }
        this.f33602G0 = false;
        AbstractC1900Y abstractC1900Y2 = this.f33592B0;
        if (abstractC1900Y2 != null) {
            abstractC1900Y2.f5548g = false;
            abstractC1900Y2.mo2934P(this);
        }
        this.f33599E1.clear();
        removeCallbacks(this.f33601F1);
        this.f33652u0.getClass();
        while (C1877A0.f5451d.mo912a() != null) {
        }
        int i11 = 0;
        while (true) {
            c1911e0 = this.f33644q0;
            ArrayList arrayList = c1911e0.f5588c;
            if (i11 >= arrayList.size()) {
                break;
            }
            AbstractC8536P2.m9198a(((AbstractC1933p0) arrayList.get(i11)).f5680a);
            i11++;
        }
        c1911e0.m3030e(c1911e0.f5593h.f33590A0, false);
        while (i10 < getChildCount()) {
            int i12 = i10 + 1;
            View childAt = getChildAt(i10);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = AbstractC8536P2.m9199b(childAt).f14809a;
            for (int iM19381j = AbstractC17681o.m19381j(arrayList2); -1 < iM19381j; iM19381j--) {
                ((C0152A1) arrayList2.get(iM19381j)).f628a.m734e();
            }
            i10 = i12;
        }
        if (!f33586Q1 || (runnableC1880D = this.f33643p1) == null) {
            return;
        }
        boolean zRemove = runnableC1880D.f5466Y.remove(this);
        if (f33580K1 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f33643p1 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f33596D0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC1898W) arrayList.get(i10)).mo2916b(canvas, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float axisValue;
        if (this.f33592B0 != null && !this.f33611L0 && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f10 = this.f33592B0.mo2952e() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f33592B0.mo2950d() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f33592B0.mo2952e()) {
                    f10 = -axisValue2;
                } else if (this.f33592B0.mo2950d()) {
                    axisValue = axisValue2;
                    f10 = 0.0f;
                } else {
                    f10 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f10 = 0.0f;
                axisValue = 0.0f;
            }
            if (f10 != 0.0f || axisValue != 0.0f) {
                int i10 = (int) (axisValue * this.f33637l1);
                int i11 = (int) (f10 * this.f33638m1);
                AbstractC1900Y abstractC1900Y = this.f33592B0;
                if (abstractC1900Y == null) {
                    AbstractC15256t.m16465c("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.f33611L0) {
                    int[] iArr = this.f33597D1;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zMo2950d = abstractC1900Y.mo2950d();
                    boolean zMo2952e = this.f33592B0.mo2952e();
                    int i12 = zMo2952e ? (zMo2950d ? 1 : 0) | 2 : zMo2950d ? 1 : 0;
                    float y8 = motionEvent.getY();
                    float x4 = motionEvent.getX();
                    int iM12277a0 = i10 - m12277a0(i10, y8);
                    int iM12278b0 = i11 - m12278b0(i11, x4);
                    getScrollingChildHelper().m1739g(i12, 1);
                    if (m12300u(zMo2950d ? iM12277a0 : 0, zMo2952e ? iM12278b0 : 0, 1, this.f33597D1, this.f33593B1)) {
                        iM12277a0 -= iArr[0];
                        iM12278b0 -= iArr[1];
                    }
                    m12281e0(zMo2950d ? iM12277a0 : 0, zMo2952e ? iM12278b0 : 0, motionEvent, 1);
                    RunnableC1880D runnableC1880D = this.f33643p1;
                    if (runnableC1880D != null && (iM12277a0 != 0 || iM12278b0 != 0)) {
                        runnableC1880D.m2864a(this, iM12277a0, iM12278b0);
                    }
                    m12292l0(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        boolean z10;
        if (this.f33611L0) {
            return false;
        }
        this.f33600F0 = null;
        if (m12258E(motionEvent)) {
            m12280d0();
            setScrollState(0);
            return true;
        }
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        if (abstractC1900Y == null) {
            return false;
        }
        boolean zMo2950d = abstractC1900Y.mo2950d();
        boolean zMo2952e = this.f33592B0.mo2952e();
        if (this.f33628c1 == null) {
            this.f33628c1 = VelocityTracker.obtain();
        }
        this.f33628c1.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f33612M0) {
                this.f33612M0 = false;
            }
            this.f33627b1 = motionEvent.getPointerId(0);
            int x4 = (int) (motionEvent.getX() + 0.5f);
            this.f33631f1 = x4;
            this.f33629d1 = x4;
            int y8 = (int) (motionEvent.getY() + 0.5f);
            this.f33632g1 = y8;
            this.f33630e1 = y8;
            EdgeEffect edgeEffect = this.f33621V0;
            if (edgeEffect == null || AbstractC8150n4.m8690c(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                z6 = false;
            } else {
                AbstractC8150n4.m8691d(this.f33621V0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z6 = true;
            }
            EdgeEffect edgeEffect2 = this.f33623X0;
            boolean z11 = z6;
            if (edgeEffect2 != null && AbstractC8150n4.m8690c(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                z11 = z6;
                z11 = z6;
                AbstractC8150n4.m8691d(this.f33623X0, 0.0f, motionEvent.getY() / getHeight());
                z11 = true;
            }
            z11 = z6;
            z11 = z6;
            z11 = z6;
            EdgeEffect edgeEffect3 = this.f33622W0;
            boolean z12 = z11;
            if (edgeEffect3 != null && AbstractC8150n4.m8690c(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                z12 = z11;
                z12 = z11;
                AbstractC8150n4.m8691d(this.f33622W0, 0.0f, motionEvent.getX() / getWidth());
                z12 = true;
            }
            z12 = z11;
            z12 = z11;
            z12 = z11;
            EdgeEffect edgeEffect4 = this.f33624Y0;
            boolean z13 = z12;
            if (edgeEffect4 != null && AbstractC8150n4.m8690c(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                z13 = z12;
                z13 = z12;
                AbstractC8150n4.m8691d(this.f33624Y0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                z13 = true;
            }
            if (z13 || this.f33626a1 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m12292l0(1);
            }
            int[] iArr = this.f33595C1;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = zMo2950d;
            if (zMo2952e) {
                i10 = (zMo2950d ? 1 : 0) | 2;
            }
            getScrollingChildHelper().m1739g(i10, 0);
        } else if (actionMasked == 1) {
            this.f33628c1.clear();
            m12292l0(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f33627b1);
            if (iFindPointerIndex < 0) {
                AbstractC15256t.m16465c("RecyclerView", "Error processing scroll; pointer index for id " + this.f33627b1 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y9 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f33626a1 != 1) {
                int i11 = x10 - this.f33629d1;
                int i12 = y9 - this.f33630e1;
                if (!zMo2950d || Math.abs(i11) <= this.f33633h1) {
                    z10 = false;
                } else {
                    this.f33631f1 = x10;
                    z10 = true;
                }
                if (zMo2952e && Math.abs(i12) > this.f33633h1) {
                    this.f33632g1 = y9;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m12280d0();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f33627b1 = motionEvent.getPointerId(actionIndex);
            int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f33631f1 = x11;
            this.f33629d1 = x11;
            int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f33632g1 = y10;
            this.f33630e1 = y10;
        } else if (actionMasked == 6) {
            m12272V(motionEvent);
        }
        return this.f33626a1 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int i14 = AbstractC20798j.f66061a;
        Trace.beginSection("RV OnLayout");
        m12297r();
        Trace.endSection();
        this.f33606I0 = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        if (abstractC1900Y == null) {
            m12296q(i10, i11);
            return;
        }
        boolean zMo2930J = abstractC1900Y.mo2930J();
        boolean z6 = false;
        C1925l0 c1925l0 = this.f33647r1;
        if (zMo2930J) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f33592B0.f5543b.m12296q(i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z6 = true;
            }
            this.f33603G1 = z6;
            if (z6 || this.f33590A0 == null) {
                return;
            }
            if (c1925l0.f5639d == 1) {
                m12298s();
            }
            this.f33592B0.m2974p0(i10, i11);
            c1925l0.f5644i = true;
            m12299t();
            this.f33592B0.m2978r0(i10, i11);
            if (this.f33592B0.mo2984u0()) {
                this.f33592B0.m2974p0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                c1925l0.f5644i = true;
                m12299t();
                this.f33592B0.m2978r0(i10, i11);
            }
            this.f33605H1 = getMeasuredWidth();
            this.f33607I1 = getMeasuredHeight();
            return;
        }
        if (this.f33604H0) {
            this.f33592B0.f5543b.m12296q(i10, i11);
            return;
        }
        if (this.f33614O0) {
            m12289j0();
            m12270T();
            m12274X();
            m12271U(true);
            if (c1925l0.f5646k) {
                c1925l0.f5642g = true;
            } else {
                this.f33648s0.m2996d();
                c1925l0.f5642g = false;
            }
            this.f33614O0 = false;
            m12291k0(false);
        } else if (c1925l0.f5646k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC1893Q abstractC1893Q = this.f33590A0;
        if (abstractC1893Q != null) {
            c1925l0.f5640e = abstractC1893Q.mo2898a();
        } else {
            c1925l0.f5640e = 0;
        }
        m12289j0();
        this.f33592B0.f5543b.m12296q(i10, i11);
        m12291k0(false);
        c1925l0.f5642g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (m12266P()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1919i0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1919i0 c1919i0 = (C1919i0) parcelable;
        this.f33646r0 = c1919i0;
        super.onRestoreInstanceState(c1919i0.f16000Y);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1919i0 c1919i0 = new C1919i0(super.onSaveInstanceState());
        C1919i0 c1919i1 = this.f33646r0;
        if (c1919i1 != null) {
            c1919i0.f5614o0 = c1919i1.f5614o0;
        } else {
            AbstractC1900Y abstractC1900Y = this.f33592B0;
            if (abstractC1900Y != null) {
                c1919i0.f5614o0 = abstractC1900Y.mo2951d0();
            } else {
                c1919i0.f5614o0 = null;
            }
        }
        return c1919i0;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        this.f33624Y0 = null;
        this.f33622W0 = null;
        this.f33623X0 = null;
        this.f33621V0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:181:0x0355  */
    /* JADX WARN: Code duplicated, block: B:199:0x0397  */
    /* JADX WARN: Code duplicated, block: B:238:0x041e  */
    /* JADX WARN: Code duplicated, block: B:300:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:302:0x04e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:303:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fa A[PHI: r0
      0x01fa: PHI (r0v55 int) = (r0v40 int), (r0v59 int) binds: [B:90:0x01e3, B:94:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v28 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM12258E;
        RecyclerView recyclerView;
        int i10;
        MotionEvent motionEvent2;
        int iMax;
        int i11;
        RunnableC1931o0 runnableC1931o0;
        MotionEvent motionEvent3;
        int minFlingVelocity;
        boolean z6;
        AbstractC1888L abstractC1888LM2895d;
        int iM2917F;
        PointF pointFMo3080a;
        RunnableC1931o0 runnableC1931o1;
        int i12;
        RecyclerView recyclerView2;
        boolean z10;
        if (this.f33611L0 || this.f33612M0) {
            return false;
        }
        C1876A c1876a = this.f33600F0;
        if (c1876a == null) {
            zM12258E = motionEvent.getAction() == 0 ? false : m12258E(motionEvent);
        } else {
            if (c1876a.f5446v != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean zM2856e = c1876a.m2856e(motionEvent.getX(), motionEvent.getY());
                    boolean zM2855d = c1876a.m2855d(motionEvent.getX(), motionEvent.getY());
                    if (zM2856e || zM2855d) {
                        if (zM2855d) {
                            c1876a.f5447w = 1;
                            c1876a.f5440p = (int) motionEvent.getX();
                        } else if (zM2856e) {
                            c1876a.f5447w = 2;
                            c1876a.f5437m = (int) motionEvent.getY();
                        }
                        c1876a.m2857g(2);
                    }
                } else if (motionEvent.getAction() == 1 && c1876a.f5446v == 2) {
                    c1876a.f5437m = 0.0f;
                    c1876a.f5440p = 0.0f;
                    c1876a.m2857g(1);
                    c1876a.f5447w = 0;
                } else if (motionEvent.getAction() == 2 && c1876a.f5446v == 2) {
                    c1876a.m2858h();
                    int i13 = c1876a.f5447w;
                    int i14 = c1876a.f5426b;
                    if (i13 == 1) {
                        float x4 = motionEvent.getX();
                        int[] iArr = c1876a.f5449y;
                        iArr[0] = i14;
                        int i15 = c1876a.f5441q - i14;
                        iArr[1] = i15;
                        float fMax = Math.max(i14, Math.min(i15, x4));
                        if (Math.abs(c1876a.f5439o - fMax) >= 2.0f) {
                            int iM2853f = C1876A.m2853f(c1876a.f5440p, fMax, iArr, c1876a.f5443s.computeHorizontalScrollRange(), c1876a.f5443s.computeHorizontalScrollOffset(), c1876a.f5441q);
                            if (iM2853f != 0) {
                                c1876a.f5443s.scrollBy(iM2853f, 0);
                            }
                            c1876a.f5440p = fMax;
                        }
                    }
                    if (c1876a.f5447w == 2) {
                        float y8 = motionEvent.getY();
                        int[] iArr2 = c1876a.f5448x;
                        iArr2[0] = i14;
                        int i16 = c1876a.f5442r - i14;
                        iArr2[1] = i16;
                        float fMax2 = Math.max(i14, Math.min(i16, y8));
                        if (Math.abs(c1876a.f5436l - fMax2) >= 2.0f) {
                            int iM2853f2 = C1876A.m2853f(c1876a.f5437m, fMax2, iArr2, c1876a.f5443s.computeVerticalScrollRange(), c1876a.f5443s.computeVerticalScrollOffset(), c1876a.f5442r);
                            if (iM2853f2 != 0) {
                                c1876a.f5443s.scrollBy(0, iM2853f2);
                            }
                            c1876a.f5437m = fMax2;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f33600F0 = null;
            }
            zM12258E = true;
        }
        if (zM12258E) {
            m12280d0();
            setScrollState(0);
            return true;
        }
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        if (abstractC1900Y == null) {
            return false;
        }
        boolean zMo2950d = abstractC1900Y.mo2950d();
        boolean zMo2952e = this.f33592B0.mo2952e();
        if (this.f33628c1 == null) {
            this.f33628c1 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.f33595C1;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f33627b1);
                    if (iFindPointerIndex < 0) {
                        AbstractC15256t.m16465c("RecyclerView", "Error processing scroll; pointer index for id " + this.f33627b1 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y9 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    int iMax2 = this.f33631f1 - x10;
                    int iMax3 = this.f33632g1 - y9;
                    if (this.f33626a1 != 1) {
                        if (zMo2950d) {
                            iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.f33633h1) : Math.min(0, iMax2 + this.f33633h1);
                            if (iMax2 != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = false;
                        }
                        if (zMo2952e) {
                            iMax3 = iMax3 > 0 ? Math.max(0, iMax3 - this.f33633h1) : Math.min(0, iMax3 + this.f33633h1);
                            if (iMax3 != 0) {
                                z10 = true;
                            }
                        }
                        if (z10) {
                            setScrollState(1);
                        }
                    }
                    if (this.f33626a1 == 1) {
                        int[] iArr4 = this.f33597D1;
                        iArr4[0] = 0;
                        iArr4[1] = 0;
                        int iM12277a0 = iMax2 - m12277a0(iMax2, motionEvent.getY());
                        int iM12278b0 = iMax3 - m12278b0(iMax3, motionEvent.getX());
                        boolean zM12300u = m12300u(zMo2950d ? iM12277a0 : 0, zMo2952e ? iM12278b0 : 0, 0, this.f33597D1, this.f33593B1);
                        int[] iArr5 = this.f33593B1;
                        if (zM12300u) {
                            iM12277a0 -= iArr4[0];
                            iM12278b0 -= iArr4[1];
                            iArr3[0] = iArr3[0] + iArr5[0];
                            iArr3[1] = iArr3[1] + iArr5[1];
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        int i17 = iM12277a0;
                        int i18 = iM12278b0;
                        this.f33631f1 = x10 - iArr5[0];
                        this.f33632g1 = y9 - iArr5[1];
                        if (m12281e0(zMo2950d ? i17 : 0, zMo2952e ? i18 : 0, motionEvent, 0)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        RunnableC1880D runnableC1880D = this.f33643p1;
                        if (runnableC1880D != null && (i17 != 0 || i18 != 0)) {
                            runnableC1880D.m2864a(this, i17, i18);
                        }
                    }
                } else if (actionMasked == 3) {
                    m12280d0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f33627b1 = motionEvent.getPointerId(actionIndex);
                    int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f33631f1 = x11;
                    this.f33629d1 = x11;
                    int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f33632g1 = y10;
                    this.f33630e1 = y10;
                } else if (actionMasked == 6) {
                    m12272V(motionEvent);
                }
                recyclerView = this;
            } else {
                this.f33628c1.addMovement(motionEventObtain);
                VelocityTracker velocityTracker = this.f33628c1;
                int i19 = this.f33636k1;
                velocityTracker.computeCurrentVelocity(1000, i19);
                float f10 = zMo2950d ? -this.f33628c1.getXVelocity(this.f33627b1) : 0.0f;
                float f11 = zMo2952e ? -this.f33628c1.getYVelocity(this.f33627b1) : 0.0f;
                if (f10 == 0.0f && f11 == 0.0f) {
                    recyclerView2 = this;
                    i12 = 0;
                    motionEvent3 = motionEventObtain;
                } else {
                    int i20 = (int) f10;
                    int iMax4 = (int) f11;
                    AbstractC1900Y abstractC1900Y2 = this.f33592B0;
                    if (abstractC1900Y2 == null) {
                        AbstractC15256t.m16465c("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else {
                        if (!this.f33611L0) {
                            int iMo2950d = abstractC1900Y2.mo2950d();
                            boolean zMo2952e2 = this.f33592B0.mo2952e();
                            int i21 = this.f33635j1;
                            if (iMo2950d == 0 || Math.abs(i20) < i21) {
                                i20 = 0;
                            }
                            if (!zMo2952e2 || Math.abs(iMax4) < i21) {
                                iMax4 = 0;
                            }
                            if (i20 != 0 || iMax4 != 0) {
                                if (i20 == 0) {
                                    iMax = 0;
                                } else {
                                    EdgeEffect edgeEffect = this.f33621V0;
                                    if (edgeEffect == null || AbstractC8150n4.m8690c(edgeEffect) == 0.0f) {
                                        EdgeEffect edgeEffect2 = this.f33623X0;
                                        if (edgeEffect2 == null || AbstractC8150n4.m8690c(edgeEffect2) == 0.0f) {
                                            iMax = 0;
                                        } else if (m12285h0(this.f33623X0, i20, getWidth())) {
                                            this.f33623X0.onAbsorb(i20);
                                            i20 = 0;
                                        }
                                    } else {
                                        int i22 = -i20;
                                        if (m12285h0(this.f33621V0, i22, getWidth())) {
                                            this.f33621V0.onAbsorb(i22);
                                            i20 = 0;
                                        }
                                    }
                                    iMax = i20;
                                    i20 = 0;
                                }
                                if (iMax4 == 0) {
                                    i11 = iMax4;
                                    iMax4 = 0;
                                } else {
                                    EdgeEffect edgeEffect3 = this.f33622W0;
                                    if (edgeEffect3 == null || AbstractC8150n4.m8690c(edgeEffect3) == 0.0f) {
                                        EdgeEffect edgeEffect4 = this.f33624Y0;
                                        if (edgeEffect4 == null || AbstractC8150n4.m8690c(edgeEffect4) == 0.0f) {
                                            i11 = iMax4;
                                            iMax4 = 0;
                                        } else if (m12285h0(this.f33624Y0, iMax4, getHeight())) {
                                            this.f33624Y0.onAbsorb(iMax4);
                                            iMax4 = 0;
                                        }
                                    } else {
                                        int i23 = -iMax4;
                                        if (m12285h0(this.f33622W0, i23, getHeight())) {
                                            this.f33622W0.onAbsorb(i23);
                                            iMax4 = 0;
                                        }
                                    }
                                    i11 = 0;
                                }
                                RunnableC1931o0 runnableC1931o2 = this.f33641o1;
                                if (iMax != 0 || iMax4 != 0) {
                                    int i24 = -i19;
                                    iMax = Math.max(i24, Math.min(iMax, i19));
                                    iMax4 = Math.max(i24, Math.min(iMax4, i19));
                                    runnableC1931o2.m3083a(iMax, iMax4);
                                }
                                if (i20 != 0 || i11 != 0) {
                                    float f12 = i20;
                                    float f13 = i11;
                                    if (!dispatchNestedPreFling(f12, f13)) {
                                        boolean z11 = iMo2950d != 0 || zMo2952e2;
                                        dispatchNestedFling(f12, f13, z11);
                                        AbstractC1903a0 abstractC1903a0 = this.f33634i1;
                                        if (abstractC1903a0 != null) {
                                            C1890N c1890n = (C1890N) abstractC1903a0;
                                            AbstractC1900Y layoutManager = c1890n.f5522a.getLayoutManager();
                                            if (layoutManager == 0 || c1890n.f5522a.getAdapter() == null || ((Math.abs(i11) <= (minFlingVelocity = c1890n.f5522a.getMinFlingVelocity()) && Math.abs(i20) <= minFlingVelocity) || !((z6 = layoutManager instanceof InterfaceC1923k0)))) {
                                                runnableC1931o0 = runnableC1931o2;
                                                motionEvent3 = motionEventObtain;
                                                if (z11) {
                                                    if (zMo2952e2) {
                                                        iMo2950d = (iMo2950d == true ? 1 : 0) | 2;
                                                    }
                                                    getScrollingChildHelper().m1739g(iMo2950d, 1);
                                                    int i25 = -i19;
                                                    runnableC1931o0.m3083a(Math.max(i25, Math.min(i20, i19)), Math.max(i25, Math.min(i11, i19)));
                                                }
                                            } else {
                                                C1889M c1889m = !z6 ? null : new C1889M(c1890n, c1890n.f5522a.getContext(), 0);
                                                if (c1889m == null) {
                                                    runnableC1931o0 = runnableC1931o2;
                                                    motionEvent3 = motionEventObtain;
                                                } else {
                                                    int iM2992z = layoutManager.m2992z();
                                                    if (iM2992z != 0) {
                                                        if (layoutManager.mo2952e()) {
                                                            abstractC1888LM2895d = c1890n.m2896e(layoutManager);
                                                        } else {
                                                            abstractC1888LM2895d = layoutManager.mo2950d() ? c1890n.m2895d(layoutManager) : null;
                                                        }
                                                        if (abstractC1888LM2895d == null) {
                                                            runnableC1931o0 = runnableC1931o2;
                                                            motionEvent3 = motionEventObtain;
                                                        } else {
                                                            int iM2985v = layoutManager.m2985v();
                                                            motionEvent3 = motionEventObtain;
                                                            int i26 = Integer.MIN_VALUE;
                                                            int i27 = Integer.MAX_VALUE;
                                                            int i28 = 0;
                                                            View view = null;
                                                            View view2 = null;
                                                            while (i28 < iM2985v) {
                                                                int i29 = iM2985v;
                                                                View viewM2983u = layoutManager.m2983u(i28);
                                                                if (viewM2983u == null) {
                                                                    runnableC1931o1 = runnableC1931o2;
                                                                } else {
                                                                    runnableC1931o1 = runnableC1931o2;
                                                                    int iM2892b = C1890N.m2892b(viewM2983u, abstractC1888LM2895d);
                                                                    if (iM2892b <= 0 && iM2892b > i26) {
                                                                        view2 = viewM2983u;
                                                                        i26 = iM2892b;
                                                                    }
                                                                    if (iM2892b >= 0 && iM2892b < i27) {
                                                                        view = viewM2983u;
                                                                        i27 = iM2892b;
                                                                    }
                                                                }
                                                                i28++;
                                                                iM2985v = i29;
                                                                runnableC1931o2 = runnableC1931o1;
                                                            }
                                                            runnableC1931o0 = runnableC1931o2;
                                                            boolean z12 = !layoutManager.mo2950d() ? i11 <= 0 : i20 <= 0;
                                                            if (z12 && view != null) {
                                                                iM2917F = AbstractC1900Y.m2917F(view);
                                                            } else if (z12 || view2 == null) {
                                                                if (z12) {
                                                                    view = view2;
                                                                }
                                                                if (view != null) {
                                                                    iM2917F = ((z6 && (pointFMo3080a = ((InterfaceC1923k0) layoutManager).mo3080a(layoutManager.m2992z() - 1)) != null && ((pointFMo3080a.x > 0.0f ? 1 : (pointFMo3080a.x == 0.0f ? 0 : -1)) < 0 || (pointFMo3080a.y > 0.0f ? 1 : (pointFMo3080a.y == 0.0f ? 0 : -1)) < 0)) == z12 ? -1 : 1) + AbstractC1900Y.m2917F(view);
                                                                    if (iM2917F < 0 || iM2917F >= iM2992z) {
                                                                    }
                                                                }
                                                            } else {
                                                                iM2917F = AbstractC1900Y.m2917F(view2);
                                                            }
                                                        }
                                                        iM2917F = -1;
                                                    } else {
                                                        runnableC1931o0 = runnableC1931o2;
                                                        motionEvent3 = motionEventObtain;
                                                        iM2917F = -1;
                                                    }
                                                    if (iM2917F != -1) {
                                                        c1889m.f5500a = iM2917F;
                                                        layoutManager.m2989x0(c1889m);
                                                    }
                                                }
                                                if (z11) {
                                                    if (zMo2952e2) {
                                                        iMo2950d = (iMo2950d == true ? 1 : 0) | 2;
                                                    }
                                                    getScrollingChildHelper().m1739g(iMo2950d, 1);
                                                    int i210 = -i19;
                                                    runnableC1931o0.m3083a(Math.max(i210, Math.min(i20, i19)), Math.max(i210, Math.min(i11, i19)));
                                                }
                                            }
                                        } else {
                                            runnableC1931o0 = runnableC1931o2;
                                            motionEvent3 = motionEventObtain;
                                            if (z11) {
                                                if (zMo2952e2) {
                                                    iMo2950d = (iMo2950d == true ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().m1739g(iMo2950d, 1);
                                                int i211 = -i19;
                                                runnableC1931o0.m3083a(Math.max(i211, Math.min(i20, i19)), Math.max(i211, Math.min(i11, i19)));
                                            }
                                        }
                                    }
                                    i12 = 0;
                                    recyclerView2 = this;
                                } else if (iMax != 0 || iMax4 != 0) {
                                    motionEvent3 = motionEventObtain;
                                }
                            }
                        }
                        m12280d0();
                        motionEvent2 = motionEvent3;
                    }
                    motionEvent3 = motionEventObtain;
                    i12 = 0;
                    recyclerView2 = this;
                }
                recyclerView2.setScrollState(i12);
                m12280d0();
                motionEvent2 = motionEvent3;
            }
            motionEvent2.recycle();
            return true;
        }
        recyclerView = this;
        recyclerView.f33627b1 = motionEvent.getPointerId(0);
        int x12 = (int) (motionEvent.getX() + 0.5f);
        recyclerView.f33631f1 = x12;
        recyclerView.f33629d1 = x12;
        int y11 = (int) (motionEvent.getY() + 0.5f);
        recyclerView.f33632g1 = y11;
        recyclerView.f33630e1 = y11;
        if (zMo2952e) {
            i10 = zMo2950d;
            i10 = (zMo2950d ? 1 : 0) | 2;
        }
        i10 = zMo2950d;
        getScrollingChildHelper().m1739g(i10, 0);
        motionEvent2 = motionEventObtain;
        recyclerView.f33628c1.addMovement(motionEvent2);
        motionEvent2.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m12295p() {
        C1920j c1920j = this.f33650t0;
        C1904b c1904b = this.f33648s0;
        if (!this.f33606I0 || this.f33616Q0) {
            int i10 = AbstractC20798j.f66061a;
            Trace.beginSection("RV FullInvalidate");
            m12297r();
            Trace.endSection();
            return;
        }
        if (c1904b.m3002j()) {
            int i11 = c1904b.f5565a;
            if ((i11 & 4) == 0 || (i11 & 11) != 0) {
                if (c1904b.m3002j()) {
                    int i12 = AbstractC20798j.f66061a;
                    Trace.beginSection("RV FullInvalidate");
                    m12297r();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i13 = AbstractC20798j.f66061a;
            Trace.beginSection("RV PartialInvalidate");
            m12289j0();
            m12270T();
            c1904b.m3008p();
            if (!this.f33610K0) {
                int iM3072g = c1920j.m3072g();
                for (int i14 = 0; i14 < iM3072g; i14++) {
                    AbstractC1933p0 abstractC1933p0M12244L = m12244L(c1920j.m3071f(i14));
                    if (abstractC1933p0M12244L != null && !abstractC1933p0M12244L.m3102q() && abstractC1933p0M12244L.m3098m()) {
                        m12297r();
                    }
                }
                c1904b.m2995c();
            }
            m12291k0(true);
            m12271U(true);
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m12296q(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        setMeasuredDimension(AbstractC1900Y.m2921g(i10, paddingRight, getMinimumWidth()), AbstractC1900Y.m2921g(i11, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code duplicated, block: B:164:0x033c  */
    /* JADX WARN: Code duplicated, block: B:183:0x0382  */
    /* JADX WARN: Code duplicated, block: B:185:0x0385  */
    /* JADX WARN: Code duplicated, block: B:191:0x039c  */
    /* JADX WARN: Code duplicated, block: B:193:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:195:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:198:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:201:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:204:0x03c1 A[LOOP:4: B:197:0x03ae->B:204:0x03c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:207:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:210:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:213:0x03dd A[LOOP:5: B:206:0x03ca->B:213:0x03dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:245:0x03c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x03c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x03bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x03e0 A[EDGE_INSN: B:248:0x03e0->B:214:0x03e0 BREAK  A[LOOP:5: B:206:0x03ca->B:213:0x03dd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x03db A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [int] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: r */
    public final void m12297r() {
        long j10;
        AbstractC1933p0 abstractC1933p0;
        int i10;
        int iM3082b;
        int i11;
        int iMin;
        AbstractC1933p0 abstractC1933p0M12260H;
        View view;
        AbstractC1933p0 abstractC1933p0M12260H2;
        View view2;
        int i12;
        View viewFindViewById;
        ArrayList arrayList;
        View view3;
        boolean z6;
        C0781s c0781s;
        ?? r6;
        boolean zM3105g;
        if (this.f33590A0 == null) {
            AbstractC15256t.m16482t("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f33592B0 == null) {
            AbstractC15256t.m16465c("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        C1925l0 c1925l0 = this.f33647r1;
        boolean z10 = false;
        c1925l0.f5644i = false;
        int i13 = 1;
        boolean z11 = this.f33603G1 && !(this.f33605H1 == getWidth() && this.f33607I1 == getHeight());
        this.f33605H1 = 0;
        this.f33607I1 = 0;
        this.f33603G1 = false;
        if (c1925l0.f5639d == 1) {
            m12298s();
            this.f33592B0.m2972o0(this);
            m12299t();
        } else {
            C1904b c1904b = this.f33648s0;
            if ((((ArrayList) c1904b.f5568d).isEmpty() || ((ArrayList) c1904b.f5567c).isEmpty()) && !z11 && this.f33592B0.f5555n == getWidth() && this.f33592B0.f5556o == getHeight()) {
                this.f33592B0.m2972o0(this);
            } else {
                this.f33592B0.m2972o0(this);
                m12299t();
            }
        }
        c1925l0.m3081a(4);
        m12289j0();
        m12270T();
        c1925l0.f5639d = 1;
        boolean z12 = c1925l0.f5645j;
        C1911e0 c1911e0 = this.f33644q0;
        C15358g1 c15358g1 = this.f33652u0;
        if (z12) {
            int iM3072g = this.f33650t0.m3072g() - 1;
            while (iM3072g >= 0) {
                AbstractC1933p0 abstractC1933p0M12244L = m12244L(this.f33650t0.m3071f(iM3072g));
                if (!abstractC1933p0M12244L.m3102q()) {
                    long jM12262J = m12262J(abstractC1933p0M12244L);
                    this.f33625Z0.getClass();
                    C0781s c0781s2 = new C0781s(2);
                    c0781s2.m1767c(abstractC1933p0M12244L);
                    AbstractC1933p0 abstractC1933p1 = (AbstractC1933p0) ((C12977p) c15358g1.f47946Z).m14664d(jM12262J);
                    if (abstractC1933p1 == null || abstractC1933p1.m3102q()) {
                        c15358g1.m16581g(abstractC1933p0M12244L, c0781s2);
                    } else {
                        C12959L c12959l = (C12959L) c15358g1.f47945Y;
                        C1877A0 c1877a0 = (C1877A0) c12959l.get(abstractC1933p1);
                        int i14 = (c1877a0 == null || (c1877a0.f5452a & i13) == 0) ? 0 : i13;
                        C1877A0 c1877a1 = (C1877A0) c12959l.get(abstractC1933p0M12244L);
                        int i15 = (c1877a1 == null || (c1877a1.f5452a & i13) == 0) ? 0 : i13;
                        if (i14 == 0 || abstractC1933p1 != abstractC1933p0M12244L) {
                            C0781s c0781sM16588r = c15358g1.m16588r(abstractC1933p1, 4);
                            c15358g1.m16581g(abstractC1933p0M12244L, c0781s2);
                            C0781s c0781sM16588r2 = c15358g1.m16588r(abstractC1933p0M12244L, 8);
                            if (c0781sM16588r == null) {
                                int iM3072g2 = this.f33650t0.m3072g();
                                for (int i16 = 0; i16 < iM3072g2; i16++) {
                                    AbstractC1933p0 abstractC1933p0M12244L2 = m12244L(this.f33650t0.m3071f(i16));
                                    if (abstractC1933p0M12244L2 != abstractC1933p0M12244L && m12262J(abstractC1933p0M12244L2) == jM12262J) {
                                        AbstractC1893Q abstractC1893Q = this.f33590A0;
                                        if (abstractC1893Q == null || !abstractC1893Q.f5530b) {
                                            StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb2.append(abstractC1933p0M12244L2);
                                            sb2.append(" \n View Holder 2:");
                                            sb2.append(abstractC1933p0M12244L);
                                            throw new IllegalStateException(AbstractC0168G.m531t(this, sb2));
                                        }
                                        StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb3.append(abstractC1933p0M12244L2);
                                        sb3.append(" \n View Holder 2:");
                                        sb3.append(abstractC1933p0M12244L);
                                        throw new IllegalStateException(AbstractC0168G.m531t(this, sb3));
                                    }
                                }
                                AbstractC15256t.m16465c("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC1933p1 + " cannot be found but it is necessary for " + abstractC1933p0M12244L + m12255B());
                            } else {
                                abstractC1933p1.m3101p(false);
                                if (i14 != 0) {
                                    m12284h(abstractC1933p1);
                                }
                                if (abstractC1933p1 != abstractC1933p0M12244L) {
                                    if (i15 != 0) {
                                        m12284h(abstractC1933p0M12244L);
                                    }
                                    abstractC1933p1.f5687h = abstractC1933p0M12244L;
                                    m12284h(abstractC1933p1);
                                    c1911e0.m3037l(abstractC1933p1);
                                    abstractC1933p0M12244L.m3101p(false);
                                    abstractC1933p0M12244L.f5688i = abstractC1933p1;
                                }
                                if (this.f33625Z0.mo2910a(abstractC1933p1, abstractC1933p0M12244L, c0781sM16588r, c0781sM16588r2)) {
                                    m12273W();
                                }
                            }
                        } else {
                            c15358g1.m16581g(abstractC1933p0M12244L, c0781s2);
                        }
                    }
                }
                iM3072g--;
                i13 = 1;
            }
            C12959L c12959l2 = (C12959L) c15358g1.f47945Y;
            int i17 = c12959l2.f41154o0 - 1;
            while (i17 >= 0) {
                AbstractC1933p0 abstractC1933p2 = (AbstractC1933p0) c12959l2.m14646f(i17);
                C1877A0 c1877a2 = (C1877A0) c12959l2.m14647g(i17);
                int i18 = c1877a2.f5452a;
                int i19 = i18 & 3;
                C19506i c19506i = this.f33609J1;
                if (i19 == 3) {
                    RecyclerView recyclerView = (RecyclerView) c19506i.f61960Z;
                    recyclerView.f33592B0.m2958h0(abstractC1933p2.f5680a, recyclerView.f33644q0);
                    r6 = z10;
                } else if ((i18 & 1) != 0) {
                    C0781s c0781s3 = c1877a2.f5453b;
                    if (c0781s3 == null) {
                        RecyclerView recyclerView2 = (RecyclerView) c19506i.f61960Z;
                        recyclerView2.f33592B0.m2958h0(abstractC1933p2.f5680a, recyclerView2.f33644q0);
                        r6 = z10;
                    } else {
                        c19506i.m20613Z(abstractC1933p2, c0781s3, c1877a2.f5454c);
                        r6 = z10;
                    }
                } else if ((i18 & 14) == 14) {
                    c19506i.m20612Y(abstractC1933p2, c1877a2.f5453b, c1877a2.f5454c);
                    r6 = z10;
                } else {
                    if ((i18 & 12) == 12) {
                        C0781s c0781s4 = c1877a2.f5453b;
                        C0781s c0781s5 = c1877a2.f5454c;
                        c19506i.getClass();
                        abstractC1933p2.m3101p(z10);
                        RecyclerView recyclerView3 = (RecyclerView) c19506i.f61960Z;
                        if (!recyclerView3.f33616Q0) {
                            C1934q c1934q = (C1934q) recyclerView3.f33625Z0;
                            c1934q.getClass();
                            int i20 = c0781s4.f2192b;
                            int i21 = c0781s5.f2192b;
                            if (i20 == i21 && c0781s4.f2193c == c0781s5.f2193c) {
                                c1934q.m2911c(abstractC1933p2);
                                zM3105g = false;
                            } else {
                                zM3105g = c1934q.m3105g(abstractC1933p2, i20, c0781s4.f2193c, i21, c0781s5.f2193c);
                            }
                            if (zM3105g) {
                                recyclerView3.m12273W();
                            }
                        } else if (recyclerView3.f33625Z0.mo2910a(abstractC1933p2, abstractC1933p2, c0781s4, c0781s5)) {
                            recyclerView3.m12273W();
                        }
                        r6 = 0;
                    } else {
                        if ((i18 & 4) != 0) {
                            c0781s = null;
                            c19506i.m20613Z(abstractC1933p2, c1877a2.f5453b, null);
                        } else {
                            c0781s = null;
                            if ((i18 & 8) != 0) {
                                c19506i.m20612Y(abstractC1933p2, c1877a2.f5453b, c1877a2.f5454c);
                            }
                        }
                        r6 = 0;
                    }
                    c1877a2.f5452a = r6;
                    c1877a2.f5453b = c0781s;
                    c1877a2.f5454c = c0781s;
                    C1877A0.f5451d.mo914c(c1877a2);
                    i17--;
                    z10 = false;
                }
                c0781s = null;
                c1877a2.f5452a = r6;
                c1877a2.f5453b = c0781s;
                c1877a2.f5454c = c0781s;
                C1877A0.f5451d.mo914c(c1877a2);
                i17--;
                z10 = false;
            }
        }
        View view4 = null;
        this.f33592B0.m2956g0(c1911e0);
        c1925l0.f5637b = c1925l0.f5640e;
        this.f33616Q0 = false;
        this.f33617R0 = false;
        c1925l0.f5645j = false;
        c1925l0.f5646k = false;
        this.f33592B0.f5547f = false;
        ArrayList arrayList2 = c1911e0.f5587b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        if (abstractC1900Y.f5552k) {
            abstractC1900Y.f5551j = 0;
            abstractC1900Y.f5552k = false;
            c1911e0.m3038m();
        }
        this.f33592B0.mo2947b0(c1925l0);
        m12271U(true);
        m12291k0(false);
        ((C12959L) c15358g1.f47945Y).clear();
        ((C12977p) c15358g1.f47946Z).m14662b();
        int[] iArr = this.f33663z1;
        int i22 = iArr[0];
        int i23 = iArr[1];
        m12259F(iArr);
        if ((iArr[0] == i22 && iArr[1] == i23) ? false : true) {
            m12302w(0, 0);
        }
        if (this.f33639n1 && this.f33590A0 != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j10 = c1925l0.f5648m;
                if (j10 == -1) {
                    abstractC1933p0 = null;
                } else {
                    abstractC1933p0 = null;
                }
                if (abstractC1933p0 != null) {
                    arrayList = (ArrayList) this.f33650t0.f5616Z;
                    view3 = abstractC1933p0.f5680a;
                    if (!arrayList.contains(view3)) {
                        if (this.f33650t0.m3072g() > 0) {
                            int i24 = c1925l0.f5647l;
                            if (i24 != -1) {
                            }
                            iM3082b = c1925l0.m3082b();
                            i11 = i10;
                            while (true) {
                                if (i11 < iM3082b) {
                                    abstractC1933p0M12260H2 = m12260H(i11);
                                    if (abstractC1933p0M12260H2 != null) {
                                        view2 = abstractC1933p0M12260H2.f5680a;
                                        if (view2.hasFocusable()) {
                                            view4 = view2;
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iM3082b, i10) - 1; iMin >= 0; iMin--) {
                                    abstractC1933p0M12260H = m12260H(iMin);
                                    if (abstractC1933p0M12260H == null) {
                                        break;
                                        break;
                                    }
                                    view = abstractC1933p0M12260H.f5680a;
                                    if (view.hasFocusable()) {
                                        view4 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.f33650t0.m3072g() > 0) {
                        int i25 = c1925l0.f5647l;
                        if (i25 != -1) {
                        }
                        iM3082b = c1925l0.m3082b();
                        i11 = i10;
                        while (true) {
                            if (i11 < iM3082b) {
                                abstractC1933p0M12260H2 = m12260H(i11);
                                if (abstractC1933p0M12260H2 != null) {
                                    view2 = abstractC1933p0M12260H2.f5680a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                abstractC1933p0M12260H = m12260H(iMin);
                                if (abstractC1933p0M12260H == null) {
                                    break;
                                    break;
                                }
                                view = abstractC1933p0M12260H.f5680a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.f33650t0.m3072g() > 0) {
                    int i26 = c1925l0.f5647l;
                    if (i26 != -1) {
                    }
                    iM3082b = c1925l0.m3082b();
                    i11 = i10;
                    while (true) {
                        if (i11 < iM3082b) {
                            abstractC1933p0M12260H2 = m12260H(i11);
                            if (abstractC1933p0M12260H2 != null) {
                                view2 = abstractC1933p0M12260H2.f5680a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i11++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            abstractC1933p0M12260H = m12260H(iMin);
                            if (abstractC1933p0M12260H == null) {
                                break;
                                break;
                            }
                            view = abstractC1933p0M12260H.f5680a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i12 = c1925l0.f5649n;
                    if (i12 != -1) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            } else if (((ArrayList) this.f33650t0.f5616Z).contains(getFocusedChild())) {
                j10 = c1925l0.f5648m;
                if (j10 == -1 && (z6 = this.f33590A0.f5530b) && z6) {
                    int iM3076k = this.f33650t0.m3076k();
                    abstractC1933p0 = null;
                    for (int i27 = 0; i27 < iM3076k; i27++) {
                        AbstractC1933p0 abstractC1933p0M12244L3 = m12244L(this.f33650t0.m3075j(i27));
                        if (abstractC1933p0M12244L3 != null && !abstractC1933p0M12244L3.m3095j() && abstractC1933p0M12244L3.f5684e == j10) {
                            if (!((ArrayList) this.f33650t0.f5616Z).contains(abstractC1933p0M12244L3.f5680a)) {
                                abstractC1933p0 = abstractC1933p0M12244L3;
                                break;
                            }
                            abstractC1933p0 = abstractC1933p0M12244L3;
                        }
                    }
                } else {
                    abstractC1933p0 = null;
                }
                if (abstractC1933p0 != null) {
                    arrayList = (ArrayList) this.f33650t0.f5616Z;
                    view3 = abstractC1933p0.f5680a;
                    if (!arrayList.contains(view3) && view3.hasFocusable()) {
                        view4 = view3;
                    } else if (this.f33650t0.m3072g() > 0) {
                        int i28 = c1925l0.f5647l;
                        i10 = i28 != -1 ? i28 : 0;
                        iM3082b = c1925l0.m3082b();
                        i11 = i10;
                        while (true) {
                            if (i11 < iM3082b) {
                                abstractC1933p0M12260H2 = m12260H(i11);
                                if (abstractC1933p0M12260H2 != null) {
                                    view2 = abstractC1933p0M12260H2.f5680a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                abstractC1933p0M12260H = m12260H(iMin);
                                if (abstractC1933p0M12260H == null) {
                                    break;
                                }
                                view = abstractC1933p0M12260H.f5680a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.f33650t0.m3072g() > 0) {
                    int i29 = c1925l0.f5647l;
                    if (i29 != -1) {
                    }
                    iM3082b = c1925l0.m3082b();
                    i11 = i10;
                    while (true) {
                        if (i11 < iM3082b) {
                            abstractC1933p0M12260H2 = m12260H(i11);
                            if (abstractC1933p0M12260H2 != null) {
                                view2 = abstractC1933p0M12260H2.f5680a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i11++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            abstractC1933p0M12260H = m12260H(iMin);
                            if (abstractC1933p0M12260H == null) {
                                break;
                                break;
                            }
                            view = abstractC1933p0M12260H.f5680a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i12 = c1925l0.f5649n;
                    if (i12 != -1 && (viewFindViewById = view4.findViewById(i12)) != null && viewFindViewById.isFocusable()) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            }
        }
        c1925l0.f5648m = -1L;
        c1925l0.f5647l = -1;
        c1925l0.f5649n = -1;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z6) {
        AbstractC1933p0 abstractC1933p0M12244L = m12244L(view);
        if (abstractC1933p0M12244L != null) {
            if (abstractC1933p0M12244L.m3097l()) {
                abstractC1933p0M12244L.f5689j &= -257;
            } else if (!abstractC1933p0M12244L.m3102q()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(abstractC1933p0M12244L);
                throw new IllegalArgumentException(AbstractC0168G.m531t(this, sb2));
            }
        } else if (f33580K1) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            throw new IllegalArgumentException(AbstractC0168G.m531t(this, sb3));
        }
        view.clearAnimation();
        m12244L(view);
        super.removeDetachedView(view, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C1886J c1886j = this.f33592B0.f5546e;
        if ((c1886j == null || !c1886j.f5504e) && !m12266P() && view2 != null) {
            m12279c0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        return this.f33592B0.mo2962j0(this, view, rect, z6, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        ArrayList arrayList = this.f33598E0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C1876A) arrayList.get(i10)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f33608J0 != 0 || this.f33611L0) {
            this.f33610K0 = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX INFO: renamed from: s */
    public final void m12298s() {
        int iM12261I;
        C1877A0 c1877a0;
        View viewM12257D;
        C1925l0 c1925l0 = this.f33647r1;
        c1925l0.m3081a(1);
        m12256C(c1925l0);
        c1925l0.f5644i = false;
        m12289j0();
        C15358g1 c15358g1 = this.f33652u0;
        ((C12959L) c15358g1.f47945Y).clear();
        C12977p c12977p = (C12977p) c15358g1.f47946Z;
        c12977p.m14662b();
        m12270T();
        m12274X();
        AbstractC1933p0 abstractC1933p0M12263K = null;
        View focusedChild = (this.f33639n1 && hasFocus() && this.f33590A0 != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewM12257D = m12257D(focusedChild)) != null) {
            abstractC1933p0M12263K = m12263K(viewM12257D);
        }
        if (abstractC1933p0M12263K == null) {
            c1925l0.f5648m = -1L;
            c1925l0.f5647l = -1;
            c1925l0.f5649n = -1;
        } else {
            c1925l0.f5648m = this.f33590A0.f5530b ? abstractC1933p0M12263K.f5684e : -1L;
            if (this.f33616Q0) {
                iM12261I = -1;
            } else if (abstractC1933p0M12263K.m3095j()) {
                iM12261I = abstractC1933p0M12263K.f5683d;
            } else {
                RecyclerView recyclerView = abstractC1933p0M12263K.f5697r;
                if (recyclerView == null) {
                    iM12261I = -1;
                } else {
                    iM12261I = recyclerView.m12261I(abstractC1933p0M12263K);
                }
            }
            c1925l0.f5647l = iM12261I;
            View focusedChild2 = abstractC1933p0M12263K.f5680a;
            int id2 = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id2 = focusedChild2.getId();
                }
            }
            c1925l0.f5649n = id2;
        }
        c1925l0.f5643h = c1925l0.f5645j && this.f33655v1;
        this.f33655v1 = false;
        this.f33653u1 = false;
        c1925l0.f5642g = c1925l0.f5646k;
        c1925l0.f5640e = this.f33590A0.mo2898a();
        m12259F(this.f33663z1);
        boolean z6 = c1925l0.f5645j;
        C12959L c12959l = (C12959L) c15358g1.f47945Y;
        if (z6) {
            int iM3072g = this.f33650t0.m3072g();
            for (int i10 = 0; i10 < iM3072g; i10++) {
                AbstractC1933p0 abstractC1933p0M12244L = m12244L(this.f33650t0.m3071f(i10));
                if (!abstractC1933p0M12244L.m3102q() && (!abstractC1933p0M12244L.m3093h() || this.f33590A0.f5530b)) {
                    AbstractC1897V abstractC1897V = this.f33625Z0;
                    AbstractC1897V.m2909b(abstractC1933p0M12244L);
                    abstractC1933p0M12244L.m3089d();
                    abstractC1897V.getClass();
                    C0781s c0781s = new C0781s(2);
                    c0781s.m1767c(abstractC1933p0M12244L);
                    C1877A0 c1877a0M2859a = (C1877A0) c12959l.get(abstractC1933p0M12244L);
                    if (c1877a0M2859a == null) {
                        c1877a0M2859a = C1877A0.m2859a();
                        c12959l.put(abstractC1933p0M12244L, c1877a0M2859a);
                    }
                    c1877a0M2859a.f5453b = c0781s;
                    c1877a0M2859a.f5452a |= 4;
                    if (c1925l0.f5643h && abstractC1933p0M12244L.m3098m() && !abstractC1933p0M12244L.m3095j() && !abstractC1933p0M12244L.m3102q() && !abstractC1933p0M12244L.m3093h()) {
                        c12977p.m14668h(m12262J(abstractC1933p0M12244L), abstractC1933p0M12244L);
                    }
                }
            }
        }
        if (c1925l0.f5646k) {
            int iM3076k = this.f33650t0.m3076k();
            for (int i11 = 0; i11 < iM3076k; i11++) {
                AbstractC1933p0 abstractC1933p0M12244L2 = m12244L(this.f33650t0.m3075j(i11));
                if (f33580K1 && abstractC1933p0M12244L2.f5682c == -1 && !abstractC1933p0M12244L2.m3095j()) {
                    throw new IllegalStateException(AbstractC0168G.m531t(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!abstractC1933p0M12244L2.m3102q() && abstractC1933p0M12244L2.f5683d == -1) {
                    abstractC1933p0M12244L2.f5683d = abstractC1933p0M12244L2.f5682c;
                }
            }
            boolean z10 = c1925l0.f5641f;
            c1925l0.f5641f = false;
            this.f33592B0.mo2945a0(this.f33644q0, c1925l0);
            c1925l0.f5641f = z10;
            for (int i12 = 0; i12 < this.f33650t0.m3072g(); i12++) {
                AbstractC1933p0 abstractC1933p0M12244L3 = m12244L(this.f33650t0.m3071f(i12));
                if (!abstractC1933p0M12244L3.m3102q() && ((c1877a0 = (C1877A0) c12959l.get(abstractC1933p0M12244L3)) == null || (c1877a0.f5452a & 4) == 0)) {
                    AbstractC1897V.m2909b(abstractC1933p0M12244L3);
                    boolean zM3090e = abstractC1933p0M12244L3.m3090e(8192);
                    AbstractC1897V abstractC1897V2 = this.f33625Z0;
                    abstractC1933p0M12244L3.m3089d();
                    abstractC1897V2.getClass();
                    C0781s c0781s2 = new C0781s(2);
                    c0781s2.m1767c(abstractC1933p0M12244L3);
                    if (zM3090e) {
                        m12276Z(abstractC1933p0M12244L3, c0781s2);
                    } else {
                        C1877A0 c1877a0M2859a2 = (C1877A0) c12959l.get(abstractC1933p0M12244L3);
                        if (c1877a0M2859a2 == null) {
                            c1877a0M2859a2 = C1877A0.m2859a();
                            c12959l.put(abstractC1933p0M12244L3, c1877a0M2859a2);
                        }
                        c1877a0M2859a2.f5452a |= 2;
                        c1877a0M2859a2.f5453b = c0781s2;
                    }
                }
            }
            m12293m();
        } else {
            m12293m();
        }
        m12271U(true);
        m12291k0(false);
        c1925l0.f5639d = 2;
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        if (abstractC1900Y == null) {
            AbstractC15256t.m16465c("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f33611L0) {
            return;
        }
        boolean zMo2950d = abstractC1900Y.mo2950d();
        boolean zMo2952e = this.f33592B0.mo2952e();
        if (zMo2950d || zMo2952e) {
            if (!zMo2950d) {
                i10 = 0;
            }
            if (!zMo2952e) {
                i11 = 0;
            }
            m12281e0(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        AbstractC15256t.m16482t("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m12266P()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f33613N0 |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C1937r0 c1937r0) {
        this.f33661y1 = c1937r0;
        AbstractC0738T.m1584l(this, c1937r0);
    }

    public void setAdapter(AbstractC1893Q abstractC1893Q) {
        setLayoutFrozen(false);
        AbstractC1893Q abstractC1893Q2 = this.f33590A0;
        C1915g0 c1915g0 = this.f33642p0;
        if (abstractC1893Q2 != null) {
            abstractC1893Q2.f5529a.unregisterObserver(c1915g0);
            this.f33590A0.getClass();
        }
        AbstractC1897V abstractC1897V = this.f33625Z0;
        if (abstractC1897V != null) {
            abstractC1897V.mo2913e();
        }
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        C1911e0 c1911e0 = this.f33644q0;
        if (abstractC1900Y != null) {
            abstractC1900Y.m2955f0(c1911e0);
            this.f33592B0.m2956g0(c1911e0);
        }
        c1911e0.f5586a.clear();
        c1911e0.m3031f();
        C1904b c1904b = this.f33648s0;
        c1904b.m3009q((ArrayList) c1904b.f5567c);
        c1904b.m3009q((ArrayList) c1904b.f5568d);
        c1904b.f5565a = 0;
        AbstractC1893Q abstractC1893Q3 = this.f33590A0;
        this.f33590A0 = abstractC1893Q;
        if (abstractC1893Q != null) {
            abstractC1893Q.f5529a.registerObserver(c1915g0);
        }
        AbstractC1900Y abstractC1900Y2 = this.f33592B0;
        if (abstractC1900Y2 != null) {
            abstractC1900Y2.mo2933O();
        }
        AbstractC1893Q abstractC1893Q4 = this.f33590A0;
        c1911e0.f5586a.clear();
        c1911e0.m3031f();
        c1911e0.m3030e(abstractC1893Q3, true);
        C1909d0 c1909d0M3028c = c1911e0.m3028c();
        if (abstractC1893Q3 != null) {
            c1909d0M3028c.f5580b--;
        }
        if (c1909d0M3028c.f5580b == 0) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = c1909d0M3028c.f5579a;
                if (i10 >= sparseArray.size()) {
                    break;
                }
                C1907c0 c1907c0 = (C1907c0) sparseArray.valueAt(i10);
                Iterator it = c1907c0.f5574a.iterator();
                while (it.hasNext()) {
                    AbstractC8536P2.m9198a(((AbstractC1933p0) it.next()).f5680a);
                }
                c1907c0.f5574a.clear();
                i10++;
            }
        }
        if (abstractC1893Q4 != null) {
            c1909d0M3028c.f5580b++;
        }
        c1911e0.m3029d();
        this.f33647r1.f5641f = true;
        m12275Y(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC1895T interfaceC1895T) {
        if (interfaceC1895T == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z6) {
        if (z6 != this.f33654v0) {
            this.f33624Y0 = null;
            this.f33622W0 = null;
            this.f33623X0 = null;
            this.f33621V0 = null;
        }
        this.f33654v0 = z6;
        super.setClipToPadding(z6);
        if (this.f33606I0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(AbstractC1896U abstractC1896U) {
        abstractC1896U.getClass();
        this.f33620U0 = abstractC1896U;
        this.f33624Y0 = null;
        this.f33622W0 = null;
        this.f33623X0 = null;
        this.f33621V0 = null;
    }

    public void setHasFixedSize(boolean z6) {
        this.f33604H0 = z6;
    }

    public void setItemAnimator(AbstractC1897V abstractC1897V) {
        AbstractC1897V abstractC1897V2 = this.f33625Z0;
        if (abstractC1897V2 != null) {
            abstractC1897V2.mo2913e();
            this.f33625Z0.f5532a = null;
        }
        this.f33625Z0 = abstractC1897V;
        if (abstractC1897V != null) {
            abstractC1897V.f5532a = this.f33657w1;
        }
    }

    public void setItemViewCacheSize(int i10) {
        C1911e0 c1911e0 = this.f33644q0;
        c1911e0.f5590e = i10;
        c1911e0.m3038m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z6) {
        suppressLayout(z6);
    }

    public void setLayoutManager(AbstractC1900Y abstractC1900Y) {
        RecyclerView recyclerView;
        C1886J c1886j;
        if (abstractC1900Y == this.f33592B0) {
            return;
        }
        setScrollState(0);
        RunnableC1931o0 runnableC1931o0 = this.f33641o1;
        runnableC1931o0.f5673s0.removeCallbacks(runnableC1931o0);
        runnableC1931o0.f5669o0.abortAnimation();
        AbstractC1900Y abstractC1900Y2 = this.f33592B0;
        if (abstractC1900Y2 != null && (c1886j = abstractC1900Y2.f5546e) != null) {
            c1886j.m2875h();
        }
        AbstractC1900Y abstractC1900Y3 = this.f33592B0;
        C1911e0 c1911e0 = this.f33644q0;
        if (abstractC1900Y3 != null) {
            AbstractC1897V abstractC1897V = this.f33625Z0;
            if (abstractC1897V != null) {
                abstractC1897V.mo2913e();
            }
            this.f33592B0.m2955f0(c1911e0);
            this.f33592B0.m2956g0(c1911e0);
            c1911e0.f5586a.clear();
            c1911e0.m3031f();
            if (this.f33602G0) {
                AbstractC1900Y abstractC1900Y4 = this.f33592B0;
                abstractC1900Y4.f5548g = false;
                abstractC1900Y4.mo2934P(this);
            }
            this.f33592B0.m2980s0(null);
            this.f33592B0 = null;
        } else {
            c1911e0.f5586a.clear();
            c1911e0.m3031f();
        }
        C1920j c1920j = this.f33650t0;
        ((C1918i) c1920j.f5619q0).m3063u();
        ArrayList arrayList = (ArrayList) c1920j.f5616Z;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = (RecyclerView) ((C3032c) c1920j.f5618p0).f9127Z;
            if (size < 0) {
                break;
            }
            AbstractC1933p0 abstractC1933p0M12244L = m12244L((View) arrayList.get(size));
            if (abstractC1933p0M12244L != null) {
                int i10 = abstractC1933p0M12244L.f5695p;
                if (recyclerView.m12266P()) {
                    abstractC1933p0M12244L.f5696q = i10;
                    recyclerView.f33599E1.add(abstractC1933p0M12244L);
                } else {
                    WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                    abstractC1933p0M12244L.f5680a.setImportantForAccessibility(i10);
                }
                abstractC1933p0M12244L.f5695p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            m12244L(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f33592B0 = abstractC1900Y;
        if (abstractC1900Y != null) {
            if (abstractC1900Y.f5543b != null) {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(abstractC1900Y);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(AbstractC0168G.m531t(abstractC1900Y.f5543b, sb2));
            }
            abstractC1900Y.m2980s0(this);
            if (this.f33602G0) {
                this.f33592B0.f5548g = true;
            }
        }
        c1911e0.m3038m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        C0775p scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f2177d) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            AbstractC0730K.m1556m(scrollingChildHelper.f2176c);
        }
        scrollingChildHelper.f2177d = z6;
    }

    public void setOnFlingListener(AbstractC1903a0 abstractC1903a0) {
        this.f33634i1 = abstractC1903a0;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC1905b0 abstractC1905b0) {
        this.f33649s1 = abstractC1905b0;
    }

    public void setPreserveFocusAfterLayout(boolean z6) {
        this.f33639n1 = z6;
    }

    public void setRecycledViewPool(C1909d0 c1909d0) {
        C1911e0 c1911e0 = this.f33644q0;
        RecyclerView recyclerView = c1911e0.f5593h;
        c1911e0.m3030e(recyclerView.f33590A0, false);
        C1909d0 c1909d1 = c1911e0.f5592g;
        if (c1909d1 != null) {
            c1909d1.f5580b--;
        }
        c1911e0.f5592g = c1909d0;
        if (c1909d0 != null && recyclerView.getAdapter() != null) {
            c1911e0.f5592g.f5580b++;
        }
        c1911e0.m3029d();
    }

    public void setScrollState(int i10) {
        C1886J c1886j;
        if (i10 == this.f33626a1) {
            return;
        }
        if (f33581L1) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "setting scroll state to ", " from ");
            sbM11057o.append(this.f33626a1);
            Log.d("RecyclerView", sbM11057o.toString(), new Exception());
        }
        this.f33626a1 = i10;
        if (i10 != 2) {
            RunnableC1931o0 runnableC1931o0 = this.f33641o1;
            runnableC1931o0.f5673s0.removeCallbacks(runnableC1931o0);
            runnableC1931o0.f5669o0.abortAnimation();
            AbstractC1900Y abstractC1900Y = this.f33592B0;
            if (abstractC1900Y != null && (c1886j = abstractC1900Y.f5546e) != null) {
                c1886j.m2875h();
            }
        }
        AbstractC1900Y abstractC1900Y2 = this.f33592B0;
        if (abstractC1900Y2 != null) {
            abstractC1900Y2.mo2953e0(i10);
        }
        AbstractC1905b0 abstractC1905b0 = this.f33649s1;
        if (abstractC1905b0 != null) {
            abstractC1905b0.mo3014a(this, i10);
        }
        ArrayList arrayList = this.f33651t1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC1905b0) this.f33651t1.get(size)).mo3014a(this, i10);
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.f33633h1 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            AbstractC15256t.m16482t("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.f33633h1 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC1929n0 abstractC1929n0) {
        this.f33644q0.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().m1739g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m1740h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z6) {
        C1886J c1886j;
        if (z6 != this.f33611L0) {
            m12290k("Do not suppressLayout in layout or scroll");
            if (!z6) {
                this.f33611L0 = false;
                if (this.f33610K0 && this.f33592B0 != null && this.f33590A0 != null) {
                    requestLayout();
                }
                this.f33610K0 = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f33611L0 = true;
            this.f33612M0 = true;
            setScrollState(0);
            RunnableC1931o0 runnableC1931o0 = this.f33641o1;
            runnableC1931o0.f5673s0.removeCallbacks(runnableC1931o0);
            runnableC1931o0.f5669o0.abortAnimation();
            AbstractC1900Y abstractC1900Y = this.f33592B0;
            if (abstractC1900Y == null || (c1886j = abstractC1900Y.f5546e) == null) {
                return;
            }
            c1886j.m2875h();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m12299t() {
        m12289j0();
        m12270T();
        C1925l0 c1925l0 = this.f33647r1;
        c1925l0.m3081a(6);
        this.f33648s0.m2996d();
        c1925l0.f5640e = this.f33590A0.mo2898a();
        c1925l0.f5638c = 0;
        if (this.f33646r0 != null) {
            AbstractC1893Q abstractC1893Q = this.f33590A0;
            int iM24h = AbstractC0010F.m24h(abstractC1893Q.f5531c);
            if (iM24h == 1 ? abstractC1893Q.mo2898a() > 0 : iM24h != 2) {
                Parcelable parcelable = this.f33646r0.f5614o0;
                if (parcelable != null) {
                    this.f33592B0.mo2949c0(parcelable);
                }
                this.f33646r0 = null;
            }
        }
        c1925l0.f5642g = false;
        this.f33592B0.mo2945a0(this.f33644q0, c1925l0);
        c1925l0.f5641f = false;
        c1925l0.f5645j = c1925l0.f5645j && this.f33625Z0 != null;
        c1925l0.f5639d = 4;
        m12271U(true);
        m12291k0(false);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m12300u(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m1735c(i10, i11, i12, iArr, iArr2);
    }

    /* JADX INFO: renamed from: v */
    public final void m12301v(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().m1736d(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    /* JADX INFO: renamed from: w */
    public final void m12302w(int i10, int i11) {
        this.f33619T0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        AbstractC1905b0 abstractC1905b0 = this.f33649s1;
        if (abstractC1905b0 != null) {
            abstractC1905b0.mo3015b(this, i10, i11);
        }
        ArrayList arrayList = this.f33651t1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC1905b0) this.f33651t1.get(size)).mo3015b(this, i10, i11);
            }
        }
        this.f33619T0--;
    }

    /* JADX INFO: renamed from: x */
    public final void m12303x() {
        if (this.f33624Y0 != null) {
            return;
        }
        ((C1927m0) this.f33620U0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f33624Y0 = edgeEffect;
        if (this.f33654v0) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m12304y() {
        if (this.f33621V0 != null) {
            return;
        }
        ((C1927m0) this.f33620U0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f33621V0 = edgeEffect;
        if (this.f33654v0) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m12305z() {
        if (this.f33623X0 != null) {
            return;
        }
        ((C1927m0) this.f33620U0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f33623X0 = edgeEffect;
        if (this.f33654v0) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.StringBuilder] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        float fM1587a;
        ?? r14;
        char c9;
        ?? r6;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i10);
        int i11 = 6;
        int i12 = 4;
        int i13 = 1;
        int i14 = 5;
        this.f33642p0 = new C1915g0(this);
        this.f33644q0 = new C1911e0(this);
        this.f33652u0 = new C15358g1(3);
        this.f33656w0 = new RunnableC1891O(this, 0);
        this.f33658x0 = new Rect();
        this.f33660y0 = new Rect();
        this.f33662z0 = new RectF();
        this.f33594C0 = new ArrayList();
        this.f33596D0 = new ArrayList();
        this.f33598E0 = new ArrayList();
        this.f33608J0 = 0;
        this.f33616Q0 = false;
        this.f33617R0 = false;
        this.f33618S0 = 0;
        this.f33619T0 = 0;
        this.f33620U0 = f33589U1;
        C1934q c1934q = new C1934q();
        c1934q.f5532a = null;
        c1934q.f5533b = new ArrayList();
        c1934q.f5534c = 120L;
        c1934q.f5535d = 120L;
        c1934q.f5536e = 250L;
        c1934q.f5537f = 250L;
        c1934q.f5700g = true;
        c1934q.f5701h = new ArrayList();
        c1934q.f5702i = new ArrayList();
        c1934q.f5703j = new ArrayList();
        c1934q.f5704k = new ArrayList();
        c1934q.f5705l = new ArrayList();
        c1934q.f5706m = new ArrayList();
        c1934q.f5707n = new ArrayList();
        c1934q.f5708o = new ArrayList();
        c1934q.f5709p = new ArrayList();
        c1934q.f5710q = new ArrayList();
        c1934q.f5711r = new ArrayList();
        this.f33625Z0 = c1934q;
        this.f33626a1 = 0;
        this.f33627b1 = -1;
        this.f33637l1 = Float.MIN_VALUE;
        this.f33638m1 = Float.MIN_VALUE;
        this.f33639n1 = true;
        this.f33641o1 = new RunnableC1931o0(this);
        this.f33645q1 = f33586Q1 ? new C1878B() : null;
        C1925l0 c1925l0 = new C1925l0();
        c1925l0.f5636a = -1;
        c1925l0.f5637b = 0;
        c1925l0.f5638c = 0;
        c1925l0.f5639d = 1;
        c1925l0.f5640e = 0;
        c1925l0.f5641f = false;
        c1925l0.f5642g = false;
        c1925l0.f5643h = false;
        c1925l0.f5644i = false;
        c1925l0.f5645j = false;
        c1925l0.f5646k = false;
        this.f33647r1 = c1925l0;
        this.f33653u1 = false;
        this.f33655v1 = false;
        C10808o c10808o = new C10808o(this, i14);
        this.f33657w1 = c10808o;
        this.f33659x1 = false;
        this.f33663z1 = new int[2];
        this.f33593B1 = new int[2];
        this.f33595C1 = new int[2];
        this.f33597D1 = new int[2];
        this.f33599E1 = new ArrayList();
        this.f33601F1 = new RunnableC1891O(this, i13);
        this.f33605H1 = 0;
        this.f33607I1 = 0;
        this.f33609J1 = new C19506i(this, i12);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f33633h1 = viewConfiguration.getScaledTouchSlop();
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 26) {
            Method method = AbstractC0739U.f2102a;
            fM1587a = AbstractC0773o.m1721e(viewConfiguration);
        } else {
            fM1587a = AbstractC0739U.m1587a(viewConfiguration, context);
        }
        this.f33637l1 = fM1587a;
        this.f33638m1 = i15 >= 26 ? AbstractC0773o.m1722f(viewConfiguration) : AbstractC0739U.m1587a(viewConfiguration, context);
        this.f33635j1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f33636k1 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f33640o0 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f33625Z0.f5532a = c10808o;
        this.f33648s0 = new C1904b(new C7296c(this, i11));
        this.f33650t0 = new C1920j(new C3032c(this, i14));
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        if ((i15 >= 26 ? AbstractC0732M.m1559a(this) : 0) == 0 && i15 >= 26) {
            AbstractC0732M.m1560b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f33615P0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1937r0(this));
        int[] iArr = AbstractC1582a.f4429a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        AbstractC0738T.m1583k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f33654v0 = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(AbstractC0168G.m531t(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            r14 = 0;
            c9 = 3;
            new C1876A(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.openai.chatgpt.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.openai.chatgpt.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.openai.chatgpt.R.dimen.fastscroll_margin));
        } else {
            r14 = 0;
            c9 = 3;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            ?? Trim = string.trim();
            if (!Trim.isEmpty()) {
                if (Trim.charAt(r14) == '.') {
                    r6 = context.getPackageName() + Trim;
                } else if (!Trim.contains(Separators.DOT)) {
                    r6 = Trim;
                    r6 = RecyclerView.class.getPackage().getName() + '.' + Trim;
                }
                r6 = Trim;
                ?? r10 = r6;
                try {
                    Class clsAsSubclass = Class.forName(r10, r14, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC1900Y.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f33587R1);
                        objArr = new Object[4];
                        objArr[r14] = context;
                        objArr[1] = attributeSet;
                        objArr[2] = Integer.valueOf(i10);
                        objArr[c9] = Integer.valueOf((int) r14);
                    } catch (NoSuchMethodException e10) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e11) {
                            e11.initCause(e10);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + r10, e11);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC1900Y) constructor.newInstance(objArr));
                } catch (ClassCastException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + r10, e12);
                } catch (ClassNotFoundException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + r10, e13);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + r10, e14);
                } catch (InstantiationException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + r10, e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + r10, e16);
                }
            }
        }
        int[] iArr2 = f33582M1;
        ?? ObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr2, i10, r14);
        AbstractC0738T.m1583k(this, context, iArr2, attributeSet, ObtainStyledAttributes, i10);
        boolean z6 = ObtainStyledAttributes.getBoolean(r14, true);
        ObtainStyledAttributes.recycle();
        setNestedScrollingEnabled(z6);
        setTag(com.openai.chatgpt.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC1900Y abstractC1900Y = this.f33592B0;
        if (abstractC1900Y != null) {
            return abstractC1900Y.mo2981t(layoutParams);
        }
        throw new IllegalStateException(AbstractC0168G.m531t(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC1913f0 interfaceC1913f0) {
    }
}
