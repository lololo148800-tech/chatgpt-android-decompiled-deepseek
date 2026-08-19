package p919o8;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p087D7.AbstractC1976c;
import p214Ib.C3676s;

/* JADX INFO: renamed from: o8.S */
/* JADX INFO: loaded from: classes.dex */
public final class C17932S {

    /* JADX INFO: renamed from: a */
    public final Map f57151a;

    public C17932S(Map map) {
        this.f57151a = map;
    }

    /* JADX INFO: renamed from: a */
    public final C3676s m19607a() {
        C3676s c3676s = new C3676s();
        for (Map.Entry entry : this.f57151a.entrySet()) {
            c3676s.m4391s((String) entry.getKey(), AbstractC1976c.m3153j(entry.getValue()));
        }
        return c3676s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17932S) && AbstractC16544l.m18089b(this.f57151a, ((C17932S) obj).f57151a);
    }

    public final int hashCode() {
        return this.f57151a.hashCode();
    }

    public final String toString() {
        return "Context(additionalProperties=" + this.f57151a + Separators.RPAREN;
    }
}
