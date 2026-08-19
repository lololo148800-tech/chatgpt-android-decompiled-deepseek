package p817j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: renamed from: j$.util.stream.r */
/* JADX INFO: loaded from: classes4.dex */
final class C15976r extends AbstractC15921h2 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f49389b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ AbstractC15882b f49390c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15976r(AbstractC15882b abstractC15882b, InterfaceC15963o2 interfaceC15963o2, int i10) {
        super(interfaceC15963o2);
        this.f49389b = i10;
        this.f49390c = abstractC15882b;
    }

    @Override // p817j$.util.stream.AbstractC15921h2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public void mo17364l(long j10) {
        switch (this.f49389b) {
            case 4:
                this.f49307a.mo17364l(-1L);
                break;
            default:
                super.mo17364l(j10);
                break;
        }
    }

    @Override // p817j$.util.stream.InterfaceC15945l2, p817j$.util.stream.InterfaceC15963o2
    public final void accept(double d10) {
        switch (this.f49389b) {
            case 0:
                this.f49307a.accept(((DoubleFunction) ((C15981s) this.f49390c).f49397n).apply(d10));
                return;
            case 1:
                this.f49307a.accept(((DoubleUnaryOperator) ((C15986t) this.f49390c).f49402n).applyAsDouble(d10));
                return;
            case 2:
                ((C15991u) this.f49390c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d10);
                throw null;
            case 3:
                ((C15996v) this.f49390c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d10);
                throw null;
            case 4:
                ((C16006x) this.f49390c).getClass();
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d10);
                throw null;
            default:
                ((DoubleConsumer) ((C15986t) this.f49390c).f49402n).accept(d10);
                this.f49307a.accept(d10);
                return;
        }
    }
}
