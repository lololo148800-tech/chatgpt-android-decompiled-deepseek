package p193Hf;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Hf.U */
/* JADX INFO: loaded from: classes3.dex */
public final class C3334U extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C3337V0 f10185Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3334U(C3337V0 c3337v0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10185Y = c3337v0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3334U(this.f10185Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C3334U c3334u = (C3334U) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c3334u.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C3324O0 c3324o0 = (C3324O0) this.f10185Y.f10189a.getValue();
        if (c3324o0 != null) {
            c3324o0.evaluateJavascript("window.getSelection().removeAllRanges()", new C3335U0());
        }
        return C17296C.f55119a;
    }
}
