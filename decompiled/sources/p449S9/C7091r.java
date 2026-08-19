package p449S9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p003A1.C0195P;
import p817j$.util.Objects;

/* JADX INFO: renamed from: S9.r */
/* JADX INFO: loaded from: classes.dex */
public final class C7091r extends AbstractC7083n implements NavigableMap {

    /* JADX INFO: renamed from: r0 */
    public static final C7096v f22573r0;

    /* JADX INFO: renamed from: s0 */
    public static final C7091r f22574s0;

    /* JADX INFO: renamed from: o0 */
    public final transient C7100z f22575o0;

    /* JADX INFO: renamed from: p0 */
    public final transient AbstractC7081m f22576p0;

    /* JADX INFO: renamed from: q0 */
    public final transient C7091r f22577q0;

    static {
        C7096v c7096v = C7096v.f22584Y;
        f22573r0 = c7096v;
        C7100z c7100zM7505w = AbstractC7093s.m7505w(c7096v);
        C7073i c7073i = AbstractC7081m.f22562Z;
        f22574s0 = new C7091r(c7100zM7505w, C7098x.f22585q0, null);
    }

    public C7091r(C7100z c7100z, AbstractC7081m abstractC7081m, C7091r c7091r) {
        this.f22575o0 = c7100z;
        this.f22576p0 = abstractC7081m;
        this.f22577q0 = c7091r;
    }

    /* JADX INFO: renamed from: b */
    public static C7091r m7498b(TreeMap treeMap) {
        int i10 = 0;
        Comparator comparator = treeMap.comparator();
        C7096v c7096v = f22573r0;
        boolean zEquals = comparator == null ? true : c7096v.equals(comparator);
        Collection collectionEntrySet = treeMap.entrySet();
        Map.Entry[] entryArr = AbstractC7083n.f22564Z;
        if (!(collectionEntrySet instanceof Collection)) {
            Iterator it = collectionEntrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collectionEntrySet = arrayList;
        }
        Map.Entry[] entryArr2 = (Map.Entry[]) collectionEntrySet.toArray(entryArr);
        int length = entryArr2.length;
        if (length == 0) {
            return m7499c(c7096v);
        }
        if (length == 1) {
            Map.Entry entry = entryArr2[0];
            Objects.requireNonNull(entry);
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object[] objArr = {key};
            for (int i11 = 0; i11 < 1; i11++) {
                if (objArr[i11] == null) {
                    throw new NullPointerException(AbstractC10763a.m11048f(i11, "at index "));
                }
            }
            C7100z c7100z = new C7100z(AbstractC7081m.m7491s(1, objArr), c7096v);
            Object[] objArr2 = {value};
            while (i10 < 1) {
                if (objArr2[i10] == null) {
                    throw new NullPointerException(AbstractC10763a.m11048f(i10, "at index "));
                }
                i10++;
            }
            return new C7091r(c7100z, AbstractC7081m.m7491s(1, objArr2), null);
        }
        Object[] objArr3 = new Object[length];
        Object[] objArr4 = new Object[length];
        if (zEquals) {
            while (i10 < length) {
                Map.Entry entry2 = entryArr2[i10];
                Objects.requireNonNull(entry2);
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                AbstractC7057a.m7461f(key2, value2);
                objArr3[i10] = key2;
                objArr4[i10] = value2;
                i10++;
            }
        } else {
            Arrays.sort(entryArr2, 0, length, new C0195P(c7096v, 4));
            Map.Entry entry3 = entryArr2[0];
            Objects.requireNonNull(entry3);
            Object key3 = entry3.getKey();
            objArr3[0] = key3;
            Object value3 = entry3.getValue();
            objArr4[0] = value3;
            AbstractC7057a.m7461f(objArr3[0], value3);
            int i12 = 1;
            while (i12 < length) {
                Map.Entry entry4 = entryArr2[i12 - 1];
                Objects.requireNonNull(entry4);
                Map.Entry entry5 = entryArr2[i12];
                Objects.requireNonNull(entry5);
                Object key4 = entry5.getKey();
                Object value4 = entry5.getValue();
                AbstractC7057a.m7461f(key4, value4);
                objArr3[i12] = key4;
                objArr4[i12] = value4;
                if (c7096v.compare(key3, key4) == 0) {
                    throw new IllegalArgumentException(AbstractC10763a.m11055m("Multiple entries with same key: ", String.valueOf(entry4), " and ", String.valueOf(entry5)));
                }
                i12++;
                key3 = key4;
            }
        }
        return new C7091r(new C7100z(AbstractC7081m.m7491s(length, objArr3), c7096v), AbstractC7081m.m7491s(length, objArr4), null);
    }

    /* JADX INFO: renamed from: c */
    public static C7091r m7499c(Comparator comparator) {
        if (C7096v.f22584Y.equals(comparator)) {
            return f22574s0;
        }
        C7100z c7100zM7505w = AbstractC7093s.m7505w(comparator);
        C7073i c7073i = AbstractC7081m.f22562Z;
        return new C7091r(c7100zM7505w, C7098x.f22585q0, null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Map.Entry entryCeilingEntry = ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return entryCeilingEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f22575o0.f22580p0;
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C7091r headMap(Object obj, boolean z6) {
        obj.getClass();
        return m7504h(0, this.f22575o0.m7509x(obj, z6));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.f22575o0.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        C7091r c7091r = this.f22577q0;
        if (c7091r != null) {
            return c7091r;
        }
        boolean zIsEmpty = isEmpty();
        C7100z c7100z = this.f22575o0;
        if (!zIsEmpty) {
            return new C7091r((C7100z) c7100z.descendingSet(), this.f22576p0.mo7489q(), this);
        }
        Comparator comparator = c7100z.f22580p0;
        return m7499c((comparator instanceof AbstractC7097w ? (AbstractC7097w) comparator : new C7069g(comparator)).mo7426a());
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C7091r subMap(Object obj, boolean z6, Object obj2, boolean z10) {
        obj.getClass();
        obj2.getClass();
        if (this.f22575o0.f22580p0.compare(obj, obj2) <= 0) {
            return headMap(obj2, z10).tailMap(obj, z6);
        }
        throw new IllegalArgumentException(AbstractC7057a.m7459d("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C7091r tailMap(Object obj, boolean z6) {
        obj.getClass();
        return m7504h(this.f22575o0.m7510y(obj, z6), this.f22576p0.size());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().mo7429s().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f22575o0.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Map.Entry entryFloorEntry = floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return entryFloorEntry.getKey();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005  */
    @Override // p449S9.AbstractC7083n, java.util.Map
    public final Object get(Object obj) {
        int iBinarySearch;
        C7100z c7100z = this.f22575o0;
        if (obj == null) {
            iBinarySearch = -1;
        } else {
            try {
                iBinarySearch = Collections.binarySearch(c7100z.f22596r0, obj, c7100z.f22580p0);
                if (iBinarySearch < 0) {
                    iBinarySearch = -1;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.f22576p0.get(iBinarySearch);
    }

    /* JADX INFO: renamed from: h */
    public final C7091r m7504h(int i10, int i11) {
        AbstractC7081m abstractC7081m = this.f22576p0;
        if (i10 == 0) {
            if (i11 == abstractC7081m.size()) {
                return this;
            }
            i10 = 0;
        }
        C7100z c7100z = this.f22575o0;
        return i10 == i11 ? m7499c(c7100z.f22580p0) : new C7091r(c7100z.m7511z(i10, i11), abstractC7081m.subList(i10, i11), null);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Map.Entry entryHigherEntry = higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return entryHigherEntry.getKey();
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return this.f22575o0;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().mo7429s().get(this.f22576p0.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f22575o0.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Map.Entry entryLowerEntry = lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return entryLowerEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.f22575o0;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f22576p0.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Collection values() {
        return this.f22576p0;
    }
}
