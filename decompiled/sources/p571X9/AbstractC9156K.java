package p571X9;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p229J0.C4171z3;
import p379Pb.LVf.efyhmdM;
import p890mb.C17204a;
import p890mb.C17210g;
import p890mb.C17211h;
import p890mb.C17212i;
import p890mb.C17213j;
import p890mb.C17220q;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: X9.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9156K {
    /* JADX INFO: renamed from: a */
    public static void m9705a(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (C17210g c17210g : (Set) it2.next()) {
                        for (C17212i c17212i : c17210g.f54938a.f54922c) {
                            if (c17212i.f54945c == 0) {
                                Set<C17210g> set = (Set) map.get(new C17211h(c17212i.f54943a, c17212i.f54944b == 2));
                                if (set != null) {
                                    for (C17210g c17210g2 : set) {
                                        c17210g.f54939b.add(c17210g2);
                                        c17210g2.f54940c.add(c17210g);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<C17210g> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (C17210g c17210g3 : hashSet) {
                    if (c17210g3.f54940c.isEmpty()) {
                        hashSet2.add(c17210g3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    C17210g c17210g4 = (C17210g) hashSet2.iterator().next();
                    hashSet2.remove(c17210g4);
                    i10++;
                    for (C17210g c17210g5 : c17210g4.f54939b) {
                        c17210g5.f54940c.remove(c17210g4);
                        if (c17210g5.f54940c.isEmpty()) {
                            hashSet2.add(c17210g5);
                        }
                    }
                }
                if (i10 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (C17210g c17210g6 : hashSet) {
                    if (!c17210g6.f54940c.isEmpty() && !c17210g6.f54939b.isEmpty()) {
                        arrayList2.add(c17210g6.f54938a);
                    }
                }
                throw new C17213j("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            C17204a c17204a = (C17204a) it.next();
            C17210g c17210g7 = new C17210g(c17204a);
            for (C17220q c17220q : c17204a.f54921b) {
                boolean z6 = c17204a.f54924e == 0;
                C17211h c17211h = new C17211h(c17220q, !z6);
                if (!map.containsKey(c17211h)) {
                    map.put(c17211h, new HashSet());
                }
                Set set2 = (Set) map.get(c17211h);
                if (!set2.isEmpty() && z6) {
                    throw new IllegalArgumentException("Multiple components provide " + c17220q + Separators.DOT);
                }
                set2.add(c17210g7);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m9706b(String str, Locale locale) {
        AbstractC16544l.m18094g(str, "<this>");
        String str2 = (String) AbstractC17680n.m19341Q(AbstractC21322p.m21697e0((CharSequence) AbstractC17680n.m19351a0(AbstractC21322p.m21697e0(str, new String[]{Separators.SLASH}, 0, 6)), new String[]{Separators.DOT}, 0, 6));
        String str3 = efyhmdM.beDupBSYF;
        return AbstractC17680n.m19349Y(AbstractC21322p.m21697e0(AbstractC21329w.m21731r(str2, "_", str3), new String[]{str3}, 0, 6), Separators.f31991SP, null, null, 0, null, new C4171z3(locale, 27), 30);
    }
}
