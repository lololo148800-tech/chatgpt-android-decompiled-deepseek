package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.C10827j;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import p030B2.AbstractC0728I;
import p030B2.AbstractC0730K;
import p030B2.AbstractC0738T;
import p030B2.AbstractC0778q0;
import p030B2.C0772n0;
import p030B2.C0774o0;
import p030B2.C0776p0;
import p030B2.C0781s;
import p030B2.C0790w0;
import p030B2.C0794y0;
import p030B2.InterfaceC0777q;
import p030B2.InterfaceC0779r;
import p239Ja.C4308k;
import p571X9.AbstractC9106B3;
import p893n.C17368E;
import p976r.InterfaceC18825w;
import p976r.MenuC18814l;
import p979r2.C18862c;
import p999s.C19320T0;
import p999s.C19330Y0;
import p999s.C19339c;
import p999s.C19342d;
import p999s.C19356i;
import p999s.InterfaceC19336b;
import p999s.InterfaceC19352g0;
import p999s.InterfaceC19355h0;
import p999s.RunnableC19333a;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC19352g0, InterfaceC0777q, InterfaceC0779r {

    /* JADX INFO: renamed from: Q0 */
    public static final int[] f32203Q0 = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: R0 */
    public static final C0794y0 f32204R0;

    /* JADX INFO: renamed from: S0 */
    public static final Rect f32205S0;

    /* JADX INFO: renamed from: A0 */
    public final Rect f32206A0;

    /* JADX INFO: renamed from: B0 */
    public final Rect f32207B0;

    /* JADX INFO: renamed from: C0 */
    public final Rect f32208C0;

    /* JADX INFO: renamed from: D0 */
    public final Rect f32209D0;

    /* JADX INFO: renamed from: E0 */
    public C0794y0 f32210E0;

    /* JADX INFO: renamed from: F0 */
    public C0794y0 f32211F0;

    /* JADX INFO: renamed from: G0 */
    public C0794y0 f32212G0;

    /* JADX INFO: renamed from: H0 */
    public C0794y0 f32213H0;

    /* JADX INFO: renamed from: I0 */
    public InterfaceC19336b f32214I0;

    /* JADX INFO: renamed from: J0 */
    public OverScroller f32215J0;

    /* JADX INFO: renamed from: K0 */
    public ViewPropertyAnimator f32216K0;

    /* JADX INFO: renamed from: L0 */
    public final C4308k f32217L0;

    /* JADX INFO: renamed from: M0 */
    public final RunnableC19333a f32218M0;

    /* JADX INFO: renamed from: N0 */
    public final RunnableC19333a f32219N0;

    /* JADX INFO: renamed from: O0 */
    public final C0781s f32220O0;

    /* JADX INFO: renamed from: P0 */
    public final C19342d f32221P0;

    /* JADX INFO: renamed from: o0 */
    public int f32222o0;

    /* JADX INFO: renamed from: p0 */
    public int f32223p0;

    /* JADX INFO: renamed from: q0 */
    public ContentFrameLayout f32224q0;

    /* JADX INFO: renamed from: r0 */
    public ActionBarContainer f32225r0;

    /* JADX INFO: renamed from: s0 */
    public InterfaceC19355h0 f32226s0;

    /* JADX INFO: renamed from: t0 */
    public Drawable f32227t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f32228u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f32229v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f32230w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f32231x0;

    /* JADX INFO: renamed from: y0 */
    public int f32232y0;

    /* JADX INFO: renamed from: z0 */
    public int f32233z0;

    static {
        AbstractC0778q0 c0774o0;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            c0774o0 = new C0776p0();
        } else {
            c0774o0 = i10 >= 29 ? new C0774o0() : new C0772n0();
        }
        c0774o0.mo1716g(C18862c.m20171b(0, 1, 0, 1));
        f32204R0 = c0774o0.mo1714b();
        f32205S0 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32223p0 = 0;
        this.f32206A0 = new Rect();
        this.f32207B0 = new Rect();
        this.f32208C0 = new Rect();
        this.f32209D0 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C0794y0 c0794y0 = C0794y0.f2208b;
        this.f32210E0 = c0794y0;
        this.f32211F0 = c0794y0;
        this.f32212G0 = c0794y0;
        this.f32213H0 = c0794y0;
        this.f32217L0 = new C4308k(this, 7);
        this.f32218M0 = new RunnableC19333a(this, 0);
        this.f32219N0 = new RunnableC19333a(this, 1);
        m11142i(context);
        this.f32220O0 = new C0781s(0);
        C19342d c19342d = new C19342d(context);
        c19342d.setWillNotDraw(true);
        this.f32221P0 = c19342d;
        addView(c19342d);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11140a(View view, Rect rect, boolean z6) {
        boolean z10;
        C19339c c19339c = (C19339c) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) c19339c).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) c19339c).leftMargin = i11;
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) c19339c).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) c19339c).topMargin = i13;
            z10 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) c19339c).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) c19339c).rightMargin = i15;
            z10 = true;
        }
        if (z6) {
            int i16 = ((ViewGroup.MarginLayoutParams) c19339c).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) c19339c).bottomMargin = i17;
                return true;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: b */
    public final void m11141b() {
        removeCallbacks(this.f32218M0);
        removeCallbacks(this.f32219N0);
        ViewPropertyAnimator viewPropertyAnimator = this.f32216K0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // p030B2.InterfaceC0779r
    /* JADX INFO: renamed from: c */
    public final void mo1748c(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        mo1742d(view, i10, i11, i12, i13, i14);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C19339c;
    }

    @Override // p030B2.InterfaceC0777q
    /* JADX INFO: renamed from: d */
    public final void mo1742d(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f32227t0 != null) {
            if (this.f32225r0.getVisibility() == 0) {
                translationY = (int) (this.f32225r0.getTranslationY() + this.f32225r0.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f32227t0.setBounds(0, translationY, getWidth(), this.f32227t0.getIntrinsicHeight() + translationY);
            this.f32227t0.draw(canvas);
        }
    }

    @Override // p030B2.InterfaceC0777q
    /* JADX INFO: renamed from: e */
    public final boolean mo1743e(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // p030B2.InterfaceC0777q
    /* JADX INFO: renamed from: f */
    public final void mo1744f(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // p030B2.InterfaceC0777q
    /* JADX INFO: renamed from: g */
    public final void mo1745g(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C19339c(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C19339c(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f32225r0;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0781s c0781s = this.f32220O0;
        return c0781s.f2193c | c0781s.f2192b;
    }

    public CharSequence getTitle() {
        m11144k();
        return ((C19330Y0) this.f32226s0).f61223a.getTitle();
    }

    @Override // p030B2.InterfaceC0777q
    /* JADX INFO: renamed from: h */
    public final void mo1746h(View view, int i10, int i11, int[] iArr, int i12) {
    }

    /* JADX INFO: renamed from: i */
    public final void m11142i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f32203Q0);
        this.f32222o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f32227t0 = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f32215J0 = new OverScroller(context);
    }

    /* JADX INFO: renamed from: j */
    public final void m11143j(int i10) {
        m11144k();
        if (i10 == 2) {
            ((C19330Y0) this.f32226s0).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i10 == 5) {
            ((C19330Y0) this.f32226s0).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m11144k() {
        InterfaceC19355h0 wrapper;
        if (this.f32224q0 == null) {
            this.f32224q0 = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f32225r0 = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC19355h0) {
                wrapper = (InterfaceC19355h0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f32226s0 = wrapper;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m11145l(MenuC18814l menuC18814l, InterfaceC18825w interfaceC18825w) {
        m11144k();
        C19330Y0 c19330y0 = (C19330Y0) this.f32226s0;
        C19356i c19356i = c19330y0.f61235m;
        Toolbar toolbar = c19330y0.f61223a;
        if (c19356i == null) {
            c19330y0.f61235m = new C19356i(toolbar.getContext());
        }
        C19356i c19356i2 = c19330y0.f61235m;
        c19356i2.f61300q0 = interfaceC18825w;
        if (menuC18814l == null && toolbar.f32292o0 == null) {
            return;
        }
        toolbar.m11162f();
        MenuC18814l menuC18814l2 = toolbar.f32292o0.f32234D0;
        if (menuC18814l2 == menuC18814l) {
            return;
        }
        if (menuC18814l2 != null) {
            menuC18814l2.m20129r(toolbar.f32285Z0);
            menuC18814l2.m20129r(toolbar.f32286a1);
        }
        if (toolbar.f32286a1 == null) {
            toolbar.f32286a1 = new C19320T0(toolbar);
        }
        c19356i2.f61289C0 = true;
        if (menuC18814l != null) {
            menuC18814l.m20121b(c19356i2, toolbar.f32301x0);
            menuC18814l.m20121b(toolbar.f32286a1, toolbar.f32301x0);
        } else {
            c19356i2.mo20117k(toolbar.f32301x0, null);
            toolbar.f32286a1.mo20117k(toolbar.f32301x0, null);
            c19356i2.mo20089h();
            toolbar.f32286a1.mo20089h();
        }
        toolbar.f32292o0.setPopupTheme(toolbar.f32302y0);
        toolbar.f32292o0.setPresenter(c19356i2);
        toolbar.f32285Z0 = c19356i2;
        toolbar.m11173u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m11144k();
        C0794y0 c0794y0M1812g = C0794y0.m1812g(this, windowInsets);
        boolean zM11140a = m11140a(this.f32225r0, new Rect(c0794y0M1812g.m1814b(), c0794y0M1812g.m1816d(), c0794y0M1812g.m1815c(), c0794y0M1812g.m1813a()), false);
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        Rect rect = this.f32206A0;
        AbstractC0730K.m1545b(this, c0794y0M1812g, rect);
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        C0790w0 c0790w0 = c0794y0M1812g.f2209a;
        C0794y0 c0794y0Mo1757m = c0790w0.mo1757m(i10, i11, i12, i13);
        this.f32210E0 = c0794y0Mo1757m;
        boolean z6 = true;
        if (!this.f32211F0.equals(c0794y0Mo1757m)) {
            this.f32211F0 = this.f32210E0;
            zM11140a = true;
        }
        Rect rect2 = this.f32207B0;
        if (rect2.equals(rect)) {
            z6 = zM11140a;
        } else {
            rect2.set(rect);
        }
        if (z6) {
            requestLayout();
        }
        return c0790w0.mo1774a().f2209a.mo1769c().f2209a.mo1768b().m1817f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m11142i(getContext());
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        AbstractC0728I.m1543c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m11141b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C19339c c19339c = (C19339c) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) c19339c).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) c19339c).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00df  */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        C0794y0 c0794y0;
        int i12;
        AbstractC0778q0 c0772n0;
        m11144k();
        measureChildWithMargins(this.f32225r0, i10, 0, i11, 0);
        C19339c c19339c = (C19339c) this.f32225r0.getLayoutParams();
        int iMax = Math.max(0, this.f32225r0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c19339c).leftMargin + ((ViewGroup.MarginLayoutParams) c19339c).rightMargin);
        int iMax2 = Math.max(0, this.f32225r0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c19339c).topMargin + ((ViewGroup.MarginLayoutParams) c19339c).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f32225r0.getMeasuredState());
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        boolean z6 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z6) {
            measuredHeight = this.f32222o0;
            if (this.f32229v0 && this.f32225r0.getTabContainer() != null) {
                measuredHeight += this.f32222o0;
            }
        } else {
            measuredHeight = this.f32225r0.getVisibility() != 8 ? this.f32225r0.getMeasuredHeight() : 0;
        }
        Rect rect = this.f32206A0;
        Rect rect2 = this.f32208C0;
        rect2.set(rect);
        this.f32212G0 = this.f32210E0;
        if (this.f32228u0 || z6) {
            C18862c c18862cM20171b = C18862c.m20171b(this.f32212G0.m1814b(), this.f32212G0.m1816d() + measuredHeight, this.f32212G0.m1815c(), this.f32212G0.m1813a());
            c0794y0 = this.f32212G0;
            i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
                c0772n0 = new C0776p0(c0794y0);
            } else if (i12 >= 29) {
                c0772n0 = new C0774o0(c0794y0);
            } else {
                c0772n0 = new C0772n0(c0794y0);
            }
            c0772n0.mo1716g(c18862cM20171b);
            this.f32212G0 = c0772n0.mo1714b();
        } else {
            C19342d c19342d = this.f32221P0;
            C0794y0 c0794y1 = f32204R0;
            Rect rect3 = this.f32209D0;
            AbstractC0730K.m1545b(c19342d, c0794y1, rect3);
            if (rect3.equals(f32205S0)) {
                C18862c c18862cM20171b2 = C18862c.m20171b(this.f32212G0.m1814b(), this.f32212G0.m1816d() + measuredHeight, this.f32212G0.m1815c(), this.f32212G0.m1813a());
                c0794y0 = this.f32212G0;
                i12 = Build.VERSION.SDK_INT;
                if (i12 >= 30) {
                    c0772n0 = new C0776p0(c0794y0);
                } else if (i12 >= 29) {
                    c0772n0 = new C0774o0(c0794y0);
                } else {
                    c0772n0 = new C0772n0(c0794y0);
                }
                c0772n0.mo1716g(c18862cM20171b2);
                this.f32212G0 = c0772n0.mo1714b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f32212G0 = this.f32212G0.f2209a.mo1757m(0, measuredHeight, 0, 0);
            }
        }
        m11140a(this.f32224q0, rect2, true);
        if (!this.f32213H0.equals(this.f32212G0)) {
            C0794y0 c0794y2 = this.f32212G0;
            this.f32213H0 = c0794y2;
            ContentFrameLayout contentFrameLayout = this.f32224q0;
            WindowInsets windowInsetsM1817f = c0794y2.m1817f();
            if (windowInsetsM1817f != null) {
                WindowInsets windowInsetsM1541a = AbstractC0728I.m1541a(contentFrameLayout, windowInsetsM1817f);
                if (!windowInsetsM1541a.equals(windowInsetsM1817f)) {
                    C0794y0.m1812g(contentFrameLayout, windowInsetsM1541a);
                }
            }
        }
        measureChildWithMargins(this.f32224q0, i10, 0, i11, 0);
        C19339c c19339c2 = (C19339c) this.f32224q0.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f32224q0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c19339c2).leftMargin + ((ViewGroup.MarginLayoutParams) c19339c2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f32224q0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c19339c2).topMargin + ((ViewGroup.MarginLayoutParams) c19339c2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f32224q0.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z6) {
        if (!this.f32230w0 || !z6) {
            return false;
        }
        this.f32215J0.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f32215J0.getFinalY() > this.f32225r0.getHeight()) {
            m11141b();
            this.f32219N0.run();
        } else {
            m11141b();
            this.f32218M0.run();
        }
        this.f32231x0 = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f32232y0 + i11;
        this.f32232y0 = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        C17368E c17368e;
        C10827j c10827j;
        this.f32220O0.f2192b = i10;
        this.f32232y0 = getActionBarHideOffset();
        m11141b();
        InterfaceC19336b interfaceC19336b = this.f32214I0;
        if (interfaceC19336b == null || (c10827j = (c17368e = (C17368E) interfaceC19336b).f55431t) == null) {
            return;
        }
        c10827j.m11118a();
        c17368e.f55431t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f32225r0.getVisibility() != 0) {
            return false;
        }
        return this.f32230w0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f32230w0 || this.f32231x0) {
            return;
        }
        if (this.f32232y0 <= this.f32225r0.getHeight()) {
            m11141b();
            postDelayed(this.f32218M0, 600L);
        } else {
            m11141b();
            postDelayed(this.f32219N0, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        m11144k();
        int i11 = this.f32233z0 ^ i10;
        this.f32233z0 = i10;
        boolean z6 = (i10 & 4) == 0;
        boolean z10 = (i10 & 256) != 0;
        InterfaceC19336b interfaceC19336b = this.f32214I0;
        if (interfaceC19336b != null) {
            C17368E c17368e = (C17368E) interfaceC19336b;
            c17368e.f55426o = !z10;
            if (z6 || !z10) {
                if (c17368e.f55428q) {
                    c17368e.f55428q = false;
                    c17368e.m19045g(true);
                }
            } else if (!c17368e.f55428q) {
                c17368e.f55428q = true;
                c17368e.m19045g(true);
            }
        }
        if ((i11 & 256) == 0 || this.f32214I0 == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        AbstractC0728I.m1543c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f32223p0 = i10;
        InterfaceC19336b interfaceC19336b = this.f32214I0;
        if (interfaceC19336b != null) {
            ((C17368E) interfaceC19336b).f55425n = i10;
        }
    }

    public void setActionBarHideOffset(int i10) {
        m11141b();
        this.f32225r0.setTranslationY(-Math.max(0, Math.min(i10, this.f32225r0.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC19336b interfaceC19336b) {
        this.f32214I0 = interfaceC19336b;
        if (getWindowToken() != null) {
            ((C17368E) this.f32214I0).f55425n = this.f32223p0;
            int i10 = this.f32233z0;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                AbstractC0728I.m1543c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z6) {
        this.f32229v0 = z6;
    }

    public void setHideOnContentScrollEnabled(boolean z6) {
        if (z6 != this.f32230w0) {
            this.f32230w0 = z6;
            if (z6) {
                return;
            }
            m11141b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        m11144k();
        C19330Y0 c19330y0 = (C19330Y0) this.f32226s0;
        c19330y0.f61226d = i10 != 0 ? AbstractC9106B3.m9636b(c19330y0.f61223a.getContext(), i10) : null;
        c19330y0.m20430c();
    }

    public void setLogo(int i10) {
        m11144k();
        C19330Y0 c19330y0 = (C19330Y0) this.f32226s0;
        c19330y0.f61227e = i10 != 0 ? AbstractC9106B3.m9636b(c19330y0.f61223a.getContext(), i10) : null;
        c19330y0.m20430c();
    }

    public void setOverlayMode(boolean z6) {
        this.f32228u0 = z6;
    }

    public void setShowingForActionMode(boolean z6) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // p999s.InterfaceC19352g0
    public void setWindowCallback(Window.Callback callback) {
        m11144k();
        ((C19330Y0) this.f32226s0).f61233k = callback;
    }

    @Override // p999s.InterfaceC19352g0
    public void setWindowTitle(CharSequence charSequence) {
        m11144k();
        C19330Y0 c19330y0 = (C19330Y0) this.f32226s0;
        if (c19330y0.f61229g) {
            return;
        }
        c19330y0.f61230h = charSequence;
        if ((c19330y0.f61224b & 8) != 0) {
            Toolbar toolbar = c19330y0.f61223a;
            toolbar.setTitle(charSequence);
            if (c19330y0.f61229g) {
                AbstractC0738T.m1585m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C19339c(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m11144k();
        C19330Y0 c19330y0 = (C19330Y0) this.f32226s0;
        c19330y0.f61226d = drawable;
        c19330y0.m20430c();
    }
}
