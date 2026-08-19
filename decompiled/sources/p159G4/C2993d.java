package p159G4;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21329w;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: G4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2993d {

    /* JADX INFO: renamed from: a */
    public final String f9008a;

    /* JADX INFO: renamed from: b */
    public final boolean f9009b;

    /* JADX INFO: renamed from: c */
    public final List f9010c;

    /* JADX INFO: renamed from: d */
    public final List f9011d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public C2993d(String str, boolean z6, List columns, List orders) {
        AbstractC16544l.m18094g(columns, "columns");
        AbstractC16544l.m18094g(orders, "orders");
        this.f9008a = str;
        this.f9009b = z6;
        this.f9010c = columns;
        this.f9011d = orders;
        List arrayList = orders;
        if (arrayList.isEmpty()) {
            int size = columns.size();
            arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add("ASC");
            }
        }
        this.f9011d = (List) arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2993d)) {
            return false;
        }
        C2993d c2993d = (C2993d) obj;
        if (this.f9009b != c2993d.f9009b || !AbstractC16544l.m18089b(this.f9010c, c2993d.f9010c) || !AbstractC16544l.m18089b(this.f9011d, c2993d.f9011d)) {
            return false;
        }
        String str = this.f9008a;
        boolean zM21734u = AbstractC21329w.m21734u(str, "index_", false);
        String str2 = c2993d.f9008a;
        return zM21734u ? AbstractC21329w.m21734u(str2, "index_", false) : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f9008a;
        return this.f9011d.hashCode() + AbstractC14376f.m15858x(this.f9010c, (((AbstractC21329w.m21734u(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f9009b ? 1 : 0)) * 31, 31);
    }

    public final String toString() {
        return "Index{name='" + this.f9008a + "', unique=" + this.f9009b + ", columns=" + this.f9010c + ", orders=" + this.f9011d + "'}";
    }
}
