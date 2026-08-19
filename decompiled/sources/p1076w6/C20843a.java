package p1076w6;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p1057v6.C20462b;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: w6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C20843a {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f66275a;

    public C20843a(LinkedHashMap data) {
        AbstractC16544l.m18094g(data, "data");
        this.f66275a = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final Object m21442a(Object obj, List list) {
        ?? linkedHashMap;
        if (obj instanceof C20462b) {
            return m21442a(this.f66275a.get(list), list);
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            linkedHashMap = new ArrayList(AbstractC17682p.m19389r(iterable, 10));
            int i10 = 0;
            for (Object obj2 : iterable) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC17681o.m19388q();
                    throw null;
                }
                linkedHashMap.add(m21442a(obj2, AbstractC17680n.m19362l0(list, Integer.valueOf(i10))));
                i10 = i11;
            }
        } else {
            if (!(obj instanceof Map)) {
                return obj;
            }
            Map map = (Map) obj;
            linkedHashMap = new LinkedHashMap(AbstractC17660E.m19257b(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object key2 = entry.getKey();
                AbstractC16544l.m18092e(key2, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put(key, m21442a(value, AbstractC17680n.m19362l0(list, (String) key2)));
            }
        }
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20843a) && AbstractC16544l.m18089b(this.f66275a, ((C20843a) obj).f66275a);
    }

    public final int hashCode() {
        return this.f66275a.hashCode();
    }

    public final String toString() {
        return "CacheBatchReaderData(data=" + this.f66275a + ')';
    }
}
