package p776h3;

import java.util.ArrayList;
import java.util.Iterator;
import p637a3.AbstractC10494k;
import p637a3.C10495l;
import p637a3.InterfaceC10492i;
import p637a3.InterfaceC10497n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: h3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C14394h extends AbstractC10494k {

    /* JADX INFO: renamed from: d */
    public InterfaceC10497n f45130d;

    /* JADX INFO: renamed from: e */
    public C14389c f45131e;

    public C14394h() {
        super(0, 3);
        this.f45130d = C10495l.f31097a;
        this.f45131e = C14389c.f45116c;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: a */
    public final InterfaceC10492i mo10955a() {
        C14394h c14394h = new C14394h();
        c14394h.f45130d = this.f45130d;
        c14394h.f45131e = this.f45131e;
        ArrayList arrayList = c14394h.f31096c;
        ArrayList arrayList2 = this.f31096c;
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((InterfaceC10492i) it.next()).mo10955a());
        }
        arrayList.addAll(arrayList3);
        return c14394h;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: b */
    public final InterfaceC10497n mo10956b() {
        return this.f45130d;
    }

    @Override // p637a3.InterfaceC10492i
    /* JADX INFO: renamed from: c */
    public final void mo10957c(InterfaceC10497n interfaceC10497n) {
        this.f45130d = interfaceC10497n;
    }

    public final String toString() {
        return "EmittableBox(modifier=" + this.f45130d + ", contentAlignment=" + this.f45131e + "children=[\n" + m10958d() + "\n])";
    }
}
