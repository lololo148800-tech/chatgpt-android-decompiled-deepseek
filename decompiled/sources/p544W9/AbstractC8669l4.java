package p544W9;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: W9.l4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8669l4 extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: Y */
    public static final Object[] f26603Y = new Object[0];

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
    public abstract int mo9224f(Object[] objArr);

    /* JADX INFO: renamed from: i */
    public int mo9214i() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: j */
    public int mo9215j() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: m */
    public Object[] mo9216m() {
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
        return toArray(f26603Y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] objArrMo9216m = mo9216m();
            if (objArrMo9216m != null) {
                return Arrays.copyOfRange(objArrMo9216m, mo9215j(), mo9214i(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo9224f(objArr);
        return objArr;
    }
}
