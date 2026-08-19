package livekit.org.webrtc;

/* JADX INFO: loaded from: classes2.dex */
public class LibvpxVp8Encoder extends WrappedNativeVideoEncoder {
    public static native long nativeCreate(long j10);

    @Override // livekit.org.webrtc.WrappedNativeVideoEncoder, livekit.org.webrtc.VideoEncoder
    public long createNative(long j10) {
        return nativeCreate(j10);
    }

    @Override // livekit.org.webrtc.WrappedNativeVideoEncoder, livekit.org.webrtc.VideoEncoder
    public boolean isHardwareEncoder() {
        return false;
    }
}
