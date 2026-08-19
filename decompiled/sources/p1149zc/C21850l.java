package p1149zc;

import com.openai.auth.SwitchAccountViewModel;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p893n.AbstractActivityC17375g;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: zc.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C21850l extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC21856r f69315Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ SwitchAccountViewModel f69316Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractActivityC17375g f69317o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21850l(InterfaceC21856r interfaceC21856r, SwitchAccountViewModel switchAccountViewModel, AbstractActivityC17375g abstractActivityC17375g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f69315Y = interfaceC21856r;
        this.f69316Z = switchAccountViewModel;
        this.f69317o0 = abstractActivityC17375g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C21850l(this.f69315Y, this.f69316Z, this.f69317o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C21850l c21850l = (C21850l) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c21850l.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        if (this.f69315Y instanceof C21853o) {
            this.f69316Z.mo14218n(this.f69317o0);
        }
        return C17296C.f55119a;
    }
}
