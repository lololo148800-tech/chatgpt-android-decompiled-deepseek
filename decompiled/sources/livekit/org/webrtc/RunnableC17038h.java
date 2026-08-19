package livekit.org.webrtc;

/* JADX INFO: renamed from: livekit.org.webrtc.h */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC17038h implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54485Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ CameraXSession f54486Z;

    public /* synthetic */ RunnableC17038h(CameraXSession cameraXSession, int i10) {
        this.f54485Y = i10;
        this.f54486Z = cameraXSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54485Y) {
            case 0:
                CameraXSession.stopInternal$lambda$16(this.f54486Z);
                break;
            case 1:
                CameraXSession.openCamera$lambda$12$lambda$11$lambda$10(this.f54486Z);
                break;
            case 2:
                CameraXSession._init_$lambda$0(this.f54486Z);
                break;
            default:
                CameraXSession.stopInternal$lambda$16$lambda$15(this.f54486Z);
                break;
        }
    }
}
