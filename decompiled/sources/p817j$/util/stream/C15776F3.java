package p817j$.util.stream;

import java.util.Comparator;
import java.util.function.Consumer;
import p817j$.util.AbstractC15666Q;
import p817j$.util.Objects;
import p817j$.util.Spliterator;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.F3 */
/* JADX INFO: loaded from: classes4.dex */
final class C15776F3 extends AbstractC15786H3 implements Spliterator, Consumer {

    /* JADX INFO: renamed from: f */
    Object f49069f;

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

    @Override // p817j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f49069f = obj;
    }

    @Override // p817j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (m17381d() != EnumC15781G3.NO_MORE && this.f49080a.tryAdvance(this)) {
            if (m17380b(1L) == 1) {
                consumer.accept(this.f49069f);
                this.f49069f = null;
                return true;
            }
        }
        return false;
    }

    @Override // p817j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C15946l3 c15946l3 = null;
        while (true) {
            EnumC15781G3 enumC15781G3M17381d = m17381d();
            if (enumC15781G3M17381d == EnumC15781G3.NO_MORE) {
                return;
            }
            EnumC15781G3 enumC15781G3 = EnumC15781G3.MAYBE_MORE;
            Spliterator spliterator = this.f49080a;
            if (enumC15781G3M17381d == enumC15781G3) {
                int i10 = this.f49082c;
                if (c15946l3 == null) {
                    c15946l3 = new C15946l3(i10);
                } else {
                    c15946l3.f49347a = 0;
                }
                long j10 = 0;
                while (spliterator.tryAdvance(c15946l3)) {
                    j10++;
                    if (j10 >= i10) {
                        break;
                    }
                }
                if (j10 == 0) {
                    return;
                }
                long jM17380b = m17380b(j10);
                for (int i11 = 0; i11 < jM17380b; i11++) {
                    consumer.accept(c15946l3.f49340b[i11]);
                }
            } else {
                spliterator.forEachRemaining(consumer);
                return;
            }
        }
    }

    @Override // p817j$.util.stream.AbstractC15786H3
    /* JADX INFO: renamed from: c */
    protected final Spliterator mo17365c(Spliterator spliterator) {
        return new C15776F3(spliterator, this);
    }
}
