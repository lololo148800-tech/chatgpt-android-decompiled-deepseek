package androidx.compose.foundation.layout;

import com.google.protobuf.AbstractC12107L1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p492U1.C7540e;
import p635a1.AbstractC10458p;
import p911o0.C17789v0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Lz1/S;", "Lo0/v0;", "foundation-layout_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class SizeElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final float f32497Y;

    /* JADX INFO: renamed from: Z */
    public final float f32498Z;

    /* JADX INFO: renamed from: o0 */
    public final float f32499o0;

    /* JADX INFO: renamed from: p0 */
    public final float f32500p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f32501q0;

    public SizeElement(float f10, float f11, float f12, float f13, boolean z6) {
        this.f32497Y = f10;
        this.f32498Z = f11;
        this.f32499o0 = f12;
        this.f32500p0 = f13;
        this.f32501q0 = z6;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C17789v0 c17789v0 = new C17789v0();
        c17789v0.f56770z0 = this.f32497Y;
        c17789v0.f56766A0 = this.f32498Z;
        c17789v0.f56767B0 = this.f32499o0;
        c17789v0.f56768C0 = this.f32500p0;
        c17789v0.f56769D0 = this.f32501q0;
        return c17789v0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return C7540e.m7873a(this.f32497Y, sizeElement.f32497Y) && C7540e.m7873a(this.f32498Z, sizeElement.f32498Z) && C7540e.m7873a(this.f32499o0, sizeElement.f32499o0) && C7540e.m7873a(this.f32500p0, sizeElement.f32500p0) && this.f32501q0 == sizeElement.f32501q0;
    }

    public final int hashCode() {
        return AbstractC12107L1.m13819j(this.f32500p0, AbstractC12107L1.m13819j(this.f32499o0, AbstractC12107L1.m13819j(this.f32498Z, Float.floatToIntBits(this.f32497Y) * 31, 31), 31), 31) + (this.f32501q0 ? 1231 : 1237);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C17789v0 c17789v0 = (C17789v0) abstractC10458p;
        c17789v0.f56770z0 = this.f32497Y;
        c17789v0.f56766A0 = this.f32498Z;
        c17789v0.f56767B0 = this.f32499o0;
        c17789v0.f56768C0 = this.f32500p0;
        c17789v0.f56769D0 = this.f32501q0;
    }

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, boolean z6, int i10) {
        this((i10 & 1) != 0 ? Float.NaN : f10, (i10 & 2) != 0 ? Float.NaN : f11, (i10 & 4) != 0 ? Float.NaN : f12, (i10 & 8) != 0 ? Float.NaN : f13, z6);
    }
}
