package androidx.compose.p650ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p1140z1.AbstractC21672S;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p635a1.AbstractC10458p;
import p774h1.C14359o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;", "Lz1/S;", "Lh1/o;", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class BlockGraphicsLayerElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC1436k f32703Y;

    public BlockGraphicsLayerElement(InterfaceC1436k interfaceC1436k) {
        this.f32703Y = interfaceC1436k;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new C14359o(this.f32703Y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && AbstractC16544l.m18089b(this.f32703Y, ((BlockGraphicsLayerElement) obj).f32703Y);
    }

    public final int hashCode() {
        return this.f32703Y.hashCode();
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C14359o c14359o = (C14359o) abstractC10458p;
        c14359o.f45048z0 = this.f32703Y;
        AbstractC21678Y abstractC21678Y = AbstractC21690f.m22215t(c14359o, 2).f68820y0;
        if (abstractC21678Y != null) {
            abstractC21678Y.m22179e1(c14359o.f45048z0, true);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f32703Y + ')';
    }
}
