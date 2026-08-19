package com.revenuecat.purchases.google.usecase;

import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import com.google.android.gms.internal.play_billing.AbstractC11857B;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import com.google.android.gms.internal.play_billing.C11907S;
import com.google.android.gms.internal.play_billing.C12027y;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.google.ProductTypeConversionsKt;
import com.revenuecat.purchases.google.StoreTransactionConversionsKt;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import io.sentry.android.core.RunnableC15195M;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1135yn.C21555b;
import p618Za.C10267f;
import p826j6.AbstractC16144M;
import p826j6.AbstractC16148b;
import p826j6.C16149c;
import p826j6.C16155i;
import p826j6.C16169w;
import p826j6.CallableC16170x;
import p826j6.InterfaceC16164r;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17682p;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007\u0012\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0007\u0012*\u0010\u0011\u001a&\u0012\u0004\u0012\u00020\u000f\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u000ej\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010 \u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J-\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'J#\u0010)\u001a\u00020\b2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R/\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b/\u0010.R/\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b0\u0010.R\u0014\u00103\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, m18067d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryPurchasesByTypeUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/google/usecase/QueryPurchasesByTypeUseCaseParams;", "useCaseParams", "Lkotlin/Function1;", "Lmm/C;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "Lj6/b;", "withConnectedClient", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/QueryPurchasesByTypeUseCaseParams;LBm/k;LBm/k;LBm/k;LBm/n;)V", "billingClient", "productType", "Lj6/w;", "queryParams", "Lj6/r;", "listener", "queryPurchasesAsyncWithTrackingEnsuringOneResponse", "(Lj6/b;Ljava/lang/String;Lj6/w;Lj6/r;)V", "Lj6/i;", "billingResult", "Ljava/util/Date;", "requestStartTime", "trackGoogleQueryPurchasesRequestIfNeeded", "(Ljava/lang/String;Lj6/i;Ljava/util/Date;)V", "", "Lcom/android/billingclient/api/Purchase;", "toMapOfGooglePurchaseWrapper", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/Map;", "executeAsync", "()V", "received", "onOk", "(Ljava/util/Map;)V", "Lcom/revenuecat/purchases/google/usecase/QueryPurchasesByTypeUseCaseParams;", "LBm/k;", "getOnSuccess", "()LBm/k;", "getOnError", "getWithConnectedClient", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class QueryPurchasesByTypeUseCase extends BillingClientUseCase<Map<String, ? extends StoreTransaction>> {
    private final InterfaceC1436k onError;
    private final InterfaceC1436k onSuccess;
    private final QueryPurchasesByTypeUseCaseParams useCaseParams;
    private final InterfaceC1436k withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCase$executeAsync$1 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"Lj6/b;", "Lmm/C;", "invoke", "(Lj6/b;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127441 extends AbstractC16546n implements InterfaceC1436k {
        public C127441() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1$lambda$0(QueryPurchasesByTypeUseCase this$0, C16155i result, List purchases) {
            AbstractC16544l.m18094g(this$0, "this$0");
            AbstractC16544l.m18094g(result, "result");
            AbstractC16544l.m18094g(purchases, "purchases");
            BillingClientUseCase.processResult$default(this$0, result, this$0.toMapOfGooglePurchaseWrapper(purchases, this$0.useCaseParams.getProductType()), null, null, 12, null);
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AbstractC16148b) obj);
            return C17296C.f55119a;
        }

        public final void invoke(AbstractC16148b invoke) {
            C17296C c17296c;
            AbstractC16544l.m18094g(invoke, "$this$invoke");
            C16169w c16169wBuildQueryPurchasesParams = BillingClientParamBuildersKt.buildQueryPurchasesParams(QueryPurchasesByTypeUseCase.this.useCaseParams.getProductType());
            if (c16169wBuildQueryPurchasesParams != null) {
                QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase = QueryPurchasesByTypeUseCase.this;
                queryPurchasesByTypeUseCase.queryPurchasesAsyncWithTrackingEnsuringOneResponse(invoke, queryPurchasesByTypeUseCase.useCaseParams.getProductType(), c16169wBuildQueryPurchasesParams, new C12746a(queryPurchasesByTypeUseCase));
                c17296c = C17296C.f55119a;
            } else {
                c17296c = null;
            }
            if (c17296c == null) {
                QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase2 = QueryPurchasesByTypeUseCase.this;
                LogUtilsKt.errorLog$default(String.format(PurchaseStrings.INVALID_PRODUCT_TYPE, Arrays.copyOf(new Object[]{"queryPurchasesByType"}, 1)), null, 2, null);
                C10267f c10267fM17778a = C16155i.m17778a();
                c10267fM17778a.f30498b = 5;
                BillingClientUseCase.processResult$default(queryPurchasesByTypeUseCase2, c10267fM17778a.m10864c(), C17690x.f56481Y, null, null, 12, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchasesByTypeUseCase(QueryPurchasesByTypeUseCaseParams useCaseParams, InterfaceC1436k onSuccess, InterfaceC1436k onError, InterfaceC1436k withConnectedClient, InterfaceC1439n executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        AbstractC16544l.m18094g(useCaseParams, "useCaseParams");
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        AbstractC16544l.m18094g(withConnectedClient, "withConnectedClient");
        AbstractC16544l.m18094g(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onSuccess = onSuccess;
        this.onError = onError;
        this.withConnectedClient = withConnectedClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryPurchasesAsyncWithTrackingEnsuringOneResponse(AbstractC16148b billingClient, String productType, C16169w queryParams, InterfaceC16164r listener) {
        int i10 = 2;
        boolean z6 = false;
        C12748c c12748c = new C12748c(new AtomicBoolean(false), this, productType, this.useCaseParams.getDateProvider().getNow(), listener);
        C16149c c16149c = (C16149c) billingClient;
        c16149c.getClass();
        String str = queryParams.f50190a;
        if (!c16149c.mo17749e()) {
            C16155i c16155i = AbstractC16144M.f50088k;
            c16149c.m17756D(2, 9, c16155i);
            C12027y c12027y = AbstractC11857B.f36097Z;
            c12748c.mo14486a(c16155i, C11907S.f36188q0);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            AbstractC11988o0.m13512g("BillingClient", "Please provide a valid product type.");
            C16155i c16155i2 = AbstractC16144M.f50083f;
            c16149c.m17756D(50, 9, c16155i2);
            C12027y c12027y2 = AbstractC11857B.f36097Z;
            c12748c.mo14486a(c16155i2, C11907S.f36188q0);
            return;
        }
        if (C16149c.m17750i(new CallableC16170x(c16149c, str, c12748c, i10), 30000L, new RunnableC15195M(c16149c, c12748c, z6, 1), c16149c.m17775z(), c16149c.m17763m()) == null) {
            C16155i c16155iM17761j = c16149c.m17761j();
            c16149c.m17756D(25, 9, c16155iM17761j);
            C12027y c12027y3 = AbstractC11857B.f36097Z;
            c12748c.mo14486a(c16155iM17761j, C11907S.f36188q0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, StoreTransaction> toMapOfGooglePurchaseWrapper(List<? extends Purchase> list, String str) {
        List<? extends Purchase> list2 = list;
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(list2, 10));
        if (iM19257b < 16) {
            iM19257b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
        for (Purchase purchase : list2) {
            String strM13149b = purchase.m13149b();
            AbstractC16544l.m18093f(strM13149b, "purchase.purchaseToken");
            linkedHashMap.put(UtilsKt.sha1(strM13149b), StoreTransactionConversionsKt.toStoreTransaction$default(purchase, ProductTypeConversionsKt.toRevenueCatProductType(str), null, null, null, 14, null));
        }
        return linkedHashMap;
    }

    private final void trackGoogleQueryPurchasesRequestIfNeeded(String productType, C16155i billingResult, Date requestStartTime) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int i10 = billingResult.f50151a;
            String str = billingResult.f50152b;
            AbstractC16544l.m18093f(str, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.m22508trackGoogleQueryPurchasesRequestWn2Vu4Y(productType, i10, str, DurationExtensionsKt.between(C21555b.f68260Z, requestStartTime, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new C127441());
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error when querying purchases of type " + this.useCaseParams.getProductType();
    }

    public final InterfaceC1436k getOnError() {
        return this.onError;
    }

    public final InterfaceC1436k getOnSuccess() {
        return this.onSuccess;
    }

    public final InterfaceC1436k getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public /* bridge */ /* synthetic */ void onOk(Map<String, ? extends StoreTransaction> map) {
        onOk2((Map<String, StoreTransaction>) map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$0(AtomicBoolean hasResponded, QueryPurchasesByTypeUseCase this$0, String productType, Date requestStartTime, InterfaceC16164r listener, C16155i c16155i, List purchases) {
        AbstractC16544l.m18094g(hasResponded, "$hasResponded");
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(productType, "$productType");
        AbstractC16544l.m18094g(requestStartTime, "$requestStartTime");
        AbstractC16544l.m18094g(listener, "$listener");
        AbstractC16544l.m18094g(c16155i, lZYtIbClQJm.HzsLqevgIOdJ);
        AbstractC16544l.m18094g(purchases, "purchases");
        if (hasResponded.getAndSet(true)) {
            AbstractC12107L1.m13831v(new Object[]{Integer.valueOf(c16155i.f50151a)}, 1, OfferingStrings.EXTRA_QUERY_PURCHASES_RESPONSE, LogIntent.GOOGLE_ERROR);
        } else {
            this$0.trackGoogleQueryPurchasesRequestIfNeeded(productType, c16155i, requestStartTime);
            listener.mo14486a(c16155i, purchases);
        }
    }

    /* JADX INFO: renamed from: onOk, reason: avoid collision after fix types in other method */
    public void onOk2(Map<String, StoreTransaction> received) {
        AbstractC16544l.m18094g(received, "received");
        this.onSuccess.invoke(received);
    }
}
