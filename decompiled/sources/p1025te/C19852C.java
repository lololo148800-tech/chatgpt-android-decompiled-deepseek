package p1025te;

/* JADX INFO: renamed from: te.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C19852C implements InterfaceC19862M {

    /* JADX INFO: renamed from: a */
    public final EnumC19873d f62943a;

    /* JADX INFO: renamed from: b */
    public final boolean f62944b = true;

    public C19852C(EnumC19873d enumC19873d) {
        this.f62943a = enumC19873d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19852C)) {
            return false;
        }
        C19852C c19852c = (C19852C) obj;
        return this.f62943a == c19852c.f62943a && this.f62944b == c19852c.f62944b;
    }

    public final int hashCode() {
        return (this.f62943a.hashCode() * 31) + (this.f62944b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
