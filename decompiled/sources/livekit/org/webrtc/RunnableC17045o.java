package livekit.org.webrtc;

/* JADX INFO: renamed from: livekit.org.webrtc.o */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC17045o implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54502Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ EglThread f54503Z;

    public /* synthetic */ RunnableC17045o(EglThread eglThread, int i10) {
        this.f54502Y = i10;
        this.f54503Z = eglThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54502Y) {
            case 0:
                this.f54503Z.lambda$onRenderWindowOpen$2();
                break;
            default:
                this.f54503Z.lambda$onRenderWindowClose$3();
                break;
        }
    }
}
