package p488Tn;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: Tn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C7520c implements InterfaceC7521d {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC7526i f23843Y;

    /* JADX INFO: renamed from: Z */
    public final C7518a f23844Z;

    /* JADX INFO: renamed from: o0 */
    public C7524g f23845o0;

    /* JADX INFO: renamed from: p0 */
    public int f23846p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f23847q0;

    /* JADX INFO: renamed from: r0 */
    public long f23848r0;

    public C7520c(InterfaceC7526i interfaceC7526i) {
        this.f23843Y = interfaceC7526i;
        C7518a c7518aMo7819b = interfaceC7526i.mo7819b();
        this.f23844Z = c7518aMo7819b;
        C7524g c7524g = c7518aMo7819b.f23839Y;
        this.f23845o0 = c7524g;
        this.f23846p0 = c7524g != null ? c7524g.f23855b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r7 == r9.f23855b) goto L15;
     */
    @Override // p488Tn.InterfaceC7521d
    /* JADX INFO: renamed from: U0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo7817U0(C7518a sink, long j10) {
        C7524g c7524g;
        AbstractC16544l.m18094g(sink, "sink");
        if (this.f23847q0) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC0168G.m533v("byteCount (", j10, ") < 0").toString());
        }
        C7524g c7524g2 = this.f23845o0;
        C7518a c7518a = this.f23844Z;
        if (c7524g2 != null) {
            C7524g c7524g3 = c7518a.f23839Y;
            if (c7524g2 == c7524g3) {
                int i10 = this.f23846p0;
                AbstractC16544l.m18091d(c7524g3);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j10 == 0) {
            return 0L;
        }
        if (!this.f23843Y.mo7823l(this.f23848r0 + 1)) {
            return -1L;
        }
        if (this.f23845o0 == null && (c7524g = c7518a.f23839Y) != null) {
            this.f23845o0 = c7524g;
            this.f23846p0 = c7524g.f23855b;
        }
        long jMin = Math.min(j10, c7518a.f23841o0 - this.f23848r0);
        long j11 = this.f23848r0;
        long j12 = j11 + jMin;
        AbstractC7527j.m7835a(c7518a.f23841o0, j11, j12);
        if (j11 != j12) {
            long j13 = j12 - j11;
            sink.f23841o0 += j13;
            C7524g c7524g4 = c7518a.f23839Y;
            while (true) {
                AbstractC16544l.m18091d(c7524g4);
                long j14 = c7524g4.f23856c - c7524g4.f23855b;
                if (j11 < j14) {
                    break;
                }
                j11 -= j14;
                c7524g4 = c7524g4.f23859f;
            }
            long j15 = j13;
            while (j15 > 0) {
                AbstractC16544l.m18091d(c7524g4);
                C7524g c7524gM7831e = c7524g4.m7831e();
                int i11 = c7524gM7831e.f23855b + ((int) j11);
                c7524gM7831e.f23855b = i11;
                c7524gM7831e.f23856c = Math.min(i11 + ((int) j15), c7524gM7831e.f23856c);
                if (sink.f23839Y == null) {
                    sink.f23839Y = c7524gM7831e;
                    sink.f23840Z = c7524gM7831e;
                } else {
                    C7524g c7524g5 = sink.f23840Z;
                    AbstractC16544l.m18091d(c7524g5);
                    c7524g5.m7830d(c7524gM7831e);
                    sink.f23840Z = c7524gM7831e;
                }
                j15 -= (long) (c7524gM7831e.f23856c - c7524gM7831e.f23855b);
                c7524g4 = c7524g4.f23859f;
                j11 = 0;
            }
        }
        this.f23848r0 += jMin;
        return jMin;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f23847q0 = true;
    }
}
