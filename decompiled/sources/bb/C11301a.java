package bb;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p817j$.util.Objects;

/* JADX INFO: renamed from: bb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11301a implements Iterator {

    /* JADX INFO: renamed from: Y */
    public final Iterator f34211Y;

    /* JADX INFO: renamed from: Z */
    public Object f34212Z = null;

    /* JADX INFO: renamed from: o0 */
    public Collection f34213o0 = null;

    /* JADX INFO: renamed from: p0 */
    public Iterator f34214p0 = EnumC11283H.f34173Y;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C11290O f34215q0;

    public C11301a(C11290O c11290o) {
        this.f34215q0 = c11290o;
        this.f34211Y = c11290o.f34181p0.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34211Y.hasNext() || this.f34214p0.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f34214p0.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f34211Y.next();
            this.f34212Z = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f34213o0 = collection;
            this.f34214p0 = collection.iterator();
        }
        return this.f34214p0.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f34214p0.remove();
        Collection collection = this.f34213o0;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f34211Y.remove();
        }
        this.f34215q0.f34182q0--;
    }
}
