package p278L0;

import androidx.compose.p650ui.graphics.AbstractC10864a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p000.C16280k;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p204I1.C3582M;
import p229J0.AbstractC3984T1;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p537W0.AbstractC8411c;
import p547Wc.C8804n;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p758g0.C13767i0;
import p911o0.AbstractC17780r;

/* JADX INFO: renamed from: L0.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4869d0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15849Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f15850Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f15851o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f15852p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f15853q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4869d0(InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, String str, long j10) {
        super(2);
        this.f15849Y = 2;
        this.f15850Z = interfaceC1436k;
        this.f15852p0 = interfaceC1426a;
        this.f15853q0 = str;
        this.f15851o0 = j10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15849Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C10456n c10456n = C10456n.f30959Y;
                    C13767i0 c13767i0 = (C13767i0) this.f15850Z;
                    boolean zM6542f = c6021p.m6542f(c13767i0);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == C6013l.f19514a) {
                        objM6514H = new C4865b0(c13767i0, 1);
                        c6021p.m6537c0(objM6514H);
                    }
                    InterfaceC10459q interfaceC10459qM11305a = AbstractC10864a.m11305a(c10456n, (InterfaceC1436k) objM6514H);
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i10 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11305a);
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
                    AbstractC4879i0.m5510b(this.f15851o0, (C3582M) this.f15852p0, (InterfaceC1439n) this.f15853q0, c6021p, 0);
                    c6021p.m6553p(true);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C10456n c10456n2 = C10456n.f30959Y;
                    C13767i0 c13767i1 = (C13767i0) this.f15850Z;
                    boolean zM6542f2 = c6021p2.m6542f(c13767i1);
                    Object objM6514H2 = c6021p2.m6514H();
                    if (zM6542f2 || objM6514H2 == C6013l.f19514a) {
                        objM6514H2 = new C4865b0(c13767i1, 2);
                        c6021p2.m6537c0(objM6514H2);
                    }
                    InterfaceC10459q interfaceC10459qM11305a2 = AbstractC10864a.m11305a(c10456n2, (InterfaceC1436k) objM6514H2);
                    InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i11 = c6021p2.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p2.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p2, interfaceC10459qM11305a2);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i2 = C21698j.f68869b;
                    c6021p2.m6528W();
                    if (c6021p2.f19563O) {
                        c6021p2.m6549l(c21696i2);
                    } else {
                        c6021p2.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p2, interfaceC21057KM19511e2);
                    C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m2);
                    C21694h c21694h2 = C21698j.f68874g;
                    if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p2, i11, c21694h2);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d2);
                    AbstractC4879i0.m5510b(this.f15851o0, (C3582M) this.f15852p0, (InterfaceC1439n) this.f15853q0, c6021p2, 0);
                    c6021p2.m6553p(true);
                }
                break;
            default:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    c6021p3.m6524S(-769552365);
                    InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f15850Z;
                    boolean zM6542f3 = c6021p3.m6542f(interfaceC1436k);
                    InterfaceC1426a interfaceC1426a = (InterfaceC1426a) this.f15852p0;
                    boolean zM6542f4 = zM6542f3 | c6021p3.m6542f(interfaceC1426a);
                    Object objM6514H3 = c6021p3.m6514H();
                    if (zM6542f4 || objM6514H3 == C6013l.f19514a) {
                        objM6514H3 = new C8804n(interfaceC1436k, interfaceC1426a, 0);
                        c6021p3.m6537c0(objM6514H3);
                    }
                    c6021p3.m6553p(false);
                    AbstractC3984T1.m4700s((InterfaceC1426a) objM6514H3, null, false, null, null, null, null, null, null, AbstractC8411c.m8969c(-1774689809, c6021p3, new C16280k((String) this.f15853q0, this.f15851o0, 3)), c6021p3, 805306368, 510);
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4869d0(C13767i0 c13767i0, long j10, C3582M c3582m, InterfaceC1439n interfaceC1439n, int i10) {
        super(2);
        this.f15849Y = i10;
        this.f15850Z = c13767i0;
        this.f15851o0 = j10;
        this.f15852p0 = c3582m;
        this.f15853q0 = interfaceC1439n;
    }
}
