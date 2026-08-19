package p389Pn;

import java.util.ArrayList;
import java.util.Iterator;
import om.C18235b;
import p412Qn.InterfaceC6762c;
import p437Rn.C6960r;
import p571X9.AbstractC9393x3;
import p909nm.C17689w;

/* JADX INFO: renamed from: Pn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6517b implements InterfaceC6530o {

    /* JADX INFO: renamed from: a */
    public final C6522g f21125a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f21126b;

    public C6517b(C6522g c6522g, ArrayList arrayList) {
        this.f21125a = c6522g;
        this.f21126b = arrayList;
    }

    @Override // p389Pn.InterfaceC6527l
    /* JADX INFO: renamed from: a */
    public final InterfaceC6762c mo7085a() {
        return this.f21125a.mo7085a();
    }

    @Override // p389Pn.InterfaceC6527l
    /* JADX INFO: renamed from: b */
    public final C6960r mo7086b() {
        C17689w c17689w = C17689w.f56480Y;
        C18235b c18235bM9972b = AbstractC9393x3.m9972b();
        c18235bM9972b.add(this.f21125a.mo7086b());
        Iterator it = this.f21126b.iterator();
        while (it.hasNext()) {
            c18235bM9972b.add(((InterfaceC6527l) it.next()).mo7086b());
        }
        return new C6960r(c17689w, AbstractC9393x3.m9971a(c18235bM9972b));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6517b) {
            C6517b c6517b = (C6517b) obj;
            if (this.f21125a.equals(c6517b.f21125a) && this.f21126b.equals(c6517b.f21126b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f21126b.hashCode() + (this.f21125a.hashCode() * 31);
    }

    public final String toString() {
        return "AlternativesParsing(" + this.f21126b + ')';
    }
}
