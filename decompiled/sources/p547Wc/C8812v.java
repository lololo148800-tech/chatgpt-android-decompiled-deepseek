package p547Wc;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p773h0.EnumC14284g0;
import p881m0.C17133j;
import p936p0.C18280t;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wc.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C8812v extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f26981Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18280t f26982Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17133j f26983o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8812v(C18280t c18280t, C17133j c17133j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f26982Z = c18280t;
        this.f26983o0 = c17133j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8812v(this.f26982Z, this.f26983o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8812v) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f26981Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C8811u c8811u = new C8811u(this.f26983o0, null);
            this.f26981Y = 1;
            if (this.f26982Z.mo5256b(EnumC14284g0.f44821Y, c8811u, this) == enumC19250a) {
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
