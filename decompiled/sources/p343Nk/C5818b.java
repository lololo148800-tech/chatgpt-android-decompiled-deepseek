package p343Nk;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: Nk.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C5818b {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f18986a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f18987b;

    public C5818b(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f18986a = linkedHashMap;
        this.f18987b = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5818b)) {
            return false;
        }
        C5818b c5818b = (C5818b) obj;
        return this.f18986a.equals(c5818b.f18986a) && this.f18987b.equals(c5818b.f18987b);
    }

    public final int hashCode() {
        return this.f18987b.hashCode() + (this.f18986a.hashCode() * 31);
    }

    public final String toString() {
        return "LogicOperations(standardOperations=" + this.f18986a + ", functionalOperations=" + this.f18987b + Separators.RPAREN;
    }
}
