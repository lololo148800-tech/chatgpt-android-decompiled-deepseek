package p817j$.util.concurrent;

import java.util.Map;

/* JADX INFO: renamed from: j$.util.concurrent.k */
/* JADX INFO: loaded from: classes4.dex */
final class C15692k implements Map.Entry {

    /* JADX INFO: renamed from: a */
    final Object f48913a;

    /* JADX INFO: renamed from: b */
    Object f48914b;

    /* JADX INFO: renamed from: c */
    final ConcurrentHashMap f48915c;

    C15692k(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f48913a = obj;
        this.f48914b = obj2;
        this.f48915c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f48913a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f48914b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f48913a.hashCode() ^ this.f48914b.hashCode();
    }

    public final String toString() {
        return AbstractC15702u.m17333b(this.f48913a, this.f48914b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f48913a) || key.equals(obj2)) && (value == (obj3 = this.f48914b) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f48914b;
        this.f48914b = obj;
        this.f48915c.put(this.f48913a, obj);
        return obj2;
    }
}
