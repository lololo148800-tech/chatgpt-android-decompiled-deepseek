package com.revenuecat.purchases;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.preference.PreferenceManager;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsFileHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.networking.ETagManager;
import com.revenuecat.purchases.common.offerings.OfferingsCache;
import com.revenuecat.purchases.common.offerings.OfferingsFactory;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.common.offlineentitlements.OfflineCustomerInfoCalculator;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.offlineentitlements.PurchasedProductsFetcher;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.paywalls.events.PaywallEventsManager;
import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import com.revenuecat.purchases.utils.CoilImageDownloader;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.OfferingImagePreDownloader;
import java.net.URL;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001/B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJQ\u0010)\u001a\u00020(2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010%\u001a\u00020\u00162\b\b\u0002\u0010&\u001a\u00020\u00162\b\b\u0002\u0010'\u001a\u00020\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.¨\u00060"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesFactory;", "", "Lcom/revenuecat/purchases/APIKeyValidator;", "apiKeyValidator", "<init>", "(Lcom/revenuecat/purchases/APIKeyValidator;)V", "Landroid/content/Context;", "context", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/common/Dispatcher;", "eventsDispatcher", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventsManager;", "createPaywallEventsManager", "(Landroid/content/Context;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/Backend;)Lcom/revenuecat/purchases/paywalls/events/PaywallEventsManager;", "Landroid/app/Application;", "getApplication", "(Landroid/content/Context;)Landroid/app/Application;", "", "permission", "", "hasPermission", "(Landroid/content/Context;Ljava/lang/String;)Z", "Ljava/util/concurrent/ExecutorService;", "createDefaultExecutor", "()Ljava/util/concurrent/ExecutorService;", "createEventsExecutor", "Lcom/revenuecat/purchases/PurchasesConfiguration;", "configuration", "Lcom/revenuecat/purchases/common/PlatformInfo;", "platformInfo", "Ljava/net/URL;", "proxyURL", "Lcom/revenuecat/purchases/common/BillingAbstract;", "overrideBillingAbstract", "forceServerErrors", "forceSigningError", "runningIntegrationTests", "Lcom/revenuecat/purchases/Purchases;", "createPurchases", "(Lcom/revenuecat/purchases/PurchasesConfiguration;Lcom/revenuecat/purchases/common/PlatformInfo;Ljava/net/URL;Lcom/revenuecat/purchases/common/BillingAbstract;ZZZ)Lcom/revenuecat/purchases/Purchases;", "Lmm/C;", "validateConfiguration", "(Lcom/revenuecat/purchases/PurchasesConfiguration;)V", "Lcom/revenuecat/purchases/APIKeyValidator;", "LowPriorityThreadFactory", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PurchasesFactory {
    private final APIKeyValidator apiKeyValidator;

    @Metadata(m18066d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesFactory$LowPriorityThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "threadName", "", "(Ljava/lang/String;)V", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class LowPriorityThreadFactory implements ThreadFactory {
        private final String threadName;

        public LowPriorityThreadFactory(String threadName) {
            AbstractC16544l.m18094g(threadName, "threadName");
            this.threadName = threadName;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void newThread$lambda$1(Runnable runnable) {
            if (runnable != null) {
                Process.setThreadPriority(19);
                runnable.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r6) {
            return new Thread(new RunnableC12657a(r6, 4), this.threadName);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesFactory$createPaywallEventsManager$1 */
    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class C126171 extends AbstractC16541i implements InterfaceC1436k {
        public C126171(Object obj) {
            super(1, 0, PaywallStoredEvent.Companion.class, obj, "fromString", "fromString(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;");
        }

        @Override // p049Bm.InterfaceC1436k
        public final PaywallStoredEvent invoke(String p10) {
            AbstractC16544l.m18094g(p10, "p0");
            return ((PaywallStoredEvent.Companion) this.receiver).fromString(p10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PurchasesFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final ExecutorService createDefaultExecutor() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        AbstractC16544l.m18093f(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    private final ExecutorService createEventsExecutor() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new LowPriorityThreadFactory("revenuecat-events-thread"));
        AbstractC16544l.m18093f(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduled…venuecat-events-thread\"))");
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    private final PaywallEventsManager createPaywallEventsManager(Context context, IdentityManager identityManager, Dispatcher eventsDispatcher, Backend backend) {
        if (AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            return new PaywallEventsManager(new EventsFileHelper(new FileHelper(context), PaywallEventsManager.PAYWALL_EVENTS_FILE_PATH, new C126171(PaywallStoredEvent.INSTANCE)), identityManager, eventsDispatcher, backend);
        }
        LogUtilsKt.debugLog("Paywall events are only supported on Android N or newer.");
        return null;
    }

    private final Application getApplication(Context context) {
        Context applicationContext = context.getApplicationContext();
        AbstractC16544l.m18092e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return (Application) applicationContext;
    }

    private final boolean hasPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Purchases createPurchases(PurchasesConfiguration configuration, PlatformInfo platformInfo, URL proxyURL, BillingAbstract overrideBillingAbstract, boolean forceServerErrors, boolean forceSigningError, boolean runningIntegrationTests) {
        DiagnosticsHelper diagnosticsHelper;
        DiagnosticsFileHelper diagnosticsFileHelper;
        DiagnosticsTracker diagnosticsTracker;
        AbstractC16544l.m18094g(configuration, "configuration");
        AbstractC16544l.m18094g(platformInfo, "platformInfo");
        validateConfiguration(configuration);
        Application application = getApplication(configuration.getContext());
        AppConfig appConfig = new AppConfig(configuration.getContext(), configuration.getPurchasesAreCompletedBy(), configuration.getShowInAppMessagesAutomatically(), platformInfo, proxyURL, configuration.getStore(), configuration.getDangerousSettings(), runningIntegrationTests, forceServerErrors, forceSigningError);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(application);
        ETagManager eTagManager = new ETagManager(configuration.getContext(), null, null, 6, null);
        Dispatcher dispatcher = new Dispatcher(createDefaultExecutor(), null, runningIntegrationTests, 2, null);
        ExecutorService service = configuration.getService();
        if (service == null) {
            service = createDefaultExecutor();
        }
        Dispatcher dispatcher2 = new Dispatcher(service, null, runningIntegrationTests, 2, null);
        Dispatcher dispatcher3 = new Dispatcher(createEventsExecutor(), null, runningIntegrationTests, 2, null);
        if (configuration.getDiagnosticsEnabled() && AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            DiagnosticsFileHelper diagnosticsFileHelper2 = new DiagnosticsFileHelper(new FileHelper(configuration.getContext()));
            DiagnosticsHelper diagnosticsHelper2 = new DiagnosticsHelper(configuration.getContext(), diagnosticsFileHelper2, null, 4, null);
            diagnosticsFileHelper = diagnosticsFileHelper2;
            diagnosticsHelper = diagnosticsHelper2;
            diagnosticsTracker = new DiagnosticsTracker(appConfig, diagnosticsFileHelper2, diagnosticsHelper2, dispatcher3);
        } else {
            if (configuration.getDiagnosticsEnabled()) {
                LogUtilsKt.warnLog("Diagnostics are only supported on Android N or newer.");
            }
            diagnosticsHelper = null;
            diagnosticsFileHelper = null;
            diagnosticsTracker = null;
        }
        SigningManager signingManager = new SigningManager(SignatureVerificationMode.Companion.fromEntitlementVerificationMode$default(SignatureVerificationMode.INSTANCE, configuration.getVerificationMode(), null, 2, null), appConfig, configuration.getApiKey());
        AbstractC16544l.m18093f(prefs, "prefs");
        DeviceCache deviceCache = new DeviceCache(prefs, configuration.getApiKey(), null, 4, null);
        HTTPClient hTTPClient = new HTTPClient(appConfig, eTagManager, diagnosticsTracker, signingManager, deviceCache, null, null, 96, 0 == true ? 1 : 0);
        BackendHelper backendHelper = new BackendHelper(configuration.getApiKey(), dispatcher2, appConfig, hTTPClient);
        Backend backend = new Backend(appConfig, dispatcher2, dispatcher3, hTTPClient, backendHelper);
        PurchasesStateCache purchasesStateCache = new PurchasesStateCache(new PurchasesState(null, null, null, false, false, 31, 0 == true ? 1 : 0));
        BillingAbstract billingAbstractCreateBilling = overrideBillingAbstract == null ? BillingFactory.INSTANCE.createBilling(configuration.getStore(), application, backendHelper, deviceCache, PurchasesAreCompletedByKt.getFinishTransactions(configuration.getPurchasesAreCompletedBy()), diagnosticsTracker, purchasesStateCache, configuration.getPendingTransactionsForPrepaidPlansEnabled()) : overrideBillingAbstract;
        SubscriberAttributesPoster subscriberAttributesPoster = new SubscriberAttributesPoster(backendHelper);
        DeviceIdentifiersFetcher deviceIdentifiersFetcherCreateAttributionFetcher = AttributionFetcherFactory.INSTANCE.createAttributionFetcher(configuration.getStore(), dispatcher2);
        SubscriberAttributesCache subscriberAttributesCache = new SubscriberAttributesCache(deviceCache);
        SubscriberAttributesManager subscriberAttributesManager = new SubscriberAttributesManager(subscriberAttributesCache, subscriberAttributesPoster, deviceIdentifiersFetcherCreateAttributionFetcher);
        OfflineEntitlementsManager offlineEntitlementsManager = new OfflineEntitlementsManager(r47, new OfflineCustomerInfoCalculator(new PurchasedProductsFetcher(deviceCache, billingAbstractCreateBilling, null, 4, null), appConfig, diagnosticsTracker, null, 8, null), deviceCache, appConfig, diagnosticsTracker);
        OfferingsCache offeringsCache = new OfferingsCache(deviceCache, null, null, 6, null);
        IdentityManager identityManager = new IdentityManager(deviceCache, subscriberAttributesCache, subscriberAttributesManager, offeringsCache, r47, offlineEntitlementsManager, dispatcher);
        BillingAbstract billingAbstract = billingAbstractCreateBilling;
        CustomerInfoUpdateHandler customerInfoUpdateHandler = new CustomerInfoUpdateHandler(deviceCache, identityManager, offlineEntitlementsManager, appConfig, diagnosticsTracker, null, 32, null);
        PaywallPresentedCache paywallPresentedCache = new PaywallPresentedCache();
        PostReceiptHelper postReceiptHelper = new PostReceiptHelper(appConfig, r47, billingAbstract, customerInfoUpdateHandler, deviceCache, subscriberAttributesManager, offlineEntitlementsManager, paywallPresentedCache);
        PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper = new PostTransactionWithProductDetailsHelper(billingAbstract, postReceiptHelper);
        PostPendingTransactionsHelper postPendingTransactionsHelper = new PostPendingTransactionsHelper(appConfig, deviceCache, billingAbstract, dispatcher2, identityManager, postTransactionWithProductDetailsHelper);
        CustomerInfoHelper customerInfoHelper = new CustomerInfoHelper(deviceCache, r47, offlineEntitlementsManager, customerInfoUpdateHandler, postPendingTransactionsHelper, null, 32, null);
        OfferingParser offeringParserCreateOfferingParser = OfferingParserFactory.INSTANCE.createOfferingParser(configuration.getStore());
        DiagnosticsSynchronizer diagnosticsSynchronizer = (diagnosticsFileHelper == null || diagnosticsHelper == null || diagnosticsTracker == null || !AndroidVersionUtilsKt.isAndroidNOrNewer()) ? null : new DiagnosticsSynchronizer(diagnosticsHelper, diagnosticsFileHelper, diagnosticsTracker, backend, dispatcher3);
        SyncPurchasesHelper syncPurchasesHelper = new SyncPurchasesHelper(billingAbstract, identityManager, customerInfoHelper, postReceiptHelper);
        OfferingsManager offeringsManager = new OfferingsManager(offeringsCache, r47, new OfferingsFactory(billingAbstract, offeringParserCreateOfferingParser, dispatcher), new OfferingImagePreDownloader(false, new CoilImageDownloader(application), 1, null), null, 16, null);
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, ConfigureStrings.DEBUG_ENABLED);
        LogWrapperKt.log(logIntent, String.format(ConfigureStrings.SDK_VERSION, Arrays.copyOf(new Object[]{Purchases.INSTANCE.getFrameworkVersion()}, 1)));
        AbstractC12107L1.m13831v(new Object[]{appConfig.getPackageName()}, 1, ConfigureStrings.PACKAGE_NAME, logIntent);
        LogWrapperKt.log(LogIntent.USER, String.format(ConfigureStrings.INITIAL_APP_USER_ID, Arrays.copyOf(new Object[]{configuration.getAppUserID()}, 1)));
        LogWrapperKt.log(logIntent, String.format(ConfigureStrings.VERIFICATION_MODE_SELECTED, Arrays.copyOf(new Object[]{configuration.getVerificationMode().name()}, 1)));
        return new Purchases(new PurchasesOrchestrator(application, configuration.getAppUserID(), r47, billingAbstract, deviceCache, identityManager, subscriberAttributesManager, appConfig, customerInfoHelper, customerInfoUpdateHandler, diagnosticsSynchronizer, offlineEntitlementsManager, postReceiptHelper, postTransactionWithProductDetailsHelper, postPendingTransactionsHelper, syncPurchasesHelper, offeringsManager, createPaywallEventsManager(application, identityManager, dispatcher3, r47), paywallPresentedCache, purchasesStateCache, null, dispatcher, 1048576, null));
    }

    public final void validateConfiguration(PurchasesConfiguration configuration) {
        AbstractC16544l.m18094g(configuration, "configuration");
        if (!hasPermission(configuration.getContext(), "android.permission.INTERNET")) {
            throw new IllegalArgumentException("Purchases requires INTERNET permission.");
        }
        if (AbstractC21322p.m21681O(configuration.getApiKey())) {
            throw new IllegalArgumentException("API key must be set. Get this from the RevenueCat web app");
        }
        if (!(configuration.getContext().getApplicationContext() instanceof Application)) {
            throw new IllegalArgumentException("Needs an application context.");
        }
        this.apiKeyValidator.validateAndLog(configuration.getApiKey(), configuration.getStore());
    }

    public PurchasesFactory(APIKeyValidator apiKeyValidator) {
        AbstractC16544l.m18094g(apiKeyValidator, "apiKeyValidator");
        this.apiKeyValidator = apiKeyValidator;
    }

    public /* synthetic */ PurchasesFactory(APIKeyValidator aPIKeyValidator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new APIKeyValidator() : aPIKeyValidator);
    }
}
