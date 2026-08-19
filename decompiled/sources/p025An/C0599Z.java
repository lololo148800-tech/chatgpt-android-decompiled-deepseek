package p025An;

/* JADX INFO: renamed from: An.Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C0599Z extends AbstractRunnableC0601a0 {

    /* JADX INFO: renamed from: o0 */
    public final Runnable f1832o0;

    public C0599Z(Runnable runnable, long j10) {
        super(j10);
        this.f1832o0 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1832o0.run();
    }

    @Override // p025An.AbstractRunnableC0601a0
    public final String toString() {
        return super.toString() + this.f1832o0;
    }
}
