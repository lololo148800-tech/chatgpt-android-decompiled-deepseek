package androidx.datastore.preferences.protobuf;

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

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10952c0 extends AbstractMap {

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ int f33020s0 = 0;

    /* JADX INFO: renamed from: Y */
    public final int f33021Y;

    /* JADX INFO: renamed from: p0 */
    public boolean f33024p0;

    /* JADX INFO: renamed from: q0 */
    public volatile C10962h0 f33025q0;

    /* JADX INFO: renamed from: Z */
    public List f33022Z = Collections.emptyList();

    /* JADX INFO: renamed from: o0 */
    public Map f33023o0 = Collections.emptyMap();

    /* JADX INFO: renamed from: r0 */
    public Map f33026r0 = Collections.emptyMap();

    public C10952c0(int i10) {
        this.f33021Y = i10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final int m11573a(Comparable comparable) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f33022Z.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((C10958f0) this.f33022Z.get(i12)).f33032Y);
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
            int iCompareTo2 = comparable.compareTo(((C10958f0) this.f33022Z.get(i13)).f33032Y);
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((C10958f0) this.f33022Z.get(i12)).f33032Y);
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
    public final void m11574b() {
        if (this.f33024p0) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Map.Entry m11575c(int i10) {
        return (Map.Entry) this.f33022Z.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m11574b();
        if (!this.f33022Z.isEmpty()) {
            this.f33022Z.clear();
        }
        if (this.f33023o0.isEmpty()) {
            return;
        }
        this.f33023o0.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m11573a(comparable) >= 0 || this.f33023o0.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final Iterable m11576d() {
        return this.f33023o0.isEmpty() ? AbstractC10937P.f32981b : this.f33023o0.entrySet();
    }

    /* JADX INFO: renamed from: e */
    public final SortedMap m11577e() {
        m11574b();
        if (this.f33023o0.isEmpty() && !(this.f33023o0 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f33023o0 = treeMap;
            this.f33026r0 = treeMap.descendingMap();
        }
        return (SortedMap) this.f33023o0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f33025q0 == null) {
            this.f33025q0 = new C10962h0(0, this);
        }
        return this.f33025q0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10952c0)) {
            return super.equals(obj);
        }
        C10952c0 c10952c0 = (C10952c0) obj;
        int size = size();
        if (size != c10952c0.size()) {
            return false;
        }
        int size2 = this.f33022Z.size();
        if (size2 != c10952c0.f33022Z.size()) {
            return ((AbstractSet) entrySet()).equals(c10952c0.entrySet());
        }
        for (int i10 = 0; i10 < size2; i10++) {
            if (!m11575c(i10).equals(c10952c0.m11575c(i10))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f33023o0.equals(c10952c0.f33023o0);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final Object m11578f(Comparable comparable, Object obj) {
        m11574b();
        int iM11573a = m11573a(comparable);
        if (iM11573a >= 0) {
            return ((C10958f0) this.f33022Z.get(iM11573a)).setValue(obj);
        }
        m11574b();
        boolean zIsEmpty = this.f33022Z.isEmpty();
        int i10 = this.f33021Y;
        if (zIsEmpty && !(this.f33022Z instanceof ArrayList)) {
            this.f33022Z = new ArrayList(i10);
        }
        int i11 = -(iM11573a + 1);
        if (i11 >= i10) {
            return m11577e().put(comparable, obj);
        }
        if (this.f33022Z.size() == i10) {
            C10958f0 c10958f0 = (C10958f0) this.f33022Z.remove(i10 - 1);
            m11577e().put(c10958f0.f33032Y, c10958f0.f33033Z);
        }
        this.f33022Z.add(i11, new C10958f0(this, comparable, obj));
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final Object m11579g(int i10) {
        m11574b();
        Object obj = ((C10958f0) this.f33022Z.remove(i10)).f33033Z;
        if (!this.f33023o0.isEmpty()) {
            Iterator it = m11577e().entrySet().iterator();
            List list = this.f33022Z;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C10958f0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM11573a = m11573a(comparable);
        return iM11573a >= 0 ? ((C10958f0) this.f33022Z.get(iM11573a)).f33033Z : this.f33023o0.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f33022Z.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += ((C10958f0) this.f33022Z.get(i10)).hashCode();
        }
        return this.f33023o0.size() > 0 ? iHashCode + this.f33023o0.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        if (obj == null) {
            return m11578f(null, obj2);
        }
        throw new ClassCastException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m11574b();
        Comparable comparable = (Comparable) obj;
        int iM11573a = m11573a(comparable);
        if (iM11573a >= 0) {
            return m11579g(iM11573a);
        }
        if (this.f33023o0.isEmpty()) {
            return null;
        }
        return this.f33023o0.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f33023o0.size() + this.f33022Z.size();
    }
}
