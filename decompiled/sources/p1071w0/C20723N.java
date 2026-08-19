package p1071w0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p080D0.C1837w0;
import p1014t1.C19723A;
import p571X9.AbstractC9233X;
import p860l0.AbstractC16689K1;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: w0.N */
/* JADX INFO: loaded from: classes.dex */
public final class C20723N extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f65702Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19723A f65703Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1837w0 f65704o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20723N(C19723A c19723a, C1837w0 c1837w0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65703Z = c19723a;
        this.f65704o0 = c1837w0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20723N(this.f65703Z, this.f65704o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20723N) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f65702Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C20787z c20787z = new C20787z(this.f65704o0, 1);
            this.f65702Y = 1;
            if (AbstractC16689K1.m18508e(this.f65703Z, null, null, c20787z, this, 7) == enumC19250a) {
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
