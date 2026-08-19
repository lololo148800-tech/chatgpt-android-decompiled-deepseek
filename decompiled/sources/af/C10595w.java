package af;

/* JADX INFO: renamed from: af.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C10595w implements InterfaceC10597y {

    /* JADX INFO: renamed from: a */
    public final boolean f31446a;

    public C10595w(boolean z6) {
        this.f31446a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10595w) && this.f31446a == ((C10595w) obj).f31446a;
    }

    public final int hashCode() {
        return this.f31446a ? 1231 : 1237;
    }

    public final String toString() {
        return "█";
    }
}
