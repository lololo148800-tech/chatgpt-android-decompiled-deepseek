package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.AbstractC10818a;
import com.google.android.material.datepicker.ViewOnClickListenerC12047l;
import com.openai.chatgpt.R;
import p030B2.AbstractC0738T;
import p030B2.C0750c0;
import p449S9.C7042K;
import p571X9.AbstractC9106B3;
import p880m.AbstractC17123a;
import p976r.InterfaceC18828z;
import p976r.MenuC18814l;
import p999s.AbstractC19353g1;
import p999s.C19345e;
import p999s.C19356i;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: A0 */
    public View f32183A0;

    /* JADX INFO: renamed from: B0 */
    public LinearLayout f32184B0;

    /* JADX INFO: renamed from: C0 */
    public TextView f32185C0;

    /* JADX INFO: renamed from: D0 */
    public TextView f32186D0;

    /* JADX INFO: renamed from: E0 */
    public final int f32187E0;

    /* JADX INFO: renamed from: F0 */
    public final int f32188F0;

    /* JADX INFO: renamed from: G0 */
    public boolean f32189G0;

    /* JADX INFO: renamed from: H0 */
    public final int f32190H0;

    /* JADX INFO: renamed from: o0 */
    public final C7042K f32191o0;

    /* JADX INFO: renamed from: p0 */
    public final Context f32192p0;

    /* JADX INFO: renamed from: q0 */
    public ActionMenuView f32193q0;

    /* JADX INFO: renamed from: r0 */
    public C19356i f32194r0;

    /* JADX INFO: renamed from: s0 */
    public int f32195s0;

    /* JADX INFO: renamed from: t0 */
    public C0750c0 f32196t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f32197u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f32198v0;

    /* JADX INFO: renamed from: w0 */
    public CharSequence f32199w0;

    /* JADX INFO: renamed from: x0 */
    public CharSequence f32200x0;

    /* JADX INFO: renamed from: y0 */
    public View f32201y0;

    /* JADX INFO: renamed from: z0 */
    public View f32202z0;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        C7042K c7042k = new C7042K();
        c7042k.f22496c = this;
        c7042k.f22495b = false;
        this.f32191o0 = c7042k;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f32192p0 = context;
        } else {
            this.f32192p0 = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC17123a.f54735d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC9106B3.m9636b(context, resourceId));
        this.f32187E0 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f32188F0 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f32195s0 = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f32190H0 = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: f */
    public static int m11133f(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, i10 - view.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: g */
    public static int m11134g(View view, int i10, int i11, int i12, boolean z6) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z6) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z6 ? -measuredWidth : measuredWidth;
    }

    /* JADX INFO: renamed from: c */
    public final void m11135c(AbstractC10818a abstractC10818a) {
        View view = this.f32201y0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f32190H0, (ViewGroup) this, false);
            this.f32201y0 = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f32201y0);
        }
        View viewFindViewById = this.f32201y0.findViewById(R.id.action_mode_close_button);
        this.f32202z0 = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC12047l(abstractC10818a, 3));
        MenuC18814l menuC18814lMo11100c = abstractC10818a.mo11100c();
        C19356i c19356i = this.f32194r0;
        if (c19356i != null) {
            c19356i.m20459f();
            C19345e c19345e = c19356i.f61292F0;
            if (c19345e != null && c19345e.m20143b()) {
                c19345e.f59921i.dismiss();
            }
        }
        C19356i c19356i2 = new C19356i(getContext());
        this.f32194r0 = c19356i2;
        c19356i2.f61307x0 = true;
        c19356i2.f61308y0 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuC18814lMo11100c.m20121b(this.f32194r0, this.f32192p0);
        C19356i c19356i3 = this.f32194r0;
        InterfaceC18828z interfaceC18828z = c19356i3.f61303t0;
        if (interfaceC18828z == null) {
            InterfaceC18828z interfaceC18828z2 = (InterfaceC18828z) c19356i3.f61299p0.inflate(c19356i3.f61301r0, (ViewGroup) this, false);
            c19356i3.f61303t0 = interfaceC18828z2;
            interfaceC18828z2.mo11130b(c19356i3.f61298o0);
            c19356i3.mo20089h();
        }
        InterfaceC18828z interfaceC18828z3 = c19356i3.f61303t0;
        if (interfaceC18828z != interfaceC18828z3) {
            ((ActionMenuView) interfaceC18828z3).setPresenter(c19356i3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC18828z3;
        this.f32193q0 = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f32193q0, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final void m11136d() {
        if (this.f32184B0 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f32184B0 = linearLayout;
            this.f32185C0 = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f32186D0 = (TextView) this.f32184B0.findViewById(R.id.action_bar_subtitle);
            int i10 = this.f32187E0;
            if (i10 != 0) {
                this.f32185C0.setTextAppearance(getContext(), i10);
            }
            int i11 = this.f32188F0;
            if (i11 != 0) {
                this.f32186D0.setTextAppearance(getContext(), i11);
            }
        }
        this.f32185C0.setText(this.f32199w0);
        this.f32186D0.setText(this.f32200x0);
        boolean zIsEmpty = TextUtils.isEmpty(this.f32199w0);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f32200x0);
        this.f32186D0.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f32184B0.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f32184B0.getParent() == null) {
            addView(this.f32184B0);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m11137e() {
        removeAllViews();
        this.f32183A0 = null;
        this.f32193q0 = null;
        this.f32194r0 = null;
        View view = this.f32202z0;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f32196t0 != null ? this.f32191o0.f22494a : getVisibility();
    }

    public int getContentHeight() {
        return this.f32195s0;
    }

    public CharSequence getSubtitle() {
        return this.f32200x0;
    }

    public CharSequence getTitle() {
        return this.f32199w0;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            C0750c0 c0750c0 = this.f32196t0;
            if (c0750c0 != null) {
                c0750c0.m1600b();
            }
            super.setVisibility(i10);
        }
    }

    /* JADX INFO: renamed from: i */
    public final C0750c0 m11139i(int i10, long j10) {
        C0750c0 c0750c0 = this.f32196t0;
        if (c0750c0 != null) {
            c0750c0.m1600b();
        }
        C7042K c7042k = this.f32191o0;
        if (i10 != 0) {
            C0750c0 c0750c0M1573a = AbstractC0738T.m1573a(this);
            c0750c0M1573a.m1599a(0.0f);
            c0750c0M1573a.m1601c(j10);
            ((ActionBarContextView) c7042k.f22496c).f32196t0 = c0750c0M1573a;
            c7042k.f22494a = i10;
            c0750c0M1573a.m1602d(c7042k);
            return c0750c0M1573a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0750c0 c0750c0M1573a2 = AbstractC0738T.m1573a(this);
        c0750c0M1573a2.m1599a(1.0f);
        c0750c0M1573a2.m1601c(j10);
        ((ActionBarContextView) c7042k.f22496c).f32196t0 = c0750c0M1573a2;
        c7042k.f22494a = i10;
        c0750c0M1573a2.m1602d(c7042k);
        return c0750c0M1573a2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC17123a.f54732a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C19356i c19356i = this.f32194r0;
        if (c19356i != null) {
            Configuration configuration2 = c19356i.f61297Z.getResources().getConfiguration();
            int i11 = configuration2.screenWidthDp;
            int i12 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
                i10 = 5;
            } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
                i10 = 4;
            } else {
                i10 = i11 >= 360 ? 3 : 2;
            }
            c19356i.f61288B0 = i10;
            MenuC18814l menuC18814l = c19356i.f61298o0;
            if (menuC18814l != null) {
                menuC18814l.m20127p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C19356i c19356i = this.f32194r0;
        if (c19356i != null) {
            c19356i.m20459f();
            C19345e c19345e = this.f32194r0.f61292F0;
            if (c19345e == null || !c19345e.m20143b()) {
                return;
            }
            c19345e.f59921i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f32198v0 = false;
        }
        if (!this.f32198v0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f32198v0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f32198v0 = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        boolean z10 = AbstractC19353g1.f61283a;
        boolean z11 = getLayoutDirection() == 1;
        int paddingRight = z11 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f32201y0;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f32201y0.getLayoutParams();
            int i14 = z11 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = z11 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i16 = z11 ? paddingRight - i14 : paddingRight + i14;
            int iM11134g = m11134g(this.f32201y0, i16, paddingTop, paddingTop2, z11) + i16;
            paddingRight = z11 ? iM11134g - i15 : iM11134g + i15;
        }
        LinearLayout linearLayout = this.f32184B0;
        if (linearLayout != null && this.f32183A0 == null && linearLayout.getVisibility() != 8) {
            paddingRight += m11134g(this.f32184B0, paddingRight, paddingTop, paddingTop2, z11);
        }
        View view2 = this.f32183A0;
        if (view2 != null) {
            m11134g(view2, paddingRight, paddingTop, paddingTop2, z11);
        }
        int paddingLeft = z11 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f32193q0;
        if (actionMenuView != null) {
            m11134g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f32195s0;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f32201y0;
        if (view != null) {
            int iM11133f = m11133f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f32201y0.getLayoutParams();
            paddingLeft = iM11133f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f32193q0;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m11133f(this.f32193q0, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f32184B0;
        if (linearLayout != null && this.f32183A0 == null) {
            if (this.f32189G0) {
                this.f32184B0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f32184B0.getMeasuredWidth();
                boolean z6 = measuredWidth <= paddingLeft;
                if (z6) {
                    paddingLeft -= measuredWidth;
                }
                this.f32184B0.setVisibility(z6 ? 0 : 8);
            } else {
                paddingLeft = m11133f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f32183A0;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f32183A0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f32195s0 > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f32197u0 = false;
        }
        if (!this.f32197u0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f32197u0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f32197u0 = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f32195s0 = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f32183A0;
        if (view2 != null) {
            removeView(view2);
        }
        this.f32183A0 = view;
        if (view != null && (linearLayout = this.f32184B0) != null) {
            removeView(linearLayout);
            this.f32184B0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f32200x0 = charSequence;
        m11136d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f32199w0 = charSequence;
        m11136d();
        AbstractC0738T.m1585m(this, charSequence);
    }

    public void setTitleOptional(boolean z6) {
        if (z6 != this.f32189G0) {
            requestLayout();
        }
        this.f32189G0 = z6;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
