package p1009s9;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import p1060v9.AbstractC20502t;
import p588Y2.DialogInterfaceOnCancelListenerC9628l;

/* JADX INFO: renamed from: s9.j */
/* JADX INFO: loaded from: classes.dex */
public class C19507j extends DialogInterfaceOnCancelListenerC9628l {

    /* JADX INFO: renamed from: v1 */
    public AlertDialog f61961v1;

    /* JADX INFO: renamed from: w1 */
    public DialogInterface.OnCancelListener f61962w1;

    /* JADX INFO: renamed from: x1 */
    public AlertDialog f61963x1;

    @Override // p588Y2.DialogInterfaceOnCancelListenerC9628l
    /* JADX INFO: renamed from: Q */
    public final Dialog mo10183Q() {
        AlertDialog alertDialog = this.f61961v1;
        if (alertDialog != null) {
            return alertDialog;
        }
        this.f29017m1 = false;
        if (this.f61963x1 == null) {
            Context contextM11752o = m11752o();
            AbstractC20502t.m21157h(contextM11752o);
            this.f61963x1 = new AlertDialog.Builder(contextM11752o).create();
        }
        return this.f61963x1;
    }

    @Override // p588Y2.DialogInterfaceOnCancelListenerC9628l, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f61962w1;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
