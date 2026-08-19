package pf;

/* JADX INFO: renamed from: pf.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C18387c implements InterfaceC18393i {

    /* JADX INFO: renamed from: a */
    public final boolean f58667a;

    public C18387c(boolean z6) {
        this.f58667a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18387c) && this.f58667a == ((C18387c) obj).f58667a;
    }

    public final int hashCode() {
        return this.f58667a ? 1231 : 1237;
    }

    public final String toString() {
        return "█";
    }
}
