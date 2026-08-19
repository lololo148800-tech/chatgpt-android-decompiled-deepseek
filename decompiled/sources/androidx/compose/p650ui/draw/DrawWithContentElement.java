package androidx.compose.p650ui.draw;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p715e1.C13261g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/ui/draw/DrawWithContentElement;", "Lz1/S;", "Le1/g;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class DrawWithContentElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC1436k f32672Y;

    public DrawWithContentElement(InterfaceC1436k interfaceC1436k) {
        this.f32672Y = interfaceC1436k;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C13261g c13261g = new C13261g();
        c13261g.f41877z0 = this.f32672Y;
        return c13261g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && AbstractC16544l.m18089b(this.f32672Y, ((DrawWithContentElement) obj).f32672Y);
    }

    public final int hashCode() {
        return this.f32672Y.hashCode();
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        ((C13261g) abstractC10458p).f41877z0 = this.f32672Y;
    }

    public final String toString() {
        return "DrawWithContentElement(onDraw=" + this.f32672Y + ')';
    }
}
