package p817j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.M0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15808M0 implements InterfaceC15798K0 {

    /* JADX INFO: renamed from: a */
    protected final InterfaceC15798K0 f49118a;

    /* JADX INFO: renamed from: b */
    protected final InterfaceC15798K0 f49119b;

    /* JADX INFO: renamed from: c */
    private final long f49120c;

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: q */
    public final int mo17409q() {
        return 2;
    }

    AbstractC15808M0(InterfaceC15798K0 interfaceC15798K0, InterfaceC15798K0 interfaceC15798K1) {
        this.f49118a = interfaceC15798K0;
        this.f49119b = interfaceC15798K1;
        this.f49120c = interfaceC15798K0.count() + interfaceC15798K1.count();
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: b */
    public final InterfaceC15798K0 mo17396b(int i10) {
        if (i10 == 0) {
            return this.f49118a;
        }
        if (i10 == 1) {
            return this.f49119b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    public final long count() {
        return this.f49120c;
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ InterfaceC15793J0 mo17396b(int i10) {
        return (InterfaceC15793J0) mo17396b(i10);
    }
}
