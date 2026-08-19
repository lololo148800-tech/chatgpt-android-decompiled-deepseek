package p588Y2;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: Y2.j */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC9626j implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC9628l f29009Y;

    public DialogInterfaceOnDismissListenerC9626j(DialogInterfaceOnCancelListenerC9628l dialogInterfaceOnCancelListenerC9628l) {
        this.f29009Y = dialogInterfaceOnCancelListenerC9628l;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC9628l dialogInterfaceOnCancelListenerC9628l = this.f29009Y;
        Dialog dialog = dialogInterfaceOnCancelListenerC9628l.f29021q1;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC9628l.onDismiss(dialog);
        }
    }
}
