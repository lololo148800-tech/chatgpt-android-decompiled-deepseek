package p817j$.util.stream;

import java.util.function.IntFunction;
import p817j$.util.InterfaceC15676a0;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.u2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15994u2 extends AbstractC15931j0 {

    /* JADX INFO: renamed from: m */
    final /* synthetic */ long f49413m;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ long f49414n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C15994u2(AbstractC15937k0 abstractC15937k0, int i10, long j10, long j11) {
        super(abstractC15937k0, i10, 0);
        this.f49413m = j10;
        this.f49414n = j11;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: O */
    final Spliterator mo17415O(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        long j10;
        long j11;
        long jM17447F = abstractC15882b.m17447F(spliterator);
        long j12 = this.f49414n;
        if (jM17447F > 0 && spliterator.hasCharacteristics(16384)) {
            InterfaceC15676a0 interfaceC15676a0 = (InterfaceC15676a0) abstractC15882b.m17455W(spliterator);
            long j13 = this.f49413m;
            return new C16010x3(interfaceC15676a0, j13, AbstractC16012y0.m17524B(j13, j12));
        }
        if (EnumC15904e3.ORDERED.m17475r(abstractC15882b.m17449J())) {
            return ((InterfaceC15798K0) new C16014y2(this, abstractC15882b, spliterator, new C15851V(23), this.f49413m, this.f49414n).invoke()).spliterator();
        }
        InterfaceC15676a0 interfaceC15676a1 = (InterfaceC15676a0) abstractC15882b.m17455W(spliterator);
        long j14 = this.f49413m;
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
        return new C15766D3(interfaceC15676a1, j11, j10);
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: N */
    final InterfaceC15798K0 mo17377N(AbstractC15882b abstractC15882b, Spliterator spliterator, IntFunction intFunction) {
        long jMin;
        long j10;
        long jM17447F = abstractC15882b.m17447F(spliterator);
        if (jM17447F > 0 && spliterator.hasCharacteristics(16384)) {
            return AbstractC16012y0.m17530H(abstractC15882b, AbstractC16012y0.m17525C(abstractC15882b.m17448I(), spliterator, this.f49413m, this.f49414n), true);
        }
        if (!EnumC15904e3.ORDERED.m17475r(abstractC15882b.m17449J())) {
            InterfaceC15676a0 interfaceC15676a0 = (InterfaceC15676a0) abstractC15882b.m17455W(spliterator);
            long j11 = this.f49413m;
            long j12 = this.f49414n;
            if (j11 <= jM17447F) {
                jMin = j12 >= 0 ? Math.min(j12, jM17447F - j11) : jM17447F - j11;
                j10 = 0;
            } else {
                jMin = j12;
                j10 = j11;
            }
            return AbstractC16012y0.m17530H(this, new C15766D3(interfaceC15676a0, j10, jMin), true);
        }
        return (InterfaceC15798K0) new C16014y2(this, abstractC15882b, spliterator, intFunction, this.f49413m, this.f49414n).invoke();
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: Q */
    final InterfaceC15963o2 mo17378Q(int i10, InterfaceC15963o2 interfaceC15963o2) {
        return new C15989t2(this, interfaceC15963o2);
    }
}
