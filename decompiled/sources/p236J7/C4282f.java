package p236J7;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: J7.f */
/* JADX INFO: loaded from: classes.dex */
public final class C4282f extends AbstractC4283g {

    /* JADX INFO: renamed from: a */
    public final String f13948a;

    /* JADX INFO: renamed from: b */
    public final Map f13949b;

    public C4282f(String message, Map map) {
        AbstractC16544l.m18094g(message, "message");
        this.f13948a = message;
        this.f13949b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4282f)) {
            return false;
        }
        C4282f c4282f = (C4282f) obj;
        return AbstractC16544l.m18089b(this.f13948a, c4282f.f13948a) && AbstractC16544l.m18089b(this.f13949b, c4282f.f13949b);
    }

    public final int hashCode() {
        int iHashCode = this.f13948a.hashCode() * 31;
        Map map = this.f13949b;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "Metric(message=" + this.f13948a + ", additionalProperties=" + this.f13949b + Separators.RPAREN;
    }
}
