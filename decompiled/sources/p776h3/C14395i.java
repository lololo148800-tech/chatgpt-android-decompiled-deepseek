package p776h3;

import java.util.ArrayList;
import java.util.Iterator;
import p637a3.AbstractC10494k;
import p637a3.C10495l;
import p637a3.InterfaceC10492i;
import p637a3.InterfaceC10497n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: h3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C14395i extends AbstractC10494k {

    /* JADX INFO: renamed from: d */
    public InterfaceC10497n f45132d;

    /* JADX INFO: renamed from: e */
    public int f45133e;

    /* JADX INFO: renamed from: f */
    public int f45134f;

    public C14395i() {
        super(0, 3);
        this.f45132d = C10495l.f31097a;
        this.f45133e = 0;
        this.f45134f = 0;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: a */
    public final InterfaceC10492i mo10955a() {
        C14395i c14395i = new C14395i();
        c14395i.f45132d = this.f45132d;
        c14395i.f45133e = this.f45133e;
        c14395i.f45134f = this.f45134f;
        ArrayList arrayList = c14395i.f31096c;
        ArrayList arrayList2 = this.f31096c;
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((InterfaceC10492i) it.next()).mo10955a());
        }
        arrayList.addAll(arrayList3);
        return c14395i;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: b */
    public final InterfaceC10497n mo10956b() {
        return this.f45132d;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: c */
    public final void mo10957c(InterfaceC10497n interfaceC10497n) {
        this.f45132d = interfaceC10497n;
    }

    public final String toString() {
        return "EmittableColumn(modifier=" + this.f45132d + ", verticalAlignment=" + ((Object) C14388b.m15894c(this.f45133e)) + ", horizontalAlignment=" + ((Object) C14387a.m15891c(this.f45134f)) + ", children=[\n" + m10958d() + "\n])";
    }
}
