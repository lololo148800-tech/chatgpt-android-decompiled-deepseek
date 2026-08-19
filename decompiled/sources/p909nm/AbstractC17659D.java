package p909nm;

import com.google.protobuf.AbstractC12107L1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p1091wn.InterfaceC21029j;
import p174Gk.uSfJ.HpucjswO;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: nm.D */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17659D extends AbstractC17660E {
    /* JADX INFO: renamed from: e */
    public static Object m19243e(Map map, Object obj) {
        AbstractC16544l.m18094g(map, "<this>");
        if (map instanceof InterfaceC17658C) {
            return ((InterfaceC17658C) map).m19242i();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException(AbstractC12107L1.m13824o(obj, "Key ", " is missing in the map."));
    }

    /* JADX INFO: renamed from: f */
    public static Map m19244f(C17309l... c17309lArr) {
        if (c17309lArr.length <= 0) {
            return C17690x.f56481Y;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC17660E.m19257b(c17309lArr.length));
        m19250l(linkedHashMap, c17309lArr);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: g */
    public static Map m19245g(Map map, Object obj) {
        AbstractC16544l.m18094g(map, "<this>");
        LinkedHashMap linkedHashMapM19256r = m19256r(map);
        linkedHashMapM19256r.remove(obj);
        return m19247i(linkedHashMapM19256r);
    }

    /* JADX INFO: renamed from: h */
    public static LinkedHashMap m19246h(C17309l... pairs) {
        AbstractC16544l.m18094g(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC17660E.m19257b(pairs.length));
        m19250l(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: i */
    public static final Map m19247i(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size != 0) {
            return size != 1 ? linkedHashMap : AbstractC17660E.m19259d(linkedHashMap);
        }
        return C17690x.f56481Y;
    }

    /* JADX INFO: renamed from: j */
    public static LinkedHashMap m19248j(Map map, Map map2) {
        AbstractC16544l.m18094g(map, "<this>");
        AbstractC16544l.m18094g(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: k */
    public static Map m19249k(Map map, C17309l c17309l) {
        AbstractC16544l.m18094g(map, "<this>");
        if (map.isEmpty()) {
            return AbstractC17660E.m19258c(c17309l);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(c17309l.f55136Y, c17309l.f55137Z);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: l */
    public static final void m19250l(HashMap map, C17309l[] pairs) {
        AbstractC16544l.m18094g(pairs, "pairs");
        for (C17309l c17309l : pairs) {
            map.put(c17309l.f55136Y, c17309l.f55137Z);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m19251m(Map map, Iterable pairs) {
        AbstractC16544l.m18094g(map, "<this>");
        AbstractC16544l.m18094g(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            C17309l c17309l = (C17309l) it.next();
            map.put(c17309l.f55136Y, c17309l.f55137Z);
        }
    }

    /* JADX INFO: renamed from: n */
    public static List m19252n(Map map) {
        AbstractC16544l.m18094g(map, "<this>");
        int size = map.size();
        C17689w c17689w = C17689w.f56480Y;
        if (size == 0) {
            return c17689w;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return c17689w;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return AbstractC9393x3.m9974d(new C17309l(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C17309l(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new C17309l(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static Map m19253o(Iterable iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            m19251m(linkedHashMap, iterable);
            return m19247i(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C17690x.f56481Y;
        }
        if (size == 1) {
            return AbstractC17660E.m19258c((C17309l) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC17660E.m19257b(collection.size()));
        m19251m(linkedHashMap2, iterable);
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: q */
    public static Map m19255q(InterfaceC21029j interfaceC21029j) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = interfaceC21029j.iterator();
        while (it.hasNext()) {
            C17309l c17309l = (C17309l) it.next();
            linkedHashMap.put(c17309l.f55136Y, c17309l.f55137Z);
        }
        return m19247i(linkedHashMap);
    }

    /* JADX INFO: renamed from: r */
    public static LinkedHashMap m19256r(Map map) {
        AbstractC16544l.m18094g(map, "<this>");
        return new LinkedHashMap(map);
    }

    /* JADX INFO: renamed from: p */
    public static Map m19254p(Map map) {
        AbstractC16544l.m18094g(map, HpucjswO.IiM);
        int size = map.size();
        if (size != 0) {
            return size != 1 ? m19256r(map) : AbstractC17660E.m19259d(map);
        }
        return C17690x.f56481Y;
    }
}
