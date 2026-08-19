package p976r;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: r.u */
/* JADX INFO: loaded from: classes.dex */
public final class C18823u implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C18824v f59912Y;

    public C18823u(C18824v c18824v) {
        this.f59912Y = c18824v;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f59912Y.mo20144c();
    }
}
