package com.revenuecat.purchases.google.usecase;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.BillingResponse;
import com.revenuecat.purchases.google.BillingResultExtensionsKt;
import com.revenuecat.purchases.google.ErrorsKt;
import com.revenuecat.purchases.strings.BillingStrings;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1135yn.C21555b;
import p826j6.AbstractC16148b;
import p826j6.C16155i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u0012*\u0010\r\u001a&\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u00070\nj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0017\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u0019\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H&¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00028\u0000H&¢\u0006\u0004\b!\u0010\"JI\u0010%\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010#\u001a\u00028\u00002\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b%\u0010&J)\u0010)\u001a\u00020\u0007*\u0004\u0018\u00010'2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00070\u0005H\u0004¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+R$\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R;\u0010\r\u001a&\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u00070\nj\u0002`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u001a\u00101\u001a\u0002008\u0014X\u0094D¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082D¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u001f\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, m18067d2 = {"Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", TokenNames.f32019T, "", "Lcom/revenuecat/purchases/google/usecase/UseCaseParams;", "useCaseParams", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Lmm/C;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/UseCaseParams;LBm/k;LBm/n;)V", "", "getStackTrace", "()Ljava/lang/String;", "Lj6/i;", "billingResult", "forwardError", "(Lj6/i;)V", "backoffOrRetryNetworkError", "(LBm/k;Lj6/i;)V", "backoffOrErrorIfServiceUnavailable", "retryWithBackoff", "()V", "delayMilliseconds", "run", "(J)V", "executeAsync", "received", "onOk", "(Ljava/lang/Object;)V", "response", "onSuccess", "processResult", "(Lj6/i;Ljava/lang/Object;LBm/k;LBm/k;)V", "Lj6/b;", "receivingFunction", "withConnectedClient", "(Lj6/b;LBm/k;)V", "Lcom/revenuecat/purchases/google/usecase/UseCaseParams;", "LBm/k;", "LBm/n;", "getExecuteRequestOnUIThread", "()LBm/n;", "", "backoffForNetworkErrors", "Z", "getBackoffForNetworkErrors", "()Z", "", "maxRetries", TokenNames.f32012I, "retryAttempt", "Lyn/b;", "retryBackoff", "J", "getErrorMessage", "errorMessage", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class BillingClientUseCase<T> {
    private final boolean backoffForNetworkErrors;
    private final InterfaceC1439n executeRequestOnUIThread;
    private final int maxRetries;
    private final InterfaceC1436k onError;
    private int retryAttempt;
    private long retryBackoff;
    private final UseCaseParams useCaseParams;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.BillingClientUseCase$processResult$1 */
    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class C127361 extends AbstractC16541i implements InterfaceC1436k {
        public C127361(Object obj) {
            super(1, 0, BillingClientUseCase.class, obj, "onOk", "onOk(Ljava/lang/Object;)V");
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m22515invoke(obj);
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22515invoke(T t10) {
            ((BillingClientUseCase) this.receiver).onOk(t10);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.BillingClientUseCase$processResult$2 */
    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class C127372 extends AbstractC16541i implements InterfaceC1436k {
        public C127372(Object obj) {
            super(1, 0, BillingClientUseCase.class, obj, "forwardError", "forwardError(Lcom/android/billingclient/api/BillingResult;)V");
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C16155i) obj);
            return C17296C.f55119a;
        }

        public final void invoke(C16155i p10) {
            AbstractC16544l.m18094g(p10, "p0");
            ((BillingClientUseCase) this.receiver).forwardError(p10);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.BillingClientUseCase$run$1 */
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {TokenNames.f32019T, "Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127381 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ BillingClientUseCase<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127381(BillingClientUseCase<T> billingClientUseCase) {
            super(1);
            this.this$0 = billingClientUseCase;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                this.this$0.executeAsync();
            } else {
                ((BillingClientUseCase) this.this$0).onError.invoke(purchasesError);
            }
        }
    }

    public BillingClientUseCase(UseCaseParams useCaseParams, InterfaceC1436k onError, InterfaceC1439n executeRequestOnUIThread) {
        AbstractC16544l.m18094g(useCaseParams, "useCaseParams");
        AbstractC16544l.m18094g(onError, "onError");
        AbstractC16544l.m18094g(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onError = onError;
        this.executeRequestOnUIThread = executeRequestOnUIThread;
        this.maxRetries = 3;
        this.retryBackoff = BillingClientUseCaseKt.RETRY_TIMER_START;
    }

    private final void backoffOrErrorIfServiceUnavailable(InterfaceC1436k onError, C16155i billingResult) {
        AbstractC12107L1.m13831v(new Object[]{Boolean.valueOf(this.useCaseParams.getAppInBackground())}, 1, BillingStrings.BILLING_SERVICE_UNAVAILABLE, LogIntent.GOOGLE_WARNING);
        if (C21555b.m21833c(this.retryBackoff, this.useCaseParams.getAppInBackground() ? BillingClientUseCaseKt.getRETRY_TIMER_MAX_TIME() : BillingClientUseCaseKt.getRETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND()) < 0) {
            retryWithBackoff();
        } else {
            onError.invoke(billingResult);
        }
    }

    private final void backoffOrRetryNetworkError(InterfaceC1436k onError, C16155i billingResult) {
        int i10;
        if (getBackoffForNetworkErrors() && C21555b.m21833c(this.retryBackoff, BillingClientUseCaseKt.getRETRY_TIMER_MAX_TIME()) < 0) {
            retryWithBackoff();
        } else if (getBackoffForNetworkErrors() || (i10 = this.retryAttempt) >= this.maxRetries) {
            onError.invoke(billingResult);
        } else {
            this.retryAttempt = i10 + 1;
            executeAsync();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forwardError(C16155i billingResult) {
        String str = getErrorMessage() + " - " + BillingResultExtensionsKt.toHumanReadableDescription(billingResult);
        LogWrapperKt.log(LogIntent.GOOGLE_ERROR, str);
        InterfaceC1436k interfaceC1436k = this.onError;
        PurchasesError purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(billingResult.f50151a, str);
        LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
        interfaceC1436k.invoke(purchasesErrorBillingResponseToPurchasesError);
    }

    private final String getStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        AbstractC16544l.m18093f(string, "stringWriter.toString()");
        return string;
    }

    public static /* synthetic */ void processResult$default(BillingClientUseCase billingClientUseCase, C16155i c16155i, Object obj, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processResult");
        }
        if ((i10 & 4) != 0) {
            interfaceC1436k = new C127361(billingClientUseCase);
        }
        if ((i10 & 8) != 0) {
            interfaceC1436k2 = new C127372(billingClientUseCase);
        }
        billingClientUseCase.processResult(c16155i, obj, interfaceC1436k, interfaceC1436k2);
    }

    private final void retryWithBackoff() {
        long j10 = this.retryBackoff;
        this.retryBackoff = DurationExtensionsKt.m22500minQTBD994(C21555b.m21840j(2, j10), BillingClientUseCaseKt.getRETRY_TIMER_MAX_TIME());
        run(C21555b.m21835e(j10));
    }

    public static /* synthetic */ void run$default(BillingClientUseCase billingClientUseCase, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: run");
        }
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        billingClientUseCase.run(j10);
    }

    public abstract void executeAsync();

    public boolean getBackoffForNetworkErrors() {
        return this.backoffForNetworkErrors;
    }

    public abstract String getErrorMessage();

    public final InterfaceC1439n getExecuteRequestOnUIThread() {
        return this.executeRequestOnUIThread;
    }

    public abstract void onOk(T received);

    public final void processResult(C16155i billingResult, T response, InterfaceC1436k onSuccess, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(billingResult, "billingResult");
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        BillingResponse billingResponseFromCode = BillingResponse.INSTANCE.fromCode(billingResult.f50151a);
        if (AbstractC16544l.m18089b(billingResponseFromCode, BillingResponse.C12712OK.INSTANCE)) {
            this.retryBackoff = BillingClientUseCaseKt.RETRY_TIMER_START;
            onSuccess.invoke(response);
            return;
        }
        if (AbstractC16544l.m18089b(billingResponseFromCode, BillingResponse.ServiceDisconnected.INSTANCE)) {
            LogWrapperKt.log(LogIntent.GOOGLE_ERROR, BillingStrings.BILLING_SERVICE_DISCONNECTED);
            run$default(this, 0L, 1, null);
        } else {
            if (AbstractC16544l.m18089b(billingResponseFromCode, BillingResponse.ServiceUnavailable.INSTANCE)) {
                backoffOrErrorIfServiceUnavailable(onError, billingResult);
                return;
            }
            if (AbstractC16544l.m18089b(billingResponseFromCode, BillingResponse.NetworkError.INSTANCE) ? true : AbstractC16544l.m18089b(billingResponseFromCode, BillingResponse.Error.INSTANCE)) {
                backoffOrRetryNetworkError(onError, billingResult);
            } else {
                onError.invoke(billingResult);
            }
        }
    }

    public final void run(long delayMilliseconds) {
        this.executeRequestOnUIThread.invoke(Long.valueOf(delayMilliseconds), new C127381(this));
    }

    public final void withConnectedClient(AbstractC16148b abstractC16148b, InterfaceC1436k receivingFunction) {
        AbstractC16544l.m18094g(receivingFunction, "receivingFunction");
        C17296C c17296c = null;
        if (abstractC16148b != null) {
            if (!abstractC16148b.mo17749e()) {
                abstractC16148b = null;
            }
            if (abstractC16148b != null) {
                receivingFunction.invoke(abstractC16148b);
                c17296c = C17296C.f55119a;
            }
        }
        if (c17296c == null) {
            AbstractC12107L1.m13831v(new Object[]{getStackTrace()}, 1, BillingStrings.BILLING_CLIENT_DISCONNECTED, LogIntent.GOOGLE_WARNING);
        }
    }
}
