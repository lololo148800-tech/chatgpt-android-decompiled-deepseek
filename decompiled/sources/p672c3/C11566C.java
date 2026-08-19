package p672c3;

import java.util.ArrayList;
import java.util.Iterator;
import p492U1.C7542g;
import p637a3.AbstractC10494k;
import p637a3.InterfaceC10492i;
import p637a3.InterfaceC10497n;
import p776h3.C14398l;
import p776h3.C14404r;
import p884m3.C17146e;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: c3.C */
/* JADX INFO: loaded from: classes.dex */
public final class C11566C extends AbstractC10494k {

    /* JADX INFO: renamed from: d */
    public long f34967d;

    /* JADX INFO: renamed from: e */
    public InterfaceC11563A0 f34968e;

    public C11566C() {
        super(0, 3);
        this.f34967d = 9205357640488583168L;
        this.f34968e = C11644z0.f35273a;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: a */
    public final InterfaceC10492i mo10955a() {
        C11566C c11566c = new C11566C();
        c11566c.f34967d = this.f34967d;
        c11566c.f34968e = this.f34968e;
        ArrayList arrayList = c11566c.f31096c;
        ArrayList arrayList2 = this.f31096c;
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((InterfaceC10492i) it.next()).mo10955a());
        }
        arrayList.addAll(arrayList3);
        return c11566c;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: b */
    public final InterfaceC10497n mo10956b() {
        InterfaceC10497n interfaceC10497nMo10956b;
        InterfaceC10492i interfaceC10492i = (InterfaceC10492i) AbstractC17680n.m19367q0(this.f31096c);
        if (interfaceC10492i != null && (interfaceC10497nMo10956b = interfaceC10492i.mo10956b()) != null) {
            return interfaceC10497nMo10956b;
        }
        C17146e c17146e = C17146e.f54816a;
        return new C14404r(c17146e).mo10952b(new C14398l(c17146e));
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: c */
    public final void mo10957c(InterfaceC10497n interfaceC10497n) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    public final String toString() {
        return "EmittableSizeBox(size=" + ((Object) C7542g.m7878c(this.f34967d)) + ", sizeMode=" + this.f34968e + ", children=[\n" + m10958d() + "\n])";
    }
}
