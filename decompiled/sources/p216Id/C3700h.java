package p216Id;

/* JADX INFO: renamed from: Id.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C3700h implements InterfaceC3702j {

    /* JADX INFO: renamed from: a */
    public final boolean f11234a;

    public C3700h(boolean z6) {
        this.f11234a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3700h) && this.f11234a == ((C3700h) obj).f11234a;
    }

    public final int hashCode() {
        return this.f11234a ? 1231 : 1237;
    }

    public final String toString() {
        return "█";
    }
}
