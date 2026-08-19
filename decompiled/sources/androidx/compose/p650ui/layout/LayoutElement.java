package androidx.compose.p650ui.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1440o;
import p1095x1.C21103x;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "Lz1/S;", "Lx1/x;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class LayoutElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC1440o f32744Y;

    public LayoutElement(InterfaceC1440o interfaceC1440o) {
        this.f32744Y = interfaceC1440o;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C21103x c21103x = new C21103x();
        c21103x.f67033z0 = this.f32744Y;
        return c21103x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && AbstractC16544l.m18089b(this.f32744Y, ((LayoutElement) obj).f32744Y);
    }

    public final int hashCode() {
        return this.f32744Y.hashCode();
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        ((C21103x) abstractC10458p).f67033z0 = this.f32744Y;
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.f32744Y + ')';
    }
}
