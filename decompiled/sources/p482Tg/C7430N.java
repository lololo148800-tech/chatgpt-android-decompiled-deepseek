package p482Tg;

/* JADX INFO: renamed from: Tg.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C7430N implements InterfaceC7436U {

    /* JADX INFO: renamed from: a */
    public final boolean f23514a;

    public C7430N(boolean z6) {
        this.f23514a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7430N) && this.f23514a == ((C7430N) obj).f23514a;
    }

    public final int hashCode() {
        return this.f23514a ? 1231 : 1237;
    }

    public final String toString() {
        return "█";
    }
}
