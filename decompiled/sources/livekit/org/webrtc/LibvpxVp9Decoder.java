package livekit.org.webrtc;

/* JADX INFO: loaded from: classes2.dex */
public class LibvpxVp9Decoder extends WrappedNativeVideoDecoder {
    public static native long nativeCreateDecoder();

    public static native boolean nativeIsSupported();

    @Override // livekit.org.webrtc.WrappedNativeVideoDecoder, livekit.org.webrtc.VideoDecoder
    public long createNative(long j10) {
        return nativeCreateDecoder();
    }
}
