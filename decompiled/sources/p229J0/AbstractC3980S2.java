package p229J0;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.layout.AbstractC10868a;
import p003A1.AbstractC0187M0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p080D0.C1811j0;
import p106E0.C2234h;
import p106E0.C2235i;
import p124Ei.C2535p;
import p156G1.AbstractC2965l;
import p200Hm.C3505d;
import p302M0.AbstractC5234A;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8455C;
import p561X.C8990d;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p758g0.AbstractC13725A;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13785r0;
import p758g0.C13733I;
import p758g0.C13736L;
import p758g0.C13737M;
import p758g0.C13738N;
import p758g0.C13739O;
import p758g0.C13783q0;
import p758g0.C13792v;
import p759g1.C13803e;
import p773h0.C14305r;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p821j1.C16043h;
import p821j1.InterfaceC16039d;

/* JADX INFO: renamed from: J0.S2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3980S2 {

    /* JADX INFO: renamed from: a */
    public static final float f12470a;

    /* JADX INFO: renamed from: b */
    public static final InterfaceC10459q f12471b;

    /* JADX INFO: renamed from: c */
    public static final float f12472c = 240;

    /* JADX INFO: renamed from: d */
    public static final float f12473d;

    /* JADX INFO: renamed from: e */
    public static final float f12474e;

    /* JADX INFO: renamed from: f */
    public static final C13792v f12475f;

    /* JADX INFO: renamed from: g */
    public static final C13792v f12476g;

    /* JADX INFO: renamed from: h */
    public static final C13792v f12477h;

    /* JADX INFO: renamed from: i */
    public static final C13792v f12478i;

    /* JADX INFO: renamed from: j */
    public static final C13792v f12479j;

    static {
        float f10 = 10;
        f12470a = f10;
        f12471b = AbstractC10842a.m11235m(AbstractC2965l.m3789a(AbstractC10868a.m11316b(C10456n.f30959Y, C3973R0.f12430s0), true, C4161y.f13488B0), 0.0f, f10, 1);
        float f11 = AbstractC5234A.f16992c;
        f12473d = f11;
        f12474e = AbstractC5234A.f16993d - (f11 * 2);
        f12475f = new C13792v(0.2f, 0.0f, 0.8f, 1.0f);
        f12476g = new C13792v(0.4f, 0.0f, 1.0f, 1.0f);
        f12477h = new C13792v(0.0f, 0.0f, 0.65f, 1.0f);
        f12478i = new C13792v(0.1f, 0.0f, 0.45f, 1.0f);
        f12479j = new C13792v(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v10 ??, still in use, count: 1, list:
          (r1v10 ?? I:java.lang.Object) from 0x0169: INVOKE (r35v0 ?? I:O0.p), (r1v10 ?? I:java.lang.Object) VIRTUAL call: O0.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:362)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: renamed from: a */
    public static final void m4667a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v10 ??, still in use, count: 1, list:
          (r1v10 ?? I:java.lang.Object) from 0x0169: INVOKE (r35v0 ?? I:O0.p), (r1v10 ?? I:java.lang.Object) VIRTUAL call: O0.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:362)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r26v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX WARN: Code duplicated, block: B:100:0x0265  */
    /* JADX WARN: Code duplicated, block: B:102:0x0269  */
    /* JADX WARN: Code duplicated, block: B:106:0x0295  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:78:0x0209  */
    /* JADX WARN: Code duplicated, block: B:80:0x020f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0239  */
    /* JADX WARN: Code duplicated, block: B:87:0x023b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0245  */
    /* JADX WARN: Code duplicated, block: B:93:0x024f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0258 A[PHI: r4 r11
      0x0258: PHI (r4v27 g0.I) = (r4v24 g0.I), (r4v28 g0.I) binds: [B:95:0x0256, B:91:0x024c] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r11v15 long) = (r11v13 long), (r11v16 long) binds: [B:95:0x0256, B:91:0x024c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x025b  */
    /* JADX INFO: renamed from: b */
    public static final void m4668b(InterfaceC10459q interfaceC10459q, long j10, float f10, long j11, int i10, C6021p c6021p, int i11, int i12) {
        InterfaceC10459q interfaceC10459q2;
        int i13;
        long jM4662d;
        float f11;
        long j12;
        int i14;
        InterfaceC10459q interfaceC10459q3;
        long j13;
        int i15;
        InterfaceC10459q interfaceC10459q4;
        float f12;
        int i16;
        long j14;
        long j15;
        C16043h c16043h;
        int i17;
        long j16;
        long j17;
        C13733I c13733iM15245j;
        C13733I c13733iM15242g;
        C13733I c13733iM15242g2;
        C13733I c13733iM15242g3;
        boolean z6;
        C13733I c13733i;
        long j18;
        boolean z10;
        boolean z11;
        Object objM6514H;
        long j19;
        long j20;
        InterfaceC10459q interfaceC10459q5;
        float f13;
        int i18;
        C6018n0 c6018n0M6555r;
        int i19;
        c6021p.m6526U(-115871647);
        int i20 = i12 & 1;
        if (i20 != 0) {
            i13 = i11 | 6;
            interfaceC10459q2 = interfaceC10459q;
        } else if ((i11 & 6) == 0) {
            interfaceC10459q2 = interfaceC10459q;
            i13 = (c6021p.m6542f(interfaceC10459q2) ? 4 : 2) | i11;
        } else {
            interfaceC10459q2 = interfaceC10459q;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i12 & 2) == 0) {
                jM4662d = j10;
                int i21 = c6021p.m6540e(jM4662d) ? 32 : 16;
                i13 |= i21;
            } else {
                jM4662d = j10;
            }
            i13 |= i21;
        } else {
            jM4662d = j10;
        }
        int i22 = i12 & 4;
        if (i22 == 0) {
            if ((i11 & 384) == 0) {
                f11 = f10;
                i13 |= c6021p.m6536c(f11) ? 256 : 128;
            }
            if ((i11 & 3072) == 0) {
                j12 = j11;
                if ((i12 & 8) == 0 || !c6021p.m6540e(j12)) {
                    i19 = 1024;
                } else {
                    i19 = 2048;
                }
                i13 |= i19;
            } else {
                j12 = j11;
            }
            i14 = i13 | 24576;
            if ((i14 & 9363) == 9362 || !c6021p.m6562y()) {
                c6021p.m6519N();
                if ((i11 & 1) != 0 || c6021p.m6561x()) {
                    if (i20 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if ((i12 & 2) != 0) {
                        float f14 = AbstractC3945L2.f12170a;
                        float f15 = AbstractC5234A.f16990a;
                        jM4662d = AbstractC3959O0.m4662d(26, c6021p);
                        i14 &= -113;
                    }
                    if (i22 != 0) {
                        f11 = AbstractC3945L2.f12170a;
                    }
                    if ((i12 & 8) != 0) {
                        float f16 = AbstractC3945L2.f12170a;
                        j13 = C14365u.f45059i;
                        i14 &= -7169;
                    } else {
                        j13 = j12;
                    }
                    i15 = AbstractC3945L2.f12173d;
                    interfaceC10459q4 = interfaceC10459q3;
                    f12 = f11;
                    long j21 = jM4662d;
                    i16 = i14;
                    j14 = j13;
                    j15 = j21;
                } else {
                    c6021p.m6517L();
                    if ((i12 & 2) != 0) {
                        i14 &= -113;
                    }
                    if ((i12 & 8) != 0) {
                        i14 &= -7169;
                    }
                    i15 = i10;
                    j15 = jM4662d;
                    i16 = i14;
                    long j22 = j12;
                    interfaceC10459q4 = interfaceC10459q2;
                    f12 = f11;
                    j14 = j22;
                }
                c6021p.m6554q();
                c16043h = new C16043h(((InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f)).mo7864b0(f12), 0.0f, i15, 0, 26);
                C13736L c13736lM15253r = AbstractC13758e.m15253r(null, c6021p, 1);
                C13783q0 c13783q0 = AbstractC13785r0.f43529b;
                C8990d c8990d = AbstractC13725A.f43291d;
                i17 = i16;
                j16 = j14;
                j17 = j15;
                c13733iM15245j = AbstractC13758e.m15245j(c13736lM15253r, 0, 5, c13783q0, AbstractC13758e.m15252q(AbstractC13758e.m15255t(6660, 0, c8990d, 2), 0, 6), null, c6021p, 33208, 16);
                c13733iM15242g = AbstractC13758e.m15242g(c13736lM15253r, 0.0f, 286.0f, AbstractC13758e.m15252q(AbstractC13758e.m15255t(1332, 0, c8990d, 2), 0, 6), null, c6021p, 4536, 8);
                C13738N c13738n = new C13738N();
                c13738n.f43326a = 1332;
                C13737M c13737mM15216a = c13738n.m15216a(Float.valueOf(0.0f), 0);
                C13792v c13792v = f12479j;
                c13737mM15216a.f43324b = c13792v;
                c13738n.m15216a(Float.valueOf(290.0f), 666);
                c13733iM15242g2 = AbstractC13758e.m15242g(c13736lM15253r, 0.0f, 290.0f, AbstractC13758e.m15252q(new C13739O(c13738n), 0, 6), null, c6021p, 4536, 8);
                C13738N c13738n2 = new C13738N();
                c13738n2.f43326a = 1332;
                c13738n2.m15216a(Float.valueOf(0.0f), 666).f43324b = c13792v;
                c13738n2.m15216a(Float.valueOf(290.0f), c13738n2.f43326a);
                c13733iM15242g3 = AbstractC13758e.m15242g(c13736lM15253r, 0.0f, 290.0f, AbstractC13758e.m15252q(new C13739O(c13738n2), 0, 6), null, c6021p, 4536, 8);
                InterfaceC10459q interfaceC10459qM11252l = AbstractC10844c.m11252l(AbstractC2965l.m3789a(interfaceC10459q4, true, C14305r.f44910q0), f12474e);
                boolean zM6545h = ((((i17 & 7168) ^ 3072) <= 2048 && c6021p.m6540e(j16)) || (i17 & 3072) == 2048) | c6021p.m6545h(r29) | c6021p.m6542f(c13733iM15245j) | c6021p.m6542f(c13733iM15242g2) | c6021p.m6542f(c13733iM15242g3) | c6021p.m6542f(c13733iM15242g);
                if ((i17 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z12 = z6 | zM6545h;
                if (((i17 & 112) ^ 48) > 32) {
                    c13733i = c13733iM15242g2;
                    j18 = j17;
                    if (c6021p.m6540e(j18)) {
                        z10 = true;
                    }
                    z11 = z12 | z10;
                    objM6514H = c6021p.m6514H();
                    if (z11 || objM6514H == C6013l.f19514a) {
                        objM6514H = new C2234h(j16, c16043h, c13733iM15245j, c13733i, c13733iM15242g3, c13733iM15242g, f12, j18);
                        c6021p.m6537c0(objM6514H);
                    }
                    AbstractC8455C.m9069a(0, (InterfaceC1436k) objM6514H, c6021p, interfaceC10459qM11252l);
                    j19 = j16;
                    j20 = j18;
                    interfaceC10459q5 = interfaceC10459q4;
                    f13 = f12;
                    i18 = i15;
                } else {
                    c13733i = c13733iM15242g2;
                    j18 = j17;
                }
                if ((i17 & 48) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z12 | z10;
                objM6514H = c6021p.m6514H();
                if (z11) {
                    objM6514H = new C2234h(j16, c16043h, c13733iM15245j, c13733i, c13733iM15242g3, c13733iM15242g, f12, j18);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C2234h(j16, c16043h, c13733iM15245j, c13733i, c13733iM15242g3, c13733iM15242g, f12, j18);
                    c6021p.m6537c0(objM6514H);
                }
                AbstractC8455C.m9069a(0, (InterfaceC1436k) objM6514H, c6021p, interfaceC10459qM11252l);
                j19 = j16;
                j20 = j18;
                interfaceC10459q5 = interfaceC10459q4;
                f13 = f12;
                i18 = i15;
            } else {
                c6021p.m6517L();
                i18 = i10;
                interfaceC10459q5 = interfaceC10459q2;
                j20 = jM4662d;
                f13 = f11;
                j19 = j12;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C3961O2(interfaceC10459q5, j20, f13, j19, i18, i11, i12);
            }
        }
        i13 |= 384;
        f11 = f10;
        if ((i11 & 3072) == 0) {
            j12 = j11;
            if ((i12 & 8) == 0) {
                i19 = 1024;
            } else {
                i19 = 1024;
            }
            i13 |= i19;
        } else {
            j12 = j11;
        }
        i14 = i13 | 24576;
        if ((i14 & 9363) == 9362) {
            c6021p.m6519N();
            if ((i11 & 1) != 0) {
                if (i20 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if ((i12 & 2) != 0) {
                    float f17 = AbstractC3945L2.f12170a;
                    float f18 = AbstractC5234A.f16990a;
                    jM4662d = AbstractC3959O0.m4662d(26, c6021p);
                    i14 &= -113;
                }
                if (i22 != 0) {
                    f11 = AbstractC3945L2.f12170a;
                }
                if ((i12 & 8) != 0) {
                    float f19 = AbstractC3945L2.f12170a;
                    j13 = C14365u.f45059i;
                    i14 &= -7169;
                } else {
                    j13 = j12;
                }
                i15 = AbstractC3945L2.f12173d;
                interfaceC10459q4 = interfaceC10459q3;
                f12 = f11;
                long j23 = jM4662d;
                i16 = i14;
                j14 = j13;
                j15 = j23;
            } else {
                if (i20 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if ((i12 & 2) != 0) {
                    float f110 = AbstractC3945L2.f12170a;
                    float f111 = AbstractC5234A.f16990a;
                    jM4662d = AbstractC3959O0.m4662d(26, c6021p);
                    i14 &= -113;
                }
                if (i22 != 0) {
                    f11 = AbstractC3945L2.f12170a;
                }
                if ((i12 & 8) != 0) {
                    float f112 = AbstractC3945L2.f12170a;
                    j13 = C14365u.f45059i;
                    i14 &= -7169;
                } else {
                    j13 = j12;
                }
                i15 = AbstractC3945L2.f12173d;
                interfaceC10459q4 = interfaceC10459q3;
                f12 = f11;
                long j24 = jM4662d;
                i16 = i14;
                j14 = j13;
                j15 = j24;
            }
            c6021p.m6554q();
            c16043h = new C16043h(((InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f)).mo7864b0(f12), 0.0f, i15, 0, 26);
            C13736L c13736lM15253r2 = AbstractC13758e.m15253r(null, c6021p, 1);
            C13783q0 c13783q1 = AbstractC13785r0.f43529b;
            C8990d c8990d2 = AbstractC13725A.f43291d;
            i17 = i16;
            j16 = j14;
            j17 = j15;
            c13733iM15245j = AbstractC13758e.m15245j(c13736lM15253r2, 0, 5, c13783q1, AbstractC13758e.m15252q(AbstractC13758e.m15255t(6660, 0, c8990d2, 2), 0, 6), null, c6021p, 33208, 16);
            c13733iM15242g = AbstractC13758e.m15242g(c13736lM15253r2, 0.0f, 286.0f, AbstractC13758e.m15252q(AbstractC13758e.m15255t(1332, 0, c8990d2, 2), 0, 6), null, c6021p, 4536, 8);
            C13738N c13738n3 = new C13738N();
            c13738n3.f43326a = 1332;
            C13737M c13737mM15216a2 = c13738n3.m15216a(Float.valueOf(0.0f), 0);
            C13792v c13792v2 = f12479j;
            c13737mM15216a2.f43324b = c13792v2;
            c13738n3.m15216a(Float.valueOf(290.0f), 666);
            c13733iM15242g2 = AbstractC13758e.m15242g(c13736lM15253r2, 0.0f, 290.0f, AbstractC13758e.m15252q(new C13739O(c13738n3), 0, 6), null, c6021p, 4536, 8);
            C13738N c13738n4 = new C13738N();
            c13738n4.f43326a = 1332;
            c13738n4.m15216a(Float.valueOf(0.0f), 666).f43324b = c13792v2;
            c13738n4.m15216a(Float.valueOf(290.0f), c13738n4.f43326a);
            c13733iM15242g3 = AbstractC13758e.m15242g(c13736lM15253r2, 0.0f, 290.0f, AbstractC13758e.m15252q(new C13739O(c13738n4), 0, 6), null, c6021p, 4536, 8);
            InterfaceC10459q interfaceC10459qM11252l2 = AbstractC10844c.m11252l(AbstractC2965l.m3789a(interfaceC10459q4, true, C14305r.f44910q0), f12474e);
            boolean zM6545h2 = ((((i17 & 7168) ^ 3072) <= 2048 && c6021p.m6540e(j16)) || (i17 & 3072) == 2048) | c6021p.m6545h(r29) | c6021p.m6542f(c13733iM15245j) | c6021p.m6542f(c13733iM15242g2) | c6021p.m6542f(c13733iM15242g3) | c6021p.m6542f(c13733iM15242g);
            if ((i17 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z13 = z6 | zM6545h2;
            if (((i17 & 112) ^ 48) > 32) {
                c13733i = c13733iM15242g2;
                j18 = j17;
                if (c6021p.m6540e(j18)) {
                    z10 = true;
                }
                z11 = z13 | z10;
                objM6514H = c6021p.m6514H();
                if (z11) {
                    objM6514H = new C2234h(j16, c16043h, c13733iM15245j, c13733i, c13733iM15242g3, c13733iM15242g, f12, j18);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C2234h(j16, c16043h, c13733iM15245j, c13733i, c13733iM15242g3, c13733iM15242g, f12, j18);
                    c6021p.m6537c0(objM6514H);
                }
                AbstractC8455C.m9069a(0, (InterfaceC1436k) objM6514H, c6021p, interfaceC10459qM11252l2);
                j19 = j16;
                j20 = j18;
                interfaceC10459q5 = interfaceC10459q4;
                f13 = f12;
                i18 = i15;
            } else {
                c13733i = c13733iM15242g2;
                j18 = j17;
            }
            if ((i17 & 48) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z13 | z10;
            objM6514H = c6021p.m6514H();
            if (z11) {
                objM6514H = new C2234h(j16, c16043h, c13733iM15245j, c13733i, c13733iM15242g3, c13733iM15242g, f12, j18);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C2234h(j16, c16043h, c13733iM15245j, c13733i, c13733iM15242g3, c13733iM15242g, f12, j18);
                c6021p.m6537c0(objM6514H);
            }
            AbstractC8455C.m9069a(0, (InterfaceC1436k) objM6514H, c6021p, interfaceC10459qM11252l2);
            j19 = j16;
            j20 = j18;
            interfaceC10459q5 = interfaceC10459q4;
            f13 = f12;
            i18 = i15;
        } else {
            c6021p.m6519N();
            if ((i11 & 1) != 0) {
                if (i20 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if ((i12 & 2) != 0) {
                    float f113 = AbstractC3945L2.f12170a;
                    float f114 = AbstractC5234A.f16990a;
                    jM4662d = AbstractC3959O0.m4662d(26, c6021p);
                    i14 &= -113;
                }
                if (i22 != 0) {
                    f11 = AbstractC3945L2.f12170a;
                }
                if ((i12 & 8) != 0) {
                    float f115 = AbstractC3945L2.f12170a;
                    j13 = C14365u.f45059i;
                    i14 &= -7169;
                } else {
                    j13 = j12;
                }
                i15 = AbstractC3945L2.f12173d;
                interfaceC10459q4 = interfaceC10459q3;
                f12 = f11;
                long j25 = jM4662d;
                i16 = i14;
                j14 = j13;
                j15 = j25;
            } else {
                if (i20 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if ((i12 & 2) != 0) {
                    float f116 = AbstractC3945L2.f12170a;
                    float f117 = AbstractC5234A.f16990a;
                    jM4662d = AbstractC3959O0.m4662d(26, c6021p);
                    i14 &= -113;
                }
                if (i22 != 0) {
                    f11 = AbstractC3945L2.f12170a;
                }
                if ((i12 & 8) != 0) {
                    float f118 = AbstractC3945L2.f12170a;
                    j13 = C14365u.f45059i;
                    i14 &= -7169;
                } else {
                    j13 = j12;
                }
                i15 = AbstractC3945L2.f12173d;
                interfaceC10459q4 = interfaceC10459q3;
                f12 = f11;
                long j26 = jM4662d;
                i16 = i14;
                j14 = j13;
                j15 = j26;
            }
            c6021p.m6554q();
            c16043h = new C16043h(((InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f)).mo7864b0(f12), 0.0f, i15, 0, 26);
            C13736L c13736lM15253r3 = AbstractC13758e.m15253r(null, c6021p, 1);
            C13783q0 c13783q2 = AbstractC13785r0.f43529b;
            C8990d c8990d3 = AbstractC13725A.f43291d;
            i17 = i16;
            j16 = j14;
            j17 = j15;
            c13733iM15245j = AbstractC13758e.m15245j(c13736lM15253r3, 0, 5, c13783q2, AbstractC13758e.m15252q(AbstractC13758e.m15255t(6660, 0, c8990d3, 2), 0, 6), null, c6021p, 33208, 16);
            c13733iM15242g = AbstractC13758e.m15242g(c13736lM15253r3, 0.0f, 286.0f, AbstractC13758e.m15252q(AbstractC13758e.m15255t(1332, 0, c8990d3, 2), 0, 6), null, c6021p, 4536, 8);
            C13738N c13738n5 = new C13738N();
            c13738n5.f43326a = 1332;
            C13737M c13737mM15216a3 = c13738n5.m15216a(Float.valueOf(0.0f), 0);
            C13792v c13792v3 = f12479j;
            c13737mM15216a3.f43324b = c13792v3;
            c13738n5.m15216a(Float.valueOf(290.0f), 666);
            c13733iM15242g2 = AbstractC13758e.m15242g(c13736lM15253r3, 0.0f, 290.0f, AbstractC13758e.m15252q(new C13739O(c13738n5), 0, 6), null, c6021p, 4536, 8);
            C13738N c13738n6 = new C13738N();
            c13738n6.f43326a = 1332;
            c13738n6.m15216a(Float.valueOf(0.0f), 666).f43324b = c13792v3;
            c13738n6.m15216a(Float.valueOf(290.0f), c13738n6.f43326a);
            c13733iM15242g3 = AbstractC13758e.m15242g(c13736lM15253r3, 0.0f, 290.0f, AbstractC13758e.m15252q(new C13739O(c13738n6), 0, 6), null, c6021p, 4536, 8);
            InterfaceC10459q interfaceC10459qM11252l3 = AbstractC10844c.m11252l(AbstractC2965l.m3789a(interfaceC10459q4, true, C14305r.f44910q0), f12474e);
            boolean zM6545h3 = ((((i17 & 7168) ^ 3072) <= 2048 && c6021p.m6540e(j16)) || (i17 & 3072) == 2048) | c6021p.m6545h(r29) | c6021p.m6542f(c13733iM15245j) | c6021p.m6542f(c13733iM15242g2) | c6021p.m6542f(c13733iM15242g3) | c6021p.m6542f(c13733iM15242g);
            if ((i17 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z14 = z6 | zM6545h3;
            if (((i17 & 112) ^ 48) > 32) {
                c13733i = c13733iM15242g2;
                j18 = j17;
                if (c6021p.m6540e(j18)) {
                    z10 = true;
                }
                z11 = z14 | z10;
                objM6514H = c6021p.m6514H();
                if (z11) {
                    objM6514H = new C2234h(j16, c16043h, c13733iM15245j, c13733i, c13733iM15242g3, c13733iM15242g, f12, j18);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C2234h(j16, c16043h, c13733iM15245j, c13733i, c13733iM15242g3, c13733iM15242g, f12, j18);
                    c6021p.m6537c0(objM6514H);
                }
                AbstractC8455C.m9069a(0, (InterfaceC1436k) objM6514H, c6021p, interfaceC10459qM11252l3);
                j19 = j16;
                j20 = j18;
                interfaceC10459q5 = interfaceC10459q4;
                f13 = f12;
                i18 = i15;
            } else {
                c13733i = c13733iM15242g2;
                j18 = j17;
            }
            if ((i17 & 48) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z14 | z10;
            objM6514H = c6021p.m6514H();
            if (z11) {
                objM6514H = new C2234h(j16, c16043h, c13733iM15245j, c13733i, c13733iM15242g3, c13733iM15242g, f12, j18);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C2234h(j16, c16043h, c13733iM15245j, c13733i, c13733iM15242g3, c13733iM15242g, f12, j18);
                c6021p.m6537c0(objM6514H);
            }
            AbstractC8455C.m9069a(0, (InterfaceC1436k) objM6514H, c6021p, interfaceC10459qM11252l3);
            j19 = j16;
            j20 = j18;
            interfaceC10459q5 = interfaceC10459q4;
            f13 = f12;
            i18 = i15;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3961O2(interfaceC10459q5, j20, f13, j19, i18, i11, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0166  */
    /* JADX WARN: Code duplicated, block: B:103:0x0168  */
    /* JADX WARN: Code duplicated, block: B:106:0x017c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0182  */
    /* JADX WARN: Code duplicated, block: B:114:0x0193  */
    /* JADX WARN: Code duplicated, block: B:116:0x0199  */
    /* JADX WARN: Code duplicated, block: B:122:0x01aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:129:0x01db  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:81:0x0101  */
    /* JADX WARN: Code duplicated, block: B:82:0x0104  */
    /* JADX WARN: Code duplicated, block: B:86:0x0114  */
    /* JADX WARN: Code duplicated, block: B:87:0x0116  */
    /* JADX WARN: Code duplicated, block: B:90:0x011d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x011f  */
    /* JADX WARN: Code duplicated, block: B:94:0x013b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x013d  */
    /* JADX WARN: Code duplicated, block: B:98:0x015c  */
    /* JADX WARN: Code duplicated, block: B:99:0x015e  */
    /* JADX INFO: renamed from: c */
    public static final void m4669c(InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, long j10, long j11, int i10, float f10, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i11, int i12) {
        int i13;
        long jM4662d;
        int i14;
        int i15;
        float f11;
        int i16;
        int i17;
        int i18;
        float f12;
        int i19;
        int i20;
        long j12;
        long j13;
        float f13;
        boolean z6;
        Object objM6514H;
        InterfaceC1426a interfaceC1426a2;
        boolean zM6542f;
        Object objM6514H2;
        boolean z10;
        boolean z11;
        boolean zM6542f2;
        Object objM6514H3;
        int i21;
        long j14;
        long j15;
        int i22;
        float f14;
        C6018n0 c6018n0M6555r;
        int i23;
        c6021p.m6526U(-339970038);
        if ((i11 & 6) == 0) {
            i13 = (c6021p.m6545h(interfaceC1426a) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            jM4662d = j10;
            i13 |= ((i12 & 4) == 0 && c6021p.m6540e(jM4662d)) ? 256 : 128;
        } else {
            jM4662d = j10;
        }
        if ((i11 & 3072) == 0) {
            i13 |= 1024;
        }
        int i24 = i12 & 16;
        if (i24 == 0) {
            if ((i11 & 24576) == 0) {
                i14 = i10;
                i13 |= c6021p.m6538d(i14) ? 16384 : 8192;
            }
            i15 = i12 & 32;
            if (i15 != 0) {
                i13 |= 196608;
                f11 = f10;
            } else {
                f11 = f10;
                if ((i11 & 196608) == 0) {
                    if (c6021p.m6536c(f11)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i13 |= i16;
                }
            }
            if ((i11 & 1572864) == 0) {
                if (c6021p.m6545h(interfaceC1436k)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i13 |= i23;
            }
            if ((i13 & 599187) == 599186 || !c6021p.m6562y()) {
                c6021p.m6519N();
                i17 = i11 & 1;
                Object obj = C6013l.f19514a;
                if (i17 != 0 || c6021p.m6561x()) {
                    if ((i12 & 4) != 0) {
                        float f15 = AbstractC3945L2.f12170a;
                        float f16 = AbstractC5234A.f16990a;
                        jM4662d = AbstractC3959O0.m4662d(26, c6021p);
                        i13 &= -897;
                    }
                    float f17 = AbstractC3945L2.f12170a;
                    float f18 = AbstractC5234A.f16990a;
                    long jM4662d2 = AbstractC3959O0.m4662d(32, c6021p);
                    int i25 = i13 & (-7169);
                    if (i24 != 0) {
                        i18 = AbstractC3945L2.f12171b;
                    } else {
                        i18 = i14;
                    }
                    if (i15 != 0) {
                        f12 = AbstractC3945L2.f12174e;
                    } else {
                        f12 = f11;
                    }
                    i19 = i18;
                    i20 = i25;
                    j12 = jM4662d;
                    j13 = jM4662d2;
                    f13 = f12;
                } else {
                    c6021p.m6517L();
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                    }
                    i20 = i13 & (-7169);
                    f13 = f11;
                    i19 = i14;
                    j12 = jM4662d;
                    j13 = j11;
                }
                c6021p.m6554q();
                if ((i20 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objM6514H = c6021p.m6514H();
                if (z6 || objM6514H == obj) {
                    objM6514H = new C2535p(8, interfaceC1426a);
                    c6021p.m6537c0(objM6514H);
                }
                interfaceC1426a2 = (InterfaceC1426a) objM6514H;
                InterfaceC10459q interfaceC10459qMo428M = interfaceC10459q.mo428M(f12471b);
                zM6542f = c6021p.m6542f(interfaceC1426a2);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f || objM6514H2 == obj) {
                    objM6514H2 = new C1811j0(7, interfaceC1426a2);
                    c6021p.m6537c0(objM6514H2);
                }
                InterfaceC10459q interfaceC10459qM11253m = AbstractC10844c.m11253m(AbstractC2965l.m3789a(interfaceC10459qMo428M, true, (InterfaceC1436k) objM6514H2), f12472c, f12473d);
                if ((57344 & i20) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((458752 & i20) == 131072) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zM6542f2 = z11 | z10 | c6021p.m6542f(interfaceC1426a2) | c6021p.m6540e(j13) | ((((i20 & 896) ^ 384) <= 256 && c6021p.m6540e(j12)) || (i20 & 384) == 256) | ((((3670016 & i20) ^ 1572864) <= 1048576 && c6021p.m6542f(interfaceC1436k)) || (i20 & 1572864) == 1048576);
                objM6514H3 = c6021p.m6514H();
                if (!zM6542f2 || objM6514H3 == obj) {
                    i21 = 0;
                    Object c3966p2 = new C3966P2(i19, f13, interfaceC1426a2, j13, j12, interfaceC1436k);
                    c6021p.m6537c0(c3966p2);
                    objM6514H3 = c3966p2;
                } else {
                    i21 = 0;
                }
                AbstractC8455C.m9069a(i21, (InterfaceC1436k) objM6514H3, c6021p, interfaceC10459qM11253m);
                j14 = j12;
                j15 = j13;
                i22 = i19;
                f14 = f13;
            } else {
                c6021p.m6517L();
                j15 = j11;
                f14 = f11;
                j14 = jM4662d;
                i22 = i14;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C3971Q2(interfaceC1426a, interfaceC10459q, j14, j15, i22, f14, interfaceC1436k, i11, i12);
            }
        }
        i13 |= 24576;
        i14 = i10;
        i15 = i12 & 32;
        if (i15 != 0) {
            i13 |= 196608;
            f11 = f10;
        } else {
            f11 = f10;
            if ((i11 & 196608) == 0) {
                if (c6021p.m6536c(f11)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i13 |= i16;
            }
        }
        if ((i11 & 1572864) == 0) {
            if (c6021p.m6545h(interfaceC1436k)) {
                i23 = 1048576;
            } else {
                i23 = 524288;
            }
            i13 |= i23;
        }
        if ((i13 & 599187) == 599186) {
            c6021p.m6519N();
            i17 = i11 & 1;
            Object obj2 = C6013l.f19514a;
            if (i17 != 0) {
                if ((i12 & 4) != 0) {
                    float f19 = AbstractC3945L2.f12170a;
                    float f110 = AbstractC5234A.f16990a;
                    jM4662d = AbstractC3959O0.m4662d(26, c6021p);
                    i13 &= -897;
                }
                float f111 = AbstractC3945L2.f12170a;
                float f112 = AbstractC5234A.f16990a;
                long jM4662d3 = AbstractC3959O0.m4662d(32, c6021p);
                int i26 = i13 & (-7169);
                if (i24 != 0) {
                    i18 = AbstractC3945L2.f12171b;
                } else {
                    i18 = i14;
                }
                if (i15 != 0) {
                    f12 = AbstractC3945L2.f12174e;
                } else {
                    f12 = f11;
                }
                i19 = i18;
                i20 = i26;
                j12 = jM4662d;
                j13 = jM4662d3;
                f13 = f12;
            } else {
                if ((i12 & 4) != 0) {
                    float f113 = AbstractC3945L2.f12170a;
                    float f114 = AbstractC5234A.f16990a;
                    jM4662d = AbstractC3959O0.m4662d(26, c6021p);
                    i13 &= -897;
                }
                float f115 = AbstractC3945L2.f12170a;
                float f116 = AbstractC5234A.f16990a;
                long jM4662d4 = AbstractC3959O0.m4662d(32, c6021p);
                int i27 = i13 & (-7169);
                if (i24 != 0) {
                    i18 = AbstractC3945L2.f12171b;
                } else {
                    i18 = i14;
                }
                if (i15 != 0) {
                    f12 = AbstractC3945L2.f12174e;
                } else {
                    f12 = f11;
                }
                i19 = i18;
                i20 = i27;
                j12 = jM4662d;
                j13 = jM4662d4;
                f13 = f12;
            }
            c6021p.m6554q();
            if ((i20 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            objM6514H = c6021p.m6514H();
            if (z6) {
                objM6514H = new C2535p(8, interfaceC1426a);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C2535p(8, interfaceC1426a);
                c6021p.m6537c0(objM6514H);
            }
            interfaceC1426a2 = (InterfaceC1426a) objM6514H;
            InterfaceC10459q interfaceC10459qMo428M2 = interfaceC10459q.mo428M(f12471b);
            zM6542f = c6021p.m6542f(interfaceC1426a2);
            objM6514H2 = c6021p.m6514H();
            if (zM6542f) {
                objM6514H2 = new C1811j0(7, interfaceC1426a2);
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = new C1811j0(7, interfaceC1426a2);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC10459q interfaceC10459qM11253m2 = AbstractC10844c.m11253m(AbstractC2965l.m3789a(interfaceC10459qMo428M2, true, (InterfaceC1436k) objM6514H2), f12472c, f12473d);
            if ((57344 & i20) == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((458752 & i20) == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            zM6542f2 = z11 | z10 | c6021p.m6542f(interfaceC1426a2) | c6021p.m6540e(j13) | ((((i20 & 896) ^ 384) <= 256 && c6021p.m6540e(j12)) || (i20 & 384) == 256) | ((((3670016 & i20) ^ 1572864) <= 1048576 && c6021p.m6542f(interfaceC1436k)) || (i20 & 1572864) == 1048576);
            objM6514H3 = c6021p.m6514H();
            if (zM6542f2) {
                i21 = 0;
                Object c3966p3 = new C3966P2(i19, f13, interfaceC1426a2, j13, j12, interfaceC1436k);
                c6021p.m6537c0(c3966p3);
                objM6514H3 = c3966p3;
            } else {
                i21 = 0;
                Object c3966p4 = new C3966P2(i19, f13, interfaceC1426a2, j13, j12, interfaceC1436k);
                c6021p.m6537c0(c3966p4);
                objM6514H3 = c3966p4;
            }
            AbstractC8455C.m9069a(i21, (InterfaceC1436k) objM6514H3, c6021p, interfaceC10459qM11253m2);
            j14 = j12;
            j15 = j13;
            i22 = i19;
            f14 = f13;
        } else {
            c6021p.m6519N();
            i17 = i11 & 1;
            Object obj3 = C6013l.f19514a;
            if (i17 != 0) {
                if ((i12 & 4) != 0) {
                    float f117 = AbstractC3945L2.f12170a;
                    float f118 = AbstractC5234A.f16990a;
                    jM4662d = AbstractC3959O0.m4662d(26, c6021p);
                    i13 &= -897;
                }
                float f119 = AbstractC3945L2.f12170a;
                float f1110 = AbstractC5234A.f16990a;
                long jM4662d5 = AbstractC3959O0.m4662d(32, c6021p);
                int i28 = i13 & (-7169);
                if (i24 != 0) {
                    i18 = AbstractC3945L2.f12171b;
                } else {
                    i18 = i14;
                }
                if (i15 != 0) {
                    f12 = AbstractC3945L2.f12174e;
                } else {
                    f12 = f11;
                }
                i19 = i18;
                i20 = i28;
                j12 = jM4662d;
                j13 = jM4662d5;
                f13 = f12;
            } else {
                if ((i12 & 4) != 0) {
                    float f1111 = AbstractC3945L2.f12170a;
                    float f1112 = AbstractC5234A.f16990a;
                    jM4662d = AbstractC3959O0.m4662d(26, c6021p);
                    i13 &= -897;
                }
                float f1113 = AbstractC3945L2.f12170a;
                float f1114 = AbstractC5234A.f16990a;
                long jM4662d6 = AbstractC3959O0.m4662d(32, c6021p);
                int i29 = i13 & (-7169);
                if (i24 != 0) {
                    i18 = AbstractC3945L2.f12171b;
                } else {
                    i18 = i14;
                }
                if (i15 != 0) {
                    f12 = AbstractC3945L2.f12174e;
                } else {
                    f12 = f11;
                }
                i19 = i18;
                i20 = i29;
                j12 = jM4662d;
                j13 = jM4662d6;
                f13 = f12;
            }
            c6021p.m6554q();
            if ((i20 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            objM6514H = c6021p.m6514H();
            if (z6) {
                objM6514H = new C2535p(8, interfaceC1426a);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C2535p(8, interfaceC1426a);
                c6021p.m6537c0(objM6514H);
            }
            interfaceC1426a2 = (InterfaceC1426a) objM6514H;
            InterfaceC10459q interfaceC10459qMo428M3 = interfaceC10459q.mo428M(f12471b);
            zM6542f = c6021p.m6542f(interfaceC1426a2);
            objM6514H2 = c6021p.m6514H();
            if (zM6542f) {
                objM6514H2 = new C1811j0(7, interfaceC1426a2);
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = new C1811j0(7, interfaceC1426a2);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC10459q interfaceC10459qM11253m3 = AbstractC10844c.m11253m(AbstractC2965l.m3789a(interfaceC10459qMo428M3, true, (InterfaceC1436k) objM6514H2), f12472c, f12473d);
            if ((57344 & i20) == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((458752 & i20) == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            zM6542f2 = z11 | z10 | c6021p.m6542f(interfaceC1426a2) | c6021p.m6540e(j13) | ((((i20 & 896) ^ 384) <= 256 && c6021p.m6540e(j12)) || (i20 & 384) == 256) | ((((3670016 & i20) ^ 1572864) <= 1048576 && c6021p.m6542f(interfaceC1436k)) || (i20 & 1572864) == 1048576);
            objM6514H3 = c6021p.m6514H();
            if (zM6542f2) {
                i21 = 0;
                Object c3966p5 = new C3966P2(i19, f13, interfaceC1426a2, j13, j12, interfaceC1436k);
                c6021p.m6537c0(c3966p5);
                objM6514H3 = c3966p5;
            } else {
                i21 = 0;
                Object c3966p6 = new C3966P2(i19, f13, interfaceC1426a2, j13, j12, interfaceC1436k);
                c6021p.m6537c0(c3966p6);
                objM6514H3 = c3966p6;
            }
            AbstractC8455C.m9069a(i21, (InterfaceC1436k) objM6514H3, c6021p, interfaceC10459qM11253m3);
            j14 = j12;
            j15 = j13;
            i22 = i19;
            f14 = f13;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3971Q2(interfaceC1426a, interfaceC10459q, j14, j15, i22, f14, interfaceC1436k, i11, i12);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m4670d(float f10, int i10, int i11, long j10, long j11, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i12;
        int i13;
        long j12;
        long jM4662d;
        int i14;
        float f11;
        long j13;
        long j14;
        float f12;
        int i15;
        long j15;
        c6021p.m6526U(567589233);
        if ((i11 & 6) == 0) {
            i12 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= 128;
        }
        int i16 = i12 | 27648;
        if ((i16 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            f12 = f10;
            i15 = i10;
            j14 = j10;
            j15 = j11;
        } else {
            c6021p.m6519N();
            if ((i11 & 1) == 0 || c6021p.m6561x()) {
                float f13 = AbstractC3945L2.f12170a;
                float f14 = AbstractC5234A.f16990a;
                long jM4662d2 = AbstractC3959O0.m4662d(26, c6021p);
                i13 = i16 & (-1009);
                j12 = jM4662d2;
                jM4662d = AbstractC3959O0.m4662d(32, c6021p);
                i14 = AbstractC3945L2.f12171b;
                f11 = AbstractC3945L2.f12174e;
            } else {
                c6021p.m6517L();
                f11 = f10;
                i14 = i10;
                j12 = j10;
                jM4662d = j11;
                i13 = i16 & (-1009);
            }
            c6021p.m6554q();
            C13736L c13736lM15253r = AbstractC13758e.m15253r(null, c6021p, 1);
            C13738N c13738n = new C13738N();
            c13738n.f43326a = 1800;
            c13738n.m15216a(Float.valueOf(0.0f), 0).f43324b = f12475f;
            c13738n.m15216a(Float.valueOf(1.0f), 750);
            int i17 = i13;
            C13733I c13733iM15242g = AbstractC13758e.m15242g(c13736lM15253r, 0.0f, 1.0f, AbstractC13758e.m15252q(new C13739O(c13738n), 0, 6), null, c6021p, 4536, 8);
            C13738N c13738n2 = new C13738N();
            c13738n2.f43326a = 1800;
            c13738n2.m15216a(Float.valueOf(0.0f), 333).f43324b = f12476g;
            c13738n2.m15216a(Float.valueOf(1.0f), 1183);
            C13733I c13733iM15242g2 = AbstractC13758e.m15242g(c13736lM15253r, 0.0f, 1.0f, AbstractC13758e.m15252q(new C13739O(c13738n2), 0, 6), null, c6021p, 4536, 8);
            C13738N c13738n3 = new C13738N();
            c13738n3.f43326a = 1800;
            c13738n3.m15216a(Float.valueOf(0.0f), 1000).f43324b = f12477h;
            c13738n3.m15216a(Float.valueOf(1.0f), 1567);
            C13733I c13733iM15242g3 = AbstractC13758e.m15242g(c13736lM15253r, 0.0f, 1.0f, AbstractC13758e.m15252q(new C13739O(c13738n3), 0, 6), null, c6021p, 4536, 8);
            C13738N c13738n4 = new C13738N();
            c13738n4.f43326a = 1800;
            c13738n4.m15216a(Float.valueOf(0.0f), 1267).f43324b = f12478i;
            c13738n4.m15216a(Float.valueOf(1.0f), 1800);
            C13733I c13733iM15242g4 = AbstractC13758e.m15242g(c13736lM15253r, 0.0f, 1.0f, AbstractC13758e.m15252q(new C13739O(c13738n4), 0, 6), null, c6021p, 4536, 8);
            InterfaceC10459q interfaceC10459qM11253m = AbstractC10844c.m11253m(AbstractC2965l.m3789a(interfaceC10459q.mo428M(f12471b), true, C14305r.f44910q0), f12472c, f12473d);
            boolean zM6542f = ((i17 & 7168) == 2048) | ((i17 & 57344) == 16384) | c6021p.m6542f(c13733iM15242g) | c6021p.m6540e(jM4662d) | c6021p.m6542f(c13733iM15242g2) | c6021p.m6540e(j12) | c6021p.m6542f(c13733iM15242g3) | c6021p.m6542f(c13733iM15242g4);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                j13 = jM4662d;
                j14 = j12;
                objM6514H = new C3975R2(i14, f11, c13733iM15242g, j13, c13733iM15242g2, j14, c13733iM15242g3, c13733iM15242g4);
                c6021p.m6537c0(objM6514H);
            } else {
                j13 = jM4662d;
                j14 = j12;
            }
            AbstractC8455C.m9069a(0, (InterfaceC1436k) objM6514H, c6021p, interfaceC10459qM11253m);
            f12 = f11;
            i15 = i14;
            j15 = j13;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2235i(interfaceC10459q, j14, j15, i15, f12, i11);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m4671e(InterfaceC16039d interfaceC16039d, float f10, float f11, long j10, float f12, int i10) {
        float fM15333e = C13803e.m15333e(interfaceC16039d.mo17602i());
        float fM15331c = C13803e.m15331c(interfaceC16039d.mo17602i());
        float f13 = 2;
        float f14 = fM15331c / f13;
        boolean z6 = interfaceC16039d.getLayoutDirection() == EnumC7546k.f23904Y;
        float f15 = (z6 ? f10 : 1.0f - f11) * fM15333e;
        float f16 = (z6 ? f11 : 1.0f - f10) * fM15333e;
        if (AbstractC14334L.m15642t(i10, 0) || fM15331c > fM15333e) {
            interfaceC16039d.mo17607x0(j10, AbstractC8088f6.m8536b(f15, f14), AbstractC8088f6.m8536b(f16, f14), f12, (480 & 16) != 0 ? 0 : 0, 1.0f, null, 3);
            return;
        }
        float f17 = f12 / f13;
        C3505d c3505d = new C3505d(f17, fM15333e - f17);
        float fFloatValue = ((Number) AbstractC8301I.m8924o(Float.valueOf(f15), c3505d)).floatValue();
        float fFloatValue2 = ((Number) AbstractC8301I.m8924o(Float.valueOf(f16), c3505d)).floatValue();
        if (Math.abs(f11 - f10) > 0.0f) {
            interfaceC16039d.mo17607x0(j10, AbstractC8088f6.m8536b(fFloatValue, f14), AbstractC8088f6.m8536b(fFloatValue2, f14), f12, (480 & 16) != 0 ? 0 : i10, 1.0f, null, 3);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m4672f(InterfaceC16039d interfaceC16039d, float f10, float f11, long j10, C16043h c16043h) {
        float f12 = 2;
        float f13 = c16043h.f49484a / f12;
        float fM15333e = C13803e.m15333e(interfaceC16039d.mo17602i()) - (f12 * f13);
        interfaceC16039d.mo17606v(j10, f10, f11, AbstractC8088f6.m8536b(f13, f13), AbstractC8112i6.m8603a(fM15333e, fM15333e), (832 & 64) != 0 ? 1.0f : 0.0f, c16043h, null, 3);
    }
}
