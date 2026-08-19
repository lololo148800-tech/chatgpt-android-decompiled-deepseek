package p737f1;

/* JADX INFO: renamed from: f1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13510b {

    /* JADX INFO: renamed from: a */
    public final int f42774a;

    /* JADX INFO: renamed from: a */
    public static final boolean m15026a(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: b */
    public static String m15027b(int i10) {
        if (m15026a(i10, 1)) {
            return "Next";
        }
        if (m15026a(i10, 2)) {
            return "Previous";
        }
        if (m15026a(i10, 3)) {
            return "Left";
        }
        if (m15026a(i10, 4)) {
            return "Right";
        }
        if (m15026a(i10, 5)) {
            return "Up";
        }
        if (m15026a(i10, 6)) {
            return "Down";
        }
        if (m15026a(i10, 7)) {
            return "Enter";
        }
        return m15026a(i10, 8) ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13510b) {
            return this.f42774a == ((C13510b) obj).f42774a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f42774a;
    }

    public final String toString() {
        return m15027b(this.f42774a);
    }
}
