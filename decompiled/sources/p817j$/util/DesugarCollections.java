package p817j$.util;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class DesugarCollections {
    public static <T> Collection<T> unmodifiableCollection(Collection<? extends T> collection) {
        return new C15731l(collection);
    }

    public static <T> Set<T> unmodifiableSet(Set<? extends T> set) {
        return new C16023u(set);
    }

    public static <T> List<T> unmodifiableList(List<? extends T> list) {
        if (!(list instanceof RandomAccess)) {
            return new C15735n(list);
        }
        return new C16021t(list);
    }

    public static <K, V> Map<K, V> unmodifiableMap(Map<? extends K, ? extends V> map) {
        return new C15745s(map);
    }

    public static <T> Collection<T> bridge_synchronizedCollection(Collection<T> collection, Object obj) {
        return new C15712f(collection, obj);
    }

    public static <T> Set<T> synchronizedSet(Set<T> set) {
        return new C15727j(set);
    }

    public static <T> List<T> synchronizedList(List<T> list) {
        if (!(list instanceof RandomAccess)) {
            return new C15721g(list);
        }
        return new C15725i(list);
    }

    public static <K, V> Map<K, V> synchronizedMap(Map<K, V> map) {
        return new C15723h(map);
    }
}
