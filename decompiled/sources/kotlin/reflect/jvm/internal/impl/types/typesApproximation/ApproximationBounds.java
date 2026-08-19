package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: loaded from: classes2.dex */
public final class ApproximationBounds<T> {

    /* JADX INFO: renamed from: a */
    public final Object f53278a;

    /* JADX INFO: renamed from: b */
    public final Object f53279b;

    public ApproximationBounds(T t10, T t11) {
        this.f53278a = t10;
        this.f53279b = t11;
    }

    public final T component1() {
        return (T) this.f53278a;
    }

    public final T component2() {
        return (T) this.f53279b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproximationBounds)) {
            return false;
        }
        ApproximationBounds approximationBounds = (ApproximationBounds) obj;
        return AbstractC16544l.m18089b(this.f53278a, approximationBounds.f53278a) && AbstractC16544l.m18089b(this.f53279b, approximationBounds.f53279b);
    }

    public final T getLower() {
        return (T) this.f53278a;
    }

    public final T getUpper() {
        return (T) this.f53279b;
    }

    public int hashCode() {
        Object obj = this.f53278a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f53279b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f53278a + ", upper=" + this.f53279b + ')';
    }
}
