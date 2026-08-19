package bj;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: bj.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C11442G extends AbstractSet {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f34581Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11444I f34582Z;

    public /* synthetic */ C11442G(C11444I c11444i, int i10) {
        this.f34581Y = i10;
        this.f34582Z = c11444i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f34581Y) {
            case 0:
                this.f34582Z.clear();
                break;
            default:
                this.f34582Z.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C11443H c11443hM12841a;
        Object obj2;
        Object value;
        switch (this.f34581Y) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C11444I c11444i = this.f34582Z;
                c11444i.getClass();
                Object key = entry.getKey();
                C11443H c11443h = null;
                if (key != null) {
                    try {
                        c11443hM12841a = c11444i.m12841a(key, false);
                    } catch (ClassCastException unused) {
                        c11443hM12841a = null;
                    }
                    break;
                } else {
                    c11443hM12841a = null;
                }
                if (c11443hM12841a != null && ((obj2 = c11443hM12841a.f34590t0) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    c11443h = c11443hM12841a;
                }
                return c11443h != null;
            default:
                return this.f34582Z.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f34581Y) {
            case 0:
                return new C11441F(this.f34582Z, 0);
            default:
                return new C11441F(this.f34582Z, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C11443H c11443hM12841a;
        Object obj2;
        Object value;
        switch (this.f34581Y) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C11444I c11444i = this.f34582Z;
                c11444i.getClass();
                Object key = entry.getKey();
                C11443H c11443h = null;
                if (key != null) {
                    try {
                        c11443hM12841a = c11444i.m12841a(key, false);
                    } catch (ClassCastException unused) {
                        c11443hM12841a = null;
                    }
                    break;
                } else {
                    c11443hM12841a = null;
                }
                if (c11443hM12841a != null && ((obj2 = c11443hM12841a.f34590t0) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    c11443h = c11443hM12841a;
                }
                if (c11443h == null) {
                    return false;
                }
                c11444i.m12843c(c11443h, true);
                return true;
            default:
                C11444I c11444i2 = this.f34582Z;
                c11444i2.getClass();
                C11443H c11443hM12841a2 = null;
                if (obj != null) {
                    try {
                        c11443hM12841a2 = c11444i2.m12841a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c11443hM12841a2 != null) {
                    c11444i2.m12843c(c11443hM12841a2, true);
                }
                return c11443hM12841a2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f34581Y) {
            case 0:
                break;
        }
        return this.f34582Z.f34596p0;
    }
}
