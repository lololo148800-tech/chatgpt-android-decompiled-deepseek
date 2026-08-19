package p523V9;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import p594Y9.AbstractC9762L2;
import p594Y9.AbstractC9780O2;

/* JADX INFO: renamed from: V9.t */
/* JADX INFO: loaded from: classes.dex */
public final class C8193t extends AbstractSet {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f25638Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8225x f25639Z;

    public /* synthetic */ C8193t(C8225x c8225x, int i10) {
        this.f25638Y = i10;
        this.f25639Z = c8225x;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f25638Y) {
            case 0:
                this.f25639Z.clear();
                break;
            default:
                this.f25639Z.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f25638Y) {
            case 0:
                C8225x c8225x = this.f25639Z;
                Map mapM8853a = c8225x.m8853a();
                if (mapM8853a != null) {
                    return mapM8853a.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iM8857e = c8225x.m8857e(entry.getKey());
                    if (iM8857e != -1) {
                        Object[] objArr = c8225x.f25683p0;
                        objArr.getClass();
                        if (AbstractC9762L2.m10365b(objArr[iM8857e], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f25639Z.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f25638Y) {
            case 0:
                C8225x c8225x = this.f25639Z;
                Map mapM8853a = c8225x.m8853a();
                return mapM8853a != null ? mapM8853a.entrySet().iterator() : new C8185s(c8225x, 1);
            default:
                C8225x c8225x2 = this.f25639Z;
                Map mapM8853a2 = c8225x2.m8853a();
                return mapM8853a2 != null ? mapM8853a2.keySet().iterator() : new C8185s(c8225x2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f25638Y) {
            case 0:
                C8225x c8225x = this.f25639Z;
                Map mapM8853a = c8225x.m8853a();
                if (mapM8853a != null) {
                    return mapM8853a.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c8225x.m8855c()) {
                        int iM8856d = c8225x.m8856d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c8225x.f25680Y;
                        obj2.getClass();
                        int[] iArr = c8225x.f25681Z;
                        iArr.getClass();
                        Object[] objArr = c8225x.f25682o0;
                        objArr.getClass();
                        Object[] objArr2 = c8225x.f25683p0;
                        objArr2.getClass();
                        int iM10389b = AbstractC9780O2.m10389b(key, value, iM8856d, obj2, iArr, objArr, objArr2);
                        if (iM10389b != -1) {
                            c8225x.m8854b(iM10389b, iM8856d);
                            c8225x.f25685r0--;
                            c8225x.f25684q0 += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C8225x c8225x2 = this.f25639Z;
                Map mapM8853a2 = c8225x2.m8853a();
                if (mapM8853a2 != null) {
                    return mapM8853a2.keySet().remove(obj);
                }
                return c8225x2.m8859g(obj) != C8225x.f25679v0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f25638Y) {
            case 0:
                break;
        }
        return this.f25639Z.size();
    }
}
