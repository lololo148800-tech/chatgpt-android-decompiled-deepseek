package bb;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: bb.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11331x extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: Y */
    public static final Object[] f34263Y = new Object[0];

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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public abstract boolean contains(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract AbstractC11278C mo12697f();

    /* JADX INFO: renamed from: i */
    public abstract int mo12698i(int i10, Object[] objArr);

    /* JADX INFO: renamed from: j */
    public Object[] mo12684j() {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public int mo12685m() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: p */
    public int mo12686p() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: q */
    public abstract boolean mo12687q();

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
        return toArray(f34263Y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] objArrMo12684j = mo12684j();
            if (objArrMo12684j != null) {
                return Arrays.copyOfRange(objArrMo12684j, mo12686p(), mo12685m(), objArr.getClass());
            }
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        mo12698i(0, objArr);
        return objArr;
    }
}
