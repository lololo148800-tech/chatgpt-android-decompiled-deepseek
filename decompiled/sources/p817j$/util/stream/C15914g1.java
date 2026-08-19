package p817j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Spliterator;
import p817j$.util.Spliterators;

/* JADX INFO: renamed from: j$.util.stream.g1 */
/* JADX INFO: loaded from: classes4.dex */
class C15914g1 implements InterfaceC15778G0 {

    /* JADX INFO: renamed from: a */
    final int[] f49294a;

    /* JADX INFO: renamed from: b */
    int f49295b;

    @Override // p817j$.util.stream.InterfaceC15798K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC16012y0.m17568r(this, consumer);
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC15798K0 mo17406h(long j10, long j11, IntFunction intFunction) {
        return AbstractC16012y0.m17571u(this, j10, j11);
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

    @Override // p817j$.util.stream.InterfaceC15793J0
    /* JADX INFO: renamed from: e */
    public final void mo17399e(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i10 = 0; i10 < this.f49295b; i10++) {
            intConsumer.accept(this.f49294a[i10]);
        }
    }

    @Override // p817j$.util.stream.InterfaceC15793J0
    /* JADX INFO: renamed from: r */
    public final void mo17400r(int i10, Object obj) {
        int i11 = this.f49295b;
        System.arraycopy(this.f49294a, 0, (int[]) obj, i10, i11);
    }

    C15914g1(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f49294a = new int[(int) j10];
        this.f49295b = 0;
    }

    C15914g1(int[] iArr) {
        this.f49294a = iArr;
        this.f49295b = iArr.length;
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    public final Spliterator spliterator() {
        return Spliterators.m17283k(this.f49294a, 0, this.f49295b);
    }

    @Override // p817j$.util.stream.InterfaceC15793J0, p817j$.util.stream.InterfaceC15798K0
    public final InterfaceC15709d0 spliterator() {
        return Spliterators.m17283k(this.f49294a, 0, this.f49295b);
    }

    @Override // p817j$.util.stream.InterfaceC15793J0
    /* JADX INFO: renamed from: d */
    public final Object mo17398d() {
        int[] iArr = this.f49294a;
        int length = iArr.length;
        int i10 = this.f49295b;
        return length == i10 ? iArr : Arrays.copyOf(iArr, i10);
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    public final long count() {
        return this.f49295b;
    }

    public String toString() {
        int[] iArr = this.f49294a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f49295b), Arrays.toString(iArr));
    }
}
