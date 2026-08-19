package p658b5;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: b5.j */
/* JADX INFO: loaded from: classes.dex */
public final class C11239j {

    /* JADX INFO: renamed from: a */
    public final String f34012a;

    /* JADX INFO: renamed from: b */
    public final int f34013b;

    public C11239j(String workSpecId, int i10) {
        AbstractC16544l.m18094g(workSpecId, "workSpecId");
        this.f34012a = workSpecId;
        this.f34013b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11239j)) {
            return false;
        }
        C11239j c11239j = (C11239j) obj;
        return AbstractC16544l.m18089b(this.f34012a, c11239j.f34012a) && this.f34013b == c11239j.f34013b;
    }

    public final int hashCode() {
        return (this.f34012a.hashCode() * 31) + this.f34013b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f34012a);
        sb2.append(", generation=");
        return AbstractC12107L1.m13826q(sb2, this.f34013b, ')');
    }
}
