package ge;

/* JADX INFO: renamed from: ge.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C14100s implements InterfaceC14052T {

    /* JADX INFO: renamed from: a */
    public final boolean f44349a;

    public C14100s(boolean z6) {
        this.f44349a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14100s) && this.f44349a == ((C14100s) obj).f44349a;
    }

    public final int hashCode() {
        return this.f44349a ? 1231 : 1237;
    }

    public final String toString() {
        return "█";
    }
}
