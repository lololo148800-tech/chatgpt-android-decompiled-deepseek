package p946pc;

import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p124Ei.C2478T0;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sc.AbstractC19529k;
import sc.C19527i;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: pc.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C18316A extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f58455Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f58456Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f58457o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f58458p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1436k f58459q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18316A(InterfaceC1436k interfaceC1436k, InterfaceC5985X interfaceC5985X, InterfaceC1436k interfaceC1436k2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f58457o0 = interfaceC1436k;
        this.f58458p0 = interfaceC5985X;
        this.f58459q0 = interfaceC1436k2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C18316A c18316a = new C18316A(this.f58457o0, this.f58458p0, this.f58459q0, interfaceC18770c);
        c18316a.f58456Z = obj;
        return c18316a;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18316A) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f58455Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19723A c19723a = (C19723A) this.f58456Z;
            C2478T0 c2478t0 = new C2478T0(this.f58458p0, this.f58459q0, 5);
            this.f58455Y = 1;
            Object objM1183l = AbstractC0575H.m1183l(new C19527i(c19723a, this.f58457o0, AbstractC19529k.f62040a, null, null, c2478t0, null), this);
            if (objM1183l != enumC19250a) {
                objM1183l = c17296c;
            }
            if (objM1183l == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
