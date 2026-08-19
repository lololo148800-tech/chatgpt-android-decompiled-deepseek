package p1073w3;

/* JADX INFO: renamed from: w3.n */
/* JADX INFO: loaded from: classes.dex */
public final class C20812n {

    /* JADX INFO: renamed from: c */
    public static final C20812n f66095c = new C20812n(-1, -1);

    /* JADX INFO: renamed from: a */
    public final int f66096a;

    /* JADX INFO: renamed from: b */
    public final int f66097b;

    static {
        new C20812n(0, 0);
    }

    public C20812n(int i10, int i11) {
        AbstractC20800b.m21316d((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f66096a = i10;
        this.f66097b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20812n)) {
            return false;
        }
        C20812n c20812n = (C20812n) obj;
        return this.f66096a == c20812n.f66096a && this.f66097b == c20812n.f66097b;
    }

    public final int hashCode() {
        int i10 = this.f66096a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f66097b;
    }

    public final String toString() {
        return this.f66096a + "x" + this.f66097b;
    }
}
