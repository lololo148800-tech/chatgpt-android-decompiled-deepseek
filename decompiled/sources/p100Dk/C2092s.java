package p100Dk;

import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.p689ui.network.AddressDetailsResponse;
import com.withpersona.sdk2.inquiry.p689ui.network.LocationData;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dk.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C2092s extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public NetworkCallResult.Success f6435Y;

    /* JADX INFO: renamed from: Z */
    public int f6436Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f6437o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2093t f6438p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2092s(C2093t c2093t, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f6438p0 = c2093t;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2092s c2092s = new C2092s(this.f6438p0, interfaceC18770c);
        c2092s.f6437o0 = obj;
        return c2092s;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2092s) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c3 A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2186j interfaceC2186j;
        Object objEnqueueRetriableRequestWithRetry;
        NetworkCallResult networkCallResult;
        InterfaceC2186j interfaceC2186j2;
        NetworkCallResult networkCallResult2;
        C2088o c2088o;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f6436Z;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC2186j = (InterfaceC2186j) this.f6437o0;
                AbstractC9233X.m9807c(obj);
                objEnqueueRetriableRequestWithRetry = obj;
            } else if (i10 == 2 || i10 == 3) {
                networkCallResult2 = this.f6435Y;
                interfaceC2186j2 = (InterfaceC2186j) this.f6437o0;
                AbstractC9233X.m9807c(obj);
                networkCallResult = networkCallResult2;
                interfaceC2186j = interfaceC2186j2;
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    c2088o = new C2088o(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                    this.f6437o0 = networkCallResult;
                    this.f6435Y = null;
                    this.f6436Z = 4;
                    if (interfaceC2186j.mo395a(c2088o, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        interfaceC2186j = (InterfaceC2186j) this.f6437o0;
        C2091r c2091r = new C2091r(this.f6438p0, null);
        this.f6437o0 = interfaceC2186j;
        this.f6436Z = 1;
        objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(c2091r, this);
        if (objEnqueueRetriableRequestWithRetry == enumC19250a) {
            return enumC19250a;
        }
        networkCallResult = (NetworkCallResult) objEnqueueRetriableRequestWithRetry;
        if (networkCallResult instanceof NetworkCallResult.Success) {
            AddressDetailsResponse addressDetailsResponse = (AddressDetailsResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
            LocationData locationData = addressDetailsResponse != null ? addressDetailsResponse.f41012a : null;
            if (locationData != null) {
                C2089p c2089p = new C2089p(locationData);
                this.f6437o0 = interfaceC2186j;
                this.f6435Y = (NetworkCallResult.Success) networkCallResult;
                this.f6436Z = 2;
                if (interfaceC2186j.mo395a(c2089p, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                C2088o c2088o2 = new C2088o(new InternalErrorInfo.NetworkErrorInfo(0, "Expected body attributes to be non-null.", false, null, 8, null));
                this.f6437o0 = interfaceC2186j;
                this.f6435Y = (NetworkCallResult.Success) networkCallResult;
                this.f6436Z = 3;
                if (interfaceC2186j.mo395a(c2088o2, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
            interfaceC2186j2 = interfaceC2186j;
            networkCallResult2 = networkCallResult;
            networkCallResult = networkCallResult2;
            interfaceC2186j = interfaceC2186j2;
            if (networkCallResult instanceof NetworkCallResult.Failure) {
                c2088o = new C2088o(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                this.f6437o0 = networkCallResult;
                this.f6435Y = null;
                this.f6436Z = 4;
                if (interfaceC2186j.mo395a(c2088o, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else if (networkCallResult instanceof NetworkCallResult.Failure) {
            c2088o = new C2088o(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
            this.f6437o0 = networkCallResult;
            this.f6435Y = null;
            this.f6436Z = 4;
            if (interfaceC2186j.mo395a(c2088o, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
