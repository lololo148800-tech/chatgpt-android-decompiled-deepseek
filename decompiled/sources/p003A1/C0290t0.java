package p003A1;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import mm.C17314q;
import p025An.AbstractC0563B;
import p571X9.AbstractC9227W;
import p909nm.C17677k;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: A1.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0290t0 extends AbstractC0563B {

    /* JADX INFO: renamed from: x0 */
    public static final C17314q f1042x0 = AbstractC9227W.m9800c(C0244e0.f928t0);

    /* JADX INFO: renamed from: y0 */
    public static final C0284r0 f1043y0 = new C0284r0(0);

    /* JADX INFO: renamed from: Z */
    public final Choreographer f1044Z;

    /* JADX INFO: renamed from: o0 */
    public final Handler f1045o0;

    /* JADX INFO: renamed from: t0 */
    public boolean f1050t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f1051u0;

    /* JADX INFO: renamed from: w0 */
    public final C0296v0 f1053w0;

    /* JADX INFO: renamed from: p0 */
    public final Object f1046p0 = new Object();

    /* JADX INFO: renamed from: q0 */
    public final C17677k f1047q0 = new C17677k();

    /* JADX INFO: renamed from: r0 */
    public ArrayList f1048r0 = new ArrayList();

    /* JADX INFO: renamed from: s0 */
    public ArrayList f1049s0 = new ArrayList();

    /* JADX INFO: renamed from: v0 */
    public final ChoreographerFrameCallbackC0287s0 f1052v0 = new ChoreographerFrameCallbackC0287s0(this);

    public C0290t0(Choreographer choreographer, Handler handler) {
        this.f1044Z = choreographer;
        this.f1045o0 = handler;
        this.f1053w0 = new C0296v0(choreographer, this);
    }

    /* JADX INFO: renamed from: Z0 */
    public static final void m871Z0(C0290t0 c0290t0) {
        boolean z6;
        do {
            Runnable runnableM873a1 = c0290t0.m873a1();
            while (runnableM873a1 != null) {
                runnableM873a1.run();
                runnableM873a1 = c0290t0.m873a1();
            }
            synchronized (c0290t0.f1046p0) {
                if (c0290t0.f1047q0.isEmpty()) {
                    z6 = false;
                    c0290t0.f1050t0 = false;
                } else {
                    z6 = true;
                }
            }
        } while (z6);
    }

    @Override // p025An.AbstractC0563B
    /* JADX INFO: renamed from: V0 */
    public final void mo872V0(InterfaceC18776i interfaceC18776i, Runnable runnable) {
        synchronized (this.f1046p0) {
            this.f1047q0.addLast(runnable);
            if (!this.f1050t0) {
                this.f1050t0 = true;
                this.f1045o0.post(this.f1052v0);
                if (!this.f1051u0) {
                    this.f1051u0 = true;
                    this.f1044Z.postFrameCallback(this.f1052v0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final Runnable m873a1() {
        Runnable runnable;
        synchronized (this.f1046p0) {
            C17677k c17677k = this.f1047q0;
            runnable = (Runnable) (c17677k.isEmpty() ? null : c17677k.removeFirst());
        }
        return runnable;
    }
}
