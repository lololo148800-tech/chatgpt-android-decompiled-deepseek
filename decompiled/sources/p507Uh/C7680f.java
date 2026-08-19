package p507Uh;

/* JADX INFO: renamed from: Uh.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C7680f implements InterfaceC7682h {

    /* JADX INFO: renamed from: a */
    public final boolean f24218a;

    /* JADX INFO: renamed from: b */
    public final boolean f24219b;

    public C7680f(boolean z6, boolean z10) {
        this.f24218a = z6;
        this.f24219b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7680f)) {
            return false;
        }
        C7680f c7680f = (C7680f) obj;
        return this.f24218a == c7680f.f24218a && this.f24219b == c7680f.f24219b;
    }

    public final int hashCode() {
        return ((this.f24218a ? 1231 : 1237) * 31) + (this.f24219b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
