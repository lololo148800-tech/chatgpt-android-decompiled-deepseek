package p690cp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: cp.u */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC12935u {

    /* JADX INFO: renamed from: a */
    public AbstractC12935u f41092a = null;

    /* JADX INFO: renamed from: b */
    public AbstractC12935u f41093b = null;

    /* JADX INFO: renamed from: c */
    public AbstractC12935u f41094c = null;

    /* JADX INFO: renamed from: d */
    public AbstractC12935u f41095d = null;

    /* JADX INFO: renamed from: e */
    public AbstractC12935u f41096e = null;

    /* JADX INFO: renamed from: f */
    public ArrayList f41097f = null;

    /* JADX INFO: renamed from: a */
    public abstract void mo14588a(InterfaceC12914E interfaceC12914E);

    /* JADX INFO: renamed from: b */
    public final void m14592b(C12940z c12940z) {
        if (this.f41097f == null) {
            this.f41097f = new ArrayList();
        }
        this.f41097f.add(c12940z);
    }

    /* JADX INFO: renamed from: c */
    public final void m14593c(AbstractC12935u abstractC12935u) {
        abstractC12935u.m14598k();
        abstractC12935u.mo14591h(this);
        AbstractC12935u abstractC12935u2 = this.f41094c;
        if (abstractC12935u2 == null) {
            this.f41093b = abstractC12935u;
            this.f41094c = abstractC12935u;
        } else {
            abstractC12935u2.f41096e = abstractC12935u;
            abstractC12935u.f41095d = abstractC12935u2;
            this.f41094c = abstractC12935u;
        }
    }

    /* JADX INFO: renamed from: d */
    public AbstractC12935u mo14590d() {
        return this.f41092a;
    }

    /* JADX INFO: renamed from: e */
    public final List m14594e() {
        ArrayList arrayList = this.f41097f;
        return arrayList != null ? DesugarCollections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    /* JADX INFO: renamed from: f */
    public final void m14595f(AbstractC12935u abstractC12935u) {
        abstractC12935u.m14598k();
        AbstractC12935u abstractC12935u2 = this.f41096e;
        abstractC12935u.f41096e = abstractC12935u2;
        if (abstractC12935u2 != null) {
            abstractC12935u2.f41095d = abstractC12935u;
        }
        abstractC12935u.f41095d = this;
        this.f41096e = abstractC12935u;
        AbstractC12935u abstractC12935u3 = this.f41092a;
        abstractC12935u.f41092a = abstractC12935u3;
        if (abstractC12935u.f41096e == null) {
            abstractC12935u3.f41094c = abstractC12935u;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m14596g(AbstractC12935u abstractC12935u) {
        abstractC12935u.m14598k();
        AbstractC12935u abstractC12935u2 = this.f41095d;
        abstractC12935u.f41095d = abstractC12935u2;
        if (abstractC12935u2 != null) {
            abstractC12935u2.f41096e = abstractC12935u;
        }
        abstractC12935u.f41096e = this;
        this.f41095d = abstractC12935u;
        AbstractC12935u abstractC12935u3 = this.f41092a;
        abstractC12935u.f41092a = abstractC12935u3;
        if (abstractC12935u.f41095d == null) {
            abstractC12935u3.f41093b = abstractC12935u;
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo14591h(AbstractC12935u abstractC12935u) {
        this.f41092a = abstractC12935u;
    }

    /* JADX INFO: renamed from: i */
    public final void m14597i(List list) {
        if (list.isEmpty()) {
            this.f41097f = null;
        } else {
            this.f41097f = new ArrayList(list);
        }
    }

    /* JADX INFO: renamed from: j */
    public String mo14589j() {
        return "";
    }

    /* JADX INFO: renamed from: k */
    public final void m14598k() {
        AbstractC12935u abstractC12935u = this.f41095d;
        if (abstractC12935u != null) {
            abstractC12935u.f41096e = this.f41096e;
        } else {
            AbstractC12935u abstractC12935u2 = this.f41092a;
            if (abstractC12935u2 != null) {
                abstractC12935u2.f41093b = this.f41096e;
            }
        }
        AbstractC12935u abstractC12935u3 = this.f41096e;
        if (abstractC12935u3 != null) {
            abstractC12935u3.f41095d = abstractC12935u;
        } else {
            AbstractC12935u abstractC12935u4 = this.f41092a;
            if (abstractC12935u4 != null) {
                abstractC12935u4.f41094c = abstractC12935u;
            }
        }
        this.f41092a = null;
        this.f41096e = null;
        this.f41095d = null;
    }

    public final String toString() {
        return getClass().getSimpleName() + "{" + mo14589j() + "}";
    }
}
