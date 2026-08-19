package androidx.compose.foundation.layout;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p911o0.C17772n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/layout/AspectRatioElement;", "Lz1/S;", "Lo0/n;", "foundation-layout_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class AspectRatioElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final float f32479Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f32480Z;

    public AspectRatioElement(float f10, boolean z6) {
        this.f32479Y = f10;
        this.f32480Z = z6;
        if (f10 > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + f10 + " must be > 0").toString());
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C17772n c17772n = new C17772n();
        c17772n.f56732z0 = this.f32479Y;
        c17772n.f56731A0 = this.f32480Z;
        return c17772n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement == null) {
            return false;
        }
        if (this.f32479Y == aspectRatioElement.f32479Y) {
            if (this.f32480Z == ((AspectRatioElement) obj).f32480Z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f32479Y) * 31) + (this.f32480Z ? 1231 : 1237);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C17772n c17772n = (C17772n) abstractC10458p;
        c17772n.f56732z0 = this.f32479Y;
        c17772n.f56731A0 = this.f32480Z;
    }
}
