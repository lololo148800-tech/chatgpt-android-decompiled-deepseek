package p130Eo;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Eo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C2617b {

    /* JADX INFO: renamed from: a */
    public final List f8104a;

    /* JADX INFO: renamed from: b */
    public final Map f8105b;

    /* JADX INFO: renamed from: c */
    public final Object f8106c;

    public C2617b(List list, Map map, Object obj) {
        this.f8104a = list;
        this.f8105b = map;
        this.f8106c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2617b)) {
            return false;
        }
        C2617b c2617b = (C2617b) obj;
        return AbstractC16544l.m18089b(this.f8104a, c2617b.f8104a) && AbstractC16544l.m18089b(this.f8105b, c2617b.f8105b) && AbstractC16544l.m18089b(this.f8106c, c2617b.f8106c);
    }

    public final int hashCode() {
        List list = this.f8104a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map map = this.f8105b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Object obj = this.f8106c;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "ArrayOperationInputData(operationData=" + this.f8104a + ", mappingOperation=" + this.f8105b + ", operationDefault=" + this.f8106c + Separators.RPAREN;
    }
}
