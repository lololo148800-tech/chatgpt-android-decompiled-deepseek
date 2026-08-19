package p817j$.util.stream;

import java.util.function.Consumer;
import java.util.function.Predicate;
import p817j$.util.Spliterator;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.m4 */
/* JADX INFO: loaded from: classes4.dex */
final class C15953m4 extends AbstractC15959n4 implements Consumer {

    /* JADX INFO: renamed from: e */
    final Predicate f49348e;

    /* JADX INFO: renamed from: f */
    Object f49349f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f49350g;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15953m4(Spliterator spliterator, Predicate predicate, int i10) {
        super(spliterator);
        this.f49350g = i10;
        this.f49348e = predicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15953m4(Spliterator spliterator, C15953m4 c15953m4, int i10) {
        super(spliterator, c15953m4);
        this.f49350g = i10;
        this.f49348e = c15953m4.f49348e;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f49359d = (this.f49359d + 1) & 63;
        this.f49349f = obj;
    }

    @Override // p817j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        boolean zTryAdvance;
        boolean zTest;
        switch (this.f49350g) {
            case 0:
                boolean z6 = this.f49358c;
                Spliterator spliterator = this.f49356a;
                if (z6) {
                    boolean z10 = false;
                    this.f49358c = false;
                    while (true) {
                        zTryAdvance = spliterator.tryAdvance(this);
                        if (zTryAdvance && m17501b() && this.f49348e.test(this.f49349f)) {
                            z10 = true;
                        }
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    if (z10) {
                        this.f49357b.set(true);
                    }
                    consumer.accept(this.f49349f);
                    return zTryAdvance;
                }
                return spliterator.tryAdvance(consumer);
            default:
                if (this.f49358c && m17501b() && this.f49356a.tryAdvance(this)) {
                    zTest = this.f49348e.test(this.f49349f);
                    if (zTest) {
                        consumer.accept(this.f49349f);
                        return true;
                    }
                } else {
                    zTest = true;
                }
                this.f49358c = false;
                if (!zTest) {
                    this.f49357b.set(true);
                }
                return false;
        }
    }

    @Override // p817j$.util.stream.AbstractC15959n4, p817j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.f49350g) {
            case 1:
                if (this.f49357b.get()) {
                    return null;
                }
                return super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // p817j$.util.stream.AbstractC15959n4
    /* JADX INFO: renamed from: c */
    final Spliterator mo17485c(Spliterator spliterator) {
        switch (this.f49350g) {
            case 0:
                return new C15953m4(spliterator, this, 0);
            default:
                return new C15953m4(spliterator, this, 1);
        }
    }
}
