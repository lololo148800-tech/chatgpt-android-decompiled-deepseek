package p544W9;

import androidx.compose.foundation.layout.AbstractC10842a;
import p003A1.AbstractC0187M0;
import p042Bf.AbstractC1274p;
import p049Bm.InterfaceC1439n;
import p124Ei.C2474R0;
import p254K0.AbstractC4505b;
import p254K0.C4509f;
import p254K0.C4510g;
import p254K0.C4511h;
import p254K0.C4516m;
import p254K0.C4518o;
import p349O0.C5984W0;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8210v0;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p635a1.InterfaceC10459q;
import p860l0.EnumC16673F0;
import p881m0.C17133j;
import p895n1.C17425e;
import p911o0.C17767k0;
import p911o0.InterfaceC17763i0;
import p960q9.C18655i;

/* JADX INFO: renamed from: W9.J2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8500J2 {

    /* JADX INFO: renamed from: a */
    public static C17425e f26323a;

    /* JADX INFO: renamed from: a */
    public static final void m9163a(C4518o c4518o, InterfaceC1439n interfaceC1439n, InterfaceC17763i0 interfaceC17763i0, InterfaceC10459q interfaceC10459q, float f10, C17133j c17133j, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        EnumC16673F0 enumC16673F0 = EnumC16673F0.f53402Z;
        c6021p.m6526U(-2035733443);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c4518o) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(enumC16673F0) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1439n) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC17763i0) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6538d(2) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6536c(f10) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c6021p.m6542f(c17133j) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 67108864 : 33554432;
        }
        if ((38347923 & i11) == 38347922 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6519N();
            if ((i10 & 1) != 0 && !c6021p.m6561x()) {
                c6021p.m6517L();
            }
            c6021p.m6554q();
            c6021p.m6524S(295830617);
            C5984W0 c5984w0 = AbstractC0187M0.f710l;
            float fM11228f = AbstractC10842a.m11228f(interfaceC17763i0, (EnumC7546k) c6021p.m6548k(c5984w0));
            c6021p.m6553p(false);
            C5984W0 c5984w1 = AbstractC0187M0.f704f;
            float fMo7864b0 = ((InterfaceC7537b) c6021p.m6548k(c5984w1)).mo7864b0(fM11228f);
            c6021p.m6524S(-587616383);
            float fM11227e = AbstractC10842a.m11227e(interfaceC17763i0, (EnumC7546k) c6021p.m6548k(c5984w0));
            c6021p.m6553p(false);
            float fMo7864b1 = ((InterfaceC7537b) c6021p.m6548k(c5984w1)).mo7864b0(fM11227e);
            boolean z6 = (i11 & 896) == 256;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C4516m(interfaceC1439n, fMo7864b0, fMo7864b1);
                c6021p.m6537c0(objM6514H);
            }
            C4516m c4516m = (C4516m) objM6514H;
            C18655i c18655i = new C18655i(c4516m, 10);
            c6021p.m6524S(-1618653092);
            AbstractC8210v0.m8835b(c4518o.f14761b, interfaceC10459q, AbstractC10842a.m11225c(0.0f, interfaceC17763i0.mo19475d(), 0.0f, interfaceC17763i0.mo19473b(), 5), c4516m, 2, f10, null, c17133j, false, false, null, null, c18655i, AbstractC8411c.m8969c(687111200, c6021p, new C2474R0(c4518o, c4516m, c8410b, 2)), c6021p, ((i11 >> 12) & 112) | (57344 & i11) | ((i11 >> 3) & 458752) | (i11 & 29360128), 3072, 3904);
            c6021p.m6553p(false);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4509f(c4518o, interfaceC1439n, interfaceC17763i0, interfaceC10459q, f10, c17133j, c8410b, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9164b(C4518o c4518o, InterfaceC10459q interfaceC10459q, float f10, C17133j c17133j, float f11, float f12, InterfaceC17763i0 interfaceC17763i0, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        int i12;
        C17133j c17133j2;
        float f13;
        InterfaceC17763i0 c17767k0;
        float f14;
        C17133j c17133j3;
        InterfaceC17763i0 interfaceC17763i1;
        float f15;
        float f16;
        float f17 = AbstractC1274p.f3385a;
        c6021p.m6526U(-1825706865);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c4518o) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6536c(f17) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6536c(f10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= 8192;
        }
        int i13 = 14352384 | i11;
        if ((100663296 & i10) == 0) {
            i13 |= c6021p.m6545h(c8410b) ? 67108864 : 33554432;
        }
        if ((38347923 & i13) == 38347922 && c6021p.m6562y()) {
            c6021p.m6517L();
            c17133j3 = c17133j;
            f16 = f11;
            f15 = f12;
            interfaceC17763i1 = interfaceC17763i0;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                C17133j c17133jM5253a = AbstractC4505b.m5253a(c4518o, c6021p, (i13 & 14) | 384);
                i12 = i13 & (-57345);
                float f18 = AbstractC4505b.f14701a;
                float f19 = AbstractC4505b.f14702b;
                float f20 = 0;
                c17133j2 = c17133jM5253a;
                f13 = f18;
                c17767k0 = new C17767k0(f20, f20, f20, f20);
                f14 = f19;
            } else {
                c6021p.m6517L();
                i12 = i13 & (-57345);
                c17133j2 = c17133j;
                f13 = f11;
                f14 = f12;
                c17767k0 = interfaceC17763i0;
            }
            c6021p.m6554q();
            InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
            boolean zM6542f = c6021p.m6542f(interfaceC7537b) | ((i12 & 112) == 32) | c6021p.m6545h(c4518o) | ((i12 & 458752) == 131072) | ((i12 & 3670016) == 1048576);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                objM6514H = new C4510g(interfaceC7537b, c4518o, f13, f14);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1439n interfaceC1439n = (InterfaceC1439n) objM6514H;
            int i14 = i12 << 9;
            float f21 = f14;
            m9163a(c4518o, interfaceC1439n, c17767k0, interfaceC10459q, f10, c17133j2, c8410b, c6021p, (i12 & 14) | 24624 | ((i12 >> 12) & 7168) | (458752 & i14) | (i14 & 3670016) | (i12 & 234881024));
            c17133j3 = c17133j2;
            interfaceC17763i1 = c17767k0;
            f15 = f21;
            f16 = f13;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4511h(c4518o, interfaceC10459q, f10, c17133j3, f16, f15, interfaceC17763i1, c8410b, i10);
        }
    }
}
