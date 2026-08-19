package p644ab;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: ab.g */
/* JADX INFO: loaded from: classes.dex */
public final class C10534g implements InterfaceC10533f, Serializable {

    /* JADX INFO: renamed from: Y */
    public final List f31246Y;

    public C10534g(List list) {
        this.f31246Y = list;
    }

    @Override // p644ab.InterfaceC10533f
    public final boolean apply(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.f31246Y;
            if (i10 >= list.size()) {
                return true;
            }
            if (!((InterfaceC10533f) list.get(i10)).apply(obj)) {
                return false;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10534g) {
            return this.f31246Y.equals(((C10534g) obj).f31246Y);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31246Y.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z6 = true;
        for (Object obj : this.f31246Y) {
            if (!z6) {
                sb2.append(',');
            }
            sb2.append(obj);
            z6 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
