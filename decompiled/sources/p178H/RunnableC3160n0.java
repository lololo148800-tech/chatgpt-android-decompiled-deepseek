package p178H;

/* JADX INFO: renamed from: H.n0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3160n0 implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9506Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3170s0 f9507Z;

    public /* synthetic */ RunnableC3160n0(C3170s0 c3170s0, int i10) {
        this.f9506Y = i10;
        this.f9507Z = c3170s0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9506Y) {
            case 0:
                this.f9507Z.f9539f.cancel(true);
                break;
            default:
                this.f9507Z.m4001c();
                break;
        }
    }
}
