package ge;

/* JADX INFO: renamed from: ge.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C14019C implements InterfaceC14052T {

    /* JADX INFO: renamed from: a */
    public final boolean f44102a;

    public C14019C(boolean z6) {
        this.f44102a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14019C) && this.f44102a == ((C14019C) obj).f44102a;
    }

    public final int hashCode() {
        return this.f44102a ? 1231 : 1237;
    }

    public final String toString() {
        return "█";
    }
}
