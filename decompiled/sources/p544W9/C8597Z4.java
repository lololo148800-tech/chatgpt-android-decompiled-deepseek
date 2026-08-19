package p544W9;

import p594Y9.AbstractC9954q3;

/* JADX INFO: renamed from: W9.Z4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8597Z4 extends AbstractC8561T4 {

    /* JADX INFO: renamed from: o0 */
    public final transient Object[] f26422o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f26423p0;

    /* JADX INFO: renamed from: q0 */
    public final transient int f26424q0 = 1;

    public C8597Z4(int i10, Object[] objArr) {
        this.f26422o0 = objArr;
        this.f26423p0 = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC9954q3.m10611b(i10, this.f26424q0);
        Object obj = this.f26422o0[i10 + i10 + this.f26423p0];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26424q0;
    }
}
