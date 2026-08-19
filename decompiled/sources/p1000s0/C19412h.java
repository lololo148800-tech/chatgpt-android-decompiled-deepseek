package p1000s0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p544W9.AbstractC8717t4;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: s0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C19412h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f61515Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19723A f61516Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19408d f61517o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19412h(C19723A c19723a, C19408d c19408d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f61516Z = c19723a;
        this.f61517o0 = c19408d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19412h(this.f61516Z, this.f61517o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19412h) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f61515Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19411g c19411g = new C19411g(this.f61517o0, null);
            this.f61515Y = 1;
            if (AbstractC8717t4.m9428b(this.f61516Z, c19411g, this) == enumC19250a) {
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
