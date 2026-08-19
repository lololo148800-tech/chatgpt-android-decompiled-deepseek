package p817j$.util;

import java.util.Arrays;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes4.dex */
public final class Objects {
    public static boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hashCode(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static int hash(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static String toString(Object obj) {
        return String.valueOf(obj);
    }

    public static String toString(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }

    public static <T> T requireNonNull(T t10) {
        t10.getClass();
        return t10;
    }

    public static <T> T requireNonNull(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static <T> T requireNonNullElseGet(T t10, Supplier<? extends T> supplier) {
        return t10 != null ? t10 : (T) requireNonNull(((Supplier) requireNonNull(supplier, "supplier")).get(), "supplier.get()");
    }
}
