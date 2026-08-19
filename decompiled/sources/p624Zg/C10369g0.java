package p624Zg;

/* JADX INFO: renamed from: Zg.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10369g0 extends AbstractC10371h0 {

    /* JADX INFO: renamed from: a */
    public final int f30727a;

    /* JADX INFO: renamed from: b */
    public final boolean f30728b;

    public C10369g0(int i10, boolean z6) {
        this.f30727a = i10;
        this.f30728b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10369g0)) {
            return false;
        }
        C10369g0 c10369g0 = (C10369g0) obj;
        return this.f30727a == c10369g0.f30727a && this.f30728b == c10369g0.f30728b;
    }

    public final int hashCode() {
        return (this.f30727a * 31) + (this.f30728b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
