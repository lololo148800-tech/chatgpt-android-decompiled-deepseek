package p389Pn;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import om.C18235b;
import p003A1.C0292u;
import p229J0.C4171z3;
import p412Qn.C6760a;
import p412Qn.C6761b;
import p412Qn.InterfaceC6762c;
import p437Rn.C6960r;
import p437Rn.C6967y;
import p571X9.AbstractC9276e0;
import p571X9.AbstractC9327m3;
import p571X9.AbstractC9393x3;
import p586Y0.C9572x;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: renamed from: Pn.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C6532q implements InterfaceC6530o {

    /* JADX INFO: renamed from: a */
    public final String f21147a;

    /* JADX INFO: renamed from: b */
    public final C6522g f21148b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f21149c;

    public C6532q(String onZero, C6522g c6522g) {
        AbstractC16544l.m18094g(onZero, "onZero");
        this.f21147a = onZero;
        this.f21148b = c6522g;
        C18235b c18235bM9972b = AbstractC9393x3.m9972b();
        AbstractC9276e0.m9844a(c18235bM9972b, c6522g);
        C18235b c18235bM9971a = AbstractC9393x3.m9971a(c18235bM9972b);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c18235bM9971a, 10));
        ListIterator listIterator = c18235bM9971a.listIterator(0);
        while (true) {
            C9572x c9572x = (C9572x) listIterator;
            if (!c9572x.hasNext()) {
                break;
            } else {
                arrayList.add(((InterfaceC6526k) c9572x.next()).mo6322c());
            }
        }
        List<AbstractC6516a> listM19335K = AbstractC17680n.m19335K(arrayList);
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(listM19335K, 10));
        for (AbstractC6516a field : listM19335K) {
            AbstractC16544l.m18094g(field, "field");
            Object objMo7082b = field.mo7082b();
            if (objMo7082b == null) {
                throw new IllegalArgumentException(("The field '" + field.mo7083c() + "' does not define a default value").toString());
            }
            arrayList2.add(new C6531p(field.mo7081a(), objMo7082b));
        }
        this.f21149c = arrayList2;
    }

    @Override // p389Pn.InterfaceC6527l
    /* JADX INFO: renamed from: a */
    public final InterfaceC6762c mo7085a() {
        InterfaceC6762c interfaceC6762cMo7085a = this.f21148b.mo7085a();
        ArrayList<C6531p> arrayList = this.f21149c;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        for (C6531p c6531p : arrayList) {
            arrayList2.add(new C6521f(c6531p.f21146b, new C0292u(1, c6531p.f21145a, C6534s.class, "getter", "getter(Ljava/lang/Object;)Ljava/lang/Object;", 0, 18)));
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        C6537v c6537v = C6537v.f21155a;
        Object c6523h = zIsEmpty ? c6537v : arrayList2.size() == 1 ? (InterfaceC6533r) AbstractC17680n.m19365o0(arrayList2) : new C6523h(arrayList2);
        boolean z6 = c6523h instanceof C6537v;
        String str = this.f21147a;
        return z6 ? new C6760a(str) : new C6761b(AbstractC17681o.m19382k(new C17309l(new C0292u(1, c6523h, InterfaceC6533r.class, "test", "test(Ljava/lang/Object;)Z", 0, 19), new C6760a(str)), new C17309l(new C0292u(1, c6537v, C6537v.class, "test", "test(Ljava/lang/Object;)Z", 0, 20), interfaceC6762cMo7085a)));
    }

    @Override // p389Pn.InterfaceC6527l
    /* JADX INFO: renamed from: b */
    public final C6960r mo7086b() {
        C17689w c17689w = C17689w.f56480Y;
        return new C6960r(c17689w, AbstractC17681o.m19382k(this.f21148b.mo7086b(), AbstractC9327m3.m9921a(AbstractC17681o.m19382k(new C6524i(this.f21147a).mo7086b(), new C6960r(this.f21149c.isEmpty() ? c17689w : AbstractC9393x3.m9974d(new C6967y(new C4171z3(this, 28))), c17689w)))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6532q) {
            C6532q c6532q = (C6532q) obj;
            if (AbstractC16544l.m18089b(this.f21147a, c6532q.f21147a) && this.f21148b.equals(c6532q.f21148b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f21148b.hashCode() + (this.f21147a.hashCode() * 31);
    }

    public final String toString() {
        return "Optional(" + this.f21147a + ", " + this.f21148b + ')';
    }
}
