package com.revenuecat.purchases;

import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJO\u0010\u0017\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001e¨\u0006\u001f"}, m18067d2 = {"Lcom/revenuecat/purchases/SyncPurchasesHelper;", "", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/CustomerInfoHelper;", "customerInfoHelper", "Lcom/revenuecat/purchases/PostReceiptHelper;", "postReceiptHelper", "<init>", "(Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/CustomerInfoHelper;Lcom/revenuecat/purchases/PostReceiptHelper;)V", "", "appUserID", "", "appInBackground", "isRestore", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lmm/C;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "retrieveCustomerInfo", "(Ljava/lang/String;ZZLBm/k;LBm/k;)V", "syncPurchases", "(ZZLBm/k;LBm/k;)V", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/CustomerInfoHelper;", "Lcom/revenuecat/purchases/PostReceiptHelper;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SyncPurchasesHelper {
    private final BillingAbstract billing;
    private final CustomerInfoHelper customerInfoHelper;
    private final IdentityManager identityManager;
    private final PostReceiptHelper postReceiptHelper;

    /* JADX INFO: renamed from: com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$1 */
    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "allPurchases", "Lmm/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126551 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ boolean $appInBackground;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ boolean $isRestore;
        final /* synthetic */ InterfaceC1436k $onError;
        final /* synthetic */ InterfaceC1436k $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126551(String str, boolean z6, boolean z10, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
            super(1);
            this.$appUserID = str;
            this.$appInBackground = z6;
            this.$isRestore = z10;
            this.$onSuccess = interfaceC1436k;
            this.$onError = interfaceC1436k2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$handleLastPurchase(List<PurchasesError> list, SyncPurchasesHelper syncPurchasesHelper, String str, boolean z6, boolean z10, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, StoreTransaction storeTransaction, StoreTransaction storeTransaction2) {
            if (AbstractC16544l.m18089b(storeTransaction, storeTransaction2)) {
                if (list.isEmpty()) {
                    LogUtilsKt.debugLog(PurchaseStrings.SYNCED_PURCHASES_SUCCESSFULLY);
                    syncPurchasesHelper.retrieveCustomerInfo(str, z6, z10, interfaceC1436k, interfaceC1436k2);
                } else {
                    LogUtilsKt.errorLog$default(String.format(PurchaseStrings.SYNCING_PURCHASES_ERROR, Arrays.copyOf(new Object[]{list}, 1)), null, 2, null);
                    interfaceC1436k2.invoke(AbstractC17680n.m19341Q(list));
                }
            }
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<StoreTransaction>) obj);
            return C17296C.f55119a;
        }

        public final void invoke(List<StoreTransaction> allPurchases) {
            AbstractC16544l.m18094g(allPurchases, "allPurchases");
            if (allPurchases.isEmpty()) {
                SyncPurchasesHelper.this.retrieveCustomerInfo(this.$appUserID, this.$appInBackground, this.$isRestore, this.$onSuccess, this.$onError);
                return;
            }
            StoreTransaction storeTransaction = (StoreTransaction) AbstractC17680n.m19351a0(allPurchases);
            ArrayList arrayList = new ArrayList();
            SyncPurchasesHelper syncPurchasesHelper = SyncPurchasesHelper.this;
            boolean z6 = this.$isRestore;
            String str = this.$appUserID;
            boolean z10 = this.$appInBackground;
            InterfaceC1436k interfaceC1436k = this.$onSuccess;
            InterfaceC1436k interfaceC1436k2 = this.$onError;
            for (StoreTransaction storeTransaction2 : allPurchases) {
                ReceiptInfo receiptInfo = new ReceiptInfo(storeTransaction2.getProductIds(), null, null, null, null, null, null, 126, null);
                InterfaceC1436k interfaceC1436k3 = interfaceC1436k2;
                InterfaceC1436k interfaceC1436k4 = interfaceC1436k;
                boolean z11 = z10;
                String str2 = str;
                syncPurchasesHelper.postReceiptHelper.postTokenWithoutConsuming(storeTransaction2.getPurchaseToken(), storeTransaction2.getStoreUserID(), receiptInfo, z6, str2, storeTransaction2.getMarketplace(), PostReceiptInitiationSource.RESTORE, new SyncPurchasesHelper$syncPurchases$1$1$1(storeTransaction2, storeTransaction, arrayList, syncPurchasesHelper, str, z10, z6, interfaceC1436k4, interfaceC1436k3), new SyncPurchasesHelper$syncPurchases$1$1$2(storeTransaction2, arrayList, storeTransaction, syncPurchasesHelper, str2, z11, z6, interfaceC1436k4, interfaceC1436k3));
                interfaceC1436k2 = interfaceC1436k3;
                interfaceC1436k = interfaceC1436k4;
                z10 = z11;
                str = str2;
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$2 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126562 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126562(InterfaceC1436k interfaceC1436k) {
            super(1);
            this.$onError = interfaceC1436k;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError it) {
            AbstractC16544l.m18094g(it, "it");
            AbstractC12107L1.m13831v(new Object[]{it}, 1, PurchaseStrings.SYNCING_PURCHASES_ERROR, LogIntent.RC_ERROR);
            this.$onError.invoke(it);
        }
    }

    public SyncPurchasesHelper(BillingAbstract billing, IdentityManager identityManager, CustomerInfoHelper customerInfoHelper, PostReceiptHelper postReceiptHelper) {
        AbstractC16544l.m18094g(billing, "billing");
        AbstractC16544l.m18094g(identityManager, "identityManager");
        AbstractC16544l.m18094g(customerInfoHelper, "customerInfoHelper");
        AbstractC16544l.m18094g(postReceiptHelper, "postReceiptHelper");
        this.billing = billing;
        this.identityManager = identityManager;
        this.customerInfoHelper = customerInfoHelper;
        this.postReceiptHelper = postReceiptHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retrieveCustomerInfo(String appUserID, boolean appInBackground, boolean isRestore, final InterfaceC1436k onSuccess, final InterfaceC1436k onError) {
        this.customerInfoHelper.retrieveCustomerInfo(appUserID, CacheFetchPolicy.CACHED_OR_FETCHED, appInBackground, isRestore, new ReceiveCustomerInfoCallback() { // from class: com.revenuecat.purchases.SyncPurchasesHelper.retrieveCustomerInfo.1
            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onError(PurchasesError error) {
                AbstractC16544l.m18094g(error, "error");
                onError.invoke(error);
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onReceived(CustomerInfo customerInfo) {
                AbstractC16544l.m18094g(customerInfo, "customerInfo");
                onSuccess.invoke(customerInfo);
            }
        });
    }

    public final void syncPurchases(boolean isRestore, boolean appInBackground, InterfaceC1436k onSuccess, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.SYNCING_PURCHASES);
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        this.billing.queryAllPurchases(currentAppUserID, new C126551(currentAppUserID, appInBackground, isRestore, onSuccess, onError), new C126562(onError));
    }
}
