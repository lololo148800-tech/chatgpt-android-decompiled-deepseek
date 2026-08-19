package mh;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p228J.AbstractC3794B0;
import p324Mn.C5551u;
import p349O0.InterfaceC5985X;
import p523V9.AbstractC8128k6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: mh.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C17268p extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f55070Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C17274v f55071Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f55072o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17268p(C17274v c17274v, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f55071Z = c17274v;
        this.f55072o0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17268p(this.f55071Z, this.f55072o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C17268p) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        long jM8644j;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f55070Y;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        do {
            C5551u.Companion.getClass();
            long jM5946b = new C5551u(AbstractC3794B0.m4501z("instant(...)")).m5946b(this.f55071Z.f55081a);
            float f10 = AbstractC17270r.f55074a;
            this.f55072o0.setValue(new C21555b(jM5946b));
            jM8644j = AbstractC8128k6.m8644j(1, EnumC21557d.SECONDS);
            this.f55070Y = 1;
        } while (AbstractC0575H.m1185n(jM8644j, this) != enumC19250a);
        return enumC19250a;
    }
}
