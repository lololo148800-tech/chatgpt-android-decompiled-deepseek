package p776h3;

import java.util.ArrayList;
import java.util.Iterator;
import p637a3.AbstractC10494k;
import p637a3.C10495l;
import p637a3.InterfaceC10492i;
import p637a3.InterfaceC10497n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: h3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C14396j extends AbstractC10494k {

    /* JADX INFO: renamed from: d */
    public InterfaceC10497n f45135d;

    /* JADX INFO: renamed from: e */
    public int f45136e;

    /* JADX INFO: renamed from: f */
    public int f45137f;

    public C14396j() {
        super(0, 3);
        this.f45135d = C10495l.f31097a;
        this.f45136e = 0;
        this.f45137f = 0;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: a */
    public final InterfaceC10492i mo10955a() {
        C14396j c14396j = new C14396j();
        c14396j.f45135d = this.f45135d;
        c14396j.f45136e = this.f45136e;
        c14396j.f45137f = this.f45137f;
        ArrayList arrayList = c14396j.f31096c;
        ArrayList arrayList2 = this.f31096c;
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((InterfaceC10492i) it.next()).mo10955a());
        }
        arrayList.addAll(arrayList3);
        return c14396j;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: b */
    public final InterfaceC10497n mo10956b() {
        return this.f45135d;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: c */
    public final void mo10957c(InterfaceC10497n interfaceC10497n) {
        this.f45135d = interfaceC10497n;
    }

    public final String toString() {
        return "EmittableRow(modifier=" + this.f45135d + ", horizontalAlignment=" + ((Object) C14387a.m15891c(this.f45136e)) + ", verticalAlignment=" + ((Object) C14388b.m15894c(this.f45137f)) + ", children=[\n" + m10958d() + "\n])";
    }
}
