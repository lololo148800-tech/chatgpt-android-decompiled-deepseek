package p919o8;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: o8.R0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17930R0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f57147a;

    public C17930R0(LinkedHashMap linkedHashMap) {
        this.f57147a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17930R0) && this.f57147a.equals(((C17930R0) obj).f57147a);
    }

    public final int hashCode() {
        return this.f57147a.hashCode();
    }

    public final String toString() {
        return "Context(additionalProperties=" + this.f57147a + Separators.RPAREN;
    }
}
