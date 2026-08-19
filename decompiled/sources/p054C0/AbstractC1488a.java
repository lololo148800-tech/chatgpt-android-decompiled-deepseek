package p054C0;

/* JADX INFO: renamed from: C0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1488a {

    /* JADX INFO: renamed from: a */
    public static final long f3908a = m2132a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f3909b = 0;

    /* JADX INFO: renamed from: a */
    public static long m2132a(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }
}
