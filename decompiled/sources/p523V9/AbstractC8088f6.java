package p523V9;

import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16557y;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C22011h0;
import p1155zi.C22071w0;
import p124Ei.C2457I0;
import p153Fn.C2925c;
import p179H0.AbstractC3184b;
import p179H0.C3196n;
import p229J0.C4120r0;
import p291Lf.AbstractC5028y;
import p291Lf.C5026w;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6035w;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p479Td.AbstractC7343b0;
import p479Td.C7323I;
import p479Td.C7364o;
import p479Td.EnumC7359j0;
import p492U1.InterfaceC7537b;
import p575Xd.C9436E;
import p594Y9.AbstractC9930m3;
import p635a1.AbstractC10443a;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17681o;
import p911o0.AbstractC17788v;
import p911o0.C17790w;

/* JADX INFO: renamed from: V9.f6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8088f6 {
    /* JADX INFO: renamed from: a */
    public static final void m8535a(String str, EnumC7359j0 role, C22071w0 c22071w0, String messageId, C7323I content, C9436E safeUrls, InterfaceC1436k onIntent, InterfaceC10459q interfaceC10459q, boolean z6, C6021p c6021p, int i10) {
        boolean z10 = z6;
        C6021p c6021p2 = c6021p;
        AbstractC16544l.m18094g(role, "role");
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(content, "content");
        AbstractC16544l.m18094g(safeUrls, "safeUrls");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p2.m6526U(1529276794);
        int i11 = (i10 & 6) == 0 ? (c6021p2.m6542f(str != null ? new C22011h0(str) : null) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c6021p2.m6542f(role) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p2.m6545h(c22071w0) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p2.m6542f(messageId) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p2.m6542f(content) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p2.m6542f(safeUrls) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p2.m6545h(onIntent) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c6021p2.m6542f(interfaceC10459q) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c6021p2.m6544g(z10) ? 67108864 : 33554432;
        }
        int i12 = i11;
        if ((i12 & 38347923) == 38347922 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C5026w c5026w = (C5026w) c6021p2.m6548k(AbstractC5028y.f16440a);
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(interfaceC10459q, 1.0f);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(c5026w.f16438f, c5026w.f16437e, c6021p2, 0);
            int i13 = c6021p2.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p2, interfaceC10459qM11244d);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p2.f19563O) {
                c6021p2.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p2, c17790wM19515a);
            C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p2, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d);
            c6021p2.m6524S(-1922977278);
            int i14 = 0;
            for (Object obj : content.m7779c()) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC17681o.m19388q();
                    throw null;
                }
                AbstractC7343b0 abstractC7343b0 = (AbstractC7343b0) obj;
                boolean z11 = i14 == AbstractC17681o.m19381j(content.m7779c()) && z10;
                C7364o c7364o = AbstractC7343b0.Companion;
                AbstractC8064c6.m8470a(str, role, c22071w0, messageId, abstractC7343b0, safeUrls, onIntent, null, z11, c6021p, i12 & 4136958, 128);
                z10 = z6;
                c6021p2 = c6021p;
                i14 = i15;
            }
            C6021p c6021p3 = c6021p2;
            c6021p3.m6553p(false);
            c6021p3.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4120r0(str, role, c22071w0, messageId, content, safeUrls, onIntent, interfaceC10459q, z6, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final long m8536b(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m8537c(long j10) {
        long j11 = (j10 & 9187343241974906880L) ^ 9187343241974906880L;
        return (((~j11) & (j11 - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m8538d(long j10) {
        return (j10 & 9223372034707292159L) != 9205357640488583168L;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m8539e(long j10) {
        return (j10 & 9223372034707292159L) == 9205357640488583168L;
    }

    /* JADX INFO: renamed from: f */
    public static final long m8540f(float f10, long j10, long j11) {
        float fM10589c = AbstractC9930m3.m10589c(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)), f10);
        float fM10589c2 = AbstractC9930m3.m10589c(Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 & 4294967295L)), f10);
        return (((long) Float.floatToRawIntBits(fM10589c)) << 32) | (((long) Float.floatToRawIntBits(fM10589c2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: g */
    public static final C3196n m8541g(boolean z6, InterfaceC1426a interfaceC1426a, C6021p c6021p) {
        float f10 = AbstractC3184b.f9595a;
        float f11 = AbstractC3184b.f9596b;
        if (Float.compare(f10, 0) <= 0) {
            throw new IllegalArgumentException("The refresh trigger must be greater than zero!");
        }
        Object objM6514H = c6021p.m6514H();
        Object obj = C6013l.f19514a;
        if (objM6514H == obj) {
            objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
        }
        C2925c c2925c = ((C6035w) objM6514H).f19668Y;
        InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(interfaceC1426a, c6021p);
        C16557y c16557y = new C16557y();
        C16557y c16557y2 = new C16557y();
        InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
        c16557y.f51286Y = interfaceC7537b.mo7864b0(f10);
        c16557y2.f51286Y = interfaceC7537b.mo7864b0(f11);
        boolean zM6542f = c6021p.m6542f(c2925c);
        Object objM6514H2 = c6021p.m6514H();
        if (zM6542f || objM6514H2 == obj) {
            objM6514H2 = new C3196n(c2925c, interfaceC5985XM6435V, c16557y2.f51286Y, c16557y.f51286Y);
            c6021p.m6537c0(objM6514H2);
        }
        C3196n c3196n = (C3196n) objM6514H2;
        boolean zM6545h = c6021p.m6545h(c3196n) | c6021p.m6544g(z6) | c6021p.m6536c(c16557y.f51286Y) | c6021p.m6536c(c16557y2.f51286Y);
        Object objM6514H3 = c6021p.m6514H();
        if (zM6545h || objM6514H3 == obj) {
            objM6514H3 = new C2457I0(c3196n, z6, c16557y, c16557y2);
            c6021p.m6537c0(objM6514H3);
        }
        C5997d.m6454j((InterfaceC1426a) objM6514H3, c6021p);
        return c3196n;
    }
}
