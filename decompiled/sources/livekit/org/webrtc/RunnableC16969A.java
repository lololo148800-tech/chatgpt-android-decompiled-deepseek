package livekit.org.webrtc;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: livekit.org.webrtc.A */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC16969A implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54458Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f54459Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f54460o0;

    public /* synthetic */ RunnableC16969A(Object obj, int i10, Object obj2) {
        this.f54458Y = i10;
        this.f54459Z = obj;
        this.f54460o0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54458Y) {
            case 0:
                ((TextureBufferImpl) this.f54459Z).lambda$new$0((TextureBufferImpl.RefCountMonitor) this.f54460o0);
                break;
            case 1:
                ((EglRenderer) this.f54459Z).lambda$release$0((CountDownLatch) this.f54460o0);
                break;
            case 2:
                ((EglRenderer) this.f54459Z).lambda$releaseEglSurface$3((Runnable) this.f54460o0);
                break;
            case 3:
                ((VideoFileRenderer) this.f54459Z).lambda$release$2((CountDownLatch) this.f54460o0);
                break;
            case 4:
                ((VideoFileRenderer) this.f54459Z).lambda$onFrame$0((VideoFrame) this.f54460o0);
                break;
            default:
                ((VideoSource) this.f54459Z).lambda$setVideoProcessor$0((VideoFrame) this.f54460o0);
                break;
        }
    }
}
