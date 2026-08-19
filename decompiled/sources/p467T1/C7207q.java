package p467T1;

/* JADX INFO: renamed from: T1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C7207q {

    /* JADX INFO: renamed from: c */
    public static final C7207q f22877c = new C7207q(2, false);

    /* JADX INFO: renamed from: d */
    public static final C7207q f22878d = new C7207q(1, true);

    /* JADX INFO: renamed from: a */
    public final int f22879a;

    /* JADX INFO: renamed from: b */
    public final boolean f22880b;

    public C7207q(int i10, boolean z6) {
        this.f22879a = i10;
        this.f22880b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7207q)) {
            return false;
        }
        C7207q c7207q = (C7207q) obj;
        return this.f22879a == c7207q.f22879a && this.f22880b == c7207q.f22880b;
    }

    public final int hashCode() {
        return (this.f22879a * 31) + (this.f22880b ? 1231 : 1237);
    }

    public final String toString() {
        if (equals(f22877c)) {
            return "TextMotion.Static";
        }
        return equals(f22878d) ? "TextMotion.Animated" : "Invalid";
    }
}
