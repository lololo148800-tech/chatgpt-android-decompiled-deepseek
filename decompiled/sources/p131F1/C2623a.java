package p131F1;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: F1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2623a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f8111Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ScrollCaptureCallbackC2628f f8112Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Runnable f8113o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2623a(ScrollCaptureCallbackC2628f scrollCaptureCallbackC2628f, Runnable runnable, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f8112Z = scrollCaptureCallbackC2628f;
        this.f8113o0 = runnable;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2623a(this.f8112Z, this.f8113o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2623a) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f8111Y;
        C17296C c17296c = C17296C.f55119a;
        ScrollCaptureCallbackC2628f scrollCaptureCallbackC2628f = this.f8112Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2633k c2633k = scrollCaptureCallbackC2628f.f8139e;
            this.f8111Y = 1;
            Object objM3622b = c2633k.m3622b(0.0f - c2633k.f8150b, this);
            if (objM3622b != enumC19250a) {
                objM3622b = c17296c;
            }
            if (objM3622b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        C2635m c2635m = scrollCaptureCallbackC2628f.f8137c;
        c2635m.f8152a.setValue(Boolean.FALSE);
        this.f8113o0.run();
        return c17296c;
    }
}
