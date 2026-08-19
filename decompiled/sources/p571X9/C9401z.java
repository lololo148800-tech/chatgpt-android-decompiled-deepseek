package p571X9;

import p594Y9.AbstractC9846Z3;

/* JADX INFO: renamed from: X9.z */
/* JADX INFO: loaded from: classes.dex */
public final class C9401z extends AbstractC9353r {

    /* JADX INFO: renamed from: o0 */
    public final transient Object[] f28358o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f28359p0;

    /* JADX INFO: renamed from: q0 */
    public final transient int f28360q0 = 1;

    public C9401z(int i10, Object[] objArr) {
        this.f28358o0 = objArr;
        this.f28359p0 = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC9846Z3.m10495b(i10, this.f28360q0);
        Object obj = this.f28358o0[i10 + i10 + this.f28359p0];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28360q0;
    }
}
