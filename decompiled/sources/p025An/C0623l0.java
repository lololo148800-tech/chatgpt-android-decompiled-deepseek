package p025An;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: An.l0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0623l0 extends AbstractC0633q0 {

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1868r0 = AtomicIntegerFieldUpdater.newUpdater(C0623l0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC1436k f1869q0;

    public C0623l0(InterfaceC1436k interfaceC1436k) {
        this.f1869q0 = interfaceC1436k;
    }

    @Override // p025An.AbstractC0633q0
    /* JADX INFO: renamed from: j */
    public final boolean mo1149j() {
        return true;
    }

    @Override // p025An.AbstractC0633q0
    /* JADX INFO: renamed from: k */
    public final void mo1150k(Throwable th2) {
        if (f1868r0.compareAndSet(this, 0, 1)) {
            this.f1869q0.invoke(th2);
        }
    }
}
