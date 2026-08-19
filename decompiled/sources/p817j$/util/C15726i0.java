package p817j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;

/* JADX INFO: renamed from: j$.util.i0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15726i0 implements InterfaceC15655F, DoubleConsumer, InterfaceC16026x {

    /* JADX INFO: renamed from: a */
    boolean f48989a = false;

    /* JADX INFO: renamed from: b */
    double f48990b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ InterfaceC15669U f48991c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC15529a.m16737a(this, doubleConsumer);
    }

    @Override // p817j$.util.InterfaceC15664O
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (AbstractC16022t0.f49459a) {
            AbstractC16022t0.m17579a(C15726i0.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // p817j$.util.InterfaceC15655F, java.util.Iterator, p817j$.util.InterfaceC16026x
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (AbstractC16022t0.f49459a) {
            AbstractC16022t0.m17579a(C15726i0.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new C15652C(consumer));
    }

    C15726i0(InterfaceC15669U interfaceC15669U) {
        this.f48991c = interfaceC15669U;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f48989a = true;
        this.f48990b = d10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f48989a) {
            this.f48991c.tryAdvance((DoubleConsumer) this);
        }
        return this.f48989a;
    }

    @Override // p817j$.util.InterfaceC15655F
    public final double nextDouble() {
        if (!this.f48989a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f48989a = false;
        return this.f48990b;
    }
}
