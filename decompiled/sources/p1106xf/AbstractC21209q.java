package p1106xf;

import cd.C11709i;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1042uh.C20263a0;
import p269Kh.C4684k;
import p291Lf.AbstractC5028y;
import p291Lf.C5020q;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p403Qd.AbstractC6659u;
import p478Tc.C7299c;
import p537W0.AbstractC8411c;
import p575Xd.C9436E;
import p621Zd.C10282c;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p823j3.C16084f;
import p860l0.C16663C;
import p951pp.AbstractC18539i;

/* JADX INFO: renamed from: xf.q */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC21209q {

    /* JADX INFO: renamed from: a */
    public static final float f67476a = 24;

    /* JADX INFO: renamed from: b */
    public static final long f67477b = AbstractC14334L.m15626d(4288387995L);

    /* JADX INFO: renamed from: a */
    public static final void m21616a(C10282c c10282c, C10282c c10282c2, AbstractC6659u abstractC6659u, boolean z6, C9436E c9436e, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C4684k c4684k, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, C20263a0 c20263a0, InterfaceC1436k interfaceC1436k2, C6021p c6021p, int i10, int i11) {
        int i12;
        int i13;
        boolean z15;
        C5020q c5020q;
        c6021p.m6526U(-87586037);
        if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c6021p.m6542f(c10282c) : c6021p.m6545h(c10282c) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= (i10 & 64) == 0 ? c6021p.m6542f(c10282c2) : c6021p.m6545h(c10282c2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= (i10 & 512) == 0 ? c6021p.m6542f(abstractC6659u) : c6021p.m6545h(abstractC6659u) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6544g(z6) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c6021p.m6542f(c9436e) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= c6021p.m6545h(interfaceC1436k) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= c6021p.m6542f(interfaceC10459q) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c6021p.m6542f(c4684k) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c6021p.m6544g(z10) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c6021p.m6544g(z11) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (c6021p.m6544g(z12) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c6021p.m6544g(z13) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= c6021p.m6544g(z14) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= (i11 & 4096) == 0 ? c6021p.m6542f(c20263a0) : c6021p.m6545h(c20263a0) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= c6021p.m6545h(interfaceC1436k2) ? 16384 : 8192;
        }
        int i14 = i13;
        if ((i12 & 306783379) == 306783378 && (i14 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-747360853);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (objM6514H == obj) {
                objM6514H = new C11709i(null, 3);
                c6021p.m6537c0(objM6514H);
            }
            C11709i c11709i = (C11709i) objM6514H;
            Object objM530s = AbstractC0168G.m530s(-747358985, c6021p, false);
            if (objM530s == obj) {
                objM530s = new C7299c();
                c6021p.m6537c0(objM530s);
            }
            C7299c c7299c = (C7299c) objM530s;
            c6021p.m6553p(false);
            Object objM19906b = AbstractC18539i.m19906b(c6021p);
            c6021p.m6524S(-747354806);
            if (z11) {
                c6021p.m6524S(-747345859);
                int i15 = 458752 & i12;
                boolean z16 = ((i12 & 896) == 256 || ((i12 & 512) != 0 && c6021p.m6545h(abstractC6659u))) | (i15 == 131072);
                Object objM6514H2 = c6021p.m6514H();
                if (z16 || objM6514H2 == obj) {
                    objM6514H2 = new C16084f(interfaceC1436k, 26, abstractC6659u);
                    c6021p.m6537c0(objM6514H2);
                }
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H2;
                c6021p.m6553p(false);
                c6021p.m6524S(-747352194);
                boolean zM6545h = c6021p.m6545h(objM19906b) | (i15 == 131072) | c6021p.m6545h(c11709i);
                Object objM6514H3 = c6021p.m6514H();
                if (zM6545h || objM6514H3 == obj) {
                    objM6514H3 = new C16663C(objM19906b, interfaceC1436k, c11709i, 17);
                    c6021p.m6537c0(objM6514H3);
                }
                z15 = false;
                c6021p.m6553p(false);
                c5020q = new C5020q(interfaceC1426a, (InterfaceC1436k) objM6514H3);
            } else {
                z15 = false;
                c5020q = null;
            }
            c6021p.m6553p(z15);
            AbstractC5028y.m5652a(abstractC6659u.m7174f(), c5020q, AbstractC8411c.m8969c(-686199654, c6021p, new C21207o(abstractC6659u, interfaceC10459q, c7299c, c11709i, c4684k, z10, z14, z6, z13, interfaceC1436k, interfaceC1436k2, c10282c, c10282c2, c20263a0, c9436e, z12)), c6021p, 384, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C21208p(c10282c, c10282c2, abstractC6659u, z6, c9436e, interfaceC1436k, interfaceC10459q, c4684k, z10, z11, z12, z13, z14, c20263a0, interfaceC1436k2, i10, i11);
        }
    }
}
