package androidx.compose.foundation.layout;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p001A.AbstractC0010F;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p911o0.C17723E;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Lz1/S;", "Lo0/E;", "foundation-layout_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class FillElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final int f32482Y;

    /* JADX INFO: renamed from: Z */
    public final float f32483Z;

    public FillElement(int i10, float f10) {
        this.f32482Y = i10;
        this.f32483Z = f10;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C17723E c17723e = new C17723E();
        c17723e.f56584z0 = this.f32482Y;
        c17723e.f56583A0 = this.f32483Z;
        return c17723e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f32482Y == fillElement.f32482Y && this.f32483Z == fillElement.f32483Z;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f32483Z) + (AbstractC0010F.m24h(this.f32482Y) * 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C17723E c17723e = (C17723E) abstractC10458p;
        c17723e.f56584z0 = this.f32482Y;
        c17723e.f56583A0 = this.f32483Z;
    }
}
