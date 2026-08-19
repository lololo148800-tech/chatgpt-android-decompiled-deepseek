package p817j$.util.stream;

import java.util.function.IntFunction;
import p817j$.util.InterfaceC15672X;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.s2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15984s2 extends AbstractC15883b0 {

    /* JADX INFO: renamed from: m */
    final /* synthetic */ long f49399m;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ long f49400n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C15984s2(AbstractC15889c0 abstractC15889c0, int i10, long j10, long j11) {
        super(abstractC15889c0, i10, 0);
        this.f49399m = j10;
        this.f49400n = j11;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: O */
    final Spliterator mo17415O(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        long j10;
        long j11;
        long jM17447F = abstractC15882b.m17447F(spliterator);
        long j12 = this.f49400n;
        if (jM17447F > 0 && spliterator.hasCharacteristics(16384)) {
            InterfaceC15672X interfaceC15672X = (InterfaceC15672X) abstractC15882b.m17455W(spliterator);
            long j13 = this.f49399m;
            return new C16005w3(interfaceC15672X, j13, AbstractC16012y0.m17524B(j13, j12));
        }
        if (EnumC15904e3.ORDERED.m17475r(abstractC15882b.m17449J())) {
            return ((InterfaceC15798K0) new C16014y2(this, abstractC15882b, spliterator, new C15851V(22), this.f49399m, this.f49400n).invoke()).spliterator();
        }
        InterfaceC15672X interfaceC15672X2 = (InterfaceC15672X) abstractC15882b.m17455W(spliterator);
        long j14 = this.f49399m;
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
        return new C15761C3(interfaceC15672X2, j11, j10);
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: N */
    final InterfaceC15798K0 mo17377N(AbstractC15882b abstractC15882b, Spliterator spliterator, IntFunction intFunction) {
        long jMin;
        long j10;
        long jM17447F = abstractC15882b.m17447F(spliterator);
        if (jM17447F > 0 && spliterator.hasCharacteristics(16384)) {
            return AbstractC16012y0.m17529G(abstractC15882b, AbstractC16012y0.m17525C(abstractC15882b.m17448I(), spliterator, this.f49399m, this.f49400n), true);
        }
        if (!EnumC15904e3.ORDERED.m17475r(abstractC15882b.m17449J())) {
            InterfaceC15672X interfaceC15672X = (InterfaceC15672X) abstractC15882b.m17455W(spliterator);
            long j11 = this.f49399m;
            long j12 = this.f49400n;
            if (j11 <= jM17447F) {
                jMin = j12 >= 0 ? Math.min(j12, jM17447F - j11) : jM17447F - j11;
                j10 = 0;
            } else {
                jMin = j12;
                j10 = j11;
            }
            return AbstractC16012y0.m17529G(this, new C15761C3(interfaceC15672X, j10, jMin), true);
        }
        return (InterfaceC15798K0) new C16014y2(this, abstractC15882b, spliterator, intFunction, this.f49399m, this.f49400n).invoke();
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: Q */
    final InterfaceC15963o2 mo17378Q(int i10, InterfaceC15963o2 interfaceC15963o2) {
        return new C15979r2(this, interfaceC15963o2);
    }
}
