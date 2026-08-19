package p842k0;

import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1440o;
import p124Ei.C2446D;
import p349O0.C6018n0;
import p349O0.C6021p;
import p382Pf.C6401d;
import p537W0.C8410b;
import p586Y0.C9566r;
import p635a1.C10456n;

/* JADX INFO: renamed from: k0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C16300i {

    /* JADX INFO: renamed from: a */
    public final C9566r f50496a = new C9566r();

    /* JADX INFO: renamed from: b */
    public static void m17825b(C16300i c16300i, C2446D c2446d, boolean z6, InterfaceC1426a interfaceC1426a) {
        C10456n c10456n = C10456n.f30959Y;
        c16300i.getClass();
        c16300i.f50496a.add(new C8410b(new C16299h(c2446d, z6, c10456n, (InterfaceC1440o) null, interfaceC1426a), true, 262103052));
    }

    /* JADX INFO: renamed from: a */
    public final void m17826a(C16293b c16293b, C6021p c6021p, int i10) {
        c6021p.m6526U(1320309496);
        int i11 = (i10 & 6) == 0 ? (c6021p.m6542f(c16293b) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C9566r c9566r = this.f50496a;
            int size = c9566r.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((InterfaceC1440o) c9566r.get(i12)).invoke(c16293b, c6021p, Integer.valueOf(i11 & 14));
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(this, c16293b, i10, 20);
        }
    }
}
