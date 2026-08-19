package p389Pn;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import om.C18235b;
import p003A1.C0227a;
import p346Nn.C5891c0;
import p412Qn.C6760a;
import p412Qn.InterfaceC6762c;
import p437Rn.C6960r;
import p437Rn.C6964v;
import p571X9.AbstractC9276e0;
import p571X9.AbstractC9327m3;
import p571X9.AbstractC9393x3;
import p586Y0.C9572x;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17689w;

/* JADX INFO: renamed from: Pn.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C6536u implements InterfaceC6530o {

    /* JADX INFO: renamed from: a */
    public final C6519d f21153a;

    /* JADX INFO: renamed from: b */
    public final Set f21154b;

    public C6536u(C6519d c6519d) {
        this.f21153a = c6519d;
        C18235b c18235bM9972b = AbstractC9393x3.m9972b();
        AbstractC9276e0.m9844a(c18235bM9972b, c6519d);
        C18235b c18235bM9971a = AbstractC9393x3.m9971a(c18235bM9972b);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = c18235bM9971a.listIterator(0);
        while (true) {
            C9572x c9572x = (C9572x) listIterator;
            if (!c9572x.hasNext()) {
                break;
            }
            C5891c0 c5891c0Mo7084d = ((InterfaceC6526k) c9572x.next()).mo6322c().mo7084d();
            if (c5891c0Mo7084d != null) {
                arrayList.add(c5891c0Mo7084d);
            }
        }
        Set setM19328G0 = AbstractC17680n.m19328G0(arrayList);
        this.f21154b = setM19328G0;
        if (setM19328G0.isEmpty()) {
            throw new IllegalArgumentException("Signed format must contain at least one field with a sign");
        }
    }

    @Override // p389Pn.InterfaceC6527l
    /* JADX INFO: renamed from: a */
    public final InterfaceC6762c mo7085a() {
        InterfaceC6762c formatter = this.f21153a.f21128a.mo6320a();
        new C6535t(this);
        AbstractC16544l.m18094g(formatter, "formatter");
        return new C6760a();
    }

    @Override // p389Pn.InterfaceC6527l
    /* JADX INFO: renamed from: b */
    public final C6960r mo7086b() {
        return AbstractC9327m3.m9921a(AbstractC17681o.m19382k(new C6960r(AbstractC9393x3.m9974d(new C6964v(new C0227a(this, 21), "sign for " + this.f21154b)), C17689w.f56480Y), this.f21153a.f21128a.mo6321b()));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6536u) {
            if (this.f21153a.equals(((C6536u) obj).f21153a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f21153a.f21128a.hashCode() * 31) + 1231;
    }

    public final String toString() {
        return "SignedFormatStructure(" + this.f21153a + ')';
    }
}
