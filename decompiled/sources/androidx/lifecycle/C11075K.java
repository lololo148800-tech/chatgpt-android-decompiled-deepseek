package androidx.lifecycle;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p275Kn.C4816c;
import p275Kn.InterfaceC4814a;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: androidx.lifecycle.K */
/* JADX INFO: loaded from: classes.dex */
public final class C11075K extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public InterfaceC4814a f33375Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC19694j f33376Z;

    /* JADX INFO: renamed from: o0 */
    public int f33377o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C4816c f33378p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC19694j f33379q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C11075K(C4816c c4816c, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f33378p0 = c4816c;
        this.f33379q0 = (AbstractC19694j) interfaceC1439n;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C11075K(this.f33378p0, this.f33379q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11075K) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [Bm.n] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C4816c c4816c;
        AbstractC19694j abstractC19694j;
        InterfaceC4814a interfaceC4814a;
        ?? r6;
        InterfaceC4814a interfaceC4814a2;
        Throwable th2;
        InterfaceC4814a interfaceC4814a3;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f33377o0;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                c4816c = this.f33378p0;
                this.f33375Y = c4816c;
                abstractC19694j = this.f33379q0;
                this.f33376Z = abstractC19694j;
                this.f33377o0 = 1;
                if (c4816c.m5448e(null, this) == enumC19250a) {
                    r6 = abstractC19694j;
                    interfaceC4814a = c4816c;
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC4814a2 = this.f33375Y;
                    try {
                        AbstractC9233X.m9807c(obj);
                        interfaceC4814a3 = interfaceC4814a2;
                        ((C4816c) interfaceC4814a3).m5450g(null);
                        return C17296C.f55119a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        ((C4816c) interfaceC4814a2).m5450g(null);
                        throw th2;
                    }
                }
                InterfaceC1439n interfaceC1439n = (InterfaceC1439n) this.f33376Z;
                InterfaceC4814a interfaceC4814a4 = this.f33375Y;
                AbstractC9233X.m9807c(obj);
                interfaceC4814a = interfaceC4814a4;
                r6 = interfaceC1439n;
            }
            r6 = abstractC19694j;
            interfaceC4814a = c4816c;
            C11074J c11074j = new C11074J(r6, null);
            this.f33375Y = interfaceC4814a;
            this.f33376Z = null;
            this.f33377o0 = 2;
            if (AbstractC0575H.m1183l(c11074j, this) == enumC19250a) {
                return enumC19250a;
            }
            interfaceC4814a3 = interfaceC4814a;
            ((C4816c) interfaceC4814a3).m5450g(null);
            return C17296C.f55119a;
        } catch (Throwable th4) {
            interfaceC4814a2 = interfaceC4814a;
            th2 = th4;
            ((C4816c) interfaceC4814a2).m5450g(null);
            throw th2;
        }
    }
}
