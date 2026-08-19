package p817j$.util.concurrent;

import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import p817j$.util.Collection;
import p817j$.util.stream.Stream;

/* JADX INFO: renamed from: j$.util.concurrent.i */
/* JADX INFO: loaded from: classes4.dex */
public final class C15690i extends AbstractC15683b implements Set, p817j$.util.Set {
    private static final long serialVersionUID = 7249069246763182397L;

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(Collection.CC.$default$parallelStream(this));
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
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

    @Override // p817j$.util.concurrent.AbstractC15683b, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f48906a.containsKey(obj);
    }

    @Override // p817j$.util.concurrent.AbstractC15683b, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f48906a.remove(obj) != null;
    }

    @Override // p817j$.util.concurrent.AbstractC15683b, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f48906a;
        C15693l[] c15693lArr = concurrentHashMap.f48891a;
        int length = c15693lArr == null ? 0 : c15693lArr.length;
        return new C15689h(c15693lArr, length, length, concurrentHashMap, 0);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Object it = iterator();
        int iHashCode = 0;
        while (((AbstractC15682a) it).hasNext()) {
            iHashCode += ((C15689h) it).next().hashCode();
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
        return new C15691j(c15693lArr, length, 0, length, jM17311j < 0 ? 0L : jM17311j, 0);
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
                consumer.m17405p(c15693lM17322a.f48917b);
            }
        }
    }
}
