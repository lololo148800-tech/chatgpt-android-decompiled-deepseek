package p817j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* JADX INFO: renamed from: j$.util.stream.I1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15789I1 extends AbstractC16012y0 {

    /* JADX INFO: renamed from: h */
    final /* synthetic */ DoubleBinaryOperator f49087h;

    /* JADX INFO: renamed from: i */
    final /* synthetic */ double f49088i;

    @Override // p817j$.util.stream.AbstractC16012y0
    /* JADX INFO: renamed from: e0 */
    public final InterfaceC15848U1 mo17357e0() {
        return new C15764D1(this.f49088i, this.f49087h);
    }

    C15789I1(EnumC15910f3 enumC15910f3, DoubleBinaryOperator doubleBinaryOperator, double d10) {
        this.f49087h = doubleBinaryOperator;
        this.f49088i = d10;
    }
}
