package p193Hf;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p758g0.AbstractC13758e;
import p758g0.C13756d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Hf.e1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3360e1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f10263Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3369h1 f10264Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f10265o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3360e1(C3369h1 c3369h1, float f10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10264Z = c3369h1;
        this.f10265o0 = f10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3360e1(this.f10264Z, this.f10265o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3360e1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objM15222c;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f10263Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f10263Y = 1;
            C3369h1 c3369h1 = this.f10264Z;
            C13756d c13756d = c3369h1.f10290a;
            float fFloatValue = ((Number) c13756d.f43413e.getValue()).floatValue();
            float f10 = this.f10265o0;
            if (fFloatValue == 0.0f) {
                objM15222c = c13756d.m15226g(new Float(f10), this);
                if (objM15222c != enumC19250a) {
                    objM15222c = c17296c;
                }
            } else {
                objM15222c = C13756d.m15222c(c3369h1.f10290a, new Float(f10), AbstractC13758e.m15254s(0.0f, 50.0f, null, 5), null, this, 12);
                if (objM15222c != enumC19250a) {
                    objM15222c = c17296c;
                }
            }
            if (objM15222c == enumC19250a) {
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
