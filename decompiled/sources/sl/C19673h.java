package sl;

import io.ktor.client.plugins.auth.C15058c;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1727e;
import p523V9.AbstractC8150n4;

/* JADX INFO: renamed from: sl.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C19673h implements Map, InterfaceC1727e {

    /* JADX INFO: renamed from: Y */
    public final LinkedHashMap f62360Y = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.f62360Y.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        AbstractC16544l.m18094g(key, "key");
        return this.f62360Y.containsKey(new C19674i(key));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f62360Y.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new C19676k(this.f62360Y.entrySet(), new C15058c(12), new C15058c(13));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C19673h)) {
            return false;
        }
        return AbstractC16544l.m18089b(((C19673h) obj).f62360Y, this.f62360Y);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        AbstractC16544l.m18094g(key, "key");
        return this.f62360Y.get(AbstractC8150n4.m8688a(key));
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f62360Y.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f62360Y.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new C19676k(this.f62360Y.keySet(), new C15058c(14), new C15058c(15));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object value) {
        String key = (String) obj;
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(value, "value");
        return this.f62360Y.put(AbstractC8150n4.m8688a(key), value);
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        AbstractC16544l.m18094g(from, "from");
        for (Map.Entry entry : from.entrySet()) {
            String key = (String) entry.getKey();
            Object value = entry.getValue();
            AbstractC16544l.m18094g(key, "key");
            AbstractC16544l.m18094g(value, "value");
            this.f62360Y.put(AbstractC8150n4.m8688a(key), value);
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        AbstractC16544l.m18094g(key, "key");
        return this.f62360Y.remove(AbstractC8150n4.m8688a(key));
    }

    @Override // java.util.Map
    public final int size() {
        return this.f62360Y.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f62360Y.values();
    }
}
