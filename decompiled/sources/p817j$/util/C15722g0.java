package p817j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;

/* JADX INFO: renamed from: j$.util.g0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15722g0 implements InterfaceC15659J, IntConsumer, InterfaceC16026x {

    /* JADX INFO: renamed from: a */
    boolean f48978a = false;

    /* JADX INFO: renamed from: b */
    int f48979b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ InterfaceC15672X f48980c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC15529a.m16738b(this, intConsumer);
    }

    @Override // p817j$.util.InterfaceC15664O
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }

    @Override // java.util.Iterator
    public final Integer next() {
        if (AbstractC16022t0.f49459a) {
            AbstractC16022t0.m17579a(C15722g0.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(nextInt());
    }

    @Override // p817j$.util.InterfaceC15659J, java.util.Iterator, p817j$.util.InterfaceC16026x
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (AbstractC16022t0.f49459a) {
            AbstractC16022t0.m17579a(C15722g0.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((IntConsumer) new C15656G(consumer));
    }

    C15722g0(InterfaceC15672X interfaceC15672X) {
        this.f48980c = interfaceC15672X;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        this.f48978a = true;
        this.f48979b = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f48978a) {
            this.f48980c.tryAdvance((IntConsumer) this);
        }
        return this.f48978a;
    }

    @Override // p817j$.util.InterfaceC15659J
    public final int nextInt() {
        if (!this.f48978a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f48978a = false;
        return this.f48979b;
    }
}
