package p968qi;

/* JADX INFO: renamed from: qi.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18719b {

    /* JADX INFO: renamed from: a */
    public final int f59561a;

    /* JADX INFO: renamed from: b */
    public final int f59562b;

    public C18719b(int i10, int i11) {
        this.f59561a = i10;
        this.f59562b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18719b)) {
            return false;
        }
        C18719b c18719b = (C18719b) obj;
        return this.f59561a == c18719b.f59561a && this.f59562b == c18719b.f59562b;
    }

    public final int hashCode() {
        return (this.f59561a * 31) + this.f59562b;
    }

    public final String toString() {
        return "█";
    }
}
