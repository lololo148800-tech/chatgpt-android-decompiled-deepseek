package kg;

/* JADX INFO: renamed from: kg.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C16411q implements InterfaceC16413s {

    /* JADX INFO: renamed from: a */
    public final String f50938a;

    /* JADX INFO: renamed from: b */
    public final boolean f50939b;

    public C16411q(String str, boolean z6) {
        this.f50938a = str;
        this.f50939b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16411q)) {
            return false;
        }
        C16411q c16411q = (C16411q) obj;
        return this.f50938a.equals(c16411q.f50938a) && this.f50939b == c16411q.f50939b;
    }

    public final int hashCode() {
        return (this.f50938a.hashCode() * 31) + (this.f50939b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
