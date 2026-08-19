package androidx.compose.p650ui;

import com.google.protobuf.AbstractC12107L1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p635a1.C10463u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/ui/ZIndexElement;", "Lz1/S;", "La1/u;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class ZIndexElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final float f32669Y;

    public ZIndexElement(float f10) {
        this.f32669Y = f10;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C10463u c10463u = new C10463u();
        c10463u.f30980z0 = this.f32669Y;
        return c10463u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.f32669Y, ((ZIndexElement) obj).f32669Y) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f32669Y);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        ((C10463u) abstractC10458p).f30980z0 = this.f32669Y;
    }

    public final String toString() {
        return AbstractC12107L1.m13825p(new StringBuilder("ZIndexElement(zIndex="), this.f32669Y, ')');
    }
}
