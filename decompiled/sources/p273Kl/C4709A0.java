package p273Kl;

import java.util.List;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p297Ll.AbstractC5127h;
import p297Ll.C5123d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.A0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4709A0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15305Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4727J0 f15306Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4709A0(C4727J0 c4727j0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15306Z = c4727j0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4709A0(this.f15306Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4709A0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15305Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C4727J0 c4727j0 = this.f15306Z;
            if (c4727j0.f15396u) {
                this.f15305Y = 1;
                List list = AbstractC5127h.f16761a;
                if (AbstractC0575H.m1183l(new C5123d(c4727j0, c4727j0.f15376a, null), this) == enumC19250a) {
                    return enumC19250a;
                }
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
