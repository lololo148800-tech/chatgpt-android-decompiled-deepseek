package p100Dk;

import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.p689ui.network.AddressAutocompleteRequest;
import com.withpersona.sdk2.inquiry.steps.p688ui.network.AddressAutocompleteResponse;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1027tp.C20048M;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p909nm.C17689w;
import p972qm.InterfaceC18770c;
import p994rk.InterfaceC19201o2;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dk.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C2086m extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f6424Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f6425Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2087n f6426o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2086m(C2087n c2087n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f6426o0 = c2087n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2086m c2086m = new C2086m(this.f6426o0, interfaceC18770c);
        c2086m.f6425Z = obj;
        return c2086m;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2086m) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Exception {
        InterfaceC2186j interfaceC2186j;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f6424Y;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC2186j = (InterfaceC2186j) this.f6425Z;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2 && i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        interfaceC2186j = (InterfaceC2186j) this.f6425Z;
        C2087n c2087n = this.f6426o0;
        InterfaceC2094u interfaceC2094u = c2087n.f6430e;
        InterfaceC19201o2 fromComponent = c2087n.f6428c;
        AbstractC16544l.m18094g(fromComponent, "fromComponent");
        String searchInput = c2087n.f6429d;
        AbstractC16544l.m18094g(searchInput, "searchInput");
        AddressAutocompleteRequest addressAutocompleteRequest = new AddressAutocompleteRequest(new AddressAutocompleteRequest.Meta(fromComponent.getName(), searchInput));
        this.f6425Z = interfaceC2186j;
        this.f6424Y = 1;
        obj = interfaceC2094u.m3181d(c2087n.f6427b, addressAutocompleteRequest, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        C20048M c20048m = (C20048M) obj;
        if (c20048m.f63525a.m18985a()) {
            AddressAutocompleteResponse addressAutocompleteResponse = (AddressAutocompleteResponse) c20048m.f63526b;
            C2084k c2084k = new C2084k(addressAutocompleteResponse != null ? addressAutocompleteResponse.f40986a.f40989a : C17689w.f56480Y);
            this.f6425Z = null;
            this.f6424Y = 3;
            if (interfaceC2186j.mo395a(c2084k, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            InternalErrorInfo.NetworkErrorInfo cause = NetworkUtilsKt.toErrorInfo(c20048m);
            AbstractC16544l.m18094g(cause, "cause");
            C2083j c2083j = new C2083j();
            this.f6425Z = null;
            this.f6424Y = 2;
            if (interfaceC2186j.mo395a(c2083j, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
