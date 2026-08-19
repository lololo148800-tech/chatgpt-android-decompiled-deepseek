package p057C3;

import io.sentry.internal.debugmeta.C15384c;
import p031B3.C0803g;
import p083D3.C1875m;
import p1016t3.AbstractC19764N;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.C20813o;
import p232J3.C4253y;
import p232J3.InterfaceC4220U;
import p281L3.C4928o;

/* JADX INFO: renamed from: C3.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1554d implements InterfaceC1551b0 {

    /* JADX INFO: renamed from: A0 */
    public boolean f4292A0;

    /* JADX INFO: renamed from: C0 */
    public C4928o f4294C0;

    /* JADX INFO: renamed from: Z */
    public final int f4296Z;

    /* JADX INFO: renamed from: p0 */
    public C1559f0 f4298p0;

    /* JADX INFO: renamed from: q0 */
    public int f4299q0;

    /* JADX INFO: renamed from: r0 */
    public C1875m f4300r0;

    /* JADX INFO: renamed from: s0 */
    public C20813o f4301s0;

    /* JADX INFO: renamed from: t0 */
    public int f4302t0;

    /* JADX INFO: renamed from: u0 */
    public InterfaceC4220U f4303u0;

    /* JADX INFO: renamed from: v0 */
    public C19788o[] f4304v0;

    /* JADX INFO: renamed from: w0 */
    public long f4305w0;

    /* JADX INFO: renamed from: x0 */
    public long f4306x0;

    /* JADX INFO: renamed from: z0 */
    public boolean f4308z0;

    /* JADX INFO: renamed from: Y */
    public final Object f4295Y = new Object();

    /* JADX INFO: renamed from: o0 */
    public final C15384c f4297o0 = new C15384c(3, false);

    /* JADX INFO: renamed from: y0 */
    public long f4307y0 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: B0 */
    public AbstractC19764N f4293B0 = AbstractC19764N.f62601a;

    public AbstractC1554d(int i10) {
        this.f4296Z = i10;
    }

    /* JADX INFO: renamed from: A */
    public int mo2388A() {
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final C1567l m2389b(Exception exc, C19788o c19788o, boolean z6, int i10) {
        int iMo2409z;
        if (c19788o == null || this.f4292A0) {
            iMo2409z = 4;
        } else {
            this.f4292A0 = true;
            try {
                iMo2409z = mo2409z(c19788o) & 7;
                this.f4292A0 = false;
            } catch (C1567l unused) {
                this.f4292A0 = false;
                iMo2409z = 4;
            } catch (Throwable th2) {
                this.f4292A0 = false;
                throw th2;
            }
        }
        return new C1567l(1, exc, i10, mo2392i(), this.f4299q0, c19788o, c19788o == null ? 4 : iMo2409z, z6);
    }

    /* JADX INFO: renamed from: c */
    public void mo2390c() {
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC1536N mo2391h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public abstract String mo2392i();

    /* JADX INFO: renamed from: j */
    public final boolean m2393j() {
        return this.f4307y0 == Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo2394k();

    /* JADX INFO: renamed from: l */
    public abstract boolean mo2395l();

    /* JADX INFO: renamed from: m */
    public abstract void mo2396m();

    /* JADX INFO: renamed from: o */
    public abstract void mo2398o(long j10, boolean z6);

    /* JADX INFO: renamed from: t */
    public abstract void mo2403t(C19788o[] c19788oArr, long j10, long j11);

    /* JADX INFO: renamed from: u */
    public final int m2404u(C15384c c15384c, C0803g c0803g, int i10) {
        InterfaceC4220U interfaceC4220U = this.f4303u0;
        interfaceC4220U.getClass();
        int iMo4944d = interfaceC4220U.mo4944d(c15384c, c0803g, i10);
        if (iMo4944d == -4) {
            if (c0803g.m1824d(4)) {
                this.f4307y0 = Long.MIN_VALUE;
                return this.f4308z0 ? -4 : -3;
            }
            long j10 = c0803g.f2228s0 + this.f4305w0;
            c0803g.f2228s0 = j10;
            this.f4307y0 = Math.max(this.f4307y0, j10);
        } else if (iMo4944d == -5) {
            C19788o c19788o = (C19788o) c15384c.f47968o0;
            c19788o.getClass();
            long j11 = c19788o.f62757r;
            if (j11 != Long.MAX_VALUE) {
                C19787n c19787nM20747a = c19788o.m20747a();
                c19787nM20747a.f62719q = j11 + this.f4305w0;
                c15384c.f47968o0 = new C19788o(c19787nM20747a);
            }
        }
        return iMo4944d;
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo2405v(long j10, long j11);

    /* JADX INFO: renamed from: w */
    public final void m2406w(C19788o[] c19788oArr, InterfaceC4220U interfaceC4220U, long j10, long j11, C4253y c4253y) {
        AbstractC20800b.m21320h(!this.f4308z0);
        this.f4303u0 = interfaceC4220U;
        if (this.f4307y0 == Long.MIN_VALUE) {
            this.f4307y0 = j10;
        }
        this.f4304v0 = c19788oArr;
        this.f4305w0 = j11;
        mo2403t(c19788oArr, j10, j11);
    }

    /* JADX INFO: renamed from: x */
    public final void m2407x() {
        AbstractC20800b.m21320h(this.f4302t0 == 0);
        this.f4297o0.m16638m();
        mo2400q();
    }

    /* JADX INFO: renamed from: y */
    public void mo2408y(float f10, float f11) {
    }

    /* JADX INFO: renamed from: z */
    public abstract int mo2409z(C19788o c19788o);

    /* JADX INFO: renamed from: p */
    public void mo2399p() {
    }

    /* JADX INFO: renamed from: q */
    public void mo2400q() {
    }

    /* JADX INFO: renamed from: r */
    public void mo2401r() {
    }

    /* JADX INFO: renamed from: s */
    public void mo2402s() {
    }

    @Override // p057C3.InterfaceC1551b0
    /* JADX INFO: renamed from: a */
    public void mo2224a(int i10, Object obj) {
    }

    /* JADX INFO: renamed from: n */
    public void mo2397n(boolean z6, boolean z10) {
    }
}
