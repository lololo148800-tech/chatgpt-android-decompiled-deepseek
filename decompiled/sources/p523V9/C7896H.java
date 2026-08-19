package p523V9;

import p594Y9.AbstractC9768M2;

/* JADX INFO: renamed from: V9.H */
/* JADX INFO: loaded from: classes.dex */
public final class C7896H extends AbstractC7864D {

    /* JADX INFO: renamed from: q0 */
    public static final C7896H f24841q0 = new C7896H(0, new Object[0]);

    /* JADX INFO: renamed from: o0 */
    public final transient Object[] f24842o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f24843p0;

    public C7896H(int i10, Object[] objArr) {
        this.f24842o0 = objArr;
        this.f24843p0 = i10;
    }

    @Override // p523V9.AbstractC7864D, p523V9.AbstractC8233y
    /* JADX INFO: renamed from: f */
    public final int mo8143f(int i10, Object[] objArr) {
        Object[] objArr2 = this.f24842o0;
        int i11 = this.f24843p0;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC9768M2.m10371b(i10, this.f24843p0);
        Object obj = this.f24842o0[i10];
        obj.getClass();
        return obj;
    }

    @Override // p523V9.AbstractC8233y
    /* JADX INFO: renamed from: i */
    public final int mo8129i() {
        return this.f24843p0;
    }

    @Override // p523V9.AbstractC8233y
    /* JADX INFO: renamed from: j */
    public final int mo8130j() {
        return 0;
    }

    @Override // p523V9.AbstractC8233y
    /* JADX INFO: renamed from: m */
    public final Object[] mo8131m() {
        return this.f24842o0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24843p0;
    }
}
