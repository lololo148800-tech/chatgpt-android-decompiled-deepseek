package p193Hf;

import com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModel;
import com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl;
import mm.C17296C;
import p002A0.C0132i;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p168Gd.C3034b;
import p349O0.C5996c0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Hf.C0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3300C0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f10059Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ CanmoreViewModel f10060Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3034b f10061o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C5996c0 f10062p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3300C0(CanmoreViewModel canmoreViewModel, C3034b c3034b, C5996c0 c5996c0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10060Z = canmoreViewModel;
        this.f10061o0 = c3034b;
        this.f10062p0 = c5996c0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3300C0(this.f10060Z, this.f10061o0, this.f10062p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3300C0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f10059Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        CanmoreViewModelImpl canmoreViewModelImpl = (CanmoreViewModelImpl) this.f10060Z;
        C3340X c3340x = new C3340X(this.f10062p0, 1);
        this.f10059Y = 1;
        canmoreViewModelImpl.f38872p.mo3141d(new C0132i(c3340x, 9, this.f10061o0), this);
        return enumC19250a;
    }
}
