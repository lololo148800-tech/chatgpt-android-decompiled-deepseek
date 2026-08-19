package p817j$.util.stream;

import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.j0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15931j0 extends AbstractC15937k0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f49324l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC15931j0(AbstractC15882b abstractC15882b, int i10, int i11) {
        super(abstractC15882b, i10);
        this.f49324l = i11;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: P */
    final boolean mo17440P() {
        switch (this.f49324l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final InterfaceC15918h unordered() {
        switch (this.f49324l) {
            case 0:
                return !m17450K() ? this : new C15996v(this, EnumC15904e3.f49277r, 4);
            default:
                return !m17450K() ? this : new C15996v(this, EnumC15904e3.f49277r, 4);
        }
    }

    @Override // p817j$.util.stream.AbstractC15882b, p817j$.util.stream.InterfaceC15918h
    public final /* bridge */ /* synthetic */ InterfaceC15955n0 parallel() {
        switch (this.f49324l) {
            case 0:
                parallel();
                break;
            default:
                parallel();
                break;
        }
        return this;
    }

    @Override // p817j$.util.stream.AbstractC15882b, p817j$.util.stream.InterfaceC15918h
    public final /* bridge */ /* synthetic */ InterfaceC15955n0 sequential() {
        switch (this.f49324l) {
            case 0:
                sequential();
                break;
            default:
                sequential();
                break;
        }
        return this;
    }

    @Override // p817j$.util.stream.AbstractC15882b, p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        switch (this.f49324l) {
            case 0:
                break;
        }
        return spliterator();
    }
}
