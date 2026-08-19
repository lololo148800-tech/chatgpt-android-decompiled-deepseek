package p556Wk;

import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.C15074J;
import io.ktor.utils.p815io.InterfaceC15066B;
import io.ktor.utils.p815io.InterfaceC15088n;
import java.util.concurrent.CancellationException;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p792hl.AbstractC14527b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wk.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C8932n extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f27314Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f27315Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f27316o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC14527b f27317p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8932n(Object obj, AbstractC14527b abstractC14527b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f27316o0 = obj;
        this.f27317p0 = abstractC14527b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C8932n c8932n = new C8932n(this.f27316o0, this.f27317p0, interfaceC18770c);
        c8932n.f27315Z = obj;
        return c8932n;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8932n) create((C15074J) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f27314Y;
        AbstractC14527b abstractC14527b = this.f27317p0;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C15074J c15074j = (C15074J) this.f27315Z;
                InterfaceC15088n interfaceC15088n = (InterfaceC15088n) this.f27316o0;
                InterfaceC15066B interfaceC15066B = c15074j.f46837Y;
                this.f27314Y = 1;
                obj = AbstractC15070F.m16176d(interfaceC15088n, interfaceC15066B, Long.MAX_VALUE, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            ((Number) obj).longValue();
            return C17296C.f55119a;
        } catch (CancellationException e10) {
            AbstractC0575H.m1180i(abstractC14527b, e10);
            throw e10;
        } catch (Throwable th2) {
            AbstractC0575H.m1180i(abstractC14527b, AbstractC0575H.m1172a("Receive failed", th2));
            throw th2;
        }
    }
}
