package p190Hc;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p432Rh.C6906s;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Hc.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C3286g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f10017Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3287h f10018Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3286g(C3287h c3287h, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10018Z = c3287h;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3286g(this.f10018Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3286g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f10017Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6906s c6906s = this.f10018Z.f10021o0;
            this.f10017Y = 1;
            Object objM21028a = c6906s.f22143Y.m21028a(this);
            if (objM21028a != enumC19250a) {
                objM21028a = c17296c;
            }
            if (objM21028a == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
