package tf;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p049Bm.InterfaceC1436k;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.C4087l3;
import p254K0.C4523t;
import p254K0.C4526w;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p492U1.InterfaceC7537b;
import p544W9.AbstractC8455C;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p774h1.InterfaceC14333K;
import p860l0.AbstractC16786v0;
import p911o0.AbstractC17780r;

/* JADX INFO: renamed from: tf.U */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19915U {

    /* JADX INFO: renamed from: a */
    public static final float f63136a = 230;

    /* JADX INFO: renamed from: b */
    public static final float f63137b = 40;

    /* JADX INFO: renamed from: c */
    public static final float f63138c = 15;

    /* JADX INFO: renamed from: d */
    public static final float f63139d = (float) 0.5d;

    /* JADX INFO: renamed from: e */
    public static final long f63140e = C14365u.m15774b(0.2f, C14365u.f45052b);

    /* JADX INFO: renamed from: a */
    public static final void m20799a(float f10, InterfaceC1436k onProgressChange, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(onProgressChange, "onProgressChange");
        c6021p.m6526U(682369982);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6536c(f10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onProgressChange) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            float f11 = f63137b;
            InterfaceC10459q interfaceC10459qM11243c = AbstractC10844c.m11243c(AbstractC10844c.m11256p(c10456n, f11), 1.0f);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30938q0, false);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11243c);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(446635767);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = AbstractC14334L.m15631i();
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC14333K interfaceC14333K = (InterfaceC14333K) objM6514H;
            c6021p.m6553p(false);
            InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
            float f12 = f63136a;
            float fMo7864b0 = interfaceC7537b.mo7864b0(f12);
            InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC10844c.m11245e(AbstractC10844c.m11256p(c10456n, f11), f12), AbstractC7313q.f23199d, 0.0f, 2);
            c6021p.m6524S(446648959);
            int i14 = i12 & 14;
            boolean zM6536c = ((i12 & 112) == 32) | (i14 == 4) | c6021p.m6536c(fMo7864b0);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6536c || objM6514H2 == c5975s) {
                objM6514H2 = new C4523t(f10, fMo7864b0, onProgressChange);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM18554a = AbstractC16786v0.m18554a(interfaceC10459qM11235m, AbstractC16786v0.m18555b((InterfaceC1436k) objM6514H2, c6021p), false, null, false, null, null, false, 252);
            InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM18554a);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e2);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            InterfaceC10459q interfaceC10459qM11235m2 = AbstractC10842a.m11235m(AbstractC10844c.f32512c, 0.0f, AbstractC7313q.f23201f, 1);
            c6021p.m6524S(-1196400685);
            boolean zM6545h = (i14 == 4) | c6021p.m6545h(interfaceC14333K);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h || objM6514H3 == c5975s) {
                objM6514H3 = new C4526w(interfaceC14333K, f10, 5);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            AbstractC8455C.m9069a(0, (InterfaceC1436k) objM6514H3, c6021p, interfaceC10459qM11235m2);
            c6021p.m6553p(true);
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4087l3(f10, onProgressChange, interfaceC10459q2, i10);
        }
    }
}
