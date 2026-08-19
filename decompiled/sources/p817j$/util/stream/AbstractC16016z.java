package p817j$.util.stream;

import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.z */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC16016z extends AbstractC15747A {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f49453l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC16016z(AbstractC15882b abstractC15882b, int i10, int i11) {
        super(abstractC15882b, i10);
        this.f49453l = i11;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: P */
    final boolean mo17440P() {
        switch (this.f49453l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final InterfaceC15918h unordered() {
        switch (this.f49453l) {
            case 0:
                return !m17450K() ? this : new C16006x(this, EnumC15904e3.f49277r, 0);
            default:
                return !m17450K() ? this : new C16006x(this, EnumC15904e3.f49277r, 0);
        }
    }

    @Override // p817j$.util.stream.AbstractC15882b, p817j$.util.stream.InterfaceC15918h
    public final /* bridge */ /* synthetic */ InterfaceC15762D parallel() {
        switch (this.f49453l) {
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
    public final /* bridge */ /* synthetic */ InterfaceC15762D sequential() {
        switch (this.f49453l) {
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
        switch (this.f49453l) {
            case 0:
                break;
        }
        return spliterator();
    }
}
