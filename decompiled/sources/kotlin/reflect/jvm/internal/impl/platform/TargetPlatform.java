package kotlin.reflect.jvm.internal.impl.platform;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import kotlin.jvm.internal.AbstractC16543k;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1723a;
import p817j$.lang.Iterable$CC;

/* JADX INFO: loaded from: classes2.dex */
public class TargetPlatform implements Collection<SimplePlatform>, InterfaceC1723a, p817j$.util.Collection {
    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(SimplePlatform simplePlatform) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends SimplePlatform> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(SimplePlatform element) {
        AbstractC16544l.m18094g(element, "element");
        throw null;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        AbstractC16544l.m18094g(elements, "elements");
        throw null;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TargetPlatform)) {
            return false;
        }
        ((TargetPlatform) obj).getClass();
        return AbstractC16544l.m18089b(null, null);
    }

    @Override // java.lang.Iterable, p817j$.util.Collection, p817j$.lang.InterfaceC15531a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    public final Set<SimplePlatform> getComponentPlatforms() {
        return null;
    }

    public int getSize() {
        throw null;
    }

    @Override // java.util.Collection
    public int hashCode() {
        throw null;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        throw null;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<SimplePlatform> iterator() {
        throw null;
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream<SimplePlatform> parallelStream() {
        return j$.util.stream.Stream.Wrapper.convert(p817j$.util.Collection.CC.$default$parallelStream(this));
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public boolean removeIf(Predicate<? super SimplePlatform> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(p817j$.util.Collection.CC.$default$spliterator(this));
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream<SimplePlatform> stream() {
        return j$.util.stream.Stream.Wrapper.convert(p817j$.util.Collection.CC.$default$stream(this));
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC16543k.m18086a(this);
    }

    public String toString() {
        return PlatformUtilKt.getPresentableDescription(this);
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof SimplePlatform) {
            return contains((SimplePlatform) obj);
        }
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ p817j$.util.stream.Stream parallelStream() {
        return p817j$.util.Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, p817j$.util.Collection, p817j$.util.List
    public final /* synthetic */ p817j$.util.Spliterator spliterator() {
        return p817j$.util.Collection.CC.$default$spliterator(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ p817j$.util.stream.Stream stream() {
        return p817j$.util.Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        AbstractC16544l.m18094g(array, "array");
        return (T[]) AbstractC16543k.m18087b(this, array);
    }
}
