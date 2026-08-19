package p200Hm;

/* JADX INFO: renamed from: Hm.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C3508g extends C3506e {

    /* JADX INFO: renamed from: p0 */
    public static final C3508g f10598p0 = new C3508g(1, 0, 1);

    @Override // p200Hm.C3506e
    public final boolean equals(Object obj) {
        if (obj instanceof C3508g) {
            if (!isEmpty() || !((C3508g) obj).isEmpty()) {
                C3508g c3508g = (C3508g) obj;
                if (this.f10591Y == c3508g.f10591Y) {
                    if (this.f10592Z == c3508g.f10592Z) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p200Hm.C3506e
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f10591Y * 31) + this.f10592Z;
    }

    @Override // p200Hm.C3506e
    public final boolean isEmpty() {
        return this.f10591Y > this.f10592Z;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4200j(int i10) {
        return this.f10591Y <= i10 && i10 <= this.f10592Z;
    }

    @Override // p200Hm.C3506e
    public final String toString() {
        return this.f10591Y + ".." + this.f10592Z;
    }
}
