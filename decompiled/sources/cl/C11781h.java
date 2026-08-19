package cl;

import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.InterfaceC15088n;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p792hl.AbstractC14527b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: cl.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C11781h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f35722Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f35723Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC14527b f35724o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC19694j f35725p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C11781h(AbstractC14527b abstractC14527b, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35724o0 = abstractC14527b;
        this.f35725p0 = (AbstractC19694j) interfaceC1439n;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11781h c11781h = new C11781h(this.f35724o0, this.f35725p0, interfaceC18770c);
        c11781h.f35723Z = obj;
        return c11781h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11781h) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f35722Y;
        AbstractC14527b abstractC14527b = this.f35724o0;
        try {
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC9233X.m9807c(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(obj);
                    }
                    new Long(((Number) obj).longValue());
                    return C17296C.f55119a;
                }
                AbstractC9233X.m9807c(obj);
                InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f35723Z;
                ?? r6 = this.f35725p0;
                this.f35723Z = interfaceC0571F;
                this.f35722Y = 1;
                if (r6.invoke(abstractC14527b, this) == enumC19250a) {
                    return enumC19250a;
                }
            } catch (Throwable th2) {
                AbstractC9233X.m9806b(th2);
            }
        } catch (Throwable th3) {
            AbstractC9233X.m9806b(th3);
        }
        InterfaceC15088n interfaceC15088nMo7304c = abstractC14527b.mo7304c();
        if (!interfaceC15088nMo7304c.mo1141e()) {
            this.f35723Z = null;
            this.f35722Y = 2;
            obj = AbstractC15070F.m16178f(interfaceC15088nMo7304c, Long.MAX_VALUE, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            new Long(((Number) obj).longValue());
        }
        return C17296C.f55119a;
    }
}
