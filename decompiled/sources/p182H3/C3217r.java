package p182H3;

import p1016t3.C19788o;

/* JADX INFO: renamed from: H3.r */
/* JADX INFO: loaded from: classes.dex */
public final class C3217r extends Exception {

    /* JADX INFO: renamed from: Y */
    public final String f9711Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f9712Z;

    /* JADX INFO: renamed from: o0 */
    public final C3213n f9713o0;

    /* JADX INFO: renamed from: p0 */
    public final String f9714p0;

    public C3217r(C19788o c19788o, C3223x c3223x, boolean z6, int i10) {
        this("Decoder init failed: [" + i10 + "], " + c19788o, c3223x, c19788o.f62752m, z6, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public C3217r(String str, Throwable th2, String str2, boolean z6, C3213n c3213n, String str3) {
        super(str, th2);
        this.f9711Y = str2;
        this.f9712Z = z6;
        this.f9713o0 = c3213n;
        this.f9714p0 = str3;
    }
}
