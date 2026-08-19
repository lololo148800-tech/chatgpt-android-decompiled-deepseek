package p499U9;

import p594Y9.AbstractC9777O;

/* JADX INFO: renamed from: U9.k */
/* JADX INFO: loaded from: classes.dex */
public final class C7581k extends AbstractC7574d {

    /* JADX INFO: renamed from: o0 */
    public final transient Object[] f23995o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f23996p0;

    /* JADX INFO: renamed from: q0 */
    public final transient int f23997q0;

    public C7581k(Object[] objArr, int i10, int i11) {
        this.f23995o0 = objArr;
        this.f23996p0 = i10;
        this.f23997q0 = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC9777O.m10384b(i10, this.f23997q0);
        Object obj = this.f23995o0[i10 + i10 + this.f23996p0];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23997q0;
    }
}
