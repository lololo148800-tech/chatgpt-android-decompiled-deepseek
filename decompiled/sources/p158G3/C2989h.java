package p158G3;

import android.graphics.Bitmap;
import android.os.Trace;
import io.sentry.internal.debugmeta.C15384c;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import p003A1.AbstractC0168G;
import p031B3.C0803g;
import p057C3.AbstractC1554d;
import p057C3.C1567l;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p117Eb.C2385o;
import p167Gb.C3032c;

/* JADX INFO: renamed from: G3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2989h extends AbstractC1554d {

    /* JADX INFO: renamed from: D0 */
    public final C3032c f8973D0;

    /* JADX INFO: renamed from: E0 */
    public final C0803g f8974E0;

    /* JADX INFO: renamed from: F0 */
    public final ArrayDeque f8975F0;

    /* JADX INFO: renamed from: G0 */
    public boolean f8976G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f8977H0;

    /* JADX INFO: renamed from: I0 */
    public C2987f f8978I0;

    /* JADX INFO: renamed from: J0 */
    public long f8979J0;

    /* JADX INFO: renamed from: K0 */
    public long f8980K0;

    /* JADX INFO: renamed from: L0 */
    public int f8981L0;

    /* JADX INFO: renamed from: M0 */
    public int f8982M0;

    /* JADX INFO: renamed from: N0 */
    public C19788o f8983N0;

    /* JADX INFO: renamed from: O0 */
    public C2983b f8984O0;

    /* JADX INFO: renamed from: P0 */
    public C0803g f8985P0;

    /* JADX INFO: renamed from: Q0 */
    public C2986e f8986Q0;

    /* JADX INFO: renamed from: R0 */
    public Bitmap f8987R0;

    /* JADX INFO: renamed from: S0 */
    public boolean f8988S0;

    /* JADX INFO: renamed from: T0 */
    public C2988g f8989T0;

    /* JADX INFO: renamed from: U0 */
    public C2988g f8990U0;

    /* JADX INFO: renamed from: V0 */
    public int f8991V0;

    public C2989h(C3032c c3032c) {
        super(4);
        this.f8973D0 = c3032c;
        this.f8986Q0 = C2986e.f8966a;
        this.f8974E0 = new C0803g(0);
        this.f8978I0 = C2987f.f8967c;
        this.f8975F0 = new ArrayDeque();
        this.f8980K0 = -9223372036854775807L;
        this.f8979J0 = -9223372036854775807L;
        this.f8981L0 = 0;
        this.f8982M0 = 1;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0143  */
    /* JADX INFO: renamed from: B */
    public final boolean m3823B(long j10) throws C1567l {
        boolean z6;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap = this.f8987R0;
        if (bitmap != null && this.f8989T0 == null) {
            return false;
        }
        if (this.f8982M0 == 0 && this.f4302t0 != 2) {
            return false;
        }
        ArrayDeque arrayDeque = this.f8975F0;
        if (bitmap == null) {
            AbstractC20800b.m21321i(this.f8984O0);
            C2982a c2982a = (C2982a) this.f8984O0.mo1832d();
            if (c2982a == null) {
                return false;
            }
            if (c2982a.m1824d(4)) {
                if (this.f8981L0 == 3) {
                    m3826E();
                    AbstractC20800b.m21321i(this.f8983N0);
                    m3825D();
                } else {
                    c2982a.mo1839o();
                    if (arrayDeque.isEmpty()) {
                        this.f8977H0 = true;
                    }
                }
                return false;
            }
            AbstractC20800b.m21322j(c2982a.f8948q0, "Non-EOS buffer came back from the decoder without bitmap.");
            this.f8987R0 = c2982a.f8948q0;
            c2982a.mo1839o();
        }
        if (!this.f8988S0 || this.f8987R0 == null || this.f8989T0 == null) {
            return false;
        }
        AbstractC20800b.m21321i(this.f8983N0);
        C19788o c19788o = this.f8983N0;
        int i10 = c19788o.f62736H;
        int i11 = c19788o.f62737I;
        boolean z10 = ((i10 == 1 && i11 == 1) || i10 == -1 || i11 == -1) ? false : true;
        C2988g c2988g = this.f8989T0;
        if (((Bitmap) c2988g.f8972c) == null) {
            if (z10) {
                AbstractC20800b.m21321i(this.f8987R0);
                int width = this.f8987R0.getWidth();
                C19788o c19788o2 = this.f8983N0;
                AbstractC20800b.m21321i(c19788o2);
                int i12 = width / c19788o2.f62736H;
                int height = this.f8987R0.getHeight();
                C19788o c19788o3 = this.f8983N0;
                AbstractC20800b.m21321i(c19788o3);
                int i13 = height / c19788o3.f62737I;
                int i14 = this.f8983N0.f62736H;
                int i15 = c2988g.f8970a;
                bitmapCreateBitmap = Bitmap.createBitmap(this.f8987R0, (i15 % i14) * i12, (i15 / i14) * i13, i12, i13);
            } else {
                bitmapCreateBitmap = this.f8987R0;
                AbstractC20800b.m21321i(bitmapCreateBitmap);
            }
            c2988g.f8972c = bitmapCreateBitmap;
        }
        AbstractC20800b.m21321i((Bitmap) this.f8989T0.f8972c);
        long j11 = this.f8989T0.f8971b - j10;
        boolean z11 = this.f4302t0 == 2;
        int i16 = this.f8982M0;
        if (i16 != 0) {
            if (i16 == 1) {
                z11 = true;
            } else {
                if (i16 != 3) {
                    throw new IllegalStateException();
                }
                z11 = false;
            }
        }
        if (z11 || j11 < 30000) {
            C2986e c2986e = this.f8986Q0;
            long j12 = this.f8978I0.f8969b;
            c2986e.getClass();
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        C2988g c2988g2 = this.f8989T0;
        AbstractC20800b.m21321i(c2988g2);
        long j13 = c2988g2.f8971b;
        this.f8979J0 = j13;
        while (!arrayDeque.isEmpty() && j13 >= ((C2987f) arrayDeque.peek()).f8968a) {
            this.f8978I0 = (C2987f) arrayDeque.removeFirst();
        }
        this.f8982M0 = 3;
        if (z10) {
            C2988g c2988g3 = this.f8989T0;
            AbstractC20800b.m21321i(c2988g3);
            C19788o c19788o4 = this.f8983N0;
            AbstractC20800b.m21321i(c19788o4);
            C19788o c19788o5 = this.f8983N0;
            AbstractC20800b.m21321i(c19788o5);
            if (c2988g3.f8970a == (c19788o4.f62737I * c19788o5.f62736H) - 1) {
                this.f8987R0 = null;
            }
        } else {
            this.f8987R0 = null;
        }
        this.f8989T0 = this.f8990U0;
        this.f8990U0 = null;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:79:0x0107  */
    /* JADX INFO: renamed from: C */
    public final boolean m3824C(long j10) {
        boolean z6;
        C19788o c19788o;
        int i10;
        if (this.f8988S0 && this.f8989T0 != null) {
            return false;
        }
        C15384c c15384c = this.f4297o0;
        c15384c.m16638m();
        C2983b c2983b = this.f8984O0;
        if (c2983b == null || this.f8981L0 == 3 || this.f8976G0) {
            return false;
        }
        if (this.f8985P0 == null) {
            C0803g c0803g = (C0803g) c2983b.mo1833e();
            this.f8985P0 = c0803g;
            if (c0803g == null) {
                return false;
            }
        }
        if (this.f8981L0 == 2) {
            AbstractC20800b.m21321i(this.f8985P0);
            this.f8985P0.f2213Z = 4;
            C2983b c2983b2 = this.f8984O0;
            AbstractC20800b.m21321i(c2983b2);
            c2983b2.mo1830a(this.f8985P0);
            this.f8985P0 = null;
            this.f8981L0 = 3;
            return false;
        }
        int iM2404u = m2404u(c15384c, this.f8985P0, 0);
        if (iM2404u == -5) {
            C19788o c19788o2 = (C19788o) c15384c.f47968o0;
            AbstractC20800b.m21321i(c19788o2);
            this.f8983N0 = c19788o2;
            this.f8981L0 = 2;
            return true;
        }
        if (iM2404u != -4) {
            if (iM2404u == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.f8985P0.m1837r();
        ByteBuffer byteBuffer = this.f8985P0.f2226q0;
        AbstractC20800b.m21321i(byteBuffer);
        if (byteBuffer.remaining() <= 0) {
            C0803g c0803g2 = this.f8985P0;
            AbstractC20800b.m21321i(c0803g2);
            if (c0803g2.m1824d(4)) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = true;
        }
        if (z6) {
            C2983b c2983b3 = this.f8984O0;
            AbstractC20800b.m21321i(c2983b3);
            C0803g c0803g3 = this.f8985P0;
            AbstractC20800b.m21321i(c0803g3);
            c2983b3.mo1830a(c0803g3);
            this.f8991V0 = 0;
        }
        C0803g c0803g4 = this.f8985P0;
        AbstractC20800b.m21321i(c0803g4);
        if (c0803g4.m1824d(4)) {
            this.f8988S0 = true;
        } else {
            int i11 = this.f8991V0;
            long j11 = c0803g4.f2228s0;
            C2988g c2988g = new C2988g();
            c2988g.f8970a = i11;
            c2988g.f8971b = j11;
            this.f8990U0 = c2988g;
            this.f8991V0 = i11 + 1;
            if (this.f8988S0) {
                this.f8989T0 = this.f8990U0;
                this.f8990U0 = null;
            } else {
                boolean z10 = j11 - 30000 <= j10 && j10 <= 30000 + j11;
                C2988g c2988g2 = this.f8989T0;
                boolean z11 = c2988g2 != null && c2988g2.f8971b <= j10 && j10 < j11;
                C19788o c19788o3 = this.f8983N0;
                AbstractC20800b.m21321i(c19788o3);
                this.f8988S0 = z10 || z11 || (c19788o3.f62736H == -1 || (i10 = (c19788o = this.f8983N0).f62737I) == -1 || i11 == (i10 * c19788o.f62736H) - 1);
                if (!z11 || z10) {
                    this.f8989T0 = this.f8990U0;
                    this.f8990U0 = null;
                }
            }
        }
        C0803g c0803g5 = this.f8985P0;
        AbstractC20800b.m21321i(c0803g5);
        if (c0803g5.m1824d(4)) {
            this.f8976G0 = true;
            this.f8985P0 = null;
            return false;
        }
        long j12 = this.f8980K0;
        C0803g c0803g6 = this.f8985P0;
        AbstractC20800b.m21321i(c0803g6);
        this.f8980K0 = Math.max(j12, c0803g6.f2228s0);
        if (z6) {
            this.f8985P0 = null;
        } else {
            C0803g c0803g7 = this.f8985P0;
            AbstractC20800b.m21321i(c0803g7);
            c0803g7.mo1834n();
        }
        return !this.f8988S0;
    }

    /* JADX INFO: renamed from: D */
    public final void m3825D() throws C1567l {
        C19788o c19788o = this.f8983N0;
        C3032c c3032c = this.f8973D0;
        int iM3922n = c3032c.m3922n(c19788o);
        if (iM3922n != AbstractC0168G.m522k(4, 0, 0, 0) && iM3922n != AbstractC0168G.m522k(3, 0, 0, 0)) {
            throw m2389b(new C2985d("Provided decoder factory can't create decoder for format."), this.f8983N0, false, 4005);
        }
        C2983b c2983b = this.f8984O0;
        if (c2983b != null) {
            c2983b.release();
        }
        this.f8984O0 = new C2983b((C2385o) c3032c.f9127Z);
    }

    /* JADX INFO: renamed from: E */
    public final void m3826E() {
        this.f8985P0 = null;
        this.f8981L0 = 0;
        this.f8980K0 = -9223372036854775807L;
        C2983b c2983b = this.f8984O0;
        if (c2983b != null) {
            c2983b.release();
            this.f8984O0 = null;
        }
    }

    @Override // p057C3.AbstractC1554d, p057C3.InterfaceC1551b0
    /* JADX INFO: renamed from: a */
    public final void mo2224a(int i10, Object obj) {
        if (i10 != 15) {
            return;
        }
        C2986e c2986e = obj instanceof C2986e ? (C2986e) obj : null;
        if (c2986e == null) {
            c2986e = C2986e.f8966a;
        }
        this.f8986Q0 = c2986e;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: i */
    public final String mo2392i() {
        return "ImageRenderer";
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: k */
    public final boolean mo2394k() {
        return this.f8977H0;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: l */
    public final boolean mo2395l() {
        int i10 = this.f8982M0;
        return i10 == 3 || (i10 == 0 && this.f8988S0);
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: m */
    public final void mo2396m() {
        this.f8983N0 = null;
        this.f8978I0 = C2987f.f8967c;
        this.f8975F0.clear();
        m3826E();
        this.f8986Q0.getClass();
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: n */
    public final void mo2397n(boolean z6, boolean z10) {
        this.f8982M0 = z10 ? 1 : 0;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: o */
    public final void mo2398o(long j10, boolean z6) {
        this.f8982M0 = Math.min(this.f8982M0, 1);
        this.f8977H0 = false;
        this.f8976G0 = false;
        this.f8987R0 = null;
        this.f8989T0 = null;
        this.f8990U0 = null;
        this.f8988S0 = false;
        this.f8985P0 = null;
        C2983b c2983b = this.f8984O0;
        if (c2983b != null) {
            c2983b.flush();
        }
        this.f8975F0.clear();
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: p */
    public final void mo2399p() {
        m3826E();
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: q */
    public final void mo2400q() {
        m3826E();
        this.f8982M0 = Math.min(this.f8982M0, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r7) goto L14;
     */
    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2403t(C19788o[] c19788oArr, long j10, long j11) {
        if (this.f8978I0.f8969b != -9223372036854775807L) {
            ArrayDeque arrayDeque = this.f8975F0;
            if (arrayDeque.isEmpty()) {
                long j12 = this.f8980K0;
                if (j12 != -9223372036854775807L) {
                    long j13 = this.f8979J0;
                    if (j13 != -9223372036854775807L) {
                    }
                }
            }
            arrayDeque.add(new C2987f(this.f8980K0, j11));
            return;
        }
        this.f8978I0 = new C2987f(-9223372036854775807L, j11);
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: v */
    public final void mo2405v(long j10, long j11) throws C1567l {
        if (this.f8977H0) {
            return;
        }
        if (this.f8983N0 == null) {
            C15384c c15384c = this.f4297o0;
            c15384c.m16638m();
            C0803g c0803g = this.f8974E0;
            c0803g.mo1834n();
            int iM2404u = m2404u(c15384c, c0803g, 2);
            if (iM2404u != -5) {
                if (iM2404u == -4) {
                    AbstractC20800b.m21320h(c0803g.m1824d(4));
                    this.f8976G0 = true;
                    this.f8977H0 = true;
                    return;
                }
                return;
            }
            C19788o c19788o = (C19788o) c15384c.f47968o0;
            AbstractC20800b.m21321i(c19788o);
            this.f8983N0 = c19788o;
            m3825D();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (m3823B(j10)) {
            }
            while (m3824C(j10)) {
            }
            Trace.endSection();
        } catch (C2985d e10) {
            throw m2389b(e10, null, false, 4003);
        }
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: z */
    public final int mo2409z(C19788o c19788o) {
        return this.f8973D0.m3922n(c19788o);
    }
}
