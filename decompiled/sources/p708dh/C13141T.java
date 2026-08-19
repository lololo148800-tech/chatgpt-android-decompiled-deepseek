package p708dh;

import gh.C14146n;
import ni.C17627a;
import p025An.AbstractC0575H;
import p025An.EnumC0573G;
import p071Ch.C1670a;
import p072Ci.EnumC1702g;
import p077Cn.EnumC1733a;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;
import p103Dn.C2133G0;
import p103Dn.C2137I0;
import p103Dn.C2197o0;
import p103Dn.C2207t0;
import p103Dn.C2215x0;
import p103Dn.InterfaceC2184i;
import p153Fn.C2942t;
import p195Hh.C3430e;
import p523V9.AbstractC8168p6;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p985r9.C18903m;

/* JADX INFO: renamed from: dh.T */
/* JADX INFO: loaded from: classes3.dex */
public final class C13141T {

    /* JADX INFO: renamed from: a */
    public final C14146n f41718a;

    /* JADX INFO: renamed from: b */
    public final C13133K f41719b;

    /* JADX INFO: renamed from: c */
    public final C3430e f41720c = AbstractC8168p6.m8749b("UserAnnouncementsRepository", null);

    /* JADX INFO: renamed from: d */
    public final C2215x0 f41721d;

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
    public C13141T(C14146n c14146n, C13132J c13132j, C13133K c13133k, C17627a c17627a) {
        this.f41718a = c14146n;
        this.f41719b = c13133k;
        InterfaceC2184i interfaceC2184iM3215n = AbstractC2124C.m3215n(new C2207t0(c13132j.f41695r0, c13133k.f41697b, new C1670a(3, (InterfaceC18770c) null, 6), 0));
        C2137I0 c2137i0 = C2133G0.f6536a;
        C18903m c18903mM3213l = AbstractC2124C.m3213l(interfaceC2184iM3215n, 1);
        C2127D0 c2127d0M3202a = AbstractC2124C.m3202a(1, c18903mM3213l.f60267a, (EnumC1733a) c18903mM3213l.f60269c);
        C2942t c2942t = AbstractC2124C.f6496c;
        AbstractC0575H.m1155C(c17627a, (InterfaceC18776i) c18903mM3213l.f60270d, c2137i0.equals(c2137i0) ? EnumC0573G.f1790Y : EnumC0573G.f1793p0, new C2197o0(c2137i0, (InterfaceC2184i) c18903mM3213l.f60268b, c2127d0M3202a, c2942t, null));
        C2215x0 c2215x0 = new C2215x0(c2127d0M3202a);
        this.f41721d = c2215x0;
        AbstractC2124C.m3226y(new C1970n(c2215x0, 5, new C13138P(this, null)), c17627a);
    }

    /* JADX INFO: renamed from: a */
    public final void m14818a(EnumC1702g enumC1702g) {
        this.f41719b.m14817a(new C13137O(enumC1702g, 1));
    }
}
