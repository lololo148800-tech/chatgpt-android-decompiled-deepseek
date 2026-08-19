package p817j$.util.stream;

import java.util.Arrays;
import java.util.function.IntFunction;
import p817j$.util.Objects;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.I2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15790I2 extends AbstractC15931j0 {
    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: Q */
    public final InterfaceC15963o2 mo17378Q(int i10, InterfaceC15963o2 interfaceC15963o2) {
        Objects.requireNonNull(interfaceC15963o2);
        if (EnumC15904e3.SORTED.m17475r(i10)) {
            return interfaceC15963o2;
        }
        return EnumC15904e3.SIZED.m17475r(i10) ? new C15820O2(interfaceC15963o2) : new C15775F2(interfaceC15963o2);
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: N */
    public final InterfaceC15798K0 mo17377N(AbstractC15882b abstractC15882b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC15904e3.SORTED.m17475r(abstractC15882b.m17449J())) {
            return abstractC15882b.m17444B(spliterator, false, intFunction);
        }
        long[] jArr = (long[]) ((InterfaceC15788I0) abstractC15882b.m17444B(spliterator, true, intFunction)).mo17398d();
        Arrays.sort(jArr);
        return new C15968p1(jArr);
    }
}
