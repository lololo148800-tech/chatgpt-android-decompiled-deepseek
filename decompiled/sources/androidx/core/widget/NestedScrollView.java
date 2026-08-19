package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.javax.sip.C10808o;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import io.sentry.android.core.AbstractC15256t;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import p030B2.AbstractC0718B;
import p030B2.AbstractC0720C;
import p030B2.AbstractC0730K;
import p030B2.AbstractC0738T;
import p030B2.AbstractC0739U;
import p030B2.C0722D;
import p030B2.C0757g;
import p030B2.C0775p;
import p030B2.C0781s;
import p030B2.InterfaceC0779r;
import p1072w2.AbstractC20789a;
import p108E2.AbstractC2245d;
import p108E2.AbstractC2248g;
import p108E2.C2247f;
import p108E2.C2250i;
import p108E2.InterfaceC2249h;
import p523V9.AbstractC8150n4;
import p817j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0779r, ScrollingView {

    /* JADX INFO: renamed from: P0 */
    public static final float f32902P0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: Q0 */
    public static final C2247f f32903Q0 = new C2247f(0);

    /* JADX INFO: renamed from: R0 */
    public static final int[] f32904R0 = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A0 */
    public boolean f32905A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f32906B0;

    /* JADX INFO: renamed from: C0 */
    public final int f32907C0;

    /* JADX INFO: renamed from: D0 */
    public final int f32908D0;

    /* JADX INFO: renamed from: E0 */
    public final int f32909E0;

    /* JADX INFO: renamed from: F0 */
    public int f32910F0;

    /* JADX INFO: renamed from: G0 */
    public final int[] f32911G0;

    /* JADX INFO: renamed from: H0 */
    public final int[] f32912H0;

    /* JADX INFO: renamed from: I0 */
    public int f32913I0;

    /* JADX INFO: renamed from: J0 */
    public int f32914J0;

    /* JADX INFO: renamed from: K0 */
    public C2250i f32915K0;

    /* JADX INFO: renamed from: L0 */
    public final C0781s f32916L0;

    /* JADX INFO: renamed from: M0 */
    public final C0775p f32917M0;

    /* JADX INFO: renamed from: N0 */
    public float f32918N0;

    /* JADX INFO: renamed from: O0 */
    public final C0757g f32919O0;

    /* JADX INFO: renamed from: o0 */
    public final float f32920o0;

    /* JADX INFO: renamed from: p0 */
    public long f32921p0;

    /* JADX INFO: renamed from: q0 */
    public final Rect f32922q0;

    /* JADX INFO: renamed from: r0 */
    public final OverScroller f32923r0;

    /* JADX INFO: renamed from: s0 */
    public final EdgeEffect f32924s0;

    /* JADX INFO: renamed from: t0 */
    public final EdgeEffect f32925t0;

    /* JADX INFO: renamed from: u0 */
    public int f32926u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f32927v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f32928w0;

    /* JADX INFO: renamed from: x0 */
    public View f32929x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f32930y0;

    /* JADX INFO: renamed from: z0 */
    public VelocityTracker f32931z0;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.openai.chatgpt.R.attr.nestedScrollViewStyle);
        this.f32922q0 = new Rect();
        this.f32927v0 = true;
        this.f32928w0 = false;
        this.f32929x0 = null;
        this.f32930y0 = false;
        this.f32906B0 = true;
        this.f32910F0 = -1;
        this.f32911G0 = new int[2];
        this.f32912H0 = new int[2];
        this.f32919O0 = new C0757g(getContext(), new C10808o(this, 6));
        int i10 = Build.VERSION.SDK_INT;
        this.f32924s0 = i10 >= 31 ? AbstractC2245d.m3272a(context, attributeSet) : new EdgeEffect(context);
        this.f32925t0 = i10 >= 31 ? AbstractC2245d.m3272a(context, attributeSet) : new EdgeEffect(context);
        this.f32920o0 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f32923r0 = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f32907C0 = viewConfiguration.getScaledTouchSlop();
        this.f32908D0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f32909E0 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f32904R0, com.openai.chatgpt.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f32916L0 = new C0781s(0);
        this.f32917M0 = new C0775p(this);
        setNestedScrollingEnabled(true);
        AbstractC0738T.m1584l(this, f32903Q0);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m11390l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m11390l((View) parent, nestedScrollView);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11391a(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m11396m(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m11402s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f32922q0;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m11402s(m11392b(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i10);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !m11396m(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    /* JADX INFO: renamed from: b */
    public final int m11392b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // p030B2.InterfaceC0779r
    /* JADX INFO: renamed from: c */
    public final void mo1748c(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        m11397n(i13, i14, iArr);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0084  */
    /* JADX WARN: Code duplicated, block: B:23:0x0093  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00db  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f9  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i10;
        int scrollRange;
        int overScrollMode;
        if (this.f32923r0.isFinished()) {
            return;
        }
        this.f32923r0.computeScrollOffset();
        int currY = this.f32923r0.getCurrY();
        int i11 = currY - this.f32914J0;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f32925t0;
        EdgeEffect edgeEffect2 = this.f32924s0;
        if (i11 <= 0 || AbstractC8150n4.m8690c(edgeEffect2) == 0.0f) {
            if (i11 < 0 && AbstractC8150n4.m8690c(edgeEffect) != 0.0f) {
                float f10 = height;
                iRound = Math.round(AbstractC8150n4.m8691d(edgeEffect, (i11 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
                if (iRound != i11) {
                    edgeEffect.finish();
                }
            }
            this.f32914J0 = currY;
            iArr = this.f32912H0;
            iArr[1] = 0;
            this.f32917M0.m1735c(0, i11, 1, iArr, null);
            i10 = i11 - iArr[1];
            scrollRange = getScrollRange();
            if (AbstractC20789a.m21307a()) {
                AbstractC2248g.m3280a(this, Math.abs(this.f32923r0.getCurrVelocity()));
            }
            if (i10 != 0) {
                int scrollY = getScrollY();
                m11399p(i10, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i12 = i10 - scrollY2;
                iArr[1] = 0;
                this.f32917M0.m1736d(0, scrollY2, 0, i12, this.f32911G0, 1, iArr);
                i10 = i12 - iArr[1];
            }
            if (i10 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i10 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f32923r0.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f32923r0.getCurrVelocity());
                    }
                }
                this.f32923r0.abortAnimation();
                m11406w(1);
            }
            if (this.f32923r0.isFinished()) {
                m11406w(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(AbstractC8150n4.m8691d(edgeEffect2, ((-i11) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i11) {
            edgeEffect2.finish();
        }
        i11 -= iRound;
        this.f32914J0 = currY;
        iArr = this.f32912H0;
        iArr[1] = 0;
        this.f32917M0.m1735c(0, i11, 1, iArr, null);
        i10 = i11 - iArr[1];
        scrollRange = getScrollRange();
        if (AbstractC20789a.m21307a()) {
            AbstractC2248g.m3280a(this, Math.abs(this.f32923r0.getCurrVelocity()));
        }
        if (i10 != 0) {
            int scrollY3 = getScrollY();
            m11399p(i10, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i13 = i10 - scrollY4;
            iArr[1] = 0;
            this.f32917M0.m1736d(0, scrollY4, 0, i13, this.f32911G0, 1, iArr);
            i10 = i13 - iArr[1];
        }
        if (i10 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i10 < 0) {
                    if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f32923r0.getCurrVelocity());
                    }
                } else if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f32923r0.getCurrVelocity());
                }
            } else if (i10 < 0) {
                if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f32923r0.getCurrVelocity());
                }
            } else if (edgeEffect.isFinished()) {
                edgeEffect.onAbsorb((int) this.f32923r0.getCurrVelocity());
            }
            this.f32923r0.abortAnimation();
            m11406w(1);
        }
        if (this.f32923r0.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            m11406w(1);
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // p030B2.InterfaceC0777q
    /* JADX INFO: renamed from: d */
    public final void mo1742d(View view, int i10, int i11, int i12, int i13, int i14) {
        m11397n(i13, i14, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m11393i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z6) {
        return this.f32917M0.m1733a(f10, f11, z6);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f32917M0.m1734b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f32917M0.m1735c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f32917M0.m1736d(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f32924s0;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f32925t0;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // p030B2.InterfaceC0777q
    /* JADX INFO: renamed from: e */
    public final boolean mo1743e(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // p030B2.InterfaceC0777q
    /* JADX INFO: renamed from: f */
    public final void mo1744f(View view, View view2, int i10, int i11) {
        C0781s c0781s = this.f32916L0;
        if (i11 == 1) {
            c0781s.f2193c = i10;
        } else {
            c0781s.f2192b = i10;
        }
        this.f32917M0.m1739g(2, i11);
    }

    @Override // p030B2.InterfaceC0777q
    /* JADX INFO: renamed from: g */
    public final void mo1745g(View view, int i10) {
        C0781s c0781s = this.f32916L0;
        if (i10 == 1) {
            c0781s.f2193c = 0;
        } else {
            c0781s.f2192b = 0;
        }
        m11406w(i10);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0781s c0781s = this.f32916L0;
        return c0781s.f2193c | c0781s.f2192b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f32918N0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f32918N0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f32918N0;
    }

    @Override // p030B2.InterfaceC0777q
    /* JADX INFO: renamed from: h */
    public final void mo1746h(View view, int i10, int i11, int[] iArr, int i12) {
        this.f32917M0.m1735c(i10, i11, i12, iArr, null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f32917M0.m1738f(0);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m11393i(KeyEvent keyEvent) {
        this.f32922q0.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? m11395k(33) : m11391a(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? m11395k(130) : m11391a(130);
                }
                if (keyCode == 62) {
                    m11400q(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return m11395k(33);
                }
                if (keyCode == 93) {
                    return m11395k(130);
                }
                if (keyCode == 122) {
                    m11400q(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                m11400q(130);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
        return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f32917M0.f2177d;
    }

    /* JADX INFO: renamed from: j */
    public final void m11394j(int i10) {
        if (getChildCount() > 0) {
            this.f32923r0.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f32917M0.m1739g(2, 1);
            this.f32914J0 = getScrollY();
            postInvalidateOnAnimation();
            if (AbstractC20789a.m21307a()) {
                AbstractC2248g.m3280a(this, Math.abs(this.f32923r0.getCurrVelocity()));
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m11395k(int i10) {
        int childCount;
        boolean z6 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f32922q0;
        rect.top = 0;
        rect.bottom = height;
        if (z6 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m11401r(i10, rect.top, rect.bottom);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m11396m(View view, int i10, int i11) {
        Rect rect = this.f32922q0;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX INFO: renamed from: n */
    public final void m11397n(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f32917M0.m1736d(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    /* JADX INFO: renamed from: o */
    public final void m11398o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f32910F0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f32926u0 = (int) motionEvent.getY(i10);
            this.f32910F0 = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f32931z0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32928w0 = false;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x010a A[PHI: r5
      0x010a: PHI (r5v18 int) = (r5v16 int), (r5v16 int), (r5v16 int), (r5v17 int) binds: [B:68:0x0108, B:78:0x0125, B:80:0x012b, B:82:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x010c  */
    /* JADX WARN: Code duplicated, block: B:75:0x011f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0125  */
    /* JADX WARN: Code duplicated, block: B:83:0x0130  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i10;
        int width;
        char c9;
        int iM1498i;
        int scaledMinimumFlingVelocity;
        int deviceId;
        int source;
        InputDevice device;
        boolean z6;
        int i11;
        int identifier;
        int scaledMaximumFlingVelocity;
        int dimensionPixelSize;
        char c10;
        boolean z10;
        VelocityTracker velocityTracker;
        float yVelocity;
        float f10;
        long j10;
        float fSqrt;
        int i12;
        int i13;
        if (motionEvent.getAction() != 8 || this.f32930y0) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i10 = 9;
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            axisValue = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            i10 = 26;
        } else {
            axisValue = 0.0f;
            i10 = 0;
            width = 0;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        m11402s(-((int) (getVerticalScrollFactorCompat() * axisValue)), width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i10 == 0) {
            return true;
        }
        C0757g c0757g = this.f32919O0;
        c0757g.getClass();
        int source2 = motionEvent.getSource();
        int deviceId2 = motionEvent.getDeviceId();
        int i14 = c0757g.f2143f;
        int[] iArr = c0757g.f2145h;
        if (i14 == source2 && c0757g.f2144g == deviceId2 && c0757g.f2142e == i10) {
            c10 = 0;
            z10 = false;
        } else {
            Context context = c0757g.f2138a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 34) {
                Method method = AbstractC0739U.f2102a;
                iM1498i = AbstractC0718B.m1498i(viewConfiguration, deviceId3, i10, source3);
            } else {
                Method method2 = AbstractC0739U.f2102a;
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 == null || device2.getMotionRange(i10, source3) == null) {
                    c9 = 0;
                    iM1498i = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier2 = (source3 == 4194304 && i10 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier2 != 0) {
                        scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier2);
                        if (scaledMinimumFlingVelocity < 0) {
                            scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                        }
                    } else {
                        iM1498i = Integer.MAX_VALUE;
                    }
                    iM1498i = scaledMinimumFlingVelocity;
                }
                iArr[c9] = iM1498i;
                deviceId = motionEvent.getDeviceId();
                source = motionEvent.getSource();
                if (i15 >= 34) {
                    scaledMaximumFlingVelocity = AbstractC0718B.m1497h(viewConfiguration, deviceId, i10, source);
                } else {
                    device = InputDevice.getDevice(deviceId);
                    if (device != null || device.getMotionRange(i10, source) == null) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    i11 = Integer.MIN_VALUE;
                    if (z6) {
                        Resources resources2 = context.getResources();
                        if (source == 4194304 || i10 != 26) {
                            identifier = -1;
                        } else {
                            identifier = resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
                        }
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier != -1) {
                            if (identifier != 0 && (dimensionPixelSize = resources2.getDimensionPixelSize(identifier)) >= 0) {
                                i11 = dimensionPixelSize;
                            }
                            scaledMaximumFlingVelocity = i11;
                        } else {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        }
                    } else {
                        scaledMaximumFlingVelocity = i11;
                    }
                }
                iArr[1] = scaledMaximumFlingVelocity;
                c0757g.f2143f = source2;
                c0757g.f2144g = deviceId2;
                c0757g.f2142e = i10;
                c10 = 0;
                z10 = true;
            }
            c9 = 0;
            iArr[c9] = iM1498i;
            deviceId = motionEvent.getDeviceId();
            source = motionEvent.getSource();
            if (i15 >= 34) {
                scaledMaximumFlingVelocity = AbstractC0718B.m1497h(viewConfiguration, deviceId, i10, source);
            } else {
                device = InputDevice.getDevice(deviceId);
                if (device != null) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                i11 = Integer.MIN_VALUE;
                if (z6) {
                    scaledMaximumFlingVelocity = i11;
                } else {
                    Resources resources3 = context.getResources();
                    if (source == 4194304) {
                        identifier = -1;
                    } else {
                        identifier = -1;
                    }
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier != -1) {
                        if (identifier != 0) {
                            i11 = dimensionPixelSize;
                        }
                        scaledMaximumFlingVelocity = i11;
                    } else {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c0757g.f2143f = source2;
            c0757g.f2144g = deviceId2;
            c0757g.f2142e = i10;
            c10 = 0;
            z10 = true;
        }
        if (iArr[c10] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker2 = c0757g.f2140c;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                c0757g.f2140c = null;
            }
        } else {
            if (c0757g.f2140c == null) {
                c0757g.f2140c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker3 = c0757g.f2140c;
            Map map = AbstractC0720C.f2075a;
            velocityTracker3.addMovement(motionEvent);
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = AbstractC0720C.f2075a;
                if (!map2.containsKey(velocityTracker3)) {
                    map2.put(velocityTracker3, new C0722D());
                }
                C0722D c0722d = (C0722D) map2.get(velocityTracker3);
                c0722d.getClass();
                long eventTime = motionEvent.getEventTime();
                int i16 = c0722d.f2081d;
                long[] jArr = c0722d.f2079b;
                if (i16 != 0 && eventTime - jArr[c0722d.f2082e] > 40) {
                    c0722d.f2081d = 0;
                    c0722d.f2080c = 0.0f;
                }
                int i17 = (c0722d.f2082e + 1) % 20;
                c0722d.f2082e = i17;
                int i18 = c0722d.f2081d;
                if (i18 != 20) {
                    c0722d.f2081d = i18 + 1;
                }
                c0722d.f2078a[i17] = motionEvent.getAxisValue(26);
                jArr[c0722d.f2082e] = eventTime;
            }
            velocityTracker3.computeCurrentVelocity(1000, Float.MAX_VALUE);
            C0722D c0722d2 = (C0722D) AbstractC0720C.f2075a.get(velocityTracker3);
            if (c0722d2 != null) {
                int i19 = c0722d2.f2081d;
                if (i19 < 2) {
                    velocityTracker = velocityTracker3;
                    i12 = 1000;
                    fSqrt = 0.0f;
                } else {
                    int i20 = c0722d2.f2082e;
                    int i21 = ((i20 + 20) - (i19 - 1)) % 20;
                    long[] jArr2 = c0722d2.f2079b;
                    long j11 = jArr2[i20];
                    while (true) {
                        j10 = jArr2[i21];
                        if (j11 - j10 <= 100) {
                            break;
                        }
                        c0722d2.f2081d--;
                        i21 = (i21 + 1) % 20;
                    }
                    int i22 = c0722d2.f2081d;
                    if (i22 < 2) {
                        velocityTracker = velocityTracker3;
                        i12 = 1000;
                        fSqrt = 0.0f;
                    } else {
                        float[] fArr = c0722d2.f2078a;
                        if (i22 == 2) {
                            int i23 = (i21 + 1) % 20;
                            long j12 = jArr2[i23];
                            if (j10 == j12) {
                                velocityTracker = velocityTracker3;
                                i12 = 1000;
                                fSqrt = 0.0f;
                            } else {
                                velocityTracker = velocityTracker3;
                                i12 = 1000;
                                fSqrt = fArr[i23] / (j12 - j10);
                            }
                        } else {
                            float f11 = 0.0f;
                            int i24 = 0;
                            int i25 = 0;
                            while (true) {
                                if (i24 >= c0722d2.f2081d - 1) {
                                    break;
                                }
                                int i26 = i24 + i21;
                                long j13 = jArr2[i26 % 20];
                                int i27 = (i26 + 1) % 20;
                                if (jArr2[i27] == j13) {
                                    i13 = 1;
                                } else {
                                    i25++;
                                    float fSqrt2 = (f11 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f11) * 2.0f));
                                    float f12 = fArr[i27] / (jArr2[i27] - j13);
                                    float fAbs = (Math.abs(f12) * (f12 - fSqrt2)) + f11;
                                    i13 = 1;
                                    if (i25 == 1) {
                                        fAbs *= 0.5f;
                                    }
                                    f11 = fAbs;
                                }
                                i24 += i13;
                                fArr = fArr;
                                velocityTracker3 = velocityTracker3;
                            }
                            velocityTracker = velocityTracker3;
                            fSqrt = ((float) Math.sqrt(Math.abs(f11) * 2.0f)) * (f11 < 0.0f ? -1.0f : 1.0f);
                            i12 = 1000;
                        }
                    }
                }
                float f13 = fSqrt * i12;
                c0722d2.f2080c = f13;
                if (f13 < (-Math.abs(Float.MAX_VALUE))) {
                    c0722d2.f2080c = -Math.abs(Float.MAX_VALUE);
                } else if (c0722d2.f2080c > Math.abs(Float.MAX_VALUE)) {
                    c0722d2.f2080c = Math.abs(Float.MAX_VALUE);
                }
            } else {
                velocityTracker = velocityTracker3;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                yVelocity = AbstractC0718B.m1492c(velocityTracker, i10);
            } else {
                VelocityTracker velocityTracker4 = velocityTracker;
                if (i10 == 0) {
                    yVelocity = velocityTracker4.getXVelocity();
                } else if (i10 == 1) {
                    yVelocity = velocityTracker4.getYVelocity();
                } else {
                    C0722D c0722d3 = (C0722D) AbstractC0720C.f2075a.get(velocityTracker4);
                    yVelocity = (c0722d3 == null || i10 != 26) ? 0.0f : c0722d3.f2080c;
                }
            }
            NestedScrollView nestedScrollView = (NestedScrollView) c0757g.f2139b.f32040Z;
            float f14 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
            float fSignum = Math.signum(f14);
            if (z10 || (fSignum != Math.signum(c0757g.f2141d) && fSignum != 0.0f)) {
                nestedScrollView.f32923r0.abortAnimation();
            }
            if (Math.abs(f14) >= iArr[0]) {
                int i28 = iArr[1];
                float fMax = Math.max(-i28, Math.min(f14, i28));
                if (fMax == 0.0f) {
                    f10 = 0.0f;
                } else {
                    nestedScrollView.f32923r0.abortAnimation();
                    nestedScrollView.m11394j((int) fMax);
                    f10 = fMax;
                }
                c0757g.f2141d = f10;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0119  */
    /* JADX WARN: Code duplicated, block: B:70:0x012f  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z6 = true;
        if (action == 2 && this.f32930y0) {
            return true;
        }
        int i10 = action & 255;
        if (i10 == 0) {
            int y8 = (int) motionEvent.getY();
            int x4 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y8 < childAt.getTop() - scrollY || y8 >= childAt.getBottom() - scrollY || x4 < childAt.getLeft() || x4 >= childAt.getRight()) {
                    if (!m11405v(motionEvent) && this.f32923r0.isFinished()) {
                        z6 = false;
                    }
                    this.f32930y0 = z6;
                    velocityTracker = this.f32931z0;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f32931z0 = null;
                    }
                } else {
                    this.f32926u0 = y8;
                    this.f32910F0 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f32931z0;
                    if (velocityTracker3 == null) {
                        this.f32931z0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f32931z0.addMovement(motionEvent);
                    this.f32923r0.computeScrollOffset();
                    if (!m11405v(motionEvent) && this.f32923r0.isFinished()) {
                        z6 = false;
                    }
                    this.f32930y0 = z6;
                    this.f32917M0.m1739g(2, 0);
                }
            } else {
                if (!m11405v(motionEvent)) {
                    z6 = false;
                }
                this.f32930y0 = z6;
                velocityTracker = this.f32931z0;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f32931z0 = null;
                }
            }
        } else if (i10 == 1) {
            this.f32930y0 = false;
            this.f32910F0 = -1;
            velocityTracker2 = this.f32931z0;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f32931z0 = null;
            }
            if (this.f32923r0.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m11406w(0);
        } else if (i10 == 2) {
            int i11 = this.f32910F0;
            if (i11 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                if (iFindPointerIndex == -1) {
                    AbstractC15256t.m16465c("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                } else {
                    int y9 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y9 - this.f32926u0) > this.f32907C0 && (2 & getNestedScrollAxes()) == 0) {
                        this.f32930y0 = true;
                        this.f32926u0 = y9;
                        if (this.f32931z0 == null) {
                            this.f32931z0 = VelocityTracker.obtain();
                        }
                        this.f32931z0.addMovement(motionEvent);
                        this.f32913I0 = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i10 == 3) {
            this.f32930y0 = false;
            this.f32910F0 = -1;
            velocityTracker2 = this.f32931z0;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f32931z0 = null;
            }
            if (this.f32923r0.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m11406w(0);
        } else if (i10 == 6) {
            m11398o(motionEvent);
        }
        return this.f32930y0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        super.onLayout(z6, i10, i11, i12, i13);
        int i14 = 0;
        this.f32927v0 = false;
        View view = this.f32929x0;
        if (view != null && m11390l(view, this)) {
            View view2 = this.f32929x0;
            Rect rect = this.f32922q0;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM11392b = m11392b(rect);
            if (iM11392b != 0) {
                scrollBy(0, iM11392b);
            }
        }
        this.f32929x0 = null;
        if (!this.f32928w0) {
            if (this.f32915K0 != null) {
                scrollTo(getScrollX(), this.f32915K0.f6891Y);
                this.f32915K0 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i14 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f32928w0 = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f32905A0 && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z6) {
        if (z6) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        m11394j((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return this.f32917M0.m1734b(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        this.f32917M0.m1735c(i10, i11, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m11397n(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        mo1744f(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z6, boolean z10) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus != null && m11396m(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i10, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2250i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2250i c2250i = (C2250i) parcelable;
        super.onRestoreInstanceState(c2250i.getSuperState());
        this.f32915K0 = c2250i;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2250i c2250i = new C2250i(super.onSaveInstanceState());
        c2250i.f6891Y = getScrollY();
        return c2250i;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m11396m(viewFindFocus, 0, i13)) {
            return;
        }
        Rect rect = this.f32922q0;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iM11392b = m11392b(rect);
        if (iM11392b != 0) {
            if (this.f32906B0) {
                m11404u(0, iM11392b, false);
            } else {
                scrollBy(0, iM11392b);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return mo1743e(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo1745g(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f32931z0 == null) {
            this.f32931z0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f32913I0 = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f10 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f32913I0);
        C0775p c0775p = this.f32917M0;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f32925t0;
            EdgeEffect edgeEffect2 = this.f32924s0;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f32931z0;
                velocityTracker.computeCurrentVelocity(1000, this.f32909E0);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f32910F0);
                if (Math.abs(yVelocity) >= this.f32908D0) {
                    if (AbstractC8150n4.m8690c(edgeEffect2) != 0.0f) {
                        if (m11403t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            m11394j(-yVelocity);
                        }
                    } else if (AbstractC8150n4.m8690c(edgeEffect) != 0.0f) {
                        int i10 = -yVelocity;
                        if (m11403t(edgeEffect, i10)) {
                            edgeEffect.onAbsorb(i10);
                        } else {
                            m11394j(i10);
                        }
                    } else {
                        int i11 = -yVelocity;
                        float f11 = i11;
                        if (!c0775p.m1734b(0.0f, f11)) {
                            dispatchNestedFling(0.0f, f11, true);
                            m11394j(i11);
                        }
                    }
                } else if (this.f32923r0.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f32910F0 = -1;
                this.f32930y0 = false;
                VelocityTracker velocityTracker2 = this.f32931z0;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f32931z0 = null;
                }
                m11406w(0);
                this.f32924s0.onRelease();
                this.f32925t0.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f32910F0);
                if (iFindPointerIndex == -1) {
                    AbstractC15256t.m16465c("NestedScrollView", "Invalid pointerId=" + this.f32910F0 + " in onTouchEvent");
                } else {
                    int y8 = (int) motionEvent.getY(iFindPointerIndex);
                    int i12 = this.f32926u0 - y8;
                    float x4 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i12 / getHeight();
                    if (AbstractC8150n4.m8690c(edgeEffect2) != 0.0f) {
                        float f12 = -AbstractC8150n4.m8691d(edgeEffect2, -height, x4);
                        if (AbstractC8150n4.m8690c(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f10 = f12;
                    } else if (AbstractC8150n4.m8690c(edgeEffect) != 0.0f) {
                        float fM8691d = AbstractC8150n4.m8691d(edgeEffect, height, 1.0f - x4);
                        if (AbstractC8150n4.m8690c(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f10 = fM8691d;
                    }
                    int iRound = Math.round(f10 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i13 = i12 - iRound;
                    if (!this.f32930y0 && Math.abs(i13) > this.f32907C0) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f32930y0 = true;
                        i13 = i13 > 0 ? i13 - this.f32907C0 : i13 + this.f32907C0;
                    }
                    if (this.f32930y0) {
                        int iM11402s = m11402s(i13, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f32926u0 = y8 - iM11402s;
                        this.f32913I0 += iM11402s;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f32930y0 && getChildCount() > 0 && this.f32923r0.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f32910F0 = -1;
                this.f32930y0 = false;
                VelocityTracker velocityTracker3 = this.f32931z0;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f32931z0 = null;
                }
                m11406w(0);
                this.f32924s0.onRelease();
                this.f32925t0.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f32926u0 = (int) motionEvent.getY(actionIndex);
                this.f32910F0 = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m11398o(motionEvent);
                this.f32926u0 = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f32910F0));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f32930y0 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f32923r0.isFinished()) {
                this.f32923r0.abortAnimation();
                m11406w(1);
            }
            int y9 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f32926u0 = y9;
            this.f32910F0 = pointerId;
            c0775p.m1739g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f32931z0;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m11399p(int i10, int i11, int i12, int i13) {
        boolean z6;
        boolean z10;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i14 = i12 + i10;
        if (i11 <= 0 && i11 >= 0) {
            z6 = false;
        } else {
            i11 = 0;
            z6 = true;
        }
        if (i14 > i13) {
            z10 = true;
        } else if (i14 < 0) {
            i13 = 0;
            z10 = true;
        } else {
            i13 = i14;
            z10 = false;
        }
        if (z10 && !this.f32917M0.m1738f(1)) {
            this.f32923r0.springBack(i11, i13, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i11, i13);
        return z6 || z10;
    }

    /* JADX INFO: renamed from: q */
    public final void m11400q(int i10) {
        boolean z6 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f32922q0;
        if (z6) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i11 = rect.top;
        int i12 = height + i11;
        rect.bottom = i12;
        m11401r(i10, i11, i12);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX INFO: renamed from: r */
    public final boolean m11401r(int i10, int i11, int i12) {
        boolean z6;
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = i10 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view2 = focusables.get(i14);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                boolean z12 = i11 < top && bottom < i12;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12 && z13) {
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else if (z13) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i11 < scrollY || i12 > i13) {
            m11402s(z10 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z6 = true;
        } else {
            z6 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i10);
        }
        return z6;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f32927v0) {
            this.f32929x0 = view2;
        } else {
            Rect rect = this.f32922q0;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM11392b = m11392b(rect);
            if (iM11392b != 0) {
                scrollBy(0, iM11392b);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM11392b = m11392b(rect);
        boolean z10 = iM11392b != 0;
        if (z10) {
            if (z6) {
                scrollBy(0, iM11392b);
            } else {
                m11404u(0, iM11392b, false);
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        VelocityTracker velocityTracker;
        if (z6 && (velocityTracker = this.f32931z0) != null) {
            velocityTracker.recycle();
            this.f32931z0 = null;
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f32927v0 = true;
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public final int m11402s(int i10, int i11, int i12, boolean z6) {
        int i13;
        int i14;
        boolean z10;
        VelocityTracker velocityTracker;
        C0775p c0775p = this.f32917M0;
        if (i12 == 1) {
            c0775p.m1739g(2, i12);
        }
        boolean zM1735c = this.f32917M0.m1735c(0, i10, i12, this.f32912H0, this.f32911G0);
        int[] iArr = this.f32912H0;
        int[] iArr2 = this.f32911G0;
        if (zM1735c) {
            i13 = i10 - iArr[1];
            i14 = iArr2[1];
        } else {
            i13 = i10;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z11 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z6;
        boolean z12 = m11399p(i13, 0, scrollY, scrollRange) && !c0775p.m1738f(i12);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f32917M0.m1736d(0, scrollY2, 0, i13 - scrollY2, this.f32911G0, i12, iArr);
        int i15 = i14 + iArr2[1];
        int i16 = i13 - iArr[1];
        int i17 = scrollY + i16;
        EdgeEffect edgeEffect = this.f32925t0;
        EdgeEffect edgeEffect2 = this.f32924s0;
        if (i17 < 0) {
            if (z11) {
                AbstractC8150n4.m8691d(edgeEffect2, (-i16) / getHeight(), i11 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i17 > scrollRange && z11) {
            AbstractC8150n4.m8691d(edgeEffect, i16 / getHeight(), 1.0f - (i11 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z10 = z12;
        } else {
            postInvalidateOnAnimation();
            z10 = false;
        }
        if (z10 && i12 == 0 && (velocityTracker = this.f32931z0) != null) {
            velocityTracker.clear();
        }
        if (i12 == 1) {
            m11406w(i12);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i15;
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i10 < 0) {
                i10 = 0;
            } else if (width + i10 > width2) {
                i10 = width2 - width;
            }
            if (height >= height2 || i11 < 0) {
                i11 = 0;
            } else if (height + i11 > height2) {
                i11 = height2 - height;
            }
            if (i10 == getScrollX() && i11 == getScrollY()) {
                return;
            }
            super.scrollTo(i10, i11);
        }
    }

    public void setFillViewport(boolean z6) {
        if (z6 != this.f32905A0) {
            this.f32905A0 = z6;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        C0775p c0775p = this.f32917M0;
        if (c0775p.f2177d) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            AbstractC0730K.m1556m(c0775p.f2176c);
        }
        c0775p.f2177d = z6;
    }

    public void setSmoothScrollingEnabled(boolean z6) {
        this.f32906B0 = z6;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.f32917M0.m1739g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m11406w(0);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m11403t(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float fM8690c = AbstractC8150n4.m8690c(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i10) * 0.35f;
        float f10 = this.f32920o0 * 0.015f;
        double dLog = Math.log(fAbs / f10);
        double d10 = f32902P0;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * dLog) * ((double) f10))) < fM8690c;
    }

    /* JADX INFO: renamed from: u */
    public final void m11404u(int i10, int i11, boolean z6) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f32921p0 > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f32923r0.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z6) {
                this.f32917M0.m1739g(2, 1);
            } else {
                m11406w(1);
            }
            this.f32914J0 = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f32923r0.isFinished()) {
                this.f32923r0.abortAnimation();
                m11406w(1);
            }
            scrollBy(i10, i11);
        }
        this.f32921p0 = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m11405v(MotionEvent motionEvent) {
        boolean z6;
        EdgeEffect edgeEffect = this.f32924s0;
        if (AbstractC8150n4.m8690c(edgeEffect) != 0.0f) {
            AbstractC8150n4.m8691d(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z6 = true;
        } else {
            z6 = false;
        }
        EdgeEffect edgeEffect2 = this.f32925t0;
        if (AbstractC8150n4.m8690c(edgeEffect2) == 0.0f) {
            return z6;
        }
        AbstractC8150n4.m8691d(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final void m11406w(int i10) {
        this.f32917M0.m1740h(i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(InterfaceC2249h interfaceC2249h) {
    }
}
