package androidx.compose.foundation.layout;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p635a1.C10451i;
import p911o0.C17774o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "Lz1/S;", "Lo0/o;", "foundation-layout_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class BoxChildDataElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C10451i f32481Y;

    public BoxChildDataElement(C10451i c10451i) {
        this.f32481Y = c10451i;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C17774o c17774o = new C17774o();
        c17774o.f56733z0 = this.f32481Y;
        return c17774o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        if (boxChildDataElement == null) {
            return false;
        }
        return this.f32481Y.equals(boxChildDataElement.f32481Y);
    }

    public final int hashCode() {
        return (this.f32481Y.hashCode() * 31) + 1237;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        ((C17774o) abstractC10458p).f56733z0 = this.f32481Y;
    }
}
