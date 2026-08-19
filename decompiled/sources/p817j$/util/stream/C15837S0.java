package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.S0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15837S0 extends AbstractC15852V0 implements InterfaceC15768E0 {
    @Override // p817j$.util.stream.InterfaceC15798K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC16012y0.m17567q(this, consumer);
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC15798K0 mo17406h(long j10, long j11, IntFunction intFunction) {
        return AbstractC16012y0.m17570t(this, j10, j11);
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void mo17407i(Object[] objArr, int i10) {
        AbstractC16012y0.m17564n(this, (Double[]) objArr, i10);
    }

    @Override // p817j$.util.stream.InterfaceC15793J0
    /* JADX INFO: renamed from: c */
    public final Object mo17397c(int i10) {
        return new double[i10];
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    public final Spliterator spliterator() {
        return new C15932j1(this);
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    public final InterfaceC15709d0 spliterator() {
        return new C15932j1(this);
    }
}
