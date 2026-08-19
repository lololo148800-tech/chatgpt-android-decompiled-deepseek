package bb;

import java.util.Map;

/* JADX INFO: renamed from: bb.V */
/* JADX INFO: loaded from: classes.dex */
public final class C11296V extends AbstractC11281F {

    /* JADX INFO: renamed from: p0 */
    public final transient C11299Y f34189p0;

    /* JADX INFO: renamed from: q0 */
    public final transient Object[] f34190q0;

    /* JADX INFO: renamed from: r0 */
    public final transient int f34191r0;

    public C11296V(C11299Y c11299y, Object[] objArr, int i10) {
        this.f34189p0 = c11299y;
        this.f34190q0 = objArr;
        this.f34191r0 = i10;
    }

    @Override // bb.AbstractC11331x, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.f34189p0.get(key));
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: i */
    public final int mo12698i(int i10, Object[] objArr) {
        return mo12697f().mo12698i(i10, objArr);
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: q */
    public final boolean mo12687q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f34191r0;
    }

    @Override // bb.AbstractC11281F
    /* JADX INFO: renamed from: u */
    public final AbstractC11278C mo12706u() {
        return new C11295U(this);
    }

    @Override // bb.AbstractC11281F
    /* JADX INFO: renamed from: v */
    public final AbstractC11314g0 iterator() {
        return mo12697f().listIterator(0);
    }
}
