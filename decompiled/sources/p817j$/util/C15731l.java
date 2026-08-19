package p817j$.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: j$.util.l */
/* JADX INFO: loaded from: classes4.dex */
class C15731l implements Collection, Serializable, Collection {
    private static final long serialVersionUID = 1820017752578914078L;

    /* JADX INFO: renamed from: a */
    final Collection f49002a;

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return j$.util.stream.Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream stream() {
        return j$.util.stream.Stream.Wrapper.convert(stream());
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    C15731l(Collection collection) {
        collection.getClass();
        this.f49002a = collection;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f49002a.size();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f49002a.isEmpty();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f49002a.contains(obj);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return this.f49002a.toArray();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f49002a.toArray(objArr);
    }

    public final String toString() {
        return this.f49002a.toString();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C15729k(this);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f49002a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Iterable, p817j$.util.Collection, p817j$.lang.InterfaceC15531a
    public void forEach(Consumer consumer) {
        Collection.EL.m17238a(this.f49002a, consumer);
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable, p817j$.util.Collection, p817j$.util.List
    public Spliterator spliterator() {
        return Collection.EL.m17240c(this.f49002a);
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public p817j$.util.stream.Stream stream() {
        return Collection.EL.stream(this.f49002a);
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public p817j$.util.stream.Stream parallelStream() {
        return Collection.EL.m17239b(this.f49002a);
    }
}
