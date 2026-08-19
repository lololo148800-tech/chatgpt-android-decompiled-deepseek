package p817j$.util;

import java.util.function.DoubleConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;

/* JADX INFO: renamed from: j$.util.v */
/* JADX INFO: loaded from: classes4.dex */
public final class C16024v implements DoubleConsumer {

    /* JADX INFO: renamed from: a */
    private double f49460a;

    /* JADX INFO: renamed from: b */
    private double f49461b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC15529a.m16737a(this, doubleConsumer);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.count++;
        this.f49461b += d10;
        m17580c(d10);
        this.min = Math.min(this.min, d10);
        this.max = Math.max(this.max, d10);
    }

    /* JADX INFO: renamed from: b */
    public final void m17581b(C16024v c16024v) {
        this.count += c16024v.count;
        this.f49461b += c16024v.f49461b;
        m17580c(c16024v.sum);
        m17580c(c16024v.f49460a);
        this.min = Math.min(this.min, c16024v.min);
        this.max = Math.max(this.max, c16024v.max);
    }

    /* JADX INFO: renamed from: c */
    private void m17580c(double d10) {
        double d11 = d10 - this.f49460a;
        double d12 = this.sum;
        double d13 = d12 + d11;
        this.f49460a = (d13 - d12) - d11;
        this.sum = d13;
    }

    public final String toString() {
        double d10;
        String simpleName = C16024v.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        double d11 = this.sum + this.f49460a;
        if (Double.isNaN(d11) && Double.isInfinite(this.f49461b)) {
            d11 = this.f49461b;
        }
        Double dValueOf = Double.valueOf(d11);
        Double dValueOf2 = Double.valueOf(this.min);
        if (this.count > 0) {
            double d12 = this.sum + this.f49460a;
            if (Double.isNaN(d12) && Double.isInfinite(this.f49461b)) {
                d12 = this.f49461b;
            }
            d10 = d12 / this.count;
        } else {
            d10 = 0.0d;
        }
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", simpleName, lValueOf, dValueOf, dValueOf2, Double.valueOf(d10), Double.valueOf(this.max));
    }
}
