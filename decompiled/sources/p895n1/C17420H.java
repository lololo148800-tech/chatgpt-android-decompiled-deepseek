package p895n1;

import com.google.protobuf.AbstractC12107L1;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p774h1.AbstractC14334L;
import p774h1.AbstractC14360p;

/* JADX INFO: renamed from: n1.H */
/* JADX INFO: loaded from: classes.dex */
public final class C17420H extends AbstractC17419G {

    /* JADX INFO: renamed from: Y */
    public final String f55637Y;

    /* JADX INFO: renamed from: Z */
    public final Object f55638Z;

    /* JADX INFO: renamed from: o0 */
    public final int f55639o0;

    /* JADX INFO: renamed from: p0 */
    public final AbstractC14360p f55640p0;

    /* JADX INFO: renamed from: q0 */
    public final float f55641q0;

    /* JADX INFO: renamed from: r0 */
    public final AbstractC14360p f55642r0;

    /* JADX INFO: renamed from: s0 */
    public final float f55643s0;

    /* JADX INFO: renamed from: t0 */
    public final float f55644t0;

    /* JADX INFO: renamed from: u0 */
    public final int f55645u0;

    /* JADX INFO: renamed from: v0 */
    public final int f55646v0;

    /* JADX INFO: renamed from: w0 */
    public final float f55647w0;

    /* JADX INFO: renamed from: x0 */
    public final float f55648x0;

    /* JADX INFO: renamed from: y0 */
    public final float f55649y0;

    /* JADX INFO: renamed from: z0 */
    public final float f55650z0;

    public C17420H(String str, List list, int i10, AbstractC14360p abstractC14360p, float f10, AbstractC14360p abstractC14360p2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        this.f55637Y = str;
        this.f55638Z = list;
        this.f55639o0 = i10;
        this.f55640p0 = abstractC14360p;
        this.f55641q0 = f10;
        this.f55642r0 = abstractC14360p2;
        this.f55643s0 = f11;
        this.f55644t0 = f12;
        this.f55645u0 = i11;
        this.f55646v0 = i12;
        this.f55647w0 = f13;
        this.f55648x0 = f14;
        this.f55649y0 = f15;
        this.f55650z0 = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17420H.class == obj.getClass()) {
            C17420H c17420h = (C17420H) obj;
            return AbstractC16544l.m18089b(this.f55637Y, c17420h.f55637Y) && AbstractC16544l.m18089b(this.f55640p0, c17420h.f55640p0) && this.f55641q0 == c17420h.f55641q0 && AbstractC16544l.m18089b(this.f55642r0, c17420h.f55642r0) && this.f55643s0 == c17420h.f55643s0 && this.f55644t0 == c17420h.f55644t0 && AbstractC14334L.m15642t(this.f55645u0, c17420h.f55645u0) && AbstractC14334L.m15643u(this.f55646v0, c17420h.f55646v0) && this.f55647w0 == c17420h.f55647w0 && this.f55648x0 == c17420h.f55648x0 && this.f55649y0 == c17420h.f55649y0 && this.f55650z0 == c17420h.f55650z0 && this.f55639o0 == c17420h.f55639o0 && AbstractC16544l.m18089b(this.f55638Z, c17420h.f55638Z);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f55638Z.hashCode() + (this.f55637Y.hashCode() * 31)) * 31;
        AbstractC14360p abstractC14360p = this.f55640p0;
        int iM13819j = AbstractC12107L1.m13819j(this.f55641q0, (iHashCode + (abstractC14360p != null ? abstractC14360p.hashCode() : 0)) * 31, 31);
        AbstractC14360p abstractC14360p2 = this.f55642r0;
        return AbstractC12107L1.m13819j(this.f55650z0, AbstractC12107L1.m13819j(this.f55649y0, AbstractC12107L1.m13819j(this.f55648x0, AbstractC12107L1.m13819j(this.f55647w0, (((AbstractC12107L1.m13819j(this.f55644t0, AbstractC12107L1.m13819j(this.f55643s0, (iM13819j + (abstractC14360p2 != null ? abstractC14360p2.hashCode() : 0)) * 31, 31), 31) + this.f55645u0) * 31) + this.f55646v0) * 31, 31), 31), 31), 31) + this.f55639o0;
    }
}
