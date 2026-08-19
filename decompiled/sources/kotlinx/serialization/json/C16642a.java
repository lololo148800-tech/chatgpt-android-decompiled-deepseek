package kotlinx.serialization.json;

import bo.C11518f;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import kotlin.jvm.internal.AbstractC16543k;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1723a;
import p315Me.Myis.CxcULo;
import p559Wn.InterfaceC8975g;
import p817j$.lang.Iterable$CC;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: kotlinx.serialization.json.a */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8975g(with = C11518f.class)
public final class C16642a extends AbstractC16643b implements List<AbstractC16643b>, InterfaceC1723a, p817j$.util.List {
    public static final JsonArray$Companion Companion = new JsonArray$Companion();

    /* JADX INFO: renamed from: Y */
    public final List f53330Y;

    public C16642a(List content) {
        AbstractC16544l.m18094g(content, "content");
        this.f53330Y = content;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, AbstractC16643b abstractC16643b) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends AbstractC16643b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof AbstractC16643b)) {
            return false;
        }
        AbstractC16643b element = (AbstractC16643b) obj;
        AbstractC16544l.m18094g(element, "element");
        return this.f53330Y.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        return this.f53330Y.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return AbstractC16544l.m18089b(this.f53330Y, obj);
    }

    @Override // java.lang.Iterable, p817j$.util.Collection, p817j$.lang.InterfaceC15531a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final AbstractC16643b get(int i10) {
        return (AbstractC16643b) this.f53330Y.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f53330Y.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC16643b)) {
            return -1;
        }
        AbstractC16643b element = (AbstractC16643b) obj;
        AbstractC16544l.m18094g(element, "element");
        return this.f53330Y.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f53330Y.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f53330Y.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC16643b)) {
            return -1;
        }
        AbstractC16643b element = (AbstractC16643b) obj;
        AbstractC16544l.m18094g(element, "element");
        return this.f53330Y.lastIndexOf(element);
    }

    @Override // java.util.List
    public final ListIterator<AbstractC16643b> listIterator() {
        return this.f53330Y.listIterator();
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return j$.util.stream.Stream.Wrapper.convert(p817j$.util.Collection.CC.$default$parallelStream(this));
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC16643b remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return p817j$.util.Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, p817j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC16643b set(int i10, AbstractC16643b abstractC16643b) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f53330Y.size();
    }

    @Override // java.util.List, p817j$.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(p817j$.util.List.CC.$default$spliterator(this));
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream stream() {
        return j$.util.stream.Stream.Wrapper.convert(p817j$.util.Collection.CC.$default$stream(this));
    }

    @Override // java.util.List
    public final List<AbstractC16643b> subList(int i10, int i11) {
        return this.f53330Y.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC16543k.m18086a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<AbstractC16643b> listIterator(int i10) {
        return this.f53330Y.listIterator(i10);
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ p817j$.util.stream.Stream parallelStream() {
        return p817j$.util.Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, p817j$.util.List, p817j$.util.Collection
    public final /* synthetic */ p817j$.util.Spliterator spliterator() {
        return p817j$.util.List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ p817j$.util.stream.Stream stream() {
        return p817j$.util.Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public final String toString() {
        return AbstractC17680n.m19349Y(this.f53330Y, CxcULo.RjCSJJHeStysLP, "[", "]", 0, null, null, 56);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC16544l.m18094g(array, "array");
        return AbstractC16543k.m18087b(this, array);
    }
}
