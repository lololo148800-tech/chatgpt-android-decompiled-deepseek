package p009A7;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import p163G7.InterfaceExecutorServiceC3006a;
import p523V9.AbstractC8027Y;
import p661b7.InterfaceC11256c;
import p780h7.C14419a;

/* JADX INFO: renamed from: A7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0391a extends ThreadPoolExecutor implements InterfaceExecutorServiceC3006a {

    /* JADX INFO: renamed from: Z */
    public static final long f1304Z = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: Y */
    public final InterfaceC11256c f1305Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0391a(InterfaceC11256c logger, C14419a c14419a, String str) {
        super(1, 1, f1304Z, TimeUnit.MILLISECONDS, new C0393c(logger, c14419a, str), new ThreadFactoryC0394d(str, 0));
        AbstractC16544l.m18094g(logger, "logger");
        this.f1305Y = logger;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th2) {
        super.afterExecute(runnable, th2);
        AbstractC8027Y.m8375f(runnable, th2, this.f1305Y);
    }
}
