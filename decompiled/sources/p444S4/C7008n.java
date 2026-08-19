package p444S4;

/* JADX INFO: renamed from: S4.n */
/* JADX INFO: loaded from: classes.dex */
public final class C7008n extends AbstractC7009o {

    /* JADX INFO: renamed from: a */
    public final C7001g f22415a;

    public C7008n(C7001g c7001g) {
        this.f22415a = c7001g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7008n.class != obj.getClass()) {
            return false;
        }
        return this.f22415a.equals(((C7008n) obj).f22415a);
    }

    public final int hashCode() {
        return this.f22415a.hashCode() + (C7008n.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f22415a + '}';
    }
}
