package ao;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: ao.Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C11143Q implements Map.Entry, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final Object f33778Y;

    /* JADX INFO: renamed from: Z */
    public final Object f33779Z;

    public C11143Q(Object obj, Object obj2) {
        this.f33778Y = obj;
        this.f33779Z = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11143Q)) {
            return false;
        }
        C11143Q c11143q = (C11143Q) obj;
        return AbstractC16544l.m18089b(this.f33778Y, c11143q.f33778Y) && AbstractC16544l.m18089b(this.f33779Z, c11143q.f33779Z);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f33778Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f33779Z;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f33778Y;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f33779Z;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f33778Y + ", value=" + this.f33779Z + ')';
    }
}
