package p544W9;

import java.util.Iterator;
import java.util.Map;
import p523V9.C7936M;

/* JADX INFO: renamed from: W9.X4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8585X4 extends AbstractC8567U4 {

    /* JADX INFO: renamed from: o0 */
    public final transient C7936M f26407o0;

    /* JADX INFO: renamed from: p0 */
    public final transient Object[] f26408p0;

    /* JADX INFO: renamed from: q0 */
    public final transient int f26409q0 = 1;

    public C8585X4(C7936M c7936m, Object[] objArr) {
        this.f26407o0 = c7936m;
        this.f26408p0 = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f26407o0.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p544W9.AbstractC8669l4
    /* JADX INFO: renamed from: f */
    public final int mo9224f(Object[] objArr) {
        AbstractC8561T4 c8579w4 = this.f26393Z;
        if (c8579w4 == null) {
            c8579w4 = new C8579W4(this);
            this.f26393Z = c8579w4;
        }
        return c8579w4.mo9224f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC8561T4 c8579w4 = this.f26393Z;
        if (c8579w4 == null) {
            c8579w4 = new C8579W4(this);
            this.f26393Z = c8579w4;
        }
        return c8579w4.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f26409q0;
    }
}
