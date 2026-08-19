package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Spliterator;
import p817j$.util.Spliterators;

/* JADX INFO: renamed from: j$.util.stream.a1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15878a1 extends AbstractC15902e1 implements InterfaceC15768E0 {
    @Override // p817j$.util.stream.InterfaceC15798K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC16012y0.m17567q(this, consumer);
    }

    @Override // p817j$.util.stream.AbstractC15902e1, p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC15798K0 mo17406h(long j10, long j11, IntFunction intFunction) {
        return AbstractC16012y0.m17570t(this, j10, j11);
    }

    @Override // p817j$.util.stream.AbstractC15902e1, p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ InterfaceC15798K0 mo17396b(int i10) {
        mo17396b(i10);
        throw null;
    }

    @Override // p817j$.util.stream.AbstractC15902e1, p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: b */
    public final InterfaceC15793J0 mo17396b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void mo17407i(Object[] objArr, int i10) {
        AbstractC16012y0.m17564n(this, (Double[]) objArr, i10);
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    public final Spliterator spliterator() {
        return Spliterators.m17274b();
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    public final InterfaceC15709d0 spliterator() {
        return Spliterators.m17274b();
    }

    @Override // p817j$.util.stream.InterfaceC15793J0
    /* JADX INFO: renamed from: d */
    public final Object mo17398d() {
        return AbstractC16012y0.f49446g;
    }
}
