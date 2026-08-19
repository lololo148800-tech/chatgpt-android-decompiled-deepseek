package p658b5;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: b5.g */
/* JADX INFO: loaded from: classes.dex */
public final class C11236g {

    /* JADX INFO: renamed from: a */
    public final String f34003a;

    /* JADX INFO: renamed from: b */
    public final int f34004b;

    /* JADX INFO: renamed from: c */
    public final int f34005c;

    public C11236g(String workSpecId, int i10, int i11) {
        AbstractC16544l.m18094g(workSpecId, "workSpecId");
        this.f34003a = workSpecId;
        this.f34004b = i10;
        this.f34005c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11236g)) {
            return false;
        }
        C11236g c11236g = (C11236g) obj;
        return AbstractC16544l.m18089b(this.f34003a, c11236g.f34003a) && this.f34004b == c11236g.f34004b && this.f34005c == c11236g.f34005c;
    }

    public final int hashCode() {
        return (((this.f34003a.hashCode() * 31) + this.f34004b) * 31) + this.f34005c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f34003a);
        sb2.append(", generation=");
        sb2.append(this.f34004b);
        sb2.append(", systemId=");
        return AbstractC12107L1.m13826q(sb2, this.f34005c, ')');
    }
}
