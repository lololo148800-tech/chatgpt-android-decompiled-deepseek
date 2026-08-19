package p563X1;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1001s1.C19434d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: X1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9026f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f27536Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC9029i f27537Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f27538o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9026f(AbstractC9029i abstractC9029i, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f27537Z = abstractC9029i;
        this.f27538o0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C9026f(this.f27537Z, this.f27538o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C9026f) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f27536Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19434d c19434d = this.f27537Z.f27555o0;
            this.f27536Y = 1;
            if (c19434d.m20513b(this.f27538o0, this) == enumC19250a) {
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
