package bb;

/* JADX INFO: renamed from: bb.W */
/* JADX INFO: loaded from: classes.dex */
public final class C11297W extends AbstractC11281F {

    /* JADX INFO: renamed from: p0 */
    public final transient C11299Y f34192p0;

    /* JADX INFO: renamed from: q0 */
    public final transient C11298X f34193q0;

    public C11297W(C11299Y c11299y, C11298X c11298x) {
        this.f34192p0 = c11299y;
        this.f34193q0 = c11298x;
    }

    @Override // bb.AbstractC11331x, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f34192p0.get(obj) != null;
    }

    @Override // bb.AbstractC11281F, bb.AbstractC11331x
    /* JADX INFO: renamed from: f */
    public final AbstractC11278C mo12697f() {
        return this.f34193q0;
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: i */
    public final int mo12698i(int i10, Object[] objArr) {
        return this.f34193q0.mo12698i(i10, objArr);
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: q */
    public final boolean mo12687q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f34192p0.f34203r0;
    }

    @Override // bb.AbstractC11281F
    /* JADX INFO: renamed from: v */
    public final AbstractC11314g0 iterator() {
        return this.f34193q0.listIterator(0);
    }
}
