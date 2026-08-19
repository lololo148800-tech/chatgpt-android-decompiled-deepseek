package androidx.compose.foundation.selection;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p1029u0.C20092c;
import p1140z1.AbstractC21672S;
import p1140z1.AbstractC21690f;
import p156G1.C2960g;
import p635a1.AbstractC10458p;
import p894n0.InterfaceC17406l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/selection/ToggleableElement;", "Lz1/S;", "Lu0/c;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ToggleableElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final boolean f32555Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC17406l f32556Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f32557o0;

    /* JADX INFO: renamed from: p0 */
    public final C2960g f32558p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC1436k f32559q0;

    public ToggleableElement(boolean z6, InterfaceC17406l interfaceC17406l, boolean z10, C2960g c2960g, InterfaceC1436k interfaceC1436k) {
        this.f32555Y = z6;
        this.f32556Z = interfaceC17406l;
        this.f32557o0 = z10;
        this.f32558p0 = c2960g;
        this.f32559q0 = interfaceC1436k;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C2960g c2960g = this.f32558p0;
        return new C20092c(this.f32555Y, this.f32556Z, this.f32557o0, c2960g, this.f32559q0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.f32555Y == toggleableElement.f32555Y && AbstractC16544l.m18089b(this.f32556Z, toggleableElement.f32556Z) && AbstractC16544l.m18089b(null, null) && this.f32557o0 == toggleableElement.f32557o0 && this.f32558p0.equals(toggleableElement.f32558p0) && this.f32559q0 == toggleableElement.f32559q0;
    }

    public final int hashCode() {
        int i10 = (this.f32555Y ? 1231 : 1237) * 31;
        InterfaceC17406l interfaceC17406l = this.f32556Z;
        return this.f32559q0.hashCode() + ((((((i10 + (interfaceC17406l != null ? interfaceC17406l.hashCode() : 0)) * 961) + (this.f32557o0 ? 1231 : 1237)) * 31) + this.f32558p0.f8849a) * 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C20092c c20092c = (C20092c) abstractC10458p;
        boolean z6 = c20092c.f63618T0;
        boolean z10 = this.f32555Y;
        if (z6 != z10) {
            c20092c.f63618T0 = z10;
            AbstractC21690f.m22211p(c20092c);
        }
        c20092c.f63619U0 = this.f32559q0;
        c20092c.m15575R0(this.f32556Z, null, this.f32557o0, null, this.f32558p0, c20092c.f63620V0);
    }
}
