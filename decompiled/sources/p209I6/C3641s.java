package p209I6;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p077Cn.C1743k;
import p103Dn.InterfaceC2186j;
import p235J6.C4275l;
import p571X9.AbstractC9233X;
import p917o6.C17852e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: I6.s */
/* JADX INFO: loaded from: classes.dex */
public final class C3641s extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f11096Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3645w f11097Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17852e f11098o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3641s(C3645w c3645w, C17852e c17852e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f11097Z = c3645w;
        this.f11098o0 = c17852e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3641s(this.f11097Z, this.f11098o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3641s) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f11096Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C1743k c1743k = this.f11097Z.f11124g;
            C4275l c4275l = new C4275l(this.f11098o0);
            this.f11096Y = 1;
            if (c1743k.mo2523o(c4275l, this) == enumC19250a) {
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
