package androidx.compose.p650ui.draw;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p715e1.C13256b;
import p715e1.C13257c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/ui/draw/DrawWithCacheElement;", "Lz1/S;", "Le1/b;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class DrawWithCacheElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC1436k f32671Y;

    public DrawWithCacheElement(InterfaceC1436k interfaceC1436k) {
        this.f32671Y = interfaceC1436k;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new C13256b(new C13257c(), this.f32671Y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && AbstractC16544l.m18089b(this.f32671Y, ((DrawWithCacheElement) obj).f32671Y);
    }

    public final int hashCode() {
        return this.f32671Y.hashCode();
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C13256b c13256b = (C13256b) abstractC10458p;
        c13256b.f41871C0 = this.f32671Y;
        c13256b.m14855K0();
    }

    public final String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.f32671Y + ')';
    }
}
