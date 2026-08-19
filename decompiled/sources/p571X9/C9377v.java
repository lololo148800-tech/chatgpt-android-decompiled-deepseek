package p571X9;

import p594Y9.AbstractC9846Z3;

/* JADX INFO: renamed from: X9.v */
/* JADX INFO: loaded from: classes.dex */
public final class C9377v extends AbstractC9353r {

    /* JADX INFO: renamed from: q0 */
    public static final C9377v f28246q0 = new C9377v(0, new Object[0]);

    /* JADX INFO: renamed from: o0 */
    public final transient Object[] f28247o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f28248p0;

    public C9377v(int i10, Object[] objArr) {
        this.f28247o0 = objArr;
        this.f28248p0 = i10;
    }

    @Override // p571X9.AbstractC9353r, p571X9.AbstractC9329n
    /* JADX INFO: renamed from: f */
    public final int mo9926f(Object[] objArr) {
        Object[] objArr2 = this.f28247o0;
        int i10 = this.f28248p0;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC9846Z3.m10495b(i10, this.f28248p0);
        Object obj = this.f28247o0[i10];
        obj.getClass();
        return obj;
    }

    @Override // p571X9.AbstractC9329n
    /* JADX INFO: renamed from: i */
    public final int mo9927i() {
        return this.f28248p0;
    }

    @Override // p571X9.AbstractC9329n
    /* JADX INFO: renamed from: j */
    public final int mo9928j() {
        return 0;
    }

    @Override // p571X9.AbstractC9329n
    /* JADX INFO: renamed from: m */
    public final Object[] mo9929m() {
        return this.f28247o0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28248p0;
    }
}
