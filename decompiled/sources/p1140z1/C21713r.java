package p1140z1;

import java.util.Arrays;
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
import p049Bm.InterfaceC1426a;
import p076Cm.InterfaceC1723a;
import p586Y0.C9572x;
import p635a1.AbstractC10458p;
import p817j$.lang.Iterable$CC;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: z1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C21713r implements List, InterfaceC1723a, p817j$.util.List {

    /* JADX INFO: renamed from: p0 */
    public int f68889p0;

    /* JADX INFO: renamed from: Y */
    public Object[] f68886Y = new Object[16];

    /* JADX INFO: renamed from: Z */
    public long[] f68887Z = new long[16];

    /* JADX INFO: renamed from: o0 */
    public int f68888o0 = -1;

    /* JADX INFO: renamed from: q0 */
    public boolean f68890q0 = true;

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
        this.f68888o0 = -1;
        m22228m();
        this.f68890q0 = true;
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

    /* JADX INFO: renamed from: f */
    public final long m22226f() {
        long jM22196a = AbstractC21690f.m22196a(Float.POSITIVE_INFINITY, false);
        int i10 = this.f68888o0 + 1;
        int iM19381j = AbstractC17681o.m19381j(this);
        if (i10 <= iM19381j) {
            while (true) {
                long j10 = this.f68887Z[i10];
                if (AbstractC21690f.m22203h(j10, jM22196a) < 0) {
                    jM22196a = j10;
                }
                if (Float.intBitsToFloat((int) (jM22196a >> 32)) < 0.0f && ((int) (4294967295L & jM22196a)) != 0) {
                    return jM22196a;
                }
                if (i10 != iM19381j) {
                    i10++;
                }
            }
        }
        return jM22196a;
    }

    @Override // java.lang.Iterable, p817j$.util.Collection, p817j$.lang.InterfaceC15531a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object obj = this.f68886Y[i10];
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (AbstractC10458p) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC10458p)) {
            return -1;
        }
        AbstractC10458p abstractC10458p = (AbstractC10458p) obj;
        int iM19381j = AbstractC17681o.m19381j(this);
        if (iM19381j < 0) {
            return -1;
        }
        int i10 = 0;
        while (!AbstractC16544l.m18089b(this.f68886Y[i10], abstractC10458p)) {
            if (i10 == iM19381j) {
                return -1;
            }
            i10++;
        }
        return i10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f68889p0 == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C9572x(this, 0, 7);
    }

    /* JADX INFO: renamed from: j */
    public final void m22227j(AbstractC10458p abstractC10458p, float f10, boolean z6, InterfaceC1426a interfaceC1426a) {
        int i10 = this.f68888o0;
        int i11 = i10 + 1;
        this.f68888o0 = i11;
        Object[] objArr = this.f68886Y;
        if (i11 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
            this.f68886Y = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.f68887Z, length);
            AbstractC16544l.m18093f(jArrCopyOf, "copyOf(this, newSize)");
            this.f68887Z = jArrCopyOf;
        }
        Object[] objArr2 = this.f68886Y;
        int i12 = this.f68888o0;
        objArr2[i12] = abstractC10458p;
        this.f68887Z[i12] = AbstractC21690f.m22196a(f10, z6);
        m22228m();
        interfaceC1426a.invoke();
        this.f68888o0 = i10;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC10458p)) {
            return -1;
        }
        AbstractC10458p abstractC10458p = (AbstractC10458p) obj;
        for (int iM19381j = AbstractC17681o.m19381j(this); -1 < iM19381j; iM19381j--) {
            if (AbstractC16544l.m18089b(this.f68886Y[iM19381j], abstractC10458p)) {
                return iM19381j;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C9572x(this, 0, 7);
    }

    /* JADX INFO: renamed from: m */
    public final void m22228m() {
        int i10 = this.f68888o0 + 1;
        int iM19381j = AbstractC17681o.m19381j(this);
        if (i10 <= iM19381j) {
            while (true) {
                this.f68886Y[i10] = null;
                if (i10 == iM19381j) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f68889p0 = this.f68888o0 + 1;
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
        return this.f68889p0;
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
        return new C21712q(this, i10, i11);
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
        return new C9572x(this, i10, 6);
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
