package p028B;

/* JADX INFO: renamed from: B.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0708o implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2051Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0709p f2052Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f2053o0;

    public /* synthetic */ RunnableC0708o(C0709p c0709p, String str, int i10) {
        this.f2051Y = i10;
        this.f2052Z = c0709p;
        this.f2053o0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2051Y) {
            case 0:
                this.f2052Z.f2055b.onCameraAvailable(this.f2053o0);
                break;
            default:
                this.f2052Z.f2055b.onCameraUnavailable(this.f2053o0);
                break;
        }
    }
}
