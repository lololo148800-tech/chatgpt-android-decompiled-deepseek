package p544W9;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.p650ui.graphics.AbstractC10864a;
import androidx.compose.p650ui.layout.AbstractC10868a;
import com.openai.chatgpt.R;
import io.C15045a;
import io.C15046b;
import io.C15048d;
import io.C15053i;
import io.C15105o;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p042Bf.C1269k;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1051v0.AbstractC20417e;
import p1051v0.C20416d;
import p1095x1.AbstractC21075b0;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p153Fn.C2925c;
import p228J.AbstractC3794B0;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3959O0;
import p229J0.C3949M0;
import p291Lf.AbstractC5023t;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6035w;
import p349O0.C6042z0;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p479Td.EnumC7359j0;
import p523V9.AbstractC8079e5;
import p523V9.AbstractC8126k4;
import p537W0.C8409a;
import p537W0.C8410b;
import p594Y9.AbstractC9793Q3;
import p621Zd.C10282c;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p860l0.AbstractC16786v0;
import p911o0.AbstractC17780r;
import p911o0.C17782s;
import p937p1.InterfaceC18285a;

/* JADX INFO: renamed from: W9.i3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8650i3 {
    /* JADX INFO: renamed from: a */
    public static final void m9321a(C15105o state, InterfaceC10459q interfaceC10459q, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(state, "state");
        c6021p.m6526U(1195102120);
        if ((i10 & 14) == 0) {
            i11 = (c6021p.m6542f(state) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6525T(773894976);
            c6021p.m6525T(-492369756);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            c6021p.m6553p(false);
            C2925c c2925c = ((C6035w) objM6514H).f19668Y;
            c6021p.m6553p(false);
            InterfaceC18285a interfaceC18285a = (InterfaceC18285a) c6021p.m6548k(AbstractC0187M0.f708j);
            c6021p.m6525T(-1897621229);
            int i12 = i11 & 14;
            boolean z6 = i12 == 4;
            Object objM6514H2 = c6021p.m6514H();
            if (z6 || objM6514H2 == c5975s) {
                objM6514H2 = new C15045a(state, 0);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11230h = AbstractC10842a.m11230h(interfaceC10459q, (InterfaceC1436k) objM6514H2);
            c6021p.m6525T(-1897619068);
            boolean z10 = i12 == 4;
            Object objM6514H3 = c6021p.m6514H();
            if (z10 || objM6514H3 == c5975s) {
                objM6514H3 = new C15045a(state, 1);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11305a = AbstractC10864a.m11305a(interfaceC10459qM11230h, (InterfaceC1436k) objM6514H3);
            boolean z11 = state.m16229b() instanceof C15053i;
            c6021p.m6525T(-1897611994);
            boolean z12 = i12 == 4;
            Object objM6514H4 = c6021p.m6514H();
            if (z12 || objM6514H4 == c5975s) {
                objM6514H4 = new C15046b(state, null);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM18554a = AbstractC16786v0.m18554a(interfaceC10459qM11305a, state.f46994i, false, null, z11, (InterfaceC1440o) objM6514H4, new C15048d(c2925c, state, interfaceC18285a, null), false, 140);
            c6021p.m6525T(-1897598345);
            boolean z13 = i12 == 4;
            Object objM6514H5 = c6021p.m6514H();
            if (z13 || objM6514H5 == c5975s) {
                objM6514H5 = new C15045a(state, 2);
                c6021p.m6537c0(objM6514H5);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11319e = AbstractC10868a.m11319e(interfaceC10459qM18554a, (InterfaceC1436k) objM6514H5);
            c6021p.m6525T(733328855);
            C17782s c17782sM19512f = AbstractC17780r.m19512f(0, c6021p, false);
            c6021p.m6525T(-1323940314);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            C8410b c8410bM21570k = AbstractC21075b0.m21570k(interfaceC10459qM11319e);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17782sM19512f);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            c8410bM21570k.invoke(new C6042z0(c6021p), c6021p, 0);
            c6021p.m6525T(2058660585);
            c8410b.invoke(C10843b.f32509a, c6021p, Integer.valueOf(((i11 >> 3) & 112) | 6));
            c6021p.m6553p(false);
            AbstractC3794B0.m4471F(c6021p, true, false, false);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a((Object) state, (Object) interfaceC10459q, c8410b, i10, 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:75:0x011c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0120  */
    /* JADX WARN: Code duplicated, block: B:81:0x0141  */
    /* JADX WARN: Code duplicated, block: B:83:0x0172  */
    /* JADX WARN: Code duplicated, block: B:85:0x0176 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0178  */
    /* JADX WARN: Code duplicated, block: B:88:0x017c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0195  */
    /* JADX INFO: renamed from: b */
    public static final void m9322b(EnumC7359j0 role, InterfaceC10459q interfaceC10459q, C10282c c10282c, C10282c c10282c2, C6021p c6021p, int i10) {
        int i11;
        boolean z6;
        int i12;
        C21696i c21696i;
        C21694h c21694h;
        AbstractC16544l.m18094g(role, "role");
        c6021p.m6526U(-1846387683);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(role) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? c6021p.m6542f(c10282c) : c6021p.m6545h(c10282c) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & 4096) == 0 ? c6021p.m6542f(c10282c2) : c6021p.m6545h(c10282c2) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            int iOrdinal = role.ordinal();
            if (iOrdinal == 1 || iOrdinal == 13 || iOrdinal == 14) {
                if ((c10282c != null ? c10282c.f30533d : null) == null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            c6021p.m6524S(-702086632);
            float f10 = AbstractC5023t.f16408c;
            float f11 = AbstractC5023t.f16409d;
            InterfaceC10459q interfaceC10459qM11252l = AbstractC10844c.m11252l(interfaceC10459q, (2 * f11) + f10);
            if (!z6) {
                interfaceC10459qM11252l = AbstractC10842a.m11233k(interfaceC10459qM11252l, f11);
            }
            C20416d c20416d = AbstractC20417e.f64539a;
            InterfaceC10459q interfaceC10459qM8501a = AbstractC8079e5.m8501a(interfaceC10459qM11252l, c20416d);
            if (z6) {
                interfaceC10459qM8501a = AbstractC8443A.m9045a(interfaceC10459qM8501a, f11, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12187A, c20416d);
            }
            InterfaceC10459q interfaceC10459q2 = interfaceC10459qM8501a;
            c6021p.m6553p(false);
            if (role == EnumC7359j0.f23344o0) {
                if ((c10282c != null ? c10282c.f30533d : null) != null) {
                    c6021p.m6524S(-289629165);
                    AbstractC9793Q3.m10411a(c10282c.f30533d, false, interfaceC10459q2, null, 0L, c6021p, 48);
                    c6021p.m6553p(false);
                } else if (z6) {
                    c6021p.m6524S(-289411979);
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    i12 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q2);
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
                    if (c6021p.f19563O) {
                        AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
                    } else {
                        AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.design_logo_assistant, c6021p, 0), null, AbstractC10842a.m11233k(c10456n, AbstractC7313q.f23198c), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12235q, c6021p, 48, 0);
                    c6021p.m6553p(true);
                    c6021p.m6553p(false);
                } else if (role != EnumC7359j0.f23343Z) {
                    c6021p.m6524S(-288780168);
                    AbstractC17780r.m19507a(AbstractC10833a.m11207b(interfaceC10459q2, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12213a, AbstractC14334L.f44973a), c6021p, 0);
                    c6021p.m6553p(false);
                } else {
                    if ((c10282c2 != null ? c10282c2.f30533d : null) != null) {
                        c6021p.m6524S(-288976584);
                        AbstractC9793Q3.m10411a(c10282c2.f30533d, false, interfaceC10459q2, null, 0L, c6021p, 48);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(-288780168);
                        AbstractC17780r.m19507a(AbstractC10833a.m11207b(interfaceC10459q2, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12213a, AbstractC14334L.f44973a), c6021p, 0);
                        c6021p.m6553p(false);
                    }
                }
            } else if (z6) {
                c6021p.m6524S(-289411979);
                InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                i12 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459q2);
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
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                    AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d2);
                AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.design_logo_assistant, c6021p, 0), null, AbstractC10842a.m11233k(c10456n, AbstractC7313q.f23198c), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12235q, c6021p, 48, 0);
                c6021p.m6553p(true);
                c6021p.m6553p(false);
            } else if (role != EnumC7359j0.f23343Z) {
                c6021p.m6524S(-288780168);
                AbstractC17780r.m19507a(AbstractC10833a.m11207b(interfaceC10459q2, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12213a, AbstractC14334L.f44973a), c6021p, 0);
                c6021p.m6553p(false);
            } else {
                if ((c10282c2 != null ? c10282c2.f30533d : null) != null) {
                    c6021p.m6524S(-288976584);
                    AbstractC9793Q3.m10411a(c10282c2.f30533d, false, interfaceC10459q2, null, 0L, c6021p, 48);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-288780168);
                    AbstractC17780r.m19507a(AbstractC10833a.m11207b(interfaceC10459q2, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12213a, AbstractC14334L.f44973a), c6021p, 0);
                    c6021p.m6553p(false);
                }
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(role, interfaceC10459q, c10282c, c10282c2, i10, 10);
        }
    }
}
