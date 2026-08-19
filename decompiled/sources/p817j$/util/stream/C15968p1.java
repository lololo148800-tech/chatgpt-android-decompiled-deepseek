package p817j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Spliterator;
import p817j$.util.Spliterators;

/* JADX INFO: renamed from: j$.util.stream.p1 */
/* JADX INFO: loaded from: classes4.dex */
class C15968p1 implements InterfaceC15788I0 {

    /* JADX INFO: renamed from: a */
    final long[] f49376a;

    /* JADX INFO: renamed from: b */
    int f49377b;

    @Override // p817j$.util.stream.InterfaceC15798K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC16012y0.m17569s(this, consumer);
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC15798K0 mo17406h(long j10, long j11, IntFunction intFunction) {
        return AbstractC16012y0.m17572v(this, j10, j11);
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
        AbstractC16012y0.m17566p(this, (Long[]) objArr, i10);
    }

    @Override // p817j$.util.stream.InterfaceC15793J0
    /* JADX INFO: renamed from: e */
    public final void mo17399e(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i10 = 0; i10 < this.f49377b; i10++) {
            longConsumer.accept(this.f49376a[i10]);
        }
    }

    @Override // p817j$.util.stream.InterfaceC15793J0
    /* JADX INFO: renamed from: r */
    public final void mo17400r(int i10, Object obj) {
        int i11 = this.f49377b;
        System.arraycopy(this.f49376a, 0, (long[]) obj, i10, i11);
    }

    C15968p1(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f49376a = new long[(int) j10];
        this.f49377b = 0;
    }

    C15968p1(long[] jArr) {
        this.f49376a = jArr;
        this.f49377b = jArr.length;
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    public final Spliterator spliterator() {
        return Spliterators.m17284l(this.f49376a, 0, this.f49377b);
    }

    @Override // p817j$.util.stream.InterfaceC15793J0, p817j$.util.stream.InterfaceC15798K0
    public final InterfaceC15709d0 spliterator() {
        return Spliterators.m17284l(this.f49376a, 0, this.f49377b);
    }

    @Override // p817j$.util.stream.InterfaceC15793J0
    /* JADX INFO: renamed from: d */
    public final Object mo17398d() {
        long[] jArr = this.f49376a;
        int length = jArr.length;
        int i10 = this.f49377b;
        return length == i10 ? jArr : Arrays.copyOf(jArr, i10);
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    public final long count() {
        return this.f49377b;
    }

    public String toString() {
        long[] jArr = this.f49376a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f49377b), Arrays.toString(jArr));
    }
}
