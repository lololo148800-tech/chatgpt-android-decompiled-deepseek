package om;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1726d;

/* JADX INFO: renamed from: om.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C18237d implements Map.Entry, InterfaceC1726d {

    /* JADX INFO: renamed from: Y */
    public final C18238e f58107Y;

    /* JADX INFO: renamed from: Z */
    public final int f58108Z;

    /* JADX INFO: renamed from: o0 */
    public final int f58109o0;

    public C18237d(C18238e map, int i10) {
        AbstractC16544l.m18094g(map, "map");
        this.f58107Y = map;
        this.f58108Z = i10;
        this.f58109o0 = map.f58118t0;
    }

    /* JADX INFO: renamed from: a */
    public final void m19753a() {
        if (this.f58107Y.f58118t0 != this.f58109o0) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC16544l.m18089b(entry.getKey(), getKey()) && AbstractC16544l.m18089b(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        m19753a();
        return this.f58107Y.f58111Y[this.f58108Z];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m19753a();
        Object[] objArr = this.f58107Y.f58112Z;
        AbstractC16544l.m18091d(objArr);
        return objArr[this.f58108Z];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        m19753a();
        C18238e c18238e = this.f58107Y;
        c18238e.m19756c();
        Object[] objArr = c18238e.f58112Z;
        if (objArr == null) {
            int length = c18238e.f58111Y.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c18238e.f58112Z = objArr;
        }
        int i10 = this.f58108Z;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
