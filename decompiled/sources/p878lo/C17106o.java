package p878lo;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p1095x1.AbstractC21073a0;
import p759g1.C13800b;
import p759g1.C13803e;

/* JADX INFO: renamed from: lo.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C17106o {

    /* JADX INFO: renamed from: a */
    public final boolean f54659a;

    /* JADX INFO: renamed from: b */
    public final long f54660b;

    /* JADX INFO: renamed from: c */
    public final C17105n f54661c;

    /* JADX INFO: renamed from: d */
    public final long f54662d;

    /* JADX INFO: renamed from: e */
    public final C13800b f54663e;

    /* JADX INFO: renamed from: f */
    public final long f54664f;

    /* JADX INFO: renamed from: g */
    public final float f54665g = 0.0f;

    public C17106o(boolean z6, long j10, C17105n c17105n, long j11, C13800b c13800b, long j12) {
        this.f54659a = z6;
        this.f54660b = j10;
        this.f54661c = c17105n;
        this.f54662d = j11;
        this.f54663e = c13800b;
        this.f54664f = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17106o)) {
            return false;
        }
        C17106o c17106o = (C17106o) obj;
        return this.f54659a == c17106o.f54659a && AbstractC21073a0.m21555a(this.f54660b, c17106o.f54660b) && this.f54661c.equals(c17106o.f54661c) && C13800b.m15303d(this.f54662d, c17106o.f54662d) && AbstractC16544l.m18089b(this.f54663e, c17106o.f54663e) && C13803e.m15330b(this.f54664f, c17106o.f54664f) && Float.compare(this.f54665g, c17106o.f54665g) == 0;
    }

    public final int hashCode() {
        int i10 = this.f54659a ? 1231 : 1237;
        int i11 = AbstractC21073a0.f66991b;
        long j10 = this.f54660b;
        int iM15308i = (C13800b.m15308i(this.f54662d) + ((this.f54661c.hashCode() + ((((int) (j10 ^ (j10 >>> 32))) + (i10 * 31)) * 31)) * 31)) * 31;
        C13800b c13800b = this.f54663e;
        int iM15308i2 = (iM15308i + (c13800b == null ? 0 : C13800b.m15308i(c13800b.f43584a))) * 31;
        long j11 = this.f54664f;
        return Float.floatToIntBits(this.f54665g) + ((((int) ((j11 >>> 32) ^ j11)) + iM15308i2) * 31);
    }

    public final String toString() {
        return "RealZoomableContentTransformation(isSpecified=" + this.f54659a + ", scale=" + AbstractC21073a0.m21559e(this.f54660b) + ", scaleMetadata=" + this.f54661c + ", offset=" + C13800b.m15313n(this.f54662d) + ", centroid=" + this.f54663e + ", contentSize=" + C13803e.m15335g(this.f54664f) + ", rotationZ=" + this.f54665g + Separators.RPAREN;
    }
}
