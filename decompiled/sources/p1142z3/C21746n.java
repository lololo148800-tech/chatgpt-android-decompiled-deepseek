package p1142z3;

import bb.AbstractC11320m;
import bb.C11308d0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: z3.n */
/* JADX INFO: loaded from: classes.dex */
public final class C21746n implements Map {

    /* JADX INFO: renamed from: Y */
    public final Map f68995Y;

    public C21746n(Map map) {
        this.f68995Y = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f68995Y.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f68995Y.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((C11308d0) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (obj.equals(((Map.Entry) it.next()).getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return AbstractC11320m.m12728h(this.f68995Y.entrySet(), new C21745m(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && AbstractC11320m.m12726f(this, obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f68995Y.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC11320m.m12730j(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f68995Y;
        if (map.isEmpty()) {
            return true;
        }
        return map.size() == 1 && map.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return AbstractC11320m.m12728h(this.f68995Y.keySet(), new C21745m(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f68995Y.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f68995Y.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f68995Y.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f68995Y;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    public final String toString() {
        return this.f68995Y.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f68995Y.values();
    }
}
