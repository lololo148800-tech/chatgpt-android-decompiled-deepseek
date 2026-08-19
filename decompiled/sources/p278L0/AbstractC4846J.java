package p278L0;

import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import p002A0.C0146w;
import p003A1.AbstractC0168G;
import p006A4.C0349j;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1014t1.AbstractC19744u;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2463L0;
import p124Ei.C2467N0;
import p153Fn.C2925c;
import p156G1.AbstractC2965l;
import p193Hf.C3310H0;
import p204I1.C3582M;
import p204I1.C3607w;
import p204I1.C3609y;
import p228J.AbstractC3794B0;
import p229J0.AbstractC4025b1;
import p229J0.AbstractC4124r4;
import p229J0.C3899D4;
import p229J0.C4154w4;
import p229J0.C4171z3;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6014l0;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6035w;
import p349O0.C6037x;
import p349O0.InterfaceC6008i0;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p587Y1.AbstractC9582h;
import p587Y1.C9596v;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: L0.J */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4846J {

    /* JADX INFO: renamed from: a */
    public static final C3609y f15777a = new C3609y(null, new C3607w());

    /* JADX INFO: renamed from: a */
    public static final void m5492a(C4154w4 c4154w4, C8410b c8410b, C3899D4 c3899d4, InterfaceC10459q interfaceC10459q, boolean z6, boolean z10, C8410b c8410b2, C6021p c6021p, int i10) {
        int i11;
        boolean z11;
        c6021p.m6526U(-550509567);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c4154w4) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? c6021p.m6542f(c3899d4) : c6021p.m6545h(c3899d4) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6544g(z6) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6544g(z10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6545h(c8410b2) ? 1048576 : 524288;
        }
        int i12 = i11;
        if ((599187 & i12) == 599186 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            C2925c c2925c = ((C6035w) objM6514H).f19668Y;
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
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
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(-625876949);
            if (c3899d4.m4608a()) {
                int i14 = i12 >> 3;
                z11 = false;
                m5494c(c4154w4, c3899d4, c2925c, z6, c8410b, c6021p, (i12 & 14) | (i14 & 112) | (i14 & 7168) | ((i12 << 9) & 57344));
            } else {
                z11 = false;
            }
            c6021p.m6553p(z11);
            int i15 = i12 >> 3;
            m5495d(z10, c3899d4, interfaceC10459q, c8410b2, c6021p, ((i12 >> 15) & 14) | (i15 & 112) | (i15 & 896) | ((i12 >> 9) & 7168));
            boolean z12 = true;
            c6021p.m6553p(true);
            if ((i12 & 896) != 256 && ((i12 & 512) == 0 || !c6021p.m6545h(c3899d4))) {
                z12 = z11;
            }
            Object objM6514H2 = c6021p.m6514H();
            if (z12 || objM6514H2 == c5975s) {
                objM6514H2 = new C4171z3(c3899d4, 6);
                c6021p.m6537c0(objM6514H2);
            }
            C5997d.m6444c(c3899d4, (InterfaceC1436k) objM6514H2, c6021p);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3310H0(c4154w4, c8410b, c3899d4, interfaceC10459q, z6, z10, c8410b2, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m5493b(long j10, C3582M c3582m, InterfaceC1439n interfaceC1439n, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-716124955);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6540e(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c3582m) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1439n) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C6037x c6037x = AbstractC4124r4.f13310a;
            C5997d.m6442b(new C6014l0[]{AbstractC3794B0.m4494s(j10, AbstractC4025b1.f12649a), c6037x.mo6405a(((C3582M) c6021p.m6548k(c6037x)).m4280g(c3582m))}, interfaceC1439n, c6021p, ((i11 >> 3) & 112) | 8);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4860Y(j10, c3582m, interfaceC1439n, i10, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m5494c(C4154w4 c4154w4, C3899D4 c3899d4, C2925c c2925c, boolean z6, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-273292979);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c4154w4) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c6021p.m6542f(c3899d4) : c6021p.m6545h(c3899d4) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(c2925c) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6544g(z6) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            String strM8676d = AbstractC8142m4.m8676d(R.string.tooltip_description, c6021p);
            boolean zM6545h = ((i11 & 112) == 32 || ((i11 & 64) != 0 && c6021p.m6545h(c3899d4))) | c6021p.m6545h(c2925c);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                objM6514H = new C4897x(c3899d4, c2925c);
                c6021p.m6537c0(objM6514H);
            }
            AbstractC9582h.m10129a(c4154w4, (InterfaceC1426a) objM6514H, new C9596v(z6, 14), AbstractC8411c.m8969c(610617071, c6021p, new C0349j(strM8676d, 20, c8410b)), c6021p, (i11 & 14) | 3072, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2467N0(c4154w4, c3899d4, c2925c, z6, c8410b, i10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m5495d(boolean z6, C3899D4 c3899d4, InterfaceC10459q interfaceC10459q, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(1848240995);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c6021p.m6542f(c3899d4) : c6021p.m6545h(c3899d4) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Object objM6514H = c6021p.m6514H();
            if (objM6514H == C6013l.f19514a) {
                objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            C2925c c2925c = ((C6035w) objM6514H).f19668Y;
            String strM8676d = AbstractC8142m4.m8676d(R.string.tooltip_label, c6021p);
            InterfaceC10459q interfaceC10459qM20694b = z6 ? AbstractC19744u.m20694b(AbstractC19744u.m20694b(interfaceC10459q, c3899d4, new C4841E(c3899d4, null)), c3899d4, new C4845I(c3899d4, null)) : interfaceC10459q;
            if (z6) {
                interfaceC10459qM20694b = AbstractC2965l.m3789a(interfaceC10459qM20694b, true, new C0146w(strM8676d, c2925c, c3899d4, 25));
            }
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM20694b);
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
            AbstractC17792x.m19538u((i11 >> 9) & 14, c8410b, c6021p, true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2463L0(z6, c3899d4, interfaceC10459q, c8410b, i10, 3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final String m5496e(int i10, C6021p c6021p) {
        c6021p.m6548k(AndroidCompositionLocals_androidKt.f32824a);
        return ((Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b)).getResources().getString(i10);
    }
}
