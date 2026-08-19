package bb;

import java.util.Map;
import p499U9.AbstractC7589s;

/* JADX INFO: renamed from: bb.p */
/* JADX INFO: loaded from: classes.dex */
public final class C11323p extends AbstractC11317j {

    /* JADX INFO: renamed from: Y */
    public final Object f34241Y;

    /* JADX INFO: renamed from: Z */
    public int f34242Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11324q f34243o0;

    public C11323p(C11324q c11324q, int i10) {
        this.f34243o0 = c11324q;
        Object obj = C11324q.f34244v0;
        this.f34241Y = c11324q.m12751j()[i10];
        this.f34242Z = i10;
    }

    /* JADX INFO: renamed from: a */
    public final void m12742a() {
        int i10 = this.f34242Z;
        Object obj = this.f34241Y;
        C11324q c11324q = this.f34243o0;
        if (i10 != -1 && i10 < c11324q.size()) {
            if (AbstractC7589s.m7931f(obj, c11324q.m12751j()[this.f34242Z])) {
                return;
            }
        }
        Object obj2 = C11324q.f34244v0;
        this.f34242Z = c11324q.m12746d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f34241Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C11324q c11324q = this.f34243o0;
        Map mapM12744b = c11324q.m12744b();
        if (mapM12744b != null) {
            return mapM12744b.get(this.f34241Y);
        }
        m12742a();
        int i10 = this.f34242Z;
        if (i10 == -1) {
            return null;
        }
        return c11324q.m12752k()[i10];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C11324q c11324q = this.f34243o0;
        Map mapM12744b = c11324q.m12744b();
        Object obj2 = this.f34241Y;
        if (mapM12744b != null) {
            return mapM12744b.put(obj2, obj);
        }
        m12742a();
        int i10 = this.f34242Z;
        if (i10 == -1) {
            c11324q.put(obj2, obj);
            return null;
        }
        Object obj3 = c11324q.m12752k()[i10];
        c11324q.m12752k()[this.f34242Z] = obj;
        return obj3;
    }
}
