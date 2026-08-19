package p905nd;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p948pi.C18422e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: nd.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C17575c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f56222Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C17572E f56223Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18422e f56224o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17575c(C17572E c17572e, C18422e c18422e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f56223Z = c17572e;
        this.f56224o0 = c18422e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17575c(this.f56223Z, this.f56224o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17575c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f56222Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C17574b c17574b = new C17574b(this.f56224o0, 0);
            this.f56222Y = 1;
            if (this.f56223Z.m21029b(c17574b, this) == enumC19250a) {
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
