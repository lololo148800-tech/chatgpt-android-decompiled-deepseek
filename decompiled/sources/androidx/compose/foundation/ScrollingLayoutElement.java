package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p773h0.C14246A0;
import p773h0.C14322z0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Lz1/S;", "Lh0/A0;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ScrollingLayoutElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C14322z0 f32418Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f32419Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f32420o0;

    public ScrollingLayoutElement(C14322z0 c14322z0, boolean z6, boolean z10) {
        this.f32418Y = c14322z0;
        this.f32419Z = z6;
        this.f32420o0 = z10;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C14246A0 c14246a0 = new C14246A0();
        c14246a0.f44708z0 = this.f32418Y;
        c14246a0.f44706A0 = this.f32419Z;
        c14246a0.f44707B0 = this.f32420o0;
        return c14246a0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return AbstractC16544l.m18089b(this.f32418Y, scrollingLayoutElement.f32418Y) && this.f32419Z == scrollingLayoutElement.f32419Z && this.f32420o0 == scrollingLayoutElement.f32420o0;
    }

    public final int hashCode() {
        return (((this.f32418Y.hashCode() * 31) + (this.f32419Z ? 1231 : 1237)) * 31) + (this.f32420o0 ? 1231 : 1237);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C14246A0 c14246a0 = (C14246A0) abstractC10458p;
        c14246a0.f44708z0 = this.f32418Y;
        c14246a0.f44706A0 = this.f32419Z;
        c14246a0.f44707B0 = this.f32420o0;
    }
}
