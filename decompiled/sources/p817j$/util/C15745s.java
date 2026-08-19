package p817j$.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.s */
/* JADX INFO: loaded from: classes4.dex */
final class C15745s implements Map, Serializable, Map {
    private static final long serialVersionUID = -1034234728574286014L;

    /* JADX INFO: renamed from: a */
    private final Map f49021a;

    /* JADX INFO: renamed from: b */
    private transient Set f49022b;

    /* JADX INFO: renamed from: c */
    private transient Set f49023c;

    /* JADX INFO: renamed from: d */
    private transient Collection f49024d;

    C15745s(Map map) {
        map.getClass();
        this.f49021a = map;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f49021a.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f49021a.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f49021a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f49021a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f49021a.get(obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f49022b == null) {
            this.f49022b = DesugarCollections.unmodifiableSet(this.f49021a.keySet());
        }
        return this.f49022b;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f49023c == null) {
            this.f49023c = new C15743r(this.f49021a.entrySet());
        }
        return this.f49023c;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f49024d == null) {
            this.f49024d = DesugarCollections.unmodifiableCollection(this.f49021a.values());
        }
        return this.f49024d;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || this.f49021a.equals(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f49021a.hashCode();
    }

    public final String toString() {
        return this.f49021a.toString();
    }

    @Override // java.util.Map, p817j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        return Map.EL.m17248a(this.f49021a, obj, obj2);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        Map.EL.forEach(this.f49021a, biConsumer);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p817j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p817j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p817j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p817j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p817j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p817j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p817j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p817j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }
}
