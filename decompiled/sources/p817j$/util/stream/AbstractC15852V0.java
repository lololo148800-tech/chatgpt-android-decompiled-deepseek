package p817j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.V0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15852V0 extends AbstractC15808M0 implements InterfaceC15793J0 {
    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object[] mo17408o(IntFunction intFunction) {
        return AbstractC16012y0.m17563m(this, intFunction);
    }

    @Override // p817j$.util.stream.InterfaceC15793J0
    /* JADX INFO: renamed from: e */
    public final void mo17399e(Object obj) {
        ((InterfaceC15793J0) this.f49118a).mo17399e(obj);
        ((InterfaceC15793J0) this.f49119b).mo17399e(obj);
    }

    @Override // p817j$.util.stream.InterfaceC15793J0
    /* JADX INFO: renamed from: r */
    public final void mo17400r(int i10, Object obj) {
        InterfaceC15798K0 interfaceC15798K0 = this.f49118a;
        ((InterfaceC15793J0) interfaceC15798K0).mo17400r(i10, obj);
        ((InterfaceC15793J0) this.f49119b).mo17400r(i10 + ((int) ((InterfaceC15793J0) interfaceC15798K0).count()), obj);
    }

    @Override // p817j$.util.stream.InterfaceC15793J0
    /* JADX INFO: renamed from: d */
    public final Object mo17398d() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objMo17397c = mo17397c((int) jCount);
        mo17400r(0, objMo17397c);
        return objMo17397c;
    }

    public final String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f49118a, this.f49119b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }
}
