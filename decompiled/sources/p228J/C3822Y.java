package p228J;

import androidx.lifecycle.InterfaceC11070F;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A.C0042V0;
import p221Ii.RunnableC3724c;

/* JADX INFO: renamed from: J.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C3822Y implements InterfaceC11070F {

    /* JADX INFO: renamed from: Y */
    public final AtomicBoolean f11574Y = new AtomicBoolean(true);

    /* JADX INFO: renamed from: Z */
    public final C0042V0 f11575Z;

    /* JADX INFO: renamed from: o0 */
    public final Executor f11576o0;

    public C3822Y(Executor executor, C0042V0 c0042v0) {
        this.f11576o0 = executor;
        this.f11575Z = c0042v0;
    }

    @Override // androidx.lifecycle.InterfaceC11070F
    /* JADX INFO: renamed from: u */
    public final void mo259u(Object obj) {
        this.f11576o0.execute(new RunnableC3724c(this, 4, (C3823Z) obj));
    }
}
