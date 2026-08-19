package p449S9;

import java.util.Comparator;
import p817j$.util.Objects;

/* JADX INFO: renamed from: S9.T */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7050T {

    /* JADX INFO: renamed from: a */
    public static final Comparator f22517a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(AbstractC7050T.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = EnumC7049S.f22515Y;
        }
        f22517a = comparator;
    }
}
