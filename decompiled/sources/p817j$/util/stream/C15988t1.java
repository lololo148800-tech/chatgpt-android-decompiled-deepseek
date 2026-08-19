package p817j$.util.stream;

import java.util.function.IntConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.t1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15988t1 extends AbstractC16003w1 implements InterfaceC15951m2 {

    /* JADX INFO: renamed from: h */
    private final int[] f49403h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m17405p(Object obj) {
        mo17413m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC15529a.m16738b(this, intConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15951m2
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void mo17413m(Integer num) {
        AbstractC16012y0.m17557g(this, num);
    }

    C15988t1(Spliterator spliterator, AbstractC15882b abstractC15882b, int[] iArr) {
        super(spliterator, abstractC15882b, iArr.length);
        this.f49403h = iArr;
    }

    C15988t1(C15988t1 c15988t1, Spliterator spliterator, long j10, long j11) {
        super(c15988t1, spliterator, j10, j11, c15988t1.f49403h.length);
        this.f49403h = c15988t1.f49403h;
    }

    @Override // p817j$.util.stream.AbstractC16003w1
    /* JADX INFO: renamed from: b */
    final AbstractC16003w1 mo17515b(Spliterator spliterator, long j10, long j11) {
        return new C15988t1(this, spliterator, j10, j11);
    }

    @Override // p817j$.util.stream.AbstractC16003w1, p817j$.util.stream.InterfaceC15963o2
    public final void accept(int i10) {
        int i11 = this.f49433f;
        if (i11 >= this.f49434g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f49433f));
        }
        int[] iArr = this.f49403h;
        this.f49433f = i11 + 1;
        iArr[i11] = i10;
    }
}
