package mm;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: mm.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C17312o implements Serializable {

    /* JADX INFO: renamed from: Y */
    public final Object f55139Y;

    public /* synthetic */ C17312o(Object obj) {
        this.f55139Y = obj;
    }

    /* JADX INFO: renamed from: a */
    public static final Throwable m18979a(Object obj) {
        if (obj instanceof C17311n) {
            return ((C17311n) obj).f55138Y;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static String m18980b(Object obj) {
        if (obj instanceof C17311n) {
            return ((C17311n) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17312o) {
            return AbstractC16544l.m18089b(this.f55139Y, ((C17312o) obj).f55139Y);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f55139Y;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return m18980b(this.f55139Y);
    }
}
