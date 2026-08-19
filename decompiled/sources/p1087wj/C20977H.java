package p1087wj;

import com.withpersona.sdk2.inquiry.network.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: wj.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C20977H extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public NetworkCallResult.Success f66789Y;

    /* JADX INFO: renamed from: Z */
    public int f66790Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f66791o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C20978I f66792p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20977H(C20978I c20978i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f66792p0 = c20978i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C20977H c20977h = new C20977H(this.f66792p0, interfaceC18770c);
        c20977h.f66791o0 = obj;
        return c20977h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20977H) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0083  */
    /* JADX WARN: Code duplicated, block: B:27:0x009b A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2186j interfaceC2186j;
        NetworkCallResult networkCallResult;
        InterfaceC2186j interfaceC2186j2;
        NetworkCallResult networkCallResult2;
        C20973D c20973d;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f66790Z;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC2186j = (InterfaceC2186j) this.f66791o0;
                AbstractC9233X.m9807c(obj);
            } else if (i10 == 2) {
                networkCallResult2 = this.f66789Y;
                interfaceC2186j2 = (InterfaceC2186j) this.f66791o0;
                AbstractC9233X.m9807c(obj);
                networkCallResult = networkCallResult2;
                interfaceC2186j = interfaceC2186j2;
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    c20973d = new C20973D(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                    this.f66791o0 = networkCallResult;
                    this.f66789Y = null;
                    this.f66790Z = 3;
                    if (interfaceC2186j.mo395a(c20973d, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        InterfaceC2186j interfaceC2186j3 = (InterfaceC2186j) this.f66791o0;
        C20978I c20978i = this.f66792p0;
        c20978i.f66799h.mo15507b(new C20972C(c20978i.f66796e, c20978i.f66800i));
        C20976G c20976g = new C20976G(c20978i, null);
        this.f66791o0 = interfaceC2186j3;
        this.f66790Z = 1;
        Object objEnqueueVerificationRequestWithRetry = NetworkUtilsKt.enqueueVerificationRequestWithRetry(c20976g, this);
        if (objEnqueueVerificationRequestWithRetry == enumC19250a) {
            return enumC19250a;
        }
        interfaceC2186j = interfaceC2186j3;
        obj = objEnqueueVerificationRequestWithRetry;
        networkCallResult = (NetworkCallResult) obj;
        if (networkCallResult instanceof NetworkCallResult.Success) {
            ((NetworkCallResult.Success) networkCallResult).getResponse();
            C20974E c20974e = C20974E.f66786a;
            this.f66791o0 = interfaceC2186j;
            this.f66789Y = (NetworkCallResult.Success) networkCallResult;
            this.f66790Z = 2;
            if (interfaceC2186j.mo395a(c20974e, this) == enumC19250a) {
                return enumC19250a;
            }
            interfaceC2186j2 = interfaceC2186j;
            networkCallResult2 = networkCallResult;
            networkCallResult = networkCallResult2;
            interfaceC2186j = interfaceC2186j2;
            if (networkCallResult instanceof NetworkCallResult.Failure) {
                c20973d = new C20973D(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                this.f66791o0 = networkCallResult;
                this.f66789Y = null;
                this.f66790Z = 3;
                if (interfaceC2186j.mo395a(c20973d, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else if (networkCallResult instanceof NetworkCallResult.Failure) {
            c20973d = new C20973D(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
            this.f66791o0 = networkCallResult;
            this.f66789Y = null;
            this.f66790Z = 3;
            if (interfaceC2186j.mo395a(c20973d, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
