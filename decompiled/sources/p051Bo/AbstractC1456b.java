package p051Bo;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16524A;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16556x;
import mm.C17309l;
import p026Ao.AbstractC0668b;
import p026Ao.AbstractC0682p;
import p026Ao.C0654C;
import p026Ao.C0657F;
import p026Ao.C0660I;
import p026Ao.C0666O;
import p026Ao.C0675i;
import p026Ao.C0690x;
import p033B5.C0842z;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1061vb.C20513d;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p523V9.AbstractC7966P5;
import p571X9.AbstractC9221V;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Bo.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1456b {

    /* JADX INFO: renamed from: a */
    public static final char[] f3826a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: a */
    public static final int m2061a(char c9) {
        if ('0' <= c9 && c9 < ':') {
            return c9 - '0';
        }
        if ('a' <= c9 && c9 < 'g') {
            return c9 - 'W';
        }
        if ('A' <= c9 && c9 < 'G') {
            return c9 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c9);
    }

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap m2062b(ArrayList arrayList) {
        String str = C0654C.f1910Z;
        C0654C c0654cM21169n = C20513d.m21169n(Separators.SLASH, false);
        LinkedHashMap linkedHashMapM19246h = AbstractC17659D.m19246h(new C17309l(c0654cM21169n, new C1462h(c0654cM21169n, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (C1462h c1462h : AbstractC17680n.m19370t0(arrayList, new C0842z(2))) {
            if (((C1462h) linkedHashMapM19246h.put(c1462h.f3845a, c1462h)) == null) {
                while (true) {
                    C0654C c0654c = c1462h.f3845a;
                    C0654C c0654cM1319c = c0654c.m1319c();
                    if (c0654cM1319c == null) {
                        break;
                    }
                    C1462h c1462h2 = (C1462h) linkedHashMapM19246h.get(c0654cM1319c);
                    if (c1462h2 != null) {
                        c1462h2.f3861q.add(c0654c);
                        break;
                    }
                    C1462h c1462h3 = new C1462h(c0654cM1319c, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                    linkedHashMapM19246h.put(c0654cM1319c, c1462h3);
                    c1462h3.f3861q.add(c0654c);
                    c1462h = c1462h3;
                }
            }
        }
        return linkedHashMapM19246h;
    }

    /* JADX INFO: renamed from: c */
    public static final byte[] m2063c(String str) {
        int i10;
        char cCharAt;
        AbstractC16544l.m18094g(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            char cCharAt2 = str.charAt(i11);
            if (AbstractC16544l.m18096i(cCharAt2, 128) >= 0) {
                int length2 = str.length();
                int i12 = i11;
                while (i11 < length2) {
                    char cCharAt3 = str.charAt(i11);
                    if (AbstractC16544l.m18096i(cCharAt3, 128) < 0) {
                        int i13 = i12 + 1;
                        bArr[i12] = (byte) cCharAt3;
                        i11++;
                        while (true) {
                            i12 = i13;
                            if (i11 >= length2 || AbstractC16544l.m18096i(str.charAt(i11), 128) >= 0) {
                                break;
                            }
                            i13 = i12 + 1;
                            bArr[i12] = (byte) str.charAt(i11);
                            i11++;
                        }
                    } else {
                        if (AbstractC16544l.m18096i(cCharAt3, 2048) < 0) {
                            bArr[i12] = (byte) ((cCharAt3 >> 6) | 192);
                            i12 += 2;
                            bArr[i12 + 1] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (55296 > cCharAt3 || cCharAt3 >= 57344) {
                            bArr[i12] = (byte) ((cCharAt3 >> '\f') | 224);
                            bArr[i12 + 1] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                            i12 += 3;
                            bArr[i12 + 2] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (AbstractC16544l.m18096i(cCharAt3, 56319) > 0 || length2 <= (i10 = i11 + 1) || 56320 > (cCharAt = str.charAt(i10)) || cCharAt >= 57344) {
                            bArr[i12] = 63;
                            i11++;
                            i12++;
                        } else {
                            int iCharAt = (str.charAt(i10) + (cCharAt3 << '\n')) - 56613888;
                            bArr[i12] = (byte) ((iCharAt >> 18) | 240);
                            bArr[i12 + 1] = (byte) (((iCharAt >> 12) & 63) | 128);
                            bArr[i12 + 2] = (byte) (((iCharAt >> 6) & 63) | 128);
                            i12 += 4;
                            bArr[i12 + 3] = (byte) ((iCharAt & 63) | 128);
                            i11 += 2;
                        }
                        i11++;
                    }
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i12);
                AbstractC16544l.m18093f(bArrCopyOf, "copyOf(...)");
                return bArrCopyOf;
            }
            bArr[i11] = (byte) cCharAt2;
            i11++;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, str.length());
        AbstractC16544l.m18093f(bArrCopyOf2, "copyOf(...)");
        return bArrCopyOf2;
    }

    /* JADX INFO: renamed from: d */
    public static final String m2064d(int i10) {
        AbstractC7966P5.m8254b(16);
        String string = Integer.toString(i10, 16);
        AbstractC16544l.m18093f(string, "toString(...)");
        return "0x".concat(string);
    }

    /* JADX INFO: renamed from: e */
    public static final C0666O m2065e(C0654C c0654c, AbstractC0682p fileSystem, InterfaceC1436k predicate) {
        Throwable th2;
        Throwable th3;
        Throwable th4;
        AbstractC16544l.m18094g(fileSystem, "fileSystem");
        AbstractC16544l.m18094g(predicate, "predicate");
        C0690x c0690xMo1398h = fileSystem.mo1398h(c0654c);
        try {
            long jM1470a = c0690xMo1398h.m1470a() - ((long) 22);
            long j10 = 0;
            if (jM1470a < 0) {
                throw new IOException("not a zip: size=" + c0690xMo1398h.m1470a());
            }
            long jMax = Math.max(jM1470a - 65536, 0L);
            while (true) {
                C0657F c0657fM1403c = AbstractC0668b.m1403c(c0690xMo1398h.m1471e(jM1470a));
                try {
                    if (c0657fM1403c.m1360m() == 101010256) {
                        int iM1347S = c0657fM1403c.m1347S() & 65535;
                        int iM1347S2 = c0657fM1403c.m1347S() & 65535;
                        long jM1347S = c0657fM1403c.m1347S() & 65535;
                        if (jM1347S != (c0657fM1403c.m1347S() & 65535) || iM1347S != 0 || iM1347S2 != 0) {
                            throw new IOException("unsupported zip: spanned");
                        }
                        c0657fM1403c.skip(4L);
                        long jM1360m = ((long) c0657fM1403c.m1360m()) & 4294967295L;
                        int iM1347S3 = c0657fM1403c.m1347S() & 65535;
                        C1458d c1458d = new C1458d(jM1347S, iM1347S3, jM1360m);
                        c0657fM1403c.m1348T(iM1347S3);
                        c0657fM1403c.close();
                        long j11 = jM1470a - ((long) 20);
                        if (j11 > 0) {
                            C0657F c0657fM1403c2 = AbstractC0668b.m1403c(c0690xMo1398h.m1471e(j11));
                            try {
                                if (c0657fM1403c2.m1360m() == 117853008) {
                                    int iM1360m = c0657fM1403c2.m1360m();
                                    long jM1340E = c0657fM1403c2.m1340E();
                                    if (c0657fM1403c2.m1360m() != 1 || iM1360m != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    C0657F c0657fM1403c3 = AbstractC0668b.m1403c(c0690xMo1398h.m1471e(jM1340E));
                                    try {
                                        int iM1360m2 = c0657fM1403c3.m1360m();
                                        if (iM1360m2 != 101075792) {
                                            throw new IOException("bad zip: expected " + m2064d(101075792) + " but was " + m2064d(iM1360m2));
                                        }
                                        c0657fM1403c3.skip(12L);
                                        int iM1360m3 = c0657fM1403c3.m1360m();
                                        int iM1360m4 = c0657fM1403c3.m1360m();
                                        long jM1340E2 = c0657fM1403c3.m1340E();
                                        if (jM1340E2 != c0657fM1403c3.m1340E() || iM1360m3 != 0 || iM1360m4 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        c0657fM1403c3.skip(8L);
                                        C1458d c1458d2 = new C1458d(jM1340E2, iM1347S3, c0657fM1403c3.m1340E());
                                        try {
                                            c0657fM1403c3.close();
                                            th4 = null;
                                        } catch (Throwable th5) {
                                            th4 = th5;
                                        }
                                        c1458d = c1458d2;
                                        if (th4 != null) {
                                            throw th4;
                                        }
                                    } catch (Throwable th6) {
                                        try {
                                            c0657fM1403c3.close();
                                        } catch (Throwable th7) {
                                            AbstractC9221V.m9789a(th6, th7);
                                        }
                                        th4 = th6;
                                    }
                                }
                                try {
                                    c0657fM1403c2.close();
                                    th3 = null;
                                } catch (Throwable th8) {
                                    th3 = th8;
                                }
                            } catch (Throwable th9) {
                                try {
                                    c0657fM1403c2.close();
                                } catch (Throwable th10) {
                                    AbstractC9221V.m9789a(th9, th10);
                                }
                                th3 = th9;
                            }
                            if (th3 != null) {
                                throw th3;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        C0657F c0657fM1403c4 = AbstractC0668b.m1403c(c0690xMo1398h.m1471e(c1458d.f3834c));
                        try {
                            long j12 = c1458d.f3833b;
                            for (long j13 = 0; j13 < j12; j13++) {
                                C1462h c1462hM2066f = m2066f(c0657fM1403c4);
                                if (c1462hM2066f.f3852h >= c1458d.f3834c) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (((Boolean) predicate.invoke(c1462hM2066f)).booleanValue()) {
                                    arrayList.add(c1462hM2066f);
                                }
                            }
                            try {
                                c0657fM1403c4.close();
                                th2 = null;
                            } catch (Throwable th11) {
                                th2 = th11;
                            }
                        } catch (Throwable th12) {
                            th2 = th12;
                            try {
                                c0657fM1403c4.close();
                            } catch (Throwable th13) {
                                AbstractC9221V.m9789a(th2, th13);
                            }
                        }
                        if (th2 != null) {
                            throw th2;
                        }
                        C0666O c0666o = new C0666O(c0654c, fileSystem, m2062b(arrayList));
                        try {
                            c0690xMo1398h.close();
                        } catch (Throwable unused) {
                        }
                        return c0666o;
                    }
                    long j14 = j10;
                    c0657fM1403c.close();
                    jM1470a--;
                    if (jM1470a < jMax) {
                        throw new IOException("not a zip: end of central directory signature not found");
                    }
                    j10 = j14;
                } catch (Throwable th14) {
                    c0657fM1403c.close();
                    throw th14;
                }
            }
        } catch (Throwable th15) {
            if (c0690xMo1398h == null) {
                throw th15;
            }
            try {
                c0690xMo1398h.close();
                throw th15;
            } catch (Throwable th16) {
                AbstractC9221V.m9789a(th15, th16);
                throw th15;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final C1462h m2066f(C0657F c0657f) throws IOException {
        int iM1360m = c0657f.m1360m();
        if (iM1360m != 33639248) {
            throw new IOException("bad zip: expected " + m2064d(33639248) + " but was " + m2064d(iM1360m));
        }
        c0657f.skip(4L);
        short sM1347S = c0657f.m1347S();
        int i10 = sM1347S & 65535;
        if ((sM1347S & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + m2064d(i10));
        }
        int iM1347S = c0657f.m1347S() & 65535;
        int iM1347S2 = c0657f.m1347S() & 65535;
        int iM1347S3 = c0657f.m1347S() & 65535;
        long jM1360m = ((long) c0657f.m1360m()) & 4294967295L;
        C16524A c16524a = new C16524A();
        c16524a.f51261Y = ((long) c0657f.m1360m()) & 4294967295L;
        C16524A c16524a2 = new C16524A();
        c16524a2.f51261Y = ((long) c0657f.m1360m()) & 4294967295L;
        int iM1347S4 = c0657f.m1347S() & 65535;
        int iM1347S5 = c0657f.m1347S() & 65535;
        int iM1347S6 = c0657f.m1347S() & 65535;
        c0657f.skip(8L);
        C16524A c16524a3 = new C16524A();
        c16524a3.f51261Y = ((long) c0657f.m1360m()) & 4294967295L;
        String strM1348T = c0657f.m1348T(iM1347S4);
        if (AbstractC21322p.m21668B(strM1348T, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = c16524a2.f51261Y == 4294967295L ? 8 : 0L;
        if (c16524a.f51261Y == 4294967295L) {
            j10 += (long) 8;
        }
        if (c16524a3.f51261Y == 4294967295L) {
            j10 += (long) 8;
        }
        long j11 = j10;
        C16525B c16525b = new C16525B();
        C16525B c16525b2 = new C16525B();
        C16525B c16525b3 = new C16525B();
        C16556x c16556x = new C16556x();
        m2067g(c0657f, iM1347S5, new C1464j(c16556x, j11, c16524a2, c0657f, c16524a, c16524a3, c16525b, c16525b2, c16525b3));
        if (j11 > 0 && !c16556x.f51285Y) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strM1348T2 = c0657f.m1348T(iM1347S6);
        String str = C0654C.f1910Z;
        return new C1462h(C20513d.m21169n(Separators.SLASH, false).m1321e(strM1348T), AbstractC21329w.m21725l(strM1348T, Separators.SLASH, false), strM1348T2, jM1360m, c16524a.f51261Y, c16524a2.f51261Y, iM1347S, c16524a3.f51261Y, iM1347S3, iM1347S2, (Long) c16525b.f51262Y, (Long) c16525b2.f51262Y, (Long) c16525b3.f51262Y, 57344);
    }

    /* JADX INFO: renamed from: g */
    public static final void m2067g(C0657F c0657f, int i10, InterfaceC1439n interfaceC1439n) throws IOException {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iM1347S = c0657f.m1347S() & 65535;
            long jM1347S = ((long) c0657f.m1347S()) & 65535;
            long j11 = j10 - ((long) 4);
            if (j11 < jM1347S) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            c0657f.mo1362s(jM1347S);
            C0675i c0675i = c0657f.f1922Z;
            long j12 = c0675i.f1970Z;
            interfaceC1439n.invoke(Integer.valueOf(iM1347S), Long.valueOf(jM1347S));
            long j13 = (c0675i.f1970Z + jM1347S) - j12;
            if (j13 < 0) {
                throw new IOException(AbstractC10763a.m11048f(iM1347S, "unsupported zip: too many bytes processed for "));
            }
            if (j13 > 0) {
                c0675i.skip(j13);
            }
            j10 = j11 - jM1347S;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final C1462h m2068h(C0657F c0657f, C1462h c1462h) throws IOException {
        int iM1360m = c0657f.m1360m();
        if (iM1360m != 67324752) {
            throw new IOException("bad zip: expected " + m2064d(67324752) + " but was " + m2064d(iM1360m));
        }
        c0657f.skip(2L);
        short sM1347S = c0657f.m1347S();
        int i10 = sM1347S & 65535;
        if ((sM1347S & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + m2064d(i10));
        }
        c0657f.skip(18L);
        long jM1347S = ((long) c0657f.m1347S()) & 65535;
        int iM1347S = c0657f.m1347S() & 65535;
        c0657f.skip(jM1347S);
        if (c1462h == null) {
            c0657f.skip(iM1347S);
            return null;
        }
        C16525B c16525b = new C16525B();
        C16525B c16525b2 = new C16525B();
        C16525B c16525b3 = new C16525B();
        m2067g(c0657f, iM1347S, new C1463i(c0657f, c16525b, c16525b2, c16525b3));
        return new C1462h(c1462h.f3845a, c1462h.f3846b, c1462h.f3847c, c1462h.f3848d, c1462h.f3849e, c1462h.f3850f, c1462h.f3851g, c1462h.f3852h, c1462h.f3853i, c1462h.f3854j, c1462h.f3855k, c1462h.f3856l, c1462h.f3857m, (Integer) c16525b.f51262Y, (Integer) c16525b2.f51262Y, (Integer) c16525b3.f51262Y);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final int m2069i(C0660I c0660i, int i10) {
        int i11;
        AbstractC16544l.m18094g(c0660i, "<this>");
        int i12 = i10 + 1;
        int length = c0660i.f1934q0.length;
        int[] iArr = c0660i.f1935r0;
        AbstractC16544l.m18094g(iArr, "<this>");
        int i13 = length - 1;
        int i14 = 0;
        while (i14 <= i13) {
            i11 = (i14 + i13) >>> 1;
            int i15 = iArr[i11];
            if (i15 < i12) {
                i14 = i11 + 1;
            } else {
                if (i15 <= i12) {
                    if (i11 >= 0) {
                        return i11;
                    }
                    return ~i11;
                }
                i13 = i11 - 1;
            }
        }
        i11 = (-i14) - 1;
        if (i11 >= 0) {
            return i11;
        }
        return ~i11;
    }
}
