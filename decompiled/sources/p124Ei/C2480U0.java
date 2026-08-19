package p124Ei;

import mm.C17296C;
import p021Aj.C0537v;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p059C5.C1592j;
import p1014t1.C19723A;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p860l0.AbstractC16689K1;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ei.U0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2480U0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f7726Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f7727Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f7728o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f7729p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2480U0(InterfaceC1436k interfaceC1436k, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7728o0 = interfaceC5985X;
        this.f7729p0 = interfaceC1436k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2480U0 c2480u0 = new C2480U0(this.f7729p0, this.f7728o0, interfaceC18770c);
        c2480u0.f7727Z = obj;
        return c2480u0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2480U0) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f7726Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19723A c19723a = (C19723A) this.f7727Z;
            InterfaceC5985X interfaceC5985X = this.f7728o0;
            InterfaceC1436k interfaceC1436k = this.f7729p0;
            C2478T0 c2478t0 = new C2478T0(interfaceC5985X, interfaceC1436k, 0);
            C1592j c1592j = new C1592j(interfaceC5985X, interfaceC1436k, null, 5);
            C0537v c0537v = new C0537v(3, interfaceC1436k);
            this.f7726Y = 1;
            if (AbstractC16689K1.m18508e(c19723a, c2478t0, c1592j, c0537v, this, 1) == enumC19250a) {
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
