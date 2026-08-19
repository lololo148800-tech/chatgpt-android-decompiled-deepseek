package com.revenuecat.purchases;

import android.app.Activity;
import android.content.Context;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.ConfigureStrings;
import java.net.URL;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p025An.C0644w;
import p571X9.AbstractC9393x3;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 82\u00020\u0001:\u00018B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0010\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001bJ'\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000bH\u0007¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\f¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u0011\u0010.\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u00100\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b/\u0010-R(\u00107\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00069"}, m18067d2 = {"Lcom/revenuecat/purchases/Purchases;", "", "Lcom/revenuecat/purchases/PurchasesOrchestrator;", "purchasesOrchestrator", "<init>", "(Lcom/revenuecat/purchases/PurchasesOrchestrator;)V", "Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "listener", "Lmm/C;", "getOfferings", "(Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;)V", "", "", "productIds", "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "callback", "getProducts", "(Ljava/util/List;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "Lcom/revenuecat/purchases/ProductType;", "type", "(Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "purchase", "(Lcom/revenuecat/purchases/PurchaseParams;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "close", "()V", "removeUpdatedCustomerInfoListener", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;)V", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "restorePurchases", "(Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "newAppUserID", "switchUser", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/PurchasesOrchestrator;", "getPurchasesOrchestrator$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/PurchasesOrchestrator;", "getAppUserID", "()Ljava/lang/String;", "appUserID", "getStorefrontCountryCode", "storefrontCountryCode", "Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "value", "getUpdatedCustomerInfoListener", "()Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "setUpdatedCustomerInfoListener", "(Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;)V", "updatedCustomerInfoListener", "Companion", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class Purchases {
    private static /* synthetic */ Purchases backingFieldSharedInstance;
    private final PurchasesOrchestrator purchasesOrchestrator;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String frameworkVersion = "8.6.0";

    @Metadata(m18066d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014R*\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010#\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u001d8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010*\u001a\u00020$2\u0006\u0010\u0016\u001a\u00020$8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b)\u0010\u0003\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u00100\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t8F@AX\u0087\u000e¢\u0006\u0012\u0012\u0004\b/\u0010\u0003\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R \u00101\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u0010\u0003\u001a\u0004\b3\u00104R.\u0010<\u001a\u0004\u0018\u0001062\b\u0010\u0016\u001a\u0004\u0018\u0001068F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b;\u0010\u0003\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010=\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b?\u0010\u0003\u001a\u0004\b=\u0010>R$\u0010@\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010,\"\u0004\bC\u0010.¨\u0006D"}, m18067d2 = {"Lcom/revenuecat/purchases/Purchases$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "apiKey", "appUserID", "Lcom/revenuecat/purchases/Purchases;", "configureInCustomEntitlementsComputationMode", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/Purchases;", "", "Lcom/revenuecat/purchases/models/BillingFeature;", "features", "Lcom/revenuecat/purchases/interfaces/Callback;", "", "callback", "Lmm/C;", "canMakePayments", "(Landroid/content/Context;Ljava/util/List;Lcom/revenuecat/purchases/interfaces/Callback;)V", "Lcom/revenuecat/purchases/common/PlatformInfo;", "value", "getPlatformInfo", "()Lcom/revenuecat/purchases/common/PlatformInfo;", "setPlatformInfo", "(Lcom/revenuecat/purchases/common/PlatformInfo;)V", "getPlatformInfo$annotations", "platformInfo", "Lcom/revenuecat/purchases/LogLevel;", "getLogLevel", "()Lcom/revenuecat/purchases/LogLevel;", "setLogLevel", "(Lcom/revenuecat/purchases/LogLevel;)V", "getLogLevel$annotations", "logLevel", "Lcom/revenuecat/purchases/LogHandler;", "getLogHandler", "()Lcom/revenuecat/purchases/LogHandler;", "setLogHandler", "(Lcom/revenuecat/purchases/LogHandler;)V", "getLogHandler$annotations", "logHandler", "getSharedInstance", "()Lcom/revenuecat/purchases/Purchases;", "setSharedInstance$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/Purchases;)V", "getSharedInstance$annotations", "sharedInstance", "frameworkVersion", "Ljava/lang/String;", "getFrameworkVersion", "()Ljava/lang/String;", "getFrameworkVersion$annotations", "Ljava/net/URL;", "getProxyURL", "()Ljava/net/URL;", "setProxyURL", "(Ljava/net/URL;)V", "getProxyURL$annotations", "proxyURL", "isConfigured", "()Z", "isConfigured$annotations", "backingFieldSharedInstance", "Lcom/revenuecat/purchases/Purchases;", "getBackingFieldSharedInstance$purchases_customEntitlementComputationRelease", "setBackingFieldSharedInstance$purchases_customEntitlementComputationRelease", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void canMakePayments$default(Companion companion, Context context, List list, Callback callback, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                list = C17689w.f56480Y;
            }
            companion.canMakePayments(context, list, callback);
        }

        public static /* synthetic */ void getFrameworkVersion$annotations() {
        }

        public static /* synthetic */ void getLogHandler$annotations() {
        }

        public static /* synthetic */ void getLogLevel$annotations() {
        }

        public static /* synthetic */ void getPlatformInfo$annotations() {
        }

        public static /* synthetic */ void getProxyURL$annotations() {
        }

        public static /* synthetic */ void getSharedInstance$annotations() {
        }

        public static /* synthetic */ void isConfigured$annotations() {
        }

        public final void canMakePayments(Context context, Callback<Boolean> callback) {
            AbstractC16544l.m18094g(context, "context");
            AbstractC16544l.m18094g(callback, "callback");
            canMakePayments$default(this, context, null, callback, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Purchases configureInCustomEntitlementsComputationMode(Context context, String apiKey, String appUserID) {
            AbstractC16544l.m18094g(context, "context");
            AbstractC16544l.m18094g(apiKey, "apiKey");
            AbstractC16544l.m18094g(appUserID, "appUserID");
            if (isConfigured()) {
                LogUtilsKt.infoLog(ConfigureStrings.INSTANCE_ALREADY_EXISTS);
            }
            PurchasesConfiguration purchasesConfigurationBuild = new PurchasesConfiguration.Builder(context, apiKey).appUserID(appUserID).dangerousSettings(new DangerousSettings(false, true, 1, null)).pendingTransactionsForPrepaidPlansEnabled(true).build();
            Purchases purchasesCreatePurchases = new PurchasesFactory(null, 1, 0 == true ? 1 : 0).createPurchases(purchasesConfigurationBuild, getPlatformInfo(), getProxyURL(), (120 & 8) != 0 ? null : null, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : false, (120 & 64) != 0 ? false : false);
            Purchases.INSTANCE.setSharedInstance$purchases_customEntitlementComputationRelease(purchasesCreatePurchases);
            return purchasesCreatePurchases;
        }

        /* JADX INFO: renamed from: getBackingFieldSharedInstance$purchases_customEntitlementComputationRelease */
        public final Purchases m14418x97ccee5a() {
            return Purchases.backingFieldSharedInstance;
        }

        public final String getFrameworkVersion() {
            return Purchases.frameworkVersion;
        }

        public final synchronized LogHandler getLogHandler() {
            return PurchasesOrchestrator.INSTANCE.getLogHandler();
        }

        public final LogLevel getLogLevel() {
            return PurchasesOrchestrator.INSTANCE.getLogLevel();
        }

        public final PlatformInfo getPlatformInfo() {
            return PurchasesOrchestrator.INSTANCE.getPlatformInfo();
        }

        public final URL getProxyURL() {
            return PurchasesOrchestrator.INSTANCE.getProxyURL();
        }

        public final Purchases getSharedInstance() {
            Purchases purchasesM14418x97ccee5a = m14418x97ccee5a();
            if (purchasesM14418x97ccee5a != null) {
                return purchasesM14418x97ccee5a;
            }
            throw new C0644w(ConfigureStrings.NO_SINGLETON_INSTANCE);
        }

        public final boolean isConfigured() {
            return m14418x97ccee5a() != null;
        }

        /* JADX INFO: renamed from: setBackingFieldSharedInstance$purchases_customEntitlementComputationRelease */
        public final void m14419x3f6ef66(Purchases purchases) {
            Purchases.backingFieldSharedInstance = purchases;
        }

        public final synchronized void setLogHandler(LogHandler value) {
            AbstractC16544l.m18094g(value, "value");
            PurchasesOrchestrator.INSTANCE.setLogHandler(value);
        }

        public final void setLogLevel(LogLevel value) {
            AbstractC16544l.m18094g(value, "value");
            PurchasesOrchestrator.INSTANCE.setLogLevel(value);
        }

        public final void setPlatformInfo(PlatformInfo value) {
            AbstractC16544l.m18094g(value, "value");
            PurchasesOrchestrator.INSTANCE.setPlatformInfo(value);
        }

        public final void setProxyURL(URL url) {
            PurchasesOrchestrator.INSTANCE.setProxyURL(url);
        }

        public final void setSharedInstance$purchases_customEntitlementComputationRelease(Purchases value) {
            AbstractC16544l.m18094g(value, "value");
            Purchases purchasesM14418x97ccee5a = m14418x97ccee5a();
            if (purchasesM14418x97ccee5a != null) {
                purchasesM14418x97ccee5a.close();
            }
            m14419x3f6ef66(value);
        }

        private Companion() {
        }

        public final void canMakePayments(Context context, List<? extends BillingFeature> features, Callback<Boolean> callback) {
            AbstractC16544l.m18094g(context, "context");
            AbstractC16544l.m18094g(features, "features");
            AbstractC16544l.m18094g(callback, "callback");
            if (getSharedInstance().getPurchasesOrchestrator().getAppConfig().getStore() == Store.PLAY_STORE) {
                PurchasesOrchestrator.INSTANCE.canMakePayments(context, features, callback);
            } else {
                LogWrapperKt.log(LogIntent.RC_ERROR, BillingStrings.CANNOT_CALL_CAN_MAKE_PAYMENTS);
                callback.onReceived(Boolean.TRUE);
            }
        }
    }

    public Purchases(PurchasesOrchestrator purchasesOrchestrator) {
        AbstractC16544l.m18094g(purchasesOrchestrator, "purchasesOrchestrator");
        this.purchasesOrchestrator = purchasesOrchestrator;
    }

    public static final void canMakePayments(Context context, Callback<Boolean> callback) {
        INSTANCE.canMakePayments(context, callback);
    }

    public static final Purchases configureInCustomEntitlementsComputationMode(Context context, String str, String str2) {
        return INSTANCE.configureInCustomEntitlementsComputationMode(context, str, str2);
    }

    public static final String getFrameworkVersion() {
        return INSTANCE.getFrameworkVersion();
    }

    public static final synchronized LogHandler getLogHandler() {
        return INSTANCE.getLogHandler();
    }

    public static final LogLevel getLogLevel() {
        return INSTANCE.getLogLevel();
    }

    public static final PlatformInfo getPlatformInfo() {
        return INSTANCE.getPlatformInfo();
    }

    public static /* synthetic */ void getProducts$default(Purchases purchases, List list, ProductType productType, GetStoreProductsCallback getStoreProductsCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            productType = null;
        }
        purchases.getProducts(list, productType, getStoreProductsCallback);
    }

    public static final URL getProxyURL() {
        return INSTANCE.getProxyURL();
    }

    public static final Purchases getSharedInstance() {
        return INSTANCE.getSharedInstance();
    }

    public static final boolean isConfigured() {
        return INSTANCE.isConfigured();
    }

    public static final synchronized void setLogHandler(LogHandler logHandler) {
        INSTANCE.setLogHandler(logHandler);
    }

    public static final void setLogLevel(LogLevel logLevel) {
        INSTANCE.setLogLevel(logLevel);
    }

    public static final void setPlatformInfo(PlatformInfo platformInfo) {
        INSTANCE.setPlatformInfo(platformInfo);
    }

    public static final void setProxyURL(URL url) {
        INSTANCE.setProxyURL(url);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showInAppMessagesIfNeeded$default(Purchases purchases, Activity activity, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = AbstractC9393x3.m9974d(InAppMessageType.BILLING_ISSUES);
        }
        purchases.showInAppMessagesIfNeeded(activity, list);
    }

    public final void close() {
        this.purchasesOrchestrator.close();
    }

    public final synchronized String getAppUserID() {
        return this.purchasesOrchestrator.getAppUserID();
    }

    public final void getOfferings(ReceiveOfferingsCallback listener) {
        AbstractC16544l.m18094g(listener, "listener");
        PurchasesOrchestrator.getOfferings$default(this.purchasesOrchestrator, listener, false, 2, null);
    }

    public final void getProducts(List<String> productIds, GetStoreProductsCallback callback) {
        AbstractC16544l.m18094g(productIds, "productIds");
        AbstractC16544l.m18094g(callback, "callback");
        getProducts(productIds, null, callback);
    }

    /* JADX INFO: renamed from: getPurchasesOrchestrator$purchases_customEntitlementComputationRelease, reason: from getter */
    public final /* synthetic */ PurchasesOrchestrator getPurchasesOrchestrator() {
        return this.purchasesOrchestrator;
    }

    public final synchronized String getStorefrontCountryCode() {
        return this.purchasesOrchestrator.getStorefrontCountryCode();
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.purchasesOrchestrator.getUpdatedCustomerInfoListener();
    }

    public final void purchase(PurchaseParams purchaseParams, PurchaseCallback callback) {
        AbstractC16544l.m18094g(purchaseParams, "purchaseParams");
        AbstractC16544l.m18094g(callback, "callback");
        this.purchasesOrchestrator.purchase(purchaseParams, callback);
    }

    public final void removeUpdatedCustomerInfoListener() {
        this.purchasesOrchestrator.removeUpdatedCustomerInfoListener();
    }

    public final void restorePurchases(ReceiveCustomerInfoCallback callback) {
        AbstractC16544l.m18094g(callback, "callback");
        this.purchasesOrchestrator.restorePurchases(callback);
    }

    public final synchronized void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        this.purchasesOrchestrator.setUpdatedCustomerInfoListener(updatedCustomerInfoListener);
    }

    public final void showInAppMessagesIfNeeded(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        showInAppMessagesIfNeeded$default(this, activity, null, 2, null);
    }

    public final void switchUser(String newAppUserID) {
        AbstractC16544l.m18094g(newAppUserID, "newAppUserID");
        this.purchasesOrchestrator.switchUser(newAppUserID);
    }

    public static final void canMakePayments(Context context, List<? extends BillingFeature> list, Callback<Boolean> callback) {
        INSTANCE.canMakePayments(context, list, callback);
    }

    public final void getProducts(List<String> productIds, ProductType type, GetStoreProductsCallback callback) {
        AbstractC16544l.m18094g(productIds, "productIds");
        AbstractC16544l.m18094g(callback, "callback");
        this.purchasesOrchestrator.getProducts(productIds, type, callback);
    }

    public final void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> inAppMessageTypes) {
        AbstractC16544l.m18094g(activity, "activity");
        AbstractC16544l.m18094g(inAppMessageTypes, "inAppMessageTypes");
        this.purchasesOrchestrator.showInAppMessagesIfNeeded(activity, inAppMessageTypes);
    }
}
