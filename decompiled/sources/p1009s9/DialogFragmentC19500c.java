package p1009s9;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import p1060v9.AbstractC20502t;

/* JADX INFO: renamed from: s9.c */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC19500c extends DialogFragment {

    /* JADX INFO: renamed from: Y */
    public AlertDialog f61943Y;

    /* JADX INFO: renamed from: Z */
    public DialogInterface.OnCancelListener f61944Z;

    /* JADX INFO: renamed from: o0 */
    public AlertDialog f61945o0;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f61944Z;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f61943Y;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f61945o0 == null) {
            Activity activity = getActivity();
            AbstractC20502t.m21157h(activity);
            this.f61945o0 = new AlertDialog.Builder(activity).create();
        }
        return this.f61945o0;
    }
}
