package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p635a1.InterfaceC10445c;
import p911o0.C17742W;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/layout/HorizontalAlignElement;", "Lz1/S;", "Lo0/W;", "foundation-layout_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class HorizontalAlignElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC10445c f32484Y;

    public HorizontalAlignElement(InterfaceC10445c interfaceC10445c) {
        this.f32484Y = interfaceC10445c;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C17742W c17742w = new C17742W();
        c17742w.f56655z0 = this.f32484Y;
        return c17742w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return AbstractC16544l.m18089b(this.f32484Y, horizontalAlignElement.f32484Y);
    }

    public final int hashCode() {
        return this.f32484Y.hashCode();
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        ((C17742W) abstractC10458p).f56655z0 = this.f32484Y;
    }
}
