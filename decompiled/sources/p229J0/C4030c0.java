package p229J0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4030c0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f12686Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3880A3 f12687Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f12688o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4030c0(C3880A3 c3880a3, float f10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f12687Z = c3880a3;
        this.f12688o0 = f10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4030c0(this.f12687Z, this.f12688o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4030c0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f12686Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f12686Y = 1;
            Object objM12630F = this.f12687Z.f11737c.m12630F(this.f12688o0, this);
            if (objM12630F != enumC19250a) {
                objM12630F = c17296c;
            }
            if (objM12630F == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
