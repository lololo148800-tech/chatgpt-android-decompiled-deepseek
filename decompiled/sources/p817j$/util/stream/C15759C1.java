package p817j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* JADX INFO: renamed from: j$.util.stream.C1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15759C1 extends AbstractC16012y0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f49040h;

    /* JADX INFO: renamed from: i */
    final /* synthetic */ Object f49041i;

    public /* synthetic */ C15759C1(EnumC15910f3 enumC15910f3, Object obj, int i10) {
        this.f49040h = i10;
        this.f49041i = obj;
    }

    @Override // p817j$.util.stream.AbstractC16012y0
    /* JADX INFO: renamed from: e0 */
    public final InterfaceC15848U1 mo17357e0() {
        switch (this.f49040h) {
            case 0:
                return new C15843T1((LongBinaryOperator) this.f49041i);
            case 1:
                return new C15774F1((DoubleBinaryOperator) this.f49041i);
            case 2:
                return new C15799K1((BinaryOperator) this.f49041i);
            default:
                return new C15829Q1((IntBinaryOperator) this.f49041i);
        }
    }
}
