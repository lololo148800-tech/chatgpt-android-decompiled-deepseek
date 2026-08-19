package p523V9;

import fo.C13710g;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p1060v9.AbstractC20502t;
import p167Gb.C3032c;
import p257K3.C4535c;
import p277L.ExecutorC4828a;
import p301M.RunnableC5228j;
import p746fa.AbstractC13600i;
import p746fa.C13601j;
import p746fa.C13603l;
import p746fa.C13606o;
import p746fa.InterfaceC13593b;
import p774h1.C14341T;
import p774h1.C14365u;
import p895n1.AbstractC17418F;
import p895n1.C17424d;
import p895n1.C17425e;

/* JADX INFO: renamed from: V9.B5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7854B5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f24747a;

    /* JADX INFO: renamed from: b */
    public static volatile C13710g f24748b;

    /* JADX INFO: renamed from: a */
    public static Object m8113a(C13606o c13606o) throws InterruptedException {
        AbstractC20502t.m21156g("Must not be called on the main application thread");
        AbstractC20502t.m21155f();
        AbstractC20502t.m21158i(c13606o, "Task must not be null");
        if (c13606o.m15131j()) {
            return m8120h(c13606o);
        }
        C3032c c3032c = new C3032c(28);
        ExecutorC4828a executorC4828a = AbstractC13600i.f42963b;
        c13606o.m15126e(executorC4828a, c3032c);
        c13606o.m15125d(executorC4828a, c3032c);
        c13606o.f42983b.m338B(new C13603l(executorC4828a, (InterfaceC13593b) c3032c));
        c13606o.m15139r();
        ((CountDownLatch) c3032c.f9127Z).await();
        return m8120h(c13606o);
    }

    /* JADX INFO: renamed from: b */
    public static Object m8114b(C13606o c13606o, long j10, TimeUnit timeUnit) {
        AbstractC20502t.m21156g("Must not be called on the main application thread");
        AbstractC20502t.m21155f();
        AbstractC20502t.m21158i(c13606o, "Task must not be null");
        AbstractC20502t.m21158i(timeUnit, "TimeUnit must not be null");
        if (c13606o.m15131j()) {
            return m8120h(c13606o);
        }
        C3032c c3032c = new C3032c(28);
        ExecutorC4828a executorC4828a = AbstractC13600i.f42963b;
        c13606o.m15126e(executorC4828a, c3032c);
        c13606o.m15125d(executorC4828a, c3032c);
        c13606o.f42983b.m338B(new C13603l(executorC4828a, (InterfaceC13593b) c3032c));
        c13606o.m15139r();
        if (((CountDownLatch) c3032c.f9127Z).await(j10, timeUnit)) {
            return m8120h(c13606o);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* JADX INFO: renamed from: c */
    public static C13606o m8115c(Executor executor, Callable callable) {
        AbstractC20502t.m21158i(executor, "Executor must not be null");
        C13606o c13606o = new C13606o();
        executor.execute(new RunnableC5228j(c13606o, 28, callable));
        return c13606o;
    }

    /* JADX INFO: renamed from: d */
    public static C13606o m8116d(Exception exc) {
        C13606o c13606o = new C13606o();
        c13606o.m15134m(exc);
        return c13606o;
    }

    /* JADX INFO: renamed from: e */
    public static C13606o m8117e(Object obj) {
        C13606o c13606o = new C13606o();
        c13606o.m15135n(obj);
        return c13606o;
    }

    /* JADX INFO: renamed from: f */
    public static final C17425e m8118f() {
        C17425e c17425e = f24747a;
        if (c17425e != null) {
            return c17425e;
        }
        C17424d c17424d = new C17424d("Outlined.Notifications", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = AbstractC17418F.f55636a;
        C14341T c14341t = new C14341T(C14365u.f45052b);
        C4535c c4535c = new C4535c(3);
        c4535c.m5290p(12.0f, 22.0f);
        c4535c.m5284j(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        c4535c.m5287m(-4.0f);
        c4535c.m5284j(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        c4535c.m5282h();
        c4535c.m5290p(18.0f, 16.0f);
        c4535c.m5294t(-5.0f);
        c4535c.m5284j(0.0f, -3.07f, -1.63f, -5.64f, -4.5f, -6.32f);
        c4535c.m5288n(13.5f, 4.0f);
        c4535c.m5284j(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        c4535c.m5292r(-1.5f, 0.67f, -1.5f, 1.5f);
        c4535c.m5294t(0.68f);
        c4535c.m5283i(7.64f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        c4535c.m5294t(5.0f);
        c4535c.m5289o(-2.0f, 2.0f);
        c4535c.m5294t(1.0f);
        c4535c.m5287m(16.0f);
        c4535c.m5294t(-1.0f);
        c4535c.m5289o(-2.0f, -2.0f);
        c4535c.m5282h();
        c4535c.m5290p(16.0f, 17.0f);
        c4535c.m5288n(8.0f, 17.0f);
        c4535c.m5294t(-6.0f);
        c4535c.m5284j(0.0f, -2.48f, 1.51f, -4.5f, 4.0f, -4.5f);
        c4535c.m5292r(4.0f, 2.02f, 4.0f, 4.5f);
        c4535c.m5294t(6.0f);
        c4535c.m5282h();
        C17424d.m19121a(c17424d, c4535c.f14813Z, 0, c14341t, null, 1.0f, 0, 2, 1.0f);
        C17425e c17425eM19122b = c17424d.m19122b();
        f24747a = c17425eM19122b;
        return c17425eM19122b;
    }

    /* JADX INFO: renamed from: g */
    public static C13606o m8119g(C13606o... c13606oArr) {
        if (c13606oArr.length == 0) {
            return m8117e(null);
        }
        List<C13606o> listAsList = Arrays.asList(c13606oArr);
        if (listAsList == null || listAsList.isEmpty()) {
            return m8117e(null);
        }
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            if (((C13606o) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        C13606o c13606o = new C13606o();
        C13601j c13601j = new C13601j(listAsList.size(), c13606o);
        for (C13606o c13606o2 : listAsList) {
            ExecutorC4828a executorC4828a = AbstractC13600i.f42963b;
            c13606o2.m15126e(executorC4828a, c13601j);
            c13606o2.m15125d(executorC4828a, c13601j);
            c13606o2.f42983b.m338B(new C13603l(executorC4828a, (InterfaceC13593b) c13601j));
            c13606o2.m15139r();
        }
        return c13606o;
    }

    /* JADX INFO: renamed from: h */
    public static Object m8120h(C13606o c13606o) throws ExecutionException {
        if (c13606o.m15132k()) {
            return c13606o.m15130i();
        }
        if (c13606o.f42985d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(c13606o.m15129h());
    }
}
