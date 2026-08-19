package p857kl;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21328v;

/* JADX INFO: renamed from: kl.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C16472t {

    /* JADX INFO: renamed from: a */
    public final String f51109a;

    /* JADX INFO: renamed from: b */
    public final List f51110b;

    /* JADX INFO: renamed from: c */
    public final double f51111c;

    public C16472t(String value, List params) {
        Double d10;
        Object next;
        String str;
        Double dM21719f;
        AbstractC16544l.m18094g(value, "value");
        AbstractC16544l.m18094g(params, "params");
        this.f51109a = value;
        this.f51110b = params;
        Iterator it = params.iterator();
        do {
            d10 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC16544l.m18089b(((C16473u) next).f51112a, "q"));
        C16473u c16473u = (C16473u) next;
        double dDoubleValue = 1.0d;
        if (c16473u != null && (str = c16473u.f51113b) != null && (dM21719f = AbstractC21328v.m21719f(str)) != null) {
            double dDoubleValue2 = dM21719f.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                d10 = dM21719f;
            }
            if (d10 != null) {
                dDoubleValue = d10.doubleValue();
            }
        }
        this.f51111c = dDoubleValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16472t)) {
            return false;
        }
        C16472t c16472t = (C16472t) obj;
        return AbstractC16544l.m18089b(this.f51109a, c16472t.f51109a) && AbstractC16544l.m18089b(this.f51110b, c16472t.f51110b);
    }

    public final int hashCode() {
        return this.f51110b.hashCode() + (this.f51109a.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderValue(value=" + this.f51109a + ", params=" + this.f51110b + ')';
    }
}
