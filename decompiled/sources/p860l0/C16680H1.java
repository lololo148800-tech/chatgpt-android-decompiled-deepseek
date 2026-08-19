package p860l0;

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
import p571X9.AbstractC9233X;
import p759g1.C13800b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: l0.H1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16680H1 extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public Object f53426Z;

    /* JADX INFO: renamed from: o0 */
    public Object f53427o0;

    /* JADX INFO: renamed from: p0 */
    public C16525B f53428p0;

    /* JADX INFO: renamed from: q0 */
    public long f53429q0;

    /* JADX INFO: renamed from: r0 */
    public int f53430r0;

    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ Object f53431s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC0571F f53432t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ InterfaceC1440o f53433u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ InterfaceC1436k f53434v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ InterfaceC1436k f53435w0;

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ InterfaceC1436k f53436x0;

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ C16685J0 f53437y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16680H1(InterfaceC0571F interfaceC0571F, InterfaceC1440o interfaceC1440o, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, InterfaceC1436k interfaceC1436k3, C16685J0 c16685j0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53432t0 = interfaceC0571F;
        this.f53433u0 = interfaceC1440o;
        this.f53434v0 = interfaceC1436k;
        this.f53435w0 = interfaceC1436k2;
        this.f53436x0 = interfaceC1436k3;
        this.f53437y0 = c16685j0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16680H1 c16680h1 = new C16680H1(this.f53432t0, this.f53433u0, this.f53434v0, this.f53435w0, this.f53436x0, this.f53437y0, interfaceC18770c);
        c16680h1.f53431s0 = obj;
        return c16680h1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16680H1) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00af  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ee A[Catch: h -> 0x00f7, TryCatch #3 {h -> 0x00f7, blocks: (B:34:0x00e8, B:36:0x00ee, B:38:0x00fb), top: B:89:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00fb A[Catch: h -> 0x00f7, TRY_LEAVE, TryCatch #3 {h -> 0x00f7, blocks: (B:34:0x00e8, B:36:0x00ee, B:38:0x00fb), top: B:89:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x010b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0127 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x0136  */
    /* JADX WARN: Code duplicated, block: B:50:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x013c  */
    /* JADX WARN: Code duplicated, block: B:52:0x014a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0170 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0171  */
    /* JADX WARN: Code duplicated, block: B:58:0x0179 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x017b  */
    /* JADX WARN: Code duplicated, block: B:60:0x018b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0197  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x01de  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:76:0x020c A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v43, types: [An.G, qm.c, qm.i] */
    /* JADX WARN: Type inference failed for: r2v44 */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C19748y c19748y;
        Object objM18506c;
        C19748y c19748y2;
        C19738o c19738o;
        long jMo499b;
        C16525B c16525b;
        Object objM20698e;
        C19748y c19748y3;
        C19738o c19738o2;
        C16525B c16525b2;
        C19748y c19748y4;
        Object obj2;
        Object obj3;
        long j10;
        Object objM20699f;
        C19748y c19748y5;
        C16525B c16525b3;
        long j11;
        C19738o c19738o3;
        C19748y c19748y6;
        C16525B c16525b4;
        C16525B c16525b5;
        C19748y c19748y7;
        C16677G1 c16677g1;
        long j12;
        ?? r6;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53430r0;
        C16685J0 c16685j0 = this.f53437y0;
        InterfaceC0571F interfaceC0571F = this.f53432t0;
        InterfaceC1440o interfaceC1440o = this.f53433u0;
        InterfaceC1436k interfaceC1436k = this.f53436x0;
        InterfaceC1436k interfaceC1436k2 = this.f53434v0;
        switch (i10) {
            case 0:
                AbstractC9233X.m9807c(obj);
                c19748y = (C19748y) this.f53431s0;
                this.f53431s0 = c19748y;
                this.f53430r0 = 1;
                objM18506c = AbstractC16689K1.m18506c(c19748y, null, this, 3);
                if (objM18506c == enumC19250a) {
                    return enumC19250a;
                }
                c19748y2 = c19748y;
                c19738o = (C19738o) objM18506c;
                c19738o.m20691a();
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16790w1(c16685j0, null), 3);
                if (interfaceC1440o != AbstractC16689K1.f53473a) {
                    AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16793x1(interfaceC1440o, c16685j0, c19738o, null), 3);
                }
                if (interfaceC1436k2 != null) {
                    jMo499b = c19748y2.m20697d().mo499b();
                } else {
                    jMo499b = 4611686018427387903L;
                }
                c16525b = new C16525B();
                try {
                    C16796y1 c16796y1 = new C16796y1(2, null);
                    this.f53431s0 = c19748y2;
                    this.f53426Z = c19738o;
                    this.f53427o0 = c16525b;
                    this.f53428p0 = c16525b;
                    this.f53429q0 = jMo499b;
                    this.f53430r0 = 2;
                    objM20698e = c19748y2.m20698e(jMo499b, c16796y1, this);
                    if (objM20698e == enumC19250a) {
                        return enumC19250a;
                    }
                    c19748y3 = c19748y2;
                    c19738o2 = c19738o;
                    c16525b2 = c16525b;
                    try {
                        c16525b.f51262Y = objM20698e;
                        obj2 = c16525b2.f51262Y;
                        if (obj2 == null) {
                            AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16799z1(c16685j0, null), 3);
                        } else {
                            ((C19738o) obj2).m20691a();
                            AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16659A1(c16685j0, null), 3);
                        }
                        break;
                    } catch (C19731h unused) {
                        c16525b = c16525b2;
                        c19738o = c19738o2;
                        c19748y4 = c19748y3;
                        if (interfaceC1436k2 != null) {
                            interfaceC1436k2.invoke(new C13800b(c19738o.f62480c));
                        }
                        this.f53431s0 = c19748y4;
                        this.f53426Z = c16525b;
                        this.f53427o0 = null;
                        this.f53428p0 = null;
                        this.f53429q0 = jMo499b;
                        this.f53430r0 = 3;
                        if (AbstractC16689K1.m18504a(c19748y4, this) == enumC19250a) {
                            return enumC19250a;
                        }
                        AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16662B1(c16685j0, null), 3);
                        c16525b2 = c16525b;
                        c19748y3 = c19748y4;
                    }
                    obj3 = c16525b2.f51262Y;
                    if (obj3 != null) {
                        if (this.f53435w0 == null) {
                            this.f53431s0 = c19748y3;
                            this.f53426Z = c16525b2;
                            this.f53427o0 = null;
                            this.f53428p0 = null;
                            this.f53429q0 = jMo499b;
                            this.f53430r0 = 4;
                            C16783u0 c16783u0 = AbstractC16689K1.f53473a;
                            j10 = jMo499b;
                            objM20699f = c19748y3.m20699f(c19748y3.m20697d().mo498a(), new C16763n1((C19738o) obj3, null), this);
                            if (objM20699f == enumC19250a) {
                                return enumC19250a;
                            }
                            c19748y5 = c19748y3;
                            c16525b3 = c16525b2;
                            j11 = j10;
                            c19738o3 = (C19738o) objM20699f;
                            if (c19738o3 != null) {
                                AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16665C1(c16685j0, null), 3);
                                if (interfaceC1440o != AbstractC16689K1.f53473a) {
                                    AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16668D1(interfaceC1440o, c16685j0, c19738o3, null), 3);
                                }
                                try {
                                    j12 = j11;
                                    c19748y6 = c19748y5;
                                    c16525b4 = c16525b3;
                                    try {
                                        c16677g1 = new C16677G1(this.f53432t0, this.f53435w0, this.f53436x0, c16525b3, c16685j0, null);
                                        this.f53431s0 = c19748y6;
                                        this.f53426Z = c16525b4;
                                        this.f53427o0 = c19738o3;
                                        this.f53430r0 = 5;
                                        if (c19748y6.m20698e(j12, c16677g1, this) == enumC19250a) {
                                            return enumC19250a;
                                        }
                                    } catch (C19731h unused2) {
                                        c16525b5 = c16525b4;
                                        c19748y7 = c19748y6;
                                        if (interfaceC1436k != null) {
                                            interfaceC1436k.invoke(new C13800b(((C19738o) c16525b5.f51262Y).f62480c));
                                        }
                                        if (interfaceC1436k2 != null) {
                                            interfaceC1436k2.invoke(new C13800b(c19738o3.f62480c));
                                        }
                                        r6 = 0;
                                        this.f53431s0 = null;
                                        this.f53426Z = null;
                                        this.f53427o0 = null;
                                        this.f53430r0 = 6;
                                        if (AbstractC16689K1.m18504a(c19748y7, this) == enumC19250a) {
                                            return enumC19250a;
                                        }
                                        AbstractC0575H.m1156D(interfaceC0571F, r6, r6, new C16787v1(c16685j0, r6), 3);
                                    }
                                } catch (C19731h unused3) {
                                    c19748y6 = c19748y5;
                                    c16525b4 = c16525b3;
                                }
                            } else if (interfaceC1436k != null) {
                                interfaceC1436k.invoke(new C13800b(((C19738o) c16525b3.f51262Y).f62480c));
                            }
                        } else if (interfaceC1436k != null) {
                            interfaceC1436k.invoke(new C13800b(((C19738o) obj3).f62480c));
                        }
                    }
                    return C17296C.f55119a;
                } catch (C19731h unused4) {
                    c19748y4 = c19748y2;
                    if (interfaceC1436k2 != null) {
                        interfaceC1436k2.invoke(new C13800b(c19738o.f62480c));
                    }
                    this.f53431s0 = c19748y4;
                    this.f53426Z = c16525b;
                    this.f53427o0 = null;
                    this.f53428p0 = null;
                    this.f53429q0 = jMo499b;
                    this.f53430r0 = 3;
                    if (AbstractC16689K1.m18504a(c19748y4, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16662B1(c16685j0, null), 3);
                    c16525b2 = c16525b;
                    c19748y3 = c19748y4;
                    obj3 = c16525b2.f51262Y;
                    if (obj3 != null) {
                        if (this.f53435w0 == null) {
                            this.f53431s0 = c19748y3;
                            this.f53426Z = c16525b2;
                            this.f53427o0 = null;
                            this.f53428p0 = null;
                            this.f53429q0 = jMo499b;
                            this.f53430r0 = 4;
                            C16783u0 c16783u1 = AbstractC16689K1.f53473a;
                            j10 = jMo499b;
                            objM20699f = c19748y3.m20699f(c19748y3.m20697d().mo498a(), new C16763n1((C19738o) obj3, null), this);
                            if (objM20699f == enumC19250a) {
                                return enumC19250a;
                            }
                            c19748y5 = c19748y3;
                            c16525b3 = c16525b2;
                            j11 = j10;
                            c19738o3 = (C19738o) objM20699f;
                            if (c19738o3 != null) {
                                AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16665C1(c16685j0, null), 3);
                                if (interfaceC1440o != AbstractC16689K1.f53473a) {
                                    AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16668D1(interfaceC1440o, c16685j0, c19738o3, null), 3);
                                }
                                j12 = j11;
                                c19748y6 = c19748y5;
                                c16525b4 = c16525b3;
                                c16677g1 = new C16677G1(this.f53432t0, this.f53435w0, this.f53436x0, c16525b3, c16685j0, null);
                                this.f53431s0 = c19748y6;
                                this.f53426Z = c16525b4;
                                this.f53427o0 = c19738o3;
                                this.f53430r0 = 5;
                                if (c19748y6.m20698e(j12, c16677g1, this) == enumC19250a) {
                                    return enumC19250a;
                                }
                            } else if (interfaceC1436k != null) {
                                interfaceC1436k.invoke(new C13800b(((C19738o) c16525b3.f51262Y).f62480c));
                            }
                        } else if (interfaceC1436k != null) {
                            interfaceC1436k.invoke(new C13800b(((C19738o) obj3).f62480c));
                        }
                    }
                    return C17296C.f55119a;
                }
            case 1:
                c19748y = (C19748y) this.f53431s0;
                AbstractC9233X.m9807c(obj);
                objM18506c = obj;
                c19748y2 = c19748y;
                c19738o = (C19738o) objM18506c;
                c19738o.m20691a();
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16790w1(c16685j0, null), 3);
                if (interfaceC1440o != AbstractC16689K1.f53473a) {
                    AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16793x1(interfaceC1440o, c16685j0, c19738o, null), 3);
                }
                if (interfaceC1436k2 != null) {
                    jMo499b = c19748y2.m20697d().mo499b();
                } else {
                    jMo499b = 4611686018427387903L;
                }
                c16525b = new C16525B();
                C16796y1 c16796y2 = new C16796y1(2, null);
                this.f53431s0 = c19748y2;
                this.f53426Z = c19738o;
                this.f53427o0 = c16525b;
                this.f53428p0 = c16525b;
                this.f53429q0 = jMo499b;
                this.f53430r0 = 2;
                objM20698e = c19748y2.m20698e(jMo499b, c16796y2, this);
                if (objM20698e == enumC19250a) {
                    return enumC19250a;
                }
                c19748y3 = c19748y2;
                c19738o2 = c19738o;
                c16525b2 = c16525b;
                c16525b.f51262Y = objM20698e;
                obj2 = c16525b2.f51262Y;
                if (obj2 == null) {
                    AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16799z1(c16685j0, null), 3);
                } else {
                    ((C19738o) obj2).m20691a();
                    AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16659A1(c16685j0, null), 3);
                }
                obj3 = c16525b2.f51262Y;
                if (obj3 != null) {
                    if (this.f53435w0 == null) {
                        this.f53431s0 = c19748y3;
                        this.f53426Z = c16525b2;
                        this.f53427o0 = null;
                        this.f53428p0 = null;
                        this.f53429q0 = jMo499b;
                        this.f53430r0 = 4;
                        C16783u0 c16783u2 = AbstractC16689K1.f53473a;
                        j10 = jMo499b;
                        objM20699f = c19748y3.m20699f(c19748y3.m20697d().mo498a(), new C16763n1((C19738o) obj3, null), this);
                        if (objM20699f == enumC19250a) {
                            return enumC19250a;
                        }
                        c19748y5 = c19748y3;
                        c16525b3 = c16525b2;
                        j11 = j10;
                        c19738o3 = (C19738o) objM20699f;
                        if (c19738o3 != null) {
                            AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16665C1(c16685j0, null), 3);
                            if (interfaceC1440o != AbstractC16689K1.f53473a) {
                                AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16668D1(interfaceC1440o, c16685j0, c19738o3, null), 3);
                            }
                            j12 = j11;
                            c19748y6 = c19748y5;
                            c16525b4 = c16525b3;
                            c16677g1 = new C16677G1(this.f53432t0, this.f53435w0, this.f53436x0, c16525b3, c16685j0, null);
                            this.f53431s0 = c19748y6;
                            this.f53426Z = c16525b4;
                            this.f53427o0 = c19738o3;
                            this.f53430r0 = 5;
                            if (c19748y6.m20698e(j12, c16677g1, this) == enumC19250a) {
                                return enumC19250a;
                            }
                        } else if (interfaceC1436k != null) {
                            interfaceC1436k.invoke(new C13800b(((C19738o) c16525b3.f51262Y).f62480c));
                        }
                    } else if (interfaceC1436k != null) {
                        interfaceC1436k.invoke(new C13800b(((C19738o) obj3).f62480c));
                    }
                }
                return C17296C.f55119a;
            case 2:
                jMo499b = this.f53429q0;
                c16525b = this.f53428p0;
                C16525B c16525b6 = (C16525B) this.f53427o0;
                c19738o = (C19738o) this.f53426Z;
                c19748y2 = (C19748y) this.f53431s0;
                try {
                    AbstractC9233X.m9807c(obj);
                    c19748y3 = c19748y2;
                    c19738o2 = c19738o;
                    c16525b2 = c16525b6;
                    objM20698e = obj;
                    c16525b.f51262Y = objM20698e;
                    obj2 = c16525b2.f51262Y;
                    if (obj2 == null) {
                        AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16799z1(c16685j0, null), 3);
                    } else {
                        ((C19738o) obj2).m20691a();
                        AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16659A1(c16685j0, null), 3);
                    }
                    break;
                } catch (C19731h unused5) {
                    c16525b = c16525b6;
                    c19748y4 = c19748y2;
                    if (interfaceC1436k2 != null) {
                        interfaceC1436k2.invoke(new C13800b(c19738o.f62480c));
                    }
                    this.f53431s0 = c19748y4;
                    this.f53426Z = c16525b;
                    this.f53427o0 = null;
                    this.f53428p0 = null;
                    this.f53429q0 = jMo499b;
                    this.f53430r0 = 3;
                    if (AbstractC16689K1.m18504a(c19748y4, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16662B1(c16685j0, null), 3);
                    c16525b2 = c16525b;
                    c19748y3 = c19748y4;
                    obj3 = c16525b2.f51262Y;
                    if (obj3 != null) {
                        if (this.f53435w0 == null) {
                            this.f53431s0 = c19748y3;
                            this.f53426Z = c16525b2;
                            this.f53427o0 = null;
                            this.f53428p0 = null;
                            this.f53429q0 = jMo499b;
                            this.f53430r0 = 4;
                            C16783u0 c16783u3 = AbstractC16689K1.f53473a;
                            j10 = jMo499b;
                            objM20699f = c19748y3.m20699f(c19748y3.m20697d().mo498a(), new C16763n1((C19738o) obj3, null), this);
                            if (objM20699f == enumC19250a) {
                                return enumC19250a;
                            }
                            c19748y5 = c19748y3;
                            c16525b3 = c16525b2;
                            j11 = j10;
                            c19738o3 = (C19738o) objM20699f;
                            if (c19738o3 != null) {
                                AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16665C1(c16685j0, null), 3);
                                if (interfaceC1440o != AbstractC16689K1.f53473a) {
                                    AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16668D1(interfaceC1440o, c16685j0, c19738o3, null), 3);
                                }
                                j12 = j11;
                                c19748y6 = c19748y5;
                                c16525b4 = c16525b3;
                                c16677g1 = new C16677G1(this.f53432t0, this.f53435w0, this.f53436x0, c16525b3, c16685j0, null);
                                this.f53431s0 = c19748y6;
                                this.f53426Z = c16525b4;
                                this.f53427o0 = c19738o3;
                                this.f53430r0 = 5;
                                if (c19748y6.m20698e(j12, c16677g1, this) == enumC19250a) {
                                    return enumC19250a;
                                }
                            } else if (interfaceC1436k != null) {
                                interfaceC1436k.invoke(new C13800b(((C19738o) c16525b3.f51262Y).f62480c));
                            }
                        } else if (interfaceC1436k != null) {
                            interfaceC1436k.invoke(new C13800b(((C19738o) obj3).f62480c));
                        }
                    }
                    return C17296C.f55119a;
                }
                obj3 = c16525b2.f51262Y;
                if (obj3 != null) {
                    if (this.f53435w0 == null) {
                        this.f53431s0 = c19748y3;
                        this.f53426Z = c16525b2;
                        this.f53427o0 = null;
                        this.f53428p0 = null;
                        this.f53429q0 = jMo499b;
                        this.f53430r0 = 4;
                        C16783u0 c16783u4 = AbstractC16689K1.f53473a;
                        j10 = jMo499b;
                        objM20699f = c19748y3.m20699f(c19748y3.m20697d().mo498a(), new C16763n1((C19738o) obj3, null), this);
                        if (objM20699f == enumC19250a) {
                            return enumC19250a;
                        }
                        c19748y5 = c19748y3;
                        c16525b3 = c16525b2;
                        j11 = j10;
                        c19738o3 = (C19738o) objM20699f;
                        if (c19738o3 != null) {
                            AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16665C1(c16685j0, null), 3);
                            if (interfaceC1440o != AbstractC16689K1.f53473a) {
                                AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16668D1(interfaceC1440o, c16685j0, c19738o3, null), 3);
                            }
                            j12 = j11;
                            c19748y6 = c19748y5;
                            c16525b4 = c16525b3;
                            c16677g1 = new C16677G1(this.f53432t0, this.f53435w0, this.f53436x0, c16525b3, c16685j0, null);
                            this.f53431s0 = c19748y6;
                            this.f53426Z = c16525b4;
                            this.f53427o0 = c19738o3;
                            this.f53430r0 = 5;
                            if (c19748y6.m20698e(j12, c16677g1, this) == enumC19250a) {
                                return enumC19250a;
                            }
                        } else if (interfaceC1436k != null) {
                            interfaceC1436k.invoke(new C13800b(((C19738o) c16525b3.f51262Y).f62480c));
                        }
                    } else if (interfaceC1436k != null) {
                        interfaceC1436k.invoke(new C13800b(((C19738o) obj3).f62480c));
                    }
                }
                return C17296C.f55119a;
            case 3:
                jMo499b = this.f53429q0;
                c16525b = (C16525B) this.f53426Z;
                c19748y4 = (C19748y) this.f53431s0;
                AbstractC9233X.m9807c(obj);
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16662B1(c16685j0, null), 3);
                c16525b2 = c16525b;
                c19748y3 = c19748y4;
                obj3 = c16525b2.f51262Y;
                if (obj3 != null) {
                    if (this.f53435w0 == null) {
                        this.f53431s0 = c19748y3;
                        this.f53426Z = c16525b2;
                        this.f53427o0 = null;
                        this.f53428p0 = null;
                        this.f53429q0 = jMo499b;
                        this.f53430r0 = 4;
                        C16783u0 c16783u5 = AbstractC16689K1.f53473a;
                        j10 = jMo499b;
                        objM20699f = c19748y3.m20699f(c19748y3.m20697d().mo498a(), new C16763n1((C19738o) obj3, null), this);
                        if (objM20699f == enumC19250a) {
                            return enumC19250a;
                        }
                        c19748y5 = c19748y3;
                        c16525b3 = c16525b2;
                        j11 = j10;
                        c19738o3 = (C19738o) objM20699f;
                        if (c19738o3 != null) {
                            AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16665C1(c16685j0, null), 3);
                            if (interfaceC1440o != AbstractC16689K1.f53473a) {
                                AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16668D1(interfaceC1440o, c16685j0, c19738o3, null), 3);
                            }
                            j12 = j11;
                            c19748y6 = c19748y5;
                            c16525b4 = c16525b3;
                            c16677g1 = new C16677G1(this.f53432t0, this.f53435w0, this.f53436x0, c16525b3, c16685j0, null);
                            this.f53431s0 = c19748y6;
                            this.f53426Z = c16525b4;
                            this.f53427o0 = c19738o3;
                            this.f53430r0 = 5;
                            if (c19748y6.m20698e(j12, c16677g1, this) == enumC19250a) {
                                return enumC19250a;
                            }
                        } else if (interfaceC1436k != null) {
                            interfaceC1436k.invoke(new C13800b(((C19738o) c16525b3.f51262Y).f62480c));
                        }
                    } else if (interfaceC1436k != null) {
                        interfaceC1436k.invoke(new C13800b(((C19738o) obj3).f62480c));
                    }
                }
                return C17296C.f55119a;
            case 4:
                long j13 = this.f53429q0;
                C16525B c16525b7 = (C16525B) this.f53426Z;
                C19748y c19748y8 = (C19748y) this.f53431s0;
                AbstractC9233X.m9807c(obj);
                c16525b3 = c16525b7;
                c19748y5 = c19748y8;
                objM20699f = obj;
                j11 = j13;
                c19738o3 = (C19738o) objM20699f;
                if (c19738o3 != null) {
                    AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16665C1(c16685j0, null), 3);
                    if (interfaceC1440o != AbstractC16689K1.f53473a) {
                        AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16668D1(interfaceC1440o, c16685j0, c19738o3, null), 3);
                    }
                    j12 = j11;
                    c19748y6 = c19748y5;
                    c16525b4 = c16525b3;
                    c16677g1 = new C16677G1(this.f53432t0, this.f53435w0, this.f53436x0, c16525b3, c16685j0, null);
                    this.f53431s0 = c19748y6;
                    this.f53426Z = c16525b4;
                    this.f53427o0 = c19738o3;
                    this.f53430r0 = 5;
                    if (c19748y6.m20698e(j12, c16677g1, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else if (interfaceC1436k != null) {
                    interfaceC1436k.invoke(new C13800b(((C19738o) c16525b3.f51262Y).f62480c));
                }
                return C17296C.f55119a;
            case 5:
                c19738o3 = (C19738o) this.f53427o0;
                c16525b5 = (C16525B) this.f53426Z;
                c19748y7 = (C19748y) this.f53431s0;
                try {
                    AbstractC9233X.m9807c(obj);
                    break;
                } catch (C19731h unused6) {
                    interfaceC0571F = interfaceC0571F;
                    interfaceC1436k = interfaceC1436k;
                    interfaceC1436k2 = interfaceC1436k2;
                    if (interfaceC1436k != null) {
                        interfaceC1436k.invoke(new C13800b(((C19738o) c16525b5.f51262Y).f62480c));
                    }
                    if (interfaceC1436k2 != null) {
                        interfaceC1436k2.invoke(new C13800b(c19738o3.f62480c));
                    }
                    r6 = 0;
                    this.f53431s0 = null;
                    this.f53426Z = null;
                    this.f53427o0 = null;
                    this.f53430r0 = 6;
                    if (AbstractC16689K1.m18504a(c19748y7, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    AbstractC0575H.m1156D(interfaceC0571F, r6, r6, new C16787v1(c16685j0, r6), 3);
                }
                return C17296C.f55119a;
            case 6:
                AbstractC9233X.m9807c(obj);
                interfaceC0571F = interfaceC0571F;
                r6 = 0;
                AbstractC0575H.m1156D(interfaceC0571F, r6, r6, new C16787v1(c16685j0, r6), 3);
                return C17296C.f55119a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
