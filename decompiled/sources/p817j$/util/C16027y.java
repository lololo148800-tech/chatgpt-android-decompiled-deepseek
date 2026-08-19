package p817j$.util;

import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;

/* JADX INFO: renamed from: j$.util.y */
/* JADX INFO: loaded from: classes4.dex */
public final class C16027y implements LongConsumer, IntConsumer {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC15529a.m16738b(this, intConsumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC15529a.m16739c(this, longConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        accept(i10);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        this.count++;
        this.sum += j10;
        this.min = Math.min(this.min, j10);
        this.max = Math.max(this.max, j10);
    }

    /* JADX INFO: renamed from: b */
    public final void m17583b(C16027y c16027y) {
        this.count += c16027y.count;
        this.sum += c16027y.sum;
        this.min = Math.min(this.min, c16027y.min);
        this.max = Math.max(this.max, c16027y.max);
    }

    public final String toString() {
        String simpleName = C16027y.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        Long lValueOf2 = Long.valueOf(this.sum);
        Long lValueOf3 = Long.valueOf(this.min);
        long j10 = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, lValueOf, lValueOf2, lValueOf3, Double.valueOf(j10 > 0 ? this.sum / j10 : 0.0d), Long.valueOf(this.max));
    }
}
