package p817j$.util.stream;

import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.b0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15883b0 extends AbstractC15889c0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f49237l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC15883b0(AbstractC15882b abstractC15882b, int i10, int i11) {
        super(abstractC15882b, i10);
        this.f49237l = i11;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: P */
    final boolean mo17440P() {
        switch (this.f49237l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final InterfaceC15918h unordered() {
        switch (this.f49237l) {
            case 0:
                return !m17450K() ? this : new C15991u(this, EnumC15904e3.f49277r, 2);
            default:
                return !m17450K() ? this : new C15991u(this, EnumC15904e3.f49277r, 2);
        }
    }

    @Override // p817j$.util.stream.AbstractC15882b, p817j$.util.stream.InterfaceC15918h
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        switch (this.f49237l) {
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
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        switch (this.f49237l) {
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
        switch (this.f49237l) {
            case 0:
                break;
        }
        return spliterator();
    }
}
