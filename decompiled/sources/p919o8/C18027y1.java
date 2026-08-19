package p919o8;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: o8.y1 */
/* JADX INFO: loaded from: classes.dex */
public final class C18027y1 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f57544a;

    public C18027y1(LinkedHashMap linkedHashMap) {
        this.f57544a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18027y1) && this.f57544a.equals(((C18027y1) obj).f57544a);
    }

    public final int hashCode() {
        return this.f57544a.hashCode();
    }

    public final String toString() {
        return "CustomTimings(additionalProperties=" + this.f57544a + Separators.RPAREN;
    }
}
