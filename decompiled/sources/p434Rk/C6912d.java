package p434Rk;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1009s9.C19501d;
import p1113xn.AbstractC21323q;
import p225Im.InterfaceC3756d;
import p544W9.AbstractC8565U2;
import p792hl.AbstractC14527b;
import p857kl.AbstractC16435B;
import p857kl.InterfaceC16476x;

/* JADX INFO: renamed from: Rk.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C6912d extends UnsupportedOperationException {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22167Y = 0;

    /* JADX INFO: renamed from: Z */
    public final Object f22168Z;

    public C6912d(C19501d c19501d) {
        this.f22168Z = c19501d;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        switch (this.f22167Y) {
            case 0:
                return (String) this.f22168Z;
            default:
                return "Missing ".concat(String.valueOf((C19501d) this.f22168Z));
        }
    }

    public C6912d(AbstractC14527b abstractC14527b, InterfaceC3756d from, InterfaceC3756d to2) {
        AbstractC16544l.m18094g(from, "from");
        AbstractC16544l.m18094g(to2, "to");
        StringBuilder sb2 = new StringBuilder("\n        Expected response body of the type '");
        sb2.append(to2);
        sb2.append("' but was '");
        sb2.append(from);
        sb2.append("'\n        In response from `");
        sb2.append(AbstractC8565U2.m9230e(abstractC14527b).mo7300S());
        sb2.append("`\n        Response status `");
        sb2.append(abstractC14527b.mo7307f());
        sb2.append("`\n        Response header `ContentType: ");
        InterfaceC16476x interfaceC16476xMo7301a = abstractC14527b.mo7301a();
        List list = AbstractC16435B.f50983a;
        sb2.append(interfaceC16476xMo7301a.mo7982g(SIPHeaderNames.CONTENT_TYPE));
        sb2.append("` \n        Request header `Accept: ");
        sb2.append(AbstractC8565U2.m9230e(abstractC14527b).mo7301a().mo7982g(SIPHeaderNames.ACCEPT));
        sb2.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.f22168Z = AbstractC21323q.m21717d(sb2.toString());
    }
}
