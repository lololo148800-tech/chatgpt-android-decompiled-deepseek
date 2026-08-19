package bb;

/* JADX INFO: renamed from: bb.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11312f0 extends AbstractC11281F {

    /* JADX INFO: renamed from: p0 */
    public final transient Object f34227p0;

    public C11312f0(Object obj) {
        obj.getClass();
        this.f34227p0 = obj;
    }

    @Override // bb.AbstractC11331x, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f34227p0.equals(obj);
    }

    @Override // bb.AbstractC11281F, bb.AbstractC11331x
    /* JADX INFO: renamed from: f */
    public final AbstractC11278C mo12697f() {
        return AbstractC11278C.m12695y(this.f34227p0);
    }

    @Override // bb.AbstractC11281F, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f34227p0.hashCode();
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: i */
    public final int mo12698i(int i10, Object[] objArr) {
        objArr[i10] = this.f34227p0;
        return i10 + 1;
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: q */
    public final boolean mo12687q() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f34227p0.toString() + ']';
    }

    @Override // bb.AbstractC11281F
    /* JADX INFO: renamed from: v */
    public final AbstractC11314g0 iterator() {
        C11284I c11284i = new C11284I();
        c11284i.f34176Y = this.f34227p0;
        return c11284i;
    }
}
