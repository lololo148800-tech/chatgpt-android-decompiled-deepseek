package p232J3;

/* JADX INFO: renamed from: J3.y */
/* JADX INFO: loaded from: classes.dex */
public final class C4253y {

    /* JADX INFO: renamed from: a */
    public final Object f13895a;

    /* JADX INFO: renamed from: b */
    public final int f13896b;

    /* JADX INFO: renamed from: c */
    public final int f13897c;

    /* JADX INFO: renamed from: d */
    public final long f13898d;

    /* JADX INFO: renamed from: e */
    public final int f13899e;

    public C4253y(Object obj) {
        this(-1L, obj);
    }

    /* JADX INFO: renamed from: a */
    public final C4253y m5016a(Object obj) {
        if (this.f13895a.equals(obj)) {
            return this;
        }
        return new C4253y(obj, this.f13896b, this.f13897c, this.f13898d, this.f13899e);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5017b() {
        return this.f13896b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4253y)) {
            return false;
        }
        C4253y c4253y = (C4253y) obj;
        return this.f13895a.equals(c4253y.f13895a) && this.f13896b == c4253y.f13896b && this.f13897c == c4253y.f13897c && this.f13898d == c4253y.f13898d && this.f13899e == c4253y.f13899e;
    }

    public final int hashCode() {
        return ((((((((this.f13895a.hashCode() + 527) * 31) + this.f13896b) * 31) + this.f13897c) * 31) + ((int) this.f13898d)) * 31) + this.f13899e;
    }

    public C4253y(long j10, Object obj) {
        this(obj, -1, -1, j10, -1);
    }

    public C4253y(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public C4253y(Object obj, int i10, int i11, long j10, int i12) {
        this.f13895a = obj;
        this.f13896b = i10;
        this.f13897c = i11;
        this.f13898d = j10;
        this.f13899e = i12;
    }
}
