package bb;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
import p523V9.C8113j;

/* JADX INFO: renamed from: bb.e */
/* JADX INFO: loaded from: classes.dex */
public final class C11309e extends C11315h implements NavigableSet {

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C11290O f34226q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11309e(C11290O c11290o, NavigableMap navigableMap) {
        super(c11290o, navigableMap);
        this.f34226q0 = c11290o;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return mo12720f().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C11305c) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C11309e(this.f34226q0, mo12720f().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return mo12720f().floorKey(obj);
    }

    @Override // bb.C11315h, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return mo12720f().higherKey(obj);
    }

    @Override // bb.C11315h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final NavigableMap mo12720f() {
        return (NavigableMap) ((SortedMap) this.f34219Z);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return mo12720f().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C8113j c8113j = (C8113j) iterator();
        if (!c8113j.hasNext()) {
            return null;
        }
        Object next = c8113j.next();
        c8113j.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // bb.C11315h, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // bb.C11315h, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z6) {
        return new C11309e(this.f34226q0, mo12720f().headMap(obj, z6));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z6, Object obj2, boolean z10) {
        return new C11309e(this.f34226q0, mo12720f().subMap(obj, z6, obj2, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z6) {
        return new C11309e(this.f34226q0, mo12720f().tailMap(obj, z6));
    }
}
