package androidx.compose.p650ui.draw;

import com.google.protobuf.AbstractC12107L1;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1095x1.InterfaceC21090k;
import p1140z1.AbstractC21672S;
import p1140z1.AbstractC21690f;
import p635a1.AbstractC10458p;
import p635a1.InterfaceC10446d;
import p759g1.C13803e;
import p774h1.C14356l;
import p882m1.AbstractC17140a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18067d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Lz1/S;", "Landroidx/compose/ui/draw/PainterNode;", "Lm1/a;", "painter", "Lm1/a;", "getPainter", "()Lm1/a;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class PainterElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final boolean f32673Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC10446d f32674Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC21090k f32675o0;

    /* JADX INFO: renamed from: p0 */
    public final float f32676p0;
    private final AbstractC17140a painter;

    /* JADX INFO: renamed from: q0 */
    public final C14356l f32677q0;

    public PainterElement(AbstractC17140a abstractC17140a, boolean z6, InterfaceC10446d interfaceC10446d, InterfaceC21090k interfaceC21090k, float f10, C14356l c14356l) {
        this.painter = abstractC17140a;
        this.f32673Y = z6;
        this.f32674Z = interfaceC10446d;
        this.f32675o0 = interfaceC21090k;
        this.f32676p0 = f10;
        this.f32677q0 = c14356l;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new PainterNode(this.painter, this.f32673Y, this.f32674Z, this.f32675o0, this.f32676p0, this.f32677q0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return AbstractC16544l.m18089b(this.painter, painterElement.painter) && this.f32673Y == painterElement.f32673Y && AbstractC16544l.m18089b(this.f32674Z, painterElement.f32674Z) && AbstractC16544l.m18089b(this.f32675o0, painterElement.f32675o0) && Float.compare(this.f32676p0, painterElement.f32676p0) == 0 && AbstractC16544l.m18089b(this.f32677q0, painterElement.f32677q0);
    }

    public final int hashCode() {
        int iM13819j = AbstractC12107L1.m13819j(this.f32676p0, (this.f32675o0.hashCode() + ((this.f32674Z.hashCode() + (((this.painter.hashCode() * 31) + (this.f32673Y ? 1231 : 1237)) * 31)) * 31)) * 31, 31);
        C14356l c14356l = this.f32677q0;
        return iM13819j + (c14356l == null ? 0 : c14356l.hashCode());
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        PainterNode painterNode = (PainterNode) abstractC10458p;
        boolean z6 = painterNode.f32682z0;
        boolean z10 = this.f32673Y;
        boolean z11 = z6 != z10 || (z10 && !C13803e.m15330b(painterNode.getPainter().getF38830r0(), this.painter.getF38830r0()));
        painterNode.m11294P0(this.painter);
        painterNode.f32682z0 = z10;
        painterNode.f32678A0 = this.f32674Z;
        painterNode.f32679B0 = this.f32675o0;
        painterNode.f32680C0 = this.f32676p0;
        painterNode.f32681D0 = this.f32677q0;
        if (z11) {
            AbstractC21690f.m22210o(painterNode);
        }
        AbstractC21690f.m22209n(painterNode);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=" + this.f32673Y + ", alignment=" + this.f32674Z + ", contentScale=" + this.f32675o0 + ", alpha=" + this.f32676p0 + ", colorFilter=" + this.f32677q0 + ')';
    }
}
