package p817j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: j$.util.concurrent.b */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15683b implements Collection, Serializable {
    private static final long serialVersionUID = 7249069246763182397L;

    /* JADX INFO: renamed from: a */
    final ConcurrentHashMap f48906a;

    @Override // java.util.Collection
    public abstract boolean contains(Object obj);

    @Override // java.util.Collection, java.lang.Iterable
    public abstract Iterator iterator();

    @Override // java.util.Collection
    public abstract boolean remove(Object obj);

    @Override // java.util.Collection
    public final Object[] toArray() {
        long jM17311j = this.f48906a.m17311j();
        if (jM17311j < 0) {
            jM17311j = 0;
        }
        if (jM17311j > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i10 = (int) jM17311j;
        Object[] objArrCopyOf = new Object[i10];
        int i11 = 0;
        for (Object obj : this) {
            if (i11 == i10) {
                if (i10 >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i12 = i10 < 1073741819 ? (i10 >>> 1) + 1 + i10 : 2147483639;
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i12);
                i10 = i12;
            }
            objArrCopyOf[i11] = obj;
            i11++;
        }
        return i11 == i10 ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i11);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        long jM17311j = this.f48906a.m17311j();
        if (jM17311j < 0) {
            jM17311j = 0;
        }
        if (jM17311j > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i10 = (int) jM17311j;
        Object[] objArrCopyOf = objArr.length >= i10 ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        int length = objArrCopyOf.length;
        int i11 = 0;
        for (Object obj : this) {
            if (i11 == length) {
                if (length >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i12 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i12);
                length = i12;
            }
            objArrCopyOf[i11] = obj;
            i11++;
        }
        if (objArr != objArrCopyOf || i11 >= length) {
            return i11 == length ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i11);
        }
        objArrCopyOf[i11] = null;
        return objArrCopyOf;
    }

    AbstractC15683b(ConcurrentHashMap concurrentHashMap) {
        this.f48906a = concurrentHashMap;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f48906a.clear();
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f48906a.size();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f48906a.isEmpty();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb2.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(", ");
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection == this) {
            return true;
        }
        for (Object obj : collection) {
            if (obj == null || !contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        collection.getClass();
        C15693l[] c15693lArr = this.f48906a.f48891a;
        boolean zRemove = false;
        if (c15693lArr == null) {
            return false;
        }
        if ((collection instanceof Set) && collection.size() > c15693lArr.length) {
            Iterator it = iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    zRemove = true;
                }
            }
        } else {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                zRemove |= remove(it2.next());
            }
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        Iterator it = iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }
}
