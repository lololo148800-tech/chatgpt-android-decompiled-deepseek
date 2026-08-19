package p427Rc;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Rc.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C6855l extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f21999Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC0627n0 f22000Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6855l(InterfaceC0627n0 interfaceC0627n0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f22000Z = interfaceC0627n0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C6855l(this.f22000Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6855l) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f21999Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f21999Y = 1;
            if (AbstractC0575H.m1182k(this.f22000Z, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
