package p817j$.util.stream;

import java.util.function.LongConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.u1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15993u1 extends AbstractC16003w1 implements InterfaceC15957n2 {

    /* JADX INFO: renamed from: h */
    private final long[] f49412h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m17405p(Object obj) {
        mo17362j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC15529a.m16739c(this, longConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15957n2
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo17362j(Long l4) {
        AbstractC16012y0.m17559i(this, l4);
    }

    C15993u1(Spliterator spliterator, AbstractC15882b abstractC15882b, long[] jArr) {
        super(spliterator, abstractC15882b, jArr.length);
        this.f49412h = jArr;
    }

    C15993u1(C15993u1 c15993u1, Spliterator spliterator, long j10, long j11) {
        super(c15993u1, spliterator, j10, j11, c15993u1.f49412h.length);
        this.f49412h = c15993u1.f49412h;
    }

    @Override // p817j$.util.stream.AbstractC16003w1
    /* JADX INFO: renamed from: b */
    final AbstractC16003w1 mo17515b(Spliterator spliterator, long j10, long j11) {
        return new C15993u1(this, spliterator, j10, j11);
    }

    @Override // p817j$.util.stream.AbstractC16003w1, p817j$.util.stream.InterfaceC15963o2, p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public final void accept(long j10) {
        int i10 = this.f49433f;
        if (i10 >= this.f49434g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f49433f));
        }
        long[] jArr = this.f49412h;
        this.f49433f = i10 + 1;
        jArr[i10] = j10;
    }
}
