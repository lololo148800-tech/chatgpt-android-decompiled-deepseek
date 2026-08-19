package p389Pn;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p412Qn.C6760a;
import p412Qn.InterfaceC6762c;
import p437Rn.C6960r;
import p571X9.AbstractC9306j0;
import p571X9.AbstractC9327m3;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Pn.g */
/* JADX INFO: loaded from: classes2.dex */
public class C6522g implements InterfaceC6527l {

    /* JADX INFO: renamed from: a */
    public final ArrayList f21133a;

    public C6522g(ArrayList formats) {
        AbstractC16544l.m18094g(formats, "formats");
        this.f21133a = formats;
    }

    @Override // p389Pn.InterfaceC6527l
    /* JADX INFO: renamed from: a */
    public InterfaceC6762c mo7085a() {
        ArrayList arrayList = this.f21133a;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC6530o) it.next()).mo7085a());
        }
        return arrayList2.size() == 1 ? (InterfaceC6762c) AbstractC17680n.m19365o0(arrayList2) : new C6760a(arrayList2);
    }

    @Override // p389Pn.InterfaceC6527l
    /* JADX INFO: renamed from: b */
    public C6960r mo7086b() {
        ArrayList arrayList = this.f21133a;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC6530o) it.next()).mo7086b());
        }
        return AbstractC9327m3.m9921a(arrayList2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6522g) {
            if (AbstractC16544l.m18089b(this.f21133a, ((C6522g) obj).f21133a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f21133a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("ConcatenatedFormatStructure("), AbstractC17680n.m19349Y(this.f21133a, ", ", null, null, 0, null, null, 62), ')');
    }
}
