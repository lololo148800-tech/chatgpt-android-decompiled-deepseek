package p817j$.util.stream;

import java.util.function.Predicate;
import java.util.function.Supplier;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.E */
/* JADX INFO: loaded from: classes4.dex */
final class C15767E implements InterfaceC15806L3 {

    /* JADX INFO: renamed from: a */
    final int f49054a;

    /* JADX INFO: renamed from: b */
    final Object f49055b;

    /* JADX INFO: renamed from: c */
    final Predicate f49056c;

    /* JADX INFO: renamed from: d */
    final Supplier f49057d;

    C15767E(boolean z6, EnumC15910f3 enumC15910f3, Object obj, Predicate predicate, Supplier supplier) {
        this.f49054a = (z6 ? 0 : EnumC15904e3.f49277r) | EnumC15904e3.f49280u;
        this.f49055b = obj;
        this.f49056c = predicate;
        this.f49057d = supplier;
    }

    @Override // p817j$.util.stream.InterfaceC15806L3
    /* JADX INFO: renamed from: d */
    public final int mo17375d() {
        return this.f49054a;
    }

    @Override // p817j$.util.stream.InterfaceC15806L3
    /* JADX INFO: renamed from: b */
    public final Object mo17373b(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        InterfaceC15811M3 interfaceC15811M3 = (InterfaceC15811M3) this.f49057d.get();
        abstractC15882b.m17453U(spliterator, interfaceC15811M3);
        Object obj = interfaceC15811M3.get();
        return obj != null ? obj : this.f49055b;
    }

    @Override // p817j$.util.stream.InterfaceC15806L3
    /* JADX INFO: renamed from: c */
    public final Object mo17374c(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        return new C15802L(this, EnumC15904e3.ORDERED.m17475r(abstractC15882b.m17449J()), abstractC15882b, spliterator).invoke();
    }
}
