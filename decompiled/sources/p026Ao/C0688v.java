package p026Ao;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Ao.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C0688v implements InterfaceC0663L {

    /* JADX INFO: renamed from: Y */
    public byte f2002Y;

    /* JADX INFO: renamed from: Z */
    public final C0657F f2003Z;

    /* JADX INFO: renamed from: o0 */
    public final Inflater f2004o0;

    /* JADX INFO: renamed from: p0 */
    public final C0689w f2005p0;

    /* JADX INFO: renamed from: q0 */
    public final CRC32 f2006q0;

    public C0688v(InterfaceC0663L source) {
        AbstractC16544l.m18094g(source, "source");
        C0657F c0657f = new C0657F(source);
        this.f2003Z = c0657f;
        Inflater inflater = new Inflater(true);
        this.f2004o0 = inflater;
        this.f2005p0 = new C0689w(c0657f, inflater);
        this.f2006q0 = new CRC32();
    }

    /* JADX INFO: renamed from: a */
    public static void m1467a(int i10, int i11, String str) throws IOException {
        if (i11 == i10) {
            return;
        }
        StringBuilder sbM9895n = AbstractC9306j0.m9895n(str, ": actual 0x");
        sbM9895n.append(AbstractC21322p.m21686T(8, AbstractC0668b.m1412l(i11)));
        sbM9895n.append(" != expected 0x");
        sbM9895n.append(AbstractC21322p.m21686T(8, AbstractC0668b.m1412l(i10)));
        throw new IOException(sbM9895n.toString());
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: H */
    public final long mo1325H(C0675i sink, long j10) throws IOException {
        C0675i c0675i;
        long j11;
        AbstractC16544l.m18094g(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "byteCount < 0: ").toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        byte b = this.f2002Y;
        CRC32 crc32 = this.f2006q0;
        C0657F c0657f = this.f2003Z;
        if (b == 0) {
            c0657f.mo1362s(10L);
            C0675i c0675i2 = c0657f.f1922Z;
            byte bM1422T = c0675i2.m1422T(3L);
            boolean z6 = ((bM1422T >> 1) & 1) == 1;
            if (z6) {
                m1468e(c0675i2, 0L, 10L);
            }
            m1467a(8075, c0657f.m1345P(), "ID1ID2");
            c0657f.skip(8L);
            if (((bM1422T >> 2) & 1) == 1) {
                c0657f.mo1362s(2L);
                if (z6) {
                    m1468e(c0675i2, 0L, 2L);
                }
                long jM1426X0 = c0675i2.m1426X0() & 65535;
                c0657f.mo1362s(jM1426X0);
                if (z6) {
                    m1468e(c0675i2, 0L, jM1426X0);
                    j11 = jM1426X0;
                } else {
                    j11 = jM1426X0;
                }
                c0657f.skip(j11);
            }
            if (((bM1422T >> 3) & 1) == 1) {
                c0675i = c0675i2;
                long jMo1346Q = c0657f.mo1346Q((byte) 0, 0L, Long.MAX_VALUE);
                if (jMo1346Q == -1) {
                    throw new EOFException();
                }
                if (z6) {
                    m1468e(c0675i, 0L, jMo1346Q + 1);
                }
                r4.skip(jMo1346Q + 1);
            } else {
                c0675i = c0675i2;
            }
            if (((bM1422T >> 4) & 1) == 1) {
                long jMo1346Q2 = c0657f.mo1346Q((byte) 0, 0L, Long.MAX_VALUE);
                if (jMo1346Q2 == -1) {
                    throw new EOFException();
                }
                if (z6) {
                    m1468e(c0675i, 0L, jMo1346Q2 + 1);
                }
                c0657f.skip(jMo1346Q2 + 1);
            }
            if (z6) {
                m1467a(c0657f.m1347S(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f2002Y = (byte) 1;
        } else {
            c0657f = c0657f;
        }
        if (this.f2002Y == 1) {
            long j12 = sink.f1970Z;
            long jMo1325H = this.f2005p0.mo1325H(sink, j10);
            if (jMo1325H != -1) {
                m1468e(sink, j12, jMo1325H);
                return jMo1325H;
            }
            this.f2002Y = (byte) 2;
        }
        if (this.f2002Y != 2) {
            return -1L;
        }
        m1467a(c0657f.m1360m(), (int) crc32.getValue(), "CRC");
        m1467a(c0657f.m1360m(), (int) this.f2004o0.getBytesWritten(), "ISIZE");
        this.f2002Y = (byte) 3;
        if (c0657f.mo1356g()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f2005p0.close();
    }

    /* JADX INFO: renamed from: e */
    public final void m1468e(C0675i c0675i, long j10, long j11) {
        C0658G c0658g = c0675i.f1969Y;
        AbstractC16544l.m18091d(c0658g);
        while (true) {
            int i10 = c0658g.f1926c;
            int i11 = c0658g.f1925b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            c0658g = c0658g.f1929f;
            AbstractC16544l.m18091d(c0658g);
        }
        while (j11 > 0) {
            int i12 = (int) (((long) c0658g.f1925b) + j10);
            int iMin = (int) Math.min(c0658g.f1926c - i12, j11);
            this.f2006q0.update(c0658g.f1924a, i12, iMin);
            j11 -= (long) iMin;
            c0658g = c0658g.f1929f;
            AbstractC16544l.m18091d(c0658g);
            j10 = 0;
        }
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: h */
    public final C0665N mo1326h() {
        return this.f2003Z.f1921Y.mo1326h();
    }
}
