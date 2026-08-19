package p817j$.util;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class Optional<T> {

    /* JADX INFO: renamed from: b */
    private static final Optional f48854b = new Optional();

    /* JADX INFO: renamed from: a */
    private final Object f48855a;

    private Optional() {
        this.f48855a = null;
    }

    /* JADX INFO: renamed from: a */
    public static Optional m17249a() {
        return f48854b;
    }

    private Optional(Object obj) {
        this.f48855a = Objects.requireNonNull(obj);
    }

    /* JADX INFO: renamed from: d */
    public static Optional m17250d(Object obj) {
        return new Optional(obj);
    }

    public static <T> Optional<T> ofNullable(T t10) {
        if (t10 != null) {
            return new Optional<>(t10);
        }
        return f48854b;
    }

    /* JADX INFO: renamed from: b */
    public final Object m17251b() {
        Object obj = this.f48855a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17252c() {
        return this.f48855a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.f48855a, ((Optional) obj).f48855a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f48855a);
    }

    public final String toString() {
        Object obj = this.f48855a;
        if (obj != null) {
            return String.format("Optional[%s]", obj);
        }
        return "Optional.empty";
    }
}
