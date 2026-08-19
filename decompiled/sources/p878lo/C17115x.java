package p878lo;

import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: lo.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C17115x extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f54701Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f54702Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17116y f54703o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17115x(C17116y c17116y, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54703o0 = c17116y;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C17115x c17115x = new C17115x(this.f54703o0, interfaceC18770c);
        c17115x.f54702Z = obj;
        return c17115x;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17115x) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f54701Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C17114w c17114w = new C17114w((C19723A) this.f54702Z, this.f54703o0, null);
            this.f54701Y = 1;
            if (AbstractC0575H.m1183l(c17114w, this) == enumC19250a) {
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
