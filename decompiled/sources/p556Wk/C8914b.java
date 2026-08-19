package p556Wk;

import ml.AbstractC17288f;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p1089wl.AbstractC21011e;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wk.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C8914b extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27280Y;

    /* JADX INFO: renamed from: Z */
    public int f27281Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ AbstractC21011e f27282o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f27283p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1440o f27284q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8914b(InterfaceC1440o interfaceC1440o, InterfaceC18770c interfaceC18770c, int i10) {
        super(3, interfaceC18770c);
        this.f27280Y = i10;
        this.f27284q0 = interfaceC1440o;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC21011e abstractC21011e = (AbstractC21011e) obj;
        InterfaceC18770c interfaceC18770c = (InterfaceC18770c) obj3;
        switch (this.f27280Y) {
            case 0:
                C8914b c8914b = new C8914b(this.f27284q0, interfaceC18770c, 0);
                c8914b.f27282o0 = abstractC21011e;
                c8914b.f27283p0 = obj2;
                return c8914b.invokeSuspend(C17296C.f55119a);
            default:
                C8914b c8914b2 = new C8914b(this.f27284q0, interfaceC18770c, 1);
                c8914b2.f27282o0 = abstractC21011e;
                c8914b2.f27283p0 = obj2;
                return c8914b2.invokeSuspend(C17296C.f55119a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        AbstractC21011e abstractC21011e;
        AbstractC17288f abstractC17288f;
        AbstractC21011e abstractC21011e2;
        switch (this.f27280Y) {
            case 0:
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.f27281Z;
                C17296C c17296c = C17296C.f55119a;
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    abstractC21011e = this.f27282o0;
                    Object obj2 = this.f27283p0;
                    if (obj2 instanceof AbstractC17288f) {
                        Object obj3 = abstractC21011e.f66872Y;
                        this.f27282o0 = abstractC21011e;
                        this.f27281Z = 1;
                        obj = this.f27284q0.invoke(obj3, obj2, this);
                        if (obj == enumC19250a) {
                            return enumC19250a;
                        }
                        abstractC17288f = (AbstractC17288f) obj;
                        if (abstractC17288f != null) {
                            this.f27282o0 = null;
                            this.f27281Z = 2;
                            if (abstractC21011e.mo21465d(abstractC17288f, this) == enumC19250a) {
                                return enumC19250a;
                            }
                        }
                    }
                } else if (i10 == 1) {
                    abstractC21011e = this.f27282o0;
                    AbstractC9233X.m9807c(obj);
                    abstractC17288f = (AbstractC17288f) obj;
                    if (abstractC17288f != null) {
                        this.f27282o0 = null;
                        this.f27281Z = 2;
                        if (abstractC21011e.mo21465d(abstractC17288f, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return c17296c;
            default:
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i11 = this.f27281Z;
                if (i11 != 0) {
                    if (i11 == 1) {
                        abstractC21011e2 = this.f27282o0;
                        AbstractC9233X.m9807c(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(obj);
                    }
                    return C17296C.f55119a;
                }
                AbstractC9233X.m9807c(obj);
                abstractC21011e2 = this.f27282o0;
                Object obj4 = this.f27283p0;
                Object obj5 = abstractC21011e2.f66872Y;
                this.f27282o0 = abstractC21011e2;
                this.f27281Z = 1;
                obj = this.f27284q0.invoke(obj5, obj4, this);
                if (obj == enumC19250a2) {
                    return enumC19250a2;
                }
                AbstractC17288f abstractC17288f2 = (AbstractC17288f) obj;
                if (abstractC17288f2 != null) {
                    this.f27282o0 = null;
                    this.f27281Z = 2;
                    if (abstractC21011e2.mo21465d(abstractC17288f2, this) == enumC19250a2) {
                        return enumC19250a2;
                    }
                }
                return C17296C.f55119a;
        }
    }
}
