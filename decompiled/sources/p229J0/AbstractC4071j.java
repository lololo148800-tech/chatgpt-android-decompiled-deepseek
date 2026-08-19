package p229J0;

import androidx.compose.foundation.layout.AbstractC10842a;
import kotlin.jvm.internal.AbstractC16544l;
import mm.InterfaceC17302e;
import p003A1.AbstractC0168G;
import p042Bf.C1269k;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p080D0.C1834v;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p587Y1.C9588n;
import p594Y9.AbstractC9973t4;
import p635a1.AbstractC10443a;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.InterfaceC14339Q;
import p911o0.AbstractC17792x;
import p911o0.C17767k0;

/* JADX INFO: renamed from: J0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4071j {

    /* JADX INFO: renamed from: a */
    public static final float f12953a = 280;

    /* JADX INFO: renamed from: b */
    public static final float f12954b = 560;

    /* JADX INFO: renamed from: c */
    public static final float f12955c = 8;

    /* JADX INFO: renamed from: d */
    public static final float f12956d = 12;

    /* JADX INFO: renamed from: e */
    public static final C17767k0 f12957e;

    /* JADX INFO: renamed from: f */
    public static final C17767k0 f12958f;

    /* JADX INFO: renamed from: g */
    public static final C17767k0 f12959g;

    /* JADX INFO: renamed from: h */
    public static final C17767k0 f12960h;

    static {
        float f10 = 24;
        f12957e = new C17767k0(f10, f10, f10, f10);
        float f11 = 16;
        f12958f = AbstractC10842a.m11225c(0.0f, 0.0f, 0.0f, f11, 7);
        f12959g = AbstractC10842a.m11225c(0.0f, 0.0f, 0.0f, f11, 7);
        f12960h = AbstractC10842a.m11225c(0.0f, 0.0f, 0.0f, f10, 7);
    }

    /* JADX INFO: renamed from: a */
    public static final void m4739a(C8410b c8410b, InterfaceC10459q interfaceC10459q, InterfaceC1439n interfaceC1439n, InterfaceC1439n interfaceC1439n2, InterfaceC1439n interfaceC1439n3, InterfaceC14339Q interfaceC14339Q, long j10, float f10, long j11, long j12, long j13, long j14, C6021p c6021p, int i10, int i11) {
        int i12;
        int i13;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(1522575799);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(c8410b) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i12 | 48;
        if ((i10 & 384) == 0) {
            i14 |= c6021p.m6545h(interfaceC1439n) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i14 |= c6021p.m6545h(interfaceC1439n2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i14 |= c6021p.m6545h(interfaceC1439n3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i14 |= c6021p.m6542f(interfaceC14339Q) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i14 |= c6021p.m6540e(j10) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i14 |= c6021p.m6536c(f10) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i14 |= c6021p.m6540e(j11) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i14 |= c6021p.m6540e(j12) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (c6021p.m6540e(j13) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c6021p.m6540e(j14) ? 32 : 16;
        }
        if ((306783379 & i14) == 306783378 && (i13 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            int i15 = i14 >> 12;
            AbstractC4034c4.m4725a(c10456n, interfaceC14339Q, j10, 0L, f10, 0.0f, null, AbstractC8411c.m8969c(-2126308228, c6021p, new C4029c(interfaceC1439n, interfaceC1439n2, interfaceC1439n3, j12, j13, j14, j11, c8410b)), c6021p, ((i14 >> 3) & 14) | 12582912 | (i15 & 112) | (i15 & 896) | ((i14 >> 9) & 57344), 104);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4035d(c8410b, interfaceC10459q2, interfaceC1439n, interfaceC1439n2, interfaceC1439n3, interfaceC14339Q, j10, f10, j11, j12, j13, j14, i10, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m4740b(C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(586821353);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6536c(f12955c) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6536c(f12956d) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            boolean z6 = ((i11 & 14) == 4) | ((i11 & 112) == 32);
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C3907F0(1);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC21057K interfaceC21057K = (InterfaceC21057K) objM6514H;
            C10456n c10456n = C10456n.f30959Y;
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            int i13 = ((((i11 >> 6) & 14) << 6) & 896) | 6;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057K);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC17792x.m19538u((i13 >> 6) & 14, c8410b, c6021p, true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1834v(c8410b, i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m4741c(InterfaceC1426a interfaceC1426a, C8410b c8410b, InterfaceC10459q interfaceC10459q, InterfaceC1439n interfaceC1439n, InterfaceC1439n interfaceC1439n2, InterfaceC1439n interfaceC1439n3, InterfaceC1439n interfaceC1439n4, InterfaceC14339Q interfaceC14339Q, long j10, long j11, long j12, long j13, float f10, C9588n c9588n, C6021p c6021p, int i10, int i11) {
        int i12;
        int i13;
        c6021p.m6526U(-919826268);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(interfaceC1426a) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(c8410b) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6545h(interfaceC1439n) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c6021p.m6545h(interfaceC1439n2) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= c6021p.m6545h(interfaceC1439n3) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= c6021p.m6545h(interfaceC1439n4) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c6021p.m6542f(interfaceC14339Q) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c6021p.m6540e(j10) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c6021p.m6540e(j11) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (c6021p.m6540e(j12) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c6021p.m6540e(j13) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= c6021p.m6536c(f10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c6021p.m6542f(c9588n) ? 2048 : 1024;
        }
        if ((i12 & 306783379) == 306783378 && (i13 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            m4742d(interfaceC1426a, interfaceC10459q, c9588n, AbstractC8411c.m8969c(-1852840226, c6021p, new C4053g(interfaceC1439n2, interfaceC1439n3, interfaceC1439n4, interfaceC14339Q, j10, f10, j11, j12, j13, interfaceC1439n, c8410b)), c6021p, ((i12 >> 3) & 112) | (i12 & 14) | 3072 | ((i13 >> 3) & 896));
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4059h(interfaceC1426a, c8410b, interfaceC10459q, interfaceC1439n, interfaceC1439n2, interfaceC1439n3, interfaceC1439n4, interfaceC14339Q, j10, j11, j12, j13, f10, c9588n, i10, i11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m4742d(InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, C9588n c9588n, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1922902937);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1426a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(c9588n) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC9973t4.m10617b(interfaceC1426a, c9588n, AbstractC8411c.m8969c(905289008, c6021p, new C4065i(interfaceC10459q, c8410b, 0)), c6021p, (i11 & 14) | 384 | ((i11 >> 3) & 112), 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(interfaceC1426a, (Object) interfaceC10459q, (Object) c9588n, (InterfaceC17302e) c8410b, i10, 6);
        }
    }
}
