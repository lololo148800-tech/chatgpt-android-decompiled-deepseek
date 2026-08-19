package p126Ek;

import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.webrtc.networking.AuthorizeWebRtcResponse;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p1053v3.p1054lN.IGDwkYw;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ek.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C2573f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public NetworkCallResult.Success f8003Y;

    /* JADX INFO: renamed from: Z */
    public int f8004Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f8005o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2574g f8006p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2573f(C2574g c2574g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f8006p0 = c2574g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2573f c2573f = new C2573f(this.f8006p0, interfaceC18770c);
        c2573f.f8005o0 = obj;
        return c2573f;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2573f) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2186j interfaceC2186j;
        Object objEnqueueRetriableRequestWithRetry;
        NetworkCallResult networkCallResult;
        InterfaceC2186j interfaceC2186j2;
        NetworkCallResult networkCallResult2;
        C2569b c2569b;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f8004Z;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC2186j = (InterfaceC2186j) this.f8005o0;
                AbstractC9233X.m9807c(obj);
                objEnqueueRetriableRequestWithRetry = obj;
            } else if (i10 == 2 || i10 == 3) {
                networkCallResult2 = this.f8003Y;
                interfaceC2186j2 = (InterfaceC2186j) this.f8005o0;
                AbstractC9233X.m9807c(obj);
                networkCallResult = networkCallResult2;
                interfaceC2186j = interfaceC2186j2;
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    c2569b = new C2569b(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                    this.f8005o0 = networkCallResult;
                    this.f8003Y = null;
                    this.f8004Z = 4;
                    if (interfaceC2186j.mo395a(c2569b, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException(IGDwkYw.UppQwGNBCGzqoTq);
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        interfaceC2186j = (InterfaceC2186j) this.f8005o0;
        C2572e c2572e = new C2572e(this.f8006p0, null);
        this.f8005o0 = interfaceC2186j;
        this.f8004Z = 1;
        objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(c2572e, this);
        if (objEnqueueRetriableRequestWithRetry == enumC19250a) {
            return enumC19250a;
        }
        networkCallResult = (NetworkCallResult) objEnqueueRetriableRequestWithRetry;
        if (networkCallResult instanceof NetworkCallResult.Success) {
            if (((AuthorizeWebRtcResponse) ((NetworkCallResult.Success) networkCallResult).getResponse()) != null) {
                C2570c c2570c = new C2570c();
                this.f8005o0 = interfaceC2186j;
                this.f8003Y = (NetworkCallResult.Success) networkCallResult;
                this.f8004Z = 2;
                if (interfaceC2186j.mo395a(c2570c, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                C2569b c2569b2 = new C2569b(new InternalErrorInfo.NetworkErrorInfo(0, "Expected body to be non-null.", false, null, 8, null));
                this.f8005o0 = interfaceC2186j;
                this.f8003Y = (NetworkCallResult.Success) networkCallResult;
                this.f8004Z = 3;
                if (interfaceC2186j.mo395a(c2569b2, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
            interfaceC2186j2 = interfaceC2186j;
            networkCallResult2 = networkCallResult;
            networkCallResult = networkCallResult2;
            interfaceC2186j = interfaceC2186j2;
            if (networkCallResult instanceof NetworkCallResult.Failure) {
                c2569b = new C2569b(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                this.f8005o0 = networkCallResult;
                this.f8003Y = null;
                this.f8004Z = 4;
                if (interfaceC2186j.mo395a(c2569b, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else if (networkCallResult instanceof NetworkCallResult.Failure) {
            c2569b = new C2569b(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
            this.f8005o0 = networkCallResult;
            this.f8003Y = null;
            this.f8004Z = 4;
            if (interfaceC2186j.mo395a(c2569b, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
