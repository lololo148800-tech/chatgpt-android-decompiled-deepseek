package p153Fn;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p025An.InterfaceC0651z0;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Fn.r */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2940r extends AbstractC2924b implements InterfaceC0651z0 {

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8803p0 = AtomicIntegerFieldUpdater.newUpdater(AbstractC2940r.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: o0 */
    public final long f8804o0;

    public AbstractC2940r(long j10, AbstractC2940r abstractC2940r, int i10) {
        super(abstractC2940r);
        this.f8804o0 = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // p153Fn.AbstractC2924b
    /* JADX INFO: renamed from: d */
    public final boolean mo3745d() {
        return f8803p0.get(this) == mo2561g() && m3744c() != null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3764f() {
        return f8803p0.addAndGet(this, -65536) == mo2561g() && m3744c() != null;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo2561g();

    /* JADX INFO: renamed from: h */
    public abstract void mo2562h(int i10, InterfaceC18776i interfaceC18776i);

    /* JADX INFO: renamed from: i */
    public final void m3765i() {
        if (f8803p0.incrementAndGet(this) == mo2561g()) {
            m3746e();
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3766j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f8803p0;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == mo2561g() && m3744c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
