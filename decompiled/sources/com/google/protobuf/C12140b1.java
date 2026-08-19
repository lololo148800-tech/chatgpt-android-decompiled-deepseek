package com.google.protobuf;

import androidx.datastore.preferences.protobuf.C10962h0;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.protobuf.b1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12140b1 extends AbstractMap {

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ int f37014s0 = 0;

    /* JADX INFO: renamed from: Y */
    public final int f37015Y;

    /* JADX INFO: renamed from: p0 */
    public boolean f37018p0;

    /* JADX INFO: renamed from: q0 */
    public volatile C10962h0 f37019q0;

    /* JADX INFO: renamed from: Z */
    public List f37016Z = Collections.emptyList();

    /* JADX INFO: renamed from: o0 */
    public Map f37017o0 = Collections.emptyMap();

    /* JADX INFO: renamed from: r0 */
    public Map f37020r0 = Collections.emptyMap();

    public C12140b1(int i10) {
        this.f37015Y = i10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final int m13929a(Comparable comparable) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f37016Z.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((C12149e1) this.f37016Z.get(i12)).f37027Y);
                if (iCompareTo < 0) {
                    i13 = i12 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i12;
                    }
                    i10 = i12 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((C12149e1) this.f37016Z.get(i13)).f37027Y);
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((C12149e1) this.f37016Z.get(i12)).f37027Y);
                    if (iCompareTo < 0) {
                        i13 = i12 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i12;
                        }
                        i10 = i12 + 1;
                    }
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    /* JADX INFO: renamed from: b */
    public final void m13930b() {
        if (this.f37018p0) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Map.Entry m13931c(int i10) {
        return (Map.Entry) this.f37016Z.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m13930b();
        if (!this.f37016Z.isEmpty()) {
            this.f37016Z.clear();
        }
        if (this.f37017o0.isEmpty()) {
            return;
        }
        this.f37017o0.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m13929a(comparable) >= 0 || this.f37017o0.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final Iterable m13932d() {
        return this.f37017o0.isEmpty() ? AbstractC12153g.f37031b : this.f37017o0.entrySet();
    }

    /* JADX INFO: renamed from: e */
    public final SortedMap m13933e() {
        m13930b();
        if (this.f37017o0.isEmpty() && !(this.f37017o0 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f37017o0 = treeMap;
            this.f37020r0 = treeMap.descendingMap();
        }
        return (SortedMap) this.f37017o0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f37019q0 == null) {
            this.f37019q0 = new C10962h0(1, this);
        }
        return this.f37019q0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12140b1)) {
            return super.equals(obj);
        }
        C12140b1 c12140b1 = (C12140b1) obj;
        int size = size();
        if (size != c12140b1.size()) {
            return false;
        }
        int size2 = this.f37016Z.size();
        if (size2 != c12140b1.f37016Z.size()) {
            return ((AbstractSet) entrySet()).equals(c12140b1.entrySet());
        }
        for (int i10 = 0; i10 < size2; i10++) {
            if (!m13931c(i10).equals(c12140b1.m13931c(i10))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f37017o0.equals(c12140b1.f37017o0);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m13930b();
        int iM13929a = m13929a(comparable);
        if (iM13929a >= 0) {
            return ((C12149e1) this.f37016Z.get(iM13929a)).setValue(obj);
        }
        m13930b();
        boolean zIsEmpty = this.f37016Z.isEmpty();
        int i10 = this.f37015Y;
        if (zIsEmpty && !(this.f37016Z instanceof ArrayList)) {
            this.f37016Z = new ArrayList(i10);
        }
        int i11 = -(iM13929a + 1);
        if (i11 >= i10) {
            return m13933e().put(comparable, obj);
        }
        if (this.f37016Z.size() == i10) {
            C12149e1 c12149e1 = (C12149e1) this.f37016Z.remove(i10 - 1);
            m13933e().put(c12149e1.f37027Y, c12149e1.f37028Z);
        }
        this.f37016Z.add(i11, new C12149e1(this, comparable, obj));
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final Object m13935g(int i10) {
        m13930b();
        Object obj = ((C12149e1) this.f37016Z.remove(i10)).f37028Z;
        if (!this.f37017o0.isEmpty()) {
            Iterator it = m13933e().entrySet().iterator();
            List list = this.f37016Z;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C12149e1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM13929a = m13929a(comparable);
        return iM13929a >= 0 ? ((C12149e1) this.f37016Z.get(iM13929a)).f37028Z : this.f37017o0.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f37016Z.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += ((C12149e1) this.f37016Z.get(i10)).hashCode();
        }
        return this.f37017o0.size() > 0 ? iHashCode + this.f37017o0.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m13930b();
        Comparable comparable = (Comparable) obj;
        int iM13929a = m13929a(comparable);
        if (iM13929a >= 0) {
            return m13935g(iM13929a);
        }
        if (this.f37017o0.isEmpty()) {
            return null;
        }
        return this.f37017o0.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f37017o0.size() + this.f37016Z.size();
    }
}
