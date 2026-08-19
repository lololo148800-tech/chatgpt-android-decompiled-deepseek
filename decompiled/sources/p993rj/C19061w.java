package p993rj;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: rj.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C19061w extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f60731Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19024D f60732Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19061w(C19024D c19024d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f60732Z = c19024d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19061w(this.f60732Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19061w) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f60731Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f60731Y = 1;
            if (C19024D.m20279a(this.f60732Z, this) == enumC19250a) {
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
