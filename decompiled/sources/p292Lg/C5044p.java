package p292Lg;

/* JADX INFO: renamed from: Lg.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C5044p implements InterfaceC5051w {

    /* JADX INFO: renamed from: a */
    public final boolean f16491a;

    public C5044p(boolean z6) {
        this.f16491a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5044p) && this.f16491a == ((C5044p) obj).f16491a;
    }

    public final int hashCode() {
        return this.f16491a ? 1231 : 1237;
    }

    public final String toString() {
        return "█";
    }
}
