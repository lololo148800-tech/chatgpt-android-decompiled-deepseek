package p817j$.util.stream;

import java.util.function.Supplier;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.w0 */
/* JADX INFO: loaded from: classes4.dex */
final class C16002w0 implements InterfaceC15806L3 {

    /* JADX INFO: renamed from: a */
    final EnumC15997v0 f49426a;

    /* JADX INFO: renamed from: b */
    final Supplier f49427b;

    C16002w0(EnumC15910f3 enumC15910f3, EnumC15997v0 enumC15997v0, Supplier supplier) {
        this.f49426a = enumC15997v0;
        this.f49427b = supplier;
    }

    @Override // p817j$.util.stream.InterfaceC15806L3
    /* JADX INFO: renamed from: d */
    public final int mo17375d() {
        return EnumC15904e3.f49280u | EnumC15904e3.f49277r;
    }

    @Override // p817j$.util.stream.InterfaceC15806L3
    /* JADX INFO: renamed from: b */
    public final Object mo17373b(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        AbstractC15992u0 abstractC15992u0 = (AbstractC15992u0) this.f49427b.get();
        abstractC15882b.m17453U(spliterator, abstractC15992u0);
        return Boolean.valueOf(abstractC15992u0.f49411b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p817j$.util.stream.InterfaceC15806L3
    /* JADX INFO: renamed from: c */
    public final Object mo17374c(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        return (Boolean) new C16007x0(this, abstractC15882b, spliterator).invoke();
    }
}
