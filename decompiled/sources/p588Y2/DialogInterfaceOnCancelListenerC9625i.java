package p588Y2;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: Y2.i */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC9625i implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC9628l f29008Y;

    public DialogInterfaceOnCancelListenerC9625i(DialogInterfaceOnCancelListenerC9628l dialogInterfaceOnCancelListenerC9628l) {
        this.f29008Y = dialogInterfaceOnCancelListenerC9628l;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC9628l dialogInterfaceOnCancelListenerC9628l = this.f29008Y;
        Dialog dialog = dialogInterfaceOnCancelListenerC9628l.f29021q1;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC9628l.onCancel(dialog);
        }
    }
}
