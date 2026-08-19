package p1095x1;

import p523V9.AbstractC8111i5;

/* JADX INFO: renamed from: x1.a0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21073a0 {

    /* JADX INFO: renamed from: a */
    public static final long f66990a = AbstractC21075b0.m21561b(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f66991b = 0;

    /* JADX INFO: renamed from: a */
    public static final boolean m21555a(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: b */
    public static final float m21556b(long j10) {
        if (j10 != f66990a) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        AbstractC8111i5.m8592c("ScaleFactor is unspecified");
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static final float m21557c(long j10) {
        if (j10 != f66990a) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        AbstractC8111i5.m8592c("ScaleFactor is unspecified");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static final long m21558d(float f10, long j10) {
        return AbstractC21075b0.m21561b(m21556b(j10) * f10, m21557c(j10) * f10);
    }

    /* JADX INFO: renamed from: e */
    public static String m21559e(long j10) {
        StringBuilder sb2 = new StringBuilder("ScaleFactor(");
        float f10 = 10;
        float fM21556b = m21556b(j10) * f10;
        int i10 = (int) fM21556b;
        if (fM21556b - i10 >= 0.5f) {
            i10++;
        }
        sb2.append(i10 / f10);
        sb2.append(", ");
        float fM21557c = m21557c(j10) * f10;
        int i11 = (int) fM21557c;
        if (fM21557c - i11 >= 0.5f) {
            i11++;
        }
        sb2.append(i11 / f10);
        sb2.append(')');
        return sb2.toString();
    }
}
