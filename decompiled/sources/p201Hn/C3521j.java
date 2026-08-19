package p201Hn;

import p025An.AbstractC0575H;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Hn.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C3521j extends AbstractRunnableC3520i {

    /* JADX INFO: renamed from: o0 */
    public final Runnable f10640o0;

    public C3521j(Runnable runnable, long j10, boolean z6) {
        super(j10, z6);
        this.f10640o0 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10640o0.run();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f10640o0;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(AbstractC0575H.m1191t(runnable));
        sb2.append(", ");
        sb2.append(this.f10638Y);
        sb2.append(", ");
        return AbstractC9306j0.m9892k(sb2, this.f10639Z ? "Blocking" : "Non-blocking", ']');
    }
}
