package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.PurchaseHistoryRecord;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PurchaseHistoryRecordExtensionsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import io.sentry.android.core.RunnableC15195M;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1135yn.C21555b;
import p174Gk.uSfJ.HpucjswO;
import p618Za.C10267f;
import p826j6.AbstractC16144M;
import p826j6.AbstractC16148b;
import p826j6.C16149c;
import p826j6.C16155i;
import p826j6.C16168v;
import p826j6.CallableC16170x;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\n\u0012\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0006\u0012*\u0010\u0011\u001a&\u0012\u0004\u0012\u00020\u000f\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u000ej\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00072\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R)\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R'\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b%\u0010$R/\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b&\u0010$R\u0014\u0010)\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, m18067d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryPurchaseHistoryUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "Lcom/revenuecat/purchases/google/usecase/QueryPurchaseHistoryUseCaseParams;", "useCaseParams", "Lkotlin/Function1;", "Lmm/C;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "Lj6/b;", "withConnectedClient", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/QueryPurchaseHistoryUseCaseParams;LBm/k;LBm/k;LBm/k;LBm/n;)V", "", "productType", "Lj6/i;", "billingResult", "Ljava/util/Date;", "requestStartTime", "trackGoogleQueryPurchaseHistoryRequestIfNeeded", "(Ljava/lang/String;Lj6/i;Ljava/util/Date;)V", "executeAsync", "()V", "received", "onOk", "(Ljava/util/List;)V", "Lcom/revenuecat/purchases/google/usecase/QueryPurchaseHistoryUseCaseParams;", "LBm/k;", "getOnReceive", "()LBm/k;", "getOnError", "getWithConnectedClient", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class QueryPurchaseHistoryUseCase extends BillingClientUseCase<List<? extends PurchaseHistoryRecord>> {
    private final InterfaceC1436k onError;
    private final InterfaceC1436k onReceive;
    private final QueryPurchaseHistoryUseCaseParams useCaseParams;
    private final InterfaceC1436k withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase$executeAsync$1 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"Lj6/b;", "Lmm/C;", "invoke", "(Lj6/b;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127431 extends AbstractC16546n implements InterfaceC1436k {
        public C127431() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1$lambda$0(AtomicBoolean hasResponded, QueryPurchaseHistoryUseCase this$0, Date requestStartTime, C16155i billingResult, List list) {
            AbstractC16544l.m18094g(hasResponded, "$hasResponded");
            AbstractC16544l.m18094g(this$0, "this$0");
            AbstractC16544l.m18094g(requestStartTime, "$requestStartTime");
            AbstractC16544l.m18094g(billingResult, "billingResult");
            if (hasResponded.getAndSet(true)) {
                AbstractC12107L1.m13831v(new Object[]{Integer.valueOf(billingResult.f50151a)}, 1, RestoreStrings.EXTRA_QUERY_PURCHASE_HISTORY_RESPONSE, LogIntent.GOOGLE_ERROR);
            } else {
                this$0.trackGoogleQueryPurchaseHistoryRequestIfNeeded(this$0.useCaseParams.getProductType(), billingResult, requestStartTime);
                BillingClientUseCase.processResult$default(this$0, billingResult, list, null, null, 12, null);
            }
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AbstractC16148b) obj);
            return C17296C.f55119a;
        }

        public final void invoke(AbstractC16148b invoke) {
            C17296C c17296c;
            int i10 = 3;
            AbstractC16544l.m18094g(invoke, "$this$invoke");
            boolean z6 = false;
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            Date now = QueryPurchaseHistoryUseCase.this.useCaseParams.getDateProvider().getNow();
            C16168v c16168vBuildQueryPurchaseHistoryParams = BillingClientParamBuildersKt.buildQueryPurchaseHistoryParams(QueryPurchaseHistoryUseCase.this.useCaseParams.getProductType());
            if (c16168vBuildQueryPurchaseHistoryParams != null) {
                C12749d c12749d = new C12749d(atomicBoolean, QueryPurchaseHistoryUseCase.this, now);
                C16149c c16149c = (C16149c) invoke;
                if (!c16149c.mo17749e()) {
                    C16155i c16155i = AbstractC16144M.f50088k;
                    c16149c.m17756D(2, 11, c16155i);
                    c12749d.m14491a(c16155i, null);
                } else if (C16149c.m17750i(new CallableC16170x(c16149c, c16168vBuildQueryPurchaseHistoryParams.f50189a, c12749d, i10), 30000L, new RunnableC15195M(c16149c, c12749d, z6, i10), c16149c.m17775z(), c16149c.m17763m()) == null) {
                    C16155i c16155iM17761j = c16149c.m17761j();
                    c16149c.m17756D(25, 11, c16155iM17761j);
                    c12749d.m14491a(c16155iM17761j, null);
                }
                c17296c = C17296C.f55119a;
            } else {
                c17296c = null;
            }
            if (c17296c == null) {
                QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase = QueryPurchaseHistoryUseCase.this;
                LogUtilsKt.errorLog$default(String.format(PurchaseStrings.INVALID_PRODUCT_TYPE, Arrays.copyOf(new Object[]{"queryPurchaseHistory"}, 1)), null, 2, null);
                C10267f c10267fM17778a = C16155i.m17778a();
                c10267fM17778a.f30498b = 5;
                BillingClientUseCase.processResult$default(queryPurchaseHistoryUseCase, c10267fM17778a.m10864c(), null, null, null, 12, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchaseHistoryUseCase(QueryPurchaseHistoryUseCaseParams useCaseParams, InterfaceC1436k onReceive, InterfaceC1436k onError, InterfaceC1436k withConnectedClient, InterfaceC1439n executeRequestOnUIThread) {
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
    public final void trackGoogleQueryPurchaseHistoryRequestIfNeeded(String productType, C16155i billingResult, Date requestStartTime) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int i10 = billingResult.f50151a;
            String str = billingResult.f50152b;
            AbstractC16544l.m18093f(str, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.m22507trackGoogleQueryPurchaseHistoryRequestWn2Vu4Y(productType, i10, str, DurationExtensionsKt.between(C21555b.f68260Z, requestStartTime, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new C127431());
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
    public String getErrorMessage() {
        return HpucjswO.oSbNOOfAA;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void onOk(List<? extends PurchaseHistoryRecord> received) {
        List<? extends PurchaseHistoryRecord> list = received;
        C17296C c17296c = null;
        List<? extends PurchaseHistoryRecord> list2 = (list == null || list.isEmpty()) ? null : received;
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                AbstractC12107L1.m13831v(new Object[]{PurchaseHistoryRecordExtensionsKt.toHumanReadableDescription((PurchaseHistoryRecord) it.next())}, 1, RestoreStrings.PURCHASE_HISTORY_RETRIEVED, LogIntent.RC_PURCHASE_SUCCESS);
            }
            c17296c = C17296C.f55119a;
        }
        if (c17296c == null) {
            LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.PURCHASE_HISTORY_EMPTY);
        }
        InterfaceC1436k interfaceC1436k = this.onReceive;
        if (received == null) {
            received = C17689w.f56480Y;
        }
        interfaceC1436k.invoke(received);
    }
}
