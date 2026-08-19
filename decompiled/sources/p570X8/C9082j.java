package p570X8;

/* JADX INFO: renamed from: X8.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9082j extends AbstractC9089q {

    /* JADX INFO: renamed from: a */
    public final C9080h f27837a;

    public C9082j(C9080h c9080h) {
        this.f27837a = c9080h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9089q)) {
            return false;
        }
        AbstractC9089q abstractC9089q = (AbstractC9089q) obj;
        Object obj2 = EnumC9088p.f27854Y;
        ((C9082j) abstractC9089q).getClass();
        return obj2.equals(obj2) && this.f27837a.equals(((C9082j) abstractC9089q).f27837a);
    }

    public final int hashCode() {
        return ((EnumC9088p.f27854Y.hashCode() ^ 1000003) * 1000003) ^ this.f27837a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + EnumC9088p.f27854Y + ", androidClientInfo=" + this.f27837a + "}";
    }
}
