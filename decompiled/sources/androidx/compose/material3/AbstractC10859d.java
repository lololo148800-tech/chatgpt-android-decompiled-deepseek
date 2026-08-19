package androidx.compose.material3;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.AbstractC10839g;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.foundation.selection.AbstractC10852c;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p156G1.C2960g;
import p193Hf.C3310H0;
import p228J.AbstractC3794B0;
import p229J0.AbstractC3884B1;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4005X2;
import p229J0.AbstractC4025b1;
import p229J0.AbstractC4141u3;
import p229J0.C3949M0;
import p229J0.C4040d4;
import p229J0.C4046e4;
import p302M0.AbstractC5239F;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p544W9.AbstractC8443A;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p758g0.C13744U;
import p758g0.C13781p0;
import p758g0.InterfaceC13798z;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p774h1.InterfaceC14339Q;
import p894n0.InterfaceC17406l;
import p911o0.AbstractC17780r;

/* JADX INFO: renamed from: androidx.compose.material3.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10859d {

    /* JADX INFO: renamed from: a */
    public static final float f32660a;

    /* JADX INFO: renamed from: b */
    public static final float f32661b;

    /* JADX INFO: renamed from: c */
    public static final float f32662c;

    /* JADX INFO: renamed from: d */
    public static final float f32663d;

    /* JADX INFO: renamed from: e */
    public static final float f32664e;

    /* JADX INFO: renamed from: f */
    public static final C13744U f32665f;

    /* JADX INFO: renamed from: g */
    public static final C13781p0 f32666g;

    static {
        float f10 = AbstractC5239F.f17011b;
        f32660a = f10;
        f32661b = AbstractC5239F.f17016g;
        f32662c = AbstractC5239F.f17015f;
        float f11 = AbstractC5239F.f17013d;
        f32663d = f11;
        f32664e = (f11 - f10) / 2;
        f32665f = new C13744U(0);
        f32666g = new C13781p0(100, (InterfaceC13798z) null, 6);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:62:0x0171  */
    /* JADX WARN: Code duplicated, block: B:66:0x018d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0195  */
    /* JADX WARN: Code duplicated, block: B:70:0x019e  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:78:0x0205  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m11284a(boolean z6, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, InterfaceC1439n interfaceC1439n, boolean z10, C4040d4 c4040d4, InterfaceC17406l interfaceC17406l, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        int i13;
        int i14;
        boolean z11;
        int i15;
        int i16;
        int i17;
        C10456n c10456n;
        C3949M0 c3949m0;
        C4040d4 c4040d5;
        int i18;
        InterfaceC10459q interfaceC10459q3;
        boolean z12;
        int i19;
        C4040d4 c4040d6;
        InterfaceC1439n interfaceC1439n2;
        InterfaceC17406l interfaceC17406l2;
        InterfaceC17406l interfaceC17406l3;
        InterfaceC10459q interfaceC10459qM11274c;
        InterfaceC10459q interfaceC10459q4;
        InterfaceC1439n interfaceC1439n3;
        boolean z13;
        InterfaceC17406l interfaceC17406l4;
        Object objM6514H;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(1580463220);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        int i20 = i11 & 4;
        if (i20 == 0) {
            if ((i10 & 384) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 256 : 128;
            }
            i13 = i12 | 3072;
            i14 = i11 & 16;
            if (i14 != 0) {
                if ((i10 & 24576) == 0) {
                    z11 = z10;
                    if (c6021p.m6544g(z11)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                if ((196608 & i10) == 0) {
                    i13 |= 65536;
                }
                i16 = i13 | 1572864;
                if ((599187 & i16) == 599186 || !c6021p.m6562y()) {
                    c6021p.m6519N();
                    i17 = i10 & 1;
                    c10456n = C10456n.f30959Y;
                    if (i17 != 0 || c6021p.m6561x()) {
                        if (i20 != 0) {
                            interfaceC10459q2 = c10456n;
                        }
                        boolean z14 = i14 == 0 ? z11 : true;
                        c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                        c4040d5 = c3949m0.f12220d0;
                        if (c4040d5 == null) {
                            float f10 = AbstractC5239F.f17010a;
                            long jM4661c = AbstractC3959O0.m4661c(c3949m0, 10);
                            long jM4661c2 = AbstractC3959O0.m4661c(c3949m0, 26);
                            long j10 = C14365u.f45059i;
                            long jM4661c3 = AbstractC3959O0.m4661c(c3949m0, 11);
                            long jM4661c4 = AbstractC3959O0.m4661c(c3949m0, 24);
                            long jM4661c5 = AbstractC3959O0.m4661c(c3949m0, 39);
                            long jM4661c6 = AbstractC3959O0.m4661c(c3949m0, 24);
                            long jM4661c7 = AbstractC3959O0.m4661c(c3949m0, 39);
                            long jM15774b = C14365u.m15774b(1.0f, AbstractC3959O0.m4661c(c3949m0, 35));
                            long j11 = c3949m0.f12234p;
                            c4040d5 = new C4040d4(jM4661c, jM4661c2, j10, jM4661c3, jM4661c4, jM4661c5, jM4661c6, jM4661c7, AbstractC14334L.m15636n(jM15774b, j11), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j11), j10, AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j11), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j11), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 39)), j11), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j11), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 39)), j11));
                            c3949m0.f12220d0 = c4040d5;
                            i18 = -458753;
                        } else {
                            i18 = -458753;
                        }
                        interfaceC10459q3 = interfaceC10459q2;
                        z12 = z14;
                        i19 = i18 & i16;
                        c4040d6 = c4040d5;
                        interfaceC1439n2 = null;
                        interfaceC17406l2 = null;
                    } else {
                        c6021p.m6517L();
                        interfaceC1439n2 = interfaceC1439n;
                        c4040d6 = c4040d4;
                        interfaceC17406l2 = interfaceC17406l;
                        i19 = i16 & (-458753);
                        z12 = z11;
                        interfaceC10459q3 = interfaceC10459q2;
                        c10456n = c10456n;
                    }
                    c6021p.m6554q();
                    c6021p.m6524S(783532531);
                    if (interfaceC17406l2 == null) {
                        objM6514H = c6021p.m6514H();
                        if (objM6514H == C6013l.f19514a) {
                            objM6514H = AbstractC0168G.m536y(c6021p);
                        }
                        interfaceC17406l3 = (InterfaceC17406l) objM6514H;
                    } else {
                        interfaceC17406l3 = interfaceC17406l2;
                    }
                    c6021p.m6553p(false);
                    if (interfaceC1436k != null) {
                        C5984W0 c5984w0 = AbstractC3884B1.f11770a;
                        interfaceC10459qM11274c = AbstractC10852c.m11274c(MinimumInteractiveModifier.f32651Y, z6, interfaceC17406l3, z12, new C2960g(2), interfaceC1436k);
                    } else {
                        interfaceC10459qM11274c = c10456n;
                    }
                    InterfaceC10459q interfaceC10459qM11250j = AbstractC10844c.m11250j(AbstractC10844c.m11259s(interfaceC10459q3.mo428M(interfaceC10459qM11274c), C10444b.f30938q0), f32662c, f32663d);
                    float f11 = AbstractC5239F.f17010a;
                    int i21 = i19 << 3;
                    m11285b(interfaceC10459qM11250j, z6, z12, c4040d6, interfaceC1439n2, interfaceC17406l3, AbstractC4141u3.m4770a(5, c6021p), c6021p, (i21 & 57344) | (i21 & 112) | ((i19 >> 6) & 896));
                    interfaceC10459q4 = interfaceC10459q3;
                    interfaceC1439n3 = interfaceC1439n2;
                    z13 = z12;
                    interfaceC17406l4 = interfaceC17406l2;
                } else {
                    c6021p.m6517L();
                    interfaceC1439n3 = interfaceC1439n;
                    c4040d6 = c4040d4;
                    interfaceC17406l4 = interfaceC17406l;
                    InterfaceC10459q interfaceC10459q5 = interfaceC10459q2;
                    z13 = z11;
                    interfaceC10459q4 = interfaceC10459q5;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C4046e4(z6, interfaceC1436k, interfaceC10459q4, interfaceC1439n3, z13, c4040d6, interfaceC17406l4, i10, i11);
                }
            }
            i13 = i12 | 27648;
            z11 = z10;
            if ((196608 & i10) == 0) {
                i13 |= 65536;
            }
            i16 = i13 | 1572864;
            if ((599187 & i16) == 599186) {
                c6021p.m6519N();
                i17 = i10 & 1;
                c10456n = C10456n.f30959Y;
                if (i17 != 0) {
                    if (i20 != 0) {
                        interfaceC10459q2 = c10456n;
                    }
                    if (i14 == 0) {
                    }
                    c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                    c4040d5 = c3949m0.f12220d0;
                    if (c4040d5 == null) {
                        float f12 = AbstractC5239F.f17010a;
                        long jM4661c8 = AbstractC3959O0.m4661c(c3949m0, 10);
                        long jM4661c9 = AbstractC3959O0.m4661c(c3949m0, 26);
                        long j12 = C14365u.f45059i;
                        long jM4661c10 = AbstractC3959O0.m4661c(c3949m0, 11);
                        long jM4661c11 = AbstractC3959O0.m4661c(c3949m0, 24);
                        long jM4661c12 = AbstractC3959O0.m4661c(c3949m0, 39);
                        long jM4661c13 = AbstractC3959O0.m4661c(c3949m0, 24);
                        long jM4661c14 = AbstractC3959O0.m4661c(c3949m0, 39);
                        long jM15774b2 = C14365u.m15774b(1.0f, AbstractC3959O0.m4661c(c3949m0, 35));
                        long j13 = c3949m0.f12234p;
                        c4040d5 = new C4040d4(jM4661c8, jM4661c9, j12, jM4661c10, jM4661c11, jM4661c12, jM4661c13, jM4661c14, AbstractC14334L.m15636n(jM15774b2, j13), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j13), j12, AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j13), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j13), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 39)), j13), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j13), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 39)), j13));
                        c3949m0.f12220d0 = c4040d5;
                        i18 = -458753;
                    } else {
                        i18 = -458753;
                    }
                    interfaceC10459q3 = interfaceC10459q2;
                    z12 = z14;
                    i19 = i18 & i16;
                    c4040d6 = c4040d5;
                    interfaceC1439n2 = null;
                    interfaceC17406l2 = null;
                } else {
                    if (i20 != 0) {
                        interfaceC10459q2 = c10456n;
                    }
                    if (i14 == 0) {
                    }
                    c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                    c4040d5 = c3949m0.f12220d0;
                    if (c4040d5 == null) {
                        float f13 = AbstractC5239F.f17010a;
                        long jM4661c15 = AbstractC3959O0.m4661c(c3949m0, 10);
                        long jM4661c16 = AbstractC3959O0.m4661c(c3949m0, 26);
                        long j14 = C14365u.f45059i;
                        long jM4661c17 = AbstractC3959O0.m4661c(c3949m0, 11);
                        long jM4661c18 = AbstractC3959O0.m4661c(c3949m0, 24);
                        long jM4661c19 = AbstractC3959O0.m4661c(c3949m0, 39);
                        long jM4661c110 = AbstractC3959O0.m4661c(c3949m0, 24);
                        long jM4661c111 = AbstractC3959O0.m4661c(c3949m0, 39);
                        long jM15774b3 = C14365u.m15774b(1.0f, AbstractC3959O0.m4661c(c3949m0, 35));
                        long j15 = c3949m0.f12234p;
                        c4040d5 = new C4040d4(jM4661c15, jM4661c16, j14, jM4661c17, jM4661c18, jM4661c19, jM4661c110, jM4661c111, AbstractC14334L.m15636n(jM15774b3, j15), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j15), j14, AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j15), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j15), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 39)), j15), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j15), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 39)), j15));
                        c3949m0.f12220d0 = c4040d5;
                        i18 = -458753;
                    } else {
                        i18 = -458753;
                    }
                    interfaceC10459q3 = interfaceC10459q2;
                    z12 = z14;
                    i19 = i18 & i16;
                    c4040d6 = c4040d5;
                    interfaceC1439n2 = null;
                    interfaceC17406l2 = null;
                }
                c6021p.m6554q();
                c6021p.m6524S(783532531);
                if (interfaceC17406l2 == null) {
                    objM6514H = c6021p.m6514H();
                    if (objM6514H == C6013l.f19514a) {
                        objM6514H = AbstractC0168G.m536y(c6021p);
                    }
                    interfaceC17406l3 = (InterfaceC17406l) objM6514H;
                } else {
                    interfaceC17406l3 = interfaceC17406l2;
                }
                c6021p.m6553p(false);
                if (interfaceC1436k != null) {
                    C5984W0 c5984w1 = AbstractC3884B1.f11770a;
                    interfaceC10459qM11274c = AbstractC10852c.m11274c(MinimumInteractiveModifier.f32651Y, z6, interfaceC17406l3, z12, new C2960g(2), interfaceC1436k);
                } else {
                    interfaceC10459qM11274c = c10456n;
                }
                InterfaceC10459q interfaceC10459qM11250j2 = AbstractC10844c.m11250j(AbstractC10844c.m11259s(interfaceC10459q3.mo428M(interfaceC10459qM11274c), C10444b.f30938q0), f32662c, f32663d);
                float f14 = AbstractC5239F.f17010a;
                int i22 = i19 << 3;
                m11285b(interfaceC10459qM11250j2, z6, z12, c4040d6, interfaceC1439n2, interfaceC17406l3, AbstractC4141u3.m4770a(5, c6021p), c6021p, (i22 & 57344) | (i22 & 112) | ((i19 >> 6) & 896));
                interfaceC10459q4 = interfaceC10459q3;
                interfaceC1439n3 = interfaceC1439n2;
                z13 = z12;
                interfaceC17406l4 = interfaceC17406l2;
            } else {
                c6021p.m6519N();
                i17 = i10 & 1;
                c10456n = C10456n.f30959Y;
                if (i17 != 0) {
                    if (i20 != 0) {
                        interfaceC10459q2 = c10456n;
                    }
                    if (i14 == 0) {
                    }
                    c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                    c4040d5 = c3949m0.f12220d0;
                    if (c4040d5 == null) {
                        float f15 = AbstractC5239F.f17010a;
                        long jM4661c112 = AbstractC3959O0.m4661c(c3949m0, 10);
                        long jM4661c113 = AbstractC3959O0.m4661c(c3949m0, 26);
                        long j16 = C14365u.f45059i;
                        long jM4661c114 = AbstractC3959O0.m4661c(c3949m0, 11);
                        long jM4661c115 = AbstractC3959O0.m4661c(c3949m0, 24);
                        long jM4661c116 = AbstractC3959O0.m4661c(c3949m0, 39);
                        long jM4661c117 = AbstractC3959O0.m4661c(c3949m0, 24);
                        long jM4661c118 = AbstractC3959O0.m4661c(c3949m0, 39);
                        long jM15774b4 = C14365u.m15774b(1.0f, AbstractC3959O0.m4661c(c3949m0, 35));
                        long j17 = c3949m0.f12234p;
                        c4040d5 = new C4040d4(jM4661c112, jM4661c113, j16, jM4661c114, jM4661c115, jM4661c116, jM4661c117, jM4661c118, AbstractC14334L.m15636n(jM15774b4, j17), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j17), j16, AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j17), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j17), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 39)), j17), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j17), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 39)), j17));
                        c3949m0.f12220d0 = c4040d5;
                        i18 = -458753;
                    } else {
                        i18 = -458753;
                    }
                    interfaceC10459q3 = interfaceC10459q2;
                    z12 = z14;
                    i19 = i18 & i16;
                    c4040d6 = c4040d5;
                    interfaceC1439n2 = null;
                    interfaceC17406l2 = null;
                } else {
                    if (i20 != 0) {
                        interfaceC10459q2 = c10456n;
                    }
                    if (i14 == 0) {
                    }
                    c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                    c4040d5 = c3949m0.f12220d0;
                    if (c4040d5 == null) {
                        float f16 = AbstractC5239F.f17010a;
                        long jM4661c119 = AbstractC3959O0.m4661c(c3949m0, 10);
                        long jM4661c1110 = AbstractC3959O0.m4661c(c3949m0, 26);
                        long j18 = C14365u.f45059i;
                        long jM4661c1111 = AbstractC3959O0.m4661c(c3949m0, 11);
                        long jM4661c1112 = AbstractC3959O0.m4661c(c3949m0, 24);
                        long jM4661c1113 = AbstractC3959O0.m4661c(c3949m0, 39);
                        long jM4661c1114 = AbstractC3959O0.m4661c(c3949m0, 24);
                        long jM4661c1115 = AbstractC3959O0.m4661c(c3949m0, 39);
                        long jM15774b5 = C14365u.m15774b(1.0f, AbstractC3959O0.m4661c(c3949m0, 35));
                        long j19 = c3949m0.f12234p;
                        c4040d5 = new C4040d4(jM4661c119, jM4661c1110, j18, jM4661c1111, jM4661c1112, jM4661c1113, jM4661c1114, jM4661c1115, AbstractC14334L.m15636n(jM15774b5, j19), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j19), j18, AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j19), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j19), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 39)), j19), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j19), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 39)), j19));
                        c3949m0.f12220d0 = c4040d5;
                        i18 = -458753;
                    } else {
                        i18 = -458753;
                    }
                    interfaceC10459q3 = interfaceC10459q2;
                    z12 = z14;
                    i19 = i18 & i16;
                    c4040d6 = c4040d5;
                    interfaceC1439n2 = null;
                    interfaceC17406l2 = null;
                }
                c6021p.m6554q();
                c6021p.m6524S(783532531);
                if (interfaceC17406l2 == null) {
                    objM6514H = c6021p.m6514H();
                    if (objM6514H == C6013l.f19514a) {
                        objM6514H = AbstractC0168G.m536y(c6021p);
                    }
                    interfaceC17406l3 = (InterfaceC17406l) objM6514H;
                } else {
                    interfaceC17406l3 = interfaceC17406l2;
                }
                c6021p.m6553p(false);
                if (interfaceC1436k != null) {
                    C5984W0 c5984w2 = AbstractC3884B1.f11770a;
                    interfaceC10459qM11274c = AbstractC10852c.m11274c(MinimumInteractiveModifier.f32651Y, z6, interfaceC17406l3, z12, new C2960g(2), interfaceC1436k);
                } else {
                    interfaceC10459qM11274c = c10456n;
                }
                InterfaceC10459q interfaceC10459qM11250j3 = AbstractC10844c.m11250j(AbstractC10844c.m11259s(interfaceC10459q3.mo428M(interfaceC10459qM11274c), C10444b.f30938q0), f32662c, f32663d);
                float f17 = AbstractC5239F.f17010a;
                int i23 = i19 << 3;
                m11285b(interfaceC10459qM11250j3, z6, z12, c4040d6, interfaceC1439n2, interfaceC17406l3, AbstractC4141u3.m4770a(5, c6021p), c6021p, (i23 & 57344) | (i23 & 112) | ((i19 >> 6) & 896));
                interfaceC10459q4 = interfaceC10459q3;
                interfaceC1439n3 = interfaceC1439n2;
                z13 = z12;
                interfaceC17406l4 = interfaceC17406l2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4046e4(z6, interfaceC1436k, interfaceC10459q4, interfaceC1439n3, z13, c4040d6, interfaceC17406l4, i10, i11);
            }
        }
        i12 |= 384;
        interfaceC10459q2 = interfaceC10459q;
        i13 = i12 | 3072;
        i14 = i11 & 16;
        if (i14 != 0) {
            if ((i10 & 24576) == 0) {
                z11 = z10;
                if (c6021p.m6544g(z11)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            if ((196608 & i10) == 0) {
                i13 |= 65536;
            }
            i16 = i13 | 1572864;
            if ((599187 & i16) == 599186) {
                c6021p.m6519N();
                i17 = i10 & 1;
                c10456n = C10456n.f30959Y;
                if (i17 != 0) {
                    if (i20 != 0) {
                        interfaceC10459q2 = c10456n;
                    }
                    if (i14 == 0) {
                    }
                    c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                    c4040d5 = c3949m0.f12220d0;
                    if (c4040d5 == null) {
                        float f18 = AbstractC5239F.f17010a;
                        long jM4661c1116 = AbstractC3959O0.m4661c(c3949m0, 10);
                        long jM4661c1117 = AbstractC3959O0.m4661c(c3949m0, 26);
                        long j110 = C14365u.f45059i;
                        long jM4661c1118 = AbstractC3959O0.m4661c(c3949m0, 11);
                        long jM4661c1119 = AbstractC3959O0.m4661c(c3949m0, 24);
                        long jM4661c11110 = AbstractC3959O0.m4661c(c3949m0, 39);
                        long jM4661c11111 = AbstractC3959O0.m4661c(c3949m0, 24);
                        long jM4661c11112 = AbstractC3959O0.m4661c(c3949m0, 39);
                        long jM15774b6 = C14365u.m15774b(1.0f, AbstractC3959O0.m4661c(c3949m0, 35));
                        long j111 = c3949m0.f12234p;
                        c4040d5 = new C4040d4(jM4661c1116, jM4661c1117, j110, jM4661c1118, jM4661c1119, jM4661c11110, jM4661c11111, jM4661c11112, AbstractC14334L.m15636n(jM15774b6, j111), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j111), j110, AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j111), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j111), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 39)), j111), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j111), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 39)), j111));
                        c3949m0.f12220d0 = c4040d5;
                        i18 = -458753;
                    } else {
                        i18 = -458753;
                    }
                    interfaceC10459q3 = interfaceC10459q2;
                    z12 = z14;
                    i19 = i18 & i16;
                    c4040d6 = c4040d5;
                    interfaceC1439n2 = null;
                    interfaceC17406l2 = null;
                } else {
                    if (i20 != 0) {
                        interfaceC10459q2 = c10456n;
                    }
                    if (i14 == 0) {
                    }
                    c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                    c4040d5 = c3949m0.f12220d0;
                    if (c4040d5 == null) {
                        float f19 = AbstractC5239F.f17010a;
                        long jM4661c11113 = AbstractC3959O0.m4661c(c3949m0, 10);
                        long jM4661c11114 = AbstractC3959O0.m4661c(c3949m0, 26);
                        long j112 = C14365u.f45059i;
                        long jM4661c11115 = AbstractC3959O0.m4661c(c3949m0, 11);
                        long jM4661c11116 = AbstractC3959O0.m4661c(c3949m0, 24);
                        long jM4661c11117 = AbstractC3959O0.m4661c(c3949m0, 39);
                        long jM4661c11118 = AbstractC3959O0.m4661c(c3949m0, 24);
                        long jM4661c11119 = AbstractC3959O0.m4661c(c3949m0, 39);
                        long jM15774b7 = C14365u.m15774b(1.0f, AbstractC3959O0.m4661c(c3949m0, 35));
                        long j113 = c3949m0.f12234p;
                        c4040d5 = new C4040d4(jM4661c11113, jM4661c11114, j112, jM4661c11115, jM4661c11116, jM4661c11117, jM4661c11118, jM4661c11119, AbstractC14334L.m15636n(jM15774b7, j113), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j113), j112, AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j113), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j113), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 39)), j113), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j113), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 39)), j113));
                        c3949m0.f12220d0 = c4040d5;
                        i18 = -458753;
                    } else {
                        i18 = -458753;
                    }
                    interfaceC10459q3 = interfaceC10459q2;
                    z12 = z14;
                    i19 = i18 & i16;
                    c4040d6 = c4040d5;
                    interfaceC1439n2 = null;
                    interfaceC17406l2 = null;
                }
                c6021p.m6554q();
                c6021p.m6524S(783532531);
                if (interfaceC17406l2 == null) {
                    objM6514H = c6021p.m6514H();
                    if (objM6514H == C6013l.f19514a) {
                        objM6514H = AbstractC0168G.m536y(c6021p);
                    }
                    interfaceC17406l3 = (InterfaceC17406l) objM6514H;
                } else {
                    interfaceC17406l3 = interfaceC17406l2;
                }
                c6021p.m6553p(false);
                if (interfaceC1436k != null) {
                    C5984W0 c5984w3 = AbstractC3884B1.f11770a;
                    interfaceC10459qM11274c = AbstractC10852c.m11274c(MinimumInteractiveModifier.f32651Y, z6, interfaceC17406l3, z12, new C2960g(2), interfaceC1436k);
                } else {
                    interfaceC10459qM11274c = c10456n;
                }
                InterfaceC10459q interfaceC10459qM11250j4 = AbstractC10844c.m11250j(AbstractC10844c.m11259s(interfaceC10459q3.mo428M(interfaceC10459qM11274c), C10444b.f30938q0), f32662c, f32663d);
                float f110 = AbstractC5239F.f17010a;
                int i24 = i19 << 3;
                m11285b(interfaceC10459qM11250j4, z6, z12, c4040d6, interfaceC1439n2, interfaceC17406l3, AbstractC4141u3.m4770a(5, c6021p), c6021p, (i24 & 57344) | (i24 & 112) | ((i19 >> 6) & 896));
                interfaceC10459q4 = interfaceC10459q3;
                interfaceC1439n3 = interfaceC1439n2;
                z13 = z12;
                interfaceC17406l4 = interfaceC17406l2;
            } else {
                c6021p.m6519N();
                i17 = i10 & 1;
                c10456n = C10456n.f30959Y;
                if (i17 != 0) {
                    if (i20 != 0) {
                        interfaceC10459q2 = c10456n;
                    }
                    if (i14 == 0) {
                    }
                    c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                    c4040d5 = c3949m0.f12220d0;
                    if (c4040d5 == null) {
                        float f111 = AbstractC5239F.f17010a;
                        long jM4661c111110 = AbstractC3959O0.m4661c(c3949m0, 10);
                        long jM4661c111111 = AbstractC3959O0.m4661c(c3949m0, 26);
                        long j114 = C14365u.f45059i;
                        long jM4661c111112 = AbstractC3959O0.m4661c(c3949m0, 11);
                        long jM4661c111113 = AbstractC3959O0.m4661c(c3949m0, 24);
                        long jM4661c111114 = AbstractC3959O0.m4661c(c3949m0, 39);
                        long jM4661c111115 = AbstractC3959O0.m4661c(c3949m0, 24);
                        long jM4661c111116 = AbstractC3959O0.m4661c(c3949m0, 39);
                        long jM15774b8 = C14365u.m15774b(1.0f, AbstractC3959O0.m4661c(c3949m0, 35));
                        long j115 = c3949m0.f12234p;
                        c4040d5 = new C4040d4(jM4661c111110, jM4661c111111, j114, jM4661c111112, jM4661c111113, jM4661c111114, jM4661c111115, jM4661c111116, AbstractC14334L.m15636n(jM15774b8, j115), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j115), j114, AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j115), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j115), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 39)), j115), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j115), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 39)), j115));
                        c3949m0.f12220d0 = c4040d5;
                        i18 = -458753;
                    } else {
                        i18 = -458753;
                    }
                    interfaceC10459q3 = interfaceC10459q2;
                    z12 = z14;
                    i19 = i18 & i16;
                    c4040d6 = c4040d5;
                    interfaceC1439n2 = null;
                    interfaceC17406l2 = null;
                } else {
                    if (i20 != 0) {
                        interfaceC10459q2 = c10456n;
                    }
                    if (i14 == 0) {
                    }
                    c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                    c4040d5 = c3949m0.f12220d0;
                    if (c4040d5 == null) {
                        float f112 = AbstractC5239F.f17010a;
                        long jM4661c111117 = AbstractC3959O0.m4661c(c3949m0, 10);
                        long jM4661c111118 = AbstractC3959O0.m4661c(c3949m0, 26);
                        long j116 = C14365u.f45059i;
                        long jM4661c111119 = AbstractC3959O0.m4661c(c3949m0, 11);
                        long jM4661c1111110 = AbstractC3959O0.m4661c(c3949m0, 24);
                        long jM4661c1111111 = AbstractC3959O0.m4661c(c3949m0, 39);
                        long jM4661c1111112 = AbstractC3959O0.m4661c(c3949m0, 24);
                        long jM4661c1111113 = AbstractC3959O0.m4661c(c3949m0, 39);
                        long jM15774b9 = C14365u.m15774b(1.0f, AbstractC3959O0.m4661c(c3949m0, 35));
                        long j117 = c3949m0.f12234p;
                        c4040d5 = new C4040d4(jM4661c111117, jM4661c111118, j116, jM4661c111119, jM4661c1111110, jM4661c1111111, jM4661c1111112, jM4661c1111113, AbstractC14334L.m15636n(jM15774b9, j117), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j117), j116, AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j117), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j117), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 39)), j117), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j117), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 39)), j117));
                        c3949m0.f12220d0 = c4040d5;
                        i18 = -458753;
                    } else {
                        i18 = -458753;
                    }
                    interfaceC10459q3 = interfaceC10459q2;
                    z12 = z14;
                    i19 = i18 & i16;
                    c4040d6 = c4040d5;
                    interfaceC1439n2 = null;
                    interfaceC17406l2 = null;
                }
                c6021p.m6554q();
                c6021p.m6524S(783532531);
                if (interfaceC17406l2 == null) {
                    objM6514H = c6021p.m6514H();
                    if (objM6514H == C6013l.f19514a) {
                        objM6514H = AbstractC0168G.m536y(c6021p);
                    }
                    interfaceC17406l3 = (InterfaceC17406l) objM6514H;
                } else {
                    interfaceC17406l3 = interfaceC17406l2;
                }
                c6021p.m6553p(false);
                if (interfaceC1436k != null) {
                    C5984W0 c5984w4 = AbstractC3884B1.f11770a;
                    interfaceC10459qM11274c = AbstractC10852c.m11274c(MinimumInteractiveModifier.f32651Y, z6, interfaceC17406l3, z12, new C2960g(2), interfaceC1436k);
                } else {
                    interfaceC10459qM11274c = c10456n;
                }
                InterfaceC10459q interfaceC10459qM11250j5 = AbstractC10844c.m11250j(AbstractC10844c.m11259s(interfaceC10459q3.mo428M(interfaceC10459qM11274c), C10444b.f30938q0), f32662c, f32663d);
                float f113 = AbstractC5239F.f17010a;
                int i25 = i19 << 3;
                m11285b(interfaceC10459qM11250j5, z6, z12, c4040d6, interfaceC1439n2, interfaceC17406l3, AbstractC4141u3.m4770a(5, c6021p), c6021p, (i25 & 57344) | (i25 & 112) | ((i19 >> 6) & 896));
                interfaceC10459q4 = interfaceC10459q3;
                interfaceC1439n3 = interfaceC1439n2;
                z13 = z12;
                interfaceC17406l4 = interfaceC17406l2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4046e4(z6, interfaceC1436k, interfaceC10459q4, interfaceC1439n3, z13, c4040d6, interfaceC17406l4, i10, i11);
            }
        }
        i13 = i12 | 27648;
        z11 = z10;
        if ((196608 & i10) == 0) {
            i13 |= 65536;
        }
        i16 = i13 | 1572864;
        if ((599187 & i16) == 599186) {
            c6021p.m6519N();
            i17 = i10 & 1;
            c10456n = C10456n.f30959Y;
            if (i17 != 0) {
                if (i20 != 0) {
                    interfaceC10459q2 = c10456n;
                }
                if (i14 == 0) {
                }
                c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                c4040d5 = c3949m0.f12220d0;
                if (c4040d5 == null) {
                    float f114 = AbstractC5239F.f17010a;
                    long jM4661c1111114 = AbstractC3959O0.m4661c(c3949m0, 10);
                    long jM4661c1111115 = AbstractC3959O0.m4661c(c3949m0, 26);
                    long j118 = C14365u.f45059i;
                    long jM4661c1111116 = AbstractC3959O0.m4661c(c3949m0, 11);
                    long jM4661c1111117 = AbstractC3959O0.m4661c(c3949m0, 24);
                    long jM4661c1111118 = AbstractC3959O0.m4661c(c3949m0, 39);
                    long jM4661c1111119 = AbstractC3959O0.m4661c(c3949m0, 24);
                    long jM4661c11111110 = AbstractC3959O0.m4661c(c3949m0, 39);
                    long jM15774b10 = C14365u.m15774b(1.0f, AbstractC3959O0.m4661c(c3949m0, 35));
                    long j119 = c3949m0.f12234p;
                    c4040d5 = new C4040d4(jM4661c1111114, jM4661c1111115, j118, jM4661c1111116, jM4661c1111117, jM4661c1111118, jM4661c1111119, jM4661c11111110, AbstractC14334L.m15636n(jM15774b10, j119), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j119), j118, AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j119), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j119), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 39)), j119), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j119), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 39)), j119));
                    c3949m0.f12220d0 = c4040d5;
                    i18 = -458753;
                } else {
                    i18 = -458753;
                }
                interfaceC10459q3 = interfaceC10459q2;
                z12 = z14;
                i19 = i18 & i16;
                c4040d6 = c4040d5;
                interfaceC1439n2 = null;
                interfaceC17406l2 = null;
            } else {
                if (i20 != 0) {
                    interfaceC10459q2 = c10456n;
                }
                if (i14 == 0) {
                }
                c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                c4040d5 = c3949m0.f12220d0;
                if (c4040d5 == null) {
                    float f115 = AbstractC5239F.f17010a;
                    long jM4661c11111111 = AbstractC3959O0.m4661c(c3949m0, 10);
                    long jM4661c11111112 = AbstractC3959O0.m4661c(c3949m0, 26);
                    long j1110 = C14365u.f45059i;
                    long jM4661c11111113 = AbstractC3959O0.m4661c(c3949m0, 11);
                    long jM4661c11111114 = AbstractC3959O0.m4661c(c3949m0, 24);
                    long jM4661c11111115 = AbstractC3959O0.m4661c(c3949m0, 39);
                    long jM4661c11111116 = AbstractC3959O0.m4661c(c3949m0, 24);
                    long jM4661c11111117 = AbstractC3959O0.m4661c(c3949m0, 39);
                    long jM15774b11 = C14365u.m15774b(1.0f, AbstractC3959O0.m4661c(c3949m0, 35));
                    long j1111 = c3949m0.f12234p;
                    c4040d5 = new C4040d4(jM4661c11111111, jM4661c11111112, j1110, jM4661c11111113, jM4661c11111114, jM4661c11111115, jM4661c11111116, jM4661c11111117, AbstractC14334L.m15636n(jM15774b11, j1111), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j1111), j1110, AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j1111), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j1111), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 39)), j1111), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j1111), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 39)), j1111));
                    c3949m0.f12220d0 = c4040d5;
                    i18 = -458753;
                } else {
                    i18 = -458753;
                }
                interfaceC10459q3 = interfaceC10459q2;
                z12 = z14;
                i19 = i18 & i16;
                c4040d6 = c4040d5;
                interfaceC1439n2 = null;
                interfaceC17406l2 = null;
            }
            c6021p.m6554q();
            c6021p.m6524S(783532531);
            if (interfaceC17406l2 == null) {
                objM6514H = c6021p.m6514H();
                if (objM6514H == C6013l.f19514a) {
                    objM6514H = AbstractC0168G.m536y(c6021p);
                }
                interfaceC17406l3 = (InterfaceC17406l) objM6514H;
            } else {
                interfaceC17406l3 = interfaceC17406l2;
            }
            c6021p.m6553p(false);
            if (interfaceC1436k != null) {
                C5984W0 c5984w5 = AbstractC3884B1.f11770a;
                interfaceC10459qM11274c = AbstractC10852c.m11274c(MinimumInteractiveModifier.f32651Y, z6, interfaceC17406l3, z12, new C2960g(2), interfaceC1436k);
            } else {
                interfaceC10459qM11274c = c10456n;
            }
            InterfaceC10459q interfaceC10459qM11250j6 = AbstractC10844c.m11250j(AbstractC10844c.m11259s(interfaceC10459q3.mo428M(interfaceC10459qM11274c), C10444b.f30938q0), f32662c, f32663d);
            float f116 = AbstractC5239F.f17010a;
            int i26 = i19 << 3;
            m11285b(interfaceC10459qM11250j6, z6, z12, c4040d6, interfaceC1439n2, interfaceC17406l3, AbstractC4141u3.m4770a(5, c6021p), c6021p, (i26 & 57344) | (i26 & 112) | ((i19 >> 6) & 896));
            interfaceC10459q4 = interfaceC10459q3;
            interfaceC1439n3 = interfaceC1439n2;
            z13 = z12;
            interfaceC17406l4 = interfaceC17406l2;
        } else {
            c6021p.m6519N();
            i17 = i10 & 1;
            c10456n = C10456n.f30959Y;
            if (i17 != 0) {
                if (i20 != 0) {
                    interfaceC10459q2 = c10456n;
                }
                if (i14 == 0) {
                }
                c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                c4040d5 = c3949m0.f12220d0;
                if (c4040d5 == null) {
                    float f117 = AbstractC5239F.f17010a;
                    long jM4661c11111118 = AbstractC3959O0.m4661c(c3949m0, 10);
                    long jM4661c11111119 = AbstractC3959O0.m4661c(c3949m0, 26);
                    long j1112 = C14365u.f45059i;
                    long jM4661c111111110 = AbstractC3959O0.m4661c(c3949m0, 11);
                    long jM4661c111111111 = AbstractC3959O0.m4661c(c3949m0, 24);
                    long jM4661c111111112 = AbstractC3959O0.m4661c(c3949m0, 39);
                    long jM4661c111111113 = AbstractC3959O0.m4661c(c3949m0, 24);
                    long jM4661c111111114 = AbstractC3959O0.m4661c(c3949m0, 39);
                    long jM15774b12 = C14365u.m15774b(1.0f, AbstractC3959O0.m4661c(c3949m0, 35));
                    long j1113 = c3949m0.f12234p;
                    c4040d5 = new C4040d4(jM4661c11111118, jM4661c11111119, j1112, jM4661c111111110, jM4661c111111111, jM4661c111111112, jM4661c111111113, jM4661c111111114, AbstractC14334L.m15636n(jM15774b12, j1113), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j1113), j1112, AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j1113), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j1113), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 39)), j1113), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j1113), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 39)), j1113));
                    c3949m0.f12220d0 = c4040d5;
                    i18 = -458753;
                } else {
                    i18 = -458753;
                }
                interfaceC10459q3 = interfaceC10459q2;
                z12 = z14;
                i19 = i18 & i16;
                c4040d6 = c4040d5;
                interfaceC1439n2 = null;
                interfaceC17406l2 = null;
            } else {
                if (i20 != 0) {
                    interfaceC10459q2 = c10456n;
                }
                if (i14 == 0) {
                }
                c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                c4040d5 = c3949m0.f12220d0;
                if (c4040d5 == null) {
                    float f118 = AbstractC5239F.f17010a;
                    long jM4661c111111115 = AbstractC3959O0.m4661c(c3949m0, 10);
                    long jM4661c111111116 = AbstractC3959O0.m4661c(c3949m0, 26);
                    long j1114 = C14365u.f45059i;
                    long jM4661c111111117 = AbstractC3959O0.m4661c(c3949m0, 11);
                    long jM4661c111111118 = AbstractC3959O0.m4661c(c3949m0, 24);
                    long jM4661c111111119 = AbstractC3959O0.m4661c(c3949m0, 39);
                    long jM4661c1111111110 = AbstractC3959O0.m4661c(c3949m0, 24);
                    long jM4661c1111111111 = AbstractC3959O0.m4661c(c3949m0, 39);
                    long jM15774b13 = C14365u.m15774b(1.0f, AbstractC3959O0.m4661c(c3949m0, 35));
                    long j1115 = c3949m0.f12234p;
                    c4040d5 = new C4040d4(jM4661c111111115, jM4661c111111116, j1114, jM4661c111111117, jM4661c111111118, jM4661c111111119, jM4661c1111111110, jM4661c1111111111, AbstractC14334L.m15636n(jM15774b13, j1115), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j1115), j1114, AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j1115), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)), j1115), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 39)), j1115), AbstractC14334L.m15636n(C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 18)), j1115), AbstractC14334L.m15636n(C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 39)), j1115));
                    c3949m0.f12220d0 = c4040d5;
                    i18 = -458753;
                } else {
                    i18 = -458753;
                }
                interfaceC10459q3 = interfaceC10459q2;
                z12 = z14;
                i19 = i18 & i16;
                c4040d6 = c4040d5;
                interfaceC1439n2 = null;
                interfaceC17406l2 = null;
            }
            c6021p.m6554q();
            c6021p.m6524S(783532531);
            if (interfaceC17406l2 == null) {
                objM6514H = c6021p.m6514H();
                if (objM6514H == C6013l.f19514a) {
                    objM6514H = AbstractC0168G.m536y(c6021p);
                }
                interfaceC17406l3 = (InterfaceC17406l) objM6514H;
            } else {
                interfaceC17406l3 = interfaceC17406l2;
            }
            c6021p.m6553p(false);
            if (interfaceC1436k != null) {
                C5984W0 c5984w6 = AbstractC3884B1.f11770a;
                interfaceC10459qM11274c = AbstractC10852c.m11274c(MinimumInteractiveModifier.f32651Y, z6, interfaceC17406l3, z12, new C2960g(2), interfaceC1436k);
            } else {
                interfaceC10459qM11274c = c10456n;
            }
            InterfaceC10459q interfaceC10459qM11250j7 = AbstractC10844c.m11250j(AbstractC10844c.m11259s(interfaceC10459q3.mo428M(interfaceC10459qM11274c), C10444b.f30938q0), f32662c, f32663d);
            float f119 = AbstractC5239F.f17010a;
            int i27 = i19 << 3;
            m11285b(interfaceC10459qM11250j7, z6, z12, c4040d6, interfaceC1439n2, interfaceC17406l3, AbstractC4141u3.m4770a(5, c6021p), c6021p, (i27 & 57344) | (i27 & 112) | ((i19 >> 6) & 896));
            interfaceC10459q4 = interfaceC10459q3;
            interfaceC1439n3 = interfaceC1439n2;
            z13 = z12;
            interfaceC17406l4 = interfaceC17406l2;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4046e4(z6, interfaceC1436k, interfaceC10459q4, interfaceC1439n3, z13, c4040d6, interfaceC17406l4, i10, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m11285b(InterfaceC10459q interfaceC10459q, boolean z6, boolean z10, C4040d4 c4040d4, InterfaceC1439n interfaceC1439n, InterfaceC17406l interfaceC17406l, InterfaceC14339Q interfaceC14339Q, C6021p c6021p, int i10) {
        int i11;
        long j10;
        long j11;
        int i12;
        long j12;
        long j13;
        c6021p.m6526U(-1594099146);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(c4040d4) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(interfaceC1439n) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6542f(interfaceC17406l) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6542f(interfaceC14339Q) ? 1048576 : 524288;
        }
        if ((599187 & i11) == 599186 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (z10) {
                j10 = z6 ? c4040d4.f12724b : c4040d4.f12728f;
            } else {
                j10 = z6 ? c4040d4.f12732j : c4040d4.f12736n;
            }
            if (z10) {
                j11 = z6 ? c4040d4.f12723a : c4040d4.f12727e;
            } else {
                j11 = z6 ? c4040d4.f12731i : c4040d4.f12735m;
            }
            float f10 = AbstractC5239F.f17010a;
            InterfaceC14339Q interfaceC14339QM4770a = AbstractC4141u3.m4770a(5, c6021p);
            float f11 = AbstractC5239F.f17014e;
            if (z10) {
                i12 = i11;
                j12 = z6 ? c4040d4.f12725c : c4040d4.f12729g;
            } else {
                i12 = i11;
                j12 = z6 ? c4040d4.f12733k : c4040d4.f12737o;
            }
            InterfaceC10459q interfaceC10459qM11207b = AbstractC10833a.m11207b(AbstractC8443A.m9045a(interfaceC10459q, f11, j12, interfaceC14339QM4770a), j10, interfaceC14339QM4770a);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11207b);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            InterfaceC10459q interfaceC10459qM11207b2 = AbstractC10833a.m11207b(AbstractC10839g.m11214a(C10843b.f32509a.m11240a(C10456n.f30959Y, C10444b.f30937p0).mo428M(new ThumbElement(interfaceC17406l, z6)), interfaceC17406l, AbstractC4005X2.m4718c(false, AbstractC5239F.f17012c / 2, c6021p, 54, 4)), j11, interfaceC14339Q);
            InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(C10444b.f30938q0, false);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11207b2);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e2);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            c6021p.m6524S(1163457794);
            if (interfaceC1439n != null) {
                if (z10) {
                    j13 = z6 ? c4040d4.f12726d : c4040d4.f12730h;
                } else {
                    j13 = z6 ? c4040d4.f12734l : c4040d4.f12738p;
                }
                C5997d.m6440a(AbstractC3794B0.m4494s(j13, AbstractC4025b1.f12649a), interfaceC1439n, c6021p, ((i12 >> 9) & 112) | 8);
            }
            AbstractC3794B0.m4471F(c6021p, false, true, true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3310H0(interfaceC10459q, z6, z10, c4040d4, interfaceC1439n, interfaceC17406l, interfaceC14339Q, i10);
        }
    }
}
