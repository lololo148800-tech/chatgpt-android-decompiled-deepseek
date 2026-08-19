package p125Ej;

import mm.C17296C;
import p002A0.C0132i;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p949pj.C18438K;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ej.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C2560d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f7988Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f7989Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2561e f7990o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2560d(C2561e c2561e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7990o0 = c2561e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2560d c2560d = new C2560d(this.f7990o0, interfaceC18770c);
        c2560d.f7989Z = obj;
        return c2560d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C2560d) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f7988Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f7989Z;
            C2561e c2561e = this.f7990o0;
            C18438K c18438k = c2561e.f7992c;
            C0132i c0132i = new C0132i(interfaceC2186j, 8, c2561e);
            this.f7988Y = 1;
            if (c18438k.f58824Y.mo3141d(c0132i, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        throw new C0644w();
    }
}
