package p946pc;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1095x1.AbstractC21075b0;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p349O0.C5975S;
import p349O0.C5994b0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.C6042z0;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p523V9.AbstractC8071d5;
import p530Vi.AbstractC8301I;
import p537W0.C8410b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13764h;
import p911o0.AbstractC17780r;
import p911o0.C17782s;
import p988rc.C18916d;
import p988rc.C18918f;

/* JADX INFO: renamed from: pc.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C18345k extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C18918f f58562Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f58563Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ EnumC18358x f58564o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C18357w f58565p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C18320E f58566q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f58567r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18345k(C18918f c18918f, InterfaceC5985X interfaceC5985X, EnumC18358x enumC18358x, C18357w c18357w, C18320E c18320e, int i10) {
        super(3);
        this.f58562Y = c18918f;
        this.f58563Z = interfaceC5985X;
        this.f58564o0 = enumC18358x;
        this.f58565p0 = c18357w;
        this.f58566q0 = c18320e;
        this.f58567r0 = i10;
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
        int iIntValue = ((Number) obj).intValue();
        C6021p c6021p = (C6021p) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        if ((iIntValue2 & 14) == 0) {
            iIntValue2 |= c6021p.m6538d(iIntValue) ? 4 : 2;
        }
        int i10 = iIntValue2 & 91;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6525T(857439464);
            c6021p.m6525T(-492369756);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            C18918f c18918f = this.f58562Y;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6428O(c18918f.f60364a ? 0.0f : 1.0f);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C5994b0 c5994b0 = (C5994b0) objM6514H;
            c6021p.m6525T(1580662750);
            boolean zM6542f = c6021p.m6542f(c5994b0);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == c5975s) {
                objM6514H2 = new C18350p(c5994b0, null);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, c17296c);
            InterfaceC5982V0 interfaceC5982V0M15261b = AbstractC13764h.m15261b(c5994b0.m6409g(), AbstractC13758e.m15255t(c18918f.f60365b, (int) AbstractC8301I.m8916g(((C18916d) this.f58563Z.getValue()).f60358a - System.currentTimeMillis(), 0L), null, 4), null, c6021p, 0, 28);
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM8483b = AbstractC8071d5.m8483b(C10456n.f30959Y, ((Number) interfaceC5982V0M15261b.getValue()).floatValue());
            c6021p.m6525T(733328855);
            C17782s c17782sM19512f = AbstractC17780r.m19512f(0, c6021p, false);
            c6021p.m6525T(-1323940314);
            int i11 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            C8410b c8410bM21570k = AbstractC21075b0.m21570k(interfaceC10459qM8483b);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17782sM19512f);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                AbstractC0168G.m537z(i11, c6021p, i11, c21694h);
            }
            c8410bM21570k.invoke(new C6042z0(c6021p), c6021p, 0);
            c6021p.m6525T(2058660585);
            int iOrdinal = this.f58564o0.ordinal();
            C18357w c18357w = this.f58565p0;
            C18320E c18320e = this.f58566q0;
            int i12 = this.f58567r0;
            if (iOrdinal == 0) {
                c6021p.m6525T(643122615);
                InterfaceC1436k interfaceC1436k = c18357w.f58615d;
                AbstractC16544l.m18091d(interfaceC1436k);
                C18359y c18359y = (C18359y) interfaceC1436k.invoke(c18320e);
                c18359y.getClass();
                c6021p.m6525T(1968827457);
                c18359y.f58620a.mo985d(Integer.valueOf(i12), Integer.valueOf(iIntValue), c6021p, Integer.valueOf((iIntValue2 << 3) & 112));
                c6021p.m6553p(false);
                c6021p.m6553p(false);
            } else if (iOrdinal != 1) {
                c6021p.m6525T(643122735);
                c6021p.m6553p(false);
            } else {
                c6021p.m6525T(643122701);
                InterfaceC1436k interfaceC1436k2 = c18357w.f58616e;
                AbstractC16544l.m18091d(interfaceC1436k2);
                C18334T c18334t = (C18334T) interfaceC1436k2.invoke(c18320e);
                c18334t.getClass();
                c6021p.m6525T(1564770975);
                c18334t.f58524a.invoke(Integer.valueOf(i12), c6021p, 0);
                c6021p.m6553p(false);
                c6021p.m6553p(false);
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            c6021p.m6553p(false);
            c6021p.m6553p(false);
        }
        return c17296c;
    }
}
