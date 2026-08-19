package p041Be;

import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import io.ktor.utils.p815io.InterfaceC15088n;
import java.io.IOException;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p1126yd.C21407B;
import p117Eb.C2391u;
import p544W9.AbstractC8565U2;
import p571X9.AbstractC9233X;
import p792hl.AbstractC14527b;
import p812ii.C15006f;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Be.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C1215H extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f3199Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f3200Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2186j f3201o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1215H(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f3201o0 = interfaceC2186j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1215H c1215h = new C1215H(this.f3201o0, interfaceC18770c);
        c1215h.f3200Z = obj;
        return c1215h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1215H) create((AbstractC14527b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0089  */
    /* JADX WARN: Code duplicated, block: B:25:0x008c A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws IOException {
        AbstractC14527b abstractC14527b;
        Object objM3509F;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f3199Y;
        C17296C c17296c = C17296C.f55119a;
        InterfaceC2186j interfaceC2186j = this.f3201o0;
        if (i10 != 0) {
            if (i10 == 1) {
                abstractC14527b = (AbstractC14527b) this.f3200Z;
                AbstractC9233X.m9807c(obj);
            } else if (i10 == 2) {
                AbstractC9233X.m9807c(obj);
                C2391u c2391u = new C2391u(2, false);
                c2391u.f7430o0 = EnumC1227U.f3234Y;
                c2391u.f7431p0 = new C15006f(null, null, null, null, null);
                c2391u.f7432q0 = C17690x.f56481Y;
                this.f3199Y = 3;
                objM3509F = c2391u.m3509F(interfaceC2186j, (InterfaceC15088n) obj, this);
                if (objM3509F != enumC19250a) {
                    objM3509F = c17296c;
                }
                if (objM3509F == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        abstractC14527b = (AbstractC14527b) this.f3200Z;
        String strMo7982g = abstractC14527b.mo7301a().mo7982g("cf-ray");
        if (strMo7982g != null) {
            C21407B c21407b = new C21407B(AbstractC0168G.m535x(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, strMo7982g));
            this.f3200Z = abstractC14527b;
            this.f3199Y = 1;
            if (interfaceC2186j.mo395a(c21407b, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        this.f3200Z = null;
        this.f3199Y = 2;
        obj = AbstractC8565U2.m9226a(abstractC14527b, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        C2391u c2391u2 = new C2391u(2, false);
        c2391u2.f7430o0 = EnumC1227U.f3234Y;
        c2391u2.f7431p0 = new C15006f(null, null, null, null, null);
        c2391u2.f7432q0 = C17690x.f56481Y;
        this.f3199Y = 3;
        objM3509F = c2391u2.m3509F(interfaceC2186j, (InterfaceC15088n) obj, this);
        if (objM3509F != enumC19250a) {
            objM3509F = c17296c;
        }
        if (objM3509F == enumC19250a) {
            return enumC19250a;
        }
        return c17296c;
    }
}
