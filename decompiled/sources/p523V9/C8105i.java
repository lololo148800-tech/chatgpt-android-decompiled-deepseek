package p523V9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p594Y9.AbstractC9792Q2;

/* JADX INFO: renamed from: V9.i */
/* JADX INFO: loaded from: classes.dex */
public final class C8105i extends AbstractC7944N {

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8121k f25440Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8105i(C8121k c8121k) {
        super(0);
        this.f25440Z = c8121k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f25440Z.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        try {
            return ((C8225x) this.f25440Z.f25458p0).entrySet().contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f25440Z.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C8113j(this.f25440Z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object objRemove;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        C8177r c8177r = (C8177r) this.f25440Z.f25459q0;
        Object key = entry.getKey();
        C8225x c8225x = c8177r.f25620o0;
        c8225x.getClass();
        try {
            objRemove = c8225x.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection == null) {
            return true;
        }
        collection.size();
        collection.clear();
        return true;
    }

    @Override // p523V9.AbstractC7944N, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return AbstractC9792Q2.m10410b(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean zRemove = false;
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
            return zRemove;
        }
    }

    @Override // p523V9.AbstractC7944N, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int iCeil;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size >= 3) {
                iCeil = size < 1073741824 ? (int) Math.ceil(((double) size) / 0.75d) : Integer.MAX_VALUE;
            } else {
                if (size < 0) {
                    throw new IllegalArgumentException(AbstractC10763a.m11048f(size, "expectedSize cannot be negative but was: "));
                }
                iCeil = size + 1;
            }
            HashSet hashSet = new HashSet(iCeil);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            C8177r c8177r = (C8177r) this.f25440Z.f25459q0;
            C8129l c8129l = c8177r.f25594Y;
            if (c8129l == null) {
                c8129l = new C8129l(c8177r, c8177r.f25620o0);
                c8177r.f25594Y = c8129l;
            }
            return c8129l.retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((C8225x) this.f25440Z.f25458p0).size();
    }
}
