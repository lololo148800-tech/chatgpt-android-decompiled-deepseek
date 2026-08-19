package p547Wc;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p860l0.C16725b;
import p860l0.InterfaceC16694M0;
import p881m0.C17133j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wc.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C8811u extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f26978Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f26979Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17133j f26980o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8811u(C17133j c17133j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f26980o0 = c17133j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C8811u c8811u = new C8811u(this.f26980o0, interfaceC18770c);
        c8811u.f26979Z = obj;
        return c8811u;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8811u) create((InterfaceC16694M0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f26978Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC16694M0 interfaceC16694M0 = (InterfaceC16694M0) this.f26979Z;
            this.f26978Y = 1;
            if (this.f26980o0.m18899d(interfaceC16694M0, 0.0f, C16725b.f53603v0, this) == enumC19250a) {
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
