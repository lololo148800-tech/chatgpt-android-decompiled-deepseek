package p557Wl;

import livekit.org.webrtc.PeerConnection;

/* JADX INFO: renamed from: Wl.i */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC8953i {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f27374a;

    static {
        int[] iArr = new int[PeerConnection.PeerConnectionState.values().length];
        try {
            iArr[PeerConnection.PeerConnectionState.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PeerConnection.PeerConnectionState.CLOSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f27374a = iArr;
    }
}
