package to;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import p001A.AbstractC0010F;
import p026Ao.C0656E;
import p026Ao.C0675i;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: to.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C20031v implements Closeable {

    /* JADX INFO: renamed from: r0 */
    public static final Logger f63442r0 = Logger.getLogger(AbstractC20014e.class.getName());

    /* JADX INFO: renamed from: Y */
    public final C0656E f63443Y;

    /* JADX INFO: renamed from: Z */
    public final C0675i f63444Z;

    /* JADX INFO: renamed from: o0 */
    public int f63445o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f63446p0;

    /* JADX INFO: renamed from: q0 */
    public final C20012c f63447q0;

    public C20031v(C0656E sink) {
        AbstractC16544l.m18094g(sink, "sink");
        this.f63443Y = sink;
        C0675i c0675i = new C0675i();
        this.f63444Z = c0675i;
        this.f63445o0 = 16384;
        this.f63447q0 = new C20012c(c0675i);
    }

    /* JADX INFO: renamed from: E */
    public final synchronized void m20846E(boolean z6, int i10, ArrayList arrayList) {
        if (this.f63446p0) {
            throw new IOException("closed");
        }
        this.f63447q0.m20810d(arrayList);
        long j10 = this.f63444Z.f1970Z;
        long jMin = Math.min(this.f63445o0, j10);
        int i11 = j10 == jMin ? 4 : 0;
        if (z6) {
            i11 |= 1;
        }
        m20853k(i10, (int) jMin, 1, i11);
        this.f63443Y.mo1338n0(this.f63444Z, jMin);
        if (j10 > jMin) {
            long j11 = j10 - jMin;
            while (j11 > 0) {
                long jMin2 = Math.min(this.f63445o0, j11);
                j11 -= jMin2;
                m20853k(i10, (int) jMin2, 9, j11 == 0 ? 4 : 0);
                this.f63443Y.mo1338n0(this.f63444Z, jMin2);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final synchronized void m20847P(int i10, int i11, boolean z6) {
        if (this.f63446p0) {
            throw new IOException("closed");
        }
        m20853k(0, 8, 6, z6 ? 1 : 0);
        this.f63443Y.m1334e(i10);
        this.f63443Y.m1334e(i11);
        this.f63443Y.flush();
    }

    /* JADX INFO: renamed from: S */
    public final synchronized void m20848S(int i10, int i11) {
        AbstractC14376f.m15825D(i11, "errorCode");
        if (this.f63446p0) {
            throw new IOException("closed");
        }
        if (AbstractC0010F.m24h(i11) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        m20853k(i10, 4, 3, 0);
        this.f63443Y.m1334e(AbstractC0010F.m24h(i11));
        this.f63443Y.flush();
    }

    /* JADX INFO: renamed from: T */
    public final synchronized void m20849T(C20034y settings) {
        int i10;
        try {
            AbstractC16544l.m18094g(settings, "settings");
            if (this.f63446p0) {
                throw new IOException("closed");
            }
            m20853k(0, Integer.bitCount(settings.f63452a) * 6, 4, 0);
            int i11 = 0;
            while (i11 < 10) {
                boolean z6 = true;
                if (((1 << i11) & settings.f63452a) == 0) {
                    z6 = false;
                }
                if (z6) {
                    if (i11 != 4) {
                        i10 = i11 != 7 ? i11 : 4;
                    } else {
                        i10 = 3;
                    }
                    C0656E c0656e = this.f63443Y;
                    if (c0656e.f1920o0) {
                        throw new IllegalStateException("closed");
                    }
                    c0656e.f1919Z.m1441j1(i10);
                    c0656e.m1330a();
                    this.f63443Y.m1334e(settings.f63453b[i11]);
                }
                i11++;
            }
            this.f63443Y.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: W */
    public final synchronized void m20850W(int i10, long j10) {
        if (this.f63446p0) {
            throw new IOException("closed");
        }
        if (j10 == 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
        }
        m20853k(i10, 4, 8, 0);
        this.f63443Y.m1334e((int) j10);
        this.f63443Y.flush();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m20851a(C20034y peerSettings) {
        try {
            AbstractC16544l.m18094g(peerSettings, "peerSettings");
            if (this.f63446p0) {
                throw new IOException("closed");
            }
            int i10 = this.f63445o0;
            int i11 = peerSettings.f63452a;
            if ((i11 & 32) != 0) {
                i10 = peerSettings.f63453b[5];
            }
            this.f63445o0 = i10;
            if (((i11 & 2) != 0 ? peerSettings.f63453b[1] : -1) != -1) {
                C20012c c20012c = this.f63447q0;
                int i12 = (i11 & 2) != 0 ? peerSettings.f63453b[1] : -1;
                c20012c.getClass();
                int iMin = Math.min(i12, 16384);
                int i13 = c20012c.f63343e;
                if (i13 != iMin) {
                    if (iMin < i13) {
                        c20012c.f63341c = Math.min(c20012c.f63341c, iMin);
                    }
                    c20012c.f63342d = true;
                    c20012c.f63343e = iMin;
                    int i14 = c20012c.f63347i;
                    if (iMin < i14) {
                        if (iMin == 0) {
                            C20011b[] c20011bArr = c20012c.f63344f;
                            AbstractC17678l.m19311r(c20011bArr, null, 0, c20011bArr.length);
                            c20012c.f63345g = c20012c.f63344f.length - 1;
                            c20012c.f63346h = 0;
                            c20012c.f63347i = 0;
                        } else {
                            c20012c.m20807a(i14 - iMin);
                        }
                    }
                }
            }
            m20853k(0, 0, 4, 1);
            this.f63443Y.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f63446p0 = true;
        this.f63443Y.close();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m20852e(boolean z6, int i10, C0675i c0675i, int i11) {
        if (this.f63446p0) {
            throw new IOException("closed");
        }
        m20853k(i10, i11, 0, z6 ? 1 : 0);
        if (i11 > 0) {
            AbstractC16544l.m18091d(c0675i);
            this.f63443Y.mo1338n0(c0675i, i11);
        }
    }

    public final synchronized void flush() {
        if (this.f63446p0) {
            throw new IOException("closed");
        }
        this.f63443Y.flush();
    }

    /* JADX INFO: renamed from: k */
    public final void m20853k(int i10, int i11, int i12, int i13) {
        Level level = Level.FINE;
        Logger logger = f63442r0;
        if (logger.isLoggable(level)) {
            logger.fine(AbstractC20014e.m20813a(false, i10, i11, i12, i13));
        }
        if (i11 > this.f63445o0) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f63445o0 + ": " + i11).toString());
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "reserved bit set: ").toString());
        }
        byte[] bArr = AbstractC17708b.f56536a;
        C0656E c0656e = this.f63443Y;
        AbstractC16544l.m18094g(c0656e, "<this>");
        c0656e.mo1328M((i11 >>> 16) & 255);
        c0656e.mo1328M((i11 >>> 8) & 255);
        c0656e.mo1328M(i11 & 255);
        c0656e.mo1328M(i12 & 255);
        c0656e.mo1328M(i13 & 255);
        c0656e.m1334e(i10 & Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m20854m(byte[] bArr, int i10, int i11) {
        AbstractC14376f.m15825D(i11, "errorCode");
        if (this.f63446p0) {
            throw new IOException("closed");
        }
        if (AbstractC0010F.m24h(i11) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        m20853k(0, bArr.length + 8, 7, 0);
        this.f63443Y.m1334e(i10);
        this.f63443Y.m1334e(AbstractC0010F.m24h(i11));
        if (bArr.length != 0) {
            this.f63443Y.mo1327A0(bArr);
        }
        this.f63443Y.flush();
    }
}
