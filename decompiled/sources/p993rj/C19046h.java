package p993rj;

import mm.C17296C;
import p003A1.C0205S1;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2127D0;
import p1071w0.AbstractC20734X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: rj.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C19046h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f60709Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19024D f60710Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19046h(C19024D c19024d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f60710Z = c19024d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19046h(this.f60710Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((C19046h) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f60709Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC20734X.m21252w(obj);
        }
        AbstractC9233X.m9807c(obj);
        C19024D c19024d = this.f60710Z;
        C2127D0 c2127d0 = c19024d.f60614B;
        C0205S1 c0205s1 = new C0205S1(c19024d, 8);
        this.f60709Y = 1;
        c2127d0.getClass();
        C2127D0.m3228m(c2127d0, c0205s1, this);
        return enumC19250a;
    }
}
