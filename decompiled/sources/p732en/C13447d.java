package p732en;

import androidx.datastore.preferences.protobuf.C10962h0;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: en.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C13447d extends AbstractMap {

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ int f42578r0 = 0;

    /* JADX INFO: renamed from: Y */
    public final int f42579Y;

    /* JADX INFO: renamed from: Z */
    public List f42580Z = Collections.emptyList();

    /* JADX INFO: renamed from: o0 */
    public Map f42581o0 = Collections.emptyMap();

    /* JADX INFO: renamed from: p0 */
    public boolean f42582p0;

    /* JADX INFO: renamed from: q0 */
    public volatile C10962h0 f42583q0;

    public C13447d(int i10) {
        this.f42579Y = i10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final int m14969a(Comparable comparable) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f42580Z.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((C13451h) this.f42580Z.get(i12)).f42586Y);
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
            int iCompareTo2 = comparable.compareTo(((C13451h) this.f42580Z.get(i13)).f42586Y);
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((C13451h) this.f42580Z.get(i12)).f42586Y);
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
    public final void m14970b() {
        if (this.f42582p0) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Iterable m14971c() {
        return this.f42581o0.isEmpty() ? AbstractC13450g.f42585b : this.f42581o0.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m14970b();
        if (!this.f42580Z.isEmpty()) {
            this.f42580Z.clear();
        }
        if (this.f42581o0.isEmpty()) {
            return;
        }
        this.f42581o0.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m14969a(comparable) >= 0 || this.f42581o0.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final SortedMap m14972d() {
        m14970b();
        if (this.f42581o0.isEmpty() && !(this.f42581o0 instanceof TreeMap)) {
            this.f42581o0 = new TreeMap();
        }
        return (SortedMap) this.f42581o0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m14970b();
        int iM14969a = m14969a(comparable);
        if (iM14969a >= 0) {
            return ((C13451h) this.f42580Z.get(iM14969a)).setValue(obj);
        }
        m14970b();
        boolean zIsEmpty = this.f42580Z.isEmpty();
        int i10 = this.f42579Y;
        if (zIsEmpty && !(this.f42580Z instanceof ArrayList)) {
            this.f42580Z = new ArrayList(i10);
        }
        int i11 = -(iM14969a + 1);
        if (i11 >= i10) {
            return m14972d().put(comparable, obj);
        }
        if (this.f42580Z.size() == i10) {
            C13451h c13451h = (C13451h) this.f42580Z.remove(i10 - 1);
            m14972d().put(c13451h.f42586Y, c13451h.f42587Z);
        }
        this.f42580Z.add(i11, new C13451h(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f42583q0 == null) {
            this.f42583q0 = new C10962h0(3, this);
        }
        return this.f42583q0;
    }

    /* JADX INFO: renamed from: f */
    public final Object m14974f(int i10) {
        m14970b();
        Object obj = ((C13451h) this.f42580Z.remove(i10)).f42587Z;
        if (!this.f42581o0.isEmpty()) {
            Iterator it = m14972d().entrySet().iterator();
            List list = this.f42580Z;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C13451h(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM14969a = m14969a(comparable);
        return iM14969a >= 0 ? ((C13451h) this.f42580Z.get(iM14969a)).f42587Z : this.f42581o0.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m14970b();
        Comparable comparable = (Comparable) obj;
        int iM14969a = m14969a(comparable);
        if (iM14969a >= 0) {
            return m14974f(iM14969a);
        }
        if (this.f42581o0.isEmpty()) {
            return null;
        }
        return this.f42581o0.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f42581o0.size() + this.f42580Z.size();
    }
}
