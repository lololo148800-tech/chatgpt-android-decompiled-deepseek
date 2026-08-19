package p193Hf;

import kotlin.jvm.internal.AbstractC16544l;
import p006A4.C0339D;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1051v0.AbstractC20417e;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p1155zi.C21984a1;
import p1155zi.C22011h0;
import p124Ei.C2494b;
import p229J0.AbstractC3984T1;
import p324Mn.C5551u;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p403Qd.EnumC6606L;
import p478Tc.AbstractC7313q;
import p479Td.C7320F;
import p523V9.AbstractC7981R5;
import p523V9.AbstractC8128k6;
import p537W0.AbstractC8411c;
import p575Xd.C9436E;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Hf.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3349b {

    /* JADX INFO: renamed from: a */
    public static final long f10235a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f10236b = 0;

    static {
        C21554a c21554a = C21555b.f68260Z;
        f10235a = AbstractC8128k6.m8644j(8, EnumC21557d.MINUTES);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013a  */
    /* JADX WARN: Code duplicated, block: B:104:0x019f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x011e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0123  */
    /* JADX WARN: Code duplicated, block: B:97:0x0127  */
    /* JADX WARN: Code duplicated, block: B:98:0x012a  */
    /* JADX INFO: renamed from: a */
    public static final void m4173a(String str, String str2, EnumC6606L status, String title, String str3, C9436E safeUrls, C7320F c7320f, InterfaceC1436k onIntent, InterfaceC10459q interfaceC10459q, C5551u c5551u, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        int i13;
        int i14;
        int i15;
        InterfaceC10459q interfaceC10459q3;
        C5551u c5551u2;
        Object objM6514H;
        C5975S c5975s;
        InterfaceC5985X interfaceC5985X;
        InterfaceC10459q interfaceC10459q4;
        Object objM6514H2;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(status, "status");
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(safeUrls, "safeUrls");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(-1044607989);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(str != null ? new C22011h0(str) : null) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(str2 != null ? new C21984a1(str2) : null) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6542f(status) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6542f(title) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c6021p.m6542f(str3) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= c6021p.m6542f(safeUrls) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= c6021p.m6542f(c7320f) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i12 |= c6021p.m6545h(onIntent) ? 8388608 : 4194304;
        }
        int i16 = i11 & 256;
        if (i16 == 0) {
            if ((100663296 & i10) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 67108864 : 33554432;
            }
            i13 = i11 & 512;
            if (i13 != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c6021p.m6545h(c5551u)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i12 |= i14;
            }
            i15 = i12;
            if ((i15 & 306783379) == 306783378 || !c6021p.m6562y()) {
                if (i16 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    c5551u2 = null;
                } else {
                    c5551u2 = c5551u;
                }
                c6021p.m6524S(513322651);
                objM6514H = c6021p.m6514H();
                c5975s = C6013l.f19514a;
                if (objM6514H == c5975s) {
                    objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H);
                }
                interfaceC5985X = (InterfaceC5985X) objM6514H;
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459q5 = interfaceC10459q3;
                AbstractC3984T1.m4697p(interfaceC10459q5, AbstractC20417e.m21079a(AbstractC7313q.f23201f), null, AbstractC3984T1.m4673A(), null, AbstractC8411c.m8969c(-517985665, c6021p, new C2494b(title, str3, c5551u2, c7320f, interfaceC5985X, 2)), c6021p, ((i15 >> 24) & 14) | 196608, 20);
                if (((Boolean) interfaceC5985X.getValue()).booleanValue() && c7320f != null && str2 != null) {
                    c6021p.m6524S(513370957);
                    objM6514H2 = c6021p.m6514H();
                    if (objM6514H2 == c5975s) {
                        objM6514H2 = new C0339D(interfaceC5985X, 14);
                        c6021p.m6537c0(objM6514H2);
                    }
                    InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H2;
                    c6021p.m6553p(false);
                    int i17 = i15 << 3;
                    AbstractC7981R5.m8286c(interfaceC1426a, str, str2, c7320f, status == EnumC6606L.f21327Y, safeUrls, onIntent, null, c6021p, (i17 & 896) | (i17 & 112) | 6 | ((i15 >> 9) & 7168) | (i15 & 458752) | (3670016 & (i15 >> 3)));
                }
                interfaceC10459q4 = interfaceC10459q3;
            } else {
                c6021p.m6517L();
                c5551u2 = c5551u;
                interfaceC10459q4 = interfaceC10459q2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C3346a(str, str2, status, title, str3, safeUrls, c7320f, onIntent, interfaceC10459q4, c5551u2, i10, i11);
            }
        }
        i12 |= 100663296;
        interfaceC10459q2 = interfaceC10459q;
        i13 = i11 & 512;
        if (i13 != 0) {
            i12 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (c6021p.m6545h(c5551u)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i12 |= i14;
        }
        i15 = i12;
        if ((i15 & 306783379) == 306783378) {
            if (i16 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            if (i13 != 0) {
                c5551u2 = null;
            } else {
                c5551u2 = c5551u;
            }
            c6021p.m6524S(513322651);
            objM6514H = c6021p.m6514H();
            c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            interfaceC5985X = (InterfaceC5985X) objM6514H;
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459q6 = interfaceC10459q3;
            AbstractC3984T1.m4697p(interfaceC10459q6, AbstractC20417e.m21079a(AbstractC7313q.f23201f), null, AbstractC3984T1.m4673A(), null, AbstractC8411c.m8969c(-517985665, c6021p, new C2494b(title, str3, c5551u2, c7320f, interfaceC5985X, 2)), c6021p, ((i15 >> 24) & 14) | 196608, 20);
            if (((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                c6021p.m6524S(513370957);
                objM6514H2 = c6021p.m6514H();
                if (objM6514H2 == c5975s) {
                    objM6514H2 = new C0339D(interfaceC5985X, 14);
                    c6021p.m6537c0(objM6514H2);
                }
                InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H2;
                c6021p.m6553p(false);
                int i18 = i15 << 3;
                AbstractC7981R5.m8286c(interfaceC1426a2, str, str2, c7320f, status == EnumC6606L.f21327Y, safeUrls, onIntent, null, c6021p, (i18 & 896) | (i18 & 112) | 6 | ((i15 >> 9) & 7168) | (i15 & 458752) | (3670016 & (i15 >> 3)));
            }
            interfaceC10459q4 = interfaceC10459q3;
        } else {
            if (i16 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            if (i13 != 0) {
                c5551u2 = null;
            } else {
                c5551u2 = c5551u;
            }
            c6021p.m6524S(513322651);
            objM6514H = c6021p.m6514H();
            c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            interfaceC5985X = (InterfaceC5985X) objM6514H;
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459q7 = interfaceC10459q3;
            AbstractC3984T1.m4697p(interfaceC10459q7, AbstractC20417e.m21079a(AbstractC7313q.f23201f), null, AbstractC3984T1.m4673A(), null, AbstractC8411c.m8969c(-517985665, c6021p, new C2494b(title, str3, c5551u2, c7320f, interfaceC5985X, 2)), c6021p, ((i15 >> 24) & 14) | 196608, 20);
            if (((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                c6021p.m6524S(513370957);
                objM6514H2 = c6021p.m6514H();
                if (objM6514H2 == c5975s) {
                    objM6514H2 = new C0339D(interfaceC5985X, 14);
                    c6021p.m6537c0(objM6514H2);
                }
                InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) objM6514H2;
                c6021p.m6553p(false);
                int i19 = i15 << 3;
                AbstractC7981R5.m8286c(interfaceC1426a3, str, str2, c7320f, status == EnumC6606L.f21327Y, safeUrls, onIntent, null, c6021p, (i19 & 896) | (i19 & 112) | 6 | ((i15 >> 9) & 7168) | (i15 & 458752) | (3670016 & (i15 >> 3)));
            }
            interfaceC10459q4 = interfaceC10459q3;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3346a(str, str2, status, title, str3, safeUrls, c7320f, onIntent, interfaceC10459q4, c5551u2, i10, i11);
        }
    }
}
