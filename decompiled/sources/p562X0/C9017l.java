package p562X0;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC7966P5;
import p594Y9.AbstractC9834X3;
import p658b5.C11242m;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: X0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C9017l implements InterfaceC9016k {

    /* JADX INFO: renamed from: a */
    public final AbstractC16546n f27514a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f27515b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f27516c;

    /* JADX WARN: Multi-variable type inference failed */
    public C9017l(Map map, InterfaceC1436k interfaceC1436k) {
        this.f27514a = (AbstractC16546n) interfaceC1436k;
        this.f27515b = map != null ? AbstractC17659D.m19256r(map) : new LinkedHashMap();
        this.f27516c = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p562X0.InterfaceC9016k
    /* JADX INFO: renamed from: a */
    public final boolean mo609a(Object obj) {
        return ((Boolean) this.f27514a.invoke(obj)).booleanValue();
    }

    @Override // p562X0.InterfaceC9016k
    /* JADX INFO: renamed from: b */
    public final Object mo610b(String str) {
        LinkedHashMap linkedHashMap = this.f27515b;
        List list = (List) linkedHashMap.remove(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            linkedHashMap.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: c */
    public final Map m9596c() {
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(this.f27515b);
        for (Map.Entry entry : this.f27516c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object objInvoke = ((InterfaceC1426a) list.get(0)).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!mo609a(objInvoke)) {
                        throw new IllegalStateException(AbstractC9834X3.m10479b(objInvoke).toString());
                    }
                    linkedHashMapM19256r.put(str, AbstractC17681o.m19377f(objInvoke));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Object objInvoke2 = ((InterfaceC1426a) list.get(i10)).invoke();
                    if (objInvoke2 != null && !mo609a(objInvoke2)) {
                        throw new IllegalStateException(AbstractC9834X3.m10479b(objInvoke2).toString());
                    }
                    arrayList.add(objInvoke2);
                }
                linkedHashMapM19256r.put(str, arrayList);
            }
        }
        return linkedHashMapM19256r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p562X0.InterfaceC9016k
    /* JADX INFO: renamed from: d */
    public final InterfaceC9015j mo611d(String str, InterfaceC1426a interfaceC1426a) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!AbstractC7966P5.m8258f(str.charAt(i10))) {
                LinkedHashMap linkedHashMap = this.f27516c;
                Object arrayList = linkedHashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(str, arrayList);
                }
                ((List) arrayList).add(interfaceC1426a);
                C11242m c11242m = new C11242m();
                c11242m.f34018Y = this;
                c11242m.f34019Z = str;
                c11242m.f34020o0 = (AbstractC16546n) interfaceC1426a;
                return c11242m;
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
