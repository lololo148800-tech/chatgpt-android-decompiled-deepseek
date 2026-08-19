package sh;

import java.util.ArrayList;

/* JADX INFO: renamed from: sh.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C19640r {

    /* JADX INFO: renamed from: a */
    public final ArrayList f62288a;

    public C19640r(ArrayList arrayList) {
        this.f62288a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19640r) && this.f62288a.equals(((C19640r) obj).f62288a);
    }

    public final int hashCode() {
        return this.f62288a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
