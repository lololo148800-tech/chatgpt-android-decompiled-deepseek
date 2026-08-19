package p817j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Spliterator;
import p817j$.util.Spliterators;

/* JADX INFO: renamed from: j$.util.stream.X0 */
/* JADX INFO: loaded from: classes4.dex */
class C15862X0 implements InterfaceC15768E0 {

    /* JADX INFO: renamed from: a */
    final double[] f49204a;

    /* JADX INFO: renamed from: b */
    int f49205b;

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
        AbstractC16012y0.m17564n(this, (Double[]) objArr, i10);
    }

    @Override // p817j$.util.stream.InterfaceC15793J0
    /* JADX INFO: renamed from: e */
    public final void mo17399e(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i10 = 0; i10 < this.f49205b; i10++) {
            doubleConsumer.accept(this.f49204a[i10]);
        }
    }

    @Override // p817j$.util.stream.InterfaceC15793J0
    /* JADX INFO: renamed from: r */
    public final void mo17400r(int i10, Object obj) {
        int i11 = this.f49205b;
        System.arraycopy(this.f49204a, 0, (double[]) obj, i10, i11);
    }

    C15862X0(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f49204a = new double[(int) j10];
        this.f49205b = 0;
    }

    C15862X0(double[] dArr) {
        this.f49204a = dArr;
        this.f49205b = dArr.length;
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    public final Spliterator spliterator() {
        return Spliterators.m17282j(this.f49204a, 0, this.f49205b);
    }

    @Override // p817j$.util.stream.InterfaceC15793J0, p817j$.util.stream.InterfaceC15798K0
    public final InterfaceC15709d0 spliterator() {
        return Spliterators.m17282j(this.f49204a, 0, this.f49205b);
    }

    @Override // p817j$.util.stream.InterfaceC15793J0
    /* JADX INFO: renamed from: d */
    public final Object mo17398d() {
        double[] dArr = this.f49204a;
        int length = dArr.length;
        int i10 = this.f49205b;
        return length == i10 ? dArr : Arrays.copyOf(dArr, i10);
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    public final long count() {
        return this.f49205b;
    }

    public String toString() {
        double[] dArr = this.f49204a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f49205b), Arrays.toString(dArr));
    }
}
