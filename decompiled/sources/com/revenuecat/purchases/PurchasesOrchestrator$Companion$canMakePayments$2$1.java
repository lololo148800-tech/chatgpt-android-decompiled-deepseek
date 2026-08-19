package com.revenuecat.purchases;

import android.os.Handler;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.BillingResultExtensionsKt;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p001A.RunnableC0066i;
import p109E3.RunnableC2301y;
import p826j6.AbstractC16148b;
import p826j6.C16155i;
import p826j6.InterfaceC16150d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m18067d2 = {"com/revenuecat/purchases/PurchasesOrchestrator$Companion$canMakePayments$2$1", "Lj6/d;", "Lj6/i;", "billingResult", "Lmm/C;", "onBillingSetupFinished", "(Lj6/i;)V", "onBillingServiceDisconnected", "()V", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PurchasesOrchestrator$Companion$canMakePayments$2$1 implements InterfaceC16150d {
    final /* synthetic */ AbstractC16148b $billingClient;
    final /* synthetic */ Callback<Boolean> $callback;
    final /* synthetic */ List<BillingFeature> $features;
    final /* synthetic */ AtomicBoolean $hasResponded;
    final /* synthetic */ Handler $mainHandler;

    /* JADX WARN: Multi-variable type inference failed */
    public PurchasesOrchestrator$Companion$canMakePayments$2$1(Handler handler, AtomicBoolean atomicBoolean, Callback<Boolean> callback, AbstractC16148b abstractC16148b, List<? extends BillingFeature> list) {
        this.$mainHandler = handler;
        this.$hasResponded = atomicBoolean;
        this.$callback = callback;
        this.$billingClient = abstractC16148b;
        this.$features = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:576)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:602)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    public static final void onBillingServiceDisconnected$lambda$2(AbstractC16148b billingClient, AtomicBoolean hasResponded, Callback callback) {
        AbstractC16544l.m18094g(billingClient, "$billingClient");
        AbstractC16544l.m18094g(hasResponded, "$hasResponded");
        AbstractC16544l.m18094g(callback, "$callback");
        try {
            try {
                billingClient.mo17711c();
                if (hasResponded.getAndSet(true)) {
                    LogWrapperKt.log(LogIntent.GOOGLE_ERROR, PurchaseStrings.EXTRA_CALLBACK_CANMAKEPAYMENTS);
                } else {
                    callback.onReceived(Boolean.FALSE);
                }
            } catch (IllegalArgumentException e10) {
                LogWrapperKt.log(LogIntent.GOOGLE_ERROR, String.format(PurchaseStrings.EXCEPTION_CANMAKEPAYMENTS, Arrays.copyOf(new Object[]{e10.getLocalizedMessage()}, 1)));
                if (!hasResponded.getAndSet(true)) {
                    callback.onReceived(Boolean.FALSE);
                }
            }
        } catch (Throwable th2) {
            if (hasResponded.getAndSet(true)) {
                LogWrapperKt.log(LogIntent.GOOGLE_ERROR, PurchaseStrings.EXTRA_CALLBACK_CANMAKEPAYMENTS);
            } else {
                callback.onReceived(Boolean.FALSE);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBillingSetupFinished$lambda$1(AtomicBoolean hasResponded, C16155i billingResult, Callback callback, AbstractC16148b billingClient, List features) {
        boolean z6;
        AbstractC16544l.m18094g(hasResponded, "$hasResponded");
        AbstractC16544l.m18094g(billingResult, "$billingResult");
        AbstractC16544l.m18094g(callback, "$callback");
        AbstractC16544l.m18094g(billingClient, "$billingClient");
        AbstractC16544l.m18094g(features, "$features");
        if (hasResponded.getAndSet(true)) {
            AbstractC12107L1.m13831v(new Object[]{Integer.valueOf(billingResult.f50151a)}, 1, PurchaseStrings.EXTRA_CONNECTION_CANMAKEPAYMENTS, LogIntent.GOOGLE_ERROR);
            return;
        }
        try {
            if (!BillingResultExtensionsKt.isSuccessful(billingResult)) {
                callback.onReceived(Boolean.FALSE);
                billingClient.mo17711c();
                return;
            }
            List list = features;
            if ((list instanceof Collection) && list.isEmpty()) {
                z6 = true;
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C16155i c16155iMo17748d = billingClient.mo17748d(((BillingFeature) it.next()).getPlayBillingClientName());
                    AbstractC16544l.m18093f(c16155iMo17748d, "billingClient.isFeatureS…it.playBillingClientName)");
                    if (!BillingResultExtensionsKt.isSuccessful(c16155iMo17748d)) {
                        z6 = false;
                    }
                }
                z6 = true;
            }
            billingClient.mo17711c();
            callback.onReceived(Boolean.valueOf(z6));
        } catch (IllegalArgumentException e10) {
            AbstractC12107L1.m13831v(new Object[]{e10.getLocalizedMessage()}, 1, PurchaseStrings.EXCEPTION_CANMAKEPAYMENTS, LogIntent.GOOGLE_ERROR);
            callback.onReceived(Boolean.FALSE);
        }
    }

    @Override // p826j6.InterfaceC16150d
    public void onBillingServiceDisconnected() {
        this.$mainHandler.post(new RunnableC0066i(this.$billingClient, this.$hasResponded, this.$callback, 20));
    }

    @Override // p826j6.InterfaceC16150d
    public void onBillingSetupFinished(C16155i billingResult) {
        AbstractC16544l.m18094g(billingResult, "billingResult");
        this.$mainHandler.post(new RunnableC2301y(this.$hasResponded, billingResult, this.$callback, this.$billingClient, this.$features, 1));
    }
}
