package p475T9;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import p817j$.lang.Iterable$CC;
import p817j$.util.Collection;
import p817j$.util.Spliterators;

/* JADX INFO: renamed from: T9.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7284g extends AbstractCollection implements Serializable, Collection {

    /* JADX INFO: renamed from: Y */
    public static final Object[] f23084Y = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: f */
    public abstract Object[] mo7735f();

    @Override // java.lang.Iterable, p817j$.util.Collection, p817j$.lang.InterfaceC15531a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo7736i();

    /* JADX INFO: renamed from: j */
    public abstract int mo7737j();

    /* JADX INFO: renamed from: m */
    public abstract boolean mo7738m();

    /* JADX INFO: renamed from: p */
    public abstract int mo7739p(Object[] objArr);

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return j$.util.stream.Stream.Wrapper.convert(Collection.CC.$default$parallelStream(this));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(Spliterators.spliterator(this, 1296));
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream stream() {
        return j$.util.stream.Stream.Wrapper.convert(Collection.CC.$default$stream(this));
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ p817j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ p817j$.util.stream.Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f23084Y);
    }

    @Override // java.util.Collection, java.lang.Iterable, p817j$.util.Collection, p817j$.util.List
    public final p817j$.util.Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] objArrMo7735f = mo7735f();
            if (objArrMo7735f == null) {
                if (length != 0) {
                    objArr = Arrays.copyOf(objArr, 0);
                }
                objArr = Arrays.copyOf(objArr, size);
            } else {
                return Arrays.copyOfRange(objArrMo7735f, mo7736i(), mo7737j(), objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        mo7739p(objArr);
        return objArr;
    }
}
