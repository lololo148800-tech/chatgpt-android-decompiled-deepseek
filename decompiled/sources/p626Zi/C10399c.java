package p626Zi;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p530Vi.C8308d;
import p530Vi.C8312h;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Zi.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C10399c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f30815Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f30816Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C10400d f30817o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C8312h f30818p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10399c(C10400d c10400d, C8312h c8312h, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f30817o0 = c10400d;
        this.f30818p0 = c8312h;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C10399c c10399c = new C10399c(this.f30817o0, this.f30818p0, interfaceC18770c);
        c10399c.f30816Z = obj;
        return c10399c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C10399c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0571F interfaceC0571F;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f30815Y;
        C10400d c10400d = this.f30817o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F2 = (InterfaceC0571F) this.f30816Z;
            if (c10400d.f30819a > 0) {
                interfaceC0571F = interfaceC0571F2;
            }
            return C17296C.f55119a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        interfaceC0571F = (InterfaceC0571F) this.f30816Z;
        AbstractC9233X.m9807c(obj);
        while (AbstractC0575H.m1196y(interfaceC0571F)) {
            this.f30818p0.m8933c().m9555b(C8308d.f25889Y);
            long j10 = c10400d.f30819a;
            this.f30816Z = interfaceC0571F;
            this.f30815Y = 1;
            if (AbstractC0575H.m1184m(j10, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
