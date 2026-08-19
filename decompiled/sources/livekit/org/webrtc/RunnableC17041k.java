package livekit.org.webrtc;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: livekit.org.webrtc.k */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC17041k implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54487Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f54488Z;

    public /* synthetic */ RunnableC17041k(Object obj, int i10) {
        this.f54487Y = i10;
        this.f54488Z = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54487Y) {
            case 0:
                ((EglBase10Impl.EglConnection) this.f54488Z).lambda$new$0();
                break;
            case 1:
                ((EglBase14Impl.EglConnection) this.f54488Z).lambda$new$0();
                break;
            case 2:
                ((EglRenderer) this.f54488Z).renderFrameOnRenderThread();
                break;
            case 3:
                ((EglBase.EglConnection) this.f54488Z).release();
                break;
            case 4:
                ((VideoFrame.I420Buffer) this.f54488Z).release();
                break;
            case 5:
                ((ScreenCapturerAndroid) this.f54488Z).updateVirtualDisplay();
                break;
            case 6:
                ((CountDownLatch) this.f54488Z).countDown();
                break;
            default:
                ((VideoFileRenderer) this.f54488Z).lambda$release$3();
                break;
        }
    }
}
