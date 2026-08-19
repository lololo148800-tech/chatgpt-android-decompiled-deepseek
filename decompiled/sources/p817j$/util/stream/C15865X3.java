package p817j$.util.stream;

import java.util.function.IntFunction;
import p817j$.util.InterfaceC15676a0;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.X3 */
/* JADX INFO: loaded from: classes4.dex */
final class C15865X3 extends AbstractC15931j0 {
    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: O */
    final Spliterator mo17415O(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        return EnumC15904e3.ORDERED.m17475r(abstractC15882b.m17449J()) ? mo17377N(abstractC15882b, spliterator, new C15851V(29)).spliterator() : new C15947l4((InterfaceC15676a0) abstractC15882b.m17455W(spliterator), 1);
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: N */
    final InterfaceC15798K0 mo17377N(AbstractC15882b abstractC15882b, Spliterator spliterator, IntFunction intFunction) {
        return (InterfaceC15798K0) new C15929i4(this, abstractC15882b, spliterator, intFunction).invoke();
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: Q */
    final InterfaceC15963o2 mo17378Q(int i10, InterfaceC15963o2 interfaceC15963o2) {
        return new C15860W3(this, interfaceC15963o2);
    }
}
