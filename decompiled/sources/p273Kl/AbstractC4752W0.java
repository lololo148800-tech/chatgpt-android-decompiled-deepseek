package p273Kl;

import livekit.org.webrtc.MediaStreamTrack;

/* JADX INFO: renamed from: Kl.W0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC4752W0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f15505a;

    static {
        int[] iArr = new int[MediaStreamTrack.MediaType.values().length];
        try {
            iArr[MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f15505a = iArr;
    }
}
