package p1116y0;

import p029B0.C0714a;
import p1036u9.C20168n;
import p1139z0.C21585H;
import p1139z0.C21639s;
import p204I1.C3581L;
import p392Q0.C6546d;
import p544W9.AbstractC8676n;
import p562X0.InterfaceC9019n;

/* JADX INFO: renamed from: y0.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21360i implements InterfaceC9019n {

    /* JADX INFO: renamed from: Y */
    public static final C21356e f67833Y = new C21356e(2);

    /* JADX INFO: renamed from: c */
    public static final void m21754c(C21585H c21585h, C21353b c21353b, C21353b c21353b2, C20168n c20168n, boolean z6) {
        C6546d c6546d = (C6546d) c20168n.f63875Z;
        int i10 = c6546d.f21184o0;
        if (i10 > 1) {
            c21585h.m21934x(new C0714a(0, c21353b.f67817Y.toString(), c21353b2.f67817Y.toString(), c21353b.f67818Z, c21353b2.f67818Z, 0L, false, 32));
            return;
        }
        if (i10 == 1) {
            C21639s c21639s = (C21639s) c6546d.f21182Y[0];
            long jM9365b = AbstractC8676n.m9365b(c21639s.f68548c, c21639s.f68549d);
            C21639s c21639s2 = (C21639s) ((C6546d) c20168n.f63875Z).f21182Y[0];
            long jM9365b2 = AbstractC8676n.m9365b(c21639s2.f68546a, c21639s2.f68547b);
            if (C3581L.m4267c(jM9365b) && C3581L.m4267c(jM9365b2)) {
                return;
            }
            c21585h.m21934x(new C0714a(C3581L.m4270f(jM9365b), AbstractC8676n.m9367d(jM9365b, c21353b), AbstractC8676n.m9367d(jM9365b2, c21353b2), c21353b.f67818Z, c21353b2.f67818Z, 0L, z6, 32));
        }
    }
}
