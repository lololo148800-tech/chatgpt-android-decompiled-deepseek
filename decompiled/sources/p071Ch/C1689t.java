package p071Ch;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ch.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C1689t extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f4782Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1692w f4783Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f4784o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1689t(C1692w c1692w, boolean z6, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f4783Z = c1692w;
        this.f4784o0 = z6;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C1689t(this.f4783Z, this.f4784o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1689t) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f4782Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f4782Y = 1;
            obj = C1692w.m2507a(this.f4783Z, this.f4784o0, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
