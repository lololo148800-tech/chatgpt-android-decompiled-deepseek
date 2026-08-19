package p826j6;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.android.billingclient.api.ProxyBillingActivity;
import com.google.android.gms.internal.play_billing.AbstractC11947e;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import p333N9.AbstractBinderC5687h;
import p500Ua.ResultReceiverC7594c;

/* JADX INFO: renamed from: j6.C */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC16134C extends AbstractBinderC5687h {

    /* JADX INFO: renamed from: b */
    public final WeakReference f50056b;

    /* JADX INFO: renamed from: c */
    public final ResultReceiverC7594c f50057c;

    public BinderC16134C(WeakReference weakReference, ResultReceiverC7594c resultReceiverC7594c) {
        super("com.android.vending.billing.IInAppBillingServiceCallback", 10);
        this.f50056b = weakReference;
        this.f50057c = resultReceiverC7594c;
    }

    @Override // p333N9.AbstractBinderC5687h
    /* JADX INFO: renamed from: o */
    public final boolean mo6130o(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC11947e.m13413a(parcel, Bundle.CREATOR);
        AbstractC11947e.m13414b(parcel);
        ResultReceiverC7594c resultReceiverC7594c = this.f50057c;
        if (resultReceiverC7594c == null) {
            AbstractC11988o0.m13512g("BillingClient", "Unable to send result for in-app messaging");
        } else if (bundle == null) {
            resultReceiverC7594c.send(0, null);
        } else {
            Activity activity = (Activity) this.f50056b.get();
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
            if (activity == null || pendingIntent == null) {
                resultReceiverC7594c.send(0, null);
                AbstractC11988o0.m13512g("BillingClient", "Unable to launch intent for in-app messaging");
            } else {
                try {
                    Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                    intent.putExtra("in_app_message_result_receiver", resultReceiverC7594c);
                    intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
                    activity.startActivity(intent);
                } catch (CancellationException e10) {
                    resultReceiverC7594c.send(0, null);
                    AbstractC11988o0.m13513h("BillingClient", "Exception caught while launching intent for in-app messaging.", e10);
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
