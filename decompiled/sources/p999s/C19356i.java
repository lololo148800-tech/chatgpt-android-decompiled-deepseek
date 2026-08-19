package p999s;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import p604Yk.C10077b;
import p976r.AbstractC18822t;
import p976r.ActionProviderVisibilityListenerC18817o;
import p976r.C18816n;
import p976r.InterfaceC18825w;
import p976r.InterfaceC18826x;
import p976r.InterfaceC18827y;
import p976r.InterfaceC18828z;
import p976r.MenuC18814l;
import p976r.SubMenuC18802D;

/* JADX INFO: renamed from: s.i */
/* JADX INFO: loaded from: classes.dex */
public final class C19356i implements InterfaceC18826x {

    /* JADX INFO: renamed from: A0 */
    public int f61287A0;

    /* JADX INFO: renamed from: B0 */
    public int f61288B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f61289C0;

    /* JADX INFO: renamed from: E0 */
    public C19345e f61291E0;

    /* JADX INFO: renamed from: F0 */
    public C19345e f61292F0;

    /* JADX INFO: renamed from: G0 */
    public RunnableC19351g f61293G0;

    /* JADX INFO: renamed from: H0 */
    public C19348f f61294H0;

    /* JADX INFO: renamed from: Y */
    public final Context f61296Y;

    /* JADX INFO: renamed from: Z */
    public Context f61297Z;

    /* JADX INFO: renamed from: o0 */
    public MenuC18814l f61298o0;

    /* JADX INFO: renamed from: p0 */
    public final LayoutInflater f61299p0;

    /* JADX INFO: renamed from: q0 */
    public InterfaceC18825w f61300q0;

    /* JADX INFO: renamed from: t0 */
    public InterfaceC18828z f61303t0;

    /* JADX INFO: renamed from: u0 */
    public C19354h f61304u0;

    /* JADX INFO: renamed from: v0 */
    public Drawable f61305v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f61306w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f61307x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f61308y0;

    /* JADX INFO: renamed from: z0 */
    public int f61309z0;

    /* JADX INFO: renamed from: r0 */
    public final int f61301r0 = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: s0 */
    public final int f61302s0 = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: D0 */
    public final SparseBooleanArray f61290D0 = new SparseBooleanArray();

    /* JADX INFO: renamed from: I0 */
    public final C10077b f61295I0 = new C10077b(this, 19);

    public C19356i(Context context) {
        this.f61296Y = context;
        this.f61299p0 = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final View m20458a(C18816n c18816n, View view, ViewGroup viewGroup) {
        InterfaceC18827y interfaceC18827y;
        View actionView = c18816n.getActionView();
        if (actionView == null || c18816n.m20137e()) {
            if (view instanceof InterfaceC18827y) {
                interfaceC18827y = (InterfaceC18827y) view;
            } else {
                interfaceC18827y = (InterfaceC18827y) this.f61299p0.inflate(this.f61302s0, viewGroup, false);
            }
            interfaceC18827y.mo11126c(c18816n);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC18827y;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f61303t0);
            if (this.f61294H0 == null) {
                this.f61294H0 = new C19348f(this);
            }
            actionMenuItemView.setPopupCallback(this.f61294H0);
            actionView = (View) interfaceC18827y;
        }
        actionView.setVisibility(c18816n.f59874C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C19360k)) {
            actionView.setLayoutParams(ActionMenuView.m11147k(layoutParams));
        }
        return actionView;
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: b */
    public final void mo20085b(InterfaceC18825w interfaceC18825w) {
        throw null;
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: c */
    public final void mo20086c(MenuC18814l menuC18814l, boolean z6) {
        m20459f();
        C19345e c19345e = this.f61292F0;
        if (c19345e != null && c19345e.m20143b()) {
            c19345e.f59921i.dismiss();
        }
        InterfaceC18825w interfaceC18825w = this.f61300q0;
        if (interfaceC18825w != null) {
            interfaceC18825w.mo10212c(menuC18814l, z6);
        }
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: d */
    public final boolean mo20115d(C18816n c18816n) {
        return false;
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: e */
    public final boolean mo20087e() {
        int size;
        ArrayList arrayListM20126l;
        int i10;
        boolean z6;
        MenuC18814l menuC18814l = this.f61298o0;
        if (menuC18814l != null) {
            arrayListM20126l = menuC18814l.m20126l();
            size = arrayListM20126l.size();
        } else {
            size = 0;
            arrayListM20126l = null;
        }
        int i11 = this.f61288B0;
        int i12 = this.f61287A0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f61303t0;
        int i13 = 0;
        boolean z10 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z6 = true;
            if (i13 >= size) {
                break;
            }
            C18816n c18816n = (C18816n) arrayListM20126l.get(i13);
            int i16 = c18816n.f59899y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z10 = true;
            }
            if (this.f61289C0 && c18816n.f59874C) {
                i11 = 0;
            }
            i13++;
        }
        if (this.f61307x0 && (z10 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = this.f61290D0;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < size) {
            C18816n c18816n2 = (C18816n) arrayListM20126l.get(i18);
            int i20 = c18816n2.f59899y;
            boolean z11 = (i20 & 2) == i10 ? z6 : false;
            int i21 = c18816n2.f59876b;
            if (z11) {
                View viewM20458a = m20458a(c18816n2, null, viewGroup);
                viewM20458a.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM20458a.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z6);
                }
                c18816n2.m20139g(z6);
            } else {
                if ((i20 & 1) == z6) {
                    boolean z12 = sparseBooleanArray.get(i21);
                    boolean z13 = ((i17 > 0 || z12) && i12 > 0) ? z6 : false;
                    if (z13) {
                        View viewM20458a2 = m20458a(c18816n2, null, viewGroup);
                        viewM20458a2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewM20458a2.getMeasuredWidth();
                        i12 -= measuredWidth2;
                        if (i19 == 0) {
                            i19 = measuredWidth2;
                        }
                        z13 &= i12 + i19 > 0;
                    }
                    if (z13 && i21 != 0) {
                        sparseBooleanArray.put(i21, true);
                    } else if (z12) {
                        sparseBooleanArray.put(i21, false);
                        for (int i22 = 0; i22 < i18; i22++) {
                            C18816n c18816n3 = (C18816n) arrayListM20126l.get(i22);
                            if (c18816n3.f59876b == i21) {
                                if (c18816n3.m20138f()) {
                                    i17++;
                                }
                                c18816n3.m20139g(false);
                            }
                        }
                    }
                    if (z13) {
                        i17--;
                    }
                    c18816n2.m20139g(z13);
                } else {
                    c18816n2.m20139g(false);
                }
                i18++;
                i10 = 2;
                z6 = true;
            }
            i18++;
            i10 = 2;
            z6 = true;
        }
        return z6;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m20459f() {
        Object obj;
        RunnableC19351g runnableC19351g = this.f61293G0;
        if (runnableC19351g != null && (obj = this.f61303t0) != null) {
            ((View) obj).removeCallbacks(runnableC19351g);
            this.f61293G0 = null;
            return true;
        }
        C19345e c19345e = this.f61291E0;
        if (c19345e == null) {
            return false;
        }
        if (c19345e.m20143b()) {
            c19345e.f59921i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: g */
    public final boolean mo20088g(SubMenuC18802D subMenuC18802D) {
        boolean z6;
        if (!subMenuC18802D.hasVisibleItems()) {
            return false;
        }
        SubMenuC18802D subMenuC18802D2 = subMenuC18802D;
        while (true) {
            MenuC18814l menuC18814l = subMenuC18802D2.f59781z;
            if (menuC18814l == this.f61298o0) {
                break;
            }
            subMenuC18802D2 = (SubMenuC18802D) menuC18814l;
        }
        ViewGroup viewGroup = (ViewGroup) this.f61303t0;
        View view = null;
        view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if ((childAt instanceof InterfaceC18827y) && ((InterfaceC18827y) childAt).getItemData() == subMenuC18802D2.f59780A) {
                    view = childAt;
                    break;
                }
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC18802D.f59780A.getClass();
        int size = subMenuC18802D.f59850f.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                z6 = false;
                break;
            }
            MenuItem item = subMenuC18802D.getItem(i11);
            if (item.isVisible() && item.getIcon() != null) {
                z6 = true;
                break;
            }
            i11++;
        }
        C19345e c19345e = new C19345e(this, this.f61297Z, subMenuC18802D, view);
        this.f61292F0 = c19345e;
        c19345e.f59919g = z6;
        AbstractC18822t abstractC18822t = c19345e.f59921i;
        if (abstractC18822t != null) {
            abstractC18822t.mo20092o(z6);
        }
        C19345e c19345e2 = this.f61292F0;
        if (!c19345e2.m20143b()) {
            if (c19345e2.f59917e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c19345e2.m20145d(0, 0, false, false);
        }
        InterfaceC18825w interfaceC18825w = this.f61300q0;
        if (interfaceC18825w != null) {
            interfaceC18825w.mo10214g(subMenuC18802D);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: h */
    public final void mo20089h() {
        int i10;
        ViewGroup viewGroup = (ViewGroup) this.f61303t0;
        ArrayList arrayList = null;
        boolean z6 = false;
        if (viewGroup != null) {
            MenuC18814l menuC18814l = this.f61298o0;
            if (menuC18814l != null) {
                menuC18814l.m20125i();
                ArrayList arrayListM20126l = this.f61298o0.m20126l();
                int size = arrayListM20126l.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    C18816n c18816n = (C18816n) arrayListM20126l.get(i11);
                    if (c18816n.m20138f()) {
                        View childAt = viewGroup.getChildAt(i10);
                        C18816n itemData = childAt instanceof InterfaceC18827y ? ((InterfaceC18827y) childAt).getItemData() : null;
                        View viewM20458a = m20458a(c18816n, childAt, viewGroup);
                        if (c18816n != itemData) {
                            viewM20458a.setPressed(false);
                            viewM20458a.jumpDrawablesToCurrentState();
                        }
                        if (viewM20458a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM20458a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM20458a);
                            }
                            ((ViewGroup) this.f61303t0).addView(viewM20458a, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f61304u0) {
                    i10++;
                } else {
                    viewGroup.removeViewAt(i10);
                }
            }
        }
        ((View) this.f61303t0).requestLayout();
        MenuC18814l menuC18814l2 = this.f61298o0;
        if (menuC18814l2 != null) {
            menuC18814l2.m20125i();
            ArrayList arrayList2 = menuC18814l2.f59853i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ActionProviderVisibilityListenerC18817o actionProviderVisibilityListenerC18817o = ((C18816n) arrayList2.get(i12)).f59872A;
            }
        }
        MenuC18814l menuC18814l3 = this.f61298o0;
        if (menuC18814l3 != null) {
            menuC18814l3.m20125i();
            arrayList = menuC18814l3.f59854j;
        }
        if (this.f61307x0 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z6 = !((C18816n) arrayList.get(0)).f59874C;
            } else if (size3 > 0) {
                z6 = true;
            }
        }
        if (z6) {
            if (this.f61304u0 == null) {
                this.f61304u0 = new C19354h(this, this.f61296Y);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f61304u0.getParent();
            if (viewGroup3 != this.f61303t0) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f61304u0);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f61303t0;
                C19354h c19354h = this.f61304u0;
                actionMenuView.getClass();
                C19360k c19360kM11146j = ActionMenuView.m11146j();
                c19360kM11146j.f61312a = true;
                actionMenuView.addView(c19354h, c19360kM11146j);
            }
        } else {
            C19354h c19354h2 = this.f61304u0;
            if (c19354h2 != null) {
                Object parent = c19354h2.getParent();
                Object obj = this.f61303t0;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f61304u0);
                }
            }
        }
        ((ActionMenuView) this.f61303t0).setOverflowReserved(this.f61307x0);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m20460i() {
        C19345e c19345e = this.f61291E0;
        return c19345e != null && c19345e.m20143b();
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: j */
    public final boolean mo20116j(C18816n c18816n) {
        return false;
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: k */
    public final void mo20117k(Context context, MenuC18814l menuC18814l) {
        this.f61297Z = context;
        LayoutInflater.from(context);
        this.f61298o0 = menuC18814l;
        Resources resources = context.getResources();
        if (!this.f61308y0) {
            this.f61307x0 = true;
        }
        int i10 = 2;
        this.f61309z0 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.f61288B0 = i10;
        int measuredWidth = this.f61309z0;
        if (this.f61307x0) {
            if (this.f61304u0 == null) {
                C19354h c19354h = new C19354h(this, this.f61296Y);
                this.f61304u0 = c19354h;
                if (this.f61306w0) {
                    c19354h.setImageDrawable(this.f61305v0);
                    this.f61305v0 = null;
                    this.f61306w0 = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f61304u0.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f61304u0.getMeasuredWidth();
        } else {
            this.f61304u0 = null;
        }
        this.f61287A0 = measuredWidth;
        float f10 = resources.getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m20461l() {
        MenuC18814l menuC18814l;
        if (!this.f61307x0 || m20460i() || (menuC18814l = this.f61298o0) == null || this.f61303t0 == null || this.f61293G0 != null) {
            return false;
        }
        menuC18814l.m20125i();
        if (menuC18814l.f59854j.isEmpty()) {
            return false;
        }
        RunnableC19351g runnableC19351g = new RunnableC19351g(this, new C19345e(this, this.f61297Z, this.f61298o0, this.f61304u0));
        this.f61293G0 = runnableC19351g;
        ((View) this.f61303t0).post(runnableC19351g);
        return true;
    }
}
