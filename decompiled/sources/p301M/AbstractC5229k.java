package p301M;

import android.javax.sip.C10808o;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p003A1.RunnableC0153B;
import p277L.ExecutorC4828a;
import p283L5.AbstractC4941g;
import p544W9.AbstractC8577W2;
import p610Z1.C10142i;
import p610Z1.C10147n;
import p747fb.InterfaceFutureC13608b;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: M.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5229k {
    /* JADX INFO: renamed from: a */
    public static Object m5777a(InterfaceFutureC13608b interfaceFutureC13608b) {
        AbstractC4941g.m5559R("Future was expected to be done, " + interfaceFutureC13608b, interfaceFutureC13608b.isDone());
        return m5778b(interfaceFutureC13608b);
    }

    /* JADX INFO: renamed from: b */
    public static Object m5778b(Future future) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th2) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public static C5231m m5779c(Object obj) {
        return obj == null ? C5231m.f16977o0 : new C5231m(obj, 0);
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceFutureC13608b m5780d(InterfaceFutureC13608b interfaceFutureC13608b) {
        interfaceFutureC13608b.getClass();
        return interfaceFutureC13608b.isDone() ? interfaceFutureC13608b : AbstractC16347a.m17947b(new C5225g(interfaceFutureC13608b, 1));
    }

    /* JADX INFO: renamed from: e */
    public static void m5781e(boolean z6, InterfaceFutureC13608b interfaceFutureC13608b, C10142i c10142i, ExecutorC4828a executorC4828a) {
        interfaceFutureC13608b.getClass();
        c10142i.getClass();
        executorC4828a.getClass();
        interfaceFutureC13608b.mo5766a(new RunnableC5228j(interfaceFutureC13608b, 0, new C10808o(c10142i, 15)), executorC4828a);
        if (z6) {
            RunnableC0153B runnableC0153B = new RunnableC0153B(interfaceFutureC13608b, 7);
            ExecutorC4828a executorC4828aM9240b = AbstractC8577W2.m9240b();
            C10147n c10147n = c10142i.f30066c;
            if (c10147n != null) {
                c10147n.mo5766a(runnableC0153B, executorC4828aM9240b);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static RunnableC5220b m5782f(InterfaceFutureC13608b interfaceFutureC13608b, InterfaceC5219a interfaceC5219a, Executor executor) {
        RunnableC5220b runnableC5220b = new RunnableC5220b(interfaceC5219a, interfaceFutureC13608b);
        interfaceFutureC13608b.mo5766a(runnableC5220b, executor);
        return runnableC5220b;
    }
}
