package bb;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import p499U9.AbstractC7589s;
import p817j$.util.Objects;

/* JADX INFO: renamed from: bb.o */
/* JADX INFO: loaded from: classes.dex */
public final class C11322o extends AbstractSet {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f34239Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11324q f34240Z;

    public /* synthetic */ C11322o(C11324q c11324q, int i10) {
        this.f34239Y = i10;
        this.f34240Z = c11324q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f34239Y) {
            case 0:
                this.f34240Z.clear();
                break;
            default:
                this.f34240Z.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f34239Y) {
            case 0:
                C11324q c11324q = this.f34240Z;
                Map mapM12744b = c11324q.m12744b();
                if (mapM12744b != null) {
                    return mapM12744b.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iM12746d = c11324q.m12746d(entry.getKey());
                    if (iM12746d != -1 && AbstractC7589s.m7931f(c11324q.m12752k()[iM12746d], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f34240Z.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f34239Y) {
            case 0:
                C11324q c11324q = this.f34240Z;
                Map mapM12744b = c11324q.m12744b();
                return mapM12744b != null ? mapM12744b.entrySet().iterator() : new C11321n(c11324q, 1);
            default:
                C11324q c11324q2 = this.f34240Z;
                Map mapM12744b2 = c11324q2.m12744b();
                return mapM12744b2 != null ? mapM12744b2.keySet().iterator() : new C11321n(c11324q2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f34239Y) {
            case 0:
                C11324q c11324q = this.f34240Z;
                Map mapM12744b = c11324q.m12744b();
                if (mapM12744b != null) {
                    return mapM12744b.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c11324q.m12748f()) {
                        int iM12745c = c11324q.m12745c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c11324q.f34245Y;
                        Objects.requireNonNull(obj2);
                        int iM12734n = AbstractC11320m.m12734n(key, value, iM12745c, obj2, c11324q.m12750h(), c11324q.m12751j(), c11324q.m12752k());
                        if (iM12734n != -1) {
                            c11324q.m12747e(iM12734n, iM12745c);
                            c11324q.f34250r0--;
                            c11324q.f34249q0 += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C11324q c11324q2 = this.f34240Z;
                Map mapM12744b2 = c11324q2.m12744b();
                if (mapM12744b2 != null) {
                    return mapM12744b2.keySet().remove(obj);
                }
                return c11324q2.m12749g(obj) != C11324q.f34244v0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f34239Y) {
            case 0:
                break;
        }
        return this.f34240Z.size();
    }
}
