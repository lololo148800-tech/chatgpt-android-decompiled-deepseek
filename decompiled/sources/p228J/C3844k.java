package p228J;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p140Fa.C2685e;

/* JADX INFO: renamed from: J.k */
/* JADX INFO: loaded from: classes.dex */
public final class C3844k extends AbstractC3842j {

    /* JADX INFO: renamed from: a */
    public final ArrayList f11628a = new ArrayList();

    public C3844k(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC3842j abstractC3842j = (AbstractC3842j) it.next();
            if (!(abstractC3842j instanceof C3846l)) {
                this.f11628a.add(abstractC3842j);
            }
        }
    }

    @Override // p228J.AbstractC3842j
    /* JADX INFO: renamed from: a */
    public final void mo7a(int i10) {
        Iterator it = this.f11628a.iterator();
        while (it.hasNext()) {
            ((AbstractC3842j) it.next()).mo7a(i10);
        }
    }

    @Override // p228J.AbstractC3842j
    /* JADX INFO: renamed from: b */
    public final void mo8b(int i10, InterfaceC3854p interfaceC3854p) {
        Iterator it = this.f11628a.iterator();
        while (it.hasNext()) {
            ((AbstractC3842j) it.next()).mo8b(i10, interfaceC3854p);
        }
    }

    @Override // p228J.AbstractC3842j
    /* JADX INFO: renamed from: c */
    public final void mo9c(int i10, C2685e c2685e) {
        Iterator it = this.f11628a.iterator();
        while (it.hasNext()) {
            ((AbstractC3842j) it.next()).mo9c(i10, c2685e);
        }
    }

    @Override // p228J.AbstractC3842j
    /* JADX INFO: renamed from: d */
    public final void mo3972d(int i10) {
        Iterator it = this.f11628a.iterator();
        while (it.hasNext()) {
            ((AbstractC3842j) it.next()).mo3972d(i10);
        }
    }
}
