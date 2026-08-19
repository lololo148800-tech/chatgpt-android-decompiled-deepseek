package livekit.org.webrtc;

/* JADX INFO: loaded from: classes2.dex */
public class FrameCryptorFactory {
    public static FrameCryptor createFrameCryptorForRtpReceiver(PeerConnectionFactory peerConnectionFactory, RtpReceiver rtpReceiver, String str, FrameCryptorAlgorithm frameCryptorAlgorithm, FrameCryptorKeyProvider frameCryptorKeyProvider) {
        return nativeCreateFrameCryptorForRtpReceiver(peerConnectionFactory.getNativeOwnedFactoryAndThreads(), rtpReceiver.getNativeRtpReceiver(), str, frameCryptorAlgorithm.ordinal(), frameCryptorKeyProvider.getNativeKeyProvider());
    }

    public static FrameCryptor createFrameCryptorForRtpSender(PeerConnectionFactory peerConnectionFactory, RtpSender rtpSender, String str, FrameCryptorAlgorithm frameCryptorAlgorithm, FrameCryptorKeyProvider frameCryptorKeyProvider) {
        return nativeCreateFrameCryptorForRtpSender(peerConnectionFactory.getNativeOwnedFactoryAndThreads(), rtpSender.getNativeRtpSender(), str, frameCryptorAlgorithm.ordinal(), frameCryptorKeyProvider.getNativeKeyProvider());
    }

    public static FrameCryptorKeyProvider createFrameCryptorKeyProvider(boolean z6, byte[] bArr, int i10, byte[] bArr2, int i11, int i12, boolean z10) {
        return nativeCreateFrameCryptorKeyProvider(z6, bArr, i10, bArr2, i11, i12, z10);
    }

    private static native FrameCryptor nativeCreateFrameCryptorForRtpReceiver(long j10, long j11, String str, int i10, long j12);

    private static native FrameCryptor nativeCreateFrameCryptorForRtpSender(long j10, long j11, String str, int i10, long j12);

    private static native FrameCryptorKeyProvider nativeCreateFrameCryptorKeyProvider(boolean z6, byte[] bArr, int i10, byte[] bArr2, int i11, int i12, boolean z10);
}
