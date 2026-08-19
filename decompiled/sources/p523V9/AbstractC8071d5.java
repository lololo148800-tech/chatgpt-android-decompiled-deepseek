package p523V9;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.graphics.AbstractC10864a;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p069Cf.C1648g;
import p1062vd.AbstractC20556f;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.AbstractC3914G1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C5997d;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p594Y9.AbstractC9818V;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p895n1.C17425e;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17790w;

/* JADX INFO: renamed from: V9.d5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8071d5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25386a;

    /* JADX INFO: renamed from: a */
    public static final void m8482a(int i10, int i11, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-754410381);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459q3 = i13 != 0 ? c10456n : interfaceC10459q;
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(interfaceC10459q3, 1.0f);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11244d);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11245e(c10456n, AbstractC7313q.f23199d));
            InterfaceC10459q interfaceC10459q4 = interfaceC10459q3;
            AbstractC4124r4.m4768b("Header", AbstractC9818V.m10458b(AbstractC10842a.m11233k(c10456n, AbstractC7313q.f23201f), true, false, 0.0f, 14), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12153i, c6021p, 6, 0, 65532);
            c6021p.m6524S(1926687654);
            for (int i15 = 0; i15 < 5; i15++) {
                AbstractC3914G1.m4611a(AbstractC20556f.f65261a, null, null, null, null, null, null, 0.0f, 0.0f, c6021p, 6, 510);
            }
            c6021p.m6553p(false);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11245e(c10456n, AbstractC7313q.f23199d));
            c6021p.m6553p(true);
            interfaceC10459q2 = interfaceC10459q4;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1648g(interfaceC10459q2, i10, i11, 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC10459q m8483b(InterfaceC10459q interfaceC10459q, float f10) {
        return f10 == 1.0f ? interfaceC10459q : AbstractC10864a.m11306b(interfaceC10459q, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 126971);
    }
}
