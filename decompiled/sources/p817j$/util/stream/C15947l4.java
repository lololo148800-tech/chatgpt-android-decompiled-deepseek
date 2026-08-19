package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15676a0;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.l4 */
/* JADX INFO: loaded from: classes4.dex */
final class C15947l4 extends AbstractC15959n4 implements LongConsumer, InterfaceC15676a0 {

    /* JADX INFO: renamed from: e */
    long f49341e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f49342f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15947l4(Spliterator spliterator, int i10) {
        super(spliterator);
        this.f49342f = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15947l4(Spliterator spliterator, AbstractC15959n4 abstractC15959n4, int i10) {
        super(spliterator, abstractC15959n4);
        this.f49342f = i10;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC15529a.m16739c(this, longConsumer);
    }

    @Override // p817j$.util.stream.AbstractC15959n4, p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC15666Q.m17255c(this, consumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC15666Q.m17260h(this, consumer);
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final void forEachRemaining(LongConsumer longConsumer) {
        while (tryAdvance(longConsumer)) {
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f49359d = (this.f49359d + 1) & 63;
        this.f49341e = j10;
    }

    @Override // p817j$.util.stream.AbstractC15959n4
    /* JADX INFO: renamed from: c */
    final Spliterator mo17485c(Spliterator spliterator) {
        switch (this.f49342f) {
            case 0:
                return new C15947l4((InterfaceC15676a0) spliterator, this, 0);
            default:
                return new C15947l4((InterfaceC15676a0) spliterator, this, 1);
        }
    }

    @Override // p817j$.util.stream.AbstractC15959n4, p817j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f49342f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // p817j$.util.stream.AbstractC15959n4, p817j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC15709d0 trySplit() {
        switch (this.f49342f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // p817j$.util.InterfaceC15676a0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        switch (this.f49342f) {
            case 0:
                boolean z6 = this.f49358c;
                Spliterator spliterator = this.f49356a;
                if (z6) {
                    this.f49358c = false;
                    boolean zTryAdvance = ((InterfaceC15676a0) spliterator).tryAdvance((LongConsumer) this);
                    if (zTryAdvance && m17501b()) {
                        LongPredicate longPredicate = null;
                        longPredicate.test(this.f49341e);
                        throw null;
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    longConsumer.accept(this.f49341e);
                    return zTryAdvance;
                }
                return ((InterfaceC15676a0) spliterator).tryAdvance(longConsumer);
            default:
                if (this.f49358c && m17501b() && ((InterfaceC15676a0) this.f49356a).tryAdvance((LongConsumer) this)) {
                    LongPredicate longPredicate2 = null;
                    longPredicate2.test(this.f49341e);
                    throw null;
                }
                this.f49358c = false;
                return false;
        }
    }

    @Override // p817j$.util.stream.AbstractC15959n4, p817j$.util.Spliterator
    public InterfaceC15676a0 trySplit() {
        switch (this.f49342f) {
            case 1:
                if (this.f49357b.get()) {
                    return null;
                }
                return (InterfaceC15676a0) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // p817j$.util.InterfaceC15709d0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f49342f) {
            case 1:
                tryAdvance((LongConsumer) obj);
                return false;
            default:
                return tryAdvance((LongConsumer) obj);
        }
    }
}
