package p017Af;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.feature.conversations.impl.conversation.ConversationViewModel;
import ge.C14111x0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p025An.C0644w;
import p039Bc.C0882p;
import p039Bc.C0885s;
import p040Bd.C0954L0;
import p042Bf.C1281w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1440o;
import p098Di.InterfaceC2062k;
import p1051v0.AbstractC20417e;
import p1095x1.InterfaceC21057K;
import p1139z0.C21585H;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C5984W0;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7302f;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8079e5;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8467E;
import p544W9.AbstractC8651i4;
import p544W9.AbstractC8662k3;
import p547Wc.AbstractC8773Q;
import p547Wc.C8775T;
import p571X9.AbstractC9112C3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17781r0;
import p911o0.C17785t0;
import p911o0.C17790w;
import p911o0.C17794y;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: Af.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C0495z extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1619Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f1620Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f1621o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f1622p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f1623q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0495z(InterfaceC10459q interfaceC10459q, boolean z6, InterfaceC1426a interfaceC1426a, C0954L0 c0954l0) {
        super(3);
        this.f1621o0 = interfaceC10459q;
        this.f1620Z = z6;
        this.f1622p0 = interfaceC1426a;
        this.f1623q0 = c0954l0;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jM15774b;
        int i10 = 4;
        int i11 = 0;
        C17296C c17296c = C17296C.f55119a;
        boolean z6 = this.f1620Z;
        Object obj4 = this.f1623q0;
        Object obj5 = this.f1622p0;
        Object obj6 = this.f1621o0;
        switch (this.f1619Y) {
            case 0:
                C17794y OutlinedCard = (C17794y) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(OutlinedCard, "$this$OutlinedCard");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(AbstractC10844c.m11245e((InterfaceC10459q) obj6, AbstractC0454A.f1468a), 1.0f);
                    float f10 = AbstractC7313q.f23200e;
                    InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(interfaceC10459qM11244d, f10, 0.0f, 0.0f, 0.0f, 14);
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(f10), C10444b.f30944w0, c6021p, 48);
                    int i12 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C21694h c21694h = C21698j.f68873f;
                    C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b);
                    C21694h c21694h2 = C21698j.f68872e;
                    C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h3 = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                        AbstractC0168G.m537z(i12, c6021p, i12, c21694h3);
                    }
                    C21694h c21694h4 = C21698j.f68871d;
                    C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
                    C17785t0 c17785t0 = C17785t0.f56761a;
                    C10456n c10456n = C10456n.f30959Y;
                    InterfaceC10459q interfaceC10459qM8501a = AbstractC8079e5.m8501a(AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23187d), AbstractC20417e.f64539a);
                    int i13 = AbstractC7302f.f23136l;
                    boolean zM9097b = AbstractC8467E.m9097b(c6021p);
                    if (zM9097b) {
                        jM15774b = C14365u.m15774b(0.25f, AbstractC7302f.f23130f);
                    } else {
                        if (zM9097b) {
                            throw new C0644w();
                        }
                        jM15774b = C14365u.m15774b(0.08f, AbstractC7302f.f23129e);
                    }
                    InterfaceC10459q interfaceC10459qM11207b = AbstractC10833a.m11207b(interfaceC10459qM8501a, jM15774b, AbstractC14334L.f44973a);
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30938q0, false);
                    int i14 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11207b);
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
                    C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                        AbstractC0168G.m537z(i14, c6021p, i14, c21694h3);
                    }
                    C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
                    C0954L0 c0954l0 = (C0954L0) obj4;
                    AbstractC8651i4.m9323a(384, 0, c6021p, AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23185b), c0954l0.f2715c, false);
                    c6021p.m6553p(true);
                    InterfaceC10459q interfaceC10459qM19513a = c17785t0.m19513a(c10456n, 1.0f, true);
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                    int i15 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19513a);
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(c21694h, c6021p, c17790wM19515a);
                    C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m3);
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                        AbstractC0168G.m537z(i15, c6021p, i15, c21694h3);
                    }
                    C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d3);
                    long jM7773b = AbstractC7302f.m7773b(c6021p);
                    C5984W0 c5984w0 = AbstractC3947L4.f12183a;
                    AbstractC4124r4.m4768b(c0954l0.f2713a, null, jM7773b, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12153i, c6021p, 0, 3120, 55290);
                    String str = c0954l0.f2716d;
                    if (str == null) {
                        str = c0954l0.f2715c;
                    }
                    AbstractC4124r4.m4768b(str, null, AbstractC7302f.m7773b(c6021p), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12155k, c6021p, 0, 3120, 55290);
                    c6021p.m6553p(true);
                    c6021p.m6524S(-1375692296);
                    if (z6) {
                        AbstractC3984T1.m4693l((InterfaceC1426a) obj5, null, false, null, null, AbstractC0476g.f1546a, c6021p, 196608, 30);
                    }
                    c6021p.m6553p(false);
                    c6021p.m6553p(true);
                }
                return c17296c;
            case 1:
                InterfaceC17763i0 it = (InterfaceC17763i0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(it, "it");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C14111x0 c14111x0 = (C14111x0) AbstractC9112C3.m9642d(((ConversationViewModel) obj6).f40343c, c6021p2).getValue();
                    InterfaceC5985X interfaceC5985X = (InterfaceC5985X) obj5;
                    C8775T c8775t = (C8775T) interfaceC5985X.getValue();
                    boolean z10 = c14111x0.f44438z.f44212e;
                    C8410b c8410bM8969c = AbstractC8411c.m8969c(-1825335150, c6021p2, new C0882p(z6, interfaceC5985X, i11));
                    C10456n c10456n2 = C10456n.f30959Y;
                    C8410b c8410bM8969c2 = AbstractC8411c.m8969c(-1352995504, c6021p2, new C0885s(interfaceC5985X, i11, (C5996c0) obj4));
                    C21585H c21585h = C8775T.f26766c;
                    AbstractC8773Q.m9528a(c8775t, z10, !z10, c8410bM8969c, c10456n2, c8410bM8969c2, c6021p2, 224264);
                }
                return c17296c;
            default:
                InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddings, "paddings");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6021p3.m6542f(paddings) ? 4 : 2;
                }
                if ((iIntValue3 & 19) == 18 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC8662k3.m9353d(z6, paddings, AbstractC8411c.m8969c(-1833950575, c6021p3, new C1281w((C8410b) obj6, (InterfaceC2062k) obj5, (InterfaceC3759g) obj4, i10)), c6021p3, ((iIntValue3 << 3) & 112) | 384);
                }
                return c17296c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0495z(ConversationViewModel conversationViewModel, InterfaceC5985X interfaceC5985X, boolean z6, C5996c0 c5996c0) {
        super(3);
        this.f1621o0 = conversationViewModel;
        this.f1622p0 = interfaceC5985X;
        this.f1620Z = z6;
        this.f1623q0 = c5996c0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0495z(boolean z6, C8410b c8410b, InterfaceC2062k interfaceC2062k, InterfaceC3759g interfaceC3759g) {
        super(3);
        this.f1620Z = z6;
        this.f1621o0 = c8410b;
        this.f1622p0 = interfaceC2062k;
        this.f1623q0 = interfaceC3759g;
    }
}
