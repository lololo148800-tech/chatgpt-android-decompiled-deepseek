package p337Nd;

import android.os.Bundle;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.foundation.layout.FillElement;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p003A1.C0227a;
import p039Bc.AbstractC0870d;
import p049Bm.InterfaceC1440o;
import p092Dc.C2001r;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1143z4.C21778h;
import p195Hh.C3430e;
import p229J0.AbstractC3980S2;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p523V9.AbstractC8160o6;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8645h4;
import p571X9.AbstractC9239Y;
import p571X9.AbstractC9306j0;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17780r;

/* JADX INFO: renamed from: Nd.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C5712e extends AbstractC16546n implements InterfaceC1440o {
    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C21778h backStackEntry = (C21778h) obj;
        C6021p c6021p = (C6021p) obj2;
        ((Number) obj3).intValue();
        AbstractC16544l.m18094g(backStackEntry, "backStackEntry");
        C3430e c3430eM9814a = AbstractC9239Y.m9814a("conversationDialog", c6021p);
        Bundle bundleM22263d = backStackEntry.m22263d();
        if (bundleM22263d == null) {
            bundleM22263d = new Bundle();
        }
        C2001r c2001rM9315d = AbstractC8645h4.m9315d(bundleM22263d, c6021p, 0);
        if (c2001rM9315d != null) {
            c6021p.m6524S(542411011);
            Object[] objArr = {c2001rM9315d};
            C8410b c8410b = AbstractC0870d.f2524a;
            AbstractC16421b.m18008a(objArr, AbstractC8411c.m8969c(1523804569, c6021p, new C0227a(backStackEntry)), c6021p, 48);
            c6021p.m6553p(false);
        } else {
            c6021p.m6524S(542538297);
            AbstractC8160o6.m8731f(c3430eM9814a, AbstractC9306j0.m9889h("Missing conversation component for ", backStackEntry.f69074Z.f69136s0), null, null, 6);
            C10456n c10456n = C10456n.f30959Y;
            FillElement fillElement = AbstractC10844c.f32512c;
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i10 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, fillElement);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
                AbstractC0168G.m537z(i10, c6021p, i10, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC3980S2.m4668b(C10843b.f32509a.m11240a(c10456n, C10444b.f30938q0), 0L, 0.0f, 0L, 0, c6021p, 0, 30);
            c6021p.m6553p(true);
            c6021p.m6553p(false);
        }
        return C17296C.f55119a;
    }
}
