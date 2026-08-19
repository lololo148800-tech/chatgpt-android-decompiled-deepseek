package p1099x6;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p001A.C0017I0;
import p025An.AbstractC0575H;
import p060C6.C1607d;
import p086D6.C1970n;
import p086D6.InterfaceC1957a;
import p1034u6.AbstractC20125c;
import p1034u6.C20124b;
import p1034u6.C20127e;
import p1034u6.C20141s;
import p1034u6.C20142t;
import p1034u6.InterfaceC20123a;
import p103Dn.C2162V0;
import p103Dn.C2215x0;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p1057v6.C20463c;
import p523V9.AbstractC8047a5;
import p826j6.C16137F;
import p900n6.C17510g;
import p917o6.C17852e;
import p917o6.C17853f;
import p917o6.C17867t;
import p917o6.InterfaceC17833A;
import p917o6.InterfaceC17835C;
import p917o6.InterfaceC17838F;
import p917o6.InterfaceC17841I;
import p917o6.InterfaceC17842J;
import p917o6.InterfaceC17845M;
import p917o6.InterfaceC17846N;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: x6.k */
/* JADX INFO: loaded from: classes.dex */
public final class C21143k implements InterfaceC1957a, InterfaceC20123a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67189a;

    /* JADX INFO: renamed from: b */
    public final C0017I0 f67190b;

    public /* synthetic */ C21143k(C0017I0 c0017i0, int i10) {
        this.f67189a = i10;
        this.f67190b = c0017i0;
    }

    @Override // p086D6.InterfaceC1957a
    /* JADX INFO: renamed from: a */
    public final InterfaceC2184i mo3140a(C17852e request, C16137F c16137f) {
        int i10 = this.f67189a;
        AbstractC16544l.m18094g(request, "request");
        switch (i10) {
            case 0:
                InterfaceC17842J interfaceC17842J = request.f56921a;
                boolean z6 = interfaceC17842J instanceof InterfaceC17838F;
                InterfaceC17835C interfaceC17835C = request.f56923c;
                if (z6) {
                    InterfaceC17833A interfaceC17833AMo4141d = interfaceC17835C.mo4141d(C17867t.f56959e);
                    AbstractC16544l.m18091d(interfaceC17833AMo4141d);
                    return new C2219z0(new C21136d(request, this, (C17867t) interfaceC17833AMo4141d, c16137f, null));
                }
                if (!(interfaceC17842J instanceof InterfaceC17846N)) {
                    throw new IllegalStateException(("Unknown operation " + interfaceC17842J).toString());
                }
                InterfaceC17833A interfaceC17833AMo4141d2 = interfaceC17835C.mo4141d(C17867t.f56959e);
                AbstractC16544l.m18091d(interfaceC17833AMo4141d2);
                return new C2219z0(new C21137e(((C20127e) interfaceC17835C.mo4141d(C20127e.f63759a)) != null, this, request, (C17867t) interfaceC17833AMo4141d2, c16137f, null));
            default:
                C20124b c20124b = C20141s.f63801b;
                InterfaceC17835C interfaceC17835C2 = request.f56923c;
                C20141s c20141s = (C20141s) interfaceC17835C2.mo4141d(c20124b);
                if (c20141s == null) {
                    return c16137f.m17695n(request);
                }
                InterfaceC17842J interfaceC17842J2 = request.f56921a;
                if (!(interfaceC17842J2 instanceof InterfaceC17846N)) {
                    throw new IllegalStateException("It's impossible to watch a mutation or subscription");
                }
                InterfaceC17833A interfaceC17833AMo4141d3 = interfaceC17835C2.mo4141d(C17867t.f56959e);
                AbstractC16544l.m18091d(interfaceC17833AMo4141d3);
                C17867t c17867t = (C17867t) interfaceC17833AMo4141d3;
                C16525B c16525b = new C16525B();
                C0017I0 c0017i0 = this.f67190b;
                InterfaceC17845M interfaceC17845M = c20141s.f63802a;
                c16525b.f51262Y = interfaceC17845M != null ? AbstractC8047a5.m8435h(AbstractC8047a5.m8436i(interfaceC17842J2, interfaceC17845M, c17867t, (C20463c) c0017i0.f64Y).values()) : null;
                C2215x0 c2215x0 = (C2215x0) c0017i0.f67p0;
                AbstractC16544l.m18092e(c2215x0, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlow<kotlin.Any>");
                C21150r c21150r = new C21150r(new C1970n(new C2162V0(c2215x0, new C21151s(2, null)), 27, c16525b), request, c16137f, c16525b, this, c17867t);
                C1607d c1607d = AbstractC21154v.f67230a;
                return new C2219z0(new C21153u(c21150r, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0074 A[RETURN] */
    /* JADX INFO: renamed from: b */
    public Object m21591b(C17852e c17852e, C17853f c17853f, C17867t c17867t, Set set, AbstractC19687c abstractC19687c) {
        Object objInvoke;
        AbstractC16544l.m18094g(c17852e, "<this>");
        C20124b c20124b = AbstractC20125c.f63753b;
        InterfaceC17835C interfaceC17835C = c17852e.f56923c;
        if (interfaceC17835C.mo4141d(c20124b) != null) {
            throw new ClassCastException();
        }
        InterfaceC17841I interfaceC17841I = c17853f.f56933c;
        C17296C c17296c = C17296C.f55119a;
        if (interfaceC17841I == null) {
            return c17296c;
        }
        Collection collection = (Collection) c17853f.f56934d;
        if (collection != null && !collection.isEmpty()) {
            if (interfaceC17835C.mo4141d(AbstractC20125c.f63756e) == null) {
                return c17296c;
            }
            throw new ClassCastException();
        }
        C21139g c21139g = new C21139g(c17853f, c17852e, this, c17867t, set, null);
        C20142t c20142t = (C20142t) interfaceC17835C.mo4141d(C20142t.f63803b);
        if (!(c20142t != null ? c20142t.f63804a : false)) {
            objInvoke = c21139g.invoke(abstractC19687c);
            if (objInvoke != EnumC19250a.f61036Y) {
            }
            if (objInvoke == EnumC19250a.f61036Y) {
                return objInvoke;
            }
            return c17296c;
        }
        InterfaceC17833A interfaceC17833AMo4141d = interfaceC17835C.mo4141d(C17510g.f56005c);
        AbstractC16544l.m18091d(interfaceC17833AMo4141d);
        AbstractC0575H.m1156D(((C17510g) interfaceC17833AMo4141d).f56007b, null, null, new C21138f(c21139g, null), 3);
        objInvoke = c17296c;
        if (objInvoke == EnumC19250a.f61036Y) {
            return objInvoke;
        }
        return c17296c;
    }
}
