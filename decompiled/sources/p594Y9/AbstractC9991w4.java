package p594Y9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.view.View;
import androidx.compose.foundation.layout.AbstractC10842a;
import gd.C13971o0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p1051v0.AbstractC20417e;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.AbstractC3896D1;
import p229J0.AbstractC3914G1;
import p349O0.C5997d;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p403Qd.C6642l;
import p403Qd.C6644m;
import p478Tc.AbstractC7306j;
import p478Tc.AbstractC7313q;
import p482Tg.C7443a0;
import p523V9.AbstractC8079e5;
import p523V9.AbstractC8160o6;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8443A;
import p547Wc.C8790e;
import p547Wc.C8805o;
import p547Wc.EnumC8792f;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10451i;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17780r;
import p926of.AbstractC18171h;
import p926of.C18161Y;

/* JADX INFO: renamed from: Y9.w4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9991w4 {
    /* JADX INFO: renamed from: a */
    public static final void m10632a(C6644m conversationItem, InterfaceC1426a onRetry, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(conversationItem, "conversationItem");
        AbstractC16544l.m18094g(onRetry, "onRetry");
        c6021p.m6526U(-651571789);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(conversationItem) : c6021p.m6545h(conversationItem) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onRetry) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (!AbstractC8160o6.m8729d(C13971o0.f44029c, c6021p)) {
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C18161Y(conversationItem, onRetry, interfaceC10459q, i10, 0);
                    return;
                }
                return;
            }
            C6642l c6642l = C6644m.Companion;
            m10633b(conversationItem, onRetry, interfaceC10459q, c6021p, i11 & 1022);
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C18161Y(conversationItem, onRetry, interfaceC10459q, i10, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10633b(C6644m conversationItem, InterfaceC1426a onRetry, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(conversationItem, "conversationItem");
        AbstractC16544l.m18094g(onRetry, "onRetry");
        c6021p.m6526U(-450213859);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(conversationItem) : c6021p.m6545h(conversationItem) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onRetry) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C8790e c8790eM10302c = AbstractC9709C3.m10302c(EnumC8792f.f26897Z, c6021p, 6);
            C10451i c10451i = C10444b.f30934Y;
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(c10451i, false);
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
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            float f10 = AbstractC7313q.f23201f;
            InterfaceC10459q interfaceC10459qM8501a = AbstractC8079e5.m8501a(AbstractC8443A.m9045a(AbstractC10842a.m11234l(c10456n, f10, AbstractC7313q.f23199d), 0.0f, c8790eM10302c.f26888c, AbstractC20417e.m21079a(f10)), AbstractC20417e.m21079a(f10));
            InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(c10451i, false);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM8501a);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e2);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            InterfaceC10459q interfaceC10459qM8501a2 = AbstractC8079e5.m8501a(c10456n, AbstractC20417e.m21079a(f10));
            float f11 = AbstractC7306j.f23143a;
            float f12 = AbstractC3896D1.f11851a;
            long j10 = c8790eM10302c.f26887b;
            long j11 = c8790eM10302c.f26886a;
            AbstractC3914G1.m4611a(AbstractC8411c.m8969c(872842611, c6021p, new C7443a0(conversationItem, 23)), interfaceC10459qM8501a2, null, null, AbstractC18171h.f57963a, AbstractC8411c.m8969c(18645326, c6021p, new C8805o(conversationItem, 28, onRetry)), AbstractC3896D1.m4607a(j10, j11, j11, j11, c6021p, 472), f11, 0.0f, c6021p, 221190, 268);
            c6021p.m6553p(true);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18161Y(conversationItem, onRetry, interfaceC10459q, i10, 2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m10634c(View view) {
        AbstractC16544l.m18094g(view, "<this>");
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        int visibility = view.getVisibility();
        if (visibility == 0) {
            return 2;
        }
        if (visibility == 4) {
            return 4;
        }
        if (visibility == 8) {
            return 3;
        }
        throw new IllegalArgumentException(AbstractC10763a.m11048f(visibility, "Unknown visibility "));
    }
}
