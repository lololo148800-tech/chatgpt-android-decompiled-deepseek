package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC15256t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import ma.AbstractC17201a;
import ma.C17202b;
import ma.C17203c;
import p001A.C0095w0;
import p030B2.AbstractC0728I;
import p030B2.AbstractC0730K;
import p030B2.AbstractC0738T;
import p030B2.C0745a;
import p030B2.C0747b;
import p056C2.C1511e;
import p084D4.C1952z;
import p1139z0.C21585H;
import p140Fa.C2687g;
import p140Fa.C2691k;
import p165G9.C3018d;
import p166Ga.C3027a;
import p166Ga.C3029c;
import p301M.RunnableC5232n;
import p304M2.C5280c;
import p523V9.AbstractC7979R3;
import p571X9.AbstractC9306j0;
import p783ha.AbstractC14431a;
import p826j6.C16137F;
import p862l2.AbstractC16803b;
import p862l2.C16806e;
import p931ok.ViewOnAttachStateChangeListenerC18222c;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC16803b {

    /* JADX INFO: renamed from: A */
    public boolean f36411A;

    /* JADX INFO: renamed from: B */
    public final C3029c f36412B;

    /* JADX INFO: renamed from: C */
    public final ValueAnimator f36413C;

    /* JADX INFO: renamed from: D */
    public final int f36414D;

    /* JADX INFO: renamed from: E */
    public int f36415E;

    /* JADX INFO: renamed from: F */
    public int f36416F;

    /* JADX INFO: renamed from: G */
    public final float f36417G;

    /* JADX INFO: renamed from: H */
    public int f36418H;

    /* JADX INFO: renamed from: I */
    public final float f36419I;

    /* JADX INFO: renamed from: J */
    public boolean f36420J;

    /* JADX INFO: renamed from: K */
    public boolean f36421K;

    /* JADX INFO: renamed from: L */
    public final boolean f36422L;

    /* JADX INFO: renamed from: M */
    public int f36423M;

    /* JADX INFO: renamed from: N */
    public C5280c f36424N;

    /* JADX INFO: renamed from: O */
    public boolean f36425O;

    /* JADX INFO: renamed from: P */
    public int f36426P;

    /* JADX INFO: renamed from: Q */
    public boolean f36427Q;

    /* JADX INFO: renamed from: R */
    public final float f36428R;

    /* JADX INFO: renamed from: S */
    public int f36429S;

    /* JADX INFO: renamed from: T */
    public int f36430T;

    /* JADX INFO: renamed from: U */
    public int f36431U;

    /* JADX INFO: renamed from: V */
    public WeakReference f36432V;

    /* JADX INFO: renamed from: W */
    public WeakReference f36433W;

    /* JADX INFO: renamed from: X */
    public final ArrayList f36434X;

    /* JADX INFO: renamed from: Y */
    public VelocityTracker f36435Y;

    /* JADX INFO: renamed from: Z */
    public int f36436Z;

    /* JADX INFO: renamed from: a */
    public final int f36437a;

    /* JADX INFO: renamed from: a0 */
    public int f36438a0;

    /* JADX INFO: renamed from: b */
    public boolean f36439b;

    /* JADX INFO: renamed from: b0 */
    public boolean f36440b0;

    /* JADX INFO: renamed from: c */
    public boolean f36441c;

    /* JADX INFO: renamed from: c0 */
    public HashMap f36442c0;

    /* JADX INFO: renamed from: d */
    public final float f36443d;

    /* JADX INFO: renamed from: d0 */
    public final SparseIntArray f36444d0;

    /* JADX INFO: renamed from: e */
    public final int f36445e;

    /* JADX INFO: renamed from: e0 */
    public final C3027a f36446e0;

    /* JADX INFO: renamed from: f */
    public int f36447f;

    /* JADX INFO: renamed from: g */
    public boolean f36448g;

    /* JADX INFO: renamed from: h */
    public int f36449h;

    /* JADX INFO: renamed from: i */
    public final int f36450i;

    /* JADX INFO: renamed from: j */
    public final C2687g f36451j;

    /* JADX INFO: renamed from: k */
    public final ColorStateList f36452k;

    /* JADX INFO: renamed from: l */
    public final int f36453l;

    /* JADX INFO: renamed from: m */
    public int f36454m;

    /* JADX INFO: renamed from: n */
    public int f36455n;

    /* JADX INFO: renamed from: o */
    public final boolean f36456o;

    /* JADX INFO: renamed from: p */
    public final boolean f36457p;

    /* JADX INFO: renamed from: q */
    public final boolean f36458q;

    /* JADX INFO: renamed from: r */
    public final boolean f36459r;

    /* JADX INFO: renamed from: s */
    public final boolean f36460s;

    /* JADX INFO: renamed from: t */
    public final boolean f36461t;

    /* JADX INFO: renamed from: u */
    public final boolean f36462u;

    /* JADX INFO: renamed from: v */
    public final boolean f36463v;

    /* JADX INFO: renamed from: w */
    public int f36464w;

    /* JADX INFO: renamed from: x */
    public int f36465x;

    /* JADX INFO: renamed from: y */
    public final boolean f36466y;

    /* JADX INFO: renamed from: z */
    public final C2691k f36467z;

    public BottomSheetBehavior() {
        this.f36437a = 0;
        this.f36439b = true;
        this.f36441c = false;
        this.f36453l = -1;
        this.f36454m = -1;
        this.f36412B = new C3029c(this);
        this.f36417G = 0.5f;
        this.f36419I = -1.0f;
        this.f36422L = true;
        this.f36423M = 4;
        this.f36428R = 0.1f;
        this.f36434X = new ArrayList();
        this.f36444d0 = new SparseIntArray();
        this.f36446e0 = new C3027a(this, 1);
    }

    /* JADX INFO: renamed from: u */
    public static View m13583u(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        if (AbstractC0730K.m1551h(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View viewM13583u = m13583u(viewGroup.getChildAt(i10));
                if (viewM13583u != null) {
                    return viewM13583u;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static BottomSheetBehavior m13584v(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C16806e)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        AbstractC16803b abstractC16803b = ((C16806e) layoutParams).f53917a;
        if (abstractC16803b instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) abstractC16803b;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    /* JADX INFO: renamed from: w */
    public static int m13585w(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: A */
    public final void m13586A(int i10) {
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(AbstractC9306j0.m9891j(i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally.", new StringBuilder("STATE_")));
        }
        if (!this.f36420J && i10 == 5) {
            AbstractC15256t.m16482t("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f36439b && m13601y(i10) <= this.f36415E) ? 3 : i10;
        WeakReference weakReference = this.f36432V;
        if (weakReference == null || weakReference.get() == null) {
            m13587B(i10);
            return;
        }
        View view = (View) this.f36432V.get();
        RunnableC5232n runnableC5232n = new RunnableC5232n(this, view, i11);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            if (view.isAttachedToWindow()) {
                view.post(runnableC5232n);
                return;
            }
        }
        runnableC5232n.run();
    }

    /* JADX INFO: renamed from: B */
    public final void m13587B(int i10) {
        View view;
        if (this.f36423M == i10) {
            return;
        }
        this.f36423M = i10;
        if (i10 != 4 && i10 != 3 && i10 != 6) {
            boolean z6 = this.f36420J;
        }
        WeakReference weakReference = this.f36432V;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i11 = 0;
        if (i10 == 3) {
            m13592G(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            m13592G(false);
        }
        m13591F(i10, true);
        while (true) {
            ArrayList arrayList = this.f36434X;
            if (i11 >= arrayList.size()) {
                m13590E();
                return;
            } else {
                ((AbstractC17201a) arrayList.get(i11)).mo2028b(view, i10);
                i11++;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m13588C(View view, float f10) {
        if (this.f36421K) {
            return true;
        }
        if (view.getTop() < this.f36418H) {
            return false;
        }
        return Math.abs(((f10 * this.f36428R) + ((float) view.getTop())) - ((float) this.f36418H)) / ((float) m13598s()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        m13587B(2);
        m13591F(r4, true);
        r2.f36412B.m3905f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.m5820o(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13589D(View view, int i10, boolean z6) {
        int iM13601y = m13601y(i10);
        C5280c c5280c = this.f36424N;
        if (c5280c != null) {
            if (!z6) {
                int left = view.getLeft();
                c5280c.f17390r = view;
                c5280c.f17375c = -1;
                boolean zM5813h = c5280c.m5813h(left, iM13601y, 0, 0);
                if (!zM5813h && c5280c.f17373a == 0 && c5280c.f17390r != null) {
                    c5280c.f17390r = null;
                }
            }
        }
        m13587B(i10);
    }

    /* JADX INFO: renamed from: E */
    public final void m13590E() {
        View view;
        int iM2210a;
        WeakReference weakReference = this.f36432V;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0738T.m1581i(view, 524288);
        AbstractC0738T.m1579g(view, 0);
        AbstractC0738T.m1581i(view, 262144);
        AbstractC0738T.m1579g(view, 0);
        AbstractC0738T.m1581i(view, 1048576);
        AbstractC0738T.m1579g(view, 0);
        SparseIntArray sparseIntArray = this.f36444d0;
        int i10 = sparseIntArray.get(0, -1);
        if (i10 != -1) {
            AbstractC0738T.m1581i(view, i10);
            AbstractC0738T.m1579g(view, 0);
            sparseIntArray.delete(0);
        }
        int i11 = 6;
        if (!this.f36439b && this.f36423M != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            C16137F c16137f = new C16137F(this, i11, 13);
            ArrayList arrayListM1577e = AbstractC0738T.m1577e(view);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayListM1577e.size()) {
                    int i13 = -1;
                    for (int i14 = 0; i14 < 32 && i13 == -1; i14++) {
                        int i15 = AbstractC0738T.f2099d[i14];
                        boolean z6 = true;
                        for (int i16 = 0; i16 < arrayListM1577e.size(); i16++) {
                            z6 &= ((C1511e) arrayListM1577e.get(i16)).m2210a() != i15;
                        }
                        if (z6) {
                            i13 = i15;
                        }
                    }
                    iM2210a = i13;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C1511e) arrayListM1577e.get(i12)).f4037a).getLabel())) {
                    iM2210a = ((C1511e) arrayListM1577e.get(i12)).m2210a();
                    break;
                }
                i12++;
            }
            if (iM2210a != -1) {
                C1511e c1511e = new C1511e(null, iM2210a, string, c16137f, null);
                View.AccessibilityDelegate accessibilityDelegateM1575c = AbstractC0738T.m1575c(view);
                C0747b c0747b = accessibilityDelegateM1575c == null ? null : accessibilityDelegateM1575c instanceof C0745a ? ((C0745a) accessibilityDelegateM1575c).f2113a : new C0747b(accessibilityDelegateM1575c);
                if (c0747b == null) {
                    c0747b = new C0747b();
                }
                AbstractC0738T.m1584l(view, c0747b);
                AbstractC0738T.m1581i(view, c1511e.m2210a());
                AbstractC0738T.m1577e(view).add(c1511e);
                AbstractC0738T.m1579g(view, 0);
            }
            sparseIntArray.put(0, iM2210a);
        }
        if (this.f36420J) {
            int i17 = 5;
            if (this.f36423M != 5) {
                AbstractC0738T.m1582j(view, C1511e.f4032l, new C16137F(this, i17, 13));
            }
        }
        int i18 = this.f36423M;
        int i19 = 4;
        int i20 = 3;
        if (i18 == 3) {
            AbstractC0738T.m1582j(view, C1511e.f4031k, new C16137F(this, this.f36439b ? 4 : 6, 13));
            return;
        }
        if (i18 == 4) {
            AbstractC0738T.m1582j(view, C1511e.f4030j, new C16137F(this, this.f36439b ? 3 : 6, 13));
        } else {
            if (i18 != 6) {
                return;
            }
            AbstractC0738T.m1582j(view, C1511e.f4031k, new C16137F(this, i19, 13));
            AbstractC0738T.m1582j(view, C1511e.f4030j, new C16137F(this, i20, 13));
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m13591F(int i10, boolean z6) {
        C2687g c2687g = this.f36451j;
        ValueAnimator valueAnimator = this.f36413C;
        if (i10 == 2) {
            return;
        }
        boolean z10 = this.f36423M == 3 && (this.f36466y || m13600x() == 0);
        if (this.f36411A == z10 || c2687g == null) {
            return;
        }
        this.f36411A = z10;
        if (!z6 || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            c2687g.m3683m(this.f36411A ? 0.0f : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
            return;
        }
        float f10 = z10 ? 0.0f : 1.0f;
        valueAnimator.setFloatValues(1.0f - f10, f10);
        valueAnimator.start();
    }

    /* JADX INFO: renamed from: G */
    public final void m13592G(boolean z6) {
        HashMap map;
        WeakReference weakReference = this.f36432V;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z6) {
                if (this.f36442c0 != null) {
                    return;
                } else {
                    this.f36442c0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f36432V.get()) {
                    if (z6) {
                        this.f36442c0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f36441c) {
                            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.f36441c && (map = this.f36442c0) != null && map.containsKey(childAt)) {
                        int iIntValue = ((Integer) this.f36442c0.get(childAt)).intValue();
                        WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
                        childAt.setImportantForAccessibility(iIntValue);
                    }
                }
            }
            if (!z6) {
                this.f36442c0 = null;
            } else if (this.f36441c) {
                ((View) this.f36432V.get()).sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m13593H() {
        View view;
        if (this.f36432V != null) {
            m13597r();
            if (this.f36423M != 4 || (view = (View) this.f36432V.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: c */
    public final void mo13594c(C16806e c16806e) {
        this.f36432V = null;
        this.f36424N = null;
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: e */
    public final void mo13595e() {
        this.f36432V = null;
        this.f36424N = null;
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: f */
    public final boolean mo13566f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C5280c c5280c;
        if (!view.isShown() || !this.f36422L) {
            this.f36425O = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f36436Z = -1;
            VelocityTracker velocityTracker = this.f36435Y;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f36435Y = null;
            }
        }
        if (this.f36435Y == null) {
            this.f36435Y = VelocityTracker.obtain();
        }
        this.f36435Y.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x4 = (int) motionEvent.getX();
            this.f36438a0 = (int) motionEvent.getY();
            if (this.f36423M != 2) {
                WeakReference weakReference = this.f36433W;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m11376o(view2, x4, this.f36438a0)) {
                    this.f36436Z = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f36440b0 = true;
                }
            }
            this.f36425O = this.f36436Z == -1 && !coordinatorLayout.m11376o(view, x4, this.f36438a0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f36440b0 = false;
            this.f36436Z = -1;
            if (this.f36425O) {
                this.f36425O = false;
                return false;
            }
        }
        if (!this.f36425O && (c5280c = this.f36424N) != null && c5280c.m5821p(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f36433W;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f36425O || this.f36423M == 1 || coordinatorLayout.m11376o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f36424N == null || Math.abs(((float) this.f36438a0) - motionEvent.getY()) <= ((float) this.f36424N.f17374b)) ? false : true;
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: g */
    public final boolean mo13567g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        C2687g c2687g = this.f36451j;
        int i11 = 1;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i12 = 0;
        if (this.f36432V == null) {
            this.f36449h = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z6 = (Build.VERSION.SDK_INT < 29 || this.f36456o || this.f36448g) ? false : true;
            if (this.f36457p || this.f36458q || this.f36459r || this.f36461t || this.f36462u || this.f36463v || z6) {
                C0095w0 c0095w0 = new C0095w0(this, z6, 8);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                C3018d c3018d = new C3018d();
                c3018d.f9092a = paddingStart;
                c3018d.f9093b = paddingEnd;
                c3018d.f9094c = paddingBottom;
                AbstractC0730K.m1555l(view, new C21585H(c0095w0, 22, c3018d));
                if (view.isAttachedToWindow()) {
                    AbstractC0728I.m1543c(view);
                } else {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC18222c(i11));
                }
            }
            AbstractC0738T.m1586n(view, new C17203c(view));
            this.f36432V = new WeakReference(view);
            if (c2687g != null) {
                view.setBackground(c2687g);
                float fM1548e = this.f36419I;
                if (fM1548e == -1.0f) {
                    fM1548e = AbstractC0730K.m1548e(view);
                }
                c2687g.m3681k(fM1548e);
            } else {
                ColorStateList colorStateList = this.f36452k;
                if (colorStateList != null) {
                    AbstractC0730K.m1552i(view, colorStateList);
                }
            }
            m13590E();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f36424N == null) {
            this.f36424N = new C5280c(coordinatorLayout.getContext(), coordinatorLayout, this.f36446e0);
        }
        int top = view.getTop();
        coordinatorLayout.m11378q(view, i10);
        this.f36430T = coordinatorLayout.getWidth();
        this.f36431U = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f36429S = height;
        int i13 = this.f36431U;
        int i14 = i13 - height;
        int i15 = this.f36465x;
        if (i14 < i15) {
            if (this.f36460s) {
                this.f36429S = i13;
            } else {
                this.f36429S = i13 - i15;
            }
        }
        this.f36415E = Math.max(0, i13 - this.f36429S);
        this.f36416F = (int) ((1.0f - this.f36417G) * this.f36431U);
        m13597r();
        int i16 = this.f36423M;
        if (i16 == 3) {
            view.offsetTopAndBottom(m13600x());
        } else if (i16 == 6) {
            view.offsetTopAndBottom(this.f36416F);
        } else if (this.f36420J && i16 == 5) {
            view.offsetTopAndBottom(this.f36431U);
        } else if (i16 == 4) {
            view.offsetTopAndBottom(this.f36418H);
        } else if (i16 == 1 || i16 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        m13591F(this.f36423M, false);
        this.f36433W = new WeakReference(m13583u(view));
        while (true) {
            ArrayList arrayList = this.f36434X;
            if (i12 >= arrayList.size()) {
                return true;
            }
            ((AbstractC17201a) arrayList.get(i12)).getClass();
            i12++;
        }
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: h */
    public final boolean mo13568h(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m13585w(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f36453l, marginLayoutParams.width), m13585w(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f36454m, marginLayoutParams.height));
        return true;
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: i */
    public final boolean mo13596i(View view) {
        WeakReference weakReference = this.f36433W;
        return (weakReference == null || view != weakReference.get() || this.f36423M == 3) ? false : true;
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: j */
    public final void mo13569j(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        boolean z6 = this.f36422L;
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.f36433W;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i13 = top - i11;
        if (i11 > 0) {
            if (i13 < m13600x()) {
                int iM13600x = top - m13600x();
                iArr[1] = iM13600x;
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                view.offsetTopAndBottom(-iM13600x);
                m13587B(3);
            } else {
                if (!z6) {
                    return;
                }
                iArr[1] = i11;
                WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
                view.offsetTopAndBottom(-i11);
                m13587B(1);
            }
        } else if (i11 < 0 && !view2.canScrollVertically(-1)) {
            int i14 = this.f36418H;
            if (i13 > i14 && !this.f36420J) {
                int i15 = top - i14;
                iArr[1] = i15;
                WeakHashMap weakHashMap3 = AbstractC0738T.f2096a;
                view.offsetTopAndBottom(-i15);
                m13587B(4);
            } else {
                if (!z6) {
                    return;
                }
                iArr[1] = i11;
                WeakHashMap weakHashMap4 = AbstractC0738T.f2096a;
                view.offsetTopAndBottom(-i11);
                m13587B(1);
            }
        }
        m13599t(view.getTop());
        this.f36426P = i11;
        this.f36427Q = true;
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: m */
    public final void mo13571m(View view, Parcelable parcelable) {
        C17202b c17202b = (C17202b) parcelable;
        int i10 = this.f36437a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f36447f = c17202b.f54912p0;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f36439b = c17202b.f54913q0;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.f36420J = c17202b.f54914r0;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.f36421K = c17202b.f54915s0;
            }
        }
        int i11 = c17202b.f54911o0;
        if (i11 == 1 || i11 == 2) {
            this.f36423M = 4;
        } else {
            this.f36423M = i11;
        }
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: n */
    public final Parcelable mo13572n(View view) {
        return new C17202b(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: o */
    public final boolean mo13573o(View view, int i10, int i11) {
        this.f36426P = 0;
        this.f36427Q = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: p */
    public final void mo13574p(View view, View view2, int i10) {
        int top;
        int top2;
        int i11;
        float yVelocity;
        int i12 = 3;
        if (view.getTop() == m13600x()) {
            m13587B(3);
            return;
        }
        WeakReference weakReference = this.f36433W;
        if (weakReference != null && view2 == weakReference.get() && this.f36427Q) {
            if (this.f36426P > 0) {
                if (!this.f36439b && view.getTop() > this.f36416F) {
                    i12 = 6;
                }
            } else if (this.f36420J) {
                VelocityTracker velocityTracker = this.f36435Y;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f36443d);
                    yVelocity = this.f36435Y.getYVelocity(this.f36436Z);
                }
                if (m13588C(view, yVelocity)) {
                    i12 = 5;
                } else if (this.f36426P == 0) {
                    top2 = view.getTop();
                    if (this.f36439b) {
                        i11 = this.f36416F;
                        if (top2 < i11) {
                            if (top2 >= Math.abs(top2 - this.f36418H)) {
                            }
                        } else if (Math.abs(top2 - i11) < Math.abs(top2 - this.f36418H)) {
                            i12 = 4;
                        }
                        i12 = 6;
                    } else if (Math.abs(top2 - this.f36415E) >= Math.abs(top2 - this.f36418H)) {
                        i12 = 4;
                    }
                } else {
                    if (!this.f36439b) {
                        top = view.getTop();
                        if (Math.abs(top - this.f36416F) < Math.abs(top - this.f36418H)) {
                            i12 = 6;
                        }
                    }
                    i12 = 4;
                }
            } else if (this.f36426P == 0) {
                top2 = view.getTop();
                if (this.f36439b) {
                    i11 = this.f36416F;
                    if (top2 < i11) {
                        if (top2 >= Math.abs(top2 - this.f36418H)) {
                        }
                    } else if (Math.abs(top2 - i11) < Math.abs(top2 - this.f36418H)) {
                        i12 = 4;
                    }
                    i12 = 6;
                } else if (Math.abs(top2 - this.f36415E) >= Math.abs(top2 - this.f36418H)) {
                    i12 = 4;
                }
            } else {
                if (!this.f36439b) {
                    top = view.getTop();
                    if (Math.abs(top - this.f36416F) < Math.abs(top - this.f36418H)) {
                        i12 = 6;
                    }
                }
                i12 = 4;
            }
            m13589D(view, i12, false);
            this.f36427Q = false;
        }
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: q */
    public final boolean mo13575q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.f36423M;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        C5280c c5280c = this.f36424N;
        if (c5280c != null && (this.f36422L || i10 == 1)) {
            c5280c.m5815j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f36436Z = -1;
            VelocityTracker velocityTracker = this.f36435Y;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f36435Y = null;
            }
        }
        if (this.f36435Y == null) {
            this.f36435Y = VelocityTracker.obtain();
        }
        this.f36435Y.addMovement(motionEvent);
        if (this.f36424N != null && ((this.f36422L || this.f36423M == 1) && actionMasked == 2 && !this.f36425O)) {
            float fAbs = Math.abs(this.f36438a0 - motionEvent.getY());
            C5280c c5280c2 = this.f36424N;
            if (fAbs > c5280c2.f17374b) {
                c5280c2.m5807b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f36425O;
    }

    /* JADX INFO: renamed from: r */
    public final void m13597r() {
        int iM13598s = m13598s();
        if (this.f36439b) {
            this.f36418H = Math.max(this.f36431U - iM13598s, this.f36415E);
        } else {
            this.f36418H = this.f36431U - iM13598s;
        }
    }

    /* JADX INFO: renamed from: s */
    public final int m13598s() {
        int i10;
        if (this.f36448g) {
            return Math.min(Math.max(this.f36449h, this.f36431U - ((this.f36430T * 9) / 16)), this.f36429S) + this.f36464w;
        }
        return (this.f36456o || this.f36457p || (i10 = this.f36455n) <= 0) ? this.f36447f + this.f36464w : Math.max(this.f36447f, i10 + this.f36450i);
    }

    /* JADX INFO: renamed from: t */
    public final void m13599t(int i10) {
        float f10;
        float fM13600x;
        View view = (View) this.f36432V.get();
        if (view != null) {
            ArrayList arrayList = this.f36434X;
            if (arrayList.isEmpty()) {
                return;
            }
            int i11 = this.f36418H;
            if (i10 > i11 || i11 == m13600x()) {
                int i12 = this.f36418H;
                f10 = i12 - i10;
                fM13600x = this.f36431U - i12;
            } else {
                int i13 = this.f36418H;
                f10 = i13 - i10;
                fM13600x = i13 - m13600x();
            }
            float f11 = f10 / fM13600x;
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ((AbstractC17201a) arrayList.get(i14)).mo2027a(view, f11);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final int m13600x() {
        if (this.f36439b) {
            return this.f36415E;
        }
        return Math.max(this.f36414D, this.f36460s ? 0 : this.f36465x);
    }

    /* JADX INFO: renamed from: y */
    public final int m13601y(int i10) {
        if (i10 == 3) {
            return m13600x();
        }
        if (i10 == 4) {
            return this.f36418H;
        }
        if (i10 == 5) {
            return this.f36431U;
        }
        if (i10 == 6) {
            return this.f36416F;
        }
        throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Invalid state to get top offset: "));
    }

    /* JADX INFO: renamed from: z */
    public final void m13602z(int i10) {
        if (i10 == -1) {
            if (this.f36448g) {
                return;
            } else {
                this.f36448g = true;
            }
        } else {
            if (!this.f36448g && this.f36447f == i10) {
                return;
            }
            this.f36448g = false;
            this.f36447f = Math.max(0, i10);
        }
        m13593H();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i10;
        int i11 = 2;
        this.f36437a = 0;
        this.f36439b = true;
        this.f36441c = false;
        this.f36453l = -1;
        this.f36454m = -1;
        this.f36412B = new C3029c(this);
        this.f36417G = 0.5f;
        this.f36419I = -1.0f;
        this.f36422L = true;
        this.f36423M = 4;
        this.f36428R = 0.1f;
        this.f36434X = new ArrayList();
        this.f36444d0 = new SparseIntArray();
        this.f36446e0 = new C3027a(this, 1);
        this.f36450i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC14431a.f45369b);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f36452k = AbstractC7979R3.m8279c(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f36467z = C2691k.m3691b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).m3689a();
        }
        C2691k c2691k = this.f36467z;
        if (c2691k != null) {
            C2687g c2687g = new C2687g(c2691k);
            this.f36451j = c2687g;
            c2687g.m3679i(context);
            ColorStateList colorStateList = this.f36452k;
            if (colorStateList != null) {
                this.f36451j.m3682l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f36451j.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f36413C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f36413C.addUpdateListener(new C1952z(this, i11));
        this.f36419I = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f36453l = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f36454m = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            m13602z(i10);
        } else {
            m13602z(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.f36420J != z6) {
            this.f36420J = z6;
            if (!z6 && this.f36423M == 5) {
                m13586A(4);
            }
            m13590E();
        }
        this.f36456o = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f36439b != z10) {
            this.f36439b = z10;
            if (this.f36432V != null) {
                m13597r();
            }
            m13587B((this.f36439b && this.f36423M == 6) ? 3 : this.f36423M);
            m13591F(this.f36423M, true);
            m13590E();
        }
        this.f36421K = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f36422L = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f36437a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f10 = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f10 > 0.0f && f10 < 1.0f) {
            this.f36417G = f10;
            if (this.f36432V != null) {
                this.f36416F = (int) ((1.0f - f10) * this.f36431U);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i12 = typedValuePeekValue2.data;
                if (i12 >= 0) {
                    this.f36414D = i12;
                    m13591F(this.f36423M, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f36414D = dimensionPixelOffset;
                    m13591F(this.f36423M, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f36445e = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f36457p = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f36458q = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f36459r = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f36460s = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f36461t = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f36462u = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f36463v = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f36466y = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f36443d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: k */
    public final void mo13570k(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }
}
