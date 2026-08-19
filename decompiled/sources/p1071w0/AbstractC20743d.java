package p1071w0;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1440o;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p204I1.C3588d;
import p204I1.C3590f;
import p349O0.C5997d;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p635a1.AbstractC10443a;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.C17689w;
import p963qd.C18685n;

/* JADX INFO: renamed from: w0.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20743d {

    /* JADX INFO: renamed from: a */
    public static final C17309l f65755a;

    static {
        C17689w c17689w = C17689w.f56480Y;
        f65755a = new C17309l(c17689w, c17689w);
    }

    /* JADX INFO: renamed from: a */
    public static final void m21287a(C3590f c3590f, List list, C6021p c6021p, int i10) {
        c6021p.m6526U(-1794596951);
        int i11 = (i10 & 6) == 0 ? (c6021p.m6542f(c3590f) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(list) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                C3588d c3588d = (C3588d) list.get(i12);
                InterfaceC1440o interfaceC1440o = (InterfaceC1440o) c3588d.f10930a;
                C20741c c20741c = C20741c.f65749b;
                C10456n c10456n = C10456n.f30959Y;
                int i13 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
                InterfaceC21700k.f68875m0.getClass();
                C21696i c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c20741c);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                C21694h c21694h = C21698j.f68874g;
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                    AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                interfaceC1440o.invoke(c3590f.subSequence(c3588d.f10931b, c3588d.f10932c).f10934Y, c6021p, 0);
                c6021p.m6553p(true);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18685n(c3590f, list, i10, 3);
        }
    }
}
