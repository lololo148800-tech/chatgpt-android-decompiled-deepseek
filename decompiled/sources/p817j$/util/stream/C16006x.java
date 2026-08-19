package p817j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.x */
/* JADX INFO: loaded from: classes4.dex */
final class C16006x extends AbstractC16016z {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f49437m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16006x(AbstractC15882b abstractC15882b, int i10, int i11) {
        super(abstractC15882b, i10, 1);
        this.f49437m = i11;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: Q */
    final InterfaceC15963o2 mo17378Q(int i10, InterfaceC15963o2 interfaceC15963o2) {
        switch (this.f49437m) {
            case 0:
                return interfaceC15963o2;
            case 1:
                return new C15976r(this, interfaceC15963o2, 4);
            case 2:
                return new C15866Y(1, interfaceC15963o2);
            case 3:
                return new C15856W(this, interfaceC15963o2, 4);
            case 4:
                return new C15907f0(interfaceC15963o2);
            default:
                return new C15901e0(this, interfaceC15963o2, 3);
        }
    }
}
