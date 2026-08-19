package p817j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import p817j$.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public interface Collector<T, A, R> {
    BiConsumer accumulator();

    Set characteristics();

    BinaryOperator combiner();

    Function finisher();

    Supplier supplier();

    /* JADX INFO: renamed from: j$.util.stream.Collector$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX INFO: renamed from: of */
        public static <T, A, R> Collector<T, A, R> m17369of(Supplier<A> supplier, BiConsumer<A, T> biConsumer, BinaryOperator<A> binaryOperator, Function<A, R> function, Characteristics... characteristicsArr) {
            Objects.requireNonNull(supplier);
            Objects.requireNonNull(biConsumer);
            Objects.requireNonNull(binaryOperator);
            Objects.requireNonNull(function);
            Objects.requireNonNull(characteristicsArr);
            Set setUnmodifiableSet = Collectors.f49047b;
            if (characteristicsArr.length > 0) {
                EnumSet enumSetNoneOf = EnumSet.noneOf(Characteristics.class);
                Collections.addAll(enumSetNoneOf, characteristicsArr);
                setUnmodifiableSet = Collections.unmodifiableSet(enumSetNoneOf);
            }
            return new C15942l(supplier, biConsumer, binaryOperator, function, setUnmodifiableSet);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Characteristics {
        public static final Characteristics CONCURRENT;
        public static final Characteristics IDENTITY_FINISH;
        public static final Characteristics UNORDERED;

        /* JADX INFO: renamed from: a */
        private static final /* synthetic */ Characteristics[] f49045a;

        public static Characteristics valueOf(String str) {
            return (Characteristics) Enum.valueOf(Characteristics.class, str);
        }

        public static Characteristics[] values() {
            return (Characteristics[]) f49045a.clone();
        }

        static {
            Characteristics characteristics = new Characteristics("CONCURRENT", 0);
            CONCURRENT = characteristics;
            Characteristics characteristics2 = new Characteristics("UNORDERED", 1);
            UNORDERED = characteristics2;
            Characteristics characteristics3 = new Characteristics("IDENTITY_FINISH", 2);
            IDENTITY_FINISH = characteristics3;
            f49045a = new Characteristics[]{characteristics, characteristics2, characteristics3};
        }
    }
}
