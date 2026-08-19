package androidx.compose.foundation.layout;

import com.google.protobuf.AbstractC12107L1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p1140z1.AbstractC21672S;
import p492U1.C7540e;
import p635a1.AbstractC10458p;
import p911o0.C17761h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Lz1/S;", "Lo0/h0;", "foundation-layout_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class PaddingElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final float f32492Y;

    /* JADX INFO: renamed from: Z */
    public final float f32493Z;

    /* JADX INFO: renamed from: o0 */
    public final float f32494o0;

    /* JADX INFO: renamed from: p0 */
    public final float f32495p0;

    public PaddingElement(float f10, float f11, float f12, float f13, InterfaceC1436k interfaceC1436k) {
        this.f32492Y = f10;
        this.f32493Z = f11;
        this.f32494o0 = f12;
        this.f32495p0 = f13;
        if ((f10 < 0.0f && !C7540e.m7873a(f10, Float.NaN)) || ((f11 < 0.0f && !C7540e.m7873a(f11, Float.NaN)) || ((f12 < 0.0f && !C7540e.m7873a(f12, Float.NaN)) || (f13 < 0.0f && !C7540e.m7873a(f13, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C17761h0 c17761h0 = new C17761h0();
        c17761h0.f56711z0 = this.f32492Y;
        c17761h0.f56707A0 = this.f32493Z;
        c17761h0.f56708B0 = this.f32494o0;
        c17761h0.f56709C0 = this.f32495p0;
        c17761h0.f56710D0 = true;
        return c17761h0;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && C7540e.m7873a(this.f32492Y, paddingElement.f32492Y) && C7540e.m7873a(this.f32493Z, paddingElement.f32493Z) && C7540e.m7873a(this.f32494o0, paddingElement.f32494o0) && C7540e.m7873a(this.f32495p0, paddingElement.f32495p0);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f32495p0) + AbstractC12107L1.m13819j(this.f32494o0, AbstractC12107L1.m13819j(this.f32493Z, Float.floatToIntBits(this.f32492Y) * 31, 31), 31)) * 31) + 1231;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C17761h0 c17761h0 = (C17761h0) abstractC10458p;
        c17761h0.f56711z0 = this.f32492Y;
        c17761h0.f56707A0 = this.f32493Z;
        c17761h0.f56708B0 = this.f32494o0;
        c17761h0.f56709C0 = this.f32495p0;
        c17761h0.f56710D0 = true;
    }
}
