package p817j$.util.stream;

import java.util.concurrent.atomic.AtomicReference;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.x0 */
/* JADX INFO: loaded from: classes4.dex */
final class C16007x0 extends AbstractC15888c {

    /* JADX INFO: renamed from: j */
    private final C16002w0 f49438j;

    C16007x0(C16002w0 c16002w0, AbstractC15882b abstractC15882b, Spliterator spliterator) {
        super(abstractC15882b, spliterator);
        this.f49438j = c16002w0;
    }

    C16007x0(C16007x0 c16007x0, Spliterator spliterator) {
        super(c16007x0, spliterator);
        this.f49438j = c16007x0.f49438j;
    }

    @Override // p817j$.util.stream.AbstractC15900e
    /* JADX INFO: renamed from: e */
    protected final AbstractC15900e mo17411e(Spliterator spliterator) {
        return new C16007x0(this, spliterator);
    }

    @Override // p817j$.util.stream.AbstractC15900e
    /* JADX INFO: renamed from: a */
    protected final Object mo17410a() {
        AbstractC15882b abstractC15882b = this.f49257a;
        AbstractC15992u0 abstractC15992u0 = (AbstractC15992u0) this.f49438j.f49427b.get();
        abstractC15882b.m17453U(this.f49258b, abstractC15992u0);
        boolean z6 = abstractC15992u0.f49411b;
        if (z6 == this.f49438j.f49426a.f49418b) {
            Boolean boolValueOf = Boolean.valueOf(z6);
            AtomicReference atomicReference = this.f49241h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // p817j$.util.stream.AbstractC15888c
    /* JADX INFO: renamed from: j */
    protected final Object mo17412j() {
        return Boolean.valueOf(!this.f49438j.f49426a.f49418b);
    }
}
