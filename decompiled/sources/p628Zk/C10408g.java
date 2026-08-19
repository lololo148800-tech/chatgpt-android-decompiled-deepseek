package p628Zk;

import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p1089wl.AbstractC21011e;
import p571X9.AbstractC9233X;
import p754fl.C13693c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Zk.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C10408g extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f30845Y;

    /* JADX INFO: renamed from: Z */
    public int f30846Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ AbstractC21011e f30847o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C10416o f30848p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10408g(C10416o c10416o, InterfaceC18770c interfaceC18770c, int i10) {
        super(3, interfaceC18770c);
        this.f30845Y = i10;
        this.f30848p0 = c10416o;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC21011e abstractC21011e = (AbstractC21011e) obj;
        InterfaceC18770c interfaceC18770c = (InterfaceC18770c) obj3;
        switch (this.f30845Y) {
            case 0:
                C10408g c10408g = new C10408g(this.f30848p0, interfaceC18770c, 0);
                c10408g.f30847o0 = abstractC21011e;
                return c10408g.invokeSuspend(C17296C.f55119a);
            default:
                C10408g c10408g2 = new C10408g(this.f30848p0, interfaceC18770c, 1);
                c10408g2.f30847o0 = abstractC21011e;
                return c10408g2.invokeSuspend(C17296C.f55119a);
        }
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        switch (this.f30845Y) {
            case 0:
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.f30846Z;
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    C13693c c13693c = (C13693c) this.f30847o0.f66872Y;
                    this.f30846Z = 1;
                    if (this.f30848p0.m10902a(c13693c, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
            default:
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i11 = this.f30846Z;
                if (i11 == 0) {
                    AbstractC9233X.m9807c(obj);
                    C13693c c13693c2 = (C13693c) this.f30847o0.f66872Y;
                    this.f30846Z = 1;
                    if (this.f30848p0.m10905m(c13693c2, this) == enumC19250a2) {
                        return enumC19250a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
        }
    }
}
