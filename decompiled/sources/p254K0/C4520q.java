package p254K0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import kotlin.jvm.internal.AbstractC16543k;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1723a;
import p817j$.lang.Iterable$CC;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: renamed from: K0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C4520q implements List, InterfaceC1723a, p817j$.util.List {

    /* JADX INFO: renamed from: s0 */
    public static final C4520q f14769s0 = new C4520q(C17689w.f56480Y);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Object f14770Y;

    /* JADX INFO: renamed from: Z */
    public final int f14771Z;

    /* JADX INFO: renamed from: o0 */
    public final int f14772o0;

    /* JADX INFO: renamed from: p0 */
    public final int f14773p0;

    /* JADX INFO: renamed from: q0 */
    public final int f14774q0;

    /* JADX INFO: renamed from: r0 */
    public final int f14775r0;

    public C4520q(List list) {
        int iNextIndex;
        int iNextIndex2;
        this.f14770Y = list;
        Iterator it = iterator();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            iNextIndex = -1;
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (((C4519p) it.next()).f14767f) {
                break;
            } else {
                i11++;
            }
        }
        this.f14771Z = i11;
        Iterator it2 = iterator();
        int i12 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i12 = -1;
                break;
            } else if (!((C4519p) it2.next()).f14766e) {
                break;
            } else {
                i12++;
            }
        }
        this.f14772o0 = i12;
        ListIterator listIterator = listIterator(size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex2 = -1;
                break;
            } else if (!((C4519p) listIterator.previous()).f14766e) {
                iNextIndex2 = listIterator.nextIndex();
                break;
            }
        }
        this.f14773p0 = iNextIndex2;
        Iterator it3 = iterator();
        while (true) {
            if (!it3.hasNext()) {
                i10 = -1;
                break;
            } else if (((C4519p) it3.next()).f14765d) {
                break;
            } else {
                i10++;
            }
        }
        this.f14774q0 = i10;
        ListIterator listIterator2 = listIterator(size());
        while (listIterator2.hasPrevious()) {
            if (((C4519p) listIterator2.previous()).f14765d) {
                iNextIndex = listIterator2.nextIndex();
                break;
            }
        }
        this.f14775r0 = iNextIndex;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C4519p)) {
            return false;
        }
        return this.f14770Y.contains((C4519p) obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f14770Y.containsAll(collection);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4520q)) {
            return false;
        }
        ?? r6 = this.f14770Y;
        C4520q c4520q = (C4520q) obj;
        if (r6.size() != c4520q.f14770Y.size()) {
            return false;
        }
        int size = r6.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!AbstractC16544l.m18089b(get(i10), c4520q.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C4519p get(int i10) {
        return (C4519p) this.f14770Y.get(i10);
    }

    @Override // java.lang.Iterable, p817j$.util.Collection, p817j$.lang.InterfaceC15531a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        int size = size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += ((C4519p) get(i10)).hashCode() * 31;
        }
        return iHashCode;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof C4519p)) {
            return -1;
        }
        return this.f14770Y.indexOf((C4519p) obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f14770Y.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f14770Y.iterator();
    }

    /* JADX INFO: renamed from: j */
    public final C4519p m5261j() {
        C4519p c4519p = (C4519p) AbstractC17680n.m19344T(this.f14774q0, this);
        if (c4519p != null) {
            return c4519p;
        }
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof C4519p)) {
            return -1;
        }
        return this.f14770Y.lastIndexOf((C4519p) obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f14770Y.listIterator();
    }

    /* JADX INFO: renamed from: m */
    public final C4519p m5262m() {
        C4519p c4519p = (C4519p) AbstractC17680n.m19344T(this.f14775r0, this);
        if (c4519p != null) {
            return c4519p;
        }
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f14770Y.size();
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final List subList(int i10, int i11) {
        return this.f14770Y.subList(i10, i11);
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return this.f14770Y.listIterator(i10);
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
