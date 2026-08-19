package bb;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import p523V9.C8121k;

/* JADX INFO: renamed from: bb.g */
/* JADX INFO: loaded from: classes.dex */
public class C11313g extends C8121k implements SortedMap {

    /* JADX INFO: renamed from: r0 */
    public SortedSet f34228r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C11290O f34229s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11313g(C11290O c11290o, SortedMap sortedMap) {
        super(c11290o, sortedMap, 1);
        this.f34229s0 = c11290o;
    }

    /* JADX INFO: renamed from: b */
    public SortedSet mo12715b() {
        return new C11315h(this.f34229s0, mo12717d());
    }

    @Override // p523V9.C8121k, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f34228r0;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetMo12715b = mo12715b();
        this.f34228r0 = sortedSetMo12715b;
        return sortedSetMo12715b;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return mo12717d().comparator();
    }

    /* JADX INFO: renamed from: d */
    public SortedMap mo12717d() {
        return (SortedMap) this.f25458p0;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return mo12717d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C11313g(this.f34229s0, mo12717d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return mo12717d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C11313g(this.f34229s0, mo12717d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C11313g(this.f34229s0, mo12717d().tailMap(obj));
    }
}
