package pf;

/* JADX INFO: renamed from: pf.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C18389e implements InterfaceC18393i {

    /* JADX INFO: renamed from: a */
    public final boolean f58669a;

    public C18389e(boolean z6) {
        this.f58669a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18389e) && this.f58669a == ((C18389e) obj).f58669a;
    }

    public final int hashCode() {
        return this.f58669a ? 1231 : 1237;
    }

    public final String toString() {
        return "█";
    }
}
