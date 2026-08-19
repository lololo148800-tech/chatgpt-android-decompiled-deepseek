package androidx.compose.foundation.selection;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1426a;
import p1029u0.C20091b;
import p1140z1.AbstractC21672S;
import p1140z1.AbstractC21690f;
import p156G1.C2960g;
import p635a1.AbstractC10458p;
import p773h0.InterfaceC14274b0;
import p894n0.InterfaceC17406l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/selection/SelectableElement;", "Lz1/S;", "Lu0/b;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class SelectableElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final boolean f32549Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC17406l f32550Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC14274b0 f32551o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f32552p0;

    /* JADX INFO: renamed from: q0 */
    public final C2960g f32553q0;

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC1426a f32554r0;

    public SelectableElement(boolean z6, InterfaceC17406l interfaceC17406l, InterfaceC14274b0 interfaceC14274b0, boolean z10, C2960g c2960g, InterfaceC1426a interfaceC1426a) {
        this.f32549Y = z6;
        this.f32550Z = interfaceC17406l;
        this.f32551o0 = interfaceC14274b0;
        this.f32552p0 = z10;
        this.f32553q0 = c2960g;
        this.f32554r0 = interfaceC1426a;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C20091b c20091b = new C20091b(this.f32550Z, this.f32551o0, this.f32552p0, null, this.f32553q0, this.f32554r0);
        c20091b.f63617T0 = this.f32549Y;
        return c20091b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.f32549Y == selectableElement.f32549Y && AbstractC16544l.m18089b(this.f32550Z, selectableElement.f32550Z) && AbstractC16544l.m18089b(this.f32551o0, selectableElement.f32551o0) && this.f32552p0 == selectableElement.f32552p0 && AbstractC16544l.m18089b(this.f32553q0, selectableElement.f32553q0) && this.f32554r0 == selectableElement.f32554r0;
    }

    public final int hashCode() {
        int i10 = (this.f32549Y ? 1231 : 1237) * 31;
        InterfaceC17406l interfaceC17406l = this.f32550Z;
        int iHashCode = (i10 + (interfaceC17406l != null ? interfaceC17406l.hashCode() : 0)) * 31;
        InterfaceC14274b0 interfaceC14274b0 = this.f32551o0;
        int iHashCode2 = (((iHashCode + (interfaceC14274b0 != null ? interfaceC14274b0.hashCode() : 0)) * 31) + (this.f32552p0 ? 1231 : 1237)) * 31;
        C2960g c2960g = this.f32553q0;
        return this.f32554r0.hashCode() + ((iHashCode2 + (c2960g != null ? c2960g.f8849a : 0)) * 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C20091b c20091b = (C20091b) abstractC10458p;
        boolean z6 = c20091b.f63617T0;
        boolean z10 = this.f32549Y;
        if (z6 != z10) {
            c20091b.f63617T0 = z10;
            AbstractC21690f.m22211p(c20091b);
        }
        c20091b.m15575R0(this.f32550Z, this.f32551o0, this.f32552p0, null, this.f32553q0, this.f32554r0);
    }
}
