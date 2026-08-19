package kotlinx.serialization.json;

import android.gov.nist.core.Separators;
import bo.C11536x;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.AbstractC16544l;
import p008A6.C0383c;
import p076Cm.InterfaceC1723a;
import p559Wn.InterfaceC8975g;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: kotlinx.serialization.json.c */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8975g(with = C11536x.class)
public final class C16644c extends AbstractC16643b implements Map<String, AbstractC16643b>, InterfaceC1723a, p817j$.util.Map {
    public static final JsonObject$Companion Companion = new JsonObject$Companion();

    /* JADX INFO: renamed from: Y */
    public final Map f53331Y;

    public C16644c(Map content) {
        AbstractC16544l.m18094g(content, "content");
        this.f53331Y = content;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        AbstractC16544l.m18094g(key, "key");
        return this.f53331Y.containsKey(key);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof AbstractC16643b)) {
            return false;
        }
        AbstractC16643b value = (AbstractC16643b) obj;
        AbstractC16544l.m18094g(value, "value");
        return this.f53331Y.containsValue(value);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, AbstractC16643b>> entrySet() {
        return this.f53331Y.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC16544l.m18089b(this.f53331Y, obj);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        p817j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final AbstractC16643b get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        AbstractC16544l.m18094g(key, "key");
        return (AbstractC16643b) this.f53331Y.get(key);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return p817j$.util.Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f53331Y.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f53331Y.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f53331Y.keySet();
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC16643b put(String str, AbstractC16643b abstractC16643b) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends AbstractC16643b> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final AbstractC16643b remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, p817j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f53331Y.size();
    }

    public final String toString() {
        return AbstractC17680n.m19349Y(this.f53331Y.entrySet(), Separators.COMMA, "{", "}", 0, null, new C0383c(27), 24);
    }

    @Override // java.util.Map
    public final Collection<AbstractC16643b> values() {
        return this.f53331Y.values();
    }

    @Override // java.util.Map, p817j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
