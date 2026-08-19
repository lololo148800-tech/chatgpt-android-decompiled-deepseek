package p817j$.util.stream;

import java.util.function.LongBinaryOperator;

/* JADX INFO: renamed from: j$.util.stream.A1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15749A1 extends AbstractC16012y0 {

    /* JADX INFO: renamed from: h */
    final /* synthetic */ LongBinaryOperator f49025h;

    /* JADX INFO: renamed from: i */
    final /* synthetic */ long f49026i;

    @Override // p817j$.util.stream.AbstractC16012y0
    /* JADX INFO: renamed from: e0 */
    public final InterfaceC15848U1 mo17357e0() {
        return new C15838S1(this.f49026i, this.f49025h);
    }

    C15749A1(EnumC15910f3 enumC15910f3, LongBinaryOperator longBinaryOperator, long j10) {
        this.f49025h = longBinaryOperator;
        this.f49026i = j10;
    }
}
