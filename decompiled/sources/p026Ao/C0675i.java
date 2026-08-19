package p026Ao;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC16544l;
import p023Al.C0556b;
import p051Bo.AbstractC1455a;
import p051Bo.AbstractC1456b;
import p1113xn.C21307a;
import p909nm.AbstractC17678l;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: Ao.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C0675i implements InterfaceC0677k, InterfaceC0676j, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: Y */
    public C0658G f1969Y;

    /* JADX INFO: renamed from: Z */
    public long f1970Z;

    @Override // p026Ao.InterfaceC0676j
    /* JADX INFO: renamed from: A0 */
    public final /* bridge */ /* synthetic */ InterfaceC0676j mo1327A0(byte[] bArr) {
        m1433d1(bArr);
        return this;
    }

    /* JADX INFO: renamed from: C0 */
    public final C0678l m1417C0(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "byteCount: ").toString());
        }
        if (this.f1970Z < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new C0678l(m1447v0(j10));
        }
        C0678l c0678lM1430a1 = m1430a1((int) j10);
        skip(j10);
        return c0678lM1430a1;
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: F0 */
    public final long mo1341F0(InterfaceC0676j interfaceC0676j) {
        long j10 = this.f1970Z;
        if (j10 > 0) {
            interfaceC0676j.mo1338n0(this, j10);
        }
        return j10;
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: G0 */
    public final int mo1342G0(C0653B options) throws EOFException {
        AbstractC16544l.m18094g(options, "options");
        int iM2060c = AbstractC1455a.m2060c(this, options, false);
        if (iM2060c == -1) {
            return -1;
        }
        skip(options.f1908Y[iM2060c].mo1372d());
        return iM2060c;
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: H */
    public final long mo1325H(C0675i sink, long j10) {
        AbstractC16544l.m18094g(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "byteCount < 0: ").toString());
        }
        long j11 = this.f1970Z;
        if (j11 == 0) {
            return -1L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        sink.mo1338n0(this, j10);
        return j10;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m1418H0(byte[] sink) throws EOFException {
        AbstractC16544l.m18094g(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final long m1419J0() throws EOFException {
        int i10;
        if (this.f1970Z == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z6 = false;
        long j10 = 0;
        do {
            C0658G c0658g = this.f1969Y;
            AbstractC16544l.m18091d(c0658g);
            int i12 = c0658g.f1925b;
            int i13 = c0658g.f1926c;
            while (i12 < i13) {
                byte b = c0658g.f1924a[i12];
                if (b >= 48 && b <= 57) {
                    i10 = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i10 = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i11 != 0) {
                            z6 = true;
                            break;
                        }
                        char[] cArr = AbstractC1456b.f3826a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    i10 = b - 55;
                }
                if ((j10 & (-1152921504606846976L)) != 0) {
                    C0675i c0675i = new C0675i();
                    c0675i.m1438h1(j10);
                    c0675i.m1436f1(b);
                    throw new NumberFormatException("Number too large: ".concat(c0675i.m1428Z0()));
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.f1969Y = c0658g.m1364a();
                AbstractC0659H.m1368a(c0658g);
            } else {
                c0658g.f1925b = i12;
            }
            if (z6) {
                break;
            }
        } while (this.f1969Y != null);
        this.f1970Z -= (long) i11;
        return j10;
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: K */
    public final byte[] mo1343K() {
        return m1447v0(this.f1970Z);
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: L0 */
    public final long mo1344L0(C0678l targetBytes) {
        AbstractC16544l.m18094g(targetBytes, "targetBytes");
        return m1440j0(0L, targetBytes);
    }

    @Override // p026Ao.InterfaceC0676j
    /* JADX INFO: renamed from: M */
    public final /* bridge */ /* synthetic */ InterfaceC0676j mo1328M(int i10) {
        m1436f1(i10);
        return this;
    }

    /* JADX INFO: renamed from: N0 */
    public final int m1420N0() throws EOFException {
        if (this.f1970Z < 4) {
            throw new EOFException();
        }
        C0658G c0658g = this.f1969Y;
        AbstractC16544l.m18091d(c0658g);
        int i10 = c0658g.f1925b;
        int i11 = c0658g.f1926c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c0658g.f1924a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = i13 | (bArr[i12] & 255);
        this.f1970Z -= 4;
        if (i14 == i11) {
            this.f1969Y = c0658g.m1364a();
            AbstractC0659H.m1368a(c0658g);
        } else {
            c0658g.f1925b = i14;
        }
        return i15;
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: Q */
    public final long mo1346Q(byte b, long j10, long j11) {
        C0658G c0658g;
        long j12 = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + this.f1970Z + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        long j13 = this.f1970Z;
        if (j11 > j13) {
            j11 = j13;
        }
        if (j10 == j11 || (c0658g = this.f1969Y) == null) {
            return -1L;
        }
        if (j13 - j10 < j10) {
            while (j13 > j10) {
                c0658g = c0658g.f1930g;
                AbstractC16544l.m18091d(c0658g);
                j13 -= (long) (c0658g.f1926c - c0658g.f1925b);
            }
            while (j13 < j11) {
                int iMin = (int) Math.min(c0658g.f1926c, (((long) c0658g.f1925b) + j11) - j13);
                for (int i10 = (int) ((((long) c0658g.f1925b) + j10) - j13); i10 < iMin; i10++) {
                    if (c0658g.f1924a[i10] == b) {
                        return ((long) (i10 - c0658g.f1925b)) + j13;
                    }
                }
                j13 += (long) (c0658g.f1926c - c0658g.f1925b);
                c0658g = c0658g.f1929f;
                AbstractC16544l.m18091d(c0658g);
                j10 = j13;
            }
            return -1L;
        }
        while (true) {
            long j14 = ((long) (c0658g.f1926c - c0658g.f1925b)) + j12;
            if (j14 > j10) {
                break;
            }
            c0658g = c0658g.f1929f;
            AbstractC16544l.m18091d(c0658g);
            j12 = j14;
        }
        while (j12 < j11) {
            int iMin2 = (int) Math.min(c0658g.f1926c, (((long) c0658g.f1925b) + j11) - j12);
            for (int i11 = (int) ((((long) c0658g.f1925b) + j10) - j12); i11 < iMin2; i11++) {
                if (c0658g.f1924a[i11] == b) {
                    return ((long) (i11 - c0658g.f1925b)) + j12;
                }
            }
            j12 += (long) (c0658g.f1926c - c0658g.f1925b);
            c0658g = c0658g.f1929f;
            AbstractC16544l.m18091d(c0658g);
            j10 = j12;
        }
        return -1L;
    }

    @Override // p026Ao.InterfaceC0676j
    /* JADX INFO: renamed from: Q0 */
    public final /* bridge */ /* synthetic */ InterfaceC0676j mo1329Q0(long j10) {
        m1437g1(j10);
        return this;
    }

    /* JADX INFO: renamed from: S */
    public final void m1421S(C0675i out, long j10, long j11) {
        AbstractC16544l.m18094g(out, "out");
        AbstractC0668b.m1405e(this.f1970Z, j10, j11);
        if (j11 == 0) {
            return;
        }
        out.f1970Z += j11;
        C0658G c0658g = this.f1969Y;
        while (true) {
            AbstractC16544l.m18091d(c0658g);
            long j12 = c0658g.f1926c - c0658g.f1925b;
            if (j10 < j12) {
                break;
            }
            j10 -= j12;
            c0658g = c0658g.f1929f;
        }
        while (j11 > 0) {
            AbstractC16544l.m18091d(c0658g);
            C0658G c0658gM1366c = c0658g.m1366c();
            int i10 = c0658gM1366c.f1925b + ((int) j10);
            c0658gM1366c.f1925b = i10;
            c0658gM1366c.f1926c = Math.min(i10 + ((int) j11), c0658gM1366c.f1926c);
            C0658G c0658g2 = out.f1969Y;
            if (c0658g2 == null) {
                c0658gM1366c.f1930g = c0658gM1366c;
                c0658gM1366c.f1929f = c0658gM1366c;
                out.f1969Y = c0658gM1366c;
            } else {
                C0658G c0658g3 = c0658g2.f1930g;
                AbstractC16544l.m18091d(c0658g3);
                c0658g3.m1365b(c0658gM1366c);
            }
            j11 -= (long) (c0658gM1366c.f1926c - c0658gM1366c.f1925b);
            c0658g = c0658g.f1929f;
            j10 = 0;
        }
    }

    /* JADX INFO: renamed from: T */
    public final byte m1422T(long j10) {
        AbstractC0668b.m1405e(this.f1970Z, j10, 1L);
        C0658G c0658g = this.f1969Y;
        if (c0658g == null) {
            AbstractC16544l.m18091d(null);
            throw null;
        }
        long j11 = this.f1970Z;
        if (j11 - j10 < j10) {
            while (j11 > j10) {
                c0658g = c0658g.f1930g;
                AbstractC16544l.m18091d(c0658g);
                j11 -= (long) (c0658g.f1926c - c0658g.f1925b);
            }
            return c0658g.f1924a[(int) ((((long) c0658g.f1925b) + j10) - j11)];
        }
        long j12 = 0;
        while (true) {
            int i10 = c0658g.f1926c;
            int i11 = c0658g.f1925b;
            long j13 = ((long) (i10 - i11)) + j12;
            if (j13 > j10) {
                return c0658g.f1924a[(int) ((((long) i11) + j10) - j12)];
            }
            c0658g = c0658g.f1929f;
            AbstractC16544l.m18091d(c0658g);
            j12 = j13;
        }
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: T0 */
    public final InputStream mo1349T0() {
        return new C0556b(this, 1);
    }

    /* JADX INFO: renamed from: V0 */
    public final long m1423V0() throws EOFException {
        if (this.f1970Z < 8) {
            throw new EOFException();
        }
        C0658G c0658g = this.f1969Y;
        AbstractC16544l.m18091d(c0658g);
        int i10 = c0658g.f1925b;
        int i11 = c0658g.f1926c;
        if (i11 - i10 < 8) {
            return ((((long) m1420N0()) & 4294967295L) << 32) | (4294967295L & ((long) m1420N0()));
        }
        byte[] bArr = c0658g.f1924a;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        this.f1970Z -= 8;
        if (i13 == i11) {
            this.f1969Y = c0658g.m1364a();
            AbstractC0659H.m1368a(c0658g);
        } else {
            c0658g.f1925b = i13;
        }
        return j11;
    }

    /* JADX INFO: renamed from: W */
    public final long m1424W(long j10, C0678l bytes) {
        long j11 = j10;
        AbstractC16544l.m18094g(bytes, "bytes");
        if (bytes.mo1372d() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j12 = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j11, "fromIndex < 0: ").toString());
        }
        C0658G c0658g = this.f1969Y;
        if (c0658g != null) {
            long j13 = this.f1970Z;
            if (j13 - j11 < j11) {
                while (j13 > j11) {
                    c0658g = c0658g.f1930g;
                    AbstractC16544l.m18091d(c0658g);
                    j13 -= (long) (c0658g.f1926c - c0658g.f1925b);
                }
                byte[] bArrMo1375h = bytes.mo1375h();
                byte b = bArrMo1375h[0];
                int iMo1372d = bytes.mo1372d();
                long j14 = (this.f1970Z - ((long) iMo1372d)) + 1;
                while (j13 < j14) {
                    int iMin = (int) Math.min(c0658g.f1926c, (((long) c0658g.f1925b) + j14) - j13);
                    for (int i10 = (int) ((((long) c0658g.f1925b) + j11) - j13); i10 < iMin; i10++) {
                        if (c0658g.f1924a[i10] == b && AbstractC1455a.m2058a(c0658g, i10 + 1, bArrMo1375h, iMo1372d)) {
                            return ((long) (i10 - c0658g.f1925b)) + j13;
                        }
                    }
                    j13 += (long) (c0658g.f1926c - c0658g.f1925b);
                    c0658g = c0658g.f1929f;
                    AbstractC16544l.m18091d(c0658g);
                    j11 = j13;
                }
            } else {
                while (true) {
                    long j15 = ((long) (c0658g.f1926c - c0658g.f1925b)) + j12;
                    if (j15 > j11) {
                        break;
                    }
                    c0658g = c0658g.f1929f;
                    AbstractC16544l.m18091d(c0658g);
                    j12 = j15;
                }
                byte[] bArrMo1375h2 = bytes.mo1375h();
                byte b10 = bArrMo1375h2[0];
                int iMo1372d2 = bytes.mo1372d();
                long j16 = (this.f1970Z - ((long) iMo1372d2)) + 1;
                while (j12 < j16) {
                    int iMin2 = (int) Math.min(c0658g.f1926c, (((long) c0658g.f1925b) + j16) - j12);
                    for (int i11 = (int) ((((long) c0658g.f1925b) + j11) - j12); i11 < iMin2; i11++) {
                        if (c0658g.f1924a[i11] == b10 && AbstractC1455a.m2058a(c0658g, i11 + 1, bArrMo1375h2, iMo1372d2)) {
                            return ((long) (i11 - c0658g.f1925b)) + j12;
                        }
                    }
                    j12 += (long) (c0658g.f1926c - c0658g.f1925b);
                    c0658g = c0658g.f1929f;
                    AbstractC16544l.m18091d(c0658g);
                    j11 = j12;
                }
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: W0 */
    public final short m1425W0() throws EOFException {
        if (this.f1970Z < 2) {
            throw new EOFException();
        }
        C0658G c0658g = this.f1969Y;
        AbstractC16544l.m18091d(c0658g);
        int i10 = c0658g.f1925b;
        int i11 = c0658g.f1926c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        int i12 = i10 + 1;
        byte[] bArr = c0658g.f1924a;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        this.f1970Z -= 2;
        if (i14 == i11) {
            this.f1969Y = c0658g.m1364a();
            AbstractC0659H.m1368a(c0658g);
        } else {
            c0658g.f1925b = i14;
        }
        return (short) i15;
    }

    /* JADX INFO: renamed from: X0 */
    public final short m1426X0() throws EOFException {
        short sM1425W0 = m1425W0();
        return (short) (((sM1425W0 & 255) << 8) | ((65280 & sM1425W0) >>> 8));
    }

    /* JADX INFO: renamed from: Y0 */
    public final String m1427Y0(long j10, Charset charset) throws EOFException {
        AbstractC16544l.m18094g(charset, "charset");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "byteCount: ").toString());
        }
        if (this.f1970Z < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        C0658G c0658g = this.f1969Y;
        AbstractC16544l.m18091d(c0658g);
        int i10 = c0658g.f1925b;
        if (((long) i10) + j10 > c0658g.f1926c) {
            return new String(m1447v0(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(c0658g.f1924a, i10, i11, charset);
        int i12 = c0658g.f1925b + i11;
        c0658g.f1925b = i12;
        this.f1970Z -= j10;
        if (i12 == c0658g.f1926c) {
            this.f1969Y = c0658g.m1364a();
            AbstractC0659H.m1368a(c0658g);
        }
        return str;
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: Z */
    public final long mo1351Z(C0678l bytes) {
        AbstractC16544l.m18094g(bytes, "bytes");
        return m1424W(0L, bytes);
    }

    /* JADX INFO: renamed from: Z0 */
    public final String m1428Z0() {
        return m1427Y0(this.f1970Z, C21307a.f67720a);
    }

    /* JADX INFO: renamed from: a */
    public final void m1429a() throws EOFException {
        skip(this.f1970Z);
    }

    /* JADX INFO: renamed from: a1 */
    public final C0678l m1430a1(int i10) {
        if (i10 == 0) {
            return C0678l.f1971p0;
        }
        AbstractC0668b.m1405e(this.f1970Z, 0L, i10);
        C0658G c0658g = this.f1969Y;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            AbstractC16544l.m18091d(c0658g);
            int i14 = c0658g.f1926c;
            int i15 = c0658g.f1925b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            c0658g = c0658g.f1929f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        C0658G c0658g2 = this.f1969Y;
        int i16 = 0;
        while (i11 < i10) {
            AbstractC16544l.m18091d(c0658g2);
            bArr[i16] = c0658g2.f1924a;
            i11 += c0658g2.f1926c - c0658g2.f1925b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = c0658g2.f1925b;
            c0658g2.f1927d = true;
            i16++;
            c0658g2 = c0658g2.f1929f;
        }
        return new C0660I(bArr, iArr);
    }

    @Override // p026Ao.InterfaceC0676j
    /* JADX INFO: renamed from: b0 */
    public final /* bridge */ /* synthetic */ InterfaceC0676j mo1332b0(C0678l c0678l) {
        m1432c1(c0678l);
        return this;
    }

    /* JADX INFO: renamed from: b1 */
    public final C0658G m1431b1(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C0658G c0658g = this.f1969Y;
        if (c0658g == null) {
            C0658G c0658gM1369b = AbstractC0659H.m1369b();
            this.f1969Y = c0658gM1369b;
            c0658gM1369b.f1930g = c0658gM1369b;
            c0658gM1369b.f1929f = c0658gM1369b;
            return c0658gM1369b;
        }
        C0658G c0658g2 = c0658g.f1930g;
        AbstractC16544l.m18091d(c0658g2);
        if (c0658g2.f1926c + i10 <= 8192 && c0658g2.f1928e) {
            return c0658g2;
        }
        C0658G c0658gM1369b2 = AbstractC0659H.m1369b();
        c0658g2.m1365b(c0658gM1369b2);
        return c0658gM1369b2;
    }

    @Override // p026Ao.InterfaceC0676j
    /* JADX INFO: renamed from: c0 */
    public final /* bridge */ /* synthetic */ InterfaceC0676j mo1333c0(String str) {
        m1444l1(str);
        return this;
    }

    /* JADX INFO: renamed from: c1 */
    public final void m1432c1(C0678l byteString) {
        AbstractC16544l.m18094g(byteString, "byteString");
        byteString.mo1383s(this, byteString.mo1372d());
    }

    /* JADX INFO: renamed from: d1 */
    public final void m1433d1(byte[] source) {
        AbstractC16544l.m18094g(source, "source");
        m1435e1(source, 0, source.length);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C0675i clone() {
        C0675i c0675i = new C0675i();
        if (this.f1970Z != 0) {
            C0658G c0658g = this.f1969Y;
            AbstractC16544l.m18091d(c0658g);
            C0658G c0658gM1366c = c0658g.m1366c();
            c0675i.f1969Y = c0658gM1366c;
            c0658gM1366c.f1930g = c0658gM1366c;
            c0658gM1366c.f1929f = c0658gM1366c;
            for (C0658G c0658g2 = c0658g.f1929f; c0658g2 != c0658g; c0658g2 = c0658g2.f1929f) {
                C0658G c0658g3 = c0658gM1366c.f1930g;
                AbstractC16544l.m18091d(c0658g3);
                AbstractC16544l.m18091d(c0658g2);
                c0658g3.m1365b(c0658g2.m1366c());
            }
            c0675i.f1970Z = this.f1970Z;
        }
        return c0675i;
    }

    /* JADX INFO: renamed from: e1 */
    public final void m1435e1(byte[] source, int i10, int i11) {
        AbstractC16544l.m18094g(source, "source");
        long j10 = i11;
        AbstractC0668b.m1405e(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            C0658G c0658gM1431b1 = m1431b1(1);
            int iMin = Math.min(i12 - i10, 8192 - c0658gM1431b1.f1926c);
            int i13 = i10 + iMin;
            AbstractC17678l.m19305l(source, c0658gM1431b1.f1926c, c0658gM1431b1.f1924a, i10, i13);
            c0658gM1431b1.f1926c += iMin;
            i10 = i13;
        }
        this.f1970Z += j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0675i) {
                long j10 = this.f1970Z;
                C0675i c0675i = (C0675i) obj;
                if (j10 == c0675i.f1970Z) {
                    if (j10 != 0) {
                        C0658G c0658g = this.f1969Y;
                        AbstractC16544l.m18091d(c0658g);
                        C0658G c0658g2 = c0675i.f1969Y;
                        AbstractC16544l.m18091d(c0658g2);
                        int i10 = c0658g.f1925b;
                        int i11 = c0658g2.f1925b;
                        long j11 = 0;
                        while (j11 < this.f1970Z) {
                            long jMin = Math.min(c0658g.f1926c - i10, c0658g2.f1926c - i11);
                            long j12 = 0;
                            while (j12 < jMin) {
                                int i12 = i10 + 1;
                                byte b = c0658g.f1924a[i10];
                                int i13 = i11 + 1;
                                if (b == c0658g2.f1924a[i11]) {
                                    j12++;
                                    i11 = i13;
                                    i10 = i12;
                                }
                            }
                            if (i10 == c0658g.f1926c) {
                                C0658G c0658g3 = c0658g.f1929f;
                                AbstractC16544l.m18091d(c0658g3);
                                i10 = c0658g3.f1925b;
                                c0658g = c0658g3;
                            }
                            if (i11 == c0658g2.f1926c) {
                                c0658g2 = c0658g2.f1929f;
                                AbstractC16544l.m18091d(c0658g2);
                                i11 = c0658g2.f1925b;
                            }
                            j11 += jMin;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: f0 */
    public final String mo1355f0(Charset charset) {
        return m1427Y0(this.f1970Z, charset);
    }

    /* JADX INFO: renamed from: f1 */
    public final void m1436f1(int i10) {
        C0658G c0658gM1431b1 = m1431b1(1);
        int i11 = c0658gM1431b1.f1926c;
        c0658gM1431b1.f1926c = i11 + 1;
        c0658gM1431b1.f1924a[i11] = (byte) i10;
        this.f1970Z++;
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: g */
    public final boolean mo1356g() {
        return this.f1970Z == 0;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m1437g1(long j10) {
        boolean z6;
        byte[] bArr;
        if (j10 == 0) {
            m1436f1(48);
            return;
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                m1444l1("-9223372036854775808");
                return;
            }
            z6 = true;
        } else {
            z6 = false;
        }
        if (j10 < 100000000) {
            if (j10 < 10000) {
                if (j10 >= 100) {
                    i10 = j10 < 1000 ? 3 : 4;
                } else if (j10 >= 10) {
                    i10 = 2;
                }
            } else if (j10 < 1000000) {
                i10 = j10 < 100000 ? 5 : 6;
            } else {
                i10 = j10 < 10000000 ? 7 : 8;
            }
        } else if (j10 < 1000000000000L) {
            if (j10 < 10000000000L) {
                i10 = j10 < 1000000000 ? 9 : 10;
            } else {
                i10 = j10 < 100000000000L ? 11 : 12;
            }
        } else if (j10 < 1000000000000000L) {
            if (j10 < 10000000000000L) {
                i10 = 13;
            } else {
                i10 = j10 < 100000000000000L ? 14 : 15;
            }
        } else if (j10 < 100000000000000000L) {
            i10 = j10 < 10000000000000000L ? 16 : 17;
        } else {
            i10 = j10 < 1000000000000000000L ? 18 : 19;
        }
        if (z6) {
            i10++;
        }
        C0658G c0658gM1431b1 = m1431b1(i10);
        int i11 = c0658gM1431b1.f1926c + i10;
        while (true) {
            bArr = c0658gM1431b1.f1924a;
            if (j10 == 0) {
                break;
            }
            long j11 = 10;
            i11--;
            bArr[i11] = AbstractC1455a.f3825a[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z6) {
            bArr[i11 - 1] = 45;
        }
        c0658gM1431b1.f1926c += i10;
        this.f1970Z += (long) i10;
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: h */
    public final C0665N mo1326h() {
        return C0665N.f1937d;
    }

    @Override // p026Ao.InterfaceC0676j
    /* JADX INFO: renamed from: h0 */
    public final /* bridge */ /* synthetic */ InterfaceC0676j mo1336h0(byte[] bArr, int i10, int i11) {
        m1435e1(bArr, i10, i11);
        return this;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m1438h1(long j10) {
        if (j10 == 0) {
            m1436f1(48);
            return;
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        C0658G c0658gM1431b1 = m1431b1(i10);
        int i11 = c0658gM1431b1.f1926c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            c0658gM1431b1.f1924a[i12] = AbstractC1455a.f3825a[(int) (15 & j10)];
            j10 >>>= 4;
        }
        c0658gM1431b1.f1926c += i10;
        this.f1970Z += (long) i10;
    }

    public final int hashCode() {
        C0658G c0658g = this.f1969Y;
        if (c0658g == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = c0658g.f1926c;
            for (int i12 = c0658g.f1925b; i12 < i11; i12++) {
                i10 = (i10 * 31) + c0658g.f1924a[i12];
            }
            c0658g = c0658g.f1929f;
            AbstractC16544l.m18091d(c0658g);
        } while (c0658g != this.f1969Y);
        return i10;
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: i0 */
    public final C0678l mo1357i0() {
        return m1417C0(this.f1970Z);
    }

    /* JADX INFO: renamed from: i1 */
    public final void m1439i1(int i10) {
        C0658G c0658gM1431b1 = m1431b1(4);
        int i11 = c0658gM1431b1.f1926c;
        byte[] bArr = c0658gM1431b1.f1924a;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        c0658gM1431b1.f1926c = i11 + 4;
        this.f1970Z += 4;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX INFO: renamed from: j0 */
    public final long m1440j0(long j10, C0678l targetBytes) {
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC16544l.m18094g(targetBytes, "targetBytes");
        long j11 = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "fromIndex < 0: ").toString());
        }
        C0658G c0658g = this.f1969Y;
        if (c0658g == null) {
            return -1L;
        }
        long j12 = this.f1970Z;
        if (j12 - j10 < j10) {
            while (j12 > j10) {
                c0658g = c0658g.f1930g;
                AbstractC16544l.m18091d(c0658g);
                j12 -= (long) (c0658g.f1926c - c0658g.f1925b);
            }
            if (targetBytes.mo1372d() == 2) {
                byte bMo1376i = targetBytes.mo1376i(0);
                byte bMo1376i2 = targetBytes.mo1376i(1);
                while (j12 < this.f1970Z) {
                    i12 = (int) ((((long) c0658g.f1925b) + j10) - j12);
                    int i14 = c0658g.f1926c;
                    while (i12 < i14) {
                        byte b = c0658g.f1924a[i12];
                        if (b == bMo1376i || b == bMo1376i2) {
                            i13 = c0658g.f1925b;
                        } else {
                            i12++;
                        }
                    }
                    j12 += (long) (c0658g.f1926c - c0658g.f1925b);
                    c0658g = c0658g.f1929f;
                    AbstractC16544l.m18091d(c0658g);
                    j10 = j12;
                }
                return -1L;
            }
            byte[] bArrMo1375h = targetBytes.mo1375h();
            while (j12 < this.f1970Z) {
                i12 = (int) ((((long) c0658g.f1925b) + j10) - j12);
                int i15 = c0658g.f1926c;
                while (i12 < i15) {
                    byte b10 = c0658g.f1924a[i12];
                    for (byte b11 : bArrMo1375h) {
                        if (b10 == b11) {
                            i13 = c0658g.f1925b;
                        }
                    }
                    i12++;
                }
                j12 += (long) (c0658g.f1926c - c0658g.f1925b);
                c0658g = c0658g.f1929f;
                AbstractC16544l.m18091d(c0658g);
                j10 = j12;
            }
            return -1L;
            return ((long) (i12 - i13)) + j12;
        }
        while (true) {
            long j13 = ((long) (c0658g.f1926c - c0658g.f1925b)) + j11;
            if (j13 > j10) {
                break;
            }
            c0658g = c0658g.f1929f;
            AbstractC16544l.m18091d(c0658g);
            j11 = j13;
        }
        if (targetBytes.mo1372d() == 2) {
            byte bMo1376i3 = targetBytes.mo1376i(0);
            byte bMo1376i4 = targetBytes.mo1376i(1);
            while (j11 < this.f1970Z) {
                i10 = (int) ((((long) c0658g.f1925b) + j10) - j11);
                int i16 = c0658g.f1926c;
                while (i10 < i16) {
                    byte b12 = c0658g.f1924a[i10];
                    if (b12 == bMo1376i3 || b12 == bMo1376i4) {
                        i11 = c0658g.f1925b;
                    } else {
                        i10++;
                    }
                }
                j11 += (long) (c0658g.f1926c - c0658g.f1925b);
                c0658g = c0658g.f1929f;
                AbstractC16544l.m18091d(c0658g);
                j10 = j11;
            }
            return -1L;
        }
        byte[] bArrMo1375h2 = targetBytes.mo1375h();
        while (j11 < this.f1970Z) {
            i10 = (int) ((((long) c0658g.f1925b) + j10) - j11);
            int i17 = c0658g.f1926c;
            while (i10 < i17) {
                byte b13 = c0658g.f1924a[i10];
                for (byte b14 : bArrMo1375h2) {
                    if (b13 == b14) {
                        i11 = c0658g.f1925b;
                    }
                }
                i10++;
            }
            j11 += (long) (c0658g.f1926c - c0658g.f1925b);
            c0658g = c0658g.f1929f;
            AbstractC16544l.m18091d(c0658g);
            j10 = j11;
        }
        return -1L;
        return ((long) (i10 - i11)) + j11;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m1441j1(int i10) {
        C0658G c0658gM1431b1 = m1431b1(2);
        int i11 = c0658gM1431b1.f1926c;
        byte[] bArr = c0658gM1431b1.f1924a;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        c0658gM1431b1.f1926c = i11 + 2;
        this.f1970Z += 2;
    }

    /* JADX INFO: renamed from: k */
    public final long m1442k() {
        long j10 = this.f1970Z;
        if (j10 == 0) {
            return 0L;
        }
        C0658G c0658g = this.f1969Y;
        AbstractC16544l.m18091d(c0658g);
        C0658G c0658g2 = c0658g.f1930g;
        AbstractC16544l.m18091d(c0658g2);
        int i10 = c0658g2.f1926c;
        if (i10 < 8192 && c0658g2.f1928e) {
            j10 -= (long) (i10 - c0658g2.f1925b);
        }
        return j10;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m1443k1(int i10, int i11, String string) {
        char cCharAt;
        AbstractC16544l.m18094g(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "beginIndex < 0: ").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("endIndex < beginIndex: ", i11, i10, " < ").toString());
        }
        if (i11 > string.length()) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i11, "endIndex > string.length: ", " > ");
            sbM11057o.append(string.length());
            throw new IllegalArgumentException(sbM11057o.toString().toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                C0658G c0658gM1431b1 = m1431b1(1);
                int i12 = c0658gM1431b1.f1926c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                byte[] bArr = c0658gM1431b1.f1924a;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = c0658gM1431b1.f1926c;
                int i15 = (i12 + i10) - i14;
                c0658gM1431b1.f1926c = i14 + i15;
                this.f1970Z += (long) i15;
            } else {
                if (cCharAt2 < 2048) {
                    C0658G c0658gM1431b2 = m1431b1(2);
                    int i16 = c0658gM1431b2.f1926c;
                    byte[] bArr2 = c0658gM1431b2.f1924a;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c0658gM1431b2.f1926c = i16 + 2;
                    this.f1970Z += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C0658G c0658gM1431b3 = m1431b1(3);
                    int i17 = c0658gM1431b3.f1926c;
                    byte[] bArr3 = c0658gM1431b3.f1924a;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c0658gM1431b3.f1926c = i17 + 3;
                    this.f1970Z += 3;
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m1436f1(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C0658G c0658gM1431b4 = m1431b1(4);
                        int i20 = c0658gM1431b4.f1926c;
                        byte[] bArr4 = c0658gM1431b4.f1924a;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        c0658gM1431b4.f1926c = i20 + 4;
                        this.f1970Z += 4;
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: l */
    public final boolean mo1359l(long j10) {
        return this.f1970Z >= j10;
    }

    @Override // p026Ao.InterfaceC0676j
    /* JADX INFO: renamed from: l0 */
    public final /* bridge */ /* synthetic */ InterfaceC0676j mo1337l0(int i10, int i11, String str) {
        m1443k1(i10, i11, str);
        return this;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m1444l1(String string) {
        AbstractC16544l.m18094g(string, "string");
        m1443k1(0, string.length(), string);
    }

    /* JADX INFO: renamed from: m1 */
    public final void m1445m1(int i10) {
        if (i10 < 128) {
            m1436f1(i10);
            return;
        }
        if (i10 < 2048) {
            C0658G c0658gM1431b1 = m1431b1(2);
            int i11 = c0658gM1431b1.f1926c;
            byte[] bArr = c0658gM1431b1.f1924a;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            c0658gM1431b1.f1926c = i11 + 2;
            this.f1970Z += 2;
            return;
        }
        if (55296 <= i10 && i10 < 57344) {
            m1436f1(63);
            return;
        }
        if (i10 < 65536) {
            C0658G c0658gM1431b2 = m1431b1(3);
            int i12 = c0658gM1431b2.f1926c;
            byte[] bArr2 = c0658gM1431b2.f1924a;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            c0658gM1431b2.f1926c = i12 + 3;
            this.f1970Z += 3;
            return;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(AbstractC0668b.m1412l(i10)));
        }
        C0658G c0658gM1431b3 = m1431b1(4);
        int i13 = c0658gM1431b3.f1926c;
        byte[] bArr3 = c0658gM1431b3.f1924a;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        c0658gM1431b3.f1926c = i13 + 4;
        this.f1970Z += 4;
    }

    @Override // p026Ao.InterfaceC0661J
    /* JADX INFO: renamed from: n0 */
    public final void mo1338n0(C0675i source, long j10) {
        C0658G c0658gM1369b;
        AbstractC16544l.m18094g(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC0668b.m1405e(source.f1970Z, 0L, j10);
        while (j10 > 0) {
            C0658G c0658g = source.f1969Y;
            AbstractC16544l.m18091d(c0658g);
            int i10 = c0658g.f1926c;
            C0658G c0658g2 = source.f1969Y;
            AbstractC16544l.m18091d(c0658g2);
            long j11 = i10 - c0658g2.f1925b;
            int i11 = 0;
            if (j10 < j11) {
                C0658G c0658g3 = this.f1969Y;
                C0658G c0658g4 = c0658g3 != null ? c0658g3.f1930g : null;
                if (c0658g4 != null && c0658g4.f1928e) {
                    if ((((long) c0658g4.f1926c) + j10) - ((long) (c0658g4.f1927d ? 0 : c0658g4.f1925b)) <= 8192) {
                        C0658G c0658g5 = source.f1969Y;
                        AbstractC16544l.m18091d(c0658g5);
                        c0658g5.m1367d(c0658g4, (int) j10);
                        source.f1970Z -= j10;
                        this.f1970Z += j10;
                        return;
                    }
                }
                C0658G c0658g6 = source.f1969Y;
                AbstractC16544l.m18091d(c0658g6);
                int i12 = (int) j10;
                if (i12 <= 0 || i12 > c0658g6.f1926c - c0658g6.f1925b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i12 >= 1024) {
                    c0658gM1369b = c0658g6.m1366c();
                } else {
                    c0658gM1369b = AbstractC0659H.m1369b();
                    int i13 = c0658g6.f1925b;
                    AbstractC17678l.m19305l(c0658g6.f1924a, 0, c0658gM1369b.f1924a, i13, i13 + i12);
                }
                c0658gM1369b.f1926c = c0658gM1369b.f1925b + i12;
                c0658g6.f1925b += i12;
                C0658G c0658g7 = c0658g6.f1930g;
                AbstractC16544l.m18091d(c0658g7);
                c0658g7.m1365b(c0658gM1369b);
                source.f1969Y = c0658gM1369b;
            }
            C0658G c0658g8 = source.f1969Y;
            AbstractC16544l.m18091d(c0658g8);
            long j12 = c0658g8.f1926c - c0658g8.f1925b;
            source.f1969Y = c0658g8.m1364a();
            C0658G c0658g9 = this.f1969Y;
            if (c0658g9 == null) {
                this.f1969Y = c0658g8;
                c0658g8.f1930g = c0658g8;
                c0658g8.f1929f = c0658g8;
            } else {
                C0658G c0658g10 = c0658g9.f1930g;
                AbstractC16544l.m18091d(c0658g10);
                c0658g10.m1365b(c0658g8);
                C0658G c0658g11 = c0658g8.f1930g;
                if (c0658g11 == c0658g8) {
                    throw new IllegalStateException("cannot compact");
                }
                AbstractC16544l.m18091d(c0658g11);
                if (c0658g11.f1928e) {
                    int i14 = c0658g8.f1926c - c0658g8.f1925b;
                    C0658G c0658g12 = c0658g8.f1930g;
                    AbstractC16544l.m18091d(c0658g12);
                    int i15 = 8192 - c0658g12.f1926c;
                    C0658G c0658g13 = c0658g8.f1930g;
                    AbstractC16544l.m18091d(c0658g13);
                    if (!c0658g13.f1927d) {
                        C0658G c0658g14 = c0658g8.f1930g;
                        AbstractC16544l.m18091d(c0658g14);
                        i11 = c0658g14.f1925b;
                    }
                    if (i14 <= i15 + i11) {
                        C0658G c0658g15 = c0658g8.f1930g;
                        AbstractC16544l.m18091d(c0658g15);
                        c0658g8.m1367d(c0658g15, i14);
                        c0658g8.m1364a();
                        AbstractC0659H.m1368a(c0658g8);
                    }
                }
            }
            source.f1970Z -= j12;
            this.f1970Z += j12;
            j10 -= j12;
        }
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: p0 */
    public final boolean mo1361p0(long j10, C0678l bytes) {
        AbstractC16544l.m18094g(bytes, "bytes");
        int iMo1372d = bytes.mo1372d();
        if (j10 < 0 || iMo1372d < 0 || this.f1970Z - j10 < iMo1372d || bytes.mo1372d() < iMo1372d) {
            return false;
        }
        for (int i10 = 0; i10 < iMo1372d; i10++) {
            if (m1422T(((long) i10) + j10) != bytes.mo1376i(i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // p026Ao.InterfaceC0677k
    public final C0657F peek() {
        return AbstractC0668b.m1403c(new C0655D(this));
    }

    /* JADX INFO: renamed from: r0 */
    public final C0674h m1446r0(C0674h unsafeCursor) {
        AbstractC16544l.m18094g(unsafeCursor, "unsafeCursor");
        byte[] bArr = AbstractC1455a.f3825a;
        if (unsafeCursor == AbstractC0668b.f1946a) {
            unsafeCursor = new C0674h();
        }
        if (unsafeCursor.f1962Y != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursor.f1962Y = this;
        unsafeCursor.f1963Z = true;
        return unsafeCursor;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        AbstractC16544l.m18094g(sink, "sink");
        C0658G c0658g = this.f1969Y;
        if (c0658g == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), c0658g.f1926c - c0658g.f1925b);
        sink.put(c0658g.f1924a, c0658g.f1925b, iMin);
        int i10 = c0658g.f1925b + iMin;
        c0658g.f1925b = i10;
        this.f1970Z -= (long) iMin;
        if (i10 == c0658g.f1926c) {
            this.f1969Y = c0658g.m1364a();
            AbstractC0659H.m1368a(c0658g);
        }
        return iMin;
    }

    public final byte readByte() {
        if (this.f1970Z == 0) {
            throw new EOFException();
        }
        C0658G c0658g = this.f1969Y;
        AbstractC16544l.m18091d(c0658g);
        int i10 = c0658g.f1925b;
        int i11 = c0658g.f1926c;
        int i12 = i10 + 1;
        byte b = c0658g.f1924a[i10];
        this.f1970Z--;
        if (i12 == i11) {
            this.f1969Y = c0658g.m1364a();
            AbstractC0659H.m1368a(c0658g);
        } else {
            c0658g.f1925b = i12;
        }
        return b;
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: s */
    public final void mo1362s(long j10) throws EOFException {
        if (this.f1970Z < j10) {
            throw new EOFException();
        }
    }

    @Override // p026Ao.InterfaceC0677k
    public final void skip(long j10) throws EOFException {
        while (j10 > 0) {
            C0658G c0658g = this.f1969Y;
            if (c0658g == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, c0658g.f1926c - c0658g.f1925b);
            long j11 = iMin;
            this.f1970Z -= j11;
            j10 -= j11;
            int i10 = c0658g.f1925b + iMin;
            c0658g.f1925b = i10;
            if (i10 == c0658g.f1926c) {
                this.f1969Y = c0658g.m1364a();
                AbstractC0659H.m1368a(c0658g);
            }
        }
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: t0 */
    public final String mo1363t0() throws EOFException {
        if (Long.MAX_VALUE < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(Long.MAX_VALUE, "limit < 0: ").toString());
        }
        long j10 = Long.MAX_VALUE != Long.MAX_VALUE ? Long.MAX_VALUE + 1 : Long.MAX_VALUE;
        long jMo1346Q = mo1346Q((byte) 10, 0L, j10);
        if (jMo1346Q != -1) {
            return AbstractC1455a.m2059b(this, jMo1346Q);
        }
        if (j10 < this.f1970Z && m1422T(j10 - 1) == 13 && m1422T(j10) == 10) {
            return AbstractC1455a.m2059b(this, j10);
        }
        C0675i c0675i = new C0675i();
        m1421S(c0675i, 0L, Math.min(32, this.f1970Z));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f1970Z, Long.MAX_VALUE) + " content=" + c0675i.m1417C0(c0675i.f1970Z).mo1373e() + (char) 8230);
    }

    public final String toString() {
        long j10 = this.f1970Z;
        if (j10 <= 2147483647L) {
            return m1430a1((int) j10).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f1970Z).toString());
    }

    @Override // p026Ao.InterfaceC0676j
    /* JADX INFO: renamed from: u */
    public final long mo1339u(InterfaceC0663L source) {
        AbstractC16544l.m18094g(source, "source");
        long j10 = 0;
        while (true) {
            long jMo1325H = source.mo1325H(this, 8192L);
            if (jMo1325H == -1) {
                return j10;
            }
            j10 += jMo1325H;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final byte[] m1447v0(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "byteCount: ").toString());
        }
        if (this.f1970Z < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        m1418H0(bArr);
        return bArr;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        AbstractC16544l.m18094g(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            C0658G c0658gM1431b1 = m1431b1(1);
            int iMin = Math.min(i10, 8192 - c0658gM1431b1.f1926c);
            source.get(c0658gM1431b1.f1924a, c0658gM1431b1.f1926c, iMin);
            i10 -= iMin;
            c0658gM1431b1.f1926c += iMin;
        }
        this.f1970Z += (long) iRemaining;
        return iRemaining;
    }

    public final int read(byte[] sink, int i10, int i11) {
        AbstractC16544l.m18094g(sink, "sink");
        AbstractC0668b.m1405e(sink.length, i10, i11);
        C0658G c0658g = this.f1969Y;
        if (c0658g == null) {
            return -1;
        }
        int iMin = Math.min(i11, c0658g.f1926c - c0658g.f1925b);
        int i12 = c0658g.f1925b;
        AbstractC17678l.m19305l(c0658g.f1924a, i10, sink, i12, i12 + iMin);
        int i13 = c0658g.f1925b + iMin;
        c0658g.f1925b = i13;
        this.f1970Z -= (long) iMin;
        if (i13 == c0658g.f1926c) {
            this.f1969Y = c0658g.m1364a();
            AbstractC0659H.m1368a(c0658g);
        }
        return iMin;
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: b */
    public final C0675i mo1353b() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p026Ao.InterfaceC0661J
    public final void close() {
    }

    @Override // p026Ao.InterfaceC0676j, p026Ao.InterfaceC0661J, java.io.Flushable
    public final void flush() {
    }
}
