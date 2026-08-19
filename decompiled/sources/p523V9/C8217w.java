package p523V9;

import bb.C11286K;
import bb.C11290O;
import bb.C11301a;
import bb.C11321n;
import bb.C11324q;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p499U9.AbstractC7589s;
import p571X9.C9263c;
import p571X9.C9305j;
import p571X9.C9323m;
import p594Y9.AbstractC9728F4;
import p594Y9.AbstractC9762L2;
import p594Y9.AbstractC9881e4;
import p594Y9.C9855b;
import p594Y9.C9902i;
import p594Y9.C9920l;
import p594Y9.C9980v;

/* JADX INFO: renamed from: V9.w */
/* JADX INFO: loaded from: classes.dex */
public final class C8217w extends AbstractCollection {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f25671Y;

    /* JADX INFO: renamed from: Z */
    public final Object f25672Z;

    public /* synthetic */ C8217w(Serializable serializable, int i10) {
        this.f25671Y = i10;
        this.f25672Z = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f25671Y) {
            case 0:
                ((C8225x) this.f25672Z).clear();
                break;
            case 1:
                ((C8121k) this.f25672Z).clear();
                break;
            case 2:
                ((C9323m) this.f25672Z).clear();
                break;
            case 3:
                ((C9263c) this.f25672Z).clear();
                break;
            case 4:
                ((C9920l) this.f25672Z).clear();
                break;
            case 5:
                ((C9855b) this.f25672Z).clear();
                break;
            case 6:
                ((C11290O) this.f25672Z).m12710b();
                break;
            case 7:
                ((C11324q) this.f25672Z).clear();
                break;
            default:
                ((C8121k) this.f25672Z).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f25671Y) {
            case 1:
                return ((C8121k) this.f25672Z).containsValue(obj);
            case 2:
            case 4:
            case 7:
            default:
                return super.contains(obj);
            case 3:
                return ((C9263c) this.f25672Z).containsValue(obj);
            case 5:
                return ((C9855b) this.f25672Z).containsValue(obj);
            case 6:
                Iterator it = ((C8217w) ((C11290O) this.f25672Z).mo12709a().values()).iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 8:
                return ((C8121k) this.f25672Z).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f25671Y) {
            case 1:
                return ((C8121k) this.f25672Z).isEmpty();
            case 3:
                return ((C9263c) this.f25672Z).isEmpty();
            case 5:
                return ((C9855b) this.f25672Z).isEmpty();
            case 8:
                return ((C8121k) this.f25672Z).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f25671Y) {
            case 0:
                C8225x c8225x = (C8225x) this.f25672Z;
                Map mapM8853a = c8225x.m8853a();
                return mapM8853a != null ? mapM8853a.values().iterator() : new C8185s(c8225x, 2);
            case 1:
                return new C7880F(((C8121k) this.f25672Z).entrySet().iterator(), 0);
            case 2:
                C9323m c9323m = (C9323m) this.f25672Z;
                Map mapM9914a = c9323m.m9914a();
                return mapM9914a != null ? mapM9914a.values().iterator() : new C9305j(c9323m, 2);
            case 3:
                return new C7880F(((C9263c) this.f25672Z).entrySet().iterator(), 1);
            case 4:
                C9920l c9920l = (C9920l) this.f25672Z;
                Map mapM10575a = c9920l.m10575a();
                return mapM10575a != null ? mapM10575a.values().iterator() : new C9902i(c9920l, 2);
            case 5:
                return new C9980v(((C9855b) this.f25672Z).entrySet().iterator(), 0);
            case 6:
                return new C11301a((C11290O) this.f25672Z);
            case 7:
                C11324q c11324q = (C11324q) this.f25672Z;
                Map mapM12744b = c11324q.m12744b();
                return mapM12744b != null ? mapM12744b.values().iterator() : new C11321n(c11324q, 2);
            default:
                return new C11286K(((C8121k) this.f25672Z).entrySet().iterator(), 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f25671Y) {
            case 1:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C8121k c8121k = (C8121k) this.f25672Z;
                    for (Map.Entry entry : c8121k.entrySet()) {
                        if (AbstractC9762L2.m10365b(obj, entry.getValue())) {
                            c8121k.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 3:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    C9263c c9263c = (C9263c) this.f25672Z;
                    for (Map.Entry entry2 : c9263c.entrySet()) {
                        if (AbstractC9881e4.m10535b(obj, entry2.getValue())) {
                            c9263c.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 5:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused3) {
                    C9855b c9855b = (C9855b) this.f25672Z;
                    for (Map.Entry entry3 : c9855b.entrySet()) {
                        if (AbstractC9728F4.m10319b(obj, entry3.getValue())) {
                            c9855b.remove(entry3.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 8:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused4) {
                    C8121k c8121k2 = (C8121k) this.f25672Z;
                    for (Map.Entry entry4 : c8121k2.entrySet()) {
                        if (AbstractC7589s.m7931f(obj, entry4.getValue())) {
                            c8121k2.remove(entry4.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f25671Y) {
            case 1:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C8121k c8121k = (C8121k) this.f25672Z;
                    for (Map.Entry entry : c8121k.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((C8177r) c8121k.f25459q0).m8752b().removeAll(hashSet);
                }
            case 3:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    C9263c c9263c = (C9263c) this.f25672Z;
                    for (Map.Entry entry2 : c9263c.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return c9263c.f28049p0.m9871b().removeAll(hashSet2);
                }
            case 5:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    C9855b c9855b = (C9855b) this.f25672Z;
                    for (Map.Entry entry3 : c9855b.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return c9855b.f29366p0.m10543b().removeAll(hashSet3);
                }
            case 8:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused4) {
                    HashSet hashSet4 = new HashSet();
                    C8121k c8121k2 = (C8121k) this.f25672Z;
                    for (Map.Entry entry4 : c8121k2.entrySet()) {
                        if (collection.contains(entry4.getValue())) {
                            hashSet4.add(entry4.getKey());
                        }
                    }
                    return c8121k2.keySet().removeAll(hashSet4);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f25671Y) {
            case 1:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C8121k c8121k = (C8121k) this.f25672Z;
                    for (Map.Entry entry : c8121k.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((C8177r) c8121k.f25459q0).m8752b().retainAll(hashSet);
                }
            case 3:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    C9263c c9263c = (C9263c) this.f25672Z;
                    for (Map.Entry entry2 : c9263c.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return c9263c.f28049p0.m9871b().retainAll(hashSet2);
                }
            case 5:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    C9855b c9855b = (C9855b) this.f25672Z;
                    for (Map.Entry entry3 : c9855b.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return c9855b.f29366p0.m10543b().retainAll(hashSet3);
                }
            case 8:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused4) {
                    HashSet hashSet4 = new HashSet();
                    C8121k c8121k2 = (C8121k) this.f25672Z;
                    for (Map.Entry entry4 : c8121k2.entrySet()) {
                        if (collection.contains(entry4.getValue())) {
                            hashSet4.add(entry4.getKey());
                        }
                    }
                    return c8121k2.keySet().retainAll(hashSet4);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f25671Y) {
            case 0:
                return ((C8225x) this.f25672Z).size();
            case 1:
                return ((C8121k) this.f25672Z).size();
            case 2:
                return ((C9323m) this.f25672Z).size();
            case 3:
                return ((C9263c) this.f25672Z).size();
            case 4:
                return ((C9920l) this.f25672Z).size();
            case 5:
                return ((C9855b) this.f25672Z).size();
            case 6:
                return ((C11290O) this.f25672Z).f34182q0;
            case 7:
                return ((C11324q) this.f25672Z).size();
            default:
                return ((C8121k) this.f25672Z).f25458p0.size();
        }
    }

    public /* synthetic */ C8217w(AbstractMap abstractMap, int i10) {
        this.f25671Y = i10;
        this.f25672Z = abstractMap;
    }
}
