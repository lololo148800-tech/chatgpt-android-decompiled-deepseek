package p817j$.util.stream;

import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.G1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15779G1 extends AbstractC16012y0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f49072h;

    public /* synthetic */ C15779G1(int i10) {
        this.f49072h = i10;
    }

    @Override // p817j$.util.stream.AbstractC16012y0
    /* JADX INFO: renamed from: e0 */
    public final InterfaceC15848U1 mo17357e0() {
        switch (this.f49072h) {
            case 0:
                return new C15868Y1();
            case 1:
                return new C15858W1();
            case 2:
                return new C15873Z1();
            default:
                return new C15863X1();
        }
    }

    @Override // p817j$.util.stream.AbstractC16012y0, p817j$.util.stream.InterfaceC15806L3
    /* JADX INFO: renamed from: b */
    public final Object mo17373b(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        switch (this.f49072h) {
            case 0:
                if (EnumC15904e3.SIZED.m17475r(abstractC15882b.m17449J())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.mo17373b(abstractC15882b, spliterator);
            case 1:
                if (EnumC15904e3.SIZED.m17475r(abstractC15882b.m17449J())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.mo17373b(abstractC15882b, spliterator);
            case 2:
                if (EnumC15904e3.SIZED.m17475r(abstractC15882b.m17449J())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.mo17373b(abstractC15882b, spliterator);
            default:
                if (EnumC15904e3.SIZED.m17475r(abstractC15882b.m17449J())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.mo17373b(abstractC15882b, spliterator);
        }
    }

    @Override // p817j$.util.stream.AbstractC16012y0, p817j$.util.stream.InterfaceC15806L3
    /* JADX INFO: renamed from: c */
    public final Object mo17374c(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        switch (this.f49072h) {
            case 0:
                if (EnumC15904e3.SIZED.m17475r(abstractC15882b.m17449J())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.mo17374c(abstractC15882b, spliterator);
            case 1:
                if (EnumC15904e3.SIZED.m17475r(abstractC15882b.m17449J())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.mo17374c(abstractC15882b, spliterator);
            case 2:
                if (EnumC15904e3.SIZED.m17475r(abstractC15882b.m17449J())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.mo17374c(abstractC15882b, spliterator);
            default:
                if (EnumC15904e3.SIZED.m17475r(abstractC15882b.m17449J())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.mo17374c(abstractC15882b, spliterator);
        }
    }

    @Override // p817j$.util.stream.AbstractC16012y0, p817j$.util.stream.InterfaceC15806L3
    /* JADX INFO: renamed from: d */
    public final int mo17375d() {
        switch (this.f49072h) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return EnumC15904e3.f49277r;
    }
}
