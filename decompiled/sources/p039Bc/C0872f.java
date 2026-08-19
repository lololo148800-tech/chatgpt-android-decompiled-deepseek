package p039Bc;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p072Ci.C1705j;
import p086D6.C1970n;
import p092Dc.C1996m;
import p103Dn.AbstractC2124C;
import p571X9.AbstractC9233X;
import p708dh.C13133K;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Bc.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C0872f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f2562Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1996m f2563Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0872f(C1996m c1996m, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f2563Z = c1996m;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C0872f(this.f2563Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0872f) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f2562Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C1970n c1970n = ((C13133K) this.f2563Z.f5904D.get()).f41697b;
            this.f2562Y = 1;
            obj = AbstractC2124C.m3223v(c1970n, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        C1705j c1705j = (C1705j) obj;
        if (c1705j != null) {
            return c1705j.f4870c;
        }
        return null;
    }
}
