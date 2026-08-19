package p193Hf;

import com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModel;
import com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p094De.C2027j;
import p349O0.C5996c0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Hf.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C3344Z extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f10206Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ CanmoreViewModel f10207Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f10208o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C5996c0 f10209p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3344Z(CanmoreViewModel canmoreViewModel, String str, C5996c0 c5996c0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10207Z = canmoreViewModel;
        this.f10208o0 = str;
        this.f10209p0 = c5996c0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3344Z(this.f10207Z, this.f10208o0, this.f10209p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3344Z) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f10206Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            CanmoreViewModelImpl canmoreViewModelImpl = (CanmoreViewModelImpl) this.f10207Z;
            C3340X c3340x = new C3340X(this.f10209p0, 0);
            this.f10206Y = 1;
            Object objMo3141d = canmoreViewModelImpl.f38871o.f6793Y.mo3141d(new C2027j(c3340x, this.f10208o0, 1), this);
            if (objMo3141d != enumC19250a) {
                objMo3141d = c17296c;
            }
            if (objMo3141d == enumC19250a) {
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
