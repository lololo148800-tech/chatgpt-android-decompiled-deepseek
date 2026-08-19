package p1044uj;

import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse$ClassificationFailedResponse;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse$IdAcceptedResponse;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse$IdRejectedResponse;
import java.util.Collections;
import p149Fj.C2867a;
import p149Fj.InterfaceC2868b;
import p248Jk.InterfaceC4473d;
import p680cj.C11761b;
import p680cj.C11763d;
import p769gj.InterfaceC14147A;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: uj.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C20360s implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64378a;

    public /* synthetic */ C20360s(int i10) {
        this.f64378a = i10;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f64378a) {
            case 0:
                return AbstractC17678l.m19293P(new InterfaceC14147A[]{C20356q.f64358c, C20368x.f64391b});
            default:
                C11763d c11763d = new C11763d(InterfaceC2868b.class, "responseType", Collections.emptyList(), Collections.emptyList(), null);
                return AbstractC17665J.m19268h(c11763d.m13055a(new C11761b(c11763d, C2867a.f8636Y)).m13056b(AutoClassifyResponse$IdAcceptedResponse.class, "id_accepted").m13056b(AutoClassifyResponse$ClassificationFailedResponse.class, "classification_failed").m13056b(AutoClassifyResponse$IdRejectedResponse.class, "id_rejected"));
        }
    }
}
