package p103Dn;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p077Cn.InterfaceC1758z;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.A */
/* JADX INFO: loaded from: classes2.dex */
public final class C2120A extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f6480Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f6481Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2213w0 f6482o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2120A(InterfaceC2213w0 interfaceC2213w0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f6482o0 = interfaceC2213w0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2120A c2120a = new C2120A(this.f6482o0, interfaceC18770c);
        c2120a.f6481Z = obj;
        return c2120a;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2120A) create((InterfaceC1758z) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f6480Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2206t c2206t = new C2206t((InterfaceC1758z) this.f6481Z, 1);
            this.f6480Y = 1;
            if (this.f6482o0.mo3141d(c2206t, this) == enumC19250a) {
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
