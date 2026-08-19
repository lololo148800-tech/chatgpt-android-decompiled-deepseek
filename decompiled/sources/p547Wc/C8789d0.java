package p547Wc;

import androidx.compose.foundation.gestures.AbstractC10840a;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p860l0.C16782u;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wc.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8789d0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f26883Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16782u f26884Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f26885o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8789d0(C16782u c16782u, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f26884Z = c16782u;
        this.f26885o0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8789d0(this.f26884Z, this.f26885o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8789d0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f26883Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            Integer num = new Integer(1);
            this.f26883Y = 1;
            if (AbstractC10840a.m11219e(this.f26884Z, num, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        ((InterfaceC1426a) this.f26885o0.getValue()).invoke();
        return C17296C.f55119a;
    }
}
