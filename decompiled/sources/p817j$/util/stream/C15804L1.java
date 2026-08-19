package p817j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.L1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15804L1 extends AbstractC16012y0 {

    /* JADX INFO: renamed from: h */
    final /* synthetic */ BinaryOperator f49112h;

    /* JADX INFO: renamed from: i */
    final /* synthetic */ BiConsumer f49113i;

    /* JADX INFO: renamed from: j */
    final /* synthetic */ Supplier f49114j;

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Collector f49115k;

    @Override // p817j$.util.stream.AbstractC16012y0
    /* JADX INFO: renamed from: e0 */
    public final InterfaceC15848U1 mo17357e0() {
        return new C15809M1(this.f49114j, this.f49113i, this.f49112h);
    }

    @Override // p817j$.util.stream.AbstractC16012y0, p817j$.util.stream.InterfaceC15806L3
    /* JADX INFO: renamed from: d */
    public final int mo17375d() {
        if (this.f49115k.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return EnumC15904e3.f49277r;
        }
        return 0;
    }

    C15804L1(EnumC15910f3 enumC15910f3, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.f49112h = binaryOperator;
        this.f49113i = biConsumer;
        this.f49114j = supplier;
        this.f49115k = collector;
    }
}
