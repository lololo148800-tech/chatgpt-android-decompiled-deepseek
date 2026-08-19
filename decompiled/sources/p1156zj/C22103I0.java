package p1156zj;

import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p1071w0.C20720L0;
import p149Fj.AbstractC2887u;
import p149Fj.C2884r;
import p149Fj.C2885s;
import p149Fj.C2886t;
import p404Qe.C6665a;
import p523V9.AbstractC8215v5;
import p729ej.C13421l;

/* JADX INFO: renamed from: zj.I0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22103I0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C22107K0 f69866Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13421l f69867Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22103I0(C22107K0 c22107k0, C13421l c13421l) {
        super(1);
        this.f69866Y = c22107k0;
        this.f69867Z = c13421l;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        String string;
        AbstractC2887u it = (AbstractC2887u) obj;
        AbstractC16544l.m18094g(it, "it");
        boolean z6 = it instanceof C2886t;
        C13421l c13421l = this.f69867Z;
        C22107K0 c22107k0 = this.f69866Y;
        if (z6) {
            return AbstractC8215v5.m8839a(c22107k0, new C20720L0(c22107k0, 4, c13421l));
        }
        if (!(it instanceof C2885s)) {
            if (it instanceof C2884r) {
                return AbstractC8215v5.m8839a(c22107k0, new C22101H0(it, c22107k0, c13421l));
            }
            throw new C0644w();
        }
        GenericFileUploadErrorResponse.DocumentErrorResponse documentErrorResponse = ((C2885s) it).f8676a;
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) {
            string = c22107k0.f69875a.getString(R.string.pi2_governmentid_error_min_dimension_size, Integer.valueOf(((GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) documentErrorResponse).getDetails().getMinDimensionSize()));
            AbstractC16544l.m18093f(string, "getString(...)");
        } else {
            string = c22107k0.f69875a.getString(R.string.pi2_governmentid_error_unable_to_upload_file);
            AbstractC16544l.m18093f(string, "getString(...)");
        }
        return AbstractC8215v5.m8839a(c22107k0, new C6665a(string, 19));
    }
}
