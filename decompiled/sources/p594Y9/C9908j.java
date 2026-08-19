package p594Y9;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: Y9.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9908j extends AbstractSet {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f29433Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9920l f29434Z;

    public /* synthetic */ C9908j(C9920l c9920l, int i10) {
        this.f29433Y = i10;
        this.f29434Z = c9920l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f29433Y) {
            case 0:
                this.f29434Z.clear();
                break;
            default:
                this.f29434Z.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f29433Y) {
            case 0:
                C9920l c9920l = this.f29434Z;
                Map mapM10575a = c9920l.m10575a();
                if (mapM10575a != null) {
                    return mapM10575a.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iM10579e = c9920l.m10579e(entry.getKey());
                    if (iM10579e != -1) {
                        Object[] objArr = c9920l.f29459p0;
                        objArr.getClass();
                        if (AbstractC9728F4.m10319b(objArr[iM10579e], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f29434Z.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f29433Y) {
            case 0:
                C9920l c9920l = this.f29434Z;
                Map mapM10575a = c9920l.m10575a();
                return mapM10575a != null ? mapM10575a.entrySet().iterator() : new C9902i(c9920l, 1);
            default:
                C9920l c9920l2 = this.f29434Z;
                Map mapM10575a2 = c9920l2.m10575a();
                return mapM10575a2 != null ? mapM10575a2.keySet().iterator() : new C9902i(c9920l2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f29433Y) {
            case 0:
                C9920l c9920l = this.f29434Z;
                Map mapM10575a = c9920l.m10575a();
                if (mapM10575a != null) {
                    return mapM10575a.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c9920l.m10577c()) {
                        int iM10578d = c9920l.m10578d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c9920l.f29456Y;
                        obj2.getClass();
                        int[] iArr = c9920l.f29457Z;
                        iArr.getClass();
                        Object[] objArr = c9920l.f29458o0;
                        objArr.getClass();
                        Object[] objArr2 = c9920l.f29459p0;
                        objArr2.getClass();
                        int iM10292c = AbstractC9698A4.m10292c(key, value, iM10578d, obj2, iArr, objArr, objArr2);
                        if (iM10292c != -1) {
                            c9920l.m10576b(iM10292c, iM10578d);
                            c9920l.f29461r0--;
                            c9920l.f29460q0 += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C9920l c9920l2 = this.f29434Z;
                Map mapM10575a2 = c9920l2.m10575a();
                if (mapM10575a2 != null) {
                    return mapM10575a2.keySet().remove(obj);
                }
                return c9920l2.m10581g(obj) != C9920l.f29455v0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f29433Y) {
            case 0:
                break;
        }
        return this.f29434Z.size();
    }
}
