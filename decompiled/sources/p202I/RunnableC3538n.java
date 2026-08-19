package p202I;

/* JADX INFO: renamed from: I.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3538n implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10711Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3539o f10712Z;

    public /* synthetic */ RunnableC3538n(C3539o c3539o, int i10) {
        this.f10711Y = i10;
        this.f10712Z = c3539o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10711Y) {
            case 0:
                C3539o c3539o = this.f10712Z;
                c3539o.f10716p0 = null;
                c3539o.m4222c();
                break;
            default:
                this.f10712Z.m4222c();
                break;
        }
    }
}
