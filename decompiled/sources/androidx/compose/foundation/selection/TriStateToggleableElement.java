package androidx.compose.foundation.selection;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1426a;
import p1029u0.C20093d;
import p1140z1.AbstractC21672S;
import p1140z1.AbstractC21690f;
import p156G1.C2960g;
import p180H1.EnumC3197a;
import p635a1.AbstractC10458p;
import p773h0.InterfaceC14274b0;
import p894n0.InterfaceC17406l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/selection/TriStateToggleableElement;", "Lz1/S;", "Lu0/d;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class TriStateToggleableElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final EnumC3197a f32560Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC17406l f32561Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC14274b0 f32562o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f32563p0;

    /* JADX INFO: renamed from: q0 */
    public final C2960g f32564q0;

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC1426a f32565r0;

    public TriStateToggleableElement(EnumC3197a enumC3197a, InterfaceC17406l interfaceC17406l, InterfaceC14274b0 interfaceC14274b0, boolean z6, C2960g c2960g, InterfaceC1426a interfaceC1426a) {
        this.f32560Y = enumC3197a;
        this.f32561Z = interfaceC17406l;
        this.f32562o0 = interfaceC14274b0;
        this.f32563p0 = z6;
        this.f32564q0 = c2960g;
        this.f32565r0 = interfaceC1426a;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C2960g c2960g = this.f32564q0;
        C20093d c20093d = new C20093d(this.f32561Z, this.f32562o0, this.f32563p0, null, c2960g, this.f32565r0);
        c20093d.f63621T0 = this.f32560Y;
        return c20093d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.f32560Y == triStateToggleableElement.f32560Y && AbstractC16544l.m18089b(this.f32561Z, triStateToggleableElement.f32561Z) && AbstractC16544l.m18089b(this.f32562o0, triStateToggleableElement.f32562o0) && this.f32563p0 == triStateToggleableElement.f32563p0 && AbstractC16544l.m18089b(this.f32564q0, triStateToggleableElement.f32564q0) && this.f32565r0 == triStateToggleableElement.f32565r0;
    }

    public final int hashCode() {
        int iHashCode = this.f32560Y.hashCode() * 31;
        InterfaceC17406l interfaceC17406l = this.f32561Z;
        int iHashCode2 = (iHashCode + (interfaceC17406l != null ? interfaceC17406l.hashCode() : 0)) * 31;
        InterfaceC14274b0 interfaceC14274b0 = this.f32562o0;
        return this.f32565r0.hashCode() + ((((((iHashCode2 + (interfaceC14274b0 != null ? interfaceC14274b0.hashCode() : 0)) * 31) + (this.f32563p0 ? 1231 : 1237)) * 31) + this.f32564q0.f8849a) * 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C20093d c20093d = (C20093d) abstractC10458p;
        EnumC3197a enumC3197a = c20093d.f63621T0;
        EnumC3197a enumC3197a2 = this.f32560Y;
        if (enumC3197a != enumC3197a2) {
            c20093d.f63621T0 = enumC3197a2;
            AbstractC21690f.m22211p(c20093d);
        }
        C2960g c2960g = this.f32564q0;
        c20093d.m15575R0(this.f32561Z, this.f32562o0, this.f32563p0, null, c2960g, this.f32565r0);
    }
}
