package androidx.compose.foundation.layout;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p001A.AbstractC0010F;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p911o0.C17749b0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/layout/IntrinsicHeightElement;", "Lz1/S;", "Lo0/b0;", "foundation-layout_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class IntrinsicHeightElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final int f32485Y;

    public IntrinsicHeightElement(int i10) {
        this.f32485Y = i10;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C17749b0 c17749b0 = new C17749b0(1);
        c17749b0.f56678A0 = this.f32485Y;
        c17749b0.f56679B0 = true;
        return c17749b0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        return intrinsicHeightElement != null && this.f32485Y == intrinsicHeightElement.f32485Y;
    }

    public final int hashCode() {
        return (AbstractC0010F.m24h(this.f32485Y) * 31) + 1231;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C17749b0 c17749b0 = (C17749b0) abstractC10458p;
        c17749b0.f56678A0 = this.f32485Y;
        c17749b0.f56679B0 = true;
    }
}
