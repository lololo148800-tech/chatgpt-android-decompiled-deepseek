package p449S9;

import p817j$.util.Objects;

/* JADX INFO: renamed from: S9.x */
/* JADX INFO: loaded from: classes.dex */
public final class C7098x extends AbstractC7081m {

    /* JADX INFO: renamed from: q0 */
    public static final C7098x f22585q0 = new C7098x(0, new Object[0]);

    /* JADX INFO: renamed from: o0 */
    public final transient Object[] f22586o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f22587p0;

    public C7098x(int i10, Object[] objArr) {
        this.f22586o0 = objArr;
        this.f22587p0 = i10;
    }

    @Override // p449S9.AbstractC7081m, p449S9.AbstractC7071h
    /* JADX INFO: renamed from: f */
    public final int mo7427f(Object[] objArr) {
        Object[] objArr2 = this.f22586o0;
        int i10 = this.f22587p0;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC7057a.m7460e(i10, this.f22587p0);
        Object obj = this.f22586o0[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p449S9.AbstractC7071h
    /* JADX INFO: renamed from: i */
    public final int mo7472i() {
        return this.f22587p0;
    }

    @Override // p449S9.AbstractC7071h
    /* JADX INFO: renamed from: j */
    public final int mo7473j() {
        return 0;
    }

    @Override // p449S9.AbstractC7071h
    /* JADX INFO: renamed from: p */
    public final Object[] mo7474p() {
        return this.f22586o0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22587p0;
    }
}
