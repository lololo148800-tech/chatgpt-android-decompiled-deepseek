package p1000s0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p758g0.AbstractC13758e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: s0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C19423s extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f61566Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19408d f61567Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19423s(C19408d c19408d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f61567Z = c19408d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19423s(this.f61567Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19423s) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objM20495f;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f61566Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f61566Y = 1;
            float f10 = AbstractC19402K.f61474a;
            C19408d c19408d = this.f61567Z;
            if (c19408d.m20498j() - 1 < 0 || (objM20495f = c19408d.m20495f(c19408d.m20498j() - 1, 0.0f, AbstractC13758e.m15254s(0.0f, 0.0f, null, 7), this)) != enumC19250a) {
                objM20495f = c17296c;
            }
            if (objM20495f == enumC19250a) {
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
