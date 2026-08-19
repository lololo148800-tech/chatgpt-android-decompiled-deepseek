package p149Fj;

import ac.C10539a;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse$ClassificationFailedResponse;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse$IdAcceptedResponse;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse$IdRejectedResponse;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.government_id.C12893Id;
import ec.C13363e;
import ec.InterfaceC13364f;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17314q;
import mo.C17352s;
import mo.C17359z;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p1113xn.AbstractC21329w;
import p1156zj.AbstractC22200v;
import p1156zj.C22130W0;
import p1156zj.C22205x;
import p1156zj.InterfaceC22096F;
import p523V9.AbstractC7854B5;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9282f0;
import p571X9.AbstractC9294h0;
import p571X9.AbstractC9393x3;
import p604Yk.C10077b;
import p746fa.C13606o;
import p748fc.C13609a;
import p856kk.C16433a;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Fj.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C2877k extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public NetworkCallResult.Success f8645Y;

    /* JADX INFO: renamed from: Z */
    public int f8646Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f8647o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2878l f8648p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2877k(C2878l c2878l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f8648p0 = c2878l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2877k c2877k = new C2877k(this.f8648p0, interfaceC18770c);
        c2877k.f8647o0 = obj;
        return c2877k;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2877k) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0162  */
    /* JADX WARN: Code duplicated, block: B:32:0x016f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0173  */
    /* JADX WARN: Code duplicated, block: B:36:0x0181  */
    /* JADX WARN: Code duplicated, block: B:38:0x019a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:43:0x01ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:46:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:48:0x01e0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:51:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0207 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0208  */
    /* JADX WARN: Code duplicated, block: B:56:0x0210  */
    /* JADX WARN: Code duplicated, block: B:58:0x022a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x022b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0245 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x024a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0264 A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2186j interfaceC2186j;
        Object objEnqueueVerificationRequestWithRetry;
        String str;
        NetworkCallResult networkCallResult;
        InterfaceC2868b interfaceC2868b;
        C2873g c2873g;
        NetworkCallResult networkCallResult2;
        InterfaceC2186j interfaceC2186j2;
        C2873g c2873g2;
        C2874h c2874h;
        C2874h c2874h2;
        String str2;
        C22130W0 c22130w0M22400b;
        C2874h c2874h3;
        C2873g c2873g3;
        C2873g c2873g4;
        int i10 = 0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = this.f8646Z;
        C2878l c2878l = this.f8648p0;
        switch (i11) {
            case 0:
                AbstractC9233X.m9807c(obj);
                interfaceC2186j = (InterfaceC2186j) this.f8647o0;
                ArrayList arrayListM19384m = AbstractC17681o.m19384m(AbstractC9294h0.m9874c("data[id]", c2878l.f8650c), AbstractC9294h0.m9874c("data[type]", ReferencesHeader.INQUIRY), AbstractC9294h0.m9874c("meta[from_component]", c2878l.f8652e), AbstractC9294h0.m9874c("meta[from_step]", c2878l.f8651d));
                InterfaceC22096F interfaceC22096F = c2878l.f8654g;
                for (C22205x c22205x : interfaceC22096F.mo22349j0()) {
                    if (AbstractC21329w.m21734u(c22205x.f70394Z, "image/", false)) {
                        File file = new File(c22205x.f70393Y);
                        c2878l.f8655h.getClass();
                        C16433a.m18019a(file);
                    }
                }
                arrayListM19384m.addAll(AbstractC9393x3.m9974d(AbstractC9294h0.m9874c("data[attributes][files][][capture_method]", interfaceC22096F.mo22348P().toString())));
                C22205x c22205x2 = (C22205x) AbstractC17680n.m19341Q(interfaceC22096F.mo22349j0());
                String name = new File(c22205x2.f70393Y).getName();
                String imagePath = c22205x2.f70393Y;
                File file2 = new File(imagePath);
                Pattern pattern = C17352s.f55296e;
                arrayListM19384m.add(AbstractC9294h0.m9875d("data[attributes][image]", name, new C17359z(AbstractC9282f0.m9858d(c22205x2.f70394Z), file2, i10)));
                if (c2878l.f8658k) {
                    C10077b c10077b = c2878l.f8659l;
                    c10077b.getClass();
                    AbstractC16544l.m18094g(imagePath, "imagePath");
                    try {
                        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(imagePath);
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        C10539a c10539a = new C10539a(bitmapDecodeFile, 0);
                        C10539a.m10979c(-1, 1, jElapsedRealtime, bitmapDecodeFile.getHeight(), bitmapDecodeFile.getWidth(), bitmapDecodeFile.getAllocationByteCount(), 0);
                        C13606o c13606oM12770k = ((C13609a) ((InterfaceC13364f) ((C17314q) c10077b.f29833Z).getValue())).m12770k(c10539a);
                        AbstractC16544l.m18093f(c13606oM12770k, "process(...)");
                        try {
                            AbstractC7854B5.m8113a(c13606oM12770k);
                            break;
                        } catch (ExecutionException unused) {
                        }
                        str = ((C13363e) c13606oM12770k.m15130i()).f42404b;
                    } catch (Exception unused2) {
                        str = null;
                    }
                    if (str != null) {
                        arrayListM19384m.add(AbstractC9294h0.m9874c("data[attributes][client_extracted_text]", str));
                    }
                    break;
                }
                C2876j c2876j = new C2876j(c2878l, arrayListM19384m, null);
                this.f8647o0 = interfaceC2186j;
                this.f8646Z = 1;
                objEnqueueVerificationRequestWithRetry = NetworkUtilsKt.enqueueVerificationRequestWithRetry(c2876j, this);
                if (objEnqueueVerificationRequestWithRetry == enumC19250a) {
                    return enumC19250a;
                }
                networkCallResult = (NetworkCallResult) objEnqueueVerificationRequestWithRetry;
                if (networkCallResult instanceof NetworkCallResult.Success) {
                    interfaceC2868b = (InterfaceC2868b) ((NetworkCallResult.Success) networkCallResult).getResponse();
                    if (interfaceC2868b != null) {
                        c2873g = new C2873g(new InternalErrorInfo.UnknownErrorInfo("Unexpected network response."));
                        this.f8647o0 = interfaceC2186j;
                        this.f8645Y = (NetworkCallResult.Success) networkCallResult;
                        this.f8646Z = 7;
                        if (interfaceC2186j.mo395a(c2873g, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    } else if (interfaceC2868b instanceof AutoClassifyResponse$IdAcceptedResponse) {
                        AutoClassifyResponse$IdAcceptedResponse autoClassifyResponse$IdAcceptedResponse = (AutoClassifyResponse$IdAcceptedResponse) interfaceC2868b;
                        long j10 = c2878l.f8657j;
                        C12893Id c12893Id = autoClassifyResponse$IdAcceptedResponse.f40622o0;
                        str2 = autoClassifyResponse$IdAcceptedResponse.f40620Y;
                        c22130w0M22400b = AbstractC22200v.m22400b(c12893Id, str2, j10);
                        if (c22130w0M22400b == null) {
                            c2873g3 = new C2873g(new InternalErrorInfo.UnknownErrorInfo("Unexpected network response."));
                            this.f8647o0 = interfaceC2186j;
                            this.f8645Y = (NetworkCallResult.Success) networkCallResult;
                            this.f8646Z = 2;
                            if (interfaceC2186j.mo395a(c2873g3, this) == enumC19250a) {
                                return enumC19250a;
                            }
                        } else {
                            c2874h3 = new C2874h(new C2869c(str2, c22130w0M22400b));
                            this.f8647o0 = interfaceC2186j;
                            this.f8645Y = (NetworkCallResult.Success) networkCallResult;
                            this.f8646Z = 3;
                            if (interfaceC2186j.mo395a(c2874h3, this) == enumC19250a) {
                                return enumC19250a;
                            }
                        }
                    } else if (interfaceC2868b instanceof AutoClassifyResponse$ClassificationFailedResponse) {
                        c2874h2 = new C2874h(new C2871e(C2878l.m3718b(c2878l, ((AutoClassifyResponse$ClassificationFailedResponse) interfaceC2868b).f40619Y)));
                        this.f8647o0 = interfaceC2186j;
                        this.f8645Y = (NetworkCallResult.Success) networkCallResult;
                        this.f8646Z = 4;
                        if (interfaceC2186j.mo395a(c2874h2, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    } else {
                        if (interfaceC2868b instanceof AutoClassifyResponse$IdRejectedResponse) {
                            if (interfaceC2868b.equals(C2867a.f8636Y)) {
                                c2873g2 = new C2873g(new InternalErrorInfo.UnknownErrorInfo("Unexpected network response."));
                                this.f8647o0 = interfaceC2186j;
                                this.f8645Y = (NetworkCallResult.Success) networkCallResult;
                                this.f8646Z = 6;
                                if (interfaceC2186j.mo395a(c2873g2, this) == enumC19250a) {
                                    return enumC19250a;
                                }
                            }
                            return C17296C.f55119a;
                        }
                        c2874h = new C2874h(new C2870d(C2878l.m3718b(c2878l, ((AutoClassifyResponse$IdRejectedResponse) interfaceC2868b).f40626Y)));
                        this.f8647o0 = interfaceC2186j;
                        this.f8645Y = (NetworkCallResult.Success) networkCallResult;
                        this.f8646Z = 5;
                        if (interfaceC2186j.mo395a(c2874h, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                    networkCallResult2 = networkCallResult;
                    interfaceC2186j2 = interfaceC2186j;
                    networkCallResult = networkCallResult2;
                    interfaceC2186j = interfaceC2186j2;
                }
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    c2873g4 = new C2873g(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                    this.f8647o0 = networkCallResult;
                    this.f8645Y = null;
                    this.f8646Z = 8;
                    if (interfaceC2186j.mo395a(c2873g4, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
                return C17296C.f55119a;
            case 1:
                InterfaceC2186j interfaceC2186j3 = (InterfaceC2186j) this.f8647o0;
                AbstractC9233X.m9807c(obj);
                interfaceC2186j = interfaceC2186j3;
                objEnqueueVerificationRequestWithRetry = obj;
                networkCallResult = (NetworkCallResult) objEnqueueVerificationRequestWithRetry;
                if (networkCallResult instanceof NetworkCallResult.Success) {
                    interfaceC2868b = (InterfaceC2868b) ((NetworkCallResult.Success) networkCallResult).getResponse();
                    if (interfaceC2868b != null) {
                        c2873g = new C2873g(new InternalErrorInfo.UnknownErrorInfo("Unexpected network response."));
                        this.f8647o0 = interfaceC2186j;
                        this.f8645Y = (NetworkCallResult.Success) networkCallResult;
                        this.f8646Z = 7;
                        if (interfaceC2186j.mo395a(c2873g, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    } else if (interfaceC2868b instanceof AutoClassifyResponse$IdAcceptedResponse) {
                        AutoClassifyResponse$IdAcceptedResponse autoClassifyResponse$IdAcceptedResponse2 = (AutoClassifyResponse$IdAcceptedResponse) interfaceC2868b;
                        long j11 = c2878l.f8657j;
                        C12893Id c12893Id2 = autoClassifyResponse$IdAcceptedResponse2.f40622o0;
                        str2 = autoClassifyResponse$IdAcceptedResponse2.f40620Y;
                        c22130w0M22400b = AbstractC22200v.m22400b(c12893Id2, str2, j11);
                        if (c22130w0M22400b == null) {
                            c2873g3 = new C2873g(new InternalErrorInfo.UnknownErrorInfo("Unexpected network response."));
                            this.f8647o0 = interfaceC2186j;
                            this.f8645Y = (NetworkCallResult.Success) networkCallResult;
                            this.f8646Z = 2;
                            if (interfaceC2186j.mo395a(c2873g3, this) == enumC19250a) {
                                return enumC19250a;
                            }
                        } else {
                            c2874h3 = new C2874h(new C2869c(str2, c22130w0M22400b));
                            this.f8647o0 = interfaceC2186j;
                            this.f8645Y = (NetworkCallResult.Success) networkCallResult;
                            this.f8646Z = 3;
                            if (interfaceC2186j.mo395a(c2874h3, this) == enumC19250a) {
                                return enumC19250a;
                            }
                        }
                    } else if (interfaceC2868b instanceof AutoClassifyResponse$ClassificationFailedResponse) {
                        c2874h2 = new C2874h(new C2871e(C2878l.m3718b(c2878l, ((AutoClassifyResponse$ClassificationFailedResponse) interfaceC2868b).f40619Y)));
                        this.f8647o0 = interfaceC2186j;
                        this.f8645Y = (NetworkCallResult.Success) networkCallResult;
                        this.f8646Z = 4;
                        if (interfaceC2186j.mo395a(c2874h2, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    } else {
                        if (interfaceC2868b instanceof AutoClassifyResponse$IdRejectedResponse) {
                            if (interfaceC2868b.equals(C2867a.f8636Y)) {
                                c2873g2 = new C2873g(new InternalErrorInfo.UnknownErrorInfo("Unexpected network response."));
                                this.f8647o0 = interfaceC2186j;
                                this.f8645Y = (NetworkCallResult.Success) networkCallResult;
                                this.f8646Z = 6;
                                if (interfaceC2186j.mo395a(c2873g2, this) == enumC19250a) {
                                    return enumC19250a;
                                }
                            }
                            return C17296C.f55119a;
                        }
                        c2874h = new C2874h(new C2870d(C2878l.m3718b(c2878l, ((AutoClassifyResponse$IdRejectedResponse) interfaceC2868b).f40626Y)));
                        this.f8647o0 = interfaceC2186j;
                        this.f8645Y = (NetworkCallResult.Success) networkCallResult;
                        this.f8646Z = 5;
                        if (interfaceC2186j.mo395a(c2874h, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                    networkCallResult2 = networkCallResult;
                    interfaceC2186j2 = interfaceC2186j;
                    networkCallResult = networkCallResult2;
                    interfaceC2186j = interfaceC2186j2;
                }
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    c2873g4 = new C2873g(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                    this.f8647o0 = networkCallResult;
                    this.f8645Y = null;
                    this.f8646Z = 8;
                    if (interfaceC2186j.mo395a(c2873g4, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
                return C17296C.f55119a;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                networkCallResult2 = this.f8645Y;
                interfaceC2186j2 = (InterfaceC2186j) this.f8647o0;
                AbstractC9233X.m9807c(obj);
                networkCallResult = networkCallResult2;
                interfaceC2186j = interfaceC2186j2;
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    c2873g4 = new C2873g(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                    this.f8647o0 = networkCallResult;
                    this.f8645Y = null;
                    this.f8646Z = 8;
                    if (interfaceC2186j.mo395a(c2873g4, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
                return C17296C.f55119a;
            case 8:
                AbstractC9233X.m9807c(obj);
                return C17296C.f55119a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
