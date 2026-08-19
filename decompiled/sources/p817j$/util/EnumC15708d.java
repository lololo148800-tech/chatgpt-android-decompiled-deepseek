package p817j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.d */
/* JADX INFO: loaded from: classes4.dex */
final class EnumC15708d implements Comparator, Comparator {
    public static final EnumC15708d INSTANCE;

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ EnumC15708d[] f48953a;

    @Override // java.util.Comparator, p817j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator, p817j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Function function) {
        return Comparator.CC.$default$thenComparing(this, function);
    }

    @Override // java.util.Comparator, p817j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Function function, Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, function, comparator);
    }

    @Override // java.util.Comparator, p817j$.util.Comparator
    public final /* synthetic */ Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, p817j$.util.Comparator
    public final /* synthetic */ Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator, p817j$.util.Comparator
    public final /* synthetic */ Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    public static EnumC15708d valueOf(String str) {
        return (EnumC15708d) Enum.valueOf(EnumC15708d.class, str);
    }

    public static EnumC15708d[] values() {
        return (EnumC15708d[]) f48953a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    static {
        EnumC15708d enumC15708d = new EnumC15708d("INSTANCE", 0);
        INSTANCE = enumC15708d;
        f48953a = new EnumC15708d[]{enumC15708d};
    }

    @Override // java.util.Comparator, p817j$.util.Comparator
    public final Comparator reversed() {
        return Collections.reverseOrder();
    }
}
