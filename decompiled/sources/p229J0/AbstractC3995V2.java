package p229J0;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import p049Bm.InterfaceC1436k;
import p193Hf.C3350b0;
import p302M0.AbstractC5235B;
import p349O0.C5997d;
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
import p758g0.AbstractC13764h;
import p774h1.C14365u;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: J0.V2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3995V2 {

    /* JADX INFO: renamed from: a */
    public static final float f12534a;

    /* JADX INFO: renamed from: b */
    public static final float f12535b = 12;

    /* JADX INFO: renamed from: c */
    public static final float f12536c;

    static {
        float f10 = 2;
        f12534a = f10;
        f12536c = f10;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x00fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x0103  */
    /* JADX WARN: Code duplicated, block: B:66:0x0107  */
    /* JADX WARN: Code duplicated, block: B:67:0x0125  */
    /* JADX WARN: Code duplicated, block: B:70:0x016d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0171  */
    /* JADX WARN: Code duplicated, block: B:76:0x018a  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m4711a(boolean z6, InterfaceC10459q interfaceC10459q, boolean z10, C3985T2 c3985t2, InterfaceC17406l interfaceC17406l, C6021p c6021p, int i10, int i11) {
        int i12;
        boolean z11;
        int i13;
        C10456n c10456n;
        C3949M0 c3949m0;
        C3985T2 c3985t3;
        boolean z12;
        C3985T2 c3985t4;
        InterfaceC17406l interfaceC17406l2;
        InterfaceC10459q interfaceC10459q2;
        float f10;
        InterfaceC5982V0 interfaceC5982V0M15260a;
        long j10;
        Object objM6435V;
        boolean zM6542f;
        Object objM6514H;
        InterfaceC10459q interfaceC10459q3;
        C3985T2 c3985t5;
        InterfaceC17406l interfaceC17406l3;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(408580840);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(null) ? 32 : 16;
        }
        int i14 = i12 | 384;
        int i15 = i11 & 8;
        if (i15 == 0) {
            if ((i10 & 3072) == 0) {
                z11 = z10;
                i14 |= c6021p.m6544g(z11) ? 2048 : 1024;
            }
            if ((i10 & 24576) == 0) {
                i14 |= 8192;
            }
            if (((i14 | 196608) & 74899) == 74898 || !c6021p.m6562y()) {
                c6021p.m6519N();
                i13 = i10 & 1;
                c10456n = C10456n.f30959Y;
                if (i13 != 0 || c6021p.m6561x()) {
                    boolean z13 = i15 == 0 ? z11 : true;
                    c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                    c3985t3 = c3949m0.f12216b0;
                    if (c3985t3 == null) {
                        float f11 = AbstractC5235B.f16994a;
                        c3985t3 = new C3985T2(AbstractC3959O0.m4661c(c3949m0, 26), AbstractC3959O0.m4661c(c3949m0, 19), C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)));
                        c3949m0.f12216b0 = c3985t3;
                    }
                    z12 = z13;
                    c3985t4 = c3985t3;
                    interfaceC17406l2 = null;
                    interfaceC10459q2 = c10456n;
                } else {
                    c6021p.m6517L();
                    interfaceC10459q2 = interfaceC10459q;
                    c3985t4 = c3985t2;
                    interfaceC17406l2 = interfaceC17406l;
                    z12 = z11;
                }
                c6021p.m6554q();
                if (z6) {
                    f10 = f12535b / 2;
                } else {
                    f10 = 0;
                }
                interfaceC5982V0M15260a = AbstractC13764h.m15260a(f10, AbstractC13758e.m15255t(100, 0, null, 6), null, c6021p, 48, 12);
                c3985t4.getClass();
                if (!z12 && z6) {
                    j10 = c3985t4.f12489a;
                } else if (!z12 && !z6) {
                    j10 = c3985t4.f12490b;
                } else if (z12 && z6) {
                    j10 = c3985t4.f12491c;
                } else {
                    j10 = c3985t4.f12492d;
                }
                if (z12) {
                    c6021p.m6524S(350067971);
                    objM6435V = AbstractC13474L.m14999a(j10, AbstractC13758e.m15255t(100, 0, null, 6), null, c6021p, 48, 12);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(350170674);
                    objM6435V = C5997d.m6435V(new C14365u(j10), c6021p);
                    c6021p.m6553p(false);
                }
                c6021p.m6524S(1327106656);
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459qM11249i = AbstractC10844c.m11249i(AbstractC10842a.m11233k(AbstractC10844c.m11259s(interfaceC10459q2.mo428M(c10456n).mo428M(c10456n), C10444b.f30938q0), f12534a), AbstractC5235B.f16994a);
                zM6542f = c6021p.m6542f(objM6435V) | c6021p.m6542f(interfaceC5982V0M15260a);
                objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == C6013l.f19514a) {
                    objM6514H = new C3350b0(objM6435V, 10, interfaceC5982V0M15260a);
                    c6021p.m6537c0(objM6514H);
                }
                AbstractC8455C.m9069a(0, (InterfaceC1436k) objM6514H, c6021p, interfaceC10459qM11249i);
                interfaceC10459q3 = interfaceC10459q2;
                z11 = z12;
                c3985t5 = c3985t4;
                interfaceC17406l3 = interfaceC17406l2;
            } else {
                c6021p.m6517L();
                interfaceC10459q3 = interfaceC10459q;
                c3985t5 = c3985t2;
                interfaceC17406l3 = interfaceC17406l;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C3990U2(z6, interfaceC10459q3, z11, c3985t5, interfaceC17406l3, i10, i11);
            }
        }
        i14 = i12 | 3456;
        z11 = z10;
        if ((i10 & 24576) == 0) {
            i14 |= 8192;
        }
        if (((i14 | 196608) & 74899) == 74898) {
            c6021p.m6519N();
            i13 = i10 & 1;
            c10456n = C10456n.f30959Y;
            if (i13 != 0) {
                if (i15 == 0) {
                }
                c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                c3985t3 = c3949m0.f12216b0;
                if (c3985t3 == null) {
                    float f12 = AbstractC5235B.f16994a;
                    c3985t3 = new C3985T2(AbstractC3959O0.m4661c(c3949m0, 26), AbstractC3959O0.m4661c(c3949m0, 19), C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)));
                    c3949m0.f12216b0 = c3985t3;
                }
                z12 = z13;
                c3985t4 = c3985t3;
                interfaceC17406l2 = null;
                interfaceC10459q2 = c10456n;
            } else {
                if (i15 == 0) {
                }
                c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                c3985t3 = c3949m0.f12216b0;
                if (c3985t3 == null) {
                    float f13 = AbstractC5235B.f16994a;
                    c3985t3 = new C3985T2(AbstractC3959O0.m4661c(c3949m0, 26), AbstractC3959O0.m4661c(c3949m0, 19), C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)));
                    c3949m0.f12216b0 = c3985t3;
                }
                z12 = z13;
                c3985t4 = c3985t3;
                interfaceC17406l2 = null;
                interfaceC10459q2 = c10456n;
            }
            c6021p.m6554q();
            if (z6) {
                f10 = f12535b / 2;
            } else {
                f10 = 0;
            }
            interfaceC5982V0M15260a = AbstractC13764h.m15260a(f10, AbstractC13758e.m15255t(100, 0, null, 6), null, c6021p, 48, 12);
            c3985t4.getClass();
            if (!z12) {
                if (!z12) {
                    if (z12) {
                        j10 = c3985t4.f12492d;
                    } else {
                        j10 = c3985t4.f12492d;
                    }
                } else if (z12) {
                    j10 = c3985t4.f12492d;
                } else {
                    j10 = c3985t4.f12492d;
                }
            } else if (!z12) {
                if (z12) {
                    j10 = c3985t4.f12492d;
                } else {
                    j10 = c3985t4.f12492d;
                }
            } else if (z12) {
                j10 = c3985t4.f12492d;
            } else {
                j10 = c3985t4.f12492d;
            }
            if (z12) {
                c6021p.m6524S(350067971);
                objM6435V = AbstractC13474L.m14999a(j10, AbstractC13758e.m15255t(100, 0, null, 6), null, c6021p, 48, 12);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(350170674);
                objM6435V = C5997d.m6435V(new C14365u(j10), c6021p);
                c6021p.m6553p(false);
            }
            c6021p.m6524S(1327106656);
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11249i2 = AbstractC10844c.m11249i(AbstractC10842a.m11233k(AbstractC10844c.m11259s(interfaceC10459q2.mo428M(c10456n).mo428M(c10456n), C10444b.f30938q0), f12534a), AbstractC5235B.f16994a);
            zM6542f = c6021p.m6542f(objM6435V) | c6021p.m6542f(interfaceC5982V0M15260a);
            objM6514H = c6021p.m6514H();
            if (zM6542f) {
                objM6514H = new C3350b0(objM6435V, 10, interfaceC5982V0M15260a);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C3350b0(objM6435V, 10, interfaceC5982V0M15260a);
                c6021p.m6537c0(objM6514H);
            }
            AbstractC8455C.m9069a(0, (InterfaceC1436k) objM6514H, c6021p, interfaceC10459qM11249i2);
            interfaceC10459q3 = interfaceC10459q2;
            z11 = z12;
            c3985t5 = c3985t4;
            interfaceC17406l3 = interfaceC17406l2;
        } else {
            c6021p.m6519N();
            i13 = i10 & 1;
            c10456n = C10456n.f30959Y;
            if (i13 != 0) {
                if (i15 == 0) {
                }
                c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                c3985t3 = c3949m0.f12216b0;
                if (c3985t3 == null) {
                    float f14 = AbstractC5235B.f16994a;
                    c3985t3 = new C3985T2(AbstractC3959O0.m4661c(c3949m0, 26), AbstractC3959O0.m4661c(c3949m0, 19), C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)));
                    c3949m0.f12216b0 = c3985t3;
                }
                z12 = z13;
                c3985t4 = c3985t3;
                interfaceC17406l2 = null;
                interfaceC10459q2 = c10456n;
            } else {
                if (i15 == 0) {
                }
                c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                c3985t3 = c3949m0.f12216b0;
                if (c3985t3 == null) {
                    float f15 = AbstractC5235B.f16994a;
                    c3985t3 = new C3985T2(AbstractC3959O0.m4661c(c3949m0, 26), AbstractC3959O0.m4661c(c3949m0, 19), C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)));
                    c3949m0.f12216b0 = c3985t3;
                }
                z12 = z13;
                c3985t4 = c3985t3;
                interfaceC17406l2 = null;
                interfaceC10459q2 = c10456n;
            }
            c6021p.m6554q();
            if (z6) {
                f10 = f12535b / 2;
            } else {
                f10 = 0;
            }
            interfaceC5982V0M15260a = AbstractC13764h.m15260a(f10, AbstractC13758e.m15255t(100, 0, null, 6), null, c6021p, 48, 12);
            c3985t4.getClass();
            if (!z12) {
                if (!z12) {
                    if (z12) {
                        j10 = c3985t4.f12492d;
                    } else {
                        j10 = c3985t4.f12492d;
                    }
                } else if (z12) {
                    j10 = c3985t4.f12492d;
                } else {
                    j10 = c3985t4.f12492d;
                }
            } else if (!z12) {
                if (z12) {
                    j10 = c3985t4.f12492d;
                } else {
                    j10 = c3985t4.f12492d;
                }
            } else if (z12) {
                j10 = c3985t4.f12492d;
            } else {
                j10 = c3985t4.f12492d;
            }
            if (z12) {
                c6021p.m6524S(350067971);
                objM6435V = AbstractC13474L.m14999a(j10, AbstractC13758e.m15255t(100, 0, null, 6), null, c6021p, 48, 12);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(350170674);
                objM6435V = C5997d.m6435V(new C14365u(j10), c6021p);
                c6021p.m6553p(false);
            }
            c6021p.m6524S(1327106656);
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11249i3 = AbstractC10844c.m11249i(AbstractC10842a.m11233k(AbstractC10844c.m11259s(interfaceC10459q2.mo428M(c10456n).mo428M(c10456n), C10444b.f30938q0), f12534a), AbstractC5235B.f16994a);
            zM6542f = c6021p.m6542f(objM6435V) | c6021p.m6542f(interfaceC5982V0M15260a);
            objM6514H = c6021p.m6514H();
            if (zM6542f) {
                objM6514H = new C3350b0(objM6435V, 10, interfaceC5982V0M15260a);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C3350b0(objM6435V, 10, interfaceC5982V0M15260a);
                c6021p.m6537c0(objM6514H);
            }
            AbstractC8455C.m9069a(0, (InterfaceC1436k) objM6514H, c6021p, interfaceC10459qM11249i3);
            interfaceC10459q3 = interfaceC10459q2;
            z11 = z12;
            c3985t5 = c3985t4;
            interfaceC17406l3 = interfaceC17406l2;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3990U2(z6, interfaceC10459q3, z11, c3985t5, interfaceC17406l3, i10, i11);
        }
    }
}
