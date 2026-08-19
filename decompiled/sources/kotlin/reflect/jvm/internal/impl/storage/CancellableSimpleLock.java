package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes2.dex */
public final class CancellableSimpleLock extends DefaultSimpleLock {

    /* JADX INFO: renamed from: b */
    public final Runnable f53125b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1436k f53126c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancellableSimpleLock(Lock lock, Runnable checkCancelled, InterfaceC1436k interruptedExceptionHandler) {
        super(lock);
        AbstractC16544l.m18094g(lock, "lock");
        AbstractC16544l.m18094g(checkCancelled, "checkCancelled");
        AbstractC16544l.m18094g(interruptedExceptionHandler, "interruptedExceptionHandler");
        this.f53125b = checkCancelled;
        this.f53126c = interruptedExceptionHandler;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.DefaultSimpleLock, kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
        while (!this.f53127a.tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f53125b.run();
            } catch (InterruptedException e10) {
                this.f53126c.invoke(e10);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CancellableSimpleLock(Runnable checkCancelled, InterfaceC1436k interruptedExceptionHandler) {
        this(new ReentrantLock(), checkCancelled, interruptedExceptionHandler);
        AbstractC16544l.m18094g(checkCancelled, "checkCancelled");
        AbstractC16544l.m18094g(interruptedExceptionHandler, "interruptedExceptionHandler");
    }
}
