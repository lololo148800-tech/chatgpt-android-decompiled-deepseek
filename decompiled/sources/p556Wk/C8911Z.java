package p556Wk;

import cl.C11774a;
import mm.C17296C;
import np.InterfaceC17710b;
import p049Bm.InterfaceC1440o;
import p1089wl.AbstractC21011e;
import p434Rk.C6911c;
import p571X9.AbstractC9233X;
import p666bl.C11503s;
import p666bl.C11505u;
import p666bl.C11507w;
import p754fl.C13693c;
import p754fl.InterfaceC13692b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wk.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C8911Z extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27268Y;

    /* JADX INFO: renamed from: Z */
    public int f27269Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ AbstractC21011e f27270o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1440o f27271p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8911Z(InterfaceC1440o interfaceC1440o, InterfaceC18770c interfaceC18770c, int i10) {
        super(3, interfaceC18770c);
        this.f27268Y = i10;
        this.f27271p0 = interfaceC1440o;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC21011e abstractC21011e = (AbstractC21011e) obj;
        switch (this.f27268Y) {
            case 0:
                C8911Z c8911z = new C8911Z(this.f27271p0, (InterfaceC18770c) obj3, 0);
                c8911z.f27270o0 = abstractC21011e;
                return c8911z.invokeSuspend(C17296C.f55119a);
            case 1:
                C8911Z c8911z2 = new C8911Z(this.f27271p0, (InterfaceC18770c) obj3, 1);
                c8911z2.f27270o0 = abstractC21011e;
                return c8911z2.invokeSuspend(C17296C.f55119a);
            case 2:
                C8911Z c8911z3 = new C8911Z(this.f27271p0, (InterfaceC18770c) obj3, 2);
                c8911z3.f27270o0 = abstractC21011e;
                return c8911z3.invokeSuspend(C17296C.f55119a);
            case 3:
                C8911Z c8911z4 = new C8911Z(this.f27271p0, (InterfaceC18770c) obj3, 3);
                c8911z4.f27270o0 = abstractC21011e;
                return c8911z4.invokeSuspend(C17296C.f55119a);
            case 4:
                C8911Z c8911z5 = new C8911Z(this.f27271p0, (InterfaceC18770c) obj3, 4);
                c8911z5.f27270o0 = abstractC21011e;
                return c8911z5.invokeSuspend(C17296C.f55119a);
            case 5:
                C8911Z c8911z6 = new C8911Z(this.f27271p0, (InterfaceC18770c) obj3, 5);
                c8911z6.f27270o0 = abstractC21011e;
                return c8911z6.invokeSuspend(C17296C.f55119a);
            default:
                C8911Z c8911z7 = new C8911Z(this.f27271p0, (InterfaceC18770c) obj3, 6);
                c8911z7.f27270o0 = abstractC21011e;
                return c8911z7.invokeSuspend(C17296C.f55119a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010d, code lost:
    
        if (r14 == r6) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0124, code lost:
    
        if (r14 == r6) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0156, code lost:
    
        if (r14 == r6) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016a, code lost:
    
        if (r14 == r6) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1, types: [wl.e] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [wl.e] */
    @Override // sm.AbstractC19685a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C17296C c17296c = C17296C.f55119a;
        InterfaceC1440o interfaceC1440o = this.f27271p0;
        ?? r6 = "call to 'resume' before 'invoke' with coroutine";
        switch (this.f27268Y) {
            case 0:
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.f27269Z;
                try {
                    if (i10 == 0) {
                        AbstractC9233X.m9807c(obj);
                        AbstractC21011e abstractC21011e = this.f27270o0;
                        this.f27270o0 = abstractC21011e;
                        this.f27269Z = 1;
                        Object objMo21464c = abstractC21011e.mo21464c(this);
                        r6 = abstractC21011e;
                        break;
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC9233X.m9807c(obj);
                            Throwable th2 = (Throwable) obj;
                            if (th2 == null) {
                                return c17296c;
                            }
                            throw th2;
                        }
                        AbstractC21011e abstractC21011e2 = this.f27270o0;
                        AbstractC9233X.m9807c(obj);
                        r6 = abstractC21011e2;
                    }
                    return c17296c;
                } catch (Throwable th3) {
                    InterfaceC13692b interfaceC13692bM7296c = ((C6911c) r6.f66872Y).m7296c();
                    this.f27270o0 = null;
                    this.f27269Z = 2;
                    obj = interfaceC1440o.invoke(interfaceC13692bM7296c, th3, this);
                }
                break;
            case 1:
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i11 = this.f27269Z;
                try {
                    if (i11 == 0) {
                        AbstractC9233X.m9807c(obj);
                        AbstractC21011e abstractC21011e3 = this.f27270o0;
                        this.f27270o0 = abstractC21011e3;
                        this.f27269Z = 1;
                        Object objMo21464c2 = abstractC21011e3.mo21464c(this);
                        r6 = abstractC21011e3;
                        break;
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC9233X.m9807c(obj);
                            Throwable th4 = (Throwable) obj;
                            if (th4 == null) {
                                return c17296c;
                            }
                            throw th4;
                        }
                        AbstractC21011e abstractC21011e4 = this.f27270o0;
                        AbstractC9233X.m9807c(obj);
                        r6 = abstractC21011e4;
                    }
                    return c17296c;
                } catch (Throwable th5) {
                    C13693c c13693c = (C13693c) r6.f66872Y;
                    InterfaceC17710b interfaceC17710b = AbstractC8887A.f27204a;
                    C8944z c8944z = new C8944z(c13693c);
                    this.f27270o0 = null;
                    this.f27269Z = 2;
                    obj = interfaceC1440o.invoke(c8944z, th5, this);
                }
                break;
            case 2:
                EnumC19250a enumC19250a3 = EnumC19250a.f61036Y;
                int i12 = this.f27269Z;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj);
                AbstractC21011e abstractC21011e5 = this.f27270o0;
                Object obj2 = abstractC21011e5.f66872Y;
                C8925g0 c8925g0 = new C8925g0(1, 8, AbstractC21011e.class, abstractC21011e5, "proceed", "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
                this.f27269Z = 1;
                return interfaceC1440o.invoke(obj2, c8925g0, this) == enumC19250a3 ? enumC19250a3 : c17296c;
            case 3:
                EnumC19250a enumC19250a4 = EnumC19250a.f61036Y;
                int i13 = this.f27269Z;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj);
                AbstractC21011e abstractC21011e6 = this.f27270o0;
                C11503s c11503s = new C11503s(abstractC21011e6);
                this.f27269Z = 1;
                return interfaceC1440o.invoke(c11503s, abstractC21011e6.f66872Y, this) == enumC19250a4 ? enumC19250a4 : c17296c;
            case 4:
                EnumC19250a enumC19250a5 = EnumC19250a.f61036Y;
                int i14 = this.f27269Z;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj);
                AbstractC21011e abstractC21011e7 = this.f27270o0;
                C11505u c11505u = new C11505u(abstractC21011e7);
                Object objMo21463b = abstractC21011e7.mo21463b();
                this.f27269Z = 1;
                return interfaceC1440o.invoke(c11505u, objMo21463b, this) == enumC19250a5 ? enumC19250a5 : c17296c;
            case 5:
                EnumC19250a enumC19250a6 = EnumC19250a.f61036Y;
                int i15 = this.f27269Z;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj);
                AbstractC21011e abstractC21011e8 = this.f27270o0;
                C11507w c11507w = new C11507w(abstractC21011e8);
                this.f27269Z = 1;
                return interfaceC1440o.invoke(c11507w, abstractC21011e8.f66872Y, this) == enumC19250a6 ? enumC19250a6 : c17296c;
            default:
                EnumC19250a enumC19250a7 = EnumC19250a.f61036Y;
                int i16 = this.f27269Z;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj);
                AbstractC21011e abstractC21011e9 = this.f27270o0;
                C11774a c11774a = new C11774a(abstractC21011e9);
                Object objMo21463b2 = abstractC21011e9.mo21463b();
                this.f27269Z = 1;
                return interfaceC1440o.invoke(c11774a, objMo21463b2, this) == enumC19250a7 ? enumC19250a7 : c17296c;
        }
    }
}
