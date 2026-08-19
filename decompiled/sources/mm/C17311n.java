package mm;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: mm.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C17311n implements Serializable {

    /* JADX INFO: renamed from: Y */
    public final Throwable f55138Y;

    public C17311n(Throwable exception) {
        AbstractC16544l.m18094g(exception, "exception");
        this.f55138Y = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17311n) {
            if (AbstractC16544l.m18089b(this.f55138Y, ((C17311n) obj).f55138Y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f55138Y.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f55138Y + ')';
    }
}
