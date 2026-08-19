package p273Kl;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2127D0;
import p1071w0.AbstractC20734X;
import p548Wd.p549VF.zakks;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.U0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4748U0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15467Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4750V0 f15468Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4748U0(C4750V0 c4750v0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15468Z = c4750v0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4748U0(this.f15468Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((C4748U0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15467Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException(zakks.GueqGUeCjeYc);
            }
            throw AbstractC20734X.m21252w(obj);
        }
        AbstractC9233X.m9807c(obj);
        C4750V0 c4750v0 = this.f15468Z;
        C2127D0 c2127d0 = c4750v0.f15492p;
        C4739P0 c4739p0 = new C4739P0(c4750v0, 1);
        this.f15467Y = 1;
        c2127d0.mo3141d(c4739p0, this);
        return enumC19250a;
    }
}
