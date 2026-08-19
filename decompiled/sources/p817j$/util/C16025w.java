package p817j$.util;

import java.util.function.IntConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;

/* JADX INFO: renamed from: j$.util.w */
/* JADX INFO: loaded from: classes4.dex */
public final class C16025w implements IntConsumer {
    private long count;
    private long sum;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC15529a.m16738b(this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        this.count++;
        this.sum += (long) i10;
        this.min = Math.min(this.min, i10);
        this.max = Math.max(this.max, i10);
    }

    /* JADX INFO: renamed from: b */
    public final void m17582b(C16025w c16025w) {
        this.count += c16025w.count;
        this.sum += c16025w.sum;
        this.min = Math.min(this.min, c16025w.min);
        this.max = Math.max(this.max, c16025w.max);
    }

    public final String toString() {
        String simpleName = C16025w.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        Long lValueOf2 = Long.valueOf(this.sum);
        Integer numValueOf = Integer.valueOf(this.min);
        long j10 = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, lValueOf, lValueOf2, numValueOf, Double.valueOf(j10 > 0 ? this.sum / j10 : 0.0d), Integer.valueOf(this.max));
    }
}
