package p519V4;

/* JADX INFO: renamed from: V4.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7759g implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f24472Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7760h f24473Z;

    public /* synthetic */ RunnableC7759g(C7760h c7760h, int i10) {
        this.f24472Y = i10;
        this.f24473Z = c7760h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24472Y) {
            case 0:
                C7760h.m8022a(this.f24473Z);
                break;
            default:
                C7760h.m8023c(this.f24473Z);
                break;
        }
    }
}
