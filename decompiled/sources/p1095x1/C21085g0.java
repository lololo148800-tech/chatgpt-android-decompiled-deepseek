package p1095x1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import kotlin.jvm.internal.AbstractC16543k;
import p076Cm.InterfaceC1723a;
import p817j$.lang.Iterable$CC;

/* JADX INFO: renamed from: x1.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21085g0 implements Collection, InterfaceC1723a, p817j$.util.Collection {

    /* JADX INFO: renamed from: Y */
    public final Set f67008Y = new LinkedHashSet();

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.f67008Y.add(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f67008Y.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f67008Y.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f67008Y.containsAll(collection);
    }

    @Override // java.lang.Iterable, p817j$.util.Collection, p817j$.lang.InterfaceC15531a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f67008Y.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f67008Y.iterator();
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return j$.util.stream.Stream.Wrapper.convert(p817j$.util.Collection.CC.$default$parallelStream(this));
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f67008Y.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f67008Y.remove(collection);
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f67008Y.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f67008Y.size();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(p817j$.util.Collection.CC.$default$spliterator(this));
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream stream() {
        return j$.util.stream.Stream.Wrapper.convert(p817j$.util.Collection.CC.$default$stream(this));
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC16543k.m18086a(this);
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ p817j$.util.stream.Stream parallelStream() {
        return p817j$.util.Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, p817j$.util.Collection, p817j$.util.List
    public final /* synthetic */ p817j$.util.Spliterator spliterator() {
        return p817j$.util.Collection.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ p817j$.util.stream.Stream stream() {
        return p817j$.util.Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC16543k.m18087b(this, objArr);
    }
}
