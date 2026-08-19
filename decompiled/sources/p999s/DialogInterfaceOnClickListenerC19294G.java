package p999s;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import io.sentry.android.core.AbstractC15256t;
import p826j6.C16137F;
import p893n.C17370b;
import p893n.DialogInterfaceC17373e;

/* JADX INFO: renamed from: s.G */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC19294G implements InterfaceC19304L, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: Y */
    public DialogInterfaceC17373e f61134Y;

    /* JADX INFO: renamed from: Z */
    public C19296H f61135Z;

    /* JADX INFO: renamed from: o0 */
    public CharSequence f61136o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C19306M f61137p0;

    public DialogInterfaceOnClickListenerC19294G(C19306M c19306m) {
        this.f61137p0 = c19306m;
    }

    @Override // p999s.InterfaceC19304L
    /* JADX INFO: renamed from: a */
    public final boolean mo20364a() {
        DialogInterfaceC17373e dialogInterfaceC17373e = this.f61134Y;
        if (dialogInterfaceC17373e != null) {
            return dialogInterfaceC17373e.isShowing();
        }
        return false;
    }

    @Override // p999s.InterfaceC19304L
    /* JADX INFO: renamed from: b */
    public final int mo20365b() {
        return 0;
    }

    @Override // p999s.InterfaceC19304L
    /* JADX INFO: renamed from: c */
    public final void mo20366c(int i10) {
        AbstractC15256t.m16465c("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p999s.InterfaceC19304L
    /* JADX INFO: renamed from: d */
    public final CharSequence mo20367d() {
        return this.f61136o0;
    }

    @Override // p999s.InterfaceC19304L
    public final void dismiss() {
        DialogInterfaceC17373e dialogInterfaceC17373e = this.f61134Y;
        if (dialogInterfaceC17373e != null) {
            dialogInterfaceC17373e.dismiss();
            this.f61134Y = null;
        }
    }

    @Override // p999s.InterfaceC19304L
    /* JADX INFO: renamed from: e */
    public final Drawable mo20368e() {
        return null;
    }

    @Override // p999s.InterfaceC19304L
    /* JADX INFO: renamed from: g */
    public final void mo20369g(CharSequence charSequence) {
        this.f61136o0 = charSequence;
    }

    @Override // p999s.InterfaceC19304L
    /* JADX INFO: renamed from: h */
    public final void mo20370h(Drawable drawable) {
        AbstractC15256t.m16465c("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p999s.InterfaceC19304L
    /* JADX INFO: renamed from: j */
    public final void mo20371j(int i10) {
        AbstractC15256t.m16465c("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p999s.InterfaceC19304L
    /* JADX INFO: renamed from: k */
    public final void mo20372k(int i10) {
        AbstractC15256t.m16465c("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // p999s.InterfaceC19304L
    /* JADX INFO: renamed from: l */
    public final void mo20373l(int i10, int i11) {
        if (this.f61135Z == null) {
            return;
        }
        C19306M c19306m = this.f61137p0;
        C16137F c16137f = new C16137F(c19306m.getPopupContext());
        CharSequence charSequence = this.f61136o0;
        C17370b c17370b = (C17370b) c16137f.f50064o0;
        if (charSequence != null) {
            c17370b.f55442d = charSequence;
        }
        C19296H c19296h = this.f61135Z;
        int selectedItemPosition = c19306m.getSelectedItemPosition();
        c17370b.f55445g = c19296h;
        c17370b.f55446h = this;
        c17370b.f55448j = selectedItemPosition;
        c17370b.f55447i = true;
        DialogInterfaceC17373e dialogInterfaceC17373eM17689d = c16137f.m17689d();
        this.f61134Y = dialogInterfaceC17373eM17689d;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC17373eM17689d.f55481r0.f55458f;
        alertController$RecycleListView.setTextDirection(i10);
        alertController$RecycleListView.setTextAlignment(i11);
        this.f61134Y.show();
    }

    @Override // p999s.InterfaceC19304L
    /* JADX INFO: renamed from: m */
    public final int mo20374m() {
        return 0;
    }

    @Override // p999s.InterfaceC19304L
    /* JADX INFO: renamed from: n */
    public final void mo20354n(ListAdapter listAdapter) {
        this.f61135Z = (C19296H) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        C19306M c19306m = this.f61137p0;
        c19306m.setSelection(i10);
        if (c19306m.getOnItemClickListener() != null) {
            c19306m.performItemClick(null, i10, this.f61135Z.getItemId(i10));
        }
        dismiss();
    }
}
