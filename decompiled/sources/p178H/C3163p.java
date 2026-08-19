package p178H;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p228J.C3821X;
import p228J.InterfaceC3870x;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: H.p */
/* JADX INFO: loaded from: classes.dex */
public final class C3163p {

    /* JADX INFO: renamed from: b */
    public static final C3163p f9511b;

    /* JADX INFO: renamed from: c */
    public static final C3163p f9512c;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f9513a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C3821X(0));
        f9511b = new C3163p(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new C3821X(1));
        f9512c = new C3163p(linkedHashSet2);
    }

    public C3163p(LinkedHashSet linkedHashSet) {
        this.f9513a = linkedHashSet;
    }

    /* JADX INFO: renamed from: a */
    public final List m3993a(ArrayList arrayList) {
        List arrayList2 = new ArrayList(arrayList);
        Iterator it = this.f9513a.iterator();
        while (it.hasNext()) {
            arrayList2 = ((InterfaceC3161o) it.next()).mo3991b(DesugarCollections.unmodifiableList(arrayList2));
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m3994b() {
        Integer num = null;
        for (InterfaceC3161o interfaceC3161o : this.f9513a) {
            if (interfaceC3161o instanceof C3821X) {
                Integer numValueOf = Integer.valueOf(((C3821X) interfaceC3161o).f11573b);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC3870x m3995c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC3870x) it.next()).mo105a());
        }
        List listM3993a = m3993a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            InterfaceC3870x interfaceC3870x = (InterfaceC3870x) it2.next();
            if (listM3993a.contains(interfaceC3870x.mo105a())) {
                linkedHashSet2.add(interfaceC3870x);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (InterfaceC3870x) it3.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
