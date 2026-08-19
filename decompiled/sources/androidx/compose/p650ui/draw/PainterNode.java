package androidx.compose.p650ui.draw;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p054C0.C1501n;
import p1095x1.AbstractC21069X;
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
@Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m18067d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Lz1/w;", "La1/p;", "Lz1/o;", "Lm1/a;", "painter", "Lm1/a;", "K0", "()Lm1/a;", "P0", "(Lm1/a;)V", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class PainterNode extends AbstractC10458p implements InterfaceC21718w, InterfaceC21708o {

    /* JADX INFO: renamed from: A0 */
    public InterfaceC10446d f32678A0;

    /* JADX INFO: renamed from: B0 */
    public InterfaceC21090k f32679B0;

    /* JADX INFO: renamed from: C0 */
    public float f32680C0;

    /* JADX INFO: renamed from: D0 */
    public C14356l f32681D0;
    private AbstractC17140a painter;

    /* JADX INFO: renamed from: z0 */
    public boolean f32682z0;

    public PainterNode(AbstractC17140a abstractC17140a, boolean z6, InterfaceC10446d interfaceC10446d, InterfaceC21090k interfaceC21090k, float f10, C14356l c14356l) {
        this.painter = abstractC17140a;
        this.f32682z0 = z6;
        this.f32678A0 = interfaceC10446d;
        this.f32679B0 = interfaceC21090k;
        this.f32680C0 = f10;
        this.f32681D0 = c14356l;
    }

    /* JADX INFO: renamed from: M0 */
    public static boolean m11289M0(long j10) {
        if (!C13803e.m15330b(j10, 9205357640488583168L)) {
            float fM15331c = C13803e.m15331c(j10);
            if (!Float.isInfinite(fM15331c) && !Float.isNaN(fM15331c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: N0 */
    public static boolean m11290N0(long j10) {
        if (!C13803e.m15330b(j10, 9205357640488583168L)) {
            float fM15333e = C13803e.m15333e(j10);
            if (!Float.isInfinite(fM15333e) && !Float.isNaN(fM15333e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K0, reason: from getter */
    public final AbstractC17140a getPainter() {
        return this.painter;
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void mo427L() {
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m11292L0() {
        return this.f32682z0 && this.painter.getF38830r0() != 9205357640488583168L;
    }

    /* JADX INFO: renamed from: O0 */
    public final long m11293O0(long j10) {
        boolean z6 = false;
        boolean z10 = C7536a.m7850e(j10) && C7536a.m7849d(j10);
        if (C7536a.m7852g(j10) && C7536a.m7851f(j10)) {
            z6 = true;
        }
        if ((!m11292L0() && z10) || z6) {
            return C7536a.m7847b(j10, C7536a.m7854i(j10), 0, C7536a.m7853h(j10), 0, 10);
        }
        long f38830r0 = this.painter.getF38830r0();
        long jM8603a = AbstractC8112i6.m8603a(AbstractC9388w4.m9965h(m11290N0(f38830r0) ? Math.round(C13803e.m15333e(f38830r0)) : C7536a.m7856k(j10), j10), AbstractC9388w4.m9964g(m11289M0(f38830r0) ? Math.round(C13803e.m15331c(f38830r0)) : C7536a.m7855j(j10), j10));
        if (m11292L0()) {
            long jM8603a2 = AbstractC8112i6.m8603a(!m11290N0(this.painter.getF38830r0()) ? C13803e.m15333e(jM8603a) : C13803e.m15333e(this.painter.getF38830r0()), !m11289M0(this.painter.getF38830r0()) ? C13803e.m15331c(jM8603a) : C13803e.m15331c(this.painter.getF38830r0()));
            jM8603a = (C13803e.m15333e(jM8603a) == 0.0f || C13803e.m15331c(jM8603a) == 0.0f) ? 0L : AbstractC21075b0.m21571l(jM8603a2, this.f32679B0.mo21575a(jM8603a2, jM8603a));
        }
        return C7536a.m7847b(j10, AbstractC9388w4.m9965h(Math.round(C13803e.m15333e(jM8603a)), j10), 0, AbstractC9388w4.m9964g(Math.round(C13803e.m15331c(jM8603a)), j10), 0, 10);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m11294P0(AbstractC17140a abstractC17140a) {
        this.painter = abstractC17140a;
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public final int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        if (!m11292L0()) {
            return interfaceC21056J.mo21532o(i10);
        }
        long jM11293O0 = m11293O0(AbstractC9388w4.m9959b(0, i10, 7));
        return Math.max(C7536a.m7856k(jM11293O0), interfaceC21056J.mo21532o(i10));
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: e */
    public final void mo430e(C21660F c21660f) {
        long f38830r0 = this.painter.getF38830r0();
        boolean zM11290N0 = m11290N0(f38830r0);
        C16037b c16037b = c21660f.f68674Y;
        long jM8603a = AbstractC8112i6.m8603a(zM11290N0 ? C13803e.m15333e(f38830r0) : C13803e.m15333e(c16037b.f49479Z.m15202x()), m11289M0(f38830r0) ? C13803e.m15331c(f38830r0) : C13803e.m15331c(c16037b.f49479Z.m15202x()));
        long jM21571l = (C13803e.m15333e(c16037b.f49479Z.m15202x()) == 0.0f || C13803e.m15331c(c16037b.f49479Z.m15202x()) == 0.0f) ? 0L : AbstractC21075b0.m21571l(jM8603a, this.f32679B0.mo21575a(jM8603a, c16037b.f49479Z.m15202x()));
        long jMo10925a = this.f32678A0.mo10925a(AbstractC9113C4.m9643a(Math.round(C13803e.m15333e(jM21571l)), Math.round(C13803e.m15331c(jM21571l))), AbstractC9113C4.m9643a(Math.round(C13803e.m15333e(c16037b.f49479Z.m15202x())), Math.round(C13803e.m15331c(c16037b.f49479Z.m15202x()))), c21660f.getLayoutDirection());
        float f10 = (int) (jMo10925a >> 32);
        float f11 = (int) (jMo10925a & 4294967295L);
        ((C10077b) c16037b.f49479Z.f43259Z).m10665M(f10, f11);
        try {
            this.painter.m18904g(c21660f, jM21571l, this.f32680C0, this.f32681D0);
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
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(m11293O0(j10));
        return interfaceC21059M.mo19936R(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z, C17690x.f56481Y, new C1501n(abstractC21069XMo21533p, 3));
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: g */
    public final int mo2146g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        if (!m11292L0()) {
            return interfaceC21056J.mo21530b(i10);
        }
        long jM11293O0 = m11293O0(AbstractC9388w4.m9959b(i10, 0, 13));
        return Math.max(C7536a.m7855j(jM11293O0), interfaceC21056J.mo21530b(i10));
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: h */
    public final int mo2147h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        if (!m11292L0()) {
            return interfaceC21056J.mo21529G(i10);
        }
        long jM11293O0 = m11293O0(AbstractC9388w4.m9959b(i10, 0, 13));
        return Math.max(C7536a.m7855j(jM11293O0), interfaceC21056J.mo21529G(i10));
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: k */
    public final int mo2148k(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        if (!m11292L0()) {
            return interfaceC21056J.mo21531l(i10);
        }
        long jM11293O0 = m11293O0(AbstractC9388w4.m9959b(0, i10, 7));
        return Math.max(C7536a.m7856k(jM11293O0), interfaceC21056J.mo21531l(i10));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.f32682z0 + ", alignment=" + this.f32678A0 + ", alpha=" + this.f32680C0 + ", colorFilter=" + this.f32681D0 + ')';
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: z0 */
    public final boolean mo4774z0() {
        return false;
    }
}
