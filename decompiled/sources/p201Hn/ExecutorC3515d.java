package p201Hn;

import java.util.concurrent.Executor;
import p025An.AbstractC0563B;
import p025An.AbstractC0609e0;
import p153Fn.AbstractC2923a;
import p153Fn.AbstractC2943u;
import p972qm.C18777j;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Hn.d */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC3515d extends AbstractC0609e0 implements Executor {

    /* JADX INFO: renamed from: Z */
    public static final ExecutorC3515d f10633Z = new ExecutorC3515d();

    /* JADX INFO: renamed from: o0 */
    public static final AbstractC0563B f10634o0;

    static {
        C3523l c3523l = C3523l.f10647Z;
        int i10 = AbstractC2943u.f8808a;
        if (64 >= i10) {
            i10 = 64;
        }
        f10634o0 = c3523l.mo1144Y0(AbstractC2923a.m3740n("kotlinx.coroutines.io.parallelism", i10, 0, 0, 12), null);
    }

    @Override // p025An.AbstractC0563B
    /* JADX INFO: renamed from: V0 */
    public final void mo872V0(InterfaceC18776i interfaceC18776i, Runnable runnable) {
        f10634o0.mo872V0(interfaceC18776i, runnable);
    }

    @Override // p025An.AbstractC0563B
    /* JADX INFO: renamed from: W0 */
    public final void mo1142W0(InterfaceC18776i interfaceC18776i, Runnable runnable) {
        f10634o0.mo1142W0(interfaceC18776i, runnable);
    }

    @Override // p025An.AbstractC0563B
    /* JADX INFO: renamed from: Y0 */
    public final AbstractC0563B mo1144Y0(int i10, String str) {
        return C3523l.f10647Z.mo1144Y0(i10, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo872V0(C18777j.f59682Y, runnable);
    }

    @Override // p025An.AbstractC0563B
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // p025An.AbstractC0609e0
    /* JADX INFO: renamed from: Z0 */
    public final Executor mo1243Z0() {
        return this;
    }
}
