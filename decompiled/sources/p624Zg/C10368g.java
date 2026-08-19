package p624Zg;

import com.openai.feature.subscriptions.ChoosePlanViewModel;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.C2215x0;
import p571X9.AbstractC9233X;
import p893n.AbstractActivityC17375g;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Zg.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C10368g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f30724Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ChoosePlanViewModel f30725Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractActivityC17375g f30726o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10368g(ChoosePlanViewModel choosePlanViewModel, AbstractActivityC17375g abstractActivityC17375g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f30725Z = choosePlanViewModel;
        this.f30726o0 = abstractActivityC17375g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C10368g(this.f30725Z, this.f30726o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C10368g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f30724Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            ChoosePlanViewModel choosePlanViewModel = this.f30725Z;
            C2215x0 c2215x0 = choosePlanViewModel.f40347g;
            C10366f c10366f = new C10366f(choosePlanViewModel, this.f30726o0, null);
            this.f30724Y = 1;
            if (AbstractC2124C.m3212k(c2215x0, c10366f, this) == enumC19250a) {
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
