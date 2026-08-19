package p523V9;

import bb.C11290O;
import bb.C11303b;
import bb.C11305c;
import bb.C11309e;
import bb.C11311f;
import bb.C11315h;
import bb.C11332y;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: V9.k */
/* JADX INFO: loaded from: classes.dex */
public class C8121k extends AbstractMap {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f25455Y;

    /* JADX INFO: renamed from: Z */
    public transient AbstractSet f25456Z;

    /* JADX INFO: renamed from: o0 */
    public transient AbstractCollection f25457o0;

    /* JADX INFO: renamed from: p0 */
    public final transient Map f25458p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Serializable f25459q0;

    public /* synthetic */ C8121k(Serializable serializable, Map map, int i10) {
        this.f25455Y = i10;
        this.f25459q0 = serializable;
        this.f25458p0 = map;
    }

    /* JADX INFO: renamed from: a */
    public C11332y m8627a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        C11290O c11290o = (C11290O) this.f25459q0;
        List list = (List) collection;
        return new C11332y(key, list instanceof RandomAccess ? new C11311f(c11290o, key, list, null) : new C8153o(c11290o, key, list, (C8153o) null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.f25455Y) {
            case 0:
                C8225x c8225x = ((C8177r) this.f25459q0).f25620o0;
                if (((C8225x) this.f25458p0) != c8225x) {
                    C8113j c8113j = new C8113j(this);
                    while (c8113j.hasNext()) {
                        c8113j.next();
                        c8113j.remove();
                    }
                } else {
                    Iterator it = c8225x.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).clear();
                    }
                    c8225x.clear();
                }
                break;
            default:
                C11290O c11290o = (C11290O) this.f25459q0;
                if (this.f25458p0 != c11290o.f34181p0) {
                    C8113j c8113j2 = new C8113j(this, (byte) 0);
                    while (c8113j2.hasNext()) {
                        c8113j2.next();
                        c8113j2.remove();
                    }
                } else {
                    c11290o.m12710b();
                }
                break;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f25455Y) {
            case 0:
                C8225x c8225x = (C8225x) this.f25458p0;
                c8225x.getClass();
                try {
                    return c8225x.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                Map map = this.f25458p0;
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.f25455Y) {
            case 0:
                C8105i c8105i = (C8105i) this.f25456Z;
                if (c8105i != null) {
                    return c8105i;
                }
                C8105i c8105i2 = new C8105i(this);
                this.f25456Z = c8105i2;
                return c8105i2;
            default:
                C11303b c11303b = (C11303b) this.f25456Z;
                if (c11303b != null) {
                    return c11303b;
                }
                C11303b c11303b2 = new C11303b(this);
                this.f25456Z = c11303b2;
                return c11303b2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        switch (this.f25455Y) {
            case 0:
                return this == obj || ((C8225x) this.f25458p0).equals(obj);
            default:
                return this == obj || this.f25458p0.equals(obj);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f25455Y) {
            case 0:
                C8225x c8225x = (C8225x) this.f25458p0;
                c8225x.getClass();
                try {
                    obj2 = c8225x.get(obj);
                    break;
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection == null) {
                    return null;
                }
                C8177r c8177r = (C8177r) this.f25459q0;
                List list = (List) collection;
                return list instanceof RandomAccess ? new C8137m(c8177r, obj, list, null) : new C8153o(c8177r, obj, list, (C8153o) null);
            default:
                Map map = this.f25458p0;
                map.getClass();
                try {
                    obj3 = map.get(obj);
                    break;
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 == null) {
                    return null;
                }
                C11290O c11290o = (C11290O) this.f25459q0;
                List list2 = (List) collection2;
                return list2 instanceof RandomAccess ? new C11311f(c11290o, obj, list2, null) : new C8153o(c11290o, obj, list2, (C8153o) null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        switch (this.f25455Y) {
            case 0:
                return ((C8225x) this.f25458p0).hashCode();
            default:
                return this.f25458p0.hashCode();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        C11305c c11315h;
        switch (this.f25455Y) {
            case 0:
                C8177r c8177r = (C8177r) this.f25459q0;
                C8129l c8129l = c8177r.f25594Y;
                if (c8129l != null) {
                    return c8129l;
                }
                C8129l c8129l2 = new C8129l(c8177r, c8177r.f25620o0);
                c8177r.f25594Y = c8129l2;
                return c8129l2;
            default:
                C11290O c11290o = (C11290O) this.f25459q0;
                C11305c c11305c = c11290o.f34232Y;
                if (c11305c == null) {
                    Map map = c11290o.f34181p0;
                    if (map instanceof NavigableMap) {
                        c11315h = new C11309e(c11290o, (NavigableMap) map);
                    } else {
                        c11315h = map instanceof SortedMap ? new C11315h(c11290o, (SortedMap) map) : new C11305c(c11290o, map);
                    }
                    c11305c = c11315h;
                    c11290o.f34232Y = c11305c;
                }
                return c11305c;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.f25455Y) {
            case 0:
                Collection collection = (Collection) ((C8225x) this.f25458p0).remove(obj);
                if (collection == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection);
                collection.size();
                collection.clear();
                return arrayList;
            default:
                Collection collection2 = (Collection) this.f25458p0.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                C11290O c11290o = (C11290O) this.f25459q0;
                List list = (List) c11290o.f34183r0.get();
                list.addAll(collection2);
                c11290o.f34182q0 -= collection2.size();
                collection2.clear();
                return list;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.f25455Y) {
            case 0:
                return ((C8225x) this.f25458p0).size();
            default:
                return this.f25458p0.size();
        }
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        switch (this.f25455Y) {
            case 0:
                return ((C8225x) this.f25458p0).toString();
            default:
                return this.f25458p0.toString();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.f25455Y) {
            case 0:
                C8217w c8217w = (C8217w) this.f25457o0;
                if (c8217w != null) {
                    return c8217w;
                }
                C8217w c8217w2 = new C8217w(this, 1);
                this.f25457o0 = c8217w2;
                return c8217w2;
            default:
                C8217w c8217w3 = (C8217w) this.f25457o0;
                if (c8217w3 != null) {
                    return c8217w3;
                }
                C8217w c8217w4 = new C8217w(this, 8);
                this.f25457o0 = c8217w4;
                return c8217w4;
        }
    }
}
