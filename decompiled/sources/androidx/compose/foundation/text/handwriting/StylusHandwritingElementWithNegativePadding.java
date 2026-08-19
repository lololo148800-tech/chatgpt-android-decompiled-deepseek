package androidx.compose.foundation.text.handwriting;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1426a;
import p1094x0.C21045d;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/text/handwriting/StylusHandwritingElementWithNegativePadding;", "Lz1/S;", "Lx0/d;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class StylusHandwritingElementWithNegativePadding extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC1426a f32580Y;

    public StylusHandwritingElementWithNegativePadding(InterfaceC1426a interfaceC1426a) {
        this.f32580Y = interfaceC1426a;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new C21045d(this.f32580Y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElementWithNegativePadding) && AbstractC16544l.m18089b(this.f32580Y, ((StylusHandwritingElementWithNegativePadding) obj).f32580Y);
    }

    public final int hashCode() {
        return this.f32580Y.hashCode();
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        ((C21045d) abstractC10458p).f66930B0 = this.f32580Y;
    }

    public final String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.f32580Y + ')';
    }
}
