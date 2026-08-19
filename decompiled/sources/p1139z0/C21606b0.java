package p1139z0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: z0.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21606b0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f68432Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ int f68433Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21612e0 f68434o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21606b0(C21612e0 c21612e0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f68434o0 = c21612e0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C21606b0 c21606b0 = new C21606b0(this.f68434o0, interfaceC18770c);
        c21606b0.f68433Z = ((Number) obj).intValue();
        return c21606b0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C21606b0) create(Integer.valueOf(((Number) obj).intValue()), (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f68432Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            if (Math.abs(this.f68433Z) == 1) {
                C21575B c21575b = this.f68434o0.f68465K0;
                this.f68432Y = 1;
                c21575b.getClass();
                Object objM1183l = AbstractC0575H.m1183l(new C21573A(c21575b, null), this);
                if (objM1183l != enumC19250a) {
                    objM1183l = c17296c;
                }
                if (objM1183l == enumC19250a) {
                    return enumC19250a;
                }
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
