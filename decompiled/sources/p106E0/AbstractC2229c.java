package p106E0;

import p349O0.C5984W0;
import p349O0.C6002f0;
import p349O0.C6021p;
import p774h1.C14365u;

/* JADX INFO: renamed from: E0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2229c {

    /* JADX INFO: renamed from: a */
    public static final C5984W0 f6833a = new C5984W0(C2228b.f6828Z);

    /* JADX INFO: renamed from: a */
    public static final long m3266a(long j10, C6021p c6021p) {
        long j11;
        c6021p.m6524S(-702395103);
        C2227a c2227a = (C2227a) c6021p.m6548k(f6833a);
        boolean zM15775c = C14365u.m15775c(j10, ((C14365u) c2227a.f6815a.getValue()).f45062a);
        C6002f0 c6002f0 = c2227a.f6822h;
        if (zM15775c || C14365u.m15775c(j10, ((C14365u) c2227a.f6816b.getValue()).f45062a)) {
            j11 = ((C14365u) c6002f0.getValue()).f45062a;
        } else {
            boolean zM15775c2 = C14365u.m15775c(j10, ((C14365u) c2227a.f6817c.getValue()).f45062a);
            C6002f0 c6002f1 = c2227a.f6823i;
            if (zM15775c2 || C14365u.m15775c(j10, ((C14365u) c2227a.f6818d.getValue()).f45062a)) {
                j11 = ((C14365u) c6002f1.getValue()).f45062a;
            } else if (C14365u.m15775c(j10, ((C14365u) c2227a.f6819e.getValue()).f45062a)) {
                j11 = ((C14365u) c2227a.f6824j.getValue()).f45062a;
            } else if (C14365u.m15775c(j10, ((C14365u) c2227a.f6820f.getValue()).f45062a)) {
                j11 = ((C14365u) c2227a.f6825k.getValue()).f45062a;
            } else {
                j11 = C14365u.m15775c(j10, ((C14365u) c2227a.f6821g.getValue()).f45062a) ? ((C14365u) c2227a.f6826l.getValue()).f45062a : C14365u.f45060j;
            }
        }
        if (j11 == 16) {
            j11 = ((C14365u) c6021p.m6548k(AbstractC2230d.f6834a)).f45062a;
        }
        c6021p.m6553p(false);
        return j11;
    }
}
