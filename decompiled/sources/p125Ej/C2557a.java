package p125Ej;

/* JADX INFO: renamed from: Ej.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2557a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2564h f7980a;

    public C2557a(InterfaceC2564h interfaceC2564h) {
        this.f7980a = interfaceC2564h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2557a) {
            return this.f7980a.equals(((C2557a) obj).f7980a);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f7980a.hashCode() * 31) + ((int) 1000);
    }

    public final String toString() {
        return "HintEvent(hint=" + this.f7980a + ", minDurationMs=1000)";
    }
}
