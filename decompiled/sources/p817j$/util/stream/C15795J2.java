package p817j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;
import p817j$.util.Objects;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.J2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15795J2 extends AbstractC15909f2 {

    /* JADX INFO: renamed from: m */
    private final boolean f49098m;

    /* JADX INFO: renamed from: n */
    private final Comparator f49099n;

    C15795J2(AbstractC15915g2 abstractC15915g2) {
        super(abstractC15915g2, EnumC15904e3.f49276q | EnumC15904e3.f49274o, 0);
        this.f49098m = true;
        this.f49099n = p817j$.util.Comparator.CC.m17241a();
    }

    C15795J2(AbstractC15915g2 abstractC15915g2, Comparator comparator) {
        super(abstractC15915g2, EnumC15904e3.f49276q | EnumC15904e3.f49275p, 0);
        this.f49098m = false;
        this.f49099n = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: Q */
    public final InterfaceC15963o2 mo17378Q(int i10, InterfaceC15963o2 interfaceC15963o2) {
        Objects.requireNonNull(interfaceC15963o2);
        if (EnumC15904e3.SORTED.m17475r(i10) && this.f49098m) {
            return interfaceC15963o2;
        }
        boolean zM17475r = EnumC15904e3.SIZED.m17475r(i10);
        Comparator comparator = this.f49099n;
        if (zM17475r) {
            return new C15825P2(interfaceC15963o2, comparator);
        }
        return new C15805L2(interfaceC15963o2, comparator);
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: N */
    public final InterfaceC15798K0 mo17377N(AbstractC15882b abstractC15882b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC15904e3.SORTED.m17475r(abstractC15882b.m17449J()) && this.f49098m) {
            return abstractC15882b.m17444B(spliterator, false, intFunction);
        }
        Object[] objArrMo17408o = abstractC15882b.m17444B(spliterator, true, intFunction).mo17408o(intFunction);
        Arrays.sort(objArrMo17408o, this.f49099n);
        return new C15813N0(objArrMo17408o);
    }
}
