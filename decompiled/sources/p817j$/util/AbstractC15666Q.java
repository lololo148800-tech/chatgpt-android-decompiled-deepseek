package p817j$.util;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.Q */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC15666Q {
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m17270r(List list, Comparator comparator) {
        if (list instanceof List) {
            ((List) list).sort(comparator);
        } else {
            List.CC.$default$sort(list, comparator);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Comparator m17271s(Comparator comparator, Comparator comparator2) {
        return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(comparator2) : Comparator.CC.$default$thenComparing(comparator, comparator2);
    }

    /* JADX INFO: renamed from: m */
    public static Optional m17265m(Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.m17252c()) {
            return Optional.of(optional.m17251b());
        }
        return Optional.empty();
    }

    /* JADX INFO: renamed from: i */
    public static Optional m17261i(Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return Optional.m17250d(optional.get());
        }
        return Optional.m17249a();
    }

    /* JADX INFO: renamed from: n */
    public static OptionalDouble m17266n(C16028z c16028z) {
        if (c16028z == null) {
            return null;
        }
        if (c16028z.m17587c()) {
            return OptionalDouble.of(c16028z.m17586b());
        }
        return OptionalDouble.empty();
    }

    /* JADX INFO: renamed from: j */
    public static C16028z m17262j(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (optionalDouble.isPresent()) {
            return C16028z.m17585d(optionalDouble.getAsDouble());
        }
        return C16028z.m17584a();
    }

    /* JADX INFO: renamed from: p */
    public static OptionalLong m17268p(C15651B c15651b) {
        if (c15651b == null) {
            return null;
        }
        if (c15651b.m17237c()) {
            return OptionalLong.of(c15651b.m17236b());
        }
        return OptionalLong.empty();
    }

    /* JADX INFO: renamed from: l */
    public static C15651B m17264l(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (optionalLong.isPresent()) {
            return C15651B.m17235d(optionalLong.getAsLong());
        }
        return C15651B.m17234a();
    }

    /* JADX INFO: renamed from: o */
    public static OptionalInt m17267o(C15650A c15650a) {
        if (c15650a == null) {
            return null;
        }
        if (c15650a.m17233c()) {
            return OptionalInt.of(c15650a.m17232b());
        }
        return OptionalInt.empty();
    }

    /* JADX INFO: renamed from: k */
    public static C15650A m17263k(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (optionalInt.isPresent()) {
            return C15650A.m17231d(optionalInt.getAsInt());
        }
        return C15650A.m17230a();
    }

    /* JADX INFO: renamed from: q */
    public static void m17269q(Iterator it, Consumer consumer) {
        if (it instanceof InterfaceC16026x) {
            ((InterfaceC16026x) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    /* JADX INFO: renamed from: d */
    public static long m17256d(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m17257e(Spliterator spliterator, int i10) {
        return (spliterator.characteristics() & i10) == i10;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m17259g(InterfaceC15672X interfaceC15672X, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return interfaceC15672X.tryAdvance((IntConsumer) consumer);
        }
        if (AbstractC16022t0.f49459a) {
            AbstractC16022t0.m17579a(interfaceC15672X.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return interfaceC15672X.tryAdvance((IntConsumer) new C15656G(consumer));
    }

    /* JADX INFO: renamed from: b */
    public static void m17254b(InterfaceC15672X interfaceC15672X, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            interfaceC15672X.forEachRemaining((IntConsumer) consumer);
        } else {
            if (AbstractC16022t0.f49459a) {
                AbstractC16022t0.m17579a(interfaceC15672X.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            interfaceC15672X.forEachRemaining((IntConsumer) new C15656G(consumer));
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m17260h(InterfaceC15676a0 interfaceC15676a0, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return interfaceC15676a0.tryAdvance((LongConsumer) consumer);
        }
        if (AbstractC16022t0.f49459a) {
            AbstractC16022t0.m17579a(interfaceC15676a0.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return interfaceC15676a0.tryAdvance((LongConsumer) new C15660K(consumer));
    }

    /* JADX INFO: renamed from: c */
    public static void m17255c(InterfaceC15676a0 interfaceC15676a0, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            interfaceC15676a0.forEachRemaining((LongConsumer) consumer);
        } else {
            if (AbstractC16022t0.f49459a) {
                AbstractC16022t0.m17579a(interfaceC15676a0.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            interfaceC15676a0.forEachRemaining((LongConsumer) new C15660K(consumer));
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m17258f(InterfaceC15669U interfaceC15669U, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return interfaceC15669U.tryAdvance((DoubleConsumer) consumer);
        }
        if (AbstractC16022t0.f49459a) {
            AbstractC16022t0.m17579a(interfaceC15669U.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return interfaceC15669U.tryAdvance((DoubleConsumer) new C15652C(consumer));
    }

    /* JADX INFO: renamed from: a */
    public static void m17253a(InterfaceC15669U interfaceC15669U, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            interfaceC15669U.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (AbstractC16022t0.f49459a) {
                AbstractC16022t0.m17579a(interfaceC15669U.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            interfaceC15669U.forEachRemaining((DoubleConsumer) new C15652C(consumer));
        }
    }

    public Spliterator trySplit() {
        return null;
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public long estimateSize() {
        return 0L;
    }

    public int characteristics() {
        return 16448;
    }
}
