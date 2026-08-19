package p594Y9;

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

/* JADX INFO: renamed from: Y9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9855b extends AbstractMap {

    /* JADX INFO: renamed from: Y */
    public transient C9848a f29363Y;

    /* JADX INFO: renamed from: Z */
    public transient C8217w f29364Z;

    /* JADX INFO: renamed from: o0 */
    public final transient C9920l f29365o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C9896h f29366p0;

    public C9855b(C9896h c9896h, C9920l c9920l) {
        this.f29366p0 = c9896h;
        this.f29365o0 = c9920l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        C9896h c9896h = this.f29366p0;
        C9920l c9920l = c9896h.f29410o0;
        if (this.f29365o0 != c9920l) {
            C8113j c8113j = new C8113j(this);
            while (c8113j.hasNext()) {
                c8113j.next();
                c8113j.remove();
            }
            return;
        }
        Iterator it = c9920l.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        c9920l.clear();
        c9896h.f29411p0 = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C9920l c9920l = this.f29365o0;
        c9920l.getClass();
        try {
            return c9920l.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C9848a c9848a = this.f29363Y;
        if (c9848a != null) {
            return c9848a;
        }
        C9848a c9848a2 = new C9848a(this);
        this.f29363Y = c9848a2;
        return c9848a2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f29365o0.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        C9920l c9920l = this.f29365o0;
        c9920l.getClass();
        try {
            obj2 = c9920l.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        C9896h c9896h = this.f29366p0;
        List list = (List) collection;
        return list instanceof RandomAccess ? new C9869d(c9896h, obj, list, null) : new C8153o(c9896h, obj, list, (C8153o) null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f29365o0.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C9896h c9896h = this.f29366p0;
        C9862c c9862c = c9896h.f29402Y;
        if (c9862c != null) {
            return c9862c;
        }
        C9862c c9862c2 = new C9862c(c9896h, c9896h.f29410o0);
        c9896h.f29402Y = c9862c2;
        return c9862c2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f29365o0.remove(obj);
        if (collection == null) {
            return null;
        }
        C9896h c9896h = this.f29366p0;
        ArrayList arrayList = new ArrayList(3);
        arrayList.addAll(collection);
        c9896h.f29411p0 -= collection.size();
        collection.clear();
        return arrayList;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f29365o0.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f29365o0.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C8217w c8217w = this.f29364Z;
        if (c8217w != null) {
            return c8217w;
        }
        C8217w c8217w2 = new C8217w(this, 5);
        this.f29364Z = c8217w2;
        return c8217w2;
    }
}
