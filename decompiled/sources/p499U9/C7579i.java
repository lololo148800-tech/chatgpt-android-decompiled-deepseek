package p499U9;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: U9.i */
/* JADX INFO: loaded from: classes.dex */
public final class C7579i extends AbstractC7576f {

    /* JADX INFO: renamed from: o0 */
    public final transient C7582l f23990o0;

    /* JADX INFO: renamed from: p0 */
    public final transient Object[] f23991p0;

    /* JADX INFO: renamed from: q0 */
    public final transient int f23992q0;

    public C7579i(C7582l c7582l, Object[] objArr, int i10) {
        this.f23990o0 = c7582l;
        this.f23991p0 = objArr;
        this.f23992q0 = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f23990o0.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p499U9.AbstractC7571a
    /* JADX INFO: renamed from: f */
    public final int mo7917f(Object[] objArr) {
        AbstractC7574d c7578h = this.f23985Z;
        if (c7578h == null) {
            c7578h = new C7578h(this);
            this.f23985Z = c7578h;
        }
        return c7578h.mo7917f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC7574d c7578h = this.f23985Z;
        if (c7578h == null) {
            c7578h = new C7578h(this);
            this.f23985Z = c7578h;
        }
        return c7578h.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f23992q0;
    }
}
