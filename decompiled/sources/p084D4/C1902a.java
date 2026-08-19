package p084D4;

/* JADX INFO: renamed from: D4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1902a {

    /* JADX INFO: renamed from: a */
    public int f5561a;

    /* JADX INFO: renamed from: b */
    public int f5562b;

    /* JADX INFO: renamed from: c */
    public Object f5563c;

    /* JADX INFO: renamed from: d */
    public int f5564d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1902a)) {
            return false;
        }
        C1902a c1902a = (C1902a) obj;
        int i10 = this.f5561a;
        if (i10 != c1902a.f5561a) {
            return false;
        }
        if (i10 == 8 && Math.abs(this.f5564d - this.f5562b) == 1 && this.f5564d == c1902a.f5562b && this.f5562b == c1902a.f5564d) {
            return true;
        }
        if (this.f5564d != c1902a.f5564d || this.f5562b != c1902a.f5562b) {
            return false;
        }
        Object obj2 = this.f5563c;
        if (obj2 != null) {
            if (!obj2.equals(c1902a.f5563c)) {
                return false;
            }
        } else if (c1902a.f5563c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f5561a * 31) + this.f5562b) * 31) + this.f5564d;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i10 = this.f5561a;
        if (i10 == 1) {
            str = "add";
        } else if (i10 == 2) {
            str = "rm";
        } else if (i10 != 4) {
            str = i10 != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb2.append(str);
        sb2.append(",s:");
        sb2.append(this.f5562b);
        sb2.append("c:");
        sb2.append(this.f5564d);
        sb2.append(",p:");
        sb2.append(this.f5563c);
        sb2.append("]");
        return sb2.toString();
    }
}
