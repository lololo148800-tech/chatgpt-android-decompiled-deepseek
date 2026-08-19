package p229J0;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import cd.AbstractC11703c;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p017Af.C0491v;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p156G1.AbstractC2965l;
import p278L0.AbstractC4846J;
import p302M0.AbstractC5253e;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7306j;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8479G;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17790w;
import p911o0.C17794y;

/* JADX INFO: renamed from: J0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C4065i extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12930Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f12931Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8410b f12932o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4065i(InterfaceC10459q interfaceC10459q, C8410b c8410b, int i10) {
        super(2);
        this.f12930Y = i10;
        this.f12931Z = interfaceC10459q;
        this.f12932o0 = c8410b;
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
    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17296C c17296c = C17296C.f55119a;
        C8410b c8410b = this.f12932o0;
        switch (this.f12930Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    String strM5496e = AbstractC4846J.m5496e(R.string.m3c_dialog, c6021p);
                    InterfaceC10459q interfaceC10459qM11255o = AbstractC10844c.m11255o(this.f12931Z, AbstractC4071j.f12953a, 0.0f, AbstractC4071j.f12954b, 0.0f, 10);
                    C10456n c10456n = C10456n.f30959Y;
                    boolean zM6542f = c6021p.m6542f(strM5496e);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == C6013l.f19514a) {
                        objM6514H = new C0491v(strM5496e, 14);
                        c6021p.m6537c0(objM6514H);
                    }
                    InterfaceC10459q interfaceC10459qMo428M = interfaceC10459qM11255o.mo428M(AbstractC2965l.m3789a(c10456n, false, (InterfaceC1436k) objM6514H));
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, true);
                    int i10 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qMo428M);
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
                    c8410b.invoke(c6021p, 0);
                    c6021p.m6553p(true);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    float f10 = AbstractC4017a.f12601a;
                    AbstractC4034c4.m4725a(this.f12931Z, AbstractC4141u3.m4770a(AbstractC5253e.f17195a, c6021p2), 0L, 0L, AbstractC7306j.f23147e, 0.0f, null, AbstractC8411c.m8969c(-241131160, c6021p2, new C4108p0(c8410b, 7)), c6021p2, 12607488, 108);
                }
                break;
            default:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM9126g = AbstractC8479G.m9126g(AbstractC10842a.m11239q(AbstractC10842a.m11235m(this.f12931Z, 0.0f, AbstractC11703c.f35510a, 1), 2), AbstractC8479G.m9124e(c6021p3), 14);
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p3, 0);
                    int i11 = c6021p3.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p3.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p3, interfaceC10459qM9126g);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i2 = C21698j.f68869b;
                    c6021p3.m6528W();
                    if (c6021p3.f19563O) {
                        c6021p3.m6549l(c21696i2);
                    } else {
                        c6021p3.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p3, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p3, interfaceC6008i0M6550m2);
                    C21694h c21694h2 = C21698j.f68874g;
                    if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p3.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p3, i11, c21694h2);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p3, interfaceC10459qM10923d2);
                    c8410b.invoke(C17794y.f56777a, c6021p3, 6);
                    c6021p3.m6553p(true);
                }
                break;
        }
        return c17296c;
    }
}
