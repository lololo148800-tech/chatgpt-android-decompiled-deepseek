package p774h1;

/* JADX INFO: renamed from: h1.V */
/* JADX INFO: loaded from: classes.dex */
public final class C14343V {

    /* JADX INFO: renamed from: b */
    public static final long f45023b = AbstractC14334L.m15632j(0.5f, 0.5f);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f45024c = 0;

    /* JADX INFO: renamed from: a */
    public final long f45025a;

    public /* synthetic */ C14343V(long j10) {
        this.f45025a = j10;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m15667a(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: b */
    public static final float m15668b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: c */
    public static final float m15669c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static String m15670d(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14343V) {
            return this.f45025a == ((C14343V) obj).f45025a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45025a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return m15670d(this.f45025a);
    }
}
