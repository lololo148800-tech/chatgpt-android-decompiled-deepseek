package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.C10825h;
import com.google.android.material.datepicker.ViewOnClickListenerC12047l;
import com.openai.chatgpt.R;
import fo.C13711h;
import io.sentry.clientreport.C15333a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p030B2.AbstractC0738T;
import p030B2.InterfaceC0771n;
import p523V9.AbstractC8194t0;
import p571X9.AbstractC9106B3;
import p588Y2.C9598B;
import p658b5.C11242m;
import p784hb.C14438g;
import p880m.AbstractC17123a;
import p935p.RunnableC18260f;
import p976r.C18816n;
import p976r.MenuC18814l;
import p999s.AbstractC19318S0;
import p999s.AbstractC19353g1;
import p999s.C19305L0;
import p999s.C19320T0;
import p999s.C19322U0;
import p999s.C19326W0;
import p999s.C19329Y;
import p999s.C19330Y0;
import p999s.C19356i;
import p999s.C19380u;
import p999s.C19382v;
import p999s.InterfaceC19324V0;
import p999s.InterfaceC19355h0;
import p999s.RunnableC19316R0;
import p999s.ViewOnClickListenerC19328X0;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC0771n {

    /* JADX INFO: renamed from: A0 */
    public int f32260A0;

    /* JADX INFO: renamed from: B0 */
    public final int f32261B0;

    /* JADX INFO: renamed from: C0 */
    public final int f32262C0;

    /* JADX INFO: renamed from: D0 */
    public int f32263D0;

    /* JADX INFO: renamed from: E0 */
    public int f32264E0;

    /* JADX INFO: renamed from: F0 */
    public int f32265F0;

    /* JADX INFO: renamed from: G0 */
    public int f32266G0;

    /* JADX INFO: renamed from: H0 */
    public C19305L0 f32267H0;

    /* JADX INFO: renamed from: I0 */
    public int f32268I0;

    /* JADX INFO: renamed from: J0 */
    public int f32269J0;

    /* JADX INFO: renamed from: K0 */
    public final int f32270K0;

    /* JADX INFO: renamed from: L0 */
    public CharSequence f32271L0;

    /* JADX INFO: renamed from: M0 */
    public CharSequence f32272M0;

    /* JADX INFO: renamed from: N0 */
    public ColorStateList f32273N0;

    /* JADX INFO: renamed from: O0 */
    public ColorStateList f32274O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f32275P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f32276Q0;

    /* JADX INFO: renamed from: R0 */
    public final ArrayList f32277R0;

    /* JADX INFO: renamed from: S0 */
    public final ArrayList f32278S0;

    /* JADX INFO: renamed from: T0 */
    public final int[] f32279T0;

    /* JADX INFO: renamed from: U0 */
    public final C13711h f32280U0;

    /* JADX INFO: renamed from: V0 */
    public ArrayList f32281V0;

    /* JADX INFO: renamed from: W0 */
    public InterfaceC19324V0 f32282W0;

    /* JADX INFO: renamed from: X0 */
    public final C15333a f32283X0;

    /* JADX INFO: renamed from: Y0 */
    public C19330Y0 f32284Y0;

    /* JADX INFO: renamed from: Z0 */
    public C19356i f32285Z0;

    /* JADX INFO: renamed from: a1 */
    public C19320T0 f32286a1;

    /* JADX INFO: renamed from: b1 */
    public boolean f32287b1;

    /* JADX INFO: renamed from: c1 */
    public OnBackInvokedCallback f32288c1;

    /* JADX INFO: renamed from: d1 */
    public OnBackInvokedDispatcher f32289d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f32290e1;

    /* JADX INFO: renamed from: f1 */
    public final RunnableC18260f f32291f1;

    /* JADX INFO: renamed from: o0 */
    public ActionMenuView f32292o0;

    /* JADX INFO: renamed from: p0 */
    public C19329Y f32293p0;

    /* JADX INFO: renamed from: q0 */
    public C19329Y f32294q0;

    /* JADX INFO: renamed from: r0 */
    public C19380u f32295r0;

    /* JADX INFO: renamed from: s0 */
    public C19382v f32296s0;

    /* JADX INFO: renamed from: t0 */
    public final Drawable f32297t0;

    /* JADX INFO: renamed from: u0 */
    public final CharSequence f32298u0;

    /* JADX INFO: renamed from: v0 */
    public C19380u f32299v0;

    /* JADX INFO: renamed from: w0 */
    public View f32300w0;

    /* JADX INFO: renamed from: x0 */
    public Context f32301x0;

    /* JADX INFO: renamed from: y0 */
    public int f32302y0;

    /* JADX INFO: renamed from: z0 */
    public int f32303z0;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C10825h(getContext());
    }

    /* JADX INFO: renamed from: h */
    public static C19322U0 m11153h() {
        C19322U0 c19322u0 = new C19322U0(-2, -2);
        c19322u0.f61209b = 0;
        c19322u0.f61208a = 8388627;
        return c19322u0;
    }

    /* JADX INFO: renamed from: i */
    public static C19322U0 m11154i(ViewGroup.LayoutParams layoutParams) {
        boolean z6 = layoutParams instanceof C19322U0;
        if (z6) {
            C19322U0 c19322u0 = (C19322U0) layoutParams;
            C19322U0 c19322u1 = new C19322U0(c19322u0);
            c19322u1.f61209b = 0;
            c19322u1.f61209b = c19322u0.f61209b;
            return c19322u1;
        }
        if (z6) {
            C19322U0 c19322u2 = new C19322U0((C19322U0) layoutParams);
            c19322u2.f61209b = 0;
            return c19322u2;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C19322U0 c19322u3 = new C19322U0(layoutParams);
            c19322u3.f61209b = 0;
            return c19322u3;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C19322U0 c19322u4 = new C19322U0(marginLayoutParams);
        c19322u4.f61209b = 0;
        ((ViewGroup.MarginLayoutParams) c19322u4).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c19322u4).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c19322u4).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c19322u4).bottomMargin = marginLayoutParams.bottomMargin;
        return c19322u4;
    }

    /* JADX INFO: renamed from: k */
    public static int m11155k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: l */
    public static int m11156l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: a */
    public final void m11157a(int i10, ArrayList arrayList) {
        boolean z6 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
        arrayList.clear();
        if (!z6) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                C19322U0 c19322u0 = (C19322U0) childAt.getLayoutParams();
                if (c19322u0.f61209b == 0 && m11172t(childAt)) {
                    int i12 = c19322u0.f61208a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = childCount - 1; i13 >= 0; i13--) {
            View childAt2 = getChildAt(i13);
            C19322U0 c19322u1 = (C19322U0) childAt2.getLayoutParams();
            if (c19322u1.f61209b == 0 && m11172t(childAt2)) {
                int i14 = c19322u1.f61208a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i14, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11158b(View view, boolean z6) {
        C19322U0 c19322u0M11154i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c19322u0M11154i = m11153h();
        } else {
            c19322u0M11154i = !checkLayoutParams(layoutParams) ? m11154i(layoutParams) : (C19322U0) layoutParams;
        }
        c19322u0M11154i.f61209b = 1;
        if (!z6 || this.f32300w0 == null) {
            addView(view, c19322u0M11154i);
        } else {
            view.setLayoutParams(c19322u0M11154i);
            this.f32278S0.add(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11159c() {
        if (this.f32299v0 == null) {
            C19380u c19380u = new C19380u(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f32299v0 = c19380u;
            c19380u.setImageDrawable(this.f32297t0);
            this.f32299v0.setContentDescription(this.f32298u0);
            C19322U0 c19322u0M11153h = m11153h();
            c19322u0M11153h.f61208a = (this.f32261B0 & 112) | 8388611;
            c19322u0M11153h.f61209b = 2;
            this.f32299v0.setLayoutParams(c19322u0M11153h);
            this.f32299v0.setOnClickListener(new ViewOnClickListenerC12047l(this, 4));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C19322U0);
    }

    /* JADX INFO: renamed from: d */
    public final void m11160d() {
        if (this.f32267H0 == null) {
            C19305L0 c19305l0 = new C19305L0();
            c19305l0.f61161a = 0;
            c19305l0.f61162b = 0;
            c19305l0.f61163c = Integer.MIN_VALUE;
            c19305l0.f61164d = Integer.MIN_VALUE;
            c19305l0.f61165e = 0;
            c19305l0.f61166f = 0;
            c19305l0.f61167g = false;
            c19305l0.f61168h = false;
            this.f32267H0 = c19305l0;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m11161e() {
        m11162f();
        ActionMenuView actionMenuView = this.f32292o0;
        if (actionMenuView.f32234D0 == null) {
            MenuC18814l menuC18814l = (MenuC18814l) actionMenuView.getMenu();
            if (this.f32286a1 == null) {
                this.f32286a1 = new C19320T0(this);
            }
            this.f32292o0.setExpandedActionViewsExclusive(true);
            menuC18814l.m20121b(this.f32286a1, this.f32301x0);
            m11173u();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11162f() {
        if (this.f32292o0 == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f32292o0 = actionMenuView;
            actionMenuView.setPopupTheme(this.f32302y0);
            this.f32292o0.setOnMenuItemClickListener(this.f32283X0);
            ActionMenuView actionMenuView2 = this.f32292o0;
            C14438g c14438g = new C14438g(this);
            actionMenuView2.getClass();
            actionMenuView2.f32239I0 = c14438g;
            C19322U0 c19322u0M11153h = m11153h();
            c19322u0M11153h.f61208a = (this.f32261B0 & 112) | 8388613;
            this.f32292o0.setLayoutParams(c19322u0M11153h);
            m11158b(this.f32292o0, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m11163g() {
        if (this.f32295r0 == null) {
            this.f32295r0 = new C19380u(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C19322U0 c19322u0M11153h = m11153h();
            c19322u0M11153h.f61208a = (this.f32261B0 & 112) | 8388611;
            this.f32295r0.setLayoutParams(c19322u0M11153h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m11153h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m11154i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C19380u c19380u = this.f32299v0;
        if (c19380u != null) {
            return c19380u.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C19380u c19380u = this.f32299v0;
        if (c19380u != null) {
            return c19380u.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C19305L0 c19305l0 = this.f32267H0;
        if (c19305l0 != null) {
            return c19305l0.f61167g ? c19305l0.f61161a : c19305l0.f61162b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f32269J0;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C19305L0 c19305l0 = this.f32267H0;
        if (c19305l0 != null) {
            return c19305l0.f61161a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C19305L0 c19305l0 = this.f32267H0;
        if (c19305l0 != null) {
            return c19305l0.f61162b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C19305L0 c19305l0 = this.f32267H0;
        if (c19305l0 != null) {
            return c19305l0.f61167g ? c19305l0.f61162b : c19305l0.f61161a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f32268I0;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC18814l menuC18814l;
        ActionMenuView actionMenuView = this.f32292o0;
        return (actionMenuView == null || (menuC18814l = actionMenuView.f32234D0) == null || !menuC18814l.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f32269J0, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f32268I0, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C19382v c19382v = this.f32296s0;
        if (c19382v != null) {
            return c19382v.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C19382v c19382v = this.f32296s0;
        if (c19382v != null) {
            return c19382v.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m11161e();
        return this.f32292o0.getMenu();
    }

    public View getNavButtonView() {
        return this.f32295r0;
    }

    public CharSequence getNavigationContentDescription() {
        C19380u c19380u = this.f32295r0;
        if (c19380u != null) {
            return c19380u.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C19380u c19380u = this.f32295r0;
        if (c19380u != null) {
            return c19380u.getDrawable();
        }
        return null;
    }

    public C19356i getOuterActionMenuPresenter() {
        return this.f32285Z0;
    }

    public Drawable getOverflowIcon() {
        m11161e();
        return this.f32292o0.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f32301x0;
    }

    public int getPopupTheme() {
        return this.f32302y0;
    }

    public CharSequence getSubtitle() {
        return this.f32272M0;
    }

    public final TextView getSubtitleTextView() {
        return this.f32294q0;
    }

    public CharSequence getTitle() {
        return this.f32271L0;
    }

    public int getTitleMarginBottom() {
        return this.f32266G0;
    }

    public int getTitleMarginEnd() {
        return this.f32264E0;
    }

    public int getTitleMarginStart() {
        return this.f32263D0;
    }

    public int getTitleMarginTop() {
        return this.f32265F0;
    }

    public final TextView getTitleTextView() {
        return this.f32293p0;
    }

    public InterfaceC19355h0 getWrapper() {
        Drawable drawable;
        if (this.f32284Y0 == null) {
            C19330Y0 c19330y0 = new C19330Y0();
            c19330y0.f61236n = 0;
            c19330y0.f61223a = this;
            c19330y0.f61230h = getTitle();
            c19330y0.f61231i = getSubtitle();
            c19330y0.f61229g = c19330y0.f61230h != null;
            c19330y0.f61228f = getNavigationIcon();
            C11242m c11242mM12599G = C11242m.m12599G(getContext(), null, AbstractC17123a.f54732a, R.attr.actionBarStyle);
            c19330y0.f61237o = c11242mM12599G.m12601B(15);
            TypedArray typedArray = (TypedArray) c11242mM12599G.f34019Z;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c19330y0.f61229g = true;
                c19330y0.f61230h = text;
                if ((c19330y0.f61224b & 8) != 0) {
                    Toolbar toolbar = c19330y0.f61223a;
                    toolbar.setTitle(text);
                    if (c19330y0.f61229g) {
                        AbstractC0738T.m1585m(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c19330y0.f61231i = text2;
                if ((c19330y0.f61224b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableM12601B = c11242mM12599G.m12601B(20);
            if (drawableM12601B != null) {
                c19330y0.f61227e = drawableM12601B;
                c19330y0.m20430c();
            }
            Drawable drawableM12601B2 = c11242mM12599G.m12601B(17);
            if (drawableM12601B2 != null) {
                c19330y0.f61226d = drawableM12601B2;
                c19330y0.m20430c();
            }
            if (c19330y0.f61228f == null && (drawable = c19330y0.f61237o) != null) {
                c19330y0.f61228f = drawable;
                int i10 = c19330y0.f61224b & 4;
                Toolbar toolbar2 = c19330y0.f61223a;
                if (i10 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            c19330y0.m20428a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c19330y0.f61225c;
                if (view != null && (c19330y0.f61224b & 16) != 0) {
                    removeView(view);
                }
                c19330y0.f61225c = viewInflate;
                if (viewInflate != null && (c19330y0.f61224b & 16) != 0) {
                    addView(viewInflate);
                }
                c19330y0.m20428a(c19330y0.f61224b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                m11160d();
                this.f32267H0.m20391a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f32303z0 = resourceId2;
                C19329Y c19329y = this.f32293p0;
                if (c19329y != null) {
                    c19329y.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f32260A0 = resourceId3;
                C19329Y c19329y2 = this.f32294q0;
                if (c19329y2 != null) {
                    c19329y2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c11242mM12599G.m12606H();
            if (R.string.abc_action_bar_up_description != c19330y0.f61236n) {
                c19330y0.f61236n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i11 = c19330y0.f61236n;
                    c19330y0.f61232j = i11 != 0 ? getContext().getString(i11) : null;
                    c19330y0.m20429b();
                }
            }
            c19330y0.f61232j = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC19328X0(c19330y0));
            this.f32284Y0 = c19330y0;
        }
        return this.f32284Y0;
    }

    /* JADX INFO: renamed from: j */
    public final int m11164j(View view, int i10) {
        C19322U0 c19322u0 = (C19322U0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = c19322u0.f61208a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.f32270K0 & 112;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c19322u0).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) c19322u0).topMargin;
        if (iMax < i13) {
            iMax = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) c19322u0).bottomMargin;
            if (i14 < i15) {
                iMax = Math.max(0, iMax - (i15 - i14));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: m */
    public void mo11165m(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    /* JADX INFO: renamed from: n */
    public final void m11166n() {
        Iterator it = this.f32281V0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f32280U0.f43260o0).iterator();
        while (it2.hasNext()) {
            ((C9598B) it2.next()).f28890a.m11800j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f32281V0 = currentMenuItems2;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m11167o(View view) {
        return view.getParent() == this || this.f32278S0.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m11173u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f32291f1);
        m11173u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f32276Q0 = false;
        }
        if (!this.f32276Q0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f32276Q0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f32276Q0 = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0261  */
    /* JADX WARN: Code duplicated, block: B:101:0x0283  */
    /* JADX WARN: Code duplicated, block: B:103:0x0286  */
    /* JADX WARN: Code duplicated, block: B:106:0x0298 A[LOOP:0: B:105:0x0296->B:106:0x0298, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02b5 A[LOOP:1: B:108:0x02b3->B:109:0x02b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x02d3 A[LOOP:2: B:111:0x02d1->B:112:0x02d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x0314 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0316  */
    /* JADX WARN: Code duplicated, block: B:118:0x031a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0321 A[LOOP:3: B:120:0x031f->B:121:0x0321, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0130  */
    /* JADX WARN: Code duplicated, block: B:52:0x0134  */
    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x0147  */
    /* JADX WARN: Code duplicated, block: B:58:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x016a  */
    /* JADX WARN: Code duplicated, block: B:67:0x016e  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x017f  */
    /* JADX WARN: Code duplicated, block: B:72:0x018a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0196  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x0216  */
    /* JADX WARN: Code duplicated, block: B:89:0x0219  */
    /* JADX WARN: Code duplicated, block: B:91:0x0221 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0223  */
    /* JADX WARN: Code duplicated, block: B:94:0x0227  */
    /* JADX WARN: Code duplicated, block: B:97:0x023b  */
    /* JADX WARN: Code duplicated, block: B:98:0x025e  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int iM11168p;
        int iM11169q;
        int iMax;
        int iMin;
        boolean zM11172t;
        boolean zM11172t2;
        int measuredHeight;
        C19329Y c19329y;
        C19329Y c19329y2;
        C19322U0 c19322u0;
        C19322U0 c19322u1;
        boolean z10;
        int i14;
        int i15;
        int paddingTop;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iMax2;
        int i22;
        int i23;
        int i24;
        int i25;
        ArrayList arrayList;
        int size;
        int iM11168p2;
        int i26;
        int i27;
        int size2;
        int i28;
        int size3;
        int i29;
        int i30;
        int i31;
        int measuredWidth;
        int i32;
        int i33;
        int i34;
        int size4;
        boolean z11 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i35 = width - paddingRight;
        int[] iArr = this.f32279T0;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i13 - i11) : 0;
        if (m11172t(this.f32295r0)) {
            if (z11) {
                iM11169q = m11169q(this.f32295r0, i35, iMin2, iArr);
                iM11168p = paddingLeft;
            } else {
                iM11168p = m11168p(this.f32295r0, paddingLeft, iMin2, iArr);
            }
            if (m11172t(this.f32299v0)) {
                if (z11) {
                    iM11169q = m11169q(this.f32299v0, iM11169q, iMin2, iArr);
                } else {
                    iM11168p = m11168p(this.f32299v0, iM11168p, iMin2, iArr);
                }
            }
            if (m11172t(this.f32292o0)) {
                if (z11) {
                    iM11168p = m11168p(this.f32292o0, iM11168p, iMin2, iArr);
                } else {
                    iM11169q = m11169q(this.f32292o0, iM11169q, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iM11168p);
            iArr[1] = Math.max(0, currentContentInsetRight - (i35 - iM11169q));
            iMax = Math.max(iM11168p, currentContentInsetLeft);
            iMin = Math.min(iM11169q, i35 - currentContentInsetRight);
            if (m11172t(this.f32300w0)) {
                if (z11) {
                    iMin = m11169q(this.f32300w0, iMin, iMin2, iArr);
                } else {
                    iMax = m11168p(this.f32300w0, iMax, iMin2, iArr);
                }
            }
            if (m11172t(this.f32296s0)) {
                if (z11) {
                    iMin = m11169q(this.f32296s0, iMin, iMin2, iArr);
                } else {
                    iMax = m11168p(this.f32296s0, iMax, iMin2, iArr);
                }
            }
            zM11172t = m11172t(this.f32293p0);
            zM11172t2 = m11172t(this.f32294q0);
            if (zM11172t) {
                C19322U0 c19322u2 = (C19322U0) this.f32293p0.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) c19322u2).bottomMargin + this.f32293p0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c19322u2).topMargin;
            } else {
                measuredHeight = 0;
            }
            if (zM11172t2) {
                C19322U0 c19322u3 = (C19322U0) this.f32294q0.getLayoutParams();
                measuredHeight += this.f32294q0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c19322u3).topMargin + ((ViewGroup.MarginLayoutParams) c19322u3).bottomMargin;
            }
            if (!zM11172t || zM11172t2) {
                if (zM11172t) {
                    c19329y = this.f32293p0;
                } else {
                    c19329y = this.f32294q0;
                }
                if (zM11172t2) {
                    c19329y2 = this.f32294q0;
                } else {
                    c19329y2 = this.f32293p0;
                }
                c19322u0 = (C19322U0) c19329y.getLayoutParams();
                c19322u1 = (C19322U0) c19329y2.getLayoutParams();
                z10 = (!zM11172t && this.f32293p0.getMeasuredWidth() > 0) || (zM11172t2 && this.f32294q0.getMeasuredWidth() > 0);
                i14 = this.f32270K0 & 112;
                i15 = iMin2;
                if (i14 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c19322u0).topMargin + this.f32265F0;
                } else if (i14 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i22 = ((ViewGroup.MarginLayoutParams) c19322u0).topMargin + this.f32265F0;
                    if (iMax2 < i22) {
                        iMax2 = i22;
                    } else {
                        i23 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i24 = ((ViewGroup.MarginLayoutParams) c19322u0).bottomMargin;
                        i25 = this.f32266G0;
                        if (i23 < i24 + i25) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c19322u1).bottomMargin + i25) - i23));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c19322u1).bottomMargin) - this.f32266G0) - measuredHeight;
                }
                if (z11) {
                    if (z10) {
                        i19 = this.f32263D0;
                    } else {
                        i19 = 0;
                    }
                    int i36 = i19 - iArr[1];
                    iMin -= Math.max(0, i36);
                    iArr[1] = Math.max(0, -i36);
                    if (zM11172t) {
                        C19322U0 c19322u4 = (C19322U0) this.f32293p0.getLayoutParams();
                        int measuredWidth2 = iMin - this.f32293p0.getMeasuredWidth();
                        int measuredHeight2 = this.f32293p0.getMeasuredHeight() + paddingTop;
                        this.f32293p0.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i20 = measuredWidth2 - this.f32264E0;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c19322u4).bottomMargin;
                    } else {
                        i20 = iMin;
                    }
                    if (zM11172t2) {
                        int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C19322U0) this.f32294q0.getLayoutParams())).topMargin;
                        this.f32294q0.layout(iMin - this.f32294q0.getMeasuredWidth(), i37, iMin, this.f32294q0.getMeasuredHeight() + i37);
                        i21 = iMin - this.f32264E0;
                    } else {
                        i21 = iMin;
                    }
                    if (z10) {
                        iMin = Math.min(i20, i21);
                    }
                    iMax = iMax;
                } else {
                    if (z10) {
                        i16 = this.f32263D0;
                    } else {
                        i16 = 0;
                    }
                    int i38 = i16 - iArr[0];
                    iMax = Math.max(0, i38) + iMax;
                    iArr[0] = Math.max(0, -i38);
                    if (zM11172t) {
                        C19322U0 c19322u5 = (C19322U0) this.f32293p0.getLayoutParams();
                        int measuredWidth3 = this.f32293p0.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f32293p0.getMeasuredHeight() + paddingTop;
                        this.f32293p0.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i17 = measuredWidth3 + this.f32264E0;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c19322u5).bottomMargin;
                    } else {
                        i17 = iMax;
                    }
                    if (zM11172t2) {
                        int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C19322U0) this.f32294q0.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f32294q0.getMeasuredWidth() + iMax;
                        this.f32294q0.layout(iMax, i39, measuredWidth4, this.f32294q0.getMeasuredHeight() + i39);
                        i18 = measuredWidth4 + this.f32264E0;
                    } else {
                        i18 = iMax;
                    }
                    if (z10) {
                        iMax = Math.max(i17, i18);
                    }
                }
            } else {
                paddingLeft = paddingLeft;
                i15 = iMin2;
            }
            arrayList = this.f32277R0;
            m11157a(3, arrayList);
            size = arrayList.size();
            iM11168p2 = iMax;
            for (i26 = 0; i26 < size; i26++) {
                iM11168p2 = m11168p((View) arrayList.get(i26), iM11168p2, i15, iArr);
            }
            i27 = i15;
            m11157a(5, arrayList);
            size2 = arrayList.size();
            for (i28 = 0; i28 < size2; i28++) {
                iMin = m11169q((View) arrayList.get(i28), iMin, i27, iArr);
            }
            m11157a(1, arrayList);
            int i40 = iArr[0];
            int i41 = iArr[1];
            size3 = arrayList.size();
            i29 = i41;
            i30 = i40;
            i31 = 0;
            measuredWidth = 0;
            while (i31 < size3) {
                View view = (View) arrayList.get(i31);
                C19322U0 c19322u6 = (C19322U0) view.getLayoutParams();
                int i42 = ((ViewGroup.MarginLayoutParams) c19322u6).leftMargin - i30;
                int i43 = ((ViewGroup.MarginLayoutParams) c19322u6).rightMargin - i29;
                int iMax3 = Math.max(0, i42);
                int iMax4 = Math.max(0, i43);
                int iMax5 = Math.max(0, -i42);
                int iMax6 = Math.max(0, -i43);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i31++;
                i29 = iMax6;
                i30 = iMax5;
            }
            i33 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i34 = measuredWidth + i33;
            if (i33 >= iM11168p2) {
                if (i34 > iMin) {
                    iM11168p2 = i33 - (i34 - iMin);
                } else {
                    iM11168p2 = i33;
                }
            }
            size4 = arrayList.size();
            for (i32 = 0; i32 < size4; i32++) {
                iM11168p2 = m11168p((View) arrayList.get(i32), iM11168p2, i27, iArr);
            }
            arrayList.clear();
        }
        iM11168p = paddingLeft;
        iM11169q = i35;
        if (m11172t(this.f32299v0)) {
            if (z11) {
                iM11169q = m11169q(this.f32299v0, iM11169q, iMin2, iArr);
            } else {
                iM11168p = m11168p(this.f32299v0, iM11168p, iMin2, iArr);
            }
        }
        if (m11172t(this.f32292o0)) {
            if (z11) {
                iM11168p = m11168p(this.f32292o0, iM11168p, iMin2, iArr);
            } else {
                iM11169q = m11169q(this.f32292o0, iM11169q, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM11168p);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i35 - iM11169q));
        iMax = Math.max(iM11168p, currentContentInsetLeft2);
        iMin = Math.min(iM11169q, i35 - currentContentInsetRight2);
        if (m11172t(this.f32300w0)) {
            if (z11) {
                iMin = m11169q(this.f32300w0, iMin, iMin2, iArr);
            } else {
                iMax = m11168p(this.f32300w0, iMax, iMin2, iArr);
            }
        }
        if (m11172t(this.f32296s0)) {
            if (z11) {
                iMin = m11169q(this.f32296s0, iMin, iMin2, iArr);
            } else {
                iMax = m11168p(this.f32296s0, iMax, iMin2, iArr);
            }
        }
        zM11172t = m11172t(this.f32293p0);
        zM11172t2 = m11172t(this.f32294q0);
        if (zM11172t) {
            C19322U0 c19322u7 = (C19322U0) this.f32293p0.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) c19322u7).bottomMargin + this.f32293p0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c19322u7).topMargin;
        } else {
            measuredHeight = 0;
        }
        if (zM11172t2) {
            C19322U0 c19322u8 = (C19322U0) this.f32294q0.getLayoutParams();
            measuredHeight += this.f32294q0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c19322u8).topMargin + ((ViewGroup.MarginLayoutParams) c19322u8).bottomMargin;
        }
        if (zM11172t) {
            if (zM11172t) {
                c19329y = this.f32293p0;
            } else {
                c19329y = this.f32294q0;
            }
            if (zM11172t2) {
                c19329y2 = this.f32294q0;
            } else {
                c19329y2 = this.f32293p0;
            }
            c19322u0 = (C19322U0) c19329y.getLayoutParams();
            c19322u1 = (C19322U0) c19329y2.getLayoutParams();
            if (zM11172t) {
            }
            i14 = this.f32270K0 & 112;
            i15 = iMin2;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c19322u0).topMargin + this.f32265F0;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i22 = ((ViewGroup.MarginLayoutParams) c19322u0).topMargin + this.f32265F0;
                if (iMax2 < i22) {
                    iMax2 = i22;
                } else {
                    i23 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i24 = ((ViewGroup.MarginLayoutParams) c19322u0).bottomMargin;
                    i25 = this.f32266G0;
                    if (i23 < i24 + i25) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c19322u1).bottomMargin + i25) - i23));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c19322u1).bottomMargin) - this.f32266G0) - measuredHeight;
            }
            if (z11) {
                if (z10) {
                    i19 = this.f32263D0;
                } else {
                    i19 = 0;
                }
                int i310 = i19 - iArr[1];
                iMin -= Math.max(0, i310);
                iArr[1] = Math.max(0, -i310);
                if (zM11172t) {
                    C19322U0 c19322u9 = (C19322U0) this.f32293p0.getLayoutParams();
                    int measuredWidth5 = iMin - this.f32293p0.getMeasuredWidth();
                    int measuredHeight4 = this.f32293p0.getMeasuredHeight() + paddingTop;
                    this.f32293p0.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i20 = measuredWidth5 - this.f32264E0;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) c19322u9).bottomMargin;
                } else {
                    i20 = iMin;
                }
                if (zM11172t2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C19322U0) this.f32294q0.getLayoutParams())).topMargin;
                    this.f32294q0.layout(iMin - this.f32294q0.getMeasuredWidth(), i311, iMin, this.f32294q0.getMeasuredHeight() + i311);
                    i21 = iMin - this.f32264E0;
                } else {
                    i21 = iMin;
                }
                if (z10) {
                    iMin = Math.min(i20, i21);
                }
                iMax = iMax;
            } else {
                if (z10) {
                    i16 = this.f32263D0;
                } else {
                    i16 = 0;
                }
                int i312 = i16 - iArr[0];
                iMax = Math.max(0, i312) + iMax;
                iArr[0] = Math.max(0, -i312);
                if (zM11172t) {
                    C19322U0 c19322u10 = (C19322U0) this.f32293p0.getLayoutParams();
                    int measuredWidth6 = this.f32293p0.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f32293p0.getMeasuredHeight() + paddingTop;
                    this.f32293p0.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i17 = measuredWidth6 + this.f32264E0;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) c19322u10).bottomMargin;
                } else {
                    i17 = iMax;
                }
                if (zM11172t2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C19322U0) this.f32294q0.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f32294q0.getMeasuredWidth() + iMax;
                    this.f32294q0.layout(iMax, i313, measuredWidth7, this.f32294q0.getMeasuredHeight() + i313);
                    i18 = measuredWidth7 + this.f32264E0;
                } else {
                    i18 = iMax;
                }
                if (z10) {
                    iMax = Math.max(i17, i18);
                }
            }
        } else {
            if (zM11172t) {
                c19329y = this.f32293p0;
            } else {
                c19329y = this.f32294q0;
            }
            if (zM11172t2) {
                c19329y2 = this.f32294q0;
            } else {
                c19329y2 = this.f32293p0;
            }
            c19322u0 = (C19322U0) c19329y.getLayoutParams();
            c19322u1 = (C19322U0) c19329y2.getLayoutParams();
            if (zM11172t) {
            }
            i14 = this.f32270K0 & 112;
            i15 = iMin2;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c19322u0).topMargin + this.f32265F0;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i22 = ((ViewGroup.MarginLayoutParams) c19322u0).topMargin + this.f32265F0;
                if (iMax2 < i22) {
                    iMax2 = i22;
                } else {
                    i23 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i24 = ((ViewGroup.MarginLayoutParams) c19322u0).bottomMargin;
                    i25 = this.f32266G0;
                    if (i23 < i24 + i25) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c19322u1).bottomMargin + i25) - i23));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c19322u1).bottomMargin) - this.f32266G0) - measuredHeight;
            }
            if (z11) {
                if (z10) {
                    i19 = this.f32263D0;
                } else {
                    i19 = 0;
                }
                int i314 = i19 - iArr[1];
                iMin -= Math.max(0, i314);
                iArr[1] = Math.max(0, -i314);
                if (zM11172t) {
                    C19322U0 c19322u11 = (C19322U0) this.f32293p0.getLayoutParams();
                    int measuredWidth8 = iMin - this.f32293p0.getMeasuredWidth();
                    int measuredHeight6 = this.f32293p0.getMeasuredHeight() + paddingTop;
                    this.f32293p0.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i20 = measuredWidth8 - this.f32264E0;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) c19322u11).bottomMargin;
                } else {
                    i20 = iMin;
                }
                if (zM11172t2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C19322U0) this.f32294q0.getLayoutParams())).topMargin;
                    this.f32294q0.layout(iMin - this.f32294q0.getMeasuredWidth(), i315, iMin, this.f32294q0.getMeasuredHeight() + i315);
                    i21 = iMin - this.f32264E0;
                } else {
                    i21 = iMin;
                }
                if (z10) {
                    iMin = Math.min(i20, i21);
                }
                iMax = iMax;
            } else {
                if (z10) {
                    i16 = this.f32263D0;
                } else {
                    i16 = 0;
                }
                int i316 = i16 - iArr[0];
                iMax = Math.max(0, i316) + iMax;
                iArr[0] = Math.max(0, -i316);
                if (zM11172t) {
                    C19322U0 c19322u12 = (C19322U0) this.f32293p0.getLayoutParams();
                    int measuredWidth9 = this.f32293p0.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f32293p0.getMeasuredHeight() + paddingTop;
                    this.f32293p0.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i17 = measuredWidth9 + this.f32264E0;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) c19322u12).bottomMargin;
                } else {
                    i17 = iMax;
                }
                if (zM11172t2) {
                    int i317 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C19322U0) this.f32294q0.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f32294q0.getMeasuredWidth() + iMax;
                    this.f32294q0.layout(iMax, i317, measuredWidth10, this.f32294q0.getMeasuredHeight() + i317);
                    i18 = measuredWidth10 + this.f32264E0;
                } else {
                    i18 = iMax;
                }
                if (z10) {
                    iMax = Math.max(i17, i18);
                }
            }
        }
        arrayList = this.f32277R0;
        m11157a(3, arrayList);
        size = arrayList.size();
        iM11168p2 = iMax;
        while (i26 < size) {
            iM11168p2 = m11168p((View) arrayList.get(i26), iM11168p2, i15, iArr);
        }
        i27 = i15;
        m11157a(5, arrayList);
        size2 = arrayList.size();
        while (i28 < size2) {
            iMin = m11169q((View) arrayList.get(i28), iMin, i27, iArr);
        }
        m11157a(1, arrayList);
        int i44 = iArr[0];
        int i45 = iArr[1];
        size3 = arrayList.size();
        i29 = i45;
        i30 = i44;
        i31 = 0;
        measuredWidth = 0;
        while (i31 < size3) {
            View view2 = (View) arrayList.get(i31);
            C19322U0 c19322u13 = (C19322U0) view2.getLayoutParams();
            int i46 = ((ViewGroup.MarginLayoutParams) c19322u13).leftMargin - i30;
            int i47 = ((ViewGroup.MarginLayoutParams) c19322u13).rightMargin - i29;
            int iMax7 = Math.max(0, i46);
            int iMax8 = Math.max(0, i47);
            int iMax9 = Math.max(0, -i46);
            int iMax10 = Math.max(0, -i47);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i31++;
            i29 = iMax10;
            i30 = iMax9;
        }
        i33 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i34 = measuredWidth + i33;
        if (i33 >= iM11168p2) {
            if (i34 > iMin) {
                iM11168p2 = i33 - (i34 - iMin);
            } else {
                iM11168p2 = i33;
            }
        }
        size4 = arrayList.size();
        while (i32 < size4) {
            iM11168p2 = m11168p((View) arrayList.get(i32), iM11168p2, i27, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        char c9;
        char c10;
        int iM11155k;
        int iMax;
        int iCombineMeasuredStates;
        int iM11155k2;
        int iM11156l;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z6 = AbstractC19353g1.f61283a;
        int i12 = 0;
        if (getLayoutDirection() == 1) {
            c10 = 1;
            c9 = 0;
        } else {
            c9 = 1;
            c10 = 0;
        }
        if (m11172t(this.f32295r0)) {
            m11171s(this.f32295r0, i10, 0, i11, this.f32262C0);
            iM11155k = m11155k(this.f32295r0) + this.f32295r0.getMeasuredWidth();
            iMax = Math.max(0, m11156l(this.f32295r0) + this.f32295r0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f32295r0.getMeasuredState());
        } else {
            iM11155k = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m11172t(this.f32299v0)) {
            m11171s(this.f32299v0, i10, 0, i11, this.f32262C0);
            iM11155k = m11155k(this.f32299v0) + this.f32299v0.getMeasuredWidth();
            iMax = Math.max(iMax, m11156l(this.f32299v0) + this.f32299v0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f32299v0.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM11155k);
        int iMax4 = Math.max(0, currentContentInsetStart - iM11155k);
        int[] iArr = this.f32279T0;
        iArr[c10] = iMax4;
        if (m11172t(this.f32292o0)) {
            m11171s(this.f32292o0, i10, iMax3, i11, this.f32262C0);
            iM11155k2 = m11155k(this.f32292o0) + this.f32292o0.getMeasuredWidth();
            iMax = Math.max(iMax, m11156l(this.f32292o0) + this.f32292o0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f32292o0.getMeasuredState());
        } else {
            iM11155k2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM11155k2);
        iArr[c9] = Math.max(0, currentContentInsetEnd - iM11155k2);
        if (m11172t(this.f32300w0)) {
            iMax5 += m11170r(this.f32300w0, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, m11156l(this.f32300w0) + this.f32300w0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f32300w0.getMeasuredState());
        }
        if (m11172t(this.f32296s0)) {
            iMax5 += m11170r(this.f32296s0, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, m11156l(this.f32296s0) + this.f32296s0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f32296s0.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((C19322U0) childAt.getLayoutParams()).f61209b == 0 && m11172t(childAt)) {
                iMax5 += m11170r(childAt, i10, iMax5, i11, 0, iArr);
                iMax = Math.max(iMax, m11156l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i14 = this.f32265F0 + this.f32266G0;
        int i15 = this.f32263D0 + this.f32264E0;
        if (m11172t(this.f32293p0)) {
            m11170r(this.f32293p0, i10, iMax5 + i15, i11, i14, iArr);
            int iM11155k3 = m11155k(this.f32293p0) + this.f32293p0.getMeasuredWidth();
            iM11156l = m11156l(this.f32293p0) + this.f32293p0.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f32293p0.getMeasuredState());
            iMax2 = iM11155k3;
        } else {
            iM11156l = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m11172t(this.f32294q0)) {
            iMax2 = Math.max(iMax2, m11170r(this.f32294q0, i10, iMax5 + i15, i11, iM11156l + i14, iArr));
            iM11156l = m11156l(this.f32294q0) + this.f32294q0.getMeasuredHeight() + iM11156l;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f32294q0.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iM11156l);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16);
        if (!this.f32287b1) {
            i12 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i16 = 0; i16 < childCount2; i16++) {
            View childAt2 = getChildAt(i16);
            if (m11172t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i12 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i12);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C19326W0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C19326W0 c19326w0 = (C19326W0) parcelable;
        super.onRestoreInstanceState(c19326w0.f16000Y);
        ActionMenuView actionMenuView = this.f32292o0;
        MenuC18814l menuC18814l = actionMenuView != null ? actionMenuView.f32234D0 : null;
        int i10 = c19326w0.f61211o0;
        if (i10 != 0 && this.f32286a1 != null && menuC18814l != null && (menuItemFindItem = menuC18814l.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c19326w0.f61212p0) {
            RunnableC18260f runnableC18260f = this.f32291f1;
            removeCallbacks(runnableC18260f);
            post(runnableC18260f);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        m11160d();
        C19305L0 c19305l0 = this.f32267H0;
        boolean z6 = i10 == 1;
        if (z6 == c19305l0.f61167g) {
            return;
        }
        c19305l0.f61167g = z6;
        if (!c19305l0.f61168h) {
            c19305l0.f61161a = c19305l0.f61165e;
            c19305l0.f61162b = c19305l0.f61166f;
            return;
        }
        if (z6) {
            int i11 = c19305l0.f61164d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = c19305l0.f61165e;
            }
            c19305l0.f61161a = i11;
            int i12 = c19305l0.f61163c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = c19305l0.f61166f;
            }
            c19305l0.f61162b = i12;
            return;
        }
        int i13 = c19305l0.f61163c;
        if (i13 == Integer.MIN_VALUE) {
            i13 = c19305l0.f61165e;
        }
        c19305l0.f61161a = i13;
        int i14 = c19305l0.f61164d;
        if (i14 == Integer.MIN_VALUE) {
            i14 = c19305l0.f61166f;
        }
        c19305l0.f61162b = i14;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C19356i c19356i;
        C18816n c18816n;
        C19326W0 c19326w0 = new C19326W0(super.onSaveInstanceState());
        C19320T0 c19320t0 = this.f32286a1;
        if (c19320t0 != null && (c18816n = c19320t0.f61193Z) != null) {
            c19326w0.f61211o0 = c18816n.f59875a;
        }
        ActionMenuView actionMenuView = this.f32292o0;
        c19326w0.f61212p0 = (actionMenuView == null || (c19356i = actionMenuView.f32238H0) == null || !c19356i.m20460i()) ? false : true;
        return c19326w0;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f32275P0 = false;
        }
        if (!this.f32275P0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f32275P0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f32275P0 = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final int m11168p(View view, int i10, int i11, int[] iArr) {
        C19322U0 c19322u0 = (C19322U0) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) c19322u0).leftMargin - iArr[0];
        int iMax = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int iM11164j = m11164j(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM11164j, iMax + measuredWidth, view.getMeasuredHeight() + iM11164j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c19322u0).rightMargin + iMax;
    }

    /* JADX INFO: renamed from: q */
    public final int m11169q(View view, int i10, int i11, int[] iArr) {
        C19322U0 c19322u0 = (C19322U0) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) c19322u0).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iM11164j = m11164j(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM11164j, iMax, view.getMeasuredHeight() + iM11164j);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c19322u0).leftMargin);
    }

    /* JADX INFO: renamed from: r */
    public final int m11170r(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: s */
    public final void m11171s(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z6) {
        if (this.f32290e1 != z6) {
            this.f32290e1 = z6;
            m11173u();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(AbstractC9106B3.m9636b(getContext(), i10));
    }

    public void setCollapsible(boolean z6) {
        this.f32287b1 = z6;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f32269J0) {
            this.f32269J0 = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f32268I0) {
            this.f32268I0 = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(AbstractC9106B3.m9636b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(AbstractC9106B3.m9636b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m11163g();
        this.f32295r0.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC19324V0 interfaceC19324V0) {
        this.f32282W0 = interfaceC19324V0;
    }

    public void setOverflowIcon(Drawable drawable) {
        m11161e();
        this.f32292o0.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f32302y0 != i10) {
            this.f32302y0 = i10;
            if (i10 == 0) {
                this.f32301x0 = getContext();
            } else {
                this.f32301x0 = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f32266G0 = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f32264E0 = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f32263D0 = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f32265F0 = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    /* JADX INFO: renamed from: t */
    public final boolean m11172t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public final void m11173u() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM20406a = AbstractC19318S0.m20406a(this);
            C19320T0 c19320t0 = this.f32286a1;
            boolean z6 = (c19320t0 == null || c19320t0.f61193Z == null || onBackInvokedDispatcherM20406a == null || !isAttachedToWindow() || !this.f32290e1) ? false : true;
            if (z6 && this.f32289d1 == null) {
                if (this.f32288c1 == null) {
                    this.f32288c1 = AbstractC19318S0.m20407b(new RunnableC19316R0(this, 0));
                }
                AbstractC19318S0.m20408c(onBackInvokedDispatcherM20406a, this.f32288c1);
                this.f32289d1 = onBackInvokedDispatcherM20406a;
                return;
            }
            if (z6 || (onBackInvokedDispatcher = this.f32289d1) == null) {
                return;
            }
            AbstractC19318S0.m20409d(onBackInvokedDispatcher, this.f32288c1);
            this.f32289d1 = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f32270K0 = 8388627;
        this.f32277R0 = new ArrayList();
        this.f32278S0 = new ArrayList();
        this.f32279T0 = new int[2];
        this.f32280U0 = new C13711h(new RunnableC19316R0(this, 1));
        this.f32281V0 = new ArrayList();
        this.f32283X0 = new C15333a(this);
        this.f32291f1 = new RunnableC18260f(this, 6);
        Context context2 = getContext();
        int[] iArr = AbstractC17123a.f54754w;
        C11242m c11242mM12599G = C11242m.m12599G(context2, attributeSet, iArr, R.attr.toolbarStyle);
        AbstractC0738T.m1583k(this, context, iArr, attributeSet, (TypedArray) c11242mM12599G.f34019Z, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) c11242mM12599G.f34019Z;
        this.f32303z0 = typedArray.getResourceId(28, 0);
        this.f32260A0 = typedArray.getResourceId(19, 0);
        this.f32270K0 = typedArray.getInteger(0, 8388627);
        this.f32261B0 = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f32266G0 = dimensionPixelOffset;
        this.f32265F0 = dimensionPixelOffset;
        this.f32264E0 = dimensionPixelOffset;
        this.f32263D0 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f32263D0 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f32264E0 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f32265F0 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f32266G0 = dimensionPixelOffset5;
        }
        this.f32262C0 = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m11160d();
        C19305L0 c19305l0 = this.f32267H0;
        c19305l0.f61168h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c19305l0.f61165e = dimensionPixelSize;
            c19305l0.f61161a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c19305l0.f61166f = dimensionPixelSize2;
            c19305l0.f61162b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c19305l0.m20391a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f32268I0 = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f32269J0 = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f32297t0 = c11242mM12599G.m12601B(4);
        this.f32298u0 = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f32301x0 = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM12601B = c11242mM12599G.m12601B(16);
        if (drawableM12601B != null) {
            setNavigationIcon(drawableM12601B);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM12601B2 = c11242mM12599G.m12601B(11);
        if (drawableM12601B2 != null) {
            setLogo(drawableM12601B2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c11242mM12599G.m12600A(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c11242mM12599G.m12600A(20));
        }
        if (typedArray.hasValue(14)) {
            mo11165m(typedArray.getResourceId(14, 0));
        }
        c11242mM12599G.m12606H();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C19322U0 c19322u0 = new C19322U0(context, attributeSet);
        c19322u0.f61208a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC17123a.f54733b);
        c19322u0.f61208a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c19322u0.f61209b = 0;
        return c19322u0;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m11159c();
        }
        C19380u c19380u = this.f32299v0;
        if (c19380u != null) {
            c19380u.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m11159c();
            this.f32299v0.setImageDrawable(drawable);
        } else {
            C19380u c19380u = this.f32299v0;
            if (c19380u != null) {
                c19380u.setImageDrawable(this.f32297t0);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f32296s0 == null) {
                this.f32296s0 = new C19382v(getContext(), null, 0);
            }
            if (!m11167o(this.f32296s0)) {
                m11158b(this.f32296s0, true);
            }
        } else {
            C19382v c19382v = this.f32296s0;
            if (c19382v != null && m11167o(c19382v)) {
                removeView(this.f32296s0);
                this.f32278S0.remove(this.f32296s0);
            }
        }
        C19382v c19382v2 = this.f32296s0;
        if (c19382v2 != null) {
            c19382v2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f32296s0 == null) {
            this.f32296s0 = new C19382v(getContext(), null, 0);
        }
        C19382v c19382v = this.f32296s0;
        if (c19382v != null) {
            c19382v.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m11163g();
        }
        C19380u c19380u = this.f32295r0;
        if (c19380u != null) {
            c19380u.setContentDescription(charSequence);
            AbstractC8194t0.m8797c(this.f32295r0, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m11163g();
            if (!m11167o(this.f32295r0)) {
                m11158b(this.f32295r0, true);
            }
        } else {
            C19380u c19380u = this.f32295r0;
            if (c19380u != null && m11167o(c19380u)) {
                removeView(this.f32295r0);
                this.f32278S0.remove(this.f32295r0);
            }
        }
        C19380u c19380u2 = this.f32295r0;
        if (c19380u2 != null) {
            c19380u2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C19329Y c19329y = this.f32294q0;
            if (c19329y != null && m11167o(c19329y)) {
                removeView(this.f32294q0);
                this.f32278S0.remove(this.f32294q0);
            }
        } else {
            if (this.f32294q0 == null) {
                Context context = getContext();
                C19329Y c19329y2 = new C19329Y(context, null);
                this.f32294q0 = c19329y2;
                c19329y2.setSingleLine();
                this.f32294q0.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f32260A0;
                if (i10 != 0) {
                    this.f32294q0.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f32274O0;
                if (colorStateList != null) {
                    this.f32294q0.setTextColor(colorStateList);
                }
            }
            if (!m11167o(this.f32294q0)) {
                m11158b(this.f32294q0, true);
            }
        }
        C19329Y c19329y3 = this.f32294q0;
        if (c19329y3 != null) {
            c19329y3.setText(charSequence);
        }
        this.f32272M0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f32274O0 = colorStateList;
        C19329Y c19329y = this.f32294q0;
        if (c19329y != null) {
            c19329y.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C19329Y c19329y = this.f32293p0;
            if (c19329y != null && m11167o(c19329y)) {
                removeView(this.f32293p0);
                this.f32278S0.remove(this.f32293p0);
            }
        } else {
            if (this.f32293p0 == null) {
                Context context = getContext();
                C19329Y c19329y2 = new C19329Y(context, null);
                this.f32293p0 = c19329y2;
                c19329y2.setSingleLine();
                this.f32293p0.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f32303z0;
                if (i10 != 0) {
                    this.f32293p0.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f32273N0;
                if (colorStateList != null) {
                    this.f32293p0.setTextColor(colorStateList);
                }
            }
            if (!m11167o(this.f32293p0)) {
                m11158b(this.f32293p0, true);
            }
        }
        C19329Y c19329y3 = this.f32293p0;
        if (c19329y3 != null) {
            c19329y3.setText(charSequence);
        }
        this.f32271L0 = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f32273N0 = colorStateList;
        C19329Y c19329y = this.f32293p0;
        if (c19329y != null) {
            c19329y.setTextColor(colorStateList);
        }
    }
}
