package bb;

/* JADX INFO: renamed from: bb.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C11300Z extends AbstractC11281F {

    /* JADX INFO: renamed from: u0 */
    public static final Object[] f34204u0;

    /* JADX INFO: renamed from: v0 */
    public static final C11300Z f34205v0;

    /* JADX INFO: renamed from: p0 */
    public final transient Object[] f34206p0;

    /* JADX INFO: renamed from: q0 */
    public final transient int f34207q0;

    /* JADX INFO: renamed from: r0 */
    public final transient Object[] f34208r0;

    /* JADX INFO: renamed from: s0 */
    public final transient int f34209s0;

    /* JADX INFO: renamed from: t0 */
    public final transient int f34210t0;

    static {
        Object[] objArr = new Object[0];
        f34204u0 = objArr;
        f34205v0 = new C11300Z(0, 0, 0, objArr, objArr);
    }

    public C11300Z(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.f34206p0 = objArr;
        this.f34207q0 = i10;
        this.f34208r0 = objArr2;
        this.f34209s0 = i11;
        this.f34210t0 = i12;
    }

    @Override // bb.AbstractC11331x, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f34208r0;
            if (objArr.length != 0) {
                int iM12737q = AbstractC11320m.m12737q(obj);
                while (true) {
                    int i10 = iM12737q & this.f34209s0;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM12737q = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // bb.AbstractC11281F, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f34207q0;
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: i */
    public final int mo12698i(int i10, Object[] objArr) {
        Object[] objArr2 = this.f34206p0;
        int i11 = this.f34210t0;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: j */
    public final Object[] mo12684j() {
        return this.f34206p0;
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: m */
    public final int mo12685m() {
        return this.f34210t0;
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: p */
    public final int mo12686p() {
        return 0;
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: q */
    public final boolean mo12687q() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f34210t0;
    }

    @Override // bb.AbstractC11281F
    /* JADX INFO: renamed from: u */
    public final AbstractC11278C mo12706u() {
        return AbstractC11278C.m12689r(this.f34210t0, this.f34206p0);
    }

    @Override // bb.AbstractC11281F
    /* JADX INFO: renamed from: v */
    public final AbstractC11314g0 iterator() {
        return mo12697f().listIterator(0);
    }
}
