package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p1140z1.AbstractC21690f;
import p635a1.AbstractC10458p;
import p773h0.InterfaceC14300o0;
import p860l0.C16672F;
import p860l0.C16725b;
import p860l0.C16733d1;
import p860l0.C16757l1;
import p860l0.EnumC16673F0;
import p860l0.InterfaceC16661B0;
import p860l0.InterfaceC16736e1;
import p860l0.InterfaceC16794y;
import p894n0.InterfaceC17406l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "Lz1/S;", "Ll0/d1;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ScrollableElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC16736e1 f32460Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC16673F0 f32461Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC14300o0 f32462o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f32463p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f32464q0;

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC16661B0 f32465r0;

    /* JADX INFO: renamed from: s0 */
    public final InterfaceC17406l f32466s0;

    /* JADX INFO: renamed from: t0 */
    public final InterfaceC16794y f32467t0;

    public ScrollableElement(InterfaceC14300o0 interfaceC14300o0, InterfaceC16794y interfaceC16794y, InterfaceC16661B0 interfaceC16661B0, EnumC16673F0 enumC16673F0, InterfaceC16736e1 interfaceC16736e1, InterfaceC17406l interfaceC17406l, boolean z6, boolean z10) {
        this.f32460Y = interfaceC16736e1;
        this.f32461Z = enumC16673F0;
        this.f32462o0 = interfaceC14300o0;
        this.f32463p0 = z6;
        this.f32464q0 = z10;
        this.f32465r0 = interfaceC16661B0;
        this.f32466s0 = interfaceC17406l;
        this.f32467t0 = interfaceC16794y;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        InterfaceC17406l interfaceC17406l = this.f32466s0;
        return new C16733d1(this.f32462o0, this.f32467t0, this.f32465r0, this.f32461Z, this.f32460Y, interfaceC17406l, this.f32463p0, this.f32464q0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return AbstractC16544l.m18089b(this.f32460Y, scrollableElement.f32460Y) && this.f32461Z == scrollableElement.f32461Z && AbstractC16544l.m18089b(this.f32462o0, scrollableElement.f32462o0) && this.f32463p0 == scrollableElement.f32463p0 && this.f32464q0 == scrollableElement.f32464q0 && AbstractC16544l.m18089b(this.f32465r0, scrollableElement.f32465r0) && AbstractC16544l.m18089b(this.f32466s0, scrollableElement.f32466s0) && AbstractC16544l.m18089b(this.f32467t0, scrollableElement.f32467t0);
    }

    public final int hashCode() {
        int iHashCode = (this.f32461Z.hashCode() + (this.f32460Y.hashCode() * 31)) * 31;
        InterfaceC14300o0 interfaceC14300o0 = this.f32462o0;
        int iHashCode2 = (((((iHashCode + (interfaceC14300o0 != null ? interfaceC14300o0.hashCode() : 0)) * 31) + (this.f32463p0 ? 1231 : 1237)) * 31) + (this.f32464q0 ? 1231 : 1237)) * 31;
        InterfaceC16661B0 interfaceC16661B0 = this.f32465r0;
        int iHashCode3 = (iHashCode2 + (interfaceC16661B0 != null ? interfaceC16661B0.hashCode() : 0)) * 31;
        InterfaceC17406l interfaceC17406l = this.f32466s0;
        int iHashCode4 = (iHashCode3 + (interfaceC17406l != null ? interfaceC17406l.hashCode() : 0)) * 31;
        InterfaceC16794y interfaceC16794y = this.f32467t0;
        return iHashCode4 + (interfaceC16794y != null ? interfaceC16794y.hashCode() : 0);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        boolean z6;
        boolean z10;
        C16733d1 c16733d1 = (C16733d1) abstractC10458p;
        boolean z11 = c16733d1.f53841D0;
        boolean z12 = this.f32463p0;
        boolean z13 = false;
        if (z11 != z12) {
            c16733d1.f53651P0.f53535Z = z12;
            c16733d1.f53648M0.f53506z0 = z12;
            z6 = true;
        } else {
            z6 = false;
        }
        InterfaceC16661B0 interfaceC16661B0 = this.f32465r0;
        InterfaceC16661B0 interfaceC16661B1 = interfaceC16661B0 == null ? c16733d1.f53649N0 : interfaceC16661B0;
        C16757l1 c16757l1 = c16733d1.f53650O0;
        InterfaceC16736e1 interfaceC16736e1 = c16757l1.f53757a;
        InterfaceC16736e1 interfaceC16736e2 = this.f32460Y;
        if (!AbstractC16544l.m18089b(interfaceC16736e1, interfaceC16736e2)) {
            c16757l1.f53757a = interfaceC16736e2;
            z13 = true;
        }
        InterfaceC14300o0 interfaceC14300o0 = this.f32462o0;
        c16757l1.f53758b = interfaceC14300o0;
        EnumC16673F0 enumC16673F0 = c16757l1.f53760d;
        EnumC16673F0 enumC16673F1 = this.f32461Z;
        if (enumC16673F0 != enumC16673F1) {
            c16757l1.f53760d = enumC16673F1;
            z13 = true;
        }
        boolean z14 = c16757l1.f53761e;
        boolean z15 = this.f32464q0;
        if (z14 != z15) {
            c16757l1.f53761e = z15;
            z10 = true;
        } else {
            z10 = z13;
        }
        c16757l1.f53759c = interfaceC16661B1;
        c16757l1.f53762f = c16733d1.f53647L0;
        C16672F c16672f = c16733d1.f53652Q0;
        c16672f.f53400z0 = enumC16673F1;
        c16672f.f53392B0 = z15;
        c16672f.f53393C0 = this.f32467t0;
        c16733d1.f53645J0 = interfaceC14300o0;
        c16733d1.f53646K0 = interfaceC16661B0;
        C16725b c16725b = C16725b.f53602u0;
        EnumC16673F0 enumC16673F2 = c16757l1.f53760d;
        EnumC16673F0 enumC16673F3 = EnumC16673F0.f53401Y;
        c16733d1.m18543V0(c16725b, z12, this.f32466s0, enumC16673F2 == enumC16673F3 ? enumC16673F3 : EnumC16673F0.f53402Z, z10);
        if (z6) {
            c16733d1.f53654S0 = null;
            c16733d1.f53655T0 = null;
            AbstractC21690f.m22211p(c16733d1);
        }
    }
}
