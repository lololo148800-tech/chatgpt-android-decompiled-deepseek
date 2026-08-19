package p570X8;

/* JADX INFO: renamed from: X8.n */
/* JADX INFO: loaded from: classes.dex */
public final class C9086n extends AbstractC9094v {

    /* JADX INFO: renamed from: a */
    public final EnumC9093u f27852a;

    /* JADX INFO: renamed from: b */
    public final EnumC9092t f27853b;

    public C9086n(EnumC9093u enumC9093u, EnumC9092t enumC9092t) {
        this.f27852a = enumC9093u;
        this.f27853b = enumC9092t;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9094v)) {
            return false;
        }
        AbstractC9094v abstractC9094v = (AbstractC9094v) obj;
        EnumC9093u enumC9093u = this.f27852a;
        if (enumC9093u != null ? enumC9093u.equals(((C9086n) abstractC9094v).f27852a) : ((C9086n) abstractC9094v).f27852a == null) {
            EnumC9092t enumC9092t = this.f27853b;
            if (enumC9092t == null) {
                if (((C9086n) abstractC9094v).f27853b == null) {
                    return true;
                }
            } else if (enumC9092t.equals(((C9086n) abstractC9094v).f27853b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC9093u enumC9093u = this.f27852a;
        int iHashCode = ((enumC9093u == null ? 0 : enumC9093u.hashCode()) ^ 1000003) * 1000003;
        EnumC9092t enumC9092t = this.f27853b;
        return (enumC9092t != null ? enumC9092t.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f27852a + ", mobileSubtype=" + this.f27853b + "}";
    }
}
