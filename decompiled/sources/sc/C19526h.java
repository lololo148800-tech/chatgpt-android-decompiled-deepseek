package sc;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1014t1.C19731h;
import p1014t1.C19738o;
import p1014t1.C19748y;
import p275Kn.C4816c;
import p571X9.AbstractC9233X;
import p759g1.C13800b;
import p860l0.AbstractC16689K1;
import p860l0.C16685J0;
import p860l0.C16783u0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: sc.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C19526h extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public Object f62016Z;

    /* JADX INFO: renamed from: o0 */
    public Object f62017o0;

    /* JADX INFO: renamed from: p0 */
    public C16525B f62018p0;

    /* JADX INFO: renamed from: q0 */
    public long f62019q0;

    /* JADX INFO: renamed from: r0 */
    public int f62020r0;

    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ Object f62021s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC1436k f62022t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C16685J0 f62023u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ InterfaceC1440o f62024v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ InterfaceC0571F f62025w0;

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ InterfaceC1436k f62026x0;

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ InterfaceC1436k f62027y0;

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ InterfaceC1436k f62028z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19526h(InterfaceC1436k interfaceC1436k, C16685J0 c16685j0, InterfaceC1440o interfaceC1440o, InterfaceC0571F interfaceC0571F, InterfaceC1436k interfaceC1436k2, InterfaceC1436k interfaceC1436k3, InterfaceC1436k interfaceC1436k4, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f62022t0 = interfaceC1436k;
        this.f62023u0 = c16685j0;
        this.f62024v0 = interfaceC1440o;
        this.f62025w0 = interfaceC0571F;
        this.f62026x0 = interfaceC1436k2;
        this.f62027y0 = interfaceC1436k3;
        this.f62028z0 = interfaceC1436k4;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C19526h c19526h = new C19526h(this.f62022t0, this.f62023u0, this.f62024v0, this.f62025w0, this.f62026x0, this.f62027y0, this.f62028z0, interfaceC18770c);
        c19526h.f62021s0 = obj;
        return c19526h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19526h) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:30:0x00de  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:39:0x0117 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0118  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f A[Catch: h -> 0x0089, TryCatch #6 {h -> 0x0089, blocks: (B:41:0x0119, B:43:0x011f, B:44:0x0127), top: B:104:0x0119 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0127 A[Catch: h -> 0x0089, TRY_LEAVE, TryCatch #6 {h -> 0x0089, blocks: (B:41:0x0119, B:43:0x011f, B:44:0x0127), top: B:104:0x0119 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x013a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0158 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0159  */
    /* JADX WARN: Code duplicated, block: B:56:0x0165  */
    /* JADX WARN: Code duplicated, block: B:58:0x0169 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x016b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0179  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:81:0x020f  */
    /* JADX WARN: Code duplicated, block: B:84:0x022b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x022c  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C19748y c19748y;
        Object objM18506c;
        C19748y c19748y2;
        C19738o c19738o;
        long jMo499b;
        C16525B c16525b;
        C17296C c17296c;
        Object objM20698e;
        C16525B c16525b2;
        C19748y c19748y3;
        Object obj2;
        boolean z6;
        Object obj3;
        Object obj4;
        C16525B c16525b3;
        long j10;
        Object objM20699f;
        long j11;
        C19738o c19738o2;
        C16525B c16525b4;
        C19748y c19748y4;
        C19525g c19525g;
        long j12;
        Object obj5;
        boolean z10;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f62020r0;
        C17296C c17296c2 = C17296C.f55119a;
        C16685J0 c16685j0 = this.f62023u0;
        InterfaceC0571F interfaceC0571F = this.f62025w0;
        InterfaceC1440o interfaceC1440o = this.f62024v0;
        InterfaceC1436k interfaceC1436k = this.f62028z0;
        InterfaceC1436k interfaceC1436k2 = this.f62026x0;
        C4816c c4816c = c16685j0.f53461q0;
        switch (i10) {
            case 0:
                AbstractC9233X.m9807c(obj);
                c19748y = (C19748y) this.f62021s0;
                this.f62021s0 = c19748y;
                this.f62020r0 = 1;
                objM18506c = AbstractC16689K1.m18506c(c19748y, null, this, 3);
                if (objM18506c == enumC19250a) {
                    return enumC19250a;
                }
                c19748y2 = c19748y;
                c19738o = (C19738o) objM18506c;
                if (!((Boolean) this.f62022t0.invoke(new C13800b(c19738o.f62480c))).booleanValue()) {
                    c4816c.m5449f(null);
                    c16685j0.f53459o0 = false;
                    c16685j0.f53460p0 = false;
                    return c17296c2;
                }
                c19738o.m20691a();
                c4816c.m5449f(null);
                c16685j0.f53459o0 = false;
                c16685j0.f53460p0 = false;
                if (interfaceC1440o != AbstractC19529k.f62040a) {
                    AbstractC0575H.m1156D(interfaceC0571F, null, null, new C19522d(interfaceC1440o, c16685j0, c19738o, null), 3);
                }
                if (interfaceC1436k2 != null) {
                    jMo499b = c19748y2.m20697d().mo499b();
                } else {
                    jMo499b = 4611686018427387903L;
                }
                c16525b = new C16525B();
                try {
                    c17296c = c17296c2;
                    try {
                        C19523e c19523e = new C19523e(2, null);
                        this.f62021s0 = c19748y2;
                        this.f62016Z = c19738o;
                        this.f62017o0 = c16525b;
                        this.f62018p0 = c16525b;
                        this.f62019q0 = jMo499b;
                        this.f62020r0 = 2;
                        objM20698e = c19748y2.m20698e(jMo499b, c19523e, this);
                        if (objM20698e == enumC19250a) {
                            return enumC19250a;
                        }
                        c16525b2 = c16525b;
                        try {
                            c16525b.f51262Y = objM20698e;
                            obj3 = c16525b2.f51262Y;
                            if (obj3 == null) {
                                c16685j0.f53460p0 = true;
                                c4816c.m5450g(null);
                            } else {
                                ((C19738o) obj3).m20691a();
                                c16685j0.f53459o0 = true;
                                c4816c.m5450g(null);
                            }
                        } catch (C19731h unused) {
                            c16525b = c16525b2;
                            c19748y3 = c19748y2;
                            if (interfaceC1436k2 != null) {
                                interfaceC1436k2.invoke(new C13800b(c19738o.f62480c));
                            }
                            this.f62021s0 = c19748y3;
                            this.f62016Z = c16525b;
                            obj2 = null;
                            this.f62017o0 = null;
                            this.f62018p0 = null;
                            this.f62019q0 = jMo499b;
                            this.f62020r0 = 3;
                            if (AbstractC19529k.m20622a(c19748y3, this) == enumC19250a) {
                                return enumC19250a;
                            }
                            z6 = true;
                            c16685j0.f53459o0 = z6;
                            c4816c.m5450g(obj2);
                            c19748y2 = c19748y3;
                            c16525b2 = c16525b;
                        }
                        obj4 = c16525b2.f51262Y;
                        if (obj4 == null) {
                            return c17296c;
                        }
                        if (this.f62027y0 == null) {
                            if (interfaceC1436k == null) {
                                return c17296c;
                            }
                            interfaceC1436k.invoke(new C13800b(((C19738o) obj4).f62480c));
                            return c17296c;
                        }
                        this.f62021s0 = c19748y2;
                        this.f62016Z = c16525b2;
                        this.f62017o0 = null;
                        this.f62018p0 = null;
                        this.f62019q0 = jMo499b;
                        this.f62020r0 = 4;
                        C16783u0 c16783u0 = AbstractC19529k.f62040a;
                        c16525b3 = c16525b2;
                        j10 = jMo499b;
                        objM20699f = c19748y2.m20699f(c19748y2.m20697d().mo498a(), new C19520b((C19738o) obj4, null), this);
                        if (objM20699f == enumC19250a) {
                            return enumC19250a;
                        }
                        j11 = j10;
                        c19738o2 = (C19738o) objM20699f;
                        if (c19738o2 == null) {
                            if (interfaceC1436k != null) {
                                return c17296c;
                            }
                            interfaceC1436k.invoke(new C13800b(((C19738o) c16525b3.f51262Y).f62480c));
                            return c17296c;
                        }
                        c4816c.m5449f(null);
                        c16685j0.f53459o0 = false;
                        c16685j0.f53460p0 = false;
                        if (interfaceC1440o != AbstractC19529k.f62040a) {
                            AbstractC0575H.m1156D(interfaceC0571F, null, null, new C19524f(interfaceC1440o, c16685j0, c19738o2, null), 3);
                        }
                        try {
                            j12 = j11;
                            try {
                                c19525g = new C19525g(c16685j0, this.f62027y0, this.f62028z0, c16525b3, null);
                                this.f62021s0 = c19748y2;
                                this.f62016Z = c16525b3;
                                this.f62017o0 = c19738o2;
                                this.f62020r0 = 5;
                                if (c19748y2.m20698e(j12, c19525g, this) == enumC19250a) {
                                    return enumC19250a;
                                }
                                return c17296c;
                            } catch (C19731h unused2) {
                                c16525b4 = c16525b3;
                                c19748y4 = c19748y2;
                                if (interfaceC1436k != null) {
                                    interfaceC1436k.invoke(new C13800b(((C19738o) c16525b4.f51262Y).f62480c));
                                }
                                if (interfaceC1436k2 != null) {
                                    interfaceC1436k2.invoke(new C13800b(c19738o2.f62480c));
                                }
                                obj5 = null;
                                this.f62021s0 = null;
                                this.f62016Z = null;
                                this.f62017o0 = null;
                                this.f62020r0 = 6;
                                if (AbstractC19529k.m20622a(c19748y4, this) == enumC19250a) {
                                    return enumC19250a;
                                }
                                z10 = true;
                                c16685j0.f53459o0 = z10;
                                c4816c.m5450g(obj5);
                                return c17296c;
                            }
                        } catch (C19731h unused3) {
                        }
                    } catch (C19731h unused4) {
                        c19748y3 = c19748y2;
                        if (interfaceC1436k2 != null) {
                            interfaceC1436k2.invoke(new C13800b(c19738o.f62480c));
                        }
                        this.f62021s0 = c19748y3;
                        this.f62016Z = c16525b;
                        obj2 = null;
                        this.f62017o0 = null;
                        this.f62018p0 = null;
                        this.f62019q0 = jMo499b;
                        this.f62020r0 = 3;
                        if (AbstractC19529k.m20622a(c19748y3, this) == enumC19250a) {
                            return enumC19250a;
                        }
                        z6 = true;
                        c16685j0.f53459o0 = z6;
                        c4816c.m5450g(obj2);
                        c19748y2 = c19748y3;
                        c16525b2 = c16525b;
                    }
                } catch (C19731h unused5) {
                    c17296c = c17296c2;
                }
                break;
                break;
            case 1:
                c19748y = (C19748y) this.f62021s0;
                AbstractC9233X.m9807c(obj);
                objM18506c = obj;
                c19748y2 = c19748y;
                c19738o = (C19738o) objM18506c;
                if (!((Boolean) this.f62022t0.invoke(new C13800b(c19738o.f62480c))).booleanValue()) {
                    c4816c.m5449f(null);
                    c16685j0.f53459o0 = false;
                    c16685j0.f53460p0 = false;
                    return c17296c2;
                }
                c19738o.m20691a();
                c4816c.m5449f(null);
                c16685j0.f53459o0 = false;
                c16685j0.f53460p0 = false;
                if (interfaceC1440o != AbstractC19529k.f62040a) {
                    AbstractC0575H.m1156D(interfaceC0571F, null, null, new C19522d(interfaceC1440o, c16685j0, c19738o, null), 3);
                }
                if (interfaceC1436k2 != null) {
                    jMo499b = c19748y2.m20697d().mo499b();
                } else {
                    jMo499b = 4611686018427387903L;
                }
                c16525b = new C16525B();
                c17296c = c17296c2;
                C19523e c19523e2 = new C19523e(2, null);
                this.f62021s0 = c19748y2;
                this.f62016Z = c19738o;
                this.f62017o0 = c16525b;
                this.f62018p0 = c16525b;
                this.f62019q0 = jMo499b;
                this.f62020r0 = 2;
                objM20698e = c19748y2.m20698e(jMo499b, c19523e2, this);
                if (objM20698e == enumC19250a) {
                    return enumC19250a;
                }
                c16525b2 = c16525b;
                c16525b.f51262Y = objM20698e;
                obj3 = c16525b2.f51262Y;
                if (obj3 == null) {
                    c16685j0.f53460p0 = true;
                    c4816c.m5450g(null);
                } else {
                    ((C19738o) obj3).m20691a();
                    c16685j0.f53459o0 = true;
                    c4816c.m5450g(null);
                }
                obj4 = c16525b2.f51262Y;
                if (obj4 == null) {
                    return c17296c;
                }
                if (this.f62027y0 == null) {
                    if (interfaceC1436k == null) {
                        return c17296c;
                    }
                    interfaceC1436k.invoke(new C13800b(((C19738o) obj4).f62480c));
                    return c17296c;
                }
                this.f62021s0 = c19748y2;
                this.f62016Z = c16525b2;
                this.f62017o0 = null;
                this.f62018p0 = null;
                this.f62019q0 = jMo499b;
                this.f62020r0 = 4;
                C16783u0 c16783u1 = AbstractC19529k.f62040a;
                c16525b3 = c16525b2;
                j10 = jMo499b;
                objM20699f = c19748y2.m20699f(c19748y2.m20697d().mo498a(), new C19520b((C19738o) obj4, null), this);
                if (objM20699f == enumC19250a) {
                    return enumC19250a;
                }
                j11 = j10;
                c19738o2 = (C19738o) objM20699f;
                if (c19738o2 == null) {
                    if (interfaceC1436k != null) {
                        return c17296c;
                    }
                    interfaceC1436k.invoke(new C13800b(((C19738o) c16525b3.f51262Y).f62480c));
                    return c17296c;
                }
                c4816c.m5449f(null);
                c16685j0.f53459o0 = false;
                c16685j0.f53460p0 = false;
                if (interfaceC1440o != AbstractC19529k.f62040a) {
                    AbstractC0575H.m1156D(interfaceC0571F, null, null, new C19524f(interfaceC1440o, c16685j0, c19738o2, null), 3);
                }
                j12 = j11;
                c19525g = new C19525g(c16685j0, this.f62027y0, this.f62028z0, c16525b3, null);
                this.f62021s0 = c19748y2;
                this.f62016Z = c16525b3;
                this.f62017o0 = c19738o2;
                this.f62020r0 = 5;
                if (c19748y2.m20698e(j12, c19525g, this) == enumC19250a) {
                    return enumC19250a;
                }
                return c17296c;
            case 2:
                jMo499b = this.f62019q0;
                c16525b = this.f62018p0;
                c16525b2 = (C16525B) this.f62017o0;
                c19738o = (C19738o) this.f62016Z;
                c19748y2 = (C19748y) this.f62021s0;
                try {
                    AbstractC9233X.m9807c(obj);
                    c17296c = c17296c2;
                    objM20698e = obj;
                    c16525b.f51262Y = objM20698e;
                    obj3 = c16525b2.f51262Y;
                    if (obj3 == null) {
                        c16685j0.f53460p0 = true;
                        c4816c.m5450g(null);
                    } else {
                        ((C19738o) obj3).m20691a();
                        c16685j0.f53459o0 = true;
                        c4816c.m5450g(null);
                    }
                    break;
                } catch (C19731h unused6) {
                    c17296c = c17296c2;
                    c16525b = c16525b2;
                    c19748y3 = c19748y2;
                    if (interfaceC1436k2 != null) {
                        interfaceC1436k2.invoke(new C13800b(c19738o.f62480c));
                    }
                    this.f62021s0 = c19748y3;
                    this.f62016Z = c16525b;
                    obj2 = null;
                    this.f62017o0 = null;
                    this.f62018p0 = null;
                    this.f62019q0 = jMo499b;
                    this.f62020r0 = 3;
                    if (AbstractC19529k.m20622a(c19748y3, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    z6 = true;
                    c16685j0.f53459o0 = z6;
                    c4816c.m5450g(obj2);
                    c19748y2 = c19748y3;
                    c16525b2 = c16525b;
                    obj4 = c16525b2.f51262Y;
                    if (obj4 == null) {
                        return c17296c;
                    }
                    if (this.f62027y0 == null) {
                        if (interfaceC1436k == null) {
                            return c17296c;
                        }
                        interfaceC1436k.invoke(new C13800b(((C19738o) obj4).f62480c));
                        return c17296c;
                    }
                    this.f62021s0 = c19748y2;
                    this.f62016Z = c16525b2;
                    this.f62017o0 = null;
                    this.f62018p0 = null;
                    this.f62019q0 = jMo499b;
                    this.f62020r0 = 4;
                    C16783u0 c16783u2 = AbstractC19529k.f62040a;
                    c16525b3 = c16525b2;
                    j10 = jMo499b;
                    objM20699f = c19748y2.m20699f(c19748y2.m20697d().mo498a(), new C19520b((C19738o) obj4, null), this);
                    if (objM20699f == enumC19250a) {
                        return enumC19250a;
                    }
                    j11 = j10;
                    c19738o2 = (C19738o) objM20699f;
                    if (c19738o2 == null) {
                        if (interfaceC1436k != null) {
                            return c17296c;
                        }
                        interfaceC1436k.invoke(new C13800b(((C19738o) c16525b3.f51262Y).f62480c));
                        return c17296c;
                    }
                    c4816c.m5449f(null);
                    c16685j0.f53459o0 = false;
                    c16685j0.f53460p0 = false;
                    if (interfaceC1440o != AbstractC19529k.f62040a) {
                        AbstractC0575H.m1156D(interfaceC0571F, null, null, new C19524f(interfaceC1440o, c16685j0, c19738o2, null), 3);
                    }
                    j12 = j11;
                    c19525g = new C19525g(c16685j0, this.f62027y0, this.f62028z0, c16525b3, null);
                    this.f62021s0 = c19748y2;
                    this.f62016Z = c16525b3;
                    this.f62017o0 = c19738o2;
                    this.f62020r0 = 5;
                    if (c19748y2.m20698e(j12, c19525g, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    return c17296c;
                }
                obj4 = c16525b2.f51262Y;
                if (obj4 == null) {
                    return c17296c;
                }
                if (this.f62027y0 == null) {
                    if (interfaceC1436k == null) {
                        return c17296c;
                    }
                    interfaceC1436k.invoke(new C13800b(((C19738o) obj4).f62480c));
                    return c17296c;
                }
                this.f62021s0 = c19748y2;
                this.f62016Z = c16525b2;
                this.f62017o0 = null;
                this.f62018p0 = null;
                this.f62019q0 = jMo499b;
                this.f62020r0 = 4;
                C16783u0 c16783u3 = AbstractC19529k.f62040a;
                c16525b3 = c16525b2;
                j10 = jMo499b;
                objM20699f = c19748y2.m20699f(c19748y2.m20697d().mo498a(), new C19520b((C19738o) obj4, null), this);
                if (objM20699f == enumC19250a) {
                    return enumC19250a;
                }
                j11 = j10;
                c19738o2 = (C19738o) objM20699f;
                if (c19738o2 == null) {
                    if (interfaceC1436k != null) {
                        return c17296c;
                    }
                    interfaceC1436k.invoke(new C13800b(((C19738o) c16525b3.f51262Y).f62480c));
                    return c17296c;
                }
                c4816c.m5449f(null);
                c16685j0.f53459o0 = false;
                c16685j0.f53460p0 = false;
                if (interfaceC1440o != AbstractC19529k.f62040a) {
                    AbstractC0575H.m1156D(interfaceC0571F, null, null, new C19524f(interfaceC1440o, c16685j0, c19738o2, null), 3);
                }
                j12 = j11;
                c19525g = new C19525g(c16685j0, this.f62027y0, this.f62028z0, c16525b3, null);
                this.f62021s0 = c19748y2;
                this.f62016Z = c16525b3;
                this.f62017o0 = c19738o2;
                this.f62020r0 = 5;
                if (c19748y2.m20698e(j12, c19525g, this) == enumC19250a) {
                    return enumC19250a;
                }
                return c17296c;
            case 3:
                jMo499b = this.f62019q0;
                c16525b = (C16525B) this.f62016Z;
                c19748y3 = (C19748y) this.f62021s0;
                AbstractC9233X.m9807c(obj);
                c17296c = c17296c2;
                z6 = true;
                obj2 = null;
                c16685j0.f53459o0 = z6;
                c4816c.m5450g(obj2);
                c19748y2 = c19748y3;
                c16525b2 = c16525b;
                obj4 = c16525b2.f51262Y;
                if (obj4 == null) {
                    return c17296c;
                }
                if (this.f62027y0 == null) {
                    if (interfaceC1436k == null) {
                        return c17296c;
                    }
                    interfaceC1436k.invoke(new C13800b(((C19738o) obj4).f62480c));
                    return c17296c;
                }
                this.f62021s0 = c19748y2;
                this.f62016Z = c16525b2;
                this.f62017o0 = null;
                this.f62018p0 = null;
                this.f62019q0 = jMo499b;
                this.f62020r0 = 4;
                C16783u0 c16783u4 = AbstractC19529k.f62040a;
                c16525b3 = c16525b2;
                j10 = jMo499b;
                objM20699f = c19748y2.m20699f(c19748y2.m20697d().mo498a(), new C19520b((C19738o) obj4, null), this);
                if (objM20699f == enumC19250a) {
                    return enumC19250a;
                }
                j11 = j10;
                c19738o2 = (C19738o) objM20699f;
                if (c19738o2 == null) {
                    if (interfaceC1436k != null) {
                        return c17296c;
                    }
                    interfaceC1436k.invoke(new C13800b(((C19738o) c16525b3.f51262Y).f62480c));
                    return c17296c;
                }
                c4816c.m5449f(null);
                c16685j0.f53459o0 = false;
                c16685j0.f53460p0 = false;
                if (interfaceC1440o != AbstractC19529k.f62040a) {
                    AbstractC0575H.m1156D(interfaceC0571F, null, null, new C19524f(interfaceC1440o, c16685j0, c19738o2, null), 3);
                }
                j12 = j11;
                c19525g = new C19525g(c16685j0, this.f62027y0, this.f62028z0, c16525b3, null);
                this.f62021s0 = c19748y2;
                this.f62016Z = c16525b3;
                this.f62017o0 = c19738o2;
                this.f62020r0 = 5;
                if (c19748y2.m20698e(j12, c19525g, this) == enumC19250a) {
                    return enumC19250a;
                }
                return c17296c;
            case 4:
                j11 = this.f62019q0;
                C16525B c16525b5 = (C16525B) this.f62016Z;
                C19748y c19748y5 = (C19748y) this.f62021s0;
                AbstractC9233X.m9807c(obj);
                c16525b3 = c16525b5;
                c17296c = c17296c2;
                c19748y2 = c19748y5;
                objM20699f = obj;
                c19738o2 = (C19738o) objM20699f;
                if (c19738o2 == null) {
                    if (interfaceC1436k != null) {
                        return c17296c;
                    }
                    interfaceC1436k.invoke(new C13800b(((C19738o) c16525b3.f51262Y).f62480c));
                    return c17296c;
                }
                c4816c.m5449f(null);
                c16685j0.f53459o0 = false;
                c16685j0.f53460p0 = false;
                if (interfaceC1440o != AbstractC19529k.f62040a) {
                    AbstractC0575H.m1156D(interfaceC0571F, null, null, new C19524f(interfaceC1440o, c16685j0, c19738o2, null), 3);
                }
                j12 = j11;
                c19525g = new C19525g(c16685j0, this.f62027y0, this.f62028z0, c16525b3, null);
                this.f62021s0 = c19748y2;
                this.f62016Z = c16525b3;
                this.f62017o0 = c19738o2;
                this.f62020r0 = 5;
                if (c19748y2.m20698e(j12, c19525g, this) == enumC19250a) {
                    return enumC19250a;
                }
                return c17296c;
            case 5:
                c19738o2 = (C19738o) this.f62017o0;
                c16525b4 = (C16525B) this.f62016Z;
                c19748y4 = (C19748y) this.f62021s0;
                try {
                    AbstractC9233X.m9807c(obj);
                    return c17296c2;
                } catch (C19731h unused7) {
                    c17296c = c17296c2;
                    interfaceC1436k2 = interfaceC1436k2;
                    c4816c = c4816c;
                    if (interfaceC1436k != null) {
                        interfaceC1436k.invoke(new C13800b(((C19738o) c16525b4.f51262Y).f62480c));
                    }
                    if (interfaceC1436k2 != null) {
                        interfaceC1436k2.invoke(new C13800b(c19738o2.f62480c));
                    }
                    obj5 = null;
                    this.f62021s0 = null;
                    this.f62016Z = null;
                    this.f62017o0 = null;
                    this.f62020r0 = 6;
                    if (AbstractC19529k.m20622a(c19748y4, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    z10 = true;
                    c16685j0.f53459o0 = z10;
                    c4816c.m5450g(obj5);
                    return c17296c;
                }
            case 6:
                AbstractC9233X.m9807c(obj);
                c17296c = c17296c2;
                z10 = true;
                c4816c = c4816c;
                obj5 = null;
                c16685j0.f53459o0 = z10;
                c4816c.m5450g(obj5);
                return c17296c;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
