package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import p817j$.util.Objects;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.W0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15857W0 extends AbstractC15808M0 {
    @Override // p817j$.util.stream.InterfaceC15798K0
    public final Spliterator spliterator() {
        return new C15956n1(this);
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: i */
    public final void mo17407i(Object[] objArr, int i10) {
        Objects.requireNonNull(objArr);
        InterfaceC15798K0 interfaceC15798K0 = this.f49118a;
        interfaceC15798K0.mo17407i(objArr, i10);
        this.f49119b.mo17407i(objArr, i10 + ((int) interfaceC15798K0.count()));
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: o */
    public final Object[] mo17408o(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        mo17407i(objArr, 0);
        return objArr;
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    public final void forEach(Consumer consumer) {
        this.f49118a.forEach(consumer);
        this.f49119b.forEach(consumer);
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: h */
    public final InterfaceC15798K0 mo17406h(long j10, long j11, IntFunction intFunction) {
        if (j10 == 0 && j11 == count()) {
            return this;
        }
        long jCount = this.f49118a.count();
        if (j10 >= jCount) {
            return this.f49119b.mo17406h(j10 - jCount, j11 - jCount, intFunction);
        }
        if (j11 > jCount) {
            return AbstractC16012y0.m17531I(EnumC15910f3.REFERENCE, this.f49118a.mo17406h(j10, jCount, intFunction), this.f49119b.mo17406h(0L, j11 - jCount, intFunction));
        }
        return this.f49118a.mo17406h(j10, j11, intFunction);
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.f49118a, this.f49119b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
