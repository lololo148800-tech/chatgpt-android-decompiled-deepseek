package p108E2;

/* JADX INFO: renamed from: E2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2242a {

    /* JADX INFO: renamed from: a */
    public int f6863a;

    /* JADX INFO: renamed from: b */
    public int f6864b;

    /* JADX INFO: renamed from: c */
    public float f6865c;

    /* JADX INFO: renamed from: d */
    public float f6866d;

    /* JADX INFO: renamed from: e */
    public long f6867e;

    /* JADX INFO: renamed from: f */
    public long f6868f;

    /* JADX INFO: renamed from: g */
    public long f6869g;

    /* JADX INFO: renamed from: h */
    public float f6870h;

    /* JADX INFO: renamed from: i */
    public int f6871i;

    /* JADX INFO: renamed from: a */
    public final float m3270a(long j10) {
        long j11 = this.f6867e;
        if (j10 < j11) {
            return 0.0f;
        }
        long j12 = this.f6869g;
        if (j12 < 0 || j10 < j12) {
            return ViewOnTouchListenerC2246e.m3275b((j10 - j11) / this.f6863a, 0.0f, 1.0f) * 0.5f;
        }
        float f10 = this.f6870h;
        return (ViewOnTouchListenerC2246e.m3275b((j10 - j12) / this.f6871i, 0.0f, 1.0f) * f10) + (1.0f - f10);
    }
}
