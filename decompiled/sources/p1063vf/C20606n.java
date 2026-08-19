package p1063vf;

import mm.C17296C;
import p025An.C0583L;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: vf.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C20606n extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f65384Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20608p f65385Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20606n(C20608p c20608p, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65385Z = c20608p;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20606n(this.f65385Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20606n) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f65384Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C0583L c0583l = this.f65385Z.f65400s0;
            this.f65384Y = 1;
            obj = c0583l.m1309u(this);
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
