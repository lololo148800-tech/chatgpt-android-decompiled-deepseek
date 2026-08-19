package bb;

import p523V9.AbstractC8020X;
import p817j$.util.Objects;

/* JADX INFO: renamed from: bb.X */
/* JADX INFO: loaded from: classes.dex */
public final class C11298X extends AbstractC11278C {

    /* JADX INFO: renamed from: o0 */
    public final transient Object[] f34194o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f34195p0;

    /* JADX INFO: renamed from: q0 */
    public final transient int f34196q0;

    public C11298X(Object[] objArr, int i10, int i11) {
        this.f34194o0 = objArr;
        this.f34195p0 = i10;
        this.f34196q0 = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC8020X.m8353c(i10, this.f34196q0);
        Object obj = this.f34194o0[(i10 * 2) + this.f34195p0];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: q */
    public final boolean mo12687q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34196q0;
    }
}
