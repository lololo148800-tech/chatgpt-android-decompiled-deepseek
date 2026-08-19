package p292Lg;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.lazy.C10845a;
import ge.AbstractC14068c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p017Af.C0459F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1014t1.C19738o;
import p1051v0.AbstractC20417e;
import p1051v0.C20416d;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p196Hi.C3445o;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4141u3;
import p229J0.AbstractC4145v1;
import p229J0.AbstractC4160x4;
import p229J0.C3949M0;
import p229J0.C4135t3;
import p229J0.C4172z4;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p594Y9.AbstractC9990w3;
import p623Zf.C10312h;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.InterfaceC13499q;
import p759g1.C13800b;
import p911o0.AbstractC17780r;
import p911o0.C17796z;

/* JADX INFO: renamed from: Lg.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C5033e extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16464Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f16465Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5033e(int i10, InterfaceC1436k interfaceC1436k) {
        super(3);
        this.f16464Y = i10;
        this.f16465Z = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f16464Y) {
            case 0:
                C10845a item = (C10845a) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item, "$this$item");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C8410b c8410b = AbstractC5036h.f16476g;
                    c6021p.m6524S(1835884941);
                    InterfaceC1436k interfaceC1436k = this.f16465Z;
                    boolean zM6542f = c6021p.m6542f(interfaceC1436k);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == C6013l.f19514a) {
                        objM6514H = new C0459F(19, interfaceC1436k);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC9990w3.m10630a(c8410b, (InterfaceC1426a) objM6514H, null, false, null, null, null, null, null, 0.0f, 0.0f, c6021p, 6, 0, 2044);
                }
                return C17296C.f55119a;
            case 1:
                InterfaceC13499q AnimatedVisibility = (InterfaceC13499q) obj;
                C6021p c6021p2 = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(AnimatedVisibility, "$this$AnimatedVisibility");
                long j10 = ((C3949M0) c6021p2.m6548k(AbstractC3959O0.f12302a)).f12215b;
                C20416d c20416d = AbstractC20417e.f64539a;
                InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(C10456n.f30959Y, 0.0f, 0.0f, 0.0f, AbstractC7313q.f23199d, 7);
                c6021p2.m6524S(221304344);
                InterfaceC1436k interfaceC1436k2 = this.f16465Z;
                boolean zM6542f2 = c6021p2.m6542f(interfaceC1436k2);
                Object objM6514H2 = c6021p2.m6514H();
                if (zM6542f2 || objM6514H2 == C6013l.f19514a) {
                    objM6514H2 = new C10312h(9, interfaceC1436k2);
                    c6021p2.m6537c0(objM6514H2);
                }
                c6021p2.m6553p(false);
                AbstractC4145v1.m4772a((InterfaceC1426a) objM6514H2, interfaceC10459qM11237o, c20416d, j10, 0L, null, null, AbstractC14068c.f44259c, c6021p2, 12582912, 112);
                return C17296C.f55119a;
            case 2:
                long j11 = ((C13800b) obj3).f43584a;
                this.f16465Z.invoke(new C13800b(((C19738o) obj2).f62480c));
                return C17296C.f55119a;
            case 3:
                C4172z4 TooltipBox = (C4172z4) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(TooltipBox, "$this$TooltipBox");
                C10456n c10456n = C10456n.f30959Y;
                InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                int i10 = c6021p3.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p3.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p3, c10456n);
                InterfaceC21700k.f68875m0.getClass();
                C21696i c21696i = C21698j.f68869b;
                c6021p3.m6528W();
                if (c6021p3.f19563O) {
                    c6021p3.m6549l(c21696i);
                } else {
                    c6021p3.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p3, interfaceC21057KM19511e);
                C5997d.m6439Z(C21698j.f68872e, c6021p3, interfaceC6008i0M6550m);
                C21694h c21694h = C21698j.f68874g;
                if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p3.m6514H(), Integer.valueOf(i10))) {
                    AbstractC0168G.m537z(i10, c6021p3, i10, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p3, interfaceC10459qM10923d);
                AbstractC3984T1.m4698q(TooltipBox, AbstractC10844c.m11256p(c10456n, 282), AbstractC4160x4.f13485a, ((C4135t3) c6021p3.m6548k(AbstractC4141u3.f13417a)).f13379c, 0L, 0L, 0.0f, 0.0f, AbstractC8411c.m8969c(-1322183159, c6021p3, new C3445o(2, this.f16465Z)), c6021p3, (iIntValue2 & 14) | 100663344, 120);
                c6021p3.m6553p(true);
                return C17296C.f55119a;
            default:
                C6021p c6021p4 = (C6021p) obj2;
                ((Number) obj3).intValue();
                c6021p4.m6524S(-1608161351);
                InterfaceC1436k interfaceC1436k3 = this.f16465Z;
                boolean zM6542f3 = c6021p4.m6542f(interfaceC1436k3);
                Object objM6514H3 = c6021p4.m6514H();
                if (zM6542f3 || objM6514H3 == C6013l.f19514a) {
                    objM6514H3 = new C17796z(interfaceC1436k3);
                    c6021p4.m6537c0(objM6514H3);
                }
                C17796z c17796z = (C17796z) objM6514H3;
                c6021p4.m6553p(false);
                return c17796z;
        }
    }
}
