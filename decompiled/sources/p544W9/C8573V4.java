package p544W9;

import p594Y9.AbstractC9954q3;

/* JADX INFO: renamed from: W9.V4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8573V4 extends AbstractC8561T4 {

    /* JADX INFO: renamed from: q0 */
    public static final C8573V4 f26397q0 = new C8573V4(0, new Object[0]);

    /* JADX INFO: renamed from: o0 */
    public final transient Object[] f26398o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f26399p0;

    public C8573V4(int i10, Object[] objArr) {
        this.f26398o0 = objArr;
        this.f26399p0 = i10;
    }

    @Override // p544W9.AbstractC8561T4, p544W9.AbstractC8669l4
    /* JADX INFO: renamed from: f */
    public final int mo9224f(Object[] objArr) {
        Object[] objArr2 = this.f26398o0;
        int i10 = this.f26399p0;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC9954q3.m10611b(i10, this.f26399p0);
        Object obj = this.f26398o0[i10];
        obj.getClass();
        return obj;
    }

    @Override // p544W9.AbstractC8669l4
    /* JADX INFO: renamed from: i */
    public final int mo9214i() {
        return this.f26399p0;
    }

    @Override // p544W9.AbstractC8669l4
    /* JADX INFO: renamed from: j */
    public final int mo9215j() {
        return 0;
    }

    @Override // p544W9.AbstractC8669l4
    /* JADX INFO: renamed from: m */
    public final Object[] mo9216m() {
        return this.f26398o0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26399p0;
    }
}
