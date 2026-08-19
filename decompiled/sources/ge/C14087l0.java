package ge;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p229J0.C3880A3;
import p571X9.AbstractC9233X;
import p926of.C18156T;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ge.l0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14087l0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44318Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3880A3 f44319Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f44320o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14087l0(C3880A3 c3880a3, InterfaceC1436k interfaceC1436k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44319Z = c3880a3;
        this.f44320o0 = interfaceC1436k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14087l0(this.f44319Z, this.f44320o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14087l0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44318Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f44318Y = 1;
            if (this.f44319Z.m4603c(this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        this.f44320o0.invoke(new C18156T(null));
        return C17296C.f55119a;
    }
}
