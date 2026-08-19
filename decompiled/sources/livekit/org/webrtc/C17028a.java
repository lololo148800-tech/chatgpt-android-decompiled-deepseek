package livekit.org.webrtc;

import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: livekit.org.webrtc.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C17028a implements VideoSink {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54473Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f54474Z;

    public /* synthetic */ C17028a(Object obj, int i10) {
        this.f54473Y = i10;
        this.f54474Z = obj;
    }

    @Override // livekit.org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f54473Y) {
            case 0:
                ((Camera1Session) this.f54474Z).lambda$listenForTextureFrames$0(videoFrame);
                break;
            case 1:
                ((Camera2Session.CaptureSessionCallback) this.f54474Z).lambda$onConfigured$0(videoFrame);
                break;
            case 2:
                CameraXSession.start$lambda$1((InterfaceC1436k) this.f54474Z, videoFrame);
                break;
            default:
                ((VideoSource) this.f54474Z).lambda$setVideoProcessor$1(videoFrame);
                break;
        }
    }
}
