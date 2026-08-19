package com.revenuecat.purchases;

import android.app.Application;
import android.content.Context;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.os.Handler;
import com.revenuecat.purchases.amazon.AmazonBilling;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.google.BillingWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JH\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e¨\u0006\u0014"}, m18067d2 = {"Lcom/revenuecat/purchases/BillingFactory;", "", "()V", "createBilling", "Lcom/revenuecat/purchases/common/BillingAbstract;", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", SIPServerTransaction.CONTENT_TYPE_APPLICATION, "Landroid/app/Application;", "backendHelper", "Lcom/revenuecat/purchases/common/BackendHelper;", "cache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "finishTransactions", "", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "stateProvider", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "pendingTransactionsForPrepaidPlansEnabled", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class BillingFactory {
    public static final BillingFactory INSTANCE = new BillingFactory();

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.PLAY_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Store.AMAZON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BillingFactory() {
    }

    public final BillingAbstract createBilling(Store store, Application application, BackendHelper backendHelper, DeviceCache cache, boolean finishTransactions, DiagnosticsTracker diagnosticsTrackerIfEnabled, PurchasesStateProvider stateProvider, boolean pendingTransactionsForPrepaidPlansEnabled) {
        AbstractC16544l.m18094g(store, "store");
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(backendHelper, "backendHelper");
        AbstractC16544l.m18094g(cache, "cache");
        AbstractC16544l.m18094g(stateProvider, "stateProvider");
        int i10 = WhenMappings.$EnumSwitchMapping$0[store.ordinal()];
        if (i10 == 1) {
            return new BillingWrapper(new BillingWrapper.ClientFactory(application, pendingTransactionsForPrepaidPlansEnabled), new Handler(application.getMainLooper()), cache, diagnosticsTrackerIfEnabled, stateProvider, null, 32, null);
        }
        if (i10 == 2) {
            try {
                Context applicationContext = application.getApplicationContext();
                AbstractC16544l.m18093f(applicationContext, "application.applicationContext");
                return new AmazonBilling(applicationContext, cache, finishTransactions, new Handler(application.getMainLooper()), backendHelper, stateProvider, diagnosticsTrackerIfEnabled);
            } catch (NoClassDefFoundError e10) {
                LogUtilsKt.errorLog("Make sure purchases-amazon is added as dependency", e10);
                throw e10;
            }
        }
        LogUtilsKt.errorLog$default("Incompatible store (" + store + ") used", null, 2, null);
        throw new IllegalArgumentException("Couldn't configure SDK. Incompatible store (" + store + ") used");
    }
}
