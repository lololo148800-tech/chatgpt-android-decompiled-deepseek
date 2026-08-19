package p976r;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import p826j6.C16137F;
import p893n.C17370b;
import p893n.DialogInterfaceC17373e;

/* JADX INFO: renamed from: r.h */
/* JADX INFO: loaded from: classes.dex */
public final class C18810h implements InterfaceC18826x, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: Y */
    public Context f59832Y;

    /* JADX INFO: renamed from: Z */
    public LayoutInflater f59833Z;

    /* JADX INFO: renamed from: o0 */
    public MenuC18814l f59834o0;

    /* JADX INFO: renamed from: p0 */
    public ExpandedMenuView f59835p0;

    /* JADX INFO: renamed from: q0 */
    public InterfaceC18825w f59836q0;

    /* JADX INFO: renamed from: r0 */
    public C18809g f59837r0;

    public C18810h(ContextWrapper contextWrapper) {
        this.f59832Y = contextWrapper;
        this.f59833Z = LayoutInflater.from(contextWrapper);
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: b */
    public final void mo20085b(InterfaceC18825w interfaceC18825w) {
        throw null;
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: c */
    public final void mo20086c(MenuC18814l menuC18814l, boolean z6) {
        InterfaceC18825w interfaceC18825w = this.f59836q0;
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
        return false;
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: g */
    public final boolean mo20088g(SubMenuC18802D subMenuC18802D) {
        if (!subMenuC18802D.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC18815m dialogInterfaceOnKeyListenerC18815m = new DialogInterfaceOnKeyListenerC18815m();
        dialogInterfaceOnKeyListenerC18815m.f59869Y = subMenuC18802D;
        Context context = subMenuC18802D.f59845a;
        C16137F c16137f = new C16137F(context);
        C17370b c17370b = (C17370b) c16137f.f50064o0;
        C18810h c18810h = new C18810h(c17370b.f55439a);
        dialogInterfaceOnKeyListenerC18815m.f59871o0 = c18810h;
        c18810h.f59836q0 = dialogInterfaceOnKeyListenerC18815m;
        subMenuC18802D.m20121b(c18810h, context);
        C18810h c18810h2 = dialogInterfaceOnKeyListenerC18815m.f59871o0;
        if (c18810h2.f59837r0 == null) {
            c18810h2.f59837r0 = new C18809g(c18810h2);
        }
        c17370b.f55445g = c18810h2.f59837r0;
        c17370b.f55446h = dialogInterfaceOnKeyListenerC18815m;
        View view = subMenuC18802D.f59859o;
        if (view != null) {
            c17370b.f55443e = view;
        } else {
            c17370b.f55441c = subMenuC18802D.f59858n;
            c17370b.f55442d = subMenuC18802D.f59857m;
        }
        c17370b.f55444f = dialogInterfaceOnKeyListenerC18815m;
        DialogInterfaceC17373e dialogInterfaceC17373eM17689d = c16137f.m17689d();
        dialogInterfaceOnKeyListenerC18815m.f59870Z = dialogInterfaceC17373eM17689d;
        dialogInterfaceC17373eM17689d.setOnDismissListener(dialogInterfaceOnKeyListenerC18815m);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC18815m.f59870Z.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC18815m.f59870Z.show();
        InterfaceC18825w interfaceC18825w = this.f59836q0;
        if (interfaceC18825w == null) {
            return true;
        }
        interfaceC18825w.mo10214g(subMenuC18802D);
        return true;
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: h */
    public final void mo20089h() {
        C18809g c18809g = this.f59837r0;
        if (c18809g != null) {
            c18809g.notifyDataSetChanged();
        }
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: j */
    public final boolean mo20116j(C18816n c18816n) {
        return false;
    }

    @Override // p976r.InterfaceC18826x
    /* JADX INFO: renamed from: k */
    public final void mo20117k(Context context, MenuC18814l menuC18814l) {
        if (this.f59832Y != null) {
            this.f59832Y = context;
            if (this.f59833Z == null) {
                this.f59833Z = LayoutInflater.from(context);
            }
        }
        this.f59834o0 = menuC18814l;
        C18809g c18809g = this.f59837r0;
        if (c18809g != null) {
            c18809g.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f59834o0.m20128q(this.f59837r0.getItem(i10), this, 0);
    }
}
