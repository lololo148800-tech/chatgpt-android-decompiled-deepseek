package p523V9;

import androidx.compose.p650ui.graphics.AbstractC10864a;
import p1113xn.AbstractC21322p;
import p257K3.C4535c;
import p635a1.InterfaceC10459q;
import p774h1.C14341T;
import p774h1.C14365u;
import p895n1.AbstractC17418F;
import p895n1.C17424d;
import p895n1.C17425e;
import ve.C20584h;

/* JADX INFO: renamed from: V9.g5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8095g5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25432a;

    /* JADX INFO: renamed from: a */
    public static final C17425e m8564a() {
        C17425e c17425e = f25432a;
        if (c17425e != null) {
            return c17425e;
        }
        C17424d c17424d = new C17424d("Filled.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
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
        c4535c.m5294t(-6.0f);
        c4535c.m5287m(2.0f);
        c4535c.m5294t(6.0f);
        c4535c.m5282h();
        c4535c.m5290p(13.0f, 9.0f);
        c4535c.m5287m(-2.0f);
        c4535c.m5288n(11.0f, 7.0f);
        c4535c.m5287m(2.0f);
        c4535c.m5294t(2.0f);
        c4535c.m5282h();
        C17424d.m19121a(c17424d, c4535c.f14813Z, 0, c14341t, null, 1.0f, 0, 2, 1.0f);
        C17425e c17425eM19122b = c17424d.m19122b();
        f25432a = c17425eM19122b;
        return c17425eM19122b;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m8565b(C20584h c20584h) {
        String str;
        if (c20584h == null || !c20584h.f65315a) {
            return false;
        }
        String str2 = c20584h.f65316b;
        return ((str2 == null || AbstractC21322p.m21681O(str2)) && ((str = c20584h.f65317c) == null || AbstractC21322p.m21681O(str))) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC10459q m8566c(InterfaceC10459q interfaceC10459q, float f10) {
        return (f10 == 1.0f && f10 == 1.0f) ? interfaceC10459q : AbstractC10864a.m11306b(interfaceC10459q, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 0, 131068);
    }
}
