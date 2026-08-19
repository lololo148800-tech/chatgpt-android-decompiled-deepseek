package p444S4;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: S4.b */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC6996b implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f22387a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f22388b;

    public ThreadFactoryC6996b(boolean z6) {
        this.f22388b = z6;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AbstractC16544l.m18094g(runnable, "runnable");
        StringBuilder sbM9893l = AbstractC9306j0.m9893l(this.f22388b ? "WM.task-" : "androidx.work-");
        sbM9893l.append(this.f22387a.incrementAndGet());
        return new Thread(runnable, sbM9893l.toString());
    }
}
