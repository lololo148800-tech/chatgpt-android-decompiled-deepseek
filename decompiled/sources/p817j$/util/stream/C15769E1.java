package p817j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.E1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15769E1 extends AbstractC16012y0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f49058h;

    /* JADX INFO: renamed from: i */
    final /* synthetic */ Object f49059i;

    /* JADX INFO: renamed from: j */
    final /* synthetic */ Object f49060j;

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Object f49061k;

    public /* synthetic */ C15769E1(EnumC15910f3 enumC15910f3, Object obj, Object obj2, Object obj3, int i10) {
        this.f49058h = i10;
        this.f49060j = obj;
        this.f49061k = obj2;
        this.f49059i = obj3;
    }

    @Override // p817j$.util.stream.AbstractC16012y0
    /* JADX INFO: renamed from: e0 */
    public final InterfaceC15848U1 mo17357e0() {
        switch (this.f49058h) {
            case 0:
                return new C15754B1((Supplier) this.f49059i, (ObjLongConsumer) this.f49061k, (C15971q) this.f49060j);
            case 1:
                return new C15784H1((Supplier) this.f49059i, (ObjDoubleConsumer) this.f49061k, (C15971q) this.f49060j);
            case 2:
                return new C15794J1(this.f49059i, (BiFunction) this.f49061k, (BinaryOperator) this.f49060j);
            case 3:
                return new C15814N1((Supplier) this.f49059i, (BiConsumer) this.f49061k, (BiConsumer) this.f49060j);
            default:
                return new C15833R1((Supplier) this.f49059i, (ObjIntConsumer) this.f49061k, (C15971q) this.f49060j);
        }
    }
}
