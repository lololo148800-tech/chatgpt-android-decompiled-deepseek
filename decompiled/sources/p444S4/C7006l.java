package p444S4;

/* JADX INFO: renamed from: S4.l */
/* JADX INFO: loaded from: classes.dex */
public final class C7006l extends AbstractC7009o {

    /* JADX INFO: renamed from: a */
    public final C7001g f22414a = C7001g.f22407c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7006l.class != obj.getClass()) {
            return false;
        }
        return this.f22414a.equals(((C7006l) obj).f22414a);
    }

    public final int hashCode() {
        return this.f22414a.hashCode() + (C7006l.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f22414a + '}';
    }
}
