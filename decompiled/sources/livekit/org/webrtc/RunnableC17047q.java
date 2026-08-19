package livekit.org.webrtc;

/* JADX INFO: renamed from: livekit.org.webrtc.q */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC17047q implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54506Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f54507Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f54508o0;

    public /* synthetic */ RunnableC17047q(Object obj, int i10, int i11) {
        this.f54506Y = i11;
        this.f54508o0 = obj;
        this.f54507Z = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54506Y) {
            case 0:
                ((HardwareVideoEncoder) this.f54508o0).lambda$deliverEncodedImage$0(this.f54507Z);
                break;
            default:
                ((SurfaceTextureHelper) this.f54508o0).lambda$setFrameRotation$4(this.f54507Z);
                break;
        }
    }
}
