package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p911o0.C17771m0;
import p911o0.C17776p;
import p911o0.InterfaceC17763i0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/layout/PaddingValuesElement;", "Lz1/S;", "Lo0/m0;", "foundation-layout_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class PaddingValuesElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC17763i0 f32496Y;

    public PaddingValuesElement(InterfaceC17763i0 interfaceC17763i0, C17776p c17776p) {
        this.f32496Y = interfaceC17763i0;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C17771m0 c17771m0 = new C17771m0();
        c17771m0.f56730z0 = this.f32496Y;
        return c17771m0;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return AbstractC16544l.m18089b(this.f32496Y, paddingValuesElement.f32496Y);
    }

    public final int hashCode() {
        return this.f32496Y.hashCode();
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        ((C17771m0) abstractC10458p).f56730z0 = this.f32496Y;
    }
}
