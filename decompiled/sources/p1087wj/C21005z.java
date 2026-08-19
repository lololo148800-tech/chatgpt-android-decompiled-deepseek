package p1087wj;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: wj.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C21005z extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f66852Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20970A f66853Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21005z(C20970A c20970a, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f66853Z = c20970a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C21005z(this.f66853Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C21005z) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f66852Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C20970A c20970a = this.f66853Z;
            InterfaceC20971B interfaceC20971B = c20970a.f66781c;
            String str = c20970a.f66782d;
            this.f66852Y = 1;
            obj = interfaceC20971B.m21461e(c20970a.f66780b, str, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
