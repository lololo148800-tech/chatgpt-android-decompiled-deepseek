package com.revenuecat.purchases;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p861l1.xapn.suYVq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001bJ3\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140%H\u0002¢\u0006\u0004\b'\u0010(J9\u0010+\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102¨\u00063"}, m18067d2 = {"Lcom/revenuecat/purchases/CustomerInfoHelper;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "customerInfoUpdateHandler", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "postPendingTransactionsHelper", "Landroid/os/Handler;", "handler", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;Lcom/revenuecat/purchases/PostPendingTransactionsHelper;Landroid/os/Handler;)V", "", "appUserID", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "callback", "Lmm/C;", "getCustomerInfoCacheOnly", "(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "", "appInBackground", "allowSharingPlayStoreAccount", "postPendingPurchasesAndFetchCustomerInfo", "(Ljava/lang/String;ZZLcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "getCustomerInfoFetchOnly", "(Ljava/lang/String;ZLcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "getCustomerInfoCachedOrFetched", "getCustomerInfoNotStaledCachedOrFetched", "Lcom/revenuecat/purchases/CustomerInfo;", "getCachedCustomerInfo", "(Ljava/lang/String;)Lcom/revenuecat/purchases/CustomerInfo;", "updateCachedCustomerInfoIfStale", "(Ljava/lang/String;ZZ)V", "Lkotlin/Function0;", "action", "dispatch", "(LBm/a;)V", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "retrieveCustomerInfo", "(Ljava/lang/String;Lcom/revenuecat/purchases/CacheFetchPolicy;ZZLcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "Landroid/os/Handler;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CustomerInfoHelper {
    private final Backend backend;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DeviceCache deviceCache;
    private final Handler handler;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PostPendingTransactionsHelper postPendingTransactionsHelper;

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CacheFetchPolicy.values().length];
            try {
                iArr[CacheFetchPolicy.CACHE_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CacheFetchPolicy.FETCH_CURRENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CacheFetchPolicy.CACHED_OR_FETCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CacheFetchPolicy.NOT_STALE_CACHED_OR_CURRENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCacheOnly$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C125961 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ CustomerInfo $cachedCustomerInfo;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125961(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
            super(0);
            this.$callback = receiveCustomerInfoCallback;
            this.$cachedCustomerInfo = customerInfo;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22467invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22467invoke() {
            this.$callback.onReceived(this.$cachedCustomerInfo);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCacheOnly$2 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C125972 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;
        final /* synthetic */ PurchasesError $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125972(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
            super(0);
            this.$callback = receiveCustomerInfoCallback;
            this.$error = purchasesError;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22468invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22468invoke() {
            this.$callback.onError(this.$error);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCachedOrFetched$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C125981 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ CustomerInfo $cachedCustomerInfo;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125981(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
            super(0);
            this.$callback = receiveCustomerInfoCallback;
            this.$cachedCustomerInfo = customerInfo;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22469invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22469invoke() {
            ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
            if (receiveCustomerInfoCallback != null) {
                receiveCustomerInfoCallback.onReceived(this.$cachedCustomerInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", ParameterNames.INFO, "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C125991 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1426a {
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ CustomerInfo $info;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
                super(0);
                this.$callback = receiveCustomerInfoCallback;
                this.$info = customerInfo;
            }

            @Override // p049Bm.InterfaceC1426a
            public /* bridge */ /* synthetic */ Object invoke() {
                m22470invoke();
                return C17296C.f55119a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m22470invoke() {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onReceived(this.$info);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125991(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(1);
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return C17296C.f55119a;
        }

        public final void invoke(CustomerInfo info) {
            AbstractC16544l.m18094g(info, "info");
            LogWrapperKt.log(LogIntent.RC_SUCCESS, CustomerInfoStrings.CUSTOMERINFO_UPDATED_FROM_NETWORK);
            CustomerInfoHelper.this.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
            CustomerInfoHelper.this.customerInfoUpdateHandler.cacheAndNotifyListeners(info);
            CustomerInfoHelper.this.dispatch(new AnonymousClass1(this.$callback, info));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2 */
    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "", "isServerError", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126002 extends AbstractC16546n implements InterfaceC1439n {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "offlineComputedCustomerInfo", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ CustomerInfoHelper this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
            public static final class C222271 extends AbstractC16546n implements InterfaceC1426a {
                final /* synthetic */ ReceiveCustomerInfoCallback $callback;
                final /* synthetic */ CustomerInfo $offlineComputedCustomerInfo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C222271(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
                    super(0);
                    this.$callback = receiveCustomerInfoCallback;
                    this.$offlineComputedCustomerInfo = customerInfo;
                }

                @Override // p049Bm.InterfaceC1426a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m22471invoke();
                    return C17296C.f55119a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m22471invoke() {
                    ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                    if (receiveCustomerInfoCallback != null) {
                        receiveCustomerInfoCallback.onReceived(this.$offlineComputedCustomerInfo);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CustomerInfoHelper customerInfoHelper, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
                super(1);
                this.this$0 = customerInfoHelper;
                this.$callback = receiveCustomerInfoCallback;
            }

            @Override // p049Bm.InterfaceC1436k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return C17296C.f55119a;
            }

            public final void invoke(CustomerInfo offlineComputedCustomerInfo) {
                AbstractC16544l.m18094g(offlineComputedCustomerInfo, "offlineComputedCustomerInfo");
                this.this$0.customerInfoUpdateHandler.notifyListeners(offlineComputedCustomerInfo);
                this.this$0.dispatch(new C222271(this.$callback, offlineComputedCustomerInfo));
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1436k {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ CustomerInfoHelper this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$2$1, reason: invalid class name */
            @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
            public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1426a {
                final /* synthetic */ PurchasesError $backendError;
                final /* synthetic */ ReceiveCustomerInfoCallback $callback;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
                    super(0);
                    this.$callback = receiveCustomerInfoCallback;
                    this.$backendError = purchasesError;
                }

                @Override // p049Bm.InterfaceC1426a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m22472invoke();
                    return C17296C.f55119a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m22472invoke() {
                    ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                    if (receiveCustomerInfoCallback != null) {
                        receiveCustomerInfoCallback.onError(this.$backendError);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(CustomerInfoHelper customerInfoHelper, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
                super(1);
                this.this$0 = customerInfoHelper;
                this.$callback = receiveCustomerInfoCallback;
                this.$backendError = purchasesError;
            }

            @Override // p049Bm.InterfaceC1436k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return C17296C.f55119a;
            }

            public final void invoke(PurchasesError it) {
                AbstractC16544l.m18094g(it, "it");
                this.this$0.dispatch(new AnonymousClass1(this.$callback, this.$backendError));
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$3, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass3 extends AbstractC16546n implements InterfaceC1426a {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
                super(0);
                this.$callback = receiveCustomerInfoCallback;
                this.$backendError = purchasesError;
            }

            @Override // p049Bm.InterfaceC1426a
            public /* bridge */ /* synthetic */ Object invoke() {
                m22473invoke();
                return C17296C.f55119a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m22473invoke() {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onError(this.$backendError);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126002(String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(2);
            this.$appUserID = str;
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // p049Bm.InterfaceC1439n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError backendError, boolean z6) {
            AbstractC16544l.m18094g(backendError, "backendError");
            LogUtilsKt.errorLog$default(String.format(CustomerInfoStrings.ERROR_FETCHING_CUSTOMER_INFO, Arrays.copyOf(new Object[]{backendError}, 1)), null, 2, null);
            CustomerInfoHelper.this.deviceCache.clearCustomerInfoCacheTimestamp(this.$appUserID);
            if (CustomerInfoHelper.this.offlineEntitlementsManager.shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest(z6, this.$appUserID)) {
                CustomerInfoHelper.this.offlineEntitlementsManager.calculateAndCacheOfflineCustomerInfo(this.$appUserID, new AnonymousClass1(CustomerInfoHelper.this, this.$callback), new AnonymousClass2(CustomerInfoHelper.this, this.$callback, backendError));
            } else {
                CustomerInfoHelper.this.dispatch(new AnonymousClass3(this.$callback, backendError));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126011 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ boolean $appInBackground;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126011(String str, boolean z6, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(1);
            this.$appUserID = str;
            this.$appInBackground = z6;
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC16544l.m18094g(it, "it");
            CustomerInfoHelper.this.getCustomerInfoFetchOnly(this.$appUserID, this.$appInBackground, this.$callback);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$2 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126022 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ boolean $appInBackground;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$2$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1426a {
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ CustomerInfo $customerInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
                super(0);
                this.$callback = receiveCustomerInfoCallback;
                this.$customerInfo = customerInfo;
            }

            @Override // p049Bm.InterfaceC1426a
            public /* bridge */ /* synthetic */ Object invoke() {
                m22474invoke();
                return C17296C.f55119a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m22474invoke() {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onReceived(this.$customerInfo);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126022(String str, boolean z6, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(1);
            this.$appUserID = str;
            this.$appInBackground = z6;
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return C17296C.f55119a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            if (customerInfo == null) {
                CustomerInfoHelper.this.getCustomerInfoFetchOnly(this.$appUserID, this.$appInBackground, this.$callback);
            } else {
                LogWrapperKt.log(LogIntent.RC_SUCCESS, CustomerInfoStrings.CUSTOMERINFO_UPDATED_FROM_SYNCING_PENDING_PURCHASES);
                CustomerInfoHelper.this.dispatch(new AnonymousClass1(this.$callback, customerInfo));
            }
        }
    }

    public CustomerInfoHelper(DeviceCache deviceCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, PostPendingTransactionsHelper postPendingTransactionsHelper, Handler handler) {
        AbstractC16544l.m18094g(deviceCache, "deviceCache");
        AbstractC16544l.m18094g(backend, "backend");
        AbstractC16544l.m18094g(offlineEntitlementsManager, "offlineEntitlementsManager");
        AbstractC16544l.m18094g(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        AbstractC16544l.m18094g(postPendingTransactionsHelper, "postPendingTransactionsHelper");
        AbstractC16544l.m18094g(handler, "handler");
        this.deviceCache = deviceCache;
        this.backend = backend;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.postPendingTransactionsHelper = postPendingTransactionsHelper;
        this.handler = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(InterfaceC1426a action) {
        if (AbstractC16544l.m18089b(Thread.currentThread(), this.handler.getLooper().getThread())) {
            action.invoke();
        } else {
            this.handler.post(new RunnableC12657a(action, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatch$lambda$0(InterfaceC1426a tmp0) {
        AbstractC16544l.m18094g(tmp0, "$tmp0");
        tmp0.invoke();
    }

    private final CustomerInfo getCachedCustomerInfo(String appUserID) {
        CustomerInfo offlineCustomerInfo = this.offlineEntitlementsManager.get_offlineCustomerInfo();
        return offlineCustomerInfo == null ? this.deviceCache.getCachedCustomerInfo(appUserID) : offlineCustomerInfo;
    }

    private final void getCustomerInfoCacheOnly(String appUserID, ReceiveCustomerInfoCallback callback) {
        if (callback == null) {
            return;
        }
        CustomerInfo cachedCustomerInfo = getCachedCustomerInfo(appUserID);
        if (cachedCustomerInfo != null) {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.VENDING_CACHE);
            dispatch(new C125961(callback, cachedCustomerInfo));
        } else {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.CustomerInfoError, CustomerInfoStrings.MISSING_CACHED_CUSTOMER_INFO);
            LogUtilsKt.errorLog(purchasesError);
            dispatch(new C125972(callback, purchasesError));
        }
    }

    public static /* synthetic */ void getCustomerInfoCacheOnly$default(CustomerInfoHelper customerInfoHelper, String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoCacheOnly(str, receiveCustomerInfoCallback);
    }

    private final void getCustomerInfoCachedOrFetched(String appUserID, boolean appInBackground, boolean allowSharingPlayStoreAccount, ReceiveCustomerInfoCallback callback) {
        CustomerInfo cachedCustomerInfo = getCachedCustomerInfo(appUserID);
        if (cachedCustomerInfo == null) {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.NO_CACHED_CUSTOMERINFO);
            postPendingPurchasesAndFetchCustomerInfo(appUserID, appInBackground, allowSharingPlayStoreAccount, callback);
        } else {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.VENDING_CACHE);
            dispatch(new C125981(callback, cachedCustomerInfo));
            updateCachedCustomerInfoIfStale(appUserID, appInBackground, allowSharingPlayStoreAccount);
        }
    }

    public static /* synthetic */ void getCustomerInfoCachedOrFetched$default(CustomerInfoHelper customerInfoHelper, String str, boolean z6, boolean z10, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoCachedOrFetched(str, z6, z10, receiveCustomerInfoCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getCustomerInfoFetchOnly(String appUserID, boolean appInBackground, ReceiveCustomerInfoCallback callback) {
        this.deviceCache.setCustomerInfoCacheTimestampToNow(appUserID);
        this.backend.getCustomerInfo(appUserID, appInBackground, new C125991(callback), new C126002(appUserID, callback));
    }

    public static /* synthetic */ void getCustomerInfoFetchOnly$default(CustomerInfoHelper customerInfoHelper, String str, boolean z6, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoFetchOnly(str, z6, receiveCustomerInfoCallback);
    }

    private final void getCustomerInfoNotStaledCachedOrFetched(String appUserID, boolean appInBackground, boolean allowSharingPlayStoreAccount, ReceiveCustomerInfoCallback callback) {
        if (this.deviceCache.isCustomerInfoCacheStale(appUserID, appInBackground)) {
            postPendingPurchasesAndFetchCustomerInfo(appUserID, appInBackground, allowSharingPlayStoreAccount, callback);
        } else {
            getCustomerInfoCachedOrFetched(appUserID, appInBackground, allowSharingPlayStoreAccount, callback);
        }
    }

    public static /* synthetic */ void getCustomerInfoNotStaledCachedOrFetched$default(CustomerInfoHelper customerInfoHelper, String str, boolean z6, boolean z10, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoNotStaledCachedOrFetched(str, z6, z10, receiveCustomerInfoCallback);
    }

    private final void postPendingPurchasesAndFetchCustomerInfo(String appUserID, boolean appInBackground, boolean allowSharingPlayStoreAccount, ReceiveCustomerInfoCallback callback) {
        this.postPendingTransactionsHelper.syncPendingPurchaseQueue(allowSharingPlayStoreAccount, new C126011(appUserID, appInBackground, callback), new C126022(appUserID, appInBackground, callback));
    }

    public static /* synthetic */ void postPendingPurchasesAndFetchCustomerInfo$default(CustomerInfoHelper customerInfoHelper, String str, boolean z6, boolean z10, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.postPendingPurchasesAndFetchCustomerInfo(str, z6, z10, receiveCustomerInfoCallback);
    }

    public static /* synthetic */ void retrieveCustomerInfo$default(CustomerInfoHelper customerInfoHelper, String str, CacheFetchPolicy cacheFetchPolicy, boolean z6, boolean z10, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.retrieveCustomerInfo(str, cacheFetchPolicy, z6, z10, receiveCustomerInfoCallback);
    }

    private final void updateCachedCustomerInfoIfStale(String appUserID, boolean appInBackground, boolean allowSharingPlayStoreAccount) {
        if (this.deviceCache.isCustomerInfoCacheStale(appUserID, appInBackground)) {
            LogWrapperKt.log(LogIntent.DEBUG, appInBackground ? CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_BACKGROUND : CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_FOREGROUND);
            postPendingPurchasesAndFetchCustomerInfo$default(this, appUserID, appInBackground, allowSharingPlayStoreAccount, null, 8, null);
        }
    }

    public final void retrieveCustomerInfo(String appUserID, CacheFetchPolicy fetchPolicy, boolean appInBackground, boolean allowSharingPlayStoreAccount, ReceiveCustomerInfoCallback callback) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(fetchPolicy, "fetchPolicy");
        LogUtilsKt.debugLog(String.format(suYVq.VvfOMApvrb, Arrays.copyOf(new Object[]{fetchPolicy}, 1)));
        int i10 = WhenMappings.$EnumSwitchMapping$0[fetchPolicy.ordinal()];
        if (i10 == 1) {
            getCustomerInfoCacheOnly(appUserID, callback);
            return;
        }
        if (i10 == 2) {
            postPendingPurchasesAndFetchCustomerInfo(appUserID, appInBackground, allowSharingPlayStoreAccount, callback);
        } else if (i10 == 3) {
            getCustomerInfoCachedOrFetched(appUserID, appInBackground, allowSharingPlayStoreAccount, callback);
        } else {
            if (i10 != 4) {
                return;
            }
            getCustomerInfoNotStaledCachedOrFetched(appUserID, appInBackground, allowSharingPlayStoreAccount, callback);
        }
    }

    public /* synthetic */ CustomerInfoHelper(DeviceCache deviceCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, PostPendingTransactionsHelper postPendingTransactionsHelper, Handler handler, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceCache, backend, offlineEntitlementsManager, customerInfoUpdateHandler, postPendingTransactionsHelper, (i10 & 32) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
