package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import p618Za.C10267f;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p826j6.AbstractC16142K;
import p826j6.C16155i;

/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: Y */
    public ResultReceiver f35941Y;

    /* JADX INFO: renamed from: Z */
    public ResultReceiver f35942Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f35943o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f35944p0;

    /* JADX INFO: renamed from: q0 */
    public int f35945q0;

    /* JADX INFO: renamed from: a */
    public final Intent m13147a() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            AbstractC11988o0.m13511f("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f35943o0 = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER)) {
                this.f35941Y = (ResultReceiver) bundle.getParcelable(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER);
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f35942Z = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f35944p0 = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f35945q0 = bundle.getInt("activity_code", 100);
            return;
        }
        AbstractC11988o0.m13511f("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f35945q0 = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f35944p0 = true;
                this.f35945q0 = 110;
            }
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f35941Y = (ResultReceiver) getIntent().getParcelableExtra(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER);
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f35942Z = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f35945q0 = 101;
        } else {
            pendingIntent = null;
        }
        try {
            this.f35943o0 = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f35945q0, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e10) {
            AbstractC11988o0.m13513h("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e10);
            ResultReceiver resultReceiver = this.f35941Y;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f35942Z;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentM13147a = m13147a();
                    if (this.f35944p0) {
                        intentM13147a.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    intentM13147a.putExtra("RESPONSE_CODE", 6);
                    intentM13147a.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentM13147a);
                }
            }
            this.f35943o0 = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f35943o0) {
            Intent intentM13147a = m13147a();
            intentM13147a.putExtra("RESPONSE_CODE", 1);
            intentM13147a.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            int i10 = this.f35945q0;
            if (i10 == 110 || i10 == 100) {
                intentM13147a.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            }
            sendBroadcast(intentM13147a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        Intent intentM13147a;
        int i12;
        ResultReceiver resultReceiver;
        super.onActivityResult(i10, i11, intent);
        Bundle extras = null;
        if (i10 != 100 && i10 != 110) {
            if (i10 == 101) {
                if (intent == null) {
                    AbstractC11988o0.m13512g("ProxyBillingActivity", "Got null intent!");
                } else {
                    int i13 = AbstractC11988o0.f36308a;
                    Bundle extras2 = intent.getExtras();
                    if (extras2 == null) {
                        AbstractC11988o0.m13512g("ProxyBillingActivity", "Unexpected null bundle received!");
                    } else {
                        i12 = extras2.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                    }
                    resultReceiver = this.f35942Z;
                    if (resultReceiver != null) {
                        if (intent != null) {
                            extras = intent.getExtras();
                        }
                        resultReceiver.send(i12, extras);
                    }
                }
                i12 = 0;
                resultReceiver = this.f35942Z;
                if (resultReceiver != null) {
                    if (intent != null) {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i12, extras);
                }
            } else {
                AbstractC11988o0.m13512g("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i10 + MMVKXkcLpuHFDi.jVFYsBjxv);
            }
        } else {
            int i14 = AbstractC11988o0.m13509d(intent, "ProxyBillingActivity").f50151a;
            if (i11 == -1) {
                if (i14 != 0) {
                    i11 = -1;
                    AbstractC11988o0.m13512g("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + i14);
                } else {
                    i14 = 0;
                }
            } else {
                AbstractC11988o0.m13512g("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + i14);
            }
            ResultReceiver resultReceiver2 = this.f35941Y;
            if (resultReceiver2 != null) {
                if (intent != null) {
                    extras = intent.getExtras();
                }
                resultReceiver2.send(i14, extras);
            } else {
                if (intent != null) {
                    if (intent.getExtras() != null) {
                        String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                        if (string != null) {
                            intentM13147a = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                            intentM13147a.setPackage(getApplicationContext().getPackageName());
                            intentM13147a.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                            intentM13147a.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                        } else {
                            Intent intentM13147a2 = m13147a();
                            intentM13147a2.putExtras(intent.getExtras());
                            intentM13147a2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                            intentM13147a = intentM13147a2;
                        }
                    } else {
                        intentM13147a = m13147a();
                        AbstractC11988o0.m13512g("ProxyBillingActivity", "Got null bundle!");
                        intentM13147a.putExtra("RESPONSE_CODE", 6);
                        intentM13147a.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        C10267f c10267fM17778a = C16155i.m17778a();
                        c10267fM17778a.f30498b = 6;
                        c10267fM17778a.f30497a = "An internal error occurred.";
                        intentM13147a.putExtra("FAILURE_LOGGING_PAYLOAD", AbstractC16142K.m17717b(22, 2, c10267fM17778a.m10864c()).m13346b());
                        intentM13147a.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    }
                } else {
                    intentM13147a = m13147a();
                }
                if (i10 == 110) {
                    intentM13147a.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentM13147a);
            }
        }
        this.f35943o0 = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f35941Y;
        if (resultReceiver != null) {
            bundle.putParcelable(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER, resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f35942Z;
        if (resultReceiver2 != null) {
            bundle.putParcelable(lZYtIbClQJm.PczLbwU, resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f35943o0);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f35944p0);
        bundle.putInt("activity_code", this.f35945q0);
    }
}
