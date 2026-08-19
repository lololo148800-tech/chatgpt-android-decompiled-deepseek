package p773h0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import p025An.AbstractC0575H;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p1140z1.AbstractC21706n;
import p1140z1.InterfaceC21701k0;
import p1140z1.InterfaceC21710p;
import p156G1.AbstractC2962i;
import p156G1.AbstractC2973t;
import p156G1.C2954a;
import p156G1.C2963j;
import p156G1.C2971r;
import p156G1.C2974u;
import p225Im.InterfaceC3776x;
import p547Wc.C8816z;
import p722e8.C13298H;
import p737f1.C13526r;
import p737f1.EnumC13525q;
import p737f1.InterfaceC13511c;
import p737f1.InterfaceC13523o;
import p894n0.C17398d;
import p894n0.C17399e;
import p894n0.InterfaceC17406l;
import p953q0.C18562U;

/* JADX INFO: renamed from: h0.K */
/* JADX INFO: loaded from: classes.dex */
public final class C14256K extends AbstractC21706n implements InterfaceC13511c, InterfaceC21701k0, InterfaceC21710p, InterfaceC13523o {

    /* JADX INFO: renamed from: B0 */
    public EnumC13525q f44739B0;

    /* JADX INFO: renamed from: C0 */
    public final C14254I f44740C0;

    /* JADX INFO: renamed from: D0 */
    public final C14257L f44741D0;

    /* JADX INFO: renamed from: E0 */
    public final C14258M f44742E0;

    public C14256K(InterfaceC17406l interfaceC17406l) {
        C14254I c14254i = new C14254I();
        c14254i.f44736z0 = interfaceC17406l;
        m22223K0(c14254i);
        this.f44740C0 = c14254i;
        C14257L c14257l = new C14257L();
        m22223K0(c14257l);
        this.f44741D0 = c14257l;
        C14258M c14258m = new C14258M();
        m22223K0(c14258m);
        this.f44742E0 = c14258m;
        m22223K0(new C13526r());
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: B */
    public final void mo424B(C2963j c2963j) {
        EnumC13525q enumC13525q = this.f44739B0;
        boolean z6 = false;
        if (enumC13525q != null && enumC13525q.m15074a()) {
            z6 = true;
        }
        InterfaceC3776x[] interfaceC3776xArr = AbstractC2973t.f8942a;
        C2974u c2974u = C2971r.f8925k;
        InterfaceC3776x interfaceC3776x = AbstractC2973t.f8942a[4];
        c2974u.m3814a(c2963j, Boolean.valueOf(z6));
        c2963j.m3787m(AbstractC2962i.f8874u, new C2954a(null, new C13298H(this, 13)));
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean mo425E() {
        return false;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m15555N0(InterfaceC17406l interfaceC17406l) {
        C17398d c17398d;
        C14254I c14254i = this.f44740C0;
        if (AbstractC16544l.m18089b(c14254i.f44736z0, interfaceC17406l)) {
            return;
        }
        InterfaceC17406l interfaceC17406l2 = c14254i.f44736z0;
        if (interfaceC17406l2 != null && (c17398d = c14254i.f44735A0) != null) {
            interfaceC17406l2.mo7767a(new C17399e(c17398d));
        }
        c14254i.f44735A0 = null;
        c14254i.f44736z0 = interfaceC17406l;
    }

    @Override // p1140z1.InterfaceC21710p
    /* JADX INFO: renamed from: c */
    public final void mo2143c(AbstractC21678Y abstractC21678Y) {
        this.f44742E0.mo2143c(abstractC21678Y);
    }

    @Override // p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ boolean mo432u0() {
        return false;
    }

    @Override // p737f1.InterfaceC13511c
    /* JADX INFO: renamed from: y */
    public final void mo15025y(EnumC13525q enumC13525q) {
        C14259N c14259nM15556K0;
        if (AbstractC16544l.m18089b(this.f44739B0, enumC13525q)) {
            return;
        }
        boolean zM15074a = enumC13525q.m15074a();
        C18562U c18562u = null;
        if (zM15074a) {
            AbstractC0575H.m1156D(m10935y0(), null, null, new C14255J(this, null), 3);
        }
        if (this.f30972y0) {
            AbstractC21690f.m22211p(this);
        }
        C14254I c14254i = this.f44740C0;
        InterfaceC17406l interfaceC17406l = c14254i.f44736z0;
        if (interfaceC17406l != null) {
            if (zM15074a) {
                C17398d c17398d = c14254i.f44735A0;
                if (c17398d != null) {
                    c14254i.m15554K0(interfaceC17406l, new C17399e(c17398d));
                    c14254i.f44735A0 = null;
                }
                C17398d c17398d2 = new C17398d();
                c14254i.m15554K0(interfaceC17406l, c17398d2);
                c14254i.f44735A0 = c17398d2;
            } else {
                C17398d c17398d3 = c14254i.f44735A0;
                if (c17398d3 != null) {
                    c14254i.m15554K0(interfaceC17406l, new C17399e(c17398d3));
                    c14254i.f44735A0 = null;
                }
            }
        }
        C14258M c14258m = this.f44742E0;
        if (zM15074a != c14258m.f44747z0) {
            if (zM15074a) {
                AbstractC21678Y abstractC21678Y = c14258m.f44746A0;
                if (abstractC21678Y != null && abstractC21678Y.mo22159J0().f30972y0 && (c14259nM15556K0 = c14258m.m15556K0()) != null) {
                    c14259nM15556K0.m15557K0(c14258m.f44746A0);
                }
            } else {
                C14259N c14259nM15556K1 = c14258m.m15556K0();
                if (c14259nM15556K1 != null) {
                    c14259nM15556K1.m15557K0(null);
                }
            }
            c14258m.f44747z0 = zM15074a;
        }
        C14257L c14257l = this.f44741D0;
        if (zM15074a) {
            c14257l.getClass();
            C16525B c16525b = new C16525B();
            AbstractC21690f.m22214s(c14257l, new C8816z(c16525b, 27, c14257l));
            C18562U c18562u2 = (C18562U) c16525b.f51262Y;
            if (c18562u2 != null) {
                c18562u2.m19940a();
                c18562u = c18562u2;
            }
            c14257l.f44744z0 = c18562u;
        } else {
            C18562U c18562u3 = c14257l.f44744z0;
            if (c18562u3 != null) {
                c18562u3.m19941b();
            }
            c14257l.f44744z0 = null;
        }
        c14257l.f44743A0 = zM15074a;
        this.f44739B0 = enumC13525q;
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: z0 */
    public final boolean mo4774z0() {
        return false;
    }
}
