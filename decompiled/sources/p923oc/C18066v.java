package p923oc;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: oc.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C18066v extends AbstractC18048d {

    /* JADX INFO: renamed from: a */
    public final int f57627a;

    /* JADX INFO: renamed from: b */
    public final char f57628b;

    public C18066v(char c9, int i10) {
        this.f57627a = i10;
        this.f57628b = c9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18066v)) {
            return false;
        }
        C18066v c18066v = (C18066v) obj;
        return this.f57627a == c18066v.f57627a && this.f57628b == c18066v.f57628b;
    }

    public final int hashCode() {
        return (this.f57627a * 31) + this.f57628b;
    }

    public final String toString() {
        return "AstOrderedList(startNumber=" + this.f57627a + ", delimiter=" + this.f57628b + Separators.RPAREN;
    }
}
