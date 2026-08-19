package androidx.compose.p650ui.draw;

import af.C10564U;
import com.google.protobuf.AbstractC12107L1;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17321x;
import p1140z1.AbstractC21672S;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p492U1.C7540e;
import p635a1.AbstractC10458p;
import p774h1.C14359o;
import p774h1.C14365u;
import p774h1.InterfaceC14339Q;
import p775h2.AbstractC14376f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Lz1/S;", "Lh1/o;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class ShadowGraphicsLayerElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final float f32683Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC14339Q f32684Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f32685o0;

    /* JADX INFO: renamed from: p0 */
    public final long f32686p0;

    /* JADX INFO: renamed from: q0 */
    public final long f32687q0;

    public ShadowGraphicsLayerElement(float f10, InterfaceC14339Q interfaceC14339Q, boolean z6, long j10, long j11) {
        this.f32683Y = f10;
        this.f32684Z = interfaceC14339Q;
        this.f32685o0 = z6;
        this.f32686p0 = j10;
        this.f32687q0 = j11;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new C14359o(new C10564U(this, 23));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return C7540e.m7873a(this.f32683Y, shadowGraphicsLayerElement.f32683Y) && AbstractC16544l.m18089b(this.f32684Z, shadowGraphicsLayerElement.f32684Z) && this.f32685o0 == shadowGraphicsLayerElement.f32685o0 && C14365u.m15775c(this.f32686p0, shadowGraphicsLayerElement.f32686p0) && C14365u.m15775c(this.f32687q0, shadowGraphicsLayerElement.f32687q0);
    }

    public final int hashCode() {
        int iHashCode = (((this.f32684Z.hashCode() + (Float.floatToIntBits(this.f32683Y) * 31)) * 31) + (this.f32685o0 ? 1231 : 1237)) * 31;
        int i10 = C14365u.f45061k;
        return C17321x.m18981a(this.f32687q0) + AbstractC14376f.m15857w(this.f32686p0, iHashCode, 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C14359o c14359o = (C14359o) abstractC10458p;
        c14359o.f45048z0 = new C10564U(this, 23);
        AbstractC21678Y abstractC21678Y = AbstractC21690f.m22215t(c14359o, 2).f68820y0;
        if (abstractC21678Y != null) {
            abstractC21678Y.m22179e1(c14359o.f45048z0, true);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb2.append((Object) C7540e.m7874b(this.f32683Y));
        sb2.append(", shape=");
        sb2.append(this.f32684Z);
        sb2.append(", clip=");
        sb2.append(this.f32685o0);
        sb2.append(", ambientColor=");
        AbstractC12107L1.m13828s(this.f32686p0, ", spotColor=", sb2);
        sb2.append((Object) C14365u.m15781i(this.f32687q0));
        sb2.append(')');
        return sb2.toString();
    }
}
