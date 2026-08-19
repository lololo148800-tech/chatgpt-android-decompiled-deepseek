package p571X9;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import p523V9.C8113j;
import p523V9.C8153o;
import p523V9.C8217w;

/* JADX INFO: renamed from: X9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9263c extends AbstractMap {

    /* JADX INFO: renamed from: Y */
    public transient C9257b f28046Y;

    /* JADX INFO: renamed from: Z */
    public transient C8217w f28047Z;

    /* JADX INFO: renamed from: o0 */
    public final transient C9323m f28048o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C9299i f28049p0;

    public C9263c(C9299i c9299i, C9323m c9323m) {
        this.f28049p0 = c9299i;
        this.f28048o0 = c9323m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        C9299i c9299i = this.f28049p0;
        C9323m c9323m = c9299i.f28088o0;
        if (this.f28048o0 != c9323m) {
            C8113j c8113j = new C8113j(this);
            while (c8113j.hasNext()) {
                c8113j.next();
                c8113j.remove();
            }
            return;
        }
        Iterator it = c9323m.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        c9323m.clear();
        c9299i.f28089p0 = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C9323m c9323m = this.f28048o0;
        c9323m.getClass();
        try {
            return c9323m.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C9257b c9257b = this.f28046Y;
        if (c9257b != null) {
            return c9257b;
        }
        C9257b c9257b2 = new C9257b(this);
        this.f28046Y = c9257b2;
        return c9257b2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f28048o0.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        C9323m c9323m = this.f28048o0;
        c9323m.getClass();
        try {
            obj2 = c9323m.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        C9299i c9299i = this.f28049p0;
        List list = (List) collection;
        return list instanceof RandomAccess ? new C9275e(c9299i, obj, list, null) : new C8153o(c9299i, obj, list, (C8153o) null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f28048o0.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C9299i c9299i = this.f28049p0;
        C9269d c9269d = c9299i.f28078Y;
        if (c9269d != null) {
            return c9269d;
        }
        C9269d c9269d2 = new C9269d(c9299i, c9299i.f28088o0);
        c9299i.f28078Y = c9269d2;
        return c9269d2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f28048o0.remove(obj);
        if (collection == null) {
            return null;
        }
        C9299i c9299i = this.f28049p0;
        ArrayList arrayList = new ArrayList(3);
        arrayList.addAll(collection);
        c9299i.f28089p0 -= collection.size();
        collection.clear();
        return arrayList;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f28048o0.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f28048o0.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C8217w c8217w = this.f28047Z;
        if (c8217w != null) {
            return c8217w;
        }
        C8217w c8217w2 = new C8217w(this, 3);
        this.f28047Z = c8217w2;
        return c8217w2;
    }
}
