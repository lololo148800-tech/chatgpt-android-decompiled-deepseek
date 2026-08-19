package p025An;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: An.F0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0572F0 extends AbstractC0633q0 {

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1787s0 = AtomicIntegerFieldUpdater.newUpdater(C0572F0.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: q0 */
    public final Thread f1788q0 = Thread.currentThread();

    /* JADX INFO: renamed from: r0 */
    public InterfaceC0595V f1789r0;

    /* JADX INFO: renamed from: m */
    public static void m1148m(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    @Override // p025An.AbstractC0633q0
    /* JADX INFO: renamed from: j */
    public final boolean mo1149j() {
        return true;
    }

    @Override // p025An.AbstractC0633q0
    /* JADX INFO: renamed from: k */
    public final void mo1150k(Throwable th2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f1787s0;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                m1148m(i10);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 2));
        this.f1788q0.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    /* JADX INFO: renamed from: l */
    public final void m1151l() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1787s0;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m1148m(i10);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i10, 1)) {
                InterfaceC0595V interfaceC0595V = this.f1789r0;
                if (interfaceC0595V != null) {
                    interfaceC0595V.dispose();
                    return;
                }
                return;
            }
        }
    }
}
