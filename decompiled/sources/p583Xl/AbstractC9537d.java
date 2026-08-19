package p583Xl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.C0611f0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p1113xn.AbstractC21329w;
import p178H.ThreadFactoryC3157m;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xl.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9537d {

    /* JADX INFO: renamed from: a */
    public static final ExecutorService f28692a;

    /* JADX INFO: renamed from: b */
    public static final C0611f0 f28693b;

    static {
        ExecutorService executor = Executors.newSingleThreadExecutor(new ThreadFactoryC3157m(2));
        f28692a = executor;
        AbstractC16544l.m18093f(executor, "executor");
        f28693b = new C0611f0(executor);
    }

    /* JADX INFO: renamed from: a */
    public static final Object m10030a(InterfaceC1426a interfaceC1426a) {
        String name = Thread.currentThread().getName();
        AbstractC16544l.m18093f(name, "getName(...)");
        if (AbstractC21329w.m21734u(name, "LK_RTC_THREAD", false)) {
            return interfaceC1426a.invoke();
        }
        return f28692a.submit(new CallableC9534a(1, interfaceC1426a)).get();
    }

    /* JADX INFO: renamed from: b */
    public static final void m10031b(InterfaceC1426a interfaceC1426a) {
        String name = Thread.currentThread().getName();
        AbstractC16544l.m18093f(name, "getName(...)");
        if (AbstractC21329w.m21734u(name, "LK_RTC_THREAD", false)) {
            interfaceC1426a.invoke();
        } else {
            f28692a.submit(new CallableC9534a(0, interfaceC1426a));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Object m10032c(InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        return AbstractC0575H.m1183l(new C9536c(interfaceC1439n, null), abstractC19687c);
    }
}
