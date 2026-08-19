package coil3.compose.internal;

import coil3.compose.AsyncImagePainter;
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
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18067d2 = {"Lcoil3/compose/internal/ContentPainterElement;", "Lz1/S;", "Lcoil3/compose/internal/ContentPainterNode;", "Lm1/a;", "painter", "Lm1/a;", "coil-compose-core_release"}, m18068k = 1, m18069mv = {2, 0, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class ContentPainterElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC10446d f35919Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC21090k f35920Z;

    /* JADX INFO: renamed from: o0 */
    public final float f35921o0;

    /* JADX INFO: renamed from: p0 */
    public final C14356l f35922p0;
    private final AbstractC17140a painter;

    public ContentPainterElement(AsyncImagePainter asyncImagePainter, InterfaceC10446d interfaceC10446d, InterfaceC21090k interfaceC21090k, float f10, C14356l c14356l) {
        this.painter = asyncImagePainter;
        this.f35919Y = interfaceC10446d;
        this.f35920Z = interfaceC21090k;
        this.f35921o0 = f10;
        this.f35922p0 = c14356l;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new ContentPainterNode(this.painter, this.f35919Y, this.f35920Z, this.f35921o0, this.f35922p0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return AbstractC16544l.m18089b(this.painter, contentPainterElement.painter) && AbstractC16544l.m18089b(this.f35919Y, contentPainterElement.f35919Y) && AbstractC16544l.m18089b(this.f35920Z, contentPainterElement.f35920Z) && Float.compare(this.f35921o0, contentPainterElement.f35921o0) == 0 && AbstractC16544l.m18089b(this.f35922p0, contentPainterElement.f35922p0);
    }

    public final int hashCode() {
        int iM13819j = AbstractC12107L1.m13819j(this.f35921o0, (this.f35920Z.hashCode() + ((this.f35919Y.hashCode() + (this.painter.hashCode() * 31)) * 31)) * 31, 31);
        C14356l c14356l = this.f35922p0;
        return iM13819j + (c14356l == null ? 0 : c14356l.hashCode());
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        ContentPainterNode contentPainterNode = (ContentPainterNode) abstractC10458p;
        boolean zM15330b = C13803e.m15330b(contentPainterNode.getPainter().getF38830r0(), this.painter.getF38830r0());
        contentPainterNode.m13140N0(this.painter);
        contentPainterNode.f35926z0 = this.f35919Y;
        contentPainterNode.f35923A0 = this.f35920Z;
        contentPainterNode.f35924B0 = this.f35921o0;
        contentPainterNode.f35925C0 = this.f35922p0;
        if (!zM15330b) {
            AbstractC21690f.m22210o(contentPainterNode);
        }
        AbstractC21690f.m22209n(contentPainterNode);
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.painter + ", alignment=" + this.f35919Y + ", contentScale=" + this.f35920Z + ", alpha=" + this.f35921o0 + ", colorFilter=" + this.f35922p0 + ')';
    }
}
