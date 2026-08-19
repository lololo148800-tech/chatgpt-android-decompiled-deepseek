package sh;

import java.util.ArrayList;

/* JADX INFO: renamed from: sh.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19619e0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f62244a;

    public C19619e0(ArrayList arrayList) {
        this.f62244a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19619e0) && this.f62244a.equals(((C19619e0) obj).f62244a);
    }

    public final int hashCode() {
        return this.f62244a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
