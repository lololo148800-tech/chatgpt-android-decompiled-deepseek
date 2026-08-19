package livekit.org.webrtc;

/* JADX INFO: renamed from: livekit.org.webrtc.j */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC17040j {
    /* JADX INFO: renamed from: a */
    public static EglBase.EglConnection m18872a(EglBase.Context context, int[] iArr) {
        if (context == null) {
            return m18874c(iArr);
        }
        if (context instanceof EglBase14.Context) {
            return new EglBase14Impl.EglConnection(((EglBase14.Context) context).getRawContext(), iArr);
        }
        if (context instanceof EglBase10.Context) {
            return new EglBase10Impl.EglConnection(((EglBase10.Context) context).getRawContext(), iArr);
        }
        throw new IllegalArgumentException("Unrecognized Context");
    }

    /* JADX INFO: renamed from: b */
    public static EglBase.EglConnection m18873b(int[] iArr) {
        return new EglBase10Impl.EglConnection(null, iArr);
    }

    /* JADX INFO: renamed from: c */
    public static EglBase.EglConnection m18874c(int[] iArr) {
        return new EglBase14Impl.EglConnection(null, iArr);
    }
}
