package p1025te;

/* JADX INFO: renamed from: te.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C19859J implements InterfaceC19862M {

    /* JADX INFO: renamed from: a */
    public final boolean f62951a;

    public C19859J(boolean z6) {
        this.f62951a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19859J) && this.f62951a == ((C19859J) obj).f62951a;
    }

    public final int hashCode() {
        return this.f62951a ? 1231 : 1237;
    }

    public final String toString() {
        return "█";
    }
}
