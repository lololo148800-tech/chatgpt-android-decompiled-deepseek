package livekit.org.webrtc;

/* JADX INFO: renamed from: livekit.org.webrtc.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC17032b implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54478Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Camera1Session.C169742 f54479Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ byte[] f54480o0;

    public /* synthetic */ RunnableC17032b(Camera1Session.C169742 c169742, byte[] bArr, int i10) {
        this.f54478Y = i10;
        this.f54479Z = c169742;
        this.f54480o0 = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54478Y) {
            case 0:
                this.f54479Z.lambda$onPreviewFrame$1(this.f54480o0);
                break;
            default:
                this.f54479Z.lambda$onPreviewFrame$0(this.f54480o0);
                break;
        }
    }
}
