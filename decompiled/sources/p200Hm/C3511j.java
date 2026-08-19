package p200Hm;

/* JADX INFO: renamed from: Hm.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C3511j extends C3509h {

    /* JADX INFO: renamed from: p0 */
    public static final C3511j f10606p0 = new C3511j(1, 0);

    public C3511j(long j10, long j11) {
        super(j10, j11, 1L);
    }

    @Override // p200Hm.C3509h
    public final boolean equals(Object obj) {
        if (obj instanceof C3511j) {
            if (!isEmpty() || !((C3511j) obj).isEmpty()) {
                C3511j c3511j = (C3511j) obj;
                if (this.f10599Y == c3511j.f10599Y) {
                    if (this.f10600Z == c3511j.f10600Z) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p200Hm.C3509h
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = this.f10599Y;
        long j11 = ((long) 31) * (j10 ^ (j10 >>> 32));
        long j12 = this.f10600Z;
        return (int) (j11 + (j12 ^ (j12 >>> 32)));
    }

    @Override // p200Hm.C3509h
    public final boolean isEmpty() {
        return this.f10599Y > this.f10600Z;
    }

    @Override // p200Hm.C3509h
    public final String toString() {
        return this.f10599Y + ".." + this.f10600Z;
    }
}
