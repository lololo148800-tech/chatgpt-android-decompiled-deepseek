package p1000s0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: s0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C19413i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f61518Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f61519Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19408d f61520o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19413i(C19408d c19408d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f61520o0 = c19408d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C19413i c19413i = new C19413i(this.f61520o0, interfaceC18770c);
        c19413i.f61519Z = obj;
        return c19413i;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19413i) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f61518Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19412h c19412h = new C19412h((C19723A) this.f61519Z, this.f61520o0, null);
            this.f61518Y = 1;
            if (AbstractC0575H.m1183l(c19412h, this) == enumC19250a) {
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
