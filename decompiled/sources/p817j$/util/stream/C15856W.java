package p817j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: j$.util.stream.W */
/* JADX INFO: loaded from: classes4.dex */
final class C15856W extends AbstractC15927i2 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f49198b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ AbstractC15882b f49199c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15856W(AbstractC15882b abstractC15882b, InterfaceC15963o2 interfaceC15963o2, int i10) {
        super(interfaceC15963o2);
        this.f49198b = i10;
        this.f49199c = abstractC15882b;
    }

    @Override // p817j$.util.stream.AbstractC15927i2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public void mo17364l(long j10) {
        switch (this.f49198b) {
            case 5:
                this.f49315a.mo17364l(-1L);
                break;
            default:
                super.mo17364l(j10);
                break;
        }
    }

    @Override // p817j$.util.stream.InterfaceC15951m2, p817j$.util.stream.InterfaceC15963o2
    public final void accept(int i10) {
        switch (this.f49198b) {
            case 0:
                this.f49315a.accept(((IntFunction) ((C15981s) this.f49199c).f49397n).apply(i10));
                return;
            case 1:
                ((IntConsumer) ((C15861X) this.f49199c).f49203n).accept(i10);
                this.f49315a.accept(i10);
                return;
            case 2:
                ((C15991u) this.f49199c).getClass();
                IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i10);
                throw null;
            case 3:
                ((C15996v) this.f49199c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i10);
                throw null;
            case 4:
                ((C16006x) this.f49199c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i10);
                throw null;
            default:
                ((C15991u) this.f49199c).getClass();
                IntPredicate intPredicate = null;
                intPredicate.test(i10);
                throw null;
        }
    }
}
