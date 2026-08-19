package p232J3;

import android.media.MediaCodec;
import io.sentry.C15358g1;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p031B3.C0799c;
import p031B3.C0803g;
import p054C0.C1497j;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p158G3.C2988g;
import p305M3.C5281a;
import p305M3.C5285e;
import p372P3.C6315G;

/* JADX INFO: renamed from: J3.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C4217Q {

    /* JADX INFO: renamed from: a */
    public final C5285e f13756a;

    /* JADX INFO: renamed from: b */
    public final int f13757b;

    /* JADX INFO: renamed from: c */
    public final C20811m f13758c;

    /* JADX INFO: renamed from: d */
    public C1497j f13759d;

    /* JADX INFO: renamed from: e */
    public C1497j f13760e;

    /* JADX INFO: renamed from: f */
    public C1497j f13761f;

    /* JADX INFO: renamed from: g */
    public long f13762g;

    public C4217Q(C5285e c5285e) {
        this.f13756a = c5285e;
        int i10 = c5285e.f17404b;
        this.f13757b = i10;
        this.f13758c = new C20811m(32);
        C1497j c1497j = new C1497j(0L, i10);
        this.f13759d = c1497j;
        this.f13760e = c1497j;
        this.f13761f = c1497j;
    }

    /* JADX INFO: renamed from: c */
    public static C1497j m4963c(C1497j c1497j, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= c1497j.f3971Z) {
            c1497j = (C1497j) c1497j.f3973p0;
        }
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (c1497j.f3971Z - j10));
            C5281a c5281a = (C5281a) c1497j.f3972o0;
            byteBuffer.put(c5281a.f17394a, ((int) (j10 - c1497j.f3970Y)) + c5281a.f17395b, iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == c1497j.f3971Z) {
                c1497j = (C1497j) c1497j.f3973p0;
            }
        }
        return c1497j;
    }

    /* JADX INFO: renamed from: d */
    public static C1497j m4964d(C1497j c1497j, long j10, byte[] bArr, int i10) {
        while (j10 >= c1497j.f3971Z) {
            c1497j = (C1497j) c1497j.f3973p0;
        }
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (c1497j.f3971Z - j10));
            C5281a c5281a = (C5281a) c1497j.f3972o0;
            System.arraycopy(c5281a.f17394a, ((int) (j10 - c1497j.f3970Y)) + c5281a.f17395b, bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == c1497j.f3971Z) {
                c1497j = (C1497j) c1497j.f3973p0;
            }
        }
        return c1497j;
    }

    /* JADX INFO: renamed from: e */
    public static C1497j m4965e(C1497j c1497j, C0803g c0803g, C2988g c2988g, C20811m c20811m) {
        int iM21371z;
        if (c0803g.m1824d(1073741824)) {
            long j10 = c2988g.f8971b;
            c20811m.m21341C(1);
            C1497j c1497jM4964d = m4964d(c1497j, j10, c20811m.f66092a, 1);
            long j11 = j10 + 1;
            byte b = c20811m.f66092a[0];
            boolean z6 = (b & 128) != 0;
            int i10 = b & 127;
            C0799c c0799c = c0803g.f2225p0;
            byte[] bArr = c0799c.f2214a;
            if (bArr == null) {
                c0799c.f2214a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c1497j = m4964d(c1497jM4964d, j11, c0799c.f2214a, i10);
            long j12 = j11 + ((long) i10);
            if (z6) {
                c20811m.m21341C(2);
                c1497j = m4964d(c1497j, j12, c20811m.f66092a, 2);
                j12 += 2;
                iM21371z = c20811m.m21371z();
            } else {
                iM21371z = 1;
            }
            int[] iArr = c0799c.f2217d;
            if (iArr == null || iArr.length < iM21371z) {
                iArr = new int[iM21371z];
            }
            int[] iArr2 = c0799c.f2218e;
            if (iArr2 == null || iArr2.length < iM21371z) {
                iArr2 = new int[iM21371z];
            }
            if (z6) {
                int i11 = iM21371z * 6;
                c20811m.m21341C(i11);
                c1497j = m4964d(c1497j, j12, c20811m.f66092a, i11);
                j12 += (long) i11;
                c20811m.m21344F(0);
                for (int i12 = 0; i12 < iM21371z; i12++) {
                    iArr[i12] = c20811m.m21371z();
                    iArr2[i12] = c20811m.m21369x();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c2988g.f8970a - ((int) (j12 - c2988g.f8971b));
            }
            C6315G c6315g = (C6315G) c2988g.f8972c;
            int i13 = AbstractC20817s.f66106a;
            byte[] bArr2 = c6315g.f20454b;
            byte[] bArr3 = c0799c.f2214a;
            c0799c.f2219f = iM21371z;
            c0799c.f2217d = iArr;
            c0799c.f2218e = iArr2;
            c0799c.f2215b = bArr2;
            c0799c.f2214a = bArr3;
            int i14 = c6315g.f20453a;
            c0799c.f2216c = i14;
            int i15 = c6315g.f20455c;
            c0799c.f2220g = i15;
            int i16 = c6315g.f20456d;
            c0799c.f2221h = i16;
            MediaCodec.CryptoInfo cryptoInfo = c0799c.f2222i;
            cryptoInfo.numSubSamples = iM21371z;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (AbstractC20817s.f66106a >= 24) {
                C15358g1 c15358g1 = c0799c.f2223j;
                c15358g1.getClass();
                ((MediaCodec.CryptoInfo.Pattern) c15358g1.f47946Z).set(i15, i16);
                ((MediaCodec.CryptoInfo) c15358g1.f47945Y).setPattern((MediaCodec.CryptoInfo.Pattern) c15358g1.f47946Z);
            }
            long j13 = c2988g.f8971b;
            int i17 = (int) (j12 - j13);
            c2988g.f8971b = j13 + ((long) i17);
            c2988g.f8970a -= i17;
        }
        if (!c0803g.m1824d(268435456)) {
            c0803g.m1836q(c2988g.f8970a);
            return m4963c(c1497j, c2988g.f8971b, c0803g.f2226q0, c2988g.f8970a);
        }
        c20811m.m21341C(4);
        C1497j c1497jM4964d2 = m4964d(c1497j, c2988g.f8971b, c20811m.f66092a, 4);
        int iM21369x = c20811m.m21369x();
        c2988g.f8971b += 4;
        c2988g.f8970a -= 4;
        c0803g.m1836q(iM21369x);
        C1497j c1497jM4963c = m4963c(c1497jM4964d2, c2988g.f8971b, c0803g.f2226q0, iM21369x);
        c2988g.f8971b += (long) iM21369x;
        int i18 = c2988g.f8970a - iM21369x;
        c2988g.f8970a = i18;
        ByteBuffer byteBuffer = c0803g.f2229t0;
        if (byteBuffer == null || byteBuffer.capacity() < i18) {
            c0803g.f2229t0 = ByteBuffer.allocate(i18);
        } else {
            c0803g.f2229t0.clear();
        }
        return m4963c(c1497jM4963c, c2988g.f8971b, c0803g.f2229t0, c2988g.f8970a);
    }

    /* JADX INFO: renamed from: a */
    public final void m4966a(long j10) {
        C1497j c1497j;
        if (j10 == -1) {
            return;
        }
        while (true) {
            c1497j = this.f13759d;
            if (j10 < c1497j.f3971Z) {
                break;
            }
            C5285e c5285e = this.f13756a;
            C5281a c5281a = (C5281a) c1497j.f3972o0;
            synchronized (c5285e) {
                C5281a[] c5281aArr = c5285e.f17408f;
                int i10 = c5285e.f17407e;
                c5285e.f17407e = i10 + 1;
                c5281aArr[i10] = c5281a;
                c5285e.f17406d--;
                c5285e.notifyAll();
            }
            C1497j c1497j2 = this.f13759d;
            c1497j2.f3972o0 = null;
            C1497j c1497j3 = (C1497j) c1497j2.f3973p0;
            c1497j2.f3973p0 = null;
            this.f13759d = c1497j3;
        }
        if (this.f13760e.f3970Y < c1497j.f3970Y) {
            this.f13760e = c1497j;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m4967b(int i10) {
        C5281a c5281a;
        C1497j c1497j = this.f13761f;
        if (((C5281a) c1497j.f3972o0) == null) {
            C5285e c5285e = this.f13756a;
            synchronized (c5285e) {
                try {
                    int i11 = c5285e.f17406d + 1;
                    c5285e.f17406d = i11;
                    int i12 = c5285e.f17407e;
                    if (i12 > 0) {
                        C5281a[] c5281aArr = c5285e.f17408f;
                        int i13 = i12 - 1;
                        c5285e.f17407e = i13;
                        c5281a = c5281aArr[i13];
                        c5281a.getClass();
                        c5285e.f17408f[c5285e.f17407e] = null;
                    } else {
                        C5281a c5281a2 = new C5281a(0, new byte[c5285e.f17404b]);
                        C5281a[] c5281aArr2 = c5285e.f17408f;
                        if (i11 > c5281aArr2.length) {
                            c5285e.f17408f = (C5281a[]) Arrays.copyOf(c5281aArr2, c5281aArr2.length * 2);
                        }
                        c5281a = c5281a2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C1497j c1497j2 = new C1497j(this.f13761f.f3971Z, this.f13757b);
            c1497j.f3972o0 = c5281a;
            c1497j.f3973p0 = c1497j2;
        }
        return Math.min(i10, (int) (this.f13761f.f3971Z - this.f13762g));
    }
}
