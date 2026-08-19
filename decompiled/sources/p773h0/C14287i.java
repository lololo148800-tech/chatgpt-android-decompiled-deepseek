package p773h0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: h0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C14287i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44828Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f44829Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC14289j f44830o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14287i(AbstractC14289j abstractC14289j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44830o0 = abstractC14289j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14287i c14287i = new C14287i(this.f44830o0, interfaceC18770c);
        c14287i.f44829Z = obj;
        return c14287i;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14287i) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44828Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19723A c19723a = (C19723A) this.f44829Z;
            this.f44828Y = 1;
            if (this.f44830o0.mo15543O0(c19723a, this) == enumC19250a) {
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
