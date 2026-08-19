package p1140z1;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21069X;
import p1095x1.C21094o;
import p635a1.AbstractC10458p;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p774h1.InterfaceC14362r;
import p843k1.C16308b;
import p985r9.C18903m;

/* JADX INFO: renamed from: z1.y */
/* JADX INFO: loaded from: classes.dex */
public final class C21720y extends AbstractC21678Y {

    /* JADX INFO: renamed from: Y0 */
    public static final C18903m f68904Y0;

    /* JADX INFO: renamed from: W0 */
    public InterfaceC21718w f68905W0;

    /* JADX INFO: renamed from: X0 */
    public C21719x f68906X0;

    static {
        C18903m c18903mM15630h = AbstractC14334L.m15630h();
        c18903mM15630h.m20222f(C14365u.f45058h);
        c18903mM15630h.m20228l(1.0f);
        c18903mM15630h.m20229m(1);
        f68904Y0 = c18903mM15630h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21720y(C21658D c21658d, InterfaceC21718w interfaceC21718w) {
        super(c21658d);
        this.f68905W0 = interfaceC21718w;
        this.f68906X0 = c21658d.f68652o0 != null ? new C21719x(this) : null;
        if ((((AbstractC10458p) interfaceC21718w).f30960Y.f30962o0 & 512) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // p1140z1.AbstractC21678Y
    /* JADX INFO: renamed from: E0 */
    public final void mo22154E0() {
        if (this.f68906X0 == null) {
            this.f68906X0 = new C21719x(this);
        }
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: G */
    public final int mo21529G(int i10) {
        InterfaceC21718w interfaceC21718w = this.f68905W0;
        AbstractC21678Y abstractC21678Y = this.f68820y0;
        AbstractC16544l.m18091d(abstractC21678Y);
        return interfaceC21718w.mo2147h(this, abstractC21678Y, i10);
    }

    @Override // p1140z1.AbstractC21678Y
    /* JADX INFO: renamed from: H0 */
    public final AbstractC21669O mo22157H0() {
        return this.f68906X0;
    }

    @Override // p1140z1.AbstractC21678Y
    /* JADX INFO: renamed from: J0 */
    public final AbstractC10458p mo22159J0() {
        return ((AbstractC10458p) this.f68905W0).f30960Y;
    }

    @Override // p1095x1.AbstractC21069X
    /* JADX INFO: renamed from: N */
    public final void mo21551N(long j10, float f10, InterfaceC1436k interfaceC1436k) {
        m22172W0(j10, f10, interfaceC1436k, null);
        m22229g1();
    }

    @Override // p1140z1.AbstractC21678Y, p1095x1.AbstractC21069X
    /* JADX INFO: renamed from: Q */
    public final void mo21552Q(long j10, float f10, C16308b c16308b) {
        m22172W0(j10, f10, null, c16308b);
        m22229g1();
    }

    @Override // p1140z1.AbstractC21668N
    /* JADX INFO: renamed from: V */
    public final int mo22117V(C21094o c21094o) {
        C21719x c21719x = this.f68906X0;
        if (c21719x == null) {
            return AbstractC21690f.m22198c(this, c21094o);
        }
        Integer num = (Integer) c21719x.f68764C0.get(c21094o);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // p1140z1.AbstractC21678Y
    /* JADX INFO: renamed from: V0 */
    public final void mo22171V0(InterfaceC14362r interfaceC14362r, C16308b c16308b) {
        AbstractC21678Y abstractC21678Y = this.f68820y0;
        AbstractC16544l.m18091d(abstractC21678Y);
        abstractC21678Y.m22151B0(interfaceC14362r, c16308b);
        if (AbstractC21661G.m22082a(this.f68819x0).getShowLayoutBounds()) {
            m22152C0(interfaceC14362r, f68904Y0);
        }
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: b */
    public final int mo21530b(int i10) {
        InterfaceC21718w interfaceC21718w = this.f68905W0;
        AbstractC21678Y abstractC21678Y = this.f68820y0;
        AbstractC16544l.m18091d(abstractC21678Y);
        return interfaceC21718w.mo2146g(this, abstractC21678Y, i10);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m22229g1() {
        if (this.f68757s0) {
            return;
        }
        m22170U0();
        mo22123n0().mo19806b();
        AbstractC16544l.m18091d(this.f68820y0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h1 */
    public final void m22230h1(InterfaceC21718w interfaceC21718w) {
        if (!interfaceC21718w.equals(this.f68905W0) && (((AbstractC10458p) interfaceC21718w).f30960Y.f30962o0 & 512) != 0) {
            throw new ClassCastException();
        }
        this.f68905W0 = interfaceC21718w;
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: l */
    public final int mo21531l(int i10) {
        InterfaceC21718w interfaceC21718w = this.f68905W0;
        AbstractC21678Y abstractC21678Y = this.f68820y0;
        AbstractC16544l.m18091d(abstractC21678Y);
        return interfaceC21718w.mo2148k(this, abstractC21678Y, i10);
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: o */
    public final int mo21532o(int i10) {
        InterfaceC21718w interfaceC21718w = this.f68905W0;
        AbstractC21678Y abstractC21678Y = this.f68820y0;
        AbstractC16544l.m18091d(abstractC21678Y);
        return interfaceC21718w.mo2144d(this, abstractC21678Y, i10);
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: p */
    public final AbstractC21069X mo21533p(long j10) {
        m21554T(j10);
        InterfaceC21718w interfaceC21718w = this.f68905W0;
        AbstractC21678Y abstractC21678Y = this.f68820y0;
        AbstractC16544l.m18091d(abstractC21678Y);
        m22174Y0(interfaceC21718w.mo2145f(this, abstractC21678Y, j10));
        m22169T0();
        return this;
    }
}
