package p571X9;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: X9.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9329n extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: Y */
    public static final Object[] f28147Y = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo9926f(Object[] objArr);

    /* JADX INFO: renamed from: i */
    public int mo9927i() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: j */
    public int mo9928j() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: m */
    public Object[] mo9929m() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f28147Y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] objArrMo9929m = mo9929m();
            if (objArrMo9929m != null) {
                return Arrays.copyOfRange(objArrMo9929m, mo9928j(), mo9927i(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo9926f(objArr);
        return objArr;
    }
}
