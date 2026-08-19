package p229J0;

import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.p650ui.graphics.AbstractC10864a;
import androidx.compose.p650ui.layout.AbstractC10868a;
import androidx.compose.p650ui.semantics.ClearAndSetSemanticsElement;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16557y;
import kotlin.jvm.internal.C16558z;
import p002A0.C0146w;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.C0155B1;
import p003A1.C0254h0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1095x1.InterfaceC21057K;
import p1139z0.C21585H;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p156G1.AbstractC2965l;
import p197Hj.C3457c;
import p204I1.C3582M;
import p228J.AbstractC3794B0;
import p278L0.AbstractC4846J;
import p302M0.AbstractC5240G;
import p302M0.AbstractC5242I;
import p302M0.AbstractC5243J;
import p349O0.C5975S;
import p349O0.C5994b0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6037x;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC6008i0;
import p492U1.C7540e;
import p492U1.C7550o;
import p492U1.InterfaceC7537b;
import p530Vi.AbstractC8301I;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p571X9.AbstractC9125E4;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9834X3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10451i;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.AbstractC13474L;
import p758g0.AbstractC13725A;
import p758g0.AbstractC13758e;
import p758g0.C13774m;
import p758g0.C13792v;
import p758g0.C13796x;
import p758g0.InterfaceC13772l;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p860l0.AbstractC16786v0;
import p860l0.InterfaceC16658A0;
import p911o0.AbstractC17780r;
import p911o0.C17755e0;
import p911o0.InterfaceC17716A0;
import p911o0.InterfaceC17760h;
import p911o0.InterfaceC17766k;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: J0.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3918H {

    /* JADX INFO: renamed from: a */
    public static final float f12039a;

    /* JADX INFO: renamed from: b */
    public static final float f12040b;

    /* JADX INFO: renamed from: c */
    public static final C13792v f12041c = new C13792v(0.8f, 0.0f, 0.8f, 0.15f);

    /* JADX INFO: renamed from: d */
    public static final float f12042d = 28;

    /* JADX INFO: renamed from: e */
    public static final float f12043e;

    /* JADX INFO: renamed from: f */
    public static final float f12044f;

    static {
        float f10 = 16;
        float f11 = f10 - 12;
        f12039a = f11;
        f12040b = f11;
        float f12 = 4;
        f12043e = f12;
        f12044f = f10 - f12;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00da  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:80:0x0128  */
    /* JADX WARN: Code duplicated, block: B:84:0x014b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0156  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m4619a(C8410b c8410b, InterfaceC10459q interfaceC10459q, InterfaceC1439n interfaceC1439n, InterfaceC1440o interfaceC1440o, float f10, InterfaceC17716A0 interfaceC17716A0, C3911F4 c3911f4, InterfaceC3923H4 interfaceC3923H4, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        int i13;
        InterfaceC1440o interfaceC1440o2;
        int i14;
        int i15;
        C3911F4 c3911f5;
        int i16;
        InterfaceC10459q interfaceC10459q3;
        InterfaceC1440o interfaceC1440o3;
        int i17;
        C3911F4 c3911f6;
        int i18;
        InterfaceC10459q interfaceC10459q4;
        int i19;
        InterfaceC1440o interfaceC1440o4;
        float f11;
        InterfaceC17716A0 interfaceC17716A1;
        InterfaceC3923H4 interfaceC3923H5;
        C3911F4 c3911f7;
        C3949M0 c3949m0;
        float f12;
        InterfaceC17716A0 interfaceC17716A2;
        C3911F4 c3911f8;
        InterfaceC3923H4 interfaceC3923H6;
        float f13;
        C6018n0 c6018n0M6555r;
        int i20;
        c6021p.m6526U(1952988048);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(c8410b) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 == 0) {
            if ((i10 & 48) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                if (c6021p.m6545h(interfaceC1439n)) {
                    i20 = 256;
                } else {
                    i20 = 128;
                }
                i12 |= i20;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    interfaceC1440o2 = interfaceC1440o;
                    if (c6021p.m6545h(interfaceC1440o2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i12 | 24576;
                if ((196608 & i10) == 0) {
                    i15 = 90112 | i12;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        c3911f5 = c3911f4;
                        int i22 = c6021p.m6542f(c3911f5) ? 1048576 : 524288;
                        i15 |= i22;
                    } else {
                        c3911f5 = c3911f4;
                    }
                    i15 |= i22;
                } else {
                    c3911f5 = c3911f4;
                }
                i16 = i15 | 12582912;
                if ((4793491 & i16) == 4793490 || !c6021p.m6562y()) {
                    c6021p.m6519N();
                    if ((i10 & 1) != 0 || c6021p.m6561x()) {
                        if (i21 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            interfaceC1440o3 = AbstractC3978S0.f12466b;
                        } else {
                            interfaceC1440o3 = interfaceC1440o2;
                        }
                        float f14 = AbstractC3917G4.f12036a;
                        C17755e0 c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                        i17 = i16 & (-458753);
                        if ((i11 & 64) != 0) {
                            c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                            c3911f6 = c3949m0.f12207U;
                            if (c3911f6 == null) {
                                int i23 = AbstractC5242I.f17023a;
                                c3911f6 = new C3911F4(AbstractC3959O0.m4661c(c3949m0, 35), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17025c), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17024b), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17023a), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17026d));
                                c3949m0.f12207U = c3911f6;
                            }
                            i18 = i16 & (-4128769);
                        } else {
                            c3911f6 = c3911f5;
                            i18 = i17;
                        }
                        interfaceC10459q4 = interfaceC10459q3;
                        i19 = i18;
                        interfaceC1440o4 = interfaceC1440o3;
                        f11 = f14;
                        interfaceC17716A1 = c17755e0M4617c;
                        interfaceC3923H5 = null;
                        c3911f7 = c3911f6;
                    } else {
                        c6021p.m6517L();
                        i19 = i16 & (-458753);
                        if ((i11 & 64) != 0) {
                            i19 = i16 & (-4128769);
                        }
                        f11 = f10;
                        interfaceC17716A1 = interfaceC17716A0;
                        interfaceC3923H5 = interfaceC3923H4;
                        c3911f7 = c3911f5;
                        interfaceC10459q4 = interfaceC10459q2;
                        interfaceC1440o4 = interfaceC1440o2;
                    }
                    c6021p.m6554q();
                    C3582M c3582mM4655a = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
                    if (!C7540e.m7873a(f11, Float.NaN) || C7540e.m7873a(f11, Float.POSITIVE_INFINITY)) {
                        f12 = AbstractC3917G4.f12036a;
                    } else {
                        f12 = f11;
                    }
                    int i24 = ((i19 >> 3) & 14) | 3072 | ((i19 << 3) & 112);
                    int i25 = i19 << 6;
                    m4621c(interfaceC10459q4, c8410b, c3582mM4655a, true, interfaceC1439n, interfaceC1440o4, f12, interfaceC17716A1, c3911f7, interfaceC3923H5, c6021p, i24 | (57344 & i25) | (458752 & i25) | (234881024 & i25) | (i25 & 1879048192));
                    interfaceC10459q2 = interfaceC10459q4;
                    interfaceC1440o2 = interfaceC1440o4;
                    interfaceC17716A2 = interfaceC17716A1;
                    c3911f8 = c3911f7;
                    interfaceC3923H6 = interfaceC3923H5;
                    f13 = f11;
                } else {
                    c6021p.m6517L();
                    f13 = f10;
                    interfaceC17716A2 = interfaceC17716A0;
                    interfaceC3923H6 = interfaceC3923H4;
                    c3911f8 = c3911f5;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C4107p(c8410b, interfaceC10459q2, interfaceC1439n, interfaceC1440o2, f13, interfaceC17716A2, c3911f8, interfaceC3923H6, i10, i11);
                }
            }
            i12 |= 3072;
            interfaceC1440o2 = interfaceC1440o;
            i15 = i12 | 24576;
            if ((196608 & i10) == 0) {
                i15 = 90112 | i12;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    c3911f5 = c3911f4;
                    if (c6021p.m6542f(c3911f5)) {
                    }
                    i15 |= i22;
                } else {
                    c3911f5 = c3911f4;
                }
                i15 |= i22;
            } else {
                c3911f5 = c3911f4;
            }
            i16 = i15 | 12582912;
            if ((4793491 & i16) == 4793490) {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        interfaceC1440o3 = AbstractC3978S0.f12466b;
                    } else {
                        interfaceC1440o3 = interfaceC1440o2;
                    }
                    float f15 = AbstractC3917G4.f12036a;
                    C17755e0 c17755e0M4617c2 = AbstractC3917G4.m4617c(c6021p);
                    i17 = i16 & (-458753);
                    if ((i11 & 64) != 0) {
                        c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                        c3911f6 = c3949m0.f12207U;
                        if (c3911f6 == null) {
                            int i26 = AbstractC5242I.f17023a;
                            c3911f6 = new C3911F4(AbstractC3959O0.m4661c(c3949m0, 35), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17025c), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17024b), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17023a), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17026d));
                            c3949m0.f12207U = c3911f6;
                        }
                        i18 = i16 & (-4128769);
                    } else {
                        c3911f6 = c3911f5;
                        i18 = i17;
                    }
                    interfaceC10459q4 = interfaceC10459q3;
                    i19 = i18;
                    interfaceC1440o4 = interfaceC1440o3;
                    f11 = f15;
                    interfaceC17716A1 = c17755e0M4617c2;
                    interfaceC3923H5 = null;
                    c3911f7 = c3911f6;
                } else {
                    if (i21 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        interfaceC1440o3 = AbstractC3978S0.f12466b;
                    } else {
                        interfaceC1440o3 = interfaceC1440o2;
                    }
                    float f16 = AbstractC3917G4.f12036a;
                    C17755e0 c17755e0M4617c3 = AbstractC3917G4.m4617c(c6021p);
                    i17 = i16 & (-458753);
                    if ((i11 & 64) != 0) {
                        c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                        c3911f6 = c3949m0.f12207U;
                        if (c3911f6 == null) {
                            int i27 = AbstractC5242I.f17023a;
                            c3911f6 = new C3911F4(AbstractC3959O0.m4661c(c3949m0, 35), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17025c), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17024b), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17023a), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17026d));
                            c3949m0.f12207U = c3911f6;
                        }
                        i18 = i16 & (-4128769);
                    } else {
                        c3911f6 = c3911f5;
                        i18 = i17;
                    }
                    interfaceC10459q4 = interfaceC10459q3;
                    i19 = i18;
                    interfaceC1440o4 = interfaceC1440o3;
                    f11 = f16;
                    interfaceC17716A1 = c17755e0M4617c3;
                    interfaceC3923H5 = null;
                    c3911f7 = c3911f6;
                }
                c6021p.m6554q();
                C3582M c3582mM4655a2 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
                if (C7540e.m7873a(f11, Float.NaN)) {
                    f12 = AbstractC3917G4.f12036a;
                } else {
                    f12 = AbstractC3917G4.f12036a;
                }
                int i28 = ((i19 >> 3) & 14) | 3072 | ((i19 << 3) & 112);
                int i29 = i19 << 6;
                m4621c(interfaceC10459q4, c8410b, c3582mM4655a2, true, interfaceC1439n, interfaceC1440o4, f12, interfaceC17716A1, c3911f7, interfaceC3923H5, c6021p, i28 | (57344 & i29) | (458752 & i29) | (234881024 & i29) | (i29 & 1879048192));
                interfaceC10459q2 = interfaceC10459q4;
                interfaceC1440o2 = interfaceC1440o4;
                interfaceC17716A2 = interfaceC17716A1;
                c3911f8 = c3911f7;
                interfaceC3923H6 = interfaceC3923H5;
                f13 = f11;
            } else {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        interfaceC1440o3 = AbstractC3978S0.f12466b;
                    } else {
                        interfaceC1440o3 = interfaceC1440o2;
                    }
                    float f17 = AbstractC3917G4.f12036a;
                    C17755e0 c17755e0M4617c4 = AbstractC3917G4.m4617c(c6021p);
                    i17 = i16 & (-458753);
                    if ((i11 & 64) != 0) {
                        c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                        c3911f6 = c3949m0.f12207U;
                        if (c3911f6 == null) {
                            int i210 = AbstractC5242I.f17023a;
                            c3911f6 = new C3911F4(AbstractC3959O0.m4661c(c3949m0, 35), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17025c), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17024b), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17023a), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17026d));
                            c3949m0.f12207U = c3911f6;
                        }
                        i18 = i16 & (-4128769);
                    } else {
                        c3911f6 = c3911f5;
                        i18 = i17;
                    }
                    interfaceC10459q4 = interfaceC10459q3;
                    i19 = i18;
                    interfaceC1440o4 = interfaceC1440o3;
                    f11 = f17;
                    interfaceC17716A1 = c17755e0M4617c4;
                    interfaceC3923H5 = null;
                    c3911f7 = c3911f6;
                } else {
                    if (i21 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        interfaceC1440o3 = AbstractC3978S0.f12466b;
                    } else {
                        interfaceC1440o3 = interfaceC1440o2;
                    }
                    float f18 = AbstractC3917G4.f12036a;
                    C17755e0 c17755e0M4617c5 = AbstractC3917G4.m4617c(c6021p);
                    i17 = i16 & (-458753);
                    if ((i11 & 64) != 0) {
                        c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                        c3911f6 = c3949m0.f12207U;
                        if (c3911f6 == null) {
                            int i211 = AbstractC5242I.f17023a;
                            c3911f6 = new C3911F4(AbstractC3959O0.m4661c(c3949m0, 35), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17025c), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17024b), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17023a), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17026d));
                            c3949m0.f12207U = c3911f6;
                        }
                        i18 = i16 & (-4128769);
                    } else {
                        c3911f6 = c3911f5;
                        i18 = i17;
                    }
                    interfaceC10459q4 = interfaceC10459q3;
                    i19 = i18;
                    interfaceC1440o4 = interfaceC1440o3;
                    f11 = f18;
                    interfaceC17716A1 = c17755e0M4617c5;
                    interfaceC3923H5 = null;
                    c3911f7 = c3911f6;
                }
                c6021p.m6554q();
                C3582M c3582mM4655a3 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
                if (C7540e.m7873a(f11, Float.NaN)) {
                    f12 = AbstractC3917G4.f12036a;
                } else {
                    f12 = AbstractC3917G4.f12036a;
                }
                int i212 = ((i19 >> 3) & 14) | 3072 | ((i19 << 3) & 112);
                int i213 = i19 << 6;
                m4621c(interfaceC10459q4, c8410b, c3582mM4655a3, true, interfaceC1439n, interfaceC1440o4, f12, interfaceC17716A1, c3911f7, interfaceC3923H5, c6021p, i212 | (57344 & i213) | (458752 & i213) | (234881024 & i213) | (i213 & 1879048192));
                interfaceC10459q2 = interfaceC10459q4;
                interfaceC1440o2 = interfaceC1440o4;
                interfaceC17716A2 = interfaceC17716A1;
                c3911f8 = c3911f7;
                interfaceC3923H6 = interfaceC3923H5;
                f13 = f11;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4107p(c8410b, interfaceC10459q2, interfaceC1439n, interfaceC1440o2, f13, interfaceC17716A2, c3911f8, interfaceC3923H6, i10, i11);
            }
        }
        i12 |= 48;
        interfaceC10459q2 = interfaceC10459q;
        if ((i10 & 384) == 0) {
            if (c6021p.m6545h(interfaceC1439n)) {
                i20 = 256;
            } else {
                i20 = 128;
            }
            i12 |= i20;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                interfaceC1440o2 = interfaceC1440o;
                if (c6021p.m6545h(interfaceC1440o2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i12 | 24576;
            if ((196608 & i10) == 0) {
                i15 = 90112 | i12;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    c3911f5 = c3911f4;
                    if (c6021p.m6542f(c3911f5)) {
                    }
                    i15 |= i22;
                } else {
                    c3911f5 = c3911f4;
                }
                i15 |= i22;
            } else {
                c3911f5 = c3911f4;
            }
            i16 = i15 | 12582912;
            if ((4793491 & i16) == 4793490) {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        interfaceC1440o3 = AbstractC3978S0.f12466b;
                    } else {
                        interfaceC1440o3 = interfaceC1440o2;
                    }
                    float f19 = AbstractC3917G4.f12036a;
                    C17755e0 c17755e0M4617c6 = AbstractC3917G4.m4617c(c6021p);
                    i17 = i16 & (-458753);
                    if ((i11 & 64) != 0) {
                        c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                        c3911f6 = c3949m0.f12207U;
                        if (c3911f6 == null) {
                            int i214 = AbstractC5242I.f17023a;
                            c3911f6 = new C3911F4(AbstractC3959O0.m4661c(c3949m0, 35), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17025c), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17024b), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17023a), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17026d));
                            c3949m0.f12207U = c3911f6;
                        }
                        i18 = i16 & (-4128769);
                    } else {
                        c3911f6 = c3911f5;
                        i18 = i17;
                    }
                    interfaceC10459q4 = interfaceC10459q3;
                    i19 = i18;
                    interfaceC1440o4 = interfaceC1440o3;
                    f11 = f19;
                    interfaceC17716A1 = c17755e0M4617c6;
                    interfaceC3923H5 = null;
                    c3911f7 = c3911f6;
                } else {
                    if (i21 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        interfaceC1440o3 = AbstractC3978S0.f12466b;
                    } else {
                        interfaceC1440o3 = interfaceC1440o2;
                    }
                    float f110 = AbstractC3917G4.f12036a;
                    C17755e0 c17755e0M4617c7 = AbstractC3917G4.m4617c(c6021p);
                    i17 = i16 & (-458753);
                    if ((i11 & 64) != 0) {
                        c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                        c3911f6 = c3949m0.f12207U;
                        if (c3911f6 == null) {
                            int i215 = AbstractC5242I.f17023a;
                            c3911f6 = new C3911F4(AbstractC3959O0.m4661c(c3949m0, 35), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17025c), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17024b), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17023a), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17026d));
                            c3949m0.f12207U = c3911f6;
                        }
                        i18 = i16 & (-4128769);
                    } else {
                        c3911f6 = c3911f5;
                        i18 = i17;
                    }
                    interfaceC10459q4 = interfaceC10459q3;
                    i19 = i18;
                    interfaceC1440o4 = interfaceC1440o3;
                    f11 = f110;
                    interfaceC17716A1 = c17755e0M4617c7;
                    interfaceC3923H5 = null;
                    c3911f7 = c3911f6;
                }
                c6021p.m6554q();
                C3582M c3582mM4655a4 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
                if (C7540e.m7873a(f11, Float.NaN)) {
                    f12 = AbstractC3917G4.f12036a;
                } else {
                    f12 = AbstractC3917G4.f12036a;
                }
                int i216 = ((i19 >> 3) & 14) | 3072 | ((i19 << 3) & 112);
                int i217 = i19 << 6;
                m4621c(interfaceC10459q4, c8410b, c3582mM4655a4, true, interfaceC1439n, interfaceC1440o4, f12, interfaceC17716A1, c3911f7, interfaceC3923H5, c6021p, i216 | (57344 & i217) | (458752 & i217) | (234881024 & i217) | (i217 & 1879048192));
                interfaceC10459q2 = interfaceC10459q4;
                interfaceC1440o2 = interfaceC1440o4;
                interfaceC17716A2 = interfaceC17716A1;
                c3911f8 = c3911f7;
                interfaceC3923H6 = interfaceC3923H5;
                f13 = f11;
            } else {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        interfaceC1440o3 = AbstractC3978S0.f12466b;
                    } else {
                        interfaceC1440o3 = interfaceC1440o2;
                    }
                    float f111 = AbstractC3917G4.f12036a;
                    C17755e0 c17755e0M4617c8 = AbstractC3917G4.m4617c(c6021p);
                    i17 = i16 & (-458753);
                    if ((i11 & 64) != 0) {
                        c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                        c3911f6 = c3949m0.f12207U;
                        if (c3911f6 == null) {
                            int i218 = AbstractC5242I.f17023a;
                            c3911f6 = new C3911F4(AbstractC3959O0.m4661c(c3949m0, 35), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17025c), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17024b), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17023a), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17026d));
                            c3949m0.f12207U = c3911f6;
                        }
                        i18 = i16 & (-4128769);
                    } else {
                        c3911f6 = c3911f5;
                        i18 = i17;
                    }
                    interfaceC10459q4 = interfaceC10459q3;
                    i19 = i18;
                    interfaceC1440o4 = interfaceC1440o3;
                    f11 = f111;
                    interfaceC17716A1 = c17755e0M4617c8;
                    interfaceC3923H5 = null;
                    c3911f7 = c3911f6;
                } else {
                    if (i21 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        interfaceC1440o3 = AbstractC3978S0.f12466b;
                    } else {
                        interfaceC1440o3 = interfaceC1440o2;
                    }
                    float f112 = AbstractC3917G4.f12036a;
                    C17755e0 c17755e0M4617c9 = AbstractC3917G4.m4617c(c6021p);
                    i17 = i16 & (-458753);
                    if ((i11 & 64) != 0) {
                        c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                        c3911f6 = c3949m0.f12207U;
                        if (c3911f6 == null) {
                            int i219 = AbstractC5242I.f17023a;
                            c3911f6 = new C3911F4(AbstractC3959O0.m4661c(c3949m0, 35), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17025c), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17024b), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17023a), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17026d));
                            c3949m0.f12207U = c3911f6;
                        }
                        i18 = i16 & (-4128769);
                    } else {
                        c3911f6 = c3911f5;
                        i18 = i17;
                    }
                    interfaceC10459q4 = interfaceC10459q3;
                    i19 = i18;
                    interfaceC1440o4 = interfaceC1440o3;
                    f11 = f112;
                    interfaceC17716A1 = c17755e0M4617c9;
                    interfaceC3923H5 = null;
                    c3911f7 = c3911f6;
                }
                c6021p.m6554q();
                C3582M c3582mM4655a5 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
                if (C7540e.m7873a(f11, Float.NaN)) {
                    f12 = AbstractC3917G4.f12036a;
                } else {
                    f12 = AbstractC3917G4.f12036a;
                }
                int i2110 = ((i19 >> 3) & 14) | 3072 | ((i19 << 3) & 112);
                int i2111 = i19 << 6;
                m4621c(interfaceC10459q4, c8410b, c3582mM4655a5, true, interfaceC1439n, interfaceC1440o4, f12, interfaceC17716A1, c3911f7, interfaceC3923H5, c6021p, i2110 | (57344 & i2111) | (458752 & i2111) | (234881024 & i2111) | (i2111 & 1879048192));
                interfaceC10459q2 = interfaceC10459q4;
                interfaceC1440o2 = interfaceC1440o4;
                interfaceC17716A2 = interfaceC17716A1;
                c3911f8 = c3911f7;
                interfaceC3923H6 = interfaceC3923H5;
                f13 = f11;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4107p(c8410b, interfaceC10459q2, interfaceC1439n, interfaceC1440o2, f13, interfaceC17716A2, c3911f8, interfaceC3923H6, i10, i11);
            }
        }
        i12 |= 3072;
        interfaceC1440o2 = interfaceC1440o;
        i15 = i12 | 24576;
        if ((196608 & i10) == 0) {
            i15 = 90112 | i12;
        }
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                c3911f5 = c3911f4;
                if (c6021p.m6542f(c3911f5)) {
                }
                i15 |= i22;
            } else {
                c3911f5 = c3911f4;
            }
            i15 |= i22;
        } else {
            c3911f5 = c3911f4;
        }
        i16 = i15 | 12582912;
        if ((4793491 & i16) == 4793490) {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    interfaceC1440o3 = AbstractC3978S0.f12466b;
                } else {
                    interfaceC1440o3 = interfaceC1440o2;
                }
                float f113 = AbstractC3917G4.f12036a;
                C17755e0 c17755e0M4617c10 = AbstractC3917G4.m4617c(c6021p);
                i17 = i16 & (-458753);
                if ((i11 & 64) != 0) {
                    c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                    c3911f6 = c3949m0.f12207U;
                    if (c3911f6 == null) {
                        int i2112 = AbstractC5242I.f17023a;
                        c3911f6 = new C3911F4(AbstractC3959O0.m4661c(c3949m0, 35), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17025c), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17024b), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17023a), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17026d));
                        c3949m0.f12207U = c3911f6;
                    }
                    i18 = i16 & (-4128769);
                } else {
                    c3911f6 = c3911f5;
                    i18 = i17;
                }
                interfaceC10459q4 = interfaceC10459q3;
                i19 = i18;
                interfaceC1440o4 = interfaceC1440o3;
                f11 = f113;
                interfaceC17716A1 = c17755e0M4617c10;
                interfaceC3923H5 = null;
                c3911f7 = c3911f6;
            } else {
                if (i21 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    interfaceC1440o3 = AbstractC3978S0.f12466b;
                } else {
                    interfaceC1440o3 = interfaceC1440o2;
                }
                float f114 = AbstractC3917G4.f12036a;
                C17755e0 c17755e0M4617c11 = AbstractC3917G4.m4617c(c6021p);
                i17 = i16 & (-458753);
                if ((i11 & 64) != 0) {
                    c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                    c3911f6 = c3949m0.f12207U;
                    if (c3911f6 == null) {
                        int i2113 = AbstractC5242I.f17023a;
                        c3911f6 = new C3911F4(AbstractC3959O0.m4661c(c3949m0, 35), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17025c), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17024b), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17023a), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17026d));
                        c3949m0.f12207U = c3911f6;
                    }
                    i18 = i16 & (-4128769);
                } else {
                    c3911f6 = c3911f5;
                    i18 = i17;
                }
                interfaceC10459q4 = interfaceC10459q3;
                i19 = i18;
                interfaceC1440o4 = interfaceC1440o3;
                f11 = f114;
                interfaceC17716A1 = c17755e0M4617c11;
                interfaceC3923H5 = null;
                c3911f7 = c3911f6;
            }
            c6021p.m6554q();
            C3582M c3582mM4655a6 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
            if (C7540e.m7873a(f11, Float.NaN)) {
                f12 = AbstractC3917G4.f12036a;
            } else {
                f12 = AbstractC3917G4.f12036a;
            }
            int i2114 = ((i19 >> 3) & 14) | 3072 | ((i19 << 3) & 112);
            int i2115 = i19 << 6;
            m4621c(interfaceC10459q4, c8410b, c3582mM4655a6, true, interfaceC1439n, interfaceC1440o4, f12, interfaceC17716A1, c3911f7, interfaceC3923H5, c6021p, i2114 | (57344 & i2115) | (458752 & i2115) | (234881024 & i2115) | (i2115 & 1879048192));
            interfaceC10459q2 = interfaceC10459q4;
            interfaceC1440o2 = interfaceC1440o4;
            interfaceC17716A2 = interfaceC17716A1;
            c3911f8 = c3911f7;
            interfaceC3923H6 = interfaceC3923H5;
            f13 = f11;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    interfaceC1440o3 = AbstractC3978S0.f12466b;
                } else {
                    interfaceC1440o3 = interfaceC1440o2;
                }
                float f115 = AbstractC3917G4.f12036a;
                C17755e0 c17755e0M4617c12 = AbstractC3917G4.m4617c(c6021p);
                i17 = i16 & (-458753);
                if ((i11 & 64) != 0) {
                    c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                    c3911f6 = c3949m0.f12207U;
                    if (c3911f6 == null) {
                        int i2116 = AbstractC5242I.f17023a;
                        c3911f6 = new C3911F4(AbstractC3959O0.m4661c(c3949m0, 35), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17025c), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17024b), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17023a), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17026d));
                        c3949m0.f12207U = c3911f6;
                    }
                    i18 = i16 & (-4128769);
                } else {
                    c3911f6 = c3911f5;
                    i18 = i17;
                }
                interfaceC10459q4 = interfaceC10459q3;
                i19 = i18;
                interfaceC1440o4 = interfaceC1440o3;
                f11 = f115;
                interfaceC17716A1 = c17755e0M4617c12;
                interfaceC3923H5 = null;
                c3911f7 = c3911f6;
            } else {
                if (i21 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    interfaceC1440o3 = AbstractC3978S0.f12466b;
                } else {
                    interfaceC1440o3 = interfaceC1440o2;
                }
                float f116 = AbstractC3917G4.f12036a;
                C17755e0 c17755e0M4617c13 = AbstractC3917G4.m4617c(c6021p);
                i17 = i16 & (-458753);
                if ((i11 & 64) != 0) {
                    c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                    c3911f6 = c3949m0.f12207U;
                    if (c3911f6 == null) {
                        int i2117 = AbstractC5242I.f17023a;
                        c3911f6 = new C3911F4(AbstractC3959O0.m4661c(c3949m0, 35), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17025c), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17024b), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17023a), AbstractC3959O0.m4661c(c3949m0, AbstractC5242I.f17026d));
                        c3949m0.f12207U = c3911f6;
                    }
                    i18 = i16 & (-4128769);
                } else {
                    c3911f6 = c3911f5;
                    i18 = i17;
                }
                interfaceC10459q4 = interfaceC10459q3;
                i19 = i18;
                interfaceC1440o4 = interfaceC1440o3;
                f11 = f116;
                interfaceC17716A1 = c17755e0M4617c13;
                interfaceC3923H5 = null;
                c3911f7 = c3911f6;
            }
            c6021p.m6554q();
            C3582M c3582mM4655a7 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
            if (C7540e.m7873a(f11, Float.NaN)) {
                f12 = AbstractC3917G4.f12036a;
            } else {
                f12 = AbstractC3917G4.f12036a;
            }
            int i2118 = ((i19 >> 3) & 14) | 3072 | ((i19 << 3) & 112);
            int i2119 = i19 << 6;
            m4621c(interfaceC10459q4, c8410b, c3582mM4655a7, true, interfaceC1439n, interfaceC1440o4, f12, interfaceC17716A1, c3911f7, interfaceC3923H5, c6021p, i2118 | (57344 & i2119) | (458752 & i2119) | (234881024 & i2119) | (i2119 & 1879048192));
            interfaceC10459q2 = interfaceC10459q4;
            interfaceC1440o2 = interfaceC1440o4;
            interfaceC17716A2 = interfaceC17716A1;
            c3911f8 = c3911f7;
            interfaceC3923H6 = interfaceC3923H5;
            f13 = f11;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4107p(c8410b, interfaceC10459q2, interfaceC1439n, interfaceC1440o2, f13, interfaceC17716A2, c3911f8, interfaceC3923H6, i10, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:63:0x0120  */
    /* JADX WARN: Code duplicated, block: B:67:0x0129  */
    /* JADX WARN: Code duplicated, block: B:70:0x0132  */
    /* JADX WARN: Code duplicated, block: B:74:0x013c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0194  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m4620b(C8410b c8410b, InterfaceC10459q interfaceC10459q, InterfaceC1439n interfaceC1439n, InterfaceC1440o interfaceC1440o, float f10, float f11, InterfaceC17716A0 interfaceC17716A0, C3911F4 c3911f4, InterfaceC3923H4 interfaceC3923H4, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC1440o interfaceC1440o2;
        int i13;
        InterfaceC1440o interfaceC1440o3;
        C3949M0 c3949m0;
        C3911F4 c3911f5;
        InterfaceC10459q interfaceC10459q2;
        InterfaceC1440o interfaceC1440o4;
        float f12;
        int i14;
        float f13;
        InterfaceC17716A0 interfaceC17716A1;
        C3911F4 c3911f6;
        float f14;
        float f15;
        InterfaceC10459q interfaceC10459q3;
        InterfaceC1440o interfaceC1440o5;
        InterfaceC17716A0 interfaceC17716A2;
        C3911F4 c3911f7;
        float f16;
        float f17;
        C6018n0 c6018n0M6555r;
        int i15;
        c6021p.m6526U(-630005584);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(c8410b) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i12 | 48;
        if ((i10 & 384) == 0) {
            i16 |= c6021p.m6545h(interfaceC1439n) ? 256 : 128;
        }
        int i17 = i11 & 8;
        if (i17 == 0) {
            if ((i10 & 3072) == 0) {
                interfaceC1440o2 = interfaceC1440o;
                i16 |= c6021p.m6545h(interfaceC1440o2) ? 2048 : 1024;
            }
            i13 = 221184 | i16;
            if ((1572864 & i10) == 0) {
                i13 = 745472 | i16;
            }
            if ((12582912 & i10) == 0) {
                i13 |= 4194304;
            }
            if ((100663296 & i10) == 0) {
                if (c6021p.m6542f(interfaceC3923H4)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i13 |= i15;
            }
            if ((38347923 & i13) == 38347922 || !c6021p.m6562y()) {
                c6021p.m6519N();
                if ((i10 & 1) != 0 || c6021p.m6561x()) {
                    C10456n c10456n = C10456n.f30959Y;
                    if (i17 != 0) {
                        interfaceC1440o3 = AbstractC3978S0.f12467c;
                    } else {
                        interfaceC1440o3 = interfaceC1440o2;
                    }
                    float f18 = AbstractC3917G4.f12037b;
                    float f19 = AbstractC3917G4.f12038c;
                    C17755e0 c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                    c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                    c3911f5 = c3949m0.f12208V;
                    if (c3911f5 == null) {
                        float f20 = AbstractC5240G.f17017a;
                        c3911f5 = new C3911F4(AbstractC3959O0.m4661c(c3949m0, 35), AbstractC3959O0.m4661c(c3949m0, AbstractC5243J.f17031e), AbstractC3959O0.m4661c(c3949m0, AbstractC5240G.f17020d), AbstractC3959O0.m4661c(c3949m0, AbstractC5240G.f17018b), AbstractC3959O0.m4661c(c3949m0, AbstractC5240G.f17021e));
                        c3949m0.f12208V = c3911f5;
                    }
                    interfaceC10459q2 = c10456n;
                    interfaceC1440o4 = interfaceC1440o3;
                    f12 = f18;
                    i14 = i13 & (-33030145);
                    f13 = f19;
                    interfaceC17716A1 = c17755e0M4617c;
                    c3911f6 = c3911f5;
                } else {
                    c6021p.m6517L();
                    i14 = i13 & (-33030145);
                    interfaceC10459q2 = interfaceC10459q;
                    f12 = f10;
                    f13 = f11;
                    interfaceC17716A1 = interfaceC17716A0;
                    c3911f6 = c3911f4;
                    interfaceC1440o4 = interfaceC1440o2;
                }
                c6021p.m6554q();
                C3582M c3582mM4655a = AbstractC3947L4.m4655a(AbstractC5240G.f17019c, c6021p);
                C3582M c3582mM4655a2 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
                if (!C7540e.m7873a(f12, Float.NaN) || C7540e.m7873a(f12, Float.POSITIVE_INFINITY)) {
                    f14 = AbstractC3917G4.f12037b;
                } else {
                    f14 = f12;
                }
                if (!C7540e.m7873a(f13, Float.NaN) || C7540e.m7873a(f13, Float.POSITIVE_INFINITY)) {
                    f15 = AbstractC3917G4.f12038c;
                } else {
                    f15 = f13;
                }
                int i18 = i14 << 12;
                float f21 = f13;
                float f22 = f15;
                m4623e(interfaceC10459q2, c8410b, c3582mM4655a, f12042d, c8410b, c3582mM4655a2, interfaceC1439n, interfaceC1440o4, f14, f22, interfaceC17716A1, c3911f6, interfaceC3923H4, c6021p, ((i14 >> 3) & 14) | 3072 | ((i14 << 3) & 112) | (57344 & i18) | (3670016 & i18) | (i18 & 29360128), (i14 >> 18) & 1022);
                interfaceC10459q3 = interfaceC10459q2;
                interfaceC1440o5 = interfaceC1440o4;
                interfaceC17716A2 = interfaceC17716A1;
                c3911f7 = c3911f6;
                f16 = f12;
                f17 = f21;
            } else {
                c6021p.m6517L();
                f16 = f10;
                f17 = f11;
                interfaceC17716A2 = interfaceC17716A0;
                c3911f7 = c3911f4;
                interfaceC1440o5 = interfaceC1440o2;
                interfaceC10459q3 = interfaceC10459q;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4113q(c8410b, interfaceC10459q3, interfaceC1439n, interfaceC1440o5, f16, f17, interfaceC17716A2, c3911f7, interfaceC3923H4, i10, i11);
            }
        }
        i16 |= 3072;
        interfaceC1440o2 = interfaceC1440o;
        i13 = 221184 | i16;
        if ((1572864 & i10) == 0) {
            i13 = 745472 | i16;
        }
        if ((12582912 & i10) == 0) {
            i13 |= 4194304;
        }
        if ((100663296 & i10) == 0) {
            if (c6021p.m6542f(interfaceC3923H4)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i13 |= i15;
        }
        if ((38347923 & i13) == 38347922) {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                C10456n c10456n2 = C10456n.f30959Y;
                if (i17 != 0) {
                    interfaceC1440o3 = AbstractC3978S0.f12467c;
                } else {
                    interfaceC1440o3 = interfaceC1440o2;
                }
                float f110 = AbstractC3917G4.f12037b;
                float f111 = AbstractC3917G4.f12038c;
                C17755e0 c17755e0M4617c2 = AbstractC3917G4.m4617c(c6021p);
                c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                c3911f5 = c3949m0.f12208V;
                if (c3911f5 == null) {
                    float f23 = AbstractC5240G.f17017a;
                    c3911f5 = new C3911F4(AbstractC3959O0.m4661c(c3949m0, 35), AbstractC3959O0.m4661c(c3949m0, AbstractC5243J.f17031e), AbstractC3959O0.m4661c(c3949m0, AbstractC5240G.f17020d), AbstractC3959O0.m4661c(c3949m0, AbstractC5240G.f17018b), AbstractC3959O0.m4661c(c3949m0, AbstractC5240G.f17021e));
                    c3949m0.f12208V = c3911f5;
                }
                interfaceC10459q2 = c10456n2;
                interfaceC1440o4 = interfaceC1440o3;
                f12 = f110;
                i14 = i13 & (-33030145);
                f13 = f111;
                interfaceC17716A1 = c17755e0M4617c2;
                c3911f6 = c3911f5;
            } else {
                C10456n c10456n3 = C10456n.f30959Y;
                if (i17 != 0) {
                    interfaceC1440o3 = AbstractC3978S0.f12467c;
                } else {
                    interfaceC1440o3 = interfaceC1440o2;
                }
                float f112 = AbstractC3917G4.f12037b;
                float f113 = AbstractC3917G4.f12038c;
                C17755e0 c17755e0M4617c3 = AbstractC3917G4.m4617c(c6021p);
                c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                c3911f5 = c3949m0.f12208V;
                if (c3911f5 == null) {
                    float f24 = AbstractC5240G.f17017a;
                    c3911f5 = new C3911F4(AbstractC3959O0.m4661c(c3949m0, 35), AbstractC3959O0.m4661c(c3949m0, AbstractC5243J.f17031e), AbstractC3959O0.m4661c(c3949m0, AbstractC5240G.f17020d), AbstractC3959O0.m4661c(c3949m0, AbstractC5240G.f17018b), AbstractC3959O0.m4661c(c3949m0, AbstractC5240G.f17021e));
                    c3949m0.f12208V = c3911f5;
                }
                interfaceC10459q2 = c10456n3;
                interfaceC1440o4 = interfaceC1440o3;
                f12 = f112;
                i14 = i13 & (-33030145);
                f13 = f113;
                interfaceC17716A1 = c17755e0M4617c3;
                c3911f6 = c3911f5;
            }
            c6021p.m6554q();
            C3582M c3582mM4655a3 = AbstractC3947L4.m4655a(AbstractC5240G.f17019c, c6021p);
            C3582M c3582mM4655a4 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
            if (C7540e.m7873a(f12, Float.NaN)) {
                f14 = AbstractC3917G4.f12037b;
            } else {
                f14 = AbstractC3917G4.f12037b;
            }
            if (C7540e.m7873a(f13, Float.NaN)) {
                f15 = AbstractC3917G4.f12038c;
            } else {
                f15 = AbstractC3917G4.f12038c;
            }
            int i19 = i14 << 12;
            float f25 = f13;
            float f26 = f15;
            m4623e(interfaceC10459q2, c8410b, c3582mM4655a3, f12042d, c8410b, c3582mM4655a4, interfaceC1439n, interfaceC1440o4, f14, f26, interfaceC17716A1, c3911f6, interfaceC3923H4, c6021p, ((i14 >> 3) & 14) | 3072 | ((i14 << 3) & 112) | (57344 & i19) | (3670016 & i19) | (i19 & 29360128), (i14 >> 18) & 1022);
            interfaceC10459q3 = interfaceC10459q2;
            interfaceC1440o5 = interfaceC1440o4;
            interfaceC17716A2 = interfaceC17716A1;
            c3911f7 = c3911f6;
            f16 = f12;
            f17 = f25;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                C10456n c10456n4 = C10456n.f30959Y;
                if (i17 != 0) {
                    interfaceC1440o3 = AbstractC3978S0.f12467c;
                } else {
                    interfaceC1440o3 = interfaceC1440o2;
                }
                float f114 = AbstractC3917G4.f12037b;
                float f115 = AbstractC3917G4.f12038c;
                C17755e0 c17755e0M4617c4 = AbstractC3917G4.m4617c(c6021p);
                c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                c3911f5 = c3949m0.f12208V;
                if (c3911f5 == null) {
                    float f27 = AbstractC5240G.f17017a;
                    c3911f5 = new C3911F4(AbstractC3959O0.m4661c(c3949m0, 35), AbstractC3959O0.m4661c(c3949m0, AbstractC5243J.f17031e), AbstractC3959O0.m4661c(c3949m0, AbstractC5240G.f17020d), AbstractC3959O0.m4661c(c3949m0, AbstractC5240G.f17018b), AbstractC3959O0.m4661c(c3949m0, AbstractC5240G.f17021e));
                    c3949m0.f12208V = c3911f5;
                }
                interfaceC10459q2 = c10456n4;
                interfaceC1440o4 = interfaceC1440o3;
                f12 = f114;
                i14 = i13 & (-33030145);
                f13 = f115;
                interfaceC17716A1 = c17755e0M4617c4;
                c3911f6 = c3911f5;
            } else {
                C10456n c10456n5 = C10456n.f30959Y;
                if (i17 != 0) {
                    interfaceC1440o3 = AbstractC3978S0.f12467c;
                } else {
                    interfaceC1440o3 = interfaceC1440o2;
                }
                float f116 = AbstractC3917G4.f12037b;
                float f117 = AbstractC3917G4.f12038c;
                C17755e0 c17755e0M4617c5 = AbstractC3917G4.m4617c(c6021p);
                c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                c3911f5 = c3949m0.f12208V;
                if (c3911f5 == null) {
                    float f28 = AbstractC5240G.f17017a;
                    c3911f5 = new C3911F4(AbstractC3959O0.m4661c(c3949m0, 35), AbstractC3959O0.m4661c(c3949m0, AbstractC5243J.f17031e), AbstractC3959O0.m4661c(c3949m0, AbstractC5240G.f17020d), AbstractC3959O0.m4661c(c3949m0, AbstractC5240G.f17018b), AbstractC3959O0.m4661c(c3949m0, AbstractC5240G.f17021e));
                    c3949m0.f12208V = c3911f5;
                }
                interfaceC10459q2 = c10456n5;
                interfaceC1440o4 = interfaceC1440o3;
                f12 = f116;
                i14 = i13 & (-33030145);
                f13 = f117;
                interfaceC17716A1 = c17755e0M4617c5;
                c3911f6 = c3911f5;
            }
            c6021p.m6554q();
            C3582M c3582mM4655a5 = AbstractC3947L4.m4655a(AbstractC5240G.f17019c, c6021p);
            C3582M c3582mM4655a6 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
            if (C7540e.m7873a(f12, Float.NaN)) {
                f14 = AbstractC3917G4.f12037b;
            } else {
                f14 = AbstractC3917G4.f12037b;
            }
            if (C7540e.m7873a(f13, Float.NaN)) {
                f15 = AbstractC3917G4.f12038c;
            } else {
                f15 = AbstractC3917G4.f12038c;
            }
            int i110 = i14 << 12;
            float f29 = f13;
            float f210 = f15;
            m4623e(interfaceC10459q2, c8410b, c3582mM4655a5, f12042d, c8410b, c3582mM4655a6, interfaceC1439n, interfaceC1440o4, f14, f210, interfaceC17716A1, c3911f6, interfaceC3923H4, c6021p, ((i14 >> 3) & 14) | 3072 | ((i14 << 3) & 112) | (57344 & i110) | (3670016 & i110) | (i110 & 29360128), (i14 >> 18) & 1022);
            interfaceC10459q3 = interfaceC10459q2;
            interfaceC1440o5 = interfaceC1440o4;
            interfaceC17716A2 = interfaceC17716A1;
            c3911f7 = c3911f6;
            f16 = f12;
            f17 = f29;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4113q(c8410b, interfaceC10459q3, interfaceC1439n, interfaceC1440o5, f16, f17, interfaceC17716A2, c3911f7, interfaceC3923H4, i10, i11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m4621c(InterfaceC10459q interfaceC10459q, InterfaceC1439n interfaceC1439n, C3582M c3582m, boolean z6, InterfaceC1439n interfaceC1439n2, InterfaceC1440o interfaceC1440o, float f10, InterfaceC17716A0 interfaceC17716A0, C3911F4 c3911f4, InterfaceC3923H4 interfaceC3923H4, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q draggableElement;
        c6021p.m6526U(-342194911);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1439n) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(c3582m) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6544g(z6) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(interfaceC1439n2) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6545h(interfaceC1440o) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6536c(f10) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c6021p.m6542f(interfaceC17716A0) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c6021p.m6542f(c3911f4) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i11 |= c6021p.m6542f(interfaceC3923H4) ? 536870912 : 268435456;
        }
        if ((306783379 & i11) == 306783378 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (Float.isNaN(f10) || f10 == Float.POSITIVE_INFINITY) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            float fM8915f = AbstractC8301I.m8915f(((InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f)).mo7864b0(f10), 0.0f);
            int i12 = i11 & 1879048192;
            boolean zM6536c = (i12 == 536870912) | c6021p.m6536c(fM8915f);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (zM6536c || objM6514H == c5975s) {
                objM6514H = new C4119r(interfaceC3923H4, fM8915f);
                c6021p.m6537c0(objM6514H);
            }
            C5997d.m6454j((InterfaceC1426a) objM6514H, c6021p);
            boolean z10 = i12 == 536870912;
            Object objM6514H2 = c6021p.m6514H();
            if (z10 || objM6514H2 == c5975s) {
                objM6514H2 = C5997d.m6421H(new C3457c(interfaceC3923H4, 5));
                c6021p.m6537c0(objM6514H2);
            }
            float fFloatValue = ((Number) ((InterfaceC5982V0) objM6514H2).getValue()).floatValue();
            c3911f4.getClass();
            InterfaceC5982V0 interfaceC5982V0M14999a = AbstractC13474L.m14999a(AbstractC14334L.m15646x(AbstractC13725A.f43290c.mo9579a(fFloatValue), c3911f4.f11995a, c3911f4.f11996b), AbstractC13758e.m15254s(0.0f, 400.0f, null, 5), null, c6021p, 48, 12);
            C8410b c8410bM8969c = AbstractC8411c.m8969c(1370231018, c6021p, new C4143v(interfaceC1440o, 0));
            c6021p.m6524S(-1193605157);
            if (interfaceC3923H4 == null || interfaceC3923H4.mo3549f()) {
                draggableElement = C10456n.f30959Y;
            } else {
                boolean z11 = i12 == 536870912;
                Object objM6514H3 = c6021p.m6514H();
                if (z11 || objM6514H3 == c5975s) {
                    objM6514H3 = new C4149w(interfaceC3923H4, 0);
                    c6021p.m6537c0(objM6514H3);
                }
                InterfaceC16658A0 interfaceC16658A0M18555b = AbstractC16786v0.m18555b((InterfaceC1436k) objM6514H3, c6021p);
                boolean z12 = i12 == 536870912;
                Object objM6514H4 = c6021p.m6514H();
                if (z12 || objM6514H4 == c5975s) {
                    objM6514H4 = new C4155x(interfaceC3923H4, null, 0);
                    c6021p.m6537c0(objM6514H4);
                }
                draggableElement = new DraggableElement(interfaceC16658A0M18555b, true, null, false, AbstractC16786v0.f53881a, (InterfaceC1440o) objM6514H4, false);
            }
            c6021p.m6553p(false);
            AbstractC4034c4.m4725a(interfaceC10459q.mo428M(draggableElement), null, ((C14365u) interfaceC5982V0M14999a.getValue()).f45062a, 0L, 0.0f, 0.0f, null, AbstractC8411c.m8969c(-1943739546, c6021p, new C4131t(interfaceC17716A0, f10, interfaceC3923H4, c3911f4, interfaceC1439n, c3582m, z6, interfaceC1439n2, c8410bM8969c)), c6021p, 12582912, 122);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4137u(interfaceC10459q, interfaceC1439n, c3582m, z6, interfaceC1439n2, interfaceC1440o, f10, interfaceC17716A0, c3911f4, interfaceC3923H4, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0199  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:88:0x0107  */
    /* JADX WARN: Code duplicated, block: B:89:0x0115  */
    /* JADX WARN: Code duplicated, block: B:91:0x0118  */
    /* JADX WARN: Code duplicated, block: B:92:0x0126  */
    /* JADX WARN: Code duplicated, block: B:95:0x0142  */
    /* JADX WARN: Code duplicated, block: B:99:0x014d  */
    /* JADX INFO: renamed from: d */
    public static final void m4622d(InterfaceC1439n interfaceC1439n, InterfaceC10459q interfaceC10459q, InterfaceC1439n interfaceC1439n2, InterfaceC1440o interfaceC1440o, float f10, InterfaceC17716A0 interfaceC17716A0, C3911F4 c3911f4, InterfaceC3923H4 interfaceC3923H4, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        int i13;
        InterfaceC1440o interfaceC1440o2;
        int i14;
        int i15;
        C3911F4 c3911f4M4616b;
        int i16;
        InterfaceC3923H4 interfaceC3923H5;
        int i17;
        InterfaceC10459q interfaceC10459q3;
        InterfaceC1440o interfaceC1440o3;
        float f11;
        C17755e0 c17755e0M4617c;
        int i18;
        int i19;
        C3911F4 c3911f5;
        InterfaceC10459q interfaceC10459q4;
        InterfaceC1440o interfaceC1440o4;
        float f12;
        InterfaceC17716A0 interfaceC17716A1;
        int i20;
        InterfaceC3923H4 interfaceC3923H6;
        float f13;
        InterfaceC17716A0 interfaceC17716A2;
        C3911F4 c3911f6;
        InterfaceC3923H4 interfaceC3923H7;
        float f14;
        C6018n0 c6018n0M6555r;
        int i21;
        c6021p.m6526U(226148675);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(interfaceC1439n) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 == 0) {
            if ((i10 & 48) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                if (c6021p.m6545h(interfaceC1439n2)) {
                    i21 = 256;
                } else {
                    i21 = 128;
                }
                i12 |= i21;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    interfaceC1440o2 = interfaceC1440o;
                    if (c6021p.m6545h(interfaceC1440o2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i12 | 24576;
                if ((196608 & i10) == 0) {
                    i15 = 90112 | i12;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        c3911f4M4616b = c3911f4;
                        int i23 = c6021p.m6542f(c3911f4M4616b) ? 1048576 : 524288;
                        i15 |= i23;
                    } else {
                        c3911f4M4616b = c3911f4;
                    }
                    i15 |= i23;
                } else {
                    c3911f4M4616b = c3911f4;
                }
                i16 = i11 & 128;
                if (i16 != 0) {
                    if ((12582912 & i10) == 0) {
                        interfaceC3923H5 = interfaceC3923H4;
                        if (c6021p.m6542f(interfaceC3923H5)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i15 |= i17;
                    }
                    if ((4793491 & i15) == 4793490 || !c6021p.m6562y()) {
                        c6021p.m6519N();
                        if ((i10 & 1) != 0 || c6021p.m6561x()) {
                            if (i22 != 0) {
                                interfaceC10459q3 = C10456n.f30959Y;
                            } else {
                                interfaceC10459q3 = interfaceC10459q2;
                            }
                            if (i13 != 0) {
                                interfaceC1440o3 = AbstractC3978S0.f12465a;
                            } else {
                                interfaceC1440o3 = interfaceC1440o2;
                            }
                            f11 = AbstractC3917G4.f12036a;
                            c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                            i18 = i15 & (-458753);
                            if ((i11 & 64) != 0) {
                                c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                                i19 = i15 & (-4128769);
                            } else {
                                i19 = i18;
                            }
                            if (i16 != 0) {
                                c3911f5 = c3911f4M4616b;
                                interfaceC10459q4 = interfaceC10459q3;
                                interfaceC1440o4 = interfaceC1440o3;
                                f12 = f11;
                                interfaceC17716A1 = c17755e0M4617c;
                                i20 = i19;
                                interfaceC3923H6 = null;
                            } else {
                                c3911f5 = c3911f4M4616b;
                                interfaceC10459q4 = interfaceC10459q3;
                                interfaceC1440o4 = interfaceC1440o3;
                                f12 = f11;
                                interfaceC17716A1 = c17755e0M4617c;
                                i20 = i19;
                            }
                            c6021p.m6554q();
                            C3582M c3582mM4655a = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
                            if (!C7540e.m7873a(f12, Float.NaN) || C7540e.m7873a(f12, Float.POSITIVE_INFINITY)) {
                                f13 = AbstractC3917G4.f12036a;
                            } else {
                                f13 = f12;
                            }
                            int i24 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112);
                            int i25 = i20 << 6;
                            m4621c(interfaceC10459q4, interfaceC1439n, c3582mM4655a, false, interfaceC1439n2, interfaceC1440o4, f13, interfaceC17716A1, c3911f5, interfaceC3923H6, c6021p, i24 | (57344 & i25) | (458752 & i25) | (234881024 & i25) | (i25 & 1879048192));
                            interfaceC10459q2 = interfaceC10459q4;
                            interfaceC1440o2 = interfaceC1440o4;
                            interfaceC17716A2 = interfaceC17716A1;
                            c3911f6 = c3911f5;
                            interfaceC3923H7 = interfaceC3923H6;
                            f14 = f12;
                        } else {
                            c6021p.m6517L();
                            i20 = i15 & (-458753);
                            if ((i11 & 64) != 0) {
                                i20 = i15 & (-4128769);
                            }
                            f12 = f10;
                            interfaceC17716A1 = interfaceC17716A0;
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q2;
                            interfaceC1440o4 = interfaceC1440o2;
                        }
                        interfaceC3923H6 = interfaceC3923H5;
                        c6021p.m6554q();
                        C3582M c3582mM4655a2 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
                        if (C7540e.m7873a(f12, Float.NaN)) {
                            f13 = AbstractC3917G4.f12036a;
                        } else {
                            f13 = AbstractC3917G4.f12036a;
                        }
                        int i26 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112);
                        int i27 = i20 << 6;
                        m4621c(interfaceC10459q4, interfaceC1439n, c3582mM4655a2, false, interfaceC1439n2, interfaceC1440o4, f13, interfaceC17716A1, c3911f5, interfaceC3923H6, c6021p, i26 | (57344 & i27) | (458752 & i27) | (234881024 & i27) | (i27 & 1879048192));
                        interfaceC10459q2 = interfaceC10459q4;
                        interfaceC1440o2 = interfaceC1440o4;
                        interfaceC17716A2 = interfaceC17716A1;
                        c3911f6 = c3911f5;
                        interfaceC3923H7 = interfaceC3923H6;
                        f14 = f12;
                    } else {
                        c6021p.m6517L();
                        f14 = f10;
                        interfaceC17716A2 = interfaceC17716A0;
                        interfaceC3923H7 = interfaceC3923H5;
                        c3911f6 = c3911f4M4616b;
                    }
                    c6018n0M6555r = c6021p.m6555r();
                    if (c6018n0M6555r != null) {
                        c6018n0M6555r.f19536d = new C4107p(interfaceC1439n, interfaceC10459q2, interfaceC1439n2, interfaceC1440o2, f14, interfaceC17716A2, c3911f6, interfaceC3923H7, i10, i11);
                    }
                }
                i15 |= 12582912;
                interfaceC3923H5 = interfaceC3923H4;
                if ((4793491 & i15) == 4793490) {
                    c6021p.m6519N();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            interfaceC1440o3 = AbstractC3978S0.f12465a;
                        } else {
                            interfaceC1440o3 = interfaceC1440o2;
                        }
                        f11 = AbstractC3917G4.f12036a;
                        c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                        i18 = i15 & (-458753);
                        if ((i11 & 64) != 0) {
                            c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                            i19 = i15 & (-4128769);
                        } else {
                            i19 = i18;
                        }
                        if (i16 != 0) {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = null;
                        } else {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = interfaceC3923H5;
                        }
                    } else {
                        if (i22 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            interfaceC1440o3 = AbstractC3978S0.f12465a;
                        } else {
                            interfaceC1440o3 = interfaceC1440o2;
                        }
                        f11 = AbstractC3917G4.f12036a;
                        c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                        i18 = i15 & (-458753);
                        if ((i11 & 64) != 0) {
                            c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                            i19 = i15 & (-4128769);
                        } else {
                            i19 = i18;
                        }
                        if (i16 != 0) {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = null;
                        } else {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = interfaceC3923H5;
                        }
                    }
                    c6021p.m6554q();
                    C3582M c3582mM4655a3 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
                    if (C7540e.m7873a(f12, Float.NaN)) {
                        f13 = AbstractC3917G4.f12036a;
                    } else {
                        f13 = AbstractC3917G4.f12036a;
                    }
                    int i28 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112);
                    int i29 = i20 << 6;
                    m4621c(interfaceC10459q4, interfaceC1439n, c3582mM4655a3, false, interfaceC1439n2, interfaceC1440o4, f13, interfaceC17716A1, c3911f5, interfaceC3923H6, c6021p, i28 | (57344 & i29) | (458752 & i29) | (234881024 & i29) | (i29 & 1879048192));
                    interfaceC10459q2 = interfaceC10459q4;
                    interfaceC1440o2 = interfaceC1440o4;
                    interfaceC17716A2 = interfaceC17716A1;
                    c3911f6 = c3911f5;
                    interfaceC3923H7 = interfaceC3923H6;
                    f14 = f12;
                } else {
                    c6021p.m6519N();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            interfaceC1440o3 = AbstractC3978S0.f12465a;
                        } else {
                            interfaceC1440o3 = interfaceC1440o2;
                        }
                        f11 = AbstractC3917G4.f12036a;
                        c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                        i18 = i15 & (-458753);
                        if ((i11 & 64) != 0) {
                            c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                            i19 = i15 & (-4128769);
                        } else {
                            i19 = i18;
                        }
                        if (i16 != 0) {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = null;
                        } else {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = interfaceC3923H5;
                        }
                    } else {
                        if (i22 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            interfaceC1440o3 = AbstractC3978S0.f12465a;
                        } else {
                            interfaceC1440o3 = interfaceC1440o2;
                        }
                        f11 = AbstractC3917G4.f12036a;
                        c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                        i18 = i15 & (-458753);
                        if ((i11 & 64) != 0) {
                            c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                            i19 = i15 & (-4128769);
                        } else {
                            i19 = i18;
                        }
                        if (i16 != 0) {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = null;
                        } else {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = interfaceC3923H5;
                        }
                    }
                    c6021p.m6554q();
                    C3582M c3582mM4655a4 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
                    if (C7540e.m7873a(f12, Float.NaN)) {
                        f13 = AbstractC3917G4.f12036a;
                    } else {
                        f13 = AbstractC3917G4.f12036a;
                    }
                    int i210 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112);
                    int i211 = i20 << 6;
                    m4621c(interfaceC10459q4, interfaceC1439n, c3582mM4655a4, false, interfaceC1439n2, interfaceC1440o4, f13, interfaceC17716A1, c3911f5, interfaceC3923H6, c6021p, i210 | (57344 & i211) | (458752 & i211) | (234881024 & i211) | (i211 & 1879048192));
                    interfaceC10459q2 = interfaceC10459q4;
                    interfaceC1440o2 = interfaceC1440o4;
                    interfaceC17716A2 = interfaceC17716A1;
                    c3911f6 = c3911f5;
                    interfaceC3923H7 = interfaceC3923H6;
                    f14 = f12;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C4107p(interfaceC1439n, interfaceC10459q2, interfaceC1439n2, interfaceC1440o2, f14, interfaceC17716A2, c3911f6, interfaceC3923H7, i10, i11);
                }
            }
            i12 |= 3072;
            interfaceC1440o2 = interfaceC1440o;
            i15 = i12 | 24576;
            if ((196608 & i10) == 0) {
                i15 = 90112 | i12;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    c3911f4M4616b = c3911f4;
                    if (c6021p.m6542f(c3911f4M4616b)) {
                    }
                    i15 |= i23;
                } else {
                    c3911f4M4616b = c3911f4;
                }
                i15 |= i23;
            } else {
                c3911f4M4616b = c3911f4;
            }
            i16 = i11 & 128;
            if (i16 != 0) {
                if ((12582912 & i10) == 0) {
                    interfaceC3923H5 = interfaceC3923H4;
                    if (c6021p.m6542f(interfaceC3923H5)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i15 |= i17;
                }
                if ((4793491 & i15) == 4793490) {
                    c6021p.m6519N();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            interfaceC1440o3 = AbstractC3978S0.f12465a;
                        } else {
                            interfaceC1440o3 = interfaceC1440o2;
                        }
                        f11 = AbstractC3917G4.f12036a;
                        c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                        i18 = i15 & (-458753);
                        if ((i11 & 64) != 0) {
                            c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                            i19 = i15 & (-4128769);
                        } else {
                            i19 = i18;
                        }
                        if (i16 != 0) {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = null;
                        } else {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = interfaceC3923H5;
                        }
                    } else {
                        if (i22 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            interfaceC1440o3 = AbstractC3978S0.f12465a;
                        } else {
                            interfaceC1440o3 = interfaceC1440o2;
                        }
                        f11 = AbstractC3917G4.f12036a;
                        c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                        i18 = i15 & (-458753);
                        if ((i11 & 64) != 0) {
                            c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                            i19 = i15 & (-4128769);
                        } else {
                            i19 = i18;
                        }
                        if (i16 != 0) {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = null;
                        } else {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = interfaceC3923H5;
                        }
                    }
                    c6021p.m6554q();
                    C3582M c3582mM4655a5 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
                    if (C7540e.m7873a(f12, Float.NaN)) {
                        f13 = AbstractC3917G4.f12036a;
                    } else {
                        f13 = AbstractC3917G4.f12036a;
                    }
                    int i212 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112);
                    int i213 = i20 << 6;
                    m4621c(interfaceC10459q4, interfaceC1439n, c3582mM4655a5, false, interfaceC1439n2, interfaceC1440o4, f13, interfaceC17716A1, c3911f5, interfaceC3923H6, c6021p, i212 | (57344 & i213) | (458752 & i213) | (234881024 & i213) | (i213 & 1879048192));
                    interfaceC10459q2 = interfaceC10459q4;
                    interfaceC1440o2 = interfaceC1440o4;
                    interfaceC17716A2 = interfaceC17716A1;
                    c3911f6 = c3911f5;
                    interfaceC3923H7 = interfaceC3923H6;
                    f14 = f12;
                } else {
                    c6021p.m6519N();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            interfaceC1440o3 = AbstractC3978S0.f12465a;
                        } else {
                            interfaceC1440o3 = interfaceC1440o2;
                        }
                        f11 = AbstractC3917G4.f12036a;
                        c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                        i18 = i15 & (-458753);
                        if ((i11 & 64) != 0) {
                            c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                            i19 = i15 & (-4128769);
                        } else {
                            i19 = i18;
                        }
                        if (i16 != 0) {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = null;
                        } else {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = interfaceC3923H5;
                        }
                    } else {
                        if (i22 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            interfaceC1440o3 = AbstractC3978S0.f12465a;
                        } else {
                            interfaceC1440o3 = interfaceC1440o2;
                        }
                        f11 = AbstractC3917G4.f12036a;
                        c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                        i18 = i15 & (-458753);
                        if ((i11 & 64) != 0) {
                            c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                            i19 = i15 & (-4128769);
                        } else {
                            i19 = i18;
                        }
                        if (i16 != 0) {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = null;
                        } else {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = interfaceC3923H5;
                        }
                    }
                    c6021p.m6554q();
                    C3582M c3582mM4655a6 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
                    if (C7540e.m7873a(f12, Float.NaN)) {
                        f13 = AbstractC3917G4.f12036a;
                    } else {
                        f13 = AbstractC3917G4.f12036a;
                    }
                    int i214 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112);
                    int i215 = i20 << 6;
                    m4621c(interfaceC10459q4, interfaceC1439n, c3582mM4655a6, false, interfaceC1439n2, interfaceC1440o4, f13, interfaceC17716A1, c3911f5, interfaceC3923H6, c6021p, i214 | (57344 & i215) | (458752 & i215) | (234881024 & i215) | (i215 & 1879048192));
                    interfaceC10459q2 = interfaceC10459q4;
                    interfaceC1440o2 = interfaceC1440o4;
                    interfaceC17716A2 = interfaceC17716A1;
                    c3911f6 = c3911f5;
                    interfaceC3923H7 = interfaceC3923H6;
                    f14 = f12;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C4107p(interfaceC1439n, interfaceC10459q2, interfaceC1439n2, interfaceC1440o2, f14, interfaceC17716A2, c3911f6, interfaceC3923H7, i10, i11);
                }
            }
            i15 |= 12582912;
            interfaceC3923H5 = interfaceC3923H4;
            if ((4793491 & i15) == 4793490) {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        interfaceC1440o3 = AbstractC3978S0.f12465a;
                    } else {
                        interfaceC1440o3 = interfaceC1440o2;
                    }
                    f11 = AbstractC3917G4.f12036a;
                    c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                    i18 = i15 & (-458753);
                    if ((i11 & 64) != 0) {
                        c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                        i19 = i15 & (-4128769);
                    } else {
                        i19 = i18;
                    }
                    if (i16 != 0) {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = null;
                    } else {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = interfaceC3923H5;
                    }
                } else {
                    if (i22 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        interfaceC1440o3 = AbstractC3978S0.f12465a;
                    } else {
                        interfaceC1440o3 = interfaceC1440o2;
                    }
                    f11 = AbstractC3917G4.f12036a;
                    c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                    i18 = i15 & (-458753);
                    if ((i11 & 64) != 0) {
                        c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                        i19 = i15 & (-4128769);
                    } else {
                        i19 = i18;
                    }
                    if (i16 != 0) {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = null;
                    } else {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = interfaceC3923H5;
                    }
                }
                c6021p.m6554q();
                C3582M c3582mM4655a7 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
                if (C7540e.m7873a(f12, Float.NaN)) {
                    f13 = AbstractC3917G4.f12036a;
                } else {
                    f13 = AbstractC3917G4.f12036a;
                }
                int i216 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112);
                int i217 = i20 << 6;
                m4621c(interfaceC10459q4, interfaceC1439n, c3582mM4655a7, false, interfaceC1439n2, interfaceC1440o4, f13, interfaceC17716A1, c3911f5, interfaceC3923H6, c6021p, i216 | (57344 & i217) | (458752 & i217) | (234881024 & i217) | (i217 & 1879048192));
                interfaceC10459q2 = interfaceC10459q4;
                interfaceC1440o2 = interfaceC1440o4;
                interfaceC17716A2 = interfaceC17716A1;
                c3911f6 = c3911f5;
                interfaceC3923H7 = interfaceC3923H6;
                f14 = f12;
            } else {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        interfaceC1440o3 = AbstractC3978S0.f12465a;
                    } else {
                        interfaceC1440o3 = interfaceC1440o2;
                    }
                    f11 = AbstractC3917G4.f12036a;
                    c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                    i18 = i15 & (-458753);
                    if ((i11 & 64) != 0) {
                        c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                        i19 = i15 & (-4128769);
                    } else {
                        i19 = i18;
                    }
                    if (i16 != 0) {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = null;
                    } else {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = interfaceC3923H5;
                    }
                } else {
                    if (i22 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        interfaceC1440o3 = AbstractC3978S0.f12465a;
                    } else {
                        interfaceC1440o3 = interfaceC1440o2;
                    }
                    f11 = AbstractC3917G4.f12036a;
                    c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                    i18 = i15 & (-458753);
                    if ((i11 & 64) != 0) {
                        c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                        i19 = i15 & (-4128769);
                    } else {
                        i19 = i18;
                    }
                    if (i16 != 0) {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = null;
                    } else {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = interfaceC3923H5;
                    }
                }
                c6021p.m6554q();
                C3582M c3582mM4655a8 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
                if (C7540e.m7873a(f12, Float.NaN)) {
                    f13 = AbstractC3917G4.f12036a;
                } else {
                    f13 = AbstractC3917G4.f12036a;
                }
                int i218 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112);
                int i219 = i20 << 6;
                m4621c(interfaceC10459q4, interfaceC1439n, c3582mM4655a8, false, interfaceC1439n2, interfaceC1440o4, f13, interfaceC17716A1, c3911f5, interfaceC3923H6, c6021p, i218 | (57344 & i219) | (458752 & i219) | (234881024 & i219) | (i219 & 1879048192));
                interfaceC10459q2 = interfaceC10459q4;
                interfaceC1440o2 = interfaceC1440o4;
                interfaceC17716A2 = interfaceC17716A1;
                c3911f6 = c3911f5;
                interfaceC3923H7 = interfaceC3923H6;
                f14 = f12;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4107p(interfaceC1439n, interfaceC10459q2, interfaceC1439n2, interfaceC1440o2, f14, interfaceC17716A2, c3911f6, interfaceC3923H7, i10, i11);
            }
        }
        i12 |= 48;
        interfaceC10459q2 = interfaceC10459q;
        if ((i10 & 384) == 0) {
            if (c6021p.m6545h(interfaceC1439n2)) {
                i21 = 256;
            } else {
                i21 = 128;
            }
            i12 |= i21;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                interfaceC1440o2 = interfaceC1440o;
                if (c6021p.m6545h(interfaceC1440o2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i12 | 24576;
            if ((196608 & i10) == 0) {
                i15 = 90112 | i12;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    c3911f4M4616b = c3911f4;
                    if (c6021p.m6542f(c3911f4M4616b)) {
                    }
                    i15 |= i23;
                } else {
                    c3911f4M4616b = c3911f4;
                }
                i15 |= i23;
            } else {
                c3911f4M4616b = c3911f4;
            }
            i16 = i11 & 128;
            if (i16 != 0) {
                if ((12582912 & i10) == 0) {
                    interfaceC3923H5 = interfaceC3923H4;
                    if (c6021p.m6542f(interfaceC3923H5)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i15 |= i17;
                }
                if ((4793491 & i15) == 4793490) {
                    c6021p.m6519N();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            interfaceC1440o3 = AbstractC3978S0.f12465a;
                        } else {
                            interfaceC1440o3 = interfaceC1440o2;
                        }
                        f11 = AbstractC3917G4.f12036a;
                        c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                        i18 = i15 & (-458753);
                        if ((i11 & 64) != 0) {
                            c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                            i19 = i15 & (-4128769);
                        } else {
                            i19 = i18;
                        }
                        if (i16 != 0) {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = null;
                        } else {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = interfaceC3923H5;
                        }
                    } else {
                        if (i22 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            interfaceC1440o3 = AbstractC3978S0.f12465a;
                        } else {
                            interfaceC1440o3 = interfaceC1440o2;
                        }
                        f11 = AbstractC3917G4.f12036a;
                        c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                        i18 = i15 & (-458753);
                        if ((i11 & 64) != 0) {
                            c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                            i19 = i15 & (-4128769);
                        } else {
                            i19 = i18;
                        }
                        if (i16 != 0) {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = null;
                        } else {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = interfaceC3923H5;
                        }
                    }
                    c6021p.m6554q();
                    C3582M c3582mM4655a9 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
                    if (C7540e.m7873a(f12, Float.NaN)) {
                        f13 = AbstractC3917G4.f12036a;
                    } else {
                        f13 = AbstractC3917G4.f12036a;
                    }
                    int i2110 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112);
                    int i2111 = i20 << 6;
                    m4621c(interfaceC10459q4, interfaceC1439n, c3582mM4655a9, false, interfaceC1439n2, interfaceC1440o4, f13, interfaceC17716A1, c3911f5, interfaceC3923H6, c6021p, i2110 | (57344 & i2111) | (458752 & i2111) | (234881024 & i2111) | (i2111 & 1879048192));
                    interfaceC10459q2 = interfaceC10459q4;
                    interfaceC1440o2 = interfaceC1440o4;
                    interfaceC17716A2 = interfaceC17716A1;
                    c3911f6 = c3911f5;
                    interfaceC3923H7 = interfaceC3923H6;
                    f14 = f12;
                } else {
                    c6021p.m6519N();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            interfaceC1440o3 = AbstractC3978S0.f12465a;
                        } else {
                            interfaceC1440o3 = interfaceC1440o2;
                        }
                        f11 = AbstractC3917G4.f12036a;
                        c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                        i18 = i15 & (-458753);
                        if ((i11 & 64) != 0) {
                            c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                            i19 = i15 & (-4128769);
                        } else {
                            i19 = i18;
                        }
                        if (i16 != 0) {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = null;
                        } else {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = interfaceC3923H5;
                        }
                    } else {
                        if (i22 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            interfaceC1440o3 = AbstractC3978S0.f12465a;
                        } else {
                            interfaceC1440o3 = interfaceC1440o2;
                        }
                        f11 = AbstractC3917G4.f12036a;
                        c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                        i18 = i15 & (-458753);
                        if ((i11 & 64) != 0) {
                            c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                            i19 = i15 & (-4128769);
                        } else {
                            i19 = i18;
                        }
                        if (i16 != 0) {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = null;
                        } else {
                            c3911f5 = c3911f4M4616b;
                            interfaceC10459q4 = interfaceC10459q3;
                            interfaceC1440o4 = interfaceC1440o3;
                            f12 = f11;
                            interfaceC17716A1 = c17755e0M4617c;
                            i20 = i19;
                            interfaceC3923H6 = interfaceC3923H5;
                        }
                    }
                    c6021p.m6554q();
                    C3582M c3582mM4655a10 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
                    if (C7540e.m7873a(f12, Float.NaN)) {
                        f13 = AbstractC3917G4.f12036a;
                    } else {
                        f13 = AbstractC3917G4.f12036a;
                    }
                    int i2112 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112);
                    int i2113 = i20 << 6;
                    m4621c(interfaceC10459q4, interfaceC1439n, c3582mM4655a10, false, interfaceC1439n2, interfaceC1440o4, f13, interfaceC17716A1, c3911f5, interfaceC3923H6, c6021p, i2112 | (57344 & i2113) | (458752 & i2113) | (234881024 & i2113) | (i2113 & 1879048192));
                    interfaceC10459q2 = interfaceC10459q4;
                    interfaceC1440o2 = interfaceC1440o4;
                    interfaceC17716A2 = interfaceC17716A1;
                    c3911f6 = c3911f5;
                    interfaceC3923H7 = interfaceC3923H6;
                    f14 = f12;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C4107p(interfaceC1439n, interfaceC10459q2, interfaceC1439n2, interfaceC1440o2, f14, interfaceC17716A2, c3911f6, interfaceC3923H7, i10, i11);
                }
            }
            i15 |= 12582912;
            interfaceC3923H5 = interfaceC3923H4;
            if ((4793491 & i15) == 4793490) {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        interfaceC1440o3 = AbstractC3978S0.f12465a;
                    } else {
                        interfaceC1440o3 = interfaceC1440o2;
                    }
                    f11 = AbstractC3917G4.f12036a;
                    c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                    i18 = i15 & (-458753);
                    if ((i11 & 64) != 0) {
                        c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                        i19 = i15 & (-4128769);
                    } else {
                        i19 = i18;
                    }
                    if (i16 != 0) {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = null;
                    } else {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = interfaceC3923H5;
                    }
                } else {
                    if (i22 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        interfaceC1440o3 = AbstractC3978S0.f12465a;
                    } else {
                        interfaceC1440o3 = interfaceC1440o2;
                    }
                    f11 = AbstractC3917G4.f12036a;
                    c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                    i18 = i15 & (-458753);
                    if ((i11 & 64) != 0) {
                        c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                        i19 = i15 & (-4128769);
                    } else {
                        i19 = i18;
                    }
                    if (i16 != 0) {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = null;
                    } else {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = interfaceC3923H5;
                    }
                }
                c6021p.m6554q();
                C3582M c3582mM4655a11 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
                if (C7540e.m7873a(f12, Float.NaN)) {
                    f13 = AbstractC3917G4.f12036a;
                } else {
                    f13 = AbstractC3917G4.f12036a;
                }
                int i2114 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112);
                int i2115 = i20 << 6;
                m4621c(interfaceC10459q4, interfaceC1439n, c3582mM4655a11, false, interfaceC1439n2, interfaceC1440o4, f13, interfaceC17716A1, c3911f5, interfaceC3923H6, c6021p, i2114 | (57344 & i2115) | (458752 & i2115) | (234881024 & i2115) | (i2115 & 1879048192));
                interfaceC10459q2 = interfaceC10459q4;
                interfaceC1440o2 = interfaceC1440o4;
                interfaceC17716A2 = interfaceC17716A1;
                c3911f6 = c3911f5;
                interfaceC3923H7 = interfaceC3923H6;
                f14 = f12;
            } else {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        interfaceC1440o3 = AbstractC3978S0.f12465a;
                    } else {
                        interfaceC1440o3 = interfaceC1440o2;
                    }
                    f11 = AbstractC3917G4.f12036a;
                    c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                    i18 = i15 & (-458753);
                    if ((i11 & 64) != 0) {
                        c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                        i19 = i15 & (-4128769);
                    } else {
                        i19 = i18;
                    }
                    if (i16 != 0) {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = null;
                    } else {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = interfaceC3923H5;
                    }
                } else {
                    if (i22 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        interfaceC1440o3 = AbstractC3978S0.f12465a;
                    } else {
                        interfaceC1440o3 = interfaceC1440o2;
                    }
                    f11 = AbstractC3917G4.f12036a;
                    c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                    i18 = i15 & (-458753);
                    if ((i11 & 64) != 0) {
                        c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                        i19 = i15 & (-4128769);
                    } else {
                        i19 = i18;
                    }
                    if (i16 != 0) {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = null;
                    } else {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = interfaceC3923H5;
                    }
                }
                c6021p.m6554q();
                C3582M c3582mM4655a12 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
                if (C7540e.m7873a(f12, Float.NaN)) {
                    f13 = AbstractC3917G4.f12036a;
                } else {
                    f13 = AbstractC3917G4.f12036a;
                }
                int i2116 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112);
                int i2117 = i20 << 6;
                m4621c(interfaceC10459q4, interfaceC1439n, c3582mM4655a12, false, interfaceC1439n2, interfaceC1440o4, f13, interfaceC17716A1, c3911f5, interfaceC3923H6, c6021p, i2116 | (57344 & i2117) | (458752 & i2117) | (234881024 & i2117) | (i2117 & 1879048192));
                interfaceC10459q2 = interfaceC10459q4;
                interfaceC1440o2 = interfaceC1440o4;
                interfaceC17716A2 = interfaceC17716A1;
                c3911f6 = c3911f5;
                interfaceC3923H7 = interfaceC3923H6;
                f14 = f12;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4107p(interfaceC1439n, interfaceC10459q2, interfaceC1439n2, interfaceC1440o2, f14, interfaceC17716A2, c3911f6, interfaceC3923H7, i10, i11);
            }
        }
        i12 |= 3072;
        interfaceC1440o2 = interfaceC1440o;
        i15 = i12 | 24576;
        if ((196608 & i10) == 0) {
            i15 = 90112 | i12;
        }
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                c3911f4M4616b = c3911f4;
                if (c6021p.m6542f(c3911f4M4616b)) {
                }
                i15 |= i23;
            } else {
                c3911f4M4616b = c3911f4;
            }
            i15 |= i23;
        } else {
            c3911f4M4616b = c3911f4;
        }
        i16 = i11 & 128;
        if (i16 != 0) {
            if ((12582912 & i10) == 0) {
                interfaceC3923H5 = interfaceC3923H4;
                if (c6021p.m6542f(interfaceC3923H5)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i15 |= i17;
            }
            if ((4793491 & i15) == 4793490) {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        interfaceC1440o3 = AbstractC3978S0.f12465a;
                    } else {
                        interfaceC1440o3 = interfaceC1440o2;
                    }
                    f11 = AbstractC3917G4.f12036a;
                    c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                    i18 = i15 & (-458753);
                    if ((i11 & 64) != 0) {
                        c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                        i19 = i15 & (-4128769);
                    } else {
                        i19 = i18;
                    }
                    if (i16 != 0) {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = null;
                    } else {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = interfaceC3923H5;
                    }
                } else {
                    if (i22 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        interfaceC1440o3 = AbstractC3978S0.f12465a;
                    } else {
                        interfaceC1440o3 = interfaceC1440o2;
                    }
                    f11 = AbstractC3917G4.f12036a;
                    c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                    i18 = i15 & (-458753);
                    if ((i11 & 64) != 0) {
                        c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                        i19 = i15 & (-4128769);
                    } else {
                        i19 = i18;
                    }
                    if (i16 != 0) {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = null;
                    } else {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = interfaceC3923H5;
                    }
                }
                c6021p.m6554q();
                C3582M c3582mM4655a13 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
                if (C7540e.m7873a(f12, Float.NaN)) {
                    f13 = AbstractC3917G4.f12036a;
                } else {
                    f13 = AbstractC3917G4.f12036a;
                }
                int i2118 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112);
                int i2119 = i20 << 6;
                m4621c(interfaceC10459q4, interfaceC1439n, c3582mM4655a13, false, interfaceC1439n2, interfaceC1440o4, f13, interfaceC17716A1, c3911f5, interfaceC3923H6, c6021p, i2118 | (57344 & i2119) | (458752 & i2119) | (234881024 & i2119) | (i2119 & 1879048192));
                interfaceC10459q2 = interfaceC10459q4;
                interfaceC1440o2 = interfaceC1440o4;
                interfaceC17716A2 = interfaceC17716A1;
                c3911f6 = c3911f5;
                interfaceC3923H7 = interfaceC3923H6;
                f14 = f12;
            } else {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        interfaceC1440o3 = AbstractC3978S0.f12465a;
                    } else {
                        interfaceC1440o3 = interfaceC1440o2;
                    }
                    f11 = AbstractC3917G4.f12036a;
                    c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                    i18 = i15 & (-458753);
                    if ((i11 & 64) != 0) {
                        c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                        i19 = i15 & (-4128769);
                    } else {
                        i19 = i18;
                    }
                    if (i16 != 0) {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = null;
                    } else {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = interfaceC3923H5;
                    }
                } else {
                    if (i22 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        interfaceC1440o3 = AbstractC3978S0.f12465a;
                    } else {
                        interfaceC1440o3 = interfaceC1440o2;
                    }
                    f11 = AbstractC3917G4.f12036a;
                    c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                    i18 = i15 & (-458753);
                    if ((i11 & 64) != 0) {
                        c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                        i19 = i15 & (-4128769);
                    } else {
                        i19 = i18;
                    }
                    if (i16 != 0) {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = null;
                    } else {
                        c3911f5 = c3911f4M4616b;
                        interfaceC10459q4 = interfaceC10459q3;
                        interfaceC1440o4 = interfaceC1440o3;
                        f12 = f11;
                        interfaceC17716A1 = c17755e0M4617c;
                        i20 = i19;
                        interfaceC3923H6 = interfaceC3923H5;
                    }
                }
                c6021p.m6554q();
                C3582M c3582mM4655a14 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
                if (C7540e.m7873a(f12, Float.NaN)) {
                    f13 = AbstractC3917G4.f12036a;
                } else {
                    f13 = AbstractC3917G4.f12036a;
                }
                int i21110 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112);
                int i21111 = i20 << 6;
                m4621c(interfaceC10459q4, interfaceC1439n, c3582mM4655a14, false, interfaceC1439n2, interfaceC1440o4, f13, interfaceC17716A1, c3911f5, interfaceC3923H6, c6021p, i21110 | (57344 & i21111) | (458752 & i21111) | (234881024 & i21111) | (i21111 & 1879048192));
                interfaceC10459q2 = interfaceC10459q4;
                interfaceC1440o2 = interfaceC1440o4;
                interfaceC17716A2 = interfaceC17716A1;
                c3911f6 = c3911f5;
                interfaceC3923H7 = interfaceC3923H6;
                f14 = f12;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4107p(interfaceC1439n, interfaceC10459q2, interfaceC1439n2, interfaceC1440o2, f14, interfaceC17716A2, c3911f6, interfaceC3923H7, i10, i11);
            }
        }
        i15 |= 12582912;
        interfaceC3923H5 = interfaceC3923H4;
        if ((4793491 & i15) == 4793490) {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    interfaceC1440o3 = AbstractC3978S0.f12465a;
                } else {
                    interfaceC1440o3 = interfaceC1440o2;
                }
                f11 = AbstractC3917G4.f12036a;
                c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                i18 = i15 & (-458753);
                if ((i11 & 64) != 0) {
                    c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                    i19 = i15 & (-4128769);
                } else {
                    i19 = i18;
                }
                if (i16 != 0) {
                    c3911f5 = c3911f4M4616b;
                    interfaceC10459q4 = interfaceC10459q3;
                    interfaceC1440o4 = interfaceC1440o3;
                    f12 = f11;
                    interfaceC17716A1 = c17755e0M4617c;
                    i20 = i19;
                    interfaceC3923H6 = null;
                } else {
                    c3911f5 = c3911f4M4616b;
                    interfaceC10459q4 = interfaceC10459q3;
                    interfaceC1440o4 = interfaceC1440o3;
                    f12 = f11;
                    interfaceC17716A1 = c17755e0M4617c;
                    i20 = i19;
                    interfaceC3923H6 = interfaceC3923H5;
                }
            } else {
                if (i22 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    interfaceC1440o3 = AbstractC3978S0.f12465a;
                } else {
                    interfaceC1440o3 = interfaceC1440o2;
                }
                f11 = AbstractC3917G4.f12036a;
                c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                i18 = i15 & (-458753);
                if ((i11 & 64) != 0) {
                    c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                    i19 = i15 & (-4128769);
                } else {
                    i19 = i18;
                }
                if (i16 != 0) {
                    c3911f5 = c3911f4M4616b;
                    interfaceC10459q4 = interfaceC10459q3;
                    interfaceC1440o4 = interfaceC1440o3;
                    f12 = f11;
                    interfaceC17716A1 = c17755e0M4617c;
                    i20 = i19;
                    interfaceC3923H6 = null;
                } else {
                    c3911f5 = c3911f4M4616b;
                    interfaceC10459q4 = interfaceC10459q3;
                    interfaceC1440o4 = interfaceC1440o3;
                    f12 = f11;
                    interfaceC17716A1 = c17755e0M4617c;
                    i20 = i19;
                    interfaceC3923H6 = interfaceC3923H5;
                }
            }
            c6021p.m6554q();
            C3582M c3582mM4655a15 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
            if (C7540e.m7873a(f12, Float.NaN)) {
                f13 = AbstractC3917G4.f12036a;
            } else {
                f13 = AbstractC3917G4.f12036a;
            }
            int i21112 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112);
            int i21113 = i20 << 6;
            m4621c(interfaceC10459q4, interfaceC1439n, c3582mM4655a15, false, interfaceC1439n2, interfaceC1440o4, f13, interfaceC17716A1, c3911f5, interfaceC3923H6, c6021p, i21112 | (57344 & i21113) | (458752 & i21113) | (234881024 & i21113) | (i21113 & 1879048192));
            interfaceC10459q2 = interfaceC10459q4;
            interfaceC1440o2 = interfaceC1440o4;
            interfaceC17716A2 = interfaceC17716A1;
            c3911f6 = c3911f5;
            interfaceC3923H7 = interfaceC3923H6;
            f14 = f12;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    interfaceC1440o3 = AbstractC3978S0.f12465a;
                } else {
                    interfaceC1440o3 = interfaceC1440o2;
                }
                f11 = AbstractC3917G4.f12036a;
                c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                i18 = i15 & (-458753);
                if ((i11 & 64) != 0) {
                    c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                    i19 = i15 & (-4128769);
                } else {
                    i19 = i18;
                }
                if (i16 != 0) {
                    c3911f5 = c3911f4M4616b;
                    interfaceC10459q4 = interfaceC10459q3;
                    interfaceC1440o4 = interfaceC1440o3;
                    f12 = f11;
                    interfaceC17716A1 = c17755e0M4617c;
                    i20 = i19;
                    interfaceC3923H6 = null;
                } else {
                    c3911f5 = c3911f4M4616b;
                    interfaceC10459q4 = interfaceC10459q3;
                    interfaceC1440o4 = interfaceC1440o3;
                    f12 = f11;
                    interfaceC17716A1 = c17755e0M4617c;
                    i20 = i19;
                    interfaceC3923H6 = interfaceC3923H5;
                }
            } else {
                if (i22 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    interfaceC1440o3 = AbstractC3978S0.f12465a;
                } else {
                    interfaceC1440o3 = interfaceC1440o2;
                }
                f11 = AbstractC3917G4.f12036a;
                c17755e0M4617c = AbstractC3917G4.m4617c(c6021p);
                i18 = i15 & (-458753);
                if ((i11 & 64) != 0) {
                    c3911f4M4616b = AbstractC3917G4.m4616b((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
                    i19 = i15 & (-4128769);
                } else {
                    i19 = i18;
                }
                if (i16 != 0) {
                    c3911f5 = c3911f4M4616b;
                    interfaceC10459q4 = interfaceC10459q3;
                    interfaceC1440o4 = interfaceC1440o3;
                    f12 = f11;
                    interfaceC17716A1 = c17755e0M4617c;
                    i20 = i19;
                    interfaceC3923H6 = null;
                } else {
                    c3911f5 = c3911f4M4616b;
                    interfaceC10459q4 = interfaceC10459q3;
                    interfaceC1440o4 = interfaceC1440o3;
                    f12 = f11;
                    interfaceC17716A1 = c17755e0M4617c;
                    i20 = i19;
                    interfaceC3923H6 = interfaceC3923H5;
                }
            }
            c6021p.m6554q();
            C3582M c3582mM4655a16 = AbstractC3947L4.m4655a(AbstractC5243J.f17029c, c6021p);
            if (C7540e.m7873a(f12, Float.NaN)) {
                f13 = AbstractC3917G4.f12036a;
            } else {
                f13 = AbstractC3917G4.f12036a;
            }
            int i21114 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & 112);
            int i21115 = i20 << 6;
            m4621c(interfaceC10459q4, interfaceC1439n, c3582mM4655a16, false, interfaceC1439n2, interfaceC1440o4, f13, interfaceC17716A1, c3911f5, interfaceC3923H6, c6021p, i21114 | (57344 & i21115) | (458752 & i21115) | (234881024 & i21115) | (i21115 & 1879048192));
            interfaceC10459q2 = interfaceC10459q4;
            interfaceC1440o2 = interfaceC1440o4;
            interfaceC17716A2 = interfaceC17716A1;
            c3911f6 = c3911f5;
            interfaceC3923H7 = interfaceC3923H6;
            f14 = f12;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4107p(interfaceC1439n, interfaceC10459q2, interfaceC1439n2, interfaceC1440o2, f14, interfaceC17716A2, c3911f6, interfaceC3923H7, i10, i11);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m4623e(InterfaceC10459q interfaceC10459q, C8410b c8410b, C3582M c3582m, float f10, C8410b c8410b2, C3582M c3582m2, InterfaceC1439n interfaceC1439n, InterfaceC1440o interfaceC1440o, float f11, float f12, InterfaceC17716A0 interfaceC17716A0, C3911F4 c3911f4, InterfaceC3923H4 interfaceC3923H4, C6021p c6021p, int i10, int i11) {
        int i12;
        int i13;
        InterfaceC10459q draggableElement;
        C3935J4 state;
        c6021p.m6526U(1169193376);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(c8410b) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6542f(c3582m) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6536c(f10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c6021p.m6545h(c8410b2) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= c6021p.m6542f(c3582m2) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= c6021p.m6545h(interfaceC1439n) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c6021p.m6545h(interfaceC1440o) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c6021p.m6536c(f11) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c6021p.m6536c(f12) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (c6021p.m6542f(interfaceC17716A0) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c6021p.m6542f(c3911f4) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= c6021p.m6542f(interfaceC3923H4) ? 256 : 128;
        }
        int i14 = i13;
        if ((i12 & 306783379) == 306783378 && (i14 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (Float.isNaN(f11) || f11 == Float.POSITIVE_INFINITY) {
                throw new IllegalArgumentException("The collapsedHeight is expected to be specified and finite");
            }
            if (Float.isNaN(f12) || f12 == Float.POSITIVE_INFINITY) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            if (Float.compare(f12, f11) < 0) {
                throw new IllegalArgumentException("The expandedHeight is expected to be greater or equal to the collapsedHeight");
            }
            C16557y c16557y = new C16557y();
            C16557y c16557y2 = new C16557y();
            C16558z c16558z = new C16558z();
            InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
            c16557y.f51286Y = interfaceC7537b.mo7864b0(f12);
            c16557y2.f51286Y = interfaceC7537b.mo7864b0(f11);
            c16558z.f51287Y = interfaceC7537b.mo7866k0(f10);
            int i15 = i14 & 896;
            boolean zM6536c = (i15 == 256) | c6021p.m6536c(c16557y2.f51286Y) | c6021p.m6536c(c16557y.f51286Y);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (zM6536c || objM6514H == c5975s) {
                objM6514H = new C0155B1(interfaceC3923H4, c16557y2, c16557y, 19);
                c6021p.m6537c0(objM6514H);
            }
            C5997d.m6454j((InterfaceC1426a) objM6514H, c6021p);
            float fM4635a = (interfaceC3923H4 == null || (state = interfaceC3923H4.getState()) == null) ? 0.0f : state.m4635a();
            c3911f4.getClass();
            long jM15646x = AbstractC14334L.m15646x(AbstractC13725A.f43290c.mo9579a(fM4635a), c3911f4.f11995a, c3911f4.f11996b);
            C8410b c8410bM8969c = AbstractC8411c.m8969c(-89435287, c6021p, new C4143v(interfaceC1440o, 1));
            float fMo9579a = f12041c.mo9579a(fM4635a);
            float f13 = 1.0f - fM4635a;
            boolean z6 = fM4635a < 0.5f;
            boolean z10 = !z6;
            c6021p.m6524S(1641266888);
            if (interfaceC3923H4 == null || interfaceC3923H4.mo3549f()) {
                draggableElement = C10456n.f30959Y;
            } else {
                boolean z11 = i15 == 256;
                Object objM6514H2 = c6021p.m6514H();
                if (z11 || objM6514H2 == c5975s) {
                    objM6514H2 = new C4149w(interfaceC3923H4, 1);
                    c6021p.m6537c0(objM6514H2);
                }
                InterfaceC16658A0 interfaceC16658A0M18555b = AbstractC16786v0.m18555b((InterfaceC1436k) objM6514H2, c6021p);
                boolean z12 = i15 == 256;
                Object objM6514H3 = c6021p.m6514H();
                if (z12 || objM6514H3 == c5975s) {
                    objM6514H3 = new C4155x(interfaceC3923H4, null, 1);
                    c6021p.m6537c0(objM6514H3);
                }
                draggableElement = new DraggableElement(interfaceC16658A0M18555b, true, null, false, AbstractC16786v0.f53881a, (InterfaceC1440o) objM6514H3, false);
            }
            c6021p.m6553p(false);
            AbstractC4034c4.m4725a(interfaceC10459q.mo428M(draggableElement), null, jM15646x, 0L, 0.0f, 0.0f, null, AbstractC8411c.m8969c(-1350062619, c6021p, new C3894D(interfaceC17716A0, f11, c3911f4, c8410b2, c3582m2, fMo9579a, z6, interfaceC1439n, c8410bM8969c, f12, interfaceC3923H4, c8410b, c3582m, f13, c16558z, z10)), c6021p, 12582912, 122);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3900E(interfaceC10459q, c8410b, c3582m, f10, c8410b2, c3582m2, interfaceC1439n, interfaceC1440o, f11, f12, interfaceC17716A0, c3911f4, interfaceC3923H4, i10, i11);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m4624f(InterfaceC10459q interfaceC10459q, InterfaceC4045e3 interfaceC4045e3, long j10, long j11, long j12, InterfaceC1439n interfaceC1439n, C3582M c3582m, float f10, InterfaceC17766k interfaceC17766k, InterfaceC17760h interfaceC17760h, int i10, boolean z6, InterfaceC1439n interfaceC1439n2, C8410b c8410b, C6021p c6021p, int i11, int i12) {
        int i13;
        int i14;
        InterfaceC10459q clearAndSetSemanticsElement;
        c6021p.m6526U(-742442296);
        if ((i11 & 6) == 0) {
            i13 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= (i11 & 64) == 0 ? c6021p.m6542f(interfaceC4045e3) : c6021p.m6545h(interfaceC4045e3) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= c6021p.m6540e(j10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c6021p.m6540e(j11) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= c6021p.m6540e(j12) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= c6021p.m6545h(interfaceC1439n) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= c6021p.m6542f(c3582m) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= c6021p.m6536c(f10) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= c6021p.m6542f(interfaceC17766k) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i13 |= c6021p.m6542f(interfaceC17760h) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = (c6021p.m6538d(i10) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= c6021p.m6545h(interfaceC1439n2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= c6021p.m6545h(c8410b) ? 2048 : 1024;
        }
        if ((i13 & 306783379) == 306783378 && (i14 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            boolean z10 = ((i13 & 112) == 32 || ((i13 & 64) != 0 && c6021p.m6545h(interfaceC4045e3))) | ((1879048192 & i13) == 536870912) | ((234881024 & i13) == 67108864) | ((i14 & 14) == 4);
            Object objM6514H = c6021p.m6514H();
            if (z10 || objM6514H == C6013l.f19514a) {
                objM6514H = new C3876A(interfaceC4045e3, interfaceC17760h, interfaceC17766k, i10);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC21057K interfaceC21057K = (InterfaceC21057K) objM6514H;
            int i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057K);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM11317c = AbstractC10868a.m11317c(c10456n, "navigationIcon");
            float f11 = f12043e;
            InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(interfaceC10459qM11317c, f11, 0.0f, 0.0f, 0.0f, 14);
            C10451i c10451i = C10444b.f30934Y;
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(c10451i, false);
            int i16 = c6021p.f19564P;
            int i17 = i13;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i16))) {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            C6037x c6037x = AbstractC4025b1.f12649a;
            C5997d.m6440a(AbstractC3794B0.m4494s(j10, c6037x), interfaceC1439n2, c6021p, 8 | ((i14 >> 3) & 112));
            c6021p.m6553p(true);
            InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC10868a.m11317c(c10456n, UiComponentConfig.Title.type), f11, 0.0f, 2);
            if (z6) {
                AtomicInteger atomicInteger = AbstractC2965l.f8883a;
                clearAndSetSemanticsElement = new ClearAndSetSemanticsElement();
            } else {
                clearAndSetSemanticsElement = c10456n;
            }
            InterfaceC10459q interfaceC10459qM11306b = AbstractC10864a.m11306b(interfaceC10459qM11235m.mo428M(clearAndSetSemanticsElement), 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 0, 131067);
            InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(c10451i, false);
            int i18 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11306b);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e2);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m3);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i18))) {
                AbstractC0168G.m537z(i18, c6021p, i18, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d3);
            int i19 = i17 >> 9;
            AbstractC4846J.m5493b(j11, c3582m, interfaceC1439n, c6021p, (i19 & 14) | ((i17 >> 15) & 112) | (i19 & 896));
            c6021p.m6553p(true);
            InterfaceC10459q interfaceC10459qM11237o2 = AbstractC10842a.m11237o(AbstractC10868a.m11317c(c10456n, "actionIcons"), 0.0f, 0.0f, f11, 0.0f, 11);
            InterfaceC21057K interfaceC21057KM19511e3 = AbstractC17780r.m19511e(c10451i, false);
            int i20 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o2);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e3);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m4);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i20))) {
                AbstractC0168G.m537z(i20, c6021p, i20, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d4);
            C5997d.m6440a(c6037x.mo6405a(new C14365u(j12)), c8410b, c6021p, 8 | ((i14 >> 6) & 112));
            c6021p.m6553p(true);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3882B(interfaceC10459q, interfaceC4045e3, j10, j11, j12, interfaceC1439n, c3582m, f10, interfaceC17766k, interfaceC17760h, i10, z6, interfaceC1439n2, c8410b, i11, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public static final Object m4625g(C3935J4 c3935j4, float f10, C13796x c13796x, InterfaceC13772l interfaceC13772l, AbstractC19687c abstractC19687c) {
        C3912G c3912g;
        C16557y c16557y;
        C16557y c16557y2;
        if (abstractC19687c instanceof C3912G) {
            c3912g = (C3912G) abstractC19687c;
            int i10 = c3912g.f12004q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3912g.f12004q0 = i10 - Integer.MIN_VALUE;
            } else {
                c3912g = new C3912G(abstractC19687c);
            }
        } else {
            c3912g = new C3912G(abstractC19687c);
        }
        C3912G c3912g2 = c3912g;
        Object obj = c3912g2.f12003p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c3912g2.f12004q0;
        if (i11 != 0) {
            if (i11 == 1) {
                C16557y c16557y3 = c3912g2.f12002o0;
                interfaceC13772l = c3912g2.f12001Z;
                C3935J4 c3935j5 = (C3935J4) c3912g2.f12000Y;
                AbstractC9233X.m9807c(obj);
                c16557y = c16557y3;
                c3935j4 = c3935j5;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c16557y2 = (C16557y) c3912g2.f12000Y;
                AbstractC9233X.m9807c(obj);
            }
            c16557y = c16557y2;
            return new C7550o(AbstractC9125E4.m9659a(0.0f, c16557y.f51286Y));
        }
        AbstractC9233X.m9807c(obj);
        if (c3935j4.m4635a() < 0.01f || c3935j4.m4635a() == 1.0f) {
            return new C7550o(0L);
        }
        c16557y = new C16557y();
        c16557y.f51286Y = f10;
        if (c13796x != null && Math.abs(f10) > 1.0f) {
            C16557y c16557y4 = new C16557y();
            C13774m c13774mM15237b = AbstractC13758e.m15237b(0.0f, f10, 28);
            C0146w c0146w = new C0146w(c16557y4, c3935j4, c16557y, 17);
            c3912g2.f12000Y = c3935j4;
            c3912g2.f12001Z = interfaceC13772l;
            c3912g2.f12002o0 = c16557y;
            c3912g2.f12004q0 = 1;
            if (AbstractC13758e.m15241f(c13774mM15237b, c13796x, false, c0146w, c3912g2) == enumC19250a) {
                return enumC19250a;
            }
        }
        InterfaceC13772l interfaceC13772l2 = interfaceC13772l;
        if (interfaceC13772l2 != null && c3935j4.f12117c.m6409g() < 0.0f) {
            float fM6409g = c3935j4.f12117c.m6409g();
            C5994b0 c5994b0 = c3935j4.f12115a;
            if (fM6409g > c5994b0.m6409g()) {
                C13774m c13774mM15237b2 = AbstractC13758e.m15237b(c3935j4.f12117c.m6409g(), 0.0f, 30);
                Float f11 = new Float(c3935j4.m4635a() < 0.5f ? 0.0f : c5994b0.m6409g());
                C0254h0 c0254h0 = new C0254h0(c3935j4, 28);
                c3912g2.f12000Y = c16557y;
                c3912g2.f12001Z = null;
                c3912g2.f12002o0 = null;
                c3912g2.f12004q0 = 2;
                if (AbstractC13758e.m15244i(c13774mM15237b2, f11, interfaceC13772l2, false, c0254h0, c3912g2, 4) == enumC19250a) {
                    return enumC19250a;
                }
                c16557y2 = c16557y;
                c16557y = c16557y2;
            }
        }
        return new C7550o(AbstractC9125E4.m9659a(0.0f, c16557y.f51286Y));
    }

    /* JADX INFO: renamed from: h */
    public static final C3935J4 m4626h(C6021p c6021p) {
        Object[] objArr = new Object[0];
        C21585H c21585h = C3935J4.f12114d;
        boolean zM6536c = c6021p.m6536c(-3.4028235E38f) | c6021p.m6536c(0.0f) | c6021p.m6536c(0.0f);
        Object objM6514H = c6021p.m6514H();
        if (zM6536c || objM6514H == C6013l.f19514a) {
            objM6514H = new C3906F(-3.4028235E38f, 0.0f, 0.0f);
            c6021p.m6537c0(objM6514H);
        }
        return (C3935J4) AbstractC9834X3.m10481d(objArr, c21585h, null, (InterfaceC1426a) objM6514H, c6021p, 0, 4);
    }
}
