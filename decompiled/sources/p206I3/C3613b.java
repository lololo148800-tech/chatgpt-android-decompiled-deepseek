package p206I3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import p001A.C0072l;
import p003A1.AbstractC0168G;
import p057C3.AbstractC1554d;
import p057C3.C1526D;
import p057C3.SurfaceHolderCallbackC1523A;
import p1016t3.C19751A;
import p1016t3.C19753C;
import p1016t3.C19788o;
import p1016t3.C19799z;
import p1016t3.InterfaceC19752B;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p589Y3.C9643a;
import p594Y9.AbstractC9997x4;
import p607Yo.C10115d;

/* JADX INFO: renamed from: I3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3613b extends AbstractC1554d implements Handler.Callback {

    /* JADX INFO: renamed from: D0 */
    public final C3612a f11021D0;

    /* JADX INFO: renamed from: E0 */
    public final SurfaceHolderCallbackC1523A f11022E0;

    /* JADX INFO: renamed from: F0 */
    public final Handler f11023F0;

    /* JADX INFO: renamed from: G0 */
    public final C9643a f11024G0;

    /* JADX INFO: renamed from: H0 */
    public AbstractC9997x4 f11025H0;

    /* JADX INFO: renamed from: I0 */
    public boolean f11026I0;

    /* JADX INFO: renamed from: J0 */
    public boolean f11027J0;

    /* JADX INFO: renamed from: K0 */
    public long f11028K0;

    /* JADX INFO: renamed from: L0 */
    public C19753C f11029L0;

    /* JADX INFO: renamed from: M0 */
    public long f11030M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3613b(SurfaceHolderCallbackC1523A surfaceHolderCallbackC1523A, Looper looper) {
        super(5);
        C3612a c3612a = C3612a.f11020a;
        this.f11022E0 = surfaceHolderCallbackC1523A;
        this.f11023F0 = looper == null ? null : new Handler(looper, this);
        this.f11021D0 = c3612a;
        this.f11024G0 = new C9643a(1);
        this.f11030M0 = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX INFO: renamed from: B */
    public final void m4324B(C19753C c19753c, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            InterfaceC19752B[] interfaceC19752BArr = c19753c.f62555Y;
            if (i10 >= interfaceC19752BArr.length) {
                return;
            }
            C19788o c19788oMo10753k = interfaceC19752BArr[i10].mo10753k();
            if (c19788oMo10753k != null) {
                C3612a c3612a = this.f11021D0;
                if (c3612a.m4323b(c19788oMo10753k)) {
                    AbstractC9997x4 abstractC9997x4M4322a = c3612a.m4322a(c19788oMo10753k);
                    byte[] bArrMo10754r0 = interfaceC19752BArr[i10].mo10754r0();
                    bArrMo10754r0.getClass();
                    C9643a c9643a = this.f11024G0;
                    c9643a.mo1834n();
                    c9643a.m1836q(bArrMo10754r0.length);
                    c9643a.f2226q0.put(bArrMo10754r0);
                    c9643a.m1837r();
                    C19753C c19753cM10640c = abstractC9997x4M4322a.m10640c(c9643a);
                    if (c19753cM10640c != null) {
                        m4324B(c19753cM10640c, arrayList);
                    }
                } else {
                    arrayList.add(interfaceC19752BArr[i10]);
                }
            } else {
                arrayList.add(interfaceC19752BArr[i10]);
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: C */
    public final long m4325C(long j10) {
        AbstractC20800b.m21320h(j10 != -9223372036854775807L);
        AbstractC20800b.m21320h(this.f11030M0 != -9223372036854775807L);
        return j10 - this.f11030M0;
    }

    /* JADX INFO: renamed from: D */
    public final void m4326D(C19753C c19753c) {
        SurfaceHolderCallbackC1523A surfaceHolderCallbackC1523A = this.f11022E0;
        C1526D c1526d = surfaceHolderCallbackC1523A.f4046Y;
        C19799z c19799zM20700a = c1526d.f4086j1.m20700a();
        int i10 = 0;
        while (true) {
            InterfaceC19752B[] interfaceC19752BArr = c19753c.f62555Y;
            if (i10 >= interfaceC19752BArr.length) {
                break;
            }
            interfaceC19752BArr[i10].mo10752S(c19799zM20700a);
            i10++;
        }
        c1526d.f4086j1 = new C19751A(c19799zM20700a);
        C19751A c19751aM2232R = c1526d.m2232R();
        boolean zEquals = c19751aM2232R.equals(c1526d.f4073W0);
        C10115d c10115d = c1526d.f4100y0;
        if (!zEquals) {
            c1526d.f4073W0 = c19751aM2232R;
            c10115d.m10692c(14, new C0072l(surfaceHolderCallbackC1523A, 13));
        }
        c10115d.m10692c(28, new C0072l(c19753c, 14));
        c10115d.m10691b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        m4326D((C19753C) message.obj);
        return true;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: i */
    public final String mo2392i() {
        return "MetadataRenderer";
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: k */
    public final boolean mo2394k() {
        return this.f11027J0;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: l */
    public final boolean mo2395l() {
        return true;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: m */
    public final void mo2396m() {
        this.f11029L0 = null;
        this.f11025H0 = null;
        this.f11030M0 = -9223372036854775807L;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: o */
    public final void mo2398o(long j10, boolean z6) {
        this.f11029L0 = null;
        this.f11026I0 = false;
        this.f11027J0 = false;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: t */
    public final void mo2403t(C19788o[] c19788oArr, long j10, long j11) {
        this.f11025H0 = this.f11021D0.m4322a(c19788oArr[0]);
        C19753C c19753c = this.f11029L0;
        if (c19753c != null) {
            long j12 = this.f11030M0;
            long j13 = c19753c.f62556Z;
            long j14 = (j12 + j13) - j11;
            if (j13 != j14) {
                c19753c = new C19753C(j14, c19753c.f62555Y);
            }
            this.f11029L0 = c19753c;
        }
        this.f11030M0 = j11;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: v */
    public final void mo2405v(long j10, long j11) {
        boolean z6 = true;
        while (z6) {
            if (!this.f11026I0 && this.f11029L0 == null) {
                C9643a c9643a = this.f11024G0;
                c9643a.mo1834n();
                C15384c c15384c = this.f4297o0;
                c15384c.m16638m();
                int iM2404u = m2404u(c15384c, c9643a, 0);
                if (iM2404u == -4) {
                    if (c9643a.m1824d(4)) {
                        this.f11026I0 = true;
                    } else if (c9643a.f2228s0 >= this.f4306x0) {
                        c9643a.f29065v0 = this.f11028K0;
                        c9643a.m1837r();
                        AbstractC9997x4 abstractC9997x4 = this.f11025H0;
                        int i10 = AbstractC20817s.f66106a;
                        C19753C c19753cM10640c = abstractC9997x4.m10640c(c9643a);
                        if (c19753cM10640c != null) {
                            ArrayList arrayList = new ArrayList(c19753cM10640c.f62555Y.length);
                            m4324B(c19753cM10640c, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f11029L0 = new C19753C(m4325C(c9643a.f2228s0), (InterfaceC19752B[]) arrayList.toArray(new InterfaceC19752B[0]));
                            }
                        }
                    }
                } else if (iM2404u == -5) {
                    C19788o c19788o = (C19788o) c15384c.f47968o0;
                    c19788o.getClass();
                    this.f11028K0 = c19788o.f62757r;
                }
            }
            C19753C c19753c = this.f11029L0;
            if (c19753c == null || c19753c.f62556Z > m4325C(j10)) {
                z6 = false;
            } else {
                C19753C c19753c2 = this.f11029L0;
                Handler handler = this.f11023F0;
                if (handler != null) {
                    handler.obtainMessage(1, c19753c2).sendToTarget();
                } else {
                    m4326D(c19753c2);
                }
                this.f11029L0 = null;
                z6 = true;
            }
            if (this.f11026I0 && this.f11029L0 == null) {
                this.f11027J0 = true;
            }
        }
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: z */
    public final int mo2409z(C19788o c19788o) {
        if (this.f11021D0.m4323b(c19788o)) {
            return AbstractC0168G.m522k(c19788o.f62738J == 0 ? 4 : 2, 0, 0, 0);
        }
        return AbstractC0168G.m522k(0, 0, 0, 0);
    }
}
