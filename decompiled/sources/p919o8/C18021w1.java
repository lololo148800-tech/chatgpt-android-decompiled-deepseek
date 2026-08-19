package p919o8;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.Map;
import p087D7.AbstractC1976c;
import p214Ib.C3676s;

/* JADX INFO: renamed from: o8.w1 */
/* JADX INFO: loaded from: classes.dex */
public final class C18021w1 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f57528a;

    public C18021w1(LinkedHashMap linkedHashMap) {
        this.f57528a = linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public final C3676s m19682a() {
        C3676s c3676s = new C3676s();
        for (Map.Entry entry : this.f57528a.entrySet()) {
            c3676s.m4391s((String) entry.getKey(), AbstractC1976c.m3153j(entry.getValue()));
        }
        return c3676s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18021w1) && this.f57528a.equals(((C18021w1) obj).f57528a);
    }

    public final int hashCode() {
        return this.f57528a.hashCode();
    }

    public final String toString() {
        return "Context(additionalProperties=" + this.f57528a + Separators.RPAREN;
    }
}
