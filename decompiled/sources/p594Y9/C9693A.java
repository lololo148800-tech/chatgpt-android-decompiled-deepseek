package p594Y9;

import java.util.Iterator;
import java.util.Map;
import p523V9.C7936M;

/* JADX INFO: renamed from: Y9.A */
/* JADX INFO: loaded from: classes.dex */
public final class C9693A extends AbstractC9956r {

    /* JADX INFO: renamed from: o0 */
    public final transient C7936M f29220o0;

    /* JADX INFO: renamed from: p0 */
    public final transient Object[] f29221p0;

    /* JADX INFO: renamed from: q0 */
    public final transient int f29222q0 = 1;

    public C9693A(C7936M c7936m, Object[] objArr) {
        this.f29220o0 = c7936m;
        this.f29221p0 = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f29220o0.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p594Y9.AbstractC9926m
    /* JADX INFO: renamed from: f */
    public final int mo10285f(Object[] objArr) {
        AbstractC9950q c10004z = this.f29521Z;
        if (c10004z == null) {
            c10004z = new C10004z(this);
            this.f29521Z = c10004z;
        }
        return c10004z.mo10285f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC9950q c10004z = this.f29521Z;
        if (c10004z == null) {
            c10004z = new C10004z(this);
            this.f29521Z = c10004z;
        }
        return c10004z.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f29222q0;
    }
}
