package p270Ki;

import mm.C17296C;
import p017Af.C0485p;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p127El.C2577c;
import p544W9.AbstractC8717t4;
import p571X9.AbstractC9233X;
import p860l0.C16692L1;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ki.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C4703d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15290Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f15291Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2577c f15292o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4703d(C2577c c2577c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15292o0 = c2577c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4703d c4703d = new C4703d(this.f15292o0, interfaceC18770c);
        c4703d.f15291Z = obj;
        return c4703d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4703d) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15290Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19723A c19723a = (C19723A) this.f15291Z;
            C0485p c0485p = new C0485p(this.f15292o0, 4);
            this.f15290Y = 1;
            Object objM9428b = AbstractC8717t4.m9428b(c19723a, new C16692L1(false, c0485p, null), this);
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
