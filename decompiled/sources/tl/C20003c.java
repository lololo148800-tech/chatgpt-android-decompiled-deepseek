package tl;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1727e;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: tl.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C20003c implements Map, InterfaceC1727e, p817j$.util.Map {

    /* JADX INFO: renamed from: Y */
    public final ConcurrentHashMap f63323Y = new ConcurrentHashMap(32);

    @Override // java.util.Map
    public final void clear() {
        this.f63323Y.clear();
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return p817j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return p817j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return p817j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f63323Y.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f63323Y.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Set setEntrySet = this.f63323Y.entrySet();
        AbstractC16544l.m18093f(setEntrySet, "<get-entries>(...)");
        return setEntrySet;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return AbstractC16544l.m18089b(obj, this.f63323Y);
        }
        return false;
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        p817j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f63323Y.get(obj);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return p817j$.util.Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f63323Y.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f63323Y.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        Set setKeySet = this.f63323Y.keySet();
        AbstractC16544l.m18093f(setKeySet, "<get-keys>(...)");
        return setKeySet;
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return p817j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f63323Y.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        AbstractC16544l.m18094g(from, "from");
        this.f63323Y.putAll(from);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return p817j$.util.Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f63323Y.remove(obj);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return p817j$.util.Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        p817j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f63323Y.size();
    }

    public final String toString() {
        return "ConcurrentMapJvm by " + this.f63323Y;
    }

    @Override // java.util.Map
    public final Collection values() {
        Collection collectionValues = this.f63323Y.values();
        AbstractC16544l.m18093f(collectionValues, "<get-values>(...)");
        return collectionValues;
    }

    @Override // java.util.Map, p817j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        return this.f63323Y.remove(obj, obj2);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return p817j$.util.Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
