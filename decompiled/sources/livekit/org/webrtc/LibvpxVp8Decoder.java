package livekit.org.webrtc;

/* JADX INFO: loaded from: classes2.dex */
public class LibvpxVp8Decoder extends WrappedNativeVideoDecoder {
    public static native long nativeCreateDecoder(long j10);

    @Override // livekit.org.webrtc.WrappedNativeVideoDecoder, livekit.org.webrtc.VideoDecoder
    public long createNative(long j10) {
        return nativeCreateDecoder(j10);
    }
}
