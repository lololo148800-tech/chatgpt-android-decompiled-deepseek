package androidx.compose.foundation.layout;

import com.google.protobuf.AbstractC12107L1;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1095x1.C21094o;
import p1140z1.AbstractC21672S;
import p492U1.C7540e;
import p635a1.AbstractC10458p;
import p911o0.C17750c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;", "Lz1/S;", "Lo0/c;", "foundation-layout_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class AlignmentLineOffsetDpElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C21094o f32476Y;

    /* JADX INFO: renamed from: Z */
    public final float f32477Z;

    /* JADX INFO: renamed from: o0 */
    public final float f32478o0;

    public AlignmentLineOffsetDpElement(C21094o c21094o, float f10, float f11) {
        this.f32476Y = c21094o;
        this.f32477Z = f10;
        this.f32478o0 = f11;
        if ((f10 < 0.0f && !C7540e.m7873a(f10, Float.NaN)) || (f11 < 0.0f && !C7540e.m7873a(f11, Float.NaN))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number");
        }
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C17750c c17750c = new C17750c();
        c17750c.f56682z0 = this.f32476Y;
        c17750c.f56680A0 = this.f32477Z;
        c17750c.f56681B0 = this.f32478o0;
        return c17750c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        if (alignmentLineOffsetDpElement == null) {
            return false;
        }
        return AbstractC16544l.m18089b(this.f32476Y, alignmentLineOffsetDpElement.f32476Y) && C7540e.m7873a(this.f32477Z, alignmentLineOffsetDpElement.f32477Z) && C7540e.m7873a(this.f32478o0, alignmentLineOffsetDpElement.f32478o0);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f32478o0) + AbstractC12107L1.m13819j(this.f32477Z, this.f32476Y.hashCode() * 31, 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C17750c c17750c = (C17750c) abstractC10458p;
        c17750c.f56682z0 = this.f32476Y;
        c17750c.f56680A0 = this.f32477Z;
        c17750c.f56681B0 = this.f32478o0;
    }
}
