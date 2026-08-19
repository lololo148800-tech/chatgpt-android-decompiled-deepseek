package androidx.datastore.preferences.protobuf;

import android.gov.nist.core.Separators;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10958f0 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: Y */
    public final Comparable f33032Y;

    /* JADX INFO: renamed from: Z */
    public Object f33033Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C10952c0 f33034o0;

    public C10958f0(C10952c0 c10952c0, Comparable comparable, Object obj) {
        this.f33034o0 = c10952c0;
        this.f33032Y = comparable;
        this.f33033Z = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f33032Y.compareTo(((C10958f0) obj).f33032Y);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f33032Y;
        if (comparable == null) {
            zEquals = key == null;
        } else {
            zEquals = comparable.equals(key);
        }
        if (zEquals) {
            Object obj2 = this.f33033Z;
            Object value = entry.getValue();
            if (obj2 == null) {
                zEquals2 = value == null;
            } else {
                zEquals2 = obj2.equals(value);
            }
            if (zEquals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f33032Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f33033Z;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f33032Y;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f33033Z;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f33034o0.m11574b();
        Object obj2 = this.f33033Z;
        this.f33033Z = obj;
        return obj2;
    }

    public final String toString() {
        return this.f33032Y + Separators.EQUALS + this.f33033Z;
    }
}
