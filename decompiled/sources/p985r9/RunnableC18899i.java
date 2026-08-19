package p985r9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import io.sentry.android.core.AbstractC15256t;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p009A7.ThreadFactoryC0394d;
import p117Eb.C2380j;
import p519V4.RunnableC7757e;
import p523V9.AbstractC7854B5;

/* JADX INFO: renamed from: r9.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC18899i implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ FirebaseInstanceIdReceiver f60248Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Intent f60249Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Context f60250o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f60251p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ BroadcastReceiver.PendingResult f60252q0;

    public /* synthetic */ RunnableC18899i(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z6, BroadcastReceiver.PendingResult pendingResult) {
        this.f60248Y = firebaseInstanceIdReceiver;
        this.f60249Z = intent;
        this.f60250o0 = context;
        this.f60251p0 = z6;
        this.f60252q0 = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executorUnconfigurableExecutorService;
        int iIntValue;
        int iM13703a;
        FirebaseInstanceIdReceiver firebaseInstanceIdReceiver = this.f60248Y;
        Intent intent = this.f60249Z;
        Context context = this.f60250o0;
        boolean z6 = this.f60251p0;
        BroadcastReceiver.PendingResult pendingResult = this.f60252q0;
        firebaseInstanceIdReceiver.getClass();
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                iM13703a = FirebaseInstanceIdReceiver.m13703a(intent2);
            } else if (intent.getExtras() == null) {
                iM13703a = 500;
            } else {
                C18891a c18891a = new C18891a(intent);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (FirebaseInstanceIdReceiver.class) {
                    try {
                        SoftReference softReference = FirebaseInstanceIdReceiver.f36847b;
                        executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                        if (executorUnconfigurableExecutorService == null) {
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0394d("pscm-ack-executor", 1));
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                            FirebaseInstanceIdReceiver.f36847b = new SoftReference(executorUnconfigurableExecutorService);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                executorUnconfigurableExecutorService.execute(new RunnableC7757e(context, c18891a, countDownLatch));
                try {
                    iIntValue = ((Integer) AbstractC7854B5.m8113a(new C2380j(context).m3478b(intent))).intValue();
                } catch (InterruptedException | ExecutionException e10) {
                    AbstractC15256t.m16466d("FirebaseMessaging", "Failed to send message to service.", e10);
                    iIntValue = 500;
                }
                try {
                    if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                        AbstractC15256t.m16482t("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e11) {
                    AbstractC15256t.m16482t("CloudMessagingReceiver", "Message ack failed: ".concat(e11.toString()));
                }
                iM13703a = iIntValue;
            }
            if (z6 && pendingResult != null) {
                pendingResult.setResultCode(iM13703a);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th3) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th3;
        }
    }
}
