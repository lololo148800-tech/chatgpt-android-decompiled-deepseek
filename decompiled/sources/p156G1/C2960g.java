package p156G1;

/* JADX INFO: renamed from: G1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2960g {

    /* JADX INFO: renamed from: a */
    public final int f8849a;

    /* JADX INFO: renamed from: a */
    public static final boolean m3783a(int i10, int i11) {
        return i10 == i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2960g) {
            return this.f8849a == ((C2960g) obj).f8849a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8849a;
    }

    public final String toString() {
        int i10 = this.f8849a;
        if (m3783a(i10, 0)) {
            return "Button";
        }
        if (m3783a(i10, 1)) {
            return "Checkbox";
        }
        if (m3783a(i10, 2)) {
            return "Switch";
        }
        if (m3783a(i10, 3)) {
            return "RadioButton";
        }
        if (m3783a(i10, 4)) {
            return "Tab";
        }
        if (m3783a(i10, 5)) {
            return "Image";
        }
        return m3783a(i10, 6) ? "DropdownList" : "Unknown";
    }
}
