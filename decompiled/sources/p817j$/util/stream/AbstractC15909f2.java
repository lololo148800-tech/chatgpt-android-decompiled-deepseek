package p817j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.f2 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15909f2 extends AbstractC15915g2 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f49288l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC15909f2(AbstractC15882b abstractC15882b, int i10, int i11) {
        super(abstractC15882b, i10);
        this.f49288l = i11;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: P */
    final boolean mo17440P() {
        switch (this.f49288l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final InterfaceC15918h unordered() {
        switch (this.f49288l) {
            case 0:
                return !m17450K() ? this : new C15897d2(this, EnumC15904e3.f49277r, 1);
            default:
                return !m17450K() ? this : new C15897d2(this, EnumC15904e3.f49277r, 1);
        }
    }
}
