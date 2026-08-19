package p153Fn;

import com.google.protobuf.AbstractC12107L1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p025An.AbstractC0563B;
import p025An.AbstractC0579J;
import p025An.C0624m;
import p025An.InterfaceC0585M;
import p025An.InterfaceC0595V;
import p301M.RunnableC5228j;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Fn.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C2929g extends AbstractC0563B implements InterfaceC0585M {

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8777t0 = AtomicIntegerFieldUpdater.newUpdater(C2929g.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC0585M f8778Z;

    /* JADX INFO: renamed from: o0 */
    public final AbstractC0563B f8779o0;

    /* JADX INFO: renamed from: p0 */
    public final int f8780p0;

    /* JADX INFO: renamed from: q0 */
    public final String f8781q0;

    /* JADX INFO: renamed from: r0 */
    public final C2932j f8782r0;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: s0 */
    public final Object f8783s0;

    /* JADX WARN: Multi-variable type inference failed */
    public C2929g(AbstractC0563B abstractC0563B, int i10, String str) {
        InterfaceC0585M interfaceC0585M = abstractC0563B instanceof InterfaceC0585M ? (InterfaceC0585M) abstractC0563B : null;
        this.f8778Z = interfaceC0585M == null ? AbstractC0579J.f1812a : interfaceC0585M;
        this.f8779o0 = abstractC0563B;
        this.f8780p0 = i10;
        this.f8781q0 = str;
        this.f8782r0 = new C2932j();
        this.f8783s0 = new Object();
    }

    @Override // p025An.InterfaceC0585M
    /* JADX INFO: renamed from: S */
    public final InterfaceC0595V mo1199S(long j10, Runnable runnable, InterfaceC18776i interfaceC18776i) {
        return this.f8778Z.mo1199S(j10, runnable, interfaceC18776i);
    }

    @Override // p025An.AbstractC0563B
    /* JADX INFO: renamed from: V0 */
    public final void mo872V0(InterfaceC18776i interfaceC18776i, Runnable runnable) {
        Runnable runnableM3747Z0;
        this.f8782r0.m3753a(runnable);
        if (f8777t0.get(this) >= this.f8780p0 || !m3748a1() || (runnableM3747Z0 = m3747Z0()) == null) {
            return;
        }
        AbstractC2923a.m3737k(this.f8779o0, this, new RunnableC5228j(this, runnableM3747Z0, false, 4));
    }

    @Override // p025An.AbstractC0563B
    /* JADX INFO: renamed from: W0 */
    public final void mo1142W0(InterfaceC18776i interfaceC18776i, Runnable runnable) {
        Runnable runnableM3747Z0;
        this.f8782r0.m3753a(runnable);
        if (f8777t0.get(this) >= this.f8780p0 || !m3748a1() || (runnableM3747Z0 = m3747Z0()) == null) {
            return;
        }
        this.f8779o0.mo1142W0(this, new RunnableC5228j(this, runnableM3747Z0, false, 4));
    }

    /* JADX INFO: renamed from: Z0 */
    public final Runnable m3747Z0() {
        while (true) {
            Runnable runnable = (Runnable) this.f8782r0.m3756d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f8783s0) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8777t0;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f8782r0.m3755c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final boolean m3748a1() {
        synchronized (this.f8783s0) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8777t0;
            if (atomicIntegerFieldUpdater.get(this) >= this.f8780p0) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // p025An.InterfaceC0585M
    /* JADX INFO: renamed from: k */
    public final void mo1211k(long j10, C0624m c0624m) {
        this.f8778Z.mo1211k(j10, c0624m);
    }

    @Override // p025An.AbstractC0563B
    public final String toString() {
        String str = this.f8781q0;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8779o0);
        sb2.append(".limitedParallelism(");
        return AbstractC12107L1.m13826q(sb2, this.f8780p0, ')');
    }
}
