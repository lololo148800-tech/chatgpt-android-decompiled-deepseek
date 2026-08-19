package p523V9;

import p594Y9.AbstractC9768M2;

/* JADX INFO: renamed from: V9.L */
/* JADX INFO: loaded from: classes.dex */
public final class C7928L extends AbstractC7864D {

    /* JADX INFO: renamed from: o0 */
    public final transient Object[] f25152o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f25153p0;

    /* JADX INFO: renamed from: q0 */
    public final transient int f25154q0 = 1;

    public C7928L(int i10, Object[] objArr) {
        this.f25152o0 = objArr;
        this.f25153p0 = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC9768M2.m10371b(i10, this.f25154q0);
        Object obj = this.f25152o0[i10 + i10 + this.f25153p0];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25154q0;
    }
}
