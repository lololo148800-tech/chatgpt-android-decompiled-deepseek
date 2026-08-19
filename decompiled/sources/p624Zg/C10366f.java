package p624Zg;

import com.openai.feature.subscriptions.ChoosePlanViewModel;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p893n.AbstractActivityC17375g;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Zg.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C10366f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f30720Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ChoosePlanViewModel f30721Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractActivityC17375g f30722o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10366f(ChoosePlanViewModel choosePlanViewModel, AbstractActivityC17375g abstractActivityC17375g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f30721Z = choosePlanViewModel;
        this.f30722o0 = abstractActivityC17375g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C10366f c10366f = new C10366f(this.f30721Z, this.f30722o0, interfaceC18770c);
        c10366f.f30720Y = obj;
        return c10366f;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C10366f c10366f = (C10366f) create((C10356a) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c10366f.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C10356a c10356a = (C10356a) this.f30720Y;
        if (c10356a instanceof C10356a) {
            this.f30721Z.mo14369n(this.f30722o0, c10356a.f30701a);
        }
        return C17296C.f55119a;
    }
}
