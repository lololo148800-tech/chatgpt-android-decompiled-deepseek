package p817j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;
import p817j$.util.Spliterator;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.w1 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC16003w1 extends CountedCompleter implements InterfaceC15963o2 {

    /* JADX INFO: renamed from: a */
    protected final Spliterator f49428a;

    /* JADX INFO: renamed from: b */
    protected final AbstractC15882b f49429b;

    /* JADX INFO: renamed from: c */
    protected final long f49430c;

    /* JADX INFO: renamed from: d */
    protected long f49431d;

    /* JADX INFO: renamed from: e */
    protected long f49432e;

    /* JADX INFO: renamed from: f */
    protected int f49433f;

    /* JADX INFO: renamed from: g */
    protected int f49434g;

    public /* synthetic */ void accept(double d10) {
        AbstractC16012y0.m17549a();
        throw null;
    }

    public /* synthetic */ void accept(int i10) {
        AbstractC16012y0.m17561k();
        throw null;
    }

    public /* synthetic */ void accept(long j10) {
        AbstractC16012y0.m17562l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX INFO: renamed from: b */
    abstract AbstractC16003w1 mo17515b(Spliterator spliterator, long j10, long j11);

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo17363k() {
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean mo17358n() {
        return false;
    }

    AbstractC16003w1(Spliterator spliterator, AbstractC15882b abstractC15882b, int i10) {
        this.f49428a = spliterator;
        this.f49429b = abstractC15882b;
        this.f49430c = AbstractC15900e.m17466g(spliterator.estimateSize());
        this.f49431d = 0L;
        this.f49432e = i10;
    }

    AbstractC16003w1(AbstractC16003w1 abstractC16003w1, Spliterator spliterator, long j10, long j11, int i10) {
        super(abstractC16003w1);
        this.f49428a = spliterator;
        this.f49429b = abstractC16003w1.f49429b;
        this.f49430c = abstractC16003w1.f49430c;
        this.f49431d = j10;
        this.f49432e = j11;
        if (j10 < 0 || j11 < 0 || (j10 + j11) - 1 >= i10) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j10), Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f49428a;
        AbstractC16003w1 abstractC16003w1Mo17515b = this;
        while (spliterator.estimateSize() > abstractC16003w1Mo17515b.f49430c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            abstractC16003w1Mo17515b.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            abstractC16003w1Mo17515b.mo17515b(spliteratorTrySplit, abstractC16003w1Mo17515b.f49431d, jEstimateSize).fork();
            abstractC16003w1Mo17515b = abstractC16003w1Mo17515b.mo17515b(spliterator, abstractC16003w1Mo17515b.f49431d + jEstimateSize, abstractC16003w1Mo17515b.f49432e - jEstimateSize);
        }
        abstractC16003w1Mo17515b.f49429b.m17453U(spliterator, abstractC16003w1Mo17515b);
        abstractC16003w1Mo17515b.propagateCompletion();
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        long j11 = this.f49432e;
        if (j10 > j11) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i10 = (int) this.f49431d;
        this.f49433f = i10;
        this.f49434g = i10 + ((int) j11);
    }
}
