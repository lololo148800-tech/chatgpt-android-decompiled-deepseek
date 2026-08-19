package p817j$.util.stream;

import java.util.function.IntFunction;
import java.util.function.Predicate;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.R3 */
/* JADX INFO: loaded from: classes4.dex */
final class C15835R3 extends AbstractC15909f2 implements InterfaceC15911f4 {

    /* JADX INFO: renamed from: m */
    final /* synthetic */ Predicate f49171m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15835R3(AbstractC15915g2 abstractC15915g2, int i10, Predicate predicate) {
        super(abstractC15915g2, i10, 0);
        this.f49171m = predicate;
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: O */
    final Spliterator mo17415O(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        return EnumC15904e3.ORDERED.m17475r(abstractC15882b.m17449J()) ? mo17377N(abstractC15882b, spliterator, new C15851V(20)).spliterator() : new C15953m4(abstractC15882b.m17455W(spliterator), this.f49171m, 0);
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: N */
    final InterfaceC15798K0 mo17377N(AbstractC15882b abstractC15882b, Spliterator spliterator, IntFunction intFunction) {
        return (InterfaceC15798K0) new C15923h4(this, abstractC15882b, spliterator, intFunction).invoke();
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: Q */
    final InterfaceC15963o2 mo17378Q(int i10, InterfaceC15963o2 interfaceC15963o2) {
        return new C15831Q3(this, interfaceC15963o2, false);
    }

    @Override // p817j$.util.stream.InterfaceC15911f4
    /* JADX INFO: renamed from: j */
    public final InterfaceC15917g4 mo17422j(InterfaceC15758C0 interfaceC15758C0, boolean z6) {
        return new C15831Q3(this, interfaceC15758C0, z6);
    }
}
