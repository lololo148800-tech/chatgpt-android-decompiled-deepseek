package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1426a;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p736f0.C13466D;
import p736f0.C13467E;
import p736f0.C13468F;
import p736f0.C13505w;
import p758g0.C13761f0;
import p758g0.C13771k0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "Lz1/S;", "Lf0/D;", "animation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class EnterExitTransitionElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C13771k0 f32366Y;

    /* JADX INFO: renamed from: Z */
    public final C13761f0 f32367Z;

    /* JADX INFO: renamed from: o0 */
    public final C13761f0 f32368o0;

    /* JADX INFO: renamed from: p0 */
    public final C13761f0 f32369p0;

    /* JADX INFO: renamed from: q0 */
    public final C13467E f32370q0;

    /* JADX INFO: renamed from: r0 */
    public final C13468F f32371r0;

    /* JADX INFO: renamed from: s0 */
    public final InterfaceC1426a f32372s0;

    /* JADX INFO: renamed from: t0 */
    public final C13505w f32373t0;

    public EnterExitTransitionElement(C13771k0 c13771k0, C13761f0 c13761f0, C13761f0 c13761f1, C13761f0 c13761f2, C13467E c13467e, C13468F c13468f, InterfaceC1426a interfaceC1426a, C13505w c13505w) {
        this.f32366Y = c13771k0;
        this.f32367Z = c13761f0;
        this.f32368o0 = c13761f1;
        this.f32369p0 = c13761f2;
        this.f32370q0 = c13467e;
        this.f32371r0 = c13468f;
        this.f32372s0 = interfaceC1426a;
        this.f32373t0 = c13505w;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new C13466D(this.f32366Y, this.f32367Z, this.f32368o0, this.f32369p0, this.f32370q0, this.f32371r0, this.f32372s0, this.f32373t0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return AbstractC16544l.m18089b(this.f32366Y, enterExitTransitionElement.f32366Y) && AbstractC16544l.m18089b(this.f32367Z, enterExitTransitionElement.f32367Z) && AbstractC16544l.m18089b(this.f32368o0, enterExitTransitionElement.f32368o0) && AbstractC16544l.m18089b(this.f32369p0, enterExitTransitionElement.f32369p0) && AbstractC16544l.m18089b(this.f32370q0, enterExitTransitionElement.f32370q0) && AbstractC16544l.m18089b(this.f32371r0, enterExitTransitionElement.f32371r0) && AbstractC16544l.m18089b(this.f32372s0, enterExitTransitionElement.f32372s0) && AbstractC16544l.m18089b(this.f32373t0, enterExitTransitionElement.f32373t0);
    }

    public final int hashCode() {
        int iHashCode = this.f32366Y.hashCode() * 31;
        C13761f0 c13761f0 = this.f32367Z;
        int iHashCode2 = (iHashCode + (c13761f0 == null ? 0 : c13761f0.hashCode())) * 31;
        C13761f0 c13761f1 = this.f32368o0;
        int iHashCode3 = (iHashCode2 + (c13761f1 == null ? 0 : c13761f1.hashCode())) * 31;
        C13761f0 c13761f2 = this.f32369p0;
        return this.f32373t0.hashCode() + ((this.f32372s0.hashCode() + ((this.f32371r0.f42625a.hashCode() + ((this.f32370q0.f42622a.hashCode() + ((iHashCode3 + (c13761f2 != null ? c13761f2.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C13466D c13466d = (C13466D) abstractC10458p;
        c13466d.f42609A0 = this.f32366Y;
        c13466d.f42610B0 = this.f32367Z;
        c13466d.f42611C0 = this.f32368o0;
        c13466d.f42612D0 = this.f32369p0;
        c13466d.f42613E0 = this.f32370q0;
        c13466d.f42614F0 = this.f32371r0;
        c13466d.f42615G0 = this.f32372s0;
        c13466d.f42616H0 = this.f32373t0;
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f32366Y + ", sizeAnimation=" + this.f32367Z + ", offsetAnimation=" + this.f32368o0 + ", slideAnimation=" + this.f32369p0 + ", enter=" + this.f32370q0 + ", exit=" + this.f32371r0 + ", isEnabled=" + this.f32372s0 + ", graphicsLayerBlock=" + this.f32373t0 + ')';
    }
}
