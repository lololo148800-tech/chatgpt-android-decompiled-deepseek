package p878lo;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p1014t1.C19731h;
import p1014t1.C19738o;
import p1014t1.C19748y;
import p1135yn.AbstractC21558e;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p1140z1.AbstractC21690f;
import p228J.AbstractC3794B0;
import p523V9.AbstractC8128k6;
import p523V9.AbstractC8136l6;
import p523V9.AbstractC8144m6;
import p544W9.AbstractC8460C4;
import p547Wc.C8805o;
import p571X9.AbstractC9233X;
import p758g0.C13775m0;
import p759g1.C13800b;
import p759g1.C13803e;
import p858ko.C16490I;
import p858ko.C16491J;
import p858ko.C16492K;
import p858ko.C16495N;
import p860l0.AbstractC16689K1;
import p860l0.AbstractC16750j0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: lo.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C17110s extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public C19738o f54675Z;

    /* JADX INFO: renamed from: o0 */
    public long f54676o0;

    /* JADX INFO: renamed from: p0 */
    public int f54677p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f54678q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C17113v f54679r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C17113v f54680s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C17113v f54681t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C19723A f54682u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ C17113v f54683v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ C17113v f54684w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17110s(C17113v c17113v, C17113v c17113v2, C17113v c17113v3, C19723A c19723a, C17113v c17113v4, C17113v c17113v5, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54679r0 = c17113v;
        this.f54680s0 = c17113v2;
        this.f54681t0 = c17113v3;
        this.f54682u0 = c19723a;
        this.f54683v0 = c17113v4;
        this.f54684w0 = c17113v5;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C17113v c17113v = this.f54683v0;
        C17113v c17113v2 = this.f54684w0;
        C17110s c17110s = new C17110s(this.f54679r0, this.f54680s0, this.f54681t0, this.f54682u0, c17113v, c17113v2, interfaceC18770c);
        c17110s.f54678q0 = obj;
        return c17110s;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17110s) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0090  */
    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:43:0x0103 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0104  */
    /* JADX WARN: Code duplicated, block: B:47:0x0112  */
    /* JADX WARN: Code duplicated, block: B:49:0x0117  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0123  */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0158  */
    /* JADX WARN: Code duplicated, block: B:60:0x0180 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x0185  */
    /* JADX WARN: Code duplicated, block: B:65:0x019c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x01db  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:76:0x0207  */
    /* JADX WARN: Code duplicated, block: B:79:0x0221  */
    /* JADX WARN: Code duplicated, block: B:81:0x022b  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C19748y c19748y;
        Object objM18506c;
        C19738o c19738o;
        long jMo499b;
        C19738o c19738o2;
        C19748y c19748y2;
        C19738o c19738o3;
        Object objM20698e;
        C19748y c19748y3;
        C19738o c19738o4;
        long j10;
        InterfaceC1436k interfaceC1436k;
        Object objM20699f;
        C19748y c19748y4;
        C19738o c19738o5;
        long jNanoTime;
        long jM4489n;
        long jM15310k;
        Object objM18522f;
        C17113v c17113v;
        long j11;
        InterfaceC1436k interfaceC1436k2;
        long jNanoTime2;
        EnumC21557d unit;
        long j12;
        C19748y c19748y5;
        long jM8645k;
        EnumC21557d enumC21557d;
        long j13;
        C17116y c17116y;
        long j14;
        C13775m0 c13775m0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f54677p0;
        C17113v c17113v2 = this.f54683v0;
        C17113v c17113v3 = this.f54680s0;
        switch (i10) {
            case 0:
                AbstractC9233X.m9807c(obj);
                c19748y = (C19748y) this.f54678q0;
                this.f54678q0 = c19748y;
                this.f54677p0 = 1;
                objM18506c = AbstractC16689K1.m18506c(c19748y, null, this, 3);
                if (objM18506c == enumC19250a) {
                    return enumC19250a;
                }
                c19738o = (C19738o) objM18506c;
                c19738o.m20691a();
                C16491J c16491j = this.f54679r0.f54696Z.f54704B0;
                c16491j.getClass();
                C16495N c16495n = c16491j.f51161Z;
                AbstractC0575H.m1156D(c16495n.m10935y0(), null, null, new C16492K(c16495n, null), 3);
                if (c17113v3 != null) {
                    jMo499b = c19748y.m20697d().mo499b();
                } else {
                    jMo499b = 4611686018427387903L;
                }
                try {
                    C17109r c17109r = new C17109r(2, null);
                    this.f54678q0 = c19748y;
                    this.f54675Z = c19738o;
                    this.f54677p0 = 2;
                    objM20698e = c19748y.m20698e(jMo499b, c17109r, this);
                    if (objM20698e == enumC19250a) {
                        return enumC19250a;
                    }
                    c19748y2 = c19748y;
                    c19738o3 = c19738o;
                    c19738o2 = (C19738o) objM20698e;
                    if (c19738o2 != null) {
                        try {
                            c19738o2.m20691a();
                        } catch (C19731h unused) {
                            if (c17113v3 != null) {
                                j10 = c19738o3.f62480c;
                                interfaceC1436k = c17113v3.f54696Z.f54706D0;
                                if (interfaceC1436k != null) {
                                    interfaceC1436k.invoke(new C13800b(j10));
                                }
                            }
                            this.f54678q0 = c19748y2;
                            this.f54675Z = c19738o2;
                            this.f54677p0 = 3;
                            if (AbstractC8460C4.m9081a(c19748y2, this) == enumC19250a) {
                                return enumC19250a;
                            }
                            c19748y3 = c19748y2;
                            c19738o4 = c19738o2;
                            c19748y2 = c19748y3;
                        }
                        break;
                    }
                    c19738o4 = c19738o2;
                    if (c19738o4 != null) {
                        this.f54678q0 = c19748y2;
                        this.f54675Z = c19738o4;
                        this.f54677p0 = 4;
                        objM20699f = c19748y2.m20699f(c19748y2.m20697d().mo498a(), new C17107p(c19738o4, null), this);
                        if (objM20699f == enumC19250a) {
                            return enumC19250a;
                        }
                        c19748y4 = c19748y2;
                        c19738o5 = (C19738o) objM20699f;
                        int i11 = AbstractC21558e.f68274b;
                        jNanoTime = System.nanoTime() - AbstractC21558e.f68273a;
                        if (c19738o5 != null) {
                            c19738o5.m20691a();
                        }
                        if (c19738o5 == null) {
                            c17113v = this.f54681t0;
                            if (c17113v != null) {
                                j11 = c19738o4.f62480c;
                                interfaceC1436k2 = c17113v.f54696Z.f54705C0;
                                if (interfaceC1436k2 != null) {
                                    interfaceC1436k2.invoke(new C13800b(j11));
                                }
                            }
                        } else {
                            C19723A c19723a = this.f54682u0;
                            c19723a.getClass();
                            jM4489n = AbstractC3794B0.m4489n(AbstractC21690f.m22217v(c19723a).f68635F0.mo501d(), c19723a);
                            jM15310k = C13800b.m15310k(c19738o5.f62480c, c19738o4.f62480c);
                            if (Math.abs(C13800b.m15306g(jM15310k)) < C13803e.m15333e(jM4489n) && Math.abs(C13800b.m15307h(jM15310k)) < C13803e.m15331c(jM4489n)) {
                                C8805o c8805o = new C8805o(c17113v2, 22, c19738o5);
                                this.f54678q0 = c19748y4;
                                this.f54675Z = c19738o5;
                                this.f54676o0 = jNanoTime;
                                this.f54677p0 = 5;
                                objM18522f = AbstractC16750j0.m18522f(c19748y4, c19738o5.f62478a, c8805o, this);
                                if (objM18522f == enumC19250a) {
                                    return enumC19250a;
                                }
                                if (((C19738o) objM18522f) != null) {
                                    j14 = c19738o5.f62478a;
                                    c13775m0 = new C13775m0(c17113v2, 26, c19738o5);
                                    this.f54678q0 = null;
                                    this.f54675Z = null;
                                    this.f54677p0 = 6;
                                    if (AbstractC16750j0.m18530n(c19748y4, j14, c13775m0, this) == enumC19250a) {
                                        return enumC19250a;
                                    }
                                    c17113v2.invoke(C17102k.f54654a);
                                } else {
                                    int i12 = AbstractC21558e.f68274b;
                                    jNanoTime2 = System.nanoTime() - AbstractC21558e.f68273a;
                                    unit = EnumC21557d.NANOSECONDS;
                                    AbstractC16544l.m18094g(unit, "unit");
                                    if (((jNanoTime - 1) | 1) == Long.MAX_VALUE) {
                                        jM8645k = C21555b.m21843m(AbstractC8144m6.m8683d(jNanoTime));
                                        c19748y5 = c19748y4;
                                    } else {
                                        j12 = jNanoTime2 - jNanoTime;
                                        c19748y5 = c19748y4;
                                        if (((~(j12 ^ jNanoTime)) & (j12 ^ jNanoTime2)) < 0) {
                                            enumC21557d = EnumC21557d.MILLISECONDS;
                                            if (unit.compareTo(enumC21557d) < 0) {
                                                long jM8663d = AbstractC8136l6.m8663d(1L, enumC21557d, unit);
                                                C21554a c21554a = C21555b.f68260Z;
                                                jM8645k = C21555b.m21839i(AbstractC8128k6.m8645k((jNanoTime2 / jM8663d) - (jNanoTime / jM8663d), enumC21557d), AbstractC8128k6.m8645k((jNanoTime2 % jM8663d) - (jNanoTime % jM8663d), unit));
                                            } else {
                                                jM8645k = C21555b.m21843m(AbstractC8144m6.m8683d(j12));
                                            }
                                        } else {
                                            jM8645k = AbstractC8128k6.m8645k(j12, unit);
                                        }
                                    }
                                    C21554a c21554a2 = C21555b.f68260Z;
                                    if (C21555b.m21833c(jM8645k, AbstractC8128k6.m8645k(c19748y5.m20697d().mo498a(), EnumC21557d.MILLISECONDS)) < 0) {
                                        j13 = c19738o5.f62480c;
                                        c17116y = this.f54684w0.f54696Z;
                                        if (c17116y.f54710H0) {
                                            C16491J c16491j2 = c17116y.f54707E0;
                                            c16491j2.getClass();
                                            C16495N c16495n2 = c16491j2.f51161Z;
                                            AbstractC0575H.m1156D(c16495n2.m10935y0(), null, null, new C16490I(c16495n2, j13, null), 3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return C17296C.f55119a;
                } catch (C19731h unused2) {
                    c19738o2 = null;
                    c19748y2 = c19748y;
                    c19738o3 = c19738o;
                    if (c17113v3 != null) {
                        j10 = c19738o3.f62480c;
                        interfaceC1436k = c17113v3.f54696Z.f54706D0;
                        if (interfaceC1436k != null) {
                            interfaceC1436k.invoke(new C13800b(j10));
                        }
                    }
                    this.f54678q0 = c19748y2;
                    this.f54675Z = c19738o2;
                    this.f54677p0 = 3;
                    if (AbstractC8460C4.m9081a(c19748y2, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    c19748y3 = c19748y2;
                    c19738o4 = c19738o2;
                    c19748y2 = c19748y3;
                    if (c19738o4 != null) {
                        this.f54678q0 = c19748y2;
                        this.f54675Z = c19738o4;
                        this.f54677p0 = 4;
                        objM20699f = c19748y2.m20699f(c19748y2.m20697d().mo498a(), new C17107p(c19738o4, null), this);
                        if (objM20699f == enumC19250a) {
                            return enumC19250a;
                        }
                        c19748y4 = c19748y2;
                        c19738o5 = (C19738o) objM20699f;
                        int i13 = AbstractC21558e.f68274b;
                        jNanoTime = System.nanoTime() - AbstractC21558e.f68273a;
                        if (c19738o5 != null) {
                            c19738o5.m20691a();
                        }
                        if (c19738o5 == null) {
                            c17113v = this.f54681t0;
                            if (c17113v != null) {
                                j11 = c19738o4.f62480c;
                                interfaceC1436k2 = c17113v.f54696Z.f54705C0;
                                if (interfaceC1436k2 != null) {
                                    interfaceC1436k2.invoke(new C13800b(j11));
                                }
                            }
                        } else {
                            C19723A c19723a2 = this.f54682u0;
                            c19723a2.getClass();
                            jM4489n = AbstractC3794B0.m4489n(AbstractC21690f.m22217v(c19723a2).f68635F0.mo501d(), c19723a2);
                            jM15310k = C13800b.m15310k(c19738o5.f62480c, c19738o4.f62480c);
                            if (Math.abs(C13800b.m15306g(jM15310k)) < C13803e.m15333e(jM4489n)) {
                                C8805o c8805o2 = new C8805o(c17113v2, 22, c19738o5);
                                this.f54678q0 = c19748y4;
                                this.f54675Z = c19738o5;
                                this.f54676o0 = jNanoTime;
                                this.f54677p0 = 5;
                                objM18522f = AbstractC16750j0.m18522f(c19748y4, c19738o5.f62478a, c8805o2, this);
                                if (objM18522f == enumC19250a) {
                                    return enumC19250a;
                                }
                                if (((C19738o) objM18522f) != null) {
                                    j14 = c19738o5.f62478a;
                                    c13775m0 = new C13775m0(c17113v2, 26, c19738o5);
                                    this.f54678q0 = null;
                                    this.f54675Z = null;
                                    this.f54677p0 = 6;
                                    if (AbstractC16750j0.m18530n(c19748y4, j14, c13775m0, this) == enumC19250a) {
                                        return enumC19250a;
                                    }
                                    c17113v2.invoke(C17102k.f54654a);
                                } else {
                                    int i14 = AbstractC21558e.f68274b;
                                    jNanoTime2 = System.nanoTime() - AbstractC21558e.f68273a;
                                    unit = EnumC21557d.NANOSECONDS;
                                    AbstractC16544l.m18094g(unit, "unit");
                                    if (((jNanoTime - 1) | 1) == Long.MAX_VALUE) {
                                        jM8645k = C21555b.m21843m(AbstractC8144m6.m8683d(jNanoTime));
                                        c19748y5 = c19748y4;
                                    } else {
                                        j12 = jNanoTime2 - jNanoTime;
                                        c19748y5 = c19748y4;
                                        if (((~(j12 ^ jNanoTime)) & (j12 ^ jNanoTime2)) < 0) {
                                            enumC21557d = EnumC21557d.MILLISECONDS;
                                            if (unit.compareTo(enumC21557d) < 0) {
                                                long jM8663d2 = AbstractC8136l6.m8663d(1L, enumC21557d, unit);
                                                C21554a c21554a3 = C21555b.f68260Z;
                                                jM8645k = C21555b.m21839i(AbstractC8128k6.m8645k((jNanoTime2 / jM8663d2) - (jNanoTime / jM8663d2), enumC21557d), AbstractC8128k6.m8645k((jNanoTime2 % jM8663d2) - (jNanoTime % jM8663d2), unit));
                                            } else {
                                                jM8645k = C21555b.m21843m(AbstractC8144m6.m8683d(j12));
                                            }
                                        } else {
                                            jM8645k = AbstractC8128k6.m8645k(j12, unit);
                                        }
                                    }
                                    C21554a c21554a4 = C21555b.f68260Z;
                                    if (C21555b.m21833c(jM8645k, AbstractC8128k6.m8645k(c19748y5.m20697d().mo498a(), EnumC21557d.MILLISECONDS)) < 0) {
                                        j13 = c19738o5.f62480c;
                                        c17116y = this.f54684w0.f54696Z;
                                        if (c17116y.f54710H0) {
                                            C16491J c16491j3 = c17116y.f54707E0;
                                            c16491j3.getClass();
                                            C16495N c16495n3 = c16491j3.f51161Z;
                                            AbstractC0575H.m1156D(c16495n3.m10935y0(), null, null, new C16490I(c16495n3, j13, null), 3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return C17296C.f55119a;
                }
            case 1:
                c19748y = (C19748y) this.f54678q0;
                AbstractC9233X.m9807c(obj);
                objM18506c = obj;
                c19738o = (C19738o) objM18506c;
                c19738o.m20691a();
                C16491J c16491j4 = this.f54679r0.f54696Z.f54704B0;
                c16491j4.getClass();
                C16495N c16495n4 = c16491j4.f51161Z;
                AbstractC0575H.m1156D(c16495n4.m10935y0(), null, null, new C16492K(c16495n4, null), 3);
                if (c17113v3 != null) {
                    jMo499b = c19748y.m20697d().mo499b();
                } else {
                    jMo499b = 4611686018427387903L;
                }
                C17109r c17109r2 = new C17109r(2, null);
                this.f54678q0 = c19748y;
                this.f54675Z = c19738o;
                this.f54677p0 = 2;
                objM20698e = c19748y.m20698e(jMo499b, c17109r2, this);
                if (objM20698e == enumC19250a) {
                    return enumC19250a;
                }
                c19748y2 = c19748y;
                c19738o3 = c19738o;
                c19738o2 = (C19738o) objM20698e;
                if (c19738o2 != null) {
                    c19738o2.m20691a();
                    break;
                }
                c19738o4 = c19738o2;
                if (c19738o4 != null) {
                    this.f54678q0 = c19748y2;
                    this.f54675Z = c19738o4;
                    this.f54677p0 = 4;
                    objM20699f = c19748y2.m20699f(c19748y2.m20697d().mo498a(), new C17107p(c19738o4, null), this);
                    if (objM20699f == enumC19250a) {
                        return enumC19250a;
                    }
                    c19748y4 = c19748y2;
                    c19738o5 = (C19738o) objM20699f;
                    int i15 = AbstractC21558e.f68274b;
                    jNanoTime = System.nanoTime() - AbstractC21558e.f68273a;
                    if (c19738o5 != null) {
                        c19738o5.m20691a();
                    }
                    if (c19738o5 == null) {
                        c17113v = this.f54681t0;
                        if (c17113v != null) {
                            j11 = c19738o4.f62480c;
                            interfaceC1436k2 = c17113v.f54696Z.f54705C0;
                            if (interfaceC1436k2 != null) {
                                interfaceC1436k2.invoke(new C13800b(j11));
                            }
                        }
                    } else {
                        C19723A c19723a3 = this.f54682u0;
                        c19723a3.getClass();
                        jM4489n = AbstractC3794B0.m4489n(AbstractC21690f.m22217v(c19723a3).f68635F0.mo501d(), c19723a3);
                        jM15310k = C13800b.m15310k(c19738o5.f62480c, c19738o4.f62480c);
                        if (Math.abs(C13800b.m15306g(jM15310k)) < C13803e.m15333e(jM4489n)) {
                            C8805o c8805o3 = new C8805o(c17113v2, 22, c19738o5);
                            this.f54678q0 = c19748y4;
                            this.f54675Z = c19738o5;
                            this.f54676o0 = jNanoTime;
                            this.f54677p0 = 5;
                            objM18522f = AbstractC16750j0.m18522f(c19748y4, c19738o5.f62478a, c8805o3, this);
                            if (objM18522f == enumC19250a) {
                                return enumC19250a;
                            }
                            if (((C19738o) objM18522f) != null) {
                                j14 = c19738o5.f62478a;
                                c13775m0 = new C13775m0(c17113v2, 26, c19738o5);
                                this.f54678q0 = null;
                                this.f54675Z = null;
                                this.f54677p0 = 6;
                                if (AbstractC16750j0.m18530n(c19748y4, j14, c13775m0, this) == enumC19250a) {
                                    return enumC19250a;
                                }
                                c17113v2.invoke(C17102k.f54654a);
                            } else {
                                int i16 = AbstractC21558e.f68274b;
                                jNanoTime2 = System.nanoTime() - AbstractC21558e.f68273a;
                                unit = EnumC21557d.NANOSECONDS;
                                AbstractC16544l.m18094g(unit, "unit");
                                if (((jNanoTime - 1) | 1) == Long.MAX_VALUE) {
                                    jM8645k = C21555b.m21843m(AbstractC8144m6.m8683d(jNanoTime));
                                    c19748y5 = c19748y4;
                                } else {
                                    j12 = jNanoTime2 - jNanoTime;
                                    c19748y5 = c19748y4;
                                    if (((~(j12 ^ jNanoTime)) & (j12 ^ jNanoTime2)) < 0) {
                                        enumC21557d = EnumC21557d.MILLISECONDS;
                                        if (unit.compareTo(enumC21557d) < 0) {
                                            long jM8663d3 = AbstractC8136l6.m8663d(1L, enumC21557d, unit);
                                            C21554a c21554a5 = C21555b.f68260Z;
                                            jM8645k = C21555b.m21839i(AbstractC8128k6.m8645k((jNanoTime2 / jM8663d3) - (jNanoTime / jM8663d3), enumC21557d), AbstractC8128k6.m8645k((jNanoTime2 % jM8663d3) - (jNanoTime % jM8663d3), unit));
                                        } else {
                                            jM8645k = C21555b.m21843m(AbstractC8144m6.m8683d(j12));
                                        }
                                    } else {
                                        jM8645k = AbstractC8128k6.m8645k(j12, unit);
                                    }
                                }
                                C21554a c21554a6 = C21555b.f68260Z;
                                if (C21555b.m21833c(jM8645k, AbstractC8128k6.m8645k(c19748y5.m20697d().mo498a(), EnumC21557d.MILLISECONDS)) < 0) {
                                    j13 = c19738o5.f62480c;
                                    c17116y = this.f54684w0.f54696Z;
                                    if (c17116y.f54710H0) {
                                        C16491J c16491j5 = c17116y.f54707E0;
                                        c16491j5.getClass();
                                        C16495N c16495n5 = c16491j5.f51161Z;
                                        AbstractC0575H.m1156D(c16495n5.m10935y0(), null, null, new C16490I(c16495n5, j13, null), 3);
                                    }
                                }
                            }
                        }
                    }
                }
                return C17296C.f55119a;
            case 2:
                c19738o3 = this.f54675Z;
                c19748y2 = (C19748y) this.f54678q0;
                try {
                    AbstractC9233X.m9807c(obj);
                    objM20698e = obj;
                    c19738o2 = (C19738o) objM20698e;
                    if (c19738o2 != null) {
                        c19738o2.m20691a();
                    }
                    c19738o4 = c19738o2;
                    break;
                } catch (C19731h unused3) {
                    c19738o2 = null;
                    if (c17113v3 != null) {
                        j10 = c19738o3.f62480c;
                        interfaceC1436k = c17113v3.f54696Z.f54706D0;
                        if (interfaceC1436k != null) {
                            interfaceC1436k.invoke(new C13800b(j10));
                        }
                    }
                    this.f54678q0 = c19748y2;
                    this.f54675Z = c19738o2;
                    this.f54677p0 = 3;
                    if (AbstractC8460C4.m9081a(c19748y2, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    c19748y3 = c19748y2;
                    c19738o4 = c19738o2;
                    c19748y2 = c19748y3;
                    if (c19738o4 != null) {
                        this.f54678q0 = c19748y2;
                        this.f54675Z = c19738o4;
                        this.f54677p0 = 4;
                        objM20699f = c19748y2.m20699f(c19748y2.m20697d().mo498a(), new C17107p(c19738o4, null), this);
                        if (objM20699f == enumC19250a) {
                            return enumC19250a;
                        }
                        c19748y4 = c19748y2;
                        c19738o5 = (C19738o) objM20699f;
                        int i17 = AbstractC21558e.f68274b;
                        jNanoTime = System.nanoTime() - AbstractC21558e.f68273a;
                        if (c19738o5 != null) {
                            c19738o5.m20691a();
                        }
                        if (c19738o5 == null) {
                            c17113v = this.f54681t0;
                            if (c17113v != null) {
                                j11 = c19738o4.f62480c;
                                interfaceC1436k2 = c17113v.f54696Z.f54705C0;
                                if (interfaceC1436k2 != null) {
                                    interfaceC1436k2.invoke(new C13800b(j11));
                                }
                            }
                        } else {
                            C19723A c19723a4 = this.f54682u0;
                            c19723a4.getClass();
                            jM4489n = AbstractC3794B0.m4489n(AbstractC21690f.m22217v(c19723a4).f68635F0.mo501d(), c19723a4);
                            jM15310k = C13800b.m15310k(c19738o5.f62480c, c19738o4.f62480c);
                            if (Math.abs(C13800b.m15306g(jM15310k)) < C13803e.m15333e(jM4489n)) {
                                C8805o c8805o4 = new C8805o(c17113v2, 22, c19738o5);
                                this.f54678q0 = c19748y4;
                                this.f54675Z = c19738o5;
                                this.f54676o0 = jNanoTime;
                                this.f54677p0 = 5;
                                objM18522f = AbstractC16750j0.m18522f(c19748y4, c19738o5.f62478a, c8805o4, this);
                                if (objM18522f == enumC19250a) {
                                    return enumC19250a;
                                }
                                if (((C19738o) objM18522f) != null) {
                                    j14 = c19738o5.f62478a;
                                    c13775m0 = new C13775m0(c17113v2, 26, c19738o5);
                                    this.f54678q0 = null;
                                    this.f54675Z = null;
                                    this.f54677p0 = 6;
                                    if (AbstractC16750j0.m18530n(c19748y4, j14, c13775m0, this) == enumC19250a) {
                                        return enumC19250a;
                                    }
                                    c17113v2.invoke(C17102k.f54654a);
                                } else {
                                    int i18 = AbstractC21558e.f68274b;
                                    jNanoTime2 = System.nanoTime() - AbstractC21558e.f68273a;
                                    unit = EnumC21557d.NANOSECONDS;
                                    AbstractC16544l.m18094g(unit, "unit");
                                    if (((jNanoTime - 1) | 1) == Long.MAX_VALUE) {
                                        jM8645k = C21555b.m21843m(AbstractC8144m6.m8683d(jNanoTime));
                                        c19748y5 = c19748y4;
                                    } else {
                                        j12 = jNanoTime2 - jNanoTime;
                                        c19748y5 = c19748y4;
                                        if (((~(j12 ^ jNanoTime)) & (j12 ^ jNanoTime2)) < 0) {
                                            enumC21557d = EnumC21557d.MILLISECONDS;
                                            if (unit.compareTo(enumC21557d) < 0) {
                                                long jM8663d4 = AbstractC8136l6.m8663d(1L, enumC21557d, unit);
                                                C21554a c21554a7 = C21555b.f68260Z;
                                                jM8645k = C21555b.m21839i(AbstractC8128k6.m8645k((jNanoTime2 / jM8663d4) - (jNanoTime / jM8663d4), enumC21557d), AbstractC8128k6.m8645k((jNanoTime2 % jM8663d4) - (jNanoTime % jM8663d4), unit));
                                            } else {
                                                jM8645k = C21555b.m21843m(AbstractC8144m6.m8683d(j12));
                                            }
                                        } else {
                                            jM8645k = AbstractC8128k6.m8645k(j12, unit);
                                        }
                                    }
                                    C21554a c21554a8 = C21555b.f68260Z;
                                    if (C21555b.m21833c(jM8645k, AbstractC8128k6.m8645k(c19748y5.m20697d().mo498a(), EnumC21557d.MILLISECONDS)) < 0) {
                                        j13 = c19738o5.f62480c;
                                        c17116y = this.f54684w0.f54696Z;
                                        if (c17116y.f54710H0) {
                                            C16491J c16491j6 = c17116y.f54707E0;
                                            c16491j6.getClass();
                                            C16495N c16495n6 = c16491j6.f51161Z;
                                            AbstractC0575H.m1156D(c16495n6.m10935y0(), null, null, new C16490I(c16495n6, j13, null), 3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return C17296C.f55119a;
                }
                if (c19738o4 != null) {
                    this.f54678q0 = c19748y2;
                    this.f54675Z = c19738o4;
                    this.f54677p0 = 4;
                    objM20699f = c19748y2.m20699f(c19748y2.m20697d().mo498a(), new C17107p(c19738o4, null), this);
                    if (objM20699f == enumC19250a) {
                        return enumC19250a;
                    }
                    c19748y4 = c19748y2;
                    c19738o5 = (C19738o) objM20699f;
                    int i19 = AbstractC21558e.f68274b;
                    jNanoTime = System.nanoTime() - AbstractC21558e.f68273a;
                    if (c19738o5 != null) {
                        c19738o5.m20691a();
                    }
                    if (c19738o5 == null) {
                        c17113v = this.f54681t0;
                        if (c17113v != null) {
                            j11 = c19738o4.f62480c;
                            interfaceC1436k2 = c17113v.f54696Z.f54705C0;
                            if (interfaceC1436k2 != null) {
                                interfaceC1436k2.invoke(new C13800b(j11));
                            }
                        }
                    } else {
                        C19723A c19723a5 = this.f54682u0;
                        c19723a5.getClass();
                        jM4489n = AbstractC3794B0.m4489n(AbstractC21690f.m22217v(c19723a5).f68635F0.mo501d(), c19723a5);
                        jM15310k = C13800b.m15310k(c19738o5.f62480c, c19738o4.f62480c);
                        if (Math.abs(C13800b.m15306g(jM15310k)) < C13803e.m15333e(jM4489n)) {
                            C8805o c8805o5 = new C8805o(c17113v2, 22, c19738o5);
                            this.f54678q0 = c19748y4;
                            this.f54675Z = c19738o5;
                            this.f54676o0 = jNanoTime;
                            this.f54677p0 = 5;
                            objM18522f = AbstractC16750j0.m18522f(c19748y4, c19738o5.f62478a, c8805o5, this);
                            if (objM18522f == enumC19250a) {
                                return enumC19250a;
                            }
                            if (((C19738o) objM18522f) != null) {
                                j14 = c19738o5.f62478a;
                                c13775m0 = new C13775m0(c17113v2, 26, c19738o5);
                                this.f54678q0 = null;
                                this.f54675Z = null;
                                this.f54677p0 = 6;
                                if (AbstractC16750j0.m18530n(c19748y4, j14, c13775m0, this) == enumC19250a) {
                                    return enumC19250a;
                                }
                                c17113v2.invoke(C17102k.f54654a);
                            } else {
                                int i110 = AbstractC21558e.f68274b;
                                jNanoTime2 = System.nanoTime() - AbstractC21558e.f68273a;
                                unit = EnumC21557d.NANOSECONDS;
                                AbstractC16544l.m18094g(unit, "unit");
                                if (((jNanoTime - 1) | 1) == Long.MAX_VALUE) {
                                    jM8645k = C21555b.m21843m(AbstractC8144m6.m8683d(jNanoTime));
                                    c19748y5 = c19748y4;
                                } else {
                                    j12 = jNanoTime2 - jNanoTime;
                                    c19748y5 = c19748y4;
                                    if (((~(j12 ^ jNanoTime)) & (j12 ^ jNanoTime2)) < 0) {
                                        enumC21557d = EnumC21557d.MILLISECONDS;
                                        if (unit.compareTo(enumC21557d) < 0) {
                                            long jM8663d5 = AbstractC8136l6.m8663d(1L, enumC21557d, unit);
                                            C21554a c21554a9 = C21555b.f68260Z;
                                            jM8645k = C21555b.m21839i(AbstractC8128k6.m8645k((jNanoTime2 / jM8663d5) - (jNanoTime / jM8663d5), enumC21557d), AbstractC8128k6.m8645k((jNanoTime2 % jM8663d5) - (jNanoTime % jM8663d5), unit));
                                        } else {
                                            jM8645k = C21555b.m21843m(AbstractC8144m6.m8683d(j12));
                                        }
                                    } else {
                                        jM8645k = AbstractC8128k6.m8645k(j12, unit);
                                    }
                                }
                                C21554a c21554a10 = C21555b.f68260Z;
                                if (C21555b.m21833c(jM8645k, AbstractC8128k6.m8645k(c19748y5.m20697d().mo498a(), EnumC21557d.MILLISECONDS)) < 0) {
                                    j13 = c19738o5.f62480c;
                                    c17116y = this.f54684w0.f54696Z;
                                    if (c17116y.f54710H0) {
                                        C16491J c16491j7 = c17116y.f54707E0;
                                        c16491j7.getClass();
                                        C16495N c16495n7 = c16491j7.f51161Z;
                                        AbstractC0575H.m1156D(c16495n7.m10935y0(), null, null, new C16490I(c16495n7, j13, null), 3);
                                    }
                                }
                            }
                        }
                    }
                }
                return C17296C.f55119a;
            case 3:
                c19738o4 = this.f54675Z;
                c19748y3 = (C19748y) this.f54678q0;
                AbstractC9233X.m9807c(obj);
                c19748y2 = c19748y3;
                if (c19738o4 != null) {
                    this.f54678q0 = c19748y2;
                    this.f54675Z = c19738o4;
                    this.f54677p0 = 4;
                    objM20699f = c19748y2.m20699f(c19748y2.m20697d().mo498a(), new C17107p(c19738o4, null), this);
                    if (objM20699f == enumC19250a) {
                        return enumC19250a;
                    }
                    c19748y4 = c19748y2;
                    c19738o5 = (C19738o) objM20699f;
                    int i111 = AbstractC21558e.f68274b;
                    jNanoTime = System.nanoTime() - AbstractC21558e.f68273a;
                    if (c19738o5 != null) {
                        c19738o5.m20691a();
                    }
                    if (c19738o5 == null) {
                        c17113v = this.f54681t0;
                        if (c17113v != null) {
                            j11 = c19738o4.f62480c;
                            interfaceC1436k2 = c17113v.f54696Z.f54705C0;
                            if (interfaceC1436k2 != null) {
                                interfaceC1436k2.invoke(new C13800b(j11));
                            }
                        }
                    } else {
                        C19723A c19723a6 = this.f54682u0;
                        c19723a6.getClass();
                        jM4489n = AbstractC3794B0.m4489n(AbstractC21690f.m22217v(c19723a6).f68635F0.mo501d(), c19723a6);
                        jM15310k = C13800b.m15310k(c19738o5.f62480c, c19738o4.f62480c);
                        if (Math.abs(C13800b.m15306g(jM15310k)) < C13803e.m15333e(jM4489n)) {
                            C8805o c8805o6 = new C8805o(c17113v2, 22, c19738o5);
                            this.f54678q0 = c19748y4;
                            this.f54675Z = c19738o5;
                            this.f54676o0 = jNanoTime;
                            this.f54677p0 = 5;
                            objM18522f = AbstractC16750j0.m18522f(c19748y4, c19738o5.f62478a, c8805o6, this);
                            if (objM18522f == enumC19250a) {
                                return enumC19250a;
                            }
                            if (((C19738o) objM18522f) != null) {
                                j14 = c19738o5.f62478a;
                                c13775m0 = new C13775m0(c17113v2, 26, c19738o5);
                                this.f54678q0 = null;
                                this.f54675Z = null;
                                this.f54677p0 = 6;
                                if (AbstractC16750j0.m18530n(c19748y4, j14, c13775m0, this) == enumC19250a) {
                                    return enumC19250a;
                                }
                                c17113v2.invoke(C17102k.f54654a);
                            } else {
                                int i112 = AbstractC21558e.f68274b;
                                jNanoTime2 = System.nanoTime() - AbstractC21558e.f68273a;
                                unit = EnumC21557d.NANOSECONDS;
                                AbstractC16544l.m18094g(unit, "unit");
                                if (((jNanoTime - 1) | 1) == Long.MAX_VALUE) {
                                    jM8645k = C21555b.m21843m(AbstractC8144m6.m8683d(jNanoTime));
                                    c19748y5 = c19748y4;
                                } else {
                                    j12 = jNanoTime2 - jNanoTime;
                                    c19748y5 = c19748y4;
                                    if (((~(j12 ^ jNanoTime)) & (j12 ^ jNanoTime2)) < 0) {
                                        enumC21557d = EnumC21557d.MILLISECONDS;
                                        if (unit.compareTo(enumC21557d) < 0) {
                                            long jM8663d6 = AbstractC8136l6.m8663d(1L, enumC21557d, unit);
                                            C21554a c21554a11 = C21555b.f68260Z;
                                            jM8645k = C21555b.m21839i(AbstractC8128k6.m8645k((jNanoTime2 / jM8663d6) - (jNanoTime / jM8663d6), enumC21557d), AbstractC8128k6.m8645k((jNanoTime2 % jM8663d6) - (jNanoTime % jM8663d6), unit));
                                        } else {
                                            jM8645k = C21555b.m21843m(AbstractC8144m6.m8683d(j12));
                                        }
                                    } else {
                                        jM8645k = AbstractC8128k6.m8645k(j12, unit);
                                    }
                                }
                                C21554a c21554a12 = C21555b.f68260Z;
                                if (C21555b.m21833c(jM8645k, AbstractC8128k6.m8645k(c19748y5.m20697d().mo498a(), EnumC21557d.MILLISECONDS)) < 0) {
                                    j13 = c19738o5.f62480c;
                                    c17116y = this.f54684w0.f54696Z;
                                    if (c17116y.f54710H0) {
                                        C16491J c16491j8 = c17116y.f54707E0;
                                        c16491j8.getClass();
                                        C16495N c16495n8 = c16491j8.f51161Z;
                                        AbstractC0575H.m1156D(c16495n8.m10935y0(), null, null, new C16490I(c16495n8, j13, null), 3);
                                    }
                                }
                            }
                        }
                    }
                }
                return C17296C.f55119a;
            case 4:
                c19738o4 = this.f54675Z;
                C19748y c19748y6 = (C19748y) this.f54678q0;
                AbstractC9233X.m9807c(obj);
                c19748y4 = c19748y6;
                objM20699f = obj;
                c19738o5 = (C19738o) objM20699f;
                int i113 = AbstractC21558e.f68274b;
                jNanoTime = System.nanoTime() - AbstractC21558e.f68273a;
                if (c19738o5 != null) {
                    c19738o5.m20691a();
                }
                if (c19738o5 == null) {
                    c17113v = this.f54681t0;
                    if (c17113v != null) {
                        j11 = c19738o4.f62480c;
                        interfaceC1436k2 = c17113v.f54696Z.f54705C0;
                        if (interfaceC1436k2 != null) {
                            interfaceC1436k2.invoke(new C13800b(j11));
                        }
                    }
                } else {
                    C19723A c19723a7 = this.f54682u0;
                    c19723a7.getClass();
                    jM4489n = AbstractC3794B0.m4489n(AbstractC21690f.m22217v(c19723a7).f68635F0.mo501d(), c19723a7);
                    jM15310k = C13800b.m15310k(c19738o5.f62480c, c19738o4.f62480c);
                    if (Math.abs(C13800b.m15306g(jM15310k)) < C13803e.m15333e(jM4489n)) {
                        C8805o c8805o7 = new C8805o(c17113v2, 22, c19738o5);
                        this.f54678q0 = c19748y4;
                        this.f54675Z = c19738o5;
                        this.f54676o0 = jNanoTime;
                        this.f54677p0 = 5;
                        objM18522f = AbstractC16750j0.m18522f(c19748y4, c19738o5.f62478a, c8805o7, this);
                        if (objM18522f == enumC19250a) {
                            return enumC19250a;
                        }
                        if (((C19738o) objM18522f) != null) {
                            j14 = c19738o5.f62478a;
                            c13775m0 = new C13775m0(c17113v2, 26, c19738o5);
                            this.f54678q0 = null;
                            this.f54675Z = null;
                            this.f54677p0 = 6;
                            if (AbstractC16750j0.m18530n(c19748y4, j14, c13775m0, this) == enumC19250a) {
                                return enumC19250a;
                            }
                            c17113v2.invoke(C17102k.f54654a);
                        } else {
                            int i114 = AbstractC21558e.f68274b;
                            jNanoTime2 = System.nanoTime() - AbstractC21558e.f68273a;
                            unit = EnumC21557d.NANOSECONDS;
                            AbstractC16544l.m18094g(unit, "unit");
                            if (((jNanoTime - 1) | 1) == Long.MAX_VALUE) {
                                jM8645k = C21555b.m21843m(AbstractC8144m6.m8683d(jNanoTime));
                                c19748y5 = c19748y4;
                            } else {
                                j12 = jNanoTime2 - jNanoTime;
                                c19748y5 = c19748y4;
                                if (((~(j12 ^ jNanoTime)) & (j12 ^ jNanoTime2)) < 0) {
                                    enumC21557d = EnumC21557d.MILLISECONDS;
                                    if (unit.compareTo(enumC21557d) < 0) {
                                        long jM8663d7 = AbstractC8136l6.m8663d(1L, enumC21557d, unit);
                                        C21554a c21554a13 = C21555b.f68260Z;
                                        jM8645k = C21555b.m21839i(AbstractC8128k6.m8645k((jNanoTime2 / jM8663d7) - (jNanoTime / jM8663d7), enumC21557d), AbstractC8128k6.m8645k((jNanoTime2 % jM8663d7) - (jNanoTime % jM8663d7), unit));
                                    } else {
                                        jM8645k = C21555b.m21843m(AbstractC8144m6.m8683d(j12));
                                    }
                                } else {
                                    jM8645k = AbstractC8128k6.m8645k(j12, unit);
                                }
                            }
                            C21554a c21554a14 = C21555b.f68260Z;
                            if (C21555b.m21833c(jM8645k, AbstractC8128k6.m8645k(c19748y5.m20697d().mo498a(), EnumC21557d.MILLISECONDS)) < 0) {
                                j13 = c19738o5.f62480c;
                                c17116y = this.f54684w0.f54696Z;
                                if (c17116y.f54710H0) {
                                    C16491J c16491j9 = c17116y.f54707E0;
                                    c16491j9.getClass();
                                    C16495N c16495n9 = c16491j9.f51161Z;
                                    AbstractC0575H.m1156D(c16495n9.m10935y0(), null, null, new C16490I(c16495n9, j13, null), 3);
                                }
                            }
                        }
                    }
                }
                return C17296C.f55119a;
            case 5:
                long j15 = this.f54676o0;
                C19738o c19738o6 = this.f54675Z;
                c19748y4 = (C19748y) this.f54678q0;
                AbstractC9233X.m9807c(obj);
                objM18522f = obj;
                jNanoTime = j15;
                c19738o5 = c19738o6;
                if (((C19738o) objM18522f) != null) {
                    j14 = c19738o5.f62478a;
                    c13775m0 = new C13775m0(c17113v2, 26, c19738o5);
                    this.f54678q0 = null;
                    this.f54675Z = null;
                    this.f54677p0 = 6;
                    if (AbstractC16750j0.m18530n(c19748y4, j14, c13775m0, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    c17113v2.invoke(C17102k.f54654a);
                } else {
                    int i115 = AbstractC21558e.f68274b;
                    jNanoTime2 = System.nanoTime() - AbstractC21558e.f68273a;
                    unit = EnumC21557d.NANOSECONDS;
                    AbstractC16544l.m18094g(unit, "unit");
                    if (((jNanoTime - 1) | 1) == Long.MAX_VALUE) {
                        jM8645k = C21555b.m21843m(AbstractC8144m6.m8683d(jNanoTime));
                        c19748y5 = c19748y4;
                    } else {
                        j12 = jNanoTime2 - jNanoTime;
                        c19748y5 = c19748y4;
                        if (((~(j12 ^ jNanoTime)) & (j12 ^ jNanoTime2)) < 0) {
                            enumC21557d = EnumC21557d.MILLISECONDS;
                            if (unit.compareTo(enumC21557d) < 0) {
                                long jM8663d8 = AbstractC8136l6.m8663d(1L, enumC21557d, unit);
                                C21554a c21554a15 = C21555b.f68260Z;
                                jM8645k = C21555b.m21839i(AbstractC8128k6.m8645k((jNanoTime2 / jM8663d8) - (jNanoTime / jM8663d8), enumC21557d), AbstractC8128k6.m8645k((jNanoTime2 % jM8663d8) - (jNanoTime % jM8663d8), unit));
                            } else {
                                jM8645k = C21555b.m21843m(AbstractC8144m6.m8683d(j12));
                            }
                        } else {
                            jM8645k = AbstractC8128k6.m8645k(j12, unit);
                        }
                    }
                    C21554a c21554a16 = C21555b.f68260Z;
                    if (C21555b.m21833c(jM8645k, AbstractC8128k6.m8645k(c19748y5.m20697d().mo498a(), EnumC21557d.MILLISECONDS)) < 0) {
                        j13 = c19738o5.f62480c;
                        c17116y = this.f54684w0.f54696Z;
                        if (c17116y.f54710H0) {
                            C16491J c16491j10 = c17116y.f54707E0;
                            c16491j10.getClass();
                            C16495N c16495n10 = c16491j10.f51161Z;
                            AbstractC0575H.m1156D(c16495n10.m10935y0(), null, null, new C16490I(c16495n10, j13, null), 3);
                        }
                    }
                }
                return C17296C.f55119a;
            case 6:
                AbstractC9233X.m9807c(obj);
                c17113v2.invoke(C17102k.f54654a);
                return C17296C.f55119a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
