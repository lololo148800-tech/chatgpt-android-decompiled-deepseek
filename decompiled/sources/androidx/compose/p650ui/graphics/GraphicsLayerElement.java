package androidx.compose.p650ui.graphics;

import com.google.protobuf.AbstractC12107L1;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p635a1.AbstractC10458p;
import p749fd.C13628m;
import p774h1.AbstractC14334L;
import p774h1.C14340S;
import p774h1.C14343V;
import p774h1.C14365u;
import p774h1.InterfaceC14339Q;
import p775h2.AbstractC14376f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Lz1/S;", "Lh1/S;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class GraphicsLayerElement extends AbstractC21672S {

    /* JADX INFO: renamed from: A0 */
    public final long f32704A0;

    /* JADX INFO: renamed from: B0 */
    public final int f32705B0;

    /* JADX INFO: renamed from: Y */
    public final float f32706Y;

    /* JADX INFO: renamed from: Z */
    public final float f32707Z;

    /* JADX INFO: renamed from: o0 */
    public final float f32708o0;

    /* JADX INFO: renamed from: p0 */
    public final float f32709p0;

    /* JADX INFO: renamed from: q0 */
    public final float f32710q0;

    /* JADX INFO: renamed from: r0 */
    public final float f32711r0;

    /* JADX INFO: renamed from: s0 */
    public final float f32712s0;

    /* JADX INFO: renamed from: t0 */
    public final float f32713t0;

    /* JADX INFO: renamed from: u0 */
    public final float f32714u0;

    /* JADX INFO: renamed from: v0 */
    public final float f32715v0;

    /* JADX INFO: renamed from: w0 */
    public final long f32716w0;

    /* JADX INFO: renamed from: x0 */
    public final InterfaceC14339Q f32717x0;

    /* JADX INFO: renamed from: y0 */
    public final boolean f32718y0;

    /* JADX INFO: renamed from: z0 */
    public final long f32719z0;

    public GraphicsLayerElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, InterfaceC14339Q interfaceC14339Q, boolean z6, long j11, long j12, int i10) {
        this.f32706Y = f10;
        this.f32707Z = f11;
        this.f32708o0 = f12;
        this.f32709p0 = f13;
        this.f32710q0 = f14;
        this.f32711r0 = f15;
        this.f32712s0 = f16;
        this.f32713t0 = f17;
        this.f32714u0 = f18;
        this.f32715v0 = f19;
        this.f32716w0 = j10;
        this.f32717x0 = interfaceC14339Q;
        this.f32718y0 = z6;
        this.f32719z0 = j11;
        this.f32704A0 = j12;
        this.f32705B0 = i10;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C14340S c14340s = new C14340S();
        c14340s.f45020z0 = this.f32706Y;
        c14340s.f45004A0 = this.f32707Z;
        c14340s.f45005B0 = this.f32708o0;
        c14340s.f45006C0 = this.f32709p0;
        c14340s.f45007D0 = this.f32710q0;
        c14340s.f45008E0 = this.f32711r0;
        c14340s.f45009F0 = this.f32712s0;
        c14340s.f45010G0 = this.f32713t0;
        c14340s.f45011H0 = this.f32714u0;
        c14340s.f45012I0 = this.f32715v0;
        c14340s.f45013J0 = this.f32716w0;
        c14340s.f45014K0 = this.f32717x0;
        c14340s.f45015L0 = this.f32718y0;
        c14340s.f45016M0 = this.f32719z0;
        c14340s.f45017N0 = this.f32704A0;
        c14340s.f45018O0 = this.f32705B0;
        c14340s.f45019P0 = new C13628m(c14340s, 13);
        return c14340s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f32706Y, graphicsLayerElement.f32706Y) == 0 && Float.compare(this.f32707Z, graphicsLayerElement.f32707Z) == 0 && Float.compare(this.f32708o0, graphicsLayerElement.f32708o0) == 0 && Float.compare(this.f32709p0, graphicsLayerElement.f32709p0) == 0 && Float.compare(this.f32710q0, graphicsLayerElement.f32710q0) == 0 && Float.compare(this.f32711r0, graphicsLayerElement.f32711r0) == 0 && Float.compare(this.f32712s0, graphicsLayerElement.f32712s0) == 0 && Float.compare(this.f32713t0, graphicsLayerElement.f32713t0) == 0 && Float.compare(this.f32714u0, graphicsLayerElement.f32714u0) == 0 && Float.compare(this.f32715v0, graphicsLayerElement.f32715v0) == 0 && C14343V.m15667a(this.f32716w0, graphicsLayerElement.f32716w0) && AbstractC16544l.m18089b(this.f32717x0, graphicsLayerElement.f32717x0) && this.f32718y0 == graphicsLayerElement.f32718y0 && AbstractC16544l.m18089b(null, null) && C14365u.m15775c(this.f32719z0, graphicsLayerElement.f32719z0) && C14365u.m15775c(this.f32704A0, graphicsLayerElement.f32704A0) && AbstractC14334L.m15640r(this.f32705B0, graphicsLayerElement.f32705B0);
    }

    public final int hashCode() {
        int iM13819j = AbstractC12107L1.m13819j(this.f32715v0, AbstractC12107L1.m13819j(this.f32714u0, AbstractC12107L1.m13819j(this.f32713t0, AbstractC12107L1.m13819j(this.f32712s0, AbstractC12107L1.m13819j(this.f32711r0, AbstractC12107L1.m13819j(this.f32710q0, AbstractC12107L1.m13819j(this.f32709p0, AbstractC12107L1.m13819j(this.f32708o0, AbstractC12107L1.m13819j(this.f32707Z, Float.floatToIntBits(this.f32706Y) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i10 = C14343V.f45024c;
        long j10 = this.f32716w0;
        int iHashCode = (((this.f32717x0.hashCode() + ((((int) (j10 ^ (j10 >>> 32))) + iM13819j) * 31)) * 31) + (this.f32718y0 ? 1231 : 1237)) * 961;
        int i11 = C14365u.f45061k;
        return AbstractC14376f.m15857w(this.f32704A0, AbstractC14376f.m15857w(this.f32719z0, iHashCode, 31), 31) + this.f32705B0;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C14340S c14340s = (C14340S) abstractC10458p;
        c14340s.f45020z0 = this.f32706Y;
        c14340s.f45004A0 = this.f32707Z;
        c14340s.f45005B0 = this.f32708o0;
        c14340s.f45006C0 = this.f32709p0;
        c14340s.f45007D0 = this.f32710q0;
        c14340s.f45008E0 = this.f32711r0;
        c14340s.f45009F0 = this.f32712s0;
        c14340s.f45010G0 = this.f32713t0;
        c14340s.f45011H0 = this.f32714u0;
        c14340s.f45012I0 = this.f32715v0;
        c14340s.f45013J0 = this.f32716w0;
        c14340s.f45014K0 = this.f32717x0;
        c14340s.f45015L0 = this.f32718y0;
        c14340s.f45016M0 = this.f32719z0;
        c14340s.f45017N0 = this.f32704A0;
        c14340s.f45018O0 = this.f32705B0;
        AbstractC21678Y abstractC21678Y = AbstractC21690f.m22215t(c14340s, 2).f68820y0;
        if (abstractC21678Y != null) {
            abstractC21678Y.m22179e1(c14340s.f45019P0, true);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb2.append(this.f32706Y);
        sb2.append(", scaleY=");
        sb2.append(this.f32707Z);
        sb2.append(", alpha=");
        sb2.append(this.f32708o0);
        sb2.append(", translationX=");
        sb2.append(this.f32709p0);
        sb2.append(", translationY=");
        sb2.append(this.f32710q0);
        sb2.append(", shadowElevation=");
        sb2.append(this.f32711r0);
        sb2.append(", rotationX=");
        sb2.append(this.f32712s0);
        sb2.append(", rotationY=");
        sb2.append(this.f32713t0);
        sb2.append(", rotationZ=");
        sb2.append(this.f32714u0);
        sb2.append(", cameraDistance=");
        sb2.append(this.f32715v0);
        sb2.append(", transformOrigin=");
        sb2.append((Object) C14343V.m15670d(this.f32716w0));
        sb2.append(", shape=");
        sb2.append(this.f32717x0);
        sb2.append(", clip=");
        sb2.append(this.f32718y0);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        AbstractC12107L1.m13828s(this.f32719z0, ", spotShadowColor=", sb2);
        sb2.append((Object) C14365u.m15781i(this.f32704A0));
        sb2.append(", compositingStrategy=");
        sb2.append((Object) ("CompositingStrategy(value=" + this.f32705B0 + ')'));
        sb2.append(')');
        return sb2.toString();
    }
}
