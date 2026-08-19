package p523V9;

import cd.C11704d;
import cd.C11705e;
import cd.C11706f;
import cd.C11709i;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0187M0;
import p025An.C0644w;
import p042Bf.C1268j;
import p042Bf.C1276r;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p145Ff.C2728f;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p397Q5.C6572a;
import p397Q5.C6579h;
import p397Q5.EnumC6578g;
import p397Q5.InterfaceC6574c;
import p492U1.InterfaceC7537b;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p587Y1.AbstractC9582h;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p758g0.C13740P;
import p774h1.C14343V;

/* JADX INFO: renamed from: V9.t4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8198t4 {
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:52:0x0115  */
    /* JADX WARN: Code duplicated, block: B:53:0x0117  */
    /* JADX WARN: Code duplicated, block: B:56:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x0120  */
    /* JADX WARN: Code duplicated, block: B:62:0x0157  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m8798a(C11709i state, InterfaceC10459q interfaceC10459q, C8410b c8410b, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        InterfaceC10459q interfaceC10459q3;
        Object objM6514H;
        C5975S c5975s;
        C13740P c13740p;
        InterfaceC5985X interfaceC5985X;
        Object objM6514H2;
        InterfaceC5985X interfaceC5985X2;
        Object objM6514H3;
        boolean z6;
        Object objM6514H4;
        InterfaceC10459q interfaceC10459q4;
        C6018n0 c6018n0M6555r;
        int i13;
        AbstractC16544l.m18094g(state, "state");
        c6021p.m6526U(-1111768947);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(state) ? 4 : 2) | i10;
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
                c6021p.m6524S(212456615);
                objM6514H = c6021p.m6514H();
                c5975s = C6013l.f19514a;
                if (objM6514H == c5975s) {
                    objM6514H = new C13740P(Boolean.FALSE);
                    c6021p.m6537c0(objM6514H);
                }
                c13740p = (C13740P) objM6514H;
                c6021p.m6553p(false);
                interfaceC5985X = state.f35521b;
                c13740p.f43331c.setValue(Boolean.valueOf(((C11705e) interfaceC5985X.getValue()).f35513a));
                if (((Boolean) c13740p.f43330b.getValue()).booleanValue() || ((Boolean) c13740p.f43331c.getValue()).booleanValue()) {
                    c6021p.m6524S(212463376);
                    objM6514H2 = c6021p.m6514H();
                    if (objM6514H2 == c5975s) {
                        objM6514H2 = C5997d.m6430Q(new C14343V(C14343V.f45023b), C5975S.f19448r0);
                        c6021p.m6537c0(objM6514H2);
                    }
                    interfaceC5985X2 = (InterfaceC5985X) objM6514H2;
                    c6021p.m6553p(false);
                    long j10 = ((C11705e) interfaceC5985X.getValue()).f35514b;
                    InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
                    c6021p.m6524S(212469856);
                    objM6514H3 = c6021p.m6514H();
                    if (objM6514H3 == c5975s) {
                        objM6514H3 = new C2728f(interfaceC5985X2, 10);
                        c6021p.m6537c0(objM6514H3);
                    }
                    c6021p.m6553p(false);
                    C11706f c11706f = new C11706f(j10, interfaceC7537b, (InterfaceC1439n) objM6514H3);
                    c6021p.m6524S(212477360);
                    if ((i12 & 14) == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objM6514H4 = c6021p.m6514H();
                    if (z6 || objM6514H4 == c5975s) {
                        objM6514H4 = new C11704d(state, 0);
                        c6021p.m6537c0(objM6514H4);
                    }
                    c6021p.m6553p(false);
                    AbstractC9582h.m10129a(c11706f, (InterfaceC1426a) objM6514H4, null, AbstractC8411c.m8969c(-271665612, c6021p, new C1268j((Object) c13740p, (Object) interfaceC5985X2, interfaceC10459q3, (InterfaceC1440o) c8410b, 15)), c6021p, 3072, 4);
                }
                interfaceC10459q4 = interfaceC10459q3;
            } else {
                c6021p.m6517L();
                interfaceC10459q4 = interfaceC10459q2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C1276r(state, interfaceC10459q4, c8410b, i10, i11, 9);
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
            c6021p.m6524S(212456615);
            objM6514H = c6021p.m6514H();
            c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = new C13740P(Boolean.FALSE);
                c6021p.m6537c0(objM6514H);
            }
            c13740p = (C13740P) objM6514H;
            c6021p.m6553p(false);
            interfaceC5985X = state.f35521b;
            c13740p.f43331c.setValue(Boolean.valueOf(((C11705e) interfaceC5985X.getValue()).f35513a));
            if (((Boolean) c13740p.f43330b.getValue()).booleanValue()) {
                c6021p.m6524S(212463376);
                objM6514H2 = c6021p.m6514H();
                if (objM6514H2 == c5975s) {
                    objM6514H2 = C5997d.m6430Q(new C14343V(C14343V.f45023b), C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H2);
                }
                interfaceC5985X2 = (InterfaceC5985X) objM6514H2;
                c6021p.m6553p(false);
                long j11 = ((C11705e) interfaceC5985X.getValue()).f35514b;
                InterfaceC7537b interfaceC7537b2 = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
                c6021p.m6524S(212469856);
                objM6514H3 = c6021p.m6514H();
                if (objM6514H3 == c5975s) {
                    objM6514H3 = new C2728f(interfaceC5985X2, 10);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                C11706f c11706f2 = new C11706f(j11, interfaceC7537b2, (InterfaceC1439n) objM6514H3);
                c6021p.m6524S(212477360);
                if ((i12 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objM6514H4 = c6021p.m6514H();
                if (z6) {
                    objM6514H4 = new C11704d(state, 0);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    objM6514H4 = new C11704d(state, 0);
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                AbstractC9582h.m10129a(c11706f2, (InterfaceC1426a) objM6514H4, null, AbstractC8411c.m8969c(-271665612, c6021p, new C1268j((Object) c13740p, (Object) interfaceC5985X2, interfaceC10459q3, (InterfaceC1440o) c8410b, 15)), c6021p, 3072, 4);
            } else {
                c6021p.m6524S(212463376);
                objM6514H2 = c6021p.m6514H();
                if (objM6514H2 == c5975s) {
                    objM6514H2 = C5997d.m6430Q(new C14343V(C14343V.f45023b), C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H2);
                }
                interfaceC5985X2 = (InterfaceC5985X) objM6514H2;
                c6021p.m6553p(false);
                long j12 = ((C11705e) interfaceC5985X.getValue()).f35514b;
                InterfaceC7537b interfaceC7537b3 = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
                c6021p.m6524S(212469856);
                objM6514H3 = c6021p.m6514H();
                if (objM6514H3 == c5975s) {
                    objM6514H3 = new C2728f(interfaceC5985X2, 10);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                C11706f c11706f3 = new C11706f(j12, interfaceC7537b3, (InterfaceC1439n) objM6514H3);
                c6021p.m6524S(212477360);
                if ((i12 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objM6514H4 = c6021p.m6514H();
                if (z6) {
                    objM6514H4 = new C11704d(state, 0);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    objM6514H4 = new C11704d(state, 0);
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                AbstractC9582h.m10129a(c11706f3, (InterfaceC1426a) objM6514H4, null, AbstractC8411c.m8969c(-271665612, c6021p, new C1268j((Object) c13740p, (Object) interfaceC5985X2, interfaceC10459q3, (InterfaceC1440o) c8410b, 15)), c6021p, 3072, 4);
            }
            interfaceC10459q4 = interfaceC10459q3;
        } else {
            if (i14 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            c6021p.m6524S(212456615);
            objM6514H = c6021p.m6514H();
            c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = new C13740P(Boolean.FALSE);
                c6021p.m6537c0(objM6514H);
            }
            c13740p = (C13740P) objM6514H;
            c6021p.m6553p(false);
            interfaceC5985X = state.f35521b;
            c13740p.f43331c.setValue(Boolean.valueOf(((C11705e) interfaceC5985X.getValue()).f35513a));
            if (((Boolean) c13740p.f43330b.getValue()).booleanValue()) {
                c6021p.m6524S(212463376);
                objM6514H2 = c6021p.m6514H();
                if (objM6514H2 == c5975s) {
                    objM6514H2 = C5997d.m6430Q(new C14343V(C14343V.f45023b), C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H2);
                }
                interfaceC5985X2 = (InterfaceC5985X) objM6514H2;
                c6021p.m6553p(false);
                long j13 = ((C11705e) interfaceC5985X.getValue()).f35514b;
                InterfaceC7537b interfaceC7537b4 = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
                c6021p.m6524S(212469856);
                objM6514H3 = c6021p.m6514H();
                if (objM6514H3 == c5975s) {
                    objM6514H3 = new C2728f(interfaceC5985X2, 10);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                C11706f c11706f4 = new C11706f(j13, interfaceC7537b4, (InterfaceC1439n) objM6514H3);
                c6021p.m6524S(212477360);
                if ((i12 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objM6514H4 = c6021p.m6514H();
                if (z6) {
                    objM6514H4 = new C11704d(state, 0);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    objM6514H4 = new C11704d(state, 0);
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                AbstractC9582h.m10129a(c11706f4, (InterfaceC1426a) objM6514H4, null, AbstractC8411c.m8969c(-271665612, c6021p, new C1268j((Object) c13740p, (Object) interfaceC5985X2, interfaceC10459q3, (InterfaceC1440o) c8410b, 15)), c6021p, 3072, 4);
            } else {
                c6021p.m6524S(212463376);
                objM6514H2 = c6021p.m6514H();
                if (objM6514H2 == c5975s) {
                    objM6514H2 = C5997d.m6430Q(new C14343V(C14343V.f45023b), C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H2);
                }
                interfaceC5985X2 = (InterfaceC5985X) objM6514H2;
                c6021p.m6553p(false);
                long j14 = ((C11705e) interfaceC5985X.getValue()).f35514b;
                InterfaceC7537b interfaceC7537b5 = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
                c6021p.m6524S(212469856);
                objM6514H3 = c6021p.m6514H();
                if (objM6514H3 == c5975s) {
                    objM6514H3 = new C2728f(interfaceC5985X2, 10);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                C11706f c11706f5 = new C11706f(j14, interfaceC7537b5, (InterfaceC1439n) objM6514H3);
                c6021p.m6524S(212477360);
                if ((i12 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objM6514H4 = c6021p.m6514H();
                if (z6) {
                    objM6514H4 = new C11704d(state, 0);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    objM6514H4 = new C11704d(state, 0);
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                AbstractC9582h.m10129a(c11706f5, (InterfaceC1426a) objM6514H4, null, AbstractC8411c.m8969c(-271665612, c6021p, new C1268j((Object) c13740p, (Object) interfaceC5985X2, interfaceC10459q3, (InterfaceC1440o) c8410b, 15)), c6021p, 3072, 4);
            }
            interfaceC10459q4 = interfaceC10459q3;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1276r(state, interfaceC10459q4, c8410b, i10, i11, 9);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final long m8799b(int i10, int i11, C6579h c6579h, EnumC6578g enumC6578g, C6579h c6579h2) {
        int i12;
        int i13;
        if (!AbstractC16544l.m18089b(c6579h, C6579h.f21264c)) {
            i10 = m8801d(c6579h.f21265a, enumC6578g);
            i11 = m8801d(c6579h.f21266b, enumC6578g);
        }
        InterfaceC6574c interfaceC6574c = c6579h2.f21265a;
        if ((interfaceC6574c instanceof C6572a) && i10 != Integer.MIN_VALUE && i10 != Integer.MAX_VALUE && i10 > (i13 = ((C6572a) interfaceC6574c).f21256a)) {
            i10 = i13;
        }
        InterfaceC6574c interfaceC6574c2 = c6579h2.f21266b;
        if ((interfaceC6574c2 instanceof C6572a) && i11 != Integer.MIN_VALUE && i11 != Integer.MAX_VALUE && i11 > (i12 = ((C6572a) interfaceC6574c2).f21256a)) {
            i11 = i12;
        }
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    /* JADX INFO: renamed from: c */
    public static final double m8800c(int i10, int i11, int i12, int i13, EnumC6578g enumC6578g) {
        double d10 = ((double) i12) / ((double) i10);
        double d11 = ((double) i13) / ((double) i11);
        int iOrdinal = enumC6578g.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d10, d11);
        }
        if (iOrdinal == 1) {
            return Math.min(d10, d11);
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: d */
    public static int m8801d(InterfaceC6574c interfaceC6574c, EnumC6578g enumC6578g) {
        if (interfaceC6574c instanceof C6572a) {
            return ((C6572a) interfaceC6574c).f21256a;
        }
        int iOrdinal = enumC6578g.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new C0644w();
    }
}
