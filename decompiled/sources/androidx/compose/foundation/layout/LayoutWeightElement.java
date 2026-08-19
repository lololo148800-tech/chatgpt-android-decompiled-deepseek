package androidx.compose.foundation.layout;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p911o0.C17753d0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "Lz1/S;", "Lo0/d0;", "foundation-layout_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class LayoutWeightElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final float f32487Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f32488Z;

    public LayoutWeightElement(float f10, boolean z6) {
        this.f32487Y = f10;
        this.f32488Z = z6;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C17753d0 c17753d0 = new C17753d0();
        c17753d0.f56687z0 = this.f32487Y;
        c17753d0.f56686A0 = this.f32488Z;
        return c17753d0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        if (layoutWeightElement == null) {
            return false;
        }
        return this.f32487Y == layoutWeightElement.f32487Y && this.f32488Z == layoutWeightElement.f32488Z;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f32487Y) * 31) + (this.f32488Z ? 1231 : 1237);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C17753d0 c17753d0 = (C17753d0) abstractC10458p;
        c17753d0.f56687z0 = this.f32487Y;
        c17753d0.f56686A0 = this.f32488Z;
    }
}
