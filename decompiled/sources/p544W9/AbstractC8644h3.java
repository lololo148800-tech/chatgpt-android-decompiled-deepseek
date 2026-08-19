package p544W9;

import android.view.View;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p039Bc.C0885s;
import p080D0.C1836w;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p197Hj.C3457c;
import p273Kl.C4714D;
import p291Lf.AbstractC5028y;
import p291Lf.C5020q;
import p291Lf.C5026w;
import p349O0.C5997d;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.C7299c;
import p492U1.InterfaceC7537b;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p769gj.AbstractC14158L;
import p769gj.C14172n;
import p773h0.InterfaceC14267W;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17780r;

/* JADX INFO: renamed from: W9.h3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8644h3 {
    /* JADX INFO: renamed from: a */
    public static final void m9309a(InterfaceC10459q interfaceC10459q, C8410b c8410b, C6021p c6021p, int i10) {
        c6021p.m6526U(694827497);
        int i11 = i10 | 6;
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            interfaceC10459q = C10456n.f30959Y;
            boolean z6 = ((C5026w) c6021p.m6548k(AbstractC5028y.f16440a)).f16435c;
            InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
            if (z6) {
                c6021p.m6524S(-906431537);
                AbstractC17758g.m19481a(AbstractC10844c.m11244d(interfaceC10459q, 1.0f), C10444b.f30939r0, false, AbstractC8411c.m8969c(798634072, c6021p, new C0885s(interfaceC7537b, 6, c8410b)), c6021p, 3120, 4);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-905556469);
                InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                int i12 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
                InterfaceC21700k.f68875m0.getClass();
                C21696i c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                C21694h c21694h = C21698j.f68874g;
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                    AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                c8410b.invoke(c6021p, Integer.valueOf((i11 >> 3) & 14));
                c6021p.m6553p(true);
                c6021p.m6553p(false);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1836w(interfaceC10459q, c8410b, i10, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m9310b(View view) {
        AbstractC14158L abstractC14158LM9449g = AbstractC8724v.m9449g(view);
        Object objMo15504c = abstractC14158LM9449g == null ? null : abstractC14158LM9449g.mo15504c();
        C14172n c14172n = objMo15504c == null ? null : (C14172n) objMo15504c;
        String str = c14172n != null ? c14172n.f44558c : null;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException(("Expected " + view + " to be showing a " + ((Object) C14172n.class.getSimpleName()) + "<*> rendering, found " + c14172n).toString());
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC10459q m9311c(InterfaceC10459q interfaceC10459q, C5020q c5020q, C7299c interactionSource, InterfaceC14267W indication) {
        AbstractC16544l.m18094g(interfaceC10459q, "<this>");
        AbstractC16544l.m18094g(interactionSource, "interactionSource");
        AbstractC16544l.m18094g(indication, "indication");
        return c5020q != null ? AbstractC10833a.m11210e(interfaceC10459q, interactionSource, indication, false, new C4714D(interactionSource, 5, c5020q), new C3457c(c5020q, 17), 188) : interfaceC10459q;
    }
}
