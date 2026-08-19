package p817j$.util;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import p817j$.util.stream.Stream;

/* JADX INFO: renamed from: j$.util.f */
/* JADX INFO: loaded from: classes4.dex */
class C15712f implements Collection, Serializable, Collection {
    private static final long serialVersionUID = 3053995032091335093L;

    /* JADX INFO: renamed from: a */
    final Collection f48955a;

    /* JADX INFO: renamed from: b */
    final Object f48956b;

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    C15712f(Collection collection) {
        this.f48955a = (Collection) Objects.requireNonNull(collection);
        this.f48956b = this;
    }

    C15712f(Collection collection, Object obj) {
        this.f48955a = (Collection) Objects.requireNonNull(collection);
        this.f48956b = Objects.requireNonNull(obj);
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.f48956b) {
            size = this.f48955a.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f48956b) {
            zIsEmpty = this.f48955a.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f48956b) {
            zContains = this.f48955a.contains(obj);
        }
        return zContains;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.f48956b) {
            array = this.f48955a.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f48956b) {
            array = this.f48955a.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f48955a.iterator();
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        boolean zAdd;
        synchronized (this.f48956b) {
            zAdd = this.f48955a.add(obj);
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f48956b) {
            zRemove = this.f48955a.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.f48956b) {
            zContainsAll = this.f48955a.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.f48956b) {
            zAddAll = this.f48955a.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f48956b) {
            zRemoveAll = this.f48955a.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.f48956b) {
            zRetainAll = this.f48955a.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.f48956b) {
            this.f48955a.clear();
        }
    }

    public final String toString() {
        String string;
        synchronized (this.f48956b) {
            string = this.f48955a.toString();
        }
        return string;
    }

    @Override // java.lang.Iterable, p817j$.util.Collection, p817j$.lang.InterfaceC15531a
    public final void forEach(Consumer consumer) {
        synchronized (this.f48956b) {
            Collection.EL.m17238a(this.f48955a, consumer);
        }
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        boolean zRemoveIf;
        synchronized (this.f48956b) {
            Collection collection = this.f48955a;
            zRemoveIf = collection instanceof Collection ? ((Collection) collection).removeIf(predicate) : Collection.CC.$default$removeIf(collection, predicate);
        }
        return zRemoveIf;
    }

    @Override // java.util.Collection, java.lang.Iterable, p817j$.util.Collection, p817j$.util.List
    public final Spliterator spliterator() {
        return Collection.EL.m17240c(this.f48955a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterator.Wrapper.convert(Collection.EL.m17240c(this.f48955a));
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final Stream stream() {
        return Collection.EL.stream(this.f48955a);
    }

    @Override // java.util.Collection
    public final java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(Collection.EL.stream(this.f48955a));
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final Stream parallelStream() {
        return Collection.EL.m17239b(this.f48955a);
    }

    @Override // java.util.Collection
    public final java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(Collection.EL.m17239b(this.f48955a));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f48956b) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
