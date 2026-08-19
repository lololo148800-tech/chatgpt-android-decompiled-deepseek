package p571X9;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import p594Y9.AbstractC9860b4;
import p594Y9.AbstractC9881e4;

/* JADX INFO: renamed from: X9.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9311k extends AbstractSet {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f28112Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9323m f28113Z;

    public /* synthetic */ C9311k(C9323m c9323m, int i10) {
        this.f28112Y = i10;
        this.f28113Z = c9323m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f28112Y) {
            case 0:
                this.f28113Z.clear();
                break;
            default:
                this.f28113Z.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f28112Y) {
            case 0:
                C9323m c9323m = this.f28113Z;
                Map mapM9914a = c9323m.m9914a();
                if (mapM9914a != null) {
                    return mapM9914a.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iM9918e = c9323m.m9918e(entry.getKey());
                    if (iM9918e != -1) {
                        Object[] objArr = c9323m.f28138p0;
                        objArr.getClass();
                        if (AbstractC9881e4.m10535b(objArr[iM9918e], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f28113Z.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f28112Y) {
            case 0:
                C9323m c9323m = this.f28113Z;
                Map mapM9914a = c9323m.m9914a();
                return mapM9914a != null ? mapM9914a.entrySet().iterator() : new C9305j(c9323m, 1);
            default:
                C9323m c9323m2 = this.f28113Z;
                Map mapM9914a2 = c9323m2.m9914a();
                return mapM9914a2 != null ? mapM9914a2.keySet().iterator() : new C9305j(c9323m2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f28112Y) {
            case 0:
                C9323m c9323m = this.f28113Z;
                Map mapM9914a = c9323m.m9914a();
                if (mapM9914a != null) {
                    return mapM9914a.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c9323m.m9916c()) {
                        int iM9917d = c9323m.m9917d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c9323m.f28135Y;
                        obj2.getClass();
                        int[] iArr = c9323m.f28136Z;
                        iArr.getClass();
                        Object[] objArr = c9323m.f28137o0;
                        objArr.getClass();
                        Object[] objArr2 = c9323m.f28138p0;
                        objArr2.getClass();
                        int iM10513b = AbstractC9860b4.m10513b(key, value, iM9917d, obj2, iArr, objArr, objArr2);
                        if (iM10513b != -1) {
                            c9323m.m9915b(iM10513b, iM9917d);
                            c9323m.f28140r0--;
                            c9323m.f28139q0 += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C9323m c9323m2 = this.f28113Z;
                Map mapM9914a2 = c9323m2.m9914a();
                if (mapM9914a2 != null) {
                    return mapM9914a2.keySet().remove(obj);
                }
                return c9323m2.m9920g(obj) != C9323m.f28134v0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f28112Y) {
            case 0:
                break;
        }
        return this.f28113Z.size();
    }
}
