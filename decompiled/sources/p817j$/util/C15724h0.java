package p817j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;

/* JADX INFO: renamed from: j$.util.h0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15724h0 implements InterfaceC15663N, LongConsumer, InterfaceC16026x {

    /* JADX INFO: renamed from: a */
    boolean f48986a = false;

    /* JADX INFO: renamed from: b */
    long f48987b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ InterfaceC15676a0 f48988c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC15529a.m16739c(this, longConsumer);
    }

    @Override // p817j$.util.InterfaceC15664O
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (AbstractC16022t0.f49459a) {
            AbstractC16022t0.m17579a(C15724h0.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(nextLong());
    }

    @Override // p817j$.util.InterfaceC15663N, java.util.Iterator, p817j$.util.InterfaceC16026x
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (AbstractC16022t0.f49459a) {
            AbstractC16022t0.m17579a(C15724h0.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new C15660K(consumer));
    }

    C15724h0(InterfaceC15676a0 interfaceC15676a0) {
        this.f48988c = interfaceC15676a0;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f48986a = true;
        this.f48987b = j10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f48986a) {
            this.f48988c.tryAdvance((LongConsumer) this);
        }
        return this.f48986a;
    }

    @Override // p817j$.util.InterfaceC15663N
    public final long nextLong() {
        if (!this.f48986a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f48986a = false;
        return this.f48987b;
    }
}
