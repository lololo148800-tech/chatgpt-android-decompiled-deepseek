package p842k0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p544W9.AbstractC8717t4;
import p571X9.AbstractC9233X;
import p749fd.C13628m;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: k0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C16295d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f50482Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f50483Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16305n f50484o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16295d(C16305n c16305n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f50484o0 = c16305n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16295d c16295d = new C16295d(this.f50484o0, interfaceC18770c);
        c16295d.f50483Z = obj;
        return c16295d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16295d) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f50482Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19723A c19723a = (C19723A) this.f50483Z;
            C13628m c13628m = new C13628m(this.f50484o0, 27);
            this.f50482Y = 1;
            Object objM9428b = AbstractC8717t4.m9428b(c19723a, new C16296e(c13628m, null), this);
            if (objM9428b != enumC19250a) {
                objM9428b = c17296c;
            }
            if (objM9428b == enumC19250a) {
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
