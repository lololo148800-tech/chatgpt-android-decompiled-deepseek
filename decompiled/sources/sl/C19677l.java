package sl;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1726d;

/* JADX INFO: renamed from: sl.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C19677l implements Map.Entry, InterfaceC1726d {

    /* JADX INFO: renamed from: Y */
    public final Object f62368Y;

    /* JADX INFO: renamed from: Z */
    public Object f62369Z;

    public C19677l(Object obj, Object obj2) {
        this.f62368Y = obj;
        this.f62369Z = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC16544l.m18089b(entry.getKey(), this.f62368Y) && AbstractC16544l.m18089b(entry.getValue(), this.f62369Z);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f62368Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f62369Z;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f62368Y;
        AbstractC16544l.m18091d(obj);
        int iHashCode = obj.hashCode() + 527;
        Object obj2 = this.f62369Z;
        AbstractC16544l.m18091d(obj2);
        return obj2.hashCode() + iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f62369Z = obj;
        return obj;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f62368Y);
        sb2.append('=');
        sb2.append(this.f62369Z);
        return sb2.toString();
    }
}
