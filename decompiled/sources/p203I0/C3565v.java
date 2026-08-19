package p203I0;

import androidx.compose.material.ripple.RippleNode;
import mm.C17296C;
import p002A0.C0132i;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2127D0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: I0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C3565v extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f10804Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f10805Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ RippleNode f10806o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3565v(RippleNode rippleNode, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10806o0 = rippleNode;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C3565v c3565v = new C3565v(this.f10806o0, interfaceC18770c);
        c3565v.f10805Z = obj;
        return c3565v;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3565v) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f10804Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f10805Z;
        RippleNode rippleNode = this.f10806o0;
        C2127D0 c2127d0Mo7768b = rippleNode.f32646z0.mo7768b();
        C0132i c0132i = new C0132i(rippleNode, 12, interfaceC0571F);
        this.f10804Y = 1;
        c2127d0Mo7768b.mo3141d(c0132i, this);
        return enumC19250a;
    }
}
