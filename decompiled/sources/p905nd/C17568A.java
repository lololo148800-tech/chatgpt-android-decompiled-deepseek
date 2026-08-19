package p905nd;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p544W9.AbstractC8565U2;
import p571X9.AbstractC9233X;
import p792hl.AbstractC14527b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: nd.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C17568A extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f56211Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC14527b f56212Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17568A(AbstractC14527b abstractC14527b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f56212Z = abstractC14527b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17568A(this.f56212Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17568A) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f56211Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f56211Y = 1;
            obj = AbstractC8565U2.m9226a(this.f56212Z, this);
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
