package p193Hf;

import com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModel;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p168Gd.C3034b;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Hf.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3362f0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C3034b f10268Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ CanmoreViewModel f10269Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3362f0(C3034b c3034b, CanmoreViewModel canmoreViewModel, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10268Y = c3034b;
        this.f10269Z = canmoreViewModel;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3362f0(this.f10268Y, this.f10269Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C3362f0 c3362f0 = (C3362f0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c3362f0.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C3034b c3034b = this.f10268Y;
        if (c3034b != null && (str = c3034b.f9129b) != null) {
            this.f10269Z.m14395k(new C3358e(c3034b.f9128a, str));
        }
        return C17296C.f55119a;
    }
}
