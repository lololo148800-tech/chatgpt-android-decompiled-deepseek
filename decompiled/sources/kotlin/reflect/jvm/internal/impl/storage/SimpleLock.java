package kotlin.reflect.jvm.internal.impl.storage;

import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes2.dex */
public interface SimpleLock {
    public static final Companion Companion = Companion.f53132a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f53132a = new Companion();

        /* JADX WARN: Multi-variable type inference failed */
        public final DefaultSimpleLock simpleLock(Runnable runnable, InterfaceC1436k interfaceC1436k) {
            if (runnable != null && interfaceC1436k != null) {
                return new CancellableSimpleLock(runnable, interfaceC1436k);
            }
            return new DefaultSimpleLock(null, 1, 0 == true ? 1 : 0);
        }
    }

    void lock();

    void unlock();
}
