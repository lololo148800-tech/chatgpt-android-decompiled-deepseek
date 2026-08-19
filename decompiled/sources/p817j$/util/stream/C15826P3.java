package p817j$.util.stream;

import java.util.function.IntFunction;
import java.util.function.Predicate;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.P3 */
/* JADX INFO: loaded from: classes4.dex */
final class C15826P3 extends AbstractC15909f2 {

    /* JADX INFO: renamed from: m */
    final /* synthetic */ Predicate f49148m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C15826P3(AbstractC15915g2 abstractC15915g2, int i10, Predicate predicate) {
        super(abstractC15915g2, i10, 0);
        this.f49148m = predicate;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: O */
    final Spliterator mo17415O(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        return EnumC15904e3.ORDERED.m17475r(abstractC15882b.m17449J()) ? mo17377N(abstractC15882b, spliterator, new C15851V(20)).spliterator() : new C15953m4(abstractC15882b.m17455W(spliterator), this.f49148m, 1);
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: N */
    final InterfaceC15798K0 mo17377N(AbstractC15882b abstractC15882b, Spliterator spliterator, IntFunction intFunction) {
        return (InterfaceC15798K0) new C15929i4(this, abstractC15882b, spliterator, intFunction).invoke();
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: Q */
    final InterfaceC15963o2 mo17378Q(int i10, InterfaceC15963o2 interfaceC15963o2) {
        return new C15948m(this, interfaceC15963o2);
    }
}
