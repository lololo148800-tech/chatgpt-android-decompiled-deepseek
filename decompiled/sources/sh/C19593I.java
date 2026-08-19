package sh;

import java.util.ArrayList;

/* JADX INFO: renamed from: sh.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C19593I {

    /* JADX INFO: renamed from: a */
    public final ArrayList f62203a;

    public C19593I(ArrayList arrayList) {
        this.f62203a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19593I) && this.f62203a.equals(((C19593I) obj).f62203a);
    }

    public final int hashCode() {
        return this.f62203a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
