package p229J0;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import p002A0.C0148y;
import p006A4.C0339D;
import p006A4.C0349j;
import p278L0.AbstractC4846J;
import p278L0.AbstractC4895v;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p758g0.AbstractC13779o0;
import p758g0.C13771k0;
import p773h0.C14292k0;
import p911o0.C17767k0;

/* JADX INFO: renamed from: J0.y4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4166y4 {

    /* JADX INFO: renamed from: a */
    public static final float f13535a;

    /* JADX INFO: renamed from: b */
    public static final float f13536b = 24;

    /* JADX INFO: renamed from: c */
    public static final float f13537c = 40;

    /* JADX INFO: renamed from: d */
    public static final float f13538d = RCHTTPStatusCodes.SUCCESS;

    /* JADX INFO: renamed from: e */
    public static final C17767k0 f13539e;

    static {
        float f10 = 4;
        f13535a = f10;
        float f11 = 8;
        f13539e = new C17767k0(f11, f10, f11, f10);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x013d  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m4789a(C4154w4 c4154w4, C8410b c8410b, C3899D4 c3899d4, InterfaceC10459q interfaceC10459q, boolean z6, boolean z10, C8410b c8410b2, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        InterfaceC10459q interfaceC10459q3;
        Object objM6514H;
        C5975S c5975s;
        InterfaceC5985X interfaceC5985X;
        Object objM6514H2;
        InterfaceC10459q interfaceC10459q4;
        C6018n0 c6018n0M6555r;
        int i13;
        int i14;
        int i15;
        c6021p.m6526U(1836749106);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(c4154w4) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(c8410b) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= (i10 & 512) == 0 ? c6021p.m6542f(c3899d4) : c6021p.m6545h(c3899d4) ? 256 : 128;
        }
        int i16 = i11 & 8;
        if (i16 == 0) {
            if ((i10 & 3072) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 2048 : 1024;
            }
            if ((i10 & 24576) == 0) {
                if (c6021p.m6544g(z6)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((196608 & i10) == 0) {
                if (c6021p.m6544g(z10)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i12 |= i14;
            }
            if ((1572864 & i10) == 0) {
                if (c6021p.m6545h(c8410b2)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i12 |= i13;
            }
            if ((599187 & i12) == 599186 || !c6021p.m6562y()) {
                if (i16 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                C13771k0 c13771k0M15290c = AbstractC13779o0.m15290c(c3899d4.f11883c, "tooltip transition", c6021p, 48);
                objM6514H = c6021p.m6514H();
                c5975s = C6013l.f19514a;
                if (objM6514H == c5975s) {
                    objM6514H = C5997d.m6430Q(null, C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H);
                }
                interfaceC5985X = (InterfaceC5985X) objM6514H;
                objM6514H2 = c6021p.m6514H();
                if (objM6514H2 == c5975s) {
                    objM6514H2 = new C4172z4(new C0339D(interfaceC5985X, 19));
                    c6021p.m6537c0(objM6514H2);
                }
                AbstractC4846J.m5492a(c4154w4, AbstractC8411c.m8969c(-149611544, c6021p, new C0148y(c13771k0M15290c, c8410b, (C4172z4) objM6514H2, 10)), c3899d4, interfaceC10459q3, z6, z10, AbstractC8411c.m8969c(-1130808188, c6021p, new C0349j(interfaceC5985X, 18, c8410b2)), c6021p, (i12 & 14) | 1572912 | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752));
                interfaceC10459q4 = interfaceC10459q3;
            } else {
                c6021p.m6517L();
                interfaceC10459q4 = interfaceC10459q2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4046e4(c4154w4, c8410b, c3899d4, interfaceC10459q4, z6, z10, c8410b2, i10, i11);
            }
        }
        i12 |= 3072;
        interfaceC10459q2 = interfaceC10459q;
        if ((i10 & 24576) == 0) {
            if (c6021p.m6544g(z6)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i12 |= i15;
        }
        if ((196608 & i10) == 0) {
            if (c6021p.m6544g(z10)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i12 |= i14;
        }
        if ((1572864 & i10) == 0) {
            if (c6021p.m6545h(c8410b2)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i12 |= i13;
        }
        if ((599187 & i12) == 599186) {
            if (i16 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            C13771k0 c13771k0M15290c2 = AbstractC13779o0.m15290c(c3899d4.f11883c, "tooltip transition", c6021p, 48);
            objM6514H = c6021p.m6514H();
            c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6430Q(null, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            interfaceC5985X = (InterfaceC5985X) objM6514H;
            objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == c5975s) {
                objM6514H2 = new C4172z4(new C0339D(interfaceC5985X, 19));
                c6021p.m6537c0(objM6514H2);
            }
            AbstractC4846J.m5492a(c4154w4, AbstractC8411c.m8969c(-149611544, c6021p, new C0148y(c13771k0M15290c2, c8410b, (C4172z4) objM6514H2, 10)), c3899d4, interfaceC10459q3, z6, z10, AbstractC8411c.m8969c(-1130808188, c6021p, new C0349j(interfaceC5985X, 18, c8410b2)), c6021p, (i12 & 14) | 1572912 | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752));
            interfaceC10459q4 = interfaceC10459q3;
        } else {
            if (i16 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            C13771k0 c13771k0M15290c3 = AbstractC13779o0.m15290c(c3899d4.f11883c, "tooltip transition", c6021p, 48);
            objM6514H = c6021p.m6514H();
            c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6430Q(null, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            interfaceC5985X = (InterfaceC5985X) objM6514H;
            objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == c5975s) {
                objM6514H2 = new C4172z4(new C0339D(interfaceC5985X, 19));
                c6021p.m6537c0(objM6514H2);
            }
            AbstractC4846J.m5492a(c4154w4, AbstractC8411c.m8969c(-149611544, c6021p, new C0148y(c13771k0M15290c3, c8410b, (C4172z4) objM6514H2, 10)), c3899d4, interfaceC10459q3, z6, z10, AbstractC8411c.m8969c(-1130808188, c6021p, new C0349j(interfaceC5985X, 18, c8410b2)), c6021p, (i12 & 14) | 1572912 | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752));
            interfaceC10459q4 = interfaceC10459q3;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4046e4(c4154w4, c8410b, c3899d4, interfaceC10459q4, z6, z10, c8410b2, i10, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C3899D4 m4790b(boolean z6, C6021p c6021p) {
        C14292k0 c14292k0 = AbstractC4895v.f15952a;
        boolean zM6542f = c6021p.m6542f(c14292k0);
        Object objM6514H = c6021p.m6514H();
        if (zM6542f || objM6514H == C6013l.f19514a) {
            objM6514H = new C3899D4(false, z6, c14292k0);
            c6021p.m6537c0(objM6514H);
        }
        return (C3899D4) objM6514H;
    }
}
