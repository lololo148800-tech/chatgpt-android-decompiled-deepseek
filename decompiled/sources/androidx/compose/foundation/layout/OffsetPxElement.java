package androidx.compose.foundation.layout;

import ge.C14089m0;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p911o0.C17759g0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "Lz1/S;", "Lo0/g0;", "foundation-layout_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class OffsetPxElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC1436k f32491Y;

    public OffsetPxElement(InterfaceC1436k interfaceC1436k, C14089m0 c14089m0) {
        this.f32491Y = interfaceC1436k;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C17759g0 c17759g0 = new C17759g0();
        c17759g0.f56706z0 = this.f32491Y;
        c17759g0.f56705A0 = true;
        return c17759g0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.f32491Y == offsetPxElement.f32491Y;
    }

    public final int hashCode() {
        return (this.f32491Y.hashCode() * 31) + 1231;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C17759g0 c17759g0 = (C17759g0) abstractC10458p;
        c17759g0.f56706z0 = this.f32491Y;
        c17759g0.f56705A0 = true;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f32491Y + ", rtlAware=true)";
    }
}
