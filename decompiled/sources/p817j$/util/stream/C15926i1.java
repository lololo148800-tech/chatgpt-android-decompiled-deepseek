package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Spliterator;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.i1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15926i1 extends C15849U2 implements InterfaceC15778G0, InterfaceC15748A0 {
    @Override // p817j$.util.stream.InterfaceC15748A0, p817j$.util.stream.InterfaceC15758C0
    /* JADX INFO: renamed from: a */
    public final InterfaceC15778G0 mo17356a() {
        return this;
    }

    @Override // p817j$.util.stream.InterfaceC15758C0
    /* JADX INFO: renamed from: a */
    public final InterfaceC15798K0 mo17356a() {
        return this;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final /* synthetic */ void accept(double d10) {
        AbstractC16012y0.m17549a();
        throw null;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2, p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j10) {
        AbstractC16012y0.m17562l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m17405p(Object obj) {
        mo17413m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC15798K0 mo17406h(long j10, long j11, IntFunction intFunction) {
        return AbstractC16012y0.m17571u(this, j10, j11);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final void mo17363k() {
    }

    @Override // p817j$.util.stream.InterfaceC15951m2
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void mo17413m(Integer num) {
        AbstractC16012y0.m17557g(this, num);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean mo17358n() {
        return false;
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object[] mo17408o(IntFunction intFunction) {
        return AbstractC16012y0.m17563m(this, intFunction);
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int mo17409q() {
        return 0;
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ InterfaceC15798K0 mo17396b(int i10) {
        mo17396b(i10);
        throw null;
    }

    @Override // p817j$.util.stream.InterfaceC15793J0, p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: b */
    public final InterfaceC15793J0 mo17396b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void mo17407i(Object[] objArr, int i10) {
        AbstractC16012y0.m17565o(this, (Integer[]) objArr, i10);
    }

    @Override // p817j$.util.stream.AbstractC15869Y2, p817j$.util.stream.InterfaceC15793J0
    /* JADX INFO: renamed from: e */
    public final void mo17399e(Object obj) {
        super.mo17399e((IntConsumer) obj);
    }

    @Override // p817j$.util.stream.AbstractC15869Y2, p817j$.util.stream.InterfaceC15793J0
    /* JADX INFO: renamed from: r */
    public final void mo17400r(int i10, Object obj) {
        super.mo17400r(i10, (int[]) obj);
    }

    @Override // p817j$.util.stream.C15849U2, p817j$.util.stream.AbstractC15869Y2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // p817j$.util.stream.C15849U2, p817j$.util.stream.AbstractC15869Y2, java.lang.Iterable
    public final InterfaceC15709d0 spliterator() {
        return super.spliterator();
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        clear();
        m17437v(j10);
    }

    @Override // p817j$.util.stream.AbstractC15869Y2, p817j$.util.stream.InterfaceC15793J0
    /* JADX INFO: renamed from: d */
    public final Object mo17398d() {
        return (int[]) super.mo17398d();
    }
}
