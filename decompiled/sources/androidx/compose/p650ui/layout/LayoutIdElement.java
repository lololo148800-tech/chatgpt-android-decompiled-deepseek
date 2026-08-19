package androidx.compose.p650ui.layout;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1095x1.C21099t;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/ui/layout/LayoutIdElement;", "Lz1/S;", "Lx1/t;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class LayoutIdElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final String f32745Y;

    public LayoutIdElement(String str) {
        this.f32745Y = str;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C21099t c21099t = new C21099t();
        c21099t.f67028z0 = this.f32745Y;
        return c21099t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && this.f32745Y.equals(((LayoutIdElement) obj).f32745Y);
    }

    public final int hashCode() {
        return this.f32745Y.hashCode();
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        ((C21099t) abstractC10458p).f67028z0 = this.f32745Y;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.f32745Y) + ')';
    }
}
