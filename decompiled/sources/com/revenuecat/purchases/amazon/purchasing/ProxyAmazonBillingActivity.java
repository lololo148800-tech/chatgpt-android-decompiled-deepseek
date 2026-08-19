package com.revenuecat.purchases.amazon.purchasing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.api.C12674R;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003R*\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m18067d2 = {"Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lmm/C;", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingDelegate;", "proxyAmazonBillingDelegate", "Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingDelegate;", "getProxyAmazonBillingDelegate$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingDelegate;", "setProxyAmazonBillingDelegate$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingDelegate;)V", "getProxyAmazonBillingDelegate$purchases_customEntitlementComputationRelease$annotations", "Companion", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ProxyAmazonBillingActivity extends Activity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String EXTRAS_PURCHASING_SERVICE_PROVIDER = "purchasing_service_provider";
    public static final String EXTRAS_REQUEST_ID = "request_id";
    public static final String EXTRAS_RESULT_RECEIVER = "result_receiver";
    public static final String EXTRAS_SKU = "sku";
    private ProxyAmazonBillingDelegate proxyAmazonBillingDelegate;

    @Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m18067d2 = {"Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivity$Companion;", "", "()V", "EXTRAS_PURCHASING_SERVICE_PROVIDER", "", "EXTRAS_REQUEST_ID", "EXTRAS_RESULT_RECEIVER", "EXTRAS_SKU", "newStartIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "resultReceiver", "Landroid/os/ResultReceiver;", ProxyAmazonBillingActivity.EXTRAS_SKU, "purchasingServiceProvider", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent newStartIntent(Context context, ResultReceiver resultReceiver, String sku, PurchasingServiceProvider purchasingServiceProvider) {
            AbstractC16544l.m18094g(context, "context");
            AbstractC16544l.m18094g(resultReceiver, "resultReceiver");
            AbstractC16544l.m18094g(sku, "sku");
            AbstractC16544l.m18094g(purchasingServiceProvider, "purchasingServiceProvider");
            Intent intent = new Intent(context, (Class<?>) ProxyAmazonBillingActivity.class);
            intent.putExtra(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER, resultReceiver);
            intent.putExtra(ProxyAmazonBillingActivity.EXTRAS_SKU, sku);
            intent.putExtra(ProxyAmazonBillingActivity.EXTRAS_PURCHASING_SERVICE_PROVIDER, purchasingServiceProvider);
            return intent;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: getProxyAmazonBillingDelegate$purchases_customEntitlementComputationRelease$annotations */
    public static /* synthetic */ void m14444x8ebeba2f() {
    }

    /* JADX INFO: renamed from: getProxyAmazonBillingDelegate$purchases_customEntitlementComputationRelease, reason: from getter */
    public final ProxyAmazonBillingDelegate getProxyAmazonBillingDelegate() {
        return this.proxyAmazonBillingDelegate;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        setTheme(C12674R.style.ProxyAmazonBillingActivityTheme);
        super.onCreate(savedInstanceState);
        ProxyAmazonBillingDelegate proxyAmazonBillingDelegate = new ProxyAmazonBillingDelegate();
        this.proxyAmazonBillingDelegate = proxyAmazonBillingDelegate;
        proxyAmazonBillingDelegate.onCreate(this, savedInstanceState);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ProxyAmazonBillingDelegate proxyAmazonBillingDelegate = this.proxyAmazonBillingDelegate;
        if (proxyAmazonBillingDelegate != null) {
            proxyAmazonBillingDelegate.onDestroy(this);
        }
        this.proxyAmazonBillingDelegate = null;
    }

    /* JADX INFO: renamed from: setProxyAmazonBillingDelegate$purchases_customEntitlementComputationRelease */
    public final void m14446x2983cd3b(ProxyAmazonBillingDelegate proxyAmazonBillingDelegate) {
        this.proxyAmazonBillingDelegate = proxyAmazonBillingDelegate;
    }
}
