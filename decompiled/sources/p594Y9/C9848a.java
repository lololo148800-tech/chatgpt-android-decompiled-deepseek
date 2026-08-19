package p594Y9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p523V9.AbstractC7944N;
import p523V9.C8113j;

/* JADX INFO: renamed from: Y9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9848a extends AbstractC7944N {

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9855b f29353Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9848a(C9855b c9855b) {
        super(2);
        this.f29353Z = c9855b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f29353Z.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        try {
            return this.f29353Z.f29365o0.entrySet().contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f29353Z.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C8113j(this.f29353Z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object objRemove;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        C9896h c9896h = this.f29353Z.f29366p0;
        Object key = entry.getKey();
        C9920l c9920l = c9896h.f29410o0;
        c9920l.getClass();
        try {
            objRemove = c9920l.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        c9896h.f29411p0 -= size;
        return true;
    }

    @Override // p523V9.AbstractC7944N, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return AbstractC9716D4.m10310b(this, collection);
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
            C9896h c9896h = this.f29353Z.f29366p0;
            C9862c c9862c = c9896h.f29402Y;
            if (c9862c == null) {
                c9862c = new C9862c(c9896h, c9896h.f29410o0);
                c9896h.f29402Y = c9862c;
            }
            return c9862c.retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f29353Z.f29365o0.size();
    }
}
