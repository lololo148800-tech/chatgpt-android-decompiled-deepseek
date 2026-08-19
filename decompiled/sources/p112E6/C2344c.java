package p112E6;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p037B9.MeDP.MpoABj;
import p076Cm.InterfaceC1723a;
import p076Cm.InterfaceC1727e;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17686t;
import p917o6.C17869v;

/* JADX INFO: renamed from: E6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2344c {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f7274a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f7275b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f7276c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f7277d;

    /* JADX INFO: renamed from: e */
    public boolean f7278e;

    /* JADX INFO: renamed from: f */
    public boolean f7279f;

    public C2344c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f7274a = linkedHashMap;
        this.f7275b = linkedHashMap;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f7276c = linkedHashSet;
        this.f7277d = linkedHashSet;
        this.f7278e = true;
    }

    /* JADX INFO: renamed from: a */
    public static void m3433a(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (map.containsKey(str)) {
                Object obj = map.get(str);
                if ((obj instanceof Map) && (!(obj instanceof InterfaceC1723a) || (obj instanceof InterfaceC1727e))) {
                    Object obj2 = map.get(str);
                    AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                    Map mapM18079c = AbstractC16529F.m18079c(obj2);
                    Map map3 = value instanceof Map ? (Map) value : null;
                    if (map3 == null) {
                        throw new IllegalStateException((Separators.QUOTE + str + "' is an object in destination but not in map").toString());
                    }
                    m3433a(mapM18079c, map3);
                }
            }
            map.put(str, value);
        }
    }

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap m3434b(Map map) {
        Iterator it;
        Object obj;
        LinkedHashMap linkedHashMap = this.f7275b;
        boolean zIsEmpty = linkedHashMap.isEmpty();
        LinkedHashMap linkedHashMap2 = this.f7274a;
        if (zIsEmpty) {
            linkedHashMap2.putAll(map);
            return linkedHashMap;
        }
        String str = MpoABj.IlHhdiRSPxufsl;
        Object obj2 = map.get(str);
        List list = obj2 instanceof List ? (List) obj2 : null;
        if (list == null) {
            this.f7279f = true;
        } else {
            this.f7279f = false;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Map map2 = (Map) it2.next();
                Map map3 = (Map) map2.get("data");
                Object obj3 = map2.get("path");
                AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list2 = (List) obj3;
                Object obj4 = linkedHashMap.get("data");
                AbstractC16544l.m18092e(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                Object obj5 = (Map) obj4;
                if (map3 != null) {
                    for (Object obj6 : list2) {
                        Iterator it3 = it2;
                        if (obj5 instanceof List) {
                            AbstractC16544l.m18092e(obj6, "null cannot be cast to non-null type kotlin.Int");
                            obj = ((List) obj5).get(((Integer) obj6).intValue());
                        } else {
                            AbstractC16544l.m18092e(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            obj = ((Map) obj5).get(obj6);
                        }
                        obj5 = obj;
                        it2 = it3;
                    }
                    it = it2;
                    AbstractC16544l.m18092e(obj5, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                    m3433a(AbstractC16529F.m18079c(obj5), map3);
                    this.f7276c.add(new C17869v(list2, (String) map2.get("label")));
                } else {
                    it = it2;
                }
                Object obj7 = map2.get("errors");
                List list3 = obj7 instanceof List ? (List) obj7 : null;
                if (list3 != null) {
                    AbstractC17686t.m19398v(list3, arrayList);
                }
                Object obj8 = map2.get("extensions");
                Map map4 = obj8 instanceof Map ? (Map) obj8 : null;
                if (map4 != null) {
                    arrayList2.add(map4);
                }
                it2 = it;
            }
            if (arrayList.isEmpty()) {
                linkedHashMap2.remove("errors");
            } else {
                linkedHashMap2.put("errors", arrayList);
            }
            if (arrayList2.isEmpty()) {
                linkedHashMap2.remove("extensions");
            } else {
                linkedHashMap2.put("extensions", AbstractC17660E.m19258c(new C17309l(str, arrayList2)));
            }
        }
        Boolean bool = (Boolean) map.get("hasNext");
        this.f7278e = bool != null ? bool.booleanValue() : false;
        return linkedHashMap;
    }
}
