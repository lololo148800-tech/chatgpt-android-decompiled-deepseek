package p026Ao;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC16544l;
import p023Al.C0556b;
import p051Bo.AbstractC1455a;
import p1113xn.C21307a;
import p160G5.p161rK.TVCuK;
import p548Wd.p549VF.zakks;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Ao.F */
/* JADX INFO: loaded from: classes2.dex */
public final class C0657F implements InterfaceC0677k {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC0663L f1921Y;

    /* JADX INFO: renamed from: Z */
    public final C0675i f1922Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f1923o0;

    public C0657F(InterfaceC0663L source) {
        AbstractC16544l.m18094g(source, "source");
        this.f1921Y = source;
        this.f1922Z = new C0675i();
    }

    /* JADX INFO: renamed from: E */
    public final long m1340E() throws EOFException {
        mo1362s(8L);
        long jM1423V0 = this.f1922Z.m1423V0();
        return ((jM1423V0 & 255) << 56) | (((-72057594037927936L) & jM1423V0) >>> 56) | ((71776119061217280L & jM1423V0) >>> 40) | ((280375465082880L & jM1423V0) >>> 24) | ((1095216660480L & jM1423V0) >>> 8) | ((4278190080L & jM1423V0) << 8) | ((16711680 & jM1423V0) << 24) | ((65280 & jM1423V0) << 40);
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: F0 */
    public final long mo1341F0(InterfaceC0676j interfaceC0676j) {
        C0675i c0675i;
        long j10 = 0;
        while (true) {
            c0675i = this.f1922Z;
            if (this.f1921Y.mo1325H(c0675i, 8192L) == -1) {
                break;
            }
            long jM1442k = c0675i.m1442k();
            if (jM1442k > 0) {
                j10 += jM1442k;
                interfaceC0676j.mo1338n0(c0675i, jM1442k);
            }
        }
        long j11 = c0675i.f1970Z;
        if (j11 <= 0) {
            return j10;
        }
        long j12 = j10 + j11;
        interfaceC0676j.mo1338n0(c0675i, j11);
        return j12;
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: G0 */
    public final int mo1342G0(C0653B options) throws EOFException {
        C0675i c0675i;
        AbstractC16544l.m18094g(options, "options");
        if (this.f1923o0) {
            throw new IllegalStateException("closed");
        }
        do {
            c0675i = this.f1922Z;
            int iM2060c = AbstractC1455a.m2060c(c0675i, options, true);
            if (iM2060c != -2) {
                if (iM2060c == -1) {
                    break;
                }
                c0675i.skip(options.f1908Y[iM2060c].mo1372d());
                return iM2060c;
            }
        } while (this.f1921Y.mo1325H(c0675i, 8192L) != -1);
        return -1;
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: H */
    public final long mo1325H(C0675i sink, long j10) {
        AbstractC16544l.m18094g(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "byteCount < 0: ").toString());
        }
        if (this.f1923o0) {
            throw new IllegalStateException("closed");
        }
        C0675i c0675i = this.f1922Z;
        if (c0675i.f1970Z == 0) {
            if (j10 == 0) {
                return 0L;
            }
            if (this.f1921Y.mo1325H(c0675i, 8192L) == -1) {
                return -1L;
            }
        }
        return c0675i.mo1325H(sink, Math.min(j10, c0675i.f1970Z));
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: K */
    public final byte[] mo1343K() {
        InterfaceC0663L interfaceC0663L = this.f1921Y;
        C0675i c0675i = this.f1922Z;
        c0675i.mo1339u(interfaceC0663L);
        return c0675i.m1447v0(c0675i.f1970Z);
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: L0 */
    public final long mo1344L0(C0678l targetBytes) {
        AbstractC16544l.m18094g(targetBytes, "targetBytes");
        if (this.f1923o0) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            C0675i c0675i = this.f1922Z;
            long jM1440j0 = c0675i.m1440j0(jMax, targetBytes);
            if (jM1440j0 != -1) {
                return jM1440j0;
            }
            long j10 = c0675i.f1970Z;
            if (this.f1921Y.mo1325H(c0675i, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j10);
        }
    }

    /* JADX INFO: renamed from: P */
    public final short m1345P() {
        mo1362s(2L);
        return this.f1922Z.m1425W0();
    }

    /* JADX INFO: renamed from: S */
    public final short m1347S() {
        mo1362s(2L);
        return this.f1922Z.m1426X0();
    }

    /* JADX INFO: renamed from: T */
    public final String m1348T(long j10) {
        mo1362s(j10);
        C0675i c0675i = this.f1922Z;
        c0675i.getClass();
        return c0675i.m1427Y0(j10, C21307a.f67720a);
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: T0 */
    public final InputStream mo1349T0() {
        return new C0556b(this, 2);
    }

    /* JADX INFO: renamed from: W */
    public final String m1350W(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "limit < 0: ").toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jMo1346Q = mo1346Q((byte) 10, 0L, j11);
        C0675i c0675i = this.f1922Z;
        if (jMo1346Q != -1) {
            return AbstractC1455a.m2059b(c0675i, jMo1346Q);
        }
        if (j11 < Long.MAX_VALUE && mo1359l(j11) && c0675i.m1422T(j11 - 1) == 13 && mo1359l(1 + j11) && c0675i.m1422T(j11) == 10) {
            return AbstractC1455a.m2059b(c0675i, j11);
        }
        C0675i c0675i2 = new C0675i();
        c0675i.m1421S(c0675i2, 0L, Math.min(32, c0675i.f1970Z));
        throw new EOFException("\\n not found: limit=" + Math.min(c0675i.f1970Z, j10) + " content=" + c0675i2.m1417C0(c0675i2.f1970Z).mo1373e() + (char) 8230);
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: Z */
    public final long mo1351Z(C0678l bytes) {
        AbstractC16544l.m18094g(bytes, "bytes");
        if (this.f1923o0) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            C0675i c0675i = this.f1922Z;
            long jM1424W = c0675i.m1424W(jMax, bytes);
            if (jM1424W != -1) {
                return jM1424W;
            }
            long j10 = c0675i.f1970Z;
            if (this.f1921Y.mo1325H(c0675i, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, (j10 - ((long) bytes.f1972Y.length)) + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0678l m1352a(long j10) {
        mo1362s(j10);
        return this.f1922Z.m1417C0(j10);
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: b */
    public final C0675i mo1353b() {
        return this.f1922Z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f1923o0) {
            return;
        }
        this.f1923o0 = true;
        this.f1921Y.close();
        this.f1922Z.m1429a();
    }

    /* JADX INFO: renamed from: e */
    public final void m1354e(C0675i c0675i, long j10) throws EOFException {
        C0675i c0675i2 = this.f1922Z;
        try {
            mo1362s(j10);
            long j11 = c0675i2.f1970Z;
            if (j11 >= j10) {
                c0675i.mo1338n0(c0675i2, j10);
            } else {
                c0675i.mo1338n0(c0675i2, j11);
                throw new EOFException();
            }
        } catch (EOFException e10) {
            c0675i.mo1339u(c0675i2);
            throw e10;
        }
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: f0 */
    public final String mo1355f0(Charset charset) {
        C0675i c0675i = this.f1922Z;
        c0675i.mo1339u(this.f1921Y);
        return c0675i.m1427Y0(c0675i.f1970Z, charset);
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: g */
    public final boolean mo1356g() {
        if (this.f1923o0) {
            throw new IllegalStateException("closed");
        }
        C0675i c0675i = this.f1922Z;
        return c0675i.mo1356g() && this.f1921Y.mo1325H(c0675i, 8192L) == -1;
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: h */
    public final C0665N mo1326h() {
        return this.f1921Y.mo1326h();
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: i0 */
    public final C0678l mo1357i0() {
        InterfaceC0663L interfaceC0663L = this.f1921Y;
        C0675i c0675i = this.f1922Z;
        c0675i.mo1339u(interfaceC0663L);
        return c0675i.m1417C0(c0675i.f1970Z);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f1923o0;
    }

    /* JADX INFO: renamed from: k */
    public final int m1358k() {
        mo1362s(4L);
        return this.f1922Z.m1420N0();
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: l */
    public final boolean mo1359l(long j10) {
        C0675i c0675i;
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "byteCount < 0: ").toString());
        }
        if (this.f1923o0) {
            throw new IllegalStateException("closed");
        }
        do {
            c0675i = this.f1922Z;
            if (c0675i.f1970Z >= j10) {
                return true;
            }
        } while (this.f1921Y.mo1325H(c0675i, 8192L) != -1);
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final int m1360m() {
        mo1362s(4L);
        return AbstractC0668b.m1408h(this.f1922Z.m1420N0());
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: p0 */
    public final boolean mo1361p0(long j10, C0678l bytes) {
        AbstractC16544l.m18094g(bytes, "bytes");
        int iMo1372d = bytes.mo1372d();
        if (this.f1923o0) {
            throw new IllegalStateException("closed");
        }
        if (j10 < 0 || iMo1372d < 0 || bytes.mo1372d() < iMo1372d) {
            return false;
        }
        for (int i10 = 0; i10 < iMo1372d; i10++) {
            long j11 = ((long) i10) + j10;
            if (!mo1359l(1 + j11) || this.f1922Z.m1422T(j11) != bytes.mo1376i(i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // p026Ao.InterfaceC0677k
    public final C0657F peek() {
        return AbstractC0668b.m1403c(new C0655D(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        AbstractC16544l.m18094g(sink, "sink");
        C0675i c0675i = this.f1922Z;
        if (c0675i.f1970Z == 0 && this.f1921Y.mo1325H(c0675i, 8192L) == -1) {
            return -1;
        }
        return c0675i.read(sink);
    }

    public final byte readByte() {
        mo1362s(1L);
        return this.f1922Z.readByte();
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: s */
    public final void mo1362s(long j10) {
        if (!mo1359l(j10)) {
            throw new EOFException();
        }
    }

    @Override // p026Ao.InterfaceC0677k
    public final void skip(long j10) {
        if (this.f1923o0) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            C0675i c0675i = this.f1922Z;
            if (c0675i.f1970Z == 0 && this.f1921Y.mo1325H(c0675i, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, c0675i.f1970Z);
            c0675i.skip(jMin);
            j10 -= jMin;
        }
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: t0 */
    public final String mo1363t0() {
        return m1350W(Long.MAX_VALUE);
    }

    public final String toString() {
        return "buffer(" + this.f1921Y + ')';
    }

    @Override // p026Ao.InterfaceC0677k
    /* JADX INFO: renamed from: Q */
    public final long mo1346Q(byte b, long j10, long j11) {
        if (this.f1923o0) {
            throw new IllegalStateException("closed");
        }
        if (0 > j10 || j10 > j11) {
            StringBuilder sbM9894m = AbstractC9306j0.m9894m(zakks.siqRrRZUkkaV, j10, TVCuK.eUQmdufpT);
            sbM9894m.append(j11);
            throw new IllegalArgumentException(sbM9894m.toString().toString());
        }
        while (j10 < j11) {
            C0675i c0675i = this.f1922Z;
            long jMo1346Q = c0675i.mo1346Q(b, j10, j11);
            if (jMo1346Q != -1) {
                return jMo1346Q;
            }
            long j12 = c0675i.f1970Z;
            if (j12 >= j11 || this.f1921Y.mo1325H(c0675i, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, j12);
        }
        return -1L;
    }
}
