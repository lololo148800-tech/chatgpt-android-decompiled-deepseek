package p774h1;

import mm.C17321x;
import p571X9.AbstractC9245Z;
import p571X9.AbstractC9306j0;
import p692d0.C12982u;
import p797i1.AbstractC14901c;
import p797i1.AbstractC14906h;
import p797i1.AbstractC14908j;
import p797i1.C14902d;
import p797i1.C14905g;

/* JADX INFO: renamed from: h1.u */
/* JADX INFO: loaded from: classes.dex */
public final class C14365u {

    /* JADX INFO: renamed from: b */
    public static final long f45052b = AbstractC14334L.m15626d(4278190080L);

    /* JADX INFO: renamed from: c */
    public static final long f45053c;

    /* JADX INFO: renamed from: d */
    public static final long f45054d;

    /* JADX INFO: renamed from: e */
    public static final long f45055e;

    /* JADX INFO: renamed from: f */
    public static final long f45056f;

    /* JADX INFO: renamed from: g */
    public static final long f45057g;

    /* JADX INFO: renamed from: h */
    public static final long f45058h;

    /* JADX INFO: renamed from: i */
    public static final long f45059i;

    /* JADX INFO: renamed from: j */
    public static final long f45060j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f45061k = 0;

    /* JADX INFO: renamed from: a */
    public final long f45062a;

    static {
        AbstractC14334L.m15626d(4282664004L);
        f45053c = AbstractC14334L.m15626d(4287137928L);
        f45054d = AbstractC14334L.m15626d(4291611852L);
        f45055e = AbstractC14334L.m15626d(4294967295L);
        f45056f = AbstractC14334L.m15626d(4294901760L);
        f45057g = AbstractC14334L.m15626d(4278255360L);
        f45058h = AbstractC14334L.m15626d(4278190335L);
        AbstractC14334L.m15626d(4294967040L);
        AbstractC14334L.m15626d(4278255615L);
        AbstractC14334L.m15626d(4294902015L);
        f45059i = AbstractC14334L.m15625c(0);
        f45060j = AbstractC14334L.m15624b(0.0f, 0.0f, 0.0f, 0.0f, C14902d.f46423s);
    }

    public /* synthetic */ C14365u(long j10) {
        this.f45062a = j10;
    }

    /* JADX INFO: renamed from: a */
    public static final long m15773a(long j10, AbstractC14901c abstractC14901c) {
        C14905g c14905gM16080e;
        AbstractC14901c abstractC14901cM15778f = m15778f(j10);
        int i10 = abstractC14901cM15778f.f46404c;
        int i11 = abstractC14901c.f46404c;
        if ((i10 | i11) < 0) {
            c14905gM16080e = AbstractC14908j.m16080e(abstractC14901cM15778f, abstractC14901c, 0);
        } else {
            C12982u c12982u = AbstractC14906h.f46433a;
            int i12 = i10 | (i11 << 6);
            Object objM14694f = c12982u.m14694f(i12);
            if (objM14694f == null) {
                objM14694f = AbstractC14908j.m16080e(abstractC14901cM15778f, abstractC14901c, 0);
                c12982u.m14697i(i12, objM14694f);
            }
            c14905gM16080e = (C14905g) objM14694f;
        }
        return c14905gM16080e.mo16075a(j10);
    }

    /* JADX INFO: renamed from: b */
    public static long m15774b(float f10, long j10) {
        return AbstractC14334L.m15624b(m15780h(j10), m15779g(j10), m15777e(j10), f10, m15778f(j10));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m15775c(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: d */
    public static final float m15776d(long j10) {
        float fM9820b;
        float f10;
        if ((63 & j10) == 0) {
            fM9820b = (float) AbstractC9245Z.m9820b((j10 >>> 56) & 255);
            f10 = 255.0f;
        } else {
            fM9820b = (float) AbstractC9245Z.m9820b((j10 >>> 6) & 1023);
            f10 = 1023.0f;
        }
        return fM9820b / f10;
    }

    /* JADX INFO: renamed from: e */
    public static final float m15777e(long j10) {
        int i10;
        int i11;
        int i12;
        if ((63 & j10) == 0) {
            return ((float) AbstractC9245Z.m9820b((j10 >>> 32) & 255)) / 255.0f;
        }
        short s10 = (short) ((j10 >>> 16) & 65535);
        int i13 = Short.MIN_VALUE & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - AbstractC14323A.f44960a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    /* JADX INFO: renamed from: f */
    public static final AbstractC14901c m15778f(long j10) {
        float[] fArr = C14902d.f46405a;
        return C14902d.f46425u[(int) (j10 & 63)];
    }

    /* JADX INFO: renamed from: g */
    public static final float m15779g(long j10) {
        int i10;
        int i11;
        int i12;
        if ((63 & j10) == 0) {
            return ((float) AbstractC9245Z.m9820b((j10 >>> 40) & 255)) / 255.0f;
        }
        short s10 = (short) ((j10 >>> 32) & 65535);
        int i13 = Short.MIN_VALUE & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - AbstractC14323A.f44960a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    /* JADX INFO: renamed from: h */
    public static final float m15780h(long j10) {
        int i10;
        int i11;
        int i12;
        if ((63 & j10) == 0) {
            return ((float) AbstractC9245Z.m9820b((j10 >>> 48) & 255)) / 255.0f;
        }
        short s10 = (short) ((j10 >>> 48) & 65535);
        int i13 = Short.MIN_VALUE & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - AbstractC14323A.f44960a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    /* JADX INFO: renamed from: i */
    public static String m15781i(long j10) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(m15780h(j10));
        sb2.append(", ");
        sb2.append(m15779g(j10));
        sb2.append(", ");
        sb2.append(m15777e(j10));
        sb2.append(", ");
        sb2.append(m15776d(j10));
        sb2.append(", ");
        return AbstractC9306j0.m9892k(sb2, m15778f(j10).f46402a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14365u) {
            return this.f45062a == ((C14365u) obj).f45062a;
        }
        return false;
    }

    public final int hashCode() {
        return C17321x.m18981a(this.f45062a);
    }

    public final String toString() {
        return m15781i(this.f45062a);
    }
}
