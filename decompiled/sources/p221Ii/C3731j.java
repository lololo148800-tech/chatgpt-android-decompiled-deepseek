package p221Ii;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.InterfaceC2184i;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ii.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C3731j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f11329Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2184i f11330Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3734m f11331o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3731j(InterfaceC2184i interfaceC2184i, C3734m c3734m, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f11330Z = interfaceC2184i;
        this.f11331o0 = c3734m;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3731j(this.f11330Z, this.f11331o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3731j) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f11329Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C3730i c3730i = new C3730i(this.f11331o0, null);
            this.f11329Y = 1;
            if (AbstractC2124C.m3212k(this.f11330Z, c3730i, this) == enumC19250a) {
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
