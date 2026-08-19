package p292Lg;

/* JADX INFO: renamed from: Lg.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C5037i implements InterfaceC5042n {

    /* JADX INFO: renamed from: a */
    public final String f16485a;

    public C5037i(String str) {
        this.f16485a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5037i) {
            return this.f16485a.equals(((C5037i) obj).f16485a);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16485a.hashCode() * 31) + 1231;
    }

    public final String toString() {
        return "█";
    }
}
