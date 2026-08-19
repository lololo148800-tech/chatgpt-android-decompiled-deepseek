package p817j$.util.stream;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collector;
import p817j$.util.C15710e;

/* JADX INFO: renamed from: j$.util.stream.b3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15886b3 {
    /* JADX INFO: renamed from: a */
    public static Set m17457a(Set set) {
        Collector.Characteristics characteristics;
        Collector.Characteristics characteristics2;
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof Collector.Characteristics) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    Collector.Characteristics characteristics3 = (Collector.Characteristics) it.next();
                    if (characteristics3 == null) {
                        characteristics2 = null;
                    } else if (characteristics3 == Collector.Characteristics.CONCURRENT) {
                        characteristics2 = Collector.Characteristics.CONCURRENT;
                    } else {
                        characteristics2 = characteristics3 == Collector.Characteristics.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH;
                    }
                    hashSet.add(characteristics2);
                } catch (ClassCastException e10) {
                    C15710e.m17336a("java.util.stream.Collector.Characteristics", e10);
                    throw null;
                }
            }
            return hashSet;
        }
        if (!(next instanceof Collector.Characteristics)) {
            C15710e.m17336a("java.util.stream.Collector.Characteristics", next.getClass());
            throw null;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            try {
                Collector.Characteristics characteristics4 = (Collector.Characteristics) it2.next();
                if (characteristics4 == null) {
                    characteristics = null;
                } else if (characteristics4 == Collector.Characteristics.CONCURRENT) {
                    characteristics = Collector.Characteristics.CONCURRENT;
                } else {
                    characteristics = characteristics4 == Collector.Characteristics.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH;
                }
                hashSet.add(characteristics);
            } catch (ClassCastException e11) {
                C15710e.m17336a("java.util.stream.Collector.Characteristics", e11);
                throw null;
            }
        }
        return hashSet;
    }
}
