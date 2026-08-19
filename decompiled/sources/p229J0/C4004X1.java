package p229J0;

import android.window.BackEvent;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p278L0.AbstractC4859X;
import p571X9.AbstractC9233X;
import p758g0.C13756d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.X1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4004X1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f12562Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13756d f12563Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ BackEvent f12564o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4004X1(C13756d c13756d, BackEvent backEvent, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f12563Z = c13756d;
        this.f12564o0 = backEvent;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4004X1(this.f12563Z, this.f12564o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4004X1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f12562Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            Float f10 = new Float(AbstractC4859X.f15817a.mo9579a(this.f12564o0.getProgress()));
            this.f12562Y = 1;
            if (this.f12563Z.m15226g(f10, this) == enumC19250a) {
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
