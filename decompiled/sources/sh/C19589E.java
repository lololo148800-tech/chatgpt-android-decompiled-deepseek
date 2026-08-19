package sh;

import java.util.ArrayList;

/* JADX INFO: renamed from: sh.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C19589E {

    /* JADX INFO: renamed from: a */
    public final ArrayList f62197a;

    public C19589E(ArrayList arrayList) {
        this.f62197a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19589E) && this.f62197a.equals(((C19589E) obj).f62197a);
    }

    public final int hashCode() {
        return this.f62197a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
