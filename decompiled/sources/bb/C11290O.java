package bb;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import p523V9.C8121k;

/* JADX INFO: renamed from: bb.O */
/* JADX INFO: loaded from: classes.dex */
public final class C11290O extends AbstractC11318k implements Serializable {

    /* JADX INFO: renamed from: p0 */
    public transient Map f34181p0;

    /* JADX INFO: renamed from: q0 */
    public transient int f34182q0;

    /* JADX INFO: renamed from: r0 */
    public transient C11289N f34183r0;

    @Override // bb.AbstractC11318k
    /* JADX INFO: renamed from: a */
    public final C8121k mo12709a() {
        C8121k c11313g;
        C8121k c8121k = this.f34234o0;
        if (c8121k == null) {
            Map map = this.f34181p0;
            if (map instanceof NavigableMap) {
                c11313g = new C11307d(this, (NavigableMap) map);
            } else {
                c11313g = map instanceof SortedMap ? new C11313g(this, (SortedMap) map) : new C8121k(this, map, 1);
            }
            c8121k = c11313g;
            this.f34234o0 = c8121k;
        }
        return c8121k;
    }

    /* JADX INFO: renamed from: b */
    public final void m12710b() {
        Map map = this.f34181p0;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f34182q0 = 0;
    }
}
