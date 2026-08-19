package p057C3;

/* JADX INFO: renamed from: C3.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1559f0 {

    /* JADX INFO: renamed from: c */
    public static final C1559f0 f4338c = new C1559f0(0, false);

    /* JADX INFO: renamed from: a */
    public final int f4339a;

    /* JADX INFO: renamed from: b */
    public final boolean f4340b;

    public C1559f0(int i10, boolean z6) {
        this.f4339a = i10;
        this.f4340b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1559f0.class != obj.getClass()) {
            return false;
        }
        C1559f0 c1559f0 = (C1559f0) obj;
        return this.f4339a == c1559f0.f4339a && this.f4340b == c1559f0.f4340b;
    }

    public final int hashCode() {
        return (this.f4339a << 1) + (this.f4340b ? 1 : 0);
    }
}
