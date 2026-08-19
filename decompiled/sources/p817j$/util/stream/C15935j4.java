package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.AbstractC15666Q;
import p817j$.util.InterfaceC15669U;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.j4 */
/* JADX INFO: loaded from: classes4.dex */
final class C15935j4 extends AbstractC15959n4 implements DoubleConsumer, InterfaceC15669U {

    /* JADX INFO: renamed from: e */
    double f49327e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f49328f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15935j4(Spliterator spliterator, int i10) {
        super(spliterator);
        this.f49328f = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15935j4(Spliterator spliterator, AbstractC15959n4 abstractC15959n4, int i10) {
        super(spliterator, abstractC15959n4);
        this.f49328f = i10;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC15529a.m16737a(this, doubleConsumer);
    }

    @Override // p817j$.util.stream.AbstractC15959n4, p817j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC15666Q.m17253a(this, consumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC15666Q.m17258f(this, consumer);
    }

    @Override // p817j$.util.InterfaceC15709d0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f49359d = (this.f49359d + 1) & 63;
        this.f49327e = d10;
    }

    @Override // p817j$.util.stream.AbstractC15959n4
    /* JADX INFO: renamed from: c */
    final Spliterator mo17485c(Spliterator spliterator) {
        switch (this.f49328f) {
            case 0:
                return new C15935j4((InterfaceC15669U) spliterator, this, 0);
            default:
                return new C15935j4((InterfaceC15669U) spliterator, this, 1);
        }
    }

    @Override // p817j$.util.stream.AbstractC15959n4, p817j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f49328f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // p817j$.util.stream.AbstractC15959n4, p817j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC15709d0 trySplit() {
        switch (this.f49328f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // p817j$.util.InterfaceC15669U
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        switch (this.f49328f) {
            case 0:
                boolean z6 = this.f49358c;
                Spliterator spliterator = this.f49356a;
                if (z6) {
                    this.f49358c = false;
                    boolean zTryAdvance = ((InterfaceC15669U) spliterator).tryAdvance((DoubleConsumer) this);
                    if (zTryAdvance && m17501b()) {
                        DoublePredicate doublePredicate = null;
                        doublePredicate.test(this.f49327e);
                        throw null;
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    doubleConsumer.accept(this.f49327e);
                    return zTryAdvance;
                }
                return ((InterfaceC15669U) spliterator).tryAdvance(doubleConsumer);
            default:
                if (this.f49358c && m17501b() && ((InterfaceC15669U) this.f49356a).tryAdvance((DoubleConsumer) this)) {
                    DoublePredicate doublePredicate2 = null;
                    doublePredicate2.test(this.f49327e);
                    throw null;
                }
                this.f49358c = false;
                return false;
        }
    }

    @Override // p817j$.util.stream.AbstractC15959n4, p817j$.util.Spliterator
    public InterfaceC15669U trySplit() {
        switch (this.f49328f) {
            case 1:
                if (this.f49357b.get()) {
                    return null;
                }
                return (InterfaceC15669U) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // p817j$.util.InterfaceC15709d0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f49328f) {
            case 1:
                tryAdvance((DoubleConsumer) obj);
                return false;
            default:
                return tryAdvance((DoubleConsumer) obj);
        }
    }
}
