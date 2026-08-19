package p499U9;

import p594Y9.AbstractC9777O;

/* JADX INFO: renamed from: U9.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7577g extends AbstractC7574d {

    /* JADX INFO: renamed from: q0 */
    public static final C7577g f23986q0 = new C7577g(0, new Object[0]);

    /* JADX INFO: renamed from: o0 */
    public final transient Object[] f23987o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f23988p0;

    public C7577g(int i10, Object[] objArr) {
        this.f23987o0 = objArr;
        this.f23988p0 = i10;
    }

    @Override // p499U9.AbstractC7574d, p499U9.AbstractC7571a
    /* JADX INFO: renamed from: f */
    public final int mo7917f(Object[] objArr) {
        Object[] objArr2 = this.f23987o0;
        int i10 = this.f23988p0;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC9777O.m10384b(i10, this.f23988p0);
        Object obj = this.f23987o0[i10];
        obj.getClass();
        return obj;
    }

    @Override // p499U9.AbstractC7571a
    /* JADX INFO: renamed from: i */
    public final int mo7918i() {
        return this.f23988p0;
    }

    @Override // p499U9.AbstractC7571a
    /* JADX INFO: renamed from: j */
    public final int mo7919j() {
        return 0;
    }

    @Override // p499U9.AbstractC7571a
    /* JADX INFO: renamed from: m */
    public final Object[] mo7920m() {
        return this.f23987o0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23988p0;
    }
}
