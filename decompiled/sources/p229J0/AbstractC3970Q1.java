package p229J0;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.graphics.AbstractC10864a;
import kotlin.jvm.internal.AbstractC16544l;
import p002A0.C0102A;
import p002A0.C0103B;
import p002A0.C0148y;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p758g0.AbstractC13725A;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13779o0;
import p758g0.AbstractC13785r0;
import p758g0.C13740P;
import p758g0.C13767i0;
import p758g0.C13771k0;
import p758g0.C13781p0;
import p758g0.C13783q0;
import p758g0.InterfaceC13763g0;
import p773h0.C14311u;
import p773h0.C14322z0;
import p774h1.InterfaceC14339Q;
import p894n0.InterfaceC17406l;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.C17781r0;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: J0.Q1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3970Q1 {

    /* JADX INFO: renamed from: a */
    public static final float f12404a;

    /* JADX INFO: renamed from: b */
    public static final float f12405b;

    /* JADX INFO: renamed from: c */
    public static final float f12406c = 12;

    /* JADX INFO: renamed from: d */
    public static final float f12407d = 8;

    /* JADX INFO: renamed from: e */
    public static final float f12408e = 112;

    /* JADX INFO: renamed from: f */
    public static final float f12409f = 280;

    static {
        float f10 = 48;
        f12404a = f10;
        f12405b = f10;
    }

    /* JADX INFO: renamed from: a */
    public static final void m4665a(InterfaceC10459q interfaceC10459q, C13740P c13740p, InterfaceC5985X interfaceC5985X, C14322z0 c14322z0, InterfaceC14339Q interfaceC14339Q, long j10, float f10, float f11, C14311u c14311u, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        C13781p0 c13781p0M15255t;
        boolean z6;
        c6021p.m6526U(-151448888);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c6021p.m6542f(c13740p) : c6021p.m6545h(c13740p) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC5985X) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(c14322z0) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6542f(interfaceC14339Q) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6540e(j10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6536c(f10) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i11 |= c6021p.m6536c(f11) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i11 |= c6021p.m6542f(c14311u) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 536870912 : 268435456;
        }
        if ((i11 & 306783379) == 306783378 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C13771k0 c13771k0M15290c = AbstractC13779o0.m15290c(c13740p, "DropDownMenu", c6021p, (((i11 >> 3) & 14) | 48) & 126);
            C13783q0 c13783q0 = AbstractC13785r0.f43528a;
            boolean zBooleanValue = ((Boolean) c13771k0M15290c.m15272c()).booleanValue();
            int i12 = i11;
            c6021p.m6524S(2139028452);
            float f12 = zBooleanValue ? 1.0f : 0.8f;
            c6021p.m6553p(false);
            Float fValueOf = Float.valueOf(f12);
            C6002f0 c6002f0 = c13771k0M15290c.f43492d;
            boolean zBooleanValue2 = ((Boolean) c6002f0.getValue()).booleanValue();
            c6021p.m6524S(2139028452);
            float f13 = zBooleanValue2 ? 1.0f : 0.8f;
            c6021p.m6553p(false);
            Float fValueOf2 = Float.valueOf(f13);
            InterfaceC13763g0 interfaceC13763g0M15275f = c13771k0M15290c.m15275f();
            c6021p.m6524S(1033023423);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            if (interfaceC13763g0M15275f.mo15005b(bool, bool2)) {
                c13781p0M15255t = AbstractC13758e.m15255t(120, 0, AbstractC13725A.f43289b, 2);
                z6 = false;
            } else {
                c13781p0M15255t = AbstractC13758e.m15255t(1, 74, null, 4);
                z6 = false;
            }
            c6021p.m6553p(z6);
            boolean z10 = z6;
            C13767i0 c13767i0M15289b = AbstractC13779o0.m15289b(c13771k0M15290c, fValueOf, fValueOf2, c13781p0M15255t, c13783q0, c6021p, 0);
            boolean zBooleanValue3 = ((Boolean) c13771k0M15290c.m15272c()).booleanValue();
            c6021p.m6524S(-249413128);
            float f14 = zBooleanValue3 ? 1.0f : 0.0f;
            c6021p.m6553p(z10);
            Float fValueOf3 = Float.valueOf(f14);
            boolean zBooleanValue4 = ((Boolean) c6002f0.getValue()).booleanValue();
            c6021p.m6524S(-249413128);
            float f15 = zBooleanValue4 ? 1.0f : 0.0f;
            c6021p.m6553p(z10);
            Float fValueOf4 = Float.valueOf(f15);
            InterfaceC13763g0 interfaceC13763g0M15275f2 = c13771k0M15290c.m15275f();
            c6021p.m6524S(-1355418157);
            C13781p0 c13781p0M15255t2 = interfaceC13763g0M15275f2.mo15005b(bool, bool2) ? AbstractC13758e.m15255t(30, z10 ? 1 : 0, null, 6) : AbstractC13758e.m15255t(75, z10 ? 1 : 0, null, 6);
            c6021p.m6553p(z10);
            Object objM15289b = AbstractC13779o0.m15289b(c13771k0M15290c, fValueOf3, fValueOf4, c13781p0M15255t2, c13783q0, c6021p, 0);
            boolean zBooleanValue5 = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            C10456n c10456n = C10456n.f30959Y;
            boolean zM6544g = c6021p.m6544g(zBooleanValue5) | c6021p.m6542f(c13767i0M15289b) | ((i12 & 112) == 32 || ((i12 & 64) != 0 && c6021p.m6545h(c13740p))) | c6021p.m6542f(objM15289b) | ((i12 & 896) == 256);
            Object objM6514H = c6021p.m6514H();
            if (zM6544g || objM6514H == C6013l.f19514a) {
                Object c0102a = new C0102A(zBooleanValue5, c13740p, interfaceC5985X, c13767i0M15289b, objM15289b, 2);
                c6021p.m6537c0(c0102a);
                objM6514H = c0102a;
            }
            int i13 = i12 >> 9;
            int i14 = i12 >> 6;
            AbstractC4034c4.m4725a(AbstractC10864a.m11305a(c10456n, (InterfaceC1436k) objM6514H), interfaceC14339Q, j10, 0L, f10, f11, c14311u, AbstractC8411c.m8969c(1573559053, c6021p, new C0148y(interfaceC10459q, c14322z0, c8410b, 8)), c6021p, (i13 & 896) | (i13 & 112) | 12582912 | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 8);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3965P1(interfaceC10459q, c13740p, interfaceC5985X, c14322z0, interfaceC14339Q, j10, f10, f11, c14311u, c8410b, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m4666b(InterfaceC1439n interfaceC1439n, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, InterfaceC1439n interfaceC1439n2, InterfaceC1439n interfaceC1439n3, boolean z6, C3960O1 c3960o1, InterfaceC17763i0 interfaceC17763i0, InterfaceC17406l interfaceC17406l, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1564716777);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1439n) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1439n2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(interfaceC1439n3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6544g(z6) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6542f(c3960o1) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c6021p.m6542f(interfaceC17763i0) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c6021p.m6542f(interfaceC17406l) ? 67108864 : 33554432;
        }
        if ((i11 & 38347923) == 38347922 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC10459q interfaceC10459qM11232j = AbstractC10842a.m11232j(AbstractC10844c.m11255o(AbstractC10844c.m11244d(AbstractC10833a.m11208c(interfaceC10459q, interfaceC17406l, AbstractC4005X2.m4718c(true, 0.0f, c6021p, 6, 6), z6, null, interfaceC1426a, 24), 1.0f), f12408e, f12405b, f12409f, 0.0f, 8), interfaceC17763i0);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30944w0, c6021p, 48);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11232j);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC4124r4.m4767a(((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12157m, AbstractC8411c.m8969c(1065051884, c6021p, new C0103B(interfaceC1439n2, c3960o1, z6, interfaceC1439n3, interfaceC1439n, 2)), c6021p, 48);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4120r0(interfaceC1439n, interfaceC1426a, interfaceC10459q, interfaceC1439n2, interfaceC1439n3, z6, c3960o1, interfaceC17763i0, interfaceC17406l, i10);
        }
    }
}
