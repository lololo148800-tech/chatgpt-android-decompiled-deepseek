package p911o0;

import af.C10561Q;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p492U1.EnumC7546k;
import p571X9.AbstractC9113C4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10451i;
import p635a1.InterfaceC10446d;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: o0.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17780r {

    /* JADX INFO: renamed from: a */
    public static final HashMap f56753a = m19509c(true);

    /* JADX INFO: renamed from: b */
    public static final HashMap f56754b = m19509c(false);

    /* JADX INFO: renamed from: c */
    public static final C17782s f56755c = new C17782s(C10444b.f30934Y, false);

    /* JADX INFO: renamed from: d */
    public static final C17778q f56756d = C17778q.f56744b;

    /* JADX INFO: renamed from: a */
    public static final void m19507a(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-211209833);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            int i12 = c6021p.f19564P;
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, f56756d);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10561Q(interfaceC10459q, i10, 17);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19508b(AbstractC21068W abstractC21068W, AbstractC21069X abstractC21069X, InterfaceC21056J interfaceC21056J, EnumC7546k enumC7546k, int i10, int i11, InterfaceC10446d interfaceC10446d) {
        C10451i c10451i;
        Object objMo21534t = interfaceC21056J.mo21534t();
        C17774o c17774o = objMo21534t instanceof C17774o ? (C17774o) objMo21534t : null;
        AbstractC21068W.m21537f(abstractC21068W, abstractC21069X, ((c17774o == null || (c10451i = c17774o.f56733z0) == null) ? interfaceC10446d : c10451i).mo10925a(AbstractC9113C4.m9643a(abstractC21069X.f66981Y, abstractC21069X.f66982Z), AbstractC9113C4.m9643a(i10, i11), enumC7546k));
    }

    /* JADX INFO: renamed from: c */
    public static final HashMap m19509c(boolean z6) {
        HashMap map = new HashMap(9);
        m19510d(map, z6, C10444b.f30934Y);
        m19510d(map, z6, C10444b.f30935Z);
        m19510d(map, z6, C10444b.f30936o0);
        m19510d(map, z6, C10444b.f30937p0);
        m19510d(map, z6, C10444b.f30938q0);
        m19510d(map, z6, C10444b.f30939r0);
        m19510d(map, z6, C10444b.f30940s0);
        m19510d(map, z6, C10444b.f30941t0);
        m19510d(map, z6, C10444b.f30942u0);
        return map;
    }

    /* JADX INFO: renamed from: d */
    public static final void m19510d(HashMap map, boolean z6, C10451i c10451i) {
        map.put(c10451i, new C17782s(c10451i, z6));
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC21057K m19511e(InterfaceC10446d interfaceC10446d, boolean z6) {
        InterfaceC21057K interfaceC21057K = (InterfaceC21057K) (z6 ? f56753a : f56754b).get(interfaceC10446d);
        return interfaceC21057K == null ? new C17782s(interfaceC10446d, z6) : interfaceC21057K;
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
    /* JADX INFO: renamed from: f */
    public static final C17782s m19512f(int i10, C6021p c6021p, boolean z6) {
        C10451i c10451i = C10444b.f30934Y;
        if (c10451i.equals(c10451i) && !z6) {
            c6021p.m6524S(-1710139705);
            c6021p.m6553p(false);
            return f56755c;
        }
        c6021p.m6524S(-1710100211);
        boolean zM6542f = c6021p.m6542f(c10451i);
        boolean z10 = true;
        if ((((i10 & 112) ^ 48) <= 32 || !c6021p.m6544g(z6)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean z11 = zM6542f | z10;
        Object objM6514H = c6021p.m6514H();
        if (z11 || objM6514H == C6013l.f19514a) {
            objM6514H = new C17782s(c10451i, z6);
            c6021p.m6537c0(objM6514H);
        }
        C17782s c17782s = (C17782s) objM6514H;
        c6021p.m6553p(false);
        return c17782s;
    }
}
