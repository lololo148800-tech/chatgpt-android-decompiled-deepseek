package p858ko;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import p759g1.C13800b;

/* JADX INFO: renamed from: ko.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C16507j implements InterfaceC16509l {

    /* JADX INFO: renamed from: b */
    public final EnumC16508k f51202b;

    /* JADX INFO: renamed from: c */
    public final float f51203c;

    /* JADX INFO: renamed from: d */
    public final long f51204d;

    public C16507j(EnumC16508k enumC16508k, float f10, long j10) {
        this.f51202b = enumC16508k;
        this.f51203c = f10;
        this.f51204d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16507j)) {
            return false;
        }
        C16507j c16507j = (C16507j) obj;
        return this.f51202b == c16507j.f51202b && Float.compare(this.f51203c, c16507j.f51203c) == 0 && C13800b.m15303d(this.f51204d, c16507j.f51204d);
    }

    public final int hashCode() {
        return C13800b.m15308i(this.f51204d) + AbstractC12107L1.m13819j(this.f51203c, this.f51202b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Zoom(direction=" + this.f51202b + ", zoomFactor=" + this.f51203c + ", centroid=" + C13800b.m15313n(this.f51204d) + Separators.RPAREN;
    }
}
