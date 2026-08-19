package p594Y9;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: Y9.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9926m extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: Y */
    public static final Object[] f29473Y = new Object[0];

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
    public abstract int mo10285f(Object[] objArr);

    /* JADX INFO: renamed from: i */
    public int mo10584i() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: j */
    public int mo10585j() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: m */
    public Object[] mo10586m() {
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
        return toArray(f29473Y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] objArrMo10586m = mo10586m();
            if (objArrMo10586m != null) {
                return Arrays.copyOfRange(objArrMo10586m, mo10585j(), mo10584i(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo10285f(objArr);
        return objArr;
    }
}
