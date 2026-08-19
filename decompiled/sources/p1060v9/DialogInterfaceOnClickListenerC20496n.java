package p1060v9;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.common.api.GoogleApiActivity;
import io.sentry.android.core.AbstractC15256t;

/* JADX INFO: renamed from: v9.n */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC20496n implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f65080Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Intent f65081Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f65082o0;

    public /* synthetic */ DialogInterfaceOnClickListenerC20496n(Intent intent, Object obj, int i10) {
        this.f65080Y = i10;
        this.f65081Z = intent;
        this.f65082o0 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, u9.h] */
    /* JADX INFO: renamed from: a */
    public final void m21144a() {
        switch (this.f65080Y) {
            case 0:
                Intent intent = this.f65081Z;
                if (intent != null) {
                    ((GoogleApiActivity) this.f65082o0).startActivityForResult(intent, 2);
                }
                break;
            default:
                Intent intent2 = this.f65081Z;
                if (intent2 != null) {
                    this.f65082o0.startActivityForResult(intent2, 2);
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            try {
                m21144a();
            } catch (ActivityNotFoundException e10) {
                AbstractC15256t.m16466d("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e10);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
