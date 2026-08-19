package p1139z0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1068vo.C20659i;
import p1071w0.AbstractC20734X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: z0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C21621j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f68491Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21582E0 f68492Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20659i f68493o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21621j(C21582E0 c21582e0, C20659i c20659i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f68492Z = c21582e0;
        this.f68493o0 = c20659i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C21621j(this.f68492Z, this.f68493o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C21621j) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f68491Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC20734X.m21252w(obj);
        }
        AbstractC9233X.m9807c(obj);
        C21619i c21619i = new C21619i(this.f68493o0);
        this.f68491Y = 1;
        this.f68492Z.m21880b(c21619i, this);
        return enumC19250a;
    }
}
