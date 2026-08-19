package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p588Y2.C9642z;
import p784hb.C14438g;
import p885m4.C17151a;
import p976r.C18816n;
import p976r.InterfaceC18813k;
import p976r.InterfaceC18828z;
import p976r.MenuC18814l;
import p999s.AbstractC19353g1;
import p999s.AbstractC19379t0;
import p999s.C19345e;
import p999s.C19354h;
import p999s.C19356i;
import p999s.C19360k;
import p999s.C19377s0;
import p999s.InterfaceC19358j;
import p999s.InterfaceC19362l;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC19379t0 implements InterfaceC18813k, InterfaceC18828z {

    /* JADX INFO: renamed from: D0 */
    public MenuC18814l f32234D0;

    /* JADX INFO: renamed from: E0 */
    public Context f32235E0;

    /* JADX INFO: renamed from: F0 */
    public int f32236F0;

    /* JADX INFO: renamed from: G0 */
    public boolean f32237G0;

    /* JADX INFO: renamed from: H0 */
    public C19356i f32238H0;

    /* JADX INFO: renamed from: I0 */
    public C14438g f32239I0;

    /* JADX INFO: renamed from: J0 */
    public boolean f32240J0;

    /* JADX INFO: renamed from: K0 */
    public int f32241K0;

    /* JADX INFO: renamed from: L0 */
    public final int f32242L0;

    /* JADX INFO: renamed from: M0 */
    public final int f32243M0;

    /* JADX INFO: renamed from: N0 */
    public InterfaceC19362l f32244N0;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f32242L0 = (int) (56.0f * f10);
        this.f32243M0 = (int) (f10 * 4.0f);
        this.f32235E0 = context;
        this.f32236F0 = 0;
    }

    /* JADX INFO: renamed from: j */
    public static C19360k m11146j() {
        C19360k c19360k = new C19360k(-2, -2);
        c19360k.f61312a = false;
        ((LinearLayout.LayoutParams) c19360k).gravity = 16;
        return c19360k;
    }

    /* JADX INFO: renamed from: k */
    public static C19360k m11147k(ViewGroup.LayoutParams layoutParams) {
        C19360k c19360k;
        if (layoutParams == null) {
            return m11146j();
        }
        if (layoutParams instanceof C19360k) {
            C19360k c19360k2 = (C19360k) layoutParams;
            c19360k = new C19360k(c19360k2);
            c19360k.f61312a = c19360k2.f61312a;
        } else {
            c19360k = new C19360k(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c19360k).gravity <= 0) {
            ((LinearLayout.LayoutParams) c19360k).gravity = 16;
        }
        return c19360k;
    }

    @Override // p976r.InterfaceC18813k
    /* JADX INFO: renamed from: a */
    public final boolean mo11129a(C18816n c18816n) {
        return this.f32234D0.m20128q(c18816n, null, 0);
    }

    @Override // p976r.InterfaceC18828z
    /* JADX INFO: renamed from: b */
    public final void mo11130b(MenuC18814l menuC18814l) {
        this.f32234D0 = menuC18814l;
    }

    @Override // p999s.AbstractC19379t0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C19360k;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p999s.AbstractC19379t0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ C19377s0 generateDefaultLayoutParams() {
        return m11146j();
    }

    @Override // p999s.AbstractC19379t0
    /* JADX INFO: renamed from: g */
    public final C19377s0 generateLayoutParams(AttributeSet attributeSet) {
        return new C19360k(getContext(), attributeSet);
    }

    @Override // p999s.AbstractC19379t0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m11146j();
    }

    @Override // p999s.AbstractC19379t0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m11147k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f32234D0 == null) {
            Context context = getContext();
            MenuC18814l menuC18814l = new MenuC18814l(context);
            this.f32234D0 = menuC18814l;
            menuC18814l.f59849e = new C9642z(this, 20);
            C19356i c19356i = new C19356i(context);
            this.f32238H0 = c19356i;
            c19356i.f61307x0 = true;
            c19356i.f61308y0 = true;
            c19356i.f61300q0 = new C17151a();
            this.f32234D0.m20121b(c19356i, this.f32235E0);
            C19356i c19356i2 = this.f32238H0;
            c19356i2.f61303t0 = this;
            this.f32234D0 = c19356i2.f61298o0;
        }
        return this.f32234D0;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C19356i c19356i = this.f32238H0;
        C19354h c19354h = c19356i.f61304u0;
        if (c19354h != null) {
            return c19354h.getDrawable();
        }
        if (c19356i.f61306w0) {
            return c19356i.f61305v0;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f32236F0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p999s.AbstractC19379t0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ C19377s0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m11147k(layoutParams);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m11151l(int i10) {
        boolean zMo11124a = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof InterfaceC19358j)) {
            zMo11124a = ((InterfaceC19358j) childAt).mo11124a();
        }
        return (i10 <= 0 || !(childAt2 instanceof InterfaceC19358j)) ? zMo11124a : zMo11124a | ((InterfaceC19358j) childAt2).mo11125b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C19356i c19356i = this.f32238H0;
        if (c19356i != null) {
            c19356i.mo20089h();
            if (this.f32238H0.m20460i()) {
                this.f32238H0.m20459f();
                this.f32238H0.m20461l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C19356i c19356i = this.f32238H0;
        if (c19356i != null) {
            c19356i.m20459f();
            C19345e c19345e = c19356i.f61292F0;
            if (c19345e == null || !c19345e.m20143b()) {
                return;
            }
            c19345e.f59921i.dismiss();
        }
    }

    @Override // p999s.AbstractC19379t0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.f32240J0) {
            super.onLayout(z6, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean z10 = AbstractC19353g1.f61283a;
        boolean z11 = getLayoutDirection() == 1;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                C19360k c19360k = (C19360k) childAt.getLayoutParams();
                if (c19360k.f61312a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m11151l(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z11) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c19360k).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c19360k).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c19360k).leftMargin) + ((LinearLayout.LayoutParams) c19360k).rightMargin;
                    m11151l(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (z11) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                C19360k c19360k2 = (C19360k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c19360k2.f61312a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) c19360k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c19360k2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            C19360k c19360k3 = (C19360k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c19360k3.f61312a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) c19360k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c19360k3).rightMargin + iMax + i27;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // p999s.AbstractC19379t0, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z6;
        int i13;
        boolean z10;
        int i14;
        ?? r6;
        int i15;
        MenuC18814l menuC18814l;
        boolean z11 = this.f32240J0;
        boolean z12 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f32240J0 = z12;
        if (z11 != z12) {
            this.f32241K0 = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f32240J0 && (menuC18814l = this.f32234D0) != null && size != this.f32241K0) {
            this.f32241K0 = size;
            menuC18814l.m20127p(true);
        }
        int childCount = getChildCount();
        if (!this.f32240J0 || childCount <= 0) {
            for (int i16 = 0; i16 < childCount; i16++) {
                C19360k c19360k = (C19360k) getChildAt(i16).getLayoutParams();
                ((LinearLayout.LayoutParams) c19360k).rightMargin = 0;
                ((LinearLayout.LayoutParams) c19360k).leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i17 = size2 - paddingRight;
        int i18 = this.f32242L0;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = (i20 / i19) + i18;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i22 = 0;
        int iMax2 = 0;
        int i23 = 0;
        boolean z13 = false;
        int i24 = 0;
        long j10 = 0;
        while (true) {
            i12 = this.f32243M0;
            if (i23 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i23);
            int i25 = size3;
            int i26 = i17;
            if (childAt.getVisibility() != 8) {
                boolean z14 = childAt instanceof ActionMenuItemView;
                int i27 = i22 + 1;
                if (z14) {
                    childAt.setPadding(i12, 0, i12, 0);
                }
                C19360k c19360k2 = (C19360k) childAt.getLayoutParams();
                c19360k2.f61317f = false;
                c19360k2.f61314c = 0;
                c19360k2.f61313b = 0;
                c19360k2.f61315d = false;
                ((LinearLayout.LayoutParams) c19360k2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c19360k2).rightMargin = 0;
                c19360k2.f61316e = z14 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i28 = c19360k2.f61312a ? 1 : i19;
                C19360k c19360k3 = (C19360k) childAt.getLayoutParams();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z14 ? (ActionMenuItemView) childAt : null;
                boolean z15 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i28 <= 0 || (z15 && i28 < 2)) {
                    i15 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i28 * i21, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i15 = measuredWidth / i21;
                    if (measuredWidth % i21 != 0) {
                        i15++;
                    }
                    if (z15 && i15 < 2) {
                        i15 = 2;
                    }
                }
                c19360k3.f61315d = !c19360k3.f61312a && z15;
                c19360k3.f61313b = i15;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i21, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i15);
                if (c19360k2.f61315d) {
                    i24++;
                }
                if (c19360k2.f61312a) {
                    z13 = true;
                }
                i19 -= i15;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i15 == 1) {
                    j10 |= (long) (1 << i23);
                }
                i22 = i27;
            }
            i23++;
            size3 = i25;
            i17 = i26;
            paddingBottom = paddingBottom;
            mode = mode;
        }
        int i29 = mode;
        int i30 = i17;
        int i31 = size3;
        boolean z16 = z13 && i22 == 2;
        boolean z17 = false;
        while (true) {
            if (i24 <= 0 || i19 <= 0) {
                z6 = z17;
                break;
            }
            int i32 = Integer.MAX_VALUE;
            int i33 = 0;
            int i34 = 0;
            long j11 = 0;
            while (i34 < childCount2) {
                C19360k c19360k4 = (C19360k) getChildAt(i34).getLayoutParams();
                boolean z18 = z17;
                if (c19360k4.f61315d) {
                    int i35 = c19360k4.f61313b;
                    if (i35 < i32) {
                        j11 = 1 << i34;
                        i32 = i35;
                        i33 = 1;
                    } else if (i35 == i32) {
                        j11 |= 1 << i34;
                        i33++;
                    }
                }
                i34++;
                z17 = z18;
            }
            z6 = z17;
            j10 |= j11;
            if (i33 > i19) {
                break;
            }
            int i36 = i32 + 1;
            int i37 = 0;
            while (i37 < childCount2) {
                View childAt2 = getChildAt(i37);
                C19360k c19360k5 = (C19360k) childAt2.getLayoutParams();
                int i38 = iMax;
                int i39 = childMeasureSpec;
                int i40 = childCount2;
                long j12 = 1 << i37;
                if ((j11 & j12) != 0) {
                    if (z16 && c19360k5.f61316e) {
                        r6 = 1;
                        r6 = 1;
                        if (i19 == 1) {
                            childAt2.setPadding(i12 + i21, 0, i12, 0);
                        }
                    } else {
                        r6 = 1;
                    }
                    c19360k5.f61313b += r6;
                    c19360k5.f61317f = r6;
                    i19--;
                } else if (c19360k5.f61313b == i36) {
                    j10 |= j12;
                }
                i37++;
                childMeasureSpec = i39;
                iMax = i38;
                childCount2 = i40;
            }
            z17 = true;
        }
        int i41 = iMax;
        int i42 = childMeasureSpec;
        int i43 = childCount2;
        boolean z19 = !z13 && i22 == 1;
        if (i19 <= 0 || j10 == 0 || (i19 >= i22 - 1 && !z19 && iMax2 <= 1)) {
            i13 = i43;
            z10 = z6;
        } else {
            float fBitCount = Long.bitCount(j10);
            if (!z19) {
                if ((j10 & 1) != 0 && !((C19360k) getChildAt(0).getLayoutParams()).f61316e) {
                    fBitCount -= 0.5f;
                }
                int i44 = i43 - 1;
                if ((j10 & ((long) (1 << i44))) != 0 && !((C19360k) getChildAt(i44).getLayoutParams()).f61316e) {
                    fBitCount -= 0.5f;
                }
            }
            int i45 = fBitCount > 0.0f ? (int) ((i19 * i21) / fBitCount) : 0;
            boolean z20 = z6;
            i13 = i43;
            for (int i46 = 0; i46 < i13; i46++) {
                if ((j10 & ((long) (1 << i46))) != 0) {
                    View childAt3 = getChildAt(i46);
                    C19360k c19360k6 = (C19360k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c19360k6.f61314c = i45;
                        c19360k6.f61317f = true;
                        if (i46 == 0 && !c19360k6.f61316e) {
                            ((LinearLayout.LayoutParams) c19360k6).leftMargin = (-i45) / 2;
                        }
                        z20 = true;
                    } else if (c19360k6.f61312a) {
                        c19360k6.f61314c = i45;
                        c19360k6.f61317f = true;
                        ((LinearLayout.LayoutParams) c19360k6).rightMargin = (-i45) / 2;
                        z20 = true;
                    } else {
                        if (i46 != 0) {
                            ((LinearLayout.LayoutParams) c19360k6).leftMargin = i45 / 2;
                        }
                        if (i46 != i13 - 1) {
                            ((LinearLayout.LayoutParams) c19360k6).rightMargin = i45 / 2;
                        }
                    }
                }
            }
            z10 = z20;
        }
        if (z10) {
            int i47 = 0;
            while (i47 < i13) {
                View childAt4 = getChildAt(i47);
                C19360k c19360k7 = (C19360k) childAt4.getLayoutParams();
                if (c19360k7.f61317f) {
                    i14 = i42;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c19360k7.f61313b * i21) + c19360k7.f61314c, 1073741824), i14);
                } else {
                    i14 = i42;
                }
                i47++;
                i42 = i14;
            }
        }
        setMeasuredDimension(i30, i29 != 1073741824 ? i41 : i31);
    }

    public void setExpandedActionViewsExclusive(boolean z6) {
        this.f32238H0.f61289C0 = z6;
    }

    public void setOnMenuItemClickListener(InterfaceC19362l interfaceC19362l) {
        this.f32244N0 = interfaceC19362l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C19356i c19356i = this.f32238H0;
        C19354h c19354h = c19356i.f61304u0;
        if (c19354h != null) {
            c19354h.setImageDrawable(drawable);
        } else {
            c19356i.f61306w0 = true;
            c19356i.f61305v0 = drawable;
        }
    }

    public void setOverflowReserved(boolean z6) {
        this.f32237G0 = z6;
    }

    public void setPopupTheme(int i10) {
        if (this.f32236F0 != i10) {
            this.f32236F0 = i10;
            if (i10 == 0) {
                this.f32235E0 = getContext();
            } else {
                this.f32235E0 = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(C19356i c19356i) {
        this.f32238H0 = c19356i;
        c19356i.f61303t0 = this;
        this.f32234D0 = c19356i.f61298o0;
    }

    @Override // p999s.AbstractC19379t0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C19360k(getContext(), attributeSet);
    }
}
