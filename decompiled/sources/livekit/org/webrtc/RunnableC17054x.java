package livekit.org.webrtc;

/* JADX INFO: renamed from: livekit.org.webrtc.x */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC17054x implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54516Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ SurfaceTextureHelper f54517Z;

    public /* synthetic */ RunnableC17054x(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f54516Y = i10;
        this.f54517Z = surfaceTextureHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54516Y) {
            case 0:
                this.f54517Z.lambda$returnTextureFrame$5();
                break;
            case 1:
                this.f54517Z.lambda$dispose$6();
                break;
            case 2:
                this.f54517Z.lambda$stopListening$1();
                break;
            default:
                this.f54517Z.lambda$forceFrame$3();
                break;
        }
    }
}
