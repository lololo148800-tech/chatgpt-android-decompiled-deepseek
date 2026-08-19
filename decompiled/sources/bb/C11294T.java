package bb;

import p523V9.AbstractC8020X;
import p817j$.util.Objects;

/* JADX INFO: renamed from: bb.T */
/* JADX INFO: loaded from: classes.dex */
public final class C11294T extends AbstractC11278C {

    /* JADX INFO: renamed from: q0 */
    public static final C11294T f34185q0 = new C11294T(0, new Object[0]);

    /* JADX INFO: renamed from: o0 */
    public final transient Object[] f34186o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f34187p0;

    public C11294T(int i10, Object[] objArr) {
        this.f34186o0 = objArr;
        this.f34187p0 = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC8020X.m8353c(i10, this.f34187p0);
        Object obj = this.f34186o0[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // bb.AbstractC11278C, bb.AbstractC11331x
    /* JADX INFO: renamed from: i */
    public final int mo12698i(int i10, Object[] objArr) {
        Object[] objArr2 = this.f34186o0;
        int i11 = this.f34187p0;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: j */
    public final Object[] mo12684j() {
        return this.f34186o0;
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: m */
    public final int mo12685m() {
        return this.f34187p0;
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: p */
    public final int mo12686p() {
        return 0;
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: q */
    public final boolean mo12687q() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34187p0;
    }
}
