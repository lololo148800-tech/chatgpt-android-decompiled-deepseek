package p817j$.util.stream;

import java.util.function.IntFunction;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.q2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15974q2 extends AbstractC15909f2 {

    /* JADX INFO: renamed from: m */
    final /* synthetic */ long f49387m;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ long f49388n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C15974q2(AbstractC15915g2 abstractC15915g2, int i10, long j10, long j11) {
        super(abstractC15915g2, i10, 0);
        this.f49387m = j10;
        this.f49388n = j11;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: O */
    final Spliterator mo17415O(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        long j10;
        long j11;
        long jM17447F = abstractC15882b.m17447F(spliterator);
        long j12 = this.f49388n;
        if (jM17447F > 0 && spliterator.hasCharacteristics(16384)) {
            Spliterator spliteratorM17455W = abstractC15882b.m17455W(spliterator);
            long j13 = this.f49387m;
            return new C16020z3(spliteratorM17455W, j13, AbstractC16012y0.m17524B(j13, j12));
        }
        if (EnumC15904e3.ORDERED.m17475r(abstractC15882b.m17449J())) {
            return ((InterfaceC15798K0) new C16014y2(this, abstractC15882b, spliterator, new C15851V(20), this.f49387m, this.f49388n).invoke()).spliterator();
        }
        Spliterator spliteratorM17455W2 = abstractC15882b.m17455W(spliterator);
        long j14 = this.f49387m;
        if (j14 <= jM17447F) {
            long jMin = jM17447F - j14;
            if (j12 >= 0) {
                jMin = Math.min(j12, jMin);
            }
            j11 = 0;
            j10 = jMin;
        } else {
            j10 = j12;
            j11 = j14;
        }
        return new C15776F3(spliteratorM17455W2, j11, j10);
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: N */
    final InterfaceC15798K0 mo17377N(AbstractC15882b abstractC15882b, Spliterator spliterator, IntFunction intFunction) {
        long jMin;
        long j10;
        long jM17447F = abstractC15882b.m17447F(spliterator);
        if (jM17447F > 0 && spliterator.hasCharacteristics(16384)) {
            return AbstractC16012y0.m17527E(abstractC15882b, AbstractC16012y0.m17525C(abstractC15882b.m17448I(), spliterator, this.f49387m, this.f49388n), true, intFunction);
        }
        if (!EnumC15904e3.ORDERED.m17475r(abstractC15882b.m17449J())) {
            Spliterator spliteratorM17455W = abstractC15882b.m17455W(spliterator);
            long j11 = this.f49387m;
            long j12 = this.f49388n;
            if (j11 <= jM17447F) {
                jMin = j12 >= 0 ? Math.min(j12, jM17447F - j11) : jM17447F - j11;
                j10 = 0;
            } else {
                jMin = j12;
                j10 = j11;
            }
            return AbstractC16012y0.m17527E(this, new C15776F3(spliteratorM17455W, j10, jMin), true, intFunction);
        }
        return (InterfaceC15798K0) new C16014y2(this, abstractC15882b, spliterator, intFunction, this.f49387m, this.f49388n).invoke();
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: Q */
    final InterfaceC15963o2 mo17378Q(int i10, InterfaceC15963o2 interfaceC15963o2) {
        return new C15969p2(this, interfaceC15963o2);
    }
}
