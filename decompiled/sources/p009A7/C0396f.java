package p009A7;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.AbstractC16544l;
import p002A0.C0130g;
import p003A1.AbstractC0168G;
import p523V9.AbstractC8027Y;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p780h7.C14419a;
import p909nm.AbstractC17681o;
import p918o7.C17878e;

/* JADX INFO: renamed from: A7.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0396f extends ScheduledThreadPoolExecutor {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC11256c f1317Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0396f(final InterfaceC11256c logger, final C14419a c14419a, final String str) {
        super(1, new ThreadFactoryC0394d(str, 0), new RejectedExecutionHandler() { // from class: A7.e
            /* JADX WARN: Type inference failed for: r14v2, types: [Bm.k, kotlin.jvm.internal.n] */
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                InterfaceC11256c logger2 = logger;
                AbstractC16544l.m18094g(logger2, "$logger");
                String str2 = str;
                C14419a c14419a2 = c14419a;
                if (runnable != null) {
                    ((C17878e) logger2).m19603b(5, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), new C0130g(runnable, 5), null, false, AbstractC0168G.m535x("executor.context", str2));
                    c14419a2.f45315c.invoke(runnable);
                }
            }
        });
        AbstractC16544l.m18094g(logger, "logger");
        this.f1317Y = logger;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th2) {
        super.afterExecute(runnable, th2);
        AbstractC8027Y.m8375f(runnable, th2, this.f1317Y);
    }
}
