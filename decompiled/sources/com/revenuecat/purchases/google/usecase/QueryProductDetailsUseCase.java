package com.revenuecat.purchases.google.usecase;

import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.google.ProductTypeConversionsKt;
import com.revenuecat.purchases.google.StoreProductConversionsKt;
import com.revenuecat.purchases.strings.OfferingStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1135yn.C21555b;
import p826j6.AbstractC16148b;
import p826j6.C16155i;
import p826j6.C16162p;
import p826j6.C16167u;
import p826j6.InterfaceC16163q;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001c\u0010\n\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\f\u0012\u001e\u0010\u000f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\b0\u0006\u0012*\u0010\u0013\u001a&\u0012\u0004\u0012\u00020\u0011\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010#\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R-\u0010\n\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R'\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b.\u0010-R/\u0010\u000f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b/\u0010-R\u0014\u00102\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, m18067d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "", "Lj6/p;", "Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCaseParams;", "useCaseParams", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lmm/C;", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "Lj6/b;", "withConnectedClient", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCaseParams;LBm/k;LBm/k;LBm/k;LBm/n;)V", "billingClient", "", "productType", "Lj6/u;", "params", "Lj6/q;", "listener", "queryProductDetailsAsyncEnsuringOneResponse", "(Lj6/b;Ljava/lang/String;Lj6/u;Lj6/q;)V", "Lj6/i;", "billingResult", "Ljava/util/Date;", "requestStartTime", "trackGoogleQueryProductDetailsRequestIfNeeded", "(Ljava/lang/String;Lj6/i;Ljava/util/Date;)V", "executeAsync", "()V", "received", "onOk", "(Ljava/util/List;)V", "Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCaseParams;", "LBm/k;", "getOnReceive", "()LBm/k;", "getOnError", "getWithConnectedClient", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class QueryProductDetailsUseCase extends BillingClientUseCase<List<? extends C16162p>> {
    private final InterfaceC1436k onError;
    private final InterfaceC1436k onReceive;
    private final QueryProductDetailsUseCaseParams useCaseParams;
    private final InterfaceC1436k withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$executeAsync$1 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"Lj6/b;", "Lmm/C;", "invoke", "(Lj6/b;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127411 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ Set<String> $nonEmptyProductIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127411(Set<String> set) {
            super(1);
            this.$nonEmptyProductIds = set;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AbstractC16148b) obj);
            return C17296C.f55119a;
        }

        public final void invoke(AbstractC16148b invoke) {
            AbstractC16544l.m18094g(invoke, "$this$invoke");
            String googleProductType = ProductTypeConversionsKt.toGoogleProductType(QueryProductDetailsUseCase.this.useCaseParams.getProductType());
            if (googleProductType == null) {
                googleProductType = "inapp";
            }
            C16167u c16167uBuildQueryProductDetailsParams = BillingClientParamBuildersKt.buildQueryProductDetailsParams(googleProductType, this.$nonEmptyProductIds);
            QueryProductDetailsUseCase queryProductDetailsUseCase = QueryProductDetailsUseCase.this;
            queryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse(invoke, googleProductType, c16167uBuildQueryProductDetailsParams, new C12746a(queryProductDetailsUseCase));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lj6/p;", "it", "", "invoke", "(Lj6/p;)Ljava/lang/CharSequence;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127421 extends AbstractC16546n implements InterfaceC1436k {
        public static final C127421 INSTANCE = new C127421();

        public C127421() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final CharSequence invoke(C16162p it) {
            AbstractC16544l.m18094g(it, "it");
            String string = it.toString();
            AbstractC16544l.m18093f(string, "it.toString()");
            return string;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsUseCase(QueryProductDetailsUseCaseParams useCaseParams, InterfaceC1436k onReceive, InterfaceC1436k onError, InterfaceC1436k withConnectedClient, InterfaceC1439n executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        AbstractC16544l.m18094g(useCaseParams, "useCaseParams");
        AbstractC16544l.m18094g(onReceive, "onReceive");
        AbstractC16544l.m18094g(onError, "onError");
        AbstractC16544l.m18094g(withConnectedClient, "withConnectedClient");
        AbstractC16544l.m18094g(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onReceive = onReceive;
        this.onError = onError;
        this.withConnectedClient = withConnectedClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void queryProductDetailsAsyncEnsuringOneResponse(AbstractC16148b billingClient, String productType, C16167u params, InterfaceC16163q listener) {
        billingClient.mo17713g(params, new C12748c(new AtomicBoolean(false), this, productType, this.useCaseParams.getDateProvider().getNow(), listener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryProductDetailsAsyncEnsuringOneResponse$lambda$3(AtomicBoolean hasResponded, QueryProductDetailsUseCase this$0, String productType, Date requestStartTime, InterfaceC16163q listener, C16155i billingResult, List productDetailsList) {
        AbstractC16544l.m18094g(hasResponded, "$hasResponded");
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(productType, "$productType");
        AbstractC16544l.m18094g(requestStartTime, "$requestStartTime");
        AbstractC16544l.m18094g(listener, "$listener");
        AbstractC16544l.m18094g(billingResult, "billingResult");
        AbstractC16544l.m18094g(productDetailsList, "productDetailsList");
        if (hasResponded.getAndSet(true)) {
            AbstractC12107L1.m13831v(new Object[]{Integer.valueOf(billingResult.f50151a)}, 1, OfferingStrings.EXTRA_QUERY_PRODUCT_DETAILS_RESPONSE, LogIntent.GOOGLE_ERROR);
        } else {
            this$0.trackGoogleQueryProductDetailsRequestIfNeeded(productType, billingResult, requestStartTime);
            listener.mo14487b(billingResult, productDetailsList);
        }
    }

    private final void trackGoogleQueryProductDetailsRequestIfNeeded(String productType, C16155i billingResult, Date requestStartTime) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int i10 = billingResult.f50151a;
            String str = billingResult.f50152b;
            AbstractC16544l.m18093f(str, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.m22506trackGoogleQueryProductDetailsRequestWn2Vu4Y(productType, i10, str, DurationExtensionsKt.between(C21555b.f68260Z, requestStartTime, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        Set<String> productIds = this.useCaseParams.getProductIds();
        ArrayList arrayList = new ArrayList();
        for (Object obj : productIds) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        Set setM19328G0 = AbstractC17680n.m19328G0(arrayList);
        if (!setM19328G0.isEmpty()) {
            this.withConnectedClient.invoke(new C127411(setM19328G0));
        } else {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.EMPTY_PRODUCT_ID_LIST);
            this.onReceive.invoke(C17689w.f56480Y);
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error when fetching products";
    }

    public final InterfaceC1436k getOnError() {
        return this.onError;
    }

    public final InterfaceC1436k getOnReceive() {
        return this.onReceive;
    }

    public final InterfaceC1436k getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public /* bridge */ /* synthetic */ void onOk(List<? extends C16162p> list) {
        onOk2((List<C16162p>) list);
    }

    /* JADX INFO: renamed from: onOk, reason: avoid collision after fix types in other method */
    public void onOk2(List<C16162p> received) {
        AbstractC16544l.m18094g(received, "received");
        AbstractC12107L1.m13831v(new Object[]{AbstractC17680n.m19349Y(this.useCaseParams.getProductIds(), null, null, null, 0, null, null, 63)}, 1, OfferingStrings.FETCHING_PRODUCTS_FINISHED, LogIntent.DEBUG);
        LogWrapperKt.log(LogIntent.PURCHASE, String.format(OfferingStrings.RETRIEVED_PRODUCTS, Arrays.copyOf(new Object[]{AbstractC17680n.m19349Y(received, null, null, null, 0, null, C127421.INSTANCE, 31)}, 1)));
        List<C16162p> list = !received.isEmpty() ? received : null;
        if (list != null) {
            for (C16162p c16162p : list) {
                AbstractC12107L1.m13831v(new Object[]{c16162p.f50177c, c16162p}, 2, OfferingStrings.LIST_PRODUCTS, LogIntent.PURCHASE);
            }
        }
        this.onReceive.invoke(StoreProductConversionsKt.toStoreProducts(received));
    }
}
