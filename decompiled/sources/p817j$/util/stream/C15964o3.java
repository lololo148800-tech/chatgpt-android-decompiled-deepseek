package p817j$.util.stream;

import java.util.Comparator;
import java.util.function.Consumer;
import p817j$.util.AbstractC15666Q;
import p817j$.util.Spliterator;
import p817j$.util.concurrent.ConcurrentHashMap;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.o3 */
/* JADX INFO: loaded from: classes4.dex */
final class C15964o3 implements Spliterator, Consumer {

    /* JADX INFO: renamed from: d */
    private static final Object f49367d = new Object();

    /* JADX INFO: renamed from: a */
    private final Spliterator f49368a;

    /* JADX INFO: renamed from: b */
    private final ConcurrentHashMap f49369b;

    /* JADX INFO: renamed from: c */
    private Object f49370c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC15666Q.m17256d(this);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC15666Q.m17257e(this, i10);
    }

    C15964o3(Spliterator spliterator) {
        this(spliterator, new ConcurrentHashMap());
    }

    private C15964o3(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f49368a = spliterator;
        this.f49369b = concurrentHashMap;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f49370c = obj;
    }

    /* JADX INFO: renamed from: b */
    final void m17506b(Consumer consumer, Object obj) {
        if (this.f49369b.putIfAbsent(obj != null ? obj : f49367d, Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    @Override // p817j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        while (this.f49368a.tryAdvance(this)) {
            Object obj = this.f49370c;
            if (obj == null) {
                obj = f49367d;
            }
            if (this.f49369b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.f49370c);
                this.f49370c = null;
                return true;
            }
        }
        return false;
    }

    @Override // p817j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f49368a.forEachRemaining(new C15958n3(0, this, consumer));
    }

    @Override // p817j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f49368a.trySplit();
        if (spliteratorTrySplit != null) {
            return new C15964o3(spliteratorTrySplit, this.f49369b);
        }
        return null;
    }

    @Override // p817j$.util.Spliterator
    public final long estimateSize() {
        return this.f49368a.estimateSize();
    }

    @Override // p817j$.util.Spliterator
    public final int characteristics() {
        return (this.f49368a.characteristics() & (-16469)) | 1;
    }

    @Override // p817j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f49368a.getComparator();
    }
}
