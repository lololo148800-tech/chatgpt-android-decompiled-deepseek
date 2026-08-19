package p1140z1;

import androidx.compose.p650ui.node.Owner;
import p045Bj.C1313k;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21069X;
import p1095x1.C21094o;
import p1095x1.InterfaceC21057K;
import p156G1.C2963j;
import p392Q0.C6546d;
import p523V9.AbstractC8088f6;
import p635a1.AbstractC10458p;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p774h1.InterfaceC14362r;
import p843k1.C16308b;
import p985r9.C18903m;
import sk.C19662a;

/* JADX INFO: renamed from: z1.t */
/* JADX INFO: loaded from: classes.dex */
public final class C21715t extends AbstractC21678Y {

    /* JADX INFO: renamed from: Y0 */
    public static final C18903m f68891Y0;

    /* JADX INFO: renamed from: W0 */
    public final C21703l0 f68892W0;

    /* JADX INFO: renamed from: X0 */
    public C21714s f68893X0;

    static {
        C18903m c18903mM15630h = AbstractC14334L.m15630h();
        c18903mM15630h.m20222f(C14365u.f45056f);
        c18903mM15630h.m20228l(1.0f);
        c18903mM15630h.m20229m(1);
        f68891Y0 = c18903mM15630h;
    }

    public C21715t(C21658D c21658d) {
        super(c21658d);
        C21703l0 c21703l0 = new C21703l0();
        c21703l0.f30963p0 = 0;
        this.f68892W0 = c21703l0;
        c21703l0.f30967t0 = this;
        this.f68893X0 = c21658d.f68652o0 != null ? new C21714s(this) : null;
    }

    @Override // p1140z1.AbstractC21678Y
    /* JADX INFO: renamed from: E0 */
    public final void mo22154E0() {
        if (this.f68893X0 == null) {
            this.f68893X0 = new C21714s(this);
        }
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: G */
    public final int mo21529G(int i10) {
        C19662a c19662aM22008F = this.f68819x0.m22008F();
        InterfaceC21057K interfaceC21057KM20634f = c19662aM22008F.m20634f();
        C21658D c21658d = (C21658D) c19662aM22008F.f62320Y;
        return interfaceC21057KM20634f.mo1120b((AbstractC21678Y) c21658d.f68638I0.f3469d, c21658d.m22052o(), i10);
    }

    @Override // p1140z1.AbstractC21678Y
    /* JADX INFO: renamed from: H0 */
    public final AbstractC21669O mo22157H0() {
        return this.f68893X0;
    }

    @Override // p1140z1.AbstractC21678Y
    /* JADX INFO: renamed from: J0 */
    public final AbstractC10458p mo22159J0() {
        return this.f68892W0;
    }

    @Override // p1095x1.AbstractC21069X
    /* JADX INFO: renamed from: N */
    public final void mo21551N(long j10, float f10, InterfaceC1436k interfaceC1436k) {
        m22172W0(j10, f10, interfaceC1436k, null);
        if (this.f68757s0) {
            return;
        }
        m22170U0();
        this.f68819x0.m22003A().m22103l0();
    }

    @Override // p1140z1.AbstractC21678Y
    /* JADX INFO: renamed from: O0 */
    public final void mo22164O0(C21686d c21686d, long j10, C21713r c21713r, boolean z6, boolean z10) {
        boolean z11;
        boolean z12;
        InterfaceC21687d0 interfaceC21687d0;
        C21713r c21713r2 = c21713r;
        boolean z13 = false;
        boolean z14 = true;
        C21658D c21658d = this.f68819x0;
        switch (c21686d.f68831Y) {
            case 1:
                z11 = true;
                break;
            default:
                C2963j c2963jM22056q = c21658d.m22056q();
                z11 = !(c2963jM22056q != null && c2963jM22056q.f8882o0);
                break;
        }
        if (z11) {
            if (AbstractC8088f6.m8537c(j10) && ((interfaceC21687d0 = this.f68817P0) == null || !this.f68803B0 || interfaceC21687d0.mo539b(j10))) {
                z12 = z10;
            } else {
                if (z6) {
                    float fM22150A0 = m22150A0(j10, m22158I0());
                    if (!Float.isInfinite(fM22150A0) && !Float.isNaN(fM22150A0)) {
                        z12 = false;
                    }
                }
                z12 = z10;
            }
            z13 = true;
        } else {
            z12 = z10;
        }
        if (z13) {
            int i10 = c21713r2.f68888o0;
            C6546d c6546dM22013K = c21658d.m22013K();
            int i11 = c6546dM22013K.f21184o0;
            if (i11 > 0) {
                Object[] objArr = c6546dM22013K.f21182Y;
                int i12 = i11 - 1;
                while (true) {
                    C21658D c21658d2 = (C21658D) objArr[i12];
                    if (c21658d2.m22025W()) {
                        switch (c21686d.f68831Y) {
                            case 1:
                                c21658d2.m22015M(j10, c21713r, z6, z12);
                                break;
                            default:
                                C1313k c1313k = c21658d2.f68638I0;
                                ((AbstractC21678Y) c1313k.f3469d).m22163N0(AbstractC21678Y.f68801V0, ((AbstractC21678Y) c1313k.f3469d).m22156G0(j10, z14), c21713r, true, z12);
                                break;
                        }
                        long jM22226f = c21713r.m22226f();
                        if (Float.intBitsToFloat((int) (jM22226f >> 32)) < 0.0f && ((int) (jM22226f & 4294967295L)) != 0) {
                            if (c21713r2.f68890q0) {
                                c21713r2.f68888o0 = c21713r2.f68889p0 - z14;
                            }
                        }
                    } else {
                        objArr = objArr;
                        i10 = i10;
                        z14 = z14;
                        c21713r2 = c21713r2;
                    }
                    i12--;
                    if (i12 >= 0) {
                        objArr = objArr;
                        i10 = i10;
                        z14 = z14;
                        c21713r2 = c21713r2;
                    }
                }
            } else {
                i10 = i10;
                c21713r2 = c21713r2;
            }
            c21713r2.f68888o0 = i10;
        }
    }

    @Override // p1140z1.AbstractC21678Y, p1095x1.AbstractC21069X
    /* JADX INFO: renamed from: Q */
    public final void mo21552Q(long j10, float f10, C16308b c16308b) {
        m22172W0(j10, f10, null, c16308b);
        if (this.f68757s0) {
            return;
        }
        m22170U0();
        this.f68819x0.m22003A().m22103l0();
    }

    @Override // p1140z1.AbstractC21668N
    /* JADX INFO: renamed from: V */
    public final int mo22117V(C21094o c21094o) {
        C21714s c21714s = this.f68893X0;
        if (c21714s != null) {
            return c21714s.mo22117V(c21094o);
        }
        C21664J c21664j = this.f68819x0.m22060t().f68746r;
        boolean z6 = c21664j.f68726x0;
        C21659E c21659e = c21664j.f68706G0;
        if (!z6) {
            C21665K c21665k = c21664j.f68719T0;
            if (c21665k.f68731c == 1) {
                c21659e.f68669f = true;
                if (c21659e.f68665b) {
                    c21665k.f68733e = true;
                    c21665k.f68734f = true;
                }
            } else {
                c21659e.f68670g = true;
            }
        }
        c21664j.mo22090f().f68758t0 = true;
        c21664j.mo22097z();
        c21664j.mo22090f().f68758t0 = false;
        Integer num = (Integer) c21659e.f68672i.get(c21094o);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // p1140z1.AbstractC21678Y
    /* JADX INFO: renamed from: V0 */
    public final void mo22171V0(InterfaceC14362r interfaceC14362r, C16308b c16308b) {
        C21658D c21658d = this.f68819x0;
        Owner ownerM22082a = AbstractC21661G.m22082a(c21658d);
        C6546d c6546dM22013K = c21658d.m22013K();
        int i10 = c6546dM22013K.f21184o0;
        if (i10 > 0) {
            Object[] objArr = c6546dM22013K.f21182Y;
            int i11 = 0;
            do {
                C21658D c21658d2 = (C21658D) objArr[i11];
                if (c21658d2.m22025W()) {
                    c21658d2.m22045k(interfaceC14362r, c16308b);
                }
                i11++;
            } while (i11 < i10);
        }
        if (ownerM22082a.getShowLayoutBounds()) {
            m22152C0(interfaceC14362r, f68891Y0);
        }
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: b */
    public final int mo21530b(int i10) {
        C19662a c19662aM22008F = this.f68819x0.m22008F();
        InterfaceC21057K interfaceC21057KM20634f = c19662aM22008F.m20634f();
        C21658D c21658d = (C21658D) c19662aM22008F.f62320Y;
        return interfaceC21057KM20634f.mo1119a((AbstractC21678Y) c21658d.f68638I0.f3469d, c21658d.m22052o(), i10);
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: l */
    public final int mo21531l(int i10) {
        C19662a c19662aM22008F = this.f68819x0.m22008F();
        InterfaceC21057K interfaceC21057KM20634f = c19662aM22008F.m20634f();
        C21658D c21658d = (C21658D) c19662aM22008F.f62320Y;
        return interfaceC21057KM20634f.mo1123e((AbstractC21678Y) c21658d.f68638I0.f3469d, c21658d.m22052o(), i10);
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: o */
    public final int mo21532o(int i10) {
        C19662a c19662aM22008F = this.f68819x0.m22008F();
        InterfaceC21057K interfaceC21057KM20634f = c19662aM22008F.m20634f();
        C21658D c21658d = (C21658D) c19662aM22008F.f62320Y;
        return interfaceC21057KM20634f.mo1122d((AbstractC21678Y) c21658d.f68638I0.f3469d, c21658d.m22052o(), i10);
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: p */
    public final AbstractC21069X mo21533p(long j10) {
        m21554T(j10);
        C21658D c21658d = this.f68819x0;
        C6546d c6546dM22014L = c21658d.m22014L();
        int i10 = c6546dM22014L.f21184o0;
        if (i10 > 0) {
            Object[] objArr = c6546dM22014L.f21182Y;
            int i11 = 0;
            do {
                ((C21658D) objArr[i11]).m22003A().f68725w0 = 3;
                i11++;
            } while (i11 < i10);
        }
        m22174Y0(c21658d.f68631B0.mo1121c(this, c21658d.m22052o(), j10));
        m22169T0();
        return this;
    }
}
