package p672c3;

import com.google.protobuf.AbstractC12107L1;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.C17690x;

/* JADX INFO: renamed from: c3.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11600d0 {

    /* JADX INFO: renamed from: a */
    public final int f35091a;

    /* JADX INFO: renamed from: b */
    public final int f35092b;

    /* JADX INFO: renamed from: c */
    public final Map f35093c;

    public C11600d0(int i10, int i11, Map map) {
        this.f35091a = i10;
        this.f35092b = i11;
        this.f35093c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11600d0)) {
            return false;
        }
        C11600d0 c11600d0 = (C11600d0) obj;
        return this.f35091a == c11600d0.f35091a && this.f35092b == c11600d0.f35092b && AbstractC16544l.m18089b(this.f35093c, c11600d0.f35093c);
    }

    public final int hashCode() {
        return this.f35093c.hashCode() + (((this.f35091a * 31) + this.f35092b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsertedViewInfo(mainViewId=");
        sb2.append(this.f35091a);
        sb2.append(", complexViewId=");
        sb2.append(this.f35092b);
        sb2.append(", children=");
        return AbstractC12107L1.m13827r(sb2, this.f35093c, ')');
    }

    public /* synthetic */ C11600d0(int i10, int i11, Map map, int i12) {
        this((i12 & 1) != 0 ? -1 : i10, (i12 & 2) != 0 ? -1 : i11, (i12 & 4) != 0 ? C17690x.f56481Y : map);
    }
}
