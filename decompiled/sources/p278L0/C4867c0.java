package p278L0;

import androidx.compose.p650ui.graphics.AbstractC10864a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1095x1.AbstractC21075b0;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p204I1.C3582M;
import p228J.AbstractC3794B0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.C6042z0;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p492U1.InterfaceC7537b;
import p537W0.C8410b;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p758g0.C13767i0;
import p911o0.AbstractC17780r;
import p988rc.C18913a;
import p988rc.C18915c;

/* JADX INFO: renamed from: L0.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4867c0 extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15841Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f15842Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5982V0 f15843o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f15844p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f15845q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4867c0(long j10, InterfaceC5985X interfaceC5985X, C18913a c18913a, InterfaceC7537b interfaceC7537b) {
        super(3);
        this.f15842Z = j10;
        this.f15843o0 = interfaceC5985X;
        this.f15844p0 = c18913a;
        this.f15845q0 = interfaceC7537b;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f15841Y) {
            case 0:
                InterfaceC10459q interfaceC10459q = (InterfaceC10459q) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6021p.m6542f(interfaceC10459q) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C13767i0 c13767i0 = (C13767i0) this.f15843o0;
                    boolean zM6542f = c6021p.m6542f(c13767i0);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == C6013l.f19514a) {
                        objM6514H = new C4865b0(c13767i0, 0);
                        c6021p.m6537c0(objM6514H);
                    }
                    InterfaceC10459q interfaceC10459qM11305a = AbstractC10864a.m11305a(interfaceC10459q, (InterfaceC1436k) objM6514H);
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
                    AbstractC4879i0.m5510b(this.f15842Z, (C3582M) this.f15844p0, (InterfaceC1439n) this.f15845q0, c6021p, 0);
                    c6021p.m6553p(true);
                }
                break;
            default:
                String alternateText = (String) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(alternateText, "alternateText");
                if ((iIntValue2 & 14) == 0) {
                    iIntValue2 |= c6021p2.m6542f(alternateText) ? 4 : 2;
                }
                if ((iIntValue2 & 91) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    c6021p2.m6525T(969483632);
                    long j10 = this.f15842Z;
                    boolean zM6540e = c6021p2.m6540e(j10);
                    InterfaceC5985X interfaceC5985X = (InterfaceC5985X) this.f15843o0;
                    boolean zM6542f2 = zM6540e | c6021p2.m6542f(interfaceC5985X);
                    Object objM6514H2 = c6021p2.m6514H();
                    if (zM6542f2 || objM6514H2 == C6013l.f19514a) {
                        objM6514H2 = new C18915c(j10, interfaceC5985X);
                        c6021p2.m6537c0(objM6514H2);
                    }
                    InterfaceC21057K interfaceC21057K = (InterfaceC21057K) objM6514H2;
                    c6021p2.m6553p(false);
                    c6021p2.m6525T(-1323940314);
                    C10456n c10456n = C10456n.f30959Y;
                    int i11 = c6021p2.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p2.m6550m();
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i2 = C21698j.f68869b;
                    C8410b c8410bM21570k = AbstractC21075b0.m21570k(c10456n);
                    c6021p2.m6528W();
                    if (c6021p2.f19563O) {
                        c6021p2.m6549l(c21696i2);
                    } else {
                        c6021p2.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p2, interfaceC21057K);
                    C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m2);
                    C21694h c21694h2 = C21698j.f68874g;
                    if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p2, i11, c21694h2);
                    }
                    c8410bM21570k.invoke(new C6042z0(c6021p2), c6021p2, 0);
                    c6021p2.m6525T(2058660585);
                    ((C18913a) this.f15844p0).f60351d.mo985d((InterfaceC7537b) this.f15845q0, alternateText, c6021p2, Integer.valueOf((iIntValue2 << 3) & 112));
                    AbstractC3794B0.m4471F(c6021p2, false, true, false);
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4867c0(C13767i0 c13767i0, long j10, C3582M c3582m, InterfaceC1439n interfaceC1439n) {
        super(3);
        this.f15843o0 = c13767i0;
        this.f15842Z = j10;
        this.f15844p0 = c3582m;
        this.f15845q0 = interfaceC1439n;
    }
}
