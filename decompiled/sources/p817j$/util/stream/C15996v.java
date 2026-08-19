package p817j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.v */
/* JADX INFO: loaded from: classes4.dex */
final class C15996v extends AbstractC15931j0 {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f49415m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15996v(AbstractC15882b abstractC15882b, int i10, int i11) {
        super(abstractC15882b, i10, 1);
        this.f49415m = i11;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: Q */
    final InterfaceC15963o2 mo17378Q(int i10, InterfaceC15963o2 interfaceC15963o2) {
        switch (this.f49415m) {
            case 0:
                return new C15976r(this, interfaceC15963o2, 3);
            case 1:
                return new C15866Y(0, interfaceC15963o2);
            case 2:
                return new C15856W(this, interfaceC15963o2, 3);
            case 3:
                return new C15901e0(this, interfaceC15963o2, 1);
            case 4:
                return interfaceC15963o2;
            default:
                return new C15901e0(this, interfaceC15963o2, 4);
        }
    }
}
