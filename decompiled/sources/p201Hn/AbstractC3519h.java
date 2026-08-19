package p201Hn;

import java.util.concurrent.Executor;
import p025An.AbstractC0609e0;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Hn.h */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3519h extends AbstractC0609e0 {

    /* JADX INFO: renamed from: Z */
    public ExecutorC3514c f10637Z;

    @Override // p025An.AbstractC0563B
    /* JADX INFO: renamed from: V0 */
    public final void mo872V0(InterfaceC18776i interfaceC18776i, Runnable runnable) {
        ExecutorC3514c.m4210k(this.f10637Z, runnable, false, 6);
    }

    @Override // p025An.AbstractC0563B
    /* JADX INFO: renamed from: W0 */
    public final void mo1142W0(InterfaceC18776i interfaceC18776i, Runnable runnable) {
        ExecutorC3514c.m4210k(this.f10637Z, runnable, true, 2);
    }

    @Override // p025An.AbstractC0609e0
    /* JADX INFO: renamed from: Z0 */
    public final Executor mo1243Z0() {
        return this.f10637Z;
    }
}
