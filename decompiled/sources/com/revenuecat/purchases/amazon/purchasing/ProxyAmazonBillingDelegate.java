package com.revenuecat.purchases.amazon.purchasing;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.amazon.device.iap.model.RequestId;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.common.LogUtilsKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R*\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m18067d2 = {"Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingDelegate;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Lmm/C;", "onCreate", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onDestroy", "(Landroid/app/Activity;)V", "Landroid/content/Intent;", "intent", "Lcom/amazon/device/iap/model/RequestId;", "startAmazonPurchase$purchases_customEntitlementComputationRelease", "(Landroid/content/Intent;)Lcom/amazon/device/iap/model/RequestId;", "startAmazonPurchase", "Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivityBroadcastReceiver;", "broadcastReceiver", "Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivityBroadcastReceiver;", "getBroadcastReceiver$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivityBroadcastReceiver;", "setBroadcastReceiver$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivityBroadcastReceiver;)V", "getBroadcastReceiver$purchases_customEntitlementComputationRelease$annotations", "Landroid/content/IntentFilter;", "filter", "Landroid/content/IntentFilter;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ProxyAmazonBillingDelegate {
    private /* synthetic */ ProxyAmazonBillingActivityBroadcastReceiver broadcastReceiver;
    private final IntentFilter filter = ProxyAmazonBillingActivityBroadcastReceiver.INSTANCE.newPurchaseFinishedIntentFilter();

    /* JADX INFO: renamed from: getBroadcastReceiver$purchases_customEntitlementComputationRelease$annotations */
    public static /* synthetic */ void m14447x3886325() {
    }

    /* JADX INFO: renamed from: getBroadcastReceiver$purchases_customEntitlementComputationRelease, reason: from getter */
    public final ProxyAmazonBillingActivityBroadcastReceiver getBroadcastReceiver() {
        return this.broadcastReceiver;
    }

    public final void onCreate(Activity activity, Bundle savedInstanceState) {
        AbstractC16544l.m18094g(activity, "activity");
        ProxyAmazonBillingActivityBroadcastReceiver proxyAmazonBillingActivityBroadcastReceiver = new ProxyAmazonBillingActivityBroadcastReceiver(activity);
        this.broadcastReceiver = proxyAmazonBillingActivityBroadcastReceiver;
        if (Build.VERSION.SDK_INT >= 33) {
            activity.registerReceiver(proxyAmazonBillingActivityBroadcastReceiver, this.filter, 2);
        } else {
            activity.registerReceiver(proxyAmazonBillingActivityBroadcastReceiver, this.filter);
        }
        if (savedInstanceState == null) {
            Intent intent = activity.getIntent();
            AbstractC16544l.m18093f(intent, "activity.intent");
            if (m14450xa7056272(intent) == null) {
                activity.finish();
            }
        }
    }

    public final void onDestroy(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        activity.unregisterReceiver(this.broadcastReceiver);
        this.broadcastReceiver = null;
    }

    /* JADX INFO: renamed from: setBroadcastReceiver$purchases_customEntitlementComputationRelease */
    public final void m14449x7a8b1799(ProxyAmazonBillingActivityBroadcastReceiver proxyAmazonBillingActivityBroadcastReceiver) {
        this.broadcastReceiver = proxyAmazonBillingActivityBroadcastReceiver;
    }

    /* JADX INFO: renamed from: startAmazonPurchase$purchases_customEntitlementComputationRelease */
    public final RequestId m14450xa7056272(Intent intent) {
        AbstractC16544l.m18094g(intent, "intent");
        String stringExtra = intent.getStringExtra(ProxyAmazonBillingActivity.EXTRAS_SKU);
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER);
        PurchasingServiceProvider purchasingServiceProvider = (PurchasingServiceProvider) intent.getParcelableExtra(ProxyAmazonBillingActivity.EXTRAS_PURCHASING_SERVICE_PROVIDER);
        if (stringExtra == null || resultReceiver == null || purchasingServiceProvider == null) {
            LogUtilsKt.errorLog(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, String.format(AmazonStrings.ERROR_PURCHASE_INVALID_PROXY_ACTIVITY_ARGUMENTS, Arrays.copyOf(new Object[]{intent.toUri(0)}, 1))));
            return null;
        }
        RequestId requestIdPurchase = purchasingServiceProvider.purchase(stringExtra);
        Bundle bundle = new Bundle();
        bundle.putParcelable(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, (Parcelable) requestIdPurchase);
        resultReceiver.send(0, bundle);
        return requestIdPurchase;
    }
}
