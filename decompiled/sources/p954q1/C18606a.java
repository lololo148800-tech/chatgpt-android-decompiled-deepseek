package p954q1;

/* JADX INFO: renamed from: q1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18606a {

    /* JADX INFO: renamed from: a */
    public final int f59266a;

    public final boolean equals(Object obj) {
        if (obj instanceof C18606a) {
            return this.f59266a == ((C18606a) obj).f59266a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f59266a;
    }

    public final String toString() {
        int i10 = this.f59266a;
        if (i10 == 1) {
            return "Touch";
        }
        return i10 == 2 ? "Keyboard" : "Error";
    }
}
