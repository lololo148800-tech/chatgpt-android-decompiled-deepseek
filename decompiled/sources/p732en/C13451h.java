package p732en;

import android.gov.nist.core.Separators;
import java.util.Map;

/* JADX INFO: renamed from: en.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C13451h implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: Y */
    public final Comparable f42586Y;

    /* JADX INFO: renamed from: Z */
    public Object f42587Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13447d f42588o0;

    public C13451h(C13447d c13447d, Comparable comparable, Object obj) {
        this.f42588o0 = c13447d;
        this.f42586Y = comparable;
        this.f42587Z = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f42586Y.compareTo(((C13451h) obj).f42586Y);
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
        Comparable comparable = this.f42586Y;
        if (comparable == null) {
            zEquals = key == null;
        } else {
            zEquals = comparable.equals(key);
        }
        if (zEquals) {
            Object obj2 = this.f42587Z;
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
        return this.f42586Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f42587Z;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f42586Y;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f42587Z;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f42588o0.m14970b();
        Object obj2 = this.f42587Z;
        this.f42587Z = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f42586Y);
        String strValueOf2 = String.valueOf(this.f42587Z);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + strValueOf.length() + 1);
        sb2.append(strValueOf);
        sb2.append(Separators.EQUALS);
        sb2.append(strValueOf2);
        return sb2.toString();
    }
}
