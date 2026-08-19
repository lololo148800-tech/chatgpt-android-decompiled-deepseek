package p817j$.util.stream;

import java.util.function.DoubleConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.s1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15983s1 extends AbstractC16003w1 implements InterfaceC15945l2 {

    /* JADX INFO: renamed from: h */
    private final double[] f49398h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m17405p(Object obj) {
        mo17372p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC15529a.m16737a(this, doubleConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15945l2
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void mo17372p(Double d10) {
        AbstractC16012y0.m17554e(this, d10);
    }

    C15983s1(Spliterator spliterator, AbstractC15882b abstractC15882b, double[] dArr) {
        super(spliterator, abstractC15882b, dArr.length);
        this.f49398h = dArr;
    }

    C15983s1(C15983s1 c15983s1, Spliterator spliterator, long j10, long j11) {
        super(c15983s1, spliterator, j10, j11, c15983s1.f49398h.length);
        this.f49398h = c15983s1.f49398h;
    }

    @Override // p817j$.util.stream.AbstractC16003w1
    /* JADX INFO: renamed from: b */
    final AbstractC16003w1 mo17515b(Spliterator spliterator, long j10, long j11) {
        return new C15983s1(this, spliterator, j10, j11);
    }

    @Override // p817j$.util.stream.AbstractC16003w1, p817j$.util.stream.InterfaceC15963o2
    public final void accept(double d10) {
        int i10 = this.f49433f;
        if (i10 >= this.f49434g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f49433f));
        }
        double[] dArr = this.f49398h;
        this.f49433f = i10 + 1;
        dArr[i10] = d10;
    }
}
