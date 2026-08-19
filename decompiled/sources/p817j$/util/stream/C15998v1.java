package p817j$.util.stream;

import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.v1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15998v1 extends AbstractC16003w1 {

    /* JADX INFO: renamed from: h */
    private final Object[] f49419h;

    C15998v1(Spliterator spliterator, AbstractC15882b abstractC15882b, Object[] objArr) {
        super(spliterator, abstractC15882b, objArr.length);
        this.f49419h = objArr;
    }

    C15998v1(C15998v1 c15998v1, Spliterator spliterator, long j10, long j11) {
        super(c15998v1, spliterator, j10, j11, c15998v1.f49419h.length);
        this.f49419h = c15998v1.f49419h;
    }

    @Override // p817j$.util.stream.AbstractC16003w1
    /* JADX INFO: renamed from: b */
    final AbstractC16003w1 mo17515b(Spliterator spliterator, long j10, long j11) {
        return new C15998v1(this, spliterator, j10, j11);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f49433f;
        if (i10 >= this.f49434g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f49433f));
        }
        Object[] objArr = this.f49419h;
        this.f49433f = i10 + 1;
        objArr[i10] = obj;
    }
}
