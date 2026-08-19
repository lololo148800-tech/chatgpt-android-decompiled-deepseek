package p523V9;

import af.C10561Q;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import cd.C11709i;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p017Af.C0492w;
import p049Bm.InterfaceC1436k;
import p1042uh.C20263a0;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2497c;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p537W0.AbstractC8411c;
import p594Y9.AbstractC9818V;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p895n1.C17425e;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17790w;

/* JADX INFO: renamed from: V9.b5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8055b5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25365a;

    /* JADX INFO: renamed from: a */
    public static final void m8448a(C11709i popupMenuState, C20263a0 c20263a0, InterfaceC1436k onPin, InterfaceC1436k onUnpin, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(popupMenuState, "popupMenuState");
        AbstractC16544l.m18094g(onPin, "onPin");
        AbstractC16544l.m18094g(onUnpin, "onUnpin");
        c6021p.m6526U(1484681669);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(popupMenuState) : c6021p.m6545h(popupMenuState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c6021p.m6542f(c20263a0) : c6021p.m6545h(c20263a0) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onPin) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onUnpin) ? 2048 : 1024;
        }
        int i12 = i11 | 24576;
        if ((i12 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            AbstractC8198t4.m8798a(popupMenuState, c10456n, AbstractC8411c.m8969c(2114029576, c6021p, new C2497c(c20263a0, onPin, popupMenuState, onUnpin, 13)), c6021p, (i12 & 14) | 384 | ((i12 >> 9) & 112), 0);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0492w((Object) popupMenuState, (Object) c20263a0, onPin, (Object) onUnpin, (Object) interfaceC10459q2, i10, 22);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8449b(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(209694502);
        if (((i10 | 6) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            float f10 = AbstractC7313q.f23199d;
            InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(c10456n, f10);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 48);
            int i11 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11233k);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                AbstractC0168G.m537z(i11, c6021p, i11, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            float f11 = AbstractC7313q.f23201f;
            AbstractC17780r.m19507a(AbstractC9818V.m10458b(AbstractC10844c.m11252l(AbstractC10842a.m11234l(c10456n, f11, f10), AbstractC7312p.f23189f), true, false, 0.0f, 14), c6021p, 0);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11252l(c10456n, f10));
            C5984W0 c5984w0 = AbstractC3947L4.f12183a;
            AbstractC4124r4.m4768b("Placeholder Title", AbstractC9818V.m10458b(AbstractC10844c.m11244d(AbstractC10842a.m11235m(c10456n, f11, 0.0f, 2), 0.5f), true, false, 0.0f, 14), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12149e, c6021p, 6, 3072, 57340);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11252l(c10456n, f10));
            AbstractC17780r.m19507a(AbstractC9818V.m10458b(AbstractC10844c.m11245e(AbstractC10844c.m11244d(AbstractC10842a.m11234l(c10456n, f11, f10), 1.0f), 100), true, false, 0.0f, 14), c6021p, 0);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11252l(c10456n, f11));
            AbstractC4124r4.m4768b("Loading conversations...", AbstractC9818V.m10458b(AbstractC10842a.m11234l(c10456n, f11, AbstractC7313q.f23198c), true, false, 0.0f, 14), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12152h, c6021p, 6, 0, 65532);
            c6021p.m6524S(819459344);
            for (int i12 = 0; i12 < 3; i12++) {
                AbstractC8047a5.m8434g(0, c6021p);
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10561Q(interfaceC10459q2, i10, 5);
        }
    }
}
