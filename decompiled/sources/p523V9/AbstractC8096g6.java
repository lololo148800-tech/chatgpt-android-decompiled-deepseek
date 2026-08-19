package p523V9;

import af.C10561Q;
import androidx.compose.foundation.layout.AbstractC10842a;
import p229J0.AbstractC4124r4;
import p349O0.C6018n0;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;
import p758g0.AbstractC13758e;
import p759g1.C13800b;
import p759g1.C13801c;
import p759g1.C13803e;

/* JADX INFO: renamed from: V9.g6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8096g6 {

    /* JADX INFO: renamed from: a */
    public static Boolean f25433a;

    /* JADX INFO: renamed from: a */
    public static final void m8567a(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(1196582520);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC4124r4.m4768b("⬤", AbstractC10842a.m11231i(AbstractC8095g5.m8566c(interfaceC10459q, ((Number) AbstractC13758e.m15242g(AbstractC13758e.m15253r("PulsatingTransition", c6021p, 0), 1.0f, 1.3f, AbstractC13758e.m15252q(AbstractC13758e.m15255t(600, 0, null, 6), 2, 4), "PulsatingAnimation", c6021p, 29112, 0).f43307p0.getValue()).floatValue()), 0.0f, -1, 1), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 6, 0, 131068);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10561Q(interfaceC10459q, i10, 21);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C13801c m8568b(long j10, long j11) {
        return new C13801c(C13800b.m15306g(j10), C13800b.m15307h(j10), C13803e.m15333e(j11) + C13800b.m15306g(j10), C13803e.m15331c(j11) + C13800b.m15307h(j10));
    }
}
