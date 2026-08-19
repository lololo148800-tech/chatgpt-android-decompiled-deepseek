package com.revenuecat.purchases.identity;

import android.content.SharedPreferences;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offerings.OfferingsCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.strings.IdentityStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p003A1.RunnableC0156C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1113xn.C21319m;
import p228J.AbstractC3794B0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0012H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0012H\u0002¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u00020\u00152\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b-\u0010(JC\u00104\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00122\u0018\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00150/2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001501¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u0012¢\u0006\u0004\b6\u0010(J#\u00108\u001a\u00020\u00152\u0014\u00107\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000102\u0012\u0004\u0012\u00020\u001501¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u001f¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010@R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010AR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0011\u0010G\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bF\u0010%¨\u0006H"}, m18067d2 = {"Lcom/revenuecat/purchases/identity/IdentityManager;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "subscriberAttributesCache", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "subscriberAttributesManager", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "offeringsCache", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;Lcom/revenuecat/purchases/common/offerings/OfferingsCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/common/Dispatcher;)V", "", "oldAppUserId", "newAppUserId", "Lmm/C;", "copySubscriberAttributesToNewUserIfOldIsAnonymous", "(Ljava/lang/String;Ljava/lang/String;)V", "appUserID", "Landroid/content/SharedPreferences$Editor;", "cacheEditor", "invalidateCustomerInfoAndETagCacheIfNeeded", "(Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)V", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "", "shouldInvalidateCustomerInfoAndETagCache", "(Lcom/revenuecat/purchases/CustomerInfo;)Z", "isUserIDAnonymous", "(Ljava/lang/String;)Z", "generateRandomID", "()Ljava/lang/String;", "newUserID", "resetAndSaveUserID", "(Ljava/lang/String;)V", "Lkotlin/Function0;", "command", "enqueue", "(LBm/a;)V", "configure", "newAppUserID", "Lkotlin/Function2;", "onSuccess", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "logIn", "(Ljava/lang/String;LBm/n;LBm/k;)V", "switchUser", "completion", "logOut", "(LBm/k;)V", "currentUserIsAnonymous", "()Z", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lxn/m;", "anonymousIdRegex", "Lxn/m;", "getCurrentAppUserID", "currentAppUserID", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class IdentityManager {
    private final C21319m anonymousIdRegex;
    private final Backend backend;
    private final DeviceCache deviceCache;
    private final Dispatcher dispatcher;
    private final OfferingsCache offeringsCache;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final SubscriberAttributesCache subscriberAttributesCache;
    private final SubscriberAttributesManager subscriberAttributesManager;

    /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$configure$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127501 extends AbstractC16546n implements InterfaceC1426a {
        public C127501() {
            super(0);
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22516invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22516invoke() {
            IdentityManager.this.deviceCache.cleanupOldAttributionData();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$logIn$2 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127512 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ String $newAppUserID;
        final /* synthetic */ String $oldAppUserID;
        final /* synthetic */ InterfaceC1436k $onError;
        final /* synthetic */ InterfaceC1439n $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$logIn$2$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "", "created", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;Z)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1439n {
            final /* synthetic */ String $newAppUserID;
            final /* synthetic */ String $oldAppUserID;
            final /* synthetic */ InterfaceC1439n $onSuccess;
            final /* synthetic */ IdentityManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(IdentityManager identityManager, InterfaceC1439n interfaceC1439n, String str, String str2) {
                super(2);
                this.this$0 = identityManager;
                this.$onSuccess = interfaceC1439n;
                this.$newAppUserID = str;
                this.$oldAppUserID = str2;
            }

            @Override // p049Bm.InterfaceC1439n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((CustomerInfo) obj, ((Boolean) obj2).booleanValue());
                return C17296C.f55119a;
            }

            public final void invoke(CustomerInfo customerInfo, boolean z6) {
                AbstractC16544l.m18094g(customerInfo, "customerInfo");
                IdentityManager identityManager = this.this$0;
                String str = this.$newAppUserID;
                String str2 = this.$oldAppUserID;
                synchronized (identityManager) {
                    LogWrapperKt.log(LogIntent.USER, String.format(IdentityStrings.LOG_IN_SUCCESSFUL, Arrays.copyOf(new Object[]{str, Boolean.valueOf(z6)}, 2)));
                    identityManager.deviceCache.clearCachesForAppUserID(str2);
                    identityManager.offeringsCache.clearCache();
                    identityManager.subscriberAttributesCache.clearSubscriberAttributesIfSyncedForSubscriber(str2);
                    identityManager.deviceCache.cacheAppUserID(str);
                    identityManager.deviceCache.cacheCustomerInfo(str, customerInfo);
                    identityManager.copySubscriberAttributesToNewUserIfOldIsAnonymous(str2, str);
                    identityManager.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
                }
                this.$onSuccess.invoke(customerInfo, Boolean.valueOf(z6));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127512(String str, String str2, InterfaceC1436k interfaceC1436k, InterfaceC1439n interfaceC1439n) {
            super(0);
            this.$oldAppUserID = str;
            this.$newAppUserID = str2;
            this.$onError = interfaceC1436k;
            this.$onSuccess = interfaceC1439n;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22517invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22517invoke() {
            Backend backend = IdentityManager.this.backend;
            String str = this.$oldAppUserID;
            String str2 = this.$newAppUserID;
            backend.logIn(str, str2, new AnonymousClass1(IdentityManager.this, this.$onSuccess, str2, str), this.$onError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$logOut$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127521 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ InterfaceC1436k $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127521(InterfaceC1436k interfaceC1436k) {
            super(0);
            this.$completion = interfaceC1436k;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22518invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22518invoke() {
            IdentityManager identityManager = IdentityManager.this;
            identityManager.resetAndSaveUserID(identityManager.generateRandomID());
            LogWrapperKt.log(LogIntent.USER, IdentityStrings.LOG_OUT_SUCCESSFUL);
            this.$completion.invoke(null);
        }
    }

    public IdentityManager(DeviceCache deviceCache, SubscriberAttributesCache subscriberAttributesCache, SubscriberAttributesManager subscriberAttributesManager, OfferingsCache offeringsCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, Dispatcher dispatcher) {
        AbstractC16544l.m18094g(deviceCache, "deviceCache");
        AbstractC16544l.m18094g(subscriberAttributesCache, "subscriberAttributesCache");
        AbstractC16544l.m18094g(subscriberAttributesManager, "subscriberAttributesManager");
        AbstractC16544l.m18094g(offeringsCache, "offeringsCache");
        AbstractC16544l.m18094g(backend, "backend");
        AbstractC16544l.m18094g(offlineEntitlementsManager, "offlineEntitlementsManager");
        AbstractC16544l.m18094g(dispatcher, "dispatcher");
        this.deviceCache = deviceCache;
        this.subscriberAttributesCache = subscriberAttributesCache;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.offeringsCache = offeringsCache;
        this.backend = backend;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.dispatcher = dispatcher;
        this.anonymousIdRegex = new C21319m("^\\$RCAnonymousID:([a-f0-9]{32})$");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copySubscriberAttributesToNewUserIfOldIsAnonymous(String oldAppUserId, String newAppUserId) {
        if (isUserIDAnonymous(oldAppUserId)) {
            this.subscriberAttributesManager.copyUnsyncedSubscriberAttributes(oldAppUserId, newAppUserId);
        }
    }

    private final synchronized void enqueue(InterfaceC1426a command) {
        this.dispatcher.enqueue(new RunnableC0156C(6, command), Delay.NONE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$3(InterfaceC1426a command) {
        AbstractC16544l.m18094g(command, "$command");
        command.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String generateRandomID() {
        String strM4498w = AbstractC3794B0.m4498w("randomUUID().toString()");
        Locale locale = Locale.ROOT;
        String strM21731r = AbstractC21329w.m21731r(AbstractC0168G.m534w(locale, "ROOT", strM4498w, locale, "this as java.lang.String).toLowerCase(locale)"), "-", "");
        LogWrapperKt.log(LogIntent.USER, IdentityStrings.SETTING_NEW_ANON_ID);
        return "$RCAnonymousID:".concat(strM21731r);
    }

    private final void invalidateCustomerInfoAndETagCacheIfNeeded(String appUserID, SharedPreferences.Editor cacheEditor) {
        if (!AbstractC16544l.m18089b(this.backend.getVerificationMode(), SignatureVerificationMode.Disabled.INSTANCE) && shouldInvalidateCustomerInfoAndETagCache(this.deviceCache.getCachedCustomerInfo(appUserID))) {
            LogUtilsKt.infoLog(IdentityStrings.INVALIDATING_CACHED_CUSTOMER_INFO);
            this.deviceCache.clearCustomerInfoCache(appUserID, cacheEditor);
            this.backend.clearCaches();
        }
    }

    private final boolean isUserIDAnonymous(String appUserID) {
        return this.anonymousIdRegex.m21664d(appUserID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void resetAndSaveUserID(String newUserID) {
        this.deviceCache.clearCachesForAppUserID(getCurrentAppUserID());
        this.offeringsCache.clearCache();
        this.subscriberAttributesCache.clearSubscriberAttributesIfSyncedForSubscriber(getCurrentAppUserID());
        this.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
        this.deviceCache.cacheAppUserID(newUserID);
        this.backend.clearCaches();
    }

    private final boolean shouldInvalidateCustomerInfoAndETagCache(CustomerInfo customerInfo) {
        return (customerInfo == null || customerInfo.getEntitlements().getVerification() != VerificationResult.NOT_REQUESTED || AbstractC16544l.m18089b(this.backend.getVerificationMode(), SignatureVerificationMode.Disabled.INSTANCE)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0021 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:5:0x0004, B:7:0x000a, B:11:0x0016, B:22:0x0035, B:17:0x0021, B:19:0x0029, B:21:0x0031), top: B:27:0x0004 }] */
    public final synchronized void configure(String appUserID) {
        if (appUserID != null) {
            try {
                if (AbstractC21322p.m21681O(appUserID)) {
                    LogWrapperKt.log(LogIntent.WARNING, IdentityStrings.EMPTY_APP_USER_ID_WILL_BECOME_ANONYMOUS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (appUserID == null) {
            appUserID = this.deviceCache.getCachedAppUserID();
            if (appUserID == null && (appUserID = this.deviceCache.getLegacyCachedAppUserID()) == null) {
                appUserID = generateRandomID();
            }
        } else {
            if (AbstractC21322p.m21681O(appUserID)) {
                appUserID = null;
            }
            if (appUserID == null) {
                appUserID = this.deviceCache.getCachedAppUserID();
                if (appUserID == null) {
                    appUserID = generateRandomID();
                }
            }
        }
        LogWrapperKt.log(LogIntent.USER, String.format(IdentityStrings.IDENTIFYING_APP_USER_ID, Arrays.copyOf(new Object[]{appUserID}, 1)));
        SharedPreferences.Editor editorStartEditing = this.deviceCache.startEditing();
        this.deviceCache.cacheAppUserID(appUserID, editorStartEditing);
        this.subscriberAttributesCache.cleanUpSubscriberAttributeCache(appUserID, editorStartEditing);
        invalidateCustomerInfoAndETagCacheIfNeeded(appUserID, editorStartEditing);
        editorStartEditing.apply();
        enqueue(new C127501());
    }

    public final synchronized boolean currentUserIsAnonymous() {
        String cachedAppUserID;
        try {
            cachedAppUserID = this.deviceCache.getCachedAppUserID();
            if (cachedAppUserID == null) {
                cachedAppUserID = "";
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return isUserIDAnonymous(cachedAppUserID) || AbstractC16544l.m18089b(this.deviceCache.getCachedAppUserID(), this.deviceCache.getLegacyCachedAppUserID());
    }

    public final String getCurrentAppUserID() {
        String cachedAppUserID = this.deviceCache.getCachedAppUserID();
        return cachedAppUserID == null ? "" : cachedAppUserID;
    }

    public final void logIn(String newAppUserID, InterfaceC1439n onSuccess, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(newAppUserID, "newAppUserID");
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        if (!AbstractC21322p.m21681O(newAppUserID)) {
            LogWrapperKt.log(LogIntent.USER, String.format(IdentityStrings.LOGGING_IN, Arrays.copyOf(new Object[]{getCurrentAppUserID(), newAppUserID}, 2)));
            this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(newAppUserID, new C127512(getCurrentAppUserID(), newAppUserID, onError, onSuccess));
        } else {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.InvalidAppUserIdError, IdentityStrings.LOG_IN_ERROR_MISSING_APP_USER_ID);
            LogUtilsKt.errorLog(purchasesError);
            onError.invoke(purchasesError);
        }
    }

    public final synchronized void logOut(InterfaceC1436k completion) {
        AbstractC16544l.m18094g(completion, "completion");
        if (!currentUserIsAnonymous()) {
            this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(getCurrentAppUserID(), new C127521(completion));
        } else {
            LogWrapperKt.log(LogIntent.RC_ERROR, IdentityStrings.LOG_OUT_CALLED_ON_ANONYMOUS_USER);
            completion.invoke(new PurchasesError(PurchasesErrorCode.LogOutWithAnonymousUserError, null, 2, null));
        }
    }

    public final void switchUser(String newAppUserID) {
        AbstractC16544l.m18094g(newAppUserID, "newAppUserID");
        LogUtilsKt.debugLog(String.format(IdentityStrings.SWITCHING_USER, Arrays.copyOf(new Object[]{newAppUserID}, 1)));
        resetAndSaveUserID(newAppUserID);
    }
}
