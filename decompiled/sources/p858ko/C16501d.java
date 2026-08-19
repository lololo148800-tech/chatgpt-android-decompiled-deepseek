package p858ko;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.google.protobuf.AbstractC12107L1;
import p571X9.AbstractC9306j0;
import p759g1.C13800b;

/* JADX INFO: renamed from: ko.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C16501d {

    /* JADX INFO: renamed from: a */
    public final long f51184a;

    /* JADX INFO: renamed from: b */
    public final float f51185b;

    /* JADX INFO: renamed from: c */
    public final long f51186c;

    public C16501d(float f10, long j10, long j11) {
        this.f51184a = j10;
        this.f51185b = f10;
        this.f51186c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16501d)) {
            return false;
        }
        C16501d c16501d = (C16501d) obj;
        return C13800b.m15303d(this.f51184a, c16501d.f51184a) && Float.compare(this.f51185b, c16501d.f51185b) == 0 && C13800b.m15303d(this.f51186c, c16501d.f51186c);
    }

    public final int hashCode() {
        return C13800b.m15308i(this.f51186c) + AbstractC12107L1.m13819j(this.f51185b, C13800b.m15308i(this.f51184a) * 31, 31);
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(C13800b.m15313n(this.f51186c), Separators.RPAREN, AbstractC9306j0.m9896o("GestureState(userOffset=", AbstractC10763a.m11054l("UserOffset(value=", C13800b.m15313n(this.f51184a), Separators.RPAREN), ", userZoom=", "UserZoomFactor(value=" + this.f51185b + Separators.RPAREN, ", lastCentroid="));
    }
}
