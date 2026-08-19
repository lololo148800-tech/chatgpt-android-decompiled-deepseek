package p586Y0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: Y0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C9574z implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final C9569u f28812Y;

    /* JADX INFO: renamed from: Z */
    public final Iterator f28813Z;

    /* JADX INFO: renamed from: o0 */
    public int f28814o0;

    /* JADX INFO: renamed from: p0 */
    public Map.Entry f28815p0;

    /* JADX INFO: renamed from: q0 */
    public Map.Entry f28816q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f28817r0;

    public C9574z(C9569u c9569u, Iterator it, int i10) {
        this.f28817r0 = i10;
        this.f28812Y = c9569u;
        this.f28813Z = it;
        this.f28814o0 = c9569u.m10115a().f28778d;
        m10128a();
    }

    /* JADX INFO: renamed from: a */
    public final void m10128a() {
        this.f28815p0 = this.f28816q0;
        Iterator it = this.f28813Z;
        this.f28816q0 = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28816q0 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f28817r0) {
            case 0:
                m10128a();
                if (this.f28815p0 != null) {
                    return new C9573y(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.f28816q0;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                m10128a();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.f28816q0;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                m10128a();
                return entry2.getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C9569u c9569u = this.f28812Y;
        if (c9569u.m10115a().f28778d != this.f28814o0) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f28815p0;
        if (entry == null) {
            throw new IllegalStateException();
        }
        c9569u.remove(entry.getKey());
        this.f28815p0 = null;
        this.f28814o0 = c9569u.m10115a().f28778d;
    }
}
