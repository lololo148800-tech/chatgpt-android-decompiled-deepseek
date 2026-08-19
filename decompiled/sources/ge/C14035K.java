package ge;

/* JADX INFO: renamed from: ge.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C14035K implements InterfaceC14052T {

    /* JADX INFO: renamed from: a */
    public final boolean f44123a;

    public C14035K(boolean z6) {
        this.f44123a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14035K) && this.f44123a == ((C14035K) obj).f44123a;
    }

    public final int hashCode() {
        return this.f44123a ? 1231 : 1237;
    }

    public final String toString() {
        return "█";
    }
}
