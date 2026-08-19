package p152Fm;

import p1090wm.AbstractC21019a;
import p176Gm.C3106a;

/* JADX INFO: renamed from: Fm.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2922d {

    /* JADX INFO: renamed from: Y */
    public static final C2921c f8758Y = new C2921c();

    /* JADX INFO: renamed from: Z */
    public static final AbstractC2919a f8759Z;

    static {
        Integer num = AbstractC21019a.f66885a;
        f8759Z = (num == null || num.intValue() >= 34) ? new C3106a() : new C2920b();
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo3721a(int i10);

    /* JADX INFO: renamed from: b */
    public abstract int mo3722b();

    /* JADX INFO: renamed from: c */
    public abstract int mo3723c(int i10);

    /* JADX INFO: renamed from: d */
    public abstract long mo3724d();

    /* JADX INFO: renamed from: e */
    public long mo3726e(long j10, long j11) {
        long jMo3724d;
        long j12;
        long jMo3721a;
        int iMo3722b;
        if (j11 <= j10) {
            throw new IllegalArgumentException(("Random range is empty: [" + Long.valueOf(j10) + ", " + Long.valueOf(j11) + ").").toString());
        }
        long j13 = j11 - j10;
        if (j13 > 0) {
            if (((-j13) & j13) == j13) {
                int i10 = (int) j13;
                int i11 = (int) (j13 >>> 32);
                if (i10 != 0) {
                    iMo3722b = mo3721a(31 - Integer.numberOfLeadingZeros(i10));
                } else if (i11 == 1) {
                    iMo3722b = mo3722b();
                } else {
                    jMo3721a = (((long) mo3721a(31 - Integer.numberOfLeadingZeros(i11))) << 32) + (((long) mo3722b()) & 4294967295L);
                }
                jMo3721a = ((long) iMo3722b) & 4294967295L;
            } else {
                do {
                    jMo3724d = mo3724d() >>> 1;
                    j12 = jMo3724d % j13;
                } while ((j13 - 1) + (jMo3724d - j12) < 0);
                jMo3721a = j12;
            }
            return j10 + jMo3721a;
        }
        while (true) {
            long jMo3724d2 = mo3724d();
            if (j10 <= jMo3724d2 && jMo3724d2 < j11) {
                return jMo3724d2;
            }
        }
    }
}
