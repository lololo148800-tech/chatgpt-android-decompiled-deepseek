package p672c3;

import java.util.ArrayList;
import java.util.Iterator;
import p637a3.AbstractC10494k;
import p637a3.C10495l;
import p637a3.InterfaceC10492i;
import p637a3.InterfaceC10497n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: c3.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11628r0 extends AbstractC10494k {

    /* JADX INFO: renamed from: d */
    public final int f35243d;

    /* JADX INFO: renamed from: e */
    public InterfaceC10497n f35244e;

    public C11628r0(int i10) {
        super(i10, 2);
        this.f35243d = i10;
        this.f35244e = C10495l.f31097a;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: a */
    public final InterfaceC10492i mo10955a() {
        C11628r0 c11628r0 = new C11628r0(this.f35243d);
        c11628r0.f35244e = this.f35244e;
        ArrayList arrayList = c11628r0.f31096c;
        ArrayList arrayList2 = this.f31096c;
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((InterfaceC10492i) it.next()).mo10955a());
        }
        arrayList.addAll(arrayList3);
        return c11628r0;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: b */
    public final InterfaceC10497n mo10956b() {
        return this.f35244e;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: c */
    public final void mo10957c(InterfaceC10497n interfaceC10497n) {
        this.f35244e = interfaceC10497n;
    }

    public final String toString() {
        return "RemoteViewsRoot(modifier=" + this.f35244e + ", children=[\n" + m10958d() + "\n])";
    }
}
