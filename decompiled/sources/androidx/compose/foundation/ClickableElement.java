package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1426a;
import p1140z1.AbstractC21672S;
import p156G1.C2960g;
import p635a1.AbstractC10458p;
import p773h0.C14315w;
import p773h0.InterfaceC14274b0;
import p894n0.InterfaceC17406l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/ClickableElement;", "Lz1/S;", "Lh0/w;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ClickableElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC17406l f32384Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC14274b0 f32385Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f32386o0;

    /* JADX INFO: renamed from: p0 */
    public final String f32387p0;

    /* JADX INFO: renamed from: q0 */
    public final C2960g f32388q0;

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC1426a f32389r0;

    public ClickableElement(InterfaceC17406l interfaceC17406l, InterfaceC14274b0 interfaceC14274b0, boolean z6, String str, C2960g c2960g, InterfaceC1426a interfaceC1426a) {
        this.f32384Y = interfaceC17406l;
        this.f32385Z = interfaceC14274b0;
        this.f32386o0 = z6;
        this.f32387p0 = str;
        this.f32388q0 = c2960g;
        this.f32389r0 = interfaceC1426a;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new C14315w(this.f32384Y, this.f32385Z, this.f32386o0, this.f32387p0, this.f32388q0, this.f32389r0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return AbstractC16544l.m18089b(this.f32384Y, clickableElement.f32384Y) && AbstractC16544l.m18089b(this.f32385Z, clickableElement.f32385Z) && this.f32386o0 == clickableElement.f32386o0 && AbstractC16544l.m18089b(this.f32387p0, clickableElement.f32387p0) && AbstractC16544l.m18089b(this.f32388q0, clickableElement.f32388q0) && this.f32389r0 == clickableElement.f32389r0;
    }

    public final int hashCode() {
        InterfaceC17406l interfaceC17406l = this.f32384Y;
        int iHashCode = (interfaceC17406l != null ? interfaceC17406l.hashCode() : 0) * 31;
        InterfaceC14274b0 interfaceC14274b0 = this.f32385Z;
        int iHashCode2 = (((iHashCode + (interfaceC14274b0 != null ? interfaceC14274b0.hashCode() : 0)) * 31) + (this.f32386o0 ? 1231 : 1237)) * 31;
        String str = this.f32387p0;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        C2960g c2960g = this.f32388q0;
        return this.f32389r0.hashCode() + ((iHashCode3 + (c2960g != null ? c2960g.f8849a : 0)) * 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        ((C14315w) abstractC10458p).m15575R0(this.f32384Y, this.f32385Z, this.f32386o0, this.f32387p0, this.f32388q0, this.f32389r0);
    }
}
