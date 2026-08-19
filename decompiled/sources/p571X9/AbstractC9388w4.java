package p571X9;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p492U1.C7536a;
import p530Vi.AbstractC8301I;
import p919o8.AbstractC17962d;
import p919o8.C17909K;

/* JADX INFO: renamed from: X9.w4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9388w4 {
    /* JADX INFO: renamed from: a */
    public static final long m9958a(int i10, int i11, int i12, int i13) {
        boolean z6 = false;
        if (!(i11 >= i10)) {
            AbstractC9406z4.m9983b("maxWidth(" + i11 + ") must be >= than minWidth(" + i10 + ')');
            throw null;
        }
        if (!(i13 >= i12)) {
            AbstractC9406z4.m9983b("maxHeight(" + i13 + ") must be >= than minHeight(" + i12 + ')');
            throw null;
        }
        if (i10 >= 0 && i12 >= 0) {
            z6 = true;
        }
        if (z6) {
            return m9966i(i10, i11, i12, i13);
        }
        AbstractC9406z4.m9983b("minWidth(" + i10 + ") and minHeight(" + i12 + ") must be >= 0");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m9959b(int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i12 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return m9958a(0, i10, 0, i11);
    }

    /* JADX INFO: renamed from: c */
    public static final int m9960c(int i10) {
        if (i10 < 8191) {
            return 262142;
        }
        if (i10 < 32767) {
            return 65534;
        }
        if (i10 < 65535) {
            return 32766;
        }
        if (i10 < 262143) {
            return 8190;
        }
        throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Can't represent a size of ", " in Constraints"));
    }

    /* JADX INFO: renamed from: d */
    public static final int m9961d(int i10) {
        if (i10 < 8191) {
            return 13;
        }
        if (i10 < 32767) {
            return 15;
        }
        if (i10 < 65535) {
            return 16;
        }
        return i10 < 262143 ? 18 : 255;
    }

    /* JADX INFO: renamed from: e */
    public static final long m9962e(long j10, long j11) {
        return AbstractC9113C4.m9643a(AbstractC8301I.m8921l((int) (j11 >> 32), C7536a.m7856k(j10), C7536a.m7854i(j10)), AbstractC8301I.m8921l((int) (j11 & 4294967295L), C7536a.m7855j(j10), C7536a.m7853h(j10)));
    }

    /* JADX INFO: renamed from: f */
    public static final long m9963f(long j10, long j11) {
        return m9958a(AbstractC8301I.m8921l(C7536a.m7856k(j11), C7536a.m7856k(j10), C7536a.m7854i(j10)), AbstractC8301I.m8921l(C7536a.m7854i(j11), C7536a.m7856k(j10), C7536a.m7854i(j10)), AbstractC8301I.m8921l(C7536a.m7855j(j11), C7536a.m7855j(j10), C7536a.m7853h(j10)), AbstractC8301I.m8921l(C7536a.m7853h(j11), C7536a.m7855j(j10), C7536a.m7853h(j10)));
    }

    /* JADX INFO: renamed from: g */
    public static final int m9964g(int i10, long j10) {
        return AbstractC8301I.m8921l(i10, C7536a.m7855j(j10), C7536a.m7853h(j10));
    }

    /* JADX INFO: renamed from: h */
    public static final int m9965h(int i10, long j10) {
        return AbstractC8301I.m8921l(i10, C7536a.m7856k(j10), C7536a.m7854i(j10));
    }

    /* JADX INFO: renamed from: i */
    public static final long m9966i(int i10, int i11, int i12, int i13) {
        int i14 = i13 == Integer.MAX_VALUE ? i12 : i13;
        int iM9961d = m9961d(i14);
        int i15 = i11 == Integer.MAX_VALUE ? i10 : i11;
        int iM9961d2 = m9961d(i15);
        if (iM9961d + iM9961d2 > 31) {
            throw new IllegalArgumentException(AbstractC0168G.m532u("Can't represent a width of ", i15, " and height of ", i14, " in Constraints"));
        }
        int i16 = i11 + 1;
        int i17 = i16 & (~(i16 >> 31));
        int i18 = i13 + 1;
        int i19 = i18 & (~(i18 >> 31));
        int i20 = 0;
        if (iM9961d2 != 13) {
            if (iM9961d2 == 18) {
                i20 = 3;
            } else if (iM9961d2 == 15) {
                i20 = 1;
            } else if (iM9961d2 == 16) {
                i20 = 2;
            }
        }
        int i21 = (((i20 & 2) >> 1) * 3) + ((i20 & 1) << 1);
        return (((long) i17) << 33) | ((long) i20) | (((long) i10) << 2) | (((long) i12) << (i21 + 15)) | (((long) i19) << (i21 + 46));
    }

    /* JADX INFO: renamed from: j */
    public static C17909K m9967j(C3676s c3676s) {
        try {
            String message = c3676s.m4395w("message").mo4384r();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("type");
            String strMo4384r = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("stack");
            String strMo4384r2 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
            String strMo4384r3 = c3676s.m4395w("source").mo4384r();
            AbstractC16544l.m18093f(strMo4384r3, "jsonObject.get(\"source\").asString");
            for (int i10 : AbstractC0010F.m27k(8)) {
                if (AbstractC17962d.m19644e(i10).equals(strMo4384r3)) {
                    AbstractC16544l.m18093f(message, "message");
                    return new C17909K(message, strMo4384r, strMo4384r2, i10);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Cause", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Cause", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Cause", e12);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m9968k(long j10, long j11) {
        int iM7856k = C7536a.m7856k(j10);
        int iM7854i = C7536a.m7854i(j10);
        int i10 = (int) (j11 >> 32);
        if (iM7856k <= i10 && i10 <= iM7854i) {
            int iM7855j = C7536a.m7855j(j10);
            int iM7853h = C7536a.m7853h(j10);
            int i11 = (int) (j11 & 4294967295L);
            if (iM7855j <= i11 && i11 <= iM7853h) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static final long m9969l(long j10, int i10, int i11) {
        int iM7856k = C7536a.m7856k(j10) + i10;
        if (iM7856k < 0) {
            iM7856k = 0;
        }
        int iM7854i = C7536a.m7854i(j10);
        if (iM7854i != Integer.MAX_VALUE && (iM7854i = iM7854i + i10) < 0) {
            iM7854i = 0;
        }
        int iM7855j = C7536a.m7855j(j10) + i11;
        if (iM7855j < 0) {
            iM7855j = 0;
        }
        int iM7853h = C7536a.m7853h(j10);
        if (iM7853h != Integer.MAX_VALUE) {
            int i12 = iM7853h + i11;
            iM7853h = i12 >= 0 ? i12 : 0;
        }
        return m9958a(iM7856k, iM7854i, iM7855j, iM7853h);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ long m9970m(int i10, int i11, int i12, long j10) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return m9969l(j10, i10, i11);
    }
}
