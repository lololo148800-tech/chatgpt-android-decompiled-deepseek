package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p228J.AbstractC3794B0;
import p635a1.AbstractC10458p;
import p773h0.C14318x0;
import p773h0.C14322z0;
import p860l0.InterfaceC16661B0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/ScrollSemanticsElement;", "Lz1/S;", "Lh0/x0;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class ScrollSemanticsElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C14322z0 f32413Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f32414Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC16661B0 f32415o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f32416p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f32417q0;

    public ScrollSemanticsElement(C14322z0 c14322z0, boolean z6, InterfaceC16661B0 interfaceC16661B0, boolean z10, boolean z11) {
        this.f32413Y = c14322z0;
        this.f32414Z = z6;
        this.f32415o0 = interfaceC16661B0;
        this.f32416p0 = z10;
        this.f32417q0 = z11;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C14318x0 c14318x0 = new C14318x0();
        c14318x0.f44944z0 = this.f32413Y;
        c14318x0.f44942A0 = this.f32414Z;
        c14318x0.f44943B0 = this.f32417q0;
        return c14318x0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollSemanticsElement)) {
            return false;
        }
        ScrollSemanticsElement scrollSemanticsElement = (ScrollSemanticsElement) obj;
        return AbstractC16544l.m18089b(this.f32413Y, scrollSemanticsElement.f32413Y) && this.f32414Z == scrollSemanticsElement.f32414Z && AbstractC16544l.m18089b(this.f32415o0, scrollSemanticsElement.f32415o0) && this.f32416p0 == scrollSemanticsElement.f32416p0 && this.f32417q0 == scrollSemanticsElement.f32417q0;
    }

    public final int hashCode() {
        int iHashCode = ((this.f32413Y.hashCode() * 31) + (this.f32414Z ? 1231 : 1237)) * 31;
        InterfaceC16661B0 interfaceC16661B0 = this.f32415o0;
        return ((((iHashCode + (interfaceC16661B0 == null ? 0 : interfaceC16661B0.hashCode())) * 31) + (this.f32416p0 ? 1231 : 1237)) * 31) + (this.f32417q0 ? 1231 : 1237);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C14318x0 c14318x0 = (C14318x0) abstractC10458p;
        c14318x0.f44944z0 = this.f32413Y;
        c14318x0.f44942A0 = this.f32414Z;
        c14318x0.f44943B0 = this.f32417q0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScrollSemanticsElement(state=");
        sb2.append(this.f32413Y);
        sb2.append(", reverseScrolling=");
        sb2.append(this.f32414Z);
        sb2.append(", flingBehavior=");
        sb2.append(this.f32415o0);
        sb2.append(", isScrollable=");
        sb2.append(this.f32416p0);
        sb2.append(", isVertical=");
        return AbstractC3794B0.m4499x(sb2, this.f32417q0, ')');
    }
}
