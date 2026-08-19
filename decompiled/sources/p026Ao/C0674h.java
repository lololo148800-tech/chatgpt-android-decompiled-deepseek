package p026Ao;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.Closeable;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Ao.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C0674h implements Closeable {

    /* JADX INFO: renamed from: Y */
    public C0675i f1962Y;

    /* JADX INFO: renamed from: Z */
    public boolean f1963Z;

    /* JADX INFO: renamed from: o0 */
    public C0658G f1964o0;

    /* JADX INFO: renamed from: q0 */
    public byte[] f1966q0;

    /* JADX INFO: renamed from: p0 */
    public long f1965p0 = -1;

    /* JADX INFO: renamed from: r0 */
    public int f1967r0 = -1;

    /* JADX INFO: renamed from: s0 */
    public int f1968s0 = -1;

    /* JADX INFO: renamed from: a */
    public final void m1415a(long j10) {
        C0675i c0675i = this.f1962Y;
        if (c0675i == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!this.f1963Z) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long j11 = c0675i.f1970Z;
        if (j10 <= j11) {
            if (j10 < 0) {
                throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "newSize < 0: ").toString());
            }
            long j12 = j11 - j10;
            while (j12 > 0) {
                C0658G c0658g = c0675i.f1969Y;
                AbstractC16544l.m18091d(c0658g);
                C0658G c0658g2 = c0658g.f1930g;
                AbstractC16544l.m18091d(c0658g2);
                int i10 = c0658g2.f1926c;
                long j13 = i10 - c0658g2.f1925b;
                if (j13 > j12) {
                    c0658g2.f1926c = i10 - ((int) j12);
                    break;
                } else {
                    c0675i.f1969Y = c0658g2.m1364a();
                    AbstractC0659H.m1368a(c0658g2);
                    j12 -= j13;
                }
            }
            this.f1964o0 = null;
            this.f1965p0 = j10;
            this.f1966q0 = null;
            this.f1967r0 = -1;
            this.f1968s0 = -1;
        } else if (j10 > j11) {
            long j14 = j10 - j11;
            int i11 = 1;
            boolean z6 = true;
            for (long j15 = 0; j14 > j15; j15 = 0) {
                C0658G c0658gM1431b1 = c0675i.m1431b1(i11);
                int iMin = (int) Math.min(j14, 8192 - c0658gM1431b1.f1926c);
                int i12 = c0658gM1431b1.f1926c + iMin;
                c0658gM1431b1.f1926c = i12;
                j14 -= (long) iMin;
                if (z6) {
                    this.f1964o0 = c0658gM1431b1;
                    this.f1965p0 = j11;
                    this.f1966q0 = c0658gM1431b1.f1924a;
                    this.f1967r0 = i12 - iMin;
                    this.f1968s0 = i12;
                    z6 = false;
                }
                i11 = 1;
            }
        }
        c0675i.f1970Z = j10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1962Y == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f1962Y = null;
        this.f1964o0 = null;
        this.f1965p0 = -1L;
        this.f1966q0 = null;
        this.f1967r0 = -1;
        this.f1968s0 = -1;
    }

    /* JADX INFO: renamed from: e */
    public final int m1416e(long j10) {
        C0675i c0675i = this.f1962Y;
        if (c0675i == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j10 >= -1) {
            long j11 = c0675i.f1970Z;
            if (j10 <= j11) {
                if (j10 == -1 || j10 == j11) {
                    this.f1964o0 = null;
                    this.f1965p0 = j10;
                    this.f1966q0 = null;
                    this.f1967r0 = -1;
                    this.f1968s0 = -1;
                    return -1;
                }
                C0658G c0658g = c0675i.f1969Y;
                C0658G c0658g2 = this.f1964o0;
                long j12 = 0;
                if (c0658g2 != null) {
                    long j13 = this.f1965p0 - ((long) (this.f1967r0 - c0658g2.f1925b));
                    if (j13 > j10) {
                        j11 = j13;
                        c0658g2 = c0658g;
                        c0658g = c0658g2;
                    } else {
                        j12 = j13;
                    }
                } else {
                    c0658g2 = c0658g;
                }
                if (j11 - j10 > j10 - j12) {
                    while (true) {
                        AbstractC16544l.m18091d(c0658g2);
                        long j14 = ((long) (c0658g2.f1926c - c0658g2.f1925b)) + j12;
                        if (j10 < j14) {
                            break;
                        }
                        c0658g2 = c0658g2.f1929f;
                        j12 = j14;
                    }
                } else {
                    while (j11 > j10) {
                        AbstractC16544l.m18091d(c0658g);
                        c0658g = c0658g.f1930g;
                        AbstractC16544l.m18091d(c0658g);
                        j11 -= (long) (c0658g.f1926c - c0658g.f1925b);
                    }
                    c0658g2 = c0658g;
                    j12 = j11;
                }
                if (this.f1963Z) {
                    AbstractC16544l.m18091d(c0658g2);
                    if (c0658g2.f1927d) {
                        byte[] bArr = c0658g2.f1924a;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        AbstractC16544l.m18093f(bArrCopyOf, "copyOf(...)");
                        C0658G c0658g3 = new C0658G(bArrCopyOf, c0658g2.f1925b, c0658g2.f1926c, false, true);
                        if (c0675i.f1969Y == c0658g2) {
                            c0675i.f1969Y = c0658g3;
                        }
                        c0658g2.m1365b(c0658g3);
                        C0658G c0658g4 = c0658g3.f1930g;
                        AbstractC16544l.m18091d(c0658g4);
                        c0658g4.m1364a();
                        c0658g2 = c0658g3;
                    }
                }
                this.f1964o0 = c0658g2;
                this.f1965p0 = j10;
                AbstractC16544l.m18091d(c0658g2);
                this.f1966q0 = c0658g2.f1924a;
                int i10 = c0658g2.f1925b + ((int) (j10 - j12));
                this.f1967r0 = i10;
                int i11 = c0658g2.f1926c;
                this.f1968s0 = i11;
                return i11 - i10;
            }
        }
        StringBuilder sbM9894m = AbstractC9306j0.m9894m("offset=", j10, " > size=");
        sbM9894m.append(c0675i.f1970Z);
        throw new ArrayIndexOutOfBoundsException(sbM9894m.toString());
    }
}
