package p1025te;

/* JADX INFO: renamed from: te.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C19891v implements InterfaceC19862M {

    /* JADX INFO: renamed from: a */
    public final boolean f63037a;

    public C19891v(boolean z6) {
        this.f63037a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19891v) && this.f63037a == ((C19891v) obj).f63037a;
    }

    public final int hashCode() {
        return this.f63037a ? 1231 : 1237;
    }

    public final String toString() {
        return "█";
    }
}
