package p352O3;

import io.sentry.internal.debugmeta.C15384c;
import java.nio.ByteBuffer;
import p003A1.AbstractC0168G;
import p031B3.C0803g;
import p057C3.AbstractC1554d;
import p057C3.C1524B;
import p1016t3.C19788o;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;

/* JADX INFO: renamed from: O3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6113a extends AbstractC1554d {

    /* JADX INFO: renamed from: D0 */
    public final C0803g f19891D0;

    /* JADX INFO: renamed from: E0 */
    public final C20811m f19892E0;

    /* JADX INFO: renamed from: F0 */
    public long f19893F0;

    /* JADX INFO: renamed from: G0 */
    public C1524B f19894G0;

    /* JADX INFO: renamed from: H0 */
    public long f19895H0;

    public C6113a() {
        super(6);
        this.f19891D0 = new C0803g(1);
        this.f19892E0 = new C20811m();
    }

    @Override // p057C3.AbstractC1554d, p057C3.InterfaceC1551b0
    /* JADX INFO: renamed from: a */
    public final void mo2224a(int i10, Object obj) {
        if (i10 == 8) {
            this.f19894G0 = (C1524B) obj;
        }
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: i */
    public final String mo2392i() {
        return "CameraMotionRenderer";
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: k */
    public final boolean mo2394k() {
        return m2393j();
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: l */
    public final boolean mo2395l() {
        return true;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: m */
    public final void mo2396m() {
        C1524B c1524b = this.f19894G0;
        if (c1524b != null) {
            c1524b.m2226c();
        }
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: o */
    public final void mo2398o(long j10, boolean z6) {
        this.f19895H0 = Long.MIN_VALUE;
        C1524B c1524b = this.f19894G0;
        if (c1524b != null) {
            c1524b.m2226c();
        }
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: t */
    public final void mo2403t(C19788o[] c19788oArr, long j10, long j11) {
        this.f19893F0 = j11;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: v */
    public final void mo2405v(long j10, long j11) {
        float[] fArr;
        while (!m2393j() && this.f19895H0 < 100000 + j10) {
            C0803g c0803g = this.f19891D0;
            c0803g.mo1834n();
            C15384c c15384c = this.f4297o0;
            c15384c.m16638m();
            if (m2404u(c15384c, c0803g, 0) != -4 || c0803g.m1824d(4)) {
                return;
            }
            long j12 = c0803g.f2228s0;
            this.f19895H0 = j12;
            boolean z6 = j12 < this.f4306x0;
            if (this.f19894G0 != null && !z6) {
                c0803g.m1837r();
                ByteBuffer byteBuffer = c0803g.f2226q0;
                int i10 = AbstractC20817s.f66106a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    C20811m c20811m = this.f19892E0;
                    c20811m.m21342D(iLimit, bArrArray);
                    c20811m.m21344F(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i11 = 0; i11 < 3; i11++) {
                        fArr2[i11] = Float.intBitsToFloat(c20811m.m21354i());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f19894G0.m2225b(this.f19895H0 - this.f19893F0, fArr);
                }
            }
        }
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: z */
    public final int mo2409z(C19788o c19788o) {
        return "application/x-camera-motion".equals(c19788o.f62752m) ? AbstractC0168G.m522k(4, 0, 0, 0) : AbstractC0168G.m522k(0, 0, 0, 0);
    }
}
