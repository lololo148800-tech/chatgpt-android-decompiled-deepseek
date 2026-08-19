package p199Hl;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC7855B6;
import p571X9.AbstractC9233X;
import p658b5.C11248s;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Hl.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3476a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f10539Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11248s f10540Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC7855B6 f10541o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3476a(C11248s c11248s, AbstractC7855B6 abstractC7855B6, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10540Z = c11248s;
        this.f10541o0 = abstractC7855B6;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3476a(this.f10540Z, this.f10541o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3476a) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f10539Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f10539Y = 1;
            if (this.f10540Z.m12670s(this.f10541o0, this) == enumC19250a) {
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
