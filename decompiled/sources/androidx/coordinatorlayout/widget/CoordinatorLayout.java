package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.clientreport.C15333a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p004A2.C0312c;
import p004A2.C0313d;
import p030B2.AbstractC0728I;
import p030B2.AbstractC0730K;
import p030B2.AbstractC0738T;
import p030B2.C0781s;
import p030B2.C0794y0;
import p030B2.InterfaceC0777q;
import p030B2.InterfaceC0779r;
import p033B5.C0842z;
import p117Eb.C2391u;
import p692d0.C12959L;
import p817j$.util.DesugarCollections;
import p844k2.AbstractC16323a;
import p862l2.AbstractC16803b;
import p862l2.AbstractC16809h;
import p862l2.C16806e;
import p862l2.C16808g;
import p862l2.InterfaceC16802a;
import p862l2.InterfaceC16804c;
import p862l2.ViewGroupOnHierarchyChangeListenerC16805d;
import p862l2.ViewTreeObserverOnPreDrawListenerC16807f;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0777q, InterfaceC0779r {

    /* JADX INFO: renamed from: H0 */
    public static final String f32859H0;

    /* JADX INFO: renamed from: I0 */
    public static final Class[] f32860I0;

    /* JADX INFO: renamed from: J0 */
    public static final ThreadLocal f32861J0;

    /* JADX INFO: renamed from: K0 */
    public static final C0842z f32862K0;

    /* JADX INFO: renamed from: L0 */
    public static final C0313d f32863L0;

    /* JADX INFO: renamed from: A0 */
    public boolean f32864A0;

    /* JADX INFO: renamed from: B0 */
    public C0794y0 f32865B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f32866C0;

    /* JADX INFO: renamed from: D0 */
    public Drawable f32867D0;

    /* JADX INFO: renamed from: E0 */
    public ViewGroup.OnHierarchyChangeListener f32868E0;

    /* JADX INFO: renamed from: F0 */
    public C15333a f32869F0;

    /* JADX INFO: renamed from: G0 */
    public final C0781s f32870G0;

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f32871o0;

    /* JADX INFO: renamed from: p0 */
    public final C2391u f32872p0;

    /* JADX INFO: renamed from: q0 */
    public final ArrayList f32873q0;

    /* JADX INFO: renamed from: r0 */
    public final ArrayList f32874r0;

    /* JADX INFO: renamed from: s0 */
    public final int[] f32875s0;

    /* JADX INFO: renamed from: t0 */
    public final int[] f32876t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f32877u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f32878v0;

    /* JADX INFO: renamed from: w0 */
    public final int[] f32879w0;

    /* JADX INFO: renamed from: x0 */
    public View f32880x0;

    /* JADX INFO: renamed from: y0 */
    public View f32881y0;

    /* JADX INFO: renamed from: z0 */
    public ViewTreeObserverOnPreDrawListenerC16807f f32882z0;

    static {
        Package r6 = CoordinatorLayout.class.getPackage();
        f32859H0 = r6 != null ? r6.getName() : null;
        f32862K0 = new C0842z(16);
        f32860I0 = new Class[]{Context.class, AttributeSet.class};
        f32861J0 = new ThreadLocal();
        f32863L0 = new C0313d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        int i10 = 0;
        this.f32871o0 = new ArrayList();
        this.f32872p0 = new C2391u(17);
        this.f32873q0 = new ArrayList();
        this.f32874r0 = new ArrayList();
        this.f32875s0 = new int[2];
        this.f32876t0 = new int[2];
        this.f32870G0 = new C0781s(i10);
        int[] iArr = AbstractC16323a.f50636a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f32879w0 = intArray;
            float f10 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            while (i10 < length) {
                int[] iArr2 = this.f32879w0;
                iArr2[i10] = (int) (iArr2[i10] * f10);
                i10++;
            }
        }
        this.f32867D0 = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m11382w();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC16805d(this));
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Rect m11366a() {
        Rect rect = (Rect) f32863L0.mo912a();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: l */
    public static void m11367l(int i10, Rect rect, Rect rect2, C16806e c16806e, int i11, int i12) {
        int iWidth;
        int iHeight;
        int i13 = c16806e.f53919c;
        if (i13 == 0) {
            i13 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
        int i14 = c16806e.f53920d;
        if ((i14 & 7) == 0) {
            i14 |= 8388611;
        }
        if ((i14 & 112) == 0) {
            i14 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int i17 = absoluteGravity2 & 7;
        int i18 = absoluteGravity2 & 112;
        if (i17 != 1) {
            iWidth = i17 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i18 != 16) {
            iHeight = i18 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i15 == 1) {
            iWidth -= i11 / 2;
        } else if (i15 != 5) {
            iWidth -= i11;
        }
        if (i16 == 16) {
            iHeight -= i12 / 2;
        } else if (i16 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static C16806e m11368n(View view) {
        C16806e c16806e = (C16806e) view.getLayoutParams();
        if (!c16806e.f53918b) {
            if (view instanceof InterfaceC16802a) {
                AbstractC16803b behavior = ((InterfaceC16802a) view).getBehavior();
                if (behavior == null) {
                    AbstractC15256t.m16465c("CoordinatorLayout", "Attached behavior class is null");
                }
                c16806e.m18560b(behavior);
                c16806e.f53918b = true;
            } else {
                InterfaceC16804c interfaceC16804c = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    interfaceC16804c = (InterfaceC16804c) superclass.getAnnotation(InterfaceC16804c.class);
                    if (interfaceC16804c != null) {
                        break;
                    }
                }
                if (interfaceC16804c != null) {
                    try {
                        c16806e.m18560b((AbstractC16803b) interfaceC16804c.value().getDeclaredConstructor(null).newInstance(null));
                    } catch (Exception e10) {
                        AbstractC15256t.m16466d("CoordinatorLayout", "Default behavior class " + interfaceC16804c.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                    }
                }
                c16806e.f53918b = true;
            }
        }
        return c16806e;
    }

    /* JADX INFO: renamed from: u */
    public static void m11369u(View view, int i10) {
        C16806e c16806e = (C16806e) view.getLayoutParams();
        int i11 = c16806e.f53925i;
        if (i11 != i10) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            view.offsetLeftAndRight(i10 - i11);
            c16806e.f53925i = i10;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m11370v(View view, int i10) {
        C16806e c16806e = (C16806e) view.getLayoutParams();
        int i11 = c16806e.f53926j;
        if (i11 != i10) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            view.offsetTopAndBottom(i10 - i11);
            c16806e.f53926j = i10;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11371b(C16806e c16806e, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c16806e).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) c16806e).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c16806e).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) c16806e).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    @Override // p030B2.InterfaceC0779r
    /* JADX INFO: renamed from: c */
    public final void mo1748c(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        AbstractC16803b abstractC16803b;
        int childCount = getChildCount();
        boolean z6 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                C16806e c16806e = (C16806e) childAt.getLayoutParams();
                if (c16806e.m18559a(i14) && (abstractC16803b = c16806e.f53917a) != null) {
                    int[] iArr2 = this.f32875s0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC16803b.mo13570k(this, childAt, i11, i12, i13, iArr2);
                    iMax = i12 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i13 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z6 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z6) {
            m11377p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C16806e) && super.checkLayoutParams(layoutParams);
    }

    @Override // p030B2.InterfaceC0777q
    /* JADX INFO: renamed from: d */
    public final void mo1742d(View view, int i10, int i11, int i12, int i13, int i14) {
        mo1748c(view, i10, i11, i12, i13, 0, this.f32876t0);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        AbstractC16803b abstractC16803b = ((C16806e) view.getLayoutParams()).f53917a;
        if (abstractC16803b != null) {
            abstractC16803b.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f32867D0;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // p030B2.InterfaceC0777q
    /* JADX INFO: renamed from: e */
    public final boolean mo1743e(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z6 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C16806e c16806e = (C16806e) childAt.getLayoutParams();
                AbstractC16803b abstractC16803b = c16806e.f53917a;
                if (abstractC16803b != null) {
                    boolean zMo13573o = abstractC16803b.mo13573o(childAt, i10, i11);
                    z6 |= zMo13573o;
                    if (i11 == 0) {
                        c16806e.f53929m = zMo13573o;
                    } else if (i11 == 1) {
                        c16806e.f53930n = zMo13573o;
                    }
                } else if (i11 == 0) {
                    c16806e.f53929m = false;
                } else if (i11 == 1) {
                    c16806e.f53930n = false;
                }
            }
        }
        return z6;
    }

    @Override // p030B2.InterfaceC0777q
    /* JADX INFO: renamed from: f */
    public final void mo1744f(View view, View view2, int i10, int i11) {
        C0781s c0781s = this.f32870G0;
        if (i11 == 1) {
            c0781s.f2193c = i10;
        } else {
            c0781s.f2192b = i10;
        }
        this.f32881y0 = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((C16806e) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    @Override // p030B2.InterfaceC0777q
    /* JADX INFO: renamed from: g */
    public final void mo1745g(View view, int i10) {
        C0781s c0781s = this.f32870G0;
        if (i10 == 1) {
            c0781s.f2193c = 0;
        } else {
            c0781s.f2192b = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C16806e c16806e = (C16806e) childAt.getLayoutParams();
            if (c16806e.m18559a(i10)) {
                AbstractC16803b abstractC16803b = c16806e.f53917a;
                if (abstractC16803b != null) {
                    abstractC16803b.mo13574p(childAt, view, i10);
                }
                if (i10 == 0) {
                    c16806e.f53929m = false;
                } else if (i10 == 1) {
                    c16806e.f53930n = false;
                }
                c16806e.f53931o = false;
            }
        }
        this.f32881y0 = null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C16806e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C16806e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m11380s();
        return DesugarCollections.unmodifiableList(this.f32871o0);
    }

    public final C0794y0 getLastWindowInsets() {
        return this.f32865B0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0781s c0781s = this.f32870G0;
        return c0781s.f2193c | c0781s.f2192b;
    }

    public Drawable getStatusBarBackground() {
        return this.f32867D0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // p030B2.InterfaceC0777q
    /* JADX INFO: renamed from: h */
    public final void mo1746h(View view, int i10, int i11, int[] iArr, int i12) {
        AbstractC16803b abstractC16803b;
        int childCount = getChildCount();
        boolean z6 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C16806e c16806e = (C16806e) childAt.getLayoutParams();
                if (c16806e.m18559a(i12) && (abstractC16803b = c16806e.f53917a) != null) {
                    int[] iArr2 = this.f32875s0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC16803b.mo13569j(this, childAt, view, i10, i11, iArr2, i12);
                    iMax = i10 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z6 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z6) {
            m11377p(1);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m11372i(View view, Rect rect, boolean z6) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z6) {
            m11374k(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m11373j(View view) {
        C12959L c12959l = (C12959L) this.f32872p0.f7430o0;
        int i10 = c12959l.f41154o0;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) c12959l.m14649j(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c12959l.m14646f(i11));
            }
        }
        ArrayList arrayList3 = this.f32874r0;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: k */
    public final void m11374k(Rect rect, View view) {
        ThreadLocal threadLocal = AbstractC16809h.f53936a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC16809h.f53936a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC16809h.m18561a(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC16809h.f53937b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* JADX INFO: renamed from: m */
    public final int m11375m(int i10) {
        int[] iArr = this.f32879w0;
        if (iArr == null) {
            AbstractC15256t.m16465c("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        AbstractC15256t.m16465c("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m11376o(View view, int i10, int i11) {
        C0313d c0313d = f32863L0;
        Rect rectM11366a = m11366a();
        m11374k(rectM11366a, view);
        try {
            return rectM11366a.contains(i10, i11);
        } finally {
            rectM11366a.setEmpty();
            c0313d.mo914c(rectM11366a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        m11381t(false);
        if (this.f32864A0) {
            if (this.f32882z0 == null) {
                this.f32882z0 = new ViewTreeObserverOnPreDrawListenerC16807f(this, i10);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f32882z0);
        }
        if (this.f32865B0 == null) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            if (getFitsSystemWindows()) {
                AbstractC0728I.m1543c(this);
            }
        }
        this.f32878v0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m11381t(false);
        if (this.f32864A0 && this.f32882z0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f32882z0);
        }
        View view = this.f32881y0;
        if (view != null) {
            mo1745g(view, 0);
        }
        this.f32878v0 = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f32866C0 || this.f32867D0 == null) {
            return;
        }
        C0794y0 c0794y0 = this.f32865B0;
        int iM1816d = c0794y0 != null ? c0794y0.m1816d() : 0;
        if (iM1816d > 0) {
            this.f32867D0.setBounds(0, 0, getWidth(), iM1816d);
            this.f32867D0.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m11381t(true);
        }
        boolean zM11379r = m11379r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m11381t(true);
        }
        return zM11379r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        AbstractC16803b abstractC16803b;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f32871o0;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            if (view.getVisibility() != 8 && ((abstractC16803b = ((C16806e) view.getLayoutParams()).f53917a) == null || !abstractC16803b.mo13567g(this, view, layoutDirection))) {
                m11378q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0126  */
    /* JADX WARN: Code duplicated, block: B:72:0x0159  */
    /* JADX WARN: Code duplicated, block: B:75:0x0163  */
    /* JADX WARN: Code duplicated, block: B:78:0x0189  */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z6;
        int i12;
        int i13;
        int i14;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        AbstractC16803b abstractC16803b;
        int i15;
        ArrayList arrayList;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z10;
        int i21;
        int i22;
        boolean z11;
        int iMax;
        int i23 = 0;
        m11380s();
        int childCount = getChildCount();
        int i24 = 0;
        loop0: while (true) {
            if (i24 >= childCount) {
                z6 = false;
                break;
            }
            View childAt = getChildAt(i24);
            C12959L c12959l = (C12959L) this.f32872p0.f7430o0;
            int i25 = c12959l.f41154o0;
            for (int i26 = 0; i26 < i25; i26++) {
                ArrayList arrayList2 = (ArrayList) c12959l.m14649j(i26);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z6 = true;
                    break loop0;
                }
            }
            i24++;
        }
        if (z6 != this.f32864A0) {
            if (z6) {
                if (this.f32878v0) {
                    if (this.f32882z0 == null) {
                        this.f32882z0 = new ViewTreeObserverOnPreDrawListenerC16807f(this, i23);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f32882z0);
                }
                this.f32864A0 = true;
            } else {
                if (this.f32878v0 && this.f32882z0 != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f32882z0);
                }
                this.f32864A0 = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        int layoutDirection = getLayoutDirection();
        boolean z12 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i27 = paddingLeft + paddingRight;
        int i28 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z13 = this.f32865B0 != null && getFitsSystemWindows();
        ArrayList arrayList3 = this.f32871o0;
        int size3 = arrayList3.size();
        int i29 = suggestedMinimumWidth;
        int i30 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i31 = 0;
        while (i31 < size3) {
            View view = (View) arrayList3.get(i31);
            if (view.getVisibility() == 8) {
                i17 = i31;
                i15 = size3;
                arrayList = arrayList3;
                i19 = paddingLeft;
                i21 = paddingRight;
                i16 = layoutDirection;
                z11 = true;
                z10 = false;
            } else {
                C16806e c16806e = (C16806e) view.getLayoutParams();
                int i32 = c16806e.f53921e;
                if (i32 < 0 || mode == 0) {
                    i12 = iCombineMeasuredStates;
                    i13 = i31;
                } else {
                    int iM11375m = m11375m(i32);
                    i12 = iCombineMeasuredStates;
                    int i33 = c16806e.f53919c;
                    if (i33 == 0) {
                        i33 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i33, layoutDirection) & 7;
                    i13 = i31;
                    if ((absoluteGravity != 3 || z12) && !(absoluteGravity == 5 && z12)) {
                        if ((absoluteGravity == 5 && !z12) || (absoluteGravity == 3 && z12)) {
                            iMax = Math.max(0, iM11375m - paddingLeft);
                        }
                        if (z13 || view.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i10;
                            iMakeMeasureSpec2 = i11;
                        } else {
                            int iM1815c = this.f32865B0.m1815c() + this.f32865B0.m1814b();
                            int iM1813a = this.f32865B0.m1813a() + this.f32865B0.m1816d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iM1815c, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM1813a, mode2);
                        }
                        abstractC16803b = c16806e.f53917a;
                        if (abstractC16803b != null) {
                            int i34 = i12;
                            i17 = i13;
                            z10 = false;
                            i19 = paddingLeft;
                            i20 = i34;
                            i21 = paddingRight;
                            i22 = i30;
                            i16 = layoutDirection;
                            i18 = i29;
                            i15 = size3;
                            arrayList = arrayList3;
                            if (!abstractC16803b.mo13568h(this, view, iMakeMeasureSpec, i14, iMakeMeasureSpec2)) {
                            }
                            int iMax2 = Math.max(i18, view.getMeasuredWidth() + i27 + ((ViewGroup.MarginLayoutParams) c16806e).leftMargin + ((ViewGroup.MarginLayoutParams) c16806e).rightMargin);
                            int iMax3 = Math.max(i22, view.getMeasuredHeight() + i28 + ((ViewGroup.MarginLayoutParams) c16806e).topMargin + ((ViewGroup.MarginLayoutParams) c16806e).bottomMargin);
                            i29 = iMax2;
                            iCombineMeasuredStates = View.combineMeasuredStates(i20, view.getMeasuredState());
                            i30 = iMax3;
                            z11 = true;
                        } else {
                            i15 = size3;
                            arrayList = arrayList3;
                            i16 = layoutDirection;
                            i17 = i13;
                            i18 = i29;
                            i19 = paddingLeft;
                            i20 = i12;
                            z10 = false;
                            i21 = paddingRight;
                            i22 = i30;
                        }
                        measureChildWithMargins(view, iMakeMeasureSpec, i14, iMakeMeasureSpec2, 0);
                        int iMax4 = Math.max(i18, view.getMeasuredWidth() + i27 + ((ViewGroup.MarginLayoutParams) c16806e).leftMargin + ((ViewGroup.MarginLayoutParams) c16806e).rightMargin);
                        int iMax5 = Math.max(i22, view.getMeasuredHeight() + i28 + ((ViewGroup.MarginLayoutParams) c16806e).topMargin + ((ViewGroup.MarginLayoutParams) c16806e).bottomMargin);
                        i29 = iMax4;
                        iCombineMeasuredStates = View.combineMeasuredStates(i20, view.getMeasuredState());
                        i30 = iMax5;
                        z11 = true;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iM11375m);
                    }
                    i14 = iMax;
                    if (z13) {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    } else {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    }
                    abstractC16803b = c16806e.f53917a;
                    if (abstractC16803b != null) {
                        int i35 = i12;
                        i17 = i13;
                        z10 = false;
                        i19 = paddingLeft;
                        i20 = i35;
                        i21 = paddingRight;
                        i22 = i30;
                        i16 = layoutDirection;
                        i18 = i29;
                        i15 = size3;
                        arrayList = arrayList3;
                        if (!abstractC16803b.mo13568h(this, view, iMakeMeasureSpec, i14, iMakeMeasureSpec2)) {
                        }
                        int iMax6 = Math.max(i18, view.getMeasuredWidth() + i27 + ((ViewGroup.MarginLayoutParams) c16806e).leftMargin + ((ViewGroup.MarginLayoutParams) c16806e).rightMargin);
                        int iMax7 = Math.max(i22, view.getMeasuredHeight() + i28 + ((ViewGroup.MarginLayoutParams) c16806e).topMargin + ((ViewGroup.MarginLayoutParams) c16806e).bottomMargin);
                        i29 = iMax6;
                        iCombineMeasuredStates = View.combineMeasuredStates(i20, view.getMeasuredState());
                        i30 = iMax7;
                        z11 = true;
                    } else {
                        i15 = size3;
                        arrayList = arrayList3;
                        i16 = layoutDirection;
                        i17 = i13;
                        i18 = i29;
                        i19 = paddingLeft;
                        i20 = i12;
                        z10 = false;
                        i21 = paddingRight;
                        i22 = i30;
                    }
                    measureChildWithMargins(view, iMakeMeasureSpec, i14, iMakeMeasureSpec2, 0);
                    int iMax8 = Math.max(i18, view.getMeasuredWidth() + i27 + ((ViewGroup.MarginLayoutParams) c16806e).leftMargin + ((ViewGroup.MarginLayoutParams) c16806e).rightMargin);
                    int iMax9 = Math.max(i22, view.getMeasuredHeight() + i28 + ((ViewGroup.MarginLayoutParams) c16806e).topMargin + ((ViewGroup.MarginLayoutParams) c16806e).bottomMargin);
                    i29 = iMax8;
                    iCombineMeasuredStates = View.combineMeasuredStates(i20, view.getMeasuredState());
                    i30 = iMax9;
                    z11 = true;
                }
                i14 = 0;
                if (z13) {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                } else {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                }
                abstractC16803b = c16806e.f53917a;
                if (abstractC16803b != null) {
                    int i36 = i12;
                    i17 = i13;
                    z10 = false;
                    i19 = paddingLeft;
                    i20 = i36;
                    i21 = paddingRight;
                    i22 = i30;
                    i16 = layoutDirection;
                    i18 = i29;
                    i15 = size3;
                    arrayList = arrayList3;
                    if (!abstractC16803b.mo13568h(this, view, iMakeMeasureSpec, i14, iMakeMeasureSpec2)) {
                    }
                    int iMax10 = Math.max(i18, view.getMeasuredWidth() + i27 + ((ViewGroup.MarginLayoutParams) c16806e).leftMargin + ((ViewGroup.MarginLayoutParams) c16806e).rightMargin);
                    int iMax11 = Math.max(i22, view.getMeasuredHeight() + i28 + ((ViewGroup.MarginLayoutParams) c16806e).topMargin + ((ViewGroup.MarginLayoutParams) c16806e).bottomMargin);
                    i29 = iMax10;
                    iCombineMeasuredStates = View.combineMeasuredStates(i20, view.getMeasuredState());
                    i30 = iMax11;
                    z11 = true;
                } else {
                    i15 = size3;
                    arrayList = arrayList3;
                    i16 = layoutDirection;
                    i17 = i13;
                    i18 = i29;
                    i19 = paddingLeft;
                    i20 = i12;
                    z10 = false;
                    i21 = paddingRight;
                    i22 = i30;
                }
                measureChildWithMargins(view, iMakeMeasureSpec, i14, iMakeMeasureSpec2, 0);
                int iMax12 = Math.max(i18, view.getMeasuredWidth() + i27 + ((ViewGroup.MarginLayoutParams) c16806e).leftMargin + ((ViewGroup.MarginLayoutParams) c16806e).rightMargin);
                int iMax13 = Math.max(i22, view.getMeasuredHeight() + i28 + ((ViewGroup.MarginLayoutParams) c16806e).topMargin + ((ViewGroup.MarginLayoutParams) c16806e).bottomMargin);
                i29 = iMax12;
                iCombineMeasuredStates = View.combineMeasuredStates(i20, view.getMeasuredState());
                i30 = iMax13;
                z11 = true;
            }
            i31 = i17 + 1;
            paddingLeft = i19;
            paddingRight = i21;
            layoutDirection = i16;
            size3 = i15;
            arrayList3 = arrayList;
        }
        int i37 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(i29, i10, (-16777216) & i37), View.resolveSizeAndState(i30, i11, i37 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z6) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C16806e c16806e = (C16806e) childAt.getLayoutParams();
                if (c16806e.m18559a(0)) {
                    AbstractC16803b abstractC16803b = c16806e.f53917a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        AbstractC16803b abstractC16803b;
        int childCount = getChildCount();
        boolean zMo13596i = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C16806e c16806e = (C16806e) childAt.getLayoutParams();
                if (c16806e.m18559a(0) && (abstractC16803b = c16806e.f53917a) != null) {
                    zMo13596i |= abstractC16803b.mo13596i(view);
                }
            }
        }
        return zMo13596i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        mo1746h(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        mo1742d(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        mo1744f(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C16808g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C16808g c16808g = (C16808g) parcelable;
        super.onRestoreInstanceState(c16808g.f16000Y);
        SparseArray sparseArray = c16808g.f53935o0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            AbstractC16803b abstractC16803b = m11368n(childAt).f53917a;
            if (id2 != -1 && abstractC16803b != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                abstractC16803b.mo13571m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo13572n;
        C16808g c16808g = new C16808g(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            AbstractC16803b abstractC16803b = ((C16806e) childAt.getLayoutParams()).f53917a;
            if (id2 != -1 && abstractC16803b != null && (parcelableMo13572n = abstractC16803b.mo13572n(childAt)) != null) {
                sparseArray.append(id2, parcelableMo13572n);
            }
        }
        c16808g.f53935o0 = sparseArray;
        return c16808g;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return mo1743e(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo1745g(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM11379r;
        boolean zMo13575q;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f32880x0 == null) {
            zM11379r = m11379r(motionEvent, 1);
            if (!zM11379r) {
                zMo13575q = false;
            }
            motionEventObtain = null;
            if (this.f32880x0 == null) {
                zMo13575q |= super.onTouchEvent(motionEvent);
            } else if (zM11379r) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                m11381t(false);
            }
            return zMo13575q;
        }
        zM11379r = false;
        AbstractC16803b abstractC16803b = ((C16806e) this.f32880x0.getLayoutParams()).f53917a;
        if (abstractC16803b != null) {
            zMo13575q = abstractC16803b.mo13575q(this.f32880x0, motionEvent);
        } else {
            zMo13575q = false;
        }
        motionEventObtain = null;
        if (this.f32880x0 == null) {
            zMo13575q |= super.onTouchEvent(motionEvent);
        } else if (zM11379r) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked != 1) {
            m11381t(false);
        } else {
            m11381t(false);
        }
        return zMo13575q;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x029b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5  */
    /* JADX INFO: renamed from: p */
    public final void m11377p(int i10) {
        int i11;
        Rect rect;
        int i12;
        Rect rect2;
        boolean z6;
        int i13;
        Rect rect3;
        ArrayList arrayList;
        int i14;
        boolean z10;
        boolean z11;
        int width;
        int i15;
        int i16;
        int i17;
        int height;
        int i18;
        int i19;
        int i20;
        C0313d c0313d;
        AbstractC16803b abstractC16803b;
        int i21 = i10;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f32871o0;
        int size = arrayList2.size();
        Rect rectM11366a = m11366a();
        Rect rectM11366a2 = m11366a();
        Rect rectM11366a3 = m11366a();
        int i22 = 0;
        while (true) {
            C0313d c0313d2 = f32863L0;
            if (i22 >= size) {
                Rect rect4 = rectM11366a3;
                Rect rect5 = rectM11366a2;
                Rect rect6 = rectM11366a;
                rect6.setEmpty();
                c0313d2.mo914c(rect6);
                rect5.setEmpty();
                c0313d2.mo914c(rect5);
                rect4.setEmpty();
                c0313d2.mo914c(rect4);
                return;
            }
            View view = (View) arrayList2.get(i22);
            C16806e c16806e = (C16806e) view.getLayoutParams();
            if (i21 != 0 || view.getVisibility() != 8) {
                int i23 = 0;
                while (i23 < i22) {
                    if (c16806e.f53928l == ((View) arrayList2.get(i23))) {
                        C16806e c16806e2 = (C16806e) view.getLayoutParams();
                        if (c16806e2.f53927k != null) {
                            Rect rectM11366a4 = m11366a();
                            Rect rectM11366a5 = m11366a();
                            Rect rectM11366a6 = m11366a();
                            m11374k(rectM11366a4, c16806e2.f53927k);
                            m11372i(view, rectM11366a5, false);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            c0313d = c0313d2;
                            m11367l(layoutDirection, rectM11366a4, rectM11366a6, c16806e2, measuredWidth, measuredHeight);
                            boolean z12 = (rectM11366a6.left == rectM11366a5.left && rectM11366a6.top == rectM11366a5.top) ? false : true;
                            m11371b(c16806e2, rectM11366a6, measuredWidth, measuredHeight);
                            int i24 = rectM11366a6.left - rectM11366a5.left;
                            int i25 = rectM11366a6.top - rectM11366a5.top;
                            if (i24 != 0) {
                                WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
                                view.offsetLeftAndRight(i24);
                            }
                            if (i25 != 0) {
                                WeakHashMap weakHashMap3 = AbstractC0738T.f2096a;
                                view.offsetTopAndBottom(i25);
                            }
                            if (z12 && (abstractC16803b = c16806e2.f53917a) != null) {
                                abstractC16803b.mo13578d(this, view, c16806e2.f53927k);
                            }
                            rectM11366a4.setEmpty();
                            c0313d.mo914c(rectM11366a4);
                            rectM11366a5.setEmpty();
                            c0313d.mo914c(rectM11366a5);
                            rectM11366a6.setEmpty();
                            c0313d.mo914c(rectM11366a6);
                        } else {
                            c0313d = c0313d2;
                        }
                    } else {
                        c0313d = c0313d2;
                    }
                    i23++;
                    c0313d2 = c0313d;
                    size = size;
                    arrayList2 = arrayList2;
                    layoutDirection = layoutDirection;
                    c16806e = c16806e;
                    i22 = i22;
                    rectM11366a3 = rectM11366a3;
                    rectM11366a2 = rectM11366a2;
                    rectM11366a = rectM11366a;
                }
                C16806e c16806e3 = c16806e;
                int i26 = layoutDirection;
                C0312c c0312c = c0313d2;
                i11 = i22;
                Rect rect7 = rectM11366a3;
                rect = rectM11366a2;
                Rect rect8 = rectM11366a;
                ArrayList arrayList3 = arrayList2;
                int i27 = size;
                m11372i(view, rect, true);
                if (c16806e3.f53923g == 0 || rect.isEmpty()) {
                    i12 = i26;
                    rect2 = rect8;
                } else {
                    i12 = i26;
                    int absoluteGravity = Gravity.getAbsoluteGravity(c16806e3.f53923g, i12);
                    int i28 = absoluteGravity & 112;
                    if (i28 == 48) {
                        rect2 = rect8;
                        rect2.top = Math.max(rect2.top, rect.bottom);
                    } else if (i28 != 80) {
                        rect2 = rect8;
                    } else {
                        rect2 = rect8;
                        rect2.bottom = Math.max(rect2.bottom, getHeight() - rect.top);
                    }
                    int i29 = absoluteGravity & 7;
                    if (i29 == 3) {
                        rect2.left = Math.max(rect2.left, rect.right);
                    } else if (i29 == 5) {
                        rect2.right = Math.max(rect2.right, getWidth() - rect.left);
                    }
                }
                if (c16806e3.f53924h == 0 || view.getVisibility() != 0) {
                    z6 = false;
                } else {
                    WeakHashMap weakHashMap4 = AbstractC0738T.f2096a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        C16806e c16806e4 = (C16806e) view.getLayoutParams();
                        AbstractC16803b abstractC16803b2 = c16806e4.f53917a;
                        Rect rectM11366a7 = m11366a();
                        Rect rectM11366a8 = m11366a();
                        rectM11366a8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (abstractC16803b2 == null || !abstractC16803b2.mo13641a(rectM11366a7, view)) {
                            rectM11366a7.set(rectM11366a8);
                        } else if (!rectM11366a8.contains(rectM11366a7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM11366a7.toShortString() + " | Bounds:" + rectM11366a8.toShortString());
                        }
                        rectM11366a8.setEmpty();
                        c0312c.mo914c(rectM11366a8);
                        if (rectM11366a7.isEmpty()) {
                            rectM11366a7.setEmpty();
                            c0312c.mo914c(rectM11366a7);
                            z6 = false;
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c16806e4.f53924h, i12);
                            if ((absoluteGravity2 & 48) != 48 || (i19 = (rectM11366a7.top - ((ViewGroup.MarginLayoutParams) c16806e4).topMargin) - c16806e4.f53926j) >= (i20 = rect2.top)) {
                                z10 = false;
                            } else {
                                m11370v(view, i20 - i19);
                                z10 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectM11366a7.bottom) - ((ViewGroup.MarginLayoutParams) c16806e4).bottomMargin) + c16806e4.f53926j) < (i18 = rect2.bottom)) {
                                m11370v(view, height - i18);
                                z10 = true;
                            }
                            if (z10) {
                                z6 = false;
                            } else {
                                z6 = false;
                                m11370v(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i16 = (rectM11366a7.left - ((ViewGroup.MarginLayoutParams) c16806e4).leftMargin) - c16806e4.f53925i) >= (i17 = rect2.left)) {
                                z11 = z6 ? 1 : 0;
                            } else {
                                m11369u(view, i17 - i16);
                                z11 = true;
                            }
                            boolean z13 = z11;
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectM11366a7.right) - ((ViewGroup.MarginLayoutParams) c16806e4).rightMargin) + c16806e4.f53925i) < (i15 = rect2.right)) {
                                z13 = z11;
                                m11369u(view, width - i15);
                                z13 = true;
                            }
                            if (!z13) {
                                m11369u(view, z6 ? 1 : 0);
                            }
                            rectM11366a7.setEmpty();
                            c0312c.mo914c(rectM11366a7);
                        }
                    } else {
                        z6 = false;
                    }
                }
                i13 = i10;
                if (i13 != 2) {
                    rect3 = rect7;
                    rect3.set(((C16806e) view.getLayoutParams()).f53932p);
                    if (rect3.equals(rect)) {
                        size = i27;
                        arrayList = arrayList3;
                    } else {
                        ((C16806e) view.getLayoutParams()).f53932p.set(rect);
                    }
                } else {
                    rect3 = rect7;
                }
                int i30 = i11 + 1;
                size = i27;
                while (true) {
                    arrayList = arrayList3;
                    if (i30 >= size) {
                        break;
                    }
                    View view2 = (View) arrayList.get(i30);
                    C16806e c16806e5 = (C16806e) view2.getLayoutParams();
                    AbstractC16803b abstractC16803b3 = c16806e5.f53917a;
                    if (abstractC16803b3 == null || !abstractC16803b3.mo13577b(view2, view)) {
                        i14 = 1;
                    } else if (i13 == 0 && c16806e5.f53931o) {
                        c16806e5.f53931o = z6;
                        i14 = 1;
                    } else {
                        boolean zMo13578d = i13 != 2 ? abstractC16803b3.mo13578d(this, view2, view) : true;
                        i14 = 1;
                        if (i13 == 1) {
                            c16806e5.f53931o = zMo13578d;
                        }
                    }
                    i30 += i14;
                    arrayList3 = arrayList;
                }
            } else {
                i13 = i21;
                i12 = layoutDirection;
                i11 = i22;
                rect3 = rectM11366a3;
                rect = rectM11366a2;
                rect2 = rectM11366a;
                arrayList = arrayList2;
            }
            i22 = i11 + 1;
            arrayList2 = arrayList;
            rectM11366a2 = rect;
            i21 = i13;
            rectM11366a = rect2;
            rectM11366a3 = rect3;
            layoutDirection = i12;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m11378q(View view, int i10) {
        int i11;
        C16806e c16806e = (C16806e) view.getLayoutParams();
        View view2 = c16806e.f53927k;
        if (view2 == null && c16806e.f53922f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C0313d c0313d = f32863L0;
        if (view2 != null) {
            Rect rectM11366a = m11366a();
            Rect rectM11366a2 = m11366a();
            try {
                m11374k(rectM11366a, view2);
                C16806e c16806e2 = (C16806e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m11367l(i10, rectM11366a, rectM11366a2, c16806e2, measuredWidth, measuredHeight);
                m11371b(c16806e2, rectM11366a2, measuredWidth, measuredHeight);
                view.layout(rectM11366a2.left, rectM11366a2.top, rectM11366a2.right, rectM11366a2.bottom);
                return;
            } finally {
                rectM11366a.setEmpty();
                c0313d.mo914c(rectM11366a);
                rectM11366a2.setEmpty();
                c0313d.mo914c(rectM11366a2);
            }
        }
        int i12 = c16806e.f53921e;
        if (i12 < 0) {
            C16806e c16806e3 = (C16806e) view.getLayoutParams();
            Rect rectM11366a3 = m11366a();
            rectM11366a3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c16806e3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c16806e3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c16806e3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c16806e3).bottomMargin);
            if (this.f32865B0 != null) {
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectM11366a3.left = this.f32865B0.m1814b() + rectM11366a3.left;
                    rectM11366a3.top = this.f32865B0.m1816d() + rectM11366a3.top;
                    rectM11366a3.right -= this.f32865B0.m1815c();
                    rectM11366a3.bottom -= this.f32865B0.m1813a();
                }
            }
            Rect rectM11366a4 = m11366a();
            int i13 = c16806e3.f53919c;
            if ((i13 & 7) == 0) {
                i13 |= 8388611;
            }
            if ((i13 & 112) == 0) {
                i13 |= 48;
            }
            Gravity.apply(i13, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM11366a3, rectM11366a4, i10);
            view.layout(rectM11366a4.left, rectM11366a4.top, rectM11366a4.right, rectM11366a4.bottom);
            rectM11366a3.setEmpty();
            c0313d.mo914c(rectM11366a3);
            rectM11366a4.setEmpty();
            c0313d.mo914c(rectM11366a4);
            return;
        }
        C16806e c16806e4 = (C16806e) view.getLayoutParams();
        int i14 = c16806e4.f53919c;
        if (i14 == 0) {
            i14 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i10 == 1) {
            i12 = width - i12;
        }
        int iM11375m = m11375m(i12) - measuredWidth2;
        if (i15 == 1) {
            iM11375m += measuredWidth2 / 2;
        } else if (i15 == 5) {
            iM11375m += measuredWidth2;
        }
        if (i16 != 16) {
            i11 = i16 != 80 ? 0 : measuredHeight2;
        } else {
            i11 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c16806e4).leftMargin, Math.min(iM11375m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c16806e4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c16806e4).topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c16806e4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m11379r(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f32873q0;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i11) : i11));
        }
        C0842z c0842z = f32862K0;
        if (c0842z != null) {
            Collections.sort(arrayList, c0842z);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo13566f = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) arrayList.get(i12);
            AbstractC16803b abstractC16803b = ((C16806e) view.getLayoutParams()).f53917a;
            if (zMo13566f && actionMasked != 0) {
                if (abstractC16803b != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i10 == 0) {
                        abstractC16803b.mo13566f(this, view, motionEventObtain);
                    } else if (i10 == 1) {
                        abstractC16803b.mo13575q(view, motionEventObtain);
                    }
                }
            } else if (!zMo13566f && abstractC16803b != null) {
                if (i10 == 0) {
                    zMo13566f = abstractC16803b.mo13566f(this, view, motionEvent);
                } else if (i10 == 1) {
                    zMo13566f = abstractC16803b.mo13575q(view, motionEvent);
                }
                if (zMo13566f) {
                    this.f32880x0 = view;
                }
            }
        }
        arrayList.clear();
        return zMo13566f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        AbstractC16803b abstractC16803b = ((C16806e) view.getLayoutParams()).f53917a;
        if (abstractC16803b != null) {
            abstractC16803b.mo13579l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        super.requestDisallowInterceptTouchEvent(z6);
        if (!z6 || this.f32877u0) {
            return;
        }
        m11381t(false);
        this.f32877u0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0091  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:40:0x0095
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: s */
    public final void m11380s() {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m11380s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z6) {
        super.setFitsSystemWindows(z6);
        m11382w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f32868E0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f32867D0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f32867D0 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f32867D0.setState(getDrawableState());
                }
                Drawable drawable3 = this.f32867D0;
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f32867D0.setVisible(getVisibility() == 0, false);
                this.f32867D0.setCallback(this);
            }
            WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? getContext().getDrawable(i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z6 = i10 == 0;
        Drawable drawable = this.f32867D0;
        if (drawable == null || drawable.isVisible() == z6) {
            return;
        }
        this.f32867D0.setVisible(z6, false);
    }

    /* JADX INFO: renamed from: t */
    public final void m11381t(boolean z6) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            AbstractC16803b abstractC16803b = ((C16806e) childAt.getLayoutParams()).f53917a;
            if (abstractC16803b != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z6) {
                    abstractC16803b.mo13566f(this, childAt, motionEventObtain);
                } else {
                    abstractC16803b.mo13575q(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((C16806e) getChildAt(i11).getLayoutParams()).getClass();
        }
        this.f32880x0 = null;
        this.f32877u0 = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f32867D0;
    }

    /* JADX INFO: renamed from: w */
    public final void m11382w() {
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        if (!getFitsSystemWindows()) {
            AbstractC0730K.m1555l(this, null);
            return;
        }
        if (this.f32869F0 == null) {
            this.f32869F0 = new C15333a(this);
        }
        AbstractC0730K.m1555l(this, this.f32869F0);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C16806e) {
            return new C16806e((C16806e) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C16806e((ViewGroup.MarginLayoutParams) layoutParams) : new C16806e(layoutParams);
    }
}
