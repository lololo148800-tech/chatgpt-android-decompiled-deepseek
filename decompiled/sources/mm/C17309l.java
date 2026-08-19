package mm;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: mm.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C17309l implements Serializable {

    /* JADX INFO: renamed from: Y */
    public final Object f55136Y;

    /* JADX INFO: renamed from: Z */
    public final Object f55137Z;

    public C17309l(Object obj, Object obj2) {
        this.f55136Y = obj;
        this.f55137Z = obj2;
    }

    /* JADX INFO: renamed from: a */
    public final Object m18977a() {
        return this.f55136Y;
    }

    /* JADX INFO: renamed from: b */
    public final Object m18978b() {
        return this.f55137Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17309l)) {
            return false;
        }
        C17309l c17309l = (C17309l) obj;
        return AbstractC16544l.m18089b(this.f55136Y, c17309l.f55136Y) && AbstractC16544l.m18089b(this.f55137Z, c17309l.f55137Z);
    }

    public final int hashCode() {
        Object obj = this.f55136Y;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f55137Z;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return Separators.LPAREN + this.f55136Y + ", " + this.f55137Z + ')';
    }
}
