package p993rj;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: rj.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C19059u extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f60727Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19024D f60728Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19059u(C19024D c19024d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f60728Z = c19024d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19059u(this.f60728Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19059u) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f60727Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19024D c19024d = this.f60728Z;
            InterfaceC18776i interfaceC18776i = c19024d.f60624i.f8769Y;
            C19058t c19058t = new C19058t(c19024d, null);
            this.f60727Y = 1;
            obj = AbstractC0575H.m1168P(interfaceC18776i, c19058t, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
