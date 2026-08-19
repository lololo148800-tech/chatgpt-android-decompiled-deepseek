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

/* JADX INFO: renamed from: wj.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C20988i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public NetworkCallResult.Success f66815Y;

    /* JADX INFO: renamed from: Z */
    public int f66816Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f66817o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C20989j f66818p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20988i(C20989j c20989j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f66818p0 = c20989j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C20988i c20988i = new C20988i(this.f66818p0, interfaceC18770c);
        c20988i.f66817o0 = obj;
        return c20988i;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20988i) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x008d A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2186j interfaceC2186j;
        NetworkCallResult networkCallResult;
        InterfaceC2186j interfaceC2186j2;
        NetworkCallResult networkCallResult2;
        C20984e c20984e;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f66816Z;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC2186j = (InterfaceC2186j) this.f66817o0;
                AbstractC9233X.m9807c(obj);
            } else if (i10 == 2) {
                networkCallResult2 = this.f66815Y;
                interfaceC2186j2 = (InterfaceC2186j) this.f66817o0;
                AbstractC9233X.m9807c(obj);
                networkCallResult = networkCallResult2;
                interfaceC2186j = interfaceC2186j2;
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    c20984e = new C20984e(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                    this.f66817o0 = networkCallResult;
                    this.f66815Y = null;
                    this.f66816Z = 3;
                    if (interfaceC2186j.mo395a(c20984e, this) == enumC19250a) {
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
        InterfaceC2186j interfaceC2186j3 = (InterfaceC2186j) this.f66817o0;
        C20987h c20987h = new C20987h(this.f66818p0, null);
        this.f66817o0 = interfaceC2186j3;
        this.f66816Z = 1;
        Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(c20987h, this);
        if (objEnqueueRetriableRequestWithRetry == enumC19250a) {
            return enumC19250a;
        }
        interfaceC2186j = interfaceC2186j3;
        obj = objEnqueueRetriableRequestWithRetry;
        networkCallResult = (NetworkCallResult) obj;
        if (networkCallResult instanceof NetworkCallResult.Success) {
            ((NetworkCallResult.Success) networkCallResult).getResponse();
            C20985f c20985f = C20985f.f66812a;
            this.f66817o0 = interfaceC2186j;
            this.f66815Y = (NetworkCallResult.Success) networkCallResult;
            this.f66816Z = 2;
            if (interfaceC2186j.mo395a(c20985f, this) == enumC19250a) {
                return enumC19250a;
            }
            interfaceC2186j2 = interfaceC2186j;
            networkCallResult2 = networkCallResult;
            networkCallResult = networkCallResult2;
            interfaceC2186j = interfaceC2186j2;
            if (networkCallResult instanceof NetworkCallResult.Failure) {
                c20984e = new C20984e(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                this.f66817o0 = networkCallResult;
                this.f66815Y = null;
                this.f66816Z = 3;
                if (interfaceC2186j.mo395a(c20984e, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else if (networkCallResult instanceof NetworkCallResult.Failure) {
            c20984e = new C20984e(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
            this.f66817o0 = networkCallResult;
            this.f66815Y = null;
            this.f66816Z = 3;
            if (interfaceC2186j.mo395a(c20984e, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
