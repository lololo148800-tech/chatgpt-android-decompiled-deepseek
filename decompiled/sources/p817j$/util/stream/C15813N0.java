package p817j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import p817j$.util.Spliterator;
import p817j$.util.Spliterators;

/* JADX INFO: renamed from: j$.util.stream.N0 */
/* JADX INFO: loaded from: classes4.dex */
class C15813N0 implements InterfaceC15798K0 {

    /* JADX INFO: renamed from: a */
    final Object[] f49127a;

    /* JADX INFO: renamed from: b */
    int f49128b;

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC15798K0 mo17406h(long j10, long j11, IntFunction intFunction) {
        return AbstractC16012y0.m17573w(this, j10, j11, intFunction);
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int mo17409q() {
        return 0;
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: b */
    public final InterfaceC15798K0 mo17396b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    C15813N0(long j10, IntFunction intFunction) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f49127a = (Object[]) intFunction.apply((int) j10);
        this.f49128b = 0;
    }

    C15813N0(Object[] objArr) {
        this.f49127a = objArr;
        this.f49128b = objArr.length;
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    public final Spliterator spliterator() {
        return Spliterators.m17285m(this.f49127a, 0, this.f49128b);
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: i */
    public final void mo17407i(Object[] objArr, int i10) {
        System.arraycopy(this.f49127a, 0, objArr, i10, this.f49128b);
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    /* JADX INFO: renamed from: o */
    public final Object[] mo17408o(IntFunction intFunction) {
        Object[] objArr = this.f49127a;
        if (objArr.length == this.f49128b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    public final long count() {
        return this.f49128b;
    }

    @Override // p817j$.util.stream.InterfaceC15798K0
    public final void forEach(Consumer consumer) {
        for (int i10 = 0; i10 < this.f49128b; i10++) {
            consumer.m17405p(this.f49127a[i10]);
        }
    }

    public String toString() {
        Object[] objArr = this.f49127a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f49128b), Arrays.toString(objArr));
    }
}
