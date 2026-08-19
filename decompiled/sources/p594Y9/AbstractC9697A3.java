package p594Y9;

import kotlin.jvm.internal.AbstractC16544l;
import p042Bf.C1276r;
import p049Bm.InterfaceC1426a;
import p124Ei.C2465M0;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p229J0.AbstractC3984T1;
import p229J0.C4108p0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p406Qg.C6691B;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p547Wc.AbstractC8798i;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p919o8.C17982j1;

/* JADX INFO: renamed from: Y9.A3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9697A3 {
    /* JADX INFO: renamed from: a */
    public static final void m10286a(int i10, InterfaceC1426a onClick, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i11;
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(386782351);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onClick) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            interfaceC10459q = C10456n.f30959Y;
            m10288c(onClick, interfaceC10459q, AbstractC8798i.f26921a, c6021p, (i12 & 14) | 384 | (i12 & 112), 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2465M0(onClick, interfaceC10459q, i10, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10287b(int i10, InterfaceC1426a onClick, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i11;
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(-1075665478);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onClick) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            m10288c(onClick, interfaceC10459q, AbstractC8798i.f26922b, c6021p, (i11 & 14) | 384 | (i11 & 112), 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2465M0(onClick, interfaceC10459q, i10, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:46:0x009b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m10288c(InterfaceC1426a onClick, InterfaceC10459q interfaceC10459q, C8410b c8410b, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        InterfaceC10459q interfaceC10459q3;
        Object objM6514H;
        C5975S c5975s;
        InterfaceC5985X interfaceC5985X;
        boolean z6;
        Object objM6514H2;
        InterfaceC10459q interfaceC10459q4;
        C6018n0 c6018n0M6555r;
        int i13;
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(-1148146618);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & 48) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                if (c6021p.m6545h(c8410b)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i12 & 147) == 146 || !c6021p.m6562y()) {
                if (i14 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                c6021p.m6524S(-190916454);
                objM6514H = c6021p.m6514H();
                c5975s = C6013l.f19514a;
                if (objM6514H == c5975s) {
                    objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H);
                }
                interfaceC5985X = (InterfaceC5985X) objM6514H;
                c6021p.m6553p(false);
                c6021p.m6524S(-190914644);
                if ((i12 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objM6514H2 = c6021p.m6514H();
                if (z6 || objM6514H2 == c5975s) {
                    objM6514H2 = new C6691B(interfaceC5985X, onClick);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H2, interfaceC10459q3, !((Boolean) interfaceC5985X.getValue()).booleanValue(), null, null, AbstractC8411c.m8969c(-998825015, c6021p, new C4108p0(c8410b, 6)), c6021p, (i12 & 112) | 196608, 24);
                interfaceC10459q4 = interfaceC10459q3;
            } else {
                c6021p.m6517L();
                interfaceC10459q4 = interfaceC10459q2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C1276r(onClick, interfaceC10459q4, c8410b, i10, i11, 5);
            }
        }
        i12 |= 48;
        interfaceC10459q2 = interfaceC10459q;
        if ((i10 & 384) == 0) {
            if (c6021p.m6545h(c8410b)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 147) == 146) {
            if (i14 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            c6021p.m6524S(-190916454);
            objM6514H = c6021p.m6514H();
            c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            interfaceC5985X = (InterfaceC5985X) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(-190914644);
            if ((i12 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            objM6514H2 = c6021p.m6514H();
            if (z6) {
                objM6514H2 = new C6691B(interfaceC5985X, onClick);
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = new C6691B(interfaceC5985X, onClick);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H2, interfaceC10459q3, !((Boolean) interfaceC5985X.getValue()).booleanValue(), null, null, AbstractC8411c.m8969c(-998825015, c6021p, new C4108p0(c8410b, 6)), c6021p, (i12 & 112) | 196608, 24);
            interfaceC10459q4 = interfaceC10459q3;
        } else {
            if (i14 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            c6021p.m6524S(-190916454);
            objM6514H = c6021p.m6514H();
            c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            interfaceC5985X = (InterfaceC5985X) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(-190914644);
            if ((i12 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            objM6514H2 = c6021p.m6514H();
            if (z6) {
                objM6514H2 = new C6691B(interfaceC5985X, onClick);
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = new C6691B(interfaceC5985X, onClick);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H2, interfaceC10459q3, !((Boolean) interfaceC5985X.getValue()).booleanValue(), null, null, AbstractC8411c.m8969c(-998825015, c6021p, new C4108p0(c8410b, 6)), c6021p, (i12 & 112) | 196608, 24);
            interfaceC10459q4 = interfaceC10459q3;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1276r(onClick, interfaceC10459q4, c8410b, i10, i11, 5);
        }
    }

    /* JADX INFO: renamed from: d */
    public static C17982j1 m10289d(C3676s c3676s) {
        try {
            return new C17982j1(c3676s.m4395w("duration").mo4382p(), c3676s.m4395w("start").mo4382p());
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Ssl", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Ssl", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Ssl", e12);
        }
    }
}
