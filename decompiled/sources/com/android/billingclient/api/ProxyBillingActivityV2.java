package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.AbstractActivityC10817a;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import kotlin.jvm.internal.AbstractC16544l;
import p385Pj.C6427b;
import p588Y2.C9642z;
import p784hb.C14437f;
import p841k.C16288h;
import p841k.C16290j;

/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivityV2 extends AbstractActivityC10817a {

    /* JADX INFO: renamed from: G0 */
    public C16288h f35946G0;

    /* JADX INFO: renamed from: H0 */
    public C16288h f35947H0;

    /* JADX INFO: renamed from: I0 */
    public ResultReceiver f35948I0;

    /* JADX INFO: renamed from: J0 */
    public ResultReceiver f35949J0;

    @Override // androidx.activity.AbstractActivityC10817a, p896n2.AbstractActivityC17454g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f35946G0 = (C16288h) m11096m(new C9642z(this, 13), new C6427b(8));
        this.f35947H0 = (C16288h) m11096m(new C14437f(this), new C6427b(8));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f35948I0 = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f35949J0 = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        AbstractC11988o0.m13511f("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f35948I0 = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            C16288h c16288h = this.f35946G0;
            AbstractC16544l.m18094g(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            AbstractC16544l.m18093f(intentSender, "pendingIntent.intentSender");
            c16288h.mo10188b(new C16290j(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f35949J0 = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            C16288h c16288h2 = this.f35947H0;
            AbstractC16544l.m18094g(pendingIntent2, "pendingIntent");
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            AbstractC16544l.m18093f(intentSender2, "pendingIntent.intentSender");
            c16288h2.mo10188b(new C16290j(intentSender2, null, 0, 0));
        }
    }

    @Override // androidx.activity.AbstractActivityC10817a, p896n2.AbstractActivityC17454g, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f35948I0;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f35949J0;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
