package p544W9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p001A.RunnableC0066i;
import p049Bm.InterfaceC1426a;
import p1113xn.AbstractC21329w;
import p298Lm.C5135D0;

/* JADX INFO: renamed from: W9.t3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8716t3 {
    /* JADX INFO: renamed from: a */
    public static final void m9424a(ScheduledExecutorService scheduledExecutorService, C15524y1 options) {
        AbstractC16544l.m18094g(options, "options");
        synchronized (scheduledExecutorService) {
            if (!scheduledExecutorService.isShutdown()) {
                scheduledExecutorService.shutdown();
            }
            try {
                if (!scheduledExecutorService.awaitTermination(options.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
                    scheduledExecutorService.shutdownNow();
                }
            } catch (InterruptedException unused) {
                scheduledExecutorService.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9426c(ExecutorService executorService, C15524y1 options, String taskName, Runnable runnable) {
        AbstractC16544l.m18094g(options, "options");
        AbstractC16544l.m18094g(taskName, "taskName");
        String name = Thread.currentThread().getName();
        AbstractC16544l.m18093f(name, "currentThread().name");
        if (AbstractC21329w.m21734u(name, "SentryReplayIntegration", false)) {
            runnable.run();
            return;
        }
        try {
            executorService.submit(new RunnableC0066i(runnable, options, taskName, 23));
        } catch (Throwable th2) {
            options.getLogger().mo16297h(EnumC15375i1.ERROR, AbstractC10763a.m11054l("Failed to submit task ", taskName, " to executor"), th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C5135D0 m9425b(CallableMemberDescriptor callableMemberDescriptor, InterfaceC1426a interfaceC1426a) {
        if (interfaceC1426a != null) {
            return new C5135D0(callableMemberDescriptor, interfaceC1426a);
        }
        throw new IllegalArgumentException(qffLJgOYizGmMj.xmS);
    }
}
