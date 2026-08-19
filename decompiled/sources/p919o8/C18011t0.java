package p919o8;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: o8.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C18011t0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f57499a;

    public C18011t0(LinkedHashMap linkedHashMap) {
        this.f57499a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18011t0) && this.f57499a.equals(((C18011t0) obj).f57499a);
    }

    public final int hashCode() {
        return this.f57499a.hashCode();
    }

    public final String toString() {
        return "Context(additionalProperties=" + this.f57499a + Separators.RPAREN;
    }
}
