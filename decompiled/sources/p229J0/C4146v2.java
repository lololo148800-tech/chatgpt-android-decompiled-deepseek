package p229J0;

import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p080D0.C1811j0;
import p1014t1.C19723A;
import p571X9.AbstractC9233X;
import p860l0.AbstractC16689K1;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.v2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4146v2 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f13429Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f13430Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f13431o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4146v2(InterfaceC1426a interfaceC1426a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f13431o0 = interfaceC1426a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4146v2 c4146v2 = new C4146v2(this.f13431o0, interfaceC18770c);
        c4146v2.f13430Z = obj;
        return c4146v2;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4146v2) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f13429Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19723A c19723a = (C19723A) this.f13430Z;
            C1811j0 c1811j0 = new C1811j0(5, this.f13431o0);
            this.f13429Y = 1;
            if (AbstractC16689K1.m18508e(c19723a, null, null, c1811j0, this, 7) == enumC19250a) {
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
