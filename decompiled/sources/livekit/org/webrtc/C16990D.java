package livekit.org.webrtc;

/* JADX INFO: renamed from: livekit.org.webrtc.D */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C16990D implements VideoDecoder.Callback, VideoEncoder.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f54461a;

    public /* synthetic */ C16990D(long j10) {
        this.f54461a = j10;
    }

    @Override // livekit.org.webrtc.VideoDecoder.Callback
    public void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
        VideoDecoderWrapper.nativeOnDecodedFrame(this.f54461a, videoFrame, num, num2);
    }

    @Override // livekit.org.webrtc.VideoEncoder.Callback
    public void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        VideoEncoderWrapper.nativeOnEncodedFrame(this.f54461a, encodedImage);
    }
}
