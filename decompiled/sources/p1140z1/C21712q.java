package p1140z1;

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
import p586Y0.C9572x;
import p635a1.AbstractC10458p;
import p817j$.lang.Iterable$CC;

/* JADX INFO: renamed from: z1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C21712q implements List, InterfaceC1723a, p817j$.util.List {

    /* JADX INFO: renamed from: Y */
    public final int f68883Y;

    /* JADX INFO: renamed from: Z */
    public final int f68884Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21713r f68885o0;

    public C21712q(C21713r c21713r, int i10, int i11) {
        this.f68885o0 = c21713r;
        this.f68883Y = i10;
        this.f68884Z = i11;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof AbstractC10458p) && indexOf((AbstractC10458p) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((AbstractC10458p) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable, p817j$.util.Collection, p817j$.lang.InterfaceC15531a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object obj = this.f68885o0.f68886Y[i10 + this.f68883Y];
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (AbstractC10458p) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC10458p)) {
            return -1;
        }
        AbstractC10458p abstractC10458p = (AbstractC10458p) obj;
        int i10 = this.f68883Y;
        int i11 = this.f68884Z;
        if (i10 > i11) {
            return -1;
        }
        int i12 = i10;
        while (!AbstractC16544l.m18089b(this.f68885o0.f68886Y[i12], abstractC10458p)) {
            if (i12 == i11) {
                return -1;
            }
            i12++;
        }
        return i12 - i10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f68883Y;
        return new C9572x(this.f68885o0, i10, i10, this.f68884Z);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC10458p)) {
            return -1;
        }
        AbstractC10458p abstractC10458p = (AbstractC10458p) obj;
        int i10 = this.f68884Z;
        int i11 = this.f68883Y;
        if (i11 > i10) {
            return -1;
        }
        while (!AbstractC16544l.m18089b(this.f68885o0.f68886Y[i10], abstractC10458p)) {
            if (i10 == i11) {
                return -1;
            }
            i10--;
        }
        return i10 - i11;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i10 = this.f68883Y;
        return new C9572x(this.f68885o0, i10, i10, this.f68884Z);
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return j$.util.stream.Stream.Wrapper.convert(p817j$.util.Collection.CC.$default$parallelStream(this));
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
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
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f68884Z - this.f68883Y;
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
    public final List subList(int i10, int i11) {
        int i12 = this.f68883Y;
        return new C21712q(this.f68885o0, i10 + i12, i12 + i11);
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
    public final ListIterator listIterator(int i10) {
        int i11 = this.f68883Y;
        int i12 = this.f68884Z;
        return new C9572x(this.f68885o0, i10 + i11, i11, i12);
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

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC16543k.m18087b(this, objArr);
    }
}
