package p870le;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import gd.C13995u0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p025An.C0644w;
import p040Bd.AbstractC0985Q1;
import p040Bd.AbstractC1142p;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p049Bm.InterfaceC1441p;
import p1095x1.InterfaceC21057K;
import p1108xi.AbstractC21264a;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p169Gf.C3048l;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.C3949M0;
import p229J0.C4151w1;
import p229J0.C4153w3;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p503Ud.C7629b;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8082f0;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8175q5;
import p548Wd.C8818b;
import p553Wh.C8870f;
import p575Xd.C9436E;
import p594Y9.AbstractC9961r4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p690cp.AbstractC12935u;
import p736f0.C13489g;
import p774h1.C14365u;
import p789hg.C14505d;
import p911o0.AbstractC17780r;
import p923oc.C18049e;
import p923oc.C18050f;
import p923oc.C18053i;
import p923oc.C18064t;
import p948pi.C18418a;

/* JADX INFO: renamed from: le.o0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C16898o0 extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54258Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f54259Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f54260o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f54261p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f54262q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f54263r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f54264s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16898o0(boolean z6, String str, String str2, InterfaceC1436k interfaceC1436k, boolean z10, C9436E c9436e) {
        super(4);
        this.f54259Z = z6;
        this.f54262q0 = str;
        this.f54263r0 = str2;
        this.f54260o0 = interfaceC1436k;
        this.f54261p0 = z10;
        this.f54264s0 = c9436e;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        long j10;
        switch (this.f54258Y) {
            case 0:
                C13489g AnimatedContent = (C13489g) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                C6021p c6021p = (C6021p) obj3;
                int iIntValue = ((Number) obj4).intValue();
                AbstractC16544l.m18094g(AnimatedContent, "$this$AnimatedContent");
                if (!this.f54259Z || this.f54261p0) {
                    boolean zM8729d = AbstractC8160o6.m8729d(C13995u0.f44067c, c6021p);
                    c6021p.m6524S(-1315389689);
                    boolean zM6544g = c6021p.m6544g(zM8729d) | c6021p.m6542f(this.f54260o0) | ((((iIntValue & 112) ^ 48) > 32 && c6021p.m6544g(zBooleanValue)) || (iIntValue & 48) == 32) | c6021p.m6545h((C18418a) this.f54262q0) | c6021p.m6545h((C8870f) this.f54263r0);
                    Object objM6514H = c6021p.m6514H();
                    C5975S c5975s = C6013l.f19514a;
                    if (zM6544g || objM6514H == c5975s) {
                        objM6514H = new C4153w3(zM8729d, this.f54260o0, zBooleanValue, (C18418a) this.f54262q0, (C8870f) this.f54263r0);
                        c6021p.m6537c0(objM6514H);
                    }
                    InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H;
                    c6021p.m6553p(false);
                    InterfaceC10459q interfaceC10459q = (InterfaceC10459q) this.f54264s0;
                    float f10 = AbstractC16912v0.f54327b;
                    InterfaceC10459q interfaceC10459qM11253m = AbstractC10844c.m11253m(interfaceC10459q, f10, f10);
                    c6021p.m6524S(-1315374289);
                    boolean zM6542f = c6021p.m6542f(interfaceC1426a);
                    Object objM6514H2 = c6021p.m6514H();
                    if (zM6542f || objM6514H2 == c5975s) {
                        objM6514H2 = new C14505d(5, interfaceC1426a);
                        c6021p.m6537c0(objM6514H2);
                    }
                    c6021p.m6553p(false);
                    InterfaceC10459q interfaceC10459qM11209d = AbstractC10833a.m11209d(interfaceC10459qM11253m, false, null, (InterfaceC1426a) objM6514H2, 7);
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i10 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11209d);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
                        AbstractC0168G.m537z(i10, c6021p, i10, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(C10456n.f30959Y, AbstractC7313q.f23198c);
                    if (zBooleanValue) {
                        c6021p.m6524S(-936826573);
                        j10 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12226h;
                        c6021p.m6553p(false);
                    } else {
                        if (zBooleanValue) {
                            c6021p.m6524S(-937275967);
                            c6021p.m6553p(false);
                            throw new C0644w();
                        }
                        c6021p.m6524S(-936824077);
                        j10 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12226h;
                        c6021p.m6553p(false);
                    }
                    C4151w1 c4151w1M4675C = AbstractC3984T1.m4675C(j10, C14365u.f45059i, c6021p, 384, 10);
                    c6021p.m6524S(-936832914);
                    boolean zM6542f2 = c6021p.m6542f(interfaceC1426a);
                    Object objM6514H3 = c6021p.m6514H();
                    if (zM6542f2 || objM6514H3 == c5975s) {
                        objM6514H3 = new C14505d(6, interfaceC1426a);
                        c6021p.m6537c0(objM6514H3);
                    }
                    c6021p.m6553p(false);
                    AbstractC3984T1.m4690i((InterfaceC1426a) objM6514H3, interfaceC10459qM11233k, this.f54261p0, null, c4151w1M4675C, null, AbstractC16889k.f54236g, c6021p, 1572864, 40);
                    c6021p.m6553p(true);
                }
                return C17296C.f55119a;
            default:
                C18064t node = (C18064t) obj;
                InterfaceC1440o anonymous$parameter$1$ = (InterfaceC1440o) obj2;
                C6021p c6021p2 = (C6021p) obj3;
                ((Number) obj4).intValue();
                AbstractC16544l.m18094g(node, "node");
                AbstractC16544l.m18094g(anonymous$parameter$1$, "$anonymous$parameter$1$");
                c6021p2.m6524S(-1297218635);
                boolean z6 = true;
                boolean z10 = (this.f54259Z && node.f57621b.f57626e == null) ? false : true;
                AbstractC9961r4 abstractC9961r4 = node.f57620a;
                if (!(abstractC9961r4 instanceof C18050f)) {
                    if (abstractC9961r4 instanceof C18053i) {
                        c6021p2.m6524S(-2032251593);
                        C18053i c18053i = (C18053i) abstractC9961r4;
                        if (AbstractC21329w.m21726m(c18053i.f57605d, "latex")) {
                            c6021p2.m6524S(-2032162468);
                            AbstractC8175q5.m8756a(c18053i.f57606e, z10, false, c6021p2, 0, 4);
                            c6021p2.m6553p(false);
                        } else {
                            c6021p2.m6524S(-2032014722);
                            AbstractC21264a.m21617a(c18053i.f57605d, AbstractC21322p.m21711s0(c18053i.f57606e).toString(), z10, null, c6021p2, 0);
                            c6021p2.m6553p(false);
                        }
                        c6021p2.m6553p(false);
                    } else if (abstractC9961r4 instanceof C18049e) {
                        c6021p2.m6524S(-2031501300);
                        AbstractC12935u abstractC12935u = ((C18049e) abstractC9961r4).f57598a;
                        if (abstractC12935u instanceof C7629b) {
                            AbstractC8072d6.m8485b((String) this.f54262q0, (String) this.f54263r0, (C7629b) abstractC12935u, this.f54259Z, (C9436E) this.f54264s0, this.f54260o0, c6021p2, 512);
                        } else {
                            z6 = false;
                        }
                        c6021p2.m6553p(false);
                    } else {
                        c6021p2.m6524S(-2030833968);
                        c6021p2.m6553p(false);
                    }
                    c6021p2.m6553p(false);
                    return Boolean.valueOf(z6);
                }
                c6021p2.m6524S(-2033142998);
                AbstractC12935u abstractC12935u2 = ((C18050f) abstractC9961r4).f57599a;
                if (abstractC12935u2 instanceof C8818b) {
                    AbstractC16544l.m18092e(abstractC12935u2, "null cannot be cast to non-null type com.openai.feature.conversations.domain.message.reference.ContentReferenceNode");
                    AbstractC0985Q1 abstractC0985Q1 = ((C8818b) abstractC12935u2).f27002g;
                    if (abstractC0985Q1 instanceof AbstractC1142p) {
                        AbstractC1142p abstractC1142p = (AbstractC1142p) abstractC0985Q1;
                        c6021p2.m6524S(-2143779979);
                        InterfaceC1436k interfaceC1436k = this.f54260o0;
                        boolean zM6542f3 = c6021p2.m6542f(interfaceC1436k);
                        String str = (String) this.f54263r0;
                        boolean zM6542f4 = zM6542f3 | c6021p2.m6542f(str);
                        Object objM6514H4 = c6021p2.m6514H();
                        if (zM6542f4 || objM6514H4 == C6013l.f19514a) {
                            objM6514H4 = new C3048l(3, str, interfaceC1436k);
                            c6021p2.m6537c0(objM6514H4);
                        }
                        c6021p2.m6553p(false);
                        AbstractC8082f0.m8509a((String) this.f54262q0, (String) this.f54263r0, abstractC1142p, (InterfaceC1436k) objM6514H4, this.f54260o0, this.f54261p0, c6021p2, 0);
                        c6021p2.m6553p(false);
                        c6021p2.m6553p(false);
                        return Boolean.TRUE;
                    }
                }
                c6021p2.m6553p(false);
                z6 = false;
                c6021p2.m6553p(false);
                return Boolean.valueOf(z6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16898o0(boolean z6, boolean z10, InterfaceC1436k interfaceC1436k, C18418a c18418a, C8870f c8870f, InterfaceC10459q interfaceC10459q) {
        super(4);
        this.f54259Z = z6;
        this.f54261p0 = z10;
        this.f54260o0 = interfaceC1436k;
        this.f54262q0 = c18418a;
        this.f54263r0 = c8870f;
        this.f54264s0 = interfaceC10459q;
    }
}
