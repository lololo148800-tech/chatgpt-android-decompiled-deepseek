package p403Qd;

import java.util.ArrayList;

/* JADX INFO: renamed from: Qd.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C6602H {

    /* JADX INFO: renamed from: a */
    public final ArrayList f21316a;

    /* JADX INFO: renamed from: b */
    public final int f21317b;

    public C6602H(int i10, ArrayList arrayList) {
        this.f21316a = arrayList;
        this.f21317b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6602H)) {
            return false;
        }
        C6602H c6602h = (C6602H) obj;
        return this.f21316a.equals(c6602h.f21316a) && this.f21317b == c6602h.f21317b;
    }

    public final int hashCode() {
        return (this.f21316a.hashCode() * 31) + this.f21317b;
    }

    public final String toString() {
        return "█";
    }
}
