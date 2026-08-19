package p817j$.util;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import p817j$.util.concurrent.AbstractC15702u;
import p817j$.util.concurrent.C15701t;
import p817j$.util.concurrent.InterfaceC15703v;

/* JADX INFO: renamed from: j$.util.h */
/* JADX INFO: loaded from: classes4.dex */
final class C15723h implements Map, Serializable, Map {
    private static final long serialVersionUID = 1978198479659022715L;

    /* JADX INFO: renamed from: a */
    private final Map f48981a;

    /* JADX INFO: renamed from: b */
    final Object f48982b = this;

    /* JADX INFO: renamed from: c */
    private transient Set f48983c;

    /* JADX INFO: renamed from: d */
    private transient Set f48984d;

    /* JADX INFO: renamed from: e */
    private transient Collection f48985e;

    C15723h(Map map) {
        this.f48981a = (Map) Objects.requireNonNull(map);
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.f48982b) {
            size = this.f48981a.size();
        }
        return size;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f48982b) {
            zIsEmpty = this.f48981a.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.f48982b) {
            zContainsKey = this.f48981a.containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.f48982b) {
            zContainsValue = this.f48981a.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f48982b) {
            obj2 = this.f48981a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut;
        synchronized (this.f48982b) {
            objPut = this.f48981a.put(obj, obj2);
        }
        return objPut;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object objRemove;
        synchronized (this.f48982b) {
            objRemove = this.f48981a.remove(obj);
        }
        return objRemove;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.f48982b) {
            this.f48981a.putAll(map);
        }
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.f48982b) {
            this.f48981a.clear();
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        Set set;
        synchronized (this.f48982b) {
            try {
                if (this.f48983c == null) {
                    this.f48983c = new C15727j(this.f48981a.keySet(), this.f48982b);
                }
                set = this.f48983c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return set;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Set set;
        synchronized (this.f48982b) {
            try {
                if (this.f48984d == null) {
                    this.f48984d = new C15727j(this.f48981a.entrySet(), this.f48982b);
                }
                set = this.f48984d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return set;
    }

    @Override // java.util.Map
    public final Collection values() {
        Collection collection;
        synchronized (this.f48982b) {
            try {
                if (this.f48985e == null) {
                    this.f48985e = new C15712f(this.f48981a.values(), this.f48982b);
                }
                collection = this.f48985e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return collection;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f48982b) {
            zEquals = this.f48981a.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f48982b) {
            iHashCode = this.f48981a.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        String string;
        synchronized (this.f48982b) {
            string = this.f48981a.toString();
        }
        return string;
    }

    @Override // java.util.Map, p817j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object objM17248a;
        synchronized (this.f48982b) {
            objM17248a = Map.EL.m17248a(this.f48981a, obj, obj2);
        }
        return objM17248a;
    }

    @Override // java.util.Map, p817j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f48982b) {
            Map.EL.forEach(this.f48981a, biConsumer);
        }
    }

    @Override // java.util.Map, p817j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f48982b) {
            Map map = this.f48981a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(biFunction);
                C15701t c15701t = new C15701t(0, concurrentMap, biFunction);
                if (concurrentMap instanceof InterfaceC15703v) {
                    ((InterfaceC15703v) concurrentMap).forEach(c15701t);
                } else {
                    AbstractC15702u.m17332a(concurrentMap, c15701t);
                }
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    @Override // java.util.Map, p817j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object objPutIfAbsent;
        synchronized (this.f48982b) {
            objPutIfAbsent = Map.EL.putIfAbsent(this.f48981a, obj, obj2);
        }
        return objPutIfAbsent;
    }

    @Override // java.util.Map, p817j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.f48982b) {
            Map map = this.f48981a;
            zRemove = map instanceof Map ? ((Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
        }
        return zRemove;
    }

    @Override // java.util.Map, p817j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean zReplace;
        synchronized (this.f48982b) {
            Map map = this.f48981a;
            zReplace = map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return zReplace;
    }

    @Override // java.util.Map, p817j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object objReplace;
        synchronized (this.f48982b) {
            Map map = this.f48981a;
            objReplace = map instanceof Map ? ((Map) map).replace(obj, obj2) : Map.CC.$default$replace(map, obj, obj2);
        }
        return objReplace;
    }

    @Override // java.util.Map, p817j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        Object objComputeIfAbsent;
        synchronized (this.f48982b) {
            objComputeIfAbsent = Map.EL.computeIfAbsent(this.f48981a, obj, function);
        }
        return objComputeIfAbsent;
    }

    @Override // java.util.Map, p817j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object obj$default$computeIfPresent;
        synchronized (this.f48982b) {
            Map map = this.f48981a;
            if (map instanceof Map) {
                obj$default$computeIfPresent = ((Map) map).computeIfPresent(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(biFunction);
                while (true) {
                    Object obj2 = concurrentMap.get(obj);
                    if (obj2 == null) {
                        obj$default$computeIfPresent = null;
                        break;
                    }
                    Object objApply = biFunction.apply(obj, obj2);
                    if (objApply == null) {
                        if (concurrentMap.remove(obj, obj2)) {
                            obj$default$computeIfPresent = objApply;
                            break;
                        }
                    } else if (concurrentMap.replace(obj, obj2, objApply)) {
                        obj$default$computeIfPresent = objApply;
                        break;
                    }
                }
            } else {
                obj$default$computeIfPresent = Map.CC.$default$computeIfPresent(map, obj, biFunction);
            }
        }
        return obj$default$computeIfPresent;
    }

    @Override // java.util.Map, p817j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        Object obj$default$compute;
        Object objApply;
        synchronized (this.f48982b) {
            Map map = this.f48981a;
            if (map instanceof Map) {
                obj$default$compute = ((Map) map).compute(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                loop0: while (true) {
                    Object objPutIfAbsent = concurrentMap.get(obj);
                    while (true) {
                        objApply = biFunction.apply(obj, objPutIfAbsent);
                        if (objApply == null) {
                            if (objPutIfAbsent != null && !concurrentMap.remove(obj, objPutIfAbsent)) {
                                break;
                            }
                            obj$default$compute = null;
                        } else {
                            if (objPutIfAbsent != null) {
                                if (!concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                                    break;
                                }
                                break;
                            }
                            objPutIfAbsent = concurrentMap.putIfAbsent(obj, objApply);
                            if (objPutIfAbsent == null) {
                                break loop0;
                            }
                        }
                        throw th;
                    }
                }
                obj$default$compute = objApply;
            } else {
                obj$default$compute = Map.CC.$default$compute(map, obj, biFunction);
            }
        }
        return obj$default$compute;
    }

    @Override // java.util.Map, p817j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object obj$default$merge;
        synchronized (this.f48982b) {
            Map map = this.f48981a;
            if (map instanceof Map) {
                obj$default$merge = ((Map) map).merge(obj, obj2, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(biFunction);
                Objects.requireNonNull(obj2);
                loop0: while (true) {
                    Object objPutIfAbsent = concurrentMap.get(obj);
                    while (objPutIfAbsent == null) {
                        objPutIfAbsent = concurrentMap.putIfAbsent(obj, obj2);
                        if (objPutIfAbsent == null) {
                            break loop0;
                        }
                    }
                    Object objApply = biFunction.apply(objPutIfAbsent, obj2);
                    if (objApply != null) {
                        if (concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                            obj2 = objApply;
                            break;
                        }
                    } else if (concurrentMap.remove(obj, objPutIfAbsent)) {
                        obj2 = null;
                        break;
                    }
                }
                obj$default$merge = obj2;
            } else {
                obj$default$merge = Map.CC.$default$merge(map, obj, obj2, biFunction);
            }
        }
        return obj$default$merge;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f48982b) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
