package com.revenuecat.purchases;

import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1426a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b!\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R.\u0010)\u001a\u0004\u0018\u00010\u00102\b\u0010(\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u0014R\u0018\u0010.\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, m18067d2 = {"Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTracker", "Landroid/os/Handler;", "handler", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Landroid/os/Handler;)V", "Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "listener", "Lmm/C;", "afterSetListener", "(Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;)V", "", "appUserID", "Lcom/revenuecat/purchases/CustomerInfo;", "getCachedCustomerInfo", "(Ljava/lang/String;)Lcom/revenuecat/purchases/CustomerInfo;", "Lkotlin/Function0;", "action", "dispatch", "(LBm/a;)V", "customerInfo", "cacheAndNotifyListeners", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "notifyListeners", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Landroid/os/Handler;", "value", "updatedCustomerInfoListener", "Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "getUpdatedCustomerInfoListener", "()Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "setUpdatedCustomerInfoListener", "lastSentCustomerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CustomerInfoUpdateHandler {
    private final AppConfig appConfig;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTracker;
    private final Handler handler;
    private final IdentityManager identityManager;
    private CustomerInfo lastSentCustomerInfo;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private UpdatedCustomerInfoListener updatedCustomerInfoListener;

    public CustomerInfoUpdateHandler(DeviceCache deviceCache, IdentityManager identityManager, OfflineEntitlementsManager offlineEntitlementsManager, AppConfig appConfig, DiagnosticsTracker diagnosticsTracker, Handler handler) {
        AbstractC16544l.m18094g(deviceCache, "deviceCache");
        AbstractC16544l.m18094g(identityManager, "identityManager");
        AbstractC16544l.m18094g(offlineEntitlementsManager, "offlineEntitlementsManager");
        AbstractC16544l.m18094g(appConfig, "appConfig");
        AbstractC16544l.m18094g(handler, "handler");
        this.deviceCache = deviceCache;
        this.identityManager = identityManager;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.appConfig = appConfig;
        this.diagnosticsTracker = diagnosticsTracker;
        this.handler = handler;
    }

    private final void afterSetListener(UpdatedCustomerInfoListener listener) {
        CustomerInfo cachedCustomerInfo;
        if (listener != null) {
            LogWrapperKt.log(LogIntent.DEBUG, ConfigureStrings.LISTENER_SET);
            if (this.appConfig.getCustomEntitlementComputation() || (cachedCustomerInfo = getCachedCustomerInfo(this.identityManager.getCurrentAppUserID())) == null) {
                return;
            }
            notifyListeners(cachedCustomerInfo);
        }
    }

    private final void dispatch(InterfaceC1426a action) {
        if (AbstractC16544l.m18089b(Thread.currentThread(), this.handler.getLooper().getThread())) {
            action.invoke();
        } else {
            this.handler.post(new RunnableC12657a(action, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatch$lambda$5(InterfaceC1426a tmp0) {
        AbstractC16544l.m18094g(tmp0, "$tmp0");
        tmp0.invoke();
    }

    private final CustomerInfo getCachedCustomerInfo(String appUserID) {
        CustomerInfo customerInfo = this.offlineEntitlementsManager.get_offlineCustomerInfo();
        return customerInfo == null ? this.deviceCache.getCachedCustomerInfo(appUserID) : customerInfo;
    }

    public final void cacheAndNotifyListeners(CustomerInfo customerInfo) {
        AbstractC16544l.m18094g(customerInfo, "customerInfo");
        this.deviceCache.cacheCustomerInfo(this.identityManager.getCurrentAppUserID(), customerInfo);
        notifyListeners(customerInfo);
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.updatedCustomerInfoListener;
    }

    public final void notifyListeners(CustomerInfo customerInfo) {
        UpdatedCustomerInfoListener updatedCustomerInfoListener;
        CustomerInfo customerInfo2;
        DiagnosticsTracker diagnosticsTracker;
        AbstractC16544l.m18094g(customerInfo, "customerInfo");
        synchronized (this) {
            updatedCustomerInfoListener = this.updatedCustomerInfoListener;
            customerInfo2 = this.lastSentCustomerInfo;
        }
        UpdatedCustomerInfoListener updatedCustomerInfoListener2 = updatedCustomerInfoListener;
        if (!AbstractC16544l.m18089b(customerInfo2, customerInfo) && (diagnosticsTracker = this.diagnosticsTracker) != null) {
            diagnosticsTracker.trackCustomerInfoVerificationResultIfNeeded(customerInfo);
        }
        if (updatedCustomerInfoListener2 == null || AbstractC16544l.m18089b(customerInfo2, customerInfo)) {
            return;
        }
        if (customerInfo2 != null) {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.CUSTOMERINFO_UPDATED_NOTIFYING_LISTENER);
        } else {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.SENDING_LATEST_CUSTOMERINFO_TO_LISTENER);
        }
        synchronized (this) {
            this.lastSentCustomerInfo = customerInfo;
        }
        dispatch(new CustomerInfoUpdateHandler$notifyListeners$2$2(updatedCustomerInfoListener2, customerInfo));
    }

    public final void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        synchronized (this) {
            this.updatedCustomerInfoListener = updatedCustomerInfoListener;
        }
        afterSetListener(updatedCustomerInfoListener);
    }

    public /* synthetic */ CustomerInfoUpdateHandler(DeviceCache deviceCache, IdentityManager identityManager, OfflineEntitlementsManager offlineEntitlementsManager, AppConfig appConfig, DiagnosticsTracker diagnosticsTracker, Handler handler, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceCache, identityManager, offlineEntitlementsManager, appConfig, diagnosticsTracker, (i10 & 32) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
