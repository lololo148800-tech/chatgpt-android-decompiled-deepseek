package p544W9;

import p102Dm.AbstractC2119a;
import p254K0.C4520q;
import p254K0.C4525v;
import p257K3.C4535c;
import p774h1.C14341T;
import p774h1.C14365u;
import p895n1.AbstractC17418F;
import p895n1.C17424d;
import p895n1.C17425e;

/* JADX INFO: renamed from: W9.L2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8512L2 {

    /* JADX INFO: renamed from: a */
    public static C17425e f26331a;

    /* JADX INFO: renamed from: a */
    public static final C17425e m9171a() {
        C17425e c17425e = f26331a;
        if (c17425e != null) {
            return c17425e;
        }
        C17424d c17424d = new C17424d("Outlined.Error", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = AbstractC17418F.f55636a;
        C14341T c14341t = new C14341T(C14365u.f45052b);
        C4535c c4535c = new C4535c(3);
        c4535c.m5290p(12.0f, 2.0f);
        c4535c.m5283i(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        c4535c.m5292r(4.48f, 10.0f, 10.0f, 10.0f);
        c4535c.m5292r(10.0f, -4.48f, 10.0f, -10.0f);
        c4535c.m5291q(17.52f, 2.0f, 12.0f, 2.0f);
        c4535c.m5282h();
        c4535c.m5290p(13.0f, 17.0f);
        c4535c.m5287m(-2.0f);
        c4535c.m5294t(-2.0f);
        c4535c.m5287m(2.0f);
        c4535c.m5294t(2.0f);
        c4535c.m5282h();
        c4535c.m5290p(13.0f, 13.0f);
        c4535c.m5287m(-2.0f);
        c4535c.m5288n(11.0f, 7.0f);
        c4535c.m5287m(2.0f);
        c4535c.m5294t(6.0f);
        c4535c.m5282h();
        C17424d.m19121a(c17424d, c4535c.f14813Z, 0, c14341t, null, 1.0f, 0, 2, 1.0f);
        C17425e c17425eM19122b = c17424d.m19122b();
        f26331a = c17425eM19122b;
        return c17425eM19122b;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public static final int m9172b(C4525v c4525v, int i10, int i11) {
        if (!c4525v.f14800l) {
            return 0;
        }
        C4520q c4520q = c4525v.f14789a;
        int i12 = c4520q.f14775r0 - c4520q.f14774q0;
        ?? r6 = c4525v.f14790b;
        int size = r6.size() + i12;
        ?? r10 = c4525v.f14791c;
        int size2 = r10.size() + i12;
        int iM3195i = AbstractC2119a.m3195i(c4520q.m5261j().f14764c - (c4525v.m5266a() / 2.0f));
        if (i10 < size) {
            iM3195i = AbstractC2119a.m3195i(((C4520q) r6.get(Math.min(r6.size() - 1, Math.max(0, (size - 1) - i10)))).m5261j().f14764c - (c4525v.m5266a() / 2.0f));
        }
        if (i11 <= i12 + 1 || i10 < i11 - size2) {
            return iM3195i;
        }
        return AbstractC2119a.m3195i(((C4520q) r10.get(Math.min(r10.size() - 1, Math.max(0, (i10 - i11) + size2)))).m5261j().f14764c - (c4525v.m5266a() / 2.0f));
    }
}
