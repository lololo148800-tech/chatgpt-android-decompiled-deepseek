package p1028u;

import android.gov.nist.core.Separators;
import java.util.Map;

/* JADX INFO: renamed from: u.c */
/* JADX INFO: loaded from: classes.dex */
public final class C20086c implements Map.Entry {

    /* JADX INFO: renamed from: Y */
    public final Object f63605Y;

    /* JADX INFO: renamed from: Z */
    public final Object f63606Z;

    /* JADX INFO: renamed from: o0 */
    public C20086c f63607o0;

    /* JADX INFO: renamed from: p0 */
    public C20086c f63608p0;

    public C20086c(Object obj, Object obj2) {
        this.f63605Y = obj;
        this.f63606Z = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C20086c)) {
            return false;
        }
        C20086c c20086c = (C20086c) obj;
        return this.f63605Y.equals(c20086c.f63605Y) && this.f63606Z.equals(c20086c.f63606Z);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f63605Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f63606Z;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f63605Y.hashCode() ^ this.f63606Z.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f63605Y + Separators.EQUALS + this.f63606Z;
    }
}
