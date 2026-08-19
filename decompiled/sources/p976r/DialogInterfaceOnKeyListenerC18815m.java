package p976r;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p893n.DialogInterfaceC17373e;

/* JADX INFO: renamed from: r.m */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC18815m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC18825w {

    /* JADX INFO: renamed from: Y */
    public SubMenuC18802D f59869Y;

    /* JADX INFO: renamed from: Z */
    public DialogInterfaceC17373e f59870Z;

    /* JADX INFO: renamed from: o0 */
    public C18810h f59871o0;

    @Override // p976r.InterfaceC18825w
    /* JADX INFO: renamed from: c */
    public final void mo10212c(MenuC18814l menuC18814l, boolean z6) {
        DialogInterfaceC17373e dialogInterfaceC17373e;
        if ((z6 || menuC18814l == this.f59869Y) && (dialogInterfaceC17373e = this.f59870Z) != null) {
            dialogInterfaceC17373e.dismiss();
        }
    }

    @Override // p976r.InterfaceC18825w
    /* JADX INFO: renamed from: g */
    public final boolean mo10214g(MenuC18814l menuC18814l) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        C18810h c18810h = this.f59871o0;
        if (c18810h.f59837r0 == null) {
            c18810h.f59837r0 = new C18809g(c18810h);
        }
        this.f59869Y.m20128q(c18810h.f59837r0.getItem(i10), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f59871o0.mo20086c(this.f59869Y, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC18802D subMenuC18802D = this.f59869Y;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f59870Z.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f59870Z.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC18802D.m20122c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC18802D.performShortcut(i10, keyEvent, 0);
    }
}
