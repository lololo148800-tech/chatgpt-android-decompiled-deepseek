package p544W9;

import android.graphics.Typeface;
import android.os.Build;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1014t1.AbstractC19744u;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.C4163y1;
import p328N1.C5576C;
import p328N1.C5580G;
import p328N1.C5605u;
import p328N1.C5606v;
import p328N1.C5609y;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p537W0.C8410b;
import p571X9.AbstractC9101A4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p842k0.AbstractC16304m;
import p842k0.AbstractC16306o;
import p842k0.C16292a;
import p842k0.C16295d;
import p842k0.C16297f;
import p842k0.C16298g;
import p842k0.C16303l;
import p842k0.C16305n;
import p911o0.AbstractC17780r;

/* JADX INFO: renamed from: W9.V3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8572V3 {
    /* JADX INFO: renamed from: a */
    public static final void m9236a(C16305n c16305n, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(645832757);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c16305n) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6545h(interfaceC1436k) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            AbstractC16304m abstractC16304m = (AbstractC16304m) c16305n.f50513a.getValue();
            if (!(abstractC16304m instanceof C16303l)) {
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C16292a(c16305n, interfaceC1426a, c10456n, interfaceC1436k, i10, 0);
                    return;
                }
                return;
            }
            boolean zM6542f = c6021p.m6542f(abstractC16304m);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                objM6514H = new C16298g(AbstractC9101A4.m9633c(((C16303l) abstractC16304m).f50512a));
                c6021p.m6537c0(objM6514H);
            }
            AbstractC16306o.m17829c((C16298g) objM6514H, interfaceC1426a, c10456n, interfaceC1436k, c6021p, i12 & 8176);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C16292a(c16305n, interfaceC1426a, interfaceC10459q2, interfaceC1436k, i10, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:67:0x0115  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m9237b(C16305n c16305n, InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, boolean z6, C8410b c8410b, C6021p c6021p, int i10, int i11) {
        int i12;
        boolean z10;
        C10456n c10456n;
        boolean z11;
        InterfaceC10459q interfaceC10459qM20694b;
        int i13;
        C21696i c21696i;
        C21694h c21694h;
        InterfaceC10459q interfaceC10459q2;
        boolean z12;
        C6018n0 c6018n0M6555r;
        int i14;
        c6021p.m6526U(-84584070);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(c16305n) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6545h(interfaceC1436k) ? 256 : 128;
        }
        int i15 = i12 | 3072;
        int i16 = i11 & 16;
        if (i16 == 0) {
            if ((i10 & 24576) == 0) {
                z10 = z6;
                i15 |= c6021p.m6544g(z10) ? 16384 : 8192;
            }
            if ((196608 & i10) == 0) {
                if (c6021p.m6545h(c8410b)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i15 |= i14;
            }
            if ((74899 & i15) == 74898 || !c6021p.m6562y()) {
                c10456n = C10456n.f30959Y;
                if (i16 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (z11) {
                    interfaceC10459qM20694b = AbstractC19744u.m20694b(c10456n, C16297f.f50488a, new C16295d(c16305n, null));
                } else {
                    interfaceC10459qM20694b = c10456n;
                }
                InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, true);
                i13 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM20694b);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                    AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                c8410b.invoke(c6021p, Integer.valueOf((i15 >> 15) & 14));
                m9236a(c16305n, interfaceC1426a, null, interfaceC1436k, c6021p, (i15 & 126) | ((i15 << 3) & 7168));
                c6021p.m6553p(true);
                interfaceC10459q2 = c10456n;
                z12 = z11;
            } else {
                c6021p.m6517L();
                interfaceC10459q2 = interfaceC10459q;
                z12 = z10;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4163y1(c16305n, interfaceC1426a, interfaceC1436k, interfaceC10459q2, z12, c8410b, i10, i11);
            }
        }
        i15 = i12 | 27648;
        z10 = z6;
        if ((196608 & i10) == 0) {
            if (c6021p.m6545h(c8410b)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i15 |= i14;
        }
        if ((74899 & i15) == 74898) {
            c10456n = C10456n.f30959Y;
            if (i16 != 0) {
                z11 = true;
            } else {
                z11 = z10;
            }
            if (z11) {
                interfaceC10459qM20694b = AbstractC19744u.m20694b(c10456n, C16297f.f50488a, new C16295d(c16305n, null));
            } else {
                interfaceC10459qM20694b = c10456n;
            }
            InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(C10444b.f30934Y, true);
            i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM20694b);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e2);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m2);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            } else {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d2);
            c8410b.invoke(c6021p, Integer.valueOf((i15 >> 15) & 14));
            m9236a(c16305n, interfaceC1426a, null, interfaceC1436k, c6021p, (i15 & 126) | ((i15 << 3) & 7168));
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
            z12 = z11;
        } else {
            c10456n = C10456n.f30959Y;
            if (i16 != 0) {
                z11 = true;
            } else {
                z11 = z10;
            }
            if (z11) {
                interfaceC10459qM20694b = AbstractC19744u.m20694b(c10456n, C16297f.f50488a, new C16295d(c16305n, null));
            } else {
                interfaceC10459qM20694b = c10456n;
            }
            InterfaceC21057K interfaceC21057KM19511e3 = AbstractC17780r.m19511e(C10444b.f30934Y, true);
            i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM20694b);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e3);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m3);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            } else {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d3);
            c8410b.invoke(c6021p, Integer.valueOf((i15 >> 15) & 14));
            m9236a(c16305n, interfaceC1426a, null, interfaceC1436k, c6021p, (i15 & 126) | ((i15 << 3) & 7168));
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
            z12 = z11;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4163y1(c16305n, interfaceC1426a, interfaceC1436k, interfaceC10459q2, z12, c8410b, i10, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX INFO: renamed from: c */
    public static final Object m9238c(int i10, Object obj, C5576C c5576c, C5609y c5609y, int i11) {
        boolean z6;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        int i12 = 1;
        if ((C5606v.m5994a(i10, 1) || C5606v.m5994a(i10, 2)) && !AbstractC16544l.m18089b(c5576c.f18078b, c5609y)) {
            C5609y c5609y2 = C5609y.f18153p0;
            if (c5609y.compareTo(c5609y2) < 0 || AbstractC16544l.m18096i(c5576c.f18078b.f18160Y, c5609y2.f18160Y) >= 0) {
                z6 = false;
            } else {
                z6 = true;
            }
        } else {
            z6 = false;
        }
        boolean z10 = (C5606v.m5994a(i10, 1) || C5606v.m5994a(i10, 3)) && !C5605u.m5992a(i11, c5576c.f18079c);
        if (!z10 && !z6) {
            return obj;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return C5580G.f18083a.m5984a((Typeface) obj, z6 ? c5609y.f18160Y : c5576c.f18078b.f18160Y, z10 ? C5605u.m5992a(i11, 1) : C5605u.m5992a(c5576c.f18079c, 1));
        }
        boolean z11 = z10 && C5605u.m5992a(i11, 1);
        if (z11 && z6) {
            i12 = 3;
        } else if (!z6) {
            i12 = z11 ? 2 : 0;
        }
        return Typeface.create((Typeface) obj, i12);
    }
}
