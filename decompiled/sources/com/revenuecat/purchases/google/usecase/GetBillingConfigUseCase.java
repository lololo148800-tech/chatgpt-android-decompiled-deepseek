package com.revenuecat.purchases.google.usecase;

import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.OfferingStrings;
import io.sentry.android.core.RunnableC15195M;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p315Me.Myis.CxcULo;
import p664bc.CallableC11338e;
import p826j6.AbstractC16144M;
import p826j6.AbstractC16148b;
import p826j6.C16149c;
import p826j6.C16151e;
import p826j6.C16155i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\u000b\u0012\u001e\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0007\u0012*\u0010\u0012\u001a&\u0012\u0004\u0012\u00020\u0010\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR'\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b \u0010\u001fR/\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m18067d2 = {"Lcom/revenuecat/purchases/google/usecase/GetBillingConfigUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "Lj6/e;", "Lcom/revenuecat/purchases/google/usecase/GetBillingConfigUseCaseParams;", "useCaseParams", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lkotlin/Function1;", "Lmm/C;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "Lj6/b;", "withConnectedClient", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/GetBillingConfigUseCaseParams;Lcom/revenuecat/purchases/common/caching/DeviceCache;LBm/k;LBm/k;LBm/k;LBm/n;)V", "executeAsync", "()V", "received", "onOk", "(Lj6/e;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "getDeviceCache", "()Lcom/revenuecat/purchases/common/caching/DeviceCache;", "LBm/k;", "getOnReceive", "()LBm/k;", "getOnError", "getWithConnectedClient", "", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class GetBillingConfigUseCase extends BillingClientUseCase<C16151e> {
    private final DeviceCache deviceCache;
    private final InterfaceC1436k onError;
    private final InterfaceC1436k onReceive;
    private final InterfaceC1436k withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.GetBillingConfigUseCase$executeAsync$1 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"Lj6/b;", "Lmm/C;", "invoke", "(Lj6/b;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127401 extends AbstractC16546n implements InterfaceC1436k {
        public C127401() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(AtomicBoolean hasResponded, GetBillingConfigUseCase this$0, C16155i result, C16151e c16151e) {
            AbstractC16544l.m18094g(hasResponded, "$hasResponded");
            AbstractC16544l.m18094g(this$0, "this$0");
            AbstractC16544l.m18094g(result, "result");
            if (!hasResponded.getAndSet(true)) {
                BillingClientUseCase.processResult$default(this$0, result, c16151e, null, null, 12, null);
            } else {
                AbstractC12107L1.m13831v(new Object[]{Integer.valueOf(result.f50151a)}, 1, OfferingStrings.EXTRA_GET_BILLING_CONFIG_RESPONSE, LogIntent.GOOGLE_ERROR);
            }
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AbstractC16148b) obj);
            return C17296C.f55119a;
        }

        public final void invoke(AbstractC16148b invoke) {
            AbstractC16544l.m18094g(invoke, "$this$invoke");
            C12747b c12747b = new C12747b(new AtomicBoolean(false), GetBillingConfigUseCase.this);
            C16149c c16149c = (C16149c) invoke;
            if (!c16149c.mo17749e()) {
                AbstractC11988o0.m13512g("BillingClient", "Service disconnected.");
                C16155i c16155i = AbstractC16144M.f50088k;
                c16149c.m17756D(2, 13, c16155i);
                c12747b.m14490a(c16155i, null);
                return;
            }
            if (!c16149c.f50132u) {
                AbstractC11988o0.m13512g("BillingClient", "Current client doesn't support get billing config.");
                C16155i c16155i2 = AbstractC16144M.f50102y;
                c16149c.m17756D(32, 13, c16155i2);
                c12747b.m14490a(c16155i2, null);
                return;
            }
            if (C16149c.m17750i(new CallableC11338e(c16149c, 1, c12747b), 30000L, new RunnableC15195M(c16149c, c12747b, false, 7), c16149c.m17775z(), c16149c.m17763m()) == null) {
                C16155i c16155iM17761j = c16149c.m17761j();
                c16149c.m17756D(25, 13, c16155iM17761j);
                c12747b.m14490a(c16155iM17761j, null);
            }
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new C127401());
    }

    public final DeviceCache getDeviceCache() {
        return this.deviceCache;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error getting billing config";
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBillingConfigUseCase(GetBillingConfigUseCaseParams useCaseParams, DeviceCache deviceCache, InterfaceC1436k onReceive, InterfaceC1436k onError, InterfaceC1436k withConnectedClient, InterfaceC1439n executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        AbstractC16544l.m18094g(useCaseParams, "useCaseParams");
        AbstractC16544l.m18094g(deviceCache, CxcULo.RgcWQSxZysnjRF);
        AbstractC16544l.m18094g(onReceive, "onReceive");
        AbstractC16544l.m18094g(onError, "onError");
        AbstractC16544l.m18094g(withConnectedClient, "withConnectedClient");
        AbstractC16544l.m18094g(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.deviceCache = deviceCache;
        this.onReceive = onReceive;
        this.onError = onError;
        this.withConnectedClient = withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void onOk(C16151e received) {
        if (received == null) {
            this.onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, BillingStrings.BILLING_CONFIG_NULL_ON_SUCCESS));
            return;
        }
        DeviceCache deviceCache = this.deviceCache;
        String str = received.f50138a;
        AbstractC16544l.m18093f(str, "received.countryCode");
        deviceCache.setStorefront(str);
        this.onReceive.invoke(received);
    }
}
