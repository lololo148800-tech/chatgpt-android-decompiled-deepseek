package p523V9;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: V9.J */
/* JADX INFO: loaded from: classes.dex */
public final class C7912J extends AbstractC7872E {

    /* JADX INFO: renamed from: o0 */
    public final transient C7936M f25122o0;

    /* JADX INFO: renamed from: p0 */
    public final transient Object[] f25123p0;

    /* JADX INFO: renamed from: q0 */
    public final transient int f25124q0 = 1;

    public C7912J(C7936M c7936m, Object[] objArr) {
        this.f25122o0 = c7936m;
        this.f25123p0 = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f25122o0.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p523V9.AbstractC8233y
    /* JADX INFO: renamed from: f */
    public final int mo8143f(int i10, Object[] objArr) {
        AbstractC7864D c7904i = this.f24779Z;
        if (c7904i == null) {
            c7904i = new C7904I(this);
            this.f24779Z = c7904i;
        }
        return c7904i.mo8143f(i10, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC7864D c7904i = this.f24779Z;
        if (c7904i == null) {
            c7904i = new C7904I(this);
            this.f24779Z = c7904i;
        }
        return c7904i.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f25124q0;
    }
}
