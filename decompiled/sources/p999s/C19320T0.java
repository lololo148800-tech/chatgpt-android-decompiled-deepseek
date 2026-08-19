package p999s;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.InterfaceC10819b;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p976r.C18816n;
import p976r.C18818p;
import p976r.InterfaceC18826x;
import p976r.MenuC18814l;
import p976r.SubMenuC18802D;

/* JADX INFO: renamed from: s.T0 */
/* JADX INFO: loaded from: classes.dex */
public final class C19320T0 implements InterfaceC18826x {

    /* JADX INFO: renamed from: Y */
    public MenuC18814l f61192Y;

    /* JADX INFO: renamed from: Z */
    public C18816n f61193Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Toolbar f61194o0;

    public C19320T0(Toolbar toolbar) {
        this.f61194o0 = toolbar;
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: d */
    public final boolean mo20115d(C18816n c18816n) {
        Toolbar toolbar = this.f61194o0;
        toolbar.m11159c();
        ViewParent parent = toolbar.f32299v0.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f32299v0);
            }
            toolbar.addView(toolbar.f32299v0);
        }
        View actionView = c18816n.getActionView();
        toolbar.f32300w0 = actionView;
        this.f61193Z = c18816n;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f32300w0);
            }
            C19322U0 c19322u0M11153h = Toolbar.m11153h();
            c19322u0M11153h.f61208a = (toolbar.f32261B0 & 112) | 8388611;
            c19322u0M11153h.f61209b = 2;
            toolbar.f32300w0.setLayoutParams(c19322u0M11153h);
            toolbar.addView(toolbar.f32300w0);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C19322U0) childAt.getLayoutParams()).f61209b != 2 && childAt != toolbar.f32292o0) {
                toolbar.removeViewAt(childCount);
                toolbar.f32278S0.add(childAt);
            }
        }
        toolbar.requestLayout();
        c18816n.f59874C = true;
        c18816n.f59888n.m20127p(false);
        KeyEvent.Callback callback = toolbar.f32300w0;
        if (callback instanceof InterfaceC10819b) {
            ((C18818p) ((InterfaceC10819b) callback)).f59904o0.onActionViewExpanded();
        }
        toolbar.m11173u();
        return true;
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: e */
    public final boolean mo20087e() {
        return false;
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: g */
    public final boolean mo20088g(SubMenuC18802D subMenuC18802D) {
        return false;
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: h */
    public final void mo20089h() {
        if (this.f61193Z != null) {
            MenuC18814l menuC18814l = this.f61192Y;
            if (menuC18814l != null) {
                int size = menuC18814l.f59850f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f61192Y.getItem(i10) == this.f61193Z) {
                        return;
                    }
                }
            }
            mo20116j(this.f61193Z);
        }
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: j */
    public final boolean mo20116j(C18816n c18816n) {
        Toolbar toolbar = this.f61194o0;
        KeyEvent.Callback callback = toolbar.f32300w0;
        if (callback instanceof InterfaceC10819b) {
            ((C18818p) ((InterfaceC10819b) callback)).f59904o0.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f32300w0);
        toolbar.removeView(toolbar.f32299v0);
        toolbar.f32300w0 = null;
        ArrayList arrayList = toolbar.f32278S0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f61193Z = null;
        toolbar.requestLayout();
        c18816n.f59874C = false;
        c18816n.f59888n.m20127p(false);
        toolbar.m11173u();
        return true;
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: k */
    public final void mo20117k(Context context, MenuC18814l menuC18814l) {
        C18816n c18816n;
        MenuC18814l menuC18814l2 = this.f61192Y;
        if (menuC18814l2 != null && (c18816n = this.f61193Z) != null) {
            menuC18814l2.mo20098d(c18816n);
        }
        this.f61192Y = menuC18814l;
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: c */
    public final void mo20086c(MenuC18814l menuC18814l, boolean z6) {
    }
}
