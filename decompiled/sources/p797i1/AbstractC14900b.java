package p797i1;

import p582Xk.HXHG.TfazcFv;

/* JADX INFO: renamed from: i1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14900b {

    /* JADX INFO: renamed from: a */
    public static final long f46397a;

    /* JADX INFO: renamed from: b */
    public static final long f46398b;

    /* JADX INFO: renamed from: c */
    public static final long f46399c;

    /* JADX INFO: renamed from: d */
    public static final long f46400d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f46401e = 0;

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f46397a = (((long) 0) & 4294967295L) | j11;
        f46398b = (((long) 1) & 4294967295L) | j11;
        f46399c = j11 | (((long) 2) & 4294967295L);
        f46400d = (j10 & 4294967295L) | (((long) 4) << 32);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m16067a(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: b */
    public static String m16068b(long j10) {
        if (m16067a(j10, f46397a)) {
            return "Rgb";
        }
        if (m16067a(j10, f46398b)) {
            return "Xyz";
        }
        if (m16067a(j10, f46399c)) {
            return "Lab";
        }
        return m16067a(j10, f46400d) ? "Cmyk" : TfazcFv.paw;
    }
}
