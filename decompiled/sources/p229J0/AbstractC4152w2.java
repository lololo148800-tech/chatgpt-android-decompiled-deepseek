package p229J0;

import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.material3.internal.AbstractC10860a;
import androidx.compose.p650ui.graphics.AbstractC10864a;
import androidx.compose.p650ui.input.nestedscroll.AbstractC10866a;
import androidx.compose.p650ui.input.pointer.SuspendPointerInputElement;
import com.openai.chatgpt.R;
import p002A0.C0146w;
import p003A1.AbstractC0168G;
import p003A1.C0227a;
import p017Af.C0491v;
import p017Af.C0494y;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1001s1.InterfaceC19431a;
import p124Ei.C2486X0;
import p153Fn.C2925c;
import p156G1.AbstractC2965l;
import p193Hf.C3350b0;
import p278L0.AbstractC4846J;
import p278L0.C4894u;
import p302M0.AbstractC5237D;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6035w;
import p349O0.InterfaceC5982V0;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8455C;
import p594Y9.AbstractC9930m3;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p658b5.C11246q;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13764h;
import p758g0.C13756d;
import p758g0.C13781p0;
import p758g0.InterfaceC13798z;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p774h1.C14336N;
import p774h1.C14365u;
import p774h1.InterfaceC14339Q;
import p860l0.AbstractC16786v0;

/* JADX INFO: renamed from: J0.w2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4152w2 {

    /* JADX INFO: renamed from: a */
    public static final float f13451a = 48;

    /* JADX INFO: renamed from: b */
    public static final float f13452b = 24;

    /* JADX INFO: renamed from: c */
    public static final long f13453c = AbstractC14334L.m15632j(0.5f, 0.0f);

    /* JADX WARN: Code duplicated, block: B:101:0x0138  */
    /* JADX WARN: Code duplicated, block: B:103:0x014a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0182 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0184  */
    /* JADX WARN: Code duplicated, block: B:119:0x0188  */
    /* JADX WARN: Code duplicated, block: B:122:0x018e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0196  */
    /* JADX WARN: Code duplicated, block: B:126:0x019e  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:135:0x01df  */
    /* JADX WARN: Code duplicated, block: B:136:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:141:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:144:0x0200  */
    /* JADX WARN: Code duplicated, block: B:147:0x0218  */
    /* JADX WARN: Code duplicated, block: B:149:0x021e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0228 A[PHI: r54
      0x0228: PHI (r54v3 Bm.n) = (r54v1 Bm.n), (r54v4 Bm.n) binds: [B:152:0x0226, B:150:0x0221] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:154:0x022a  */
    /* JADX WARN: Code duplicated, block: B:157:0x0237  */
    /* JADX WARN: Code duplicated, block: B:158:0x0239  */
    /* JADX WARN: Code duplicated, block: B:161:0x0241 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x0243  */
    /* JADX WARN: Code duplicated, block: B:165:0x0257  */
    /* JADX WARN: Code duplicated, block: B:167:0x025d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0267 A[PHI: r56
      0x0267: PHI (r56v2 float) = (r56v0 float), (r56v3 float) binds: [B:170:0x0265, B:168:0x0260] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:172:0x0269  */
    /* JADX WARN: Code duplicated, block: B:175:0x026e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0270  */
    /* JADX WARN: Code duplicated, block: B:179:0x0278 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x027a  */
    /* JADX WARN: Code duplicated, block: B:183:0x028e  */
    /* JADX WARN: Code duplicated, block: B:186:0x029c  */
    /* JADX WARN: Code duplicated, block: B:188:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:194:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:195:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:198:0x02c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:199:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:202:0x0325  */
    /* JADX WARN: Code duplicated, block: B:204:0x0329  */
    /* JADX WARN: Code duplicated, block: B:206:0x032f  */
    /* JADX WARN: Code duplicated, block: B:212:0x033e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:213:0x0340  */
    /* JADX WARN: Code duplicated, block: B:218:0x0364  */
    /* JADX WARN: Code duplicated, block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public static final void m4780a(InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, C3880A3 c3880a3, float f10, InterfaceC14339Q interfaceC14339Q, long j10, long j11, float f11, long j12, InterfaceC1439n interfaceC1439n, InterfaceC1439n interfaceC1439n2, C4158x2 c4158x2, C8410b c8410b, C6021p c6021p, int i10, int i11, int i12) {
        int i13;
        InterfaceC10459q interfaceC10459q2;
        C3880A3 c3880a4;
        int i14;
        InterfaceC14339Q interfaceC14339Q2;
        int i15;
        int i16;
        InterfaceC1439n interfaceC1439n3;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        InterfaceC10459q interfaceC10459q3;
        C3880A3 c3880a3M4785f;
        InterfaceC14339Q interfaceC14339QM4770a;
        long jM4662d;
        long jM4660b;
        long j13;
        float f12;
        long jM15774b;
        InterfaceC1439n interfaceC1439n4;
        InterfaceC1439n interfaceC1439n5;
        C4158x2 c4158x3;
        int i23;
        int i24;
        float f13;
        Object objM6514H;
        Object obj;
        C2925c c2925c;
        int i25;
        InterfaceC1439n interfaceC1439n6;
        boolean z6;
        int i26;
        boolean z10;
        boolean z11;
        Object objM6514H2;
        float f14;
        boolean z12;
        boolean z13;
        boolean z14;
        Object objM6514H3;
        Object objM6514H4;
        C13756d c13756d;
        boolean z15;
        boolean z16;
        Object objM6514H5;
        C4158x2 c4158x4;
        InterfaceC1439n interfaceC1439n7;
        InterfaceC1439n interfaceC1439n8;
        float f15;
        C3880A3 c3880a5;
        InterfaceC10459q interfaceC10459q4;
        InterfaceC14339Q interfaceC14339Q3;
        long j14;
        long j15;
        float f16;
        boolean z17;
        Object objM6514H6;
        C6018n0 c6018n0M6555r;
        int i27;
        int i28;
        c6021p.m6526U(2132719801);
        if ((i10 & 6) == 0) {
            i13 = (c6021p.m6545h(interfaceC1426a) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        int i29 = i12 & 2;
        if (i29 == 0) {
            if ((i10 & 48) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i13 |= c6021p.m6542f(interfaceC10459q2) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                if ((i12 & 4) == 0) {
                    c3880a4 = c3880a3;
                    int i30 = c6021p.m6542f(c3880a4) ? 256 : 128;
                    i13 |= i30;
                } else {
                    c3880a4 = c3880a3;
                }
                i13 |= i30;
            } else {
                c3880a4 = c3880a3;
            }
            i14 = i13 | 3072;
            if ((i10 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    interfaceC14339Q2 = interfaceC14339Q;
                    int i31 = c6021p.m6542f(interfaceC14339Q2) ? 16384 : 8192;
                    i14 |= i31;
                } else {
                    interfaceC14339Q2 = interfaceC14339Q;
                }
                i14 |= i31;
            } else {
                interfaceC14339Q2 = interfaceC14339Q;
            }
            if ((i10 & 196608) != 0) {
                if ((i12 & 32) == 0 || !c6021p.m6540e(j10)) {
                    i28 = 65536;
                } else {
                    i28 = 131072;
                }
                i14 |= i28;
            }
            if ((i10 & 1572864) == 0) {
                i14 |= 524288;
            }
            i15 = i14 | 12582912;
            if ((i10 & 100663296) == 0) {
                i15 = i14 | 46137344;
            }
            i16 = i12 & 512;
            if (i16 != 0) {
                i15 |= 805306368;
                interfaceC1439n3 = interfaceC1439n;
            } else {
                interfaceC1439n3 = interfaceC1439n;
                if ((i10 & 805306368) == 0) {
                    if (c6021p.m6545h(interfaceC1439n3)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i15 |= i17;
                }
            }
            i18 = i15;
            if ((i11 & 6) == 0) {
                i19 = i11 | 2;
            } else {
                i19 = i11;
            }
            i20 = i12 & 2048;
            if (i20 != 0) {
                i19 |= 48;
            } else if ((i11 & 48) == 0) {
                if (c6021p.m6542f(c4158x2)) {
                    i21 = 32;
                } else {
                    i21 = 16;
                }
                i19 |= i21;
            }
            if ((i11 & 384) != 0) {
                if (c6021p.m6545h(c8410b)) {
                    i27 = 256;
                } else {
                    i27 = 128;
                }
                i19 |= i27;
            }
            i22 = i19;
            if ((i18 & 306783379) != 306783378 && (i22 & 147) == 146 && c6021p.m6562y()) {
                c6021p.m6517L();
                f15 = f10;
                j15 = j10;
                interfaceC1439n7 = interfaceC1439n2;
                c4158x4 = c4158x2;
                interfaceC10459q4 = interfaceC10459q2;
                c3880a5 = c3880a4;
                interfaceC14339Q3 = interfaceC14339Q2;
                interfaceC1439n8 = interfaceC1439n3;
                j14 = j11;
                f16 = f11;
                jM15774b = j12;
            } else {
                c6021p.m6519N();
                if ((i10 & 1) != 0 || c6021p.m6561x()) {
                    if (i29 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if ((i12 & 4) != 0) {
                        c3880a3M4785f = m4785f(0, 3, c6021p, false);
                        i18 &= -897;
                    } else {
                        c3880a3M4785f = c3880a4;
                    }
                    float f17 = C3948M.f12186c;
                    if ((16 & i12) != 0) {
                        C3948M c3948m = C3948M.f12184a;
                        float f18 = AbstractC5237D.f17000a;
                        interfaceC14339QM4770a = AbstractC4141u3.m4770a(2, c6021p);
                        i18 &= -57345;
                    } else {
                        interfaceC14339QM4770a = interfaceC14339Q2;
                    }
                    if ((32 & i12) != 0) {
                        C3948M c3948m2 = C3948M.f12184a;
                        float f19 = AbstractC5237D.f17000a;
                        i18 &= -458753;
                        jM4662d = AbstractC3959O0.m4662d(40, c6021p);
                    } else {
                        jM4662d = j10;
                    }
                    jM4660b = AbstractC3959O0.m4660b(jM4662d, c6021p);
                    j13 = jM4662d;
                    f12 = 0;
                    jM15774b = C14365u.m15774b(0.32f, AbstractC3959O0.m4662d(30, c6021p));
                    int i32 = i18 & (-238551041);
                    if (i16 != 0) {
                        interfaceC1439n4 = AbstractC3993V0.f12533a;
                    } else {
                        interfaceC1439n4 = interfaceC1439n;
                    }
                    interfaceC1439n5 = C3969Q0.f12381H0;
                    int i33 = i22 & (-15);
                    if (i20 != 0) {
                        c4158x3 = AbstractC3984T1.f12487a;
                    } else {
                        c4158x3 = c4158x2;
                    }
                    i23 = i32;
                    i24 = i33;
                    f13 = f17;
                    interfaceC10459q2 = interfaceC10459q3;
                } else {
                    c6021p.m6517L();
                    if ((i12 & 4) != 0) {
                        i18 &= -897;
                    }
                    if ((16 & i12) != 0) {
                        i18 &= -57345;
                    }
                    if ((32 & i12) != 0) {
                        i18 &= -458753;
                    }
                    j13 = j10;
                    jM4660b = j11;
                    f12 = f11;
                    interfaceC1439n5 = interfaceC1439n2;
                    i24 = i22 & (-15);
                    i23 = i18 & (-238551041);
                    c3880a3M4785f = c3880a4;
                    interfaceC14339QM4770a = interfaceC14339Q2;
                    interfaceC1439n4 = interfaceC1439n3;
                    f13 = f10;
                    jM15774b = j12;
                    c4158x3 = c4158x2;
                }
                c6021p.m6554q();
                objM6514H = c6021p.m6514H();
                obj = C6013l.f19514a;
                if (objM6514H == obj) {
                    objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
                }
                c2925c = ((C6035w) objM6514H).f19668Y;
                C4158x2 c4158x5 = c4158x3;
                i25 = (i23 & 896) ^ 384;
                int i34 = i24;
                if (i25 > 256 || !c6021p.m6542f(c3880a3M4785f)) {
                    interfaceC1439n6 = interfaceC1439n5;
                    if ((i23 & 384) != 256) {
                        z6 = false;
                    }
                    boolean zM6545h = z6 | c6021p.m6545h(c2925c);
                    i26 = i23 & 14;
                    InterfaceC1439n interfaceC1439n9 = interfaceC1439n4;
                    if (i26 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = zM6545h | z10;
                    objM6514H2 = c6021p.m6514H();
                    if (z11 || objM6514H2 == obj) {
                        objM6514H2 = new C4092m2(c3880a3M4785f, c2925c, interfaceC1426a);
                        c6021p.m6537c0(objM6514H2);
                    }
                    InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H2;
                    boolean zM6545h2 = c6021p.m6545h(c2925c);
                    if (i25 > 256 || !c6021p.m6542f(c3880a3M4785f)) {
                        f14 = f12;
                        if ((i23 & 384) != 256) {
                            z12 = false;
                        }
                        boolean z18 = z12 | zM6545h2;
                        if (i26 == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = z18 | z13;
                        objM6514H3 = c6021p.m6514H();
                        if (z14 || objM6514H3 == obj) {
                            objM6514H3 = new C0146w(c2925c, c3880a3M4785f, interfaceC1426a, 18);
                            c6021p.m6537c0(objM6514H3);
                        }
                        InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H3;
                        objM6514H4 = c6021p.m6514H();
                        if (objM6514H4 == obj) {
                            objM6514H4 = AbstractC13758e.m15236a(0.0f);
                            c6021p.m6537c0(objM6514H4);
                        }
                        c13756d = (C13756d) objM6514H4;
                        boolean zM6545h3 = ((i25 <= 256 && c6021p.m6542f(c3880a3M4785f)) || (i23 & 384) == 256) | c6021p.m6545h(c2925c) | c6021p.m6545h(c13756d);
                        if (i26 == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM6545h3 | z15;
                        objM6514H5 = c6021p.m6514H();
                        if (z16 || objM6514H5 == obj) {
                            objM6514H5 = new C0494y(c3880a3M4785f, c2925c, c13756d, interfaceC1426a, 5);
                            c6021p.m6537c0(objM6514H5);
                        }
                        AbstractC3984T1.m4694m((InterfaceC1426a) objM6514H5, c4158x5, c13756d, AbstractC8411c.m8969c(-314673510, c6021p, new C4062h2(jM15774b, interfaceC1426a2, c3880a3M4785f, c13756d, c2925c, interfaceC1436k, interfaceC10459q2, f13, interfaceC14339QM4770a, j13, jM4660b, f14, interfaceC1439n9, interfaceC1439n6, c8410b)), c6021p, (i34 & 112) | 3584);
                        if (c3880a3M4785f.f11737c.m12638h().f15815a.containsKey(EnumC3886B3.f11778Z)) {
                            z17 = (i25 <= 256 && c6021p.m6542f(c3880a3M4785f)) || (i23 & 384) == 256;
                            objM6514H6 = c6021p.m6514H();
                            if (z17 || objM6514H6 == obj) {
                                objM6514H6 = new C4068i2(c3880a3M4785f, null);
                                c6021p.m6537c0(objM6514H6);
                            }
                            C5997d.m6450f((InterfaceC1439n) objM6514H6, c6021p, c3880a3M4785f);
                        }
                        c4158x4 = c4158x5;
                        interfaceC1439n7 = interfaceC1439n6;
                        interfaceC1439n8 = interfaceC1439n9;
                        f15 = f13;
                        c3880a5 = c3880a3M4785f;
                        interfaceC10459q4 = interfaceC10459q2;
                        interfaceC14339Q3 = interfaceC14339QM4770a;
                        j14 = jM4660b;
                        j15 = j13;
                        f16 = f14;
                    } else {
                        f14 = f12;
                    }
                    z12 = true;
                    boolean z19 = z12 | zM6545h2;
                    if (i26 == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z19 | z13;
                    objM6514H3 = c6021p.m6514H();
                    if (z14) {
                        objM6514H3 = new C0146w(c2925c, c3880a3M4785f, interfaceC1426a, 18);
                        c6021p.m6537c0(objM6514H3);
                    } else {
                        objM6514H3 = new C0146w(c2925c, c3880a3M4785f, interfaceC1426a, 18);
                        c6021p.m6537c0(objM6514H3);
                    }
                    InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) objM6514H3;
                    objM6514H4 = c6021p.m6514H();
                    if (objM6514H4 == obj) {
                        objM6514H4 = AbstractC13758e.m15236a(0.0f);
                        c6021p.m6537c0(objM6514H4);
                    }
                    c13756d = (C13756d) objM6514H4;
                    boolean zM6545h4 = ((i25 <= 256 && c6021p.m6542f(c3880a3M4785f)) || (i23 & 384) == 256) | c6021p.m6545h(c2925c) | c6021p.m6545h(c13756d);
                    if (i26 == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM6545h4 | z15;
                    objM6514H5 = c6021p.m6514H();
                    if (z16) {
                        objM6514H5 = new C0494y(c3880a3M4785f, c2925c, c13756d, interfaceC1426a, 5);
                        c6021p.m6537c0(objM6514H5);
                    } else {
                        objM6514H5 = new C0494y(c3880a3M4785f, c2925c, c13756d, interfaceC1426a, 5);
                        c6021p.m6537c0(objM6514H5);
                    }
                    AbstractC3984T1.m4694m((InterfaceC1426a) objM6514H5, c4158x5, c13756d, AbstractC8411c.m8969c(-314673510, c6021p, new C4062h2(jM15774b, interfaceC1426a2, c3880a3M4785f, c13756d, c2925c, interfaceC1436k2, interfaceC10459q2, f13, interfaceC14339QM4770a, j13, jM4660b, f14, interfaceC1439n9, interfaceC1439n6, c8410b)), c6021p, (i34 & 112) | 3584);
                    if (c3880a3M4785f.f11737c.m12638h().f15815a.containsKey(EnumC3886B3.f11778Z)) {
                        if (i25 <= 256) {
                        }
                        objM6514H6 = c6021p.m6514H();
                        if (z17) {
                            objM6514H6 = new C4068i2(c3880a3M4785f, null);
                            c6021p.m6537c0(objM6514H6);
                        } else {
                            objM6514H6 = new C4068i2(c3880a3M4785f, null);
                            c6021p.m6537c0(objM6514H6);
                        }
                        C5997d.m6450f((InterfaceC1439n) objM6514H6, c6021p, c3880a3M4785f);
                    }
                    c4158x4 = c4158x5;
                    interfaceC1439n7 = interfaceC1439n6;
                    interfaceC1439n8 = interfaceC1439n9;
                    f15 = f13;
                    c3880a5 = c3880a3M4785f;
                    interfaceC10459q4 = interfaceC10459q2;
                    interfaceC14339Q3 = interfaceC14339QM4770a;
                    j14 = jM4660b;
                    j15 = j13;
                    f16 = f14;
                } else {
                    interfaceC1439n6 = interfaceC1439n5;
                }
                z6 = true;
                boolean zM6545h5 = z6 | c6021p.m6545h(c2925c);
                i26 = i23 & 14;
                InterfaceC1439n interfaceC1439n10 = interfaceC1439n4;
                if (i26 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = zM6545h5 | z10;
                objM6514H2 = c6021p.m6514H();
                if (z11) {
                    objM6514H2 = new C4092m2(c3880a3M4785f, c2925c, interfaceC1426a);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    objM6514H2 = new C4092m2(c3880a3M4785f, c2925c, interfaceC1426a);
                    c6021p.m6537c0(objM6514H2);
                }
                InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) objM6514H2;
                boolean zM6545h6 = c6021p.m6545h(c2925c);
                if (i25 > 256) {
                    f14 = f12;
                    if ((i23 & 384) != 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                } else {
                    f14 = f12;
                    if ((i23 & 384) != 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                boolean z110 = z12 | zM6545h6;
                if (i26 == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z110 | z13;
                objM6514H3 = c6021p.m6514H();
                if (z14) {
                    objM6514H3 = new C0146w(c2925c, c3880a3M4785f, interfaceC1426a, 18);
                    c6021p.m6537c0(objM6514H3);
                } else {
                    objM6514H3 = new C0146w(c2925c, c3880a3M4785f, interfaceC1426a, 18);
                    c6021p.m6537c0(objM6514H3);
                }
                InterfaceC1436k interfaceC1436k3 = (InterfaceC1436k) objM6514H3;
                objM6514H4 = c6021p.m6514H();
                if (objM6514H4 == obj) {
                    objM6514H4 = AbstractC13758e.m15236a(0.0f);
                    c6021p.m6537c0(objM6514H4);
                }
                c13756d = (C13756d) objM6514H4;
                boolean zM6545h7 = ((i25 <= 256 && c6021p.m6542f(c3880a3M4785f)) || (i23 & 384) == 256) | c6021p.m6545h(c2925c) | c6021p.m6545h(c13756d);
                if (i26 == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM6545h7 | z15;
                objM6514H5 = c6021p.m6514H();
                if (z16) {
                    objM6514H5 = new C0494y(c3880a3M4785f, c2925c, c13756d, interfaceC1426a, 5);
                    c6021p.m6537c0(objM6514H5);
                } else {
                    objM6514H5 = new C0494y(c3880a3M4785f, c2925c, c13756d, interfaceC1426a, 5);
                    c6021p.m6537c0(objM6514H5);
                }
                AbstractC3984T1.m4694m((InterfaceC1426a) objM6514H5, c4158x5, c13756d, AbstractC8411c.m8969c(-314673510, c6021p, new C4062h2(jM15774b, interfaceC1426a3, c3880a3M4785f, c13756d, c2925c, interfaceC1436k3, interfaceC10459q2, f13, interfaceC14339QM4770a, j13, jM4660b, f14, interfaceC1439n10, interfaceC1439n6, c8410b)), c6021p, (i34 & 112) | 3584);
                if (c3880a3M4785f.f11737c.m12638h().f15815a.containsKey(EnumC3886B3.f11778Z)) {
                    if (i25 <= 256) {
                    }
                    objM6514H6 = c6021p.m6514H();
                    if (z17) {
                        objM6514H6 = new C4068i2(c3880a3M4785f, null);
                        c6021p.m6537c0(objM6514H6);
                    } else {
                        objM6514H6 = new C4068i2(c3880a3M4785f, null);
                        c6021p.m6537c0(objM6514H6);
                    }
                    C5997d.m6450f((InterfaceC1439n) objM6514H6, c6021p, c3880a3M4785f);
                }
                c4158x4 = c4158x5;
                interfaceC1439n7 = interfaceC1439n6;
                interfaceC1439n8 = interfaceC1439n10;
                f15 = f13;
                c3880a5 = c3880a3M4785f;
                interfaceC10459q4 = interfaceC10459q2;
                interfaceC14339Q3 = interfaceC14339QM4770a;
                j14 = jM4660b;
                j15 = j13;
                f16 = f14;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4074j2(interfaceC1426a, interfaceC10459q4, c3880a5, f15, interfaceC14339Q3, j15, j14, f16, jM15774b, interfaceC1439n8, interfaceC1439n7, c4158x4, c8410b, i10, i11, i12);
            }
        }
        i13 |= 48;
        interfaceC10459q2 = interfaceC10459q;
        if ((i10 & 384) == 0) {
            if ((i12 & 4) == 0) {
                c3880a4 = c3880a3;
                if (c6021p.m6542f(c3880a4)) {
                }
                i13 |= i30;
            } else {
                c3880a4 = c3880a3;
            }
            i13 |= i30;
        } else {
            c3880a4 = c3880a3;
        }
        i14 = i13 | 3072;
        if ((i10 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                interfaceC14339Q2 = interfaceC14339Q;
                if (c6021p.m6542f(interfaceC14339Q2)) {
                }
                i14 |= i31;
            } else {
                interfaceC14339Q2 = interfaceC14339Q;
            }
            i14 |= i31;
        } else {
            interfaceC14339Q2 = interfaceC14339Q;
        }
        if ((i10 & 196608) != 0) {
            if ((i12 & 32) == 0) {
                i28 = 65536;
            } else {
                i28 = 65536;
            }
            i14 |= i28;
        }
        if ((i10 & 1572864) == 0) {
            i14 |= 524288;
        }
        i15 = i14 | 12582912;
        if ((i10 & 100663296) == 0) {
            i15 = i14 | 46137344;
        }
        i16 = i12 & 512;
        if (i16 != 0) {
            i15 |= 805306368;
            interfaceC1439n3 = interfaceC1439n;
        } else {
            interfaceC1439n3 = interfaceC1439n;
            if ((i10 & 805306368) == 0) {
                if (c6021p.m6545h(interfaceC1439n3)) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
                i15 |= i17;
            }
        }
        i18 = i15;
        if ((i11 & 6) == 0) {
            i19 = i11 | 2;
        } else {
            i19 = i11;
        }
        i20 = i12 & 2048;
        if (i20 != 0) {
            i19 |= 48;
        } else if ((i11 & 48) == 0) {
            if (c6021p.m6542f(c4158x2)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i19 |= i21;
        }
        if ((i11 & 384) != 0) {
            if (c6021p.m6545h(c8410b)) {
                i27 = 256;
            } else {
                i27 = 128;
            }
            i19 |= i27;
        }
        i22 = i19;
        if ((i18 & 306783379) != 306783378) {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i29 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if ((i12 & 4) != 0) {
                    c3880a3M4785f = m4785f(0, 3, c6021p, false);
                    i18 &= -897;
                } else {
                    c3880a3M4785f = c3880a4;
                }
                float f110 = C3948M.f12186c;
                if ((16 & i12) != 0) {
                    C3948M c3948m3 = C3948M.f12184a;
                    float f111 = AbstractC5237D.f17000a;
                    interfaceC14339QM4770a = AbstractC4141u3.m4770a(2, c6021p);
                    i18 &= -57345;
                } else {
                    interfaceC14339QM4770a = interfaceC14339Q2;
                }
                if ((32 & i12) != 0) {
                    C3948M c3948m4 = C3948M.f12184a;
                    float f112 = AbstractC5237D.f17000a;
                    i18 &= -458753;
                    jM4662d = AbstractC3959O0.m4662d(40, c6021p);
                } else {
                    jM4662d = j10;
                }
                jM4660b = AbstractC3959O0.m4660b(jM4662d, c6021p);
                j13 = jM4662d;
                f12 = 0;
                jM15774b = C14365u.m15774b(0.32f, AbstractC3959O0.m4662d(30, c6021p));
                int i35 = i18 & (-238551041);
                if (i16 != 0) {
                    interfaceC1439n4 = AbstractC3993V0.f12533a;
                } else {
                    interfaceC1439n4 = interfaceC1439n;
                }
                interfaceC1439n5 = C3969Q0.f12381H0;
                int i36 = i22 & (-15);
                if (i20 != 0) {
                    c4158x3 = AbstractC3984T1.f12487a;
                } else {
                    c4158x3 = c4158x2;
                }
                i23 = i35;
                i24 = i36;
                f13 = f110;
                interfaceC10459q2 = interfaceC10459q3;
            } else {
                if (i29 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if ((i12 & 4) != 0) {
                    c3880a3M4785f = m4785f(0, 3, c6021p, false);
                    i18 &= -897;
                } else {
                    c3880a3M4785f = c3880a4;
                }
                float f113 = C3948M.f12186c;
                if ((16 & i12) != 0) {
                    C3948M c3948m5 = C3948M.f12184a;
                    float f114 = AbstractC5237D.f17000a;
                    interfaceC14339QM4770a = AbstractC4141u3.m4770a(2, c6021p);
                    i18 &= -57345;
                } else {
                    interfaceC14339QM4770a = interfaceC14339Q2;
                }
                if ((32 & i12) != 0) {
                    C3948M c3948m6 = C3948M.f12184a;
                    float f115 = AbstractC5237D.f17000a;
                    i18 &= -458753;
                    jM4662d = AbstractC3959O0.m4662d(40, c6021p);
                } else {
                    jM4662d = j10;
                }
                jM4660b = AbstractC3959O0.m4660b(jM4662d, c6021p);
                j13 = jM4662d;
                f12 = 0;
                jM15774b = C14365u.m15774b(0.32f, AbstractC3959O0.m4662d(30, c6021p));
                int i37 = i18 & (-238551041);
                if (i16 != 0) {
                    interfaceC1439n4 = AbstractC3993V0.f12533a;
                } else {
                    interfaceC1439n4 = interfaceC1439n;
                }
                interfaceC1439n5 = C3969Q0.f12381H0;
                int i38 = i22 & (-15);
                if (i20 != 0) {
                    c4158x3 = AbstractC3984T1.f12487a;
                } else {
                    c4158x3 = c4158x2;
                }
                i23 = i37;
                i24 = i38;
                f13 = f113;
                interfaceC10459q2 = interfaceC10459q3;
            }
            c6021p.m6554q();
            objM6514H = c6021p.m6514H();
            obj = C6013l.f19514a;
            if (objM6514H == obj) {
                objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            c2925c = ((C6035w) objM6514H).f19668Y;
            C4158x2 c4158x6 = c4158x3;
            i25 = (i23 & 896) ^ 384;
            int i39 = i24;
            if (i25 > 256) {
                interfaceC1439n6 = interfaceC1439n5;
                if ((i23 & 384) != 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                interfaceC1439n6 = interfaceC1439n5;
                if ((i23 & 384) != 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            boolean zM6545h8 = z6 | c6021p.m6545h(c2925c);
            i26 = i23 & 14;
            InterfaceC1439n interfaceC1439n11 = interfaceC1439n4;
            if (i26 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = zM6545h8 | z10;
            objM6514H2 = c6021p.m6514H();
            if (z11) {
                objM6514H2 = new C4092m2(c3880a3M4785f, c2925c, interfaceC1426a);
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = new C4092m2(c3880a3M4785f, c2925c, interfaceC1426a);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC1426a interfaceC1426a4 = (InterfaceC1426a) objM6514H2;
            boolean zM6545h9 = c6021p.m6545h(c2925c);
            if (i25 > 256) {
                f14 = f12;
                if ((i23 & 384) != 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            } else {
                f14 = f12;
                if ((i23 & 384) != 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            boolean z111 = z12 | zM6545h9;
            if (i26 == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z111 | z13;
            objM6514H3 = c6021p.m6514H();
            if (z14) {
                objM6514H3 = new C0146w(c2925c, c3880a3M4785f, interfaceC1426a, 18);
                c6021p.m6537c0(objM6514H3);
            } else {
                objM6514H3 = new C0146w(c2925c, c3880a3M4785f, interfaceC1426a, 18);
                c6021p.m6537c0(objM6514H3);
            }
            InterfaceC1436k interfaceC1436k4 = (InterfaceC1436k) objM6514H3;
            objM6514H4 = c6021p.m6514H();
            if (objM6514H4 == obj) {
                objM6514H4 = AbstractC13758e.m15236a(0.0f);
                c6021p.m6537c0(objM6514H4);
            }
            c13756d = (C13756d) objM6514H4;
            boolean zM6545h10 = ((i25 <= 256 && c6021p.m6542f(c3880a3M4785f)) || (i23 & 384) == 256) | c6021p.m6545h(c2925c) | c6021p.m6545h(c13756d);
            if (i26 == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = zM6545h10 | z15;
            objM6514H5 = c6021p.m6514H();
            if (z16) {
                objM6514H5 = new C0494y(c3880a3M4785f, c2925c, c13756d, interfaceC1426a, 5);
                c6021p.m6537c0(objM6514H5);
            } else {
                objM6514H5 = new C0494y(c3880a3M4785f, c2925c, c13756d, interfaceC1426a, 5);
                c6021p.m6537c0(objM6514H5);
            }
            AbstractC3984T1.m4694m((InterfaceC1426a) objM6514H5, c4158x6, c13756d, AbstractC8411c.m8969c(-314673510, c6021p, new C4062h2(jM15774b, interfaceC1426a4, c3880a3M4785f, c13756d, c2925c, interfaceC1436k4, interfaceC10459q2, f13, interfaceC14339QM4770a, j13, jM4660b, f14, interfaceC1439n11, interfaceC1439n6, c8410b)), c6021p, (i39 & 112) | 3584);
            if (c3880a3M4785f.f11737c.m12638h().f15815a.containsKey(EnumC3886B3.f11778Z)) {
                if (i25 <= 256) {
                }
                objM6514H6 = c6021p.m6514H();
                if (z17) {
                    objM6514H6 = new C4068i2(c3880a3M4785f, null);
                    c6021p.m6537c0(objM6514H6);
                } else {
                    objM6514H6 = new C4068i2(c3880a3M4785f, null);
                    c6021p.m6537c0(objM6514H6);
                }
                C5997d.m6450f((InterfaceC1439n) objM6514H6, c6021p, c3880a3M4785f);
            }
            c4158x4 = c4158x6;
            interfaceC1439n7 = interfaceC1439n6;
            interfaceC1439n8 = interfaceC1439n11;
            f15 = f13;
            c3880a5 = c3880a3M4785f;
            interfaceC10459q4 = interfaceC10459q2;
            interfaceC14339Q3 = interfaceC14339QM4770a;
            j14 = jM4660b;
            j15 = j13;
            f16 = f14;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i29 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if ((i12 & 4) != 0) {
                    c3880a3M4785f = m4785f(0, 3, c6021p, false);
                    i18 &= -897;
                } else {
                    c3880a3M4785f = c3880a4;
                }
                float f116 = C3948M.f12186c;
                if ((16 & i12) != 0) {
                    C3948M c3948m7 = C3948M.f12184a;
                    float f117 = AbstractC5237D.f17000a;
                    interfaceC14339QM4770a = AbstractC4141u3.m4770a(2, c6021p);
                    i18 &= -57345;
                } else {
                    interfaceC14339QM4770a = interfaceC14339Q2;
                }
                if ((32 & i12) != 0) {
                    C3948M c3948m8 = C3948M.f12184a;
                    float f118 = AbstractC5237D.f17000a;
                    i18 &= -458753;
                    jM4662d = AbstractC3959O0.m4662d(40, c6021p);
                } else {
                    jM4662d = j10;
                }
                jM4660b = AbstractC3959O0.m4660b(jM4662d, c6021p);
                j13 = jM4662d;
                f12 = 0;
                jM15774b = C14365u.m15774b(0.32f, AbstractC3959O0.m4662d(30, c6021p));
                int i310 = i18 & (-238551041);
                if (i16 != 0) {
                    interfaceC1439n4 = AbstractC3993V0.f12533a;
                } else {
                    interfaceC1439n4 = interfaceC1439n;
                }
                interfaceC1439n5 = C3969Q0.f12381H0;
                int i311 = i22 & (-15);
                if (i20 != 0) {
                    c4158x3 = AbstractC3984T1.f12487a;
                } else {
                    c4158x3 = c4158x2;
                }
                i23 = i310;
                i24 = i311;
                f13 = f116;
                interfaceC10459q2 = interfaceC10459q3;
            } else {
                if (i29 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if ((i12 & 4) != 0) {
                    c3880a3M4785f = m4785f(0, 3, c6021p, false);
                    i18 &= -897;
                } else {
                    c3880a3M4785f = c3880a4;
                }
                float f119 = C3948M.f12186c;
                if ((16 & i12) != 0) {
                    C3948M c3948m9 = C3948M.f12184a;
                    float f1110 = AbstractC5237D.f17000a;
                    interfaceC14339QM4770a = AbstractC4141u3.m4770a(2, c6021p);
                    i18 &= -57345;
                } else {
                    interfaceC14339QM4770a = interfaceC14339Q2;
                }
                if ((32 & i12) != 0) {
                    C3948M c3948m10 = C3948M.f12184a;
                    float f1111 = AbstractC5237D.f17000a;
                    i18 &= -458753;
                    jM4662d = AbstractC3959O0.m4662d(40, c6021p);
                } else {
                    jM4662d = j10;
                }
                jM4660b = AbstractC3959O0.m4660b(jM4662d, c6021p);
                j13 = jM4662d;
                f12 = 0;
                jM15774b = C14365u.m15774b(0.32f, AbstractC3959O0.m4662d(30, c6021p));
                int i312 = i18 & (-238551041);
                if (i16 != 0) {
                    interfaceC1439n4 = AbstractC3993V0.f12533a;
                } else {
                    interfaceC1439n4 = interfaceC1439n;
                }
                interfaceC1439n5 = C3969Q0.f12381H0;
                int i313 = i22 & (-15);
                if (i20 != 0) {
                    c4158x3 = AbstractC3984T1.f12487a;
                } else {
                    c4158x3 = c4158x2;
                }
                i23 = i312;
                i24 = i313;
                f13 = f119;
                interfaceC10459q2 = interfaceC10459q3;
            }
            c6021p.m6554q();
            objM6514H = c6021p.m6514H();
            obj = C6013l.f19514a;
            if (objM6514H == obj) {
                objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            c2925c = ((C6035w) objM6514H).f19668Y;
            C4158x2 c4158x7 = c4158x3;
            i25 = (i23 & 896) ^ 384;
            int i314 = i24;
            if (i25 > 256) {
                interfaceC1439n6 = interfaceC1439n5;
                if ((i23 & 384) != 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                interfaceC1439n6 = interfaceC1439n5;
                if ((i23 & 384) != 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            boolean zM6545h11 = z6 | c6021p.m6545h(c2925c);
            i26 = i23 & 14;
            InterfaceC1439n interfaceC1439n12 = interfaceC1439n4;
            if (i26 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = zM6545h11 | z10;
            objM6514H2 = c6021p.m6514H();
            if (z11) {
                objM6514H2 = new C4092m2(c3880a3M4785f, c2925c, interfaceC1426a);
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = new C4092m2(c3880a3M4785f, c2925c, interfaceC1426a);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC1426a interfaceC1426a5 = (InterfaceC1426a) objM6514H2;
            boolean zM6545h12 = c6021p.m6545h(c2925c);
            if (i25 > 256) {
                f14 = f12;
                if ((i23 & 384) != 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            } else {
                f14 = f12;
                if ((i23 & 384) != 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            boolean z112 = z12 | zM6545h12;
            if (i26 == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z112 | z13;
            objM6514H3 = c6021p.m6514H();
            if (z14) {
                objM6514H3 = new C0146w(c2925c, c3880a3M4785f, interfaceC1426a, 18);
                c6021p.m6537c0(objM6514H3);
            } else {
                objM6514H3 = new C0146w(c2925c, c3880a3M4785f, interfaceC1426a, 18);
                c6021p.m6537c0(objM6514H3);
            }
            InterfaceC1436k interfaceC1436k5 = (InterfaceC1436k) objM6514H3;
            objM6514H4 = c6021p.m6514H();
            if (objM6514H4 == obj) {
                objM6514H4 = AbstractC13758e.m15236a(0.0f);
                c6021p.m6537c0(objM6514H4);
            }
            c13756d = (C13756d) objM6514H4;
            boolean zM6545h13 = ((i25 <= 256 && c6021p.m6542f(c3880a3M4785f)) || (i23 & 384) == 256) | c6021p.m6545h(c2925c) | c6021p.m6545h(c13756d);
            if (i26 == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = zM6545h13 | z15;
            objM6514H5 = c6021p.m6514H();
            if (z16) {
                objM6514H5 = new C0494y(c3880a3M4785f, c2925c, c13756d, interfaceC1426a, 5);
                c6021p.m6537c0(objM6514H5);
            } else {
                objM6514H5 = new C0494y(c3880a3M4785f, c2925c, c13756d, interfaceC1426a, 5);
                c6021p.m6537c0(objM6514H5);
            }
            AbstractC3984T1.m4694m((InterfaceC1426a) objM6514H5, c4158x7, c13756d, AbstractC8411c.m8969c(-314673510, c6021p, new C4062h2(jM15774b, interfaceC1426a5, c3880a3M4785f, c13756d, c2925c, interfaceC1436k5, interfaceC10459q2, f13, interfaceC14339QM4770a, j13, jM4660b, f14, interfaceC1439n12, interfaceC1439n6, c8410b)), c6021p, (i314 & 112) | 3584);
            if (c3880a3M4785f.f11737c.m12638h().f15815a.containsKey(EnumC3886B3.f11778Z)) {
                if (i25 <= 256) {
                }
                objM6514H6 = c6021p.m6514H();
                if (z17) {
                    objM6514H6 = new C4068i2(c3880a3M4785f, null);
                    c6021p.m6537c0(objM6514H6);
                } else {
                    objM6514H6 = new C4068i2(c3880a3M4785f, null);
                    c6021p.m6537c0(objM6514H6);
                }
                C5997d.m6450f((InterfaceC1439n) objM6514H6, c6021p, c3880a3M4785f);
            }
            c4158x4 = c4158x7;
            interfaceC1439n7 = interfaceC1439n6;
            interfaceC1439n8 = interfaceC1439n12;
            f15 = f13;
            c3880a5 = c3880a3M4785f;
            interfaceC10459q4 = interfaceC10459q2;
            interfaceC14339Q3 = interfaceC14339QM4770a;
            j14 = jM4660b;
            j15 = j13;
            f16 = f14;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4074j2(interfaceC1426a, interfaceC10459q4, c3880a5, f15, interfaceC14339Q3, j15, j14, f16, jM15774b, interfaceC1439n8, interfaceC1439n7, c4158x4, c8410b, i10, i11, i12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m4781b(C13756d c13756d, C2925c c2925c, InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C3880A3 c3880a3, float f10, InterfaceC14339Q interfaceC14339Q, long j10, long j11, float f11, InterfaceC1439n interfaceC1439n, InterfaceC1439n interfaceC1439n2, C8410b c8410b, C6021p c6021p, int i10, int i11) {
        int i12;
        int i13;
        C10843b c10843b = C10843b.f32509a;
        c6021p.m6526U(-1676960531);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(c10843b) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= (i10 & 64) == 0 ? c6021p.m6542f(c13756d) : c6021p.m6545h(c13756d) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6545h(c2925c) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6545h(interfaceC1426a) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c6021p.m6545h(interfaceC1436k) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c6021p.m6542f(interfaceC10459q) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= c6021p.m6542f(c3880a3) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c6021p.m6536c(f10) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c6021p.m6542f(interfaceC14339Q) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c6021p.m6540e(j10) ? 536870912 : 268435456;
        }
        int i14 = i12;
        if ((i11 & 6) == 0) {
            i13 = i11 | (c6021p.m6540e(j11) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c6021p.m6536c(f11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= c6021p.m6545h(interfaceC1439n) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c6021p.m6545h(interfaceC1439n2) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= c6021p.m6545h(c8410b) ? 16384 : 8192;
        }
        int i15 = i13;
        if ((i14 & 306783379) == 306783378 && (i15 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6519N();
            if ((i10 & 1) != 0 && !c6021p.m6561x()) {
                c6021p.m6517L();
            }
            c6021p.m6554q();
            String strM5496e = AbstractC4846J.m5496e(R.string.m3c_bottom_sheet_pane_title, c6021p);
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(AbstractC10844c.m11257q(c10843b.m11240a(interfaceC10459q, C10444b.f30935Z), 0.0f, f10, 1), 1.0f);
            int i16 = (i14 & 3670016) ^ 1572864;
            boolean z6 = (i16 > 1048576 && c6021p.m6542f(c3880a3)) || (i14 & 1572864) == 1048576;
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (z6 || objM6514H == obj) {
                float f12 = AbstractC4159x3.f13483a;
                objM6514H = new C4147v3(c3880a3, interfaceC1436k);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC10459q interfaceC10459qM11313a = AbstractC10866a.m11313a(interfaceC10459qM11244d, (InterfaceC19431a) objM6514H, null);
            C11246q c11246q = c3880a3.f11737c;
            boolean z10 = (i16 > 1048576 && c6021p.m6542f(c3880a3)) || (i14 & 1572864) == 1048576;
            Object objM6514H2 = c6021p.m6514H();
            if (z10 || objM6514H2 == obj) {
                objM6514H2 = new C0227a(c3880a3, 11);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC10459q interfaceC10459qM11288c = AbstractC10860a.m11288c(interfaceC10459qM11313a, c11246q, (InterfaceC1439n) objM6514H2);
            C4894u c4894u = (C4894u) c3880a3.f11737c.f34069f;
            boolean zM4604d = c3880a3.m4604d();
            boolean z11 = ((C6002f0) c3880a3.f11737c.f34075l).getValue() != null;
            boolean z12 = (i14 & 57344) == 16384;
            Object objM6514H3 = c6021p.m6514H();
            if (z12 || objM6514H3 == obj) {
                objM6514H3 = new C4110p2(interfaceC1436k, null);
                c6021p.m6537c0(objM6514H3);
            }
            InterfaceC10459q interfaceC10459qM18554a = AbstractC16786v0.m18554a(interfaceC10459qM11288c, c4894u, zM4604d, null, z11, null, (InterfaceC1440o) objM6514H3, false, 168);
            boolean zM6542f = c6021p.m6542f(strM5496e);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f || objM6514H4 == obj) {
                objM6514H4 = new C0491v(strM5496e, 17);
                c6021p.m6537c0(objM6514H4);
            }
            boolean z13 = false;
            InterfaceC10459q interfaceC10459qM3789a = AbstractC2965l.m3789a(interfaceC10459qM18554a, false, (InterfaceC1436k) objM6514H4);
            boolean z14 = (i16 > 1048576 && c6021p.m6542f(c3880a3)) || (i14 & 1572864) == 1048576;
            if ((i14 & 112) == 32 || ((i14 & 64) != 0 && c6021p.m6545h(c13756d))) {
                z13 = true;
            }
            boolean z15 = z13 | z14;
            Object objM6514H5 = c6021p.m6514H();
            if (z15 || objM6514H5 == obj) {
                objM6514H5 = new C3350b0(c3880a3, 7, c13756d);
                c6021p.m6537c0(objM6514H5);
            }
            int i17 = i14 >> 21;
            int i18 = i15 << 9;
            AbstractC4034c4.m4725a(AbstractC10864a.m11305a(interfaceC10459qM3789a, (InterfaceC1436k) objM6514H5), interfaceC14339Q, j10, j11, f11, 0.0f, null, AbstractC8411c.m8969c(-692668920, c6021p, new C2486X0(interfaceC1439n2, c13756d, interfaceC1439n, c3880a3, interfaceC1426a, c2925c, c8410b, 1)), c6021p, (i17 & 896) | (i17 & 112) | 12582912 | (i18 & 7168) | (i18 & 57344), 96);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4128s2(c13756d, c2925c, interfaceC1426a, interfaceC1436k, interfaceC10459q, c3880a3, f10, interfaceC14339Q, j10, j11, f11, interfaceC1439n, interfaceC1439n2, c8410b, i10, i11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m4782c(long j10, InterfaceC1426a interfaceC1426a, boolean z6, C6021p c6021p, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        c6021p.m6526U(951870469);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6540e(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z6) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else if (j10 != 16) {
            InterfaceC5982V0 interfaceC5982V0M15261b = AbstractC13764h.m15261b(z6 ? 1.0f : 0.0f, new C13781p0(0, (InterfaceC13798z) null, 7), null, c6021p, 48, 28);
            Object objM5496e = AbstractC4846J.m5496e(R.string.close_sheet, c6021p);
            c6021p.m6524S(-1785653838);
            InterfaceC10459q interfaceC10459qM3789a = C10456n.f30959Y;
            Object obj = C6013l.f19514a;
            if (z6) {
                int i13 = i12 & 112;
                boolean z12 = i13 == 32;
                Object objM6514H = c6021p.m6514H();
                if (z12 || objM6514H == obj) {
                    objM6514H = new C4146v2(interfaceC1426a, null);
                    c6021p.m6537c0(objM6514H);
                }
                SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(interfaceC1426a, null, (InterfaceC1439n) objM6514H, 6);
                boolean zM6542f = (i13 == 32) | c6021p.m6542f(objM5496e);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6542f || objM6514H2 == obj) {
                    objM6514H2 = new C3350b0(objM5496e, 8, interfaceC1426a);
                    c6021p.m6537c0(objM6514H2);
                }
                z10 = true;
                interfaceC10459qM3789a = AbstractC2965l.m3789a(suspendPointerInputElement, true, (InterfaceC1436k) objM6514H2);
                z11 = false;
            } else {
                z10 = true;
                z11 = false;
            }
            c6021p.m6553p(z11);
            InterfaceC10459q interfaceC10459qMo428M = AbstractC10844c.f32512c.mo428M(interfaceC10459qM3789a);
            boolean zM6542f2 = c6021p.m6542f(interfaceC5982V0M15261b) | ((i12 & 14) == 4 ? z10 : false);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f2 || objM6514H3 == obj) {
                objM6514H3 = new C4134t2(j10, interfaceC5982V0M15261b, 0);
                c6021p.m6537c0(objM6514H3);
            }
            AbstractC8455C.m9069a(0, (InterfaceC1436k) objM6514H3, c6021p, interfaceC10459qMo428M);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4140u2(j10, interfaceC1426a, z6, i10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final float m4783d(C14336N c14336n, float f10) {
        float fM15333e = C13803e.m15333e(c14336n.f44980D0);
        if (Float.isNaN(fM15333e) || fM15333e == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (AbstractC9930m3.m10589c(0.0f, Math.min(c14336n.f44981E0.getDensity() * f13451a, fM15333e), f10) / fM15333e);
    }

    /* JADX INFO: renamed from: e */
    public static final float m4784e(C14336N c14336n, float f10) {
        float fM15331c = C13803e.m15331c(c14336n.f44980D0);
        if (Float.isNaN(fM15331c) || fM15331c == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (AbstractC9930m3.m10589c(0.0f, Math.min(c14336n.f44981E0.getDensity() * f13452b, fM15331c), f10) / fM15331c);
    }

    /* JADX INFO: renamed from: f */
    public static final C3880A3 m4785f(int i10, int i11, C6021p c6021p, boolean z6) {
        if ((i11 & 1) != 0) {
            z6 = false;
        }
        return AbstractC4159x3.m4787a(z6, C4161y.f13503x0, EnumC3886B3.f11777Y, false, c6021p, (i10 & 14) | 384, 8);
    }
}
