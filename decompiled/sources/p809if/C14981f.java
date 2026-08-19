package p809if;

/* JADX INFO: renamed from: if.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C14981f {

    /* JADX INFO: renamed from: a */
    public final int f46639a;

    /* JADX INFO: renamed from: b */
    public final int f46640b;

    public C14981f(int i10, int i11) {
        this.f46639a = i10;
        this.f46640b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14981f)) {
            return false;
        }
        C14981f c14981f = (C14981f) obj;
        return this.f46639a == c14981f.f46639a && this.f46640b == c14981f.f46640b;
    }

    public final int hashCode() {
        return (this.f46639a * 31) + this.f46640b;
    }

    public final String toString() {
        return "█";
    }
}
