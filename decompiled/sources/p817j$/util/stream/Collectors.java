package p817j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class Collectors {

    /* JADX INFO: renamed from: a */
    static final Set f49046a;

    /* JADX INFO: renamed from: b */
    static final Set f49047b;

    static {
        Collector.Characteristics characteristics = Collector.Characteristics.CONCURRENT;
        Collector.Characteristics characteristics2 = Collector.Characteristics.UNORDERED;
        Collector.Characteristics characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2, characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2));
        f49046a = Collections.unmodifiableSet(EnumSet.of(characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics2, characteristics3));
        f49047b = Collections.emptySet();
        Collections.unmodifiableSet(EnumSet.of(characteristics2));
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new C15942l(new C15772F(5), new C15936k(14), new C15936k(0), new C15936k(1), f49046a);
    }

    /* JADX INFO: renamed from: a */
    static void m17370a(double[] dArr, double d10) {
        double d11 = d10 - dArr[1];
        double d12 = dArr[0];
        double d13 = d12 + d11;
        dArr[1] = (d13 - d12) - d11;
        dArr[0] = d13;
    }
}
