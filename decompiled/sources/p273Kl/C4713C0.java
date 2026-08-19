package p273Kl;

import android.javax.sip.C10808o;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.C0565C;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0595V;
import p025An.InterfaceC0627n0;
import p033B5.C0841y;
import p049Bm.InterfaceC1439n;
import p075Cl.C1720c;
import p075Cl.C1722e;
import p153Fn.C2925c;
import p175Gl.C3103b;
import p193Hf.C3350b0;
import p225Im.InterfaceC3776x;
import p229J0.C4171z3;
import p275Kn.C4816c;
import p275Kn.InterfaceC4814a;
import p344Nl.C5842n;
import p571X9.AbstractC9233X;
import p813ij.C15026j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.C0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4713C0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16525B f15323Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC4814a f15324Z;

    /* JADX INFO: renamed from: o0 */
    public Object f15325o0;

    /* JADX INFO: renamed from: p0 */
    public Object f15326p0;

    /* JADX INFO: renamed from: q0 */
    public int f15327q0;

    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ Object f15328r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C4727J0 f15329s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C1720c f15330t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ String f15331u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ String f15332v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4713C0(C4727J0 c4727j0, C1720c c1720c, String str, String str2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15329s0 = c4727j0;
        this.f15330t0 = c1720c;
        this.f15331u0 = str;
        this.f15332v0 = str2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4713C0 c4713c0 = new C4713C0(this.f15329s0, this.f15330t0, this.f15331u0, this.f15332v0, interfaceC18770c);
        c4713c0.f15328r0 = obj;
        return c4713c0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4713C0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0141 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:12:0x003d, B:54:0x0193, B:44:0x00e9, B:46:0x0141, B:47:0x0151, B:49:0x0155, B:51:0x0168, B:69:0x020e, B:70:0x0212), top: B:77:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0155 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:12:0x003d, B:54:0x0193, B:44:0x00e9, B:46:0x0141, B:47:0x0151, B:49:0x0155, B:51:0x0168, B:69:0x020e, B:70:0x0212), top: B:77:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0168 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:12:0x003d, B:54:0x0193, B:44:0x00e9, B:46:0x0141, B:47:0x0151, B:49:0x0155, B:51:0x0168, B:69:0x020e, B:70:0x0212), top: B:77:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0192 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0198  */
    /* JADX WARN: Code duplicated, block: B:59:0x01af  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ff A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x0200  */
    /* JADX WARN: Code duplicated, block: B:65:0x0207 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x0208  */
    /* JADX WARN: Code duplicated, block: B:67:0x0209  */
    /* JADX WARN: Code duplicated, block: B:69:0x020e A[Catch: all -> 0x0047, TRY_ENTER, TryCatch #0 {all -> 0x0047, blocks: (B:12:0x003d, B:54:0x0193, B:44:0x00e9, B:46:0x0141, B:47:0x0151, B:49:0x0155, B:51:0x0168, B:69:0x020e, B:70:0x0212), top: B:77:0x0011 }] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC0571F interfaceC0571F;
        C1720c c1720c;
        C16525B c16525b;
        C4727J0 c4727j0;
        InterfaceC4814a interfaceC4814a;
        C1720c c1720c2;
        C4727J0 c4727j1;
        InterfaceC4814a interfaceC4814a2;
        C16525B c16525b2;
        InterfaceC0571F interfaceC0571F2;
        C4727J0 c4727j2;
        InterfaceC4814a interfaceC4814a3;
        C16525B c16525b3;
        InterfaceC0571F interfaceC0571F3;
        C5842n c5842n;
        String str;
        C4727J0 c4727j3;
        C2925c c2925c;
        Object obj2;
        EnumC19250a enumC19250a;
        C3103b c3103bM3932a;
        InterfaceC4814a interfaceC4814a4;
        C16525B c16525b4;
        InterfaceC0571F interfaceC0571F4;
        C0841y c0841y;
        C4727J0 c4727j4;
        C2925c c2925c2;
        C0564B0 c0564b0M1156D;
        C16525B c16525b5;
        Object obj3;
        C16525B c16525b6;
        InterfaceC4814a interfaceC4814a5;
        Throwable th2;
        EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
        int i10 = this.f15327q0;
        Object obj4 = "Room.connect attempted while room is not disconnected!";
        C4727J0 c4727j5 = this.f15329s0;
        try {
            try {
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    InterfaceC0571F interfaceC0571F5 = (InterfaceC0571F) this.f15328r0;
                    if (c4727j5.m5412g() != EnumC4807x0.f15675o0) {
                        throw new IllegalStateException("Room.connect attempted while room is not disconnected!");
                    }
                    C16525B c16525b7 = new C16525B();
                    C4816c c4816c = c4727j5.f15372E;
                    this.f15328r0 = interfaceC0571F5;
                    this.f15323Y = c16525b7;
                    this.f15324Z = c4816c;
                    this.f15325o0 = c4727j5;
                    C1720c c1720c3 = this.f15330t0;
                    this.f15326p0 = c1720c3;
                    this.f15327q0 = 1;
                    if (c4816c.m5448e(null, this) == enumC19250a2) {
                        return enumC19250a2;
                    }
                    interfaceC0571F = interfaceC0571F5;
                    c1720c = c1720c3;
                    c16525b = c16525b7;
                    c4727j0 = c4727j5;
                    interfaceC4814a = c4816c;
                } else {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            c1720c = (C1720c) this.f15326p0;
                            c4727j2 = (C4727J0) this.f15325o0;
                            InterfaceC4814a interfaceC4814a6 = this.f15324Z;
                            c16525b3 = this.f15323Y;
                            interfaceC0571F3 = (InterfaceC0571F) this.f15328r0;
                            try {
                                AbstractC9233X.m9807c(obj);
                                interfaceC4814a3 = interfaceC4814a6;
                                c1720c2 = c1720c;
                                c4727j1 = c4727j2;
                                interfaceC4814a2 = interfaceC4814a3;
                                c16525b2 = c16525b3;
                                interfaceC0571F2 = interfaceC0571F3;
                                EnumC4807x0 enumC4807x0 = EnumC4807x0.f15673Y;
                                InterfaceC3776x[] interfaceC3776xArr = C4727J0.f15367I;
                                c4727j1.m5420o(enumC4807x0);
                                c4727j1.f15371D = c1720c2;
                                c4727j1.f15388m = AbstractC0575H.m1174c(c4727j1.f15379d.plus(AbstractC0575H.m1176e()));
                                boolean z6 = c4727j1.f15398w;
                                c5842n = c4727j1.f15400y;
                                boolean z10 = c5842n.f19114v;
                                C15026j c15026j = c4727j1.f15399x;
                                C4762b c4762b = c4727j1.f15378c;
                                str = "coroutineScope";
                                c4727j3 = c4727j5;
                                c16525b2.f51262Y = new C1722e(z6, z10, c15026j, c4762b.f15538a, c4762b.f15540c, c4762b.f15539b, c4762b.f15541d, c4762b.f15542e, c4762b.f15543f);
                                if (!AbstractC0575H.m1196y(c5842n.f18996c)) {
                                    c5842n.f18996c = AbstractC0575H.m1174c(c5842n.f18995b.plus(AbstractC0575H.m1176e()));
                                }
                                c2925c = c4727j1.f15388m;
                                if (c2925c != null) {
                                    AbstractC16544l.m18103p(str);
                                    throw null;
                                }
                                AbstractC0575H.m1156D(c2925c, null, null, new C4725I0(c4727j1, null), 3);
                                obj2 = c16525b2.f51262Y;
                                if (((C1722e) obj2).f4952c != null) {
                                    c3103bM3932a = c4727j1.f15383h.m3932a((C10808o) ((C1722e) obj2).f4952c.f46724Y);
                                    C4171z3 c4171z3 = new C4171z3(c4727j1, 4);
                                    this.f15328r0 = interfaceC0571F2;
                                    this.f15323Y = c16525b2;
                                    this.f15324Z = interfaceC4814a2;
                                    this.f15325o0 = c3103bM3932a;
                                    this.f15326p0 = c4727j1;
                                    this.f15327q0 = 3;
                                    c3103bM3932a.m3931e(c4727j1, c4171z3);
                                    enumC19250a = enumC19250a2;
                                    if (C17296C.f55119a == enumC19250a) {
                                        interfaceC4814a5 = interfaceC4814a2;
                                        return enumC19250a;
                                    }
                                    interfaceC4814a5 = interfaceC4814a2;
                                    c4727j1.f15397v = c3103bM3932a;
                                    interfaceC4814a4 = interfaceC4814a5;
                                } else {
                                    enumC19250a = enumC19250a2;
                                    interfaceC4814a4 = interfaceC4814a2;
                                }
                                c16525b4 = c16525b2;
                                interfaceC0571F4 = interfaceC0571F2;
                                ((C4816c) interfaceC4814a4).m5450g(null);
                                c0841y = new C0841y(C0565C.f1783Y, 1);
                                c4727j4 = c4727j3;
                                c2925c2 = c4727j4.f15388m;
                                if (c2925c2 == null) {
                                    AbstractC16544l.m18103p(str);
                                    throw null;
                                }
                                c0564b0M1156D = AbstractC0575H.m1156D(c2925c2, c4727j4.f15380e.plus(c0841y), null, new C4711B0(this.f15329s0, this.f15331u0, this.f15332v0, this.f15330t0, c16525b4, null), 2);
                                InterfaceC0595V interfaceC0595VMo1271H0 = AbstractC0575H.m1192u(interfaceC0571F4.getCoroutineContext()).mo1271H0(new C4171z3(c0564b0M1156D, 5));
                                c16525b5 = new C16525B();
                                c0564b0M1156D.mo1271H0(new C3350b0(interfaceC0595VMo1271H0, 26, c16525b5));
                                this.f15328r0 = c16525b5;
                                obj3 = null;
                                this.f15323Y = null;
                                this.f15324Z = null;
                                this.f15325o0 = null;
                                this.f15326p0 = null;
                                this.f15327q0 = 4;
                                if (c0564b0M1156D.mo1272P(this) == enumC19250a) {
                                    return enumC19250a;
                                }
                                c16525b6 = c16525b5;
                            } catch (Throwable th3) {
                                th = th3;
                                obj4 = interfaceC4814a6;
                                ((C4816c) obj4).m5450g(null);
                                throw th;
                            }
                        } else if (i10 == 3) {
                            c4727j1 = (C4727J0) this.f15326p0;
                            c3103bM3932a = (C3103b) this.f15325o0;
                            InterfaceC4814a interfaceC4814a7 = this.f15324Z;
                            c16525b2 = this.f15323Y;
                            interfaceC0571F2 = (InterfaceC0571F) this.f15328r0;
                            AbstractC9233X.m9807c(obj);
                            enumC19250a = enumC19250a2;
                            c4727j3 = c4727j5;
                            str = "coroutineScope";
                            interfaceC4814a5 = interfaceC4814a7;
                            interfaceC4814a5 = interfaceC4814a2;
                            c4727j1.f15397v = c3103bM3932a;
                            interfaceC4814a4 = interfaceC4814a5;
                            c16525b4 = c16525b2;
                            interfaceC0571F4 = interfaceC0571F2;
                            ((C4816c) interfaceC4814a4).m5450g(null);
                            c0841y = new C0841y(C0565C.f1783Y, 1);
                            c4727j4 = c4727j3;
                            c2925c2 = c4727j4.f15388m;
                            if (c2925c2 == null) {
                                AbstractC16544l.m18103p(str);
                                throw null;
                            }
                            c0564b0M1156D = AbstractC0575H.m1156D(c2925c2, c4727j4.f15380e.plus(c0841y), null, new C4711B0(this.f15329s0, this.f15331u0, this.f15332v0, this.f15330t0, c16525b4, null), 2);
                            InterfaceC0595V interfaceC0595VMo1271H1 = AbstractC0575H.m1192u(interfaceC0571F4.getCoroutineContext()).mo1271H0(new C4171z3(c0564b0M1156D, 5));
                            c16525b5 = new C16525B();
                            c0564b0M1156D.mo1271H0(new C3350b0(interfaceC0595VMo1271H1, 26, c16525b5));
                            this.f15328r0 = c16525b5;
                            obj3 = null;
                            this.f15323Y = null;
                            this.f15324Z = null;
                            this.f15325o0 = null;
                            this.f15326p0 = null;
                            this.f15327q0 = 4;
                            if (c0564b0M1156D.mo1272P(this) == enumC19250a) {
                                return enumC19250a;
                            }
                            c16525b6 = c16525b5;
                        } else {
                            if (i10 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c16525b6 = (C16525B) this.f15328r0;
                            AbstractC9233X.m9807c(obj);
                            obj3 = null;
                        }
                        th2 = (Throwable) c16525b6.f51262Y;
                        if (th2 == null) {
                            return obj3;
                        }
                        throw th2;
                    }
                    c1720c = (C1720c) this.f15326p0;
                    c4727j0 = (C4727J0) this.f15325o0;
                    InterfaceC4814a interfaceC4814a8 = this.f15324Z;
                    c16525b = this.f15323Y;
                    interfaceC0571F = (InterfaceC0571F) this.f15328r0;
                    AbstractC9233X.m9807c(obj);
                    interfaceC4814a = interfaceC4814a8;
                }
                if (c4727j0.m5412g() != EnumC4807x0.f15675o0) {
                    throw new IllegalStateException("Room.connect attempted while room is not disconnected!");
                }
                C2925c c2925c3 = c4727j0.f15388m;
                if (c2925c3 != null) {
                    InterfaceC0627n0 interfaceC0627n0M1192u = AbstractC0575H.m1192u(c2925c3.f8769Y);
                    C2925c c2925c4 = c4727j0.f15388m;
                    if (c2925c4 == null) {
                        AbstractC16544l.m18103p("coroutineScope");
                        throw null;
                    }
                    AbstractC0575H.m1180i(c2925c4, null);
                    this.f15328r0 = interfaceC0571F;
                    this.f15323Y = c16525b;
                    this.f15324Z = interfaceC4814a;
                    this.f15325o0 = c4727j0;
                    this.f15326p0 = c1720c;
                    this.f15327q0 = 2;
                    if (interfaceC0627n0M1192u.mo1272P(this) == enumC19250a2) {
                        return enumC19250a2;
                    }
                    c4727j2 = c4727j0;
                    interfaceC4814a3 = interfaceC4814a;
                    c16525b3 = c16525b;
                    interfaceC0571F3 = interfaceC0571F;
                    c1720c2 = c1720c;
                    c4727j1 = c4727j2;
                    interfaceC4814a2 = interfaceC4814a3;
                    c16525b2 = c16525b3;
                    interfaceC0571F2 = interfaceC0571F3;
                } else {
                    c1720c2 = c1720c;
                    c4727j1 = c4727j0;
                    interfaceC4814a2 = interfaceC4814a;
                    c16525b2 = c16525b;
                    interfaceC0571F2 = interfaceC0571F;
                }
                EnumC4807x0 enumC4807x1 = EnumC4807x0.f15673Y;
                InterfaceC3776x[] interfaceC3776xArr2 = C4727J0.f15367I;
                c4727j1.m5420o(enumC4807x1);
                c4727j1.f15371D = c1720c2;
                c4727j1.f15388m = AbstractC0575H.m1174c(c4727j1.f15379d.plus(AbstractC0575H.m1176e()));
                boolean z11 = c4727j1.f15398w;
                c5842n = c4727j1.f15400y;
                boolean z12 = c5842n.f19114v;
                C15026j c15026j2 = c4727j1.f15399x;
                C4762b c4762b2 = c4727j1.f15378c;
                str = "coroutineScope";
                c4727j3 = c4727j5;
                c16525b2.f51262Y = new C1722e(z11, z12, c15026j2, c4762b2.f15538a, c4762b2.f15540c, c4762b2.f15539b, c4762b2.f15541d, c4762b2.f15542e, c4762b2.f15543f);
                if (!AbstractC0575H.m1196y(c5842n.f18996c)) {
                    c5842n.f18996c = AbstractC0575H.m1174c(c5842n.f18995b.plus(AbstractC0575H.m1176e()));
                }
                c2925c = c4727j1.f15388m;
                if (c2925c != null) {
                    AbstractC16544l.m18103p(str);
                    throw null;
                }
                AbstractC0575H.m1156D(c2925c, null, null, new C4725I0(c4727j1, null), 3);
                obj2 = c16525b2.f51262Y;
                if (((C1722e) obj2).f4952c != null) {
                    c3103bM3932a = c4727j1.f15383h.m3932a((C10808o) ((C1722e) obj2).f4952c.f46724Y);
                    C4171z3 c4171z4 = new C4171z3(c4727j1, 4);
                    this.f15328r0 = interfaceC0571F2;
                    this.f15323Y = c16525b2;
                    this.f15324Z = interfaceC4814a2;
                    this.f15325o0 = c3103bM3932a;
                    this.f15326p0 = c4727j1;
                    this.f15327q0 = 3;
                    c3103bM3932a.m3931e(c4727j1, c4171z4);
                    enumC19250a = enumC19250a2;
                    if (C17296C.f55119a == enumC19250a) {
                        interfaceC4814a5 = interfaceC4814a2;
                        return enumC19250a;
                    }
                    interfaceC4814a5 = interfaceC4814a2;
                    c4727j1.f15397v = c3103bM3932a;
                    interfaceC4814a4 = interfaceC4814a5;
                } else {
                    enumC19250a = enumC19250a2;
                    interfaceC4814a4 = interfaceC4814a2;
                }
                c16525b4 = c16525b2;
                interfaceC0571F4 = interfaceC0571F2;
                ((C4816c) interfaceC4814a4).m5450g(null);
                c0841y = new C0841y(C0565C.f1783Y, 1);
                c4727j4 = c4727j3;
                c2925c2 = c4727j4.f15388m;
                if (c2925c2 == null) {
                    AbstractC16544l.m18103p(str);
                    throw null;
                }
                c0564b0M1156D = AbstractC0575H.m1156D(c2925c2, c4727j4.f15380e.plus(c0841y), null, new C4711B0(this.f15329s0, this.f15331u0, this.f15332v0, this.f15330t0, c16525b4, null), 2);
                InterfaceC0595V interfaceC0595VMo1271H2 = AbstractC0575H.m1192u(interfaceC0571F4.getCoroutineContext()).mo1271H0(new C4171z3(c0564b0M1156D, 5));
                c16525b5 = new C16525B();
                c0564b0M1156D.mo1271H0(new C3350b0(interfaceC0595VMo1271H2, 26, c16525b5));
                this.f15328r0 = c16525b5;
                obj3 = null;
                this.f15323Y = null;
                this.f15324Z = null;
                this.f15325o0 = null;
                this.f15326p0 = null;
                this.f15327q0 = 4;
                if (c0564b0M1156D.mo1272P(this) == enumC19250a) {
                    return enumC19250a;
                }
                c16525b6 = c16525b5;
                th2 = (Throwable) c16525b6.f51262Y;
                if (th2 == null) {
                    return obj3;
                }
                throw th2;
            } catch (Throwable th4) {
                th = th4;
                obj4 = interfaceC4814a;
                ((C4816c) obj4).m5450g(null);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
