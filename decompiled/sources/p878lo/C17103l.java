package p878lo;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p759g1.C13800b;

/* JADX INFO: renamed from: lo.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C17103l implements InterfaceC17104m {

    /* JADX INFO: renamed from: a */
    public final long f54655a;

    /* JADX INFO: renamed from: b */
    public final float f54656b;

    public C17103l(float f10, long j10) {
        this.f54655a = j10;
        this.f54656b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17103l)) {
            return false;
        }
        C17103l c17103l = (C17103l) obj;
        return C13800b.m15303d(this.f54655a, c17103l.f54655a) && Float.compare(this.f54656b, c17103l.f54656b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f54656b) + (C13800b.m15308i(this.f54655a) * 31);
    }

    public final String toString() {
        StringBuilder sbM11058p = AbstractC10763a.m11058p("Zooming(centroid=", C13800b.m15313n(this.f54655a), ", zoomDelta=");
        sbM11058p.append(this.f54656b);
        sbM11058p.append(Separators.RPAREN);
        return sbM11058p.toString();
    }
}
