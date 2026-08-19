package p010A8;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: A8.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0402e {

    /* JADX INFO: renamed from: c */
    public static final String[] f1341c = {"_top_level"};

    /* JADX INFO: renamed from: a */
    public final Long f1342a;

    /* JADX INFO: renamed from: b */
    public final Map f1343b;

    public C0402e(Long l4, Map map) {
        this.f1342a = l4;
        this.f1343b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0402e)) {
            return false;
        }
        C0402e c0402e = (C0402e) obj;
        return AbstractC16544l.m18089b(this.f1342a, c0402e.f1342a) && AbstractC16544l.m18089b(this.f1343b, c0402e.f1343b);
    }

    public final int hashCode() {
        Long l4 = this.f1342a;
        return this.f1343b.hashCode() + ((l4 == null ? 0 : l4.hashCode()) * 31);
    }

    public final String toString() {
        return "Metrics(topLevel=" + this.f1342a + ", additionalProperties=" + this.f1343b + Separators.RPAREN;
    }
}
