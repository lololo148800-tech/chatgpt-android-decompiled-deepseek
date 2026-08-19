package bb;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p523V9.C8121k;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: bb.d */
/* JADX INFO: loaded from: classes.dex */
public final class C11307d extends C11313g implements NavigableMap {

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C11290O f34223t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11307d(C11290O c11290o, NavigableMap navigableMap) {
        super(c11290o, navigableMap);
        this.f34223t0 = c11290o;
    }

    @Override // bb.C11313g
    /* JADX INFO: renamed from: b */
    public final SortedSet mo12715b() {
        return new C11309e(this.f34223t0, mo12717d());
    }

    @Override // bb.C11313g
    /* JADX INFO: renamed from: c */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = mo12717d().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return m8627a(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return mo12717d().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C11307d(this.f34223t0, mo12717d().descendingMap());
    }

    /* JADX INFO: renamed from: e */
    public final C11332y m12718e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        List list = (List) this.f34223t0.f34183r0.get();
        list.addAll((Collection) entry.getValue());
        it.remove();
        return new C11332y(entry.getKey(), DesugarCollections.unmodifiableList(list));
    }

    @Override // bb.C11313g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final NavigableMap mo12717d() {
        return (NavigableMap) ((SortedMap) this.f25458p0);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = mo12717d().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return m8627a(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = mo12717d().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return m8627a(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return mo12717d().floorKey(obj);
    }

    @Override // bb.C11313g, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = mo12717d().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return m8627a(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return mo12717d().higherKey(obj);
    }

    @Override // bb.C11313g, p523V9.C8121k, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = mo12717d().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return m8627a(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = mo12717d().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return m8627a(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return mo12717d().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return m12718e(((C11303b) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return m12718e(((C11303b) ((C8121k) descendingMap()).entrySet()).iterator());
    }

    @Override // bb.C11313g, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // bb.C11313g, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z6) {
        return new C11307d(this.f34223t0, mo12717d().headMap(obj, z6));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z6, Object obj2, boolean z10) {
        return new C11307d(this.f34223t0, mo12717d().subMap(obj, z6, obj2, z10));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z6) {
        return new C11307d(this.f34223t0, mo12717d().tailMap(obj, z6));
    }
}
