package com.revenuecat.purchases.common;

import android.os.Handler;
import android.os.Looper;
import com.auth0.android.request.internal.RunnableC11843b;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.verification.SignatureVerificationException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import org.json.JSONException;
import p1135yn.C21555b;
import p152Fm.AbstractC2922d;
import p152Fm.C2921c;
import p200Hm.C3511j;
import p523V9.AbstractC8183r5;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0010\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u001a"}, m18067d2 = {"Lcom/revenuecat/purchases/common/Dispatcher;", "", "Ljava/util/concurrent/ExecutorService;", "executorService", "Landroid/os/Handler;", "mainHandler", "", "runningIntegrationTests", "<init>", "(Ljava/util/concurrent/ExecutorService;Landroid/os/Handler;Z)V", "Ljava/lang/Runnable;", "command", "Lcom/revenuecat/purchases/common/Delay;", "delay", "Lmm/C;", "enqueue", "(Ljava/lang/Runnable;Lcom/revenuecat/purchases/common/Delay;)V", "close", "()V", "isClosed", "()Z", "Ljava/util/concurrent/ExecutorService;", "Landroid/os/Handler;", "Z", "Companion", "AsyncCall", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public class Dispatcher {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final double INTEGRATION_TEST_DELAY_PERCENTAGE = 0.01d;
    private final ExecutorService executorService;
    private final Handler mainHandler;
    private final boolean runningIntegrationTests;

    @Metadata(m18066d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0003¨\u0006\u0010"}, m18067d2 = {"Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;", "Ljava/lang/Runnable;", "<init>", "()V", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "call", "()Lcom/revenuecat/purchases/common/networking/HTTPResult;", "Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "result", "onCompletion", "(Lcom/revenuecat/purchases/common/networking/HTTPResult;)V", "run", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static abstract class AsyncCall implements Runnable {
        public abstract HTTPResult call();

        public void onCompletion(HTTPResult result) {
            AbstractC16544l.m18094g(result, "result");
        }

        public void onError(PurchasesError error) {
            AbstractC16544l.m18094g(error, "error");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                onCompletion(call());
            } catch (SignatureVerificationException e10) {
                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e10);
                LogUtilsKt.errorLog(purchasesError);
                onError(purchasesError);
            } catch (IOException e11) {
                PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e11);
                LogUtilsKt.errorLog(purchasesError2);
                onError(purchasesError2);
            } catch (SecurityException e12) {
                PurchasesError purchasesError3 = ErrorsKt.toPurchasesError(e12);
                LogUtilsKt.errorLog(purchasesError3);
                onError(purchasesError3);
            } catch (JSONException e13) {
                PurchasesError purchasesError4 = ErrorsKt.toPurchasesError(e13);
                LogUtilsKt.errorLog(purchasesError4);
                onError(purchasesError4);
            }
        }
    }

    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m18067d2 = {"Lcom/revenuecat/purchases/common/Dispatcher$Companion;", "", "()V", "INTEGRATION_TEST_DELAY_PERCENTAGE", "", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public Dispatcher(ExecutorService executorService, Handler handler, boolean z6) {
        AbstractC16544l.m18094g(executorService, "executorService");
        this.executorService = executorService;
        this.mainHandler = handler;
        this.runningIntegrationTests = z6;
    }

    public static /* synthetic */ void enqueue$default(Dispatcher dispatcher, Runnable runnable, Delay delay, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
        }
        if ((i10 & 2) != 0) {
            delay = Delay.NONE;
        }
        dispatcher.enqueue(runnable, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$2$lambda$1(Runnable command, Dispatcher this$0) {
        AbstractC16544l.m18094g(command, "$command");
        AbstractC16544l.m18094g(this$0, "this$0");
        try {
            command.run();
        } catch (Exception e10) {
            LogUtilsKt.errorLog$default("Exception running command: " + e10, null, 2, null);
            Handler handler = this$0.mainHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.revenuecat.purchases.common.a
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        Dispatcher.enqueue$lambda$2$lambda$1$lambda$0(e10);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$2$lambda$1$lambda$0(Exception e10) throws Exception {
        AbstractC16544l.m18094g(e10, "$e");
        throw e10;
    }

    public void close() {
        synchronized (this.executorService) {
            this.executorService.shutdownNow();
        }
    }

    public void enqueue(Runnable command, Delay delay) {
        AbstractC16544l.m18094g(command, "command");
        AbstractC16544l.m18094g(delay, "delay");
        synchronized (this.executorService) {
            try {
                if (!this.executorService.isShutdown()) {
                    RunnableC11843b runnableC11843b = new RunnableC11843b(command, 1, this);
                    if (delay == Delay.NONE || !(this.executorService instanceof ScheduledExecutorService)) {
                        this.executorService.submit(runnableC11843b);
                    } else {
                        C3511j c3511j = new C3511j(C21555b.m21835e(delay.getMinDelay()), C21555b.m21835e(delay.getMaxDelay()));
                        C2921c random = AbstractC2922d.f8758Y;
                        AbstractC16544l.m18094g(random, "random");
                        try {
                            long jM8763a = AbstractC8183r5.m8763a(random, c3511j);
                            if (this.runningIntegrationTests) {
                                jM8763a = (long) (jM8763a * 0.01d);
                            }
                            ((ScheduledExecutorService) this.executorService).schedule(runnableC11843b, jM8763a, TimeUnit.MILLISECONDS);
                        } catch (IllegalArgumentException e10) {
                            throw new NoSuchElementException(e10.getMessage());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean isClosed() {
        boolean zIsShutdown;
        synchronized (this.executorService) {
            zIsShutdown = this.executorService.isShutdown();
        }
        return zIsShutdown;
    }

    public /* synthetic */ Dispatcher(ExecutorService executorService, Handler handler, boolean z6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(executorService, (i10 & 2) != 0 ? new Handler(Looper.getMainLooper()) : handler, (i10 & 4) != 0 ? false : z6);
    }
}
