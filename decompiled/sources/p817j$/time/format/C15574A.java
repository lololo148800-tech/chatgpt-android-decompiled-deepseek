package p817j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: j$.time.format.A */
/* JADX INFO: loaded from: classes4.dex */
final class C15574A {

    /* JADX INFO: renamed from: a */
    private final Map f48615a;

    /* JADX INFO: renamed from: b */
    private final HashMap f48616b;

    C15574A(Map map) {
        this.f48615a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l4 = (Long) entry2.getKey();
                int i10 = C15575B.f48620d;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l4));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, C15575B.f48618b);
            map2.put((TextStyle) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, C15575B.f48618b);
        this.f48616b = map2;
    }

    /* JADX INFO: renamed from: a */
    final String m17001a(long j10, TextStyle textStyle) {
        Map map = (Map) this.f48615a.get(textStyle);
        if (map != null) {
            return (String) map.get(Long.valueOf(j10));
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    final Iterator m17002b(TextStyle textStyle) {
        List list = (List) this.f48616b.get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
