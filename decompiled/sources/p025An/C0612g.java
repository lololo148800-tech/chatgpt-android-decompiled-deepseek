package p025An;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC16544l;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: An.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C0612g extends AbstractC0600a {

    /* JADX INFO: renamed from: p0 */
    public final Thread f1856p0;

    /* JADX INFO: renamed from: q0 */
    public final AbstractC0607d0 f1857q0;

    public C0612g(InterfaceC18776i interfaceC18776i, Thread thread, AbstractC0607d0 abstractC0607d0) {
        super(interfaceC18776i, true, true);
        this.f1856p0 = thread;
        this.f1857q0 = abstractC0607d0;
    }

    @Override // p025An.C0641u0
    /* JADX INFO: renamed from: r */
    public final void mo1213r(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f1856p0;
        if (AbstractC16544l.m18089b(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
