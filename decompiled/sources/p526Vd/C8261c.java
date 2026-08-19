package p526Vd;

import gp.InterfaceC14208a;
import java.util.ArrayList;
import p1091wn.AbstractC21031l;
import p402Qc.C6593i;
import p607Yo.C10116e;
import p690cp.AbstractC12935u;
import p690cp.C12912C;

/* JADX INFO: renamed from: Vd.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C8261c implements InterfaceC14208a {
    @Override // gp.InterfaceC14208a
    /* JADX INFO: renamed from: a */
    public final char mo8901a() {
        return (char) 57345;
    }

    @Override // gp.InterfaceC14208a
    /* JADX INFO: renamed from: b */
    public final int mo8902b(C10116e c10116e, C10116e c10116e2) {
        ArrayList arrayList = c10116e.f29956a;
        int size = arrayList.size();
        ArrayList arrayList2 = c10116e2.f29956a;
        if (size != arrayList2.size()) {
            return 0;
        }
        C12912C c12912cM10697b = c10116e.m10697b();
        C12912C c12912c = (C12912C) arrayList2.get(0);
        C8262d c8262d = new C8262d(AbstractC21031l.m21493q(AbstractC21031l.m21495s(AbstractC21031l.m21487k(AbstractC21031l.m21498v(AbstractC21031l.m21492p(C8260b.f25758Z, c12912cM10697b.f41096e), new C6593i(c12912c, 11)), C8259a.f25757Y), C8260b.f25759o0), "", null, 62));
        AbstractC12935u abstractC12935u = c12912cM10697b.f41096e;
        while (true) {
            if (!((abstractC12935u == null || abstractC12935u == c12912c) ? false : true)) {
                c12912cM10697b.m14595f(c8262d);
                c12912c.m14596g(c8262d);
                return arrayList.size();
            }
            AbstractC12935u abstractC12935u2 = abstractC12935u.f41096e;
            if (!abstractC12935u.equals(c12912c)) {
                abstractC12935u.m14598k();
            }
            abstractC12935u = abstractC12935u2;
        }
    }

    @Override // gp.InterfaceC14208a
    /* JADX INFO: renamed from: c */
    public final int mo8903c() {
        return 1;
    }

    @Override // gp.InterfaceC14208a
    /* JADX INFO: renamed from: d */
    public final char mo8904d() {
        return (char) 57345;
    }
}
