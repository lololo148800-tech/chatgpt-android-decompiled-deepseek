package bb;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: bb.h */
/* JADX INFO: loaded from: classes.dex */
public class C11315h extends C11305c implements SortedSet {

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11290O f34230p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11315h(C11290O c11290o, SortedMap sortedMap) {
        super(c11290o, sortedMap);
        this.f34230p0 = c11290o;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return mo12720f().comparator();
    }

    /* JADX INFO: renamed from: f */
    public SortedMap mo12720f() {
        return (SortedMap) this.f34219Z;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return mo12720f().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C11315h(this.f34230p0, mo12720f().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return mo12720f().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C11315h(this.f34230p0, mo12720f().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C11315h(this.f34230p0, mo12720f().tailMap(obj));
    }
}
