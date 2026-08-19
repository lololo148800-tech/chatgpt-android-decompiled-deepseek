package p1071w0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p544W9.AbstractC8717t4;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: w0.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20756j0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f65885Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19723A f65886Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC20772r0 f65887o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20756j0(C19723A c19723a, InterfaceC20772r0 interfaceC20772r0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65886Z = c19723a;
        this.f65887o0 = interfaceC20772r0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20756j0(this.f65886Z, this.f65887o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20756j0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f65885Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f65885Y = 1;
            Object objM9428b = AbstractC8717t4.m9428b(this.f65886Z, new C20764n0(this.f65887o0, null), this);
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
