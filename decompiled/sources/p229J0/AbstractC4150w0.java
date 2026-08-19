package p229J0;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.selection.AbstractC10852c;
import androidx.compose.material3.MinimumInteractiveModifier;
import p017Af.C0470a;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p124Ei.C2463L0;
import p124Ei.C2506f;
import p156G1.C2960g;
import p180H1.EnumC3197a;
import p302M0.AbstractC5250b;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p544W9.AbstractC8455C;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.AbstractC13474L;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13779o0;
import p758g0.AbstractC13785r0;
import p758g0.C13744U;
import p758g0.C13767i0;
import p758g0.C13771k0;
import p758g0.C13783q0;
import p758g0.InterfaceC13726B;
import p758g0.InterfaceC13763g0;
import p774h1.C14365u;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: J0.w0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4150w0 {

    /* JADX INFO: renamed from: a */
    public static final float f13443a;

    /* JADX INFO: renamed from: b */
    public static final float f13444b = 20;

    /* JADX INFO: renamed from: c */
    public static final float f13445c;

    /* JADX INFO: renamed from: d */
    public static final float f13446d;

    static {
        float f10 = 2;
        f13443a = f10;
        f13445c = f10;
        f13446d = f10;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00be  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x0072, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static final void m4775a(boolean z6, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, boolean z10, C4132t0 c4132t0, InterfaceC17406l interfaceC17406l, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        int i13;
        int i14;
        int i15;
        C4132t0 c4132t0M4705x;
        InterfaceC10459q interfaceC10459q3;
        boolean z11;
        InterfaceC17406l interfaceC17406l2;
        EnumC3197a enumC3197a;
        InterfaceC1426a interfaceC1426a;
        InterfaceC10459q interfaceC10459q4;
        boolean z12;
        C4132t0 c4132t1;
        InterfaceC17406l interfaceC17406l3;
        boolean z13;
        boolean z14;
        Object objM6514H;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(-1406741137);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        int i16 = i11 & 4;
        if (i16 == 0) {
            if ((i10 & 384) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 256 : 128;
            }
            i13 = i12 | 3072;
            if ((i10 & 24576) == 0) {
                i13 = i12 | 11264;
            }
            i14 = 196608 | i13;
            if ((74899 & i14) == 74898 || !c6021p.m6562y()) {
                c6021p.m6519N();
                if ((i10 & 1) != 0 || c6021p.m6561x()) {
                    if (i16 != 0) {
                        interfaceC10459q2 = C10456n.f30959Y;
                    }
                    i15 = i14 & (-57345);
                    c4132t0M4705x = AbstractC3984T1.m4705x(c6021p);
                    interfaceC10459q3 = interfaceC10459q2;
                    z11 = true;
                    interfaceC17406l2 = null;
                } else {
                    c6021p.m6517L();
                    i15 = i14 & (-57345);
                    z11 = z10;
                    c4132t0M4705x = c4132t0;
                    interfaceC17406l2 = interfaceC17406l;
                    interfaceC10459q3 = interfaceC10459q2;
                }
                c6021p.m6554q();
                if (z6) {
                    enumC3197a = EnumC3197a.f9647Y;
                } else {
                    enumC3197a = EnumC3197a.f9648Z;
                }
                c6021p.m6524S(1046936362);
                if (interfaceC1436k != null) {
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | ((i15 & 14) == 4);
                    objM6514H = c6021p.m6514H();
                    if (z14 || objM6514H == C6013l.f19514a) {
                        objM6514H = new C2506f(interfaceC1436k, z6, 1);
                        c6021p.m6537c0(objM6514H);
                    }
                    interfaceC1426a = (InterfaceC1426a) objM6514H;
                } else {
                    interfaceC1426a = null;
                }
                c6021p.m6553p(false);
                m4777c(enumC3197a, interfaceC1426a, interfaceC10459q3, z11, c4132t0M4705x, interfaceC17406l2, c6021p, i15 & 524160);
                interfaceC10459q4 = interfaceC10459q3;
                z12 = z11;
                c4132t1 = c4132t0M4705x;
                interfaceC17406l3 = interfaceC17406l2;
            } else {
                c6021p.m6517L();
                z12 = z10;
                c4132t1 = c4132t0;
                interfaceC17406l3 = interfaceC17406l;
                interfaceC10459q4 = interfaceC10459q2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4138u0(z6, interfaceC1436k, interfaceC10459q4, z12, c4132t1, interfaceC17406l3, i10, i11);
            }
        }
        i12 |= 384;
        interfaceC10459q2 = interfaceC10459q;
        i13 = i12 | 3072;
        if ((i10 & 24576) == 0) {
            i13 = i12 | 11264;
        }
        i14 = 196608 | i13;
        if ((74899 & i14) == 74898) {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    interfaceC10459q2 = C10456n.f30959Y;
                }
                i15 = i14 & (-57345);
                c4132t0M4705x = AbstractC3984T1.m4705x(c6021p);
                interfaceC10459q3 = interfaceC10459q2;
                z11 = true;
                interfaceC17406l2 = null;
            } else {
                if (i16 != 0) {
                    interfaceC10459q2 = C10456n.f30959Y;
                }
                i15 = i14 & (-57345);
                c4132t0M4705x = AbstractC3984T1.m4705x(c6021p);
                interfaceC10459q3 = interfaceC10459q2;
                z11 = true;
                interfaceC17406l2 = null;
            }
            c6021p.m6554q();
            if (z6) {
                enumC3197a = EnumC3197a.f9647Y;
            } else {
                enumC3197a = EnumC3197a.f9648Z;
            }
            c6021p.m6524S(1046936362);
            if (interfaceC1436k != null) {
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | ((i15 & 14) == 4);
                objM6514H = c6021p.m6514H();
                if (z14) {
                    objM6514H = new C2506f(interfaceC1436k, z6, 1);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C2506f(interfaceC1436k, z6, 1);
                    c6021p.m6537c0(objM6514H);
                }
                interfaceC1426a = (InterfaceC1426a) objM6514H;
            } else {
                interfaceC1426a = null;
            }
            c6021p.m6553p(false);
            m4777c(enumC3197a, interfaceC1426a, interfaceC10459q3, z11, c4132t0M4705x, interfaceC17406l2, c6021p, i15 & 524160);
            interfaceC10459q4 = interfaceC10459q3;
            z12 = z11;
            c4132t1 = c4132t0M4705x;
            interfaceC17406l3 = interfaceC17406l2;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    interfaceC10459q2 = C10456n.f30959Y;
                }
                i15 = i14 & (-57345);
                c4132t0M4705x = AbstractC3984T1.m4705x(c6021p);
                interfaceC10459q3 = interfaceC10459q2;
                z11 = true;
                interfaceC17406l2 = null;
            } else {
                if (i16 != 0) {
                    interfaceC10459q2 = C10456n.f30959Y;
                }
                i15 = i14 & (-57345);
                c4132t0M4705x = AbstractC3984T1.m4705x(c6021p);
                interfaceC10459q3 = interfaceC10459q2;
                z11 = true;
                interfaceC17406l2 = null;
            }
            c6021p.m6554q();
            if (z6) {
                enumC3197a = EnumC3197a.f9647Y;
            } else {
                enumC3197a = EnumC3197a.f9648Z;
            }
            c6021p.m6524S(1046936362);
            if (interfaceC1436k != null) {
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | ((i15 & 14) == 4);
                objM6514H = c6021p.m6514H();
                if (z14) {
                    objM6514H = new C2506f(interfaceC1436k, z6, 1);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C2506f(interfaceC1436k, z6, 1);
                    c6021p.m6537c0(objM6514H);
                }
                interfaceC1426a = (InterfaceC1426a) objM6514H;
            } else {
                interfaceC1426a = null;
            }
            c6021p.m6553p(false);
            m4777c(enumC3197a, interfaceC1426a, interfaceC10459q3, z11, c4132t0M4705x, interfaceC17406l2, c6021p, i15 & 524160);
            interfaceC10459q4 = interfaceC10459q3;
            z12 = z11;
            c4132t1 = c4132t0M4705x;
            interfaceC17406l3 = interfaceC17406l2;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4138u0(z6, interfaceC1436k, interfaceC10459q4, z12, c4132t1, interfaceC17406l3, i10, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:110:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:111:0x0201  */
    /* JADX WARN: Code duplicated, block: B:113:0x0207 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0209  */
    /* JADX WARN: Code duplicated, block: B:116:0x020c  */
    /* JADX WARN: Code duplicated, block: B:117:0x020f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0215  */
    /* JADX WARN: Code duplicated, block: B:120:0x0218  */
    /* JADX WARN: Code duplicated, block: B:122:0x021c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0224  */
    /* JADX WARN: Code duplicated, block: B:126:0x0229  */
    /* JADX WARN: Code duplicated, block: B:129:0x0245  */
    /* JADX WARN: Code duplicated, block: B:131:0x025d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0263 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x0265  */
    /* JADX WARN: Code duplicated, block: B:137:0x0269  */
    /* JADX WARN: Code duplicated, block: B:139:0x026f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0272  */
    /* JADX WARN: Code duplicated, block: B:141:0x0275  */
    /* JADX WARN: Code duplicated, block: B:143:0x027b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x027d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0280  */
    /* JADX WARN: Code duplicated, block: B:147:0x0283  */
    /* JADX WARN: Code duplicated, block: B:149:0x0289  */
    /* JADX WARN: Code duplicated, block: B:150:0x028c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0290  */
    /* JADX WARN: Code duplicated, block: B:154:0x0298  */
    /* JADX WARN: Code duplicated, block: B:156:0x029d  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:163:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:70:0x012e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0154  */
    /* JADX WARN: Code duplicated, block: B:82:0x016e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0179  */
    /* JADX WARN: Code duplicated, block: B:85:0x017f  */
    /* JADX WARN: Code duplicated, block: B:86:0x018a  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01cd  */
    /* JADX INFO: renamed from: b */
    public static final void m4776b(boolean z6, EnumC3197a enumC3197a, InterfaceC10459q interfaceC10459q, C4132t0 c4132t0, C6021p c6021p, int i10) {
        int i11;
        float f10;
        float f11;
        float f12;
        InterfaceC13726B interfaceC13726BM15254s;
        InterfaceC13726B c13744u;
        float f13;
        C13767i0 c13767i0M15289b;
        int iOrdinal;
        float f14;
        int iOrdinal2;
        InterfaceC13763g0 interfaceC13763g0M15275f;
        int i12;
        int i13;
        InterfaceC13726B interfaceC13726BM15255t;
        int i14;
        int i15;
        C13767i0 c13767i0M15289b2;
        Object objM6514H;
        C5975S c5975s;
        C4126s0 c4126s0;
        long j10;
        int i16;
        InterfaceC5982V0 interfaceC5982V0M14999a;
        int iOrdinal3;
        long j11;
        Object objM6435V;
        Object obj;
        int iOrdinal4;
        long j12;
        Object objM6435V2;
        boolean zM6542f;
        Object objM6514H2;
        int i17;
        int iOrdinal5;
        int i18;
        int iOrdinal6;
        c6021p.m6526U(2007131616);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(enumC3197a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(c4132t0) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C13771k0 c13771k0M15291d = AbstractC13779o0.m15291d(enumC3197a, null, c6021p, (i11 >> 3) & 14, 2);
            C13783q0 c13783q0 = AbstractC13785r0.f43528a;
            EnumC3197a enumC3197a2 = (EnumC3197a) c13771k0M15291d.m15272c();
            c6021p.m6524S(1800065638);
            int iOrdinal7 = enumC3197a2.ordinal();
            float f15 = 1.0f;
            if (iOrdinal7 == 0) {
                f10 = 1.0f;
            } else if (iOrdinal7 != 1) {
                if (iOrdinal7 != 2) {
                    throw new C0644w();
                }
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            c6021p.m6553p(false);
            Float fValueOf = Float.valueOf(f10);
            C6002f0 c6002f0 = c13771k0M15291d.f43492d;
            EnumC3197a enumC3197a3 = (EnumC3197a) c6002f0.getValue();
            c6021p.m6524S(1800065638);
            int iOrdinal8 = enumC3197a3.ordinal();
            if (iOrdinal8 == 0) {
                f11 = 1.0f;
            } else if (iOrdinal8 != 1) {
                if (iOrdinal8 != 2) {
                    throw new C0644w();
                }
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            c6021p.m6553p(false);
            Float fValueOf2 = Float.valueOf(f11);
            InterfaceC13763g0 interfaceC13763g0M15275f2 = c13771k0M15291d.m15275f();
            c6021p.m6524S(1373301606);
            Object objMo15004a = interfaceC13763g0M15275f2.mo15004a();
            EnumC3197a enumC3197a4 = EnumC3197a.f9648Z;
            if (objMo15004a == enumC3197a4) {
                c13744u = AbstractC13758e.m15255t(100, 0, null, 6);
            } else {
                if (interfaceC13763g0M15275f2.mo15006c() == enumC3197a4) {
                    c13744u = new C13744U(100);
                } else {
                    f12 = 0.0f;
                    interfaceC13726BM15254s = AbstractC13758e.m15254s(0.0f, 0.0f, null, 7);
                }
                c6021p.m6553p(false);
                f13 = f12;
                c13767i0M15289b = AbstractC13779o0.m15289b(c13771k0M15291d, fValueOf, fValueOf2, interfaceC13726BM15254s, c13783q0, c6021p, 0);
                EnumC3197a enumC3197a5 = (EnumC3197a) c13771k0M15291d.m15272c();
                c6021p.m6524S(-1426969489);
                iOrdinal = enumC3197a5.ordinal();
                if (iOrdinal != 0 || iOrdinal == 1) {
                    f14 = f13;
                } else {
                    if (iOrdinal != 2) {
                        throw new C0644w();
                    }
                    f14 = 1.0f;
                }
                c6021p.m6553p(false);
                Float fValueOf3 = Float.valueOf(f14);
                EnumC3197a enumC3197a6 = (EnumC3197a) c6002f0.getValue();
                c6021p.m6524S(-1426969489);
                iOrdinal2 = enumC3197a6.ordinal();
                if (iOrdinal2 != 0 || iOrdinal2 == 1) {
                    f15 = f13;
                } else if (iOrdinal2 != 2) {
                    throw new C0644w();
                }
                c6021p.m6553p(false);
                Float fValueOf4 = Float.valueOf(f15);
                interfaceC13763g0M15275f = c13771k0M15291d.m15275f();
                c6021p.m6524S(-1324481169);
                if (interfaceC13763g0M15275f.mo15004a() == enumC3197a4) {
                    interfaceC13726BM15255t = new C13744U(0);
                    i12 = 6;
                    i13 = 100;
                } else if (interfaceC13763g0M15275f.mo15006c() == enumC3197a4) {
                    i13 = 100;
                    interfaceC13726BM15255t = new C13744U(100);
                    i12 = 6;
                } else {
                    i12 = 6;
                    i13 = 100;
                    interfaceC13726BM15255t = AbstractC13758e.m15255t(100, 0, null, 6);
                }
                c6021p.m6553p(false);
                i14 = i12;
                i15 = i13;
                c13767i0M15289b2 = AbstractC13779o0.m15289b(c13771k0M15291d, fValueOf3, fValueOf4, interfaceC13726BM15255t, c13783q0, c6021p, 0);
                objM6514H = c6021p.m6514H();
                c5975s = C6013l.f19514a;
                if (objM6514H == c5975s) {
                    objM6514H = new C4126s0();
                    c6021p.m6537c0(objM6514H);
                }
                c4126s0 = (C4126s0) objM6514H;
                if (enumC3197a == enumC3197a4) {
                    j10 = c4132t0.f13353b;
                } else {
                    j10 = c4132t0.f13352a;
                }
                if (enumC3197a == enumC3197a4) {
                    i16 = i15;
                } else {
                    i16 = 50;
                }
                interfaceC5982V0M14999a = AbstractC13474L.m14999a(j10, AbstractC13758e.m15255t(i16, 0, null, i14), null, c6021p, 0, 12);
                if (z6) {
                    iOrdinal6 = enumC3197a.ordinal();
                    if (iOrdinal6 == 0) {
                        j11 = c4132t0.f13354c;
                    } else if (iOrdinal6 != 1) {
                        if (iOrdinal6 != 2) {
                            throw new C0644w();
                        }
                        j11 = c4132t0.f13354c;
                    } else {
                        j11 = c4132t0.f13355d;
                    }
                } else {
                    iOrdinal3 = enumC3197a.ordinal();
                    if (iOrdinal3 != 0) {
                        j11 = c4132t0.f13356e;
                    } else if (iOrdinal3 != 1) {
                        j11 = c4132t0.f13357f;
                    } else {
                        if (iOrdinal3 == 2) {
                            throw new C0644w();
                        }
                        j11 = c4132t0.f13358g;
                    }
                }
                if (z6) {
                    c6021p.m6524S(-392211906);
                    if (enumC3197a == enumC3197a4) {
                        i18 = i15;
                    } else {
                        i18 = 50;
                    }
                    objM6435V = AbstractC13474L.m14999a(j11, AbstractC13758e.m15255t(i18, 0, null, i14), null, c6021p, 0, 12);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-392031362);
                    objM6435V = C5997d.m6435V(new C14365u(j11), c6021p);
                    c6021p.m6553p(false);
                }
                obj = objM6435V;
                if (z6) {
                    iOrdinal5 = enumC3197a.ordinal();
                    if (iOrdinal5 == 0) {
                        j12 = c4132t0.f13359h;
                    } else if (iOrdinal5 != 1) {
                        if (iOrdinal5 != 2) {
                            throw new C0644w();
                        }
                        j12 = c4132t0.f13359h;
                    } else {
                        j12 = c4132t0.f13360i;
                    }
                } else {
                    iOrdinal4 = enumC3197a.ordinal();
                    if (iOrdinal4 != 0) {
                        j12 = c4132t0.f13361j;
                    } else if (iOrdinal4 != 1) {
                        j12 = c4132t0.f13362k;
                    } else {
                        if (iOrdinal4 == 2) {
                            throw new C0644w();
                        }
                        j12 = c4132t0.f13363l;
                    }
                }
                if (z6) {
                    c6021p.m6524S(-1725816497);
                    if (enumC3197a == enumC3197a4) {
                        i17 = i15;
                    } else {
                        i17 = 50;
                    }
                    objM6435V2 = AbstractC13474L.m14999a(j12, AbstractC13758e.m15255t(i17, 0, null, i14), null, c6021p, 0, 12);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-1725635953);
                    objM6435V2 = C5997d.m6435V(new C14365u(j12), c6021p);
                    c6021p.m6553p(false);
                }
                InterfaceC10459q interfaceC10459qM11249i = AbstractC10844c.m11249i(AbstractC10844c.m11259s(interfaceC10459q, C10444b.f30938q0), f13444b);
                zM6542f = c6021p.m6542f(obj) | c6021p.m6542f(objM6435V2) | c6021p.m6542f(interfaceC5982V0M14999a) | c6021p.m6542f(c13767i0M15289b) | c6021p.m6542f(c13767i0M15289b2);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f || objM6514H2 == c5975s) {
                    objM6514H2 = new C4144v0(obj, objM6435V2, interfaceC5982V0M14999a, c13767i0M15289b, c13767i0M15289b2, c4126s0, 0);
                    c6021p.m6537c0(objM6514H2);
                }
                AbstractC8455C.m9069a(0, (InterfaceC1436k) objM6514H2, c6021p, interfaceC10459qM11249i);
            }
            interfaceC13726BM15254s = c13744u;
            f12 = 0.0f;
            c6021p.m6553p(false);
            f13 = f12;
            c13767i0M15289b = AbstractC13779o0.m15289b(c13771k0M15291d, fValueOf, fValueOf2, interfaceC13726BM15254s, c13783q0, c6021p, 0);
            EnumC3197a enumC3197a7 = (EnumC3197a) c13771k0M15291d.m15272c();
            c6021p.m6524S(-1426969489);
            iOrdinal = enumC3197a7.ordinal();
            if (iOrdinal != 0) {
                f14 = f13;
            } else {
                f14 = f13;
            }
            c6021p.m6553p(false);
            Float fValueOf5 = Float.valueOf(f14);
            EnumC3197a enumC3197a8 = (EnumC3197a) c6002f0.getValue();
            c6021p.m6524S(-1426969489);
            iOrdinal2 = enumC3197a8.ordinal();
            if (iOrdinal2 != 0) {
                f15 = f13;
            } else {
                f15 = f13;
            }
            c6021p.m6553p(false);
            Float fValueOf6 = Float.valueOf(f15);
            interfaceC13763g0M15275f = c13771k0M15291d.m15275f();
            c6021p.m6524S(-1324481169);
            if (interfaceC13763g0M15275f.mo15004a() == enumC3197a4) {
                interfaceC13726BM15255t = new C13744U(0);
                i12 = 6;
                i13 = 100;
            } else if (interfaceC13763g0M15275f.mo15006c() == enumC3197a4) {
                i13 = 100;
                interfaceC13726BM15255t = new C13744U(100);
                i12 = 6;
            } else {
                i12 = 6;
                i13 = 100;
                interfaceC13726BM15255t = AbstractC13758e.m15255t(100, 0, null, 6);
            }
            c6021p.m6553p(false);
            i14 = i12;
            i15 = i13;
            c13767i0M15289b2 = AbstractC13779o0.m15289b(c13771k0M15291d, fValueOf5, fValueOf6, interfaceC13726BM15255t, c13783q0, c6021p, 0);
            objM6514H = c6021p.m6514H();
            c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = new C4126s0();
                c6021p.m6537c0(objM6514H);
            }
            c4126s0 = (C4126s0) objM6514H;
            if (enumC3197a == enumC3197a4) {
                j10 = c4132t0.f13353b;
            } else {
                j10 = c4132t0.f13352a;
            }
            if (enumC3197a == enumC3197a4) {
                i16 = i15;
            } else {
                i16 = 50;
            }
            interfaceC5982V0M14999a = AbstractC13474L.m14999a(j10, AbstractC13758e.m15255t(i16, 0, null, i14), null, c6021p, 0, 12);
            if (z6) {
                iOrdinal6 = enumC3197a.ordinal();
                if (iOrdinal6 == 0) {
                    j11 = c4132t0.f13354c;
                } else if (iOrdinal6 != 1) {
                    if (iOrdinal6 != 2) {
                        throw new C0644w();
                    }
                    j11 = c4132t0.f13354c;
                } else {
                    j11 = c4132t0.f13355d;
                }
            } else {
                iOrdinal3 = enumC3197a.ordinal();
                if (iOrdinal3 != 0) {
                    j11 = c4132t0.f13356e;
                } else if (iOrdinal3 != 1) {
                    j11 = c4132t0.f13357f;
                } else {
                    if (iOrdinal3 == 2) {
                        throw new C0644w();
                    }
                    j11 = c4132t0.f13358g;
                }
            }
            if (z6) {
                c6021p.m6524S(-392211906);
                if (enumC3197a == enumC3197a4) {
                    i18 = i15;
                } else {
                    i18 = 50;
                }
                objM6435V = AbstractC13474L.m14999a(j11, AbstractC13758e.m15255t(i18, 0, null, i14), null, c6021p, 0, 12);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-392031362);
                objM6435V = C5997d.m6435V(new C14365u(j11), c6021p);
                c6021p.m6553p(false);
            }
            obj = objM6435V;
            if (z6) {
                iOrdinal5 = enumC3197a.ordinal();
                if (iOrdinal5 == 0) {
                    j12 = c4132t0.f13359h;
                } else if (iOrdinal5 != 1) {
                    if (iOrdinal5 != 2) {
                        throw new C0644w();
                    }
                    j12 = c4132t0.f13359h;
                } else {
                    j12 = c4132t0.f13360i;
                }
            } else {
                iOrdinal4 = enumC3197a.ordinal();
                if (iOrdinal4 != 0) {
                    j12 = c4132t0.f13361j;
                } else if (iOrdinal4 != 1) {
                    j12 = c4132t0.f13362k;
                } else {
                    if (iOrdinal4 == 2) {
                        throw new C0644w();
                    }
                    j12 = c4132t0.f13363l;
                }
            }
            if (z6) {
                c6021p.m6524S(-1725816497);
                if (enumC3197a == enumC3197a4) {
                    i17 = i15;
                } else {
                    i17 = 50;
                }
                objM6435V2 = AbstractC13474L.m14999a(j12, AbstractC13758e.m15255t(i17, 0, null, i14), null, c6021p, 0, 12);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-1725635953);
                objM6435V2 = C5997d.m6435V(new C14365u(j12), c6021p);
                c6021p.m6553p(false);
            }
            InterfaceC10459q interfaceC10459qM11249i2 = AbstractC10844c.m11249i(AbstractC10844c.m11259s(interfaceC10459q, C10444b.f30938q0), f13444b);
            zM6542f = c6021p.m6542f(obj) | c6021p.m6542f(objM6435V2) | c6021p.m6542f(interfaceC5982V0M14999a) | c6021p.m6542f(c13767i0M15289b) | c6021p.m6542f(c13767i0M15289b2);
            objM6514H2 = c6021p.m6514H();
            if (zM6542f) {
                objM6514H2 = new C4144v0(obj, objM6435V2, interfaceC5982V0M14999a, c13767i0M15289b, c13767i0M15289b2, c4126s0, 0);
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = new C4144v0(obj, objM6435V2, interfaceC5982V0M14999a, c13767i0M15289b, c13767i0M15289b2, c4126s0, 0);
                c6021p.m6537c0(objM6514H2);
            }
            AbstractC8455C.m9069a(0, (InterfaceC1436k) objM6514H2, c6021p, interfaceC10459qM11249i2);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2463L0(z6, enumC3197a, interfaceC10459q, c4132t0, i10, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m4777c(EnumC3197a enumC3197a, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, boolean z6, C4132t0 c4132t0, InterfaceC17406l interfaceC17406l, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1608358065);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(enumC3197a) ? 4 : 2) | i10;
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
            i11 |= c6021p.m6544g(z6) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6542f(c4132t0) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6542f(interfaceC17406l) ? 131072 : 65536;
        }
        int i12 = i11;
        if ((74899 & i12) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6519N();
            int i13 = i10 & 1;
            InterfaceC10459q interfaceC10459q2 = C10456n.f30959Y;
            if (i13 != 0 && !c6021p.m6561x()) {
                c6021p.m6517L();
            }
            c6021p.m6554q();
            c6021p.m6524S(-97239746);
            InterfaceC10459q interfaceC10459qM11275d = interfaceC1426a != null ? AbstractC10852c.m11275d(enumC3197a, interfaceC17406l, AbstractC4005X2.m4718c(false, AbstractC5250b.f17147a / 2, c6021p, 54, 4), z6, new C2960g(1), interfaceC1426a) : interfaceC10459q2;
            c6021p.m6553p(false);
            if (interfaceC1426a != null) {
                C5984W0 c5984w0 = AbstractC3884B1.f11770a;
                interfaceC10459q2 = MinimumInteractiveModifier.f32651Y;
            }
            m4776b(z6, enumC3197a, AbstractC10842a.m11233k(interfaceC10459q.mo428M(interfaceC10459q2).mo428M(interfaceC10459qM11275d), f13443a), c4132t0, c6021p, ((i12 >> 9) & 14) | ((i12 << 3) & 112) | ((i12 >> 3) & 7168));
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0470a(enumC3197a, interfaceC1426a, interfaceC10459q, z6, c4132t0, interfaceC17406l, i10);
        }
    }
}
