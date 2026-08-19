package p1057v6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p076Cm.InterfaceC1723a;
import p279L1.VOxZ.sVoFrD;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import sj.hJY.CsqksqyPE;

/* JADX INFO: renamed from: v6.h */
/* JADX INFO: loaded from: classes.dex */
public final class C20468h implements Map, InterfaceC1723a, p817j$.util.Map {

    /* JADX INFO: renamed from: Y */
    public final String f64972Y;

    /* JADX INFO: renamed from: Z */
    public final Map f64973Z;

    /* JADX INFO: renamed from: o0 */
    public final UUID f64974o0;

    /* JADX INFO: renamed from: p0 */
    public final LinkedHashMap f64975p0;

    public C20468h(String key, Map fields, UUID uuid) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(fields, "fields");
        this.f64972Y = key;
        this.f64973Z = fields;
        this.f64974o0 = uuid;
    }

    /* JADX INFO: renamed from: a */
    public final Set m21112a() {
        Set setKeySet = this.f64973Z.keySet();
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f64972Y + '.' + ((String) it.next()));
        }
        return AbstractC17680n.m19328G0(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final C17309l m21113b(C20468h newRecord, Long l4) {
        AbstractC16544l.m18094g(newRecord, "newRecord");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map map = this.f64973Z;
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(map);
        LinkedHashMap linkedHashMap = this.f64975p0;
        LinkedHashMap linkedHashMapM19256r2 = linkedHashMap != null ? AbstractC17659D.m19256r(linkedHashMap) : new LinkedHashMap();
        Iterator it = newRecord.f64973Z.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = this.f64972Y;
            if (!zHasNext) {
                return new C17309l(new C20468h(str, linkedHashMapM19256r, newRecord.f64974o0, linkedHashMapM19256r2), linkedHashSet);
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            boolean zContainsKey = map.containsKey(str2);
            Object obj = map.get(str2);
            if (!zContainsKey || !AbstractC16544l.m18089b(obj, value)) {
                linkedHashMapM19256r.put(str2, value);
                linkedHashSet.add(str + '.' + str2);
            }
            if (l4 != null) {
                linkedHashMapM19256r2.put(str2, l4);
            }
        }
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
        return this.f64973Z.containsKey(key);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f64973Z.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f64973Z.entrySet();
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        p817j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        AbstractC16544l.m18094g(key, "key");
        return this.f64973Z.get(key);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return p817j$.util.Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f64973Z.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f64973Z.keySet();
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
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
        return this.f64973Z.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f64973Z.values();
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException(CsqksqyPE.HLryIEXqU);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException(sVoFrD.kKKZppQnumfcb);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C20468h(String key, Map fields, UUID uuid, LinkedHashMap linkedHashMap) {
        this(key, fields, uuid);
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(fields, "fields");
        this.f64975p0 = linkedHashMap;
    }
}
