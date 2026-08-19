package p051Bo;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0654C;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p959q8.C18639a;

/* JADX INFO: renamed from: Bo.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1457c {

    /* JADX INFO: renamed from: a */
    public static final C0678l f3827a;

    /* JADX INFO: renamed from: b */
    public static final C0678l f3828b;

    /* JADX INFO: renamed from: c */
    public static final C0678l f3829c;

    /* JADX INFO: renamed from: d */
    public static final C0678l f3830d;

    /* JADX INFO: renamed from: e */
    public static final C0678l f3831e;

    static {
        C0678l c0678l = C0678l.f1971p0;
        f3827a = C18639a.m19996n(Separators.SLASH);
        f3828b = C18639a.m19996n("\\");
        f3829c = C18639a.m19996n("/\\");
        f3830d = C18639a.m19996n(Separators.DOT);
        f3831e = C18639a.m19996n("..");
    }

    /* JADX INFO: renamed from: a */
    public static final int m2070a(C0654C c0654c) {
        if (c0654c.f1911Y.mo1372d() == 0) {
            return -1;
        }
        C0678l c0678l = c0654c.f1911Y;
        if (c0678l.mo1376i(0) != 47) {
            if (c0678l.mo1376i(0) != 92) {
                if (c0678l.mo1372d() <= 2 || c0678l.mo1376i(1) != 58 || c0678l.mo1376i(2) != 92) {
                    return -1;
                }
                char cMo1376i = (char) c0678l.mo1376i(0);
                return (('a' > cMo1376i || cMo1376i >= '{') && ('A' > cMo1376i || cMo1376i >= '[')) ? -1 : 3;
            }
            if (c0678l.mo1372d() > 2 && c0678l.mo1376i(1) == 92) {
                C0678l other = f3828b;
                AbstractC16544l.m18094g(other, "other");
                int iMo1374f = c0678l.mo1374f(2, other.f1972Y);
                return iMo1374f == -1 ? c0678l.mo1372d() : iMo1374f;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public static final C0654C m2071b(C0654C c0654c, C0654C child, boolean z6) {
        AbstractC16544l.m18094g(c0654c, "<this>");
        AbstractC16544l.m18094g(child, "child");
        if (m2070a(child) != -1 || child.m1324h() != null) {
            return child;
        }
        C0678l c0678lM2072c = m2072c(c0654c);
        if (c0678lM2072c == null && (c0678lM2072c = m2072c(child)) == null) {
            c0678lM2072c = m2075f(C0654C.f1910Z);
        }
        C0675i c0675i = new C0675i();
        c0675i.m1432c1(c0654c.f1911Y);
        if (c0675i.f1970Z > 0) {
            c0675i.m1432c1(c0678lM2072c);
        }
        c0675i.m1432c1(child.f1911Y);
        return m2073d(c0675i, z6);
    }

    /* JADX INFO: renamed from: c */
    public static final C0678l m2072c(C0654C c0654c) {
        C0678l c0678l = c0654c.f1911Y;
        C0678l c0678l2 = f3827a;
        if (C0678l.m1448g(c0678l, c0678l2) != -1) {
            return c0678l2;
        }
        C0678l c0678l3 = f3828b;
        if (C0678l.m1448g(c0654c.f1911Y, c0678l3) != -1) {
            return c0678l3;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final C0654C m2073d(C0675i c0675i, boolean z6) throws EOFException {
        C0678l c0678l;
        C0678l c0678l2;
        char cM1422T;
        C0678l c0678l3;
        C0678l c0678lM1417C0;
        C0675i c0675i2 = new C0675i();
        C0678l c0678lM2074e = null;
        int i10 = 0;
        while (true) {
            if (!c0675i.mo1361p0(0L, f3827a)) {
                c0678l = f3828b;
                if (!c0675i.mo1361p0(0L, c0678l)) {
                    break;
                }
            }
            byte b = c0675i.readByte();
            if (c0678lM2074e == null) {
                c0678lM2074e = m2074e(b);
            }
            i10++;
        }
        boolean z10 = i10 >= 2 && AbstractC16544l.m18089b(c0678lM2074e, c0678l);
        C0678l c0678l4 = f3829c;
        if (z10) {
            AbstractC16544l.m18091d(c0678lM2074e);
            c0675i2.m1432c1(c0678lM2074e);
            c0675i2.m1432c1(c0678lM2074e);
        } else if (i10 > 0) {
            AbstractC16544l.m18091d(c0678lM2074e);
            c0675i2.m1432c1(c0678lM2074e);
        } else {
            long jMo1344L0 = c0675i.mo1344L0(c0678l4);
            if (c0678lM2074e == null) {
                c0678lM2074e = jMo1344L0 == -1 ? m2075f(C0654C.f1910Z) : m2074e(c0675i.m1422T(jMo1344L0));
            }
            if (AbstractC16544l.m18089b(c0678lM2074e, c0678l)) {
                c0678l2 = c0678lM2074e;
                if (c0675i.f1970Z >= 2 && c0675i.m1422T(1L) == 58 && (('a' <= (cM1422T = (char) c0675i.m1422T(0L)) && cM1422T < '{') || ('A' <= cM1422T && cM1422T < '['))) {
                    if (jMo1344L0 == 2) {
                        c0675i2.mo1338n0(c0675i, 3L);
                    } else {
                        c0675i2.mo1338n0(c0675i, 2L);
                    }
                }
            } else {
                c0678l2 = c0678lM2074e;
            }
            c0678lM2074e = c0678l2;
        }
        boolean z11 = c0675i2.f1970Z > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean zMo1356g = c0675i.mo1356g();
            c0678l3 = f3830d;
            if (zMo1356g) {
                break;
            }
            long jMo1344L1 = c0675i.mo1344L0(c0678l4);
            if (jMo1344L1 == -1) {
                c0678lM1417C0 = c0675i.m1417C0(c0675i.f1970Z);
            } else {
                c0678lM1417C0 = c0675i.m1417C0(jMo1344L1);
                c0675i.readByte();
            }
            C0678l c0678l5 = f3831e;
            if (AbstractC16544l.m18089b(c0678lM1417C0, c0678l5)) {
                if (!z11 || !arrayList.isEmpty()) {
                    if (!z6 || (!z11 && (arrayList.isEmpty() || AbstractC16544l.m18089b(AbstractC17680n.m19351a0(arrayList), c0678l5)))) {
                        arrayList.add(c0678lM1417C0);
                    } else if ((!z10 || arrayList.size() != 1) && !arrayList.isEmpty()) {
                        arrayList.remove(AbstractC17681o.m19381j(arrayList));
                    }
                }
            } else if (!AbstractC16544l.m18089b(c0678lM1417C0, c0678l3) && !AbstractC16544l.m18089b(c0678lM1417C0, C0678l.f1971p0)) {
                arrayList.add(c0678lM1417C0);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                c0675i2.m1432c1(c0678lM2074e);
            }
            c0675i2.m1432c1((C0678l) arrayList.get(i11));
        }
        if (c0675i2.f1970Z == 0) {
            c0675i2.m1432c1(c0678l3);
        }
        return new C0654C(c0675i2.m1417C0(c0675i2.f1970Z));
    }

    /* JADX INFO: renamed from: e */
    public static final C0678l m2074e(byte b) {
        if (b == 47) {
            return f3827a;
        }
        if (b == 92) {
            return f3828b;
        }
        throw new IllegalArgumentException(AbstractC10763a.m11048f(b, "not a directory separator: "));
    }

    /* JADX INFO: renamed from: f */
    public static final C0678l m2075f(String str) {
        if (AbstractC16544l.m18089b(str, Separators.SLASH)) {
            return f3827a;
        }
        if (AbstractC16544l.m18089b(str, "\\")) {
            return f3828b;
        }
        throw new IllegalArgumentException(AbstractC9306j0.m9889h("not a directory separator: ", str));
    }
}
