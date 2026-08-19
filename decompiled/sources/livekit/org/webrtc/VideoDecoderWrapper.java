package livekit.org.webrtc;

/* JADX INFO: loaded from: classes2.dex */
class VideoDecoderWrapper {
    public static VideoDecoder.Callback createDecoderCallback(long j10) {
        return new C16990D(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j10, VideoFrame videoFrame, Integer num, Integer num2);
}
