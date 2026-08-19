package livekit.org.webrtc;

/* JADX INFO: loaded from: classes2.dex */
public interface CapturerObserver {
    void onCapturerStarted(boolean z6);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame videoFrame);
}
