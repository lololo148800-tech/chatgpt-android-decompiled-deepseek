package p690cp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: cp.A */
/* JADX INFO: loaded from: classes2.dex */
public final class C12910A {

    /* JADX INFO: renamed from: a */
    public ArrayList f41066a;

    public C12910A(List list) {
        this.f41066a = new ArrayList(list == null ? new ArrayList(0) : list);
    }

    /* JADX INFO: renamed from: a */
    public void m14586a(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f41066a == null) {
            this.f41066a = new ArrayList();
        }
        if (this.f41066a.isEmpty()) {
            this.f41066a.addAll(list);
            return;
        }
        int size = this.f41066a.size() - 1;
        C12940z c12940z = (C12940z) this.f41066a.get(size);
        C12940z c12940z2 = (C12940z) list.get(0);
        int i10 = c12940z.f41105c;
        int i11 = c12940z.f41106d;
        if (i10 + i11 != c12940z2.f41105c) {
            this.f41066a.addAll(list);
            return;
        }
        this.f41066a.set(size, new C12940z(c12940z.f41103a, c12940z.f41104b, i10, i11 + c12940z2.f41106d));
        this.f41066a.addAll(list.subList(1, list.size()));
    }

    /* JADX INFO: renamed from: b */
    public void m14587b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m14586a(((AbstractC12935u) it.next()).m14594e());
        }
    }
}
