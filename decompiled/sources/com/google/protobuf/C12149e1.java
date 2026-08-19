package com.google.protobuf;

import android.gov.nist.core.Separators;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.e1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12149e1 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: Y */
    public final Comparable f37027Y;

    /* JADX INFO: renamed from: Z */
    public Object f37028Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C12140b1 f37029o0;

    public C12149e1(C12140b1 c12140b1, Comparable comparable, Object obj) {
        this.f37029o0 = c12140b1;
        this.f37027Y = comparable;
        this.f37028Z = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f37027Y.compareTo(((C12149e1) obj).f37027Y);
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
        Comparable comparable = this.f37027Y;
        if (comparable == null) {
            zEquals = key == null;
        } else {
            zEquals = comparable.equals(key);
        }
        if (zEquals) {
            Object obj2 = this.f37028Z;
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
        return this.f37027Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f37028Z;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f37027Y;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f37028Z;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f37029o0.m13930b();
        Object obj2 = this.f37028Z;
        this.f37028Z = obj;
        return obj2;
    }

    public final String toString() {
        return this.f37027Y + Separators.EQUALS + this.f37028Z;
    }
}
