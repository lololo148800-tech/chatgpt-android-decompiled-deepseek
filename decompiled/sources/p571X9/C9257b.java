package p571X9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p523V9.AbstractC7944N;
import p523V9.C8113j;
import p594Y9.AbstractC9874d4;

/* JADX INFO: renamed from: X9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9257b extends AbstractC7944N {

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9263c f28043Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9257b(C9263c c9263c) {
        super(1);
        this.f28043Z = c9263c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f28043Z.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        try {
            return this.f28043Z.f28048o0.entrySet().contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f28043Z.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C8113j(this.f28043Z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object objRemove;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        C9299i c9299i = this.f28043Z.f28049p0;
        Object key = entry.getKey();
        C9323m c9323m = c9299i.f28088o0;
        c9323m.getClass();
        try {
            objRemove = c9323m.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        c9299i.f28089p0 -= size;
        return true;
    }

    @Override // p523V9.AbstractC7944N, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return AbstractC9874d4.m10531b(this, collection);
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
            C9299i c9299i = this.f28043Z.f28049p0;
            C9269d c9269d = c9299i.f28078Y;
            if (c9269d == null) {
                c9269d = new C9269d(c9299i, c9299i.f28088o0);
                c9299i.f28078Y = c9269d;
            }
            return c9269d.retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f28043Z.f28048o0.size();
    }
}
