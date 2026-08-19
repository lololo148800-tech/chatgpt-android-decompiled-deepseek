package p572Xa;

import java.util.Iterator;

/* JADX INFO: renamed from: Xa.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9417k extends AbstractC9415i {

    /* JADX INFO: renamed from: r0 */
    public static final Object[] f28394r0;

    /* JADX INFO: renamed from: s0 */
    public static final C9417k f28395s0;

    /* JADX INFO: renamed from: p0 */
    public final transient Object[] f28396p0;

    /* JADX INFO: renamed from: q0 */
    public final transient Object[] f28397q0;

    static {
        Object[] objArr = new Object[0];
        f28394r0 = objArr;
        f28395s0 = new C9417k(objArr, objArr);
    }

    public C9417k(Object[] objArr, Object[] objArr2) {
        this.f28396p0 = objArr;
        this.f28397q0 = objArr2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f28397q0.length;
        return false;
    }

    @Override // p572Xa.AbstractC9411e
    /* JADX INFO: renamed from: f */
    public final int mo9988f(Object[] objArr) {
        System.arraycopy(this.f28396p0, 0, objArr, 0, 0);
        return 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // p572Xa.AbstractC9411e
    /* JADX INFO: renamed from: i */
    public final int mo9989i() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C9416j c9416j = this.f28391Z;
        if (c9416j == null) {
            C9412f c9412f = AbstractC9414h.f28389Z;
            c9416j = C9416j.f28392p0;
            this.f28391Z = c9416j;
        }
        return c9416j.listIterator(0);
    }

    @Override // p572Xa.AbstractC9411e
    /* JADX INFO: renamed from: j */
    public final int mo9990j() {
        return 0;
    }

    @Override // p572Xa.AbstractC9411e
    /* JADX INFO: renamed from: m */
    public final Object[] mo9991m() {
        return this.f28396p0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
