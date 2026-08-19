package p878lo;

import android.gov.nist.core.Separators;
import p1095x1.AbstractC21073a0;

/* JADX INFO: renamed from: lo.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C17105n {

    /* JADX INFO: renamed from: a */
    public final long f54657a;

    /* JADX INFO: renamed from: b */
    public final float f54658b;

    public C17105n(float f10, long j10) {
        this.f54657a = j10;
        this.f54658b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17105n)) {
            return false;
        }
        C17105n c17105n = (C17105n) obj;
        return AbstractC21073a0.m21555a(this.f54657a, c17105n.f54657a) && Float.compare(this.f54658b, c17105n.f54658b) == 0;
    }

    public final int hashCode() {
        int i10 = AbstractC21073a0.f66991b;
        long j10 = this.f54657a;
        return Float.floatToIntBits(this.f54658b) + (((int) (j10 ^ (j10 >>> 32))) * 31);
    }

    public final String toString() {
        return "ScaleMetadata(initialScale=" + AbstractC21073a0.m21559e(this.f54657a) + ", userZoom=" + this.f54658b + Separators.RPAREN;
    }
}
