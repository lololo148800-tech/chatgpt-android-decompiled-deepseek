package p759g1;

import p523V9.AbstractC8072d6;
import p523V9.AbstractC8080e6;

/* JADX INFO: renamed from: g1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13799a {

    /* JADX INFO: renamed from: a */
    public static final long f43582a = AbstractC8072d6.m8484a(0.0f, 0.0f);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f43583b = 0;

    /* JADX INFO: renamed from: a */
    public static final boolean m15296a(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: b */
    public static final float m15297b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: c */
    public static final float m15298c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static String m15299d(long j10) {
        if (m15297b(j10) == m15298c(j10)) {
            return "CornerRadius.circular(" + AbstractC8080e6.m8508c(m15297b(j10)) + ')';
        }
        return "CornerRadius.elliptical(" + AbstractC8080e6.m8508c(m15297b(j10)) + ", " + AbstractC8080e6.m8508c(m15298c(j10)) + ')';
    }
}
