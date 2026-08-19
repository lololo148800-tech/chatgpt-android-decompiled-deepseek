package p817j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: j$.util.stream.e0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15901e0 extends AbstractC15933j2 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f49263b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ AbstractC15882b f49264c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15901e0(AbstractC15882b abstractC15882b, InterfaceC15963o2 interfaceC15963o2, int i10) {
        super(interfaceC15963o2);
        this.f49263b = i10;
        this.f49264c = abstractC15882b;
    }

    @Override // p817j$.util.stream.AbstractC15933j2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public void mo17364l(long j10) {
        switch (this.f49263b) {
            case 4:
                this.f49325a.mo17364l(-1L);
                break;
            default:
                super.mo17364l(j10);
                break;
        }
    }

    @Override // p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public final void accept(long j10) {
        switch (this.f49263b) {
            case 0:
                this.f49325a.accept(((LongFunction) ((C15981s) this.f49264c).f49397n).apply(j10));
                return;
            case 1:
                ((C15996v) this.f49264c).getClass();
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j10);
                throw null;
            case 2:
                ((C15991u) this.f49264c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j10);
                throw null;
            case 3:
                ((C16006x) this.f49264c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j10);
                throw null;
            case 4:
                ((C15996v) this.f49264c).getClass();
                LongPredicate longPredicate = null;
                longPredicate.test(j10);
                throw null;
            default:
                ((LongConsumer) ((C15919h0) this.f49264c).f49306n).accept(j10);
                this.f49325a.accept(j10);
                return;
        }
    }
}
