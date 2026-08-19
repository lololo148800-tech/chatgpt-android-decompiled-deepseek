package coil3.compose.internal;

import coil3.compose.AsyncImagePainter;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p025An.AbstractC0563B;
import p059C5.C1597o;
import p059C5.InterfaceC1589g;
import p085D5.AbstractC1956c;
import p102Dm.AbstractC2119a;
import p1095x1.AbstractC21069X;
import p1095x1.AbstractC21073a0;
import p1095x1.AbstractC21075b0;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21090k;
import p1140z1.AbstractC21668N;
import p1140z1.C21660F;
import p1140z1.InterfaceC21708o;
import p1140z1.InterfaceC21718w;
import p492U1.C7536a;
import p523V9.AbstractC8112i6;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9388w4;
import p604Yk.C10077b;
import p635a1.AbstractC10458p;
import p635a1.InterfaceC10446d;
import p759g1.C13803e;
import p774h1.C14356l;
import p821j1.C16037b;
import p882m1.AbstractC17140a;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m18067d2 = {"Lcoil3/compose/internal/ContentPainterNode;", "La1/p;", "Lz1/o;", "Lz1/w;", "Lm1/a;", "painter", "Lm1/a;", "L0", "()Lm1/a;", "N0", "(Lm1/a;)V", "coil-compose-core_release"}, m18068k = 1, m18069mv = {2, 0, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ContentPainterNode extends AbstractC10458p implements InterfaceC21708o, InterfaceC21718w {

    /* JADX INFO: renamed from: A0 */
    public InterfaceC21090k f35923A0;

    /* JADX INFO: renamed from: B0 */
    public float f35924B0;

    /* JADX INFO: renamed from: C0 */
    public C14356l f35925C0;
    private AbstractC17140a painter;

    /* JADX INFO: renamed from: z0 */
    public InterfaceC10446d f35926z0;

    public ContentPainterNode(AbstractC17140a abstractC17140a, InterfaceC10446d interfaceC10446d, InterfaceC21090k interfaceC21090k, float f10, C14356l c14356l) {
        this.painter = abstractC17140a;
        this.f35926z0 = interfaceC10446d;
        this.f35923A0 = interfaceC21090k;
        this.f35924B0 = f10;
        this.f35925C0 = c14356l;
    }

    /* JADX INFO: renamed from: K0 */
    public final long m13137K0(long j10) {
        if (C13803e.m15334f(j10)) {
            return 0L;
        }
        long f38830r0 = this.painter.getF38830r0();
        if (f38830r0 == 9205357640488583168L) {
            return j10;
        }
        float fM15333e = C13803e.m15333e(f38830r0);
        if (Float.isInfinite(fM15333e) || Float.isNaN(fM15333e)) {
            fM15333e = C13803e.m15333e(j10);
        }
        float fM15331c = C13803e.m15331c(f38830r0);
        if (Float.isInfinite(fM15331c) || Float.isNaN(fM15331c)) {
            fM15331c = C13803e.m15331c(j10);
        }
        long jM8603a = AbstractC8112i6.m8603a(fM15333e, fM15331c);
        long jMo21575a = this.f35923A0.mo21575a(jM8603a, j10);
        float fM21556b = AbstractC21073a0.m21556b(jMo21575a);
        if (Float.isInfinite(fM21556b) || Float.isNaN(fM21556b)) {
            return j10;
        }
        float fM21557c = AbstractC21073a0.m21557c(jMo21575a);
        return (Float.isInfinite(fM21557c) || Float.isNaN(fM21557c)) ? j10 : AbstractC21075b0.m21571l(jM8603a, jMo21575a);
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void mo427L() {
    }

    /* JADX INFO: renamed from: L0, reason: from getter */
    public final AbstractC17140a getPainter() {
        return this.painter;
    }

    /* JADX INFO: renamed from: M0 */
    public final long m13139M0(long j10) {
        float fM7856k;
        int iM7855j;
        float fM8920k;
        boolean zM7852g = C7536a.m7852g(j10);
        boolean zM7851f = C7536a.m7851f(j10);
        if (zM7852g && zM7851f) {
            return j10;
        }
        AbstractC17140a abstractC17140a = this.painter;
        boolean z6 = C7536a.m7850e(j10) && C7536a.m7849d(j10);
        long f38830r0 = abstractC17140a.getF38830r0();
        if (f38830r0 == 9205357640488583168L) {
            if (z6) {
                return ((abstractC17140a instanceof AsyncImagePainter) && ((InterfaceC1589g) ((AsyncImagePainter) abstractC17140a).f35906F0.f6797Y.getValue()).getPainter() == null) ? j10 : C7536a.m7847b(j10, C7536a.m7854i(j10), 0, C7536a.m7853h(j10), 0, 10);
            }
            return j10;
        }
        if (!z6 || (!zM7852g && !zM7851f)) {
            float fM15333e = C13803e.m15333e(f38830r0);
            float fM15331c = C13803e.m15331c(f38830r0);
            if (Float.isInfinite(fM15333e) || Float.isNaN(fM15333e)) {
                fM7856k = C7536a.m7856k(j10);
            } else {
                AbstractC0563B abstractC0563B = AbstractC1956c.f5791a;
                fM7856k = AbstractC8301I.m8920k(fM15333e, C7536a.m7856k(j10), C7536a.m7854i(j10));
            }
            if (Float.isInfinite(fM15331c) || Float.isNaN(fM15331c)) {
                iM7855j = C7536a.m7855j(j10);
            } else {
                AbstractC0563B abstractC0563B2 = AbstractC1956c.f5791a;
                fM8920k = AbstractC8301I.m8920k(fM15331c, C7536a.m7855j(j10), C7536a.m7853h(j10));
            }
            long jM13137K0 = m13137K0(AbstractC8112i6.m8603a(fM7856k, fM8920k));
            return C7536a.m7847b(j10, AbstractC9388w4.m9965h(AbstractC2119a.m3195i(C13803e.m15333e(jM13137K0)), j10), 0, AbstractC9388w4.m9964g(AbstractC2119a.m3195i(C13803e.m15331c(jM13137K0)), j10), 0, 10);
        }
        fM7856k = C7536a.m7854i(j10);
        iM7855j = C7536a.m7853h(j10);
        fM8920k = iM7855j;
        long jM13137K1 = m13137K0(AbstractC8112i6.m8603a(fM7856k, fM8920k));
        return C7536a.m7847b(j10, AbstractC9388w4.m9965h(AbstractC2119a.m3195i(C13803e.m15333e(jM13137K1)), j10), 0, AbstractC9388w4.m9964g(AbstractC2119a.m3195i(C13803e.m15331c(jM13137K1)), j10), 0, 10);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m13140N0(AbstractC17140a abstractC17140a) {
        this.painter = abstractC17140a;
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public final int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        if (this.painter.getF38830r0() == 9205357640488583168L) {
            return interfaceC21056J.mo21532o(i10);
        }
        long jM13139M0 = m13139M0(AbstractC9388w4.m9959b(0, i10, 7));
        return Math.max(C7536a.m7856k(jM13139M0), interfaceC21056J.mo21532o(i10));
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: e */
    public final void mo430e(C21660F c21660f) {
        C16037b c16037b = c21660f.f68674Y;
        long jM13137K0 = m13137K0(c16037b.f49479Z.m15202x());
        InterfaceC10446d interfaceC10446d = this.f35926z0;
        AbstractC0563B abstractC0563B = AbstractC1956c.f5791a;
        long jM9643a = AbstractC9113C4.m9643a(AbstractC2119a.m3195i(C13803e.m15333e(jM13137K0)), AbstractC2119a.m3195i(C13803e.m15331c(jM13137K0)));
        long jM15202x = c16037b.f49479Z.m15202x();
        long jMo10925a = interfaceC10446d.mo10925a(jM9643a, AbstractC9113C4.m9643a(AbstractC2119a.m3195i(C13803e.m15333e(jM15202x)), AbstractC2119a.m3195i(C13803e.m15331c(jM15202x))), c21660f.getLayoutDirection());
        float f10 = (int) (jMo10925a >> 32);
        float f11 = (int) (jMo10925a & 4294967295L);
        ((C10077b) c16037b.f49479Z.f43259Z).m10665M(f10, f11);
        try {
            this.painter.m18904g(c21660f, jM13137K0, this.f35924B0, this.f35925C0);
            ((C10077b) c16037b.f49479Z.f43259Z).m10665M(-f10, -f11);
            c21660f.m22080a();
        } catch (Throwable th2) {
            ((C10077b) c16037b.f49479Z.f43259Z).m10665M(-f10, -f11);
            throw th2;
        }
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(m13139M0(j10));
        return interfaceC21059M.mo19936R(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z, C17690x.f56481Y, new C1597o(abstractC21069XMo21533p, 1));
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: g */
    public final int mo2146g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        if (this.painter.getF38830r0() == 9205357640488583168L) {
            return interfaceC21056J.mo21530b(i10);
        }
        long jM13139M0 = m13139M0(AbstractC9388w4.m9959b(i10, 0, 13));
        return Math.max(C7536a.m7855j(jM13139M0), interfaceC21056J.mo21530b(i10));
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: h */
    public final int mo2147h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        if (this.painter.getF38830r0() == 9205357640488583168L) {
            return interfaceC21056J.mo21529G(i10);
        }
        long jM13139M0 = m13139M0(AbstractC9388w4.m9959b(i10, 0, 13));
        return Math.max(C7536a.m7855j(jM13139M0), interfaceC21056J.mo21529G(i10));
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: k */
    public final int mo2148k(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        if (this.painter.getF38830r0() == 9205357640488583168L) {
            return interfaceC21056J.mo21531l(i10);
        }
        long jM13139M0 = m13139M0(AbstractC9388w4.m9959b(0, i10, 7));
        return Math.max(C7536a.m7856k(jM13139M0), interfaceC21056J.mo21531l(i10));
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: z0 */
    public final boolean mo4774z0() {
        return false;
    }
}
