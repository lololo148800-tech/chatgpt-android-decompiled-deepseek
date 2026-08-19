package p544W9;

import androidx.compose.p650ui.viewinterop.AbstractC10869a;
import java.util.ArrayList;
import p049Bm.InterfaceC1436k;
import p327N0.C5573c;
import p349O0.C5975S;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;
import p837ji.C16212a;
import p837ji.C16213b;
import p837ji.C16214c;
import p837ji.C16215d;

/* JADX INFO: renamed from: W9.Q3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8543Q3 {
    /* JADX WARN: Code duplicated, block: B:101:0x0130  */
    /* JADX WARN: Code duplicated, block: B:102:0x0132  */
    /* JADX WARN: Code duplicated, block: B:105:0x013e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x014b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0182  */
    /* JADX WARN: Code duplicated, block: B:112:0x0186  */
    /* JADX WARN: Code duplicated, block: B:114:0x018b  */
    /* JADX WARN: Code duplicated, block: B:115:0x018d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0195  */
    /* JADX WARN: Code duplicated, block: B:119:0x0197  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:128:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x0103  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:94:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x0125  */
    /* JADX WARN: Code duplicated, block: B:98:0x0127  */
    /* JADX INFO: renamed from: a */
    public static final void m9203a(ArrayList arrayList, InterfaceC10459q interfaceC10459q, Double d10, Double d11, double d12, boolean z6, float f10, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        float f11;
        int i14;
        int i15;
        InterfaceC1436k interfaceC1436k2;
        int i16;
        boolean z11;
        float f12;
        InterfaceC1436k interfaceC1436k3;
        boolean z12;
        int i17;
        boolean z13;
        int i18;
        boolean z14;
        int i19;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM6514H;
        int i20;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean zM6545h;
        Object objM6514H2;
        double d13;
        boolean z22;
        float f13;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(-1666946607);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(arrayList) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6542f(d10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6542f(d11) ? 2048 : 1024;
        }
        int i21 = i12 | 24576;
        int i22 = i11 & 32;
        if (i22 == 0) {
            if ((196608 & i10) == 0) {
                z10 = z6;
                i21 |= c6021p.m6544g(z10) ? 131072 : 65536;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                if ((1572864 & i10) == 0) {
                    f11 = f10;
                    if (c6021p.m6536c(f11)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i21 |= i14;
                }
                i15 = i11 & 128;
                if (i15 != 0) {
                    i21 |= 12582912;
                    interfaceC1436k2 = interfaceC1436k;
                } else {
                    interfaceC1436k2 = interfaceC1436k;
                    if ((i10 & 12582912) == 0) {
                        if (c6021p.m6545h(interfaceC1436k2)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i21 |= i16;
                    }
                }
                if ((i21 & 4793491) == 4793490 || !c6021p.m6562y()) {
                    if (i22 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i13 != 0) {
                        f12 = 0;
                    } else {
                        f12 = f11;
                    }
                    if (i15 != 0) {
                        interfaceC1436k3 = C16212a.f50304Y;
                    } else {
                        interfaceC1436k3 = interfaceC1436k2;
                    }
                    c6021p.m6524S(476268570);
                    if ((29360128 & i21) == 8388608) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    i17 = i21 & 896;
                    if (i17 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z23 = z12 | z13;
                    i18 = i21 & 7168;
                    if (i18 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z24 = z23 | z14;
                    i19 = i21 & 57344;
                    if (i19 == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean zM6545h2 = z24 | z15 | c6021p.m6545h(arrayList);
                    if ((i21 & 458752) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z25 = zM6545h2 | z16;
                    if ((3670016 & i21) == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z25 | z17;
                    objM6514H = c6021p.m6514H();
                    C5975S c5975s = C6013l.f19514a;
                    if (z18 || objM6514H == c5975s) {
                        C16213b c16213b = new C16213b(interfaceC1436k3, 12.0d, arrayList, z11, f12, d10, d11);
                        c6021p.m6537c0(c16213b);
                        objM6514H = c16213b;
                    }
                    InterfaceC1436k interfaceC1436k4 = (InterfaceC1436k) objM6514H;
                    c6021p.m6553p(false);
                    c6021p.m6524S(476308487);
                    if (i17 == 256) {
                        i20 = 2048;
                        z19 = true;
                    } else {
                        i20 = 2048;
                        z19 = false;
                    }
                    if (i18 == i20) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    boolean z26 = z20 | z19;
                    if (i19 == 16384) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    zM6545h = z26 | z21 | c6021p.m6545h(arrayList);
                    objM6514H2 = c6021p.m6514H();
                    if (zM6545h || objM6514H2 == c5975s) {
                        C16214c c16214c = new C16214c(d10, d11, 12.0d, arrayList);
                        c6021p.m6537c0(c16214c);
                        objM6514H2 = c16214c;
                    }
                    c6021p.m6553p(false);
                    AbstractC10869a.m11356b(interfaceC1436k4, interfaceC10459q, (InterfaceC1436k) objM6514H2, c6021p, i21 & 112, 0);
                    d13 = 12.0d;
                    z22 = z11;
                    f13 = f12;
                } else {
                    c6021p.m6517L();
                    z22 = z10;
                    interfaceC1436k3 = interfaceC1436k2;
                    f13 = f11;
                    d13 = d12;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C16215d(arrayList, interfaceC10459q, d10, d11, d13, z22, f13, interfaceC1436k3, i10, i11);
                }
            }
            i21 |= 1572864;
            f11 = f10;
            i15 = i11 & 128;
            if (i15 != 0) {
                i21 |= 12582912;
                interfaceC1436k2 = interfaceC1436k;
            } else {
                interfaceC1436k2 = interfaceC1436k;
                if ((i10 & 12582912) == 0) {
                    if (c6021p.m6545h(interfaceC1436k2)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i21 |= i16;
                }
            }
            if ((i21 & 4793491) == 4793490) {
                if (i22 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i13 != 0) {
                    f12 = 0;
                } else {
                    f12 = f11;
                }
                if (i15 != 0) {
                    interfaceC1436k3 = C16212a.f50304Y;
                } else {
                    interfaceC1436k3 = interfaceC1436k2;
                }
                c6021p.m6524S(476268570);
                if ((29360128 & i21) == 8388608) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i17 = i21 & 896;
                if (i17 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z27 = z12 | z13;
                i18 = i21 & 7168;
                if (i18 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z28 = z27 | z14;
                i19 = i21 & 57344;
                if (i19 == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zM6545h3 = z28 | z15 | c6021p.m6545h(arrayList);
                if ((i21 & 458752) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z29 = zM6545h3 | z16;
                if ((3670016 & i21) == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z29 | z17;
                objM6514H = c6021p.m6514H();
                C5975S c5975s2 = C6013l.f19514a;
                if (z18) {
                    C16213b c16213b2 = new C16213b(interfaceC1436k3, 12.0d, arrayList, z11, f12, d10, d11);
                    c6021p.m6537c0(c16213b2);
                    objM6514H = c16213b2;
                } else {
                    C16213b c16213b3 = new C16213b(interfaceC1436k3, 12.0d, arrayList, z11, f12, d10, d11);
                    c6021p.m6537c0(c16213b3);
                    objM6514H = c16213b3;
                }
                InterfaceC1436k interfaceC1436k5 = (InterfaceC1436k) objM6514H;
                c6021p.m6553p(false);
                c6021p.m6524S(476308487);
                if (i17 == 256) {
                    i20 = 2048;
                    z19 = true;
                } else {
                    i20 = 2048;
                    z19 = false;
                }
                if (i18 == i20) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                boolean z210 = z20 | z19;
                if (i19 == 16384) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                zM6545h = z210 | z21 | c6021p.m6545h(arrayList);
                objM6514H2 = c6021p.m6514H();
                if (zM6545h) {
                    C16214c c16214c2 = new C16214c(d10, d11, 12.0d, arrayList);
                    c6021p.m6537c0(c16214c2);
                    objM6514H2 = c16214c2;
                } else {
                    C16214c c16214c3 = new C16214c(d10, d11, 12.0d, arrayList);
                    c6021p.m6537c0(c16214c3);
                    objM6514H2 = c16214c3;
                }
                c6021p.m6553p(false);
                AbstractC10869a.m11356b(interfaceC1436k5, interfaceC10459q, (InterfaceC1436k) objM6514H2, c6021p, i21 & 112, 0);
                d13 = 12.0d;
                z22 = z11;
                f13 = f12;
            } else {
                if (i22 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i13 != 0) {
                    f12 = 0;
                } else {
                    f12 = f11;
                }
                if (i15 != 0) {
                    interfaceC1436k3 = C16212a.f50304Y;
                } else {
                    interfaceC1436k3 = interfaceC1436k2;
                }
                c6021p.m6524S(476268570);
                if ((29360128 & i21) == 8388608) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i17 = i21 & 896;
                if (i17 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z211 = z12 | z13;
                i18 = i21 & 7168;
                if (i18 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z212 = z211 | z14;
                i19 = i21 & 57344;
                if (i19 == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zM6545h4 = z212 | z15 | c6021p.m6545h(arrayList);
                if ((i21 & 458752) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z213 = zM6545h4 | z16;
                if ((3670016 & i21) == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z213 | z17;
                objM6514H = c6021p.m6514H();
                C5975S c5975s3 = C6013l.f19514a;
                if (z18) {
                    C16213b c16213b4 = new C16213b(interfaceC1436k3, 12.0d, arrayList, z11, f12, d10, d11);
                    c6021p.m6537c0(c16213b4);
                    objM6514H = c16213b4;
                } else {
                    C16213b c16213b5 = new C16213b(interfaceC1436k3, 12.0d, arrayList, z11, f12, d10, d11);
                    c6021p.m6537c0(c16213b5);
                    objM6514H = c16213b5;
                }
                InterfaceC1436k interfaceC1436k6 = (InterfaceC1436k) objM6514H;
                c6021p.m6553p(false);
                c6021p.m6524S(476308487);
                if (i17 == 256) {
                    i20 = 2048;
                    z19 = true;
                } else {
                    i20 = 2048;
                    z19 = false;
                }
                if (i18 == i20) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                boolean z214 = z20 | z19;
                if (i19 == 16384) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                zM6545h = z214 | z21 | c6021p.m6545h(arrayList);
                objM6514H2 = c6021p.m6514H();
                if (zM6545h) {
                    C16214c c16214c4 = new C16214c(d10, d11, 12.0d, arrayList);
                    c6021p.m6537c0(c16214c4);
                    objM6514H2 = c16214c4;
                } else {
                    C16214c c16214c5 = new C16214c(d10, d11, 12.0d, arrayList);
                    c6021p.m6537c0(c16214c5);
                    objM6514H2 = c16214c5;
                }
                c6021p.m6553p(false);
                AbstractC10869a.m11356b(interfaceC1436k6, interfaceC10459q, (InterfaceC1436k) objM6514H2, c6021p, i21 & 112, 0);
                d13 = 12.0d;
                z22 = z11;
                f13 = f12;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C16215d(arrayList, interfaceC10459q, d10, d11, d13, z22, f13, interfaceC1436k3, i10, i11);
            }
        }
        i21 = 221184 | i12;
        z10 = z6;
        i13 = i11 & 64;
        if (i13 != 0) {
            if ((1572864 & i10) == 0) {
                f11 = f10;
                if (c6021p.m6536c(f11)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i21 |= i14;
            }
            i15 = i11 & 128;
            if (i15 != 0) {
                i21 |= 12582912;
                interfaceC1436k2 = interfaceC1436k;
            } else {
                interfaceC1436k2 = interfaceC1436k;
                if ((i10 & 12582912) == 0) {
                    if (c6021p.m6545h(interfaceC1436k2)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i21 |= i16;
                }
            }
            if ((i21 & 4793491) == 4793490) {
                if (i22 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i13 != 0) {
                    f12 = 0;
                } else {
                    f12 = f11;
                }
                if (i15 != 0) {
                    interfaceC1436k3 = C16212a.f50304Y;
                } else {
                    interfaceC1436k3 = interfaceC1436k2;
                }
                c6021p.m6524S(476268570);
                if ((29360128 & i21) == 8388608) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i17 = i21 & 896;
                if (i17 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z215 = z12 | z13;
                i18 = i21 & 7168;
                if (i18 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z216 = z215 | z14;
                i19 = i21 & 57344;
                if (i19 == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zM6545h5 = z216 | z15 | c6021p.m6545h(arrayList);
                if ((i21 & 458752) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z217 = zM6545h5 | z16;
                if ((3670016 & i21) == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z217 | z17;
                objM6514H = c6021p.m6514H();
                C5975S c5975s4 = C6013l.f19514a;
                if (z18) {
                    C16213b c16213b6 = new C16213b(interfaceC1436k3, 12.0d, arrayList, z11, f12, d10, d11);
                    c6021p.m6537c0(c16213b6);
                    objM6514H = c16213b6;
                } else {
                    C16213b c16213b7 = new C16213b(interfaceC1436k3, 12.0d, arrayList, z11, f12, d10, d11);
                    c6021p.m6537c0(c16213b7);
                    objM6514H = c16213b7;
                }
                InterfaceC1436k interfaceC1436k7 = (InterfaceC1436k) objM6514H;
                c6021p.m6553p(false);
                c6021p.m6524S(476308487);
                if (i17 == 256) {
                    i20 = 2048;
                    z19 = true;
                } else {
                    i20 = 2048;
                    z19 = false;
                }
                if (i18 == i20) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                boolean z218 = z20 | z19;
                if (i19 == 16384) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                zM6545h = z218 | z21 | c6021p.m6545h(arrayList);
                objM6514H2 = c6021p.m6514H();
                if (zM6545h) {
                    C16214c c16214c6 = new C16214c(d10, d11, 12.0d, arrayList);
                    c6021p.m6537c0(c16214c6);
                    objM6514H2 = c16214c6;
                } else {
                    C16214c c16214c7 = new C16214c(d10, d11, 12.0d, arrayList);
                    c6021p.m6537c0(c16214c7);
                    objM6514H2 = c16214c7;
                }
                c6021p.m6553p(false);
                AbstractC10869a.m11356b(interfaceC1436k7, interfaceC10459q, (InterfaceC1436k) objM6514H2, c6021p, i21 & 112, 0);
                d13 = 12.0d;
                z22 = z11;
                f13 = f12;
            } else {
                if (i22 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i13 != 0) {
                    f12 = 0;
                } else {
                    f12 = f11;
                }
                if (i15 != 0) {
                    interfaceC1436k3 = C16212a.f50304Y;
                } else {
                    interfaceC1436k3 = interfaceC1436k2;
                }
                c6021p.m6524S(476268570);
                if ((29360128 & i21) == 8388608) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i17 = i21 & 896;
                if (i17 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z219 = z12 | z13;
                i18 = i21 & 7168;
                if (i18 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z2110 = z219 | z14;
                i19 = i21 & 57344;
                if (i19 == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zM6545h6 = z2110 | z15 | c6021p.m6545h(arrayList);
                if ((i21 & 458752) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z2111 = zM6545h6 | z16;
                if ((3670016 & i21) == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z2111 | z17;
                objM6514H = c6021p.m6514H();
                C5975S c5975s5 = C6013l.f19514a;
                if (z18) {
                    C16213b c16213b8 = new C16213b(interfaceC1436k3, 12.0d, arrayList, z11, f12, d10, d11);
                    c6021p.m6537c0(c16213b8);
                    objM6514H = c16213b8;
                } else {
                    C16213b c16213b9 = new C16213b(interfaceC1436k3, 12.0d, arrayList, z11, f12, d10, d11);
                    c6021p.m6537c0(c16213b9);
                    objM6514H = c16213b9;
                }
                InterfaceC1436k interfaceC1436k8 = (InterfaceC1436k) objM6514H;
                c6021p.m6553p(false);
                c6021p.m6524S(476308487);
                if (i17 == 256) {
                    i20 = 2048;
                    z19 = true;
                } else {
                    i20 = 2048;
                    z19 = false;
                }
                if (i18 == i20) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                boolean z2112 = z20 | z19;
                if (i19 == 16384) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                zM6545h = z2112 | z21 | c6021p.m6545h(arrayList);
                objM6514H2 = c6021p.m6514H();
                if (zM6545h) {
                    C16214c c16214c8 = new C16214c(d10, d11, 12.0d, arrayList);
                    c6021p.m6537c0(c16214c8);
                    objM6514H2 = c16214c8;
                } else {
                    C16214c c16214c9 = new C16214c(d10, d11, 12.0d, arrayList);
                    c6021p.m6537c0(c16214c9);
                    objM6514H2 = c16214c9;
                }
                c6021p.m6553p(false);
                AbstractC10869a.m11356b(interfaceC1436k8, interfaceC10459q, (InterfaceC1436k) objM6514H2, c6021p, i21 & 112, 0);
                d13 = 12.0d;
                z22 = z11;
                f13 = f12;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C16215d(arrayList, interfaceC10459q, d10, d11, d13, z22, f13, interfaceC1436k3, i10, i11);
            }
        }
        i21 |= 1572864;
        f11 = f10;
        i15 = i11 & 128;
        if (i15 != 0) {
            i21 |= 12582912;
            interfaceC1436k2 = interfaceC1436k;
        } else {
            interfaceC1436k2 = interfaceC1436k;
            if ((i10 & 12582912) == 0) {
                if (c6021p.m6545h(interfaceC1436k2)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i21 |= i16;
            }
        }
        if ((i21 & 4793491) == 4793490) {
            if (i22 != 0) {
                z11 = true;
            } else {
                z11 = z10;
            }
            if (i13 != 0) {
                f12 = 0;
            } else {
                f12 = f11;
            }
            if (i15 != 0) {
                interfaceC1436k3 = C16212a.f50304Y;
            } else {
                interfaceC1436k3 = interfaceC1436k2;
            }
            c6021p.m6524S(476268570);
            if ((29360128 & i21) == 8388608) {
                z12 = true;
            } else {
                z12 = false;
            }
            i17 = i21 & 896;
            if (i17 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z2113 = z12 | z13;
            i18 = i21 & 7168;
            if (i18 == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z2114 = z2113 | z14;
            i19 = i21 & 57344;
            if (i19 == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean zM6545h7 = z2114 | z15 | c6021p.m6545h(arrayList);
            if ((i21 & 458752) == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z2115 = zM6545h7 | z16;
            if ((3670016 & i21) == 1048576) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z2115 | z17;
            objM6514H = c6021p.m6514H();
            C5975S c5975s6 = C6013l.f19514a;
            if (z18) {
                C16213b c16213b10 = new C16213b(interfaceC1436k3, 12.0d, arrayList, z11, f12, d10, d11);
                c6021p.m6537c0(c16213b10);
                objM6514H = c16213b10;
            } else {
                C16213b c16213b11 = new C16213b(interfaceC1436k3, 12.0d, arrayList, z11, f12, d10, d11);
                c6021p.m6537c0(c16213b11);
                objM6514H = c16213b11;
            }
            InterfaceC1436k interfaceC1436k9 = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(476308487);
            if (i17 == 256) {
                i20 = 2048;
                z19 = true;
            } else {
                i20 = 2048;
                z19 = false;
            }
            if (i18 == i20) {
                z20 = true;
            } else {
                z20 = false;
            }
            boolean z2116 = z20 | z19;
            if (i19 == 16384) {
                z21 = true;
            } else {
                z21 = false;
            }
            zM6545h = z2116 | z21 | c6021p.m6545h(arrayList);
            objM6514H2 = c6021p.m6514H();
            if (zM6545h) {
                C16214c c16214c10 = new C16214c(d10, d11, 12.0d, arrayList);
                c6021p.m6537c0(c16214c10);
                objM6514H2 = c16214c10;
            } else {
                C16214c c16214c11 = new C16214c(d10, d11, 12.0d, arrayList);
                c6021p.m6537c0(c16214c11);
                objM6514H2 = c16214c11;
            }
            c6021p.m6553p(false);
            AbstractC10869a.m11356b(interfaceC1436k9, interfaceC10459q, (InterfaceC1436k) objM6514H2, c6021p, i21 & 112, 0);
            d13 = 12.0d;
            z22 = z11;
            f13 = f12;
        } else {
            if (i22 != 0) {
                z11 = true;
            } else {
                z11 = z10;
            }
            if (i13 != 0) {
                f12 = 0;
            } else {
                f12 = f11;
            }
            if (i15 != 0) {
                interfaceC1436k3 = C16212a.f50304Y;
            } else {
                interfaceC1436k3 = interfaceC1436k2;
            }
            c6021p.m6524S(476268570);
            if ((29360128 & i21) == 8388608) {
                z12 = true;
            } else {
                z12 = false;
            }
            i17 = i21 & 896;
            if (i17 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z2117 = z12 | z13;
            i18 = i21 & 7168;
            if (i18 == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z2118 = z2117 | z14;
            i19 = i21 & 57344;
            if (i19 == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean zM6545h8 = z2118 | z15 | c6021p.m6545h(arrayList);
            if ((i21 & 458752) == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z2119 = zM6545h8 | z16;
            if ((3670016 & i21) == 1048576) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z2119 | z17;
            objM6514H = c6021p.m6514H();
            C5975S c5975s7 = C6013l.f19514a;
            if (z18) {
                C16213b c16213b12 = new C16213b(interfaceC1436k3, 12.0d, arrayList, z11, f12, d10, d11);
                c6021p.m6537c0(c16213b12);
                objM6514H = c16213b12;
            } else {
                C16213b c16213b13 = new C16213b(interfaceC1436k3, 12.0d, arrayList, z11, f12, d10, d11);
                c6021p.m6537c0(c16213b13);
                objM6514H = c16213b13;
            }
            InterfaceC1436k interfaceC1436k10 = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(476308487);
            if (i17 == 256) {
                i20 = 2048;
                z19 = true;
            } else {
                i20 = 2048;
                z19 = false;
            }
            if (i18 == i20) {
                z20 = true;
            } else {
                z20 = false;
            }
            boolean z21110 = z20 | z19;
            if (i19 == 16384) {
                z21 = true;
            } else {
                z21 = false;
            }
            zM6545h = z21110 | z21 | c6021p.m6545h(arrayList);
            objM6514H2 = c6021p.m6514H();
            if (zM6545h) {
                C16214c c16214c12 = new C16214c(d10, d11, 12.0d, arrayList);
                c6021p.m6537c0(c16214c12);
                objM6514H2 = c16214c12;
            } else {
                C16214c c16214c13 = new C16214c(d10, d11, 12.0d, arrayList);
                c6021p.m6537c0(c16214c13);
                objM6514H2 = c16214c13;
            }
            c6021p.m6553p(false);
            AbstractC10869a.m11356b(interfaceC1436k10, interfaceC10459q, (InterfaceC1436k) objM6514H2, c6021p, i21 & 112, 0);
            d13 = 12.0d;
            z22 = z11;
            f13 = f12;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C16215d(arrayList, interfaceC10459q, d10, d11, d13, z22, f13, interfaceC1436k3, i10, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static float m9204b(int i10) {
        int i11;
        if (C5573c.m5980a(i10, 2)) {
            i11 = 840;
        } else {
            i11 = C5573c.m5980a(i10, 1) ? 600 : 0;
        }
        return i11;
    }
}
