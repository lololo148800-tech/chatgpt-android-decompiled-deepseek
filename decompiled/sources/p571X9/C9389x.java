package p571X9;

import java.util.Iterator;
import java.util.Map;
import p523V9.C7936M;

/* JADX INFO: renamed from: X9.x */
/* JADX INFO: loaded from: classes.dex */
public final class C9389x extends AbstractC9359s {

    /* JADX INFO: renamed from: o0 */
    public final transient C7936M f28346o0;

    /* JADX INFO: renamed from: p0 */
    public final transient Object[] f28347p0;

    /* JADX INFO: renamed from: q0 */
    public final transient int f28348q0 = 1;

    public C9389x(C7936M c7936m, Object[] objArr) {
        this.f28346o0 = c7936m;
        this.f28347p0 = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f28346o0.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p571X9.AbstractC9329n
    /* JADX INFO: renamed from: f */
    public final int mo9926f(Object[] objArr) {
        AbstractC9353r c9383w = this.f28201Z;
        if (c9383w == null) {
            c9383w = new C9383w(this);
            this.f28201Z = c9383w;
        }
        return c9383w.mo9926f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC9353r c9383w = this.f28201Z;
        if (c9383w == null) {
            c9383w = new C9383w(this);
            this.f28201Z = c9383w;
        }
        return c9383w.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f28348q0;
    }
}
