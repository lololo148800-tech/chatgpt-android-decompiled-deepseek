package p343Nk;

import com.google.protobuf.AbstractC12107L1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p000.C20411v;
import p078Co.InterfaceC1759a;
import p078Co.InterfaceC1760b;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Nk.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C5817a {

    /* JADX INFO: renamed from: a */
    public final C5818b f18985a;

    public C5817a(C5818b c5818b) {
        this.f18985a = c5818b;
    }

    /* JADX INFO: renamed from: a */
    public final Object m6215a(Map expression, Object obj) {
        AbstractC16544l.m18094g(expression, "expression");
        return m6216b(expression, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX INFO: renamed from: b */
    public final Object m6216b(Object obj, Object obj2) throws C20411v {
        Object objM6216b;
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(m6216b(it.next(), obj2));
            }
            return arrayList;
        }
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map = (Map) obj;
        if (map.isEmpty()) {
            return obj2;
        }
        Object objM19342R = AbstractC17680n.m19342R(map.keySet());
        Object obj3 = map.get(objM19342R);
        C5818b c5818b = this.f18985a;
        LinkedHashMap linkedHashMap = c5818b.f18987b;
        if (AbstractC17680n.m19333J(linkedHashMap.keySet(), objM19342R)) {
            InterfaceC1759a interfaceC1759a = (InterfaceC1759a) linkedHashMap.get(objM19342R);
            if (interfaceC1759a != null) {
                return interfaceC1759a.mo2569c(obj3, obj2, this);
            }
            return null;
        }
        InterfaceC1760b interfaceC1760b = (InterfaceC1760b) c5818b.f18986a.get(objM19342R);
        if (interfaceC1760b == null) {
            throw new C20411v(AbstractC12107L1.m13824o(objM19342R, "Operation ", " not found."));
        }
        if (obj3 instanceof List) {
            Iterable iterable2 = (Iterable) obj3;
            objM6216b = new ArrayList(AbstractC17682p.m19389r(iterable2, 10));
            Iterator it2 = iterable2.iterator();
            while (it2.hasNext()) {
                objM6216b.add(m6216b(it2.next(), obj2));
            }
        } else {
            objM6216b = obj3 instanceof Map ? m6216b(obj3, obj2) : m6216b(obj3, obj2);
        }
        return interfaceC1760b.mo2570d(objM6216b, obj2);
    }
}
