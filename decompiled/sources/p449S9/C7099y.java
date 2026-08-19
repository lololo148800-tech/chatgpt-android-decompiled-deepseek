package p449S9;

import java.util.Iterator;

/* JADX INFO: renamed from: S9.y */
/* JADX INFO: loaded from: classes.dex */
public final class C7099y extends AbstractC7085o {

    /* JADX INFO: renamed from: u0 */
    public static final Object[] f22588u0;

    /* JADX INFO: renamed from: v0 */
    public static final C7099y f22589v0;

    /* JADX INFO: renamed from: p0 */
    public final transient Object[] f22590p0;

    /* JADX INFO: renamed from: q0 */
    public final transient int f22591q0;

    /* JADX INFO: renamed from: r0 */
    public final transient Object[] f22592r0;

    /* JADX INFO: renamed from: s0 */
    public final transient int f22593s0;

    /* JADX INFO: renamed from: t0 */
    public final transient int f22594t0;

    static {
        Object[] objArr = new Object[0];
        f22588u0 = objArr;
        f22589v0 = new C7099y(0, 0, 0, objArr, objArr);
    }

    public C7099y(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.f22590p0 = objArr;
        this.f22591q0 = i10;
        this.f22592r0 = objArr2;
        this.f22593s0 = i11;
        this.f22594t0 = i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f22592r0;
            if (objArr.length != 0) {
                int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
                while (true) {
                    int i10 = iRotateLeft & this.f22593s0;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iRotateLeft = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // p449S9.AbstractC7071h
    /* JADX INFO: renamed from: f */
    public final int mo7427f(Object[] objArr) {
        Object[] objArr2 = this.f22590p0;
        int i10 = this.f22594t0;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // p449S9.AbstractC7085o, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f22591q0;
    }

    @Override // p449S9.AbstractC7071h
    /* JADX INFO: renamed from: i */
    public final int mo7472i() {
        return this.f22594t0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo7429s().listIterator(0);
    }

    @Override // p449S9.AbstractC7071h
    /* JADX INFO: renamed from: j */
    public final int mo7473j() {
        return 0;
    }

    @Override // p449S9.AbstractC7071h
    /* JADX INFO: renamed from: m */
    public final AbstractC7036E mo7428m() {
        return mo7429s().listIterator(0);
    }

    @Override // p449S9.AbstractC7071h
    /* JADX INFO: renamed from: p */
    public final Object[] mo7474p() {
        return this.f22590p0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f22594t0;
    }

    @Override // p449S9.AbstractC7085o
    /* JADX INFO: renamed from: t */
    public final AbstractC7081m mo7497t() {
        return AbstractC7081m.m7491s(this.f22594t0, this.f22590p0);
    }
}
