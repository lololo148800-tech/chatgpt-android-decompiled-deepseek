package livekit.org.webrtc;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LibvpxVp9Encoder extends WrappedNativeVideoEncoder {
    public static native long nativeCreate(long j10);

    public static native List<String> nativeGetSupportedScalabilityModes();

    public static native boolean nativeIsSupported();

    public static List<String> scalabilityModes() {
        return nativeGetSupportedScalabilityModes();
    }

    @Override // livekit.org.webrtc.WrappedNativeVideoEncoder, livekit.org.webrtc.VideoEncoder
    public long createNative(long j10) {
        return nativeCreate(j10);
    }

    @Override // livekit.org.webrtc.WrappedNativeVideoEncoder, livekit.org.webrtc.VideoEncoder
    public boolean isHardwareEncoder() {
        return false;
    }
}
