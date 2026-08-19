package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15672X;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.k4 */
/* JADX INFO: loaded from: classes4.dex */
final class C15941k4 extends AbstractC15959n4 implements IntConsumer, InterfaceC15672X {

    /* JADX INFO: renamed from: e */
    int f49332e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f49333f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15941k4(Spliterator spliterator, int i10) {
        super(spliterator);
        this.f49333f = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15941k4(Spliterator spliterator, AbstractC15959n4 abstractC15959n4, int i10) {
        super(spliterator, abstractC15959n4);
        this.f49333f = i10;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC15529a.m16738b(this, intConsumer);
    }

    @Override // p817j$.util.stream.AbstractC15959n4, p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC15666Q.m17254b(this, consumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC15666Q.m17259g(this, consumer);
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final void forEachRemaining(IntConsumer intConsumer) {
        while (tryAdvance(intConsumer)) {
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        this.f49359d = (this.f49359d + 1) & 63;
        this.f49332e = i10;
    }

    @Override // p817j$.util.stream.AbstractC15959n4
    /* JADX INFO: renamed from: c */
    final Spliterator mo17485c(Spliterator spliterator) {
        switch (this.f49333f) {
            case 0:
                return new C15941k4((InterfaceC15672X) spliterator, this, 0);
            default:
                return new C15941k4((InterfaceC15672X) spliterator, this, 1);
        }
    }

    @Override // p817j$.util.stream.AbstractC15959n4, p817j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f49333f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // p817j$.util.stream.AbstractC15959n4, p817j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC15709d0 trySplit() {
        switch (this.f49333f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // p817j$.util.InterfaceC15672X
    public final boolean tryAdvance(IntConsumer intConsumer) {
        switch (this.f49333f) {
            case 0:
                boolean z6 = this.f49358c;
                Spliterator spliterator = this.f49356a;
                if (z6) {
                    this.f49358c = false;
                    boolean zTryAdvance = ((InterfaceC15672X) spliterator).tryAdvance((IntConsumer) this);
                    if (zTryAdvance && m17501b()) {
                        IntPredicate intPredicate = null;
                        intPredicate.test(this.f49332e);
                        throw null;
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    intConsumer.accept(this.f49332e);
                    return zTryAdvance;
                }
                return ((InterfaceC15672X) spliterator).tryAdvance(intConsumer);
            default:
                if (this.f49358c && m17501b() && ((InterfaceC15672X) this.f49356a).tryAdvance((IntConsumer) this)) {
                    IntPredicate intPredicate2 = null;
                    intPredicate2.test(this.f49332e);
                    throw null;
                }
                this.f49358c = false;
                return false;
        }
    }

    @Override // p817j$.util.stream.AbstractC15959n4, p817j$.util.Spliterator
    public InterfaceC15672X trySplit() {
        switch (this.f49333f) {
            case 1:
                if (this.f49357b.get()) {
                    return null;
                }
                return (InterfaceC15672X) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // p817j$.util.InterfaceC15709d0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f49333f) {
            case 1:
                tryAdvance((IntConsumer) obj);
                return false;
            default:
                return tryAdvance((IntConsumer) obj);
        }
    }
}
