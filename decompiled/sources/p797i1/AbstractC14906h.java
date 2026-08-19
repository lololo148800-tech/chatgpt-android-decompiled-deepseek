package p797i1;

import p692d0.AbstractC12972k;
import p692d0.C12982u;

/* JADX INFO: renamed from: i1.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14906h {

    /* JADX INFO: renamed from: a */
    public static final C12982u f46433a;

    static {
        C14915q c14915q = C14902d.f46407c;
        int i10 = c14915q.f46404c;
        C14903e c14903e = new C14903e(c14915q, c14915q, 1);
        C14910l c14910l = C14902d.f46424t;
        int i11 = c14910l.f46404c << 6;
        int i12 = c14915q.f46404c;
        int i13 = i11 | i12;
        C14905g c14905g = new C14905g(c14915q, c14910l, 0);
        int i14 = (i12 << 6) | c14910l.f46404c;
        C14905g c14905g2 = new C14905g(c14910l, c14915q, 0);
        C12982u c12982u = AbstractC12972k.f41182a;
        C12982u c12982u2 = new C12982u();
        c12982u2.m14697i(i10 | (i10 << 6), c14903e);
        c12982u2.m14697i(i13, c14905g);
        c12982u2.m14697i(i14, c14905g2);
        f46433a = c12982u2;
    }
}
