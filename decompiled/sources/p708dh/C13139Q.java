package p708dh;

/* JADX INFO: renamed from: dh.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C13139Q {

    /* JADX INFO: renamed from: a */
    public final boolean f41712a;

    /* JADX INFO: renamed from: b */
    public final boolean f41713b;

    /* JADX INFO: renamed from: c */
    public final boolean f41714c;

    public C13139Q(boolean z6, boolean z10, boolean z11) {
        this.f41712a = z6;
        this.f41713b = z10;
        this.f41714c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13139Q)) {
            return false;
        }
        C13139Q c13139q = (C13139Q) obj;
        return this.f41712a == c13139q.f41712a && this.f41713b == c13139q.f41713b && this.f41714c == c13139q.f41714c;
    }

    public final int hashCode() {
        return ((((this.f41712a ? 1231 : 1237) * 31) + (this.f41713b ? 1231 : 1237)) * 31) + (this.f41714c ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
