package livekit.org.webrtc;

/* JADX INFO: renamed from: livekit.org.webrtc.w */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC17053w implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54514Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ RenderSynchronizer f54515Z;

    public /* synthetic */ RunnableC17053w(RenderSynchronizer renderSynchronizer, int i10) {
        this.f54514Y = i10;
        this.f54515Z = renderSynchronizer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54514Y) {
            case 0:
                this.f54515Z.lambda$registerListener$1();
                break;
            default:
                this.f54515Z.lambda$new$0();
                break;
        }
    }
}
