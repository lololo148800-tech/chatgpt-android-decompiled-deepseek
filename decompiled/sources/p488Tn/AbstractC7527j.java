package p488Tn;

import java.io.EOFException;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;
import p594Y9.AbstractC9894g3;

/* JADX INFO: renamed from: Tn.j */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7527j {

    /* JADX INFO: renamed from: a */
    public static final char[] f23868a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: a */
    public static final void m7835a(long j10, long j11, long j12) {
        if (j11 < 0 || j12 > j10) {
            StringBuilder sbM9894m = AbstractC9306j0.m9894m("startIndex (", j11, ") and endIndex (");
            sbM9894m.append(j12);
            sbM9894m.append(") are not within the range [0..size(");
            sbM9894m.append(j10);
            sbM9894m.append("))");
            throw new IndexOutOfBoundsException(sbM9894m.toString());
        }
        if (j11 <= j12) {
            return;
        }
        StringBuilder sbM9894m2 = AbstractC9306j0.m9894m("startIndex (", j11, ") > endIndex (");
        sbM9894m2.append(j12);
        sbM9894m2.append(')');
        throw new IllegalArgumentException(sbM9894m2.toString());
    }

    /* JADX INFO: renamed from: b */
    public static final String m7836b(C7518a c7518a, long j10) throws EOFException {
        if (j10 == 0) {
            return "";
        }
        C7524g c7524g = c7518a.f23839Y;
        if (c7524g == null) {
            throw new IllegalStateException("Unreacheable");
        }
        if (c7524g.m7828b() < j10) {
            byte[] bArrM7840f = m7840f(c7518a, (int) j10);
            return AbstractC9894g3.m10544a(bArrM7840f, 0, bArrM7840f.length);
        }
        int i10 = c7524g.f23855b;
        String strM10544a = AbstractC9894g3.m10544a(c7524g.f23854a, i10, Math.min(c7524g.f23856c, ((int) j10) + i10));
        c7518a.skip(j10);
        return strM10544a;
    }

    /* JADX INFO: renamed from: c */
    public static final int m7837c(C7524g c7524g, byte b, int i10, int i11) {
        if (i10 < 0 || i10 >= c7524g.m7828b()) {
            throw new IllegalArgumentException(String.valueOf(i10).toString());
        }
        if (i10 > i11 || i11 > c7524g.m7828b()) {
            throw new IllegalArgumentException(String.valueOf(i11).toString());
        }
        int i12 = c7524g.f23855b;
        while (i10 < i11) {
            if (c7524g.f23854a[i12 + i10] == b) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0042  */
    /* JADX INFO: renamed from: d */
    public static long m7838d(InterfaceC7526i interfaceC7526i, byte b) {
        C7524g c7524g;
        long j10;
        long j11;
        long j12;
        AbstractC16544l.m18094g(interfaceC7526i, "<this>");
        long j13 = 0;
        while (j13 < Long.MAX_VALUE && interfaceC7526i.mo7823l(1 + j13)) {
            C7518a c7518aMo7819b = interfaceC7526i.mo7819b();
            long jMin = Math.min(Long.MAX_VALUE, interfaceC7526i.mo7819b().f23841o0);
            AbstractC16544l.m18094g(c7518aMo7819b, "<this>");
            long jMin2 = Math.min(jMin, c7518aMo7819b.f23841o0);
            m7835a(c7518aMo7819b.f23841o0, j13, jMin2);
            if (j13 == jMin2 || (c7524g = c7518aMo7819b.f23839Y) == null) {
                j11 = -1;
                j12 = -1;
            } else {
                long jM7828b = c7518aMo7819b.f23841o0;
                if (jM7828b - j13 < j13) {
                    C7524g c7524g2 = c7518aMo7819b.f23840Z;
                    while (c7524g2 != null && jM7828b > j13) {
                        jM7828b -= (long) (c7524g2.f23856c - c7524g2.f23855b);
                        if (jM7828b <= j13) {
                            break;
                        }
                        c7524g2 = c7524g2.f23860g;
                    }
                    if (jM7828b == -1) {
                        j11 = -1;
                        j12 = -1;
                    } else {
                        while (true) {
                            if (jMin2 <= jM7828b) {
                                throw new IllegalStateException("Check failed.");
                            }
                            AbstractC16544l.m18091d(c7524g2);
                            int iM7837c = m7837c(c7524g2, b, Math.max((int) (j13 - jM7828b), 0), Math.min(c7524g2.m7828b(), (int) (jMin2 - jM7828b)));
                            if (iM7837c != -1) {
                                j10 = iM7837c;
                                j11 = j10 + jM7828b;
                            } else {
                                jM7828b += (long) c7524g2.m7828b();
                                c7524g2 = c7524g2.f23859f;
                                if (c7524g2 == null || jM7828b >= jMin2) {
                                    j11 = -1;
                                }
                            }
                        }
                    }
                } else {
                    jM7828b = 0;
                    while (c7524g != null) {
                        long j14 = ((long) (c7524g.f23856c - c7524g.f23855b)) + jM7828b;
                        if (j14 > j13) {
                            break;
                        }
                        c7524g = c7524g.f23859f;
                        jM7828b = j14;
                    }
                    if (jM7828b != -1) {
                        while (true) {
                            if (jMin2 <= jM7828b) {
                                throw new IllegalStateException("Check failed.");
                            }
                            AbstractC16544l.m18091d(c7524g);
                            int iM7837c2 = m7837c(c7524g, b, Math.max((int) (j13 - jM7828b), 0), Math.min(c7524g.m7828b(), (int) (jMin2 - jM7828b)));
                            if (iM7837c2 != -1) {
                                j10 = iM7837c2;
                                j11 = j10 + jM7828b;
                            } else {
                                jM7828b += (long) c7524g.m7828b();
                                c7524g = c7524g.f23859f;
                                if (c7524g == null || jM7828b >= jMin2) {
                                }
                            }
                        }
                    }
                    j11 = -1;
                }
                j12 = -1;
            }
            if (j11 != j12) {
                return j11;
            }
            j13 = interfaceC7526i.mo7819b().f23841o0;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m7839e(C7524g c7524g) {
        AbstractC16544l.m18094g(c7524g, "<this>");
        return c7524g.m7828b() == 0;
    }

    /* JADX INFO: renamed from: f */
    public static final byte[] m7840f(C7518a c7518a, int i10) {
        AbstractC16544l.m18094g(c7518a, "<this>");
        long j10 = i10;
        if (j10 >= 0) {
            return m7841g(c7518a, i10);
        }
        throw new IllegalArgumentException(AbstractC0168G.m533v("byteCount (", j10, ") < 0").toString());
    }

    /* JADX INFO: renamed from: g */
    public static final byte[] m7841g(InterfaceC7526i interfaceC7526i, int i10) throws EOFException {
        if (i10 == -1) {
            for (long j10 = 2147483647L; interfaceC7526i.mo7819b().f23841o0 < 2147483647L && interfaceC7526i.mo7823l(j10); j10 *= (long) 2) {
            }
            if (interfaceC7526i.mo7819b().f23841o0 >= 2147483647L) {
                throw new IllegalStateException(("Can't create an array of size " + interfaceC7526i.mo7819b().f23841o0).toString());
            }
            i10 = (int) interfaceC7526i.mo7819b().f23841o0;
        } else {
            interfaceC7526i.mo7825s(i10);
        }
        byte[] bArr = new byte[i10];
        C7518a c7518aMo7819b = interfaceC7526i.mo7819b();
        AbstractC16544l.m18094g(c7518aMo7819b, "<this>");
        long j11 = i10;
        int i11 = 0;
        m7835a(j11, 0, j11);
        while (i11 < i10) {
            int iMo7814N = c7518aMo7819b.mo7814N(bArr, i11, i10);
            if (iMo7814N == -1) {
                throw new EOFException(AbstractC0168G.m532u("Source exhausted before reading ", i10, " bytes. Only ", iMo7814N, " bytes were read."));
            }
            i11 += iMo7814N;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: h */
    public static final String m7842h(InterfaceC7526i interfaceC7526i) {
        AbstractC16544l.m18094g(interfaceC7526i, "<this>");
        interfaceC7526i.mo7823l(Long.MAX_VALUE);
        return m7836b(interfaceC7526i.mo7819b(), interfaceC7526i.mo7819b().f23841o0);
    }

    /* JADX INFO: renamed from: i */
    public static final String m7843i(InterfaceC7526i interfaceC7526i, long j10) {
        AbstractC16544l.m18094g(interfaceC7526i, "<this>");
        interfaceC7526i.mo7825s(j10);
        return m7836b(interfaceC7526i.mo7819b(), j10);
    }
}
