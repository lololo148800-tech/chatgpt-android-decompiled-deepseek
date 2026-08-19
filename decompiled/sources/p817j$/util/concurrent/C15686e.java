package p817j$.util.concurrent;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import p817j$.util.Collection;
import p817j$.util.stream.Stream;

/* JADX INFO: renamed from: j$.util.concurrent.e */
/* JADX INFO: loaded from: classes4.dex */
final class C15686e extends AbstractC15683b implements Set, p817j$.util.Set {
    private static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(Collection.CC.$default$parallelStream(this));
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(Collection.CC.$default$stream(this));
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return this.f48906a.m17309f(entry.getKey(), entry.getValue(), false) == null;
    }

    @Override // p817j$.util.concurrent.AbstractC15683b, java.util.Collection
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        Object value;
        return (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.f48906a.get(key)) == null || (value = entry.getValue()) == null || (value != obj2 && !value.equals(obj2))) ? false : true;
    }

    @Override // p817j$.util.concurrent.AbstractC15683b, java.util.Collection
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.f48906a.remove(key, value);
    }

    @Override // p817j$.util.concurrent.AbstractC15683b, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f48906a;
        C15693l[] c15693lArr = concurrentHashMap.f48891a;
        int length = c15693lArr == null ? 0 : c15693lArr.length;
        return new C15685d(c15693lArr, length, length, concurrentHashMap);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        Iterator it = collection.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.f48906a.m17309f(entry.getKey(), entry.getValue(), false) == null) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        ConcurrentHashMap concurrentHashMap = this.f48906a;
        concurrentHashMap.getClass();
        predicate.getClass();
        C15693l[] c15693lArr = concurrentHashMap.f48891a;
        boolean z6 = false;
        if (c15693lArr != null) {
            C15697p c15697p = new C15697p(c15693lArr, c15693lArr.length, 0, c15693lArr.length);
            while (true) {
                C15693l c15693lM17322a = c15697p.m17322a();
                if (c15693lM17322a == null) {
                    break;
                }
                Object obj = c15693lM17322a.f48917b;
                Object obj2 = c15693lM17322a.f48918c;
                if (predicate.test(new AbstractMap.SimpleImmutableEntry(obj, obj2)) && concurrentHashMap.m17310g(obj, null, obj2) != null) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        C15693l[] c15693lArr = this.f48906a.f48891a;
        int iHashCode = 0;
        if (c15693lArr != null) {
            C15697p c15697p = new C15697p(c15693lArr, c15693lArr.length, 0, c15693lArr.length);
            while (true) {
                C15693l c15693lM17322a = c15697p.m17322a();
                if (c15693lM17322a == null) {
                    break;
                }
                iHashCode += c15693lM17322a.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, p817j$.util.Collection, p817j$.util.List
    public final p817j$.util.Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f48906a;
        long jM17311j = concurrentHashMap.m17311j();
        C15693l[] c15693lArr = concurrentHashMap.f48891a;
        int length = c15693lArr == null ? 0 : c15693lArr.length;
        return new C15687f(c15693lArr, length, 0, length, jM17311j >= 0 ? jM17311j : 0L, concurrentHashMap);
    }

    @Override // java.lang.Iterable, p817j$.util.Collection, p817j$.lang.InterfaceC15531a
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        C15693l[] c15693lArr = this.f48906a.f48891a;
        if (c15693lArr == null) {
            return;
        }
        C15697p c15697p = new C15697p(c15693lArr, c15693lArr.length, 0, c15693lArr.length);
        while (true) {
            C15693l c15693lM17322a = c15697p.m17322a();
            if (c15693lM17322a == null) {
                return;
            } else {
                consumer.m17405p(new C15692k(c15693lM17322a.f48917b, c15693lM17322a.f48918c, this.f48906a));
            }
        }
    }
}
