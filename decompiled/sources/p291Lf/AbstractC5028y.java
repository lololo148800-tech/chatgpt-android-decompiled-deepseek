package p291Lf;

import gd.C13874M0;
import kotlin.jvm.internal.AbstractC16544l;
import p042Bf.C1276r;
import p229J0.C4108p0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6014l0;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6037x;
import p479Td.EnumC7359j0;
import p523V9.AbstractC8160o6;
import p537W0.AbstractC8411c;
import p537W0.C8410b;

/* JADX INFO: renamed from: Lf.y */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5028y {

    /* JADX INFO: renamed from: a */
    public static final C6037x f16440a;

    /* JADX INFO: renamed from: b */
    public static final C6037x f16441b;

    static {
        C5010g c5010g = C5010g.f16348p0;
        C5975S c5975s = C5975S.f19448r0;
        f16440a = new C6037x(c5010g, c5975s);
        f16441b = new C6037x(C5010g.f16347o0, c5975s);
    }

    /* JADX INFO: renamed from: a */
    public static final void m5652a(EnumC7359j0 role, C5020q c5020q, C8410b c8410b, C6021p c6021p, int i10, int i11) {
        int i12;
        C5026w c5026w;
        AbstractC16544l.m18094g(role, "role");
        c6021p.m6526U(-1525276083);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(role) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(c5020q) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6545h(c8410b) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (i13 != 0) {
                c5020q = null;
            }
            boolean zM8729d = AbstractC8160o6.m8729d(C13874M0.f43912c, c6021p);
            int iOrdinal = role.ordinal();
            if (iOrdinal == 0) {
                c5026w = C5026w.f16432j;
            } else if (iOrdinal != 17) {
                c5026w = zM8729d ? C5026w.f16430h : C5026w.f16429g;
            } else {
                c5026w = C5026w.f16431i;
            }
            C5997d.m6442b(new C6014l0[]{f16440a.mo6405a(c5026w), f16441b.mo6405a(AbstractC5027x.f16439a[role.ordinal()] != 2 ? c5020q : null)}, AbstractC8411c.m8969c(1156493, c6021p, new C4108p0(c8410b, 5)), c6021p, 56);
        }
        C5020q c5020q2 = c5020q;
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1276r(role, c5020q2, c8410b, i10, i11, 3);
        }
    }
}
