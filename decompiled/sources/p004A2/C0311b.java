package p004A2;

import p138F8.vJO.anhfj;
import p817j$.util.Objects;

/* JADX INFO: renamed from: A2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0311b {

    /* JADX INFO: renamed from: a */
    public final Object f1082a;

    /* JADX INFO: renamed from: b */
    public final Object f1083b;

    public C0311b(Object obj, Object obj2) {
        this.f1082a = obj;
        this.f1083b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0311b)) {
            return false;
        }
        C0311b c0311b = (C0311b) obj;
        return Objects.equals(c0311b.f1082a, this.f1082a) && Objects.equals(c0311b.f1083b, this.f1083b);
    }

    public final int hashCode() {
        Object obj = this.f1082a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f1083b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f1082a + anhfj.Gxa + this.f1083b + "}";
    }
}
