package p179H0;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.draw.AbstractC10861a;
import androidx.compose.p650ui.graphics.AbstractC10864a;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import fo.C13711h;
import kotlin.jvm.internal.AbstractC16544l;
import p000.C16280k;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p1051v0.AbstractC20417e;
import p1051v0.C20416d;
import p106E0.AbstractC2229c;
import p106E0.AbstractC2232f;
import p106E0.C2227a;
import p106E0.C2231e;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2441A0;
import p124Ei.C2550w0;
import p156G1.AbstractC2965l;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC6008i0;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8103h5;
import p523V9.AbstractC8239y5;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8455C;
import p604Yk.C10077b;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.InterfaceC10459q;
import p758g0.AbstractC13725A;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13764h;
import p758g0.C13781p0;
import p759g1.C13800b;
import p759g1.C13801c;
import p774h1.AbstractC14334L;
import p774h1.C14353i;
import p774h1.C14365u;
import p774h1.InterfaceC14333K;
import p775h2.AbstractC14376f;
import p821j1.InterfaceC16039d;
import p911o0.AbstractC17780r;

/* JADX INFO: renamed from: H0.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3189g {

    /* JADX INFO: renamed from: a */
    public static final float f9614a = 40;

    /* JADX INFO: renamed from: b */
    public static final C20416d f9615b = AbstractC20417e.f64539a;

    /* JADX INFO: renamed from: c */
    public static final float f9616c = (float) 7.5d;

    /* JADX INFO: renamed from: d */
    public static final float f9617d = (float) 2.5d;

    /* JADX INFO: renamed from: e */
    public static final float f9618e = 10;

    /* JADX INFO: renamed from: f */
    public static final float f9619f = 5;

    /* JADX INFO: renamed from: g */
    public static final float f9620g = 6;

    /* JADX INFO: renamed from: h */
    public static final C13781p0 f9621h = AbstractC13758e.m15255t(RCHTTPStatusCodes.UNSUCCESSFUL, 0, AbstractC13725A.f43291d, 2);

    /* JADX INFO: renamed from: a */
    public static final void m4035a(boolean z6, C3196n c3196n, InterfaceC10459q interfaceC10459q, long j10, long j11, boolean z10, C6021p c6021p, int i10) {
        int i11;
        int i12;
        boolean z11;
        long jM3266a;
        long j12;
        long jM15636n;
        C14365u c14365u;
        long j13;
        boolean z12;
        long j14;
        c6021p.m6526U(308716636);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c3196n) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= 8192;
        }
        int i13 = i11 | 196608;
        if ((74899 & i13) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
            j13 = j10;
            j14 = j11;
            z12 = z10;
        } else {
            c6021p.m6519N();
            boolean z13 = false;
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                long j15 = ((C14365u) ((C2227a) c6021p.m6548k(AbstractC2229c.f6833a)).f6820f.getValue()).f45062a;
                i12 = i13 & (-64513);
                z11 = false;
                jM3266a = AbstractC2229c.m3266a(j15, c6021p);
                j12 = j15;
            } else {
                c6021p.m6517L();
                i12 = i13 & (-64513);
                j12 = j10;
                jM3266a = j11;
                z11 = z10;
            }
            c6021p.m6554q();
            int i14 = i12 & 14;
            boolean zM6542f = (i14 == 4) | c6021p.m6542f(c3196n);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                objM6514H = C5997d.m6421H(new C2550w0(z6, c3196n, 1));
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5982V0 interfaceC5982V0 = (InterfaceC5982V0) objM6514H;
            C2231e c2231e = (C2231e) c6021p.m6548k(AbstractC2232f.f6836a);
            float f10 = f9620g;
            if (c2231e == null) {
                c6021p.m6524S(-1347612331);
                c6021p.m6553p(false);
                interfaceC5982V0 = interfaceC5982V0;
                c14365u = null;
            } else {
                c6021p.m6524S(1619096620);
                c6021p.m6524S(-1687113661);
                C2227a c2227a = (C2227a) c6021p.m6548k(AbstractC2229c.f6833a);
                if (Float.compare(f10, 0) <= 0 || ((Boolean) c2227a.f6827m.getValue()).booleanValue()) {
                    c6021p.m6524S(1169152471);
                    c6021p.m6553p(false);
                    jM15636n = j12;
                } else {
                    c6021p.m6524S(1169013963);
                    jM15636n = AbstractC14334L.m15636n(C14365u.m15774b(((((float) Math.log(1 + f10)) * 4.5f) + 2.0f) / 100.0f, AbstractC2229c.m3266a(j12, c6021p)), j12);
                    z13 = false;
                    c6021p.m6553p(false);
                }
                c6021p.m6553p(z13);
                c6021p.m6553p(z13);
                c14365u = new C14365u(jM15636n);
            }
            long j16 = c14365u != null ? c14365u.f45062a : j12;
            InterfaceC10459q interfaceC10459qM11305a = AbstractC10864a.m11305a(AbstractC10861a.m11297c(AbstractC10844c.m11252l(interfaceC10459q, f9614a), C3185c.f9598o0), new C3190h(c3196n, z11));
            if (!((Boolean) interfaceC5982V0.getValue()).booleanValue()) {
                f10 = 0;
            }
            C20416d c20416d = f9615b;
            InterfaceC10459q interfaceC10459qM11207b = AbstractC10833a.m11207b(AbstractC8103h5.m8581b(interfaceC10459qM11305a, f10, c20416d, true, 24), j16, c20416d);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11207b);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC8239y5.m8886b(Boolean.valueOf(z6), null, AbstractC13758e.m15255t(100, 0, null, 6), null, AbstractC8411c.m8969c(1853731063, c6021p, new C16280k(jM3266a, c3196n, 2)), c6021p, i14 | 24960, 10);
            c6021p.m6553p(true);
            j13 = j12;
            z12 = z11;
            j14 = jM3266a;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3188f(z6, c3196n, interfaceC10459q, j13, j14, z12, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m4036b(C3196n c3196n, long j10, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-486016981);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c3196n) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6540e(j10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            Object obj2 = objM6514H;
            if (objM6514H == obj) {
                C14353i c14353iM15631i = AbstractC14334L.m15631i();
                c14353iM15631i.m15734f(1);
                c6021p.m6537c0(c14353iM15631i);
                obj2 = c14353iM15631i;
            }
            Object obj3 = (InterfaceC14333K) obj2;
            boolean zM6542f = c6021p.m6542f(c3196n);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj) {
                objM6514H2 = C5997d.m6421H(new C3187e(c3196n, 0));
                c6021p.m6537c0(objM6514H2);
            }
            Object objM15261b = AbstractC13764h.m15261b(((Number) ((InterfaceC5982V0) objM6514H2).getValue()).floatValue(), f9621h, null, c6021p, 48, 28);
            InterfaceC10459q interfaceC10459qM3789a = AbstractC2965l.m3789a(interfaceC10459q, false, C3185c.f9597Z);
            boolean zM6545h = c6021p.m6545h(c3196n) | c6021p.m6542f(objM15261b) | ((i12 & 112) == 32) | c6021p.m6545h(obj3);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h || objM6514H3 == obj) {
                Object c3186d = new C3186d(c3196n, objM15261b, j10, obj3, 0);
                c6021p.m6537c0(c3186d);
                objM6514H3 = c3186d;
            }
            AbstractC8455C.m9069a(0, (InterfaceC1436k) objM6514H3, c6021p, interfaceC10459qM3789a);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2441A0(c3196n, j10, interfaceC10459q, i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m4037c(InterfaceC16039d interfaceC16039d, InterfaceC14333K interfaceC14333K, C13801c c13801c, long j10, float f10, C3183a c3183a) {
        C14353i c14353i = (C14353i) interfaceC14333K;
        c14353i.m15733e();
        c14353i.m15731c(0.0f, 0.0f);
        float f11 = f9618e;
        float fMo7864b0 = interfaceC16039d.mo7864b0(f11);
        float f12 = c3183a.f9594Z;
        c14353i.m15730b(fMo7864b0 * f12, 0.0f);
        c14353i.m15730b((interfaceC16039d.mo7864b0(f11) * f12) / 2, interfaceC16039d.mo7864b0(f9619f) * f12);
        c14353i.m15735g(AbstractC8088f6.m8536b((C13800b.m15306g(c13801c.m15317d()) + (Math.min(c13801c.m15321h(), c13801c.m15318e()) / 2.0f)) - ((interfaceC16039d.mo7864b0(f11) * f12) / 2.0f), (interfaceC16039d.mo7864b0(f9617d) / 2.0f) + C13800b.m15307h(c13801c.m15317d())));
        c14353i.f45039a.close();
        float f13 = c3183a.f9593Y;
        long jMo17604o0 = interfaceC16039d.mo17604o0();
        C13711h c13711hMo17601f0 = interfaceC16039d.mo17601f0();
        long jM15202x = c13711hMo17601f0.m15202x();
        c13711hMo17601f0.m15196m().mo15706e();
        try {
            ((C10077b) c13711hMo17601f0.f43259Z).m10662J(f13, jMo17604o0);
            AbstractC14376f.m15848n(interfaceC16039d, c14353i, j10, f10, null, 56);
        } finally {
            AbstractC12107L1.m13830u(c13711hMo17601f0, jM15202x);
        }
    }
}
