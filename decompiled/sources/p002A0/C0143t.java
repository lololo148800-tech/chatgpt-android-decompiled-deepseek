package p002A0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p571X9.AbstractC9233X;
import p860l0.AbstractC16689K1;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: A0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0143t extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f593Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19723A f594Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0120T f595o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0143t(C0120T c0120t, InterfaceC18770c interfaceC18770c, C19723A c19723a) {
        super(2, interfaceC18770c);
        this.f594Z = c19723a;
        this.f595o0 = c0120t;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C0143t(this.f595o0, interfaceC18770c, this.f594Z);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0143t) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f593Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C0142s c0142s = new C0142s(this.f595o0, 0);
            this.f593Y = 1;
            if (AbstractC16689K1.m18508e(this.f594Z, null, null, c0142s, this, 7) == enumC19250a) {
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
