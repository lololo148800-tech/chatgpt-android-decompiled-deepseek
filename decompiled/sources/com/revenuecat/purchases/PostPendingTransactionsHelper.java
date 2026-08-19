package com.revenuecat.purchases;

import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.utils.Result;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p909nm.AbstractC17681o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ_\u0010\u001d\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\u0018\b\u0002\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJi\u0010!\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0018\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00180\u001f0\u00102\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\u0018\b\u0002\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017H\u0002¢\u0006\u0004\b!\u0010\"JG\u0010#\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\u0018\b\u0002\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*¨\u0006+"}, m18067d2 = {"Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "postTransactionWithProductDetailsHelper", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;)V", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "transactionsToSync", "", "allowSharingPlayStoreAccount", "", "appUserID", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Lmm/C;", "onError", "Lcom/revenuecat/purchases/CustomerInfo;", "onSuccess", "postTransactionsWithCompletion", "(Ljava/util/List;ZLjava/lang/String;LBm/k;LBm/k;)V", "Lcom/revenuecat/purchases/utils/Result;", "results", "callCompletionFromResults", "(Ljava/util/List;Ljava/util/List;LBm/k;LBm/k;)V", "syncPendingPurchaseQueue", "(ZLBm/k;LBm/k;)V", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PostPendingTransactionsHelper {
    private final AppConfig appConfig;
    private final BillingAbstract billing;
    private final DeviceCache deviceCache;
    private final Dispatcher dispatcher;
    private final IdentityManager identityManager;
    private final PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostPendingTransactionsHelper$postTransactionsWithCompletion$1 */
    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "<anonymous parameter 0>", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126071 extends AbstractC16546n implements InterfaceC1439n {
        final /* synthetic */ InterfaceC1436k $onError;
        final /* synthetic */ InterfaceC1436k $onSuccess;
        final /* synthetic */ List<Result<CustomerInfo, PurchasesError>> $results;
        final /* synthetic */ List<StoreTransaction> $transactionsToSync;
        final /* synthetic */ PostPendingTransactionsHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126071(List<Result<CustomerInfo, PurchasesError>> list, PostPendingTransactionsHelper postPendingTransactionsHelper, List<StoreTransaction> list2, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
            super(2);
            this.$results = list;
            this.this$0 = postPendingTransactionsHelper;
            this.$transactionsToSync = list2;
            this.$onError = interfaceC1436k;
            this.$onSuccess = interfaceC1436k2;
        }

        @Override // p049Bm.InterfaceC1439n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((StoreTransaction) obj, (CustomerInfo) obj2);
            return C17296C.f55119a;
        }

        public final void invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
            AbstractC16544l.m18094g(storeTransaction, "<anonymous parameter 0>");
            AbstractC16544l.m18094g(customerInfo, "customerInfo");
            this.$results.add(new Result.Success(customerInfo));
            this.this$0.callCompletionFromResults(this.$transactionsToSync, this.$results, this.$onError, this.$onSuccess);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostPendingTransactionsHelper$postTransactionsWithCompletion$2 */
    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "<anonymous parameter 0>", "Lcom/revenuecat/purchases/PurchasesError;", "purchasesError", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126082 extends AbstractC16546n implements InterfaceC1439n {
        final /* synthetic */ InterfaceC1436k $onError;
        final /* synthetic */ InterfaceC1436k $onSuccess;
        final /* synthetic */ List<Result<CustomerInfo, PurchasesError>> $results;
        final /* synthetic */ List<StoreTransaction> $transactionsToSync;
        final /* synthetic */ PostPendingTransactionsHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126082(List<Result<CustomerInfo, PurchasesError>> list, PostPendingTransactionsHelper postPendingTransactionsHelper, List<StoreTransaction> list2, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
            super(2);
            this.$results = list;
            this.this$0 = postPendingTransactionsHelper;
            this.$transactionsToSync = list2;
            this.$onError = interfaceC1436k;
            this.$onSuccess = interfaceC1436k2;
        }

        @Override // p049Bm.InterfaceC1439n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((StoreTransaction) obj, (PurchasesError) obj2);
            return C17296C.f55119a;
        }

        public final void invoke(StoreTransaction storeTransaction, PurchasesError purchasesError) {
            AbstractC16544l.m18094g(storeTransaction, "<anonymous parameter 0>");
            AbstractC16544l.m18094g(purchasesError, "purchasesError");
            this.$results.add(new Result.Error(purchasesError));
            this.this$0.callCompletionFromResults(this.$transactionsToSync, this.$results, this.$onError, this.$onSuccess);
        }
    }

    public PostPendingTransactionsHelper(AppConfig appConfig, DeviceCache deviceCache, BillingAbstract billing, Dispatcher dispatcher, IdentityManager identityManager, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper) {
        AbstractC16544l.m18094g(appConfig, "appConfig");
        AbstractC16544l.m18094g(deviceCache, "deviceCache");
        AbstractC16544l.m18094g(billing, "billing");
        AbstractC16544l.m18094g(dispatcher, "dispatcher");
        AbstractC16544l.m18094g(identityManager, "identityManager");
        AbstractC16544l.m18094g(postTransactionWithProductDetailsHelper, "postTransactionWithProductDetailsHelper");
        this.appConfig = appConfig;
        this.deviceCache = deviceCache;
        this.billing = billing;
        this.dispatcher = dispatcher;
        this.identityManager = identityManager;
        this.postTransactionWithProductDetailsHelper = postTransactionWithProductDetailsHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void callCompletionFromResults(List<StoreTransaction> transactionsToSync, List<? extends Result<CustomerInfo, PurchasesError>> results, InterfaceC1436k onError, InterfaceC1436k onSuccess) {
        if (transactionsToSync.size() == results.size()) {
            int i10 = 0;
            for (Object obj : results) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC17681o.m19388q();
                    throw null;
                }
                Result result = (Result) obj;
                if (result instanceof Result.Error) {
                    if (onError != null) {
                        onError.invoke(((Result.Error) result).getValue());
                        return;
                    }
                    return;
                } else {
                    if (i10 == results.size() - 1 && onSuccess != null) {
                        AbstractC16544l.m18092e(result, "null cannot be cast to non-null type com.revenuecat.purchases.utils.Result.Success<com.revenuecat.purchases.CustomerInfo>");
                        onSuccess.invoke(((Result.Success) result).getValue());
                    }
                    i10 = i11;
                }
            }
        }
    }

    public static /* synthetic */ void callCompletionFromResults$default(PostPendingTransactionsHelper postPendingTransactionsHelper, List list, List list2, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC1436k = null;
        }
        if ((i10 & 8) != 0) {
            interfaceC1436k2 = null;
        }
        postPendingTransactionsHelper.callCompletionFromResults(list, list2, interfaceC1436k, interfaceC1436k2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postTransactionsWithCompletion(List<StoreTransaction> transactionsToSync, boolean allowSharingPlayStoreAccount, String appUserID, InterfaceC1436k onError, InterfaceC1436k onSuccess) {
        if (!transactionsToSync.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            this.postTransactionWithProductDetailsHelper.postTransactions(transactionsToSync, allowSharingPlayStoreAccount, appUserID, PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES, new C126071(arrayList, this, transactionsToSync, onError, onSuccess), new C126082(arrayList, this, transactionsToSync, onError, onSuccess));
        } else {
            LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.NO_PENDING_PURCHASES_TO_SYNC);
            if (onSuccess != null) {
                onSuccess.invoke(null);
            }
        }
    }

    public static /* synthetic */ void syncPendingPurchaseQueue$default(PostPendingTransactionsHelper postPendingTransactionsHelper, boolean z6, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC1436k = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC1436k2 = null;
        }
        postPendingTransactionsHelper.syncPendingPurchaseQueue(z6, interfaceC1436k, interfaceC1436k2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void syncPendingPurchaseQueue$lambda$0(PostPendingTransactionsHelper this$0, String appUserID, boolean z6, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(appUserID, "$appUserID");
        this$0.billing.queryPurchases(appUserID, new PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$1(this$0, z6, appUserID, interfaceC1436k, interfaceC1436k2), new PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$2(interfaceC1436k));
    }

    public final void syncPendingPurchaseQueue(boolean allowSharingPlayStoreAccount, InterfaceC1436k onError, InterfaceC1436k onSuccess) {
        if (this.appConfig.getDangerousSettings().getAutoSyncPurchases()) {
            LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.UPDATING_PENDING_PURCHASE_QUEUE);
            Dispatcher.enqueue$default(this.dispatcher, new RunnableC12675b(this, this.identityManager.getCurrentAppUserID(), allowSharingPlayStoreAccount, onError, onSuccess, 0), null, 2, null);
        } else {
            LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.SKIPPING_AUTOMATIC_SYNC);
            if (onSuccess != null) {
                onSuccess.invoke(null);
            }
        }
    }
}
