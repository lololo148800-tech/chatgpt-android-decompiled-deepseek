package p278L0;

import mm.C17296C;
import p492U1.C7540e;
import p758g0.AbstractC13725A;
import p758g0.C13756d;
import p758g0.C13781p0;
import p758g0.C13792v;
import p894n0.C17396b;
import p894n0.C17398d;
import p894n0.C17402h;
import p894n0.C17409o;
import p894n0.InterfaceC17405k;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: L0.N */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4850N {

    /* JADX INFO: renamed from: a */
    public static final C13781p0 f15796a;

    /* JADX INFO: renamed from: b */
    public static final C13781p0 f15797b;

    /* JADX INFO: renamed from: c */
    public static final C13781p0 f15798c;

    static {
        C13792v c13792v = new C13792v(0.4f, 0.0f, 0.6f, 1.0f);
        f15796a = new C13781p0(120, AbstractC13725A.f43288a, 2);
        f15797b = new C13781p0(150, c13792v, 2);
        f15798c = new C13781p0(120, c13792v, 2);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[PHI: r1
      0x0009: PHI (r1v2 g0.p0) = (r1v0 g0.p0), (r1v0 g0.p0), (r1v0 g0.p0), (r1v3 g0.p0), (r1v3 g0.p0), (r1v3 g0.p0), (r1v3 g0.p0) binds: [B:19:0x0022, B:22:0x0027, B:28:0x0033, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public static final Object m5498a(C13756d c13756d, float f10, InterfaceC17405k interfaceC17405k, InterfaceC17405k interfaceC17405k2, AbstractC19687c abstractC19687c) {
        C13781p0 c13781p0;
        C13781p0 c13781p1 = null;
        if (interfaceC17405k2 != null) {
            boolean z6 = interfaceC17405k2 instanceof C17409o;
            c13781p0 = f15796a;
            if (z6 || (interfaceC17405k2 instanceof C17396b) || (interfaceC17405k2 instanceof C17402h) || (interfaceC17405k2 instanceof C17398d)) {
                c13781p1 = c13781p0;
            }
        } else if (interfaceC17405k != null) {
            boolean z10 = interfaceC17405k instanceof C17409o;
            c13781p0 = f15797b;
            if (z10 || (interfaceC17405k instanceof C17396b)) {
                c13781p1 = c13781p0;
            } else if (interfaceC17405k instanceof C17402h) {
                c13781p1 = f15798c;
            } else if (interfaceC17405k instanceof C17398d) {
                c13781p1 = c13781p0;
            }
        }
        C13781p0 c13781p2 = c13781p1;
        C17296C c17296c = C17296C.f55119a;
        if (c13781p2 != null) {
            Object objM15222c = C13756d.m15222c(c13756d, new C7540e(f10), c13781p2, null, abstractC19687c, 12);
            return objM15222c == EnumC19250a.f61036Y ? objM15222c : c17296c;
        }
        Object objM15226g = c13756d.m15226g(new C7540e(f10), abstractC19687c);
        return objM15226g == EnumC19250a.f61036Y ? objM15226g : c17296c;
    }
}
