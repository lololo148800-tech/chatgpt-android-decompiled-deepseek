package p278L0;

import af.C10564U;
import androidx.compose.foundation.layout.AbstractC10844c;
import p000.C10440a;
import p000.C17363n;
import p002A0.C0148y;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21100u;
import p117Eb.C2385o;
import p204I1.C3582M;
import p204I1.C3590f;
import p228J.AbstractC3794B0;
import p229J0.AbstractC3927I2;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4025b1;
import p229J0.AbstractC4094m4;
import p229J0.C3941K4;
import p229J0.C4023b;
import p229J0.C4052f4;
import p254K0.C4526w;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p350O1.C6050H;
import p350O1.C6072u;
import p492U1.C7540e;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8449B;
import p571X9.AbstractC9177N2;
import p571X9.AbstractC9388w4;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.AbstractC13474L;
import p736f0.C13485c;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13764h;
import p758g0.AbstractC13779o0;
import p758g0.AbstractC13785r0;
import p758g0.C13767i0;
import p758g0.C13771k0;
import p758g0.C13781p0;
import p758g0.C13783q0;
import p758g0.InterfaceC13726B;
import p759g1.C13803e;
import p774h1.C14365u;
import p797i1.AbstractC14901c;
import p894n0.InterfaceC17406l;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: L0.i0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4879i0 {

    /* JADX INFO: renamed from: b */
    public static final float f15900b;

    /* JADX INFO: renamed from: g */
    public static final float f15905g;

    /* JADX INFO: renamed from: h */
    public static final float f15906h;

    /* JADX INFO: renamed from: i */
    public static final InterfaceC10459q f15907i;

    /* JADX INFO: renamed from: a */
    public static final long f15899a = AbstractC9388w4.m9958a(0, 0, 0, 0);

    /* JADX INFO: renamed from: c */
    public static final float f15901c = 12;

    /* JADX INFO: renamed from: d */
    public static final float f15902d = 4;

    /* JADX INFO: renamed from: e */
    public static final float f15903e = 2;

    /* JADX INFO: renamed from: f */
    public static final float f15904f = 24;

    static {
        float f10 = 16;
        f15900b = f10;
        f15905g = f10;
        f15906h = f10;
        float f11 = 48;
        f15907i = AbstractC10844c.m11241a(C10456n.f30959Y, f11, f11);
    }

    /* JADX WARN: Code duplicated, block: B:218:0x0334  */
    /* JADX WARN: Code duplicated, block: B:230:0x0362  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v71 */
    /* JADX WARN: Type inference failed for: r6v75 */
    /* JADX INFO: renamed from: a */
    public static final void m5509a(EnumC4881j0 enumC4881j0, String str, InterfaceC1439n interfaceC1439n, C2385o c2385o, InterfaceC1439n interfaceC1439n2, InterfaceC1439n interfaceC1439n3, InterfaceC1439n interfaceC1439n4, InterfaceC1439n interfaceC1439n5, InterfaceC1439n interfaceC1439n6, InterfaceC1439n interfaceC1439n7, InterfaceC1439n interfaceC1439n8, boolean z6, boolean z10, boolean z11, InterfaceC17406l interfaceC17406l, InterfaceC17763i0 interfaceC17763i0, C4052f4 c4052f4, InterfaceC1439n interfaceC1439n9, C6021p c6021p, int i10, int i11) {
        int i12;
        int i13;
        EnumC4851O enumC4851O;
        long j10;
        float f10;
        boolean z12;
        float f11;
        ?? r6;
        float f12;
        boolean z13;
        float f13;
        ?? r10;
        float f14;
        boolean z14;
        float f15;
        Object obj;
        boolean z15;
        C8410b c8410bM8969c;
        C6021p c6021p2;
        long j11;
        C13767i0 c13767i0;
        long j12;
        C13767i0 c13767i1;
        boolean z16;
        C8410b c8410bM8969c2;
        long j13;
        boolean z17;
        C8410b c8410bM8969c3;
        long j14;
        C8410b c8410bM8969c4;
        boolean z18;
        long j15;
        long j16;
        c6021p.m6526U(1514469103);
        if ((i10 & 6) == 0) {
            i12 = i10 | (c6021p.m6542f(enumC4881j0) ? 4 : 2);
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6545h(interfaceC1439n) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6542f(c2385o) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c6021p.m6545h(interfaceC1439n2) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= c6021p.m6545h(interfaceC1439n3) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= c6021p.m6545h(interfaceC1439n4) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c6021p.m6545h(interfaceC1439n5) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c6021p.m6545h(interfaceC1439n6) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c6021p.m6545h(interfaceC1439n7) ? 536870912 : 268435456;
        }
        int i14 = i12;
        if ((i11 & 6) == 0) {
            i13 = i11 | (c6021p.m6545h(interfaceC1439n8) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= c6021p.m6544g(z10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c6021p.m6544g(z11) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= c6021p.m6542f(interfaceC17406l) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= c6021p.m6542f(interfaceC17763i0) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= c6021p.m6542f(c4052f4) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= c6021p.m6545h(interfaceC1439n9) ? 8388608 : 4194304;
        }
        int i15 = i13;
        if ((i14 & 306783379) == 306783378 && (i15 & 4793491) == 4793490 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            boolean z19 = ((i14 & 7168) == 2048) | ((i14 & 112) == 32);
            Object objM6514H = c6021p.m6514H();
            Object obj2 = C6013l.f19514a;
            if (z19 || objM6514H == obj2) {
                C3590f c3590f = new C3590f(6, str, null);
                c2385o.getClass();
                objM6514H = new C6050H(c3590f, C6072u.f19766a);
                c6021p.m6537c0(objM6514H);
            }
            String str2 = ((C6050H) objM6514H).f19708a.f10934Y;
            boolean zBooleanValue = ((Boolean) AbstractC9177N2.m9733c(interfaceC17406l, c6021p, (i15 >> 12) & 14).getValue()).booleanValue();
            if (zBooleanValue) {
                enumC4851O = EnumC4851O.f15799Y;
            } else {
                enumC4851O = str2.length() == 0 ? EnumC4851O.f15800Z : EnumC4851O.f15801o0;
            }
            if (!z10) {
                j10 = c4052f4.f12834z;
            } else if (z11) {
                j10 = c4052f4.f12792A;
            } else {
                j10 = zBooleanValue ? c4052f4.f12832x : c4052f4.f12833y;
            }
            C3941K4 c3941k4 = (C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a);
            C3582M c3582m = c3941k4.f12154j;
            long jM4277d = c3582m.m4277d();
            long j17 = C14365u.f45060j;
            boolean zM15775c = C14365u.m15775c(jM4277d, j17);
            C3582M c3582m2 = c3941k4.f12156l;
            boolean z20 = (zM15775c && !C14365u.m15775c(c3582m2.m4277d(), j17)) || (!C14365u.m15775c(c3582m.m4277d(), j17) && C14365u.m15775c(c3582m2.m4277d(), j17));
            long jM4277d2 = c3582m2.m4277d();
            if (z20 && jM4277d2 == 16) {
                jM4277d2 = j10;
            }
            long jM4277d3 = c3582m.m4277d();
            long j18 = (z20 && jM4277d3 == 16) ? j10 : jM4277d3;
            long j19 = jM4277d2;
            boolean z21 = interfaceC1439n2 != null;
            C13771k0 c13771k0M15291d = AbstractC13779o0.m15291d(enumC4851O, "TextFieldInputState", c6021p, 48, 0);
            C13783q0 c13783q0 = AbstractC13785r0.f43528a;
            EnumC4851O enumC4851O2 = (EnumC4851O) c13771k0M15291d.m15272c();
            c6021p.m6524S(-2036730335);
            int iOrdinal = enumC4851O2.ordinal();
            if (iOrdinal == 0) {
                f10 = 1.0f;
                z12 = false;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new C0644w();
                }
                f10 = 1.0f;
                z12 = false;
            } else {
                z12 = false;
                f10 = 0.0f;
            }
            c6021p.m6553p(z12);
            Float fValueOf = Float.valueOf(f10);
            C6002f0 c6002f0 = c13771k0M15291d.f43492d;
            EnumC4851O enumC4851O3 = (EnumC4851O) c6002f0.getValue();
            c6021p.m6524S(-2036730335);
            int iOrdinal2 = enumC4851O3.ordinal();
            if (iOrdinal2 == 0) {
                f11 = 1.0f;
                r6 = 0;
            } else if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    throw new C0644w();
                }
                f11 = 1.0f;
                r6 = 0;
            } else {
                r6 = 0;
                f11 = 0.0f;
            }
            c6021p.m6553p(r6);
            Float fValueOf2 = Float.valueOf(f11);
            c13771k0M15291d.m15275f();
            c6021p.m6524S(1276209157);
            C13781p0 c13781p0M15255t = AbstractC13758e.m15255t(150, r6, null, 6);
            c6021p.m6553p(r6);
            C13767i0 c13767i0M15289b = AbstractC13779o0.m15289b(c13771k0M15291d, fValueOf, fValueOf2, c13781p0M15255t, c13783q0, c6021p, 196608);
            C4875g0 c4875g0 = C4875g0.f15887Y;
            EnumC4851O enumC4851O4 = (EnumC4851O) c13771k0M15291d.m15272c();
            c6021p.m6524S(1435837472);
            int iOrdinal3 = enumC4851O4.ordinal();
            if (iOrdinal3 == 0) {
                f12 = 1.0f;
                z13 = false;
            } else {
                if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        throw new C0644w();
                    }
                } else if (!z21) {
                    f12 = 1.0f;
                    z13 = false;
                }
                z13 = false;
                f12 = 0.0f;
            }
            c6021p.m6553p(z13);
            Float fValueOf3 = Float.valueOf(f12);
            EnumC4851O enumC4851O5 = (EnumC4851O) c6002f0.getValue();
            c6021p.m6524S(1435837472);
            int iOrdinal4 = enumC4851O5.ordinal();
            if (iOrdinal4 == 0) {
                f13 = 1.0f;
                r10 = 0;
            } else {
                if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        throw new C0644w();
                    }
                } else if (!z21) {
                    f13 = 1.0f;
                    r10 = 0;
                }
                r10 = 0;
                f13 = 0.0f;
            }
            c6021p.m6553p(r10);
            boolean z22 = z20;
            C13767i0 c13767i0M15289b2 = AbstractC13779o0.m15289b(c13771k0M15291d, fValueOf3, Float.valueOf(f13), (InterfaceC13726B) c4875g0.invoke(c13771k0M15291d.m15275f(), c6021p, Integer.valueOf((int) r10)), c13783q0, c6021p, 196608);
            EnumC4851O enumC4851O6 = (EnumC4851O) c13771k0M15291d.m15272c();
            c6021p.m6524S(1128033978);
            int iOrdinal5 = enumC4851O6.ordinal();
            if (iOrdinal5 == 0) {
                f14 = 1.0f;
                z14 = false;
            } else {
                if (iOrdinal5 != 1) {
                    if (iOrdinal5 != 2) {
                        throw new C0644w();
                    }
                } else if (z21) {
                    z14 = false;
                    f14 = 0.0f;
                }
                f14 = 1.0f;
                z14 = false;
            }
            c6021p.m6553p(z14);
            Float fValueOf4 = Float.valueOf(f14);
            EnumC4851O enumC4851O7 = (EnumC4851O) c6002f0.getValue();
            c6021p.m6524S(1128033978);
            int iOrdinal6 = enumC4851O7.ordinal();
            if (iOrdinal6 == 0) {
                f15 = 1.0f;
            } else {
                if (iOrdinal6 != 1) {
                    if (iOrdinal6 != 2) {
                        throw new C0644w();
                    }
                } else if (z21) {
                    f15 = 0.0f;
                }
                f15 = 1.0f;
            }
            c6021p.m6553p(false);
            Float fValueOf5 = Float.valueOf(f15);
            c13771k0M15291d.m15275f();
            c6021p.m6524S(-1868044898);
            C13781p0 c13781p0M15255t2 = AbstractC13758e.m15255t(150, 0, null, 6);
            c6021p.m6553p(false);
            C13767i0 c13767i0M15289b3 = AbstractC13779o0.m15289b(c13771k0M15291d, fValueOf4, fValueOf5, c13781p0M15255t2, c13783q0, c6021p, 196608);
            EnumC4851O enumC4851O8 = (EnumC4851O) c6002f0.getValue();
            c6021p.m6524S(-107432127);
            int[] iArr = AbstractC4877h0.f15892a;
            long j20 = iArr[enumC4851O8.ordinal()] == 1 ? j19 : j18;
            c6021p.m6553p(false);
            AbstractC14901c abstractC14901cM15778f = C14365u.m15778f(j20);
            boolean zM6542f = c6021p.m6542f(abstractC14901cM15778f);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj2) {
                Object c13783q1 = new C13783q0(C13485c.f42688v0, new C10564U(abstractC14901cM15778f, 28));
                c6021p.m6537c0(c13783q1);
                objM6514H2 = c13783q1;
            }
            C13783q0 c13783q2 = (C13783q0) objM6514H2;
            EnumC4851O enumC4851O9 = (EnumC4851O) c13771k0M15291d.m15272c();
            c6021p.m6524S(-107432127);
            long j21 = iArr[enumC4851O9.ordinal()] == 1 ? j19 : j18;
            c6021p.m6553p(false);
            C14365u c14365u = new C14365u(j21);
            EnumC4851O enumC4851O10 = (EnumC4851O) c6002f0.getValue();
            c6021p.m6524S(-107432127);
            long j22 = iArr[enumC4851O10.ordinal()] == 1 ? j19 : j18;
            c6021p.m6553p(false);
            C14365u c14365u2 = new C14365u(j22);
            c13771k0M15291d.m15275f();
            c6021p.m6524S(1528582156);
            C13781p0 c13781p0M15255t3 = AbstractC13758e.m15255t(150, 0, null, 6);
            c6021p.m6553p(false);
            C13767i0 c13767i0M15289b4 = AbstractC13779o0.m15289b(c13771k0M15291d, c14365u, c14365u2, c13781p0M15255t3, c13783q2, c6021p, 196608);
            c6021p.m6524S(1023351670);
            c6021p.m6553p(false);
            AbstractC14901c abstractC14901cM15778f2 = C14365u.m15778f(j10);
            boolean zM6542f2 = c6021p.m6542f(abstractC14901cM15778f2);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f2 || objM6514H3 == obj2) {
                Object c13783q3 = new C13783q0(C13485c.f42688v0, new C10564U(abstractC14901cM15778f2, 28));
                c6021p.m6537c0(c13783q3);
                objM6514H3 = c13783q3;
            }
            c6021p.m6524S(1023351670);
            c6021p.m6553p(false);
            C14365u c14365u3 = new C14365u(j10);
            c6021p.m6524S(1023351670);
            c6021p.m6553p(false);
            C14365u c14365u4 = new C14365u(j10);
            c13771k0M15291d.m15275f();
            c6021p.m6524S(-543659263);
            C13781p0 c13781p0M15255t4 = AbstractC13758e.m15255t(150, 0, null, 6);
            c6021p.m6553p(false);
            C13767i0 c13767i0M15289b5 = AbstractC13779o0.m15289b(c13771k0M15291d, c14365u3, c14365u4, c13781p0M15255t4, (C13783q0) objM6514H3, c6021p, 196608);
            float fFloatValue = ((Number) c13767i0M15289b.f43468t0.getValue()).floatValue();
            c6021p.m6524S(-156998101);
            if (interfaceC1439n2 == null) {
                c6021p2 = c6021p;
                obj = obj2;
                z15 = false;
                c8410bM8969c = null;
            } else {
                C6021p c6021p3 = c6021p;
                obj = obj2;
                z15 = false;
                c8410bM8969c = AbstractC8411c.m8969c(-1236585568, c6021p3, new C4861Z(c3582m, c3582m2, fFloatValue, c13767i0M15289b5, interfaceC1439n2, z22, c13767i0M15289b4));
                c6021p2 = c6021p3;
            }
            c6021p2.m6553p(z15);
            if (!z10) {
                j11 = c4052f4.f12795D;
            } else if (z11) {
                j11 = c4052f4.f12796E;
            } else {
                j11 = zBooleanValue ? c4052f4.f12793B : c4052f4.f12794C;
            }
            long j23 = j11;
            Object objM6514H4 = c6021p.m6514H();
            C5975S c5975s = C5975S.f19448r0;
            if (objM6514H4 == obj) {
                c13767i0 = c13767i0M15289b2;
                objM6514H4 = C5997d.m6422I(new C4871e0(c13767i0, 0), c5975s);
                c6021p2.m6537c0(objM6514H4);
            } else {
                c13767i0 = c13767i0M15289b2;
            }
            InterfaceC5982V0 interfaceC5982V0 = (InterfaceC5982V0) objM6514H4;
            c6021p2.m6524S(-156965270);
            C8410b c8410bM8969c5 = (interfaceC1439n3 != null && str2.length() == 0 && ((Boolean) interfaceC5982V0.getValue()).booleanValue()) ? AbstractC8411c.m8969c(-660524084, c6021p2, new C4867c0(c13767i0, j23, c3582m, interfaceC1439n3)) : null;
            c6021p2.m6553p(z15);
            if (!z10) {
                j12 = c4052f4.f12803L;
            } else if (z11) {
                j12 = c4052f4.f12804M;
            } else {
                j12 = zBooleanValue ? c4052f4.f12801J : c4052f4.f12802K;
            }
            long j24 = j12;
            Object objM6514H5 = c6021p.m6514H();
            if (objM6514H5 == obj) {
                c13767i1 = c13767i0M15289b3;
                objM6514H5 = C5997d.m6422I(new C4871e0(c13767i1, 1), c5975s);
                c6021p2.m6537c0(objM6514H5);
            } else {
                c13767i1 = c13767i0M15289b3;
            }
            InterfaceC5982V0 interfaceC5982V1 = (InterfaceC5982V0) objM6514H5;
            c6021p2.m6524S(-156940524);
            if (interfaceC1439n6 == null || !((Boolean) interfaceC5982V1.getValue()).booleanValue()) {
                z16 = false;
                c8410bM8969c2 = null;
            } else {
                c8410bM8969c2 = AbstractC8411c.m8969c(274398694, c6021p2, new C4869d0(c13767i1, j24, c3582m, interfaceC1439n6, 0));
                z16 = false;
            }
            c6021p2.m6553p(z16);
            if (!z10) {
                j13 = c4052f4.f12807P;
            } else if (z11) {
                j13 = c4052f4.f12808Q;
            } else {
                j13 = zBooleanValue ? c4052f4.f12805N : c4052f4.f12806O;
            }
            long j25 = j13;
            c6021p2.m6524S(-156921964);
            if (interfaceC1439n7 == null || !((Boolean) interfaceC5982V1.getValue()).booleanValue()) {
                z17 = false;
                c8410bM8969c3 = null;
            } else {
                c8410bM8969c3 = AbstractC8411c.m8969c(-1526229403, c6021p2, new C4869d0(c13767i1, j25, c3582m, interfaceC1439n7, 1));
                z17 = false;
            }
            c6021p2.m6553p(z17);
            if (!z10) {
                j14 = c4052f4.f12826r;
            } else if (z11) {
                j14 = c4052f4.f12827s;
            } else {
                j14 = zBooleanValue ? c4052f4.f12824p : c4052f4.f12825q;
            }
            c6021p2.m6524S(-156902962);
            if (interfaceC1439n4 == null) {
                z18 = false;
                c8410bM8969c4 = null;
            } else {
                c8410bM8969c4 = AbstractC8411c.m8969c(-130107406, c6021p2, new C4863a0(j14, interfaceC1439n4, 0));
                z18 = false;
            }
            c6021p2.m6553p(z18);
            if (!z10) {
                j15 = c4052f4.f12830v;
            } else if (z11) {
                j15 = c4052f4.f12831w;
            } else {
                j15 = zBooleanValue ? c4052f4.f12828t : c4052f4.f12829u;
            }
            c6021p2.m6524S(-156893937);
            C8410b c8410bM8969c6 = interfaceC1439n5 == null ? null : AbstractC8411c.m8969c(2079816678, c6021p2, new C4863a0(j15, interfaceC1439n5, 1));
            c6021p2.m6553p(false);
            if (!z10) {
                j16 = c4052f4.f12799H;
            } else if (z11) {
                j16 = c4052f4.f12800I;
            } else {
                j16 = zBooleanValue ? c4052f4.f12797F : c4052f4.f12798G;
            }
            long j26 = j16;
            c6021p2.m6524S(-156884470);
            C8410b c8410bM8969c7 = interfaceC1439n8 != null ? AbstractC8411c.m8969c(1263707005, c6021p2, new C10440a(j26, c3582m2, interfaceC1439n8, 3)) : null;
            c6021p2.m6553p(false);
            int iOrdinal7 = enumC4881j0.ordinal();
            if (iOrdinal7 == 0) {
                c6021p2.m6524S(-568105095);
                AbstractC4094m4.m4754b(interfaceC1439n, c8410bM8969c, c8410bM8969c5, c8410bM8969c4, c8410bM8969c6, c8410bM8969c2, c8410bM8969c3, z6, fFloatValue, AbstractC8411c.m8969c(1750327932, c6021p2, new C4023b(interfaceC1439n9, 5)), c8410bM8969c7, interfaceC17763i0, c6021p, ((i14 >> 3) & 112) | 6 | ((i15 << 21) & 234881024), ((i15 >> 9) & 896) | 6);
                c6021p2.m6553p(false);
            } else if (iOrdinal7 != 1) {
                c6021p2.m6524S(-565271199);
                c6021p2.m6553p(false);
            } else {
                c6021p2.m6524S(-567018607);
                Object objM6514H6 = c6021p.m6514H();
                if (objM6514H6 == obj) {
                    objM6514H6 = C5997d.m6430Q(new C13803e(0L), c5975s);
                    c6021p2.m6537c0(objM6514H6);
                }
                InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H6;
                C8410b c8410bM8969c8 = AbstractC8411c.m8969c(157291737, c6021p2, new C0148y(interfaceC5985X, interfaceC17763i0, interfaceC1439n9, 11));
                boolean zM6536c = c6021p2.m6536c(fFloatValue);
                Object objM6514H7 = c6021p.m6514H();
                if (zM6536c || objM6514H7 == obj) {
                    objM6514H7 = new C4526w(fFloatValue, interfaceC5985X);
                    c6021p2.m6537c0(objM6514H7);
                }
                AbstractC3927I2.m4630c(interfaceC1439n, c8410bM8969c5, c8410bM8969c, c8410bM8969c4, c8410bM8969c6, c8410bM8969c2, c8410bM8969c3, z6, fFloatValue, (InterfaceC1436k) objM6514H7, c8410bM8969c8, c8410bM8969c7, interfaceC17763i0, c6021p, ((i14 >> 3) & 112) | 6 | ((i15 << 21) & 234881024), ((i15 >> 6) & 7168) | 48);
                c6021p2.m6553p(false);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4873f0(enumC4881j0, str, interfaceC1439n, c2385o, interfaceC1439n2, interfaceC1439n3, interfaceC1439n4, interfaceC1439n5, interfaceC1439n6, interfaceC1439n7, interfaceC1439n8, z6, z10, z11, interfaceC17406l, interfaceC17763i0, c4052f4, interfaceC1439n9, i10, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m5510b(long j10, C3582M c3582m, InterfaceC1439n interfaceC1439n, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(1208685580);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6540e(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c3582m) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1439n) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC4846J.m5493b(j10, c3582m, interfaceC1439n, c6021p, i11 & 1022);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4860Y(j10, c3582m, interfaceC1439n, i10, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m5511c(long j10, InterfaceC1439n interfaceC1439n, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(660142980);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6540e(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1439n) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C5997d.m6440a(AbstractC3794B0.m4494s(j10, AbstractC4025b1.f12649a), interfaceC1439n, c6021p, (i11 & 112) | 8);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C17363n(j10, interfaceC1439n, i10, 2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC5985X m5512d(boolean z6, boolean z10, boolean z11, C4052f4 c4052f4, float f10, float f11, C6021p c6021p, int i10) {
        long j10;
        InterfaceC5982V0 interfaceC5982V0M6435V;
        InterfaceC5982V0 interfaceC5982V0M6435V2;
        if (!z6) {
            j10 = c4052f4.f12822n;
        } else if (z10) {
            j10 = c4052f4.f12823o;
        } else {
            j10 = z11 ? c4052f4.f12820l : c4052f4.f12821m;
        }
        if (z6) {
            c6021p.m6524S(1023053998);
            interfaceC5982V0M6435V = AbstractC13474L.m14999a(j10, AbstractC13758e.m15255t(150, 0, null, 6), null, c6021p, 48, 12);
            c6021p.m6553p(false);
        } else {
            c6021p.m6524S(1023165505);
            interfaceC5982V0M6435V = C5997d.m6435V(new C14365u(j10), c6021p);
            c6021p.m6553p(false);
        }
        if (z6) {
            c6021p.m6524S(1023269417);
            interfaceC5982V0M6435V2 = AbstractC13764h.m15260a(z11 ? f10 : f11, AbstractC13758e.m15255t(150, 0, null, 6), null, c6021p, 48, 12);
            c6021p.m6553p(false);
        } else {
            c6021p.m6524S(1023478388);
            interfaceC5982V0M6435V2 = C5997d.m6435V(new C7540e(f11), c6021p);
            c6021p.m6553p(false);
        }
        return C5997d.m6435V(AbstractC8449B.m9060a(((C7540e) interfaceC5982V0M6435V2.getValue()).f23894Y, ((C14365u) interfaceC5982V0M6435V.getValue()).f45062a), c6021p);
    }

    /* JADX INFO: renamed from: e */
    public static final Object m5513e(InterfaceC21056J interfaceC21056J) {
        Object objMo21534t = interfaceC21056J.mo21534t();
        InterfaceC21100u interfaceC21100u = objMo21534t instanceof InterfaceC21100u ? (InterfaceC21100u) objMo21534t : null;
        if (interfaceC21100u != null) {
            return interfaceC21100u.mo10939t();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final int m5514f(AbstractC21069X abstractC21069X) {
        if (abstractC21069X != null) {
            return abstractC21069X.f66982Z;
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public static final int m5515g(AbstractC21069X abstractC21069X) {
        if (abstractC21069X != null) {
            return abstractC21069X.f66981Y;
        }
        return 0;
    }
}
