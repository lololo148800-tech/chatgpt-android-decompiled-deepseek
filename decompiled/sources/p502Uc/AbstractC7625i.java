package p502Uc;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1439n;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p523V9.AbstractC8128k6;
import p537W0.C8410b;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Uc.i */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7625i {

    /* JADX INFO: renamed from: a */
    public static final long f24108a;

    /* JADX INFO: renamed from: b */
    public static final long f24109b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f24110c = 0;

    static {
        C21554a c21554a = C21555b.f68260Z;
        EnumC21557d enumC21557d = EnumC21557d.MILLISECONDS;
        f24108a = AbstractC8128k6.m8644j(500, enumC21557d);
        f24109b = AbstractC8128k6.m8644j(1500, enumC21557d);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:78:0x0100  */
    /* JADX WARN: Code duplicated, block: B:82:0x0109  */
    /* JADX WARN: Code duplicated, block: B:85:0x0116 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x011e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0142  */
    /* JADX WARN: Code duplicated, block: B:94:0x0164  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x009c, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static final void m7963a(List animationStates, boolean z6, long j10, long j11, C8410b c8410b, C6021p c6021p, int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        long j12;
        int i14;
        int i15;
        long j13;
        int i16;
        int i17;
        boolean z11;
        long j14;
        boolean zM6542f;
        Object objM6514H;
        InterfaceC5985X interfaceC5985X;
        boolean z12;
        long j15;
        boolean z13;
        long j16;
        boolean z14;
        boolean z15;
        boolean zM6542f2;
        Object objM6514H2;
        C6018n0 c6018n0M6555r;
        int i18;
        AbstractC16544l.m18094g(animationStates, "animationStates");
        c6021p.m6526U(61559512);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(animationStates) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 48) == 0) {
                z10 = z6;
                i12 |= c6021p.m6544g(z10) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    j12 = j10;
                    if (c6021p.m6540e(j12)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        j13 = j11;
                        if (c6021p.m6540e(j13)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 24576) == 0) {
                        if (c6021p.m6545h(c8410b)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i17 = i12;
                    if ((i17 & 9363) == 9362 || !c6021p.m6562y()) {
                        if (i19 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i13 != 0) {
                            j14 = f24108a;
                        } else {
                            j14 = j12;
                        }
                        if (i15 != 0) {
                            j13 = f24109b;
                        }
                        c6021p.m6524S(-2053205009);
                        zM6542f = c6021p.m6542f(animationStates);
                        objM6514H = c6021p.m6514H();
                        Object obj = C6013l.f19514a;
                        if (zM6542f || objM6514H == obj) {
                            objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                            c6021p.m6537c0(objM6514H);
                        }
                        interfaceC5985X = (InterfaceC5985X) objM6514H;
                        z12 = false;
                        c6021p.m6553p(false);
                        c6021p.m6524S(-2053202311);
                        if (animationStates.size() > 1) {
                            c6021p.m6524S(-2053200085);
                            if ((i17 & 112) == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            boolean zM6545h = z14 | c6021p.m6545h(animationStates);
                            if ((i17 & 896) == 256) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            zM6542f2 = ((i17 & 7168) == 2048) | zM6545h | z15 | c6021p.m6542f(interfaceC5985X);
                            objM6514H2 = c6021p.m6514H();
                            if (zM6542f2 || objM6514H2 == obj) {
                                Object c7623g = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                                c6021p.m6537c0(c7623g);
                                objM6514H2 = c7623g;
                            }
                            c6021p.m6553p(z12);
                            C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, animationStates);
                        } else {
                            j13 = j13;
                            z12 = false;
                            interfaceC5985X = interfaceC5985X;
                        }
                        c6021p.m6553p(z12);
                        c8410b.invoke(interfaceC5985X.getValue(), c6021p, Integer.valueOf((i17 >> 9) & 112));
                        j15 = j13;
                        z13 = z11;
                        j16 = j14;
                    } else {
                        c6021p.m6517L();
                        z13 = z10;
                        j16 = j12;
                        j15 = j13;
                    }
                    c6018n0M6555r = c6021p.m6555r();
                    if (c6018n0M6555r != null) {
                        c6018n0M6555r.f19536d = new C7624h(animationStates, z13, j16, j15, c8410b, i10, i11);
                    }
                }
                i12 |= 3072;
                j13 = j11;
                if ((i10 & 24576) == 0) {
                    if (c6021p.m6545h(c8410b)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i17 = i12;
                if ((i17 & 9363) == 9362) {
                    if (i19 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i13 != 0) {
                        j14 = f24108a;
                    } else {
                        j14 = j12;
                    }
                    if (i15 != 0) {
                        j13 = f24109b;
                    }
                    c6021p.m6524S(-2053205009);
                    zM6542f = c6021p.m6542f(animationStates);
                    objM6514H = c6021p.m6514H();
                    Object obj2 = C6013l.f19514a;
                    if (zM6542f) {
                        objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                        c6021p.m6537c0(objM6514H);
                    }
                    interfaceC5985X = (InterfaceC5985X) objM6514H;
                    z12 = false;
                    c6021p.m6553p(false);
                    c6021p.m6524S(-2053202311);
                    if (animationStates.size() > 1) {
                        c6021p.m6524S(-2053200085);
                        if ((i17 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean zM6545h2 = z14 | c6021p.m6545h(animationStates);
                        if ((i17 & 896) == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zM6542f2 = ((i17 & 7168) == 2048) | zM6545h2 | z15 | c6021p.m6542f(interfaceC5985X);
                        objM6514H2 = c6021p.m6514H();
                        if (zM6542f2) {
                            Object c7623g2 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                            c6021p.m6537c0(c7623g2);
                            objM6514H2 = c7623g2;
                        } else {
                            Object c7623g3 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                            c6021p.m6537c0(c7623g3);
                            objM6514H2 = c7623g3;
                        }
                        c6021p.m6553p(z12);
                        C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, animationStates);
                    } else {
                        j13 = j13;
                        z12 = false;
                        interfaceC5985X = interfaceC5985X;
                    }
                    c6021p.m6553p(z12);
                    c8410b.invoke(interfaceC5985X.getValue(), c6021p, Integer.valueOf((i17 >> 9) & 112));
                    j15 = j13;
                    z13 = z11;
                    j16 = j14;
                } else {
                    if (i19 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i13 != 0) {
                        j14 = f24108a;
                    } else {
                        j14 = j12;
                    }
                    if (i15 != 0) {
                        j13 = f24109b;
                    }
                    c6021p.m6524S(-2053205009);
                    zM6542f = c6021p.m6542f(animationStates);
                    objM6514H = c6021p.m6514H();
                    Object obj3 = C6013l.f19514a;
                    if (zM6542f) {
                        objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                        c6021p.m6537c0(objM6514H);
                    }
                    interfaceC5985X = (InterfaceC5985X) objM6514H;
                    z12 = false;
                    c6021p.m6553p(false);
                    c6021p.m6524S(-2053202311);
                    if (animationStates.size() > 1) {
                        c6021p.m6524S(-2053200085);
                        if ((i17 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean zM6545h3 = z14 | c6021p.m6545h(animationStates);
                        if ((i17 & 896) == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zM6542f2 = ((i17 & 7168) == 2048) | zM6545h3 | z15 | c6021p.m6542f(interfaceC5985X);
                        objM6514H2 = c6021p.m6514H();
                        if (zM6542f2) {
                            Object c7623g4 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                            c6021p.m6537c0(c7623g4);
                            objM6514H2 = c7623g4;
                        } else {
                            Object c7623g5 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                            c6021p.m6537c0(c7623g5);
                            objM6514H2 = c7623g5;
                        }
                        c6021p.m6553p(z12);
                        C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, animationStates);
                    } else {
                        j13 = j13;
                        z12 = false;
                        interfaceC5985X = interfaceC5985X;
                    }
                    c6021p.m6553p(z12);
                    c8410b.invoke(interfaceC5985X.getValue(), c6021p, Integer.valueOf((i17 >> 9) & 112));
                    j15 = j13;
                    z13 = z11;
                    j16 = j14;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C7624h(animationStates, z13, j16, j15, c8410b, i10, i11);
                }
            }
            i12 |= 384;
            j12 = j10;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    j13 = j11;
                    if (c6021p.m6540e(j13)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if (c6021p.m6545h(c8410b)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i17 = i12;
                if ((i17 & 9363) == 9362) {
                    if (i19 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i13 != 0) {
                        j14 = f24108a;
                    } else {
                        j14 = j12;
                    }
                    if (i15 != 0) {
                        j13 = f24109b;
                    }
                    c6021p.m6524S(-2053205009);
                    zM6542f = c6021p.m6542f(animationStates);
                    objM6514H = c6021p.m6514H();
                    Object obj4 = C6013l.f19514a;
                    if (zM6542f) {
                        objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                        c6021p.m6537c0(objM6514H);
                    }
                    interfaceC5985X = (InterfaceC5985X) objM6514H;
                    z12 = false;
                    c6021p.m6553p(false);
                    c6021p.m6524S(-2053202311);
                    if (animationStates.size() > 1) {
                        c6021p.m6524S(-2053200085);
                        if ((i17 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean zM6545h4 = z14 | c6021p.m6545h(animationStates);
                        if ((i17 & 896) == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zM6542f2 = ((i17 & 7168) == 2048) | zM6545h4 | z15 | c6021p.m6542f(interfaceC5985X);
                        objM6514H2 = c6021p.m6514H();
                        if (zM6542f2) {
                            Object c7623g6 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                            c6021p.m6537c0(c7623g6);
                            objM6514H2 = c7623g6;
                        } else {
                            Object c7623g7 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                            c6021p.m6537c0(c7623g7);
                            objM6514H2 = c7623g7;
                        }
                        c6021p.m6553p(z12);
                        C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, animationStates);
                    } else {
                        j13 = j13;
                        z12 = false;
                        interfaceC5985X = interfaceC5985X;
                    }
                    c6021p.m6553p(z12);
                    c8410b.invoke(interfaceC5985X.getValue(), c6021p, Integer.valueOf((i17 >> 9) & 112));
                    j15 = j13;
                    z13 = z11;
                    j16 = j14;
                } else {
                    if (i19 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i13 != 0) {
                        j14 = f24108a;
                    } else {
                        j14 = j12;
                    }
                    if (i15 != 0) {
                        j13 = f24109b;
                    }
                    c6021p.m6524S(-2053205009);
                    zM6542f = c6021p.m6542f(animationStates);
                    objM6514H = c6021p.m6514H();
                    Object obj5 = C6013l.f19514a;
                    if (zM6542f) {
                        objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                        c6021p.m6537c0(objM6514H);
                    }
                    interfaceC5985X = (InterfaceC5985X) objM6514H;
                    z12 = false;
                    c6021p.m6553p(false);
                    c6021p.m6524S(-2053202311);
                    if (animationStates.size() > 1) {
                        c6021p.m6524S(-2053200085);
                        if ((i17 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean zM6545h5 = z14 | c6021p.m6545h(animationStates);
                        if ((i17 & 896) == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zM6542f2 = ((i17 & 7168) == 2048) | zM6545h5 | z15 | c6021p.m6542f(interfaceC5985X);
                        objM6514H2 = c6021p.m6514H();
                        if (zM6542f2) {
                            Object c7623g8 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                            c6021p.m6537c0(c7623g8);
                            objM6514H2 = c7623g8;
                        } else {
                            Object c7623g9 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                            c6021p.m6537c0(c7623g9);
                            objM6514H2 = c7623g9;
                        }
                        c6021p.m6553p(z12);
                        C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, animationStates);
                    } else {
                        j13 = j13;
                        z12 = false;
                        interfaceC5985X = interfaceC5985X;
                    }
                    c6021p.m6553p(z12);
                    c8410b.invoke(interfaceC5985X.getValue(), c6021p, Integer.valueOf((i17 >> 9) & 112));
                    j15 = j13;
                    z13 = z11;
                    j16 = j14;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C7624h(animationStates, z13, j16, j15, c8410b, i10, i11);
                }
            }
            i12 |= 3072;
            j13 = j11;
            if ((i10 & 24576) == 0) {
                if (c6021p.m6545h(c8410b)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            i17 = i12;
            if ((i17 & 9363) == 9362) {
                if (i19 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i13 != 0) {
                    j14 = f24108a;
                } else {
                    j14 = j12;
                }
                if (i15 != 0) {
                    j13 = f24109b;
                }
                c6021p.m6524S(-2053205009);
                zM6542f = c6021p.m6542f(animationStates);
                objM6514H = c6021p.m6514H();
                Object obj6 = C6013l.f19514a;
                if (zM6542f) {
                    objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H);
                }
                interfaceC5985X = (InterfaceC5985X) objM6514H;
                z12 = false;
                c6021p.m6553p(false);
                c6021p.m6524S(-2053202311);
                if (animationStates.size() > 1) {
                    c6021p.m6524S(-2053200085);
                    if ((i17 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zM6545h6 = z14 | c6021p.m6545h(animationStates);
                    if ((i17 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM6542f2 = ((i17 & 7168) == 2048) | zM6545h6 | z15 | c6021p.m6542f(interfaceC5985X);
                    objM6514H2 = c6021p.m6514H();
                    if (zM6542f2) {
                        Object c7623g10 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                        c6021p.m6537c0(c7623g10);
                        objM6514H2 = c7623g10;
                    } else {
                        Object c7623g11 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                        c6021p.m6537c0(c7623g11);
                        objM6514H2 = c7623g11;
                    }
                    c6021p.m6553p(z12);
                    C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, animationStates);
                } else {
                    j13 = j13;
                    z12 = false;
                    interfaceC5985X = interfaceC5985X;
                }
                c6021p.m6553p(z12);
                c8410b.invoke(interfaceC5985X.getValue(), c6021p, Integer.valueOf((i17 >> 9) & 112));
                j15 = j13;
                z13 = z11;
                j16 = j14;
            } else {
                if (i19 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i13 != 0) {
                    j14 = f24108a;
                } else {
                    j14 = j12;
                }
                if (i15 != 0) {
                    j13 = f24109b;
                }
                c6021p.m6524S(-2053205009);
                zM6542f = c6021p.m6542f(animationStates);
                objM6514H = c6021p.m6514H();
                Object obj7 = C6013l.f19514a;
                if (zM6542f) {
                    objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H);
                }
                interfaceC5985X = (InterfaceC5985X) objM6514H;
                z12 = false;
                c6021p.m6553p(false);
                c6021p.m6524S(-2053202311);
                if (animationStates.size() > 1) {
                    c6021p.m6524S(-2053200085);
                    if ((i17 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zM6545h7 = z14 | c6021p.m6545h(animationStates);
                    if ((i17 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM6542f2 = ((i17 & 7168) == 2048) | zM6545h7 | z15 | c6021p.m6542f(interfaceC5985X);
                    objM6514H2 = c6021p.m6514H();
                    if (zM6542f2) {
                        Object c7623g12 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                        c6021p.m6537c0(c7623g12);
                        objM6514H2 = c7623g12;
                    } else {
                        Object c7623g13 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                        c6021p.m6537c0(c7623g13);
                        objM6514H2 = c7623g13;
                    }
                    c6021p.m6553p(z12);
                    C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, animationStates);
                } else {
                    j13 = j13;
                    z12 = false;
                    interfaceC5985X = interfaceC5985X;
                }
                c6021p.m6553p(z12);
                c8410b.invoke(interfaceC5985X.getValue(), c6021p, Integer.valueOf((i17 >> 9) & 112));
                j15 = j13;
                z13 = z11;
                j16 = j14;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C7624h(animationStates, z13, j16, j15, c8410b, i10, i11);
            }
        }
        i12 |= 48;
        z10 = z6;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                j12 = j10;
                if (c6021p.m6540e(j12)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    j13 = j11;
                    if (c6021p.m6540e(j13)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if (c6021p.m6545h(c8410b)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i17 = i12;
                if ((i17 & 9363) == 9362) {
                    if (i19 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i13 != 0) {
                        j14 = f24108a;
                    } else {
                        j14 = j12;
                    }
                    if (i15 != 0) {
                        j13 = f24109b;
                    }
                    c6021p.m6524S(-2053205009);
                    zM6542f = c6021p.m6542f(animationStates);
                    objM6514H = c6021p.m6514H();
                    Object obj8 = C6013l.f19514a;
                    if (zM6542f) {
                        objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                        c6021p.m6537c0(objM6514H);
                    }
                    interfaceC5985X = (InterfaceC5985X) objM6514H;
                    z12 = false;
                    c6021p.m6553p(false);
                    c6021p.m6524S(-2053202311);
                    if (animationStates.size() > 1) {
                        c6021p.m6524S(-2053200085);
                        if ((i17 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean zM6545h8 = z14 | c6021p.m6545h(animationStates);
                        if ((i17 & 896) == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zM6542f2 = ((i17 & 7168) == 2048) | zM6545h8 | z15 | c6021p.m6542f(interfaceC5985X);
                        objM6514H2 = c6021p.m6514H();
                        if (zM6542f2) {
                            Object c7623g14 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                            c6021p.m6537c0(c7623g14);
                            objM6514H2 = c7623g14;
                        } else {
                            Object c7623g15 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                            c6021p.m6537c0(c7623g15);
                            objM6514H2 = c7623g15;
                        }
                        c6021p.m6553p(z12);
                        C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, animationStates);
                    } else {
                        j13 = j13;
                        z12 = false;
                        interfaceC5985X = interfaceC5985X;
                    }
                    c6021p.m6553p(z12);
                    c8410b.invoke(interfaceC5985X.getValue(), c6021p, Integer.valueOf((i17 >> 9) & 112));
                    j15 = j13;
                    z13 = z11;
                    j16 = j14;
                } else {
                    if (i19 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i13 != 0) {
                        j14 = f24108a;
                    } else {
                        j14 = j12;
                    }
                    if (i15 != 0) {
                        j13 = f24109b;
                    }
                    c6021p.m6524S(-2053205009);
                    zM6542f = c6021p.m6542f(animationStates);
                    objM6514H = c6021p.m6514H();
                    Object obj9 = C6013l.f19514a;
                    if (zM6542f) {
                        objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                        c6021p.m6537c0(objM6514H);
                    }
                    interfaceC5985X = (InterfaceC5985X) objM6514H;
                    z12 = false;
                    c6021p.m6553p(false);
                    c6021p.m6524S(-2053202311);
                    if (animationStates.size() > 1) {
                        c6021p.m6524S(-2053200085);
                        if ((i17 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean zM6545h9 = z14 | c6021p.m6545h(animationStates);
                        if ((i17 & 896) == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zM6542f2 = ((i17 & 7168) == 2048) | zM6545h9 | z15 | c6021p.m6542f(interfaceC5985X);
                        objM6514H2 = c6021p.m6514H();
                        if (zM6542f2) {
                            Object c7623g16 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                            c6021p.m6537c0(c7623g16);
                            objM6514H2 = c7623g16;
                        } else {
                            Object c7623g17 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                            c6021p.m6537c0(c7623g17);
                            objM6514H2 = c7623g17;
                        }
                        c6021p.m6553p(z12);
                        C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, animationStates);
                    } else {
                        j13 = j13;
                        z12 = false;
                        interfaceC5985X = interfaceC5985X;
                    }
                    c6021p.m6553p(z12);
                    c8410b.invoke(interfaceC5985X.getValue(), c6021p, Integer.valueOf((i17 >> 9) & 112));
                    j15 = j13;
                    z13 = z11;
                    j16 = j14;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C7624h(animationStates, z13, j16, j15, c8410b, i10, i11);
                }
            }
            i12 |= 3072;
            j13 = j11;
            if ((i10 & 24576) == 0) {
                if (c6021p.m6545h(c8410b)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            i17 = i12;
            if ((i17 & 9363) == 9362) {
                if (i19 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i13 != 0) {
                    j14 = f24108a;
                } else {
                    j14 = j12;
                }
                if (i15 != 0) {
                    j13 = f24109b;
                }
                c6021p.m6524S(-2053205009);
                zM6542f = c6021p.m6542f(animationStates);
                objM6514H = c6021p.m6514H();
                Object obj10 = C6013l.f19514a;
                if (zM6542f) {
                    objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H);
                }
                interfaceC5985X = (InterfaceC5985X) objM6514H;
                z12 = false;
                c6021p.m6553p(false);
                c6021p.m6524S(-2053202311);
                if (animationStates.size() > 1) {
                    c6021p.m6524S(-2053200085);
                    if ((i17 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zM6545h10 = z14 | c6021p.m6545h(animationStates);
                    if ((i17 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM6542f2 = ((i17 & 7168) == 2048) | zM6545h10 | z15 | c6021p.m6542f(interfaceC5985X);
                    objM6514H2 = c6021p.m6514H();
                    if (zM6542f2) {
                        Object c7623g18 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                        c6021p.m6537c0(c7623g18);
                        objM6514H2 = c7623g18;
                    } else {
                        Object c7623g19 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                        c6021p.m6537c0(c7623g19);
                        objM6514H2 = c7623g19;
                    }
                    c6021p.m6553p(z12);
                    C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, animationStates);
                } else {
                    j13 = j13;
                    z12 = false;
                    interfaceC5985X = interfaceC5985X;
                }
                c6021p.m6553p(z12);
                c8410b.invoke(interfaceC5985X.getValue(), c6021p, Integer.valueOf((i17 >> 9) & 112));
                j15 = j13;
                z13 = z11;
                j16 = j14;
            } else {
                if (i19 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i13 != 0) {
                    j14 = f24108a;
                } else {
                    j14 = j12;
                }
                if (i15 != 0) {
                    j13 = f24109b;
                }
                c6021p.m6524S(-2053205009);
                zM6542f = c6021p.m6542f(animationStates);
                objM6514H = c6021p.m6514H();
                Object obj11 = C6013l.f19514a;
                if (zM6542f) {
                    objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H);
                }
                interfaceC5985X = (InterfaceC5985X) objM6514H;
                z12 = false;
                c6021p.m6553p(false);
                c6021p.m6524S(-2053202311);
                if (animationStates.size() > 1) {
                    c6021p.m6524S(-2053200085);
                    if ((i17 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zM6545h11 = z14 | c6021p.m6545h(animationStates);
                    if ((i17 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM6542f2 = ((i17 & 7168) == 2048) | zM6545h11 | z15 | c6021p.m6542f(interfaceC5985X);
                    objM6514H2 = c6021p.m6514H();
                    if (zM6542f2) {
                        Object c7623g110 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                        c6021p.m6537c0(c7623g110);
                        objM6514H2 = c7623g110;
                    } else {
                        Object c7623g111 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                        c6021p.m6537c0(c7623g111);
                        objM6514H2 = c7623g111;
                    }
                    c6021p.m6553p(z12);
                    C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, animationStates);
                } else {
                    j13 = j13;
                    z12 = false;
                    interfaceC5985X = interfaceC5985X;
                }
                c6021p.m6553p(z12);
                c8410b.invoke(interfaceC5985X.getValue(), c6021p, Integer.valueOf((i17 >> 9) & 112));
                j15 = j13;
                z13 = z11;
                j16 = j14;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C7624h(animationStates, z13, j16, j15, c8410b, i10, i11);
            }
        }
        i12 |= 384;
        j12 = j10;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                j13 = j11;
                if (c6021p.m6540e(j13)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i10 & 24576) == 0) {
                if (c6021p.m6545h(c8410b)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            i17 = i12;
            if ((i17 & 9363) == 9362) {
                if (i19 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i13 != 0) {
                    j14 = f24108a;
                } else {
                    j14 = j12;
                }
                if (i15 != 0) {
                    j13 = f24109b;
                }
                c6021p.m6524S(-2053205009);
                zM6542f = c6021p.m6542f(animationStates);
                objM6514H = c6021p.m6514H();
                Object obj12 = C6013l.f19514a;
                if (zM6542f) {
                    objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H);
                }
                interfaceC5985X = (InterfaceC5985X) objM6514H;
                z12 = false;
                c6021p.m6553p(false);
                c6021p.m6524S(-2053202311);
                if (animationStates.size() > 1) {
                    c6021p.m6524S(-2053200085);
                    if ((i17 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zM6545h12 = z14 | c6021p.m6545h(animationStates);
                    if ((i17 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM6542f2 = ((i17 & 7168) == 2048) | zM6545h12 | z15 | c6021p.m6542f(interfaceC5985X);
                    objM6514H2 = c6021p.m6514H();
                    if (zM6542f2) {
                        Object c7623g112 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                        c6021p.m6537c0(c7623g112);
                        objM6514H2 = c7623g112;
                    } else {
                        Object c7623g113 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                        c6021p.m6537c0(c7623g113);
                        objM6514H2 = c7623g113;
                    }
                    c6021p.m6553p(z12);
                    C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, animationStates);
                } else {
                    j13 = j13;
                    z12 = false;
                    interfaceC5985X = interfaceC5985X;
                }
                c6021p.m6553p(z12);
                c8410b.invoke(interfaceC5985X.getValue(), c6021p, Integer.valueOf((i17 >> 9) & 112));
                j15 = j13;
                z13 = z11;
                j16 = j14;
            } else {
                if (i19 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i13 != 0) {
                    j14 = f24108a;
                } else {
                    j14 = j12;
                }
                if (i15 != 0) {
                    j13 = f24109b;
                }
                c6021p.m6524S(-2053205009);
                zM6542f = c6021p.m6542f(animationStates);
                objM6514H = c6021p.m6514H();
                Object obj13 = C6013l.f19514a;
                if (zM6542f) {
                    objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H);
                }
                interfaceC5985X = (InterfaceC5985X) objM6514H;
                z12 = false;
                c6021p.m6553p(false);
                c6021p.m6524S(-2053202311);
                if (animationStates.size() > 1) {
                    c6021p.m6524S(-2053200085);
                    if ((i17 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zM6545h13 = z14 | c6021p.m6545h(animationStates);
                    if ((i17 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM6542f2 = ((i17 & 7168) == 2048) | zM6545h13 | z15 | c6021p.m6542f(interfaceC5985X);
                    objM6514H2 = c6021p.m6514H();
                    if (zM6542f2) {
                        Object c7623g114 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                        c6021p.m6537c0(c7623g114);
                        objM6514H2 = c7623g114;
                    } else {
                        Object c7623g115 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                        c6021p.m6537c0(c7623g115);
                        objM6514H2 = c7623g115;
                    }
                    c6021p.m6553p(z12);
                    C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, animationStates);
                } else {
                    j13 = j13;
                    z12 = false;
                    interfaceC5985X = interfaceC5985X;
                }
                c6021p.m6553p(z12);
                c8410b.invoke(interfaceC5985X.getValue(), c6021p, Integer.valueOf((i17 >> 9) & 112));
                j15 = j13;
                z13 = z11;
                j16 = j14;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C7624h(animationStates, z13, j16, j15, c8410b, i10, i11);
            }
        }
        i12 |= 3072;
        j13 = j11;
        if ((i10 & 24576) == 0) {
            if (c6021p.m6545h(c8410b)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i12 |= i18;
        }
        i17 = i12;
        if ((i17 & 9363) == 9362) {
            if (i19 != 0) {
                z11 = true;
            } else {
                z11 = z10;
            }
            if (i13 != 0) {
                j14 = f24108a;
            } else {
                j14 = j12;
            }
            if (i15 != 0) {
                j13 = f24109b;
            }
            c6021p.m6524S(-2053205009);
            zM6542f = c6021p.m6542f(animationStates);
            objM6514H = c6021p.m6514H();
            Object obj14 = C6013l.f19514a;
            if (zM6542f) {
                objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            interfaceC5985X = (InterfaceC5985X) objM6514H;
            z12 = false;
            c6021p.m6553p(false);
            c6021p.m6524S(-2053202311);
            if (animationStates.size() > 1) {
                c6021p.m6524S(-2053200085);
                if ((i17 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean zM6545h14 = z14 | c6021p.m6545h(animationStates);
                if ((i17 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM6542f2 = ((i17 & 7168) == 2048) | zM6545h14 | z15 | c6021p.m6542f(interfaceC5985X);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2) {
                    Object c7623g116 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                    c6021p.m6537c0(c7623g116);
                    objM6514H2 = c7623g116;
                } else {
                    Object c7623g117 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                    c6021p.m6537c0(c7623g117);
                    objM6514H2 = c7623g117;
                }
                c6021p.m6553p(z12);
                C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, animationStates);
            } else {
                j13 = j13;
                z12 = false;
                interfaceC5985X = interfaceC5985X;
            }
            c6021p.m6553p(z12);
            c8410b.invoke(interfaceC5985X.getValue(), c6021p, Integer.valueOf((i17 >> 9) & 112));
            j15 = j13;
            z13 = z11;
            j16 = j14;
        } else {
            if (i19 != 0) {
                z11 = true;
            } else {
                z11 = z10;
            }
            if (i13 != 0) {
                j14 = f24108a;
            } else {
                j14 = j12;
            }
            if (i15 != 0) {
                j13 = f24109b;
            }
            c6021p.m6524S(-2053205009);
            zM6542f = c6021p.m6542f(animationStates);
            objM6514H = c6021p.m6514H();
            Object obj15 = C6013l.f19514a;
            if (zM6542f) {
                objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = C5997d.m6430Q(AbstractC17680n.m19341Q(animationStates), C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            interfaceC5985X = (InterfaceC5985X) objM6514H;
            z12 = false;
            c6021p.m6553p(false);
            c6021p.m6524S(-2053202311);
            if (animationStates.size() > 1) {
                c6021p.m6524S(-2053200085);
                if ((i17 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean zM6545h15 = z14 | c6021p.m6545h(animationStates);
                if ((i17 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM6542f2 = ((i17 & 7168) == 2048) | zM6545h15 | z15 | c6021p.m6542f(interfaceC5985X);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2) {
                    Object c7623g118 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                    c6021p.m6537c0(c7623g118);
                    objM6514H2 = c7623g118;
                } else {
                    Object c7623g119 = new C7623g(z11, animationStates, j14, j13, interfaceC5985X, null);
                    c6021p.m6537c0(c7623g119);
                    objM6514H2 = c7623g119;
                }
                c6021p.m6553p(z12);
                C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, animationStates);
            } else {
                j13 = j13;
                z12 = false;
                interfaceC5985X = interfaceC5985X;
            }
            c6021p.m6553p(z12);
            c8410b.invoke(interfaceC5985X.getValue(), c6021p, Integer.valueOf((i17 >> 9) & 112));
            j15 = j13;
            z13 = z11;
            j16 = j14;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C7624h(animationStates, z13, j16, j15, c8410b, i10, i11);
        }
    }
}
